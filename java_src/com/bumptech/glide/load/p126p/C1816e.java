package com.bumptech.glide.load.p126p;

import android.util.Base64;
import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.p143s.C2067d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.p.e */
public final class C1816e<Model, Data> implements AbstractC1843n<Model, Data> {

    /* renamed from: a */
    private final AbstractC1817a<Data> f7050a;

    /* renamed from: com.bumptech.glide.load.p.e$a */
    public interface AbstractC1817a<Data> {
        /* renamed from: a */
        Class<Data> mo7408a();

        /* renamed from: b */
        void mo7409b(Data data);

        /* renamed from: c */
        Data mo7410c(String str);
    }

    /* renamed from: com.bumptech.glide.load.p.e$b */
    private static final class C1818b<Data> implements AbstractC1655d<Data> {

        /* renamed from: b */
        private final String f7051b;

        /* renamed from: c */
        private final AbstractC1817a<Data> f7052c;

        /* renamed from: d */
        private Data f7053d;

        C1818b(String str, AbstractC1817a<Data> aVar) {
            this.f7051b = str;
            this.f7052c = aVar;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: a */
        public Class<Data> mo7092a() {
            return this.f7052c.mo7408a();
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: b */
        public void mo7097b() {
            try {
                this.f7052c.mo7409b(this.f7053d);
            } catch (IOException unused) {
            }
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
        public void mo7101e(EnumC1616g gVar, AbstractC1655d.AbstractC1656a<? super Data> aVar) {
            try {
                Data c = this.f7052c.mo7410c(this.f7051b);
                this.f7053d = c;
                aVar.mo7109f(c);
            } catch (IllegalArgumentException e) {
                aVar.mo7108d(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.p.e$c */
    public static final class C1819c<Model> implements AbstractC1845o<Model, InputStream> {

        /* renamed from: a */
        private final AbstractC1817a<InputStream> f7054a = new C1820a();

        /* renamed from: com.bumptech.glide.load.p.e$c$a */
        class C1820a implements AbstractC1817a<InputStream> {
            C1820a() {
            }

            @Override // com.bumptech.glide.load.p126p.C1816e.AbstractC1817a
            /* renamed from: a */
            public Class<InputStream> mo7408a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void mo7409b(InputStream inputStream) {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream mo7410c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<Model, InputStream> mo7398b(C1851r rVar) {
            return new C1816e(this.f7054a);
        }
    }

    public C1816e(AbstractC1817a<Data> aVar) {
        this.f7050a = aVar;
    }

    @Override // com.bumptech.glide.load.p126p.AbstractC1843n
    /* renamed from: a */
    public AbstractC1843n.C1844a<Data> mo7393a(Model model, int i, int i2, C1647i iVar) {
        return new AbstractC1843n.C1844a<>(new C2067d(model), new C1818b(model.toString(), this.f7050a));
    }

    @Override // com.bumptech.glide.load.p126p.AbstractC1843n
    /* renamed from: b */
    public boolean mo7394b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
