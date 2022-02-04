package p006b.p030g.p039k.p040b0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: b.g.k.b0.d */
public class C0983d {

    /* renamed from: a */
    private final Object f4733a;

    /* renamed from: b.g.k.b0.d$a */
    static class C0984a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C0983d f4734a;

        C0984a(C0983d dVar) {
            this.f4734a = dVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C0979c a = this.f4734a.mo5520a(i);
            if (a == null) {
                return null;
            }
            return a.mo5448A0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C0979c> b = this.f4734a.mo5521b(str, i);
            if (b == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(b.get(i2).mo5448A0());
            }
            return arrayList;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f4734a.mo5524e(i, i2, bundle);
        }
    }

    /* renamed from: b.g.k.b0.d$b */
    static class C0985b extends C0984a {
        C0985b(C0983d dVar) {
            super(dVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            C0979c c = this.f4734a.mo5522c(i);
            if (c == null) {
                return null;
            }
            return c.mo5448A0();
        }
    }

    public C0983d() {
        int i = Build.VERSION.SDK_INT;
        this.f4733a = i >= 19 ? new C0985b(this) : i >= 16 ? new C0984a(this) : null;
    }

    public C0983d(Object obj) {
        this.f4733a = obj;
    }

    /* renamed from: a */
    public C0979c mo5520a(int i) {
        return null;
    }

    /* renamed from: b */
    public List<C0979c> mo5521b(String str, int i) {
        return null;
    }

    /* renamed from: c */
    public C0979c mo5522c(int i) {
        return null;
    }

    /* renamed from: d */
    public Object mo5523d() {
        return this.f4733a;
    }

    /* renamed from: e */
    public boolean mo5524e(int i, int i2, Bundle bundle) {
        return false;
    }
}
