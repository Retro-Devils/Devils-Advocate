package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.p */
public final class C3022p {

    /* renamed from: com.google.android.gms.common.internal.p$a */
    public static final class C3023a {

        /* renamed from: a */
        private final List<String> f10023a;

        /* renamed from: b */
        private final Object f10024b;

        private C3023a(Object obj) {
            this.f10024b = C3027r.m12376h(obj);
            this.f10023a = new ArrayList();
        }

        /* renamed from: a */
        public final C3023a mo9802a(String str, Object obj) {
            List<String> list = this.f10023a;
            String str2 = (String) C3027r.m12376h(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + valueOf.length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f10024b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f10023a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f10023a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m12361a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: b */
    public static int m12362b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static C3023a m12363c(Object obj) {
        return new C3023a(obj);
    }
}
