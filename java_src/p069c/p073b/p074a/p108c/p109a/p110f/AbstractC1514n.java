package p069c.p073b.p074a.p108c.p109a.p110f;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import p069c.p073b.p074a.p108c.p109a.C1478a;
import p069c.p073b.p074a.p108c.p109a.EnumC1479b;
import p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1497e;
import p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1504h;
import p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1523p;

/* renamed from: c.b.a.c.a.f.n */
public abstract class AbstractC1514n<T extends IInterface> implements AbstractC1523p {

    /* renamed from: a */
    private final Context f6306a;

    /* renamed from: b */
    final Handler f6307b;

    /* renamed from: c */
    private T f6308c;

    /* renamed from: d */
    private ArrayList<AbstractC1523p.AbstractC1524a> f6309d;

    /* renamed from: e */
    private final ArrayList<AbstractC1523p.AbstractC1524a> f6310e = new ArrayList<>();

    /* renamed from: f */
    private boolean f6311f = false;

    /* renamed from: g */
    private ArrayList<AbstractC1523p.AbstractC1525b> f6312g;

    /* renamed from: h */
    private boolean f6313h = false;

    /* renamed from: i */
    private final ArrayList<AbstractC1517c<?>> f6314i = new ArrayList<>();

    /* renamed from: j */
    private ServiceConnection f6315j;

    /* renamed from: k */
    private boolean f6316k = false;

    /* renamed from: c.b.a.c.a.f.n$a */
    static /* synthetic */ class C1515a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6317a;

        static {
            int[] iArr = new int[EnumC1479b.values().length];
            f6317a = iArr;
            try {
                iArr[EnumC1479b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: c.b.a.c.a.f.n$b */
    final class HandlerC1516b extends Handler {
        HandlerC1516b() {
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 3) {
                AbstractC1514n.this.mo6795i((EnumC1479b) message.obj);
            } else if (i == 4) {
                synchronized (AbstractC1514n.this.f6309d) {
                    if (AbstractC1514n.this.f6316k && AbstractC1514n.this.mo6797t() && AbstractC1514n.this.f6309d.contains(message.obj)) {
                        ((AbstractC1523p.AbstractC1524a) message.obj).mo6741a();
                    }
                }
            } else if (i != 2 || AbstractC1514n.this.mo6797t()) {
                int i2 = message.what;
                if (i2 == 2 || i2 == 1) {
                    ((AbstractC1517c) message.obj).mo6803a();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c.b.a.c.a.f.n$c */
    public abstract class AbstractC1517c<TListener> {

        /* renamed from: a */
        private TListener f6319a;

        public AbstractC1517c(TListener tlistener) {
            this.f6319a = tlistener;
            synchronized (AbstractC1514n.this.f6314i) {
                AbstractC1514n.this.f6314i.add(this);
            }
        }

        /* renamed from: a */
        public final void mo6803a() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f6319a;
            }
            mo6804b(tlistener);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract void mo6804b(TListener tlistener);

        /* renamed from: c */
        public final void mo6805c() {
            synchronized (this) {
                this.f6319a = null;
            }
        }
    }

    /* renamed from: c.b.a.c.a.f.n$d */
    protected final class C1518d extends AbstractC1517c<Boolean> {

        /* renamed from: c */
        public final EnumC1479b f6321c;

        /* renamed from: d */
        public final IBinder f6322d;

        public C1518d(String str, IBinder iBinder) {
            super(Boolean.TRUE);
            this.f6321c = AbstractC1514n.m7450l(str);
            this.f6322d = iBinder;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* access modifiers changed from: protected */
        @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1514n.AbstractC1517c
        /* renamed from: b */
        public final /* synthetic */ void mo6804b(Boolean bool) {
            if (bool == null) {
                return;
            }
            if (C1515a.f6317a[this.f6321c.ordinal()] != 1) {
                AbstractC1514n.this.mo6795i(this.f6321c);
                return;
            }
            try {
                if (AbstractC1514n.this.mo6792m().equals(this.f6322d.getInterfaceDescriptor())) {
                    AbstractC1514n nVar = AbstractC1514n.this;
                    nVar.f6308c = nVar.mo6789d(this.f6322d);
                    if (AbstractC1514n.this.f6308c != null) {
                        AbstractC1514n.this.mo6798u();
                        return;
                    }
                }
            } catch (RemoteException unused) {
            }
            AbstractC1514n.this.m7449h();
            AbstractC1514n.this.mo6795i(EnumC1479b.INTERNAL_ERROR);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c.b.a.c.a.f.n$e */
    public final class BinderC1519e extends AbstractC1497e.AbstractBinderC1498a {
        protected BinderC1519e() {
        }

        @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1497e
        /* renamed from: d0 */
        public final void mo6749d0(String str, IBinder iBinder) {
            AbstractC1514n nVar = AbstractC1514n.this;
            Handler handler = nVar.f6307b;
            handler.sendMessage(handler.obtainMessage(1, new C1518d(str, iBinder)));
        }
    }

    /* renamed from: c.b.a.c.a.f.n$f */
    final class ServiceConnectionC1520f implements ServiceConnection {
        ServiceConnectionC1520f() {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            AbstractC1514n.this.mo6796n(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            AbstractC1514n.this.f6308c = null;
            AbstractC1514n.this.mo6799v();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: java.util.ArrayList<c.b.a.c.a.f.p$a> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: java.util.ArrayList<c.b.a.c.a.f.p$b> */
    /* JADX WARN: Multi-variable type inference failed */
    protected AbstractC1514n(Context context, AbstractC1523p.AbstractC1524a aVar, AbstractC1523p.AbstractC1525b bVar) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f6306a = (Context) C1494b.m7373a(context);
            ArrayList<AbstractC1523p.AbstractC1524a> arrayList = new ArrayList<>();
            this.f6309d = arrayList;
            arrayList.add(C1494b.m7373a(aVar));
            ArrayList<AbstractC1523p.AbstractC1525b> arrayList2 = new ArrayList<>();
            this.f6312g = arrayList2;
            arrayList2.add(C1494b.m7373a(bVar));
            this.f6307b = new HandlerC1516b();
            return;
        }
        throw new IllegalStateException("Clients must be created on the UI thread.");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private void m7449h() {
        ServiceConnection serviceConnection = this.f6315j;
        if (serviceConnection != null) {
            try {
                this.f6306a.unbindService(serviceConnection);
            } catch (IllegalArgumentException e) {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", e);
            }
        }
        this.f6308c = null;
        this.f6315j = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static EnumC1479b m7450l(String str) {
        try {
            return EnumC1479b.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return EnumC1479b.UNKNOWN_ERROR;
        } catch (NullPointerException unused2) {
            return EnumC1479b.UNKNOWN_ERROR;
        }
    }

    @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1523p
    /* renamed from: c */
    public final void mo6794c() {
        this.f6316k = true;
        EnumC1479b b = C1478a.m7315b(this.f6306a);
        if (b != EnumC1479b.SUCCESS) {
            Handler handler = this.f6307b;
            handler.sendMessage(handler.obtainMessage(3, b));
            return;
        }
        Intent intent = new Intent(mo6793p()).setPackage(C1534v.m7515a(this.f6306a));
        if (this.f6315j != null) {
            Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
            m7449h();
        }
        ServiceConnectionC1520f fVar = new ServiceConnectionC1520f();
        this.f6315j = fVar;
        if (!this.f6306a.bindService(intent, fVar, 129)) {
            Handler handler2 = this.f6307b;
            handler2.sendMessage(handler2.obtainMessage(3, EnumC1479b.ERROR_CONNECTING_TO_SERVICE));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract T mo6789d(IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo6795i(EnumC1479b bVar) {
        this.f6307b.removeMessages(4);
        synchronized (this.f6312g) {
            this.f6313h = true;
            ArrayList<AbstractC1523p.AbstractC1525b> arrayList = this.f6312g;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (this.f6316k) {
                    if (this.f6312g.contains(arrayList.get(i))) {
                        arrayList.get(i).mo6743a(bVar);
                    }
                } else {
                    return;
                }
            }
            this.f6313h = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo6790j(AbstractC1504h hVar, BinderC1519e eVar);

    @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1523p
    /* renamed from: k */
    public void mo6791k() {
        mo6799v();
        this.f6316k = false;
        synchronized (this.f6314i) {
            int size = this.f6314i.size();
            for (int i = 0; i < size; i++) {
                this.f6314i.get(i).mo6805c();
            }
            this.f6314i.clear();
        }
        m7449h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract String mo6792m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo6796n(IBinder iBinder) {
        try {
            mo6790j(AbstractC1504h.AbstractBinderC1505a.m7428i(iBinder), new BinderC1519e());
        } catch (RemoteException unused) {
            Log.w("YouTubeClient", "service died");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract String mo6793p();

    /* renamed from: t */
    public final boolean mo6797t() {
        return this.f6308c != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo6798u() {
        synchronized (this.f6309d) {
            boolean z = true;
            C1494b.m7376d(!this.f6311f);
            this.f6307b.removeMessages(4);
            this.f6311f = true;
            if (this.f6310e.size() != 0) {
                z = false;
            }
            C1494b.m7376d(z);
            ArrayList<AbstractC1523p.AbstractC1524a> arrayList = this.f6309d;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f6316k && mo6797t(); i++) {
                if (!this.f6310e.contains(arrayList.get(i))) {
                    arrayList.get(i).mo6741a();
                }
            }
            this.f6310e.clear();
            this.f6311f = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final void mo6799v() {
        this.f6307b.removeMessages(4);
        synchronized (this.f6309d) {
            this.f6311f = true;
            ArrayList<AbstractC1523p.AbstractC1524a> arrayList = this.f6309d;
            int size = arrayList.size();
            for (int i = 0; i < size && this.f6316k; i++) {
                if (this.f6309d.contains(arrayList.get(i))) {
                    arrayList.get(i).mo6742c();
                }
            }
            this.f6311f = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo6800w() {
        if (!mo6797t()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final T mo6801x() {
        mo6800w();
        return this.f6308c;
    }
}
