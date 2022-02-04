package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.load.p122o.AbstractC1763j;
import com.bumptech.glide.p140r.AbstractC2037a;
import com.bumptech.glide.p140r.AbstractC2039c;
import com.bumptech.glide.p140r.AbstractC2040d;
import com.bumptech.glide.p140r.AbstractC2042e;
import com.bumptech.glide.p140r.C2038b;
import com.bumptech.glide.p140r.C2043f;
import com.bumptech.glide.p140r.C2045h;
import com.bumptech.glide.p140r.C2047i;
import com.bumptech.glide.p140r.p141j.AbstractC2055h;
import com.bumptech.glide.p140r.p141j.AbstractC2056i;
import com.bumptech.glide.p143s.C2064a;
import com.bumptech.glide.p144t.C2074e;
import com.bumptech.glide.p144t.C2081j;
import com.bumptech.glide.p144t.C2082k;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.j */
public class C1624j<TranscodeType> extends AbstractC2037a<C1624j<TranscodeType>> implements Cloneable {

    /* renamed from: B */
    protected static final C2043f f6588B = ((C2043f) ((C2043f) ((C2043f) new C2043f().mo7762e(AbstractC1763j.f6904c)).mo7750R(EnumC1616g.LOW)).mo7754Y(true));

    /* renamed from: C */
    private final Context f6589C;

    /* renamed from: D */
    private final ComponentCallbacks2C1626k f6590D;

    /* renamed from: E */
    private final Class<TranscodeType> f6591E;

    /* renamed from: F */
    private final ComponentCallbacks2C1610c f6592F;

    /* renamed from: G */
    private final C1614e f6593G;

    /* renamed from: H */
    private AbstractC1629l<?, ? super TranscodeType> f6594H;

    /* renamed from: I */
    private Object f6595I;

    /* renamed from: J */
    private List<AbstractC2042e<TranscodeType>> f6596J;

    /* renamed from: K */
    private C1624j<TranscodeType> f6597K;

    /* renamed from: L */
    private C1624j<TranscodeType> f6598L;

    /* renamed from: M */
    private Float f6599M;

    /* renamed from: N */
    private boolean f6600N = true;

    /* renamed from: O */
    private boolean f6601O;

    /* renamed from: P */
    private boolean f6602P;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.j$a */
    public static /* synthetic */ class C1625a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6603a;

        /* renamed from: b */
        static final /* synthetic */ int[] f6604b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
            // Method dump skipped, instructions count: 144
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C1624j.C1625a.<clinit>():void");
        }
    }

    @SuppressLint({"CheckResult"})
    protected C1624j(ComponentCallbacks2C1610c cVar, ComponentCallbacks2C1626k kVar, Class<TranscodeType> cls, Context context) {
        this.f6592F = cVar;
        this.f6590D = kVar;
        this.f6591E = cls;
        this.f6589C = context;
        this.f6594H = kVar.mo7053r(cls);
        this.f6593G = cVar.mo6983i();
        m7805l0(kVar.mo7051p());
        mo7022a(kVar.mo7052q());
    }

    /* renamed from: g0 */
    private AbstractC2039c m7801g0(AbstractC2055h<TranscodeType> hVar, AbstractC2042e<TranscodeType> eVar, AbstractC2037a<?> aVar, Executor executor) {
        return m7802h0(new Object(), hVar, eVar, null, this.f6594H, aVar.mo7779t(), aVar.mo7776q(), aVar.mo7775p(), aVar, executor);
    }

    /* renamed from: h0 */
    private AbstractC2039c m7802h0(Object obj, AbstractC2055h<TranscodeType> hVar, AbstractC2042e<TranscodeType> eVar, AbstractC2040d dVar, AbstractC1629l<?, ? super TranscodeType> lVar, EnumC1616g gVar, int i, int i2, AbstractC2037a<?> aVar, Executor executor) {
        C2038b bVar;
        C2038b bVar2;
        if (this.f6598L != null) {
            bVar2 = new C2038b(obj, dVar);
            bVar = bVar2;
        } else {
            bVar = null;
            bVar2 = dVar;
        }
        AbstractC2039c i0 = m7803i0(obj, hVar, eVar, bVar2, lVar, gVar, i, i2, aVar, executor);
        if (bVar == null) {
            return i0;
        }
        int q = this.f6598L.mo7776q();
        int p = this.f6598L.mo7775p();
        if (C2082k.m9451r(i, i2) && !this.f6598L.mo7743J()) {
            q = aVar.mo7776q();
            p = aVar.mo7775p();
        }
        C1624j<TranscodeType> jVar = this.f6598L;
        bVar.mo7800q(i0, jVar.m7802h0(obj, hVar, eVar, bVar, jVar.f6594H, jVar.mo7779t(), q, p, this.f6598L, executor));
        return bVar;
    }

    /* renamed from: i0 */
    private AbstractC2039c m7803i0(Object obj, AbstractC2055h<TranscodeType> hVar, AbstractC2042e<TranscodeType> eVar, AbstractC2040d dVar, AbstractC1629l<?, ? super TranscodeType> lVar, EnumC1616g gVar, int i, int i2, AbstractC2037a<?> aVar, Executor executor) {
        C1624j<TranscodeType> jVar = this.f6597K;
        if (jVar != null) {
            if (!this.f6602P) {
                AbstractC1629l<?, ? super TranscodeType> lVar2 = jVar.f6600N ? lVar : jVar.f6594H;
                EnumC1616g t = jVar.mo7738C() ? this.f6597K.mo7779t() : m7804k0(gVar);
                int q = this.f6597K.mo7776q();
                int p = this.f6597K.mo7775p();
                if (C2082k.m9451r(i, i2) && !this.f6597K.mo7743J()) {
                    q = aVar.mo7776q();
                    p = aVar.mo7775p();
                }
                C2047i iVar = new C2047i(obj, dVar);
                AbstractC2039c y0 = m7809y0(obj, hVar, eVar, aVar, iVar, lVar, gVar, i, i2, executor);
                this.f6602P = true;
                C1624j<TranscodeType> jVar2 = this.f6597K;
                AbstractC2039c h0 = jVar2.m7802h0(obj, hVar, eVar, iVar, lVar2, t, q, p, jVar2, executor);
                this.f6602P = false;
                iVar.mo7808p(y0, h0);
                return iVar;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.f6599M == null) {
            return m7809y0(obj, hVar, eVar, aVar, dVar, lVar, gVar, i, i2, executor);
        } else {
            C2047i iVar2 = new C2047i(obj, dVar);
            iVar2.mo7808p(m7809y0(obj, hVar, eVar, aVar, iVar2, lVar, gVar, i, i2, executor), m7809y0(obj, hVar, eVar, aVar.clone().mo7753X(this.f6599M.floatValue()), iVar2, lVar, m7804k0(gVar), i, i2, executor));
            return iVar2;
        }
    }

    /* renamed from: k0 */
    private EnumC1616g m7804k0(EnumC1616g gVar) {
        int i = C1625a.f6604b[gVar.ordinal()];
        if (i == 1) {
            return EnumC1616g.NORMAL;
        }
        if (i == 2) {
            return EnumC1616g.HIGH;
        }
        if (i == 3 || i == 4) {
            return EnumC1616g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + mo7779t());
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: l0 */
    private void m7805l0(List<AbstractC2042e<Object>> list) {
        for (AbstractC2042e<Object> eVar : list) {
            mo7025e0(eVar);
        }
    }

    /* renamed from: n0 */
    private <Y extends AbstractC2055h<TranscodeType>> Y m7806n0(Y y, AbstractC2042e<TranscodeType> eVar, AbstractC2037a<?> aVar, Executor executor) {
        C2081j.m9432d(y);
        if (this.f6601O) {
            AbstractC2039c g0 = m7801g0(y, eVar, aVar, executor);
            AbstractC2039c g = y.mo7814g();
            if (!g0.mo7794h(g) || m7807q0(aVar, g)) {
                this.f6590D.mo7047o(y);
                y.mo7816j(g0);
                this.f6590D.mo7039C(y, g0);
                return y;
            }
            if (!((AbstractC2039c) C2081j.m9432d(g)).isRunning()) {
                g.mo7792f();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: q0 */
    private boolean m7807q0(AbstractC2037a<?> aVar, AbstractC2039c cVar) {
        return !aVar.mo7737B() && cVar.mo7795i();
    }

    /* renamed from: x0 */
    private C1624j<TranscodeType> m7808x0(Object obj) {
        this.f6595I = obj;
        this.f6601O = true;
        return this;
    }

    /* renamed from: y0 */
    private AbstractC2039c m7809y0(Object obj, AbstractC2055h<TranscodeType> hVar, AbstractC2042e<TranscodeType> eVar, AbstractC2037a<?> aVar, AbstractC2040d dVar, AbstractC1629l<?, ? super TranscodeType> lVar, EnumC1616g gVar, int i, int i2, Executor executor) {
        Context context = this.f6589C;
        C1614e eVar2 = this.f6593G;
        return C2045h.m9296y(context, eVar2, obj, this.f6595I, this.f6591E, aVar, i, i2, gVar, hVar, eVar, this.f6596J, dVar, eVar2.mo7001f(), lVar.mo7066b(), executor);
    }

    /* renamed from: e0 */
    public C1624j<TranscodeType> mo7025e0(AbstractC2042e<TranscodeType> eVar) {
        if (eVar != null) {
            if (this.f6596J == null) {
                this.f6596J = new ArrayList();
            }
            this.f6596J.add(eVar);
        }
        return this;
    }

    /* renamed from: f0 */
    public C1624j<TranscodeType> mo7022a(AbstractC2037a<?> aVar) {
        C2081j.m9432d(aVar);
        return (C1624j) super.mo7022a(aVar);
    }

    /* renamed from: j0 */
    public C1624j<TranscodeType> clone() {
        C1624j<TranscodeType> jVar = (C1624j) super.clone();
        jVar.f6594H = jVar.f6594H.clone();
        return jVar;
    }

    /* renamed from: m0 */
    public <Y extends AbstractC2055h<TranscodeType>> Y mo7028m0(Y y) {
        return (Y) mo7029o0(y, null, C2074e.m9414b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public <Y extends AbstractC2055h<TranscodeType>> Y mo7029o0(Y y, AbstractC2042e<TranscodeType> eVar, Executor executor) {
        return (Y) m7806n0(y, eVar, this, executor);
    }

    /* renamed from: p0 */
    public AbstractC2056i<ImageView, TranscodeType> mo7030p0(ImageView imageView) {
        AbstractC2037a<?> aVar;
        C2082k.m9434a();
        C2081j.m9432d(imageView);
        if (!mo7742I() && mo7740G() && imageView.getScaleType() != null) {
            switch (C1625a.f6603a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().mo7745L();
                    break;
                case 2:
                case 6:
                    aVar = clone().mo7746M();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().mo7747N();
                    break;
            }
            return (AbstractC2056i) m7806n0(this.f6593G.mo6996a(imageView, this.f6591E), null, aVar, C2074e.m9414b());
        }
        aVar = this;
        return (AbstractC2056i) m7806n0(this.f6593G.mo6996a(imageView, this.f6591E), null, aVar, C2074e.m9414b());
    }

    /* renamed from: r0 */
    public C1624j<TranscodeType> mo7031r0(Drawable drawable) {
        return m7808x0(drawable).mo7022a(C2043f.m9275f0(AbstractC1763j.f6903b));
    }

    /* renamed from: s0 */
    public C1624j<TranscodeType> mo7032s0(Uri uri) {
        return m7808x0(uri);
    }

    /* renamed from: t0 */
    public C1624j<TranscodeType> mo7033t0(File file) {
        return m7808x0(file);
    }

    /* renamed from: u0 */
    public C1624j<TranscodeType> mo7034u0(Integer num) {
        return m7808x0(num).mo7022a(C2043f.m9276g0(C2064a.m9389c(this.f6589C)));
    }

    /* renamed from: v0 */
    public C1624j<TranscodeType> mo7035v0(Object obj) {
        return m7808x0(obj);
    }

    /* renamed from: w0 */
    public C1624j<TranscodeType> mo7036w0(String str) {
        return m7808x0(str);
    }
}
