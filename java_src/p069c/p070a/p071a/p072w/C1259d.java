package p069c.p070a.p071a.p072w;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: c.a.a.w.d */
public class C1259d {

    /* renamed from: a */
    protected static final Comparator<byte[]> f5501a = new C1260a();

    /* renamed from: b */
    private final List<byte[]> f5502b = new ArrayList();

    /* renamed from: c */
    private final List<byte[]> f5503c = new ArrayList(64);

    /* renamed from: d */
    private int f5504d = 0;

    /* renamed from: e */
    private final int f5505e;

    /* renamed from: c.a.a.w.d$a */
    class C1260a implements Comparator<byte[]> {
        C1260a() {
        }

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public C1259d(int i) {
        this.f5505e = i;
    }

    /* renamed from: c */
    private synchronized void m6683c() {
        while (this.f5504d > this.f5505e) {
            byte[] remove = this.f5502b.remove(0);
            this.f5503c.remove(remove);
            this.f5504d -= remove.length;
        }
    }

    /* renamed from: a */
    public synchronized byte[] mo6233a(int i) {
        for (int i2 = 0; i2 < this.f5503c.size(); i2++) {
            byte[] bArr = this.f5503c.get(i2);
            if (bArr.length >= i) {
                this.f5504d -= bArr.length;
                this.f5503c.remove(i2);
                this.f5502b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* renamed from: b */
    public synchronized void mo6234b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f5505e) {
                this.f5502b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f5503c, bArr, f5501a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f5503c.add(binarySearch, bArr);
                this.f5504d += bArr.length;
                m6683c();
            }
        }
    }
}
