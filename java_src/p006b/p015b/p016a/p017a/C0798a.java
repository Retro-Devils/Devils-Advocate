package p006b.p015b.p016a.p017a;

import java.util.concurrent.Executor;

/* renamed from: b.b.a.a.a */
public class C0798a extends AbstractC0803c {

    /* renamed from: a */
    private static volatile C0798a f4000a;

    /* renamed from: b */
    private static final Executor f4001b = new ExecutorC0799a();

    /* renamed from: c */
    private static final Executor f4002c = new ExecutorC0800b();

    /* renamed from: d */
    private AbstractC0803c f4003d;

    /* renamed from: e */
    private AbstractC0803c f4004e;

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
        this.f4004e = bVar;
        this.f4003d = bVar;
    }

    /* renamed from: d */
    public static C0798a m4684d() {
        if (f4000a != null) {
            return f4000a;
        }
        synchronized (C0798a.class) {
            if (f4000a == null) {
                f4000a = new C0798a();
            }
        }
        return f4000a;
    }

    @Override // p006b.p015b.p016a.p017a.AbstractC0803c
    /* renamed from: a */
    public void mo4748a(Runnable runnable) {
        this.f4003d.mo4748a(runnable);
    }

    @Override // p006b.p015b.p016a.p017a.AbstractC0803c
    /* renamed from: b */
    public boolean mo4749b() {
        return this.f4003d.mo4749b();
    }

    @Override // p006b.p015b.p016a.p017a.AbstractC0803c
    /* renamed from: c */
    public void mo4750c(Runnable runnable) {
        this.f4003d.mo4750c(runnable);
    }
}
