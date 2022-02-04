package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C3111g;
import java.util.Calendar;
import java.util.Locale;
import p069c.p073b.p074a.p090b.C1397h;
import p069c.p073b.p074a.p090b.C1398i;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.q */
public class C3137q extends RecyclerView.AbstractC0658g<C3139b> {

    /* renamed from: c */
    private final C3111g<?> f10462c;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.q$a */
    public class View$OnClickListenerC3138a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f10463b;

        View$OnClickListenerC3138a(int i) {
            this.f10463b = i;
        }

        public void onClick(View view) {
            C3137q.this.f10462c.mo10421F2(C3137q.this.f10462c.mo10424y2().mo10390b(C3125i.m13034g(this.f10463b, C3137q.this.f10462c.mo10418A2().f10438d)));
            C3137q.this.f10462c.mo10422G2(C3111g.EnumC3122k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.q$b */
    public static class C3139b extends RecyclerView.AbstractC0655d0 {

        /* renamed from: t */
        final TextView f10465t;

        C3139b(TextView textView) {
            super(textView);
            this.f10465t = textView;
        }
    }

    C3137q(C3111g<?> gVar) {
        this.f10462c = gVar;
    }

    /* renamed from: v */
    private View.OnClickListener m13088v(int i) {
        return new View$OnClickListenerC3138a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: c */
    public int mo3580c() {
        return this.f10462c.mo10424y2().mo10399l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public int mo10470w(int i) {
        return i - this.f10462c.mo10424y2().mo10398k().f10439e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public int mo10471x(int i) {
        return this.f10462c.mo10424y2().mo10398k().f10439e + i;
    }

    /* renamed from: y */
    public void mo3581j(C3139b bVar, int i) {
        int x = mo10471x(i);
        String string = bVar.f10465t.getContext().getString(C1398i.mtrl_picker_navigate_to_year_description);
        bVar.f10465t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(x)));
        bVar.f10465t.setContentDescription(String.format(string, Integer.valueOf(x)));
        C3107c z2 = this.f10462c.mo10425z2();
        Calendar j = C3136p.m13080j();
        C3106b bVar2 = j.get(1) == x ? z2.f10391f : z2.f10389d;
        for (Long l : this.f10462c.mo10419B2().mo10412f()) {
            j.setTimeInMillis(l.longValue());
            if (j.get(1) == x) {
                bVar2 = z2.f10390e;
            }
        }
        bVar2.mo10408d(bVar.f10465t);
        bVar.f10465t.setOnClickListener(m13088v(x));
    }

    /* renamed from: z */
    public C3139b mo3582l(ViewGroup viewGroup, int i) {
        return new C3139b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1397h.mtrl_calendar_year, viewGroup, false));
    }
}
