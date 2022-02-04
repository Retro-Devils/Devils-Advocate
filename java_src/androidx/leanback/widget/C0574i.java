package androidx.leanback.widget;

import android.view.View;
import androidx.leanback.widget.C0576j;

/* access modifiers changed from: package-private */
/* renamed from: androidx.leanback.widget.i */
public class C0574i {

    /* renamed from: a */
    private int f2897a = 0;

    /* renamed from: b */
    public final C0575a f2898b;

    /* renamed from: c */
    public final C0575a f2899c;

    /* renamed from: d */
    private C0575a f2900d;

    /* renamed from: e */
    private C0575a f2901e;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.leanback.widget.i$a */
    public static final class C0575a extends C0576j.C0577a {

        /* renamed from: g */
        private int f2902g;

        C0575a(int i) {
            this.f2902g = i;
        }

        /* renamed from: j */
        public int mo3518j(View view) {
            return C0578k.m3093a(view, this, this.f2902g);
        }
    }

    C0574i() {
        C0575a aVar = new C0575a(1);
        this.f2898b = aVar;
        C0575a aVar2 = new C0575a(0);
        this.f2899c = aVar2;
        this.f2900d = aVar2;
        this.f2901e = aVar;
    }

    /* renamed from: a */
    public final C0575a mo3516a() {
        return this.f2900d;
    }

    /* renamed from: b */
    public final void mo3517b(int i) {
        C0575a aVar;
        this.f2897a = i;
        if (i == 0) {
            this.f2900d = this.f2899c;
            aVar = this.f2898b;
        } else {
            this.f2900d = this.f2898b;
            aVar = this.f2899c;
        }
        this.f2901e = aVar;
    }
}
