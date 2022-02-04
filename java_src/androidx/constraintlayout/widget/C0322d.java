package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0328e;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p022e.p023a.p024a.C0840a;
import p006b.p022e.p023a.p025b.C0841a;

/* renamed from: androidx.constraintlayout.widget.d */
public class C0322d {

    /* renamed from: a */
    private static final int[] f1455a = {0, 4, 8};

    /* renamed from: b */
    private static SparseIntArray f1456b;

    /* renamed from: c */
    private HashMap<String, C0315a> f1457c = new HashMap<>();

    /* renamed from: d */
    private boolean f1458d = true;

    /* renamed from: e */
    private HashMap<Integer, C0323a> f1459e = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.d$a */
    public static class C0323a {

        /* renamed from: a */
        int f1460a;

        /* renamed from: b */
        public final C0326d f1461b = new C0326d();

        /* renamed from: c */
        public final C0325c f1462c = new C0325c();

        /* renamed from: d */
        public final C0324b f1463d = new C0324b();

        /* renamed from: e */
        public final C0327e f1464e = new C0327e();

        /* renamed from: f */
        public HashMap<String, C0315a> f1465f = new HashMap<>();

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: f */
        private void m1636f(int i, ConstraintLayout.C0312b bVar) {
            this.f1460a = i;
            C0324b bVar2 = this.f1463d;
            bVar2.f1508i = bVar.f1372d;
            bVar2.f1510j = bVar.f1374e;
            bVar2.f1512k = bVar.f1376f;
            bVar2.f1514l = bVar.f1378g;
            bVar2.f1515m = bVar.f1380h;
            bVar2.f1516n = bVar.f1382i;
            bVar2.f1517o = bVar.f1384j;
            bVar2.f1518p = bVar.f1386k;
            bVar2.f1519q = bVar.f1388l;
            bVar2.f1520r = bVar.f1396p;
            bVar2.f1521s = bVar.f1397q;
            bVar2.f1522t = bVar.f1398r;
            bVar2.f1523u = bVar.f1399s;
            bVar2.f1524v = bVar.f1406z;
            bVar2.f1525w = bVar.f1340A;
            bVar2.f1526x = bVar.f1341B;
            bVar2.f1527y = bVar.f1390m;
            bVar2.f1528z = bVar.f1392n;
            bVar2.f1467A = bVar.f1394o;
            bVar2.f1468B = bVar.f1356Q;
            bVar2.f1469C = bVar.f1357R;
            bVar2.f1470D = bVar.f1358S;
            bVar2.f1506h = bVar.f1370c;
            bVar2.f1502f = bVar.f1366a;
            bVar2.f1504g = bVar.f1368b;
            C0324b bVar3 = this.f1463d;
            bVar3.f1498d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar3.f1500e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar3.f1471E = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar3.f1472F = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar3.f1473G = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar3.f1474H = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar3.f1483Q = bVar.f1345F;
            bVar3.f1484R = bVar.f1344E;
            bVar3.f1486T = bVar.f1347H;
            bVar3.f1485S = bVar.f1346G;
            bVar3.f1509i0 = bVar.f1359T;
            bVar3.f1511j0 = bVar.f1360U;
            bVar3.f1487U = bVar.f1348I;
            bVar3.f1488V = bVar.f1349J;
            bVar3.f1489W = bVar.f1352M;
            bVar3.f1490X = bVar.f1353N;
            bVar3.f1491Y = bVar.f1350K;
            bVar3.f1492Z = bVar.f1351L;
            bVar3.f1493a0 = bVar.f1354O;
            bVar3.f1495b0 = bVar.f1355P;
            bVar3.f1507h0 = bVar.f1361V;
            bVar3.f1478L = bVar.f1401u;
            bVar3.f1480N = bVar.f1403w;
            bVar3.f1477K = bVar.f1400t;
            bVar3.f1479M = bVar.f1402v;
            C0324b bVar4 = this.f1463d;
            bVar4.f1482P = bVar.f1404x;
            bVar4.f1481O = bVar.f1405y;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar4.f1475I = bVar.getMarginEnd();
                this.f1463d.f1476J = bVar.getMarginStart();
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: g */
        private void m1637g(int i, C0328e.C0329a aVar) {
            m1636f(i, aVar);
            this.f1461b.f1540d = aVar.f1559p0;
            C0327e eVar = this.f1464e;
            eVar.f1544c = aVar.f1562s0;
            eVar.f1545d = aVar.f1563t0;
            eVar.f1546e = aVar.f1564u0;
            eVar.f1547f = aVar.f1565v0;
            eVar.f1548g = aVar.f1566w0;
            eVar.f1549h = aVar.f1567x0;
            eVar.f1550i = aVar.f1568y0;
            eVar.f1551j = aVar.f1569z0;
            eVar.f1552k = aVar.f1557A0;
            eVar.f1553l = aVar.f1558B0;
            eVar.f1555n = aVar.f1561r0;
            eVar.f1554m = aVar.f1560q0;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: h */
        private void m1638h(AbstractC0318b bVar, int i, C0328e.C0329a aVar) {
            m1637g(i, aVar);
            if (bVar instanceof Barrier) {
                C0324b bVar2 = this.f1463d;
                bVar2.f1501e0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f1497c0 = barrier.getType();
                this.f1463d.f1503f0 = barrier.getReferencedIds();
                this.f1463d.f1499d0 = barrier.getMargin();
            }
        }

        /* renamed from: d */
        public void mo2004d(ConstraintLayout.C0312b bVar) {
            C0324b bVar2 = this.f1463d;
            bVar.f1372d = bVar2.f1508i;
            bVar.f1374e = bVar2.f1510j;
            bVar.f1376f = bVar2.f1512k;
            bVar.f1378g = bVar2.f1514l;
            bVar.f1380h = bVar2.f1515m;
            bVar.f1382i = bVar2.f1516n;
            bVar.f1384j = bVar2.f1517o;
            bVar.f1386k = bVar2.f1518p;
            bVar.f1388l = bVar2.f1519q;
            bVar.f1396p = bVar2.f1520r;
            bVar.f1397q = bVar2.f1521s;
            bVar.f1398r = bVar2.f1522t;
            bVar.f1399s = bVar2.f1523u;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f1471E;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f1472F;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f1473G;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f1474H;
            bVar.f1404x = bVar2.f1482P;
            bVar.f1405y = bVar2.f1481O;
            bVar.f1401u = bVar2.f1478L;
            bVar.f1403w = bVar2.f1480N;
            bVar.f1406z = bVar2.f1524v;
            bVar.f1340A = bVar2.f1525w;
            bVar.f1390m = bVar2.f1527y;
            bVar.f1392n = bVar2.f1528z;
            C0324b bVar3 = this.f1463d;
            bVar.f1394o = bVar3.f1467A;
            bVar.f1341B = bVar3.f1526x;
            bVar.f1356Q = bVar3.f1468B;
            bVar.f1357R = bVar3.f1469C;
            bVar.f1345F = bVar3.f1483Q;
            bVar.f1344E = bVar3.f1484R;
            bVar.f1347H = bVar3.f1486T;
            bVar.f1346G = bVar3.f1485S;
            bVar.f1359T = bVar3.f1509i0;
            bVar.f1360U = bVar3.f1511j0;
            bVar.f1348I = bVar3.f1487U;
            bVar.f1349J = bVar3.f1488V;
            bVar.f1352M = bVar3.f1489W;
            bVar.f1353N = bVar3.f1490X;
            bVar.f1350K = bVar3.f1491Y;
            bVar.f1351L = bVar3.f1492Z;
            bVar.f1354O = bVar3.f1493a0;
            bVar.f1355P = bVar3.f1495b0;
            bVar.f1358S = bVar3.f1470D;
            bVar.f1370c = bVar3.f1506h;
            bVar.f1366a = bVar3.f1502f;
            bVar.f1368b = bVar3.f1504g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar3.f1498d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar3.f1500e;
            String str = bVar3.f1507h0;
            if (str != null) {
                bVar.f1361V = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(this.f1463d.f1476J);
                bVar.setMarginEnd(this.f1463d.f1475I);
            }
            bVar.mo1967a();
        }

        /* renamed from: e */
        public C0323a clone() {
            C0323a aVar = new C0323a();
            aVar.f1463d.mo2006a(this.f1463d);
            aVar.f1462c.mo2008a(this.f1462c);
            aVar.f1461b.mo2010a(this.f1461b);
            aVar.f1464e.mo2012a(this.f1464e);
            aVar.f1460a = this.f1460a;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$b */
    public static class C0324b {

        /* renamed from: a */
        private static SparseIntArray f1466a;

        /* renamed from: A */
        public float f1467A = 0.0f;

        /* renamed from: B */
        public int f1468B = -1;

        /* renamed from: C */
        public int f1469C = -1;

        /* renamed from: D */
        public int f1470D = -1;

        /* renamed from: E */
        public int f1471E = -1;

        /* renamed from: F */
        public int f1472F = -1;

        /* renamed from: G */
        public int f1473G = -1;

        /* renamed from: H */
        public int f1474H = -1;

        /* renamed from: I */
        public int f1475I = -1;

        /* renamed from: J */
        public int f1476J = -1;

        /* renamed from: K */
        public int f1477K = -1;

        /* renamed from: L */
        public int f1478L = -1;

        /* renamed from: M */
        public int f1479M = -1;

        /* renamed from: N */
        public int f1480N = -1;

        /* renamed from: O */
        public int f1481O = -1;

        /* renamed from: P */
        public int f1482P = -1;

        /* renamed from: Q */
        public float f1483Q = -1.0f;

        /* renamed from: R */
        public float f1484R = -1.0f;

        /* renamed from: S */
        public int f1485S = 0;

        /* renamed from: T */
        public int f1486T = 0;

        /* renamed from: U */
        public int f1487U = 0;

        /* renamed from: V */
        public int f1488V = 0;

        /* renamed from: W */
        public int f1489W = -1;

        /* renamed from: X */
        public int f1490X = -1;

        /* renamed from: Y */
        public int f1491Y = -1;

        /* renamed from: Z */
        public int f1492Z = -1;

        /* renamed from: a0 */
        public float f1493a0 = 1.0f;

        /* renamed from: b */
        public boolean f1494b = false;

        /* renamed from: b0 */
        public float f1495b0 = 1.0f;

        /* renamed from: c */
        public boolean f1496c = false;

        /* renamed from: c0 */
        public int f1497c0 = -1;

        /* renamed from: d */
        public int f1498d;

        /* renamed from: d0 */
        public int f1499d0 = 0;

        /* renamed from: e */
        public int f1500e;

        /* renamed from: e0 */
        public int f1501e0 = -1;

        /* renamed from: f */
        public int f1502f = -1;

        /* renamed from: f0 */
        public int[] f1503f0;

        /* renamed from: g */
        public int f1504g = -1;

        /* renamed from: g0 */
        public String f1505g0;

        /* renamed from: h */
        public float f1506h = -1.0f;

        /* renamed from: h0 */
        public String f1507h0;

        /* renamed from: i */
        public int f1508i = -1;

        /* renamed from: i0 */
        public boolean f1509i0 = false;

        /* renamed from: j */
        public int f1510j = -1;

        /* renamed from: j0 */
        public boolean f1511j0 = false;

        /* renamed from: k */
        public int f1512k = -1;

        /* renamed from: k0 */
        public boolean f1513k0 = true;

        /* renamed from: l */
        public int f1514l = -1;

        /* renamed from: m */
        public int f1515m = -1;

        /* renamed from: n */
        public int f1516n = -1;

        /* renamed from: o */
        public int f1517o = -1;

        /* renamed from: p */
        public int f1518p = -1;

        /* renamed from: q */
        public int f1519q = -1;

        /* renamed from: r */
        public int f1520r = -1;

        /* renamed from: s */
        public int f1521s = -1;

        /* renamed from: t */
        public int f1522t = -1;

        /* renamed from: u */
        public int f1523u = -1;

        /* renamed from: v */
        public float f1524v = 0.5f;

        /* renamed from: w */
        public float f1525w = 0.5f;

        /* renamed from: x */
        public String f1526x = null;

        /* renamed from: y */
        public int f1527y = -1;

        /* renamed from: z */
        public int f1528z = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1466a = sparseIntArray;
            sparseIntArray.append(C0333i.f1601E3, 24);
            f1466a.append(C0333i.f1607F3, 25);
            f1466a.append(C0333i.f1619H3, 28);
            f1466a.append(C0333i.f1625I3, 29);
            f1466a.append(C0333i.f1655N3, 35);
            f1466a.append(C0333i.f1649M3, 34);
            f1466a.append(C0333i.f1832p3, 4);
            f1466a.append(C0333i.f1826o3, 3);
            f1466a.append(C0333i.f1814m3, 1);
            f1466a.append(C0333i.f1685S3, 6);
            f1466a.append(C0333i.f1691T3, 7);
            f1466a.append(C0333i.f1874w3, 17);
            f1466a.append(C0333i.f1880x3, 18);
            f1466a.append(C0333i.f1886y3, 19);
            f1466a.append(C0333i.f1714X2, 26);
            f1466a.append(C0333i.f1631J3, 31);
            f1466a.append(C0333i.f1637K3, 32);
            f1466a.append(C0333i.f1868v3, 10);
            f1466a.append(C0333i.f1862u3, 9);
            f1466a.append(C0333i.f1709W3, 13);
            f1466a.append(C0333i.f1727Z3, 16);
            f1466a.append(C0333i.f1715X3, 14);
            f1466a.append(C0333i.f1697U3, 11);
            f1466a.append(C0333i.f1721Y3, 15);
            f1466a.append(C0333i.f1703V3, 12);
            f1466a.append(C0333i.f1673Q3, 38);
            f1466a.append(C0333i.f1589C3, 37);
            f1466a.append(C0333i.f1583B3, 39);
            f1466a.append(C0333i.f1667P3, 40);
            f1466a.append(C0333i.f1577A3, 20);
            f1466a.append(C0333i.f1661O3, 36);
            f1466a.append(C0333i.f1856t3, 5);
            f1466a.append(C0333i.f1595D3, 76);
            f1466a.append(C0333i.f1643L3, 76);
            f1466a.append(C0333i.f1613G3, 76);
            f1466a.append(C0333i.f1820n3, 76);
            f1466a.append(C0333i.f1808l3, 76);
            f1466a.append(C0333i.f1733a3, 23);
            f1466a.append(C0333i.f1747c3, 27);
            f1466a.append(C0333i.f1761e3, 30);
            f1466a.append(C0333i.f1768f3, 8);
            f1466a.append(C0333i.f1740b3, 33);
            f1466a.append(C0333i.f1754d3, 2);
            f1466a.append(C0333i.f1720Y2, 22);
            f1466a.append(C0333i.f1726Z2, 21);
            f1466a.append(C0333i.f1838q3, 61);
            f1466a.append(C0333i.f1850s3, 62);
            f1466a.append(C0333i.f1844r3, 63);
            f1466a.append(C0333i.f1679R3, 69);
            f1466a.append(C0333i.f1892z3, 70);
            f1466a.append(C0333i.f1796j3, 71);
            f1466a.append(C0333i.f1782h3, 72);
            f1466a.append(C0333i.f1789i3, 73);
            f1466a.append(C0333i.f1802k3, 74);
            f1466a.append(C0333i.f1775g3, 75);
        }

        /* renamed from: a */
        public void mo2006a(C0324b bVar) {
            this.f1494b = bVar.f1494b;
            this.f1498d = bVar.f1498d;
            this.f1496c = bVar.f1496c;
            this.f1500e = bVar.f1500e;
            this.f1502f = bVar.f1502f;
            this.f1504g = bVar.f1504g;
            this.f1506h = bVar.f1506h;
            this.f1508i = bVar.f1508i;
            this.f1510j = bVar.f1510j;
            this.f1512k = bVar.f1512k;
            this.f1514l = bVar.f1514l;
            this.f1515m = bVar.f1515m;
            this.f1516n = bVar.f1516n;
            this.f1517o = bVar.f1517o;
            this.f1518p = bVar.f1518p;
            this.f1519q = bVar.f1519q;
            this.f1520r = bVar.f1520r;
            this.f1521s = bVar.f1521s;
            this.f1522t = bVar.f1522t;
            this.f1523u = bVar.f1523u;
            this.f1524v = bVar.f1524v;
            this.f1525w = bVar.f1525w;
            this.f1526x = bVar.f1526x;
            this.f1527y = bVar.f1527y;
            this.f1528z = bVar.f1528z;
            this.f1467A = bVar.f1467A;
            this.f1468B = bVar.f1468B;
            this.f1469C = bVar.f1469C;
            this.f1470D = bVar.f1470D;
            this.f1471E = bVar.f1471E;
            this.f1472F = bVar.f1472F;
            this.f1473G = bVar.f1473G;
            this.f1474H = bVar.f1474H;
            this.f1475I = bVar.f1475I;
            this.f1476J = bVar.f1476J;
            this.f1477K = bVar.f1477K;
            this.f1478L = bVar.f1478L;
            this.f1479M = bVar.f1479M;
            this.f1480N = bVar.f1480N;
            this.f1481O = bVar.f1481O;
            this.f1482P = bVar.f1482P;
            this.f1483Q = bVar.f1483Q;
            this.f1484R = bVar.f1484R;
            this.f1485S = bVar.f1485S;
            this.f1486T = bVar.f1486T;
            this.f1487U = bVar.f1487U;
            this.f1488V = bVar.f1488V;
            this.f1489W = bVar.f1489W;
            this.f1490X = bVar.f1490X;
            this.f1491Y = bVar.f1491Y;
            this.f1492Z = bVar.f1492Z;
            this.f1493a0 = bVar.f1493a0;
            this.f1495b0 = bVar.f1495b0;
            this.f1497c0 = bVar.f1497c0;
            this.f1499d0 = bVar.f1499d0;
            this.f1501e0 = bVar.f1501e0;
            this.f1507h0 = bVar.f1507h0;
            int[] iArr = bVar.f1503f0;
            if (iArr != null) {
                this.f1503f0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f1503f0 = null;
            }
            this.f1505g0 = bVar.f1505g0;
            this.f1509i0 = bVar.f1509i0;
            this.f1511j0 = bVar.f1511j0;
            this.f1513k0 = bVar.f1513k0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2007b(Context context, AttributeSet attributeSet) {
            StringBuilder sb;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333i.f1708W2);
            this.f1496c = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f1466a.get(index);
                if (i2 == 80) {
                    this.f1509i0 = obtainStyledAttributes.getBoolean(index, this.f1509i0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f1519q = C0322d.m1622m(obtainStyledAttributes, index, this.f1519q);
                            continue;
                        case 2:
                            this.f1474H = obtainStyledAttributes.getDimensionPixelSize(index, this.f1474H);
                            continue;
                        case 3:
                            this.f1518p = C0322d.m1622m(obtainStyledAttributes, index, this.f1518p);
                            continue;
                        case 4:
                            this.f1517o = C0322d.m1622m(obtainStyledAttributes, index, this.f1517o);
                            continue;
                        case 5:
                            this.f1526x = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.f1468B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1468B);
                            continue;
                        case 7:
                            this.f1469C = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1469C);
                            continue;
                        case 8:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.f1475I = obtainStyledAttributes.getDimensionPixelSize(index, this.f1475I);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            this.f1523u = C0322d.m1622m(obtainStyledAttributes, index, this.f1523u);
                            continue;
                        case 10:
                            this.f1522t = C0322d.m1622m(obtainStyledAttributes, index, this.f1522t);
                            continue;
                        case 11:
                            this.f1480N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1480N);
                            continue;
                        case 12:
                            this.f1481O = obtainStyledAttributes.getDimensionPixelSize(index, this.f1481O);
                            continue;
                        case 13:
                            this.f1477K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1477K);
                            continue;
                        case 14:
                            this.f1479M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1479M);
                            continue;
                        case 15:
                            this.f1482P = obtainStyledAttributes.getDimensionPixelSize(index, this.f1482P);
                            continue;
                        case 16:
                            this.f1478L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1478L);
                            continue;
                        case 17:
                            this.f1502f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1502f);
                            continue;
                        case 18:
                            this.f1504g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1504g);
                            continue;
                        case 19:
                            this.f1506h = obtainStyledAttributes.getFloat(index, this.f1506h);
                            continue;
                        case 20:
                            this.f1524v = obtainStyledAttributes.getFloat(index, this.f1524v);
                            continue;
                        case 21:
                            this.f1500e = obtainStyledAttributes.getLayoutDimension(index, this.f1500e);
                            continue;
                        case 22:
                            this.f1498d = obtainStyledAttributes.getLayoutDimension(index, this.f1498d);
                            continue;
                        case 23:
                            this.f1471E = obtainStyledAttributes.getDimensionPixelSize(index, this.f1471E);
                            continue;
                        case 24:
                            this.f1508i = C0322d.m1622m(obtainStyledAttributes, index, this.f1508i);
                            continue;
                        case 25:
                            this.f1510j = C0322d.m1622m(obtainStyledAttributes, index, this.f1510j);
                            continue;
                        case 26:
                            this.f1470D = obtainStyledAttributes.getInt(index, this.f1470D);
                            continue;
                        case 27:
                            this.f1472F = obtainStyledAttributes.getDimensionPixelSize(index, this.f1472F);
                            continue;
                        case 28:
                            this.f1512k = C0322d.m1622m(obtainStyledAttributes, index, this.f1512k);
                            continue;
                        case 29:
                            this.f1514l = C0322d.m1622m(obtainStyledAttributes, index, this.f1514l);
                            continue;
                        case 30:
                            if (Build.VERSION.SDK_INT >= 17) {
                                this.f1476J = obtainStyledAttributes.getDimensionPixelSize(index, this.f1476J);
                                break;
                            } else {
                                continue;
                            }
                        case 31:
                            this.f1520r = C0322d.m1622m(obtainStyledAttributes, index, this.f1520r);
                            continue;
                        case 32:
                            this.f1521s = C0322d.m1622m(obtainStyledAttributes, index, this.f1521s);
                            continue;
                        case 33:
                            this.f1473G = obtainStyledAttributes.getDimensionPixelSize(index, this.f1473G);
                            continue;
                        case 34:
                            this.f1516n = C0322d.m1622m(obtainStyledAttributes, index, this.f1516n);
                            continue;
                        case 35:
                            this.f1515m = C0322d.m1622m(obtainStyledAttributes, index, this.f1515m);
                            continue;
                        case 36:
                            this.f1525w = obtainStyledAttributes.getFloat(index, this.f1525w);
                            continue;
                        case 37:
                            this.f1484R = obtainStyledAttributes.getFloat(index, this.f1484R);
                            continue;
                        case 38:
                            this.f1483Q = obtainStyledAttributes.getFloat(index, this.f1483Q);
                            continue;
                        case 39:
                            this.f1485S = obtainStyledAttributes.getInt(index, this.f1485S);
                            continue;
                        case 40:
                            this.f1486T = obtainStyledAttributes.getInt(index, this.f1486T);
                            continue;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f1487U = obtainStyledAttributes.getInt(index, this.f1487U);
                                    continue;
                                case 55:
                                    this.f1488V = obtainStyledAttributes.getInt(index, this.f1488V);
                                    continue;
                                case 56:
                                    this.f1489W = obtainStyledAttributes.getDimensionPixelSize(index, this.f1489W);
                                    continue;
                                case 57:
                                    this.f1490X = obtainStyledAttributes.getDimensionPixelSize(index, this.f1490X);
                                    continue;
                                case 58:
                                    this.f1491Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1491Y);
                                    continue;
                                case 59:
                                    this.f1492Z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1492Z);
                                    continue;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f1527y = C0322d.m1622m(obtainStyledAttributes, index, this.f1527y);
                                            continue;
                                        case 62:
                                            this.f1528z = obtainStyledAttributes.getDimensionPixelSize(index, this.f1528z);
                                            continue;
                                        case 63:
                                            this.f1467A = obtainStyledAttributes.getFloat(index, this.f1467A);
                                            continue;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f1493a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f1495b0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f1497c0 = obtainStyledAttributes.getInt(index, this.f1497c0);
                                                    break;
                                                case 73:
                                                    this.f1499d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1499d0);
                                                    break;
                                                case 74:
                                                    this.f1505g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f1513k0 = obtainStyledAttributes.getBoolean(index, this.f1513k0);
                                                    break;
                                                case 76:
                                                    sb = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(f1466a.get(index));
                                                    Log.w("ConstraintSet", sb.toString());
                                                    continue;
                                                    continue;
                                                    continue;
                                                case 77:
                                                    this.f1507h0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    sb = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(f1466a.get(index));
                                                    Log.w("ConstraintSet", sb.toString());
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f1511j0 = obtainStyledAttributes.getBoolean(index, this.f1511j0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$c */
    public static class C0325c {

        /* renamed from: a */
        private static SparseIntArray f1529a;

        /* renamed from: b */
        public boolean f1530b = false;

        /* renamed from: c */
        public int f1531c = -1;

        /* renamed from: d */
        public String f1532d = null;

        /* renamed from: e */
        public int f1533e = -1;

        /* renamed from: f */
        public int f1534f = 0;

        /* renamed from: g */
        public float f1535g = Float.NaN;

        /* renamed from: h */
        public float f1536h = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1529a = sparseIntArray;
            sparseIntArray.append(C0333i.f1803k4, 1);
            f1529a.append(C0333i.f1815m4, 2);
            f1529a.append(C0333i.f1821n4, 3);
            f1529a.append(C0333i.f1797j4, 4);
            f1529a.append(C0333i.f1790i4, 5);
            f1529a.append(C0333i.f1809l4, 6);
        }

        /* renamed from: a */
        public void mo2008a(C0325c cVar) {
            this.f1530b = cVar.f1530b;
            this.f1531c = cVar.f1531c;
            this.f1532d = cVar.f1532d;
            this.f1533e = cVar.f1533e;
            this.f1534f = cVar.f1534f;
            this.f1536h = cVar.f1536h;
            this.f1535g = cVar.f1535g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2009b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333i.f1783h4);
            this.f1530b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1529a.get(index)) {
                    case 1:
                        this.f1536h = obtainStyledAttributes.getFloat(index, this.f1536h);
                        break;
                    case 2:
                        this.f1533e = obtainStyledAttributes.getInt(index, this.f1533e);
                        break;
                    case 3:
                        this.f1532d = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : C0840a.f4129b[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f1534f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1531c = C0322d.m1622m(obtainStyledAttributes, index, this.f1531c);
                        break;
                    case 6:
                        this.f1535g = obtainStyledAttributes.getFloat(index, this.f1535g);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d */
    public static class C0326d {

        /* renamed from: a */
        public boolean f1537a = false;

        /* renamed from: b */
        public int f1538b = 0;

        /* renamed from: c */
        public int f1539c = 0;

        /* renamed from: d */
        public float f1540d = 1.0f;

        /* renamed from: e */
        public float f1541e = Float.NaN;

        /* renamed from: a */
        public void mo2010a(C0326d dVar) {
            this.f1537a = dVar.f1537a;
            this.f1538b = dVar.f1538b;
            this.f1540d = dVar.f1540d;
            this.f1541e = dVar.f1541e;
            this.f1539c = dVar.f1539c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2011b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333i.f1875w4);
            this.f1537a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0333i.f1887y4) {
                    this.f1540d = obtainStyledAttributes.getFloat(index, this.f1540d);
                } else if (index == C0333i.f1881x4) {
                    this.f1538b = obtainStyledAttributes.getInt(index, this.f1538b);
                    this.f1538b = C0322d.f1455a[this.f1538b];
                } else if (index == C0333i.f1578A4) {
                    this.f1539c = obtainStyledAttributes.getInt(index, this.f1539c);
                } else if (index == C0333i.f1893z4) {
                    this.f1541e = obtainStyledAttributes.getFloat(index, this.f1541e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$e */
    public static class C0327e {

        /* renamed from: a */
        private static SparseIntArray f1542a;

        /* renamed from: b */
        public boolean f1543b = false;

        /* renamed from: c */
        public float f1544c = 0.0f;

        /* renamed from: d */
        public float f1545d = 0.0f;

        /* renamed from: e */
        public float f1546e = 0.0f;

        /* renamed from: f */
        public float f1547f = 1.0f;

        /* renamed from: g */
        public float f1548g = 1.0f;

        /* renamed from: h */
        public float f1549h = Float.NaN;

        /* renamed from: i */
        public float f1550i = Float.NaN;

        /* renamed from: j */
        public float f1551j = 0.0f;

        /* renamed from: k */
        public float f1552k = 0.0f;

        /* renamed from: l */
        public float f1553l = 0.0f;

        /* renamed from: m */
        public boolean f1554m = false;

        /* renamed from: n */
        public float f1555n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1542a = sparseIntArray;
            sparseIntArray.append(C0333i.f1698U4, 1);
            f1542a.append(C0333i.f1704V4, 2);
            f1542a.append(C0333i.f1710W4, 3);
            f1542a.append(C0333i.f1686S4, 4);
            f1542a.append(C0333i.f1692T4, 5);
            f1542a.append(C0333i.f1662O4, 6);
            f1542a.append(C0333i.f1668P4, 7);
            f1542a.append(C0333i.f1674Q4, 8);
            f1542a.append(C0333i.f1680R4, 9);
            f1542a.append(C0333i.f1716X4, 10);
            f1542a.append(C0333i.f1722Y4, 11);
        }

        /* renamed from: a */
        public void mo2012a(C0327e eVar) {
            this.f1543b = eVar.f1543b;
            this.f1544c = eVar.f1544c;
            this.f1545d = eVar.f1545d;
            this.f1546e = eVar.f1546e;
            this.f1547f = eVar.f1547f;
            this.f1548g = eVar.f1548g;
            this.f1549h = eVar.f1549h;
            this.f1550i = eVar.f1550i;
            this.f1551j = eVar.f1551j;
            this.f1552k = eVar.f1552k;
            this.f1553l = eVar.f1553l;
            this.f1554m = eVar.f1554m;
            this.f1555n = eVar.f1555n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2013b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333i.f1656N4);
            this.f1543b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1542a.get(index)) {
                    case 1:
                        this.f1544c = obtainStyledAttributes.getFloat(index, this.f1544c);
                        break;
                    case 2:
                        this.f1545d = obtainStyledAttributes.getFloat(index, this.f1545d);
                        break;
                    case 3:
                        this.f1546e = obtainStyledAttributes.getFloat(index, this.f1546e);
                        break;
                    case 4:
                        this.f1547f = obtainStyledAttributes.getFloat(index, this.f1547f);
                        break;
                    case 5:
                        this.f1548g = obtainStyledAttributes.getFloat(index, this.f1548g);
                        break;
                    case 6:
                        this.f1549h = obtainStyledAttributes.getDimension(index, this.f1549h);
                        break;
                    case 7:
                        this.f1550i = obtainStyledAttributes.getDimension(index, this.f1550i);
                        break;
                    case 8:
                        this.f1551j = obtainStyledAttributes.getDimension(index, this.f1551j);
                        break;
                    case 9:
                        this.f1552k = obtainStyledAttributes.getDimension(index, this.f1552k);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f1553l = obtainStyledAttributes.getDimension(index, this.f1553l);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT >= 21) {
                            this.f1554m = true;
                            this.f1555n = obtainStyledAttributes.getDimension(index, this.f1555n);
                            break;
                        } else {
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1456b = sparseIntArray;
        sparseIntArray.append(C0333i.f1859u0, 25);
        f1456b.append(C0333i.f1865v0, 26);
        f1456b.append(C0333i.f1877x0, 29);
        f1456b.append(C0333i.f1883y0, 30);
        f1456b.append(C0333i.f1598E0, 36);
        f1456b.append(C0333i.f1592D0, 35);
        f1456b.append(C0333i.f1744c0, 4);
        f1456b.append(C0333i.f1737b0, 3);
        f1456b.append(C0333i.f1723Z, 1);
        f1456b.append(C0333i.f1646M0, 6);
        f1456b.append(C0333i.f1652N0, 7);
        f1456b.append(C0333i.f1793j0, 17);
        f1456b.append(C0333i.f1799k0, 18);
        f1456b.append(C0333i.f1805l0, 19);
        f1456b.append(C0333i.f1846s, 27);
        f1456b.append(C0333i.f1889z0, 32);
        f1456b.append(C0333i.f1574A0, 33);
        f1456b.append(C0333i.f1786i0, 10);
        f1456b.append(C0333i.f1779h0, 9);
        f1456b.append(C0333i.f1670Q0, 13);
        f1456b.append(C0333i.f1688T0, 16);
        f1456b.append(C0333i.f1676R0, 14);
        f1456b.append(C0333i.f1658O0, 11);
        f1456b.append(C0333i.f1682S0, 15);
        f1456b.append(C0333i.f1664P0, 12);
        f1456b.append(C0333i.f1616H0, 40);
        f1456b.append(C0333i.f1847s0, 39);
        f1456b.append(C0333i.f1841r0, 41);
        f1456b.append(C0333i.f1610G0, 42);
        f1456b.append(C0333i.f1835q0, 20);
        f1456b.append(C0333i.f1604F0, 37);
        f1456b.append(C0333i.f1772g0, 5);
        f1456b.append(C0333i.f1853t0, 82);
        f1456b.append(C0333i.f1586C0, 82);
        f1456b.append(C0333i.f1871w0, 82);
        f1456b.append(C0333i.f1730a0, 82);
        f1456b.append(C0333i.f1717Y, 82);
        f1456b.append(C0333i.f1876x, 24);
        f1456b.append(C0333i.f1888z, 28);
        f1456b.append(C0333i.f1639L, 31);
        f1456b.append(C0333i.f1645M, 8);
        f1456b.append(C0333i.f1882y, 34);
        f1456b.append(C0333i.f1573A, 2);
        f1456b.append(C0333i.f1864v, 23);
        f1456b.append(C0333i.f1870w, 21);
        f1456b.append(C0333i.f1858u, 22);
        f1456b.append(C0333i.f1579B, 43);
        f1456b.append(C0333i.f1657O, 44);
        f1456b.append(C0333i.f1627J, 45);
        f1456b.append(C0333i.f1633K, 46);
        f1456b.append(C0333i.f1621I, 60);
        f1456b.append(C0333i.f1609G, 47);
        f1456b.append(C0333i.f1615H, 48);
        f1456b.append(C0333i.f1585C, 49);
        f1456b.append(C0333i.f1591D, 50);
        f1456b.append(C0333i.f1597E, 51);
        f1456b.append(C0333i.f1603F, 52);
        f1456b.append(C0333i.f1651N, 53);
        f1456b.append(C0333i.f1622I0, 54);
        f1456b.append(C0333i.f1811m0, 55);
        f1456b.append(C0333i.f1628J0, 56);
        f1456b.append(C0333i.f1817n0, 57);
        f1456b.append(C0333i.f1634K0, 58);
        f1456b.append(C0333i.f1823o0, 59);
        f1456b.append(C0333i.f1751d0, 61);
        f1456b.append(C0333i.f1765f0, 62);
        f1456b.append(C0333i.f1758e0, 63);
        f1456b.append(C0333i.f1663P, 64);
        f1456b.append(C0333i.f1712X0, 65);
        f1456b.append(C0333i.f1699V, 66);
        f1456b.append(C0333i.f1718Y0, 67);
        f1456b.append(C0333i.f1700V0, 79);
        f1456b.append(C0333i.f1852t, 38);
        f1456b.append(C0333i.f1694U0, 68);
        f1456b.append(C0333i.f1640L0, 69);
        f1456b.append(C0333i.f1829p0, 70);
        f1456b.append(C0333i.f1687T, 71);
        f1456b.append(C0333i.f1675R, 72);
        f1456b.append(C0333i.f1681S, 73);
        f1456b.append(C0333i.f1693U, 74);
        f1456b.append(C0333i.f1669Q, 75);
        f1456b.append(C0333i.f1706W0, 76);
        f1456b.append(C0333i.f1580B0, 77);
        f1456b.append(C0333i.f1724Z0, 78);
        f1456b.append(C0333i.f1711X, 80);
        f1456b.append(C0333i.f1705W, 81);
    }

    /* renamed from: h */
    private int[] m1619h(View view, String str) {
        int i;
        Object e;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0332h.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (e = ((ConstraintLayout) view.getParent()).mo1934e(0, trim)) != null && (e instanceof Integer)) {
                i = ((Integer) e).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: i */
    private C0323a m1620i(Context context, AttributeSet attributeSet) {
        C0323a aVar = new C0323a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0333i.f1840r);
        m1623n(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: j */
    private C0323a m1621j(int i) {
        if (!this.f1459e.containsKey(Integer.valueOf(i))) {
            this.f1459e.put(Integer.valueOf(i), new C0323a());
        }
        return this.f1459e.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static int m1622m(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: n */
    private void m1623n(Context context, C0323a aVar, TypedArray typedArray) {
        C0325c cVar;
        String str;
        String str2;
        StringBuilder sb;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == C0333i.f1852t || C0333i.f1639L == index || C0333i.f1645M == index)) {
                aVar.f1462c.f1530b = true;
                aVar.f1463d.f1496c = true;
                aVar.f1461b.f1537a = true;
                aVar.f1464e.f1543b = true;
            }
            switch (f1456b.get(index)) {
                case 1:
                    C0324b bVar = aVar.f1463d;
                    bVar.f1519q = m1622m(typedArray, index, bVar.f1519q);
                    continue;
                case 2:
                    C0324b bVar2 = aVar.f1463d;
                    bVar2.f1474H = typedArray.getDimensionPixelSize(index, bVar2.f1474H);
                    continue;
                case 3:
                    C0324b bVar3 = aVar.f1463d;
                    bVar3.f1518p = m1622m(typedArray, index, bVar3.f1518p);
                    continue;
                case 4:
                    C0324b bVar4 = aVar.f1463d;
                    bVar4.f1517o = m1622m(typedArray, index, bVar4.f1517o);
                    continue;
                case 5:
                    aVar.f1463d.f1526x = typedArray.getString(index);
                    continue;
                case 6:
                    C0324b bVar5 = aVar.f1463d;
                    bVar5.f1468B = typedArray.getDimensionPixelOffset(index, bVar5.f1468B);
                    continue;
                case 7:
                    C0324b bVar6 = aVar.f1463d;
                    bVar6.f1469C = typedArray.getDimensionPixelOffset(index, bVar6.f1469C);
                    continue;
                case 8:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C0324b bVar7 = aVar.f1463d;
                        bVar7.f1475I = typedArray.getDimensionPixelSize(index, bVar7.f1475I);
                    } else {
                        continue;
                    }
                case 9:
                    C0324b bVar8 = aVar.f1463d;
                    bVar8.f1523u = m1622m(typedArray, index, bVar8.f1523u);
                    continue;
                case 10:
                    C0324b bVar9 = aVar.f1463d;
                    bVar9.f1522t = m1622m(typedArray, index, bVar9.f1522t);
                    continue;
                case 11:
                    C0324b bVar10 = aVar.f1463d;
                    bVar10.f1480N = typedArray.getDimensionPixelSize(index, bVar10.f1480N);
                    continue;
                case 12:
                    C0324b bVar11 = aVar.f1463d;
                    bVar11.f1481O = typedArray.getDimensionPixelSize(index, bVar11.f1481O);
                    continue;
                case 13:
                    C0324b bVar12 = aVar.f1463d;
                    bVar12.f1477K = typedArray.getDimensionPixelSize(index, bVar12.f1477K);
                    continue;
                case 14:
                    C0324b bVar13 = aVar.f1463d;
                    bVar13.f1479M = typedArray.getDimensionPixelSize(index, bVar13.f1479M);
                    continue;
                case 15:
                    C0324b bVar14 = aVar.f1463d;
                    bVar14.f1482P = typedArray.getDimensionPixelSize(index, bVar14.f1482P);
                    continue;
                case 16:
                    C0324b bVar15 = aVar.f1463d;
                    bVar15.f1478L = typedArray.getDimensionPixelSize(index, bVar15.f1478L);
                    continue;
                case 17:
                    C0324b bVar16 = aVar.f1463d;
                    bVar16.f1502f = typedArray.getDimensionPixelOffset(index, bVar16.f1502f);
                    continue;
                case 18:
                    C0324b bVar17 = aVar.f1463d;
                    bVar17.f1504g = typedArray.getDimensionPixelOffset(index, bVar17.f1504g);
                    continue;
                case 19:
                    C0324b bVar18 = aVar.f1463d;
                    bVar18.f1506h = typedArray.getFloat(index, bVar18.f1506h);
                    continue;
                case 20:
                    C0324b bVar19 = aVar.f1463d;
                    bVar19.f1524v = typedArray.getFloat(index, bVar19.f1524v);
                    continue;
                case 21:
                    C0324b bVar20 = aVar.f1463d;
                    bVar20.f1500e = typedArray.getLayoutDimension(index, bVar20.f1500e);
                    continue;
                case 22:
                    C0326d dVar = aVar.f1461b;
                    dVar.f1538b = typedArray.getInt(index, dVar.f1538b);
                    C0326d dVar2 = aVar.f1461b;
                    dVar2.f1538b = f1455a[dVar2.f1538b];
                    continue;
                case 23:
                    C0324b bVar21 = aVar.f1463d;
                    bVar21.f1498d = typedArray.getLayoutDimension(index, bVar21.f1498d);
                    continue;
                case 24:
                    C0324b bVar22 = aVar.f1463d;
                    bVar22.f1471E = typedArray.getDimensionPixelSize(index, bVar22.f1471E);
                    continue;
                case 25:
                    C0324b bVar23 = aVar.f1463d;
                    bVar23.f1508i = m1622m(typedArray, index, bVar23.f1508i);
                    continue;
                case 26:
                    C0324b bVar24 = aVar.f1463d;
                    bVar24.f1510j = m1622m(typedArray, index, bVar24.f1510j);
                    continue;
                case 27:
                    C0324b bVar25 = aVar.f1463d;
                    bVar25.f1470D = typedArray.getInt(index, bVar25.f1470D);
                    continue;
                case 28:
                    C0324b bVar26 = aVar.f1463d;
                    bVar26.f1472F = typedArray.getDimensionPixelSize(index, bVar26.f1472F);
                    continue;
                case 29:
                    C0324b bVar27 = aVar.f1463d;
                    bVar27.f1512k = m1622m(typedArray, index, bVar27.f1512k);
                    continue;
                case 30:
                    C0324b bVar28 = aVar.f1463d;
                    bVar28.f1514l = m1622m(typedArray, index, bVar28.f1514l);
                    continue;
                case 31:
                    if (Build.VERSION.SDK_INT >= 17) {
                        C0324b bVar29 = aVar.f1463d;
                        bVar29.f1476J = typedArray.getDimensionPixelSize(index, bVar29.f1476J);
                    } else {
                        continue;
                    }
                case 32:
                    C0324b bVar30 = aVar.f1463d;
                    bVar30.f1520r = m1622m(typedArray, index, bVar30.f1520r);
                    continue;
                case 33:
                    C0324b bVar31 = aVar.f1463d;
                    bVar31.f1521s = m1622m(typedArray, index, bVar31.f1521s);
                    continue;
                case 34:
                    C0324b bVar32 = aVar.f1463d;
                    bVar32.f1473G = typedArray.getDimensionPixelSize(index, bVar32.f1473G);
                    continue;
                case 35:
                    C0324b bVar33 = aVar.f1463d;
                    bVar33.f1516n = m1622m(typedArray, index, bVar33.f1516n);
                    continue;
                case 36:
                    C0324b bVar34 = aVar.f1463d;
                    bVar34.f1515m = m1622m(typedArray, index, bVar34.f1515m);
                    continue;
                case 37:
                    C0324b bVar35 = aVar.f1463d;
                    bVar35.f1525w = typedArray.getFloat(index, bVar35.f1525w);
                    continue;
                case 38:
                    aVar.f1460a = typedArray.getResourceId(index, aVar.f1460a);
                    continue;
                case 39:
                    C0324b bVar36 = aVar.f1463d;
                    bVar36.f1484R = typedArray.getFloat(index, bVar36.f1484R);
                    continue;
                case 40:
                    C0324b bVar37 = aVar.f1463d;
                    bVar37.f1483Q = typedArray.getFloat(index, bVar37.f1483Q);
                    continue;
                case 41:
                    C0324b bVar38 = aVar.f1463d;
                    bVar38.f1485S = typedArray.getInt(index, bVar38.f1485S);
                    continue;
                case 42:
                    C0324b bVar39 = aVar.f1463d;
                    bVar39.f1486T = typedArray.getInt(index, bVar39.f1486T);
                    continue;
                case 43:
                    C0326d dVar3 = aVar.f1461b;
                    dVar3.f1540d = typedArray.getFloat(index, dVar3.f1540d);
                    continue;
                case 44:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0327e eVar = aVar.f1464e;
                        eVar.f1554m = true;
                        eVar.f1555n = typedArray.getDimension(index, eVar.f1555n);
                    } else {
                        continue;
                    }
                case 45:
                    C0327e eVar2 = aVar.f1464e;
                    eVar2.f1545d = typedArray.getFloat(index, eVar2.f1545d);
                    continue;
                case 46:
                    C0327e eVar3 = aVar.f1464e;
                    eVar3.f1546e = typedArray.getFloat(index, eVar3.f1546e);
                    continue;
                case 47:
                    C0327e eVar4 = aVar.f1464e;
                    eVar4.f1547f = typedArray.getFloat(index, eVar4.f1547f);
                    continue;
                case 48:
                    C0327e eVar5 = aVar.f1464e;
                    eVar5.f1548g = typedArray.getFloat(index, eVar5.f1548g);
                    continue;
                case 49:
                    C0327e eVar6 = aVar.f1464e;
                    eVar6.f1549h = typedArray.getDimension(index, eVar6.f1549h);
                    continue;
                case 50:
                    C0327e eVar7 = aVar.f1464e;
                    eVar7.f1550i = typedArray.getDimension(index, eVar7.f1550i);
                    continue;
                case 51:
                    C0327e eVar8 = aVar.f1464e;
                    eVar8.f1551j = typedArray.getDimension(index, eVar8.f1551j);
                    continue;
                case 52:
                    C0327e eVar9 = aVar.f1464e;
                    eVar9.f1552k = typedArray.getDimension(index, eVar9.f1552k);
                    continue;
                case 53:
                    if (Build.VERSION.SDK_INT >= 21) {
                        C0327e eVar10 = aVar.f1464e;
                        eVar10.f1553l = typedArray.getDimension(index, eVar10.f1553l);
                    } else {
                        continue;
                    }
                case 54:
                    C0324b bVar40 = aVar.f1463d;
                    bVar40.f1487U = typedArray.getInt(index, bVar40.f1487U);
                    continue;
                case 55:
                    C0324b bVar41 = aVar.f1463d;
                    bVar41.f1488V = typedArray.getInt(index, bVar41.f1488V);
                    continue;
                case 56:
                    C0324b bVar42 = aVar.f1463d;
                    bVar42.f1489W = typedArray.getDimensionPixelSize(index, bVar42.f1489W);
                    continue;
                case 57:
                    C0324b bVar43 = aVar.f1463d;
                    bVar43.f1490X = typedArray.getDimensionPixelSize(index, bVar43.f1490X);
                    continue;
                case 58:
                    C0324b bVar44 = aVar.f1463d;
                    bVar44.f1491Y = typedArray.getDimensionPixelSize(index, bVar44.f1491Y);
                    continue;
                case 59:
                    C0324b bVar45 = aVar.f1463d;
                    bVar45.f1492Z = typedArray.getDimensionPixelSize(index, bVar45.f1492Z);
                    continue;
                case 60:
                    C0327e eVar11 = aVar.f1464e;
                    eVar11.f1544c = typedArray.getFloat(index, eVar11.f1544c);
                    continue;
                case 61:
                    C0324b bVar46 = aVar.f1463d;
                    bVar46.f1527y = m1622m(typedArray, index, bVar46.f1527y);
                    continue;
                case 62:
                    C0324b bVar47 = aVar.f1463d;
                    bVar47.f1528z = typedArray.getDimensionPixelSize(index, bVar47.f1528z);
                    continue;
                case 63:
                    C0324b bVar48 = aVar.f1463d;
                    bVar48.f1467A = typedArray.getFloat(index, bVar48.f1467A);
                    continue;
                case 64:
                    C0325c cVar2 = aVar.f1462c;
                    cVar2.f1531c = m1622m(typedArray, index, cVar2.f1531c);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f1462c;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f1462c;
                        str = C0840a.f4129b[typedArray.getInteger(index, 0)];
                    }
                    cVar.f1532d = str;
                    continue;
                case 66:
                    aVar.f1462c.f1534f = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    C0325c cVar3 = aVar.f1462c;
                    cVar3.f1536h = typedArray.getFloat(index, cVar3.f1536h);
                    continue;
                case 68:
                    C0326d dVar4 = aVar.f1461b;
                    dVar4.f1541e = typedArray.getFloat(index, dVar4.f1541e);
                    continue;
                case 69:
                    aVar.f1463d.f1493a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f1463d.f1495b0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    C0324b bVar49 = aVar.f1463d;
                    bVar49.f1497c0 = typedArray.getInt(index, bVar49.f1497c0);
                    continue;
                case 73:
                    C0324b bVar50 = aVar.f1463d;
                    bVar50.f1499d0 = typedArray.getDimensionPixelSize(index, bVar50.f1499d0);
                    continue;
                case 74:
                    aVar.f1463d.f1505g0 = typedArray.getString(index);
                    continue;
                case 75:
                    C0324b bVar51 = aVar.f1463d;
                    bVar51.f1513k0 = typedArray.getBoolean(index, bVar51.f1513k0);
                    continue;
                case 76:
                    C0325c cVar4 = aVar.f1462c;
                    cVar4.f1533e = typedArray.getInt(index, cVar4.f1533e);
                    continue;
                case 77:
                    aVar.f1463d.f1507h0 = typedArray.getString(index);
                    continue;
                case 78:
                    C0326d dVar5 = aVar.f1461b;
                    dVar5.f1539c = typedArray.getInt(index, dVar5.f1539c);
                    continue;
                case 79:
                    C0325c cVar5 = aVar.f1462c;
                    cVar5.f1535g = typedArray.getFloat(index, cVar5.f1535g);
                    continue;
                case 80:
                    C0324b bVar52 = aVar.f1463d;
                    bVar52.f1509i0 = typedArray.getBoolean(index, bVar52.f1509i0);
                    continue;
                case 81:
                    C0324b bVar53 = aVar.f1463d;
                    bVar53.f1511j0 = typedArray.getBoolean(index, bVar53.f1511j0);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f1456b.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
    }

    /* renamed from: c */
    public void mo1994c(ConstraintLayout constraintLayout) {
        mo1995d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo1995d(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1459e.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f1459e.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + C0841a.m4921a(childAt));
            } else if (this.f1458d && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f1459e.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0323a aVar = this.f1459e.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.f1463d.f1501e0 = 1;
                    }
                    int i2 = aVar.f1463d.f1501e0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f1463d.f1497c0);
                        barrier.setMargin(aVar.f1463d.f1499d0);
                        barrier.setAllowsGoneWidget(aVar.f1463d.f1513k0);
                        C0324b bVar = aVar.f1463d;
                        int[] iArr = bVar.f1503f0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f1505g0;
                            if (str != null) {
                                bVar.f1503f0 = m1619h(barrier, str);
                                barrier.setReferencedIds(aVar.f1463d.f1503f0);
                            }
                        }
                    }
                    ConstraintLayout.C0312b bVar2 = (ConstraintLayout.C0312b) childAt.getLayoutParams();
                    bVar2.mo1967a();
                    aVar.mo2004d(bVar2);
                    if (z) {
                        C0315a.m1598c(childAt, aVar.f1465f);
                    }
                    childAt.setLayoutParams(bVar2);
                    C0326d dVar = aVar.f1461b;
                    if (dVar.f1539c == 0) {
                        childAt.setVisibility(dVar.f1538b);
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 17) {
                        childAt.setAlpha(aVar.f1461b.f1540d);
                        childAt.setRotation(aVar.f1464e.f1544c);
                        childAt.setRotationX(aVar.f1464e.f1545d);
                        childAt.setRotationY(aVar.f1464e.f1546e);
                        childAt.setScaleX(aVar.f1464e.f1547f);
                        childAt.setScaleY(aVar.f1464e.f1548g);
                        if (!Float.isNaN(aVar.f1464e.f1549h)) {
                            childAt.setPivotX(aVar.f1464e.f1549h);
                        }
                        if (!Float.isNaN(aVar.f1464e.f1550i)) {
                            childAt.setPivotY(aVar.f1464e.f1550i);
                        }
                        childAt.setTranslationX(aVar.f1464e.f1551j);
                        childAt.setTranslationY(aVar.f1464e.f1552k);
                        if (i3 >= 21) {
                            childAt.setTranslationZ(aVar.f1464e.f1553l);
                            C0327e eVar = aVar.f1464e;
                            if (eVar.f1554m) {
                                childAt.setElevation(eVar.f1555n);
                            }
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0323a aVar2 = this.f1459e.get(num);
            int i4 = aVar2.f1463d.f1501e0;
            if (i4 != -1 && i4 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C0324b bVar3 = aVar2.f1463d;
                int[] iArr2 = bVar3.f1503f0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f1505g0;
                    if (str2 != null) {
                        bVar3.f1503f0 = m1619h(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f1463d.f1503f0);
                    }
                }
                barrier2.setType(aVar2.f1463d.f1497c0);
                barrier2.setMargin(aVar2.f1463d.f1499d0);
                ConstraintLayout.C0312b c = constraintLayout.generateDefaultLayoutParams();
                barrier2.mo1986m();
                aVar2.mo2004d(c);
                constraintLayout.addView(barrier2, c);
            }
            if (aVar2.f1463d.f1494b) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.C0312b c2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.mo2004d(c2);
                constraintLayout.addView(guideline, c2);
            }
        }
    }

    /* renamed from: e */
    public void mo1996e(Context context, int i) {
        mo1997f((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: f */
    public void mo1997f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1459e.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C0312b bVar = (ConstraintLayout.C0312b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1458d || id != -1) {
                if (!this.f1459e.containsKey(Integer.valueOf(id))) {
                    this.f1459e.put(Integer.valueOf(id), new C0323a());
                }
                C0323a aVar = this.f1459e.get(Integer.valueOf(id));
                aVar.f1465f = C0315a.m1596a(this.f1457c, childAt);
                aVar.m1636f(id, bVar);
                aVar.f1461b.f1538b = childAt.getVisibility();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 17) {
                    aVar.f1461b.f1540d = childAt.getAlpha();
                    aVar.f1464e.f1544c = childAt.getRotation();
                    aVar.f1464e.f1545d = childAt.getRotationX();
                    aVar.f1464e.f1546e = childAt.getRotationY();
                    aVar.f1464e.f1547f = childAt.getScaleX();
                    aVar.f1464e.f1548g = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        C0327e eVar = aVar.f1464e;
                        eVar.f1549h = pivotX;
                        eVar.f1550i = pivotY;
                    }
                    aVar.f1464e.f1551j = childAt.getTranslationX();
                    aVar.f1464e.f1552k = childAt.getTranslationY();
                    if (i2 >= 21) {
                        aVar.f1464e.f1553l = childAt.getTranslationZ();
                        C0327e eVar2 = aVar.f1464e;
                        if (eVar2.f1554m) {
                            eVar2.f1555n = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f1463d.f1513k0 = barrier.mo1923n();
                    aVar.f1463d.f1503f0 = barrier.getReferencedIds();
                    aVar.f1463d.f1497c0 = barrier.getType();
                    aVar.f1463d.f1499d0 = barrier.getMargin();
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: g */
    public void mo1998g(C0328e eVar) {
        int childCount = eVar.getChildCount();
        this.f1459e.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = eVar.getChildAt(i);
            C0328e.C0329a aVar = (C0328e.C0329a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1458d || id != -1) {
                if (!this.f1459e.containsKey(Integer.valueOf(id))) {
                    this.f1459e.put(Integer.valueOf(id), new C0323a());
                }
                C0323a aVar2 = this.f1459e.get(Integer.valueOf(id));
                if (childAt instanceof AbstractC0318b) {
                    aVar2.m1638h((AbstractC0318b) childAt, id, aVar);
                }
                aVar2.m1637g(id, aVar);
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: k */
    public void mo1999k(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0323a i2 = m1620i(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        i2.f1463d.f1494b = true;
                    }
                    this.f1459e.put(Integer.valueOf(i2.f1460a), i2);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        if (r0.equals("PropertySet") != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0179, code lost:
        continue;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2000l(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
        // Method dump skipped, instructions count: 448
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0322d.mo2000l(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: o */
    public void mo2001o(int i, int i2) {
        m1621j(i).f1463d.f1502f = i2;
        m1621j(i).f1463d.f1504g = -1;
        m1621j(i).f1463d.f1506h = -1.0f;
    }

    /* renamed from: p */
    public void mo2002p(int i, int i2) {
        m1621j(i).f1463d.f1504g = i2;
        m1621j(i).f1463d.f1502f = -1;
        m1621j(i).f1463d.f1506h = -1.0f;
    }
}
