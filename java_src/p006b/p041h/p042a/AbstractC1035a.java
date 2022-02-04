package p006b.p041h.p042a;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import p006b.p041h.p042a.C1038b;

/* renamed from: b.h.a.a */
public abstract class AbstractC1035a extends BaseAdapter implements Filterable, C1038b.AbstractC1039a {

    /* renamed from: b */
    protected boolean f4791b;

    /* renamed from: c */
    protected boolean f4792c;

    /* renamed from: d */
    protected Cursor f4793d;

    /* renamed from: e */
    protected Context f4794e;

    /* renamed from: f */
    protected int f4795f;

    /* renamed from: g */
    protected C1036a f4796g;

    /* renamed from: h */
    protected DataSetObserver f4797h;

    /* renamed from: i */
    protected C1038b f4798i;

    /* access modifiers changed from: private */
    /* renamed from: b.h.a.a$a */
    public class C1036a extends ContentObserver {
        C1036a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            AbstractC1035a.this.mo5599i();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.h.a.a$b */
    public class C1037b extends DataSetObserver {
        C1037b() {
        }

        public void onChanged() {
            AbstractC1035a aVar = AbstractC1035a.this;
            aVar.f4791b = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            AbstractC1035a aVar = AbstractC1035a.this;
            aVar.f4791b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public AbstractC1035a(Context context, Cursor cursor, boolean z) {
        mo5593f(context, cursor, z ? 1 : 2);
    }

    @Override // p006b.p041h.p042a.C1038b.AbstractC1039a
    /* renamed from: a */
    public void mo1700a(Cursor cursor) {
        Cursor j = mo5600j(cursor);
        if (j != null) {
            j.close();
        }
    }

    @Override // p006b.p041h.p042a.C1038b.AbstractC1039a
    /* renamed from: b */
    public abstract CharSequence mo1701b(Cursor cursor);

    @Override // p006b.p041h.p042a.C1038b.AbstractC1039a
    /* renamed from: c */
    public Cursor mo5592c() {
        return this.f4793d;
    }

    /* renamed from: e */
    public abstract void mo1703e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo5593f(Context context, Cursor cursor, int i) {
        C1037b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f4792c = true;
        } else {
            this.f4792c = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f4793d = cursor;
        this.f4791b = z;
        this.f4794e = context;
        this.f4795f = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f4796g = new C1036a();
            bVar = new C1037b();
        } else {
            bVar = null;
            this.f4796g = null;
        }
        this.f4797h = bVar;
        if (z) {
            C1036a aVar = this.f4796g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f4797h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo5594g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f4791b || (cursor = this.f4793d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f4791b) {
            return null;
        }
        this.f4793d.moveToPosition(i);
        if (view == null) {
            view = mo5594g(this.f4794e, this.f4793d, viewGroup);
        }
        mo1703e(view, this.f4794e, this.f4793d);
        return view;
    }

    public Filter getFilter() {
        if (this.f4798i == null) {
            this.f4798i = new C1038b(this);
        }
        return this.f4798i;
    }

    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f4791b || (cursor = this.f4793d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f4793d;
    }

    public long getItemId(int i) {
        Cursor cursor;
        if (!this.f4791b || (cursor = this.f4793d) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.f4793d.getLong(this.f4795f);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f4791b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f4793d.moveToPosition(i)) {
            if (view == null) {
                view = mo1706h(this.f4794e, this.f4793d, viewGroup);
            }
            mo1703e(view, this.f4794e, this.f4793d);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    /* renamed from: h */
    public abstract View mo1706h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo5599i() {
        Cursor cursor;
        if (this.f4792c && (cursor = this.f4793d) != null && !cursor.isClosed()) {
            this.f4791b = this.f4793d.requery();
        }
    }

    /* renamed from: j */
    public Cursor mo5600j(Cursor cursor) {
        Cursor cursor2 = this.f4793d;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C1036a aVar = this.f4796g;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f4797h;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f4793d = cursor;
        if (cursor != null) {
            C1036a aVar2 = this.f4796g;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f4797h;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f4795f = cursor.getColumnIndexOrThrow("_id");
            this.f4791b = true;
            notifyDataSetChanged();
        } else {
            this.f4795f = -1;
            this.f4791b = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
