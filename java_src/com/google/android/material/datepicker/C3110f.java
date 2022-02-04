package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p069c.p073b.p074a.p090b.C1397h;
import p069c.p073b.p074a.p090b.C1398i;

/* renamed from: com.google.android.material.datepicker.f */
class C3110f extends BaseAdapter {

    /* renamed from: b */
    private static final int f10402b = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: c */
    private final Calendar f10403c;

    /* renamed from: d */
    private final int f10404d;

    /* renamed from: e */
    private final int f10405e;

    public C3110f() {
        Calendar l = C3136p.m13082l();
        this.f10403c = l;
        this.f10404d = l.getMaximum(7);
        this.f10405e = l.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m13001b(int i) {
        int i2 = i + this.f10405e;
        int i3 = this.f10404d;
        return i2 > i3 ? i2 - i3 : i2;
    }

    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f10404d) {
            return null;
        }
        return Integer.valueOf(m13001b(i));
    }

    public int getCount() {
        return this.f10404d;
    }

    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1397h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f10403c.set(7, m13001b(i));
        textView.setText(this.f10403c.getDisplayName(7, f10402b, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C1398i.mtrl_picker_day_of_week_column_header), this.f10403c.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
