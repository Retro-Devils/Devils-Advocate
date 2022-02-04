package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.AbstractC0145m;
import androidx.appcompat.view.menu.AbstractC0147n;
import java.util.ArrayList;
import p006b.p007a.C0760g;

/* renamed from: androidx.appcompat.view.menu.e */
public class C0127e implements AbstractC0145m, AdapterView.OnItemClickListener {

    /* renamed from: b */
    Context f518b;

    /* renamed from: c */
    LayoutInflater f519c;

    /* renamed from: d */
    C0130g f520d;

    /* renamed from: e */
    ExpandedMenuView f521e;

    /* renamed from: f */
    int f522f;

    /* renamed from: g */
    int f523g;

    /* renamed from: h */
    int f524h;

    /* renamed from: i */
    private AbstractC0145m.AbstractC0146a f525i;

    /* renamed from: j */
    C0128a f526j;

    /* renamed from: k */
    private int f527k;

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.e$a */
    public class C0128a extends BaseAdapter {

        /* renamed from: b */
        private int f528b = -1;

        public C0128a() {
            mo595a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo595a() {
            C0134i x = C0127e.this.f520d.mo684x();
            if (x != null) {
                ArrayList<C0134i> B = C0127e.this.f520d.mo612B();
                int size = B.size();
                for (int i = 0; i < size; i++) {
                    if (B.get(i) == x) {
                        this.f528b = i;
                        return;
                    }
                }
            }
            this.f528b = -1;
        }

        /* renamed from: b */
        public C0134i getItem(int i) {
            ArrayList<C0134i> B = C0127e.this.f520d.mo612B();
            int i2 = i + C0127e.this.f522f;
            int i3 = this.f528b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return B.get(i2);
        }

        public int getCount() {
            int size = C0127e.this.f520d.mo612B().size() - C0127e.this.f522f;
            return this.f528b < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0127e eVar = C0127e.this;
                view = eVar.f519c.inflate(eVar.f524h, viewGroup, false);
            }
            ((AbstractC0147n.AbstractC0148a) view).mo450e(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo595a();
            super.notifyDataSetChanged();
        }
    }

    public C0127e(int i, int i2) {
        this.f524h = i;
        this.f523g = i2;
    }

    public C0127e(Context context, int i) {
        this(i, 0);
        this.f518b = context;
        this.f519c = LayoutInflater.from(context);
    }

    /* renamed from: a */
    public ListAdapter mo590a() {
        if (this.f526j == null) {
            this.f526j = new C0128a();
        }
        return this.f526j;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: b */
    public void mo544b(C0130g gVar, boolean z) {
        AbstractC0145m.AbstractC0146a aVar = this.f525i;
        if (aVar != null) {
            aVar.mo347b(gVar, z);
        }
    }

    /* renamed from: c */
    public AbstractC0147n mo591c(ViewGroup viewGroup) {
        if (this.f521e == null) {
            this.f521e = (ExpandedMenuView) this.f519c.inflate(C0760g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f526j == null) {
                this.f526j = new C0128a();
            }
            this.f521e.setAdapter((ListAdapter) this.f526j);
            this.f521e.setOnItemClickListener(this);
        }
        return this.f521e;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: d */
    public int mo546d() {
        return this.f527k;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: e */
    public boolean mo568e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: f */
    public Parcelable mo569f() {
        if (this.f521e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo593o(bundle);
        return bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo547g(android.content.Context r3, androidx.appcompat.view.menu.C0130g r4) {
        /*
            r2 = this;
            int r0 = r2.f523g
            if (r0 == 0) goto L_0x0014
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f523g
            r0.<init>(r3, r1)
            r2.f518b = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L_0x0011:
            r2.f519c = r3
            goto L_0x0023
        L_0x0014:
            android.content.Context r0 = r2.f518b
            if (r0 == 0) goto L_0x0023
            r2.f518b = r3
            android.view.LayoutInflater r0 = r2.f519c
            if (r0 != 0) goto L_0x0023
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L_0x0011
        L_0x0023:
            r2.f520d = r4
            androidx.appcompat.view.menu.e$a r3 = r2.f526j
            if (r3 == 0) goto L_0x002c
            r3.notifyDataSetChanged()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0127e.mo547g(android.content.Context, androidx.appcompat.view.menu.g):void");
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: h */
    public void mo570h(Parcelable parcelable) {
        mo592l((Bundle) parcelable);
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

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: k */
    public void mo550k(AbstractC0145m.AbstractC0146a aVar) {
        this.f525i = aVar;
    }

    /* renamed from: l */
    public void mo592l(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f521e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: m */
    public boolean mo552m(SubMenuC0154r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new DialogInterface$OnKeyListenerC0133h(rVar).mo688d(null);
        AbstractC0145m.AbstractC0146a aVar = this.f525i;
        if (aVar == null) {
            return true;
        }
        aVar.mo348c(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: n */
    public void mo553n(boolean z) {
        C0128a aVar = this.f526j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: o */
    public void mo593o(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f521e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f520d.mo624O(this.f526j.getItem(i), this, 0);
    }
}
