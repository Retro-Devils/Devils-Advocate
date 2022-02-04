package com.bumptech.glide.load.p122o;

import android.util.Log;
import com.bumptech.glide.load.AbstractC1643g;
import com.bumptech.glide.load.EnumC1630a;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.q */
public final class C1787q extends Exception {

    /* renamed from: b */
    private static final StackTraceElement[] f6989b = new StackTraceElement[0];

    /* renamed from: c */
    private final List<Throwable> f6990c;

    /* renamed from: d */
    private AbstractC1643g f6991d;

    /* renamed from: e */
    private EnumC1630a f6992e;

    /* renamed from: f */
    private Class<?> f6993f;

    /* renamed from: g */
    private String f6994g;

    /* renamed from: h */
    private Exception f6995h;

    /* access modifiers changed from: private */
    /* renamed from: com.bumptech.glide.load.o.q$a */
    public static final class C1788a implements Appendable {

        /* renamed from: b */
        private final Appendable f6996b;

        /* renamed from: c */
        private boolean f6997c = true;

        C1788a(Appendable appendable) {
            this.f6996b = appendable;
        }

        /* renamed from: a */
        private CharSequence m8356a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) {
            boolean z = false;
            if (this.f6997c) {
                this.f6997c = false;
                this.f6996b.append("  ");
            }
            if (c == '\n') {
                z = true;
            }
            this.f6997c = z;
            this.f6996b.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) {
            CharSequence a = m8356a(charSequence);
            return append(a, 0, a.length());
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) {
            CharSequence a = m8356a(charSequence);
            boolean z = false;
            if (this.f6997c) {
                this.f6997c = false;
                this.f6996b.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.f6997c = z;
            this.f6996b.append(a, i, i2);
            return this;
        }
    }

    public C1787q(String str) {
        this(str, Collections.emptyList());
    }

    public C1787q(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public C1787q(String str, List<Throwable> list) {
        this.f6994g = str;
        setStackTrace(f6989b);
        this.f6990c = list;
    }

    /* renamed from: a */
    private void m8345a(Throwable th, List<Throwable> list) {
        if (th instanceof C1787q) {
            for (Throwable th2 : ((C1787q) th).mo7365e()) {
                m8345a(th2, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: b */
    private static void m8346b(List<Throwable> list, Appendable appendable) {
        try {
            m8347c(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    private static void m8347c(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof C1787q) {
                ((C1787q) th).m8349h(appendable);
            } else {
                m8348d(th, appendable);
            }
            i = i2;
        }
    }

    /* renamed from: d */
    private static void m8348d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: h */
    private void m8349h(Appendable appendable) {
        m8348d(this, appendable);
        m8346b(mo7365e(), new C1788a(appendable));
    }

    /* renamed from: e */
    public List<Throwable> mo7365e() {
        return this.f6990c;
    }

    /* renamed from: f */
    public List<Throwable> mo7366f() {
        ArrayList arrayList = new ArrayList();
        m8345a(this, arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    /* renamed from: g */
    public void mo7368g(String str) {
        List<Throwable> f = mo7366f();
        int size = f.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), f.get(i));
            i = i2;
        }
    }

    public String getMessage() {
        String str;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f6994g);
        String str2 = "";
        sb.append(this.f6993f != null ? ", " + this.f6993f : str2);
        sb.append(this.f6992e != null ? ", " + this.f6992e : str2);
        if (this.f6991d != null) {
            str2 = ", " + this.f6991d;
        }
        sb.append(str2);
        List<Throwable> f = mo7366f();
        if (f.isEmpty()) {
            return sb.toString();
        }
        if (f.size() == 1) {
            str = "\nThere was 1 cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(f.size());
            str = " causes:";
        }
        sb.append(str);
        for (Throwable th : f) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo7370i(AbstractC1643g gVar, EnumC1630a aVar) {
        mo7371j(gVar, aVar, null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo7371j(AbstractC1643g gVar, EnumC1630a aVar, Class<?> cls) {
        this.f6991d = gVar;
        this.f6992e = aVar;
        this.f6993f = cls;
    }

    /* renamed from: k */
    public void mo7372k(Exception exc) {
        this.f6995h = exc;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        m8349h(printStream);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        m8349h(printWriter);
    }
}
