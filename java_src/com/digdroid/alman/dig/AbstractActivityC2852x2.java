package com.digdroid.alman.dig;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.SystemClock;
import androidx.appcompat.app.DialogInterfaceC0068b;
import com.digdroid.alman.dig.ActivityC2725t;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.digdroid.alman.dig.x2 */
public abstract class AbstractActivityC2852x2 extends AbstractActivityC2178a2 {

    /* renamed from: com.digdroid.alman.dig.x2$a */
    class CallableC2853a implements Callable {

        /* renamed from: a */
        final /* synthetic */ Uri f9640a;

        CallableC2853a(Uri uri) {
            this.f9640a = uri;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            C2185a4.m9695y(AbstractActivityC2852x2.this, 0, this.f9640a.toString());
            return null;
        }
    }

    /* renamed from: com.digdroid.alman.dig.x2$b */
    class CallableC2854b implements Callable {

        /* renamed from: a */
        final /* synthetic */ Intent f9642a;

        CallableC2854b(Intent intent) {
            this.f9642a = intent;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            AbstractActivityC2852x2.this.f9268A.mo9288x(this.f9642a.getData());
            return null;
        }
    }

    /* renamed from: com.digdroid.alman.dig.x2$c */
    class CallableC2855c implements Callable {

        /* renamed from: a */
        final /* synthetic */ Intent f9644a;

        /* renamed from: b */
        final /* synthetic */ int f9645b;

        CallableC2855c(Intent intent, int i) {
            this.f9644a = intent;
            this.f9645b = i;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            AbstractActivityC2852x2.this.f9268A.mo9289y(this.f9645b - 1000, this.f9644a.getData());
            return null;
        }
    }

    /* renamed from: com.digdroid.alman.dig.x2$d */
    class DialogInterface$OnClickListenerC2856d implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2856d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C2185a4.m9686p(AbstractActivityC2852x2.this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.x2$e */
    public class CallableC2857e implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f9648a;

        /* renamed from: b */
        final /* synthetic */ long f9649b;

        CallableC2857e(long j, long j2) {
            this.f9648a = j;
            this.f9649b = j2;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            AbstractActivityC2852x2 x2Var = AbstractActivityC2852x2.this;
            x2Var.f9278z.mo8062x(x2Var, this.f9648a, this.f9649b, x2Var.f9272E);
            AbstractActivityC2852x2 x2Var2 = AbstractActivityC2852x2.this;
            if (!x2Var2.f9272E) {
                return null;
            }
            try {
                AbstractActivityC2852x2.this.f9268A.mo9286v(new File(new C2882y2(AbstractActivityC2852x2.this).mo8772i("screenshot_directory")), x2Var2.f9271D.equals("mame") ? "Covers" : "Screenshots", this.f9648a, AbstractActivityC2852x2.this.f9269B);
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.x2$f */
    public class CallableC2858f implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f9651a;

        CallableC2858f(long j) {
            this.f9651a = j;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            if (!AbstractActivityC2852x2.this.f9275w.mo8197u()) {
                MyWidget.m9546b(AbstractActivityC2852x2.this, this.f9651a);
                return null;
            }
            MyWidget.m9547c(AbstractActivityC2852x2.this, this.f9651a);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.x2$g */
    public class CallableC2859g implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f9653a;

        CallableC2859g(long j) {
            this.f9653a = j;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            String q = AbstractActivityC2852x2.this.f9275w.mo8193q("get_game_image_dir", "Covers");
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
            AbstractActivityC2852x2 x2Var = AbstractActivityC2852x2.this;
            x2Var.f9268A.mo9286v(externalStoragePublicDirectory, q, this.f9653a, x2Var.f9275w.mo8190n("get_game_image_t", 0));
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri data;
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (this.f9272E) {
                C2185a4.m9668F(this, "retroarch");
            }
        } else if (i == 101 && i2 == -1 && intent != null && intent.getData() != null) {
            Uri data2 = intent.getData();
            if (Build.VERSION.SDK_INT >= 19) {
                getContentResolver().takePersistableUriPermission(data2, 3);
            }
            DatabaseService.m9479w(getApplicationContext(), "scan_uri", data2);
        } else if (i != 104 || i2 != -1 || intent == null || intent.getData() == null) {
            if (i == 102 && i2 == -1 && intent != null && intent.getData() != null) {
                data = intent.getData();
                C2219c3.m9805k(this).mo8158G("dig_dir", data.toString());
                if (Build.VERSION.SDK_INT < 19) {
                    return;
                }
            } else if (i == 105 && i2 == -1 && intent != null && intent.getData() != null) {
                data = intent.getData();
                C2219c3.m9805k(this).mo8158G("retroarch_dir", data.toString());
                if (Build.VERSION.SDK_INT < 19) {
                    return;
                }
            } else if (i == 103 && i2 == -1 && intent != null && intent.getData() != null) {
                Uri data3 = intent.getData();
                if (Build.VERSION.SDK_INT >= 19) {
                    getContentResolver().takePersistableUriPermission(data3, 3);
                }
                new ActivityC2725t.AsyncTaskC2726a(null, new CallableC2853a(data3)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                return;
            } else if (i == 200 && i2 == -1 && intent != null && intent.getData() != null) {
                new ActivityC2725t.AsyncTaskC2726a(new CallableC2854b(intent), null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                return;
            } else if (i >= 1000 && i2 == -1 && intent != null && intent.getData() != null) {
                new ActivityC2725t.AsyncTaskC2726a(new CallableC2855c(intent, i), null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                return;
            } else if (i == 202 && i2 == -1 && intent != null && intent.getData() != null) {
                Uri data4 = intent.getData();
                File filesDir = getFilesDir();
                if (filesDir != null && this.f9268A != null) {
                    (!this.f9268A.mo9265B(data4, new File(filesDir, "dig_backup.bak")) ? new DialogInterfaceC0068b.C0069a(this, C2553q3.m11117c()).mo228h(R.string.no_restore).mo224d(false).mo235o(R.string.ok, null) : new DialogInterfaceC0068b.C0069a(this, C2553q3.m11117c()).mo228h(R.string.restore_inform).mo224d(false).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2856d())).mo221a().show();
                    return;
                }
                return;
            } else {
                return;
            }
            getContentResolver().takePersistableUriPermission(data, 3);
        } else {
            Uri data5 = intent.getData();
            if (Build.VERSION.SDK_INT >= 19) {
                getContentResolver().takePersistableUriPermission(data5, 3);
            }
            this.f9277y.mo8552a(this.f9275w.mo8193q("___tmp_system_rom_path", null), data5.toString(), 0);
            AbstractC2531p1 k1 = mo8280k1();
            if (k1 != null && (k1 instanceof C2329g3)) {
                ((C2329g3) k1).mo8466M3();
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0447d, com.digdroid.alman.dig.AbstractActivityC2533p2, com.digdroid.alman.dig.AbstractActivityC2802v3
    public void onResume() {
        super.onResume();
        long j = this.f9270C;
        if (j >= 0) {
            this.f9270C = -1;
            try {
                long currentTimeMillis = System.currentTimeMillis() - this.f9269B;
                if (currentTimeMillis < SystemClock.uptimeMillis()) {
                    new ActivityC2725t.AsyncTaskC2726a(new CallableC2858f(j), new CallableC2857e(j, currentTimeMillis)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    mo9519c1();
                }
            } catch (Exception unused) {
            }
        }
        long n = this.f9275w.mo8190n("get_game_image", -1);
        if (n >= 0) {
            try {
                this.f9275w.mo8157F("get_game_image", -1);
                new ActivityC2725t.AsyncTaskC2726a(new CallableC2859g(n), null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } catch (Exception unused2) {
            }
        }
    }
}
