package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C3027r;
import com.google.android.gms.common.internal.p147v.AbstractC3031a;
import com.google.android.gms.common.internal.p147v.C3034c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
public final class DataHolder extends AbstractC3031a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new C2973b();

    /* renamed from: b */
    private static final C2971a f9895b = new C2972a(new String[0], null);

    /* renamed from: c */
    private final int f9896c;

    /* renamed from: d */
    private final String[] f9897d;

    /* renamed from: e */
    private Bundle f9898e;

    /* renamed from: f */
    private final CursorWindow[] f9899f;

    /* renamed from: g */
    private final int f9900g;

    /* renamed from: h */
    private final Bundle f9901h;

    /* renamed from: i */
    private int[] f9902i;

    /* renamed from: j */
    private int f9903j;

    /* renamed from: k */
    private boolean f9904k = false;

    /* renamed from: l */
    private boolean f9905l = true;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C2971a {

        /* renamed from: a */
        private final String[] f9906a;

        /* renamed from: b */
        private final ArrayList<HashMap<String, Object>> f9907b;

        /* renamed from: c */
        private final String f9908c;

        /* renamed from: d */
        private final HashMap<Object, Integer> f9909d;

        /* renamed from: e */
        private boolean f9910e;

        /* renamed from: f */
        private String f9911f;

        private C2971a(String[] strArr, String str) {
            this.f9906a = (String[]) C3027r.m12376h(strArr);
            this.f9907b = new ArrayList<>();
            this.f9908c = str;
            this.f9909d = new HashMap<>();
            this.f9910e = false;
            this.f9911f = null;
        }

        /* synthetic */ C2971a(String[] strArr, String str, C2972a aVar) {
            this(strArr, null);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f9896c = i;
        this.f9897d = strArr;
        this.f9899f = cursorWindowArr;
        this.f9900g = i2;
        this.f9901h = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.f9904k) {
                this.f9904k = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f9899f;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public final void finalize() {
        try {
            if (this.f9905l && this.f9899f.length > 0 && !mo9695j()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: h */
    public final Bundle mo9693h() {
        return this.f9901h;
    }

    /* renamed from: i */
    public final int mo9694i() {
        return this.f9900g;
    }

    /* renamed from: j */
    public final boolean mo9695j() {
        boolean z;
        synchronized (this) {
            z = this.f9904k;
        }
        return z;
    }

    /* renamed from: k */
    public final void mo9696k() {
        this.f9898e = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f9897d;
            if (i2 >= strArr.length) {
                break;
            }
            this.f9898e.putInt(strArr[i2], i2);
            i2++;
        }
        this.f9902i = new int[this.f9899f.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f9899f;
            if (i < cursorWindowArr.length) {
                this.f9902i[i] = i3;
                i3 += this.f9899f[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f9903j = i3;
                return;
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12421k(parcel, 1, this.f9897d, false);
        C3034c.m12422l(parcel, 2, this.f9899f, i, false);
        C3034c.m12417g(parcel, 3, mo9694i());
        C3034c.m12414d(parcel, 4, mo9693h(), false);
        C3034c.m12417g(parcel, 1000, this.f9896c);
        C3034c.m12412b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }
}
