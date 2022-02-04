package p069c.p070a.p071a.p072w;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import p069c.p070a.p071a.AbstractC1222b;
import p069c.p070a.p071a.C1232g;
import p069c.p070a.p071a.C1236k;
import p069c.p070a.p071a.C1253v;

/* renamed from: c.a.a.w.g */
public class C1266g {
    /* renamed from: a */
    static String m6718a(long j) {
        return m6719b().format(new Date(j));
    }

    /* renamed from: b */
    private static SimpleDateFormat m6719b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: c */
    public static AbstractC1222b.C1223a m6720c(C1236k kVar) {
        long j;
        long j2;
        boolean z;
        long j3;
        long j4;
        long j5;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = kVar.f5437c;
        String str = map.get("Date");
        long f = str != null ? m6723f(str) : 0;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            int i2 = 0;
            j2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            z = false;
            j2 = 0;
            j = 0;
        }
        String str3 = map.get("Expires");
        long f2 = str3 != null ? m6723f(str3) : 0;
        String str4 = map.get("Last-Modified");
        long f3 = str4 != null ? m6723f(str4) : 0;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i != 0) {
                j5 = j4;
            } else {
                Long.signum(j);
                j5 = (j * 1000) + j4;
            }
            j3 = j5;
        } else {
            j3 = 0;
            if (f <= 0 || f2 < f) {
                j4 = 0;
            } else {
                j4 = currentTimeMillis + (f2 - f);
                j3 = j4;
            }
        }
        AbstractC1222b.C1223a aVar = new AbstractC1222b.C1223a();
        aVar.f5399a = kVar.f5436b;
        aVar.f5400b = str5;
        aVar.f5404f = j4;
        aVar.f5403e = j3;
        aVar.f5401c = f;
        aVar.f5402d = f3;
        aVar.f5405g = map;
        aVar.f5406h = kVar.f5438d;
        return aVar;
    }

    /* renamed from: d */
    public static String m6721d(Map<String, String> map) {
        return m6722e(map, "ISO-8859-1");
    }

    /* renamed from: e */
    public static String m6722e(Map<String, String> map, String str) {
        String str2 = map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    /* renamed from: f */
    public static long m6723f(String str) {
        try {
            return m6719b().parse(str).getTime();
        } catch (ParseException e) {
            C1253v.m6668d(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: g */
    static List<C1232g> m6724g(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new C1232g(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: h */
    static Map<String, String> m6725h(List<C1232g> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C1232g gVar : list) {
            treeMap.put(gVar.mo6169a(), gVar.mo6170b());
        }
        return treeMap;
    }
}
