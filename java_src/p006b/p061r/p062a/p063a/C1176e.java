package p006b.p061r.p062a.p063a;

import java.util.Arrays;

/* renamed from: b.r.a.a.e */
public class C1176e {
    /* renamed from: a */
    public static <T> T[] m6419a(T[] tArr, T[]... tArr2) {
        int length = tArr.length;
        for (T[] tArr3 : tArr2) {
            length += tArr3.length;
        }
        T[] tArr4 = (T[]) Arrays.copyOf(tArr, length);
        int length2 = tArr.length;
        for (T[] tArr5 : tArr2) {
            System.arraycopy(tArr5, 0, tArr4, length2, tArr5.length);
            length2 += tArr5.length;
        }
        return tArr4;
    }
}
