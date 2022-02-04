package p069c.p073b.p074a.p108c.p109a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p069c.p073b.p074a.p108c.p109a.AbstractC1480c;
import p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1493a;
import p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1496d;
import p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1523p;
import p069c.p073b.p074a.p108c.p109a.p110f.C1494b;
import p069c.p073b.p074a.p108c.p109a.p110f.C1511k;
import p069c.p073b.p074a.p108c.p109a.p110f.C1521o;
import p069c.p073b.p074a.p108c.p109a.p110f.C1530s;
import p069c.p073b.p074a.p108c.p109a.p110f.C1533u;

/* renamed from: c.b.a.c.a.e */
public final class C1488e extends ViewGroup implements AbstractC1480c.AbstractC1484d {

    /* renamed from: b */
    private final ViewTreeObserver$OnGlobalFocusChangeListenerC1491c f6278b;

    /* renamed from: c */
    private final Set<View> f6279c;

    /* renamed from: d */
    private final AbstractC1492d f6280d;

    /* renamed from: e */
    private AbstractC1496d f6281e;

    /* renamed from: f */
    private C1521o f6282f;

    /* renamed from: g */
    private View f6283g;

    /* renamed from: h */
    private C1511k f6284h;

    /* renamed from: i */
    private AbstractC1480c.AbstractC1484d f6285i;

    /* renamed from: j */
    private Bundle f6286j;

    /* renamed from: k */
    private AbstractC1480c.AbstractC1482b f6287k;

    /* renamed from: l */
    private boolean f6288l;

    /* renamed from: m */
    private boolean f6289m;

    /* renamed from: c.b.a.c.a.e$a */
    class C1489a implements AbstractC1523p.AbstractC1524a {

        /* renamed from: a */
        final /* synthetic */ Activity f6290a;

        C1489a(Activity activity) {
            this.f6290a = activity;
        }

        @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1523p.AbstractC1524a
        /* renamed from: a */
        public final void mo6741a() {
            if (C1488e.this.f6281e != null) {
                C1488e.m7346f(C1488e.this, this.f6290a);
            }
            C1488e.this.f6281e = null;
        }

        @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1523p.AbstractC1524a
        /* renamed from: c */
        public final void mo6742c() {
            if (!C1488e.this.f6289m && C1488e.this.f6282f != null) {
                C1488e.this.f6282f.mo6820s();
            }
            C1488e.this.f6284h.mo6785a();
            C1488e eVar = C1488e.this;
            if (eVar.indexOfChild(eVar.f6284h) < 0) {
                C1488e eVar2 = C1488e.this;
                eVar2.addView(eVar2.f6284h);
                C1488e eVar3 = C1488e.this;
                eVar3.removeView(eVar3.f6283g);
            }
            C1488e.this.f6283g = null;
            C1488e.this.f6282f = null;
            C1488e.this.f6281e = null;
        }
    }

    /* renamed from: c.b.a.c.a.e$b */
    class C1490b implements AbstractC1523p.AbstractC1525b {
        C1490b() {
        }

        @Override // p069c.p073b.p074a.p108c.p109a.p110f.AbstractC1523p.AbstractC1525b
        /* renamed from: a */
        public final void mo6743a(EnumC1479b bVar) {
            C1488e.this.m7345e(bVar);
            C1488e.this.f6281e = null;
        }
    }

    /* renamed from: c.b.a.c.a.e$c */
    private final class ViewTreeObserver$OnGlobalFocusChangeListenerC1491c implements ViewTreeObserver.OnGlobalFocusChangeListener {
        private ViewTreeObserver$OnGlobalFocusChangeListenerC1491c() {
        }

        /* synthetic */ ViewTreeObserver$OnGlobalFocusChangeListenerC1491c(C1488e eVar, byte b) {
            this();
        }

        public final void onGlobalFocusChanged(View view, View view2) {
            if (C1488e.this.f6282f != null && C1488e.this.f6279c.contains(view2) && !C1488e.this.f6279c.contains(view)) {
                C1488e.this.f6282f.mo6821t();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c.b.a.c.a.e$d */
    public interface AbstractC1492d {
        /* renamed from: a */
        void mo6712a(C1488e eVar);
    }

    C1488e(Context context, AttributeSet attributeSet, int i, AbstractC1492d dVar) {
        super((Context) C1494b.m7374b(context, "context cannot be null"), attributeSet, i);
        this.f6280d = (AbstractC1492d) C1494b.m7374b(dVar, "listener cannot be null");
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        setClipToPadding(false);
        C1511k kVar = new C1511k(context);
        this.f6284h = kVar;
        requestTransparentRegion(kVar);
        addView(this.f6284h);
        this.f6279c = new HashSet();
        this.f6278b = new ViewTreeObserver$OnGlobalFocusChangeListenerC1491c(this, (byte) 0);
    }

    /* renamed from: d */
    private void m7344d(View view) {
        if (!(view == this.f6284h || (this.f6282f != null && view == this.f6283g))) {
            throw new UnsupportedOperationException("No views can be added on top of the player");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private void m7345e(EnumC1479b bVar) {
        this.f6282f = null;
        this.f6284h.mo6787c();
        AbstractC1480c.AbstractC1482b bVar2 = this.f6287k;
        if (bVar2 != null) {
            bVar2.mo6703a(this.f6285i, bVar);
            this.f6287k = null;
        }
    }

    /* renamed from: f */
    static /* synthetic */ void m7346f(C1488e eVar, Activity activity) {
        try {
            C1521o oVar = new C1521o(eVar.f6281e, AbstractC1493a.m7369a().mo6746c(activity, eVar.f6281e, eVar.f6288l));
            eVar.f6282f = oVar;
            View g = oVar.mo6808g();
            eVar.f6283g = g;
            eVar.addView(g);
            eVar.removeView(eVar.f6284h);
            eVar.f6280d.mo6712a(eVar);
            if (eVar.f6287k != null) {
                boolean z = false;
                Bundle bundle = eVar.f6286j;
                if (bundle != null) {
                    z = eVar.f6282f.mo6812k(bundle);
                    eVar.f6286j = null;
                }
                eVar.f6287k.mo6704b(eVar.f6285i, eVar.f6282f, z);
                eVar.f6287k = null;
            }
        } catch (C1530s.C1531a e) {
            C1533u.m7513a("Error creating YouTubePlayerView", e);
            eVar.m7345e(EnumC1479b.INTERNAL_ERROR);
        }
    }

    @Override // android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i) {
        ArrayList<View> arrayList2 = new ArrayList<>();
        super.addFocusables(arrayList2, i);
        arrayList.addAll(arrayList2);
        this.f6279c.clear();
        this.f6279c.addAll(arrayList2);
    }

    @Override // android.view.View, android.view.ViewGroup
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        ArrayList<View> arrayList2 = new ArrayList<>();
        super.addFocusables(arrayList2, i, i2);
        arrayList.addAll(arrayList2);
        this.f6279c.clear();
        this.f6279c.addAll(arrayList2);
    }

    public final void addView(View view) {
        m7344d(view);
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        m7344d(view);
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        m7344d(view);
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m7344d(view);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m7344d(view);
        super.addView(view, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo6720b() {
        C1521o oVar = this.f6282f;
        if (oVar != null) {
            oVar.mo6813l();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo6721c(Activity activity, AbstractC1480c.AbstractC1484d dVar, String str, AbstractC1480c.AbstractC1482b bVar, Bundle bundle) {
        if (this.f6282f == null && this.f6287k == null) {
            C1494b.m7374b(activity, "activity cannot be null");
            this.f6285i = (AbstractC1480c.AbstractC1484d) C1494b.m7374b(dVar, "provider cannot be null");
            this.f6287k = (AbstractC1480c.AbstractC1482b) C1494b.m7374b(bVar, "listener cannot be null");
            this.f6286j = bundle;
            this.f6284h.mo6786b();
            AbstractC1496d b = AbstractC1493a.m7369a().mo6745b(getContext(), str, new C1489a(activity), new C1490b());
            this.f6281e = b;
            b.mo6794c();
        }
    }

    public final void clearChildFocus(View view) {
        if (hasFocusable()) {
            requestFocus();
        } else {
            super.clearChildFocus(view);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f6282f != null) {
            if (keyEvent.getAction() == 0) {
                return this.f6282f.mo6811j(keyEvent.getKeyCode(), keyEvent) || super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 1) {
                return this.f6282f.mo6815n(keyEvent.getKeyCode(), keyEvent) || super.dispatchKeyEvent(keyEvent);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void focusableViewAvailable(View view) {
        super.focusableViewAvailable(view);
        this.f6279c.add(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo6725h(boolean z) {
        if (!z || Build.VERSION.SDK_INT >= 14) {
            this.f6288l = z;
            return;
        }
        C1533u.m7514b("Could not enable TextureView because API level is lower than 14", new Object[0]);
        this.f6288l = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo6726j() {
        C1521o oVar = this.f6282f;
        if (oVar != null) {
            oVar.mo6816o();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo6727k(boolean z) {
        C1521o oVar = this.f6282f;
        if (oVar != null) {
            oVar.mo6814m(z);
            mo6729m(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo6728l() {
        C1521o oVar = this.f6282f;
        if (oVar != null) {
            oVar.mo6818q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo6729m(boolean z) {
        this.f6289m = true;
        C1521o oVar = this.f6282f;
        if (oVar != null) {
            oVar.mo6810i(z);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.f6278b);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1521o oVar = this.f6282f;
        if (oVar != null) {
            oVar.mo6809h(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f6278b);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() > 0) {
            getChildAt(0).layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.measure(i, i2);
            setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo6736p() {
        C1521o oVar = this.f6282f;
        if (oVar != null) {
            oVar.mo6819r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final Bundle mo6737q() {
        C1521o oVar = this.f6282f;
        return oVar == null ? this.f6286j : oVar.mo6822u();
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f6279c.add(view2);
    }

    public final void setClipToPadding(boolean z) {
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }
}
