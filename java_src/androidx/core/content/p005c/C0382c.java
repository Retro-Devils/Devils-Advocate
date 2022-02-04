package androidx.core.content.p005c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p030g.C0900c;
import p006b.p030g.p036h.C0922a;

/* renamed from: androidx.core.content.c.c */
public class C0382c {

    /* renamed from: androidx.core.content.c.c$a */
    public interface AbstractC0383a {
    }

    /* renamed from: androidx.core.content.c.c$b */
    public static final class C0384b implements AbstractC0383a {

        /* renamed from: a */
        private final C0385c[] f2066a;

        public C0384b(C0385c[] cVarArr) {
            this.f2066a = cVarArr;
        }

        /* renamed from: a */
        public C0385c[] mo2229a() {
            return this.f2066a;
        }
    }

    /* renamed from: androidx.core.content.c.c$c */
    public static final class C0385c {

        /* renamed from: a */
        private final String f2067a;

        /* renamed from: b */
        private int f2068b;

        /* renamed from: c */
        private boolean f2069c;

        /* renamed from: d */
        private String f2070d;

        /* renamed from: e */
        private int f2071e;

        /* renamed from: f */
        private int f2072f;

        public C0385c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f2067a = str;
            this.f2068b = i;
            this.f2069c = z;
            this.f2070d = str2;
            this.f2071e = i2;
            this.f2072f = i3;
        }

        /* renamed from: a */
        public String mo2230a() {
            return this.f2067a;
        }

        /* renamed from: b */
        public int mo2231b() {
            return this.f2072f;
        }

        /* renamed from: c */
        public int mo2232c() {
            return this.f2071e;
        }

        /* renamed from: d */
        public String mo2233d() {
            return this.f2070d;
        }

        /* renamed from: e */
        public int mo2234e() {
            return this.f2068b;
        }

        /* renamed from: f */
        public boolean mo2235f() {
            return this.f2069c;
        }
    }

    /* renamed from: androidx.core.content.c.c$d */
    public static final class C0386d implements AbstractC0383a {

        /* renamed from: a */
        private final C0922a f2073a;

        /* renamed from: b */
        private final int f2074b;

        /* renamed from: c */
        private final int f2075c;

        public C0386d(C0922a aVar, int i, int i2) {
            this.f2073a = aVar;
            this.f2075c = i;
            this.f2074b = i2;
        }

        /* renamed from: a */
        public int mo2236a() {
            return this.f2075c;
        }

        /* renamed from: b */
        public C0922a mo2237b() {
            return this.f2073a;
        }

        /* renamed from: c */
        public int mo2238c() {
            return this.f2074b;
        }
    }

    /* renamed from: a */
    private static int m1898a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: b */
    public static AbstractC0383a m1899b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m1901d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m1900c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m1898a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m1905h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m1905h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static AbstractC0383a m1901d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m1902e(xmlPullParser, resources);
        }
        m1904g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static AbstractC0383a m1902e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0900c.f4505e);
        String string = obtainAttributes.getString(C0900c.f4506f);
        String string2 = obtainAttributes.getString(C0900c.f4510j);
        String string3 = obtainAttributes.getString(C0900c.f4511k);
        int resourceId = obtainAttributes.getResourceId(C0900c.f4507g, 0);
        int integer = obtainAttributes.getInteger(C0900c.f4508h, 1);
        int integer2 = obtainAttributes.getInteger(C0900c.f4509i, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m1903f(xmlPullParser, resources));
                    } else {
                        m1904g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0384b((C0385c[]) arrayList.toArray(new C0385c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m1904g(xmlPullParser);
        }
        return new C0386d(new C0922a(string, string2, string3, m1900c(resources, resourceId)), integer, integer2);
    }

    /* renamed from: f */
    private static C0385c m1903f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0900c.f4512l);
        int i = C0900c.f4521u;
        if (!obtainAttributes.hasValue(i)) {
            i = C0900c.f4514n;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = C0900c.f4519s;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C0900c.f4515o;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = C0900c.f4522v;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C0900c.f4516p;
        }
        int i5 = C0900c.f4520t;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C0900c.f4517q;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C0900c.f4518r;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C0900c.f4513m;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m1904g(xmlPullParser);
        }
        return new C0385c(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    private static void m1904g(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m1905h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
