package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.a */
public final class C3103a implements Parcelable {
    public static final Parcelable.Creator<C3103a> CREATOR = new C3104a();

    /* renamed from: b */
    private final C3125i f10374b;

    /* renamed from: c */
    private final C3125i f10375c;

    /* renamed from: d */
    private final C3125i f10376d;

    /* renamed from: e */
    private final AbstractC3105b f10377e;

    /* renamed from: f */
    private final int f10378f;

    /* renamed from: g */
    private final int f10379g;

    /* renamed from: com.google.android.material.datepicker.a$a */
    static class C3104a implements Parcelable.Creator<C3103a> {
        C3104a() {
        }

        /* renamed from: a */
        public C3103a createFromParcel(Parcel parcel) {
            return new C3103a((C3125i) parcel.readParcelable(C3125i.class.getClassLoader()), (C3125i) parcel.readParcelable(C3125i.class.getClassLoader()), (C3125i) parcel.readParcelable(C3125i.class.getClassLoader()), (AbstractC3105b) parcel.readParcelable(AbstractC3105b.class.getClassLoader()), null);
        }

        /* renamed from: b */
        public C3103a[] newArray(int i) {
            return new C3103a[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.a$b */
    public interface AbstractC3105b extends Parcelable {
        /* renamed from: d */
        boolean mo10405d(long j);
    }

    private C3103a(C3125i iVar, C3125i iVar2, C3125i iVar3, AbstractC3105b bVar) {
        this.f10374b = iVar;
        this.f10375c = iVar2;
        this.f10376d = iVar3;
        this.f10377e = bVar;
        if (iVar.compareTo(iVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (iVar3.compareTo(iVar2) <= 0) {
            this.f10379g = iVar.mo10441n(iVar2) + 1;
            this.f10378f = (iVar2.f10439e - iVar.f10439e) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    /* synthetic */ C3103a(C3125i iVar, C3125i iVar2, C3125i iVar3, AbstractC3105b bVar, C3104a aVar) {
        this(iVar, iVar2, iVar3, bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C3125i mo10390b(C3125i iVar) {
        return iVar.compareTo(this.f10374b) < 0 ? this.f10374b : iVar.compareTo(this.f10375c) > 0 ? this.f10375c : iVar;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3103a)) {
            return false;
        }
        C3103a aVar = (C3103a) obj;
        return this.f10374b.equals(aVar.f10374b) && this.f10375c.equals(aVar.f10375c) && this.f10376d.equals(aVar.f10376d) && this.f10377e.equals(aVar.f10377e);
    }

    /* renamed from: g */
    public AbstractC3105b mo10393g() {
        return this.f10377e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C3125i mo10394h() {
        return this.f10375c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10374b, this.f10375c, this.f10376d, this.f10377e});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo10396i() {
        return this.f10379g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C3125i mo10397j() {
        return this.f10376d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C3125i mo10398k() {
        return this.f10374b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo10399l() {
        return this.f10378f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f10374b, 0);
        parcel.writeParcelable(this.f10375c, 0);
        parcel.writeParcelable(this.f10376d, 0);
        parcel.writeParcelable(this.f10377e, 0);
    }
}
