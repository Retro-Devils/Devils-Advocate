package com.bumptech.glide.load.p128q.p131f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.C0378a;
import androidx.core.content.p005c.C0390f;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p007a.p014o.C0788d;

/* renamed from: com.bumptech.glide.load.q.f.a */
public final class C1955a {

    /* renamed from: a */
    private static volatile boolean f7258a = true;

    /* renamed from: a */
    public static Drawable m8847a(Context context, int i, Resources.Theme theme) {
        return m8849c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m8848b(Context context, Context context2, int i) {
        return m8849c(context, context2, i, null);
    }

    /* renamed from: c */
    private static Drawable m8849c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f7258a) {
                return m8851e(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f7258a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C0378a.m1874d(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m8850d(context2, i, theme);
    }

    /* renamed from: d */
    private static Drawable m8850d(Context context, int i, Resources.Theme theme) {
        return C0390f.m1923a(context.getResources(), i, theme);
    }

    /* renamed from: e */
    private static Drawable m8851e(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new C0788d(context, theme);
        }
        return C0764a.m4517d(context, i);
    }
}
