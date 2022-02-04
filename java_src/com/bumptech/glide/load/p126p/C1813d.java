package com.bumptech.glide.load.p126p;

import android.util.Log;
import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p126p.AbstractC1843n;
import com.bumptech.glide.p143s.C2067d;
import com.bumptech.glide.p144t.C2068a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.d */
public class C1813d implements AbstractC1843n<File, ByteBuffer> {

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.p.d$a */
    public static final class C1814a implements AbstractC1655d<ByteBuffer> {

        /* renamed from: b */
        private final File f7049b;

        C1814a(File file) {
            this.f7049b = file;
        }

        @Override // com.bumptech.glide.load.p120n.AbstractC1655d
        /* renamed from: a */
        public Class<ByteBuffer> mo7092a() {
            return ByteBuffer.class;
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
        public void mo7101e(EnumC1616g gVar, AbstractC1655d.AbstractC1656a<? super ByteBuffer> aVar) {
            try {
                aVar.mo7109f(C2068a.m9398a(this.f7049b));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                aVar.mo7108d(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.p.d$b */
    public static class C1815b implements AbstractC1845o<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.p126p.AbstractC1845o
        /* renamed from: b */
        public AbstractC1843n<File, ByteBuffer> mo7398b(C1851r rVar) {
            return new C1813d();
        }
    }

    /* renamed from: c */
    public AbstractC1843n.C1844a<ByteBuffer> mo7393a(File file, int i, int i2, C1647i iVar) {
        return new AbstractC1843n.C1844a<>(new C2067d(file), new C1814a(file));
    }

    /* renamed from: d */
    public boolean mo7394b(File file) {
        return true;
    }
}
