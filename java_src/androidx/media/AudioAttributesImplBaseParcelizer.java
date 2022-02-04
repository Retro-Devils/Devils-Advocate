package androidx.media;

import androidx.versionedparcelable.AbstractC0751a;

public final class AudioAttributesImplBaseParcelizer {
    public static C0639c read(AbstractC0751a aVar) {
        C0639c cVar = new C0639c();
        cVar.f3058a = aVar.mo4544p(cVar.f3058a, 1);
        cVar.f3059b = aVar.mo4544p(cVar.f3059b, 2);
        cVar.f3060c = aVar.mo4544p(cVar.f3060c, 3);
        cVar.f3061d = aVar.mo4544p(cVar.f3061d, 4);
        return cVar;
    }

    public static void write(C0639c cVar, AbstractC0751a aVar) {
        aVar.mo4552x(false, false);
        aVar.mo4524F(cVar.f3058a, 1);
        aVar.mo4524F(cVar.f3059b, 2);
        aVar.mo4524F(cVar.f3060c, 3);
        aVar.mo4524F(cVar.f3061d, 4);
    }
}
