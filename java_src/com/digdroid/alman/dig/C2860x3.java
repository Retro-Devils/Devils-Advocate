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
    private AbstractC2862b f9647Z;

    /* renamed from: a0 */
    private AsyncTaskC2863c f9648a0;

    /* renamed from: b0 */
    String f9649b0;

    /* renamed from: c0 */
    String f9650c0;

    /* renamed from: d0 */
    String f9651d0;

    /* renamed from: e0 */
    String f9652e0 = "";

    /* renamed from: f0 */
    boolean f9653f0;

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
        OutputStream f9654a;

        /* renamed from: b */
        BufferedOutputStream f9655b;

        /* renamed from: c */
        C2164a f9656c;

        /* renamed from: d */
        C2883y3 f9657d;

        /* renamed from: e */
        long f9658e;

        private AsyncTaskC2863c() {
            this.f9654a = null;
            this.f9655b = null;
            this.f9656c = null;
            this.f9658e = 0;
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
            if (C2860x3.this.f9647Z != null) {
                try {
                    C2860x3.this.f9647Z.mo9458j0();
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Boolean bool) {
            if (C2860x3.this.f9647Z != null) {
                try {
                    C2860x3.this.f9647Z.mo9455O(bool.booleanValue());
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void onProgressUpdate(Long... lArr) {
            if (C2860x3.this.f9647Z != null) {
                try {
                    C2860x3.this.f9647Z.mo9456Q(this.f9656c.mo8023h(), C2860x3.this.f9652e0, ((int) lArr[1].longValue()) / 1024, ((int) lArr[0].longValue()) / 1024);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
            if (C2860x3.this.f9647Z != null) {
                C2860x3.this.f9647Z.mo9457b(C2860x3.this.f9652e0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: S0 */
    public void mo2529S0(Activity activity) {
        super.mo2529S0(activity);
        this.f9647Z = (AbstractC2862b) activity;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
        boolean z = true;
        mo2580k2(true);
        Bundle h0 = mo2568h0();
        this.f9649b0 = h0.getString("zipfile");
        this.f9650c0 = h0.getString("location");
        this.f9651d0 = h0.getString("name");
        if (h0.getString("launch") != null) {
            z = false;
        }
        this.f9653f0 = z;
        AsyncTaskC2863c cVar = new AsyncTaskC2863c();
        this.f9648a0 = cVar;
        cVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e1 */
    public void mo2559e1() {
        super.mo2559e1();
        this.f9647Z = null;
    }

    /* renamed from: q2 */
    public void mo9454q2(boolean z) {
        this.f9648a0.cancel(z);
    }
}
