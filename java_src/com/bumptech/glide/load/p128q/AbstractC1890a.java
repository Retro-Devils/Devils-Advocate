package com.bumptech.glide.load.p128q;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.AbstractC1649k;
import com.bumptech.glide.load.C1644h;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1631b;
import com.bumptech.glide.load.EnumC1648j;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p128q.p129d.AbstractC1922l;
import com.bumptech.glide.load.p128q.p129d.C1930m;
import com.bumptech.glide.load.p128q.p129d.C1938r;

/* renamed from: com.bumptech.glide.load.q.a */
public abstract class AbstractC1890a<T> implements AbstractC1649k<ImageDecoder.Source, T> {

    /* renamed from: a */
    final C1938r f7159a = C1938r.m8778a();

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.q.a$a */
    public class C1891a implements ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a */
        final /* synthetic */ int f7160a;

        /* renamed from: b */
        final /* synthetic */ int f7161b;

        /* renamed from: c */
        final /* synthetic */ boolean f7162c;

        /* renamed from: d */
        final /* synthetic */ EnumC1631b f7163d;

        /* renamed from: e */
        final /* synthetic */ AbstractC1922l f7164e;

        /* renamed from: f */
        final /* synthetic */ EnumC1648j f7165f;

        /* renamed from: com.bumptech.glide.load.q.a$a$a */
        class C1892a implements ImageDecoder.OnPartialImageListener {
            C1892a() {
            }

            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        C1891a(int i, int i2, boolean z, EnumC1631b bVar, AbstractC1922l lVar, EnumC1648j jVar) {
            this.f7160a = i;
            this.f7161b = i2;
            this.f7162c = z;
            this.f7163d = bVar;
            this.f7164e = lVar;
            this.f7165f = jVar;
        }

        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            ColorSpace.Named named;
            boolean z = false;
            if (AbstractC1890a.this.f7159a.mo7525c(this.f7160a, this.f7161b, this.f7162c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f7163d == EnumC1631b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C1892a());
            Size size = imageInfo.getSize();
            int i = this.f7160a;
            if (i == Integer.MIN_VALUE) {
                i = size.getWidth();
            }
            int i2 = this.f7161b;
            if (i2 == Integer.MIN_VALUE) {
                i2 = size.getHeight();
            }
            float b = this.f7164e.mo7515b(size.getWidth(), size.getHeight(), i, i2);
            int round = Math.round(((float) size.getWidth()) * b);
            int round2 = Math.round(((float) size.getHeight()) * b);
            if (Log.isLoggable("ImageDecoder", 2)) {
                Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b);
            }
            imageDecoder.setTargetSize(round, round2);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (this.f7165f == EnumC1648j.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                    imageDecoder.setTargetColorSpace(ColorSpace.get(named));
                }
            } else if (i3 < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract AbstractC1794v<T> mo7480c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener);

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: com.bumptech.glide.load.i */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final AbstractC1794v<T> mo7088a(ImageDecoder.Source source, int i, int i2, C1647i iVar) {
        EnumC1631b bVar = (EnumC1631b) iVar.mo7084c(C1930m.f7212a);
        AbstractC1922l lVar = (AbstractC1922l) iVar.mo7084c(AbstractC1922l.f7207h);
        C1644h<Boolean> hVar = C1930m.f7216e;
        return mo7480c(source, i, i2, new C1891a(i, i2, iVar.mo7084c(hVar) != null && ((Boolean) iVar.mo7084c(hVar)).booleanValue(), bVar, lVar, (EnumC1648j) iVar.mo7084c(C1930m.f7213b)));
    }

    /* renamed from: e */
    public final boolean mo7089b(ImageDecoder.Source source, C1647i iVar) {
        return true;
    }
}
