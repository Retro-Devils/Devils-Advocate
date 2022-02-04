package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import androidx.fragment.app.ActivityC0447d;
import com.digdroid.alman.dig.C2326g2;
import com.digdroid.alman.dig.C2553q3;
import java.util.ArrayList;

/* renamed from: com.digdroid.alman.dig.s */
public class C2690s extends AbstractC2531p1 {

    /* renamed from: n0 */
    public static final int[] f9190n0 = {R.string.name, R.string.custom_media, R.string.zoom, R.string.custom_time, R.string.custom_sound, R.string.toolbar_icons, R.string.item_icons, R.string.system_backgrounds, R.string.toolbar_text_color, R.string.background, R.string.cover_background, R.string.text1, R.string.text2, R.string.text3, R.string.gradient, R.string.default_covers, R.string.system_audio, R.string.foreground_image, R.string.play_button};

    /* renamed from: o0 */
    public static final String[] f9191o0 = {"name", "media", "zoom", "image_time", "sound", "tool_icons", "icons", "system_backgrounds", "toolbar_text", "background", "cover_background", "text1", "text2", "text3", "gradient", "default_covers", "system_audio", "foreground", "play_button"};

    /* renamed from: p0 */
    public static final int[] f9192p0 = {R.string.defaults, R.string.home, R.string.systems, R.string.games, R.string.game_info, R.string.genres, R.string.collections, R.string.options, R.string.gamepad, R.string.themes, R.string.webpage};

    /* renamed from: q0 */
    public static final String[] f9193q0 = {"default", "home", "systems", "game", "gameinfo", "genres", "collections", "options", "gamepad", "editthemes", "webpage"};

    /* renamed from: r0 */
    public static final int[][] f9194r0 = {new int[]{0, 1, 2, 3, 4, 17, 5, 8, 9, 11, 12, 13}, new int[]{1, 2, 3, 4, 17, 6, 9, 11, 12, 13, 14}, new int[]{1, 2, 3, 4, 17, 6, 7, 16, 9, 11, 12, 13, 14}, new int[]{1, 2, 3, 4, 17, 7, 16, 15, 9, 10, 11, 12, 13, 14}, new int[]{1, 2, 3, 4, 18, 17, 7, 16, 9, 11, 12, 13}, new int[]{1, 2, 3, 4, 17, 9, 11, 12, 13, 14}, new int[]{1, 2, 3, 4, 17, 9, 11, 12, 13, 14}, new int[]{1, 2, 3, 4, 17, 9, 11, 12, 13}, new int[]{1, 2, 3, 4, 17, 9, 11, 12, 13}, new int[]{1, 2, 3, 4, 17, 9, 11, 12, 13}, new int[]{4, 9}};

    /* renamed from: s0 */
    MyListView f9195s0;

    /* renamed from: t0 */
    C2564r f9196t0;

    /* renamed from: u0 */
    ArrayList<C2724s3> f9197u0;

    /* renamed from: v0 */
    C2724s3 f9198v0;

    /* renamed from: w0 */
    int f9199w0;

    /* renamed from: x0 */
    int f9200x0;

    /* renamed from: y0 */
    String f9201y0 = "default";

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s$a */
    public class C2691a implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        int f9202b = -1;

        C2691a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != this.f9202b) {
                C2690s sVar = C2690s.this;
                sVar.f9200x0 = i;
                String[] strArr = C2690s.f9193q0;
                sVar.f9201y0 = strArr[i];
                ActivityC0447d c0 = C2690s.this.mo2552c0();
                C2690s sVar2 = C2690s.this;
                C2774t3 t3Var = sVar2.f8808g0;
                C2724s3 s3Var = sVar2.f9198v0;
                int i2 = sVar2.f9200x0;
                sVar.f9196t0 = new C2564r(c0, t3Var, s3Var, strArr[i2], C2690s.f9194r0[i2]);
                C2690s sVar3 = C2690s.this;
                sVar3.f9195s0.setAdapter((ListAdapter) sVar3.f9196t0);
                this.f9202b = i;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.digdroid.alman.dig.s$b */
    class C2692b implements C2553q3.AbstractC2559e {
        C2692b() {
        }

        @Override // com.digdroid.alman.dig.C2553q3.AbstractC2559e
        /* renamed from: a */
        public void mo8981a(ArrayList<C2724s3> arrayList) {
            try {
                C2690s.this.mo9170j3(arrayList);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s$c */
    public class View$OnClickListenerC2693c implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ ArrayList f9205b;

        /* renamed from: com.digdroid.alman.dig.s$c$a */
        class DialogInterface$OnClickListenerC2694a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2694a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C2724s3 s3Var = new C2724s3(C2690s.this.f9198v0);
                s3Var.mo8782s("name", C2690s.this.mo2501D0(R.string.my_theme));
                s3Var.f9260f = null;
                synchronized (C2690s.class) {
                    View$OnClickListenerC2693c.this.f9205b.add(s3Var);
                    View$OnClickListenerC2693c cVar = View$OnClickListenerC2693c.this;
                    C2690s.this.f9199w0 = cVar.f9205b.size() - 1;
                    C2690s.this.m11466k3();
                }
                C2690s sVar = C2690s.this;
                sVar.f9200x0 = 0;
                sVar.f9201y0 = C2690s.f9193q0[0];
                ((Spinner) C2690s.this.mo2505F0().findViewById(R.id.select_theme)).setSelection(sVar.f9199w0);
            }
        }

        View$OnClickListenerC2693c(ArrayList arrayList) {
            this.f9205b = arrayList;
        }

        public void onClick(View view) {
            new DialogInterfaceC0068b.C0069a(C2690s.this.mo2552c0(), C2553q3.m11117c()).mo228h(R.string.confirm_create_theme).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2694a()).mo221a().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s$d */
    public class View$OnClickListenerC2695d implements View.OnClickListener {

        /* renamed from: com.digdroid.alman.dig.s$d$a */
        class DialogInterface$OnClickListenerC2696a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ Activity f9209b;

            DialogInterface$OnClickListenerC2696a(Activity activity) {
                this.f9209b = activity;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C2553q3.m11115a(this.f9209b, C2690s.this.f9198v0);
            }
        }

        View$OnClickListenerC2695d() {
        }

        public void onClick(View view) {
            ActivityC0447d c0 = C2690s.this.mo2552c0();
            if (c0 != null && !c0.isFinishing() && C2690s.this.f9198v0.f9260f != null) {
                new DialogInterfaceC0068b.C0069a(c0, C2553q3.m11117c()).mo228h(R.string.bundle_theme).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2696a(c0)).mo232l(R.string.cancel, null).mo221a().show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s$e */
    public class View$OnClickListenerC2697e implements View.OnClickListener {

        /* renamed from: com.digdroid.alman.dig.s$e$a */
        class DialogInterface$OnClickListenerC2698a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2698a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                String str;
                C2724s3 s3Var = C2690s.this.f9198v0;
                String w = C2185a4.m9693w(s3Var.mo8772i("name"));
                if (!w.equals("")) {
                    if (s3Var.f9260f == null) {
                        int i2 = 1;
                        do {
                            String w2 = C2185a4.m9693w(w);
                            if (w2.equals("")) {
                                w2 = "theme";
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(w2);
                            if (i2 == 1) {
                                str = "";
                            } else {
                                str = " (" + i2 + ")";
                            }
                            sb.append(str);
                            sb.append(".cfg");
                            s3Var.f9260f = sb.toString();
                            i2++;
                        } while (s3Var.mo9232z());
                        int i3 = i2 - 1;
                        if (i3 > 1) {
                            s3Var.mo8782s("name", w + " (" + i3 + ")");
                        }
                    }
                    Point g = ((MainActivity) C2690s.this.mo2552c0()).mo8203g(true);
                    s3Var.mo8779p("theme_width", g.x);
                    s3Var.mo8779p("theme_height", g.y);
                    s3Var.mo8777n("theme_aspect_ratio", ((float) g.x) / ((float) g.y));
                    s3Var.mo8777n("theme_density", C2690s.this.mo2613x0().getDisplayMetrics().density);
                    s3Var.mo8777n("theme_scaled_density", C2690s.this.mo2613x0().getDisplayMetrics().scaledDensity);
                    String str2 = C2553q3.f8899a.f9414j;
                    C2553q3.m11129o(C2690s.this.mo2552c0(), s3Var.f9260f);
                    s3Var.mo9216S(s3Var.f9260f.equals(str2));
                    C2185a4.m9691u(C2690s.this.mo2552c0());
                }
            }
        }

        View$OnClickListenerC2697e() {
        }

        public void onClick(View view) {
            new DialogInterfaceC0068b.C0069a(C2690s.this.mo2552c0(), C2553q3.m11117c()).mo228h(R.string.confirm).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2698a()).mo221a().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s$f */
    public class View$OnClickListenerC2699f implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ ArrayList f9213b;

        /* renamed from: com.digdroid.alman.dig.s$f$a */
        class DialogInterface$OnClickListenerC2700a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ C2724s3 f9215b;

            /* renamed from: com.digdroid.alman.dig.s$f$a$a */
            class C2701a implements C2553q3.AbstractC2559e {
                C2701a() {
                }

                @Override // com.digdroid.alman.dig.C2553q3.AbstractC2559e
                /* renamed from: a */
                public void mo8981a(ArrayList<C2724s3> arrayList) {
                    C2690s sVar = C2690s.this;
                    sVar.f9199w0 = -1;
                    sVar.f8814m0.mo8264R();
                    try {
                        C2690s.this.mo9170j3(arrayList);
                    } catch (Exception unused) {
                    }
                }
            }

            DialogInterface$OnClickListenerC2700a(C2724s3 s3Var) {
                this.f9215b = s3Var;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.f9215b.mo9228u();
                C2553q3.m11124j((MainActivity) C2690s.this.mo2552c0(), new C2701a());
            }
        }

        View$OnClickListenerC2699f(ArrayList arrayList) {
            this.f9213b = arrayList;
        }

        public void onClick(View view) {
            DialogInterfaceC0068b.C0069a o;
            C2724s3 s3Var = (C2724s3) this.f9213b.get(C2690s.this.f9199w0);
            if (s3Var.f9260f.equals(C2553q3.f8899a.f9414j)) {
                o = new DialogInterfaceC0068b.C0069a(C2690s.this.mo2552c0(), C2553q3.m11117c()).mo228h(R.string.cant_delete_theme).mo235o(R.string.ok, null);
            } else {
                DialogInterfaceC0068b.C0069a aVar = new DialogInterfaceC0068b.C0069a(C2690s.this.mo2552c0(), C2553q3.m11117c());
                o = aVar.mo239s(C2690s.this.mo2501D0(R.string.delete) + " " + s3Var.mo8772i("name")).mo228h(R.string.confirm).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2700a(s3Var));
            }
            o.mo221a().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s$g */
    public class C2702g implements AdapterView.OnItemClickListener {

        /* renamed from: com.digdroid.alman.dig.s$g$a */
        class C2703a implements C2326g2.AbstractC2328b {

            /* renamed from: a */
            final /* synthetic */ int f9219a;

            C2703a(int i) {
                this.f9219a = i;
            }

            @Override // com.digdroid.alman.dig.C2326g2.AbstractC2328b
            /* renamed from: a */
            public void mo8464a(int i) {
                C2690s sVar = C2690s.this;
                C2724s3 s3Var = sVar.f9198v0;
                int i2 = this.f9219a;
                s3Var.mo8778o(i2 == 10 ? C2690s.f9191o0[i2] : sVar.m11465i3(C2690s.f9191o0[i2]), i);
                C2690s.this.f9196t0.notifyDataSetChanged();
            }
        }

        /* renamed from: com.digdroid.alman.dig.s$g$b */
        class DialogInterface$OnClickListenerC2704b implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ int f9221b;

            /* renamed from: com.digdroid.alman.dig.s$g$b$a */
            class C2705a implements C2326g2.AbstractC2328b {

                /* renamed from: a */
                final /* synthetic */ String f9223a;

                C2705a(String str) {
                    this.f9223a = str;
                }

                @Override // com.digdroid.alman.dig.C2326g2.AbstractC2328b
                /* renamed from: a */
                public void mo8464a(int i) {
                    C2690s sVar = C2690s.this;
                    sVar.f9198v0.mo8778o(sVar.m11465i3(this.f9223a), i);
                    C2690s.this.f9196t0.notifyDataSetChanged();
                }
            }

            DialogInterface$OnClickListenerC2704b(int i) {
                this.f9221b = i;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                String str = C2690s.f9191o0[this.f9221b] + "2";
                C2690s sVar = C2690s.this;
                new C2326g2((ActivityC2455l) C2690s.this.mo2552c0(), C2690s.f9190n0[this.f9221b], sVar.f9198v0.mo9204E(sVar.f9201y0, str, 0), false, new C2705a(str)).mo8462a();
            }
        }

        /* renamed from: com.digdroid.alman.dig.s$g$c */
        class DialogInterface$OnClickListenerC2706c implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ int f9225b;

            /* renamed from: com.digdroid.alman.dig.s$g$c$a */
            class C2707a implements C2326g2.AbstractC2328b {

                /* renamed from: a */
                final /* synthetic */ String f9227a;

                C2707a(String str) {
                    this.f9227a = str;
                }

                @Override // com.digdroid.alman.dig.C2326g2.AbstractC2328b
                /* renamed from: a */
                public void mo8464a(int i) {
                    C2690s sVar = C2690s.this;
                    sVar.f9198v0.mo8778o(sVar.m11465i3(this.f9227a), i);
                    C2690s.this.f9196t0.notifyDataSetChanged();
                }
            }

            DialogInterface$OnClickListenerC2706c(int i) {
                this.f9225b = i;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                String str = C2690s.f9191o0[this.f9225b] + "1";
                C2690s sVar = C2690s.this;
                new C2326g2((ActivityC2455l) C2690s.this.mo2552c0(), C2690s.f9190n0[this.f9225b], sVar.f9198v0.mo9204E(sVar.f9201y0, str, 0), false, new C2707a(str)).mo8462a();
            }
        }

        C2702g() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            int intValue = ((Integer) view.getTag()).intValue();
            if (intValue >= 8) {
                if (intValue == 8) {
                    C2724s3 s3Var = C2690s.this.f9198v0;
                    String[] strArr = C2690s.f9191o0;
                    s3Var.mo8778o(strArr[intValue], s3Var.mo8769f(strArr[intValue], -1) ^ -1);
                    C2690s.this.f9196t0.notifyDataSetChanged();
                } else if (intValue <= 13) {
                    C2690s sVar = C2690s.this;
                    new C2326g2((ActivityC2455l) C2690s.this.mo2552c0(), C2690s.f9190n0[intValue], sVar.f9198v0.mo9204E(intValue == 10 ? "default" : sVar.f9201y0, C2690s.f9191o0[intValue], 0), true, new C2703a(intValue)).mo8462a();
                } else if (intValue == 14) {
                    new DialogInterfaceC0068b.C0069a(C2690s.this.mo2552c0(), C2553q3.m11117c()).mo228h(R.string.gradient_select).mo232l(R.string.start, new DialogInterface$OnClickListenerC2706c(intValue)).mo235o(R.string.end, new DialogInterface$OnClickListenerC2704b(intValue)).mo233m(R.string.cancel, null).mo221a().show();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s$h */
    public class C2708h implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        View f9229b = null;

        C2708h() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae  */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemSelected(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
            /*
            // Method dump skipped, instructions count: 183
            */
            throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2690s.C2708h.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            C2690s.this.f9195s0.setDescendantFocusability(131072);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s$i */
    public class C2709i implements AbsListView.RecyclerListener {
        C2709i() {
        }

        public void onMovedToScrapHeap(View view) {
            if (view.hasFocus()) {
                view.clearFocus();
                if (view instanceof EditText) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.s$j */
    public class C2710j implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        int f9232b = -1;

        /* renamed from: c */
        final /* synthetic */ ArrayList f9233c;

        /* renamed from: d */
        final /* synthetic */ Spinner f9234d;

        C2710j(ArrayList arrayList, Spinner spinner) {
            this.f9233c = arrayList;
            this.f9234d = spinner;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != this.f9232b) {
                C2690s sVar = C2690s.this;
                sVar.f9199w0 = i;
                sVar.f9198v0 = (C2724s3) this.f9233c.get(i);
                C2690s sVar2 = C2690s.this;
                if (sVar2.f9200x0 > 0) {
                    if (this.f9232b >= 0) {
                        sVar2.f9200x0 = 0;
                    }
                    String[] strArr = C2690s.f9193q0;
                    int i2 = sVar2.f9200x0;
                    sVar2.f9201y0 = strArr[i2];
                    this.f9234d.setSelection(i2);
                } else {
                    ActivityC0447d c0 = C2690s.this.mo2552c0();
                    C2690s sVar3 = C2690s.this;
                    C2774t3 t3Var = sVar3.f8808g0;
                    C2724s3 s3Var = sVar3.f9198v0;
                    String[] strArr2 = C2690s.f9193q0;
                    int i3 = sVar3.f9200x0;
                    sVar2.f9196t0 = new C2564r(c0, t3Var, s3Var, strArr2[i3], C2690s.f9194r0[i3]);
                    C2690s sVar4 = C2690s.this;
                    sVar4.f9195s0.setAdapter((ListAdapter) sVar4.f9196t0);
                }
                this.f9232b = i;
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: i3 */
    private String m11465i3(String str) {
        if (this.f9201y0.equals("default")) {
            return str;
        }
        return this.f9201y0 + "_" + str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: k3 */
    private void m11466k3() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f9197u0.size(); i++) {
            C2724s3 s3Var = this.f9197u0.get(i);
            arrayList.add(i, s3Var.mo8772i("name"));
            if (this.f9199w0 < 0 && C2553q3.f8900b.equals(s3Var.f9260f)) {
                this.f9199w0 = i;
            }
        }
        if (this.f9199w0 < 0) {
            this.f9199w0 = 0;
        }
        this.f9198v0 = this.f9197u0.get(this.f9199w0);
        ArrayAdapter arrayAdapter = new ArrayAdapter(mo2552c0(), (int) R.layout.spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        ((Spinner) mo2505F0().findViewById(R.id.select_theme)).setAdapter((SpinnerAdapter) arrayAdapter);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: B2 */
    public /* bridge */ /* synthetic */ boolean mo8102B2() {
        return super.mo8102B2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: C2 */
    public /* bridge */ /* synthetic */ boolean mo8103C2() {
        return super.mo8103C2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: E2 */
    public /* bridge */ /* synthetic */ void mo8104E2(boolean z) {
        super.mo8104E2(z);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: F2 */
    public /* bridge */ /* synthetic */ void mo8105F2() {
        super.mo8105F2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: G2 */
    public /* bridge */ /* synthetic */ void mo8106G2(boolean z) {
        super.mo8106G2(z);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: I2 */
    public /* bridge */ /* synthetic */ void mo8107I2(String str) {
        super.mo8107I2(str);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: J2 */
    public /* bridge */ /* synthetic */ void mo8108J2(String str) {
        super.mo8108J2(str);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: K2 */
    public /* bridge */ /* synthetic */ void mo8109K2() {
        super.mo8109K2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: N2 */
    public /* bridge */ /* synthetic */ boolean mo8110N2() {
        return super.mo8110N2();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: O2 */
    public void mo8407O2() {
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: P2 */
    public /* bridge */ /* synthetic */ void mo8111P2() {
        super.mo8111P2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: Q2 */
    public /* bridge */ /* synthetic */ void mo8112Q2() {
        super.mo8112Q2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: R2 */
    public /* bridge */ /* synthetic */ void mo8113R2() {
        super.mo8113R2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: S2 */
    public /* bridge */ /* synthetic */ void mo8114S2() {
        super.mo8114S2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: T0 */
    public /* bridge */ /* synthetic */ void mo2531T0(Context context) {
        super.mo2531T0(context);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: T2 */
    public /* bridge */ /* synthetic */ void mo8115T2(C2369h0 h0Var) {
        super.mo8115T2(h0Var);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: U2 */
    public /* bridge */ /* synthetic */ void mo8116U2() {
        super.mo8116U2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: W0 */
    public /* bridge */ /* synthetic */ void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: W2 */
    public /* bridge */ /* synthetic */ void mo8117W2() {
        super.mo8117W2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: X2 */
    public /* bridge */ /* synthetic */ void mo8118X2(String str) {
        super.mo8118X2(str);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: Y2 */
    public /* bridge */ /* synthetic */ void mo8119Y2(String str) {
        super.mo8119Y2(str);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: Z0 */
    public /* bridge */ /* synthetic */ void mo2545Z0(Menu menu, MenuInflater menuInflater) {
        super.mo2545Z0(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: a1 */
    public View mo2547a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (bundle != null) {
            this.f9199w0 = bundle.getInt("selected_theme");
            i = bundle.getInt("selected_type");
        } else {
            i = -1;
            this.f9199w0 = -1;
        }
        this.f9200x0 = i;
        return layoutInflater.inflate(R.layout.fragment_custom_theme, viewGroup, false);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: a3 */
    public /* bridge */ /* synthetic */ void mo8120a3(boolean z) {
        super.mo8120a3(z);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: c3 */
    public /* bridge */ /* synthetic */ void mo8121c3() {
        super.mo8121c3();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: d3 */
    public /* bridge */ /* synthetic */ boolean mo8122d3() {
        return super.mo8122d3();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: e3 */
    public /* bridge */ /* synthetic */ void mo8123e3() {
        super.mo8123e3();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j3 */
    public void mo9170j3(ArrayList<C2724s3> arrayList) {
        if (arrayList != null) {
            synchronized (C2690s.class) {
                this.f9197u0 = arrayList;
            }
            int i = this.f9199w0;
            if (i >= 0 && i < arrayList.size()) {
                arrayList.get(this.f9199w0).mo9214Q();
            }
            mo8118X2(mo2501D0(R.string.edit_themes));
            TextView textView = (TextView) mo2505F0().findViewById(R.id.clone);
            textView.setTextColor(this.f8808g0.f9410f);
            C2553q3.m11131q(textView);
            textView.setOnClickListener(new View$OnClickListenerC2693c(arrayList));
            TextView textView2 = (TextView) mo2505F0().findViewById(R.id.bundle);
            textView2.setTextColor(this.f8808g0.f9410f);
            C2553q3.m11131q(textView2);
            textView2.setOnClickListener(new View$OnClickListenerC2695d());
            TextView textView3 = (TextView) mo2505F0().findViewById(R.id.ok);
            textView3.setTextColor(this.f8808g0.f9410f);
            C2553q3.m11131q(textView3);
            textView3.setOnClickListener(new View$OnClickListenerC2697e());
            TextView textView4 = (TextView) mo2505F0().findViewById(R.id.delete);
            textView4.setTextColor(this.f8808g0.f9410f);
            C2553q3.m11131q(textView4);
            textView4.setOnClickListener(new View$OnClickListenerC2699f(arrayList));
            MyListView myListView = (MyListView) mo2505F0().findViewById(R.id.colors_list);
            this.f9195s0 = myListView;
            myListView.setOnItemClickListener(new C2702g());
            this.f9195s0.setOnItemSelectedListener(new C2708h());
            this.f9195s0.setRecyclerListener(new C2709i());
            synchronized (C2690s.class) {
                m11466k3();
            }
            Spinner spinner = (Spinner) mo2505F0().findViewById(R.id.select_theme);
            Spinner spinner2 = (Spinner) mo2505F0().findViewById(R.id.select_page_type);
            spinner.setOnItemSelectedListener(new C2710j(arrayList, spinner2));
            ArrayList arrayList2 = new ArrayList();
            int i2 = 0;
            while (true) {
                int[] iArr = f9192p0;
                if (i2 >= iArr.length) {
                    break;
                }
                arrayList2.add(i2, mo2501D0(iArr[i2]).substring(0, 1).toUpperCase() + mo2501D0(iArr[i2]).substring(1));
                i2++;
            }
            if (this.f9200x0 < 0) {
                this.f9200x0 = 0;
            }
            this.f9201y0 = f9193q0[this.f9200x0];
            ArrayAdapter arrayAdapter = new ArrayAdapter(mo2552c0(), (int) R.layout.spinner_item, arrayList2);
            arrayAdapter.setDropDownViewResource(17367049);
            spinner2.setAdapter((SpinnerAdapter) arrayAdapter);
            spinner2.setOnItemSelectedListener(new C2691a());
            spinner.setSelection(this.f9199w0);
            this.f8810i0 = true;
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: k1 */
    public /* bridge */ /* synthetic */ boolean mo2579k1(MenuItem menuItem) {
        return super.mo2579k1(menuItem);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: m1 */
    public void mo2585m1() {
        int i;
        super.mo2585m1();
        ArrayList<C2724s3> arrayList = this.f9197u0;
        if (arrayList != null && (i = this.f9199w0) >= 0 && i < arrayList.size()) {
            this.f9197u0.get(this.f9199w0).mo9217T();
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: q2 */
    public /* bridge */ /* synthetic */ void mo8125q2() {
        super.mo8125q2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: r1 */
    public void mo2601r1() {
        super.mo2601r1();
        C2553q3.m11124j((MainActivity) mo2552c0(), new C2692b());
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: s1 */
    public void mo2603s1(Bundle bundle) {
        bundle.putInt("selected_theme", this.f9199w0);
        bundle.putInt("selected_type", this.f9200x0);
        super.mo2603s1(bundle);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: s2 */
    public /* bridge */ /* synthetic */ String mo8126s2() {
        return super.mo8126s2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: t1 */
    public /* bridge */ /* synthetic */ void mo2605t1() {
        super.mo2605t1();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: t2 */
    public String mo8127t2() {
        return "editthemes";
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: u2 */
    public /* bridge */ /* synthetic */ long mo8128u2() {
        return super.mo8128u2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: v2 */
    public /* bridge */ /* synthetic */ C2774t3 mo8129v2() {
        return super.mo8129v2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: x2 */
    public /* bridge */ /* synthetic */ boolean mo8130x2() {
        return super.mo8130x2();
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: y2 */
    public /* bridge */ /* synthetic */ boolean mo8131y2(int i, int i2) {
        return super.mo8131y2(i, i2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractC2531p1
    /* renamed from: z2 */
    public void mo8410z2(Intent intent) {
    }
}
