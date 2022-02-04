package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.icu.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.p */
public class C3136p {

    /* renamed from: a */
    static AtomicReference<C3135o> f10461a = new AtomicReference<>();

    /* renamed from: a */
    static long m13071a(long j) {
        Calendar l = m13082l();
        l.setTimeInMillis(j);
        return m13074d(l).getTimeInMillis();
    }

    @TargetApi(24)
    /* renamed from: b */
    static DateFormat m13072b(Locale locale) {
        return m13073c("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: c */
    private static DateFormat m13073c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m13081k());
        return instanceForSkeleton;
    }

    /* renamed from: d */
    static Calendar m13074d(Calendar calendar) {
        Calendar m = m13083m(calendar);
        Calendar l = m13082l();
        l.set(m.get(1), m.get(2), m.get(5));
        return l;
    }

    /* renamed from: e */
    private static java.text.DateFormat m13075e(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m13079i());
        return dateInstance;
    }

    /* renamed from: f */
    static java.text.DateFormat m13076f(Locale locale) {
        return m13075e(0, locale);
    }

    /* renamed from: g */
    private static SimpleDateFormat m13077g(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(m13079i());
        return simpleDateFormat;
    }

    /* renamed from: h */
    static C3135o m13078h() {
        C3135o oVar = f10461a.get();
        return oVar == null ? C3135o.m13068c() : oVar;
    }

    /* renamed from: i */
    private static TimeZone m13079i() {
        return TimeZone.getTimeZone("UTC");
    }

    /* renamed from: j */
    static Calendar m13080j() {
        Calendar a = m13078h().mo10468a();
        a.set(11, 0);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        a.setTimeZone(m13079i());
        return a;
    }

    @TargetApi(24)
    /* renamed from: k */
    private static android.icu.util.TimeZone m13081k() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: l */
    static Calendar m13082l() {
        return m13083m(null);
    }

    /* renamed from: m */
    static Calendar m13083m(Calendar calendar) {
        Calendar instance = Calendar.getInstance(m13079i());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    /* renamed from: n */
    static DateFormat m13084n(Locale locale) {
        return m13073c("yMMMEd", locale);
    }

    /* renamed from: o */
    static SimpleDateFormat m13085o() {
        return m13086p(Locale.getDefault());
    }

    /* renamed from: p */
    private static SimpleDateFormat m13086p(Locale locale) {
        return m13077g("LLLL, yyyy", locale);
    }
}
