package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C3111g;
import p006b.p030g.p039k.C1013s;
import p069c.p073b.p074a.p090b.C1395f;
import p069c.p073b.p074a.p090b.C1397h;

/* renamed from: com.google.android.material.datepicker.k */
class C3128k extends RecyclerView.AbstractC0658g<C3130b> {

    /* renamed from: c */
    private final C3103a f10456c;

    /* renamed from: d */
    private final AbstractC3108d<?> f10457d;

    /* renamed from: e */
    private final C3111g.AbstractC3123l f10458e;

    /* renamed from: f */
    private final int f10459f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.k$a */
    public class C3129a implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        final /* synthetic */ MaterialCalendarGridView f10460b;

        C3129a(MaterialCalendarGridView materialCalendarGridView) {
            this.f10460b = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f10460b.getAdapter().mo10460j(i)) {
                C3128k.this.f10458e.mo10427a(this.f10460b.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.k$b */
    public static class C3130b extends RecyclerView.AbstractC0655d0 {

        /* renamed from: t */
        final TextView f10462t;

        /* renamed from: u */
        final MaterialCalendarGridView f10463u;

        C3130b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C1395f.month_title);
            this.f10462t = textView;
            C1013s.m5768j0(textView, true);
            this.f10463u = (MaterialCalendarGridView) linearLayout.findViewById(C1395f.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    C3128k(Context context, AbstractC3108d<?> dVar, C3103a aVar, C3111g.AbstractC3123l lVar) {
        C3125i k = aVar.mo10398k();
        C3125i h = aVar.mo10394h();
        C3125i j = aVar.mo10397j();
        if (k.compareTo(j) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (j.compareTo(h) <= 0) {
            this.f10459f = (C3127j.f10451b * C3111g.m13003C2(context)) + (C3124h.m13033u2(context) ? C3111g.m13003C2(context) : 0);
            this.f10456c = aVar;
            this.f10457d = dVar;
            this.f10458e = lVar;
            mo4037s(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: c */
    public int mo3580c() {
        return this.f10456c.mo10396i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: d */
    public long mo4025d(int i) {
        return this.f10456c.mo10398k().mo10440m(i).mo10439l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C3125i mo10461v(int i) {
        return this.f10456c.mo10398k().mo10440m(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public CharSequence mo10462w(int i) {
        return mo10461v(i).mo10438k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo10463x(C3125i iVar) {
        return this.f10456c.mo10398k().mo10441n(iVar);
    }

    /* renamed from: y */
    public void mo3581j(C3130b bVar, int i) {
        C3125i m = this.f10456c.mo10398k().mo10440m(i);
        bVar.f10462t.setText(m.mo10438k());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f10463u.findViewById(C1395f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !m.equals(materialCalendarGridView.getAdapter().f10452c)) {
            C3127j jVar = new C3127j(m, this.f10457d, this.f10456c);
            materialCalendarGridView.setNumColumns(m.f10448f);
            materialCalendarGridView.setAdapter((ListAdapter) jVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new C3129a(materialCalendarGridView));
    }

    /* renamed from: z */
    public C3130b mo3582l(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C1397h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C3124h.m13033u2(viewGroup.getContext())) {
            return new C3130b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C0674p(-1, this.f10459f));
        return new C3130b(linearLayout, true);
    }
}
