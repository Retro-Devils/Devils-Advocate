package p150d.p151a.p152a;

/* renamed from: d.a.a.a */
public class C3344a {
    /* renamed from: a */
    public static double m13936a(String str, String str2) {
        int length = str.length() + str2.length();
        double b = (double) (length - m13937b(str, str2, 1));
        double d = (double) length;
        Double.isNaN(b);
        Double.isNaN(d);
        return b / d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m13937b(java.lang.String r21, java.lang.String r22, int r23) {
        /*
        // Method dump skipped, instructions count: 312
        */
        throw new UnsupportedOperationException("Method not decompiled: p150d.p151a.p152a.C3344a.m13937b(java.lang.String, java.lang.String, int):int");
    }

    /* renamed from: c */
    private static int m13938c(char[] cArr, int i, char c, int i2) {
        if (i2 != 0) {
            int i3 = 0;
            while (cArr[i + i3] != c) {
                i3++;
                i2--;
                if (i2 == 0) {
                }
            }
            return 1;
        }
        return 0;
    }
}
