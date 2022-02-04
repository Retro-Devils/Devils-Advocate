package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.widget.C0296w0;

public final class ExpandedMenuView extends ListView implements C0130g.AbstractC0132b, AbstractC0147n, AdapterView.OnItemClickListener {

    /* renamed from: b */
    private static final int[] f428b = {16842964, 16843049};

    /* renamed from: c */
    private C0130g f429c;

    /* renamed from: d */
    private int f430d;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0296w0 v = C0296w0.m1432v(context, attributeSet, f428b, i, 0);
        if (v.mo1822s(0)) {
            setBackgroundDrawable(v.mo1810g(0));
        }
        if (v.mo1822s(1)) {
            setDivider(v.mo1810g(1));
        }
        v.mo1823w();
    }

    @Override // androidx.appcompat.view.menu.C0130g.AbstractC0132b
    /* renamed from: a */
    public boolean mo469a(C0134i iVar) {
        return this.f429c.mo623N(iVar, 0);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0147n
    /* renamed from: b */
    public void mo470b(C0130g gVar) {
        this.f429c = gVar;
    }

    public int getWindowAnimations() {
        return this.f430d;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo469a((C0134i) getAdapter().getItem(i));
    }
}
