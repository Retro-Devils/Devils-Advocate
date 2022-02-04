package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.appcompat.view.menu.AbstractC0150p;
import p006b.p007a.C0754a;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p030g.p039k.AbstractC1012r;
import p006b.p030g.p039k.C1013s;

/* renamed from: androidx.appcompat.widget.v */
public class C0282v extends Spinner implements AbstractC1012r {

    /* renamed from: b */
    private static final int[] f1208b = {16843505};

    /* renamed from: c */
    private final C0218e f1209c;

    /* renamed from: d */
    private final Context f1210d;

    /* renamed from: e */
    private AbstractView$OnTouchListenerC0226g0 f1211e;

    /* renamed from: f */
    private SpinnerAdapter f1212f;

    /* renamed from: g */
    private final boolean f1213g;

    /* renamed from: h */
    private AbstractC0293g f1214h;

    /* renamed from: i */
    int f1215i;

    /* renamed from: j */
    final Rect f1216j;

    /* renamed from: androidx.appcompat.widget.v$a */
    class C0283a extends AbstractView$OnTouchListenerC0226g0 {

        /* renamed from: k */
        final /* synthetic */ C0287e f1217k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0283a(View view, C0287e eVar) {
            super(view);
            this.f1217k = eVar;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0226g0
        /* renamed from: b */
        public AbstractC0150p mo466b() {
            return this.f1217k;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0226g0
        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: c */
        public boolean mo467c() {
            if (C0282v.this.getInternalPopup().mo1765c()) {
                return true;
            }
            C0282v.this.mo1738b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.v$b */
    class ViewTreeObserver$OnGlobalLayoutListenerC0284b implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0284b() {
        }

        public void onGlobalLayout() {
            if (!C0282v.this.getInternalPopup().mo1765c()) {
                C0282v.this.mo1738b();
            }
            ViewTreeObserver viewTreeObserver = C0282v.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.v$c */
    class DialogInterface$OnClickListenerC0285c implements AbstractC0293g, DialogInterface.OnClickListener {

        /* renamed from: b */
        DialogInterfaceC0068b f1220b;

        /* renamed from: c */
        private ListAdapter f1221c;

        /* renamed from: d */
        private CharSequence f1222d;

        DialogInterface$OnClickListenerC0285c() {
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: b */
        public void mo1764b(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: c */
        public boolean mo1765c() {
            DialogInterfaceC0068b bVar = this.f1220b;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: d */
        public void mo1766d(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        public void dismiss() {
            DialogInterfaceC0068b bVar = this.f1220b;
            if (bVar != null) {
                bVar.dismiss();
                this.f1220b = null;
            }
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: e */
        public int mo1768e() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: f */
        public void mo1769f(int i, int i2) {
            if (this.f1221c != null) {
                DialogInterfaceC0068b.C0069a aVar = new DialogInterfaceC0068b.C0069a(C0282v.this.getPopupContext());
                CharSequence charSequence = this.f1222d;
                if (charSequence != null) {
                    aVar.mo239s(charSequence);
                }
                DialogInterfaceC0068b a = aVar.mo236p(this.f1221c, C0282v.this.getSelectedItemPosition(), this).mo221a();
                this.f1220b = a;
                ListView f = a.mo216f();
                if (Build.VERSION.SDK_INT >= 17) {
                    f.setTextDirection(i);
                    f.setTextAlignment(i2);
                }
                this.f1220b.show();
            }
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: h */
        public int mo1770h() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: j */
        public Drawable mo1771j() {
            return null;
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: k */
        public CharSequence mo1772k() {
            return this.f1222d;
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: m */
        public void mo1773m(CharSequence charSequence) {
            this.f1222d = charSequence;
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: n */
        public void mo1774n(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: o */
        public void mo1775o(ListAdapter listAdapter) {
            this.f1221c = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0282v.this.setSelection(i);
            if (C0282v.this.getOnItemClickListener() != null) {
                C0282v.this.performItemClick(null, i, this.f1221c.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: p */
        public void mo1777p(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.v$d */
    public static class C0286d implements ListAdapter, SpinnerAdapter {

        /* renamed from: b */
        private SpinnerAdapter f1224b;

        /* renamed from: c */
        private ListAdapter f1225c;

        public C0286d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1224b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1225c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof AbstractC0277s0) {
                AbstractC0277s0 s0Var = (AbstractC0277s0) spinnerAdapter;
                if (s0Var.getDropDownViewTheme() == null) {
                    s0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1225c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1224b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1224b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1224b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1224b;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1224b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1225c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1224b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1224b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.v$e */
    class C0287e extends C0233i0 implements AbstractC0293g {

        /* renamed from: K */
        private CharSequence f1226K;

        /* renamed from: L */
        ListAdapter f1227L;

        /* renamed from: M */
        private final Rect f1228M = new Rect();

        /* renamed from: N */
        private int f1229N;

        /* renamed from: androidx.appcompat.widget.v$e$a */
        class C0288a implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ C0282v f1231b;

            C0288a(C0282v vVar) {
                this.f1231b = vVar;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0282v.this.setSelection(i);
                if (C0282v.this.getOnItemClickListener() != null) {
                    C0287e eVar = C0287e.this;
                    C0282v.this.performItemClick(view, i, eVar.f1227L.getItemId(i));
                }
                C0287e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.v$e$b */
        class ViewTreeObserver$OnGlobalLayoutListenerC0289b implements ViewTreeObserver.OnGlobalLayoutListener {
            ViewTreeObserver$OnGlobalLayoutListenerC0289b() {
            }

            public void onGlobalLayout() {
                C0287e eVar = C0287e.this;
                if (!eVar.mo1793U(C0282v.this)) {
                    C0287e.this.dismiss();
                    return;
                }
                C0287e.this.mo1791S();
                C0287e.super.mo565a();
            }
        }

        /* renamed from: androidx.appcompat.widget.v$e$c */
        class C0290c implements PopupWindow.OnDismissListener {

            /* renamed from: b */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1234b;

            C0290c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1234b = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0282v.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1234b);
                }
            }
        }

        public C0287e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo1508D(C0282v.this);
            mo1514J(true);
            mo1518O(0);
            mo1516L(new C0288a(C0282v.this));
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
        /* renamed from: S */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1791S() {
            /*
            // Method dump skipped, instructions count: 164
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0282v.C0287e.mo1791S():void");
        }

        /* renamed from: T */
        public int mo1792T() {
            return this.f1229N;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: U */
        public boolean mo1793U(View view) {
            return C1013s.m5736N(view) && view.getGlobalVisibleRect(this.f1228M);
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: f */
        public void mo1769f(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean c = mo566c();
            mo1791S();
            mo1513I(2);
            super.mo565a();
            ListView l = mo571l();
            l.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                l.setTextDirection(i);
                l.setTextAlignment(i2);
            }
            mo1519P(C0282v.this.getSelectedItemPosition());
            if (!c && (viewTreeObserver = C0282v.this.getViewTreeObserver()) != null) {
                ViewTreeObserver$OnGlobalLayoutListenerC0289b bVar = new ViewTreeObserver$OnGlobalLayoutListenerC0289b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                mo1515K(new C0290c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: k */
        public CharSequence mo1772k() {
            return this.f1226K;
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: m */
        public void mo1773m(CharSequence charSequence) {
            this.f1226K = charSequence;
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g, androidx.appcompat.widget.C0233i0
        /* renamed from: o */
        public void mo1527o(ListAdapter listAdapter) {
            super.mo1527o(listAdapter);
            this.f1227L = listAdapter;
        }

        @Override // androidx.appcompat.widget.C0282v.AbstractC0293g
        /* renamed from: p */
        public void mo1777p(int i) {
            this.f1229N = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.v$f */
    public static class C0291f extends View.BaseSavedState {
        public static final Parcelable.Creator<C0291f> CREATOR = new C0292a();

        /* renamed from: b */
        boolean f1236b;

        /* renamed from: androidx.appcompat.widget.v$f$a */
        class C0292a implements Parcelable.Creator<C0291f> {
            C0292a() {
            }

            /* renamed from: a */
            public C0291f createFromParcel(Parcel parcel) {
                return new C0291f(parcel);
            }

            /* renamed from: b */
            public C0291f[] newArray(int i) {
                return new C0291f[i];
            }
        }

        C0291f(Parcel parcel) {
            super(parcel);
            this.f1236b = parcel.readByte() != 0;
        }

        C0291f(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1236b ? (byte) 1 : 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.v$g */
    public interface AbstractC0293g {
        /* renamed from: b */
        void mo1764b(Drawable drawable);

        /* renamed from: c */
        boolean mo1765c();

        /* renamed from: d */
        void mo1766d(int i);

        void dismiss();

        /* renamed from: e */
        int mo1768e();

        /* renamed from: f */
        void mo1769f(int i, int i2);

        /* renamed from: h */
        int mo1770h();

        /* renamed from: j */
        Drawable mo1771j();

        /* renamed from: k */
        CharSequence mo1772k();

        /* renamed from: m */
        void mo1773m(CharSequence charSequence);

        /* renamed from: n */
        void mo1774n(int i);

        /* renamed from: o */
        void mo1775o(ListAdapter listAdapter);

        /* renamed from: p */
        void mo1777p(int i);
    }

    public C0282v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0754a.spinnerStyle);
    }

    public C0282v(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public C0282v(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r11 != null) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[SYNTHETIC, Splitter:B:10:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0282v(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0282v.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1737a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1216j);
        Rect rect = this.f1216j;
        return i2 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1738b() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1214h.mo1769f(getTextDirection(), getTextAlignment());
        } else {
            this.f1214h.mo1769f(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0218e eVar = this.f1209c;
        if (eVar != null) {
            eVar.mo1383b();
        }
    }

    public int getDropDownHorizontalOffset() {
        AbstractC0293g gVar = this.f1214h;
        if (gVar != null) {
            return gVar.mo1768e();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        AbstractC0293g gVar = this.f1214h;
        if (gVar != null) {
            return gVar.mo1770h();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1214h != null) {
            return this.f1215i;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final AbstractC0293g getInternalPopup() {
        return this.f1214h;
    }

    public Drawable getPopupBackground() {
        AbstractC0293g gVar = this.f1214h;
        if (gVar != null) {
            return gVar.mo1771j();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f1210d;
    }

    public CharSequence getPrompt() {
        AbstractC0293g gVar = this.f1214h;
        return gVar != null ? gVar.mo1772k() : super.getPrompt();
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public ColorStateList getSupportBackgroundTintList() {
        C0218e eVar = this.f1209c;
        if (eVar != null) {
            return eVar.mo1384c();
        }
        return null;
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0218e eVar = this.f1209c;
        if (eVar != null) {
            return eVar.mo1385d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC0293g gVar = this.f1214h;
        if (gVar != null && gVar.mo1765c()) {
            this.f1214h.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1214h != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1737a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C0291f fVar = (C0291f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (fVar.f1236b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC0284b());
        }
    }

    public Parcelable onSaveInstanceState() {
        C0291f fVar = new C0291f(super.onSaveInstanceState());
        AbstractC0293g gVar = this.f1214h;
        fVar.f1236b = gVar != null && gVar.mo1765c();
        return fVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC0226g0 g0Var = this.f1211e;
        if (g0Var == null || !g0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        AbstractC0293g gVar = this.f1214h;
        if (gVar == null) {
            return super.performClick();
        }
        if (gVar.mo1765c()) {
            return true;
        }
        mo1738b();
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1213g) {
            this.f1212f = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1214h != null) {
            Context context = this.f1210d;
            if (context == null) {
                context = getContext();
            }
            this.f1214h.mo1775o(new C0286d(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0218e eVar = this.f1209c;
        if (eVar != null) {
            eVar.mo1387f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0218e eVar = this.f1209c;
        if (eVar != null) {
            eVar.mo1388g(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        AbstractC0293g gVar = this.f1214h;
        if (gVar != null) {
            gVar.mo1777p(i);
            this.f1214h.mo1766d(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        AbstractC0293g gVar = this.f1214h;
        if (gVar != null) {
            gVar.mo1774n(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1214h != null) {
            this.f1215i = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        AbstractC0293g gVar = this.f1214h;
        if (gVar != null) {
            gVar.mo1764b(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0764a.m4517d(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        AbstractC0293g gVar = this.f1214h;
        if (gVar != null) {
            gVar.mo1773m(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0218e eVar = this.f1209c;
        if (eVar != null) {
            eVar.mo1390i(colorStateList);
        }
    }

    @Override // p006b.p030g.p039k.AbstractC1012r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0218e eVar = this.f1209c;
        if (eVar != null) {
            eVar.mo1391j(mode);
        }
    }
}
