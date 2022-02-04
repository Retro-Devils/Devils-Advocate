package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.c */
public class C0319c {

    /* renamed from: a */
    private final ConstraintLayout f1440a;

    /* renamed from: b */
    int f1441b = -1;

    /* renamed from: c */
    int f1442c = -1;

    /* renamed from: d */
    private SparseArray<C0320a> f1443d = new SparseArray<>();

    /* renamed from: e */
    private SparseArray<C0322d> f1444e = new SparseArray<>();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.c$a */
    public static class C0320a {

        /* renamed from: a */
        int f1445a;

        /* renamed from: b */
        ArrayList<C0321b> f1446b = new ArrayList<>();

        /* renamed from: c */
        int f1447c = -1;

        /* renamed from: d */
        C0322d f1448d;

        public C0320a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0333i.f1602E4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0333i.f1608F4) {
                    this.f1445a = obtainStyledAttributes.getResourceId(index, this.f1445a);
                } else if (index == C0333i.f1614G4) {
                    this.f1447c = obtainStyledAttributes.getResourceId(index, this.f1447c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1447c);
                    context.getResources().getResourceName(this.f1447c);
                    if ("layout".equals(resourceTypeName)) {
                        C0322d dVar = new C0322d();
                        this.f1448d = dVar;
                        dVar.mo1996e(context, this.f1447c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1993a(C0321b bVar) {
            this.f1446b.add(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.c$b */
    public static class C0321b {

        /* renamed from: a */
        float f1449a = Float.NaN;

        /* renamed from: b */
        float f1450b = Float.NaN;

        /* renamed from: c */
        float f1451c = Float.NaN;

        /* renamed from: d */
        float f1452d = Float.NaN;

        /* renamed from: e */
        int f1453e = -1;

        /* renamed from: f */
        C0322d f1454f;

        public C0321b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0333i.f1735a5);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0333i.f1742b5) {
                    this.f1453e = obtainStyledAttributes.getResourceId(index, this.f1453e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1453e);
                    context.getResources().getResourceName(this.f1453e);
                    if ("layout".equals(resourceTypeName)) {
                        C0322d dVar = new C0322d();
                        this.f1454f = dVar;
                        dVar.mo1996e(context, this.f1453e);
                    }
                } else if (index == C0333i.f1749c5) {
                    this.f1452d = obtainStyledAttributes.getDimension(index, this.f1452d);
                } else if (index == C0333i.f1756d5) {
                    this.f1450b = obtainStyledAttributes.getDimension(index, this.f1450b);
                } else if (index == C0333i.f1763e5) {
                    this.f1451c = obtainStyledAttributes.getDimension(index, this.f1451c);
                } else if (index == C0333i.f1770f5) {
                    this.f1449a = obtainStyledAttributes.getDimension(index, this.f1449a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    C0319c(Context context, ConstraintLayout constraintLayout, int i) {
        this.f1440a = constraintLayout;
        m1613a(context, i);
    }

    /* renamed from: a */
    private void m1613a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        C0320a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (!(c == 0 || c == 1)) {
                        if (c == 2) {
                            aVar = new C0320a(context, xml);
                            this.f1443d.put(aVar.f1445a, aVar);
                        } else if (c == 3) {
                            C0321b bVar = new C0321b(context, xml);
                            if (aVar != null) {
                                aVar.mo1993a(bVar);
                            }
                        } else if (c != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            m1614b(context, xml);
                        }
                    }
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m1614b(Context context, XmlPullParser xmlPullParser) {
        C0322d dVar = new C0322d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.mo2000l(context, xmlPullParser);
                this.f1444e.put(identifier, dVar);
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo1992c(AbstractC0330f fVar) {
    }
}
