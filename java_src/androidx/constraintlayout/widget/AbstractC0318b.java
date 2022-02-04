package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p006b.p022e.p026b.p027k.AbstractC0870h;
import p006b.p022e.p026b.p027k.C0864e;

/* renamed from: androidx.constraintlayout.widget.b */
public abstract class AbstractC0318b extends View {

    /* renamed from: b */
    protected int[] f1432b;

    /* renamed from: c */
    protected int f1433c;

    /* renamed from: d */
    protected Context f1434d;

    /* renamed from: e */
    protected AbstractC0870h f1435e;

    /* renamed from: f */
    protected boolean f1436f;

    /* renamed from: g */
    protected String f1437g;

    /* renamed from: h */
    private View[] f1438h;

    /* renamed from: i */
    private HashMap<Integer, String> f1439i;

    public AbstractC0318b(Context context) {
        super(context);
        this.f1432b = new int[32];
        this.f1436f = false;
        this.f1438h = null;
        this.f1439i = new HashMap<>();
        this.f1434d = context;
        mo1919g(null);
    }

    public AbstractC0318b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1432b = new int[32];
        this.f1436f = false;
        this.f1438h = null;
        this.f1439i = new HashMap<>();
        this.f1434d = context;
        mo1919g(attributeSet);
    }

    /* renamed from: a */
    private void m1600a(String str) {
        if (str != null && str.length() != 0 && this.f1434d != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int f = m1603f(trim);
            if (f != 0) {
                this.f1439i.put(Integer.valueOf(f), trim);
                m1601b(f);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    /* renamed from: b */
    private void m1601b(int i) {
        if (i != getId()) {
            int i2 = this.f1433c + 1;
            int[] iArr = this.f1432b;
            if (i2 > iArr.length) {
                this.f1432b = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f1432b;
            int i3 = this.f1433c;
            iArr2[i3] = i;
            this.f1433c = i3 + 1;
        }
    }

    /* renamed from: e */
    private int m1602e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1434d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: f */
    private int m1603f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object e = constraintLayout.mo1934e(0, str);
            if (e instanceof Integer) {
                i = ((Integer) e).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = m1602e(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C0332h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.f1434d.getResources().getIdentifier(str, "id", this.f1434d.getPackageName()) : i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1979c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo1980d((ConstraintLayout) parent);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo1980d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f1433c; i++) {
            View g = constraintLayout.mo1936g(this.f1432b[i]);
            if (g != null) {
                g.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    g.setTranslationZ(g.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo1919g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0333i.f1731a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0333i.f1812m1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1437g = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1432b, this.f1433c);
    }

    /* renamed from: h */
    public void mo1922h(C0864e eVar, boolean z) {
    }

    /* renamed from: i */
    public void mo1982i(ConstraintLayout constraintLayout) {
    }

    /* renamed from: j */
    public void mo1983j(ConstraintLayout constraintLayout) {
    }

    /* renamed from: k */
    public void mo1984k(ConstraintLayout constraintLayout) {
    }

    /* renamed from: l */
    public void mo1985l(ConstraintLayout constraintLayout) {
        String str;
        int e;
        if (isInEditMode()) {
            setIds(this.f1437g);
        }
        AbstractC0870h hVar = this.f1435e;
        if (hVar != null) {
            hVar.mo5257c();
            for (int i = 0; i < this.f1433c; i++) {
                int i2 = this.f1432b[i];
                View g = constraintLayout.mo1936g(i2);
                if (g == null && (e = m1602e(constraintLayout, (str = this.f1439i.get(Integer.valueOf(i2))))) != 0) {
                    this.f1432b[i] = e;
                    this.f1439i.put(Integer.valueOf(e), str);
                    g = constraintLayout.mo1936g(e);
                }
                if (g != null) {
                    this.f1435e.mo5255a(constraintLayout.mo1945h(g));
                }
            }
            this.f1435e.mo5256b(constraintLayout.f1318d);
        }
    }

    /* renamed from: m */
    public void mo1986m() {
        if (this.f1435e != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C0312b) {
                ((ConstraintLayout.C0312b) layoutParams).f1393n0 = (C0864e) this.f1435e;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1437g;
        if (str != null) {
            setIds(str);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f1436f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void setIds(String str) {
        this.f1437g = str;
        if (str != null) {
            int i = 0;
            this.f1433c = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m1600a(str.substring(i));
                    return;
                } else {
                    m1600a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1437g = null;
        this.f1433c = 0;
        for (int i : iArr) {
            m1601b(i);
        }
    }
}
