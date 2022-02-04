package p171fr.bmartel.youtubetv.p173h;

/* renamed from: fr.bmartel.youtubetv.h.d */
public enum EnumC3446d {
    DEFAULT(1),
    ALWAYS(2),
    NONE(0);
    

    /* renamed from: f */
    private int f11700f;

    private EnumC3446d(int i) {
        this.f11700f = i;
    }

    /* renamed from: b */
    public static EnumC3446d m14186b(int i) {
        EnumC3446d[] values = values();
        for (EnumC3446d dVar : values) {
            if (i == dVar.mo11527a()) {
                return dVar;
            }
        }
        return DEFAULT;
    }

    /* renamed from: a */
    public int mo11527a() {
        return this.f11700f;
    }
}
