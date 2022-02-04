package p069c.p111c.p112a.p113a.p116c;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.gtomato.android.p149ui.manager.CarouselLayoutManager;
import p006b.p030g.p039k.C1003i;
import p069c.p111c.p112a.p113a.p115b.C1537a;
import p069c.p111c.p112a.p113a.p115b.C1540d;
import p069c.p111c.p112a.p113a.p115b.C1541e;
import p069c.p111c.p112a.p113a.p115b.C1543g;
import p069c.p111c.p112a.p113a.p115b.C1544h;
import p069c.p111c.p112a.p113a.p115b.C1545i;

/* renamed from: c.c.a.a.c.a */
public class C1546a extends RecyclerView {

    /* renamed from: I0 */
    private static final String f6359I0 = C1546a.class.getSimpleName();

    /* renamed from: J0 */
    private static boolean f6360J0 = false;

    /* renamed from: K0 */
    private CarouselLayoutManager f6361K0;

    /* renamed from: L0 */
    private AbstractC1558l f6362L0 = CarouselLayoutManager.f11023t;

    /* renamed from: M0 */
    private boolean f6363M0;

    /* renamed from: N0 */
    private boolean f6364N0;

    /* renamed from: O0 */
    private boolean f6365O0;

    /* renamed from: P0 */
    private boolean f6366P0;

    /* renamed from: Q0 */
    private AbstractC1556j f6367Q0;

    /* renamed from: R0 */
    private AbstractC1553g f6368R0;

    /* renamed from: S0 */
    private AbstractC1554h f6369S0;

    /* renamed from: T0 */
    private AbstractC1555i f6370T0;

    /* renamed from: U0 */
    private int f6371U0 = Integer.MIN_VALUE;

    /* renamed from: V0 */
    private float f6372V0 = 0.0f;

    /* renamed from: W0 */
    private boolean f6373W0;

    /* renamed from: X0 */
    private boolean f6374X0 = false;

    /* renamed from: Y0 */
    private RecyclerView.AbstractC0678t f6375Y0 = new C1547a();

    /* renamed from: c.c.a.a.c.a$a */
    class C1547a extends RecyclerView.AbstractC0678t {
        C1547a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0678t
        /* renamed from: a */
        public void mo4177a(RecyclerView recyclerView, int i) {
            super.mo4177a(recyclerView, i);
            if (i == 0) {
                float e2 = C1546a.this.f6361K0.mo11173e2();
                int round = Math.round(e2);
                if (C1546a.this.f6364N0 && C1546a.this.f6361K0.mo11171c2() != 0.0f) {
                    if (Math.abs(e2 - ((float) round)) > 0.1f) {
                        C1546a.m7571P1("> scroll idle %f %f", new Object[]{Float.valueOf(e2 - C1546a.this.f6372V0), Float.valueOf(C1546a.this.f6361K0.mo11176j2().mo6826a(e2 - C1546a.this.f6372V0))});
                        round = (int) (C1546a.this.f6361K0.mo11176j2().mo6826a(e2 - C1546a.this.f6372V0) > 0.0f ? Math.ceil((double) e2) : Math.floor((double) e2));
                    }
                    C1546a.this.mo3237s1(round);
                } else if (C1546a.this.f6373W0) {
                    C1546a.this.m7568M1(round);
                }
                C1546a.this.f6373W0 = false;
            } else if (i == 1) {
                C1546a aVar = C1546a.this;
                aVar.f6372V0 = aVar.f6361K0.mo11173e2();
            }
            if (C1546a.this.f6367Q0 != null) {
                C1546a aVar2 = (C1546a) recyclerView;
                C1546a.this.f6367Q0.mo6864d(aVar2, i);
                if (i == 0) {
                    C1546a.this.f6367Q0.mo6863c(aVar2);
                } else if (i == 1) {
                    C1546a.this.f6367Q0.mo6862b(aVar2);
                } else if (i == 2) {
                    C1546a.this.f6367Q0.mo6861a(aVar2);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0678t
        /* renamed from: b */
        public void mo4178b(RecyclerView recyclerView, int i, int i2) {
            super.mo4178b(recyclerView, i, i2);
            if (C1546a.this.f6367Q0 != null) {
                C1546a aVar = (C1546a) recyclerView;
                C1546a.this.f6367Q0.mo6865e(aVar, i, i2);
                C1546a.this.f6367Q0.mo6866f(aVar, (int) Math.floor((double) C1546a.this.f6361K0.mo11173e2()), C1546a.this.f6361K0.mo11169B2((int) Math.floor((double) C1546a.this.f6361K0.mo11173e2())), C1546a.this.f6361K0.mo11171c2());
            }
        }
    }

    /* renamed from: c.c.a.a.c.a$b */
    class C1548b implements AbstractC1553g {
        C1548b() {
        }

        @Override // p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1553g
        /* renamed from: a */
        public void mo6857a(RecyclerView.AbstractC0658g gVar, View view, int i, int i2) {
            if (C1546a.this.f6366P0) {
                C1546a.this.mo3237s1(i);
            }
            if (C1546a.this.f6368R0 != null) {
                C1546a.this.f6368R0.mo6857a(C1546a.this.getAdapter(), view, i, i2);
            }
        }
    }

    /* renamed from: c.c.a.a.c.a$c */
    class C1549c implements AbstractC1554h {
        C1549c() {
        }

        @Override // p069c.p111c.p112a.p113a.p116c.C1546a.AbstractC1554h
        /* renamed from: a */
        public boolean mo6858a(RecyclerView.AbstractC0658g gVar, View view, int i, int i2) {
            if (C1546a.this.f6368R0 != null) {
                return C1546a.this.f6369S0.mo6858a(C1546a.this.getAdapter(), view, i, i2);
            }
            return false;
        }
    }

    /* renamed from: c.c.a.a.c.a$d */
    static /* synthetic */ class C1550d {

        /* renamed from: a */
        static final /* synthetic */ int[] f6379a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                c.c.a.a.c.a$e[] r0 = p069c.p111c.p112a.p113a.p116c.C1546a.EnumC1551e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                p069c.p111c.p112a.p113a.p116c.C1546a.C1550d.f6379a = r0
                c.c.a.a.c.a$e r1 = p069c.p111c.p112a.p113a.p116c.C1546a.EnumC1551e.Horizontal     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = p069c.p111c.p112a.p113a.p116c.C1546a.C1550d.f6379a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.c.a.a.c.a$e r1 = p069c.p111c.p112a.p113a.p116c.C1546a.EnumC1551e.Wheel     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = p069c.p111c.p112a.p113a.p116c.C1546a.C1550d.f6379a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.c.a.a.c.a$e r1 = p069c.p111c.p112a.p113a.p116c.C1546a.EnumC1551e.CoverFlow     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = p069c.p111c.p112a.p113a.p116c.C1546a.C1550d.f6379a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.c.a.a.c.a$e r1 = p069c.p111c.p112a.p113a.p116c.C1546a.EnumC1551e.TimeMachine     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = p069c.p111c.p112a.p113a.p116c.C1546a.C1550d.f6379a     // Catch:{ NoSuchFieldError -> 0x003e }
                c.c.a.a.c.a$e r1 = p069c.p111c.p112a.p113a.p116c.C1546a.EnumC1551e.InverseTimeMachine     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = p069c.p111c.p112a.p113a.p116c.C1546a.C1550d.f6379a     // Catch:{ NoSuchFieldError -> 0x0049 }
                c.c.a.a.c.a$e r1 = p069c.p111c.p112a.p113a.p116c.C1546a.EnumC1551e.Parameterized     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = p069c.p111c.p112a.p113a.p116c.C1546a.C1550d.f6379a     // Catch:{ NoSuchFieldError -> 0x0054 }
                c.c.a.a.c.a$e r1 = p069c.p111c.p112a.p113a.p116c.C1546a.EnumC1551e.Custom     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p069c.p111c.p112a.p113a.p116c.C1546a.C1550d.<clinit>():void");
        }
    }

    @Deprecated
    /* renamed from: c.c.a.a.c.a$e */
    public enum EnumC1551e {
        Horizontal,
        Wheel,
        CoverFlow,
        TimeMachine,
        InverseTimeMachine,
        Parameterized,
        Custom
    }

    /* renamed from: c.c.a.a.c.a$f */
    public enum EnumC1552f {
        FirstBack,
        FirstFront,
        CenterFront,
        CenterBack
    }

    /* renamed from: c.c.a.a.c.a$g */
    public interface AbstractC1553g {
        /* renamed from: a */
        void mo6857a(RecyclerView.AbstractC0658g gVar, View view, int i, int i2);
    }

    /* renamed from: c.c.a.a.c.a$h */
    public interface AbstractC1554h {
        /* renamed from: a */
        boolean mo6858a(RecyclerView.AbstractC0658g gVar, View view, int i, int i2);
    }

    /* renamed from: c.c.a.a.c.a$i */
    public interface AbstractC1555i {
        /* renamed from: a */
        void mo6859a(C1546a aVar, int i, int i2, RecyclerView.AbstractC0658g gVar);

        /* renamed from: b */
        void mo6860b(C1546a aVar, int i, int i2, RecyclerView.AbstractC0658g gVar);
    }

    /* renamed from: c.c.a.a.c.a$j */
    public static abstract class AbstractC1556j {
        /* renamed from: a */
        public void mo6861a(C1546a aVar) {
        }

        /* renamed from: b */
        public void mo6862b(C1546a aVar) {
        }

        /* renamed from: c */
        public void mo6863c(C1546a aVar) {
        }

        /* renamed from: d */
        public void mo6864d(C1546a aVar, int i) {
        }

        /* renamed from: e */
        public void mo6865e(C1546a aVar, int i, int i2) {
        }

        /* renamed from: f */
        public void mo6866f(C1546a aVar, int i, int i2, float f) {
        }
    }

    /* renamed from: c.c.a.a.c.a$k */
    public interface AbstractC1557k {
        /* renamed from: a */
        float mo6826a(float f);

        /* renamed from: b */
        int mo6827b(int i);

        /* renamed from: c */
        int mo6828c(int i);
    }

    /* renamed from: c.c.a.a.c.a$l */
    public interface AbstractC1558l {
        /* renamed from: a */
        void mo6833a(float f);

        /* renamed from: b */
        void mo6829b(View view, float f);

        /* renamed from: c */
        void mo6830c(CarouselLayoutManager carouselLayoutManager);
    }

    public C1546a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7569N1();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: M1 */
    private void m7568M1(int i) {
        AbstractC1555i iVar = this.f6370T0;
        if (iVar != null) {
            int i2 = this.f6371U0;
            if (!(i2 == Integer.MIN_VALUE || i2 == i)) {
                iVar.mo6859a(this, i2, this.f6361K0.mo11169B2(i2), getAdapter());
            }
            this.f6370T0.mo6860b(this, i, this.f6361K0.mo11169B2(i), getAdapter());
        } else {
            this.f6374X0 = true;
        }
        this.f6371U0 = i;
    }

    /* renamed from: N1 */
    private void m7569N1() {
        this.f6363M0 = false;
        this.f6364N0 = true;
        this.f6365O0 = true;
        this.f6366P0 = true;
        this.f6367Q0 = null;
        this.f6368R0 = null;
        this.f6369S0 = null;
        super.setOnScrollListener(this.f6375Y0);
    }

    /* renamed from: O1 */
    public static boolean m7570O1() {
        return f6360J0;
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static void m7571P1(String str, Object... objArr) {
        if (!f6360J0) {
            return;
        }
        if (objArr.length > 0) {
            Log.d(f6359I0, String.format(str, objArr));
        } else {
            Log.d(f6359I0, str);
        }
    }

    public static void setDebug(boolean z) {
        f6360J0 = z;
    }

    private void setTransformerInternal(AbstractC1558l lVar) {
        this.f6362L0 = lVar;
        this.f6361K0.mo11168A2(lVar);
    }

    /* renamed from: Q1 */
    public C1546a mo6839Q1(int i) {
        this.f6361K0.mo11184u2(this, i);
        return this;
    }

    /* renamed from: R1 */
    public C1546a mo6840R1(AbstractC1553g gVar) {
        this.f6368R0 = gVar;
        return this;
    }

    /* renamed from: S1 */
    public C1546a mo6841S1(AbstractC1554h hVar) {
        this.f6369S0 = hVar;
        return this;
    }

    /* renamed from: T1 */
    public C1546a mo6842T1(AbstractC1556j jVar) {
        this.f6367Q0 = jVar;
        return this;
    }

    public int getCurrentAdapterPosition() {
        CarouselLayoutManager carouselLayoutManager = this.f6361K0;
        return carouselLayoutManager.mo11169B2(carouselLayoutManager.mo11172d2());
    }

    public float getCurrentOffset() {
        return this.f6361K0.mo11171c2();
    }

    public int getCurrentPosition() {
        return this.f6361K0.mo11172d2();
    }

    public float getCurrentPositionPoint() {
        return this.f6361K0.mo11173e2();
    }

    public int getExtraVisibleChilds() {
        return this.f6361K0.mo11174f2();
    }

    public int getGravity() {
        return this.f6361K0.mo11175g2();
    }

    public float getLastScrollStartPositionPoint() {
        return this.f6372V0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public CarouselLayoutManager getLayoutManager() {
        return this.f6361K0;
    }

    public AbstractC1558l getTransformer() {
        return this.f6361K0.mo11177k2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: k1 */
    public void mo3233k1(int i) {
        if (this.f6361K0.mo11179m2(i)) {
            super.mo3233k1(i);
            m7568M1(i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo3233k1(this.f6361K0.mo11172d2());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m7571P1("CarouselView onMeasure " + getMeasuredWidth() + ", " + getMeasuredHeight(), new Object[0]);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (C1003i.m5689a(motionEvent) != 1) {
            this.f6373W0 = true;
        } else if (!this.f6365O0) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    /* renamed from: s1 */
    public void mo3237s1(int i) {
        if (this.f6361K0.mo11179m2(i)) {
            this.f6373W0 = false;
            super.mo3237s1(i);
            m7568M1(i);
        }
    }

    @Deprecated
    public void setDisplayMode(EnumC1551e eVar) {
        AbstractC1558l lVar;
        switch (C1550d.f6379a[eVar.ordinal()]) {
            case 1:
                lVar = new C1541e();
                break;
            case 2:
                lVar = new C1545i();
                break;
            case 3:
                lVar = new C1537a();
                break;
            case 4:
                lVar = new C1544h();
                break;
            case 5:
                lVar = new C1540d();
                break;
            case 6:
                lVar = new C1543g();
                break;
            case 7:
                lVar = this.f6362L0;
                break;
            default:
                throw new UnsupportedOperationException("Mode " + eVar + " is not supported");
        }
        setTransformerInternal(lVar);
    }

    public void setGravity(int i) {
        this.f6361K0.mo11185v2(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setLayoutManager(RecyclerView.AbstractC0669o oVar) {
        throw new UnsupportedOperationException("CarouselView doesn't support setLayoutManager(LayoutManager)");
    }

    public void setLayoutManager(CarouselLayoutManager carouselLayoutManager) {
        if (carouselLayoutManager == null) {
            throw new NullPointerException("CarouselLayoutManager cannot be null");
        }
        throw new UnsupportedOperationException("setLayoutManager(CarouselLayoutManager) is not yet supported.");
    }

    public void setLayoutManagerInternal(CarouselLayoutManager carouselLayoutManager) {
        if (carouselLayoutManager != null) {
            super.setLayoutManager((RecyclerView.AbstractC0669o) carouselLayoutManager);
            this.f6361K0 = carouselLayoutManager;
            carouselLayoutManager.mo11186w2(this.f6363M0);
            mo6839Q1(1);
            this.f6361K0.mo11187x2(new C1548b());
            this.f6361K0.mo11188y2(new C1549c());
            return;
        }
        throw new NullPointerException("CarouselLayoutManager cannot be null");
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    @Deprecated
    public void setOnScrollListener(RecyclerView.AbstractC0678t tVar) {
        throw new UnsupportedOperationException("setOnScrollListener(RecyclerView.OnScrollListener) is not supported, use setOnScrollListener(CarouselView.OnScrollListener) instead.");
    }

    public void setTransformer(AbstractC1558l lVar) {
        setTransformerInternal(lVar);
    }

    public void setYTranslation(float f) {
        AbstractC1558l lVar = this.f6362L0;
        if (lVar != null) {
            lVar.mo6833a(f);
        }
    }
}
