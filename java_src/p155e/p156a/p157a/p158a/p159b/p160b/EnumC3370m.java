package p155e.p156a.p157a.p158a.p159b.p160b;

import java.util.Arrays;

/* renamed from: e.a.a.a.b.b.m */
public enum EnumC3370m {
    COPY(new byte[]{0}),
    LZMA(new byte[]{3, 1, 1}),
    LZMA2(new byte[]{33}),
    DEFLATE(new byte[]{4, 1, 8}),
    BZIP2(new byte[]{4, 2, 2}),
    AES256SHA256(new byte[]{6, -15, 7, 1}),
    BCJ_X86_FILTER(new byte[]{3, 3, 1, 3}),
    BCJ_PPC_FILTER(new byte[]{3, 3, 2, 5}),
    BCJ_IA64_FILTER(new byte[]{3, 3, 4, 1}),
    BCJ_ARM_FILTER(new byte[]{3, 3, 5, 1}),
    BCJ_ARM_THUMB_FILTER(new byte[]{3, 3, 7, 1}),
    BCJ_SPARC_FILTER(new byte[]{3, 3, 8, 5}),
    DELTA_FILTER(new byte[]{3});
    

    /* renamed from: p */
    private final byte[] f11363p;

    private EnumC3370m(byte[] bArr) {
        this.f11363p = bArr;
    }

    /* renamed from: a */
    static EnumC3370m m14015a(byte[] bArr) {
        EnumC3370m[] mVarArr = (EnumC3370m[]) EnumC3370m.class.getEnumConstants();
        for (EnumC3370m mVar : mVarArr) {
            if (Arrays.equals(mVar.f11363p, bArr)) {
                return mVar;
            }
        }
        return null;
    }
}
