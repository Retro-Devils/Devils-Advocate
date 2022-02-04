package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC0614d;
import androidx.lifecycle.AbstractC0617e;
import androidx.lifecycle.AbstractC0619g;

class FragmentStateAdapter$5 implements AbstractC0617e {

    /* renamed from: a */
    final /* synthetic */ Handler f3563a;

    /* renamed from: b */
    final /* synthetic */ Runnable f3564b;

    @Override // androidx.lifecycle.AbstractC0617e
    /* renamed from: d */
    public void mo148d(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar) {
        if (aVar == AbstractC0614d.EnumC0615a.ON_DESTROY) {
            this.f3563a.removeCallbacks(this.f3564b);
            gVar.mo140n().mo3666c(this);
        }
    }
}
