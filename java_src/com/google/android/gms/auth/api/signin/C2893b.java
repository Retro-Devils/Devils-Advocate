package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.p147v.C3032b;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.b */
public final class C2893b implements Parcelable.Creator<GoogleSignInAccount> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int q = C3032b.m12409q(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < q) {
            int k = C3032b.m12403k(parcel);
            switch (C3032b.m12401i(k)) {
                case 1:
                    i = C3032b.m12405m(parcel, k);
                    break;
                case 2:
                    str = C3032b.m12396d(parcel, k);
                    break;
                case 3:
                    str2 = C3032b.m12396d(parcel, k);
                    break;
                case 4:
                    str3 = C3032b.m12396d(parcel, k);
                    break;
                case 5:
                    str4 = C3032b.m12396d(parcel, k);
                    break;
                case 6:
                    uri = (Uri) C3032b.m12395c(parcel, k, Uri.CREATOR);
                    break;
                case 7:
                    str5 = C3032b.m12396d(parcel, k);
                    break;
                case 8:
                    j = C3032b.m12406n(parcel, k);
                    break;
                case 9:
                    str6 = C3032b.m12396d(parcel, k);
                    break;
                case 10:
                    arrayList = C3032b.m12399g(parcel, k, Scope.CREATOR);
                    break;
                case 11:
                    str7 = C3032b.m12396d(parcel, k);
                    break;
                case 12:
                    str8 = C3032b.m12396d(parcel, k);
                    break;
                default:
                    C3032b.m12408p(parcel, k);
                    break;
            }
        }
        C3032b.m12400h(parcel, q);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
