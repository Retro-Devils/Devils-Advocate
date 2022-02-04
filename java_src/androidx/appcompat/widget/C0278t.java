package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p006b.p007a.C0754a;

/* renamed from: androidx.appcompat.widget.t */
public class C0278t extends SeekBar {

    /* renamed from: b */
    private final C0280u f1193b;

    public C0278t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0754a.seekBarStyle);
    }

    public C0278t(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0275r0.m1374a(this, getContext());
        C0280u uVar = new C0280u(this);
        this.f1193b = uVar;
        uVar.mo1715c(attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1193b.mo1733h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1193b.mo1734i();
    }

    /* access modifiers changed from: protected */
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1193b.mo1732g(canvas);
    }
}
