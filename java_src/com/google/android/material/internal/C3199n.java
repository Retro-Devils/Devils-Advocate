package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p069c.p073b.p074a.p090b.p104w.AbstractC1442f;
import p069c.p073b.p074a.p090b.p104w.C1438d;

/* renamed from: com.google.android.material.internal.n */
public class C3199n {

    /* renamed from: a */
    private final TextPaint f10715a = new TextPaint(1);

    /* renamed from: b */
    private final AbstractC1442f f10716b = new C3200a();

    /* renamed from: c */
    private float f10717c;

    /* renamed from: d */
    private boolean f10718d = true;

    /* renamed from: e */
    private WeakReference<AbstractC3201b> f10719e = new WeakReference<>(null);

    /* renamed from: f */
    private C1438d f10720f;

    /* renamed from: com.google.android.material.internal.n$a */
    class C3200a extends AbstractC1442f {
        C3200a() {
        }

        @Override // p069c.p073b.p074a.p090b.p104w.AbstractC1442f
        /* renamed from: a */
        public void mo6555a(int i) {
            C3199n.this.f10718d = true;
            AbstractC3201b bVar = (AbstractC3201b) C3199n.this.f10719e.get();
            if (bVar != null) {
                bVar.mo10322a();
            }
        }

        @Override // p069c.p073b.p074a.p090b.p104w.AbstractC1442f
        /* renamed from: b */
        public void mo6556b(Typeface typeface, boolean z) {
            if (!z) {
                C3199n.this.f10718d = true;
                AbstractC3201b bVar = (AbstractC3201b) C3199n.this.f10719e.get();
                if (bVar != null) {
                    bVar.mo10322a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.n$b */
    public interface AbstractC3201b {
        /* renamed from: a */
        void mo10322a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C3199n(AbstractC3201b bVar) {
        mo10795g(bVar);
    }

    /* renamed from: c */
    private float m13412c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f10715a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C1438d mo10792d() {
        return this.f10720f;
    }

    /* renamed from: e */
    public TextPaint mo10793e() {
        return this.f10715a;
    }

    /* renamed from: f */
    public float mo10794f(String str) {
        if (!this.f10718d) {
            return this.f10717c;
        }
        float c = m13412c(str);
        this.f10717c = c;
        this.f10718d = false;
        return c;
    }

    /* renamed from: g */
    public void mo10795g(AbstractC3201b bVar) {
        this.f10719e = new WeakReference<>(bVar);
    }

    /* renamed from: h */
    public void mo10796h(C1438d dVar, Context context) {
        if (this.f10720f != dVar) {
            this.f10720f = dVar;
            if (dVar != null) {
                dVar.mo6564j(context, this.f10715a, this.f10716b);
                AbstractC3201b bVar = this.f10719e.get();
                if (bVar != null) {
                    this.f10715a.drawableState = bVar.getState();
                }
                dVar.mo6563i(context, this.f10715a, this.f10716b);
                this.f10718d = true;
            }
            AbstractC3201b bVar2 = this.f10719e.get();
            if (bVar2 != null) {
                bVar2.mo10322a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: i */
    public void mo10797i(boolean z) {
        this.f10718d = z;
    }

    /* renamed from: j */
    public void mo10798j(Context context) {
        this.f10720f.mo6563i(context, this.f10715a, this.f10716b);
    }
}
