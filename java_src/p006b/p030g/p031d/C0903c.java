package p006b.p030g.p031d;

import android.graphics.Path;
import android.util.Log;
import androidx.constraintlayout.widget.C0333i;
import java.util.ArrayList;
import p006b.p007a.C0763j;

/* renamed from: b.g.d.c */
public class C0903c {

    /* access modifiers changed from: private */
    /* renamed from: b.g.d.c$a */
    public static class C0904a {

        /* renamed from: a */
        int f4533a;

        /* renamed from: b */
        boolean f4534b;

        C0904a() {
        }
    }

    /* renamed from: b.g.d.c$b */
    public static class C0905b {

        /* renamed from: a */
        public char f4535a;

        /* renamed from: b */
        public float[] f4536b;

        C0905b(char c, float[] fArr) {
            this.f4535a = c;
            this.f4536b = fArr;
        }

        C0905b(C0905b bVar) {
            this.f4535a = bVar.f4535a;
            float[] fArr = bVar.f4536b;
            this.f4536b = C0903c.m5306c(fArr, 0, fArr.length);
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        private static void m5314a(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            char c3 = c2;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c3) {
                case 'A':
                case C0333i.f1664P0:
                    i = 7;
                    break;
                case 'C':
                case C0333i.f1676R0:
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case C0333i.f1706W0:
                case C0763j.f3613H0:
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case C0333i.f1724Z0:
                case 'm':
                case C0763j.f3603F0:
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case C0763j.f3598E0:
                    i = 4;
                    break;
                case C0333i.f1622I0:
                case C0763j.f3633L0:
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    i = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int i3 = 0;
            char c4 = c;
            while (i3 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 == 'C') {
                        i2 = i3;
                        int i4 = i2 + 2;
                        int i5 = i2 + 3;
                        int i6 = i2 + 4;
                        int i7 = i2 + 5;
                        path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i4], fArr2[i5], fArr2[i6], fArr2[i7]);
                        f15 = fArr2[i6];
                        float f19 = fArr2[i7];
                        float f20 = fArr2[i4];
                        float f21 = fArr2[i5];
                        f16 = f19;
                        f12 = f21;
                        f11 = f20;
                    } else if (c3 == 'H') {
                        i2 = i3;
                        int i8 = i2 + 0;
                        path.lineTo(fArr2[i8], f16);
                        f15 = fArr2[i8];
                    } else if (c3 == 'Q') {
                        i2 = i3;
                        int i9 = i2 + 0;
                        int i10 = i2 + 1;
                        int i11 = i2 + 2;
                        int i12 = i2 + 3;
                        path.quadTo(fArr2[i9], fArr2[i10], fArr2[i11], fArr2[i12]);
                        float f22 = fArr2[i9];
                        float f23 = fArr2[i10];
                        f15 = fArr2[i11];
                        f16 = fArr2[i12];
                        f11 = f22;
                        f12 = f23;
                    } else if (c3 == 'V') {
                        i2 = i3;
                        int i13 = i2 + 0;
                        path.lineTo(f15, fArr2[i13]);
                        f16 = fArr2[i13];
                    } else if (c3 != 'a') {
                        if (c3 == 'c') {
                            int i14 = i3 + 2;
                            int i15 = i3 + 3;
                            int i16 = i3 + 4;
                            int i17 = i3 + 5;
                            path.rCubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i14], fArr2[i15], fArr2[i16], fArr2[i17]);
                            f2 = fArr2[i14] + f15;
                            f = fArr2[i15] + f16;
                            f15 += fArr2[i16];
                            f3 = fArr2[i17];
                            f16 += f3;
                            f11 = f2;
                            f12 = f;
                        } else if (c3 != 'h') {
                            if (c3 != 'q') {
                                if (c3 == 'v') {
                                    int i18 = i3 + 0;
                                    path.rLineTo(0.0f, fArr2[i18]);
                                    f4 = fArr2[i18];
                                } else if (c3 != 'L') {
                                    if (c3 == 'M') {
                                        int i19 = i3 + 0;
                                        f15 = fArr2[i19];
                                        int i20 = i3 + 1;
                                        f16 = fArr2[i20];
                                        if (i3 > 0) {
                                            path.lineTo(fArr2[i19], fArr2[i20]);
                                        } else {
                                            path.moveTo(fArr2[i19], fArr2[i20]);
                                        }
                                    } else if (c3 == 'S') {
                                        if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                            f15 = (f15 * 2.0f) - f11;
                                            f16 = (f16 * 2.0f) - f12;
                                        }
                                        int i21 = i3 + 0;
                                        int i22 = i3 + 1;
                                        int i23 = i3 + 2;
                                        int i24 = i3 + 3;
                                        path.cubicTo(f15, f16, fArr2[i21], fArr2[i22], fArr2[i23], fArr2[i24]);
                                        f2 = fArr2[i21];
                                        f = fArr2[i22];
                                        f15 = fArr2[i23];
                                        f16 = fArr2[i24];
                                        f11 = f2;
                                        f12 = f;
                                    } else if (c3 == 'T') {
                                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                            f15 = (f15 * 2.0f) - f11;
                                            f16 = (f16 * 2.0f) - f12;
                                        }
                                        int i25 = i3 + 0;
                                        int i26 = i3 + 1;
                                        path.quadTo(f15, f16, fArr2[i25], fArr2[i26]);
                                        float f24 = fArr2[i25];
                                        float f25 = fArr2[i26];
                                        i2 = i3;
                                        f12 = f16;
                                        f11 = f15;
                                        f15 = f24;
                                        f16 = f25;
                                    } else if (c3 == 'l') {
                                        int i27 = i3 + 0;
                                        int i28 = i3 + 1;
                                        path.rLineTo(fArr2[i27], fArr2[i28]);
                                        f15 += fArr2[i27];
                                        f4 = fArr2[i28];
                                    } else if (c3 == 'm') {
                                        int i29 = i3 + 0;
                                        f15 += fArr2[i29];
                                        int i30 = i3 + 1;
                                        f16 += fArr2[i30];
                                        if (i3 > 0) {
                                            path.rLineTo(fArr2[i29], fArr2[i30]);
                                        } else {
                                            path.rMoveTo(fArr2[i29], fArr2[i30]);
                                        }
                                    } else if (c3 == 's') {
                                        if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                            float f26 = f15 - f11;
                                            f5 = f16 - f12;
                                            f6 = f26;
                                        } else {
                                            f6 = 0.0f;
                                            f5 = 0.0f;
                                        }
                                        int i31 = i3 + 0;
                                        int i32 = i3 + 1;
                                        int i33 = i3 + 2;
                                        int i34 = i3 + 3;
                                        path.rCubicTo(f6, f5, fArr2[i31], fArr2[i32], fArr2[i33], fArr2[i34]);
                                        f2 = fArr2[i31] + f15;
                                        f = fArr2[i32] + f16;
                                        f15 += fArr2[i33];
                                        f3 = fArr2[i34];
                                    } else if (c3 == 't') {
                                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                            f7 = f15 - f11;
                                            f8 = f16 - f12;
                                        } else {
                                            f8 = 0.0f;
                                            f7 = 0.0f;
                                        }
                                        int i35 = i3 + 0;
                                        int i36 = i3 + 1;
                                        path.rQuadTo(f7, f8, fArr2[i35], fArr2[i36]);
                                        float f27 = f7 + f15;
                                        float f28 = f8 + f16;
                                        f15 += fArr2[i35];
                                        f16 += fArr2[i36];
                                        f12 = f28;
                                        f11 = f27;
                                    }
                                    i2 = i3;
                                    f18 = f16;
                                    f17 = f15;
                                } else {
                                    int i37 = i3 + 0;
                                    int i38 = i3 + 1;
                                    path.lineTo(fArr2[i37], fArr2[i38]);
                                    f15 = fArr2[i37];
                                    f16 = fArr2[i38];
                                }
                                f16 += f4;
                            } else {
                                int i39 = i3 + 0;
                                int i40 = i3 + 1;
                                int i41 = i3 + 2;
                                int i42 = i3 + 3;
                                path.rQuadTo(fArr2[i39], fArr2[i40], fArr2[i41], fArr2[i42]);
                                f2 = fArr2[i39] + f15;
                                f = fArr2[i40] + f16;
                                f15 += fArr2[i41];
                                f3 = fArr2[i42];
                            }
                            f16 += f3;
                            f11 = f2;
                            f12 = f;
                        } else {
                            int i43 = i3 + 0;
                            path.rLineTo(fArr2[i43], 0.0f);
                            f15 += fArr2[i43];
                        }
                        i2 = i3;
                    } else {
                        int i44 = i3 + 5;
                        int i45 = i3 + 6;
                        i2 = i3;
                        m5316c(path, f15, f16, fArr2[i44] + f15, fArr2[i45] + f16, fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i3 + 2], fArr2[i3 + 3] != 0.0f, fArr2[i3 + 4] != 0.0f);
                        f15 += fArr2[i44];
                        f16 += fArr2[i45];
                    }
                    i3 = i2 + i;
                    c4 = c2;
                    c3 = c4;
                } else {
                    i2 = i3;
                    int i46 = i2 + 5;
                    int i47 = i2 + 6;
                    m5316c(path, f15, f16, fArr2[i46], fArr2[i47], fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i2 + 2], fArr2[i2 + 3] != 0.0f, fArr2[i2 + 4] != 0.0f);
                    f15 = fArr2[i46];
                    f16 = fArr2[i47];
                }
                f12 = f16;
                f11 = f15;
                i3 = i2 + i;
                c4 = c2;
                c3 = c4;
            }
            fArr[0] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        /* renamed from: b */
        private static void m5315b(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = (double) ceil;
            Double.isNaN(d18);
            double d19 = d9 / d18;
            double d20 = d8;
            double d21 = d17;
            double d22 = d14;
            int i = 0;
            double d23 = d5;
            double d24 = d6;
            while (i < ceil) {
                double d25 = d20 + d19;
                double sin3 = Math.sin(d25);
                double cos3 = Math.cos(d25);
                double d26 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                double d27 = d2 + (d10 * sin * cos3) + (d16 * sin3);
                double d28 = (d12 * sin3) - (d13 * cos3);
                double d29 = (sin3 * d15) + (cos3 * d16);
                double d30 = d25 - d20;
                double tan = Math.tan(d30 / 2.0d);
                double sin4 = (Math.sin(d30) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) (d23 + (d22 * sin4)), (float) (d24 + (d21 * sin4)), (float) (d26 - (sin4 * d28)), (float) (d27 - (sin4 * d29)), (float) d26, (float) d27);
                i++;
                d19 = d19;
                sin = sin;
                d23 = d26;
                d15 = d15;
                cos = cos;
                d20 = d25;
                d21 = d29;
                d22 = d28;
                ceil = ceil;
                d24 = d27;
                d10 = d3;
            }
        }

        /* renamed from: c */
        private static void m5316c(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians((double) f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = (double) f;
            Double.isNaN(d3);
            double d4 = d3 * cos;
            double d5 = (double) f2;
            Double.isNaN(d5);
            double d6 = (double) f5;
            Double.isNaN(d6);
            double d7 = (d4 + (d5 * sin)) / d6;
            double d8 = (double) (-f);
            Double.isNaN(d8);
            Double.isNaN(d5);
            double d9 = (double) f6;
            Double.isNaN(d9);
            double d10 = ((d8 * sin) + (d5 * cos)) / d9;
            double d11 = (double) f3;
            Double.isNaN(d11);
            double d12 = (double) f4;
            Double.isNaN(d12);
            Double.isNaN(d6);
            double d13 = ((d11 * cos) + (d12 * sin)) / d6;
            double d14 = (double) (-f3);
            Double.isNaN(d14);
            Double.isNaN(d12);
            Double.isNaN(d9);
            double d15 = ((d14 * sin) + (d12 * cos)) / d9;
            double d16 = d7 - d13;
            double d17 = d10 - d15;
            double d18 = (d7 + d13) / 2.0d;
            double d19 = (d10 + d15) / 2.0d;
            double d20 = (d16 * d16) + (d17 * d17);
            if (d20 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d21 = (1.0d / d20) - 0.25d;
            if (d21 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d20);
                float sqrt = (float) (Math.sqrt(d20) / 1.99999d);
                m5316c(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d21);
            double d22 = d16 * sqrt2;
            double d23 = sqrt2 * d17;
            if (z == z2) {
                d2 = d18 - d23;
                d = d19 + d22;
            } else {
                d2 = d18 + d23;
                d = d19 - d22;
            }
            double atan2 = Math.atan2(d10 - d, d7 - d2);
            double atan22 = Math.atan2(d15 - d, d13 - d2) - atan2;
            if (z2 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            Double.isNaN(d6);
            double d24 = d2 * d6;
            Double.isNaN(d9);
            double d25 = d * d9;
            m5315b(path, (d24 * cos) - (d25 * sin), (d24 * sin) + (d25 * cos), d6, d9, d3, d5, radians, atan2, atan22);
        }

        /* renamed from: e */
        public static void m5317e(C0905b[] bVarArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < bVarArr.length; i++) {
                m5314a(path, fArr, c, bVarArr[i].f4535a, bVarArr[i].f4536b);
                c = bVarArr[i].f4535a;
            }
        }

        /* renamed from: d */
        public void mo5304d(C0905b bVar, C0905b bVar2, float f) {
            this.f4535a = bVar.f4535a;
            int i = 0;
            while (true) {
                float[] fArr = bVar.f4536b;
                if (i < fArr.length) {
                    this.f4536b[i] = (fArr[i] * (1.0f - f)) + (bVar2.f4536b[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m5304a(ArrayList<C0905b> arrayList, char c, float[] fArr) {
        arrayList.add(new C0905b(c, fArr));
    }

    /* renamed from: b */
    public static boolean m5305b(C0905b[] bVarArr, C0905b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i = 0; i < bVarArr.length; i++) {
            if (!(bVarArr[i].f4535a == bVarArr2[i].f4535a && bVarArr[i].f4536b.length == bVarArr2[i].f4536b.length)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    static float[] m5306c(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static C0905b[] m5307d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int i3 = m5312i(str, i);
            String trim = str.substring(i2, i3).trim();
            if (trim.length() > 0) {
                m5304a(arrayList, trim.charAt(0), m5311h(trim));
            }
            i2 = i3;
            i = i3 + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m5304a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C0905b[]) arrayList.toArray(new C0905b[arrayList.size()]);
    }

    /* renamed from: e */
    public static Path m5308e(String str) {
        Path path = new Path();
        C0905b[] d = m5307d(str);
        if (d == null) {
            return null;
        }
        try {
            C0905b.m5317e(d, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    /* renamed from: f */
    public static C0905b[] m5309f(C0905b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        C0905b[] bVarArr2 = new C0905b[bVarArr.length];
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr2[i] = new C0905b(bVarArr[i]);
        }
        return bVarArr2;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r2 == false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038 A[LOOP:0: B:1:0x0007->B:19:0x0038, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m5310g(java.lang.String r8, int r9, p006b.p030g.p031d.C0903c.C0904a r10) {
        /*
            r0 = 0
            r10.f4534b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0007:
            int r5 = r8.length()
            if (r1 >= r5) goto L_0x003b
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L_0x0033
            r6 = 69
            if (r5 == r6) goto L_0x0031
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L_0x0031
            switch(r5) {
                case 44: goto L_0x0033;
                case 45: goto L_0x002a;
                case 46: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x002f
        L_0x0022:
            if (r3 != 0) goto L_0x0027
            r2 = 0
            r3 = 1
            goto L_0x0035
        L_0x0027:
            r10.f4534b = r7
            goto L_0x0033
        L_0x002a:
            if (r1 == r9) goto L_0x002f
            if (r2 != 0) goto L_0x002f
            goto L_0x0027
        L_0x002f:
            r2 = 0
            goto L_0x0035
        L_0x0031:
            r2 = 1
            goto L_0x0035
        L_0x0033:
            r2 = 0
            r4 = 1
        L_0x0035:
            if (r4 == 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x003b:
            r10.f4533a = r1
            return
            switch-data {44->0x0033, 45->0x002a, 46->0x0022, }
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p030g.p031d.C0903c.m5310g(java.lang.String, int, b.g.d.c$a):void");
    }

    /* renamed from: h */
    private static float[] m5311h(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            C0904a aVar = new C0904a();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                m5310g(str, i, aVar);
                int i3 = aVar.f4533a;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = aVar.f4534b ? i3 : i3 + 1;
            }
            return m5306c(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    /* renamed from: i */
    private static int m5312i(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: j */
    public static void m5313j(C0905b[] bVarArr, C0905b[] bVarArr2) {
        for (int i = 0; i < bVarArr2.length; i++) {
            bVarArr[i].f4535a = bVarArr2[i].f4535a;
            for (int i2 = 0; i2 < bVarArr2[i].f4536b.length; i2++) {
                bVarArr[i].f4536b[i2] = bVarArr2[i].f4536b[i2];
            }
        }
    }
}
