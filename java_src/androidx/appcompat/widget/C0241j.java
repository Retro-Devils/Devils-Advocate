package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0254m0;
import p006b.p007a.C0754a;
import p006b.p007a.C0756c;
import p006b.p007a.C0758e;
import p006b.p007a.p008k.p009a.C0764a;
import p006b.p030g.p031d.C0901a;

/* renamed from: androidx.appcompat.widget.j */
public final class C0241j {

    /* renamed from: a */
    private static final PorterDuff.Mode f1080a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0241j f1081b;

    /* renamed from: c */
    private C0254m0 f1082c;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.j$a */
    public class C0242a implements C0254m0.AbstractC0259e {

        /* renamed from: a */
        private final int[] f1083a = {C0758e.abc_textfield_search_default_mtrl_alpha, C0758e.abc_textfield_default_mtrl_alpha, C0758e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f1084b = {C0758e.abc_ic_commit_search_api_mtrl_alpha, C0758e.abc_seekbar_tick_mark_material, C0758e.abc_ic_menu_share_mtrl_alpha, C0758e.abc_ic_menu_copy_mtrl_am_alpha, C0758e.abc_ic_menu_cut_mtrl_alpha, C0758e.abc_ic_menu_selectall_mtrl_alpha, C0758e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f1085c = {C0758e.abc_textfield_activated_mtrl_alpha, C0758e.abc_textfield_search_activated_mtrl_alpha, C0758e.f3576k, C0758e.abc_text_cursor_material, C0758e.abc_text_select_handle_left_mtrl_dark, C0758e.abc_text_select_handle_middle_mtrl_dark, C0758e.abc_text_select_handle_right_mtrl_dark, C0758e.f3573K, C0758e.f3574M, C0758e.f3575O};

        /* renamed from: d */
        private final int[] f1086d = {C0758e.abc_popup_background_mtrl_mult, C0758e.abc_cab_background_internal_bg, C0758e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f1087e = {C0758e.abc_tab_indicator_material, C0758e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f1088f = {C0758e.abc_btn_check_material, C0758e.abc_btn_radio_material, C0758e.abc_btn_check_material_anim, C0758e.abc_btn_radio_material_anim};

        C0242a() {
        }

        /* renamed from: f */
        private boolean m1251f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m1252g(Context context) {
            return m1253h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m1253h(Context context, int i) {
            int c = C0275r0.m1376c(context, C0754a.f3571v);
            int b = C0275r0.m1375b(context, C0754a.colorButtonNormal);
            return new ColorStateList(new int[][]{C0275r0.f1181b, C0275r0.f1184e, C0275r0.f1182c, C0275r0.f1188i}, new int[]{b, C0901a.m5297e(c, i), C0901a.m5297e(c, i), i});
        }

        /* renamed from: i */
        private ColorStateList m1254i(Context context) {
            return m1253h(context, C0275r0.m1376c(context, C0754a.colorAccent));
        }

        /* renamed from: j */
        private ColorStateList m1255j(Context context) {
            return m1253h(context, C0275r0.m1376c(context, C0754a.colorButtonNormal));
        }

        /* renamed from: k */
        private ColorStateList m1256k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = C0754a.colorSwitchThumbNormal;
            ColorStateList e = C0275r0.m1378e(context, i);
            if (e == null || !e.isStateful()) {
                iArr[0] = C0275r0.f1181b;
                iArr2[0] = C0275r0.m1375b(context, i);
                iArr[1] = C0275r0.f1185f;
                iArr2[1] = C0275r0.m1376c(context, C0754a.f3570u);
                iArr[2] = C0275r0.f1188i;
                iArr2[2] = C0275r0.m1376c(context, i);
            } else {
                iArr[0] = C0275r0.f1181b;
                iArr2[0] = e.getColorForState(iArr[0], 0);
                iArr[1] = C0275r0.f1185f;
                iArr2[1] = C0275r0.m1376c(context, C0754a.f3570u);
                iArr[2] = C0275r0.f1188i;
                iArr2[2] = e.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private void m1257l(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0216d0.m1134a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0241j.f1080a;
            }
            drawable.setColorFilter(C0241j.m1244e(i, mode));
        }

        @Override // androidx.appcompat.widget.C0254m0.AbstractC0259e
        /* renamed from: a */
        public Drawable mo1550a(C0254m0 m0Var, Context context, int i) {
            if (i != C0758e.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{m0Var.mo1589j(context, C0758e.abc_cab_background_internal_bg), m0Var.mo1589j(context, C0758e.f3576k)});
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.C0254m0.AbstractC0259e
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1551b(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0241j.m1242a()
                int[] r1 = r6.f1083a
                boolean r1 = r6.m1251f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = p006b.p007a.C0754a.colorControlNormal
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f1085c
                boolean r1 = r6.m1251f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = p006b.p007a.C0754a.f3570u
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f1086d
                boolean r1 = r6.m1251f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = p006b.p007a.C0758e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = p006b.p007a.C0758e.abc_dialog_material_background
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.C0216d0.m1134a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.C0275r0.m1376c(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0241j.m1244e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0241j.C0242a.mo1551b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.C0254m0.AbstractC0259e
        /* renamed from: c */
        public ColorStateList mo1552c(Context context, int i) {
            if (i == C0758e.abc_edit_text_material) {
                return C0764a.m4516c(context, C0756c.abc_tint_edittext);
            }
            if (i == C0758e.abc_switch_track_mtrl_alpha) {
                return C0764a.m4516c(context, C0756c.abc_tint_switch_track);
            }
            if (i == C0758e.abc_switch_thumb_material) {
                return m1256k(context);
            }
            if (i == C0758e.abc_btn_default_mtrl_shape) {
                return m1255j(context);
            }
            if (i == C0758e.abc_btn_borderless_material) {
                return m1252g(context);
            }
            if (i == C0758e.abc_btn_colored_material) {
                return m1254i(context);
            }
            if (i == C0758e.abc_spinner_mtrl_am_alpha || i == C0758e.abc_spinner_textfield_background_material) {
                return C0764a.m4516c(context, C0756c.abc_tint_spinner);
            }
            if (m1251f(this.f1084b, i)) {
                return C0275r0.m1378e(context, C0754a.colorControlNormal);
            }
            if (m1251f(this.f1087e, i)) {
                return C0764a.m4516c(context, C0756c.abc_tint_default);
            }
            if (m1251f(this.f1088f, i)) {
                return C0764a.m4516c(context, C0756c.abc_tint_btn_checkable);
            }
            if (i == C0758e.abc_seekbar_thumb_material) {
                return C0764a.m4516c(context, C0756c.abc_tint_seek_thumb);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C0254m0.AbstractC0259e
        /* renamed from: d */
        public boolean mo1553d(Context context, int i, Drawable drawable) {
            Drawable findDrawableByLayerId;
            int c;
            if (i == C0758e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i2 = C0754a.colorControlNormal;
                m1257l(findDrawableByLayerId2, C0275r0.m1376c(context, i2), C0241j.f1080a);
                m1257l(layerDrawable.findDrawableByLayerId(16908303), C0275r0.m1376c(context, i2), C0241j.f1080a);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                c = C0275r0.m1376c(context, C0754a.f3570u);
            } else if (i != C0758e.abc_ratingbar_material && i != C0758e.abc_ratingbar_indicator_material && i != C0758e.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m1257l(layerDrawable2.findDrawableByLayerId(16908288), C0275r0.m1375b(context, C0754a.colorControlNormal), C0241j.f1080a);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i3 = C0754a.f3570u;
                m1257l(findDrawableByLayerId3, C0275r0.m1376c(context, i3), C0241j.f1080a);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                c = C0275r0.m1376c(context, i3);
            }
            m1257l(findDrawableByLayerId, c, C0241j.f1080a);
            return true;
        }

        @Override // androidx.appcompat.widget.C0254m0.AbstractC0259e
        /* renamed from: e */
        public PorterDuff.Mode mo1554e(int i) {
            if (i == C0758e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }
    }

    /* renamed from: b */
    public static synchronized C0241j m1243b() {
        C0241j jVar;
        synchronized (C0241j.class) {
            if (f1081b == null) {
                m1245h();
            }
            jVar = f1081b;
        }
        return jVar;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m1244e(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter l;
        synchronized (C0241j.class) {
            l = C0254m0.m1291l(i, mode);
        }
        return l;
    }

    /* renamed from: h */
    public static synchronized void m1245h() {
        synchronized (C0241j.class) {
            if (f1081b == null) {
                C0241j jVar = new C0241j();
                f1081b = jVar;
                jVar.f1082c = C0254m0.m1289h();
                f1081b.f1082c.mo1595u(new C0242a());
            }
        }
    }

    /* renamed from: i */
    static void m1246i(Drawable drawable, C0281u0 u0Var, int[] iArr) {
        C0254m0.m1297w(drawable, u0Var, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable mo1546c(Context context, int i) {
        return this.f1082c.mo1589j(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized Drawable mo1547d(Context context, int i, boolean z) {
        return this.f1082c.mo1590k(context, i, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public synchronized ColorStateList mo1548f(Context context, int i) {
        return this.f1082c.mo1591m(context, i);
    }

    /* renamed from: g */
    public synchronized void mo1549g(Context context) {
        this.f1082c.mo1593s(context);
    }
}
