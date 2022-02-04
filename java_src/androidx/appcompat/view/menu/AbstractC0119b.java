package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.AbstractC0145m;
import androidx.appcompat.view.menu.AbstractC0147n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
public abstract class AbstractC0119b implements AbstractC0145m {

    /* renamed from: b */
    protected Context f468b;

    /* renamed from: c */
    protected Context f469c;

    /* renamed from: d */
    protected C0130g f470d;

    /* renamed from: e */
    protected LayoutInflater f471e;

    /* renamed from: f */
    protected LayoutInflater f472f;

    /* renamed from: g */
    private AbstractC0145m.AbstractC0146a f473g;

    /* renamed from: h */
    private int f474h;

    /* renamed from: i */
    private int f475i;

    /* renamed from: j */
    protected AbstractC0147n f476j;

    /* renamed from: k */
    private int f477k;

    public AbstractC0119b(Context context, int i, int i2) {
        this.f468b = context;
        this.f471e = LayoutInflater.from(context);
        this.f474h = i;
        this.f475i = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo543a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f476j).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: b */
    public void mo544b(C0130g gVar, boolean z) {
        AbstractC0145m.AbstractC0146a aVar = this.f473g;
        if (aVar != null) {
            aVar.mo347b(gVar, z);
        }
    }

    /* renamed from: c */
    public abstract void mo545c(C0134i iVar, AbstractC0147n.AbstractC0148a aVar);

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: d */
    public int mo546d() {
        return this.f477k;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: g */
    public void mo547g(Context context, C0130g gVar) {
        this.f469c = context;
        this.f472f = LayoutInflater.from(context);
        this.f470d = gVar;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: i */
    public boolean mo548i(C0130g gVar, C0134i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: j */
    public boolean mo549j(C0130g gVar, C0134i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: k */
    public void mo550k(AbstractC0145m.AbstractC0146a aVar) {
        this.f473g = aVar;
    }

    /* renamed from: l */
    public AbstractC0147n.AbstractC0148a mo551l(ViewGroup viewGroup) {
        return (AbstractC0147n.AbstractC0148a) this.f471e.inflate(this.f475i, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo552m(androidx.appcompat.view.menu.SubMenuC0154r r2) {
        /*
            r1 = this;
            androidx.appcompat.view.menu.m$a r0 = r1.f473g
            if (r0 == 0) goto L_0x000e
            if (r2 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            androidx.appcompat.view.menu.g r2 = r1.f470d
        L_0x0009:
            boolean r2 = r0.mo348c(r2)
            return r2
        L_0x000e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.AbstractC0119b.mo552m(androidx.appcompat.view.menu.r):boolean");
    }

    @Override // androidx.appcompat.view.menu.AbstractC0145m
    /* renamed from: n */
    public void mo553n(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f476j;
        if (viewGroup != null) {
            C0130g gVar = this.f470d;
            int i = 0;
            if (gVar != null) {
                gVar.mo680t();
                ArrayList<C0134i> G = this.f470d.mo616G();
                int size = G.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0134i iVar = G.get(i3);
                    if (mo559t(i2, iVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0134i itemData = childAt instanceof AbstractC0147n.AbstractC0148a ? ((AbstractC0147n.AbstractC0148a) childAt).getItemData() : null;
                        View q = mo556q(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            q.setPressed(false);
                            q.jumpDrawablesToCurrentState();
                        }
                        if (q != childAt) {
                            mo543a(q, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo554o(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo554o(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: p */
    public AbstractC0145m.AbstractC0146a mo555p() {
        return this.f473g;
    }

    /* renamed from: q */
    public View mo556q(C0134i iVar, View view, ViewGroup viewGroup) {
        AbstractC0147n.AbstractC0148a l = view instanceof AbstractC0147n.AbstractC0148a ? (AbstractC0147n.AbstractC0148a) view : mo551l(viewGroup);
        mo545c(iVar, l);
        return (View) l;
    }

    /* renamed from: r */
    public AbstractC0147n mo557r(ViewGroup viewGroup) {
        if (this.f476j == null) {
            AbstractC0147n nVar = (AbstractC0147n) this.f471e.inflate(this.f474h, viewGroup, false);
            this.f476j = nVar;
            nVar.mo470b(this.f470d);
            mo553n(true);
        }
        return this.f476j;
    }

    /* renamed from: s */
    public void mo558s(int i) {
        this.f477k = i;
    }

    /* renamed from: t */
    public abstract boolean mo559t(int i, C0134i iVar);
}
