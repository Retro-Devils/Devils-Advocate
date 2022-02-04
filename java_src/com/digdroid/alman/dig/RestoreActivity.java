package com.digdroid.alman.dig;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.appcompat.app.ActivityC0070c;
import com.digdroid.alman.dig.C2318g;

public class RestoreActivity extends ActivityC0070c implements C2318g.AbstractC2321c {

    /* renamed from: com.digdroid.alman.dig.RestoreActivity$a */
    class AsyncTaskC2128a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        boolean f7703a;

        public AsyncTaskC2128a(boolean z) {
            this.f7703a = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            if (!this.f7703a) {
                return null;
            }
            try {
                C2219c3 k = C2219c3.m9805k(RestoreActivity.this.getApplicationContext());
                k.mo8156E("data_version", 0);
                C2775u e = C2775u.m11726e(RestoreActivity.this.getApplicationContext());
                e.mo9329h();
                SQLiteDatabase c = e.mo9325c();
                k.mo8202z("theme_file", "black.cfg");
                k.mo8163L(false);
                k.mo8154C(0);
                k.mo8157F("sd_dirs_last_scanned", 0);
                c.execSQL("UPDATE rompaths SET last_checked=0,present=0,matches=0,restoring=1");
                c.execSQL("UPDATE systems SET numgames=0");
                c.execSQL("UPDATE roms SET present=0,merged_with=-1,has_images=NULL,cover_status=21255");
                return null;
            } catch (Exception unused) {
                this.f7703a = false;
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void r3) {
            C2185a4.m9669G(RestoreActivity.this);
            C2185a4.m9670H(RestoreActivity.this);
            RestoreActivity restoreActivity = RestoreActivity.this;
            Intent intent = new Intent(restoreActivity, C2219c3.m9805k(restoreActivity).mo8197u() ? TVActivity.class : MainActivity.class);
            intent.setFlags(268435456);
            intent.putExtra("restore_success", this.f7703a);
            RestoreActivity.this.startActivity(intent);
            RestoreActivity.this.finish();
        }
    }

    @Override // com.digdroid.alman.dig.C2318g.AbstractC2321c
    /* renamed from: X */
    public void mo7966X(boolean z) {
        new AsyncTaskC2128a(z).execute(new Void[0]);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e, androidx.appcompat.app.ActivityC0070c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_restore);
    }

    @Override // androidx.fragment.app.ActivityC0447d
    public void onResume() {
        super.onResume();
        C2185a4.m9687q(this);
        C2318g gVar = new C2318g(this);
        gVar.mo8446h(this);
        gVar.mo8444f();
    }
}
