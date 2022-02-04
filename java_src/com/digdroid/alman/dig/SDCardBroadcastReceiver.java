package com.digdroid.alman.dig;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.SystemClock;

public class SDCardBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: com.digdroid.alman.dig.SDCardBroadcastReceiver$a */
    class AsyncTaskC2129a extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        Context f7705a;

        /* renamed from: b */
        Intent f7706b;

        public AsyncTaskC2129a(Context context, Intent intent) {
            this.f7705a = context;
            this.f7706b = intent;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            try {
                Context context = this.f7705a;
                if (context != null && !C2185a4.m9694x(context) && !C2185a4.m9692v(this.f7705a)) {
                    Intent intent = this.f7706b;
                    if (intent != null) {
                        String action = intent.getAction();
                        if ("android.intent.action.MEDIA_MOUNTED".equals(action) || "android.intent.action.MEDIA_EJECT".equals(action) || "android.intent.action.MEDIA_REMOVED".equals(action) || "android.intent.action.MEDIA_BAD_REMOVAL".equals(action)) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime <= 120000) {
                                return null;
                            }
                            C2775u e = C2775u.m11726e(this.f7705a.getApplicationContext());
                            e.mo9329h();
                            SQLiteDatabase c = e.mo9325c();
                            C2219c3 k = C2219c3.m9805k(this.f7705a.getApplicationContext());
                            C2375h3 r = C2375h3.m10306r(this.f7705a.getApplicationContext(), e);
                            r.mo8543C();
                            String replaceAll = this.f7705a.getExternalFilesDir(null).getAbsolutePath().replaceAll("Android.*$", "");
                            Cursor rawQuery = c.rawQuery("SELECT _id,path FROM rompaths WHERE system!='none'", null);
                            int i = 1;
                            if (rawQuery.moveToFirst()) {
                                while (true) {
                                    long j = rawQuery.getLong(0);
                                    String string = rawQuery.getString(i);
                                    try {
                                        if (string.length() >= replaceAll.length() && !string.substring(0, replaceAll.length()).equals(replaceAll)) {
                                            if ("android.intent.action.MEDIA_MOUNTED".equals(action) && elapsedRealtime > 60000) {
                                                c.execSQL("UPDATE rompaths SET last_checked=0 WHERE _id=" + j);
                                            }
                                            r.mo8553b(j, false);
                                        }
                                        if (!rawQuery.moveToNext()) {
                                            break;
                                        }
                                        i = 1;
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            rawQuery.close();
                            if ("android.intent.action.MEDIA_MOUNTED".equals(action) && elapsedRealtime > 60000 && k.mo8180c("auto_scan", true)) {
                                k.mo8163L(false);
                                k.mo8157F("sd_dirs_last_scanned", 0);
                                DatabaseService.m9478v(this.f7705a.getApplicationContext(), "find_dirs");
                                DatabaseService.m9478v(this.f7705a.getApplicationContext(), "scan_dirs");
                                DatabaseService.m9478v(this.f7705a.getApplicationContext(), "merge_games");
                            }
                        }
                        return null;
                    }
                }
                return null;
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        new AsyncTaskC2129a(context, intent).execute(new Void[0]);
    }
}
