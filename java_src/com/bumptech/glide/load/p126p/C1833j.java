package com.bumptech.glide.load.p126p;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.p.j */
public final class C1833j implements AbstractC1830h {

    /* renamed from: c */
    private final Map<String, List<AbstractC1832i>> f7062c;

    /* renamed from: d */
    private volatile Map<String, String> f7063d;

    /* renamed from: com.bumptech.glide.load.p.j$a */
    public static final class C1834a {

        /* renamed from: a */
        private static final String f7064a;

        /* renamed from: b */
        private static final Map<String, List<AbstractC1832i>> f7065b;

        /* renamed from: c */
        private boolean f7066c = true;

        /* renamed from: d */
        private Map<String, List<AbstractC1832i>> f7067d = f7065b;

        /* renamed from: e */
        private boolean f7068e = true;

        static {
            String b = m8486b();
            f7064a = b;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("User-Agent", Collections.singletonList(new C1835b(b)));
            }
            f7065b = Collections.unmodifiableMap(hashMap);
        }

        /* renamed from: b */
        static String m8486b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    charAt = '?';
                }
                sb.append(charAt);
            }
            return sb.toString();
        }

        /* renamed from: a */
        public C1833j mo7431a() {
            this.f7066c = true;
            return new C1833j(this.f7067d);
        }
    }

    /* renamed from: com.bumptech.glide.load.p.j$b */
    static final class C1835b implements AbstractC1832i {

        /* renamed from: a */
        private final String f7069a;

        C1835b(String str) {
            this.f7069a = str;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1832i
        /* renamed from: a */
        public String mo7427a() {
            return this.f7069a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C1835b) {
                return this.f7069a.equals(((C1835b) obj).f7069a);
            }
            return false;
        }

        public int hashCode() {
            return this.f7069a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f7069a + '\'' + '}';
        }
    }

    C1833j(Map<String, List<AbstractC1832i>> map) {
        this.f7062c = Collections.unmodifiableMap(map);
    }

    /* renamed from: b */
    private String m8483b(List<AbstractC1832i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = list.get(i).mo7427a();
            if (!TextUtils.isEmpty(a)) {
                sb.append(a);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    private Map<String, String> m8484c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<AbstractC1832i>> entry : this.f7062c.entrySet()) {
            String b = m8483b(entry.getValue());
            if (!TextUtils.isEmpty(b)) {
                hashMap.put(entry.getKey(), b);
            }
        }
        return hashMap;
    }

    @Override // com.bumptech.glide.load.p126p.AbstractC1830h
    /* renamed from: a */
    public Map<String, String> mo7426a() {
        if (this.f7063d == null) {
            synchronized (this) {
                if (this.f7063d == null) {
                    this.f7063d = Collections.unmodifiableMap(m8484c());
                }
            }
        }
        return this.f7063d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1833j) {
            return this.f7062c.equals(((C1833j) obj).f7062c);
        }
        return false;
    }

    public int hashCode() {
        return this.f7062c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f7062c + '}';
    }
}
