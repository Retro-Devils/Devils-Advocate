package p155e.p156a.p157a.p158a.p159b.p160b;

import java.io.IOException;
import java.io.InputStream;
import p155e.p164b.p165a.C3393j;
import p155e.p164b.p165a.C3394k;

/* renamed from: e.a.a.a.b.b.j */
class C3367j extends AbstractC3355f {
    C3367j() {
        super(C3394k.class, Number.class);
    }

    /* renamed from: d */
    private int m13964d(C3354e eVar) {
        int i = eVar.f11306d[0] & 255;
        if ((i & -64) != 0) {
            throw new IllegalArgumentException("Unsupported LZMA2 property bits");
        } else if (i > 40) {
            throw new IllegalArgumentException("Dictionary larger than 4GiB maximum size");
        } else if (i == 40) {
            return -1;
        } else {
            return ((i & 1) | 2) << ((i / 2) + 11);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p155e.p156a.p157a.p158a.p159b.p160b.AbstractC3355f
    /* renamed from: b */
    public InputStream mo11293b(String str, InputStream inputStream, long j, C3354e eVar, byte[] bArr) {
        try {
            return new C3393j(inputStream, m13964d(eVar));
        } catch (IllegalArgumentException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    @Override // p155e.p156a.p157a.p158a.p159b.p160b.AbstractC3355f
    /* renamed from: c */
    public Object mo11303c(C3354e eVar, InputStream inputStream) {
        return Integer.valueOf(m13964d(eVar));
    }
}
