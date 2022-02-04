package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p006b.p022e.p026b.p027k.C0864e;
import p006b.p022e.p026b.p027k.C0867f;
import p006b.p022e.p026b.p027k.C0868g;
import p006b.p022e.p026b.p027k.p028m.C0876b;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: b */
    SparseArray<View> f1316b = new SparseArray<>();

    /* renamed from: c */
    private ArrayList<AbstractC0318b> f1317c = new ArrayList<>(4);

    /* renamed from: d */
    protected C0867f f1318d = new C0867f();

    /* renamed from: e */
    private int f1319e = 0;

    /* renamed from: f */
    private int f1320f = 0;

    /* renamed from: g */
    private int f1321g = Integer.MAX_VALUE;

    /* renamed from: h */
    private int f1322h = Integer.MAX_VALUE;

    /* renamed from: i */
    protected boolean f1323i = true;

    /* renamed from: j */
    private int f1324j = 263;

    /* renamed from: k */
    private C0322d f1325k = null;

    /* renamed from: l */
    protected C0319c f1326l = null;

    /* renamed from: m */
    private int f1327m = -1;

    /* renamed from: n */
    private HashMap<String, Integer> f1328n = new HashMap<>();

    /* renamed from: o */
    private int f1329o = -1;

    /* renamed from: p */
    private int f1330p = -1;

    /* renamed from: q */
    int f1331q = -1;

    /* renamed from: r */
    int f1332r = -1;

    /* renamed from: s */
    int f1333s = 0;

    /* renamed from: t */
    int f1334t = 0;

    /* renamed from: u */
    private SparseArray<C0864e> f1335u = new SparseArray<>();

    /* renamed from: v */
    C0314c f1336v = new C0314c(this);

    /* renamed from: w */
    private int f1337w = 0;

    /* renamed from: x */
    private int f1338x = 0;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    static /* synthetic */ class C0311a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1339a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                b.e.b.k.e$b[] r0 = p006b.p022e.p026b.p027k.C0864e.EnumC0866b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.constraintlayout.widget.ConstraintLayout.C0311a.f1339a = r0
                b.e.b.k.e$b r1 = p006b.p022e.p026b.p027k.C0864e.EnumC0866b.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C0311a.f1339a     // Catch:{ NoSuchFieldError -> 0x001d }
                b.e.b.k.e$b r1 = p006b.p022e.p026b.p027k.C0864e.EnumC0866b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C0311a.f1339a     // Catch:{ NoSuchFieldError -> 0x0028 }
                b.e.b.k.e$b r1 = p006b.p022e.p026b.p027k.C0864e.EnumC0866b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = androidx.constraintlayout.widget.ConstraintLayout.C0311a.f1339a     // Catch:{ NoSuchFieldError -> 0x0033 }
                b.e.b.k.e$b r1 = p006b.p022e.p026b.p027k.C0864e.EnumC0866b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0311a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public static class C0312b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f1340A = 0.5f;

        /* renamed from: B */
        public String f1341B = null;

        /* renamed from: C */
        float f1342C = 0.0f;

        /* renamed from: D */
        int f1343D = 1;

        /* renamed from: E */
        public float f1344E = -1.0f;

        /* renamed from: F */
        public float f1345F = -1.0f;

        /* renamed from: G */
        public int f1346G = 0;

        /* renamed from: H */
        public int f1347H = 0;

        /* renamed from: I */
        public int f1348I = 0;

        /* renamed from: J */
        public int f1349J = 0;

        /* renamed from: K */
        public int f1350K = 0;

        /* renamed from: L */
        public int f1351L = 0;

        /* renamed from: M */
        public int f1352M = 0;

        /* renamed from: N */
        public int f1353N = 0;

        /* renamed from: O */
        public float f1354O = 1.0f;

        /* renamed from: P */
        public float f1355P = 1.0f;

        /* renamed from: Q */
        public int f1356Q = -1;

        /* renamed from: R */
        public int f1357R = -1;

        /* renamed from: S */
        public int f1358S = -1;

        /* renamed from: T */
        public boolean f1359T = false;

        /* renamed from: U */
        public boolean f1360U = false;

        /* renamed from: V */
        public String f1361V = null;

        /* renamed from: W */
        boolean f1362W = true;

        /* renamed from: X */
        boolean f1363X = true;

        /* renamed from: Y */
        boolean f1364Y = false;

        /* renamed from: Z */
        boolean f1365Z = false;

        /* renamed from: a */
        public int f1366a = -1;

        /* renamed from: a0 */
        boolean f1367a0 = false;

        /* renamed from: b */
        public int f1368b = -1;

        /* renamed from: b0 */
        boolean f1369b0 = false;

        /* renamed from: c */
        public float f1370c = -1.0f;

        /* renamed from: c0 */
        boolean f1371c0 = false;

        /* renamed from: d */
        public int f1372d = -1;

        /* renamed from: d0 */
        int f1373d0 = -1;

        /* renamed from: e */
        public int f1374e = -1;

        /* renamed from: e0 */
        int f1375e0 = -1;

        /* renamed from: f */
        public int f1376f = -1;

        /* renamed from: f0 */
        int f1377f0 = -1;

        /* renamed from: g */
        public int f1378g = -1;

        /* renamed from: g0 */
        int f1379g0 = -1;

        /* renamed from: h */
        public int f1380h = -1;

        /* renamed from: h0 */
        int f1381h0 = -1;

        /* renamed from: i */
        public int f1382i = -1;

        /* renamed from: i0 */
        int f1383i0 = -1;

        /* renamed from: j */
        public int f1384j = -1;

        /* renamed from: j0 */
        float f1385j0 = 0.5f;

        /* renamed from: k */
        public int f1386k = -1;

        /* renamed from: k0 */
        int f1387k0;

        /* renamed from: l */
        public int f1388l = -1;

        /* renamed from: l0 */
        int f1389l0;

        /* renamed from: m */
        public int f1390m = -1;

        /* renamed from: m0 */
        float f1391m0;

        /* renamed from: n */
        public int f1392n = 0;

        /* renamed from: n0 */
        C0864e f1393n0 = new C0864e();

        /* renamed from: o */
        public float f1394o = 0.0f;

        /* renamed from: o0 */
        public boolean f1395o0 = false;

        /* renamed from: p */
        public int f1396p = -1;

        /* renamed from: q */
        public int f1397q = -1;

        /* renamed from: r */
        public int f1398r = -1;

        /* renamed from: s */
        public int f1399s = -1;

        /* renamed from: t */
        public int f1400t = -1;

        /* renamed from: u */
        public int f1401u = -1;

        /* renamed from: v */
        public int f1402v = -1;

        /* renamed from: w */
        public int f1403w = -1;

        /* renamed from: x */
        public int f1404x = -1;

        /* renamed from: y */
        public int f1405y = -1;

        /* renamed from: z */
        public float f1406z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        private static class C0313a {

            /* renamed from: a */
            public static final SparseIntArray f1407a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f1407a = sparseIntArray;
                sparseIntArray.append(C0333i.f1647M1, 8);
                sparseIntArray.append(C0333i.f1653N1, 9);
                sparseIntArray.append(C0333i.f1665P1, 10);
                sparseIntArray.append(C0333i.f1671Q1, 11);
                sparseIntArray.append(C0333i.f1707W1, 12);
                sparseIntArray.append(C0333i.f1701V1, 13);
                sparseIntArray.append(C0333i.f1860u1, 14);
                sparseIntArray.append(C0333i.f1854t1, 15);
                sparseIntArray.append(C0333i.f1842r1, 16);
                sparseIntArray.append(C0333i.f1866v1, 2);
                sparseIntArray.append(C0333i.f1878x1, 3);
                sparseIntArray.append(C0333i.f1872w1, 4);
                sparseIntArray.append(C0333i.f1760e2, 49);
                sparseIntArray.append(C0333i.f1767f2, 50);
                sparseIntArray.append(C0333i.f1581B1, 5);
                sparseIntArray.append(C0333i.f1587C1, 6);
                sparseIntArray.append(C0333i.f1593D1, 7);
                sparseIntArray.append(C0333i.f1738b1, 1);
                sparseIntArray.append(C0333i.f1677R1, 17);
                sparseIntArray.append(C0333i.f1683S1, 18);
                sparseIntArray.append(C0333i.f1575A1, 19);
                sparseIntArray.append(C0333i.f1890z1, 20);
                sparseIntArray.append(C0333i.f1788i2, 21);
                sparseIntArray.append(C0333i.f1807l2, 22);
                sparseIntArray.append(C0333i.f1795j2, 23);
                sparseIntArray.append(C0333i.f1774g2, 24);
                sparseIntArray.append(C0333i.f1801k2, 25);
                sparseIntArray.append(C0333i.f1781h2, 26);
                sparseIntArray.append(C0333i.f1623I1, 29);
                sparseIntArray.append(C0333i.f1713X1, 30);
                sparseIntArray.append(C0333i.f1884y1, 44);
                sparseIntArray.append(C0333i.f1635K1, 45);
                sparseIntArray.append(C0333i.f1725Z1, 46);
                sparseIntArray.append(C0333i.f1629J1, 47);
                sparseIntArray.append(C0333i.f1719Y1, 48);
                sparseIntArray.append(C0333i.f1830p1, 27);
                sparseIntArray.append(C0333i.f1824o1, 28);
                sparseIntArray.append(C0333i.f1732a2, 31);
                sparseIntArray.append(C0333i.f1599E1, 32);
                sparseIntArray.append(C0333i.f1746c2, 33);
                sparseIntArray.append(C0333i.f1739b2, 34);
                sparseIntArray.append(C0333i.f1753d2, 35);
                sparseIntArray.append(C0333i.f1611G1, 36);
                sparseIntArray.append(C0333i.f1605F1, 37);
                sparseIntArray.append(C0333i.f1617H1, 38);
                sparseIntArray.append(C0333i.f1641L1, 39);
                sparseIntArray.append(C0333i.f1695U1, 40);
                sparseIntArray.append(C0333i.f1659O1, 41);
                sparseIntArray.append(C0333i.f1848s1, 42);
                sparseIntArray.append(C0333i.f1836q1, 43);
                f1407a.append(C0333i.f1689T1, 51);
            }
        }

        public C0312b(int i, int i2) {
            super(i, i2);
        }

        public C0312b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            int i;
            float parseFloat;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333i.f1731a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0313a.f1407a.get(index);
                switch (i3) {
                    case 1:
                        this.f1358S = obtainStyledAttributes.getInt(index, this.f1358S);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f1390m);
                        this.f1390m = resourceId;
                        if (resourceId == -1) {
                            this.f1390m = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f1392n = obtainStyledAttributes.getDimensionPixelSize(index, this.f1392n);
                        continue;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f1394o) % 360.0f;
                        this.f1394o = f;
                        if (f < 0.0f) {
                            this.f1394o = (360.0f - f) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f1366a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1366a);
                        continue;
                    case 6:
                        this.f1368b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1368b);
                        continue;
                    case 7:
                        this.f1370c = obtainStyledAttributes.getFloat(index, this.f1370c);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f1372d);
                        this.f1372d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f1372d = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f1374e);
                        this.f1374e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f1374e = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f1376f);
                        this.f1376f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f1376f = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f1378g);
                        this.f1378g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f1378g = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f1380h);
                        this.f1380h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f1380h = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f1382i);
                        this.f1382i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f1382i = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f1384j);
                        this.f1384j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f1384j = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f1386k);
                        this.f1386k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f1386k = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f1388l);
                        this.f1388l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f1388l = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f1396p);
                        this.f1396p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f1396p = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f1397q);
                        this.f1397q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f1397q = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f1398r);
                        this.f1398r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f1398r = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f1399s);
                        this.f1399s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f1399s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f1400t = obtainStyledAttributes.getDimensionPixelSize(index, this.f1400t);
                        continue;
                    case 22:
                        this.f1401u = obtainStyledAttributes.getDimensionPixelSize(index, this.f1401u);
                        continue;
                    case 23:
                        this.f1402v = obtainStyledAttributes.getDimensionPixelSize(index, this.f1402v);
                        continue;
                    case 24:
                        this.f1403w = obtainStyledAttributes.getDimensionPixelSize(index, this.f1403w);
                        continue;
                    case 25:
                        this.f1404x = obtainStyledAttributes.getDimensionPixelSize(index, this.f1404x);
                        continue;
                    case 26:
                        this.f1405y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1405y);
                        continue;
                    case 27:
                        this.f1359T = obtainStyledAttributes.getBoolean(index, this.f1359T);
                        continue;
                    case 28:
                        this.f1360U = obtainStyledAttributes.getBoolean(index, this.f1360U);
                        continue;
                    case 29:
                        this.f1406z = obtainStyledAttributes.getFloat(index, this.f1406z);
                        continue;
                    case 30:
                        this.f1340A = obtainStyledAttributes.getFloat(index, this.f1340A);
                        continue;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f1348I = i4;
                        if (i4 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.f1349J = i5;
                        if (i5 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.f1350K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1350K);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f1350K) == -2) {
                                this.f1350K = -2;
                            }
                        }
                    case 34:
                        try {
                            this.f1352M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1352M);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f1352M) == -2) {
                                this.f1352M = -2;
                            }
                        }
                    case 35:
                        this.f1354O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1354O));
                        this.f1348I = 2;
                        continue;
                    case 36:
                        try {
                            this.f1351L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1351L);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f1351L) == -2) {
                                this.f1351L = -2;
                            }
                        }
                    case 37:
                        try {
                            this.f1353N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1353N);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f1353N) == -2) {
                                this.f1353N = -2;
                            }
                        }
                    case 38:
                        this.f1355P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f1355P));
                        this.f1349J = 2;
                        continue;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f1341B = string;
                                this.f1342C = Float.NaN;
                                this.f1343D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f1341B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f1341B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f1343D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f1343D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f1341B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f1341B.substring(i, indexOf2);
                                        String substring3 = this.f1341B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat2 = Float.parseFloat(substring2);
                                                float parseFloat3 = Float.parseFloat(substring3);
                                                parseFloat = (parseFloat2 > 0.0f && parseFloat3 > 0.0f) ? this.f1343D == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3) : parseFloat;
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f1341B.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            parseFloat = Float.parseFloat(substring4);
                                        }
                                    }
                                    this.f1342C = parseFloat;
                                    break;
                                } else {
                                    continue;
                                }
                            case 45:
                                this.f1344E = obtainStyledAttributes.getFloat(index, this.f1344E);
                                continue;
                            case 46:
                                this.f1345F = obtainStyledAttributes.getFloat(index, this.f1345F);
                                continue;
                            case 47:
                                this.f1346G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.f1347H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.f1356Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1356Q);
                                continue;
                            case 50:
                                this.f1357R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1357R);
                                continue;
                            case 51:
                                this.f1361V = obtainStyledAttributes.getString(index);
                                continue;
                                continue;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            mo1967a();
        }

        public C0312b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        /* renamed from: a */
        public void mo1967a() {
            this.f1365Z = false;
            this.f1362W = true;
            this.f1363X = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f1359T) {
                this.f1362W = false;
                if (this.f1348I == 0) {
                    this.f1348I = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f1360U) {
                this.f1363X = false;
                if (this.f1349J == 0) {
                    this.f1349J = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f1362W = false;
                if (i == 0 && this.f1348I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f1359T = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f1363X = false;
                if (i2 == 0 && this.f1349J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f1360U = true;
                }
            }
            if (this.f1370c != -1.0f || this.f1366a != -1 || this.f1368b != -1) {
                this.f1365Z = true;
                this.f1362W = true;
                this.f1363X = true;
                if (!(this.f1393n0 instanceof C0868g)) {
                    this.f1393n0 = new C0868g();
                }
                ((C0868g) this.f1393n0).mo5254O0(this.f1358S);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d4, code lost:
            if (r1 > 0) goto L_0x00d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x00e3, code lost:
            if (r1 > 0) goto L_0x00d6;
         */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x00ea  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x00f5  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x003f  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r10) {
            /*
            // Method dump skipped, instructions count: 259
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0312b.resolveLayoutDirection(int):void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    public class C0314c implements C0876b.AbstractC0878b {

        /* renamed from: a */
        ConstraintLayout f1408a;

        /* renamed from: b */
        int f1409b;

        /* renamed from: c */
        int f1410c;

        /* renamed from: d */
        int f1411d;

        /* renamed from: e */
        int f1412e;

        /* renamed from: f */
        int f1413f;

        /* renamed from: g */
        int f1414g;

        public C0314c(ConstraintLayout constraintLayout) {
            this.f1408a = constraintLayout;
        }

        /* JADX WARNING: Removed duplicated region for block: B:100:0x016c A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x0185  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x01a4  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01af  */
        /* JADX WARNING: Removed duplicated region for block: B:118:0x01bb  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x01c5  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x01d2  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x01d7  */
        /* JADX WARNING: Removed duplicated region for block: B:126:0x01dc  */
        /* JADX WARNING: Removed duplicated region for block: B:129:0x01e4  */
        /* JADX WARNING: Removed duplicated region for block: B:130:0x01e9  */
        /* JADX WARNING: Removed duplicated region for block: B:133:0x01ee  */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x01f6 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:142:0x020e A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x021a  */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0220  */
        /* JADX WARNING: Removed duplicated region for block: B:152:0x0236  */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x0238  */
        /* JADX WARNING: Removed duplicated region for block: B:156:0x023d  */
        /* JADX WARNING: Removed duplicated region for block: B:162:0x024b  */
        /* JADX WARNING: Removed duplicated region for block: B:163:0x024d  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00b9  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x012d  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x012f  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0134  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0139  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0143  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x014e  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0159  */
        @Override // p006b.p022e.p026b.p027k.p028m.C0876b.AbstractC0878b
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo1969a(p006b.p022e.p026b.p027k.C0864e r20, p006b.p022e.p026b.p027k.p028m.C0876b.C0877a r21) {
            /*
            // Method dump skipped, instructions count: 613
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0314c.mo1969a(b.e.b.k.e, b.e.b.k.m.b$a):void");
        }

        @Override // p006b.p022e.p026b.p027k.p028m.C0876b.AbstractC0878b
        /* renamed from: b */
        public final void mo1970b() {
            int childCount = this.f1408a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f1408a.getChildAt(i);
                if (childAt instanceof C0331g) {
                    ((C0331g) childAt).mo2021a(this.f1408a);
                }
            }
            int size = this.f1408a.f1317c.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC0318b) this.f1408a.f1317c.get(i2)).mo1983j(this.f1408a);
                }
            }
        }

        /* renamed from: c */
        public void mo1971c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f1409b = i3;
            this.f1410c = i4;
            this.f1411d = i5;
            this.f1412e = i6;
            this.f1413f = i;
            this.f1414g = i2;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1576i(attributeSet, 0, 0);
    }

    /* renamed from: f */
    private final C0864e m1575f(int i) {
        if (i == 0) {
            return this.f1318d;
        }
        View view = this.f1316b.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f1318d;
        }
        if (view == null) {
            return null;
        }
        return ((C0312b) view.getLayoutParams()).f1393n0;
    }

    private int getPaddingWidth() {
        int i = 0;
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        if (Build.VERSION.SDK_INT >= 17) {
            i = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        }
        return i > 0 ? i : max;
    }

    /* renamed from: i */
    private void m1576i(AttributeSet attributeSet, int i, int i2) {
        this.f1318d.mo5181Z(this);
        this.f1318d.mo5242b1(this.f1336v);
        this.f1316b.put(getId(), this);
        this.f1325k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0333i.f1731a1, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0333i.f1766f1) {
                    this.f1319e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1319e);
                } else if (index == C0333i.f1773g1) {
                    this.f1320f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1320f);
                } else if (index == C0333i.f1752d1) {
                    this.f1321g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1321g);
                } else if (index == C0333i.f1759e1) {
                    this.f1322h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1322h);
                } else if (index == C0333i.f1813m2) {
                    this.f1324j = obtainStyledAttributes.getInt(index, this.f1324j);
                } else if (index == C0333i.f1818n1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo1947l(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1326l = null;
                        }
                    }
                } else if (index == C0333i.f1806l1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0322d dVar = new C0322d();
                        this.f1325k = dVar;
                        dVar.mo1999k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1325k = null;
                    }
                    this.f1327m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1318d.mo5243c1(this.f1324j);
    }

    /* renamed from: k */
    private void m1577k() {
        this.f1323i = true;
        this.f1329o = -1;
        this.f1330p = -1;
        this.f1331q = -1;
        this.f1332r = -1;
        this.f1333s = 0;
        this.f1334t = 0;
    }

    /* renamed from: o */
    private void m1578o() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0864e h = mo1945h(getChildAt(i));
            if (h != null) {
                h.mo5178W();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    mo1954p(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    m1575f(childAt.getId()).mo5182a0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f1327m != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.f1327m && (childAt2 instanceof C0328e)) {
                    this.f1325k = ((C0328e) childAt2).getConstraintSet();
                }
            }
        }
        C0322d dVar = this.f1325k;
        if (dVar != null) {
            dVar.mo1995d(this, true);
        }
        this.f1318d.mo5261J0();
        int size = this.f1317c.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.f1317c.get(i4).mo1985l(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C0331g) {
                ((C0331g) childAt3).mo2022b(this);
            }
        }
        this.f1335u.clear();
        this.f1335u.put(0, this.f1318d);
        this.f1335u.put(getId(), this.f1318d);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.f1335u.put(childAt4.getId(), mo1945h(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            C0864e h2 = mo1945h(childAt5);
            if (h2 != null) {
                C0312b bVar = (C0312b) childAt5.getLayoutParams();
                this.f1318d.mo5262a(h2);
                mo1929b(isInEditMode, childAt5, h2, bVar, this.f1335u);
            }
        }
    }

    /* renamed from: r */
    private boolean m1579r() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            m1578o();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (Build.VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0115 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01e5  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1929b(boolean r20, android.view.View r21, p006b.p022e.p026b.p027k.C0864e r22, androidx.constraintlayout.widget.ConstraintLayout.C0312b r23, android.util.SparseArray<p006b.p022e.p026b.p027k.C0864e> r24) {
        /*
        // Method dump skipped, instructions count: 699
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo1929b(boolean, android.view.View, b.e.b.k.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0312b generateDefaultLayoutParams() {
        return new C0312b(-2, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0312b;
    }

    /* renamed from: d */
    public C0312b generateLayoutParams(AttributeSet attributeSet) {
        return new C0312b(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC0318b> arrayList = this.f1317c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f1317c.get(i).mo1984k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) i4;
                        float f3 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public Object mo1934e(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f1328n;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f1328n.get(str);
    }

    public void forceLayout() {
        m1577k();
        super.forceLayout();
    }

    /* renamed from: g */
    public View mo1936g(int i) {
        return this.f1316b.get(i);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0312b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f1322h;
    }

    public int getMaxWidth() {
        return this.f1321g;
    }

    public int getMinHeight() {
        return this.f1320f;
    }

    public int getMinWidth() {
        return this.f1319e;
    }

    public int getOptimizationLevel() {
        return this.f1318d.mo5234S0();
    }

    /* renamed from: h */
    public final C0864e mo1945h(View view) {
        if (view == this) {
            return this.f1318d;
        }
        if (view == null) {
            return null;
        }
        return ((C0312b) view.getLayoutParams()).f1393n0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo1946j() {
        if (Build.VERSION.SDK_INT < 17) {
            return false;
        }
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo1947l(int i) {
        this.f1326l = new C0319c(getContext(), this, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo1948m(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0314c cVar = this.f1336v;
        int i5 = cVar.f1412e;
        int i6 = i3 + cVar.f1411d;
        int i7 = i4 + i5;
        if (Build.VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = ViewGroup.resolveSizeAndState(i6, i, 0);
            int min = Math.min(this.f1321g, resolveSizeAndState & 16777215);
            int min2 = Math.min(this.f1322h, ViewGroup.resolveSizeAndState(i7, i2, 0) & 16777215);
            if (z) {
                min |= 16777216;
            }
            if (z2) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.f1329o = min;
            this.f1330p = min2;
            return;
        }
        setMeasuredDimension(i6, i7);
        this.f1329o = i6;
        this.f1330p = i7;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo1949n(C0867f fVar, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f1336v.mo1971c(i2, i3, max, max2, paddingWidth, i5);
        if (Build.VERSION.SDK_INT >= 17) {
            int max3 = Math.max(0, getPaddingStart());
            int max4 = Math.max(0, getPaddingEnd());
            if (max3 <= 0 && max4 <= 0) {
                max3 = Math.max(0, getPaddingLeft());
            } else if (mo1946j()) {
                max3 = max4;
            }
            i4 = max3;
        } else {
            i4 = Math.max(0, getPaddingLeft());
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        mo1955q(fVar, mode, i6, mode2, i7);
        fVar.mo5240Y0(i, mode, i6, mode2, i7, this.f1329o, this.f1330p, i4, max);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0312b bVar = (C0312b) childAt.getLayoutParams();
            C0864e eVar = bVar.f1393n0;
            if ((childAt.getVisibility() != 8 || bVar.f1365Z || bVar.f1367a0 || bVar.f1371c0 || isInEditMode) && !bVar.f1369b0) {
                int O = eVar.mo5171O();
                int P = eVar.mo5172P();
                int N = eVar.mo5170N() + O;
                int t = eVar.mo5213t() + P;
                childAt.layout(O, P, N, t);
                if ((childAt instanceof C0331g) && (content = ((C0331g) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(O, P, N, t);
                }
            }
        }
        int size = this.f1317c.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f1317c.get(i6).mo1982i(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f1337w = i;
        this.f1338x = i2;
        this.f1318d.mo5244d1(mo1946j());
        if (this.f1323i) {
            this.f1323i = false;
            if (m1579r()) {
                this.f1318d.mo5246f1();
            }
        }
        mo1949n(this.f1318d, this.f1324j, i, i2);
        mo1948m(i, i2, this.f1318d.mo5170N(), this.f1318d.mo5213t(), this.f1318d.mo5239X0(), this.f1318d.mo5237V0());
    }

    public void onViewAdded(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0864e h = mo1945h(view);
        if ((view instanceof Guideline) && !(h instanceof C0868g)) {
            C0312b bVar = (C0312b) view.getLayoutParams();
            C0868g gVar = new C0868g();
            bVar.f1393n0 = gVar;
            bVar.f1365Z = true;
            gVar.mo5254O0(bVar.f1358S);
        }
        if (view instanceof AbstractC0318b) {
            AbstractC0318b bVar2 = (AbstractC0318b) view;
            bVar2.mo1986m();
            ((C0312b) view.getLayoutParams()).f1367a0 = true;
            if (!this.f1317c.contains(bVar2)) {
                this.f1317c.add(bVar2);
            }
        }
        this.f1316b.put(view.getId(), view);
        this.f1323i = true;
    }

    public void onViewRemoved(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f1316b.remove(view.getId());
        this.f1318d.mo5260I0(mo1945h(view));
        this.f1317c.remove(view);
        this.f1323i = true;
    }

    /* renamed from: p */
    public void mo1954p(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f1328n == null) {
                this.f1328n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f1328n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r3 == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r3 == 0) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1955q(p006b.p022e.p026b.p027k.C0867f r8, int r9, int r10, int r11, int r12) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo1955q(b.e.b.k.f, int, int, int, int):void");
    }

    public void removeView(View view) {
        super.removeView(view);
        if (Build.VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        m1577k();
        super.requestLayout();
    }

    public void setConstraintSet(C0322d dVar) {
        this.f1325k = dVar;
    }

    public void setId(int i) {
        this.f1316b.remove(getId());
        super.setId(i);
        this.f1316b.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f1322h) {
            this.f1322h = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f1321g) {
            this.f1321g = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f1320f) {
            this.f1320f = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f1319e) {
            this.f1319e = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(AbstractC0330f fVar) {
        C0319c cVar = this.f1326l;
        if (cVar != null) {
            cVar.mo1992c(fVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1324j = i;
        this.f1318d.mo5243c1(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
