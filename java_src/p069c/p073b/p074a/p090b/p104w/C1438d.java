package p069c.p073b.p074a.p090b.p104w;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.p005c.C0390f;
import p069c.p073b.p074a.p090b.C1400k;

/* renamed from: c.b.a.b.w.d */
public class C1438d {

    /* renamed from: a */
    public final float f6064a;

    /* renamed from: b */
    public final ColorStateList f6065b;

    /* renamed from: c */
    public final ColorStateList f6066c;

    /* renamed from: d */
    public final ColorStateList f6067d;

    /* renamed from: e */
    public final int f6068e;

    /* renamed from: f */
    public final int f6069f;

    /* renamed from: g */
    public final String f6070g;

    /* renamed from: h */
    public final boolean f6071h;

    /* renamed from: i */
    public final ColorStateList f6072i;

    /* renamed from: j */
    public final float f6073j;

    /* renamed from: k */
    public final float f6074k;

    /* renamed from: l */
    public final float f6075l;

    /* renamed from: m */
    private final int f6076m;

    /* renamed from: n */
    private boolean f6077n = false;

    /* renamed from: o */
    private Typeface f6078o;

    /* access modifiers changed from: package-private */
    /* renamed from: c.b.a.b.w.d$a */
    public class C1439a extends C0390f.AbstractC0391a {

        /* renamed from: a */
        final /* synthetic */ AbstractC1442f f6079a;

        C1439a(AbstractC1442f fVar) {
            this.f6079a = fVar;
        }

        @Override // androidx.core.content.p005c.C0390f.AbstractC0391a
        /* renamed from: c */
        public void mo1846c(int i) {
            C1438d.this.f6077n = true;
            this.f6079a.mo6555a(i);
        }

        @Override // androidx.core.content.p005c.C0390f.AbstractC0391a
        /* renamed from: d */
        public void mo1847d(Typeface typeface) {
            C1438d dVar = C1438d.this;
            dVar.f6078o = Typeface.create(typeface, dVar.f6068e);
            C1438d.this.f6077n = true;
            this.f6079a.mo6556b(C1438d.this.f6078o, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c.b.a.b.w.d$b */
    public class C1440b extends AbstractC1442f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f6081a;

        /* renamed from: b */
        final /* synthetic */ AbstractC1442f f6082b;

        C1440b(TextPaint textPaint, AbstractC1442f fVar) {
            this.f6081a = textPaint;
            this.f6082b = fVar;
        }

        @Override // p069c.p073b.p074a.p090b.p104w.AbstractC1442f
        /* renamed from: a */
        public void mo6555a(int i) {
            this.f6082b.mo6555a(i);
        }

        @Override // p069c.p073b.p074a.p090b.p104w.AbstractC1442f
        /* renamed from: b */
        public void mo6556b(Typeface typeface, boolean z) {
            C1438d.this.mo6565k(this.f6081a, typeface);
            this.f6082b.mo6556b(typeface, z);
        }
    }

    public C1438d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C1400k.f5734J3);
        this.f6064a = obtainStyledAttributes.getDimension(C1400k.f5740K3, 0.0f);
        this.f6065b = C1437c.m7077a(context, obtainStyledAttributes, C1400k.f5758N3);
        this.f6066c = C1437c.m7077a(context, obtainStyledAttributes, C1400k.f5764O3);
        this.f6067d = C1437c.m7077a(context, obtainStyledAttributes, C1400k.f5770P3);
        this.f6068e = obtainStyledAttributes.getInt(C1400k.f5752M3, 0);
        this.f6069f = obtainStyledAttributes.getInt(C1400k.f5746L3, 1);
        int e = C1437c.m7081e(obtainStyledAttributes, C1400k.f5806V3, C1400k.f5800U3);
        this.f6076m = obtainStyledAttributes.getResourceId(e, 0);
        this.f6070g = obtainStyledAttributes.getString(e);
        this.f6071h = obtainStyledAttributes.getBoolean(C1400k.f5812W3, false);
        this.f6072i = C1437c.m7077a(context, obtainStyledAttributes, C1400k.f5776Q3);
        this.f6073j = obtainStyledAttributes.getFloat(C1400k.f5782R3, 0.0f);
        this.f6074k = obtainStyledAttributes.getFloat(C1400k.f5788S3, 0.0f);
        this.f6075l = obtainStyledAttributes.getFloat(C1400k.f5794T3, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: d */
    private void m7086d() {
        String str;
        if (this.f6078o == null && (str = this.f6070g) != null) {
            this.f6078o = Typeface.create(str, this.f6068e);
        }
        if (this.f6078o == null) {
            int i = this.f6069f;
            this.f6078o = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f6078o = Typeface.create(this.f6078o, this.f6068e);
        }
    }

    /* renamed from: e */
    public Typeface mo6559e() {
        m7086d();
        return this.f6078o;
    }

    /* renamed from: f */
    public Typeface mo6560f(Context context) {
        if (this.f6077n) {
            return this.f6078o;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b = C0390f.m1924b(context, this.f6076m);
                this.f6078o = b;
                if (b != null) {
                    this.f6078o = Typeface.create(b, this.f6068e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f6070g, e);
            }
        }
        m7086d();
        this.f6077n = true;
        return this.f6078o;
    }

    /* renamed from: g */
    public void mo6561g(Context context, TextPaint textPaint, AbstractC1442f fVar) {
        mo6565k(textPaint, mo6559e());
        mo6562h(context, new C1440b(textPaint, fVar));
    }

    /* renamed from: h */
    public void mo6562h(Context context, AbstractC1442f fVar) {
        if (C1441e.m7098a()) {
            mo6560f(context);
        } else {
            m7086d();
        }
        int i = this.f6076m;
        if (i == 0) {
            this.f6077n = true;
        }
        if (this.f6077n) {
            fVar.mo6556b(this.f6078o, true);
            return;
        }
        try {
            C0390f.m1926d(context, i, new C1439a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f6077n = true;
            fVar.mo6555a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f6070g, e);
            this.f6077n = true;
            fVar.mo6555a(-3);
        }
    }

    /* renamed from: i */
    public void mo6563i(Context context, TextPaint textPaint, AbstractC1442f fVar) {
        mo6564j(context, textPaint, fVar);
        ColorStateList colorStateList = this.f6065b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f6075l;
        float f2 = this.f6073j;
        float f3 = this.f6074k;
        ColorStateList colorStateList2 = this.f6072i;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: j */
    public void mo6564j(Context context, TextPaint textPaint, AbstractC1442f fVar) {
        if (C1441e.m7098a()) {
            mo6565k(textPaint, mo6560f(context));
        } else {
            mo6561g(context, textPaint, fVar);
        }
    }

    /* renamed from: k */
    public void mo6565k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.f6068e;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f6064a);
    }
}
