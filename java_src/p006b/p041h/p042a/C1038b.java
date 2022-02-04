package p006b.p041h.p042a;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: b.h.a.b */
class C1038b extends Filter {

    /* renamed from: a */
    AbstractC1039a f4801a;

    /* renamed from: b.h.a.b$a */
    interface AbstractC1039a {
        /* renamed from: a */
        void mo1700a(Cursor cursor);

        /* renamed from: b */
        CharSequence mo1701b(Cursor cursor);

        /* renamed from: c */
        Cursor mo5592c();

        /* renamed from: d */
        Cursor mo1702d(CharSequence charSequence);
    }

    C1038b(AbstractC1039a aVar) {
        this.f4801a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f4801a.mo1701b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor d = this.f4801a.mo1702d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (d != null) {
            filterResults.count = d.getCount();
        } else {
            filterResults.count = 0;
            d = null;
        }
        filterResults.values = d;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor c = this.f4801a.mo5592c();
        Object obj = filterResults.values;
        if (obj != null && obj != c) {
            this.f4801a.mo1700a((Cursor) obj);
        }
    }
}
