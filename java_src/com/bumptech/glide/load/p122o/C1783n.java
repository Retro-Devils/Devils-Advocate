package com.bumptech.glide.load.p122o;

import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.AbstractC1651m;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.p144t.C2081j;
import java.security.MessageDigest;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.n */
public class C1783n implements AbstractC1643g {

    /* renamed from: b */
    private final Object f6965b;

    /* renamed from: c */
    private final int f6966c;

    /* renamed from: d */
    private final int f6967d;

    /* renamed from: e */
    private final Class<?> f6968e;

    /* renamed from: f */
    private final Class<?> f6969f;

    /* renamed from: g */
    private final AbstractC1643g f6970g;

    /* renamed from: h */
    private final Map<Class<?>, AbstractC1651m<?>> f6971h;

    /* renamed from: i */
    private final C1647i f6972i;

    /* renamed from: j */
    private int f6973j;

    C1783n(Object obj, AbstractC1643g gVar, int i, int i2, Map<Class<?>, AbstractC1651m<?>> map, Class<?> cls, Class<?> cls2, C1647i iVar) {
        this.f6965b = C2081j.m9432d(obj);
        this.f6970g = (AbstractC1643g) C2081j.m9433e(gVar, "Signature must not be null");
        this.f6966c = i;
        this.f6967d = i2;
        this.f6971h = (Map) C2081j.m9432d(map);
        this.f6968e = (Class) C2081j.m9433e(cls, "Resource class must not be null");
        this.f6969f = (Class) C2081j.m9433e(cls2, "Transcode class must not be null");
        this.f6972i = (C1647i) C2081j.m9432d(iVar);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    /* renamed from: a */
    public void mo7075a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public boolean equals(Object obj) {
        if (!(obj instanceof C1783n)) {
            return false;
        }
        C1783n nVar = (C1783n) obj;
        return this.f6965b.equals(nVar.f6965b) && this.f6970g.equals(nVar.f6970g) && this.f6967d == nVar.f6967d && this.f6966c == nVar.f6966c && this.f6971h.equals(nVar.f6971h) && this.f6968e.equals(nVar.f6968e) && this.f6969f.equals(nVar.f6969f) && this.f6972i.equals(nVar.f6972i);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public int hashCode() {
        if (this.f6973j == 0) {
            int hashCode = this.f6965b.hashCode();
            this.f6973j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f6970g.hashCode();
            this.f6973j = hashCode2;
            int i = (hashCode2 * 31) + this.f6966c;
            this.f6973j = i;
            int i2 = (i * 31) + this.f6967d;
            this.f6973j = i2;
            int hashCode3 = (i2 * 31) + this.f6971h.hashCode();
            this.f6973j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f6968e.hashCode();
            this.f6973j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f6969f.hashCode();
            this.f6973j = hashCode5;
            this.f6973j = (hashCode5 * 31) + this.f6972i.hashCode();
        }
        return this.f6973j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f6965b + ", width=" + this.f6966c + ", height=" + this.f6967d + ", resourceClass=" + this.f6968e + ", transcodeClass=" + this.f6969f + ", signature=" + this.f6970g + ", hashCode=" + this.f6973j + ", transformations=" + this.f6971h + ", options=" + this.f6972i + '}';
    }
}
