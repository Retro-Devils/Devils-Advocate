package com.bumptech.glide.load.p128q.p133h;

import android.util.Log;
import com.bumptech.glide.load.AbstractC1649k;
import com.bumptech.glide.load.C1635f;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.q.h.j */
public class C1978j implements AbstractC1649k<InputStream, C1966c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f7311a;

    /* renamed from: b */
    private final AbstractC1649k<ByteBuffer, C1966c> f7312b;

    /* renamed from: c */
    private final AbstractC1690b f7313c;

    public C1978j(List<ImageHeaderParser> list, AbstractC1649k<ByteBuffer, C1966c> kVar, AbstractC1690b bVar) {
        this.f7311a = list;
        this.f7312b = kVar;
        this.f7313c = bVar;
    }

    /* renamed from: e */
    private static byte[] m8943e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e);
            return null;
        }
    }

    /* renamed from: c */
    public AbstractC1794v<C1966c> mo7088a(InputStream inputStream, int i, int i2, C1647i iVar) {
        byte[] e = m8943e(inputStream);
        if (e == null) {
            return null;
        }
        return this.f7312b.mo7088a(ByteBuffer.wrap(e), i, i2, iVar);
    }

    /* renamed from: d */
    public boolean mo7089b(InputStream inputStream, C1647i iVar) {
        return !((Boolean) iVar.mo7084c(C1977i.f7310b)).booleanValue() && C1635f.m7858e(this.f7311a, inputStream, this.f7313c) == ImageHeaderParser.ImageType.GIF;
    }
}
