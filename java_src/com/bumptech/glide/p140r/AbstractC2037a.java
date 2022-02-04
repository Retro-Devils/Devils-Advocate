package com.bumptech.glide.p140r;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.AbstractC1651m;
import com.bumptech.glide.load.C1644h;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.AbstractC1763j;
import com.bumptech.glide.load.p128q.p129d.AbstractC1922l;
import com.bumptech.glide.load.p128q.p129d.C1914i;
import com.bumptech.glide.load.p128q.p129d.C1915j;
import com.bumptech.glide.load.p128q.p129d.C1935o;
import com.bumptech.glide.load.p128q.p129d.C1937q;
import com.bumptech.glide.load.p128q.p133h.C1966c;
import com.bumptech.glide.load.p128q.p133h.C1970f;
import com.bumptech.glide.p140r.AbstractC2037a;
import com.bumptech.glide.p143s.C2066c;
import com.bumptech.glide.p144t.C2071b;
import com.bumptech.glide.p144t.C2081j;
import com.bumptech.glide.p144t.C2082k;
import java.util.Map;

/* renamed from: com.bumptech.glide.r.a */
public abstract class AbstractC2037a<T extends AbstractC2037a<T>> implements Cloneable {

    /* renamed from: A */
    private boolean f7476A;

    /* renamed from: b */
    private int f7477b;

    /* renamed from: c */
    private float f7478c = 1.0f;

    /* renamed from: d */
    private AbstractC1763j f7479d = AbstractC1763j.f6914e;

    /* renamed from: e */
    private EnumC1616g f7480e = EnumC1616g.NORMAL;

    /* renamed from: f */
    private Drawable f7481f;

    /* renamed from: g */
    private int f7482g;

    /* renamed from: h */
    private Drawable f7483h;

    /* renamed from: i */
    private int f7484i;

    /* renamed from: j */
    private boolean f7485j = true;

    /* renamed from: k */
    private int f7486k = -1;

    /* renamed from: l */
    private int f7487l = -1;

    /* renamed from: m */
    private AbstractC1643g f7488m = C2066c.m9395c();

    /* renamed from: n */
    private boolean f7489n;

    /* renamed from: o */
    private boolean f7490o = true;

    /* renamed from: p */
    private Drawable f7491p;

    /* renamed from: q */
    private int f7492q;

    /* renamed from: r */
    private C1647i f7493r = new C1647i();

    /* renamed from: s */
    private Map<Class<?>, AbstractC1651m<?>> f7494s = new C2071b();

    /* renamed from: t */
    private Class<?> f7495t = Object.class;

    /* renamed from: u */
    private boolean f7496u;

    /* renamed from: v */
    private Resources.Theme f7497v;

    /* renamed from: w */
    private boolean f7498w;

    /* renamed from: x */
    private boolean f7499x;

    /* renamed from: y */
    private boolean f7500y;

    /* renamed from: z */
    private boolean f7501z = true;

    /* renamed from: E */
    private boolean m9185E(int i) {
        return m9186F(this.f7477b, i);
    }

    /* renamed from: F */
    private static boolean m9186F(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: O */
    private T m9187O(AbstractC1922l lVar, AbstractC1651m<Bitmap> mVar) {
        return m9188S(lVar, mVar, false);
    }

    /* renamed from: S */
    private T m9188S(AbstractC1922l lVar, AbstractC1651m<Bitmap> mVar, boolean z) {
        T b0 = z ? mo7758b0(lVar, mVar) : mo7748P(lVar, mVar);
        b0.f7501z = true;
        return b0;
    }

    /* renamed from: T */
    private T m9189T() {
        return this;
    }

    /* renamed from: U */
    private T m9190U() {
        if (!this.f7496u) {
            return m9189T();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: A */
    public final boolean mo7736A() {
        return this.f7499x;
    }

    /* renamed from: B */
    public final boolean mo7737B() {
        return this.f7485j;
    }

    /* renamed from: C */
    public final boolean mo7738C() {
        return m9185E(8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public boolean mo7739D() {
        return this.f7501z;
    }

    /* renamed from: G */
    public final boolean mo7740G() {
        return this.f7490o;
    }

    /* renamed from: H */
    public final boolean mo7741H() {
        return this.f7489n;
    }

    /* renamed from: I */
    public final boolean mo7742I() {
        return m9185E(2048);
    }

    /* renamed from: J */
    public final boolean mo7743J() {
        return C2082k.m9451r(this.f7487l, this.f7486k);
    }

    /* renamed from: K */
    public T mo7744K() {
        this.f7496u = true;
        return m9189T();
    }

    /* renamed from: L */
    public T mo7745L() {
        return mo7748P(AbstractC1922l.f7204e, new C1914i());
    }

    /* renamed from: M */
    public T mo7746M() {
        return m9187O(AbstractC1922l.f7203d, new C1915j());
    }

    /* renamed from: N */
    public T mo7747N() {
        return m9187O(AbstractC1922l.f7202c, new C1937q());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final T mo7748P(AbstractC1922l lVar, AbstractC1651m<Bitmap> mVar) {
        if (this.f7498w) {
            return (T) clone().mo7748P(lVar, mVar);
        }
        mo7764f(lVar);
        return mo7756a0(mVar, false);
    }

    /* renamed from: Q */
    public T mo7749Q(int i, int i2) {
        if (this.f7498w) {
            return (T) clone().mo7749Q(i, i2);
        }
        this.f7487l = i;
        this.f7486k = i2;
        this.f7477b |= 512;
        return m9190U();
    }

    /* renamed from: R */
    public T mo7750R(EnumC1616g gVar) {
        if (this.f7498w) {
            return (T) clone().mo7750R(gVar);
        }
        this.f7480e = (EnumC1616g) C2081j.m9432d(gVar);
        this.f7477b |= 8;
        return m9190U();
    }

    /* renamed from: V */
    public <Y> T mo7751V(C1644h<Y> hVar, Y y) {
        if (this.f7498w) {
            return (T) clone().mo7751V(hVar, y);
        }
        C2081j.m9432d(hVar);
        C2081j.m9432d(y);
        this.f7493r.mo7086e(hVar, y);
        return m9190U();
    }

    /* renamed from: W */
    public T mo7752W(AbstractC1643g gVar) {
        if (this.f7498w) {
            return (T) clone().mo7752W(gVar);
        }
        this.f7488m = (AbstractC1643g) C2081j.m9432d(gVar);
        this.f7477b |= 1024;
        return m9190U();
    }

    /* renamed from: X */
    public T mo7753X(float f) {
        if (this.f7498w) {
            return (T) clone().mo7753X(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f7478c = f;
        this.f7477b |= 2;
        return m9190U();
    }

    /* renamed from: Y */
    public T mo7754Y(boolean z) {
        if (this.f7498w) {
            return (T) clone().mo7754Y(true);
        }
        this.f7485j = !z;
        this.f7477b |= 256;
        return m9190U();
    }

    /* renamed from: Z */
    public T mo7755Z(AbstractC1651m<Bitmap> mVar) {
        return mo7756a0(mVar, true);
    }

    /* renamed from: a */
    public T mo7022a(AbstractC2037a<?> aVar) {
        if (this.f7498w) {
            return (T) clone().mo7022a(aVar);
        }
        if (m9186F(aVar.f7477b, 2)) {
            this.f7478c = aVar.f7478c;
        }
        if (m9186F(aVar.f7477b, 262144)) {
            this.f7499x = aVar.f7499x;
        }
        if (m9186F(aVar.f7477b, 1048576)) {
            this.f7476A = aVar.f7476A;
        }
        if (m9186F(aVar.f7477b, 4)) {
            this.f7479d = aVar.f7479d;
        }
        if (m9186F(aVar.f7477b, 8)) {
            this.f7480e = aVar.f7480e;
        }
        if (m9186F(aVar.f7477b, 16)) {
            this.f7481f = aVar.f7481f;
            this.f7482g = 0;
            this.f7477b &= -33;
        }
        if (m9186F(aVar.f7477b, 32)) {
            this.f7482g = aVar.f7482g;
            this.f7481f = null;
            this.f7477b &= -17;
        }
        if (m9186F(aVar.f7477b, 64)) {
            this.f7483h = aVar.f7483h;
            this.f7484i = 0;
            this.f7477b &= -129;
        }
        if (m9186F(aVar.f7477b, 128)) {
            this.f7484i = aVar.f7484i;
            this.f7483h = null;
            this.f7477b &= -65;
        }
        if (m9186F(aVar.f7477b, 256)) {
            this.f7485j = aVar.f7485j;
        }
        if (m9186F(aVar.f7477b, 512)) {
            this.f7487l = aVar.f7487l;
            this.f7486k = aVar.f7486k;
        }
        if (m9186F(aVar.f7477b, 1024)) {
            this.f7488m = aVar.f7488m;
        }
        if (m9186F(aVar.f7477b, 4096)) {
            this.f7495t = aVar.f7495t;
        }
        if (m9186F(aVar.f7477b, 8192)) {
            this.f7491p = aVar.f7491p;
            this.f7492q = 0;
            this.f7477b &= -16385;
        }
        if (m9186F(aVar.f7477b, 16384)) {
            this.f7492q = aVar.f7492q;
            this.f7491p = null;
            this.f7477b &= -8193;
        }
        if (m9186F(aVar.f7477b, 32768)) {
            this.f7497v = aVar.f7497v;
        }
        if (m9186F(aVar.f7477b, 65536)) {
            this.f7490o = aVar.f7490o;
        }
        if (m9186F(aVar.f7477b, 131072)) {
            this.f7489n = aVar.f7489n;
        }
        if (m9186F(aVar.f7477b, 2048)) {
            this.f7494s.putAll(aVar.f7494s);
            this.f7501z = aVar.f7501z;
        }
        if (m9186F(aVar.f7477b, 524288)) {
            this.f7500y = aVar.f7500y;
        }
        if (!this.f7490o) {
            this.f7494s.clear();
            int i = this.f7477b & -2049;
            this.f7477b = i;
            this.f7489n = false;
            this.f7477b = i & -131073;
            this.f7501z = true;
        }
        this.f7477b |= aVar.f7477b;
        this.f7493r.mo7085d(aVar.f7493r);
        return m9190U();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bumptech.glide.load.m<android.graphics.Bitmap> */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public T mo7756a0(AbstractC1651m<Bitmap> mVar, boolean z) {
        if (this.f7498w) {
            return (T) clone().mo7756a0(mVar, z);
        }
        C1935o oVar = new C1935o(mVar, z);
        mo7759c0(Bitmap.class, mVar, z);
        mo7759c0(Drawable.class, oVar, z);
        mo7759c0(BitmapDrawable.class, (AbstractC1651m<Y>) oVar.mo7524c(), z);
        mo7759c0(C1966c.class, new C1970f(mVar), z);
        return m9190U();
    }

    /* renamed from: b */
    public T mo7757b() {
        if (!this.f7496u || this.f7498w) {
            this.f7498w = true;
            return mo7744K();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final T mo7758b0(AbstractC1922l lVar, AbstractC1651m<Bitmap> mVar) {
        if (this.f7498w) {
            return (T) clone().mo7758b0(lVar, mVar);
        }
        mo7764f(lVar);
        return mo7755Z(mVar);
    }

    /* renamed from: c */
    public T clone() {
        try {
            T t = (T) ((AbstractC2037a) super.clone());
            C1647i iVar = new C1647i();
            t.f7493r = iVar;
            iVar.mo7085d(this.f7493r);
            C2071b bVar = new C2071b();
            t.f7494s = bVar;
            bVar.putAll(this.f7494s);
            t.f7496u = false;
            t.f7498w = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public <Y> T mo7759c0(Class<Y> cls, AbstractC1651m<Y> mVar, boolean z) {
        if (this.f7498w) {
            return (T) clone().mo7759c0(cls, mVar, z);
        }
        C2081j.m9432d(cls);
        C2081j.m9432d(mVar);
        this.f7494s.put(cls, mVar);
        int i = this.f7477b | 2048;
        this.f7477b = i;
        this.f7490o = true;
        int i2 = i | 65536;
        this.f7477b = i2;
        this.f7501z = false;
        if (z) {
            this.f7477b = i2 | 131072;
            this.f7489n = true;
        }
        return m9190U();
    }

    /* renamed from: d */
    public T mo7760d(Class<?> cls) {
        if (this.f7498w) {
            return (T) clone().mo7760d(cls);
        }
        this.f7495t = (Class) C2081j.m9432d(cls);
        this.f7477b |= 4096;
        return m9190U();
    }

    /* renamed from: d0 */
    public T mo7761d0(boolean z) {
        if (this.f7498w) {
            return (T) clone().mo7761d0(z);
        }
        this.f7476A = z;
        this.f7477b |= 1048576;
        return m9190U();
    }

    /* renamed from: e */
    public T mo7762e(AbstractC1763j jVar) {
        if (this.f7498w) {
            return (T) clone().mo7762e(jVar);
        }
        this.f7479d = (AbstractC1763j) C2081j.m9432d(jVar);
        this.f7477b |= 4;
        return m9190U();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC2037a)) {
            return false;
        }
        AbstractC2037a aVar = (AbstractC2037a) obj;
        return Float.compare(aVar.f7478c, this.f7478c) == 0 && this.f7482g == aVar.f7482g && C2082k.m9436c(this.f7481f, aVar.f7481f) && this.f7484i == aVar.f7484i && C2082k.m9436c(this.f7483h, aVar.f7483h) && this.f7492q == aVar.f7492q && C2082k.m9436c(this.f7491p, aVar.f7491p) && this.f7485j == aVar.f7485j && this.f7486k == aVar.f7486k && this.f7487l == aVar.f7487l && this.f7489n == aVar.f7489n && this.f7490o == aVar.f7490o && this.f7499x == aVar.f7499x && this.f7500y == aVar.f7500y && this.f7479d.equals(aVar.f7479d) && this.f7480e == aVar.f7480e && this.f7493r.equals(aVar.f7493r) && this.f7494s.equals(aVar.f7494s) && this.f7495t.equals(aVar.f7495t) && C2082k.m9436c(this.f7488m, aVar.f7488m) && C2082k.m9436c(this.f7497v, aVar.f7497v);
    }

    /* renamed from: f */
    public T mo7764f(AbstractC1922l lVar) {
        return mo7751V((C1644h<Y>) AbstractC1922l.f7207h, C2081j.m9432d(lVar));
    }

    /* renamed from: g */
    public T mo7765g(int i) {
        if (this.f7498w) {
            return (T) clone().mo7765g(i);
        }
        this.f7482g = i;
        int i2 = this.f7477b | 32;
        this.f7477b = i2;
        this.f7481f = null;
        this.f7477b = i2 & -17;
        return m9190U();
    }

    /* renamed from: h */
    public T mo7766h(Drawable drawable) {
        if (this.f7498w) {
            return (T) clone().mo7766h(drawable);
        }
        this.f7481f = drawable;
        int i = this.f7477b | 16;
        this.f7477b = i;
        this.f7482g = 0;
        this.f7477b = i & -33;
        return m9190U();
    }

    public int hashCode() {
        return C2082k.m9446m(this.f7497v, C2082k.m9446m(this.f7488m, C2082k.m9446m(this.f7495t, C2082k.m9446m(this.f7494s, C2082k.m9446m(this.f7493r, C2082k.m9446m(this.f7480e, C2082k.m9446m(this.f7479d, C2082k.m9447n(this.f7500y, C2082k.m9447n(this.f7499x, C2082k.m9447n(this.f7490o, C2082k.m9447n(this.f7489n, C2082k.m9445l(this.f7487l, C2082k.m9445l(this.f7486k, C2082k.m9447n(this.f7485j, C2082k.m9446m(this.f7491p, C2082k.m9445l(this.f7492q, C2082k.m9446m(this.f7483h, C2082k.m9445l(this.f7484i, C2082k.m9446m(this.f7481f, C2082k.m9445l(this.f7482g, C2082k.m9443j(this.f7478c)))))))))))))))))))));
    }

    /* renamed from: i */
    public final AbstractC1763j mo7768i() {
        return this.f7479d;
    }

    /* renamed from: j */
    public final int mo7769j() {
        return this.f7482g;
    }

    /* renamed from: k */
    public final Drawable mo7770k() {
        return this.f7481f;
    }

    /* renamed from: l */
    public final Drawable mo7771l() {
        return this.f7491p;
    }

    /* renamed from: m */
    public final int mo7772m() {
        return this.f7492q;
    }

    /* renamed from: n */
    public final boolean mo7773n() {
        return this.f7500y;
    }

    /* renamed from: o */
    public final C1647i mo7774o() {
        return this.f7493r;
    }

    /* renamed from: p */
    public final int mo7775p() {
        return this.f7486k;
    }

    /* renamed from: q */
    public final int mo7776q() {
        return this.f7487l;
    }

    /* renamed from: r */
    public final Drawable mo7777r() {
        return this.f7483h;
    }

    /* renamed from: s */
    public final int mo7778s() {
        return this.f7484i;
    }

    /* renamed from: t */
    public final EnumC1616g mo7779t() {
        return this.f7480e;
    }

    /* renamed from: u */
    public final Class<?> mo7780u() {
        return this.f7495t;
    }

    /* renamed from: v */
    public final AbstractC1643g mo7781v() {
        return this.f7488m;
    }

    /* renamed from: w */
    public final float mo7782w() {
        return this.f7478c;
    }

    /* renamed from: x */
    public final Resources.Theme mo7783x() {
        return this.f7497v;
    }

    /* renamed from: y */
    public final Map<Class<?>, AbstractC1651m<?>> mo7784y() {
        return this.f7494s;
    }

    /* renamed from: z */
    public final boolean mo7785z() {
        return this.f7476A;
    }
}
