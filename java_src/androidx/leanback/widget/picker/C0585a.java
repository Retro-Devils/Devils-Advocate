package androidx.leanback.widget.picker;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.leanback.widget.AbstractC0582o;
import androidx.leanback.widget.VerticalGridView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p006b.p053m.C1071c;
import p006b.p053m.C1074f;
import p006b.p053m.C1076h;

/* renamed from: androidx.leanback.widget.picker.a */
public class C0585a extends FrameLayout {

    /* renamed from: b */
    private ViewGroup f2935b;

    /* renamed from: c */
    private ViewGroup f2936c;

    /* renamed from: d */
    final List<VerticalGridView> f2937d = new ArrayList();

    /* renamed from: e */
    ArrayList<C0590b> f2938e;

    /* renamed from: f */
    private float f2939f;

    /* renamed from: g */
    private float f2940g;

    /* renamed from: h */
    private float f2941h;

    /* renamed from: i */
    private float f2942i;

    /* renamed from: j */
    private int f2943j;

    /* renamed from: k */
    private Interpolator f2944k;

    /* renamed from: l */
    private Interpolator f2945l;

    /* renamed from: m */
    private ArrayList<AbstractC0588c> f2946m;

    /* renamed from: n */
    private float f2947n = 3.0f;

    /* renamed from: o */
    private float f2948o = 1.0f;

    /* renamed from: p */
    private int f2949p = 0;

    /* renamed from: q */
    private List<CharSequence> f2950q = new ArrayList();

    /* renamed from: r */
    private int f2951r = C1076h.lb_picker_item;

    /* renamed from: s */
    private int f2952s = 0;

    /* renamed from: t */
    private final AbstractC0582o f2953t = new C0586a();

    /* renamed from: androidx.leanback.widget.picker.a$a */
    class C0586a extends AbstractC0582o {
        C0586a() {
        }

        @Override // androidx.leanback.widget.AbstractC0582o
        /* renamed from: a */
        public void mo3538a(RecyclerView recyclerView, RecyclerView.AbstractC0655d0 d0Var, int i, int i2) {
            C0587b bVar = (C0587b) recyclerView.getAdapter();
            int indexOf = C0585a.this.f2937d.indexOf(recyclerView);
            C0585a.this.mo3569h(indexOf, true);
            if (d0Var != null) {
                C0585a.this.mo3543c(indexOf, C0585a.this.f2938e.get(indexOf).mo3592e() + i);
            }
        }
    }

    /* renamed from: androidx.leanback.widget.picker.a$b */
    class C0587b extends RecyclerView.AbstractC0658g<C0589d> {

        /* renamed from: c */
        private final int f2955c;

        /* renamed from: d */
        private final int f2956d;

        /* renamed from: e */
        private final int f2957e;

        /* renamed from: f */
        private C0590b f2958f;

        C0587b(Context context, int i, int i2, int i3) {
            this.f2955c = i;
            this.f2956d = i3;
            this.f2957e = i2;
            this.f2958f = C0585a.this.f2938e.get(i3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
        /* renamed from: c */
        public int mo3580c() {
            C0590b bVar = this.f2958f;
            if (bVar == null) {
                return 0;
            }
            return bVar.mo3588a();
        }

        /* renamed from: u */
        public void mo3581j(C0589d dVar, int i) {
            C0590b bVar;
            TextView textView = dVar.f2960t;
            if (!(textView == null || (bVar = this.f2958f) == null)) {
                textView.setText(bVar.mo3590c(bVar.mo3592e() + i));
            }
            C0585a aVar = C0585a.this;
            aVar.mo3559g(dVar.f3228b, aVar.f2937d.get(this.f2956d).getSelectedPosition() == i, this.f2956d, false);
        }

        /* renamed from: v */
        public C0589d mo3582l(ViewGroup viewGroup, int i) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f2955c, viewGroup, false);
            int i2 = this.f2957e;
            return new C0589d(inflate, i2 != 0 ? (TextView) inflate.findViewById(i2) : (TextView) inflate);
        }

        /* renamed from: w */
        public void mo3583o(C0589d dVar) {
            dVar.f3228b.setFocusable(C0585a.this.isActivated());
        }
    }

    /* renamed from: androidx.leanback.widget.picker.a$c */
    public interface AbstractC0588c {
        /* renamed from: a */
        void mo3587a(C0585a aVar, int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.leanback.widget.picker.a$d */
    public static class C0589d extends RecyclerView.AbstractC0655d0 {

        /* renamed from: t */
        final TextView f2960t;

        C0589d(View view, TextView textView) {
            super(view);
            this.f2960t = textView;
        }
    }

    public C0585a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setEnabled(true);
        setDescendantFocusability(262144);
        this.f2940g = 1.0f;
        this.f2939f = 1.0f;
        this.f2941h = 0.5f;
        this.f2942i = 0.0f;
        this.f2943j = 200;
        this.f2944k = new DecelerateInterpolator(2.5f);
        this.f2945l = new AccelerateInterpolator(2.5f);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(C1076h.lb_picker, (ViewGroup) this, true);
        this.f2935b = viewGroup;
        this.f2936c = (ViewGroup) viewGroup.findViewById(C1074f.picker);
    }

    /* renamed from: b */
    private void m3113b(int i) {
        ArrayList<AbstractC0588c> arrayList = this.f2946m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.f2946m.get(size).mo3587a(this, i);
            }
        }
    }

    /* renamed from: f */
    private void m3114f(View view, boolean z, float f, float f2, Interpolator interpolator) {
        view.animate().cancel();
        if (!z) {
            view.setAlpha(f);
            return;
        }
        if (f2 >= 0.0f) {
            view.setAlpha(f2);
        }
        view.animate().alpha(f).setDuration((long) this.f2943j).setInterpolator(interpolator).start();
    }

    /* renamed from: i */
    private void m3115i() {
        for (int i = 0; i < getColumnsCount(); i++) {
            m3116j(this.f2937d.get(i));
        }
    }

    /* renamed from: j */
    private void m3116j(VerticalGridView verticalGridView) {
        ViewGroup.LayoutParams layoutParams = verticalGridView.getLayoutParams();
        float activatedVisibleItemCount = isActivated() ? getActivatedVisibleItemCount() : getVisibleItemCount();
        layoutParams.height = (int) ((((float) getPickerItemHeightPixels()) * activatedVisibleItemCount) + (((float) verticalGridView.getVerticalSpacing()) * (activatedVisibleItemCount - 1.0f)));
        verticalGridView.setLayoutParams(layoutParams);
    }

    /* renamed from: k */
    private void m3117k() {
        boolean isActivated = isActivated();
        for (int i = 0; i < getColumnsCount(); i++) {
            VerticalGridView verticalGridView = this.f2937d.get(i);
            for (int i2 = 0; i2 < verticalGridView.getChildCount(); i2++) {
                verticalGridView.getChildAt(i2).setFocusable(isActivated);
            }
        }
    }

    /* renamed from: a */
    public C0590b mo3555a(int i) {
        ArrayList<C0590b> arrayList = this.f2938e;
        if (arrayList == null) {
            return null;
        }
        return arrayList.get(i);
    }

    /* renamed from: c */
    public void mo3543c(int i, int i2) {
        C0590b bVar = this.f2938e.get(i);
        if (bVar.mo3589b() != i2) {
            bVar.mo3593f(i2);
            m3113b(i);
        }
    }

    /* renamed from: d */
    public void mo3556d(int i, C0590b bVar) {
        this.f2938e.set(i, bVar);
        VerticalGridView verticalGridView = this.f2937d.get(i);
        C0587b bVar2 = (C0587b) verticalGridView.getAdapter();
        if (bVar2 != null) {
            bVar2.mo4029h();
        }
        verticalGridView.setSelectedPosition(bVar.mo3589b() - bVar.mo3592e());
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isActivated()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 23 && keyCode != 66) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            performClick();
        }
        return true;
    }

    /* renamed from: e */
    public void mo3558e(int i, int i2, boolean z) {
        C0590b bVar = this.f2938e.get(i);
        if (bVar.mo3589b() != i2) {
            bVar.mo3593f(i2);
            m3113b(i);
            VerticalGridView verticalGridView = this.f2937d.get(i);
            if (verticalGridView != null) {
                int e = i2 - this.f2938e.get(i).mo3592e();
                if (z) {
                    verticalGridView.setSelectedPositionSmooth(e);
                } else {
                    verticalGridView.setSelectedPosition(e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3559g(View view, boolean z, int i, boolean z2) {
        boolean z3 = i == this.f2949p || !hasFocus();
        m3114f(view, z2, z ? z3 ? this.f2940g : this.f2939f : z3 ? this.f2941h : this.f2942i, -1.0f, this.f2944k);
    }

    public float getActivatedVisibleItemCount() {
        return this.f2947n;
    }

    public int getColumnsCount() {
        ArrayList<C0590b> arrayList = this.f2938e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* access modifiers changed from: protected */
    public int getPickerItemHeightPixels() {
        return getContext().getResources().getDimensionPixelSize(C1071c.picker_item_height);
    }

    public final int getPickerItemLayoutId() {
        return this.f2951r;
    }

    public final int getPickerItemTextViewId() {
        return this.f2952s;
    }

    public int getSelectedColumn() {
        return this.f2949p;
    }

    public final CharSequence getSeparator() {
        return this.f2950q.get(0);
    }

    public final List<CharSequence> getSeparators() {
        return this.f2950q;
    }

    public float getVisibleItemCount() {
        return 1.0f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3569h(int i, boolean z) {
        VerticalGridView verticalGridView = this.f2937d.get(i);
        int selectedPosition = verticalGridView.getSelectedPosition();
        int i2 = 0;
        while (i2 < verticalGridView.getAdapter().mo3580c()) {
            View F = verticalGridView.getLayoutManager().mo3728F(i2);
            if (F != null) {
                mo3559g(F, selectedPosition == i2, i, z);
            }
            i2++;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int selectedColumn = getSelectedColumn();
        if (selectedColumn < this.f2937d.size()) {
            return this.f2937d.get(selectedColumn).requestFocus(i, rect);
        }
        return false;
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        for (int i = 0; i < this.f2937d.size(); i++) {
            if (this.f2937d.get(i).hasFocus()) {
                setSelectedColumn(i);
            }
        }
    }

    public void setActivated(boolean z) {
        boolean isActivated = isActivated();
        super.setActivated(z);
        if (z != isActivated) {
            boolean hasFocus = hasFocus();
            int selectedColumn = getSelectedColumn();
            setDescendantFocusability(131072);
            if (!z && hasFocus && isFocusable()) {
                requestFocus();
            }
            for (int i = 0; i < getColumnsCount(); i++) {
                this.f2937d.get(i).setFocusable(z);
            }
            m3115i();
            m3117k();
            if (z && hasFocus && selectedColumn >= 0) {
                this.f2937d.get(selectedColumn).requestFocus();
            }
            setDescendantFocusability(262144);
        }
    }

    public void setActivatedVisibleItemCount(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        } else if (this.f2947n != f) {
            this.f2947n = f;
            if (isActivated()) {
                m3115i();
            }
        }
    }

    public void setColumns(List<C0590b> list) {
        if (this.f2950q.size() != 0) {
            if (this.f2950q.size() == 1) {
                CharSequence charSequence = this.f2950q.get(0);
                this.f2950q.clear();
                this.f2950q.add("");
                for (int i = 0; i < list.size() - 1; i++) {
                    this.f2950q.add(charSequence);
                }
                this.f2950q.add("");
            } else if (this.f2950q.size() != list.size() + 1) {
                throw new IllegalStateException("Separators size: " + this.f2950q.size() + " must" + "equal the size of columns: " + list.size() + " + 1");
            }
            this.f2937d.clear();
            this.f2936c.removeAllViews();
            ArrayList<C0590b> arrayList = new ArrayList<>(list);
            this.f2938e = arrayList;
            if (this.f2949p > arrayList.size() - 1) {
                this.f2949p = this.f2938e.size() - 1;
            }
            LayoutInflater from = LayoutInflater.from(getContext());
            int columnsCount = getColumnsCount();
            if (!TextUtils.isEmpty(this.f2950q.get(0))) {
                TextView textView = (TextView) from.inflate(C1076h.lb_picker_separator, this.f2936c, false);
                textView.setText(this.f2950q.get(0));
                this.f2936c.addView(textView);
            }
            int i2 = 0;
            while (i2 < columnsCount) {
                VerticalGridView verticalGridView = (VerticalGridView) from.inflate(C1076h.lb_picker_column, this.f2936c, false);
                m3116j(verticalGridView);
                verticalGridView.setWindowAlignment(0);
                verticalGridView.setHasFixedSize(false);
                verticalGridView.setFocusable(isActivated());
                verticalGridView.setItemViewCacheSize(0);
                this.f2937d.add(verticalGridView);
                this.f2936c.addView(verticalGridView);
                int i3 = i2 + 1;
                if (!TextUtils.isEmpty(this.f2950q.get(i3))) {
                    TextView textView2 = (TextView) from.inflate(C1076h.lb_picker_separator, this.f2936c, false);
                    textView2.setText(this.f2950q.get(i3));
                    this.f2936c.addView(textView2);
                }
                verticalGridView.setAdapter(new C0587b(getContext(), getPickerItemLayoutId(), getPickerItemTextViewId(), i2));
                verticalGridView.setOnChildViewHolderSelectedListener(this.f2953t);
                i2 = i3;
            }
            return;
        }
        throw new IllegalStateException("Separators size is: " + this.f2950q.size() + ". At least one separator must be provided");
    }

    public final void setPickerItemTextViewId(int i) {
        this.f2952s = i;
    }

    public void setSelectedColumn(int i) {
        if (this.f2949p != i) {
            this.f2949p = i;
            for (int i2 = 0; i2 < this.f2937d.size(); i2++) {
                mo3569h(i2, true);
            }
        }
    }

    public final void setSeparator(CharSequence charSequence) {
        setSeparators(Arrays.asList(charSequence));
    }

    public final void setSeparators(List<CharSequence> list) {
        this.f2950q.clear();
        this.f2950q.addAll(list);
    }

    public void setVisibleItemCount(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException();
        } else if (this.f2948o != f) {
            this.f2948o = f;
            if (!isActivated()) {
                m3115i();
            }
        }
    }
}
