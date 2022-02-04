package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0129f;
import androidx.appcompat.view.menu.C0130g;
import androidx.appcompat.view.menu.C0134i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.k0 */
public class C0245k0 extends C0233i0 implements AbstractC0243j0 {

    /* renamed from: K */
    private static Method f1092K;

    /* renamed from: L */
    private AbstractC0243j0 f1093L;

    /* renamed from: androidx.appcompat.widget.k0$a */
    public static class C0246a extends C0219e0 {

        /* renamed from: p */
        final int f1094p;

        /* renamed from: q */
        final int f1095q;

        /* renamed from: r */
        private AbstractC0243j0 f1096r;

        /* renamed from: s */
        private MenuItem f1097s;

        public C0246a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1094p = 22;
                this.f1095q = 21;
                return;
            }
            this.f1094p = 21;
            this.f1095q = 22;
        }

        @Override // androidx.appcompat.widget.C0219e0
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo1392d(int i, int i2, int i3, int i4, int i5) {
            return super.mo1392d(i, i2, i3, i4, i5);
        }

        @Override // androidx.appcompat.widget.C0219e0
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo1395e(MotionEvent motionEvent, int i) {
            return super.mo1395e(motionEvent, i);
        }

        @Override // androidx.appcompat.widget.C0219e0
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.C0219e0
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.C0219e0
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.C0219e0
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.C0219e0
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f1096r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                C0129f fVar = (C0129f) adapter;
                C0134i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    iVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.f1097s;
                if (menuItem != iVar) {
                    C0130g b = fVar.mo603b();
                    if (menuItem != null) {
                        this.f1096r.mo587i(b, menuItem);
                    }
                    this.f1097s = iVar;
                    if (iVar != null) {
                        this.f1096r.mo586g(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1094p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1095q) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0129f) getAdapter()).mo603b().mo654e(false);
                return true;
            }
        }

        @Override // androidx.appcompat.widget.C0219e0
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(AbstractC0243j0 j0Var) {
            this.f1096r = j0Var;
        }

        @Override // android.widget.AbsListView, androidx.appcompat.widget.C0219e0
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1092K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0245k0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: R */
    public void mo1564R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1050J.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: S */
    public void mo1565S(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f1050J.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: T */
    public void mo1566T(AbstractC0243j0 j0Var) {
        this.f1093L = j0Var;
    }

    /* renamed from: U */
    public void mo1567U(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1092K;
            if (method != null) {
                try {
                    method.invoke(this.f1050J, Boolean.valueOf(z));
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f1050J.setTouchModal(z);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0243j0
    /* renamed from: g */
    public void mo586g(C0130g gVar, MenuItem menuItem) {
        AbstractC0243j0 j0Var = this.f1093L;
        if (j0Var != null) {
            j0Var.mo586g(gVar, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.AbstractC0243j0
    /* renamed from: i */
    public void mo587i(C0130g gVar, MenuItem menuItem) {
        AbstractC0243j0 j0Var = this.f1093L;
        if (j0Var != null) {
            j0Var.mo587i(gVar, menuItem);
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.appcompat.widget.C0233i0
    /* renamed from: s */
    public C0219e0 mo1529s(Context context, boolean z) {
        C0246a aVar = new C0246a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }
}
