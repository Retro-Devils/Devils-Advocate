package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: com.google.android.material.internal.j */
public class C3190j extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<C3190j> CREATOR = new C3191a();

    /* renamed from: com.google.android.material.internal.j$a */
    static class C3191a implements Parcelable.ClassLoaderCreator<C3190j> {
        C3191a() {
        }

        /* renamed from: a */
        public C3190j createFromParcel(Parcel parcel) {
            return new C3190j(parcel, null);
        }

        /* renamed from: b */
        public C3190j createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new C3190j(parcel, classLoader);
        }

        /* renamed from: c */
        public C3190j[] newArray(int i) {
            return new C3190j[i];
        }
    }

    public C3190j() {
    }

    public C3190j(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = (Parcelable) valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
