package p171fr.bmartel.youtubetv.p173h;

/* renamed from: fr.bmartel.youtubetv.h.f */
public enum EnumC3448f {
    AUTO(0, "auto"),
    TINY(1, "tiny"),
    SMALL(2, "small"),
    MEDIUM(3, "medium"),
    LARGE(4, "large"),
    HD_720(5, "hd720"),
    HD_1080(6, "hd1080"),
    HIGH_RES(7, "highres"),
    HD_1440(8, "hd1440"),
    HD_2160(9, "hd2160");
    

    /* renamed from: m */
    private String f11716m;

    /* renamed from: n */
    private int f11717n;

    private EnumC3448f(int i, String str) {
        this.f11717n = i;
        this.f11716m = str;
    }

    /* renamed from: c */
    public static EnumC3448f m14188c(int i) {
        EnumC3448f[] values = values();
        for (EnumC3448f fVar : values) {
            if (i == fVar.mo11528a()) {
                return fVar;
            }
        }
        return AUTO;
    }

    /* renamed from: d */
    public static EnumC3448f m14189d(String str) {
        EnumC3448f[] values = values();
        for (EnumC3448f fVar : values) {
            if (str.equals(fVar.mo11529b())) {
                return fVar;
            }
        }
        return AUTO;
    }

    /* renamed from: a */
    public int mo11528a() {
        return this.f11717n;
    }

    /* renamed from: b */
    public String mo11529b() {
        return this.f11716m;
    }
}
