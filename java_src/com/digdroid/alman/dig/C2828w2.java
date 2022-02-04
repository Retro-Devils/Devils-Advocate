package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.core.graphics.drawable.C0398a;
import java.lang.ref.WeakReference;
import p006b.p057o.p058a.C1088a;

/* renamed from: com.digdroid.alman.dig.w2 */
public class C2828w2 {

    /* renamed from: a */
    private final WeakReference<Activity> f9567a;

    /* renamed from: b */
    SQLiteDatabase f9568b;

    /* renamed from: c */
    boolean f9569c;

    /* renamed from: d */
    C2219c3 f9570d;

    /* renamed from: e */
    private long f9571e;

    /* renamed from: f */
    private long f9572f = -1;

    /* renamed from: g */
    float f9573g = -1.0f;

    /* renamed from: h */
    private AbstractC2838j f9574h;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.w2$a */
    public class C2829a implements RatingBar.OnRatingBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C2830b f9575a;

        C2829a(C2830b bVar) {
            this.f9575a = bVar;
        }

        public void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
            this.f9575a.f9577a = f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.w2$b */
    public class C2830b {

        /* renamed from: a */
        public float f9577a;

        /* renamed from: b */
        boolean f9578b;

        /* renamed from: c */
        boolean f9579c;

        /* renamed from: d */
        boolean f9580d;

        C2830b() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.w2$c */
    public class C2831c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C2830b f9582a;

        /* renamed from: b */
        final /* synthetic */ RatingBar f9583b;

        C2831c(C2830b bVar, RatingBar ratingBar) {
            this.f9582a = bVar;
            this.f9583b = ratingBar;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f9582a.f9577a = (float) (z ? -1 : 5);
            this.f9583b.setVisibility(z ? 8 : 0);
            if (!z) {
                this.f9583b.setRating(5.0f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.w2$d */
    public class C2832d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C2830b f9585a;

        C2832d(C2830b bVar) {
            this.f9585a = bVar;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f9585a.f9578b = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.w2$e */
    public class C2833e implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C2830b f9587a;

        C2833e(C2830b bVar) {
            this.f9587a = bVar;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f9587a.f9579c = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.w2$f */
    public class C2834f implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C2830b f9589a;

        C2834f(C2830b bVar) {
            this.f9589a = bVar;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f9589a.f9580d = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.w2$g */
    public class DialogInterface$OnClickListenerC2835g implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2835g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2828w2.this.f9574h.mo8071a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.w2$h */
    public class DialogInterface$OnClickListenerC2836h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ C2830b f9592b;

        /* renamed from: c */
        final /* synthetic */ Activity f9593c;

        DialogInterface$OnClickListenerC2836h(C2830b bVar, Activity activity) {
            this.f9592b = bVar;
            this.f9593c = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2828w2.this.f9570d.mo8152A("share_ratings", this.f9592b.f9578b);
            C2828w2.this.f9570d.mo8152A("share_stats", this.f9592b.f9579c);
            C2828w2.this.f9570d.mo8152A("dont_ask_to_rate", this.f9592b.f9580d);
            new AsyncTaskC2839k().execute(Float.valueOf(C2828w2.this.f9573g), Float.valueOf(this.f9592b.f9577a));
            if (this.f9592b.f9578b && C2828w2.this.f9572f >= 0) {
                ServerService.m9574s(this.f9593c, C2828w2.this.f9572f, this.f9592b.f9577a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.w2$i */
    public class AsyncTaskC2837i extends AsyncTask<Void, Void, Void> {
        AsyncTaskC2837i() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            SQLiteDatabase sQLiteDatabase = C2828w2.this.f9568b;
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT mdbid,rating FROM roms WHERE _id=" + C2828w2.this.f9571e, null);
            if (!rawQuery.moveToFirst()) {
                rawQuery.close();
                C2828w2.this.f9574h.mo8071a(false);
                return null;
            }
            C2828w2.this.f9572f = rawQuery.getLong(0);
            if (!rawQuery.isNull(1)) {
                C2828w2.this.f9573g = rawQuery.getFloat(1);
            }
            rawQuery.close();
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void r3) {
            if (C2828w2.this.f9567a.get() != null && !((Activity) C2828w2.this.f9567a.get()).isFinishing()) {
                C2828w2 w2Var = C2828w2.this;
                if (!w2Var.f9569c || w2Var.f9573g < 0.0f) {
                    w2Var.mo9397g();
                } else {
                    w2Var.f9574h.mo8071a(false);
                }
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.w2$j */
    public interface AbstractC2838j {
        /* renamed from: a */
        void mo8071a(boolean z);
    }

    /* renamed from: com.digdroid.alman.dig.w2$k */
    class AsyncTaskC2839k extends AsyncTask<Float, Void, Void> {
        AsyncTaskC2839k() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Float... fArr) {
            StringBuilder sb;
            long j;
            float floatValue = fArr[0].floatValue();
            float floatValue2 = fArr[1].floatValue();
            if (C2828w2.this.f9572f >= 0) {
                Cursor rawQuery = C2828w2.this.f9568b.rawQuery("SELECT c_rating,c_rating_count FROM roms WHERE mdbid=" + C2828w2.this.f9572f, null);
                rawQuery.moveToFirst();
                int i = rawQuery.getInt(1);
                float f = rawQuery.getFloat(0) * ((float) i);
                rawQuery.close();
                if (floatValue >= 0.0f && i > 0) {
                    f -= floatValue;
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                    i--;
                }
                if (floatValue2 >= 0.0f) {
                    f += floatValue2;
                    i++;
                }
                if (i > 0) {
                    f /= (float) i;
                }
                C2828w2.this.f9568b.execSQL("UPDATE roms SET c_rating=" + f + ",c_rating_count=" + i + " WHERE mdbid=" + C2828w2.this.f9572f);
            }
            ContentValues contentValues = new ContentValues();
            if (floatValue2 < 0.0f) {
                contentValues.put("rating", (Float) null);
            } else {
                contentValues.put("rating", Float.valueOf(floatValue2));
            }
            int i2 = (C2828w2.this.f9572f > 0 ? 1 : (C2828w2.this.f9572f == 0 ? 0 : -1));
            SQLiteDatabase sQLiteDatabase = C2828w2.this.f9568b;
            if (i2 >= 0) {
                sb.append("mdbid=");
                j = C2828w2.this.f9572f;
            } else {
                sb = new StringBuilder();
                sb.append("_id=");
                j = C2828w2.this.f9571e;
            }
            sb.append(j);
            sQLiteDatabase.update("roms", contentValues, sb.toString(), null);
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void r4) {
            Activity activity = (Activity) C2828w2.this.f9567a.get();
            if (activity != null && !activity.isFinishing()) {
                C1088a.m6129b(activity).mo5723d(new Intent(activity.getPackageName() + "." + "request_refresh"));
                C2828w2.this.f9574h.mo8071a(true);
            }
        }
    }

    public C2828w2(Activity activity, SQLiteDatabase sQLiteDatabase, boolean z, AbstractC2838j jVar) {
        this.f9567a = new WeakReference<>(activity);
        this.f9568b = sQLiteDatabase;
        this.f9574h = jVar;
        this.f9569c = z;
        this.f9570d = C2219c3.m9805k(activity);
    }

    /* renamed from: h */
    private void m11816h(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0398a.m1977n(drawable, i);
        } else {
            drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
    }

    /* renamed from: f */
    public void mo9396f(long j) {
        this.f9571e = j;
        if (!this.f9569c || !this.f9570d.mo8180c("dont_ask_to_rate", false)) {
            new AsyncTaskC2837i().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else {
            this.f9574h.mo8071a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo9397g() {
        Activity activity = this.f9567a.get();
        if (activity != null && !activity.isFinishing()) {
            View inflate = activity.getLayoutInflater().inflate(R.layout.rategame, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.ask_played)).setTextColor(C2553q3.m11116b());
            int i = 8;
            inflate.findViewById(R.id.ask_played).setVisibility(this.f9569c ? 0 : 8);
            C2830b bVar = new C2830b();
            bVar.f9577a = this.f9573g;
            boolean z = true;
            bVar.f9578b = this.f9570d.mo8180c("share_ratings", true);
            bVar.f9579c = this.f9570d.mo8180c("share_stats", true);
            bVar.f9580d = this.f9570d.mo8180c("dont_ask_to_rate", false);
            RatingBar ratingBar = (RatingBar) inflate.findViewById(R.id.rating_bar);
            C2553q3.m11132r(ratingBar, C2553q3.f8899a.mo9318b());
            LayerDrawable layerDrawable = (LayerDrawable) ratingBar.getProgressDrawable();
            m11816h(layerDrawable.getDrawable(2), -8448);
            m11816h(layerDrawable.getDrawable(1), 1082689672);
            m11816h(layerDrawable.getDrawable(0), 1082689672);
            ratingBar.setRating(Math.max(0.0f, this.f9573g));
            ratingBar.setOnRatingBarChangeListener(new C2829a(bVar));
            CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.no_rating);
            checkBox.setTextColor(C2553q3.m11116b());
            C2553q3.m11132r(checkBox, C2553q3.f8899a.mo9318b());
            if (this.f9573g >= 0.0f) {
                z = false;
            }
            checkBox.setChecked(z);
            ratingBar.setVisibility(this.f9573g < 0.0f ? 8 : 0);
            checkBox.setOnCheckedChangeListener(new C2831c(bVar, ratingBar));
            CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.share_ratings);
            C2553q3.m11133s(checkBox2);
            checkBox2.setChecked(bVar.f9578b);
            checkBox2.setOnCheckedChangeListener(new C2832d(bVar));
            CheckBox checkBox3 = (CheckBox) inflate.findViewById(R.id.share_stats);
            C2553q3.m11133s(checkBox3);
            checkBox3.setChecked(bVar.f9579c);
            checkBox3.setOnCheckedChangeListener(new C2833e(bVar));
            CheckBox checkBox4 = (CheckBox) inflate.findViewById(R.id.dont_ask_share);
            C2553q3.m11133s(checkBox4);
            checkBox4.setChecked(bVar.f9580d);
            checkBox4.setOnCheckedChangeListener(new C2834f(bVar));
            if (this.f9569c) {
                i = 0;
            }
            checkBox4.setVisibility(i);
            DialogInterfaceC0068b.C0069a l = new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo240t(inflate).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2836h(bVar, activity)).mo232l(R.string.cancel, new DialogInterface$OnClickListenerC2835g());
            if (!this.f9569c) {
                l.mo238r(R.string.rategame);
            }
            l.mo221a().show();
        }
    }
}
