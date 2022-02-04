package com.bumptech.glide.load.p126p;

import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.p143s.C2067d;

/* renamed from: com.bumptech.glide.load.p.v */
public class C1865v<Model> implements AbstractC1843n<Model, Model> {

    /* renamed from: a */
    private static final C1865v<?> f7114a = new C1865v<>();

    /* renamed from: com.bumptech.glide.load.p.v$a */
    public static class C1866a<Model> implements AbstractC1845o<Model, Model> {

        /* renamed from: a */
        private static final C1866a<?> f7115a = new C1866a<>();

        /* renamed from: a */
        public static <T> C1866a<T> m8561a() {
            return (C1866a<T>) f7115a;
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Model, Model> mo7398b(C1851r rVar) {
            return C1865v.m8558c();
        }
    }

    /* renamed from: com.bumptech.glide.load.p.v$b */
    private static class C1867b<Model> implements AbstractC1655d<Model> {

        /* renamed from: b */
        private final Model f7116b;

        C1867b(Model model) {
            this.f7116b = model;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: a */
        public Class<Model> mo7092a() {
            return (Class<Model>) this.f7116b.getClass();
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: b */
        public void mo7097b() {
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: c */
        public EnumC1630a mo7098c() {
            return EnumC1630a.LOCAL;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: e */
        public void mo7101e(EnumC1616g gVar, AbstractC1655d.AbstractC1656a<? super Model> aVar) {
            aVar.mo7109f(this.f7116b);
        }
    }

    /* renamed from: c */
    public static <T> C1865v<T> m8558c() {
        return (C1865v<T>) f7114a;
    }

    @Override // com.bumptech.glide.load.p126p.AbstractC1843n
    /* renamed from: a */
    public AbstractC1843n.C1844a<Model> mo7393a(Model model, int i, int i2, C1647i iVar) {
        return new AbstractC1843n.C1844a<>(new C2067d(model), new C1867b(model));
    }

    @Override // com.bumptech.glide.load.p126p.AbstractC1843n
    /* renamed from: b */
    public boolean mo7394b(Model model) {
        return true;
    }
}
