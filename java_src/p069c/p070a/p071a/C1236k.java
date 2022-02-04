package p069c.p070a.p071a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: c.a.a.k */
public class C1236k {

    /* renamed from: a */
    public final int f5442a;

    /* renamed from: b */
    public final byte[] f5443b;

    /* renamed from: c */
    public final Map<String, String> f5444c;

    /* renamed from: d */
    public final List<C1232g> f5445d;

    /* renamed from: e */
    public final boolean f5446e;

    /* renamed from: f */
    public final long f5447f;

    private C1236k(int i, byte[] bArr, Map<String, String> map, List<C1232g> list, boolean z, long j) {
        this.f5442a = i;
        this.f5443b = bArr;
        this.f5444c = map;
        this.f5445d = list == null ? null : Collections.unmodifiableList(list);
        this.f5446e = z;
        this.f5447f = j;
    }

    @Deprecated
    public C1236k(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, m6603a(map), z, j);
    }

    public C1236k(int i, byte[] bArr, boolean z, long j, List<C1232g> list) {
        this(i, bArr, m6604b(list), list, z, j);
    }

    @Deprecated
    public C1236k(byte[] bArr, Map<String, String> map) {
        this(200, bArr, map, false, 0L);
    }

    /* renamed from: a */
    private static List<C1232g> m6603a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new C1232g(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: b */
    private static Map<String, String> m6604b(List<C1232g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C1232g gVar : list) {
            treeMap.put(gVar.mo6169a(), gVar.mo6170b());
        }
        return treeMap;
    }
}
