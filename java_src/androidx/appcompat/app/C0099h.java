package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.C0198a0;
import androidx.appcompat.widget.C0215d;
import androidx.appcompat.widget.C0222f;
import androidx.appcompat.widget.C0225g;
import androidx.appcompat.widget.C0229h;
import androidx.appcompat.widget.C0244k;
import androidx.appcompat.widget.C0253m;
import androidx.appcompat.widget.C0263o;
import androidx.appcompat.widget.C0265p;
import androidx.appcompat.widget.C0276s;
import androidx.appcompat.widget.C0278t;
import androidx.appcompat.widget.C0279t0;
import androidx.appcompat.widget.C0282v;
import androidx.appcompat.widget.C0302y;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p006b.p007a.C0763j;
import p006b.p007a.p014o.C0788d;
import p006b.p021d.C0838i;
import p006b.p030g.p039k.C1013s;

/* renamed from: androidx.appcompat.app.h */
public class C0099h {

    /* renamed from: a */
    private static final Class<?>[] f331a = {Context.class, AttributeSet.class};

    /* renamed from: b */
    private static final int[] f332b = {16843375};

    /* renamed from: c */
    private static final String[] f333c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d */
    private static final C0838i<String, Constructor<? extends View>> f334d = new C0838i<>();

    /* renamed from: e */
    private final Object[] f335e = new Object[2];

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.h$a */
    public static class View$OnClickListenerC0100a implements View.OnClickListener {

        /* renamed from: b */
        private final View f336b;

        /* renamed from: c */
        private final String f337c;

        /* renamed from: d */
        private Method f338d;

        /* renamed from: e */
        private Context f339e;

        public View$OnClickListenerC0100a(View view, String str) {
            this.f336b = view;
            this.f337c = str;
        }

        /* renamed from: a */
        private void m452a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f337c, View.class)) != null) {
                        this.f338d = method;
                        this.f339e = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f336b.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f336b.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f337c + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f336b.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f338d == null) {
                m452a(this.f336b.getContext());
            }
            try {
                this.f338d.invoke(this.f339e, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private void m431a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || C1013s.m5732J(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f332b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new View$OnClickListenerC0100a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: r */
    private View m432r(Context context, String str, String str2) {
        String str3;
        C0838i<String, Constructor<? extends View>> iVar = f334d;
        Constructor<? extends View> constructor = iVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f331a);
            iVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f335e);
    }

    /* renamed from: s */
    private View m433s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f335e;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = f333c;
                    if (i < strArr.length) {
                        View r = m432r(context, str, strArr[i]);
                        if (r != null) {
                            return r;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.f335e;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View r2 = m432r(context, str, null);
                Object[] objArr3 = this.f335e;
                objArr3[0] = null;
                objArr3[1] = null;
                return r2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f335e;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    /* renamed from: t */
    private static Context m434t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0763j.f3647O3, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0763j.f3652P3, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(C0763j.f3657Q3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? (!(context instanceof C0788d) || ((C0788d) context).mo4690c() != resourceId) ? new C0788d(context, resourceId) : context : context;
    }

    /* renamed from: u */
    private void m435u(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C0215d mo391b(Context context, AttributeSet attributeSet) {
        return new C0215d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0222f mo392c(Context context, AttributeSet attributeSet) {
        return new C0222f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0225g mo393d(Context context, AttributeSet attributeSet) {
        return new C0225g(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0229h mo394e(Context context, AttributeSet attributeSet) {
        return new C0229h(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C0244k mo395f(Context context, AttributeSet attributeSet) {
        return new C0244k(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C0253m mo396g(Context context, AttributeSet attributeSet) {
        return new C0253m(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C0263o mo397h(Context context, AttributeSet attributeSet) {
        return new C0263o(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public C0265p mo398i(Context context, AttributeSet attributeSet) {
        return new C0265p(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0276s mo399j(Context context, AttributeSet attributeSet) {
        return new C0276s(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public AppCompatRatingBar mo400k(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0278t mo401l(Context context, AttributeSet attributeSet) {
        return new C0278t(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0282v mo402m(Context context, AttributeSet attributeSet) {
        return new C0282v(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C0302y mo403n(Context context, AttributeSet attributeSet) {
        return new C0302y(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public C0198a0 mo404o(Context context, AttributeSet attributeSet) {
        return new C0198a0(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public View mo405p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final View mo406q(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m434t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0279t0.m1381b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo400k(context2, attributeSet);
                m435u(view2, str);
                break;
            case 1:
                view2 = mo394e(context2, attributeSet);
                m435u(view2, str);
                break;
            case 2:
                view2 = mo398i(context2, attributeSet);
                m435u(view2, str);
                break;
            case 3:
                view2 = mo403n(context2, attributeSet);
                m435u(view2, str);
                break;
            case 4:
                view2 = mo396g(context2, attributeSet);
                m435u(view2, str);
                break;
            case 5:
                view2 = mo401l(context2, attributeSet);
                m435u(view2, str);
                break;
            case 6:
                view2 = mo402m(context2, attributeSet);
                m435u(view2, str);
                break;
            case 7:
                view2 = mo399j(context2, attributeSet);
                m435u(view2, str);
                break;
            case '\b':
                view2 = mo404o(context2, attributeSet);
                m435u(view2, str);
                break;
            case '\t':
                view2 = mo397h(context2, attributeSet);
                m435u(view2, str);
                break;
            case '\n':
                view2 = mo391b(context2, attributeSet);
                m435u(view2, str);
                break;
            case 11:
                view2 = mo393d(context2, attributeSet);
                m435u(view2, str);
                break;
            case '\f':
                view2 = mo395f(context2, attributeSet);
                m435u(view2, str);
                break;
            case '\r':
                view2 = mo392c(context2, attributeSet);
                m435u(view2, str);
                break;
            default:
                view2 = mo405p(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = m433s(context2, str, attributeSet);
        }
        if (view2 != null) {
            m431a(view2, attributeSet);
        }
        return view2;
    }
}
