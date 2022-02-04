package p006b.p030g.p031d;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.core.content.p005c.C0382c;
import java.io.IOException;
import java.io.InputStream;
import p006b.p030g.p036h.C0923b;

/* renamed from: b.g.d.i */
public class C0911i extends C0912j {
    @Override // p006b.p030g.p031d.C0912j
    /* renamed from: b */
    public Typeface mo5305b(Context context, C0382c.C0384b bVar, Resources resources, int i) {
        C0382c.C0385c[] a = bVar.mo2229a();
        int length = a.length;
        int i2 = 0;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            C0382c.C0385c cVar = a[i3];
            try {
                Font.Builder weight = new Font.Builder(resources, cVar.mo2231b()).setWeight(cVar.mo2234e());
                if (!cVar.mo2235f()) {
                    i4 = 0;
                }
                Font build = weight.setSlant(i4).setTtcIndex(cVar.mo2232c()).setFontVariationSettings(cVar.mo2233d()).build();
                if (builder == null) {
                    builder = new FontFamily.Builder(build);
                } else {
                    builder.addFont(build);
                }
            } catch (IOException unused) {
            }
            i3++;
        }
        if (builder == null) {
            return null;
        }
        int i5 = (i & 1) != 0 ? 700 : 400;
        if ((i & 2) != 0) {
            i2 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
    }

    @Override // p006b.p030g.p031d.C0912j
    /* renamed from: c */
    public Typeface mo5306c(Context context, CancellationSignal cancellationSignal, C0923b.C0929f[] fVarArr, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        int length = fVarArr.length;
        int i2 = 0;
        FontFamily.Builder builder = null;
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i3 >= length) {
                break;
            }
            C0923b.C0929f fVar = fVarArr[i3];
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(fVar.mo5343c(), "r", cancellationSignal);
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(fVar.mo5344d());
                        if (!fVar.mo5345e()) {
                            i4 = 0;
                        }
                        Font build = weight.setSlant(i4).setTtcIndex(fVar.mo5342b()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable unused) {
                    }
                } else if (openFileDescriptor == null) {
                    i3++;
                }
                openFileDescriptor.close();
            } catch (IOException unused2) {
            }
            i3++;
        }
        if (builder == null) {
            return null;
        }
        int i5 = (i & 1) != 0 ? 700 : 400;
        if ((i & 2) != 0) {
            i2 = 1;
        }
        return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
        throw th;
    }

    /* access modifiers changed from: protected */
    @Override // p006b.p030g.p031d.C0912j
    /* renamed from: d */
    public Typeface mo5316d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // p006b.p030g.p031d.C0912j
    /* renamed from: e */
    public Typeface mo5308e(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (IOException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // p006b.p030g.p031d.C0912j
    /* renamed from: h */
    public C0923b.C0929f mo5317h(C0923b.C0929f[] fVarArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
