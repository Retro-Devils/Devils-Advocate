package p171fr.bmartel.youtubetv.p173h;

/* renamed from: fr.bmartel.youtubetv.h.g */
public enum EnumC3449g {
    UNSTARTED(-1),
    ENDED(0),
    PLAYING(1),
    PAUSED(2),
    BUFFERING(3),
    VIDEO_CUED(5);
    

    /* renamed from: i */
    private int f11725i;

    private EnumC3449g(int i) {
        this.f11725i = i;
    }

    /* renamed from: b */
    public static EnumC3449g m14192b(int i) {
        EnumC3449g[] values = values();
        for (EnumC3449g gVar : values) {
            if (i == gVar.mo11530a()) {
                return gVar;
            }
        }
        return UNSTARTED;
    }

    /* renamed from: a */
    public int mo11530a() {
        return this.f11725i;
    }
}
