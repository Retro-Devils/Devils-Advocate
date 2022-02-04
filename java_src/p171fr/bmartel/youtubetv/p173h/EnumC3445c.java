package p171fr.bmartel.youtubetv.p173h;

/* renamed from: fr.bmartel.youtubetv.h.c */
public enum EnumC3445c {
    DEFAULT(2),
    DISPLAY_AUTO(1),
    ALWAYS_VISIBLE(0);
    

    /* renamed from: f */
    private int f11686f;

    private EnumC3445c(int i) {
        this.f11686f = i;
    }

    /* renamed from: b */
    public static EnumC3445c m14184b(int i) {
        EnumC3445c[] values = values();
        for (EnumC3445c cVar : values) {
            if (i == cVar.mo11526a()) {
                return cVar;
            }
        }
        return DEFAULT;
    }

    /* renamed from: a */
    public int mo11526a() {
        return this.f11686f;
    }
}
