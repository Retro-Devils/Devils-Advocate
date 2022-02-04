package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC0477n;
import androidx.lifecycle.AbstractC0614d;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b */
public final class C0443b implements Parcelable {
    public static final Parcelable.Creator<C0443b> CREATOR = new C0444a();

    /* renamed from: b */
    final int[] f2319b;

    /* renamed from: c */
    final ArrayList<String> f2320c;

    /* renamed from: d */
    final int[] f2321d;

    /* renamed from: e */
    final int[] f2322e;

    /* renamed from: f */
    final int f2323f;

    /* renamed from: g */
    final int f2324g;

    /* renamed from: h */
    final String f2325h;

    /* renamed from: i */
    final int f2326i;

    /* renamed from: j */
    final int f2327j;

    /* renamed from: k */
    final CharSequence f2328k;

    /* renamed from: l */
    final int f2329l;

    /* renamed from: m */
    final CharSequence f2330m;

    /* renamed from: n */
    final ArrayList<String> f2331n;

    /* renamed from: o */
    final ArrayList<String> f2332o;

    /* renamed from: p */
    final boolean f2333p;

    /* renamed from: androidx.fragment.app.b$a */
    static class C0444a implements Parcelable.Creator<C0443b> {
        C0444a() {
        }

        /* renamed from: a */
        public C0443b createFromParcel(Parcel parcel) {
            return new C0443b(parcel);
        }

        /* renamed from: b */
        public C0443b[] newArray(int i) {
            return new C0443b[i];
        }
    }

    public C0443b(Parcel parcel) {
        this.f2319b = parcel.createIntArray();
        this.f2320c = parcel.createStringArrayList();
        this.f2321d = parcel.createIntArray();
        this.f2322e = parcel.createIntArray();
        this.f2323f = parcel.readInt();
        this.f2324g = parcel.readInt();
        this.f2325h = parcel.readString();
        this.f2326i = parcel.readInt();
        this.f2327j = parcel.readInt();
        this.f2328k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2329l = parcel.readInt();
        this.f2330m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2331n = parcel.createStringArrayList();
        this.f2332o = parcel.createStringArrayList();
        this.f2333p = parcel.readInt() != 0;
    }

    public C0443b(C0442a aVar) {
        int size = aVar.f2458a.size();
        this.f2319b = new int[(size * 5)];
        if (aVar.f2465h) {
            this.f2320c = new ArrayList<>(size);
            this.f2321d = new int[size];
            this.f2322e = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                AbstractC0477n.C0478a aVar2 = aVar.f2458a.get(i);
                int i3 = i2 + 1;
                this.f2319b[i2] = aVar2.f2476a;
                ArrayList<String> arrayList = this.f2320c;
                Fragment fragment = aVar2.f2477b;
                arrayList.add(fragment != null ? fragment.f2272g : null);
                int[] iArr = this.f2319b;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f2478c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f2479d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f2480e;
                iArr[i6] = aVar2.f2481f;
                this.f2321d[i] = aVar2.f2482g.ordinal();
                this.f2322e[i] = aVar2.f2483h.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.f2323f = aVar.f2463f;
            this.f2324g = aVar.f2464g;
            this.f2325h = aVar.f2467j;
            this.f2326i = aVar.f2318u;
            this.f2327j = aVar.f2468k;
            this.f2328k = aVar.f2469l;
            this.f2329l = aVar.f2470m;
            this.f2330m = aVar.f2471n;
            this.f2331n = aVar.f2472o;
            this.f2332o = aVar.f2473p;
            this.f2333p = aVar.f2474q;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: b */
    public C0442a mo2653b(LayoutInflater$Factory2C0456j jVar) {
        C0442a aVar = new C0442a(jVar);
        int i = 0;
        int i2 = 0;
        while (i < this.f2319b.length) {
            AbstractC0477n.C0478a aVar2 = new AbstractC0477n.C0478a();
            int i3 = i + 1;
            aVar2.f2476a = this.f2319b[i];
            if (LayoutInflater$Factory2C0456j.f2366d) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.f2319b[i3]);
            }
            String str = this.f2320c.get(i2);
            aVar2.f2477b = str != null ? jVar.f2384k.get(str) : null;
            aVar2.f2482g = AbstractC0614d.EnumC0616b.values()[this.f2321d[i2]];
            aVar2.f2483h = AbstractC0614d.EnumC0616b.values()[this.f2322e[i2]];
            int[] iArr = this.f2319b;
            int i4 = i3 + 1;
            int i5 = iArr[i3];
            aVar2.f2478c = i5;
            int i6 = i4 + 1;
            int i7 = iArr[i4];
            aVar2.f2479d = i7;
            int i8 = i6 + 1;
            int i9 = iArr[i6];
            aVar2.f2480e = i9;
            int i10 = iArr[i8];
            aVar2.f2481f = i10;
            aVar.f2459b = i5;
            aVar.f2460c = i7;
            aVar.f2461d = i9;
            aVar.f2462e = i10;
            aVar.mo2870d(aVar2);
            i2++;
            i = i8 + 1;
        }
        aVar.f2463f = this.f2323f;
        aVar.f2464g = this.f2324g;
        aVar.f2467j = this.f2325h;
        aVar.f2318u = this.f2326i;
        aVar.f2465h = true;
        aVar.f2468k = this.f2327j;
        aVar.f2469l = this.f2328k;
        aVar.f2470m = this.f2329l;
        aVar.f2471n = this.f2330m;
        aVar.f2472o = this.f2331n;
        aVar.f2473p = this.f2332o;
        aVar.f2474q = this.f2333p;
        aVar.mo2638k(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f2319b);
        parcel.writeStringList(this.f2320c);
        parcel.writeIntArray(this.f2321d);
        parcel.writeIntArray(this.f2322e);
        parcel.writeInt(this.f2323f);
        parcel.writeInt(this.f2324g);
        parcel.writeString(this.f2325h);
        parcel.writeInt(this.f2326i);
        parcel.writeInt(this.f2327j);
        TextUtils.writeToParcel(this.f2328k, parcel, 0);
        parcel.writeInt(this.f2329l);
        TextUtils.writeToParcel(this.f2330m, parcel, 0);
        parcel.writeStringList(this.f2331n);
        parcel.writeStringList(this.f2332o);
        parcel.writeInt(this.f2333p ? 1 : 0);
    }
}
