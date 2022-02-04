package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: androidx.fragment.app.c */
public class DialogInterface$OnCancelListenerC0445c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: Z */
    private Handler f2334Z;

    /* renamed from: a0 */
    private Runnable f2335a0 = new RunnableC0446a();

    /* renamed from: b0 */
    int f2336b0 = 0;

    /* renamed from: c0 */
    int f2337c0 = 0;

    /* renamed from: d0 */
    boolean f2338d0 = true;

    /* renamed from: e0 */
    boolean f2339e0 = true;

    /* renamed from: f0 */
    int f2340f0 = -1;

    /* renamed from: g0 */
    Dialog f2341g0;

    /* renamed from: h0 */
    boolean f2342h0;

    /* renamed from: i0 */
    boolean f2343i0;

    /* renamed from: j0 */
    boolean f2344j0;

    /* renamed from: androidx.fragment.app.c$a */
    class RunnableC0446a implements Runnable {
        RunnableC0446a() {
        }

        public void run() {
            DialogInterface$OnCancelListenerC0445c cVar = DialogInterface$OnCancelListenerC0445c.this;
            Dialog dialog = cVar.f2341g0;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: Q0 */
    public void mo2525Q0(Bundle bundle) {
        Bundle bundle2;
        super.mo2525Q0(bundle);
        if (this.f2339e0) {
            View F0 = mo2505F0();
            if (F0 != null) {
                if (F0.getParent() == null) {
                    this.f2341g0.setContentView(F0);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            ActivityC0447d c0 = mo2552c0();
            if (c0 != null) {
                this.f2341g0.setOwnerActivity(c0);
            }
            this.f2341g0.setCancelable(this.f2338d0);
            this.f2341g0.setOnCancelListener(this);
            this.f2341g0.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.f2341g0.onRestoreInstanceState(bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: T0 */
    public void mo2531T0(Context context) {
        super.mo2531T0(context);
        if (!this.f2344j0) {
            this.f2343i0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
        this.f2334Z = new Handler();
        this.f2339e0 = this.f2290y == 0;
        if (bundle != null) {
            this.f2336b0 = bundle.getInt("android:style", 0);
            this.f2337c0 = bundle.getInt("android:theme", 0);
            this.f2338d0 = bundle.getBoolean("android:cancelable", true);
            this.f2339e0 = bundle.getBoolean("android:showsDialog", this.f2339e0);
            this.f2340f0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: d1 */
    public void mo2556d1() {
        super.mo2556d1();
        Dialog dialog = this.f2341g0;
        if (dialog != null) {
            this.f2342h0 = true;
            dialog.setOnDismissListener(null);
            this.f2341g0.dismiss();
            if (!this.f2343i0) {
                onDismiss(this.f2341g0);
            }
            this.f2341g0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: e1 */
    public void mo2559e1() {
        super.mo2559e1();
        if (!this.f2344j0 && !this.f2343i0) {
            this.f2343i0 = true;
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: f1 */
    public LayoutInflater mo2563f1(Bundle bundle) {
        Context e;
        if (!this.f2339e0) {
            return super.mo2563f1(bundle);
        }
        Dialog q2 = mo2662q2(bundle);
        this.f2341g0 = q2;
        if (q2 != null) {
            mo2664s2(q2, this.f2336b0);
            e = this.f2341g0.getContext();
        } else {
            e = this.f2286u.mo2727e();
        }
        return (LayoutInflater) e.getSystemService("layout_inflater");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f2342h0) {
            mo2661p2(true, true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p2 */
    public void mo2661p2(boolean z, boolean z2) {
        if (!this.f2343i0) {
            this.f2343i0 = true;
            this.f2344j0 = false;
            Dialog dialog = this.f2341g0;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.f2341g0.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f2334Z.getLooper()) {
                        onDismiss(this.f2341g0);
                    } else {
                        this.f2334Z.post(this.f2335a0);
                    }
                }
            }
            this.f2342h0 = true;
            if (this.f2340f0 >= 0) {
                mo2538W1().mo2736h(this.f2340f0, 1);
                this.f2340f0 = -1;
                return;
            }
            AbstractC0477n a = mo2538W1().mo2729a();
            a.mo2637h(this);
            if (z) {
                a.mo2635f();
            } else {
                a.mo2634e();
            }
        }
    }

    /* renamed from: q2 */
    public Dialog mo2662q2(Bundle bundle) {
        throw null;
    }

    /* renamed from: r2 */
    public void mo2663r2(boolean z) {
        this.f2339e0 = z;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: s1 */
    public void mo2603s1(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.mo2603s1(bundle);
        Dialog dialog = this.f2341g0;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f2336b0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f2337c0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f2338d0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f2339e0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f2340f0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    /* renamed from: s2 */
    public void mo2664s2(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: t1 */
    public void mo2605t1() {
        super.mo2605t1();
        Dialog dialog = this.f2341g0;
        if (dialog != null) {
            this.f2342h0 = false;
            dialog.show();
        }
    }

    /* renamed from: t2 */
    public void mo2665t2(AbstractC0453i iVar, String str) {
        this.f2343i0 = false;
        this.f2344j0 = true;
        AbstractC0477n a = iVar.mo2729a();
        a.mo2869c(this, str);
        a.mo2634e();
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: u1 */
    public void mo2608u1() {
        super.mo2608u1();
        Dialog dialog = this.f2341g0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
