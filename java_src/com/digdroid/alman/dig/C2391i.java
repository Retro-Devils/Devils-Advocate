package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.appcompat.app.DialogInterfaceC0068b;
import com.digdroid.alman.dig.C2372h2;
import com.digdroid.alman.dig.DialogFragmentC2864y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: com.digdroid.alman.dig.i */
public class C2391i implements DialogFragmentC2864y.AbstractC2879m {

    /* renamed from: a */
    private final WeakReference<Activity> f8360a;

    /* renamed from: b */
    String f8361b;

    /* renamed from: c */
    boolean f8362c = false;

    /* renamed from: d */
    int f8363d = -1;

    /* renamed from: e */
    private DialogFragmentC2864y f8364e;

    /* renamed from: f */
    AbstractC2394b f8365f;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.i$a */
    public class C2392a implements C2372h2.AbstractC2374b {

        /* renamed from: com.digdroid.alman.dig.i$a$a */
        class DialogInterface$OnClickListenerC2393a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ ArrayList f8367b;

            DialogInterface$OnClickListenerC2393a(ArrayList arrayList) {
                this.f8367b = arrayList;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C2391i.this.mo8589e((String) this.f8367b.get(i));
            }
        }

        C2392a() {
        }

        @Override // com.digdroid.alman.dig.C2372h2.AbstractC2374b
        /* renamed from: a */
        public void mo8540a(String[] strArr) {
            Activity activity = (Activity) C2391i.this.f8360a.get();
            if (!(activity == null || activity.isFinishing())) {
                ArrayList arrayList = new ArrayList();
                if (strArr != null && Build.VERSION.SDK_INT < 30) {
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                }
                if (C2391i.this.f8363d > 0 && Build.VERSION.SDK_INT >= 19) {
                    arrayList.add("saf");
                }
                if (arrayList.size() != 0) {
                    if (arrayList.size() == 1) {
                        C2391i.this.mo8589e((String) arrayList.get(0));
                        return;
                    }
                    CharSequence[] charSequenceArr = new CharSequence[arrayList.size()];
                    for (int i = 0; i < arrayList.size(); i++) {
                        String str2 = (String) arrayList.get(i);
                        if (str2.equals("saf")) {
                            charSequenceArr[i] = activity.getString(R.string.select_start_saf);
                        } else {
                            charSequenceArr[i] = str2;
                        }
                    }
                    new DialogInterfaceC0068b.C0069a(activity, C2553q3.m11117c()).mo238r(R.string.select_root).mo227g(charSequenceArr, new DialogInterface$OnClickListenerC2393a(arrayList)).mo221a().show();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.i$b */
    public interface AbstractC2394b {
        /* renamed from: a */
        void mo8043a(String[] strArr);
    }

    public C2391i(Activity activity) {
        this.f8360a = new WeakReference<>(activity);
    }

    @Override // com.digdroid.alman.dig.DialogFragmentC2864y.AbstractC2879m
    /* renamed from: a */
    public void mo8586a() {
        this.f8364e.dismiss();
    }

    @Override // com.digdroid.alman.dig.DialogFragmentC2864y.AbstractC2879m
    /* renamed from: b */
    public void mo8587b(String str) {
        this.f8364e.dismiss();
        this.f8365f.mo8043a(new String[]{str});
    }

    /* renamed from: d */
    public void mo8588d() {
        Activity activity = this.f8360a.get();
        if (activity != null && !activity.isFinishing()) {
            C2372h2.m10301e(activity, new C2392a());
        }
    }

    /* renamed from: e */
    public void mo8589e(String str) {
        Activity activity = this.f8360a.get();
        if (activity != null && !activity.isFinishing()) {
            if (str.equals("saf")) {
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                intent.addFlags(65731);
                activity.startActivityForResult(intent, this.f8363d);
                return;
            }
            try {
                DialogFragmentC2864y E = DialogFragmentC2864y.m11887E();
                this.f8364e = E;
                E.mo9468J(this);
                this.f8364e.mo9469K(str);
                this.f8364e.mo9470L(this.f8362c);
                this.f8364e.show(activity.getFragmentManager(), (String) null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: f */
    public void mo8590f(int i) {
        this.f8363d = i;
    }

    /* renamed from: g */
    public void mo8591g(boolean z) {
        this.f8362c = z;
    }

    /* renamed from: h */
    public void mo8592h(AbstractC2394b bVar) {
        this.f8365f = bVar;
    }

    /* renamed from: i */
    public void mo8593i(String str) {
        this.f8361b = str;
    }
}
