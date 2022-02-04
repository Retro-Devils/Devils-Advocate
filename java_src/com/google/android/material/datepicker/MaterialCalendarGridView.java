package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import p006b.p030g.p038j.C0957e;
import p006b.p030g.p039k.C0962a;
import p006b.p030g.p039k.C1013s;
import p006b.p030g.p039k.p040b0.C0979c;
import p069c.p073b.p074a.p090b.C1395f;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: b */
    private final Calendar f10380b;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C3102a extends C0962a {
        C3102a() {
        }

        @Override // p006b.p030g.p039k.C0962a
        /* renamed from: g */
        public void mo2362g(View view, C0979c cVar) {
            super.mo2362g(view, cVar);
            cVar.mo5474c0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10380b = C3136p.m13082l();
        if (C3124h.m13033u2(getContext())) {
            setNextFocusLeftId(C1395f.cancel_button);
            setNextFocusRightId(C1395f.confirm_button);
        }
        C1013s.m5766i0(this, new C3102a());
    }

    /* renamed from: a */
    private void m12974a(int i, Rect rect) {
        int b;
        if (i == 33) {
            b = getAdapter().mo10457h();
        } else if (i == 130) {
            b = getAdapter().mo10448b();
        } else {
            super.onFocusChanged(true, i, rect);
            return;
        }
        setSelection(b);
    }

    /* renamed from: c */
    private static int m12975c(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: d */
    private static boolean m12976d(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: b */
    public C3127j getAdapter() {
        return (C3127j) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C3127j b = getAdapter();
        AbstractC3108d<?> dVar = b.f10453d;
        C3107c cVar = b.f10454e;
        Long c = b.getItem(b.mo10448b());
        Long c2 = b.getItem(b.mo10457h());
        for (C0957e<Long, Long> eVar : dVar.mo10410c()) {
            F f = eVar.f4658a;
            if (f != null) {
                if (eVar.f4659b == null) {
                    continue;
                } else {
                    long longValue = f.longValue();
                    long longValue2 = eVar.f4659b.longValue();
                    if (!m12976d(c, c2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        if (longValue < c.longValue()) {
                            i2 = b.mo10448b();
                            i = b.mo10451f(i2) ? 0 : materialCalendarGridView.getChildAt(i2 - 1).getRight();
                        } else {
                            materialCalendarGridView.f10380b.setTimeInMillis(longValue);
                            i2 = b.mo10447a(materialCalendarGridView.f10380b.get(5));
                            i = m12975c(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > c2.longValue()) {
                            i4 = Math.min(b.mo10457h(), getChildCount() - 1);
                            i3 = b.mo10452g(i4) ? getWidth() : materialCalendarGridView.getChildAt(i4).getRight();
                        } else {
                            materialCalendarGridView.f10380b.setTimeInMillis(longValue2);
                            i4 = b.mo10447a(materialCalendarGridView.f10380b.get(5));
                            i3 = m12975c(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) b.getItemId(i2);
                        int itemId2 = (int) b.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i2 ? 0 : i), (float) (childAt.getTop() + cVar.f10394a.mo10407c()), (float) (i4 > numColumns2 ? getWidth() : i3), (float) (childAt.getBottom() - cVar.f10394a.mo10406b()), cVar.f10401h);
                            itemId++;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m12974a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo10448b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo10448b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C3127j) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C3127j.class.getCanonicalName()));
        }
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo10448b()) {
            i = getAdapter().mo10448b();
        }
        super.setSelection(i);
    }
}
