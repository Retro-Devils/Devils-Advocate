package p006b.p030g.p039k;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p006b.p030g.C0899b;
import p006b.p030g.p039k.p040b0.C0979c;
import p006b.p030g.p039k.p040b0.C0983d;

/* renamed from: b.g.k.a */
public class C0962a {

    /* renamed from: a */
    private static final View.AccessibilityDelegate f4659a = new View.AccessibilityDelegate();

    /* renamed from: b */
    private final View.AccessibilityDelegate f4660b;

    /* renamed from: c */
    private final View.AccessibilityDelegate f4661c;

    /* access modifiers changed from: package-private */
    /* renamed from: b.g.k.a$a */
    public static final class C0963a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C0962a f4662a;

        C0963a(C0962a aVar) {
            this.f4662a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f4662a.mo2468a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C0983d b = this.f4662a.mo4454b(view);
            if (b != null) {
                return (AccessibilityNodeProvider) b.mo5523d();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4662a.mo2361f(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C0979c B0 = C0979c.m5570B0(accessibilityNodeInfo);
            B0.mo5502s0(C1013s.m5740R(view));
            B0.mo5488k0(C1013s.m5735M(view));
            B0.mo5497p0(C1013s.m5775n(view));
            this.f4662a.mo2362g(view, B0);
            B0.mo5479f(accessibilityNodeInfo.getText(), view);
            List<C0979c.C0980a> c = C0962a.m5496c(view);
            for (int i = 0; i < c.size(); i++) {
                B0.mo5471b(c.get(i));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f4662a.mo4455h(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f4662a.mo2469i(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f4662a.mo2363j(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.f4662a.mo4456l(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f4662a.mo4457m(view, accessibilityEvent);
        }
    }

    public C0962a() {
        this(f4659a);
    }

    public C0962a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f4660b = accessibilityDelegate;
        this.f4661c = new C0963a(this);
    }

    /* renamed from: c */
    static List<C0979c.C0980a> m5496c(View view) {
        List<C0979c.C0980a> list = (List) view.getTag(C0899b.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m5497e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] q = C0979c.m5581q(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (q != null && i < q.length) {
                if (clickableSpan.equals(q[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m5498k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C0899b.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!m5497e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    /* renamed from: a */
    public boolean mo2468a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4660b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0983d mo4454b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f4660b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new C0983d(accessibilityNodeProvider);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public View.AccessibilityDelegate mo5400d() {
        return this.f4661c;
    }

    /* renamed from: f */
    public void mo2361f(View view, AccessibilityEvent accessibilityEvent) {
        this.f4660b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo2362g(View view, C0979c cVar) {
        this.f4660b.onInitializeAccessibilityNodeInfo(view, cVar.mo5448A0());
    }

    /* renamed from: h */
    public void mo4455h(View view, AccessibilityEvent accessibilityEvent) {
        this.f4660b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo2469i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4660b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo2363j(View view, int i, Bundle bundle) {
        List<C0979c.C0980a> c = m5496c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= c.size()) {
                break;
            }
            C0979c.C0980a aVar = c.get(i2);
            if (aVar.mo5515b() == i) {
                z = aVar.mo5517d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = this.f4660b.performAccessibilityAction(view, i, bundle);
        }
        return (z || i != C0899b.accessibility_action_clickable_span) ? z : m5498k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo4456l(View view, int i) {
        this.f4660b.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo4457m(View view, AccessibilityEvent accessibilityEvent) {
        this.f4660b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
