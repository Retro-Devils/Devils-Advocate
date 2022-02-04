package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0378a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p006b.p030g.p032e.p033a.AbstractMenuC0917a;
import p006b.p030g.p039k.C1025t;

/* renamed from: androidx.appcompat.view.menu.g */
public class C0130g implements AbstractMenuC0917a {

    /* renamed from: a */
    private static final int[] f536a = {1, 4, 5, 3, 2, 0};

    /* renamed from: A */
    private boolean f537A;

    /* renamed from: b */
    private final Context f538b;

    /* renamed from: c */
    private final Resources f539c;

    /* renamed from: d */
    private boolean f540d;

    /* renamed from: e */
    private boolean f541e;

    /* renamed from: f */
    private AbstractC0131a f542f;

    /* renamed from: g */
    private ArrayList<C0134i> f543g;

    /* renamed from: h */
    private ArrayList<C0134i> f544h;

    /* renamed from: i */
    private boolean f545i;

    /* renamed from: j */
    private ArrayList<C0134i> f546j;

    /* renamed from: k */
    private ArrayList<C0134i> f547k;

    /* renamed from: l */
    private boolean f548l;

    /* renamed from: m */
    private int f549m = 0;

    /* renamed from: n */
    private ContextMenu.ContextMenuInfo f550n;

    /* renamed from: o */
    CharSequence f551o;

    /* renamed from: p */
    Drawable f552p;

    /* renamed from: q */
    View f553q;

    /* renamed from: r */
    private boolean f554r = false;

    /* renamed from: s */
    private boolean f555s = false;

    /* renamed from: t */
    private boolean f556t = false;

    /* renamed from: u */
    private boolean f557u = false;

    /* renamed from: v */
    private boolean f558v = false;

    /* renamed from: w */
    private ArrayList<C0134i> f559w = new ArrayList<>();

    /* renamed from: x */
    private CopyOnWriteArrayList<WeakReference<AbstractC0145m>> f560x = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private C0134i f561y;

    /* renamed from: z */
    private boolean f562z = false;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    public interface AbstractC0131a {
        /* renamed from: a */
        boolean mo320a(C0130g gVar, MenuItem menuItem);

        /* renamed from: b */
        void mo322b(C0130g gVar);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    public interface AbstractC0132b {
        /* renamed from: a */
        boolean mo469a(C0134i iVar);
    }

    public C0130g(Context context) {
        this.f538b = context;
        this.f539c = context.getResources();
        this.f543g = new ArrayList<>();
        this.f544h = new ArrayList<>();
        this.f545i = true;
        this.f546j = new ArrayList<>();
        this.f547k = new ArrayList<>();
        this.f548l = true;
        m646f0(true);
    }

    /* renamed from: D */
    private static int m643D(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f536a;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: P */
    private void m644P(int i, boolean z) {
        if (i >= 0 && i < this.f543g.size()) {
            this.f543g.remove(i);
            if (z) {
                mo622M(true);
            }
        }
    }

    /* renamed from: a0 */
    private void m645a0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources E = mo614E();
        if (view != null) {
            this.f553q = view;
            this.f551o = null;
            this.f552p = null;
        } else {
            if (i > 0) {
                this.f551o = E.getText(i);
            } else if (charSequence != null) {
                this.f551o = charSequence;
            }
            if (i2 > 0) {
                this.f552p = C0378a.m1874d(mo683w(), i2);
            } else if (drawable != null) {
                this.f552p = drawable;
            }
            this.f553q = null;
        }
        mo622M(false);
    }

    /* renamed from: f0 */
    private void m646f0(boolean z) {
        boolean z2 = true;
        if (!z || this.f539c.getConfiguration().keyboard == 1 || !C1025t.m5844e(ViewConfiguration.get(this.f538b), this.f538b)) {
            z2 = false;
        }
        this.f541e = z2;
    }

    /* renamed from: g */
    private C0134i m647g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0134i(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m648i(boolean z) {
        if (!this.f560x.isEmpty()) {
            mo661h0();
            Iterator<WeakReference<AbstractC0145m>> it = this.f560x.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0145m> next = it.next();
                AbstractC0145m mVar = next.get();
                if (mVar == null) {
                    this.f560x.remove(next);
                } else {
                    mVar.mo553n(z);
                }
            }
            mo658g0();
        }
    }

    /* renamed from: j */
    private void m649j(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f560x.isEmpty()) {
            Iterator<WeakReference<AbstractC0145m>> it = this.f560x.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0145m> next = it.next();
                AbstractC0145m mVar = next.get();
                if (mVar == null) {
                    this.f560x.remove(next);
                } else {
                    int d = mVar.mo546d();
                    if (d > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(d)) != null) {
                        mVar.mo570h(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: k */
    private void m650k(Bundle bundle) {
        Parcelable f;
        if (!this.f560x.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<AbstractC0145m>> it = this.f560x.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0145m> next = it.next();
                AbstractC0145m mVar = next.get();
                if (mVar == null) {
                    this.f560x.remove(next);
                } else {
                    int d = mVar.mo546d();
                    if (d > 0 && (f = mVar.mo569f()) != null) {
                        sparseArray.put(d, f);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: l */
    private boolean m651l(SubMenuC0154r rVar, AbstractC0145m mVar) {
        boolean z = false;
        if (this.f560x.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z = mVar.mo552m(rVar);
        }
        Iterator<WeakReference<AbstractC0145m>> it = this.f560x.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0145m> next = it.next();
            AbstractC0145m mVar2 = next.get();
            if (mVar2 == null) {
                this.f560x.remove(next);
            } else if (!z) {
                z = mVar2.mo552m(rVar);
            }
        }
        return z;
    }

    /* renamed from: p */
    private static int m652p(ArrayList<C0134i> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo695f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* renamed from: A */
    public View mo611A() {
        return this.f553q;
    }

    /* renamed from: B */
    public ArrayList<C0134i> mo612B() {
        mo680t();
        return this.f547k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean mo613C() {
        return this.f557u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public Resources mo614E() {
        return this.f539c;
    }

    /* renamed from: F */
    public C0130g mo615F() {
        return this;
    }

    /* renamed from: G */
    public ArrayList<C0134i> mo616G() {
        if (!this.f545i) {
            return this.f544h;
        }
        this.f544h.clear();
        int size = this.f543g.size();
        for (int i = 0; i < size; i++) {
            C0134i iVar = this.f543g.get(i);
            if (iVar.isVisible()) {
                this.f544h.add(iVar);
            }
        }
        this.f545i = false;
        this.f548l = true;
        return this.f544h;
    }

    /* renamed from: H */
    public boolean mo617H() {
        return this.f562z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo618I() {
        return this.f540d;
    }

    /* renamed from: J */
    public boolean mo619J() {
        return this.f541e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo620K(C0134i iVar) {
        this.f548l = true;
        mo622M(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo621L(C0134i iVar) {
        this.f545i = true;
        mo622M(true);
    }

    /* renamed from: M */
    public void mo622M(boolean z) {
        if (!this.f554r) {
            if (z) {
                this.f545i = true;
                this.f548l = true;
            }
            m648i(z);
            return;
        }
        this.f555s = true;
        if (z) {
            this.f556t = true;
        }
    }

    /* renamed from: N */
    public boolean mo623N(MenuItem menuItem, int i) {
        return mo624O(menuItem, null, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo624O(android.view.MenuItem r7, androidx.appcompat.view.menu.AbstractC0145m r8, int r9) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0130g.mo624O(android.view.MenuItem, androidx.appcompat.view.menu.m, int):boolean");
    }

    /* renamed from: Q */
    public void mo625Q(AbstractC0145m mVar) {
        Iterator<WeakReference<AbstractC0145m>> it = this.f560x.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0145m> next = it.next();
            AbstractC0145m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f560x.remove(next);
            }
        }
    }

    /* renamed from: R */
    public void mo626R(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo682v());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuC0154r) item.getSubMenu()).mo626R(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* renamed from: S */
    public void mo627S(Bundle bundle) {
        m649j(bundle);
    }

    /* renamed from: T */
    public void mo628T(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0154r) item.getSubMenu()).mo628T(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo682v(), sparseArray);
        }
    }

    /* renamed from: U */
    public void mo629U(Bundle bundle) {
        m650k(bundle);
    }

    /* renamed from: V */
    public void mo630V(AbstractC0131a aVar) {
        this.f542f = aVar;
    }

    /* renamed from: W */
    public C0130g mo631W(int i) {
        this.f549m = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo632X(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f543g.size();
        mo661h0();
        for (int i = 0; i < size; i++) {
            C0134i iVar = this.f543g.get(i);
            if (iVar.getGroupId() == groupId && iVar.mo719m() && iVar.isCheckable()) {
                iVar.mo725s(iVar == menuItem);
            }
        }
        mo658g0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public C0130g mo633Y(int i) {
        m645a0(0, null, i, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public C0130g mo634Z(Drawable drawable) {
        m645a0(0, null, 0, drawable, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo635a(int i, int i2, int i3, CharSequence charSequence) {
        int D = m643D(i3);
        C0134i g = m647g(i, i2, i3, D, charSequence, this.f549m);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f550n;
        if (contextMenuInfo != null) {
            g.mo745v(contextMenuInfo);
        }
        ArrayList<C0134i> arrayList = this.f543g;
        arrayList.add(m652p(arrayList, D), g);
        mo622M(true);
        return g;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return mo635a(0, 0, 0, this.f539c.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo635a(i, i2, i3, this.f539c.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo635a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo635a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f538b.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f539c.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f539c.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0134i iVar = (C0134i) mo635a(i, i2, i3, charSequence);
        SubMenuC0154r rVar = new SubMenuC0154r(this.f538b, this, iVar);
        iVar.mo747x(rVar);
        return rVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo645b(AbstractC0145m mVar) {
        mo647c(mVar, this.f538b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public C0130g mo646b0(int i) {
        m645a0(i, null, 0, null, null);
        return this;
    }

    /* renamed from: c */
    public void mo647c(AbstractC0145m mVar, Context context) {
        this.f560x.add(new WeakReference<>(mVar));
        mVar.mo547g(context, this);
        this.f548l = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c0 */
    public C0130g mo648c0(CharSequence charSequence) {
        m645a0(0, charSequence, 0, null, null);
        return this;
    }

    public void clear() {
        C0134i iVar = this.f561y;
        if (iVar != null) {
            mo656f(iVar);
        }
        this.f543g.clear();
        mo622M(true);
    }

    public void clearHeader() {
        this.f552p = null;
        this.f551o = null;
        this.f553q = null;
        mo622M(false);
    }

    public void close() {
        mo654e(true);
    }

    /* renamed from: d */
    public void mo652d() {
        AbstractC0131a aVar = this.f542f;
        if (aVar != null) {
            aVar.mo322b(this);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public C0130g mo653d0(View view) {
        m645a0(0, null, 0, null, view);
        return this;
    }

    /* renamed from: e */
    public final void mo654e(boolean z) {
        if (!this.f558v) {
            this.f558v = true;
            Iterator<WeakReference<AbstractC0145m>> it = this.f560x.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0145m> next = it.next();
                AbstractC0145m mVar = next.get();
                if (mVar == null) {
                    this.f560x.remove(next);
                } else {
                    mVar.mo544b(this, z);
                }
            }
            this.f558v = false;
        }
    }

    /* renamed from: e0 */
    public void mo655e0(boolean z) {
        this.f537A = z;
    }

    /* renamed from: f */
    public boolean mo656f(C0134i iVar) {
        boolean z = false;
        if (!this.f560x.isEmpty() && this.f561y == iVar) {
            mo661h0();
            Iterator<WeakReference<AbstractC0145m>> it = this.f560x.iterator();
            while (it.hasNext()) {
                WeakReference<AbstractC0145m> next = it.next();
                AbstractC0145m mVar = next.get();
                if (mVar == null) {
                    this.f560x.remove(next);
                } else {
                    z = mVar.mo548i(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo658g0();
            if (z) {
                this.f561y = null;
            }
        }
        return z;
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0134i iVar = this.f543g.get(i2);
            if (iVar.getItemId() == i) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g0 */
    public void mo658g0() {
        this.f554r = false;
        if (this.f555s) {
            this.f555s = false;
            mo622M(this.f556t);
        }
    }

    public MenuItem getItem(int i) {
        return this.f543g.get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo660h(C0130g gVar, MenuItem menuItem) {
        AbstractC0131a aVar = this.f542f;
        return aVar != null && aVar.mo320a(gVar, menuItem);
    }

    /* renamed from: h0 */
    public void mo661h0() {
        if (!this.f554r) {
            this.f554r = true;
            this.f555s = false;
            this.f556t = false;
        }
    }

    public boolean hasVisibleItems() {
        if (this.f537A) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f543g.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo670r(i, keyEvent) != null;
    }

    /* renamed from: m */
    public boolean mo664m(C0134i iVar) {
        boolean z = false;
        if (this.f560x.isEmpty()) {
            return false;
        }
        mo661h0();
        Iterator<WeakReference<AbstractC0145m>> it = this.f560x.iterator();
        while (it.hasNext()) {
            WeakReference<AbstractC0145m> next = it.next();
            AbstractC0145m mVar = next.get();
            if (mVar == null) {
                this.f560x.remove(next);
            } else {
                z = mVar.mo549j(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        mo658g0();
        if (z) {
            this.f561y = iVar;
        }
        return z;
    }

    /* renamed from: n */
    public int mo665n(int i) {
        return mo666o(i, 0);
    }

    /* renamed from: o */
    public int mo666o(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f543g.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo623N(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0134i r = mo670r(i, keyEvent);
        boolean N = r != null ? mo623N(r, i2) : false;
        if ((i2 & 2) != 0) {
            mo654e(true);
        }
        return N;
    }

    /* renamed from: q */
    public int mo669q(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f543g.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C0134i mo670r(int i, KeyEvent keyEvent) {
        ArrayList<C0134i> arrayList = this.f559w;
        arrayList.clear();
        mo673s(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean I = mo618I();
        for (int i2 = 0; i2 < size; i2++) {
            C0134i iVar = arrayList.get(i2);
            char alphabeticShortcut = I ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (I && alphabeticShortcut == '\b' && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public void removeGroup(int i) {
        int n = mo665n(i);
        if (n >= 0) {
            int size = this.f543g.size() - n;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f543g.get(n).getGroupId() != i) {
                    mo622M(true);
                } else {
                    m644P(n, false);
                    i2 = i3;
                }
            }
            mo622M(true);
        }
    }

    public void removeItem(int i) {
        m644P(mo669q(i), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo673s(List<C0134i> list, int i, KeyEvent keyEvent) {
        boolean I = mo618I();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f543g.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0134i iVar = this.f543g.get(i2);
                if (iVar.hasSubMenu()) {
                    ((C0130g) iVar.getSubMenu()).mo673s(list, i, keyEvent);
                }
                char alphabeticShortcut = I ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((I ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (I && alphabeticShortcut == '\b' && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f543g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0134i iVar = this.f543g.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.mo742t(z2);
                iVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f562z = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f543g.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0134i iVar = this.f543g.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f543g.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0134i iVar = this.f543g.get(i2);
            if (iVar.getGroupId() == i && iVar.mo748y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo622M(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f540d = z;
        mo622M(false);
    }

    public int size() {
        return this.f543g.size();
    }

    /* renamed from: t */
    public void mo680t() {
        ArrayList<C0134i> G = mo616G();
        if (this.f548l) {
            Iterator<WeakReference<AbstractC0145m>> it = this.f560x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<AbstractC0145m> next = it.next();
                AbstractC0145m mVar = next.get();
                if (mVar == null) {
                    this.f560x.remove(next);
                } else {
                    z |= mVar.mo568e();
                }
            }
            if (z) {
                this.f546j.clear();
                this.f547k.clear();
                int size = G.size();
                for (int i = 0; i < size; i++) {
                    C0134i iVar = G.get(i);
                    (iVar.mo718l() ? this.f546j : this.f547k).add(iVar);
                }
            } else {
                this.f546j.clear();
                this.f547k.clear();
                this.f547k.addAll(mo616G());
            }
            this.f548l = false;
        }
    }

    /* renamed from: u */
    public ArrayList<C0134i> mo681u() {
        mo680t();
        return this.f546j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public String mo682v() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: w */
    public Context mo683w() {
        return this.f538b;
    }

    /* renamed from: x */
    public C0134i mo684x() {
        return this.f561y;
    }

    /* renamed from: y */
    public Drawable mo685y() {
        return this.f552p;
    }

    /* renamed from: z */
    public CharSequence mo686z() {
        return this.f551o;
    }
}
