package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.AbstractC0751a;

public class IconCompatParcelizer {
    public static IconCompat read(AbstractC0751a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2086b = aVar.mo4544p(iconCompat.f2086b, 1);
        iconCompat.f2088d = aVar.mo4538j(iconCompat.f2088d, 2);
        iconCompat.f2089e = aVar.mo4546r(iconCompat.f2089e, 3);
        iconCompat.f2090f = aVar.mo4544p(iconCompat.f2090f, 4);
        iconCompat.f2091g = aVar.mo4544p(iconCompat.f2091g, 5);
        iconCompat.f2092h = (ColorStateList) aVar.mo4546r(iconCompat.f2092h, 6);
        iconCompat.f2094j = aVar.mo4548t(iconCompat.f2094j, 7);
        iconCompat.mo2247l();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, AbstractC0751a aVar) {
        aVar.mo4552x(true, true);
        iconCompat.mo2248m(aVar.mo4534f());
        int i = iconCompat.f2086b;
        if (-1 != i) {
            aVar.mo4524F(i, 1);
        }
        byte[] bArr = iconCompat.f2088d;
        if (bArr != null) {
            aVar.mo4520B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2089e;
        if (parcelable != null) {
            aVar.mo4526H(parcelable, 3);
        }
        int i2 = iconCompat.f2090f;
        if (i2 != 0) {
            aVar.mo4524F(i2, 4);
        }
        int i3 = iconCompat.f2091g;
        if (i3 != 0) {
            aVar.mo4524F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f2092h;
        if (colorStateList != null) {
            aVar.mo4526H(colorStateList, 6);
        }
        String str = iconCompat.f2094j;
        if (str != null) {
            aVar.mo4528J(str, 7);
        }
    }
}
