package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.k */
public abstract class AbstractC0142k implements AbstractC0150p, AbstractC0145m, AdapterView.OnItemClickListener {

    /* renamed from: b */
    private Rect f610b;

    AbstractC0142k() {
    }

    /* renamed from: A */
    protected static boolean m750A(C0130g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    protected static C0129f m751B(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (C0129f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C0129f) listAdapter;
    }

    /* renamed from: r */
    protected static int m752r(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: d */
    public int mo546d() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: g */
    public void mo547g(Context context, C0130g gVar) {
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: i */
    public boolean mo548i(C0130g gVar, C0134i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: j */
    public boolean mo549j(C0130g gVar, C0134i iVar) {
        return false;
    }

    /* renamed from: o */
    public abstract void mo572o(C0130g gVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m751B(listAdapter).f530b.mo624O((MenuItem) listAdapter.getItem(i), this, mo575p() ? 0 : 4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public boolean mo575p() {
        return true;
    }

    /* renamed from: q */
    public Rect mo822q() {
        return this.f610b;
    }

    /* renamed from: s */
    public abstract void mo576s(View view);

    /* renamed from: t */
    public void mo823t(Rect rect) {
        this.f610b = rect;
    }

    /* renamed from: u */
    public abstract void mo577u(boolean z);

    /* renamed from: v */
    public abstract void mo578v(int i);

    /* renamed from: w */
    public abstract void mo579w(int i);

    /* renamed from: x */
    public abstract void mo580x(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: y */
    public abstract void mo581y(boolean z);

    /* renamed from: z */
    public abstract void mo582z(int i);
}
