package androidx.media;

import androidx.versionedparcelable.AbstractC0751a;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0751a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3055c = (AbstractC0637a) aVar.mo4550v(audioAttributesCompat.f3055c, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0751a aVar) {
        aVar.mo4552x(false, false);
        aVar.mo4531M(audioAttributesCompat.f3055c, 1);
    }
}
