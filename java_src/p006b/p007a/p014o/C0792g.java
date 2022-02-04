package p006b.p007a.p014o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0134i;
import androidx.appcompat.view.menu.MenuItemC0136j;
import androidx.appcompat.widget.C0216d0;
import androidx.appcompat.widget.C0296w0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p007a.C0763j;
import p006b.p030g.p032e.p033a.AbstractMenuC0917a;
import p006b.p030g.p039k.AbstractC0974b;
import p006b.p030g.p039k.C1002h;

/* renamed from: b.a.o.g */
public class C0792g extends MenuInflater {

    /* renamed from: a */
    static final Class<?>[] f3953a;

    /* renamed from: b */
    static final Class<?>[] f3954b;

    /* renamed from: c */
    final Object[] f3955c;

    /* renamed from: d */
    final Object[] f3956d;

    /* renamed from: e */
    Context f3957e;

    /* renamed from: f */
    private Object f3958f;

    /* access modifiers changed from: private */
    /* renamed from: b.a.o.g$a */
    public static class MenuItem$OnMenuItemClickListenerC0793a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f3959a = {MenuItem.class};

        /* renamed from: b */
        private Object f3960b;

        /* renamed from: c */
        private Method f3961c;

        public MenuItem$OnMenuItemClickListenerC0793a(Object obj, String str) {
            this.f3960b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f3961c = cls.getMethod(str, f3959a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f3961c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f3961c.invoke(this.f3960b, menuItem)).booleanValue();
                }
                this.f3961c.invoke(this.f3960b, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.a.o.g$b */
    public class C0794b {

        /* renamed from: A */
        AbstractC0974b f3962A;

        /* renamed from: B */
        private CharSequence f3963B;

        /* renamed from: C */
        private CharSequence f3964C;

        /* renamed from: D */
        private ColorStateList f3965D = null;

        /* renamed from: E */
        private PorterDuff.Mode f3966E = null;

        /* renamed from: a */
        private Menu f3968a;

        /* renamed from: b */
        private int f3969b;

        /* renamed from: c */
        private int f3970c;

        /* renamed from: d */
        private int f3971d;

        /* renamed from: e */
        private int f3972e;

        /* renamed from: f */
        private boolean f3973f;

        /* renamed from: g */
        private boolean f3974g;

        /* renamed from: h */
        private boolean f3975h;

        /* renamed from: i */
        private int f3976i;

        /* renamed from: j */
        private int f3977j;

        /* renamed from: k */
        private CharSequence f3978k;

        /* renamed from: l */
        private CharSequence f3979l;

        /* renamed from: m */
        private int f3980m;

        /* renamed from: n */
        private char f3981n;

        /* renamed from: o */
        private int f3982o;

        /* renamed from: p */
        private char f3983p;

        /* renamed from: q */
        private int f3984q;

        /* renamed from: r */
        private int f3985r;

        /* renamed from: s */
        private boolean f3986s;

        /* renamed from: t */
        private boolean f3987t;

        /* renamed from: u */
        private boolean f3988u;

        /* renamed from: v */
        private int f3989v;

        /* renamed from: w */
        private int f3990w;

        /* renamed from: x */
        private String f3991x;

        /* renamed from: y */
        private String f3992y;

        /* renamed from: z */
        private String f3993z;

        public C0794b(Menu menu) {
            this.f3968a = menu;
            mo4723h();
        }

        /* renamed from: c */
        private char m4663c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m4664e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0792g.this.f3957e.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m4665i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f3986s).setVisible(this.f3987t).setEnabled(this.f3988u).setCheckable(this.f3985r >= 1).setTitleCondensed(this.f3979l).setIcon(this.f3980m);
            int i = this.f3989v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f3993z != null) {
                if (!C0792g.this.f3957e.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC0793a(C0792g.this.mo4715b(), this.f3993z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f3985r >= 2) {
                if (menuItem instanceof C0134i) {
                    ((C0134i) menuItem).mo742t(true);
                } else if (menuItem instanceof MenuItemC0136j) {
                    ((MenuItemC0136j) menuItem).mo772h(true);
                }
            }
            String str = this.f3991x;
            if (str != null) {
                menuItem.setActionView((View) m4664e(str, C0792g.f3953a, C0792g.this.f3955c));
                z = true;
            }
            int i2 = this.f3990w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC0974b bVar = this.f3962A;
            if (bVar != null) {
                C1002h.m5682a(menuItem, bVar);
            }
            C1002h.m5684c(menuItem, this.f3963B);
            C1002h.m5688g(menuItem, this.f3964C);
            C1002h.m5683b(menuItem, this.f3981n, this.f3982o);
            C1002h.m5687f(menuItem, this.f3983p, this.f3984q);
            PorterDuff.Mode mode = this.f3966E;
            if (mode != null) {
                C1002h.m5686e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f3965D;
            if (colorStateList != null) {
                C1002h.m5685d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo4718a() {
            this.f3975h = true;
            m4665i(this.f3968a.add(this.f3969b, this.f3976i, this.f3977j, this.f3978k));
        }

        /* renamed from: b */
        public SubMenu mo4719b() {
            this.f3975h = true;
            SubMenu addSubMenu = this.f3968a.addSubMenu(this.f3969b, this.f3976i, this.f3977j, this.f3978k);
            m4665i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo4720d() {
            return this.f3975h;
        }

        /* renamed from: f */
        public void mo4721f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0792g.this.f3957e.obtainStyledAttributes(attributeSet, C0763j.f3793r1);
            this.f3969b = obtainStyledAttributes.getResourceId(C0763j.f3803t1, 0);
            this.f3970c = obtainStyledAttributes.getInt(C0763j.f3813v1, 0);
            this.f3971d = obtainStyledAttributes.getInt(C0763j.f3818w1, 0);
            this.f3972e = obtainStyledAttributes.getInt(C0763j.f3823x1, 0);
            this.f3973f = obtainStyledAttributes.getBoolean(C0763j.f3808u1, true);
            this.f3974g = obtainStyledAttributes.getBoolean(C0763j.f3798s1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v54, resolved type: int */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void mo4722g(AttributeSet attributeSet) {
            C0296w0 u = C0296w0.m1431u(C0792g.this.f3957e, attributeSet, C0763j.f3828y1);
            this.f3976i = u.mo1817n(C0763j.f3584B1, 0);
            this.f3977j = (u.mo1814k(C0763j.f3599E1, this.f3970c) & -65536) | (u.mo1814k(C0763j.f3604F1, this.f3971d) & 65535);
            this.f3978k = u.mo1819p(C0763j.f3609G1);
            this.f3979l = u.mo1819p(C0763j.f3614H1);
            this.f3980m = u.mo1817n(C0763j.f3833z1, 0);
            this.f3981n = m4663c(u.mo1818o(C0763j.f3619I1));
            this.f3982o = u.mo1814k(C0763j.f3654P1, 4096);
            this.f3983p = m4663c(u.mo1818o(C0763j.f3624J1));
            this.f3984q = u.mo1814k(C0763j.f3674T1, 4096);
            int i = C0763j.f3629K1;
            this.f3985r = u.mo1822s(i) ? u.mo1804a(i, false) : this.f3972e ? 1 : 0;
            this.f3986s = u.mo1804a(C0763j.f3589C1, false);
            this.f3987t = u.mo1804a(C0763j.f3594D1, this.f3973f);
            this.f3988u = u.mo1804a(C0763j.f3579A1, this.f3974g);
            this.f3989v = u.mo1814k(C0763j.f3679U1, -1);
            this.f3993z = u.mo1818o(C0763j.f3634L1);
            this.f3990w = u.mo1817n(C0763j.f3639M1, 0);
            this.f3991x = u.mo1818o(C0763j.f3649O1);
            String o = u.mo1818o(C0763j.f3644N1);
            this.f3992y = o;
            boolean z = o != null;
            if (z && this.f3990w == 0 && this.f3991x == null) {
                this.f3962A = (AbstractC0974b) m4664e(o, C0792g.f3954b, C0792g.this.f3956d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f3962A = null;
            }
            this.f3963B = u.mo1819p(C0763j.f3659Q1);
            this.f3964C = u.mo1819p(C0763j.f3684V1);
            int i2 = C0763j.f3669S1;
            if (u.mo1822s(i2)) {
                this.f3966E = C0216d0.m1138e(u.mo1814k(i2, -1), this.f3966E);
            } else {
                this.f3966E = null;
            }
            int i3 = C0763j.f3664R1;
            if (u.mo1822s(i3)) {
                this.f3965D = u.mo1806c(i3);
            } else {
                this.f3965D = null;
            }
            u.mo1823w();
            this.f3975h = false;
        }

        /* renamed from: h */
        public void mo4723h() {
            this.f3969b = 0;
            this.f3970c = 0;
            this.f3971d = 0;
            this.f3972e = 0;
            this.f3973f = true;
            this.f3974g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f3953a = clsArr;
        f3954b = clsArr;
    }

    public C0792g(Context context) {
        super(context);
        this.f3957e = context;
        Object[] objArr = {context};
        this.f3955c = objArr;
        this.f3956d = objArr;
    }

    /* renamed from: a */
    private Object m4660a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m4660a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* renamed from: c */
    private void m4661c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        C0794b bVar = new C0794b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.mo4723h();
                        } else if (name2.equals("item")) {
                            if (!bVar.mo4720d()) {
                                AbstractC0974b bVar2 = bVar.f3962A;
                                if (bVar2 == null || !bVar2.mo806a()) {
                                    bVar.mo4718a();
                                } else {
                                    bVar.mo4719b();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.mo4721f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.mo4722g(attributeSet);
                    } else if (name3.equals("menu")) {
                        m4661c(xmlPullParser, attributeSet, bVar.mo4719b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object mo4715b() {
        if (this.f3958f == null) {
            this.f3958f = m4660a(this.f3957e);
        }
        return this.f3958f;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof AbstractMenuC0917a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f3957e.getResources().getLayout(i);
            m4661c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException("Error inflating menu XML", e);
        } catch (IOException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
