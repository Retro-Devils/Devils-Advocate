package p069c.p073b.p074a.p108c.p109a.p110f;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1507i;
import p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1514n;
import p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1523p;

/* renamed from: c.b.a.c.a.f.l */
public final class C1512l extends AbstractC1514n<AbstractC1507i> implements AbstractC1496d {

    /* renamed from: l */
    private final String f6302l;

    /* renamed from: m */
    private final String f6303m;

    /* renamed from: n */
    private final String f6304n;

    /* renamed from: o */
    private boolean f6305o;

    public C1512l(Context context, String str, String str2, String str3, AbstractC1523p.AbstractC1524a aVar, AbstractC1523p.AbstractC1525b bVar) {
        super(context, aVar, bVar);
        this.f6302l = (String) C1494b.m7373a(str);
        this.f6303m = C1494b.m7375c(str2, "callingPackage cannot be null or empty");
        this.f6304n = C1494b.m7375c(str3, "callingAppVersion cannot be null or empty");
    }

    /* renamed from: y */
    private final void m7438y() {
        mo6800w();
        if (this.f6305o) {
            throw new IllegalStateException("Connection client has been released");
        }
    }

    @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1496d
    /* renamed from: a */
    public final IBinder mo6747a() {
        m7438y();
        try {
            return ((AbstractC1507i) mo6801x()).mo6782a();
        } catch (RemoteException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1496d
    /* renamed from: b */
    public final void mo6748b(boolean z) {
        if (mo6797t()) {
            try {
                ((AbstractC1507i) mo6801x()).mo6783b(z);
            } catch (RemoteException unused) {
            }
            this.f6305o = true;
        }
    }

    /* Return type fixed from 'android.os.IInterface' to match base method */
    /* access modifiers changed from: protected */
    @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1514n
    /* renamed from: d */
    public final /* synthetic */ AbstractC1507i mo6789d(IBinder iBinder) {
        return AbstractC1507i.AbstractBinderC1508a.m7432i(iBinder);
    }

    /* access modifiers changed from: protected */
    @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1514n
    /* renamed from: j */
    public final void mo6790j(AbstractC1504h hVar, AbstractC1514n.BinderC1519e eVar) {
        hVar.mo6780p(eVar, 1202, this.f6303m, this.f6304n, this.f6302l, null);
    }

    @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1523p, p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1514n
    /* renamed from: k */
    public final void mo6791k() {
        if (!this.f6305o) {
            mo6748b(true);
        }
        super.mo6791k();
    }

    /* access modifiers changed from: protected */
    @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1514n
    /* renamed from: m */
    public final String mo6792m() {
        return "com.google.android.youtube.player.internal.IYouTubeService";
    }

    /* access modifiers changed from: protected */
    @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1514n
    /* renamed from: p */
    public final String mo6793p() {
        return "com.google.android.youtube.api.service.START";
    }
}
