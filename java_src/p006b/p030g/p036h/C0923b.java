package p006b.p030g.p036h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.p005c.C0382c;
import androidx.core.content.p005c.C0390f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p006b.p021d.C0831g;
import p006b.p021d.C0838i;
import p006b.p030g.p031d.C0906d;
import p006b.p030g.p031d.C0916k;
import p006b.p030g.p036h.C0931c;
import p006b.p030g.p038j.C0961i;

/* renamed from: b.g.h.b */
public class C0923b {

    /* renamed from: a */
    static final C0831g<String, Typeface> f4569a = new C0831g<>(16);

    /* renamed from: b */
    private static final C0931c f4570b = new C0931c("fonts", 10, 10000);

    /* renamed from: c */
    static final Object f4571c = new Object();

    /* renamed from: d */
    static final C0838i<String, ArrayList<C0931c.AbstractC0936d<C0930g>>> f4572d = new C0838i<>();

    /* renamed from: e */
    private static final Comparator<byte[]> f4573e = new C0927d();

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.h.b$a */
    public class CallableC0924a implements Callable<C0930g> {

        /* renamed from: a */
        final /* synthetic */ Context f4574a;

        /* renamed from: b */
        final /* synthetic */ C0922a f4575b;

        /* renamed from: c */
        final /* synthetic */ int f4576c;

        /* renamed from: d */
        final /* synthetic */ String f4577d;

        CallableC0924a(Context context, C0922a aVar, int i, String str) {
            this.f4574a = context;
            this.f4575b = aVar;
            this.f4576c = i;
            this.f4577d = str;
        }

        /* renamed from: a */
        public C0930g call() {
            C0930g f = C0923b.m5407f(this.f4574a, this.f4575b, this.f4576c);
            Typeface typeface = f.f4588a;
            if (typeface != null) {
                C0923b.f4569a.mo4930f(this.f4577d, typeface);
            }
            return f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.h.b$b */
    public class C0925b implements C0931c.AbstractC0936d<C0930g> {

        /* renamed from: a */
        final /* synthetic */ C0390f.AbstractC0391a f4578a;

        /* renamed from: b */
        final /* synthetic */ Handler f4579b;

        C0925b(C0390f.AbstractC0391a aVar, Handler handler) {
            this.f4578a = aVar;
            this.f4579b = handler;
        }

        /* renamed from: b */
        public void mo5334a(C0930g gVar) {
            int i;
            C0390f.AbstractC0391a aVar;
            if (gVar == null) {
                aVar = this.f4578a;
                i = 1;
            } else {
                i = gVar.f4589b;
                if (i == 0) {
                    this.f4578a.mo2240b(gVar.f4588a, this.f4579b);
                    return;
                }
                aVar = this.f4578a;
            }
            aVar.mo2239a(i, this.f4579b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.h.b$c */
    public class C0926c implements C0931c.AbstractC0936d<C0930g> {

        /* renamed from: a */
        final /* synthetic */ String f4580a;

        C0926c(String str) {
            this.f4580a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            r2.get(r0).mo5334a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo5334a(p006b.p030g.p036h.C0923b.C0930g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p006b.p030g.p036h.C0923b.f4571c
                monitor-enter(r0)
                b.d.i<java.lang.String, java.util.ArrayList<b.g.h.c$d<b.g.h.b$g>>> r1 = p006b.p030g.p036h.C0923b.f4572d     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.f4580a     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.f4580a     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                b.g.h.c$d r1 = (p006b.p030g.p036h.C0931c.AbstractC0936d) r1
                r1.mo5334a(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)
                goto L_0x002f
            L_0x002e:
                throw r5
            L_0x002f:
                goto L_0x002e
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p030g.p036h.C0923b.C0926c.mo5334a(b.g.h.b$g):void");
        }
    }

    /* renamed from: b.g.h.b$d */
    class C0927d implements Comparator<byte[]> {
        C0927d() {
        }

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            if (bArr.length != bArr2.length) {
                i2 = bArr.length;
                i = bArr2.length;
            } else {
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    if (bArr[i3] != bArr2[i3]) {
                        i2 = bArr[i3];
                        i = bArr2[i3];
                    }
                }
                return 0;
            }
            return (i2 == 1 ? 1 : 0) - (i == 1 ? 1 : 0);
        }
    }

    /* renamed from: b.g.h.b$e */
    public static class C0928e {

        /* renamed from: a */
        private final int f4581a;

        /* renamed from: b */
        private final C0929f[] f4582b;

        public C0928e(int i, C0929f[] fVarArr) {
            this.f4581a = i;
            this.f4582b = fVarArr;
        }

        /* renamed from: a */
        public C0929f[] mo5339a() {
            return this.f4582b;
        }

        /* renamed from: b */
        public int mo5340b() {
            return this.f4581a;
        }
    }

    /* renamed from: b.g.h.b$f */
    public static class C0929f {

        /* renamed from: a */
        private final Uri f4583a;

        /* renamed from: b */
        private final int f4584b;

        /* renamed from: c */
        private final int f4585c;

        /* renamed from: d */
        private final boolean f4586d;

        /* renamed from: e */
        private final int f4587e;

        public C0929f(Uri uri, int i, int i2, boolean z, int i3) {
            this.f4583a = (Uri) C0961i.m5494c(uri);
            this.f4584b = i;
            this.f4585c = i2;
            this.f4586d = z;
            this.f4587e = i3;
        }

        /* renamed from: a */
        public int mo5341a() {
            return this.f4587e;
        }

        /* renamed from: b */
        public int mo5342b() {
            return this.f4584b;
        }

        /* renamed from: c */
        public Uri mo5343c() {
            return this.f4583a;
        }

        /* renamed from: d */
        public int mo5344d() {
            return this.f4585c;
        }

        /* renamed from: e */
        public boolean mo5345e() {
            return this.f4586d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.g.h.b$g */
    public static final class C0930g {

        /* renamed from: a */
        final Typeface f4588a;

        /* renamed from: b */
        final int f4589b;

        C0930g(Typeface typeface, int i) {
            this.f4588a = typeface;
            this.f4589b = i;
        }
    }

    /* renamed from: a */
    private static List<byte[]> m5402a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m5403b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static C0928e m5404c(Context context, CancellationSignal cancellationSignal, C0922a aVar) {
        ProviderInfo h = m5409h(context.getPackageManager(), aVar, context.getResources());
        return h == null ? new C0928e(1, null) : new C0928e(0, m5406e(context, aVar, h.authority, cancellationSignal));
    }

    /* renamed from: d */
    private static List<List<byte[]>> m5405d(C0922a aVar, Resources resources) {
        return aVar.mo5325a() != null ? aVar.mo5325a() : C0382c.m1900c(resources, aVar.mo5326b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x014b  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p006b.p030g.p036h.C0923b.C0929f[] m5406e(android.content.Context r23, p006b.p030g.p036h.C0922a r24, java.lang.String r25, android.os.CancellationSignal r26) {
        /*
        // Method dump skipped, instructions count: 337
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p030g.p036h.C0923b.m5406e(android.content.Context, b.g.h.a, java.lang.String, android.os.CancellationSignal):b.g.h.b$f[]");
    }

    /* renamed from: f */
    static C0930g m5407f(Context context, C0922a aVar, int i) {
        try {
            C0928e c = m5404c(context, null, aVar);
            int i2 = -3;
            if (c.mo5340b() == 0) {
                Typeface b = C0906d.m5320b(context, null, c.mo5339a(), i);
                if (b != null) {
                    i2 = 0;
                }
                return new C0930g(b, i2);
            }
            if (c.mo5340b() == 1) {
                i2 = -2;
            }
            return new C0930g(null, i2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0930g(null, -1);
        }
    }

    /* renamed from: g */
    public static Typeface m5408g(Context context, C0922a aVar, C0390f.AbstractC0391a aVar2, Handler handler, boolean z, int i, int i2) {
        String str = aVar.mo5327c() + "-" + i2;
        Typeface d = f4569a.mo4928d(str);
        if (d != null) {
            if (aVar2 != null) {
                aVar2.mo1847d(d);
            }
            return d;
        } else if (!z || i != -1) {
            CallableC0924a aVar3 = new CallableC0924a(context, aVar, i2, str);
            if (z) {
                try {
                    return ((C0930g) f4570b.mo5349e(aVar3, i)).f4588a;
                } catch (InterruptedException unused) {
                    return null;
                }
            } else {
                C0925b bVar = aVar2 == null ? null : new C0925b(aVar2, handler);
                synchronized (f4571c) {
                    C0838i<String, ArrayList<C0931c.AbstractC0936d<C0930g>>> iVar = f4572d;
                    ArrayList<C0931c.AbstractC0936d<C0930g>> arrayList = iVar.get(str);
                    if (arrayList != null) {
                        if (bVar != null) {
                            arrayList.add(bVar);
                        }
                        return null;
                    }
                    if (bVar != null) {
                        ArrayList<C0931c.AbstractC0936d<C0930g>> arrayList2 = new ArrayList<>();
                        arrayList2.add(bVar);
                        iVar.put(str, arrayList2);
                    }
                    f4570b.mo5348d(aVar3, new C0926c(str));
                    return null;
                }
            }
        } else {
            C0930g f = m5407f(context, aVar, i2);
            if (aVar2 != null) {
                int i3 = f.f4589b;
                if (i3 == 0) {
                    aVar2.mo2240b(f.f4588a, handler);
                } else {
                    aVar2.mo2239a(i3, handler);
                }
            }
            return f.f4588a;
        }
    }

    /* renamed from: h */
    public static ProviderInfo m5409h(PackageManager packageManager, C0922a aVar, Resources resources) {
        String d = aVar.mo5328d();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(d, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + d);
        } else if (resolveContentProvider.packageName.equals(aVar.mo5329e())) {
            List<byte[]> a = m5402a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a, f4573e);
            List<List<byte[]>> d2 = m5405d(aVar, resources);
            for (int i = 0; i < d2.size(); i++) {
                ArrayList arrayList = new ArrayList(d2.get(i));
                Collections.sort(arrayList, f4573e);
                if (m5403b(a, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + d + ", but package was not " + aVar.mo5329e());
        }
    }

    /* renamed from: i */
    public static Map<Uri, ByteBuffer> m5410i(Context context, C0929f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0929f fVar : fVarArr) {
            if (fVar.mo5341a() == 0) {
                Uri c = fVar.mo5343c();
                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, C0916k.m5388f(context, cancellationSignal, c));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
