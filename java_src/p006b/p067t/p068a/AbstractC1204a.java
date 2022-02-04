package p006b.p067t.p068a;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: b.t.a.a */
public abstract class AbstractC1204a {

    /* renamed from: a */
    private final DataSetObservable f5324a = new DataSetObservable();

    /* renamed from: b */
    private DataSetObserver f5325b;

    /* renamed from: a */
    public abstract void mo6056a(ViewGroup viewGroup, int i, Object obj);

    /* renamed from: b */
    public abstract void mo6057b(ViewGroup viewGroup);

    /* renamed from: c */
    public abstract int mo6058c();

    /* renamed from: d */
    public abstract int mo6059d(Object obj);

    /* renamed from: e */
    public float mo6060e(int i) {
        return 1.0f;
    }

    /* renamed from: f */
    public abstract Object mo6061f(ViewGroup viewGroup, int i);

    /* renamed from: g */
    public abstract boolean mo6062g(View view, Object obj);

    /* renamed from: h */
    public void mo6063h() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f5325b;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f5324a.notifyChanged();
    }

    /* renamed from: i */
    public abstract void mo6064i(Parcelable parcelable, ClassLoader classLoader);

    /* renamed from: j */
    public abstract Parcelable mo6065j();

    /* renamed from: k */
    public abstract void mo6066k(ViewGroup viewGroup, int i, Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo6067l(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f5325b = dataSetObserver;
        }
    }

    /* renamed from: m */
    public abstract void mo6068m(ViewGroup viewGroup);
}
