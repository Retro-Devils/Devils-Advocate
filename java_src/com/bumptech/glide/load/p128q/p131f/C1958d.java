package com.bumptech.glide.load.p128q.p131f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.AbstractC1649k;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import java.util.List;

/* renamed from: com.bumptech.glide.load.q.f.d */
public class C1958d implements AbstractC1649k<Uri, Drawable> {

    /* renamed from: a */
    private final Context f7268a;

    public C1958d(Context context) {
        this.f7268a = context.getApplicationContext();
    }

    /* renamed from: d */
    private Context m8859d(Uri uri, String str) {
        if (str.equals(this.f7268a.getPackageName())) {
            return this.f7268a;
        }
        try {
            return this.f7268a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.f7268a.getPackageName())) {
                return this.f7268a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    /* renamed from: e */
    private int m8860e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    /* renamed from: f */
    private int m8861f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    /* renamed from: g */
    private int m8862g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return m8861f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return m8860e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: c */
    public AbstractC1794v<Drawable> mo7088a(Uri uri, int i, int i2, C1647i iVar) {
        Context d = m8859d(uri, uri.getAuthority());
        return C1957c.m8855g(C1955a.m8848b(this.f7268a, d, m8862g(d, uri)));
    }

    /* renamed from: h */
    public boolean mo7089b(Uri uri, C1647i iVar) {
        return uri.getScheme().equals("android.resource");
    }
}
