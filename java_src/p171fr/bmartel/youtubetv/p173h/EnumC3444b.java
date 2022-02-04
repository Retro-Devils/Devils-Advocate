package p171fr.bmartel.youtubetv.p173h;

/* renamed from: fr.bmartel.youtubetv.h.b */
public enum EnumC3444b {
    DEFAULT(0, ""),
    CHROME_IPHONE(1, "Mozilla/5.0 (iPhone; CPU iPhone OS 6_1_4 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10B350 Safari/8536.25"),
    CHROME_IPAD(2, "Mozilla/5.0 (iPad; CPU OS 7_0 like Mac OS X) AppleWebKit/537.51.1 (KHTML, like Gecko) CriOS/30.0.1599.12 Mobile/11A465 Safari/8536.25"),
    CHROME_DESKTOP(3, "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2049.0 Safari/537.36"),
    CHROME_MOBILE_DESKTOP(4, "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.57 Safari/537.36");
    

    /* renamed from: h */
    private String f11680h;

    /* renamed from: i */
    private int f11681i;

    private EnumC3444b(int i, String str) {
        this.f11681i = i;
        this.f11680h = str;
    }

    /* renamed from: b */
    public static EnumC3444b m14181b(int i) {
        EnumC3444b[] values = values();
        for (EnumC3444b bVar : values) {
            if (i == bVar.mo11524a()) {
                return bVar;
            }
        }
        return DEFAULT;
    }

    /* renamed from: a */
    public int mo11524a() {
        return this.f11681i;
    }

    /* renamed from: c */
    public String mo11525c() {
        return this.f11680h;
    }
}
