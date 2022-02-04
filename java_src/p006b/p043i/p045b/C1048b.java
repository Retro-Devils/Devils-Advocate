package p006b.p043i.p045b;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: b.i.b.b */
class C1048b {

    /* renamed from: b.i.b.b$a */
    public interface AbstractC1049a<T> {
        /* renamed from: a */
        void mo5634a(T t, Rect rect);
    }

    /* renamed from: b.i.b.b$b */
    public interface AbstractC1050b<T, V> {
        /* renamed from: a */
        int mo5636a(T t);

        /* renamed from: b */
        V mo5637b(T t, int i);
    }

    /* renamed from: b.i.b.b$c */
    private static class C1051c<T> implements Comparator<T> {

        /* renamed from: a */
        private final Rect f4817a = new Rect();

        /* renamed from: b */
        private final Rect f4818b = new Rect();

        /* renamed from: c */
        private final boolean f4819c;

        /* renamed from: d */
        private final AbstractC1049a<T> f4820d;

        C1051c(boolean z, AbstractC1049a<T> aVar) {
            this.f4819c = z;
            this.f4820d = aVar;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.f4817a;
            Rect rect2 = this.f4818b;
            this.f4820d.mo5634a(t, rect);
            this.f4820d.mo5634a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f4819c ? 1 : -1;
            }
            if (i3 > i4) {
                return this.f4819c ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return this.f4819c ? 1 : -1;
            }
            if (i7 > i8) {
                return this.f4819c ? -1 : 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    private static boolean m5940a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean b = m5941b(i, rect, rect2);
        if (m5941b(i, rect, rect3) || !b) {
            return false;
        }
        return !m5949j(i, rect, rect3) || i == 17 || i == 66 || m5950k(i, rect, rect2) < m5952m(i, rect, rect3);
    }

    /* renamed from: b */
    private static boolean m5941b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <L, T> T m5942c(L r7, p006b.p043i.p045b.C1048b.AbstractC1050b<L, T> r8, p006b.p043i.p045b.C1048b.AbstractC1049a<T> r9, T r10, android.graphics.Rect r11, int r12) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p043i.p045b.C1048b.m5942c(java.lang.Object, b.i.b.b$b, b.i.b.b$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    /* renamed from: d */
    public static <L, T> T m5943d(L l, AbstractC1050b<L, T> bVar, AbstractC1049a<T> aVar, T t, int i, boolean z, boolean z2) {
        int a = bVar.mo5636a(l);
        ArrayList arrayList = new ArrayList(a);
        for (int i2 = 0; i2 < a; i2++) {
            arrayList.add(bVar.mo5637b(l, i2));
        }
        Collections.sort(arrayList, new C1051c(z, aVar));
        if (i == 1) {
            return (T) m5945f(t, arrayList, z2);
        }
        if (i == 2) {
            return (T) m5944e(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: e */
    private static <T> T m5944e(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    private static <T> T m5945f(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    private static int m5946g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    private static boolean m5947h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!m5948i(rect, rect2, i)) {
            return false;
        }
        if (m5948i(rect, rect3, i) && !m5940a(i, rect, rect2, rect3)) {
            return !m5940a(i, rect, rect3, rect2) && m5946g(m5950k(i, rect, rect2), m5954o(i, rect, rect2)) < m5946g(m5950k(i, rect, rect3), m5954o(i, rect, rect3));
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m5948i(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: j */
    private static boolean m5949j(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        }
        if (i == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i == 66) {
            return rect.right <= rect2.left;
        }
        if (i == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: k */
    private static int m5950k(int i, Rect rect, Rect rect2) {
        return Math.max(0, m5951l(i, rect, rect2));
    }

    /* renamed from: l */
    private static int m5951l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: m */
    private static int m5952m(int i, Rect rect, Rect rect2) {
        return Math.max(1, m5953n(i, rect, rect2));
    }

    /* renamed from: n */
    private static int m5953n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: o */
    private static int m5954o(int i, Rect rect, Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = rect.left + (rect.width() / 2);
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - (i2 + (height2 / 2)));
        }
        height = rect.top + (rect.height() / 2);
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - (i2 + (height2 / 2)));
    }
}
