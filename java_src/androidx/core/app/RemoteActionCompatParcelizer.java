package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.AbstractC0751a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0751a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1949a = (IconCompat) aVar.mo4550v(remoteActionCompat.f1949a, 1);
        remoteActionCompat.f1950b = aVar.mo4540l(remoteActionCompat.f1950b, 2);
        remoteActionCompat.f1951c = aVar.mo4540l(remoteActionCompat.f1951c, 3);
        remoteActionCompat.f1952d = (PendingIntent) aVar.mo4546r(remoteActionCompat.f1952d, 4);
        remoteActionCompat.f1953e = aVar.mo4536h(remoteActionCompat.f1953e, 5);
        remoteActionCompat.f1954f = aVar.mo4536h(remoteActionCompat.f1954f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0751a aVar) {
        aVar.mo4552x(false, false);
        aVar.mo4531M(remoteActionCompat.f1949a, 1);
        aVar.mo4522D(remoteActionCompat.f1950b, 2);
        aVar.mo4522D(remoteActionCompat.f1951c, 3);
        aVar.mo4526H(remoteActionCompat.f1952d, 4);
        aVar.mo4554z(remoteActionCompat.f1953e, 5);
        aVar.mo4554z(remoteActionCompat.f1954f, 6);
    }
}
