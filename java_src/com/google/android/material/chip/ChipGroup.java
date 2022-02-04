package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.material.internal.C3172d;
import java.util.ArrayList;
import java.util.List;
import p006b.p030g.p039k.p040b0.C0979c;
import p069c.p073b.p074a.p090b.C1391b;
import p069c.p073b.p074a.p090b.C1399j;

public class ChipGroup extends C3172d {

    /* renamed from: f */
    private static final int f10303f = C1399j.Widget_MaterialComponents_ChipGroup;

    /* renamed from: g */
    private int f10304g;

    /* renamed from: h */
    private int f10305h;

    /* renamed from: i */
    private boolean f10306i;

    /* renamed from: j */
    private boolean f10307j;

    /* renamed from: k */
    private AbstractC3098d f10308k;

    /* renamed from: l */
    private final C3096b f10309l;

    /* renamed from: m */
    private ViewGroup$OnHierarchyChangeListenerC3099e f10310m;

    /* renamed from: n */
    private int f10311n;

    /* renamed from: o */
    private boolean f10312o;

    /* access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    public class C3096b implements CompoundButton.OnCheckedChangeListener {
        private C3096b() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!ChipGroup.this.f10312o) {
                if (!ChipGroup.this.getCheckedChipIds().isEmpty() || !ChipGroup.this.f10307j) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(ChipGroup.this.f10311n == -1 || ChipGroup.this.f10311n == id || !ChipGroup.this.f10306i)) {
                            ChipGroup chipGroup = ChipGroup.this;
                            chipGroup.m12829q(chipGroup.f10311n, false);
                        }
                        ChipGroup.this.setCheckedId(id);
                    } else if (ChipGroup.this.f10311n == id) {
                        ChipGroup.this.setCheckedId(-1);
                    }
                } else {
                    ChipGroup.this.m12829q(compoundButton.getId(), true);
                    ChipGroup.this.m12828p(compoundButton.getId(), false);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    public static class C3097c extends ViewGroup.MarginLayoutParams {
        public C3097c(int i, int i2) {
            super(i, i2);
        }

        public C3097c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C3097c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    public interface AbstractC3098d {
        /* renamed from: a */
        void mo10263a(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    private class ViewGroup$OnHierarchyChangeListenerC3099e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b */
        private ViewGroup.OnHierarchyChangeListener f10314b;

        private ViewGroup$OnHierarchyChangeListenerC3099e() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : view2.hashCode());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f10309l);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f10314b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f10314b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1391b.chipGroupStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: p */
    private void m12828p(int i, boolean z) {
        this.f10311n = i;
        AbstractC3098d dVar = this.f10308k;
        if (dVar != null && this.f10306i && z) {
            dVar.mo10263a(this, i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: q */
    private void m12829q(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f10312o = true;
            ((Chip) findViewById).setChecked(z);
            this.f10312o = false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setCheckedId(int i) {
        m12828p(i, true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f10311n;
                if (i2 != -1 && this.f10306i) {
                    m12829q(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // com.google.android.material.internal.C3172d
    /* renamed from: c */
    public boolean mo10230c() {
        return super.mo10230c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C3097c);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C3097c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3097c(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C3097c(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f10306i) {
            return this.f10311n;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f10306i) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f10304g;
    }

    public int getChipSpacingVertical() {
        return this.f10305h;
    }

    /* renamed from: m */
    public void mo10239m() {
        this.f10312o = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f10312o = false;
        setCheckedId(-1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public int mo10240n(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (((Chip) getChildAt(i2)) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: o */
    public boolean mo10241o() {
        return this.f10306i;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f10311n;
        if (i != -1) {
            m12829q(i, true);
            setCheckedId(this.f10311n);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0979c.m5570B0(accessibilityNodeInfo).mo5474c0(C0979c.C0981b.m5655b(getRowCount(), mo10230c() ? getChipCount() : -1, false, mo10241o() ? 1 : 2));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f10304g != i) {
            this.f10304g = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f10305h != i) {
            this.f10305h = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(AbstractC3098d dVar) {
        this.f10308k = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f10310m.f10314b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f10307j = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // com.google.android.material.internal.C3172d
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f10306i != z) {
            this.f10306i = z;
            mo10239m();
        }
    }
}
