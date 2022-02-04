package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.AbstractC0147n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
public class C0129f extends BaseAdapter {

    /* renamed from: b */
    C0130g f530b;

    /* renamed from: c */
    private int f531c = -1;

    /* renamed from: d */
    private boolean f532d;

    /* renamed from: e */
    private final boolean f533e;

    /* renamed from: f */
    private final LayoutInflater f534f;

    /* renamed from: g */
    private final int f535g;

    public C0129f(C0130g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f533e = z;
        this.f534f = layoutInflater;
        this.f530b = gVar;
        this.f535g = i;
        mo602a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo602a() {
        C0134i x = this.f530b.mo684x();
        if (x != null) {
            ArrayList<C0134i> B = this.f530b.mo612B();
            int size = B.size();
            for (int i = 0; i < size; i++) {
                if (B.get(i) == x) {
                    this.f531c = i;
                    return;
                }
            }
        }
        this.f531c = -1;
    }

    /* renamed from: b */
    public C0130g mo603b() {
        return this.f530b;
    }

    /* renamed from: c */
    public C0134i getItem(int i) {
        ArrayList<C0134i> B = this.f533e ? this.f530b.mo612B() : this.f530b.mo616G();
        int i2 = this.f531c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return B.get(i);
    }

    /* renamed from: d */
    public void mo605d(boolean z) {
        this.f532d = z;
    }

    public int getCount() {
        ArrayList<C0134i> B = this.f533e ? this.f530b.mo612B() : this.f530b.mo616G();
        int i = this.f531c;
        int size = B.size();
        return i < 0 ? size : size - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f534f.inflate(this.f535g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f530b.mo617H() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        AbstractC0147n.AbstractC0148a aVar = (AbstractC0147n.AbstractC0148a) view;
        if (this.f532d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo450e(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo602a();
        super.notifyDataSetChanged();
    }
}
