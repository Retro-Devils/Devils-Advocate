package p006b.p054n.p055a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC0619g;
import androidx.lifecycle.AbstractC0627m;
import androidx.lifecycle.AbstractC0631p;
import androidx.lifecycle.C0626l;
import androidx.lifecycle.C0632q;
import androidx.lifecycle.C0635r;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p006b.p021d.C0839j;
import p006b.p030g.p038j.C0953a;
import p006b.p054n.p056b.C1087a;

/* access modifiers changed from: package-private */
/* renamed from: b.n.a.b */
public class C1082b extends AbstractC1081a {

    /* renamed from: a */
    static boolean f4989a = false;

    /* renamed from: b */
    private final AbstractC0619g f4990b;

    /* renamed from: c */
    private final C1085c f4991c;

    /* renamed from: b.n.a.b$a */
    public static class C1083a<D> extends C0626l<D> {

        /* renamed from: k */
        private final int f4992k;

        /* renamed from: l */
        private final Bundle f4993l;

        /* renamed from: m */
        private final C1087a<D> f4994m;

        /* renamed from: n */
        private AbstractC0619g f4995n;

        /* renamed from: o */
        private C1084b<D> f4996o;

        /* renamed from: p */
        private C1087a<D> f4997p;

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: e */
        public void mo3642e() {
            if (C1082b.f4989a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: f */
        public void mo3643f() {
            if (C1082b.f4989a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: androidx.lifecycle.m<? super D> */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        /* renamed from: g */
        public void mo3644g(AbstractC0627m<? super D> mVar) {
            super.mo3644g(mVar);
            this.f4995n = null;
        }

        @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C0626l
        /* renamed from: h */
        public void mo3645h(D d) {
            super.mo3645h(d);
            if (this.f4997p != null) {
                throw null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C1087a<D> mo5715i(boolean z) {
            if (C1082b.f4989a) {
                Log.v("LoaderManager", "  Destroying: " + this);
                throw null;
            }
            throw null;
        }

        /* renamed from: j */
        public void mo5716j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f4992k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f4993l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f4994m);
            String str2 = str + "  ";
            throw null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo5717k() {
            AbstractC0619g gVar = this.f4995n;
            C1084b<D> bVar = this.f4996o;
            if (gVar != null && bVar != null) {
                super.mo3644g(bVar);
                mo3641d(gVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f4992k);
            sb.append(" : ");
            C0953a.m5480a(this.f4994m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b.n.a.b$b */
    public static class C1084b<D> implements AbstractC0627m<D> {
    }

    /* renamed from: b.n.a.b$c */
    static class C1085c extends AbstractC0631p {

        /* renamed from: c */
        private static final C0632q.AbstractC0633a f4998c = new C1086a();

        /* renamed from: d */
        private C0839j<C1083a> f4999d = new C0839j<>();

        /* renamed from: e */
        private boolean f5000e = false;

        /* renamed from: b.n.a.b$c$a */
        static class C1086a implements C0632q.AbstractC0633a {
            C1086a() {
            }

            @Override // androidx.lifecycle.C0632q.AbstractC0633a
            /* renamed from: a */
            public <T extends AbstractC0631p> T mo2859a(Class<T> cls) {
                return new C1085c();
            }
        }

        C1085c() {
        }

        /* renamed from: e */
        static C1085c m6124e(C0635r rVar) {
            return (C1085c) new C0632q(rVar, f4998c).mo3684a(C1085c.class);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.AbstractC0631p
        /* renamed from: c */
        public void mo2847c() {
            super.mo2847c();
            int l = this.f4999d.mo5036l();
            for (int i = 0; i < l; i++) {
                this.f4999d.mo5037m(i).mo5715i(true);
            }
            this.f4999d.mo5026b();
        }

        /* renamed from: d */
        public void mo5719d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f4999d.mo5036l() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f4999d.mo5036l(); i++) {
                    C1083a m = this.f4999d.mo5037m(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f4999d.mo5033i(i));
                    printWriter.print(": ");
                    printWriter.println(m.toString());
                    m.mo5716j(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo5720f() {
            int l = this.f4999d.mo5036l();
            for (int i = 0; i < l; i++) {
                this.f4999d.mo5037m(i).mo5717k();
            }
        }
    }

    C1082b(AbstractC0619g gVar, C0635r rVar) {
        this.f4990b = gVar;
        this.f4991c = C1085c.m6124e(rVar);
    }

    @Override // p006b.p054n.p055a.AbstractC1081a
    @Deprecated
    /* renamed from: a */
    public void mo5712a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f4991c.mo5719d(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p006b.p054n.p055a.AbstractC1081a
    /* renamed from: c */
    public void mo5713c() {
        this.f4991c.mo5720f();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0953a.m5480a(this.f4990b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
