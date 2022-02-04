package p155e.p156a.p157a.p158a.p159b.p160b;

import java.io.InputStream;
import p155e.p164b.p165a.C3390g;

/* renamed from: e.a.a.a.b.b.h */
class C3365h extends AbstractC3355f {
    C3365h() {
        super(Number.class);
    }

    /* renamed from: d */
    private int m13956d(C3354e eVar) {
        byte[] bArr = eVar.f11306d;
        if (bArr == null || bArr.length == 0) {
            return 1;
        }
        return (bArr[0] & 255) + 1;
    }

    /* access modifiers changed from: package-private */
    @Override // p155e.p156a.p157a.p158a.p159b.p160b.AbstractC3355f
    /* renamed from: b */
    public InputStream mo11293b(String str, InputStream inputStream, long j, C3354e eVar, byte[] bArr) {
        return new C3390g(m13956d(eVar)).mo11374a(inputStream);
    }

    /* access modifiers changed from: package-private */
    @Override // p155e.p156a.p157a.p158a.p159b.p160b.AbstractC3355f
    /* renamed from: c */
    public Object mo11303c(C3354e eVar, InputStream inputStream) {
        return Integer.valueOf(m13956d(eVar));
    }
}
