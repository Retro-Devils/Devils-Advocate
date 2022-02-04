package com.bumptech.glide.load.p128q.p133h;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.AbstractC1649k;
import com.bumptech.glide.load.C1635f;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1631b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import com.bumptech.glide.load.p128q.C1894c;
import com.bumptech.glide.p136n.AbstractC1996a;
import com.bumptech.glide.p136n.C1999c;
import com.bumptech.glide.p136n.C2000d;
import com.bumptech.glide.p136n.C2001e;
import com.bumptech.glide.p144t.C2077f;
import com.bumptech.glide.p144t.C2082k;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.q.h.a */
public class C1962a implements AbstractC1649k<ByteBuffer, C1966c> {

    /* renamed from: a */
    private static final C1963a f7261a = new C1963a();

    /* renamed from: b */
    private static final C1964b f7262b = new C1964b();

    /* renamed from: c */
    private final Context f7263c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f7264d;

    /* renamed from: e */
    private final C1964b f7265e;

    /* renamed from: f */
    private final C1963a f7266f;

    /* renamed from: g */
    private final C1965b f7267g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.q.h.a$a */
    public static class C1963a {
        C1963a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public AbstractC1996a mo7568a(AbstractC1996a.AbstractC1997a aVar, C1999c cVar, ByteBuffer byteBuffer, int i) {
            return new C2001e(aVar, cVar, byteBuffer, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.q.h.a$b */
    public static class C1964b {

        /* renamed from: a */
        private final Queue<C2000d> f7268a = C2082k.m9438e(0);

        C1964b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized C2000d mo7569a(ByteBuffer byteBuffer) {
            C2000d poll;
            poll = this.f7268a.poll();
            if (poll == null) {
                poll = new C2000d();
            }
            return poll.mo7665p(byteBuffer);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo7570b(C2000d dVar) {
            dVar.mo7663a();
            this.f7268a.offer(dVar);
        }
    }

    public C1962a(Context context, List<ImageHeaderParser> list, AbstractC1695e eVar, AbstractC1690b bVar) {
        this(context, list, eVar, bVar, f7262b, f7261a);
    }

    C1962a(Context context, List<ImageHeaderParser> list, AbstractC1695e eVar, AbstractC1690b bVar, C1964b bVar2, C1963a aVar) {
        this.f7263c = context.getApplicationContext();
        this.f7264d = list;
        this.f7266f = aVar;
        this.f7267g = new C1965b(eVar, bVar);
        this.f7265e = bVar2;
    }

    /* renamed from: c */
    private C1969e m8875c(ByteBuffer byteBuffer, int i, int i2, C2000d dVar, C1647i iVar) {
        long b = C2077f.m9416b();
        try {
            C1999c c = dVar.mo7664c();
            if (c.mo7660b() > 0) {
                if (c.mo7661c() == 0) {
                    Bitmap.Config config = iVar.mo7084c(C1977i.f7309a) == EnumC1631b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    AbstractC1996a a = this.f7266f.mo7568a(this.f7267g, c, byteBuffer, m8876e(c, i, i2));
                    a.mo7651c(config);
                    a.mo7654e();
                    Bitmap d = a.mo7653d();
                    if (d == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C2077f.m9415a(b));
                        }
                        return null;
                    }
                    C1969e eVar = new C1969e(new C1966c(this.f7263c, a, C1894c.m8631c(), i, i2, d));
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C2077f.m9415a(b));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C2077f.m9415a(b));
            }
        }
    }

    /* renamed from: e */
    private static int m8876e(C1999c cVar, int i, int i2) {
        int min = Math.min(cVar.mo7659a() / i2, cVar.mo7662d() / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + cVar.mo7662d() + "x" + cVar.mo7659a() + "]");
        }
        return max;
    }

    /* renamed from: d */
    public C1969e mo7088a(ByteBuffer byteBuffer, int i, int i2, C1647i iVar) {
        C2000d a = this.f7265e.mo7569a(byteBuffer);
        try {
            return m8875c(byteBuffer, i, i2, a, iVar);
        } finally {
            this.f7265e.mo7570b(a);
        }
    }

    /* renamed from: f */
    public boolean mo7089b(ByteBuffer byteBuffer, C1647i iVar) {
        return !((Boolean) iVar.mo7084c(C1977i.f7310b)).booleanValue() && C1635f.m7859f(this.f7264d, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }
}
