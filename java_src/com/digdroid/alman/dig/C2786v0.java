package com.digdroid.alman.dig;

import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.Point;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import com.bumptech.glide.load.p122o.AbstractC1763j;
import com.digdroid.alman.dig.C2515o2;
import java.io.File;

/* renamed from: com.digdroid.alman.dig.v0 */
public class C2786v0 {

    /* renamed from: A */
    private ImageView f9440A;

    /* renamed from: B */
    private C2515o2.AbstractC2524g f9441B;

    /* renamed from: C */
    int f9442C = -1;

    /* renamed from: D */
    int f9443D = -1;

    /* renamed from: a */
    AbstractC2577r1 f9444a;

    /* renamed from: b */
    C2515o2.C2523f f9445b;

    /* renamed from: c */
    MainActivity f9446c;

    /* renamed from: d */
    View f9447d;

    /* renamed from: e */
    C2375h3 f9448e;

    /* renamed from: f */
    C2219c3 f9449f;

    /* renamed from: g */
    boolean f9450g;

    /* renamed from: h */
    boolean f9451h;

    /* renamed from: i */
    boolean f9452i;

    /* renamed from: j */
    boolean f9453j;

    /* renamed from: k */
    boolean f9454k;

    /* renamed from: l */
    int f9455l;

    /* renamed from: m */
    int f9456m;

    /* renamed from: n */
    int f9457n;

    /* renamed from: o */
    String f9458o;

    /* renamed from: p */
    String f9459p;

    /* renamed from: q */
    private boolean f9460q = false;

    /* renamed from: r */
    private int f9461r;

    /* renamed from: s */
    private int f9462s;

    /* renamed from: t */
    private int f9463t;

    /* renamed from: u */
    private int f9464u;

    /* renamed from: v */
    private int f9465v;

    /* renamed from: w */
    private String f9466w = null;

    /* renamed from: x */
    String f9467x;

    /* renamed from: y */
    private TextView f9468y;

    /* renamed from: z */
    private C2515o2 f9469z = null;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v0$a */
    public class DialogInterface$OnClickListenerC2787a implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2787a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v0$b */
    public class RunnableC2788b implements Runnable {
        RunnableC2788b() {
        }

        public void run() {
            C2786v0.this.f9469z.mo8871w();
        }
    }

    /* renamed from: com.digdroid.alman.dig.v0$c */
    class C2789c implements C2515o2.AbstractC2524g {
        C2789c() {
        }

        @Override // com.digdroid.alman.dig.C2515o2.AbstractC2524g
        /* renamed from: a */
        public void mo8648a() {
            C2786v0.this.f9440A.setVisibility(4);
        }

        @Override // com.digdroid.alman.dig.C2515o2.AbstractC2524g
        /* renamed from: b */
        public boolean mo8649b() {
            C2786v0 v0Var = C2786v0.this;
            return v0Var.f9444a.f8803j0 && v0Var.f9443D == v0Var.f9442C;
        }

        @Override // com.digdroid.alman.dig.C2515o2.AbstractC2524g
        /* renamed from: c */
        public void mo8650c() {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v0$d */
    public class C2790d implements CompoundButton.OnCheckedChangeListener {
        C2790d() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C2786v0 v0Var = C2786v0.this;
            v0Var.f9450g = z;
            v0Var.f9449f.mo8153B("games_preview_enabled", z);
            C2786v0.this.mo9342h();
            C2786v0.this.f9444a.mo8360B();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v0$e */
    public class C2791e implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        Handler f9474b = null;

        /* renamed from: com.digdroid.alman.dig.v0$e$a */
        class RunnableC2792a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ SeekBar f9476b;

            RunnableC2792a(SeekBar seekBar) {
                this.f9476b = seekBar;
            }

            public void run() {
                C2786v0.this.f9455l = this.f9476b.getProgress() + 20;
                C2786v0 v0Var = C2786v0.this;
                v0Var.f9449f.mo8156E("games_preview_size", v0Var.f9455l);
                C2786v0.this.mo9342h();
                C2786v0.this.mo9346l();
            }
        }

        C2791e() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Handler handler = this.f9474b;
            if (handler == null) {
                this.f9474b = new Handler();
            } else {
                handler.removeCallbacksAndMessages(null);
            }
            this.f9474b.postDelayed(new RunnableC2792a(seekBar), 500);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v0$f */
    public class C2793f implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: b */
        Handler f9478b = null;

        /* renamed from: com.digdroid.alman.dig.v0$f$a */
        class RunnableC2794a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ SeekBar f9480b;

            RunnableC2794a(SeekBar seekBar) {
                this.f9480b = seekBar;
            }

            public void run() {
                C2786v0.this.f9456m = this.f9480b.getProgress();
                C2786v0 v0Var = C2786v0.this;
                v0Var.f9449f.mo8156E("games_preview_padding", v0Var.f9456m);
                C2786v0.this.mo9342h();
                C2786v0.this.mo9346l();
            }
        }

        C2793f() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Handler handler = this.f9478b;
            if (handler == null) {
                this.f9478b = new Handler();
            } else {
                handler.removeCallbacksAndMessages(null);
            }
            this.f9478b.postDelayed(new RunnableC2794a(seekBar), 500);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v0$g */
    public class C2795g implements AdapterView.OnItemSelectedListener {
        C2795g() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            View childAt = adapterView.getChildAt(0);
            if (childAt != null) {
                ((TextView) childAt).setTextColor(C2553q3.m11116b());
            }
            C2786v0 v0Var = C2786v0.this;
            v0Var.f9457n = i;
            v0Var.f9449f.mo8200x("games_preview_lines", i);
            C2786v0.this.mo9342h();
            C2786v0.this.mo9346l();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v0$h */
    public class C2796h implements CompoundButton.OnCheckedChangeListener {
        C2796h() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            C2786v0 v0Var = C2786v0.this;
            v0Var.f9451h = z;
            v0Var.f9449f.mo8153B("games_preview_play", z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.v0$i */
    public class C2797i implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ Switch f9484a;

        /* renamed from: com.digdroid.alman.dig.v0$i$a */
        class DialogInterface$OnClickListenerC2798a implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2798a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C2797i.this.f9484a.setChecked(false);
            }
        }

        /* renamed from: com.digdroid.alman.dig.v0$i$b */
        class DialogInterface$OnClickListenerC2799b implements DialogInterface.OnClickListener {
            DialogInterface$OnClickListenerC2799b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C2786v0 v0Var = C2786v0.this;
                v0Var.f9452i = true;
                v0Var.f9449f.mo8153B("games_preview_play_mobile", true);
            }
        }

        C2797i(Switch r2) {
            this.f9484a = r2;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                new DialogInterfaceC0068b.C0069a(C2786v0.this.f9446c, C2553q3.m11117c()).mo238r(R.string.confirm).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2799b()).mo232l(R.string.cancel, new DialogInterface$OnClickListenerC2798a()).mo224d(false).mo221a().show();
            } else {
                C2786v0 v0Var = C2786v0.this;
                v0Var.f9452i = false;
                v0Var.f9449f.mo8153B("games_preview_play_mobile", false);
            }
            if (C2786v0.this.f9469z != null) {
                C2786v0.this.f9469z.mo8872y(z);
            }
        }
    }

    public C2786v0(AbstractC2577r1 r1Var) {
        this.f9444a = r1Var;
        this.f9446c = (MainActivity) r1Var.mo2552c0();
        this.f9447d = r1Var.mo2505F0();
        this.f9449f = C2219c3.m9805k(this.f9446c);
        this.f9448e = C2375h3.m10306r(this.f9446c, null);
        this.f9450g = this.f9449f.mo8180c("games_preview_enabled", false);
        int l = this.f9449f.mo8188l("games_preview_lines", -1);
        this.f9457n = l;
        if (l < 0) {
            this.f9457n = this.f9449f.mo8180c("games_preview_title", true) ? 3 : 0;
        }
        this.f9451h = this.f9449f.mo8180c("games_preview_play", true);
        this.f9452i = this.f9449f.mo8180c("games_preview_play_mobile", false);
        this.f9453j = false;
        this.f9454k = this.f9449f.mo8180c("games_preview_mute", false);
        this.f9455l = this.f9449f.mo8188l("games_preview_size", 50);
        this.f9456m = this.f9449f.mo8188l("games_preview_padding", 5);
        this.f9458o = C2185a4.m9678h(this.f9446c) + "/Screenshots";
        this.f9459p = C2185a4.m9678h(this.f9446c) + "/Covers";
        ViewStub viewStub = (ViewStub) this.f9447d.findViewById(R.id.stub_preview);
        if (viewStub != null) {
            viewStub.inflate();
        }
        this.f9468y = (TextView) this.f9447d.findViewById(R.id.game_title);
        this.f9440A = (ImageView) this.f9447d.findViewById(R.id.screenshot);
        this.f9441B = new C2789c();
    }

    /* renamed from: c */
    public void mo9337c() {
        View inflate = this.f9446c.getLayoutInflater().inflate(R.layout.games_preview_config, (ViewGroup) null);
        Switch r1 = (Switch) inflate.findViewById(R.id.enabled);
        r1.setChecked(this.f9450g);
        r1.setTextColor(C2553q3.m11116b());
        r1.setOnCheckedChangeListener(new C2790d());
        ((TextView) inflate.findViewById(R.id.size_label)).setTextColor(C2553q3.m11116b());
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.preview_size);
        seekBar.setMax(60);
        seekBar.setProgress(this.f9455l - 20);
        seekBar.setKeyProgressIncrement(1);
        seekBar.setOnSeekBarChangeListener(new C2791e());
        ((TextView) inflate.findViewById(R.id.padding_label)).setTextColor(C2553q3.m11116b());
        SeekBar seekBar2 = (SeekBar) inflate.findViewById(R.id.preview_padding);
        seekBar2.setMax(25);
        seekBar2.setProgress(this.f9456m);
        seekBar2.setKeyProgressIncrement(1);
        seekBar2.setOnSeekBarChangeListener(new C2793f());
        ((TextView) inflate.findViewById(R.id.title_label)).setTextColor(C2553q3.m11116b());
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.f9446c, 17367048, new String[]{this.f9446c.getString(R.string.no_title), this.f9446c.getString(R.string.one_line), this.f9446c.getString(R.string.two_lines), this.f9446c.getString(R.string.one_or_two_lines)});
        arrayAdapter.setDropDownViewResource(17367049);
        Spinner spinner = (Spinner) inflate.findViewById(R.id.show_title);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        spinner.setSelection(this.f9457n, true);
        ((TextView) spinner.getSelectedView()).setTextColor(C2553q3.m11116b());
        spinner.setOnItemSelectedListener(new C2795g());
        Switch r12 = (Switch) inflate.findViewById(R.id.play_videos);
        r12.setChecked(this.f9451h);
        r12.setTextColor(C2553q3.m11116b());
        r12.setOnCheckedChangeListener(new C2796h());
        Switch r13 = (Switch) inflate.findViewById(R.id.play_videos_mobile);
        r13.setChecked(this.f9452i);
        r13.setTextColor(C2553q3.m11116b());
        r13.setOnCheckedChangeListener(new C2797i(r13));
        new DialogInterfaceC0068b.C0069a(this.f9446c, C2553q3.m11117c()).mo238r(R.string.preview_pane).mo240t(inflate).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2787a()).mo224d(false).mo221a().show();
    }

    /* renamed from: d */
    public void mo9338d() {
        C2515o2 o2Var = this.f9469z;
        if (o2Var != null) {
            o2Var.mo8867r();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo9339e(int i) {
        AbstractC2577r1 r1Var = this.f9444a;
        if (r1Var.f8803j0) {
            this.f9443D = i;
            if (this.f9469z == null) {
                C2515o2 v0 = r1Var.f8806m0.mo8300v0();
                this.f9469z = v0;
                C2515o2.C2523f n = v0.mo8864n();
                this.f9445b = n;
                n.f8759a = this.f9441B;
                n.f8760b = R.id.youtube_container;
                n.f8761c = R.id.progress;
                n.f8762d = this.f9452i;
                n.f8763e = 1000;
            }
            this.f9469z.mo8870v(this.f9444a, this.f9445b);
            this.f9469z.mo8868t(this.f9466w);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo9340f(Cursor cursor, int i) {
        if (this.f9450g) {
            this.f9442C = -1;
            mo9345k(cursor, i);
        }
    }

    /* renamed from: g */
    public void mo9341g() {
        C2515o2 o2Var = this.f9469z;
        if (o2Var != null) {
            o2Var.mo8869u(this.f9444a);
        }
        this.f9442C = -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo9342h() {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        int i3;
        View findViewById = this.f9447d.findViewById(R.id.preview_pane);
        int i4 = 8;
        if (!this.f9450g) {
            findViewById.setVisibility(8);
            C2515o2 o2Var = this.f9469z;
            if (o2Var != null) {
                o2Var.mo8865p();
            }
        } else {
            findViewById.setVisibility(0);
            Point g = this.f9446c.mo8203g(true);
            int i5 = g.x;
            int i6 = g.y;
            if (i5 > i6) {
                i = Math.round((((float) this.f9455l) * ((float) i5)) / 100.0f);
                findViewById.getLayoutParams().width = i;
                i2 = g.y;
            } else {
                i = Math.round((((float) this.f9455l) * ((float) i6)) / 100.0f);
                findViewById.getLayoutParams().height = i;
                i2 = g.x;
            }
            int round = Math.round((((float) this.f9456m) * ((float) i)) / 100.0f);
            findViewById.setPadding(round, round, round, round);
            int i7 = i2 - (round * 2);
            TextView textView = this.f9468y;
            if (this.f9457n > 0) {
                i4 = 0;
            }
            textView.setVisibility(i4);
            if (this.f9457n > 0) {
                float f = (float) i7;
                this.f9468y.setTextSize(f / 35.0f);
                this.f9468y.setPadding(0, Math.round(f / 60.0f), 0, 0);
            }
            if (this.f9457n == 1) {
                this.f9468y.setMaxLines(1);
                this.f9468y.getLayoutParams().height = Math.round(((float) i7) / 11.5f);
            }
            int i8 = this.f9457n;
            if (i8 == 2) {
                this.f9468y.setMaxLines(2);
                layoutParams = this.f9468y.getLayoutParams();
                i3 = Math.round(((float) i7) / 6.4f);
            } else if (i8 == 3) {
                this.f9468y.setMaxLines(2);
                layoutParams = this.f9468y.getLayoutParams();
                i3 = -2;
            }
            layoutParams.height = i3;
        }
        findViewById.requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo9343i(Cursor cursor) {
        int lastIndexOf;
        String string = cursor.getString(this.f9461r);
        String string2 = cursor.getString(this.f9464u);
        String string3 = cursor.getString(this.f9463t);
        if (string3 != null) {
            string2 = string3;
        } else if (!string.equals("pc") && !string.equals("scumm") && !string.equals("android") && (lastIndexOf = string2.lastIndexOf(46)) > 0) {
            string2 = string2.substring(0, lastIndexOf);
        }
        String t = this.f9448e.mo8569t(string);
        if (t != null) {
            string = t;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string.equals("mame") ? this.f9459p : this.f9458o);
        sb.append("/");
        sb.append(string);
        sb.append("/");
        sb.append(string2);
        sb.append(".png");
        File file = new File(sb.toString());
        this.f9440A.setVisibility(0);
        C2457l1.m10577b(this.f9446c.getApplicationContext()).mo8860K(file).mo7762e(AbstractC1763j.f6903b).mo7754Y(true).mo7030p0(this.f9440A);
    }

    /* renamed from: j */
    public void mo9344j(Cursor cursor, int i) {
        boolean z = !this.f9450g;
        this.f9450g = z;
        this.f9449f.mo8153B("games_preview_enabled", z);
        mo9342h();
        this.f9442C = -1;
        if (this.f9450g) {
            mo9345k(cursor, i);
        } else {
            mo9338d();
        }
    }

    /* renamed from: k */
    public void mo9345k(Cursor cursor, int i) {
        if (cursor != null && !cursor.isClosed() && cursor.moveToPosition(i) && i != this.f9442C) {
            this.f9442C = i;
            if (!this.f9460q) {
                this.f9461r = cursor.getColumnIndex("system");
                this.f9462s = cursor.getColumnIndex("title");
                this.f9463t = cursor.getColumnIndex("foldername");
                this.f9464u = cursor.getColumnIndex("filename");
                this.f9465v = cursor.getColumnIndex("youtube");
                this.f9460q = true;
            }
            this.f9467x = cursor.getString(this.f9462s);
            mo9347m();
            this.f9466w = cursor.getString(this.f9465v);
            mo9343i(cursor);
            if (this.f9451h) {
                mo9339e(i);
                return;
            }
            C2515o2 o2Var = this.f9469z;
            if (o2Var != null) {
                o2Var.mo8865p();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo9346l() {
        if (this.f9469z != null) {
            this.f9445b.f8764f = false;
            this.f9447d.findViewById(R.id.preview_pane).postDelayed(new RunnableC2788b(), 500);
        }
        mo9347m();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo9347m() {
        if (this.f9457n > 0) {
            this.f9468y.setText(this.f9467x);
            this.f9468y.setTextColor(this.f9444a.f8800g0.f9401e);
        }
    }
}
