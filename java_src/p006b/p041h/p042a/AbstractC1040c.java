package p006b.p041h.p042a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.h.a.c */
public abstract class AbstractC1040c extends AbstractC1035a {

    /* renamed from: j */
    private int f4798j;

    /* renamed from: k */
    private int f4799k;

    /* renamed from: l */
    private LayoutInflater f4800l;

    @Deprecated
    public AbstractC1040c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f4799k = i;
        this.f4798j = i;
        this.f4800l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p006b.p041h.p042a.AbstractC1035a
    /* renamed from: g */
    public View mo5594g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f4800l.inflate(this.f4799k, viewGroup, false);
    }

    @Override // p006b.p041h.p042a.AbstractC1035a
    /* renamed from: h */
    public View mo1706h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f4800l.inflate(this.f4798j, viewGroup, false);
    }
}
