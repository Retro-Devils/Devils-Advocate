package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p006b.p007a.C0754a;
import p006b.p007a.C0757d;
import p006b.p007a.C0759f;
import p006b.p007a.C0760g;
import p006b.p007a.C0761h;
import p006b.p007a.C0763j;
import p006b.p007a.p014o.AbstractC0787c;
import p006b.p030g.p039k.C1013s;
import p006b.p041h.p042a.AbstractC1035a;
import p006b.p043i.p044a.AbstractC1041a;

public class SearchView extends C0230h0 implements AbstractC0787c {

    /* renamed from: q */
    static final C0182n f743q = (Build.VERSION.SDK_INT < 29 ? new C0182n() : null);

    /* renamed from: A */
    private C0185p f744A;

    /* renamed from: B */
    private Rect f745B;

    /* renamed from: C */
    private Rect f746C;

    /* renamed from: D */
    private int[] f747D;

    /* renamed from: E */
    private int[] f748E;

    /* renamed from: F */
    private final ImageView f749F;

    /* renamed from: G */
    private final Drawable f750G;

    /* renamed from: H */
    private final int f751H;

    /* renamed from: I */
    private final int f752I;

    /* renamed from: J */
    private final Intent f753J;

    /* renamed from: K */
    private final Intent f754K;

    /* renamed from: L */
    private final CharSequence f755L;

    /* renamed from: M */
    private AbstractC0180l f756M;

    /* renamed from: N */
    private AbstractC0179k f757N;

    /* renamed from: O */
    View.OnFocusChangeListener f758O;

    /* renamed from: P */
    private AbstractC0181m f759P;

    /* renamed from: Q */
    private View.OnClickListener f760Q;

    /* renamed from: R */
    private boolean f761R;

    /* renamed from: S */
    private boolean f762S;

    /* renamed from: T */
    AbstractC1035a f763T;

    /* renamed from: U */
    private boolean f764U;

    /* renamed from: V */
    private CharSequence f765V;

    /* renamed from: W */
    private boolean f766W;

    /* renamed from: a0 */
    private boolean f767a0;

    /* renamed from: b0 */
    private int f768b0;

    /* renamed from: c0 */
    private boolean f769c0;

    /* renamed from: d0 */
    private CharSequence f770d0;

    /* renamed from: e0 */
    private CharSequence f771e0;

    /* renamed from: f0 */
    private boolean f772f0;

    /* renamed from: g0 */
    private int f773g0;

    /* renamed from: h0 */
    SearchableInfo f774h0;

    /* renamed from: i0 */
    private Bundle f775i0;

    /* renamed from: j0 */
    private final Runnable f776j0;

    /* renamed from: k0 */
    private Runnable f777k0;

    /* renamed from: l0 */
    private final WeakHashMap<String, Drawable.ConstantState> f778l0;

    /* renamed from: m0 */
    private final View.OnClickListener f779m0;

    /* renamed from: n0 */
    View.OnKeyListener f780n0;

    /* renamed from: o0 */
    private final TextView.OnEditorActionListener f781o0;

    /* renamed from: p0 */
    private final AdapterView.OnItemClickListener f782p0;

    /* renamed from: q0 */
    private final AdapterView.OnItemSelectedListener f783q0;

    /* renamed from: r */
    final SearchAutoComplete f784r;

    /* renamed from: r0 */
    private TextWatcher f785r0;

    /* renamed from: s */
    private final View f786s;

    /* renamed from: t */
    private final View f787t;

    /* renamed from: u */
    private final View f788u;

    /* renamed from: v */
    final ImageView f789v;

    /* renamed from: w */
    final ImageView f790w;

    /* renamed from: x */
    final ImageView f791x;

    /* renamed from: y */
    final ImageView f792y;

    /* renamed from: z */
    private final View f793z;

    public static class SearchAutoComplete extends C0215d {

        /* renamed from: e */
        private int f794e;

        /* renamed from: f */
        private SearchView f795f;

        /* renamed from: g */
        private boolean f796g;

        /* renamed from: h */
        final Runnable f797h;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class RunnableC0168a implements Runnable {
            RunnableC0168a() {
            }

            public void run() {
                SearchAutoComplete.this.mo1091c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0754a.f3568p);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f797h = new RunnableC0168a();
            this.f794e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1089a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f743q.mo1124c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo1090b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1091c() {
            if (this.f796g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f796g = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f794e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.C0215d
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f796g) {
                removeCallbacks(this.f797h);
                post(this.f797h);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f795f.mo1055Z();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f795f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f795f.hasFocus() && getVisibility() == 0) {
                this.f796g = true;
                if (SearchView.m916M(getContext())) {
                    mo1089a();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f796g = false;
                removeCallbacks(this.f797h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f796g = false;
                removeCallbacks(this.f797h);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f796g = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f795f = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f794e = i;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0169a implements TextWatcher {
        C0169a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo1054Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class RunnableC0170b implements Runnable {
        RunnableC0170b() {
        }

        public void run() {
            SearchView.this.mo1059f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class RunnableC0171c implements Runnable {
        RunnableC0171c() {
        }

        public void run() {
            AbstractC1035a aVar = SearchView.this.f763T;
            if (aVar instanceof View$OnClickListenerC0272q0) {
                aVar.mo1700a(null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class View$OnFocusChangeListenerC0172d implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC0172d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f758O;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class View$OnLayoutChangeListenerC0173e implements View.OnLayoutChangeListener {
        View$OnLayoutChangeListenerC0173e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo1043B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class View$OnClickListenerC0174f implements View.OnClickListener {
        View$OnClickListenerC0174f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f789v) {
                searchView.mo1051V();
            } else if (view == searchView.f791x) {
                searchView.mo1047R();
            } else if (view == searchView.f790w) {
                searchView.mo1052W();
            } else if (view == searchView.f792y) {
                searchView.mo1056a0();
            } else if (view == searchView.f784r) {
                searchView.mo1044H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class View$OnKeyListenerC0175g implements View.OnKeyListener {
        View$OnKeyListenerC0175g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f774h0 == null) {
                return false;
            }
            if (searchView.f784r.isPopupShowing() && SearchView.this.f784r.getListSelection() != -1) {
                return SearchView.this.mo1053X(view, i, keyEvent);
            }
            if (SearchView.this.f784r.mo1090b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo1046P(0, null, searchView2.f784r.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0176h implements TextView.OnEditorActionListener {
        C0176h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo1052W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0177i implements AdapterView.OnItemClickListener {
        C0177i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1048S(i, 0, null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0178j implements AdapterView.OnItemSelectedListener {
        C0178j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SearchView.this.mo1049T(i);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    public interface AbstractC0179k {
        /* renamed from: a */
        boolean mo1117a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface AbstractC0180l {
        /* renamed from: a */
        boolean mo1118a(String str);

        /* renamed from: b */
        boolean mo1119b(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface AbstractC0181m {
        /* renamed from: a */
        boolean mo1120a(int i);

        /* renamed from: b */
        boolean mo1121b(int i);
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public static class C0182n {

        /* renamed from: a */
        private Method f809a = null;

        /* renamed from: b */
        private Method f810b = null;

        /* renamed from: c */
        private Method f811c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        C0182n() {
            m955d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f809a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f810b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f811c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m955d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1122a(AutoCompleteTextView autoCompleteTextView) {
            m955d();
            Method method = this.f810b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1123b(AutoCompleteTextView autoCompleteTextView) {
            m955d();
            Method method = this.f809a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1124c(AutoCompleteTextView autoCompleteTextView) {
            m955d();
            Method method = this.f811c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.SearchView$o */
    public static class C0183o extends AbstractC1041a {
        public static final Parcelable.Creator<C0183o> CREATOR = new C0184a();

        /* renamed from: d */
        boolean f812d;

        /* renamed from: androidx.appcompat.widget.SearchView$o$a */
        class C0184a implements Parcelable.ClassLoaderCreator<C0183o> {
            C0184a() {
            }

            /* renamed from: a */
            public C0183o createFromParcel(Parcel parcel) {
                return new C0183o(parcel, null);
            }

            /* renamed from: b */
            public C0183o createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0183o(parcel, classLoader);
            }

            /* renamed from: c */
            public C0183o[] newArray(int i) {
                return new C0183o[i];
            }
        }

        public C0183o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f812d = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        C0183o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f812d + "}";
        }

        @Override // p006b.p043i.p044a.AbstractC1041a
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f812d));
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    private static class C0185p extends TouchDelegate {

        /* renamed from: a */
        private final View f813a;

        /* renamed from: b */
        private final Rect f814b = new Rect();

        /* renamed from: c */
        private final Rect f815c = new Rect();

        /* renamed from: d */
        private final Rect f816d = new Rect();

        /* renamed from: e */
        private final int f817e;

        /* renamed from: f */
        private boolean f818f;

        public C0185p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f817e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1133a(rect, rect2);
            this.f813a = view;
        }

        /* renamed from: a */
        public void mo1133a(Rect rect, Rect rect2) {
            this.f814b.set(rect);
            this.f816d.set(rect);
            Rect rect3 = this.f816d;
            int i = this.f817e;
            rect3.inset(-i, -i);
            this.f815c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
            // Method dump skipped, instructions count: 111
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0185p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0754a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f745B = new Rect();
        this.f746C = new Rect();
        this.f747D = new int[2];
        this.f748E = new int[2];
        this.f776j0 = new RunnableC0170b();
        this.f777k0 = new RunnableC0171c();
        this.f778l0 = new WeakHashMap<>();
        View$OnClickListenerC0174f fVar = new View$OnClickListenerC0174f();
        this.f779m0 = fVar;
        this.f780n0 = new View$OnKeyListenerC0175g();
        C0176h hVar = new C0176h();
        this.f781o0 = hVar;
        C0177i iVar = new C0177i();
        this.f782p0 = iVar;
        C0178j jVar = new C0178j();
        this.f783q0 = jVar;
        this.f785r0 = new C0169a();
        C0296w0 v = C0296w0.m1432v(context, attributeSet, C0763j.f3745i2, i, 0);
        LayoutInflater.from(context).inflate(v.mo1817n(C0763j.f3795s2, C0760g.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C0759f.search_src_text);
        this.f784r = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f786s = findViewById(C0759f.search_edit_frame);
        View findViewById = findViewById(C0759f.search_plate);
        this.f787t = findViewById;
        View findViewById2 = findViewById(C0759f.submit_area);
        this.f788u = findViewById2;
        ImageView imageView = (ImageView) findViewById(C0759f.search_button);
        this.f789v = imageView;
        ImageView imageView2 = (ImageView) findViewById(C0759f.search_go_btn);
        this.f790w = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C0759f.search_close_btn);
        this.f791x = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C0759f.search_voice_btn);
        this.f792y = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C0759f.search_mag_icon);
        this.f749F = imageView5;
        C1013s.m5772l0(findViewById, v.mo1810g(C0763j.f3800t2));
        C1013s.m5772l0(findViewById2, v.mo1810g(C0763j.f3820x2));
        int i2 = C0763j.f3815w2;
        imageView.setImageDrawable(v.mo1810g(i2));
        imageView2.setImageDrawable(v.mo1810g(C0763j.f3785q2));
        imageView3.setImageDrawable(v.mo1810g(C0763j.f3770n2));
        imageView4.setImageDrawable(v.mo1810g(C0763j.f3830z2));
        imageView5.setImageDrawable(v.mo1810g(i2));
        this.f750G = v.mo1810g(C0763j.f3810v2);
        C0303y0.m1525a(imageView, getResources().getString(C0761h.abc_searchview_description_search));
        this.f751H = v.mo1817n(C0763j.f3825y2, C0760g.abc_search_dropdown_item_icons_2line);
        this.f752I = v.mo1817n(C0763j.f3775o2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f785r0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f780n0);
        searchAutoComplete.setOnFocusChangeListener(new View$OnFocusChangeListenerC0172d());
        setIconifiedByDefault(v.mo1804a(C0763j.f3790r2, true));
        int f = v.mo1809f(C0763j.f3755k2, -1);
        if (f != -1) {
            setMaxWidth(f);
        }
        this.f755L = v.mo1819p(C0763j.f3780p2);
        this.f765V = v.mo1819p(C0763j.f3805u2);
        int k = v.mo1814k(C0763j.f3765m2, -1);
        if (k != -1) {
            setImeOptions(k);
        }
        int k2 = v.mo1814k(C0763j.f3760l2, -1);
        if (k2 != -1) {
            setInputType(k2);
        }
        setFocusable(v.mo1804a(C0763j.f3750j2, true));
        v.mo1823w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f753J = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f754K = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f793z = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0173e());
        }
        m927k0(this.f761R);
        m923g0();
    }

    /* renamed from: C */
    private Intent m908C(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f771e0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f775i0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f774h0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    private Intent m909D(Cursor cursor, int i, String str) {
        int i2;
        String o;
        try {
            String o2 = View$OnClickListenerC0272q0.m1352o(cursor, "suggest_intent_action");
            if (o2 == null) {
                o2 = this.f774h0.getSuggestIntentAction();
            }
            if (o2 == null) {
                o2 = "android.intent.action.SEARCH";
            }
            String o3 = View$OnClickListenerC0272q0.m1352o(cursor, "suggest_intent_data");
            if (o3 == null) {
                o3 = this.f774h0.getSuggestIntentData();
            }
            if (!(o3 == null || (o = View$OnClickListenerC0272q0.m1352o(cursor, "suggest_intent_data_id")) == null)) {
                o3 = o3 + "/" + Uri.encode(o);
            }
            return m908C(o2, o3 == null ? null : Uri.parse(o3), View$OnClickListenerC0272q0.m1352o(cursor, "suggest_intent_extra_data"), View$OnClickListenerC0272q0.m1352o(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: E */
    private Intent m910E(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f775i0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: F */
    private Intent m911F(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    /* renamed from: G */
    private void m912G() {
        this.f784r.dismissDropDown();
    }

    /* renamed from: I */
    private void m913I(View view, Rect rect) {
        view.getLocationInWindow(this.f747D);
        getLocationInWindow(this.f748E);
        int[] iArr = this.f747D;
        int i = iArr[1];
        int[] iArr2 = this.f748E;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: J */
    private CharSequence m914J(CharSequence charSequence) {
        if (!this.f761R || this.f750G == null) {
            return charSequence;
        }
        double textSize = (double) this.f784r.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.f750G.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f750G), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: K */
    private boolean m915K() {
        SearchableInfo searchableInfo = this.f774h0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f774h0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f753J;
        } else if (this.f774h0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f754K;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: M */
    static boolean m916M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: N */
    private boolean m917N() {
        return (this.f764U || this.f769c0) && !mo1045L();
    }

    /* renamed from: O */
    private void m918O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: Q */
    private boolean m919Q(int i, int i2, String str) {
        Cursor c = this.f763T.mo5592c();
        if (c == null || !c.moveToPosition(i)) {
            return false;
        }
        m918O(m909D(c, i2, str));
        return true;
    }

    /* renamed from: b0 */
    private void m920b0() {
        post(this.f776j0);
    }

    /* renamed from: c0 */
    private void m921c0(int i) {
        CharSequence b;
        Editable text = this.f784r.getText();
        Cursor c = this.f763T.mo5592c();
        if (c != null) {
            if (!c.moveToPosition(i) || (b = this.f763T.mo1701b(c)) == null) {
                setQuery(text);
            } else {
                setQuery(b);
            }
        }
    }

    /* renamed from: e0 */
    private void m922e0() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f784r.getText());
        int i = 0;
        if (!z2 && (!this.f761R || this.f772f0)) {
            z = false;
        }
        ImageView imageView = this.f791x;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f791x.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    /* renamed from: g0 */
    private void m923g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f784r;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m914J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0757d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0757d.abc_search_view_preferred_width);
    }

    /* renamed from: h0 */
    private void m924h0() {
        this.f784r.setThreshold(this.f774h0.getSuggestThreshold());
        this.f784r.setImeOptions(this.f774h0.getImeOptions());
        int inputType = this.f774h0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f774h0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f784r.setInputType(inputType);
        AbstractC1035a aVar = this.f763T;
        if (aVar != null) {
            aVar.mo1700a(null);
        }
        if (this.f774h0.getSuggestAuthority() != null) {
            View$OnClickListenerC0272q0 q0Var = new View$OnClickListenerC0272q0(getContext(), this, this.f774h0, this.f778l0);
            this.f763T = q0Var;
            this.f784r.setAdapter(q0Var);
            View$OnClickListenerC0272q0 q0Var2 = (View$OnClickListenerC0272q0) this.f763T;
            if (this.f766W) {
                i = 2;
            }
            q0Var2.mo1713x(i);
        }
    }

    /* renamed from: i0 */
    private void m925i0() {
        this.f788u.setVisibility((!m917N() || !(this.f790w.getVisibility() == 0 || this.f792y.getVisibility() == 0)) ? 8 : 0);
    }

    /* renamed from: j0 */
    private void m926j0(boolean z) {
        this.f790w.setVisibility((!this.f764U || !m917N() || !hasFocus() || (!z && this.f769c0)) ? 8 : 0);
    }

    /* renamed from: k0 */
    private void m927k0(boolean z) {
        this.f762S = z;
        int i = 0;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f784r.getText());
        this.f789v.setVisibility(i2);
        m926j0(z2);
        this.f786s.setVisibility(z ? 8 : 0);
        if (this.f749F.getDrawable() == null || this.f761R) {
            i = 8;
        }
        this.f749F.setVisibility(i);
        m922e0();
        m928l0(!z2);
        m925i0();
    }

    /* renamed from: l0 */
    private void m928l0(boolean z) {
        int i = 8;
        if (this.f769c0 && !mo1045L() && z) {
            this.f790w.setVisibility(8);
            i = 0;
        }
        this.f792y.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        this.f784r.setText(charSequence);
        this.f784r.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo1043B() {
        if (this.f793z.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f787t.getPaddingLeft();
            Rect rect = new Rect();
            boolean b = C0214c1.m1132b(this);
            int dimensionPixelSize = this.f761R ? resources.getDimensionPixelSize(C0757d.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(C0757d.abc_dropdownitem_text_padding_left) : 0;
            this.f784r.getDropDownBackground().getPadding(rect);
            int i = rect.left;
            this.f784r.setDropDownHorizontalOffset(b ? -i : paddingLeft - (i + dimensionPixelSize));
            this.f784r.setDropDownWidth((((this.f793z.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo1044H() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f784r.refreshAutoCompleteResults();
            return;
        }
        C0182n nVar = f743q;
        nVar.mo1123b(this.f784r);
        nVar.mo1122a(this.f784r);
    }

    /* renamed from: L */
    public boolean mo1045L() {
        return this.f762S;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo1046P(int i, String str, String str2) {
        getContext().startActivity(m908C("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo1047R() {
        if (!TextUtils.isEmpty(this.f784r.getText())) {
            this.f784r.setText("");
            this.f784r.requestFocus();
            this.f784r.setImeVisibility(true);
        } else if (this.f761R) {
            AbstractC0179k kVar = this.f757N;
            if (kVar == null || !kVar.mo1117a()) {
                clearFocus();
                m927k0(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public boolean mo1048S(int i, int i2, String str) {
        AbstractC0181m mVar = this.f759P;
        if (mVar != null && mVar.mo1121b(i)) {
            return false;
        }
        m919Q(i, 0, null);
        this.f784r.setImeVisibility(false);
        m912G();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean mo1049T(int i) {
        AbstractC0181m mVar = this.f759P;
        if (mVar != null && mVar.mo1120a(i)) {
            return false;
        }
        m921c0(i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo1050U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo1051V() {
        m927k0(false);
        this.f784r.requestFocus();
        this.f784r.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f760Q;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo1052W() {
        Editable text = this.f784r.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            AbstractC0180l lVar = this.f756M;
            if (lVar == null || !lVar.mo1119b(text.toString())) {
                if (this.f774h0 != null) {
                    mo1046P(0, null, text.toString());
                }
                this.f784r.setImeVisibility(false);
                m912G();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public boolean mo1053X(View view, int i, KeyEvent keyEvent) {
        if (this.f774h0 != null && this.f763T != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo1048S(this.f784r.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22) {
                this.f784r.setSelection(i == 21 ? 0 : this.f784r.length());
                this.f784r.setListSelection(0);
                this.f784r.clearListSelection();
                this.f784r.mo1089a();
                return true;
            } else if (i != 19 || this.f784r.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo1054Y(CharSequence charSequence) {
        Editable text = this.f784r.getText();
        this.f771e0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m926j0(z);
        m928l0(!z);
        m922e0();
        m925i0();
        if (this.f756M != null && !TextUtils.equals(charSequence, this.f770d0)) {
            this.f756M.mo1118a(charSequence.toString());
        }
        this.f770d0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo1055Z() {
        m927k0(mo1045L());
        m920b0();
        if (this.f784r.hasFocus()) {
            mo1044H();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo1056a0() {
        Intent E;
        SearchableInfo searchableInfo = this.f774h0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    E = m911F(this.f753J, searchableInfo);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    E = m910E(this.f754K, searchableInfo);
                } else {
                    return;
                }
                getContext().startActivity(E);
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    @Override // p006b.p007a.p014o.AbstractC0787c
    /* renamed from: c */
    public void mo816c() {
        if (!this.f772f0) {
            this.f772f0 = true;
            int imeOptions = this.f784r.getImeOptions();
            this.f773g0 = imeOptions;
            this.f784r.setImeOptions(imeOptions | 33554432);
            this.f784r.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f767a0 = true;
        super.clearFocus();
        this.f784r.clearFocus();
        this.f784r.setImeVisibility(false);
        this.f767a0 = false;
    }

    /* renamed from: d0 */
    public void mo1058d0(CharSequence charSequence, boolean z) {
        this.f784r.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f784r;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f771e0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1052W();
        }
    }

    @Override // p006b.p007a.p014o.AbstractC0787c
    /* renamed from: f */
    public void mo817f() {
        mo1058d0("", false);
        clearFocus();
        m927k0(true);
        this.f784r.setImeOptions(this.f773g0);
        this.f772f0 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo1059f0() {
        int[] iArr = this.f784r.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f787t.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f788u.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f784r.getImeOptions();
    }

    public int getInputType() {
        return this.f784r.getInputType();
    }

    public int getMaxWidth() {
        return this.f768b0;
    }

    public CharSequence getQuery() {
        return this.f784r.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f765V;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f774h0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f755L : getContext().getText(this.f774h0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f752I;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f751H;
    }

    public AbstractC1035a getSuggestionsAdapter() {
        return this.f763T;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f776j0);
        post(this.f777k0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0230h0
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m913I(this.f784r, this.f745B);
            Rect rect = this.f746C;
            Rect rect2 = this.f745B;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0185p pVar = this.f744A;
            if (pVar == null) {
                C0185p pVar2 = new C0185p(this.f746C, this.f745B, this.f784r);
                this.f744A = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.mo1133a(this.f746C, this.f745B);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    @Override // androidx.appcompat.widget.C0230h0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo1045L()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.f768b0
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.f768b0
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.f768b0
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0183o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0183o oVar = (C0183o) parcelable;
        super.onRestoreInstanceState(oVar.mo5608b());
        m927k0(oVar.f812d);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0183o oVar = new C0183o(super.onSaveInstanceState());
        oVar.f812d = mo1045L();
        return oVar;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m920b0();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f767a0 || !isFocusable()) {
            return false;
        }
        if (mo1045L()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f784r.requestFocus(i, rect);
        if (requestFocus) {
            m927k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f775i0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1047R();
        } else {
            mo1051V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f761R != z) {
            this.f761R = z;
            m927k0(z);
            m923g0();
        }
    }

    public void setImeOptions(int i) {
        this.f784r.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f784r.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f768b0 = i;
        requestLayout();
    }

    public void setOnCloseListener(AbstractC0179k kVar) {
        this.f757N = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f758O = onFocusChangeListener;
    }

    public void setOnQueryTextListener(AbstractC0180l lVar) {
        this.f756M = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f760Q = onClickListener;
    }

    public void setOnSuggestionListener(AbstractC0181m mVar) {
        this.f759P = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f765V = charSequence;
        m923g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f766W = z;
        AbstractC1035a aVar = this.f763T;
        if (aVar instanceof View$OnClickListenerC0272q0) {
            ((View$OnClickListenerC0272q0) aVar).mo1713x(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f774h0 = searchableInfo;
        if (searchableInfo != null) {
            m924h0();
            m923g0();
        }
        boolean K = m915K();
        this.f769c0 = K;
        if (K) {
            this.f784r.setPrivateImeOptions("nm");
        }
        m927k0(mo1045L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f764U = z;
        m927k0(mo1045L());
    }

    public void setSuggestionsAdapter(AbstractC1035a aVar) {
        this.f763T = aVar;
        this.f784r.setAdapter(aVar);
    }
}
