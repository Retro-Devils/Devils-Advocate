package androidx.media;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

@TargetApi(21)
/* renamed from: androidx.media.b */
class C0638b implements AbstractC0637a {

    /* renamed from: a */
    AudioAttributes f3056a;

    /* renamed from: b */
    int f3057b = -1;

    C0638b() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0638b)) {
            return false;
        }
        return this.f3056a.equals(((C0638b) obj).f3056a);
    }

    public int hashCode() {
        return this.f3056a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3056a;
    }
}
