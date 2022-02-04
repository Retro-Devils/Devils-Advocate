package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.AbstractC0751a;

public final class AudioAttributesImplApi21Parcelizer {
    public static C0638b read(AbstractC0751a aVar) {
        C0638b bVar = new C0638b();
        bVar.f3056a = (AudioAttributes) aVar.mo4546r(bVar.f3056a, 1);
        bVar.f3057b = aVar.mo4544p(bVar.f3057b, 2);
        return bVar;
    }

    public static void write(C0638b bVar, AbstractC0751a aVar) {
        aVar.mo4552x(false, false);
        aVar.mo4526H(bVar.f3056a, 1);
        aVar.mo4524F(bVar.f3057b, 2);
    }
}
