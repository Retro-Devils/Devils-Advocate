package com.digdroid.alman.dig;

import android.database.Cursor;
import android.graphics.Point;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.digdroid.alman.dig.C2267e2;

/* renamed from: com.digdroid.alman.dig.h */
abstract class AbstractC2365h extends RecyclerView.AbstractC0658g<RecyclerView.AbstractC0655d0> {

    /* renamed from: c */
    C2774t3 f8296c;

    /* renamed from: d */
    Cursor f8297d;

    /* renamed from: e */
    int f8298e = 0;

    /* renamed from: f */
    int f8299f;

    /* renamed from: g */
    float f8300g;

    /* renamed from: h */
    float f8301h;

    /* renamed from: i */
    C2267e2.AbstractC2289v f8302i = null;

    /* renamed from: j */
    C2267e2.AbstractC2290w f8303j = null;

    /* renamed from: k */
    AbstractC2368c f8304k = null;

    /* renamed from: com.digdroid.alman.dig.h$a */
    class View$OnClickListenerC2366a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f8305b;

        View$OnClickListenerC2366a(int i) {
            this.f8305b = i;
        }

        public void onClick(View view) {
            C2267e2.AbstractC2289v vVar = AbstractC2365h.this.f8302i;
            if (vVar != null) {
                vVar.mo8404a(view, this.f8305b);
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.h$b */
    class View$OnLongClickListenerC2367b implements View.OnLongClickListener {

        /* renamed from: b */
        final /* synthetic */ int f8307b;

        View$OnLongClickListenerC2367b(int i) {
            this.f8307b = i;
        }

        public boolean onLongClick(View view) {
            C2267e2.AbstractC2290w wVar = AbstractC2365h.this.f8303j;
            if (wVar != null) {
                return wVar.mo8405a(view, this.f8307b);
            }
            return true;
        }
    }

    /* renamed from: com.digdroid.alman.dig.h$c */
    interface AbstractC2368c {
        /* renamed from: a */
        void mo8531a(Cursor cursor);
    }

    public AbstractC2365h(MainActivity mainActivity, C2774t3 t3Var, Cursor cursor, float f, float f2) {
        long round;
        synchronized (C2827w1.class) {
            this.f8296c = t3Var;
            this.f8297d = cursor;
            if (cursor.moveToFirst()) {
                this.f8298e = cursor.getCount();
            } else {
                this.f8298e = 0;
            }
            Point g = mainActivity.mo8203g(false);
            int i = g.x;
            int i2 = g.y;
            if (i > i2) {
                double d = (double) i2;
                Double.isNaN(d);
                round = Math.round(d / 2.5d);
            } else {
                double d2 = (double) i;
                Double.isNaN(d2);
                round = Math.round(d2 / 3.5d);
            }
            this.f8299f = (int) round;
        }
        this.f8300g = f;
        this.f8301h = f2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0658g
    /* renamed from: c */
    public int mo3580c() {
        int i;
        synchronized (C2827w1.class) {
            i = this.f8298e;
        }
        return i;
    }

    /* renamed from: u */
    public void mo8523u(Cursor cursor) {
        synchronized (C2827w1.class) {
            Cursor cursor2 = this.f8297d;
            if (cursor2 != null && !cursor2.isClosed()) {
                this.f8297d.close();
            }
            this.f8297d = cursor;
            if (cursor.moveToFirst()) {
                this.f8298e = cursor.getCount();
            } else {
                this.f8298e = 0;
            }
            AbstractC2368c cVar = this.f8304k;
            if (cVar != null) {
                cVar.mo8531a(this.f8297d);
            }
            mo4029h();
        }
    }

    /* renamed from: v */
    public void mo8524v() {
        synchronized (C2827w1.class) {
            Cursor cursor = this.f8297d;
            if (cursor != null && !cursor.isClosed()) {
                this.f8297d.close();
            }
            this.f8297d = null;
            this.f8298e = 0;
        }
    }

    /* renamed from: w */
    public Cursor mo8525w() {
        return this.f8297d;
    }

    /* renamed from: x */
    public void mo8526x(C2267e2.AbstractC2289v vVar) {
        this.f8302i = vVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo8527y(View view, int i) {
        view.setOnClickListener(new View$OnClickListenerC2366a(i));
        view.setOnLongClickListener(new View$OnLongClickListenerC2367b(i));
    }

    /* renamed from: z */
    public void mo8528z(C2267e2.AbstractC2290w wVar) {
        this.f8303j = wVar;
    }
}
