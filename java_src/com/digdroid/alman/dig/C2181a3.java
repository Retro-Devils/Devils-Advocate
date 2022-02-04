package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.constraintlayout.widget.C0333i;
import com.digdroid.alman.dig.C2391i;

/* renamed from: com.digdroid.alman.dig.a3 */
class C2181a3 {

    /* renamed from: a */
    Activity f7857a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.a3$a */
    public class DialogInterface$OnClickListenerC2182a implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int[] f7858b;

        /* renamed from: c */
        final /* synthetic */ AbstractC2184b f7859c;

        /* renamed from: com.digdroid.alman.dig.a3$a$a */
        class C2183a implements C2391i.AbstractC2394b {
            C2183a() {
            }

            @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
            /* renamed from: a */
            public void mo8043a(String[] strArr) {
                DatabaseService.m9480x(C2181a3.this.f7857a.getApplicationContext(), "scan_dir", strArr[0]);
            }
        }

        DialogInterface$OnClickListenerC2182a(int[] iArr, AbstractC2184b bVar) {
            this.f7858b = iArr;
            this.f7859c = bVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            int[] iArr = this.f7858b;
            if (iArr[i] == 0) {
                this.f7859c.start();
            } else if (iArr[i] == 2) {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                intent.addFlags(195);
                C2181a3.this.f7857a.startActivityForResult(intent, C0333i.f1688T0);
            } else {
                C2391i iVar = new C2391i(C2181a3.this.f7857a);
                iVar.mo8592h(new C2183a());
                iVar.mo8588d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.a3$b */
    public interface AbstractC2184b {
        void start();
    }

    public C2181a3(Activity activity) {
        this.f7857a = activity;
    }

    /* renamed from: a */
    public void mo8041a(AbstractC2184b bVar) {
        int[] iArr;
        CharSequence[] charSequenceArr;
        int i = Build.VERSION.SDK_INT;
        if (i < 19) {
            charSequenceArr = new CharSequence[]{this.f7857a.getString(R.string.whole_device), this.f7857a.getString(R.string.select_start)};
            iArr = new int[]{0, 1};
        } else if (i < 30) {
            iArr = new int[]{0, 1, 2};
            charSequenceArr = new CharSequence[]{this.f7857a.getString(R.string.whole_device), this.f7857a.getString(R.string.select_start), this.f7857a.getString(R.string.select_start_saf)};
        } else {
            charSequenceArr = new CharSequence[]{this.f7857a.getString(R.string.select_start)};
            iArr = new int[]{2};
        }
        new DialogInterfaceC0068b.C0069a(this.f7857a, C2553q3.m11117c()).mo238r(R.string.device_scanning).mo227g(charSequenceArr, new DialogInterface$OnClickListenerC2182a(iArr, bVar)).mo221a().show();
    }
}
