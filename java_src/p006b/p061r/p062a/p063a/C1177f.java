package p006b.p061r.p062a.p063a;

import android.content.ContentValues;
import android.os.Build;
import p006b.p061r.p062a.p063a.AbstractC1169a;

/* renamed from: b.r.a.a.f */
public final class C1177f extends AbstractC1169a {

    /* renamed from: d */
    public static final String[] f5221d = m6420a();

    /* renamed from: b.r.a.a.f$a */
    public static final class C1178a extends AbstractC1169a.AbstractC1170a<C1178a> {
        /* renamed from: h */
        public C1177f mo5904h() {
            return new C1177f(this);
        }

        /* renamed from: i */
        public C1178a mo5905i(long j) {
            this.f5217a.put("channel_id", Long.valueOf(j));
            return this;
        }

        /* renamed from: j */
        public C1178a mo5906j(int i) {
            this.f5217a.put("weight", Integer.valueOf(i));
            return this;
        }
    }

    C1177f(C1178a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    private static String[] m6420a() {
        return (String[]) C1176e.m6419a(AbstractC1169a.f5213c, new String[]{"channel_id", "weight"});
    }

    @Override // p006b.p061r.p062a.p063a.AbstractC1171b
    /* renamed from: b */
    public ContentValues mo5887b() {
        return mo5882c(false);
    }

    @Override // p006b.p061r.p062a.p063a.AbstractC1169a
    /* renamed from: c */
    public ContentValues mo5882c(boolean z) {
        ContentValues c = super.mo5882c(z);
        if (Build.VERSION.SDK_INT < 26) {
            c.remove("channel_id");
            c.remove("weight");
        }
        return c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1177f)) {
            return false;
        }
        return this.f5216b.equals(((C1177f) obj).f5216b);
    }

    public String toString() {
        return "PreviewProgram{" + this.f5216b.toString() + "}";
    }
}
