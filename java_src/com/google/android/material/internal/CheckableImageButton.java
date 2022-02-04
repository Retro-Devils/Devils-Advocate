package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.C0253m;
import p006b.p007a.C0754a;
import p006b.p030g.p039k.C0962a;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.C0979c;
import p006b.p043i.p044a.AbstractC1041a;

public class CheckableImageButton extends C0253m implements Checkable {

    /* renamed from: d */
    private static final int[] f10573d = {16842912};

    /* renamed from: e */
    private boolean f10574e;

    /* renamed from: f */
    private boolean f10575f;

    /* renamed from: g */
    private boolean f10576g;

    /* renamed from: com.google.android.material.internal.CheckableImageButton$a */
    class C3164a extends C0962a {
        C3164a() {
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: f */
        public void mo2361f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2361f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: g */
        public void mo2362g(View view, C0979c cVar) {
            super.mo2362g(view, cVar);
            cVar.mo5467Y(CheckableImageButton.this.mo10651a());
            cVar.mo5468Z(CheckableImageButton.this.isChecked());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.CheckableImageButton$b */
    public static class C3165b extends AbstractC1041a {
        public static final Parcelable.Creator<C3165b> CREATOR = new C3166a();

        /* renamed from: d */
        boolean f10578d;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$b$a */
        static class C3166a implements Parcelable.ClassLoaderCreator<C3165b> {
            C3166a() {
            }

            /* renamed from: a */
            public C3165b createFromParcel(Parcel parcel) {
                return new C3165b(parcel, null);
            }

            /* renamed from: b */
            public C3165b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C3165b(parcel, classLoader);
            }

            /* renamed from: c */
            public C3165b[] newArray(int i) {
                return new C3165b[i];
            }
        }

        public C3165b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m13255g(parcel);
        }

        public C3165b(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: g */
        private void m13255g(Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f10578d = z;
        }

        @Override // p006b.p043i.p044a.AbstractC1041a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10578d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0754a.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10575f = true;
        this.f10576g = true;
        C1013s.m5766i0(this, new C3164a());
    }

    /* renamed from: a */
    public boolean mo10651a() {
        return this.f10575f;
    }

    public boolean isChecked() {
        return this.f10574e;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.f10574e) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f10573d;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3165b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3165b bVar = (C3165b) parcelable;
        super.onRestoreInstanceState(bVar.mo5608b());
        setChecked(bVar.f10578d);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C3165b bVar = new C3165b(super.onSaveInstanceState());
        bVar.f10578d = this.f10574e;
        return bVar;
    }

    public void setCheckable(boolean z) {
        if (this.f10575f != z) {
            this.f10575f = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.f10575f && this.f10574e != z) {
            this.f10574e = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.f10576g = z;
    }

    public void setPressed(boolean z) {
        if (this.f10576g) {
            super.setPressed(z);
        }
    }

    public void toggle() {
        setChecked(!this.f10574e);
    }
}
