package p069c.p073b.p074a.p108c.p109a.p110f;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import p069c.p073b.p074a.p108c.p109a.AbstractC1480c;
import p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1502g;

/* renamed from: c.b.a.c.a.f.o */
public final class C1521o implements AbstractC1480c {

    /* renamed from: a */
    private AbstractC1496d f6334a;

    /* renamed from: b */
    private AbstractC1499f f6335b;

    /* renamed from: c.b.a.c.a.f.o$a */
    class BinderC1522a extends AbstractC1502g.AbstractBinderC1503a {

        /* renamed from: a */
        final /* synthetic */ AbstractC1480c.AbstractC1483c f6336a;

        BinderC1522a(AbstractC1480c.AbstractC1483c cVar) {
            this.f6336a = cVar;
        }

        @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1502g
        /* renamed from: G */
        public final void mo6772G(String str) {
            this.f6336a.mo6705a(str);
        }

        @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1502g
        /* renamed from: a */
        public final void mo6773a() {
            this.f6336a.mo6709e();
        }

        @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1502g
        /* renamed from: c */
        public final void mo6774c() {
            this.f6336a.mo6708d();
        }

        @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1502g
        /* renamed from: f */
        public final void mo6775f() {
            this.f6336a.mo6706b();
        }

        @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1502g
        /* renamed from: j0 */
        public final void mo6776j0(String str) {
            AbstractC1480c.EnumC1481a aVar;
            try {
                aVar = AbstractC1480c.EnumC1481a.valueOf(str);
            } catch (IllegalArgumentException | NullPointerException unused) {
                aVar = AbstractC1480c.EnumC1481a.UNKNOWN;
            }
            this.f6336a.mo6710f(aVar);
        }

        @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1502g
        /* renamed from: k */
        public final void mo6777k() {
            this.f6336a.mo6707c();
        }
    }

    public C1521o(AbstractC1496d dVar, AbstractC1499f fVar) {
        this.f6334a = (AbstractC1496d) C1494b.m7374b(dVar, "connectionClient cannot be null");
        this.f6335b = (AbstractC1499f) C1494b.m7374b(fVar, "embeddedPlayer cannot be null");
    }

    @Override // p069c.p073b.p074a.p108c.p109a.AbstractC1480c
    /* renamed from: a */
    public final void mo6697a() {
        mo6810i(true);
    }

    @Override // p069c.p073b.p074a.p108c.p109a.AbstractC1480c
    /* renamed from: b */
    public final void mo6698b() {
        try {
            this.f6335b.mo6762c();
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    @Override // p069c.p073b.p074a.p108c.p109a.AbstractC1480c
    /* renamed from: c */
    public final void mo6699c(String str) {
        mo6817p(str, 0);
    }

    @Override // p069c.p073b.p074a.p108c.p109a.AbstractC1480c
    /* renamed from: d */
    public final boolean mo6700d() {
        try {
            return this.f6335b.mo6764f();
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    @Override // p069c.p073b.p074a.p108c.p109a.AbstractC1480c
    /* renamed from: e */
    public final void mo6701e() {
        try {
            this.f6335b.mo6760a();
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    @Override // p069c.p073b.p074a.p108c.p109a.AbstractC1480c
    /* renamed from: f */
    public final void mo6702f(AbstractC1480c.AbstractC1483c cVar) {
        try {
            this.f6335b.mo6754D(new BinderC1522a(cVar));
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: g */
    public final View mo6808g() {
        try {
            return (View) BinderC1529r.m7507m(this.f6335b.mo6757T());
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: h */
    public final void mo6809h(Configuration configuration) {
        try {
            this.f6335b.mo6758Y(configuration);
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: i */
    public final void mo6810i(boolean z) {
        try {
            this.f6335b.mo6761b(z);
            this.f6334a.mo6748b(z);
            this.f6334a.mo6791k();
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: j */
    public final boolean mo6811j(int i, KeyEvent keyEvent) {
        try {
            return this.f6335b.mo6770w(i, keyEvent);
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: k */
    public final boolean mo6812k(Bundle bundle) {
        try {
            return this.f6335b.mo6756P(bundle);
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: l */
    public final void mo6813l() {
        try {
            this.f6335b.mo6765g0();
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: m */
    public final void mo6814m(boolean z) {
        try {
            this.f6335b.mo6767o0(z);
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: n */
    public final boolean mo6815n(int i, KeyEvent keyEvent) {
        try {
            return this.f6335b.mo6766m0(i, keyEvent);
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: o */
    public final void mo6816o() {
        try {
            this.f6335b.mo6753C();
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: p */
    public final void mo6817p(String str, int i) {
        try {
            this.f6335b.mo6768r(str, i);
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: q */
    public final void mo6818q() {
        try {
            this.f6335b.mo6763c0();
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: r */
    public final void mo6819r() {
        try {
            this.f6335b.mo6752A();
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: s */
    public final void mo6820s() {
        try {
            this.f6335b.mo6759Z();
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: t */
    public final void mo6821t() {
        try {
            this.f6335b.mo6755K();
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }

    /* renamed from: u */
    public final Bundle mo6822u() {
        try {
            return this.f6335b.mo6769v();
        } catch (RemoteException e) {
            throw new C1513m(e);
        }
    }
}
