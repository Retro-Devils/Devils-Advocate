package p069c.p073b.p074a.p075a.p077b;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.C3027r;

/* renamed from: c.b.a.a.b.b */
public class DialogFragmentC1280b extends DialogFragment {

    /* renamed from: b */
    private Dialog f5541b = null;

    /* renamed from: c */
    private DialogInterface.OnCancelListener f5542c = null;

    /* renamed from: a */
    public static DialogFragmentC1280b m6761a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC1280b bVar = new DialogFragmentC1280b();
        Dialog dialog2 = (Dialog) C3027r.m12377i(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bVar.f5541b = dialog2;
        if (onCancelListener != null) {
            bVar.f5542c = onCancelListener;
        }
        return bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f5542c;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f5541b == null) {
            setShowsDialog(false);
        }
        return this.f5541b;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
