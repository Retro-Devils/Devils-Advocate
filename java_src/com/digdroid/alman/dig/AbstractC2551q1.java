package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.widget.CursorAdapter;
import java.util.Calendar;

/* renamed from: com.digdroid.alman.dig.q1 */
public abstract class AbstractC2551q1 extends CursorAdapter {

    /* renamed from: b */
    C2774t3 f8884b;

    /* renamed from: c */
    Cursor f8885c;

    /* renamed from: d */
    float f8886d;

    /* renamed from: e */
    LayoutInflater f8887e;

    public AbstractC2551q1(Activity activity, C2774t3 t3Var, Cursor cursor, float f) {
        super((Context) activity, cursor, false);
        this.f8884b = t3Var;
        this.f8885c = cursor;
        this.f8886d = f;
        this.f8887e = LayoutInflater.from(activity);
    }

    /* renamed from: a */
    public void mo8970a() {
        Cursor cursor = this.f8885c;
        if (cursor != null) {
            cursor.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo8971b(long j) {
        if (j <= 0) {
            return "";
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return "" + instance.get(1);
    }
}
