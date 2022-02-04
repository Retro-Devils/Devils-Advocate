package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.b */
public abstract class AbstractC0049b {

    /* renamed from: a */
    private boolean f106a;

    /* renamed from: b */
    private CopyOnWriteArrayList<AbstractC0048a> f107b = new CopyOnWriteArrayList<>();

    public AbstractC0049b(boolean z) {
        this.f106a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo154a(AbstractC0048a aVar) {
        this.f107b.add(aVar);
    }

    /* renamed from: b */
    public abstract void mo155b();

    /* renamed from: c */
    public final boolean mo156c() {
        return this.f106a;
    }

    /* renamed from: d */
    public final void mo157d() {
        Iterator<AbstractC0048a> it = this.f107b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo158e(AbstractC0048a aVar) {
        this.f107b.remove(aVar);
    }

    /* renamed from: f */
    public final void mo159f(boolean z) {
        this.f106a = z;
    }
}
