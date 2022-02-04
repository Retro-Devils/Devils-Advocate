package p069c.p073b.p074a.p075a.p077b;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0453i;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0445c;
import com.google.android.gms.common.internal.C3027r;

/* renamed from: c.b.a.a.b.j */
public class C1289j extends DialogInterface$OnCancelListenerC0445c {

    /* renamed from: k0 */
    private Dialog f5552k0 = null;

    /* renamed from: l0 */
    private DialogInterface.OnCancelListener f5553l0 = null;

    /* renamed from: u2 */
    public static C1289j m6801u2(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        C1289j jVar = new C1289j();
        Dialog dialog2 = (Dialog) C3027r.m12377i(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        jVar.f5552k0 = dialog2;
        if (onCancelListener != null) {
            jVar.f5553l0 = onCancelListener;
        }
        return jVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f5553l0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0445c
    /* renamed from: q2 */
    public Dialog mo2662q2(Bundle bundle) {
        if (this.f5552k0 == null) {
            mo2663r2(false);
        }
        return this.f5552k0;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0445c
    /* renamed from: t2 */
    public void mo2665t2(AbstractC0453i iVar, String str) {
        super.mo2665t2(iVar, str);
    }
}
