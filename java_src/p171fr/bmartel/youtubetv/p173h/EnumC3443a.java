package p171fr.bmartel.youtubetv.p173h;

/* renamed from: fr.bmartel.youtubetv.h.a */
public enum EnumC3443a {
    DEFAULT(0, "default"),
    HQ_DEFAULT(1, "hqdefault"),
    MQ_DEFAULT(2, "mqdefault"),
    SD_DEFAULT(3, "sddefault"),
    MAXRES_DEFAULT(4, "maxresdefault");
    

    /* renamed from: h */
    private String f11681h;

    /* renamed from: i */
    private int f11682i;

    private EnumC3443a(int i, String str) {
        this.f11682i = i;
        this.f11681h = str;
    }

    /* renamed from: b */
    public static EnumC3443a m14178b(int i) {
        EnumC3443a[] values = values();
        for (EnumC3443a aVar : values) {
            if (i == aVar.mo11522a()) {
                return aVar;
            }
        }
        return DEFAULT;
    }

    /* renamed from: a */
    public int mo11522a() {
        return this.f11682i;
    }

    /* renamed from: c */
    public String mo11523c() {
        return this.f11681h;
    }
}
