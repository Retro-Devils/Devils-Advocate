package p006b.p015b.p016a.p017a;

import java.util.concurrent.Executor;

/* renamed from: b.b.a.a.a */
public class C0798a extends AbstractC0803c {

    /* renamed from: a */
    private static volatile C0798a f4004a;

    /* renamed from: b */
    private static final Executor f4005b = new ExecutorC0799a();

    /* renamed from: c */
    private static final Executor f4006c = new ExecutorC0800b();

    /* renamed from: d */
    private AbstractC0803c f4007d;

    /* renamed from: e */
    private AbstractC0803c f4008e;

    /* renamed from: b.b.a.a.a$a */
    static class ExecutorC0799a implements Executor {
        ExecutorC0799a() {
        }

        public void execute(Runnable runnable) {
            C0798a.m4684d().mo4750c(runnable);
        }
    }

    /* renamed from: b.b.a.a.a$b */
    static class ExecutorC0800b implements Executor {
        ExecutorC0800b() {
        }

        public void execute(Runnable runnable) {
            C0798a.m4684d().mo4748a(runnable);
        }
    }

    private C0798a() {
        C0801b bVar = new C0801b();
        this.f4008e = bVar;
        this.f4007d = bVar;
    }

    /* renamed from: d */
    public static C0798a m4684d() {
        if (f4004a != null) {
            return f4004a;
        }
        synchronized (C0798a.class) {
            if (f4004a == null) {
                f4004a = new C0798a();
            }
        }
        return f4004a;
    }

    @Override // p006b.p015b.p016a.p017a.AbstractC0803c
    /* renamed from: a */
    public void mo4748a(Runnable runnable) {
        this.f4007d.mo4748a(runnable);
    }

    @Override // p006b.p015b.p016a.p017a.AbstractC0803c
    /* renamed from: b */
    public boolean mo4749b() {
        return this.f4007d.mo4749b();
    }

    @Override // p006b.p015b.p016a.p017a.AbstractC0803c
    /* renamed from: c */
    public void mo4750c(Runnable runnable) {
        this.f4007d.mo4750c(runnable);
    }
}
