package p069c.p118d.p119a;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.d.a.a */
public abstract class AbstractC1560a<T> implements Iterable<T> {

    /* renamed from: c.d.a.a$a */
    public static class C1561a<T> extends AbstractC1560a<T> {
        @Override // p069c.p118d.p119a.AbstractC1560a
        /* renamed from: a */
        public void mo6872a(AbstractC1563b<T> bVar) {
        }

        @Override // p069c.p118d.p119a.AbstractC1560a
        /* renamed from: e */
        public List<T> mo6873e() {
            return Collections.emptyList();
        }

        public String toString() {
            return "None";
        }
    }

    /* renamed from: c.d.a.a$b */
    public static class C1562b<T> extends AbstractC1560a<T> {

        /* renamed from: b */
        private final T f6395b;

        public C1562b(T t) {
            this.f6395b = t;
        }

        @Override // p069c.p118d.p119a.AbstractC1560a
        /* renamed from: a */
        public void mo6872a(AbstractC1563b<T> bVar) {
            bVar.mo6878a(mo6876f());
        }

        @Override // p069c.p118d.p119a.AbstractC1560a
        /* renamed from: e */
        public List<T> mo6873e() {
            return Collections.singletonList(mo6876f());
        }

        /* renamed from: f */
        public T mo6876f() {
            return this.f6395b;
        }

        public String toString() {
            return String.format("Some(%s)", mo6876f().toString());
        }
    }

    /* renamed from: b */
    public static <S> AbstractC1560a<S> m7603b() {
        return new C1561a();
    }

    /* renamed from: c */
    public static <S> AbstractC1560a<S> m7604c(S s) {
        return s == null ? m7603b() : m7605d(s);
    }

    /* renamed from: d */
    public static <S> AbstractC1560a<S> m7605d(S s) {
        return new C1562b(s);
    }

    /* renamed from: a */
    public abstract void mo6872a(AbstractC1563b<T> bVar);

    /* renamed from: e */
    public abstract List<T> mo6873e();

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return mo6873e().iterator();
    }
}
