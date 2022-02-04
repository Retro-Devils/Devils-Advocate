package androidx.activity;

import androidx.lifecycle.AbstractC0614d;
import androidx.lifecycle.AbstractC0617e;
import androidx.lifecycle.AbstractC0619g;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f98a;

    /* renamed from: b */
    final ArrayDeque<AbstractC0049b> f99b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements AbstractC0617e, AbstractC0048a {

        /* renamed from: a */
        private final AbstractC0614d f100a;

        /* renamed from: b */
        private final AbstractC0049b f101b;

        /* renamed from: c */
        private AbstractC0048a f102c;

        LifecycleOnBackPressedCancellable(AbstractC0614d dVar, AbstractC0049b bVar) {
            this.f100a = dVar;
            this.f101b = bVar;
            dVar.mo3664a(this);
        }

        @Override // androidx.activity.AbstractC0048a
        public void cancel() {
            this.f100a.mo3666c(this);
            this.f101b.mo158e(this);
            AbstractC0048a aVar = this.f102c;
            if (aVar != null) {
                aVar.cancel();
                this.f102c = null;
            }
        }

        @Override // androidx.lifecycle.AbstractC0617e
        /* renamed from: d */
        public void mo148d(AbstractC0619g gVar, AbstractC0614d.EnumC0615a aVar) {
            if (aVar == AbstractC0614d.EnumC0615a.ON_START) {
                this.f102c = OnBackPressedDispatcher.this.mo151b(this.f101b);
            } else if (aVar == AbstractC0614d.EnumC0615a.ON_STOP) {
                AbstractC0048a aVar2 = this.f102c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == AbstractC0614d.EnumC0615a.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    public class C0047a implements AbstractC0048a {

        /* renamed from: a */
        private final AbstractC0049b f104a;

        C0047a(AbstractC0049b bVar) {
            this.f104a = bVar;
        }

        @Override // androidx.activity.AbstractC0048a
        public void cancel() {
            OnBackPressedDispatcher.this.f99b.remove(this.f104a);
            this.f104a.mo158e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f98a = runnable;
    }

    /* renamed from: a */
    public void mo150a(AbstractC0619g gVar, AbstractC0049b bVar) {
        AbstractC0614d n = gVar.mo140n();
        if (n.mo3665b() != AbstractC0614d.EnumC0616b.DESTROYED) {
            bVar.mo154a(new LifecycleOnBackPressedCancellable(n, bVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC0048a mo151b(AbstractC0049b bVar) {
        this.f99b.add(bVar);
        C0047a aVar = new C0047a(bVar);
        bVar.mo154a(aVar);
        return aVar;
    }

    /* renamed from: c */
    public void mo152c() {
        Iterator<AbstractC0049b> descendingIterator = this.f99b.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC0049b next = descendingIterator.next();
            if (next.mo156c()) {
                next.mo155b();
                return;
            }
        }
        Runnable runnable = this.f98a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
