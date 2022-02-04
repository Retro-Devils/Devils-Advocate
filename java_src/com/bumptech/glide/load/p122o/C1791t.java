package com.bumptech.glide.load.p122o;

import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p120n.AbstractC1657e;
import com.bumptech.glide.load.p122o.C1761i;
import com.bumptech.glide.p144t.C2081j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p006b.p030g.p038j.AbstractC0958f;

/* renamed from: com.bumptech.glide.load.o.t */
public class C1791t<Data, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<Data> f6992a;

    /* renamed from: b */
    private final AbstractC0958f<List<Throwable>> f6993b;

    /* renamed from: c */
    private final List<? extends C1761i<Data, ResourceType, Transcode>> f6994c;

    /* renamed from: d */
    private final String f6995d;

    public C1791t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<C1761i<Data, ResourceType, Transcode>> list, AbstractC0958f<List<Throwable>> fVar) {
        this.f6992a = cls;
        this.f6993b = fVar;
        this.f6994c = (List) C2081j.m9431c(list);
        this.f6995d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private AbstractC1794v<Transcode> m8362b(AbstractC1657e<Data> eVar, C1647i iVar, int i, int i2, C1761i.AbstractC1762a<ResourceType> aVar, List<Throwable> list) {
        int size = this.f6994c.size();
        AbstractC1794v<Transcode> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                vVar = ((C1761i) this.f6994c.get(i3)).mo7313a(eVar, i, i2, iVar, aVar);
            } catch (C1787q e) {
                list.add(e);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new C1787q(this.f6995d, new ArrayList(list));
    }

    /* renamed from: a */
    public AbstractC1794v<Transcode> mo7383a(AbstractC1657e<Data> eVar, C1647i iVar, int i, int i2, C1761i.AbstractC1762a<ResourceType> aVar) {
        List<Throwable> list = (List) C2081j.m9432d(this.f6993b.mo5399b());
        try {
            return m8362b(eVar, iVar, i, i2, aVar, list);
        } finally {
            this.f6993b.mo5398a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f6994c.toArray()) + '}';
    }
}
