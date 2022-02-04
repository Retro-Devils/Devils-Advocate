package androidx.core.content.p005c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.c.b */
public final class C0381b {

    /* renamed from: a */
    private final Shader f2063a;

    /* renamed from: b */
    private final ColorStateList f2064b;

    /* renamed from: c */
    private int f2065c;

    private C0381b(Shader shader, ColorStateList colorStateList, int i) {
        this.f2063a = shader;
        this.f2064b = colorStateList;
        this.f2065c = i;
    }

    /* renamed from: a */
    private static C0381b m1886a(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return m1889d(C0387d.m1917b(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return m1888c(C0380a.m1881b(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    static C0381b m1887b(int i) {
        return new C0381b(null, null, i);
    }

    /* renamed from: c */
    static C0381b m1888c(ColorStateList colorStateList) {
        return new C0381b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: d */
    static C0381b m1889d(Shader shader) {
        return new C0381b(shader, null, 0);
    }

    /* renamed from: g */
    public static C0381b m1890g(Resources resources, int i, Resources.Theme theme) {
        try {
            return m1886a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: e */
    public int mo2222e() {
        return this.f2065c;
    }

    /* renamed from: f */
    public Shader mo2223f() {
        return this.f2063a;
    }

    /* renamed from: h */
    public boolean mo2224h() {
        return this.f2063a != null;
    }

    /* renamed from: i */
    public boolean mo2225i() {
        ColorStateList colorStateList;
        return this.f2063a == null && (colorStateList = this.f2064b) != null && colorStateList.isStateful();
    }

    /* renamed from: j */
    public boolean mo2226j(int[] iArr) {
        if (mo2225i()) {
            ColorStateList colorStateList = this.f2064b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2065c) {
                this.f2065c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void mo2227k(int i) {
        this.f2065c = i;
    }

    /* renamed from: l */
    public boolean mo2228l() {
        return mo2224h() || this.f2065c != 0;
    }
}
