package p155e.p156a.p157a.p158a.p159b.p160b;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p155e.p156a.p157a.p158a.C3347a;

/* renamed from: e.a.a.a.b.b.a */
class C3349a extends AbstractC3355f {

    /* renamed from: e.a.a.a.b.b.a$a */
    class C3350a extends InputStream {

        /* renamed from: b */
        private boolean f11275b = false;

        /* renamed from: c */
        private CipherInputStream f11276c = null;

        /* renamed from: d */
        final /* synthetic */ C3354e f11277d;

        /* renamed from: e */
        final /* synthetic */ String f11278e;

        /* renamed from: f */
        final /* synthetic */ byte[] f11279f;

        /* renamed from: g */
        final /* synthetic */ InputStream f11280g;

        C3350a(C3354e eVar, String str, byte[] bArr, InputStream inputStream) {
            this.f11277d = eVar;
            this.f11278e = str;
            this.f11279f = bArr;
            this.f11280g = inputStream;
        }

        /* renamed from: a */
        private CipherInputStream m13943a() {
            byte[] bArr;
            if (this.f11275b) {
                return this.f11276c;
            }
            byte[] bArr2 = this.f11277d.f11297d;
            int i = bArr2[0] & 255;
            int i2 = i & 63;
            int i3 = bArr2[1] & 255;
            int i4 = ((i >> 6) & 1) + (i3 & 15);
            int i5 = ((i >> 7) & 1) + (i3 >> 4);
            int i6 = i5 + 2;
            if (i6 + i4 <= bArr2.length) {
                byte[] bArr3 = new byte[i5];
                System.arraycopy(bArr2, 2, bArr3, 0, i5);
                byte[] bArr4 = new byte[16];
                System.arraycopy(this.f11277d.f11297d, i6, bArr4, 0, i4);
                if (this.f11279f != null) {
                    if (i2 == 63) {
                        bArr = new byte[32];
                        System.arraycopy(bArr3, 0, bArr, 0, i5);
                        byte[] bArr5 = this.f11279f;
                        System.arraycopy(bArr5, 0, bArr, i5, Math.min(bArr5.length, 32 - i5));
                    } else {
                        try {
                            MessageDigest instance = MessageDigest.getInstance("SHA-256");
                            byte[] bArr6 = new byte[8];
                            for (long j = 0; j < (1 << i2); j++) {
                                instance.update(bArr3);
                                instance.update(this.f11279f);
                                instance.update(bArr6);
                                for (int i7 = 0; i7 < 8; i7++) {
                                    bArr6[i7] = (byte) (bArr6[i7] + 1);
                                    if (bArr6[i7] != 0) {
                                        break;
                                    }
                                }
                            }
                            bArr = instance.digest();
                        } catch (NoSuchAlgorithmException e) {
                            throw new IOException("SHA-256 is unsupported by your Java implementation", e);
                        }
                    }
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    try {
                        Cipher instance2 = Cipher.getInstance("AES/CBC/NoPadding");
                        instance2.init(2, secretKeySpec, new IvParameterSpec(bArr4));
                        CipherInputStream cipherInputStream = new CipherInputStream(this.f11280g, instance2);
                        this.f11276c = cipherInputStream;
                        this.f11275b = true;
                        return cipherInputStream;
                    } catch (GeneralSecurityException e2) {
                        throw new IOException("Decryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)", e2);
                    }
                } else {
                    throw new C3347a(this.f11278e);
                }
            } else {
                throw new IOException("Salt size + IV size too long in " + this.f11278e);
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            return m13943a().read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return m13943a().read(bArr, i, i2);
        }
    }

    C3349a() {
        super(new Class[0]);
    }

    /* access modifiers changed from: package-private */
    @Override // p155e.p156a.p157a.p158a.p159b.p160b.AbstractC3355f
    /* renamed from: b */
    public InputStream mo11293b(String str, InputStream inputStream, long j, C3354e eVar, byte[] bArr) {
        return new C3350a(eVar, str, bArr, inputStream);
    }
}
