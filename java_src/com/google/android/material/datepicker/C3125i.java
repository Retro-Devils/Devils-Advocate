package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.i */
public final class C3125i implements Comparable<C3125i>, Parcelable {
    public static final Parcelable.Creator<C3125i> CREATOR = new C3126a();

    /* renamed from: b */
    private final Calendar f10444b;

    /* renamed from: c */
    private final String f10445c;

    /* renamed from: d */
    final int f10446d;

    /* renamed from: e */
    final int f10447e;

    /* renamed from: f */
    final int f10448f;

    /* renamed from: g */
    final int f10449g;

    /* renamed from: h */
    final long f10450h;

    /* renamed from: com.google.android.material.datepicker.i$a */
    static class C3126a implements Parcelable.Creator<C3125i> {
        C3126a() {
        }

        /* renamed from: a */
        public C3125i createFromParcel(Parcel parcel) {
            return C3125i.m13034g(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public C3125i[] newArray(int i) {
            return new C3125i[i];
        }
    }

    private C3125i(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d = C3136p.m13074d(calendar);
        this.f10444b = d;
        this.f10446d = d.get(2);
        this.f10447e = d.get(1);
        this.f10448f = d.getMaximum(7);
        this.f10449g = d.getActualMaximum(5);
        this.f10445c = C3136p.m13085o().format(d.getTime());
        this.f10450h = d.getTimeInMillis();
    }

    /* renamed from: g */
    static C3125i m13034g(int i, int i2) {
        Calendar l = C3136p.m13082l();
        l.set(1, i);
        l.set(2, i2);
        return new C3125i(l);
    }

    /* renamed from: h */
    static C3125i m13035h() {
        return new C3125i(C3136p.m13080j());
    }

    /* renamed from: b */
    public int compareTo(C3125i iVar) {
        return this.f10444b.compareTo(iVar.f10444b);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3125i)) {
            return false;
        }
        C3125i iVar = (C3125i) obj;
        return this.f10446d == iVar.f10446d && this.f10447e == iVar.f10447e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10446d), Integer.valueOf(this.f10447e)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo10436i() {
        int firstDayOfWeek = this.f10444b.get(7) - this.f10444b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f10448f : firstDayOfWeek;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public long mo10437j(int i) {
        Calendar d = C3136p.m13074d(this.f10444b);
        d.set(5, i);
        return d.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo10438k() {
        return this.f10445c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public long mo10439l() {
        return this.f10444b.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public C3125i mo10440m(int i) {
        Calendar d = C3136p.m13074d(this.f10444b);
        d.add(2, i);
        return new C3125i(d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo10441n(C3125i iVar) {
        if (this.f10444b instanceof GregorianCalendar) {
            return ((iVar.f10447e - this.f10447e) * 12) + (iVar.f10446d - this.f10446d);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f10447e);
        parcel.writeInt(this.f10446d);
    }
}
