package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0614d;

/* renamed from: androidx.lifecycle.o */
public class FragmentC0629o extends Fragment {

    /* renamed from: b */
    private AbstractC0630a f3047b;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.o$a */
    public interface AbstractC0630a {
        /* renamed from: a */
        void mo3680a();

        /* renamed from: b */
        void mo3681b();

        /* renamed from: c */
        void mo3682c();
    }

    /* renamed from: a */
    private void m3280a(AbstractC0614d.EnumC0615a aVar) {
        Activity activity = getActivity();
        if (activity instanceof AbstractC0623i) {
            ((AbstractC0623i) activity).mo140n().mo3668i(aVar);
        } else if (activity instanceof AbstractC0619g) {
            AbstractC0614d n = ((AbstractC0619g) activity).mo140n();
            if (n instanceof C0620h) {
                ((C0620h) n).mo3668i(aVar);
            }
        }
    }

    /* renamed from: b */
    private void m3281b(AbstractC0630a aVar) {
        if (aVar != null) {
            aVar.mo3681b();
        }
    }

    /* renamed from: c */
    private void m3282c(AbstractC0630a aVar) {
        if (aVar != null) {
            aVar.mo3682c();
        }
    }

    /* renamed from: d */
    private void m3283d(AbstractC0630a aVar) {
        if (aVar != null) {
            aVar.mo3680a();
        }
    }

    /* renamed from: e */
    public static void m3284e(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0629o(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m3281b(this.f3047b);
        m3280a(AbstractC0614d.EnumC0615a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        m3280a(AbstractC0614d.EnumC0615a.ON_DESTROY);
        this.f3047b = null;
    }

    public void onPause() {
        super.onPause();
        m3280a(AbstractC0614d.EnumC0615a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        m3282c(this.f3047b);
        m3280a(AbstractC0614d.EnumC0615a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        m3283d(this.f3047b);
        m3280a(AbstractC0614d.EnumC0615a.ON_START);
    }

    public void onStop() {
        super.onStop();
        m3280a(AbstractC0614d.EnumC0615a.ON_STOP);
    }
}
