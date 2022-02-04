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
    private static final C2971a f9887b = new C2972a(new String[0], null);

    /* renamed from: c */
    private final int f9888c;

    /* renamed from: d */
    private final String[] f9889d;

    /* renamed from: e */
    private Bundle f9890e;

    /* renamed from: f */
    private final CursorWindow[] f9891f;

    /* renamed from: g */
    private final int f9892g;

    /* renamed from: h */
    private final Bundle f9893h;

    /* renamed from: i */
    private int[] f9894i;

    /* renamed from: j */
    private int f9895j;

    /* renamed from: k */
    private boolean f9896k = false;

    /* renamed from: l */
    private boolean f9897l = true;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    public static class C2971a {

        /* renamed from: a */
        private final String[] f9898a;

        /* renamed from: b */
        private final ArrayList<HashMap<String, Object>> f9899b;

        /* renamed from: c */
        private final String f9900c;

        /* renamed from: d */
        private final HashMap<Object, Integer> f9901d;

        /* renamed from: e */
        private boolean f9902e;

        /* renamed from: f */
        private String f9903f;

        private C2971a(String[] strArr, String str) {
            this.f9898a = (String[]) C3027r.m12376h(strArr);
            this.f9899b = new ArrayList<>();
            this.f9900c = str;
            this.f9901d = new HashMap<>();
            this.f9902e = false;
            this.f9903f = null;
        }

        /* synthetic */ C2971a(String[] strArr, String str, C2972a aVar) {
            this(strArr, null);
        }
    }

    DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f9888c = i;
        this.f9889d = strArr;
        this.f9891f = cursorWindowArr;
        this.f9892g = i2;
        this.f9893h = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.f9896k) {
                this.f9896k = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f9891f;
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
            if (this.f9897l && this.f9891f.length > 0 && !mo9695j()) {
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
        return this.f9893h;
    }

    /* renamed from: i */
    public final int mo9694i() {
        return this.f9892g;
    }

    /* renamed from: j */
    public final boolean mo9695j() {
        boolean z;
        synchronized (this) {
            z = this.f9896k;
        }
        return z;
    }

    /* renamed from: k */
    public final void mo9696k() {
        this.f9890e = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f9889d;
            if (i2 >= strArr.length) {
                break;
            }
            this.f9890e.putInt(strArr[i2], i2);
            i2++;
        }
        this.f9894i = new int[this.f9891f.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f9891f;
            if (i < cursorWindowArr.length) {
                this.f9894i[i] = i3;
                i3 += this.f9891f[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f9895j = i3;
                return;
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3034c.m12411a(parcel);
        C3034c.m12421k(parcel, 1, this.f9889d, false);
        C3034c.m12422l(parcel, 2, this.f9891f, i, false);
        C3034c.m12417g(parcel, 3, mo9694i());
        C3034c.m12414d(parcel, 4, mo9693h(), false);
        C3034c.m12417g(parcel, 1000, this.f9888c);
        C3034c.m12412b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }
}
