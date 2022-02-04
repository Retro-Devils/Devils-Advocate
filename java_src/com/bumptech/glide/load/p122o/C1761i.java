package com.bumptech.glide.load.p122o;

import android.util.Log;
import com.bumptech.glide.load.AbstractC1649k;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.p120n.AbstractC1657e;
import com.bumptech.glide.load.p128q.p134i.AbstractC1983e;
import com.bumptech.glide.p144t.C2081j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p006b.p030g.p038j.AbstractC0958f;

/* renamed from: com.bumptech.glide.load.o.i */
public class C1761i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f6905a;

    /* renamed from: b */
    private final List<? extends AbstractC1649k<DataType, ResourceType>> f6906b;

    /* renamed from: c */
    private final AbstractC1983e<ResourceType, Transcode> f6907c;

    /* renamed from: d */
    private final AbstractC0958f<List<Throwable>> f6908d;

    /* renamed from: e */
    private final String f6909e;

    /* renamed from: com.bumptech.glide.load.o.i$a */
    interface AbstractC1762a<ResourceType> {
        /* renamed from: a */
        AbstractC1794v<ResourceType> mo7303a(AbstractC1794v<ResourceType> vVar);
    }

    public C1761i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends AbstractC1649k<DataType, ResourceType>> list, AbstractC1983e<ResourceType, Transcode> eVar, AbstractC0958f<List<Throwable>> fVar) {
        this.f6905a = cls;
        this.f6906b = list;
        this.f6907c = eVar;
        this.f6908d = fVar;
        this.f6909e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private AbstractC1794v<ResourceType> m8259b(AbstractC1657e<DataType> eVar, int i, int i2, C1647i iVar) {
        List<Throwable> list = (List) C2081j.m9432d(this.f6908d.mo5399b());
        try {
            return m8260c(eVar, i, i2, iVar, list);
        } finally {
            this.f6908d.mo5398a(list);
        }
    }

    /* renamed from: c */
    private AbstractC1794v<ResourceType> m8260c(AbstractC1657e<DataType> eVar, int i, int i2, C1647i iVar, List<Throwable> list) {
        int size = this.f6906b.size();
        AbstractC1794v<ResourceType> vVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC1649k kVar = (AbstractC1649k) this.f6906b.get(i3);
            try {
                if (kVar.mo7089b(eVar.mo7110a(), iVar)) {
                    vVar = kVar.mo7088a(eVar.mo7110a(), i, i2, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e);
                }
                list.add(e);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new C1787q(this.f6909e, new ArrayList(list));
    }

    /* renamed from: a */
    public AbstractC1794v<Transcode> mo7313a(AbstractC1657e<DataType> eVar, int i, int i2, C1647i iVar, AbstractC1762a<ResourceType> aVar) {
        return this.f6907c.mo7624a(aVar.mo7303a(m8259b(eVar, i, i2, iVar)), iVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f6905a + ", decoders=" + this.f6906b + ", transcoder=" + this.f6907c + '}';
    }
}
