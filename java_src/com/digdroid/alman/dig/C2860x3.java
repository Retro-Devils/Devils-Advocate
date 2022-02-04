package com.digdroid.alman.dig;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* renamed from: com.digdroid.alman.dig.x3 */
public class C2860x3 extends Fragment {

    /* renamed from: Z */
    private AbstractC2862b f9655Z;

    /* renamed from: a0 */
    private AsyncTaskC2863c f9656a0;

    /* renamed from: b0 */
    String f9657b0;

    /* renamed from: c0 */
    String f9658c0;

    /* renamed from: d0 */
    String f9659d0;

    /* renamed from: e0 */
    String f9660e0 = "";

    /* renamed from: f0 */
    boolean f9661f0;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.x3$b */
    public interface AbstractC2862b {
        /* renamed from: O */
        void mo9455O(boolean z);

        /* renamed from: Q */
        void mo9456Q(int i, String str, int i2, int i3);

        /* renamed from: b */
        void mo9457b(String str);

        /* renamed from: j0 */
        void mo9458j0();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.digdroid.alman.dig.x3$c */
    public class AsyncTaskC2863c extends AsyncTask<Void, Long, Boolean> {

        /* renamed from: a */
        OutputStream f9662a;

        /* renamed from: b */
        BufferedOutputStream f9663b;

        /* renamed from: c */
        C2164a f9664c;

        /* renamed from: d */
        C2883y3 f9665d;

        /* renamed from: e */
        long f9666e;

        private AsyncTaskC2863c() {
            this.f9662a = null;
            this.f9663b = null;
            this.f9664c = null;
            this.f9666e = 0;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x003e  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x006a A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Boolean doInBackground(java.lang.Void... r18) {
            /*
            // Method dump skipped, instructions count: 493
            */
            throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2860x3.AsyncTaskC2863c.doInBackground(java.lang.Void[]):java.lang.Boolean");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onCancelled(Boolean bool) {
            if (C2860x3.this.f9655Z != null) {
                try {
                    C2860x3.this.f9655Z.mo9458j0();
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Boolean bool) {
            if (C2860x3.this.f9655Z != null) {
                try {
                    C2860x3.this.f9655Z.mo9455O(bool.booleanValue());
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void onProgressUpdate(Long... lArr) {
            if (C2860x3.this.f9655Z != null) {
                try {
                    C2860x3.this.f9655Z.mo9456Q(this.f9664c.mo8023h(), C2860x3.this.f9660e0, ((int) lArr[1].longValue()) / 1024, ((int) lArr[0].longValue()) / 1024);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (C2860x3.this.f9655Z != null) {
                C2860x3.this.f9655Z.mo9457b(C2860x3.this.f9660e0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: S0 */
    public void mo2529S0(Activity activity) {
        super.mo2529S0(activity);
        this.f9655Z = (AbstractC2862b) activity;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
        boolean z = true;
        mo2580k2(true);
        Bundle h0 = mo2568h0();
        this.f9657b0 = h0.getString("zipfile");
        this.f9658c0 = h0.getString("location");
        this.f9659d0 = h0.getString("name");
        if (h0.getString("launch") != null) {
            z = false;
        }
        this.f9661f0 = z;
        AsyncTaskC2863c cVar = new AsyncTaskC2863c();
        this.f9656a0 = cVar;
        cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e1 */
    public void mo2559e1() {
        super.mo2559e1();
        this.f9655Z = null;
    }

    /* renamed from: q2 */
    public void mo9454q2(boolean z) {
        this.f9656a0.cancel(z);
    }
}
