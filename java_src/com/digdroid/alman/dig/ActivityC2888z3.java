package com.digdroid.alman.dig;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.appcompat.app.DialogInterfaceC0068b;
import com.digdroid.alman.dig.C2860x3;

/* renamed from: com.digdroid.alman.dig.z3 */
public class ActivityC2888z3 extends ActivityC2719s2 implements C2860x3.AbstractC2862b {

    /* renamed from: H */
    private C2860x3 f9725H = null;

    /* renamed from: I */
    private String f9726I = "unzip_task_fragment";

    /* renamed from: J */
    private ProgressDialog f9727J = null;

    /* renamed from: K */
    private ProgressDialog f9728K = null;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.z3$a */
    public class DialogInterface$OnClickListenerC2889a implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2889a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (ActivityC2888z3.this.f9725H != null) {
                ActivityC2888z3.this.f9725H.mo9454q2(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.z3$b */
    public class DialogInterface$OnClickListenerC2890b implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2890b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ActivityC2888z3.this.f9275w.f7960g = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.digdroid.alman.dig.z3$c */
    public class AsyncTaskC2891c extends AsyncTask<Void, Void, String> {
        private AsyncTaskC2891c() {
        }

        /* synthetic */ AsyncTaskC2891c(ActivityC2888z3 z3Var, DialogInterface$OnClickListenerC2889a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            C2185a4.m9673c(ActivityC2888z3.this);
            return null;
        }
    }

    /* renamed from: e1 */
    private void m11972e1(String str) {
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f9727J = progressDialog;
        progressDialog.setCancelable(false);
        this.f9727J.setProgressStyle(1);
        this.f9727J.setIndeterminate(false);
        this.f9727J.setMax(100);
        ProgressDialog progressDialog2 = this.f9727J;
        progressDialog2.setTitle(getString(R.string.unzipping) + " " + str);
        this.f9727J.setButton(-2, "Cancel", new DialogInterface$OnClickListenerC2889a());
        this.f9727J.show();
    }

    @Override // com.digdroid.alman.dig.C2860x3.AbstractC2862b
    /* renamed from: O */
    public void mo9455O(boolean z) {
        ProgressDialog progressDialog = this.f9727J;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f9727J = null;
        }
        C2860x3 x3Var = this.f9725H;
        if (x3Var != null) {
            Bundle h0 = x3Var.mo2568h0();
            mo2668C0().mo2729a().mo2637h(this.f9725H).mo2634e();
            this.f9725H = null;
            if (z) {
                String string = h0.getString("launch");
                if (string == null) {
                    this.f9278z.mo8063y(this, h0.getLong("game"), h0.getString("location"));
                } else {
                    this.f9278z.mo8057s(this, h0.getLong("game"), string);
                }
            }
        }
        if (!z) {
            new DialogInterfaceC0068b.C0069a(this).mo228h(R.string.no_space).mo235o(R.string.ok, null).mo224d(false).mo221a().show();
            mo9519c1();
        }
    }

    @Override // com.digdroid.alman.dig.C2860x3.AbstractC2862b
    /* renamed from: Q */
    public void mo9456Q(int i, String str, int i2, int i3) {
        if (this.f9727J == null) {
            m11972e1(str);
        }
        ProgressDialog progressDialog = this.f9727J;
        progressDialog.setTitle(getString(i) + " " + str);
        this.f9727J.setMax(i3);
        this.f9727J.setProgress(i2);
    }

    @Override // com.digdroid.alman.dig.C2860x3.AbstractC2862b
    /* renamed from: b */
    public void mo9457b(String str) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public void mo9519c1() {
        new AsyncTaskC2891c(this, null).execute(new Void[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public boolean mo9520d1() {
        return this.f9725H != null;
    }

    /* renamed from: f1 */
    public void mo9521f1(Intent intent) {
        String stringExtra = intent.getStringExtra("label");
        if (stringExtra == null) {
            ProgressDialog progressDialog = this.f9727J;
            if (progressDialog != null) {
                progressDialog.dismiss();
                this.f9727J = null;
                return;
            }
            return;
        }
        if (this.f9727J == null) {
            ProgressDialog progressDialog2 = new ProgressDialog(this);
            this.f9727J = progressDialog2;
            progressDialog2.setCancelable(false);
            this.f9727J.setProgressStyle(1);
            this.f9727J.setIndeterminate(false);
            this.f9727J.setMax(100);
            this.f9727J.setTitle(stringExtra);
            this.f9727J.setButton(-2, "Cancel", new DialogInterface$OnClickListenerC2890b());
            this.f9727J.show();
            this.f9275w.f7960g = false;
        }
        this.f9727J.setTitle(stringExtra);
        this.f9727J.setProgress(intent.getIntExtra("progress", 0));
    }

    /* renamed from: g1 */
    public void mo9522g1(String str, String str2, String str3, long j, String str4, String str5) {
        Bundle bundle = new Bundle();
        bundle.putString("zipfile", str);
        bundle.putString("location", str2);
        bundle.putString("name", str3);
        bundle.putLong("game", j);
        bundle.putString("title", str4);
        bundle.putString("launch", str5);
        C2860x3 x3Var = new C2860x3();
        this.f9725H = x3Var;
        x3Var.mo2554c2(bundle);
        mo2668C0().mo2729a().mo2869c(this.f9725H, this.f9726I).mo2634e();
    }

    @Override // com.digdroid.alman.dig.C2860x3.AbstractC2862b
    /* renamed from: j0 */
    public void mo9458j0() {
        this.f9727J = null;
        C2185a4.m9673c(this);
        if (this.f9725H != null) {
            mo2668C0().mo2729a().mo2637h(this.f9725H).mo2634e();
            this.f9725H = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e, com.digdroid.alman.dig.ActivityC2725t, androidx.appcompat.app.ActivityC0070c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && bundle.getBoolean("unzipping")) {
            this.f9725H = (C2860x3) mo2668C0().mo2732d(this.f9726I);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e, com.digdroid.alman.dig.ActivityC2725t, androidx.appcompat.app.ActivityC0070c
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("unzipping", this.f9725H != null);
        super.onSaveInstanceState(bundle);
    }
}
