package p069c.p073b.p074a.p075a.p081d.p085d;

import android.text.TextUtils;
import com.google.android.gms.common.api.AbstractC2911f;
import p069c.p073b.p074a.p075a.p081d.p085d.C1329j;

/* renamed from: c.b.a.a.d.d.k */
final class C1332k extends C1329j.AbstractC1331b {

    /* renamed from: t */
    private final /* synthetic */ byte[] f5587t;

    /* renamed from: u */
    private final /* synthetic */ String f5588u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1332k(AbstractC2911f fVar, byte[] bArr, String str) {
        super(fVar);
        this.f5587t = bArr;
        this.f5588u = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.common.api.a$b] */
    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.AbstractC2925c
    /* renamed from: l */
    public final /* synthetic */ void mo6353l(C1334m mVar) {
        C1334m mVar2 = mVar;
        AbstractC1325f fVar = this.f5586s;
        byte[] bArr = this.f5587t;
        String str = this.f5588u;
        if (TextUtils.isEmpty(str)) {
            str = mVar2.mo6356i0("com.google.android.safetynet.ATTEST_API_KEY");
        }
        ((AbstractC1327h) mVar2.mo9701A()).mo6349p0(fVar, bArr, str);
    }
}
