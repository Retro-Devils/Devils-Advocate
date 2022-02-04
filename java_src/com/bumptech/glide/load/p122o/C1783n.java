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
    private final Object f6973b;

    /* renamed from: c */
    private final int f6974c;

    /* renamed from: d */
    private final int f6975d;

    /* renamed from: e */
    private final Class<?> f6976e;

    /* renamed from: f */
    private final Class<?> f6977f;

    /* renamed from: g */
    private final AbstractC1643g f6978g;

    /* renamed from: h */
    private final Map<Class<?>, AbstractC1651m<?>> f6979h;

    /* renamed from: i */
    private final C1647i f6980i;

    /* renamed from: j */
    private int f6981j;

    C1783n(Object obj, AbstractC1643g gVar, int i, int i2, Map<Class<?>, AbstractC1651m<?>> map, Class<?> cls, Class<?> cls2, C1647i iVar) {
        this.f6973b = C2081j.m9432d(obj);
        this.f6978g = (AbstractC1643g) C2081j.m9433e(gVar, "Signature must not be null");
        this.f6974c = i;
        this.f6975d = i2;
        this.f6979h = (Map) C2081j.m9432d(map);
        this.f6976e = (Class) C2081j.m9433e(cls, "Resource class must not be null");
        this.f6977f = (Class) C2081j.m9433e(cls2, "Transcode class must not be null");
        this.f6980i = (C1647i) C2081j.m9432d(iVar);
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
        return this.f6973b.equals(nVar.f6973b) && this.f6978g.equals(nVar.f6978g) && this.f6975d == nVar.f6975d && this.f6974c == nVar.f6974c && this.f6979h.equals(nVar.f6979h) && this.f6976e.equals(nVar.f6976e) && this.f6977f.equals(nVar.f6977f) && this.f6980i.equals(nVar.f6980i);
    }

    @Override // com.bumptech.glide.load.AbstractC1643g
    public int hashCode() {
        if (this.f6981j == 0) {
            int hashCode = this.f6973b.hashCode();
            this.f6981j = hashCode;
            int hashCode2 = (hashCode * 31) + this.f6978g.hashCode();
            this.f6981j = hashCode2;
            int i = (hashCode2 * 31) + this.f6974c;
            this.f6981j = i;
            int i2 = (i * 31) + this.f6975d;
            this.f6981j = i2;
            int hashCode3 = (i2 * 31) + this.f6979h.hashCode();
            this.f6981j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.f6976e.hashCode();
            this.f6981j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f6977f.hashCode();
            this.f6981j = hashCode5;
            this.f6981j = (hashCode5 * 31) + this.f6980i.hashCode();
        }
        return this.f6981j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f6973b + ", width=" + this.f6974c + ", height=" + this.f6975d + ", resourceClass=" + this.f6976e + ", transcodeClass=" + this.f6977f + ", signature=" + this.f6978g + ", hashCode=" + this.f6981j + ", transformations=" + this.f6979h + ", options=" + this.f6980i + '}';
    }
}
