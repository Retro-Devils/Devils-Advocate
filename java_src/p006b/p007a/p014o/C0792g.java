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
    static final Class<?>[] f3949a;

    /* renamed from: b */
    static final Class<?>[] f3950b;

    /* renamed from: c */
    final Object[] f3951c;

    /* renamed from: d */
    final Object[] f3952d;

    /* renamed from: e */
    Context f3953e;

    /* renamed from: f */
    private Object f3954f;

    /* access modifiers changed from: private */
    /* renamed from: b.a.o.g$a */
    public static class MenuItem$OnMenuItemClickListenerC0793a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f3955a = {MenuItem.class};

        /* renamed from: b */
        private Object f3956b;

        /* renamed from: c */
        private Method f3957c;

        public MenuItem$OnMenuItemClickListenerC0793a(Object obj, String str) {
            this.f3956b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f3957c = cls.getMethod(str, f3955a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f3957c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f3957c.invoke(this.f3956b, menuItem)).booleanValue();
                }
                this.f3957c.invoke(this.f3956b, menuItem);
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
        AbstractC0974b f3958A;

        /* renamed from: B */
        private CharSequence f3959B;

        /* renamed from: C */
        private CharSequence f3960C;

        /* renamed from: D */
        private ColorStateList f3961D = null;

        /* renamed from: E */
        private PorterDuff.Mode f3962E = null;

        /* renamed from: a */
        private Menu f3964a;

        /* renamed from: b */
        private int f3965b;

        /* renamed from: c */
        private int f3966c;

        /* renamed from: d */
        private int f3967d;

        /* renamed from: e */
        private int f3968e;

        /* renamed from: f */
        private boolean f3969f;

        /* renamed from: g */
        private boolean f3970g;

        /* renamed from: h */
        private boolean f3971h;

        /* renamed from: i */
        private int f3972i;

        /* renamed from: j */
        private int f3973j;

        /* renamed from: k */
        private CharSequence f3974k;

        /* renamed from: l */
        private CharSequence f3975l;

        /* renamed from: m */
        private int f3976m;

        /* renamed from: n */
        private char f3977n;

        /* renamed from: o */
        private int f3978o;

        /* renamed from: p */
        private char f3979p;

        /* renamed from: q */
        private int f3980q;

        /* renamed from: r */
        private int f3981r;

        /* renamed from: s */
        private boolean f3982s;

        /* renamed from: t */
        private boolean f3983t;

        /* renamed from: u */
        private boolean f3984u;

        /* renamed from: v */
        private int f3985v;

        /* renamed from: w */
        private int f3986w;

        /* renamed from: x */
        private String f3987x;

        /* renamed from: y */
        private String f3988y;

        /* renamed from: z */
        private String f3989z;

        public C0794b(Menu menu) {
            this.f3964a = menu;
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
                Constructor<?> constructor = Class.forName(str, false, C0792g.this.f3953e.getClassLoader()).getConstructor(clsArr);
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
            menuItem.setChecked(this.f3982s).setVisible(this.f3983t).setEnabled(this.f3984u).setCheckable(this.f3981r >= 1).setTitleCondensed(this.f3975l).setIcon(this.f3976m);
            int i = this.f3985v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f3989z != null) {
                if (!C0792g.this.f3953e.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC0793a(C0792g.this.mo4715b(), this.f3989z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f3981r >= 2) {
                if (menuItem instanceof C0134i) {
                    ((C0134i) menuItem).mo742t(true);
                } else if (menuItem instanceof MenuItemC0136j) {
                    ((MenuItemC0136j) menuItem).mo772h(true);
                }
            }
            String str = this.f3987x;
            if (str != null) {
                menuItem.setActionView((View) m4664e(str, C0792g.f3949a, C0792g.this.f3951c));
                z = true;
            }
            int i2 = this.f3986w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC0974b bVar = this.f3958A;
            if (bVar != null) {
                C1002h.m5682a(menuItem, bVar);
            }
            C1002h.m5684c(menuItem, this.f3959B);
            C1002h.m5688g(menuItem, this.f3960C);
            C1002h.m5683b(menuItem, this.f3977n, this.f3978o);
            C1002h.m5687f(menuItem, this.f3979p, this.f3980q);
            PorterDuff.Mode mode = this.f3962E;
            if (mode != null) {
                C1002h.m5686e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f3961D;
            if (colorStateList != null) {
                C1002h.m5685d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void mo4718a() {
            this.f3971h = true;
            m4665i(this.f3964a.add(this.f3965b, this.f3972i, this.f3973j, this.f3974k));
        }

        /* renamed from: b */
        public SubMenu mo4719b() {
            this.f3971h = true;
            SubMenu addSubMenu = this.f3964a.addSubMenu(this.f3965b, this.f3972i, this.f3973j, this.f3974k);
            m4665i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean mo4720d() {
            return this.f3971h;
        }

        /* renamed from: f */
        public void mo4721f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0792g.this.f3953e.obtainStyledAttributes(attributeSet, C0763j.f3789r1);
            this.f3965b = obtainStyledAttributes.getResourceId(C0763j.f3799t1, 0);
            this.f3966c = obtainStyledAttributes.getInt(C0763j.f3809v1, 0);
            this.f3967d = obtainStyledAttributes.getInt(C0763j.f3814w1, 0);
            this.f3968e = obtainStyledAttributes.getInt(C0763j.f3819x1, 0);
            this.f3969f = obtainStyledAttributes.getBoolean(C0763j.f3804u1, true);
            this.f3970g = obtainStyledAttributes.getBoolean(C0763j.f3794s1, true);
            obtainStyledAttributes.recycle();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v54, resolved type: int */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void mo4722g(AttributeSet attributeSet) {
            C0296w0 u = C0296w0.m1431u(C0792g.this.f3953e, attributeSet, C0763j.f3824y1);
            this.f3972i = u.mo1817n(C0763j.f3580B1, 0);
            this.f3973j = (u.mo1814k(C0763j.f3595E1, this.f3966c) & -65536) | (u.mo1814k(C0763j.f3600F1, this.f3967d) & 65535);
            this.f3974k = u.mo1819p(C0763j.f3605G1);
            this.f3975l = u.mo1819p(C0763j.f3610H1);
            this.f3976m = u.mo1817n(C0763j.f3829z1, 0);
            this.f3977n = m4663c(u.mo1818o(C0763j.f3615I1));
            this.f3978o = u.mo1814k(C0763j.f3650P1, 4096);
            this.f3979p = m4663c(u.mo1818o(C0763j.f3620J1));
            this.f3980q = u.mo1814k(C0763j.f3670T1, 4096);
            int i = C0763j.f3625K1;
            this.f3981r = u.mo1822s(i) ? u.mo1804a(i, false) : this.f3968e ? 1 : 0;
            this.f3982s = u.mo1804a(C0763j.f3585C1, false);
            this.f3983t = u.mo1804a(C0763j.f3590D1, this.f3969f);
            this.f3984u = u.mo1804a(C0763j.f3575A1, this.f3970g);
            this.f3985v = u.mo1814k(C0763j.f3675U1, -1);
            this.f3989z = u.mo1818o(C0763j.f3630L1);
            this.f3986w = u.mo1817n(C0763j.f3635M1, 0);
            this.f3987x = u.mo1818o(C0763j.f3645O1);
            String o = u.mo1818o(C0763j.f3640N1);
            this.f3988y = o;
            boolean z = o != null;
            if (z && this.f3986w == 0 && this.f3987x == null) {
                this.f3958A = (AbstractC0974b) m4664e(o, C0792g.f3950b, C0792g.this.f3952d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f3958A = null;
            }
            this.f3959B = u.mo1819p(C0763j.f3655Q1);
            this.f3960C = u.mo1819p(C0763j.f3680V1);
            int i2 = C0763j.f3665S1;
            if (u.mo1822s(i2)) {
                this.f3962E = C0216d0.m1138e(u.mo1814k(i2, -1), this.f3962E);
            } else {
                this.f3962E = null;
            }
            int i3 = C0763j.f3660R1;
            if (u.mo1822s(i3)) {
                this.f3961D = u.mo1806c(i3);
            } else {
                this.f3961D = null;
            }
            u.mo1823w();
            this.f3971h = false;
        }

        /* renamed from: h */
        public void mo4723h() {
            this.f3965b = 0;
            this.f3966c = 0;
            this.f3967d = 0;
            this.f3968e = 0;
            this.f3969f = true;
            this.f3970g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f3949a = clsArr;
        f3950b = clsArr;
    }

    public C0792g(Context context) {
        super(context);
        this.f3953e = context;
        Object[] objArr = {context};
        this.f3951c = objArr;
        this.f3952d = objArr;
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
                                AbstractC0974b bVar2 = bVar.f3958A;
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
        if (this.f3954f == null) {
            this.f3954f = m4660a(this.f3953e);
        }
        return this.f3954f;
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof AbstractMenuC0917a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f3953e.getResources().getLayout(i);
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
