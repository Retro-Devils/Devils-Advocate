package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0698a;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.i */
public class C0727i {

    /* renamed from: a */
    final AbstractC0728a f3515a;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.i$a */
    public interface AbstractC0728a {
        /* renamed from: a */
        void mo4327a(C0698a.C0700b bVar);

        /* renamed from: b */
        C0698a.C0700b mo4328b(int i, int i2, int i3, Object obj);
    }

    C0727i(AbstractC0728a aVar) {
        this.f3515a = aVar;
    }

    /* renamed from: a */
    private int m4288a(List<C0698a.C0700b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f3385a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m4289c(List<C0698a.C0700b> list, int i, C0698a.C0700b bVar, int i2, C0698a.C0700b bVar2) {
        int i3 = bVar.f3388d;
        int i4 = bVar2.f3386b;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = bVar.f3386b;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            bVar.f3386b = i6 + bVar2.f3388d;
        }
        int i7 = bVar2.f3386b;
        if (i7 <= i3) {
            bVar.f3388d = i3 + bVar2.f3388d;
        }
        bVar2.f3386b = i7 + i5;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* renamed from: d */
    private void m4290d(List<C0698a.C0700b> list, int i, int i2) {
        C0698a.C0700b bVar = list.get(i);
        C0698a.C0700b bVar2 = list.get(i2);
        int i3 = bVar2.f3385a;
        if (i3 == 1) {
            m4289c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            mo4434e(list, i, bVar, i2, bVar2);
        } else if (i3 == 4) {
            mo4435f(list, i, bVar, i2, bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4433b(List<C0698a.C0700b> list) {
        while (true) {
            int a = m4288a(list);
            if (a != -1) {
                m4290d(list, a, a + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        if (r0 > r14.f3386b) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c7, code lost:
        if (r0 >= r14.f3386b) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4434e(java.util.List<androidx.recyclerview.widget.C0698a.C0700b> r10, int r11, androidx.recyclerview.widget.C0698a.C0700b r12, int r13, androidx.recyclerview.widget.C0698a.C0700b r14) {
        /*
        // Method dump skipped, instructions count: 228
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0727i.mo4434e(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4435f(java.util.List<androidx.recyclerview.widget.C0698a.C0700b> r9, int r10, androidx.recyclerview.widget.C0698a.C0700b r11, int r12, androidx.recyclerview.widget.C0698a.C0700b r13) {
        /*
            r8 = this;
            int r0 = r11.f3388d
            int r1 = r13.f3386b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.f3386b = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.f3388d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.f3388d = r5
            androidx.recyclerview.widget.i$a r0 = r8.f3515a
            int r1 = r11.f3386b
            java.lang.Object r5 = r13.f3387c
            androidx.recyclerview.widget.a$b r0 = r0.mo4328b(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.f3386b
            int r5 = r13.f3386b
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.f3386b = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.f3388d
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.i$a r3 = r8.f3515a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f3387c
            androidx.recyclerview.widget.a$b r3 = r3.mo4328b(r2, r1, r5, r4)
            int r1 = r13.f3388d
            int r1 = r1 - r5
            r13.f3388d = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.f3388d
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            androidx.recyclerview.widget.i$a r11 = r8.f3515a
            r11.mo4327a(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0727i.mo4435f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
