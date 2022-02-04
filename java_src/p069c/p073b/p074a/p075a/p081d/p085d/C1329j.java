package p069c.p073b.p074a.p075a.p081d.p085d;

import com.google.android.gms.common.api.AbstractC2911f;
import com.google.android.gms.common.api.AbstractC2914g;
import com.google.android.gms.common.api.AbstractC2964k;
import com.google.android.gms.common.api.Status;
import p069c.p073b.p074a.p075a.p086e.AbstractC1339d;
import p069c.p073b.p074a.p075a.p086e.C1343f;

/* renamed from: c.b.a.a.d.d.j */
public class C1329j implements AbstractC1339d {

    /* renamed from: c.b.a.a.d.d.j$a */
    static class C1330a implements AbstractC1339d.AbstractC1341b {

        /* renamed from: b */
        private final Status f5584b;

        /* renamed from: c */
        private final C1343f f5585c;

        public C1330a(Status status, C1343f fVar) {
            this.f5584b = status;
            this.f5585c = fVar;
        }

        @Override // p069c.p073b.p074a.p075a.p086e.AbstractC1339d.AbstractC1341b
        /* renamed from: b */
        public final String mo6350b() {
            C1343f fVar = this.f5585c;
            if (fVar == null) {
                return null;
            }
            return fVar.mo6368b();
        }

        @Override // com.google.android.gms.common.api.AbstractC2964k
        /* renamed from: g */
        public final Status mo6351g() {
            return this.f5584b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c.b.a.a.d.d.j$b */
    public static abstract class AbstractC1331b extends AbstractC1324e<AbstractC1339d.AbstractC1341b> {

        /* renamed from: s */
        protected AbstractC1325f f5586s = new BinderC1333l(this);

        public AbstractC1331b(AbstractC2911f fVar) {
            super(fVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* renamed from: c */
        public /* synthetic */ AbstractC2964k mo6352c(Status status) {
            return new C1330a(status, null);
        }
    }

    /* renamed from: a */
    public static AbstractC2914g<AbstractC1339d.AbstractC1341b> m6896a(AbstractC2911f fVar, byte[] bArr, String str) {
        return fVar.mo9590a(new C1332k(fVar, bArr, str));
    }
}
