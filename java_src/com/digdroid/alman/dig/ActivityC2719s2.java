package com.digdroid.alman.dig;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.C0333i;
import androidx.core.app.C0348a;
import androidx.core.content.C0378a;
import com.google.android.material.snackbar.Snackbar;
import java.io.File;

/* renamed from: com.digdroid.alman.dig.s2 */
public class ActivityC2719s2 extends ActivityC2725t {

    /* renamed from: F */
    AbstractC2723d f9253F;

    /* renamed from: G */
    AbstractC2723d f9254G;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s2$a */
    public class DialogInterface$OnClickListenerC2720a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ File f9255b;

        /* renamed from: c */
        final /* synthetic */ int f9256c;

        DialogInterface$OnClickListenerC2720a(File file, int i) {
            this.f9255b = file;
            this.f9256c = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            intent.addFlags(65731);
            intent.putExtra("android.provider.extra.INITIAL_URI", Uri.fromFile(this.f9255b));
            ActivityC2719s2.this.startActivityForResult(intent, this.f9256c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s2$b */
    public class DialogInterface$OnClickListenerC2721b implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2721b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C0348a.m1779k(ActivityC2719s2.this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 100);
        }
    }

    /* renamed from: com.digdroid.alman.dig.s2$c */
    class View$OnClickListenerC2722c implements View.OnClickListener {
        View$OnClickListenerC2722c() {
        }

        public void onClick(View view) {
            C0348a.m1779k(ActivityC2719s2.this, new String[]{"android.permission.RECORD_AUDIO"}, C0333i.f1688T0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s2$d */
    public interface AbstractC2723d {
        /* renamed from: a */
        void mo7921a();

        /* renamed from: b */
        void mo7922b();
    }

    /* renamed from: X0 */
    private void m11545X0(int i, File file, int i2) {
        new AlertDialog.Builder(this, C2553q3.m11117c()).setMessage(i).setCancelable(false).setPositiveButton(R.string.ok, new DialogInterface$OnClickListenerC2720a(file, i2)).create().show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo9194Y0(AbstractC2723d dVar) {
        this.f9254G = dVar;
        if (C0378a.m1871a(getApplicationContext(), "android.permission.RECORD_AUDIO") == 0) {
            this.f9254G.mo7921a();
        } else if (C0348a.m1780l(this, "android.permission.RECORD_AUDIO")) {
            Snackbar.m13524X(findViewById(R.id.mainscreen), R.string.audio_rationale, -2).mo10896Z(R.string.ok, new View$OnClickListenerC2722c()).mo10849N();
        } else {
            C0348a.m1779k(this, new String[]{"android.permission.RECORD_AUDIO"}, C0333i.f1688T0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z0 */
    public void mo9195Z0(AbstractC2723d dVar) {
        this.f9253F = dVar;
        if (C0378a.m1871a(getApplicationContext(), "android.permission.READ_EXTERNAL_STORAGE") != 0) {
            new AlertDialog.Builder(this).setMessage(R.string.read_files_inform).setCancelable(false).setPositiveButton(R.string.next, new DialogInterface$OnClickListenerC2721b()).create().show();
        } else {
            this.f9253F.mo7921a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a1 */
    public boolean mo9196a1() {
        int i;
        int i2;
        C2219c3 k = C2219c3.m9805k(this);
        File file = new File(getExternalFilesDir(null).getAbsolutePath().replaceAll("/Android.*$", ""));
        String q = k.mo8193q("dig_dir", null);
        String q2 = k.mo8193q("retroarch_dir", null);
        if (Build.VERSION.SDK_INT < 30) {
            if (q == null) {
                q = new File(file, "Dig").getAbsolutePath();
                k.mo8158G("dig_dir", q);
            }
            File file2 = new File(q);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            if (q2 != null) {
                return true;
            }
            k.mo8158G("retroarch_dir", new File(file, "RetroArch").getAbsolutePath());
            return true;
        }
        if (q == null || !q.contains("://") || !C2399i2.m10374d(this, q).exists()) {
            i = R.string.dig_dir_msg;
            i2 = C0333i.f1694U0;
        } else if ((q2 == null || !q2.contains("://")) && (C2185a4.m9689s(this, "com.retroarch") || C2185a4.m9689s(this, "com.retroarch.ra32") || C2185a4.m9689s(this, "com.retroarch.aarch64"))) {
            i = R.string.retroarch_dir_msg;
            i2 = 105;
        } else if (k.mo8188l("cover_storage", -1) != 0 || k.mo8193q("cover_dir", "").contains("://")) {
            return true;
        } else {
            i = R.string.covers_dir_msg;
            i2 = C0333i.f1700V0;
        }
        m11545X0(i, file, i2);
        return false;
    }

    @Override // androidx.fragment.app.ActivityC0447d, androidx.core.app.C0348a.AbstractC0350b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr != null) {
            AbstractC2723d dVar = i != 100 ? i != 101 ? null : this.f9254G : this.f9253F;
            if (dVar != null) {
                if (iArr.length <= 0 || iArr[0] != 0) {
                    dVar.mo7922b();
                } else {
                    dVar.mo7921a();
                }
            }
        }
    }
}
