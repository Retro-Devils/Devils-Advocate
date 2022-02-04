package com.bumptech.glide.load.p122o.p123a0;

import android.graphics.Bitmap;
import android.os.Build;
import com.bumptech.glide.p144t.C2082k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.o.a0.n */
public class C1709n implements AbstractC1707l {

    /* renamed from: a */
    private static final Bitmap.Config[] f6755a;

    /* renamed from: b */
    private static final Bitmap.Config[] f6756b;

    /* renamed from: c */
    private static final Bitmap.Config[] f6757c = {Bitmap.Config.RGB_565};

    /* renamed from: d */
    private static final Bitmap.Config[] f6758d = {Bitmap.Config.ARGB_4444};

    /* renamed from: e */
    private static final Bitmap.Config[] f6759e = {Bitmap.Config.ALPHA_8};

    /* renamed from: f */
    private final C1712c f6760f = new C1712c();

    /* renamed from: g */
    private final C1698h<C1711b, Bitmap> f6761g = new C1698h<>();

    /* renamed from: h */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f6762h = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.a0.n$a */
    public static /* synthetic */ class C1710a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6763a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bumptech.glide.load.p122o.p123a0.C1709n.C1710a.f6763a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bumptech.glide.load.p122o.p123a0.C1709n.C1710a.f6763a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bumptech.glide.load.p122o.p123a0.C1709n.C1710a.f6763a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bumptech.glide.load.p122o.p123a0.C1709n.C1710a.f6763a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p122o.p123a0.C1709n.C1710a.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.a0.n$b */
    public static final class C1711b implements AbstractC1708m {

        /* renamed from: a */
        private final C1712c f6764a;

        /* renamed from: b */
        int f6765b;

        /* renamed from: c */
        private Bitmap.Config f6766c;

        public C1711b(C1712c cVar) {
            this.f6764a = cVar;
        }

        @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1708m
        /* renamed from: a */
        public void mo7170a() {
            this.f6764a.mo7179c(this);
        }

        /* renamed from: b */
        public void mo7206b(int i, Bitmap.Config config) {
            this.f6765b = i;
            this.f6766c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1711b)) {
                return false;
            }
            C1711b bVar = (C1711b) obj;
            return this.f6765b == bVar.f6765b && C2082k.m9436c(this.f6766c, bVar.f6766c);
        }

        public int hashCode() {
            int i = this.f6765b * 31;
            Bitmap.Config config = this.f6766c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C1709n.m8104i(this.f6765b, this.f6766c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.a0.n$c */
    public static class C1712c extends AbstractC1694d<C1711b> {
        C1712c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C1711b mo7175a() {
            return new C1711b(this);
        }

        /* renamed from: e */
        public C1711b mo7211e(int i, Bitmap.Config config) {
            C1711b bVar = (C1711b) mo7178b();
            bVar.mo7206b(i, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f6755a = configArr;
        f6756b = configArr;
    }

    /* renamed from: g */
    private void m8102g(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> k = m8106k(bitmap.getConfig());
        Integer num2 = (Integer) k.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo7168f(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            k.remove(num);
        } else {
            k.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: h */
    private C1711b m8103h(int i, Bitmap.Config config) {
        C1711b e = this.f6760f.mo7211e(i, config);
        Bitmap.Config[] j = m8105j(config);
        for (Bitmap.Config config2 : j) {
            Integer ceilingKey = m8106k(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e;
                        }
                    } else if (config2.equals(config)) {
                        return e;
                    }
                }
                this.f6760f.mo7179c(e);
                return this.f6760f.mo7211e(ceilingKey.intValue(), config2);
            }
        }
        return e;
    }

    /* renamed from: i */
    static String m8104i(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    /* renamed from: j */
    private static Bitmap.Config[] m8105j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f6756b;
        }
        int i = C1710a.f6763a[config.ordinal()];
        if (i == 1) {
            return f6755a;
        }
        if (i == 2) {
            return f6757c;
        }
        if (i == 3) {
            return f6758d;
        }
        if (i == 4) {
            return f6759e;
        }
        return new Bitmap.Config[]{config};
    }

    /* renamed from: k */
    private NavigableMap<Integer, Integer> m8106k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f6762h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f6762h.put(config, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1707l
    /* renamed from: a */
    public int mo7163a(Bitmap bitmap) {
        return C2082k.m9440g(bitmap);
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1707l
    /* renamed from: b */
    public Bitmap mo7164b() {
        Bitmap f = this.f6761g.mo7189f();
        if (f != null) {
            m8102g(Integer.valueOf(C2082k.m9440g(f)), f);
        }
        return f;
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1707l
    /* renamed from: c */
    public Bitmap mo7165c(int i, int i2, Bitmap.Config config) {
        C1711b h = m8103h(C2082k.m9439f(i, i2, config), config);
        Bitmap a = this.f6761g.mo7187a(h);
        if (a != null) {
            m8102g(Integer.valueOf(h.f6765b), a);
            a.reconfigure(i, i2, config);
        }
        return a;
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1707l
    /* renamed from: d */
    public void mo7166d(Bitmap bitmap) {
        C1711b e = this.f6760f.mo7211e(C2082k.m9440g(bitmap), bitmap.getConfig());
        this.f6761g.mo7188d(e, bitmap);
        NavigableMap<Integer, Integer> k = m8106k(bitmap.getConfig());
        Integer num = (Integer) k.get(Integer.valueOf(e.f6765b));
        Integer valueOf = Integer.valueOf(e.f6765b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        k.put(valueOf, Integer.valueOf(i));
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1707l
    /* renamed from: e */
    public String mo7167e(int i, int i2, Bitmap.Config config) {
        return m8104i(C2082k.m9439f(i, i2, config), config);
    }

    @Override // com.bumptech.glide.load.p122o.p123a0.AbstractC1707l
    /* renamed from: f */
    public String mo7168f(Bitmap bitmap) {
        return m8104i(C2082k.m9440g(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f6761g);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f6762h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f6762h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
