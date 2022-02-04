package com.pes.androidmaterialcolorpickerdialog;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

/* renamed from: com.pes.androidmaterialcolorpickerdialog.b */
public class DialogC3336b extends Dialog implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: b */
    private final Activity f11232b;

    /* renamed from: c */
    private View f11233c;

    /* renamed from: d */
    private SeekBar f11234d;

    /* renamed from: e */
    private SeekBar f11235e;

    /* renamed from: f */
    private SeekBar f11236f;

    /* renamed from: g */
    private SeekBar f11237g;

    /* renamed from: h */
    private EditText f11238h;

    /* renamed from: i */
    private int f11239i;

    /* renamed from: j */
    private int f11240j;

    /* renamed from: k */
    private int f11241k;

    /* renamed from: l */
    private int f11242l;

    /* renamed from: m */
    private AbstractC3339c f11243m;

    /* renamed from: n */
    private boolean f11244n;

    /* renamed from: o */
    private boolean f11245o;

    /* renamed from: com.pes.androidmaterialcolorpickerdialog.b$a */
    class C3337a implements TextView.OnEditorActionListener {
        C3337a() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3 && i != 6 && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return false;
            }
            DialogC3336b.this.m13931j(textView.getText().toString());
            ((InputMethodManager) DialogC3336b.this.f11232b.getSystemService("input_method")).hideSoftInputFromWindow(DialogC3336b.this.f11238h.getWindowToken(), 0);
            return true;
        }
    }

    /* renamed from: com.pes.androidmaterialcolorpickerdialog.b$b */
    class View$OnClickListenerC3338b implements View.OnClickListener {
        View$OnClickListenerC3338b() {
        }

        public void onClick(View view) {
            DialogC3336b.this.m13930h();
        }
    }

    public DialogC3336b(Activity activity) {
        super(activity);
        this.f11232b = activity;
        if (activity instanceof AbstractC3339c) {
            this.f11243m = (AbstractC3339c) activity;
        }
        this.f11239i = 255;
        this.f11240j = 0;
        this.f11241k = 0;
        this.f11242l = 0;
        this.f11244n = false;
        this.f11245o = false;
    }

    public DialogC3336b(Activity activity, int i, int i2, int i3) {
        this(activity);
        this.f11240j = C3335a.m13922a(i);
        this.f11241k = C3335a.m13922a(i2);
        this.f11242l = C3335a.m13922a(i3);
    }

    public DialogC3336b(Activity activity, int i, int i2, int i3, int i4) {
        this(activity);
        this.f11239i = C3335a.m13922a(i);
        this.f11240j = C3335a.m13922a(i2);
        this.f11241k = C3335a.m13922a(i3);
        this.f11242l = C3335a.m13922a(i4);
        this.f11244n = true;
    }

    /* renamed from: g */
    private void m13929g() {
        this.f11233c.setBackgroundColor(mo11282f());
        this.f11234d.setProgress(this.f11239i);
        this.f11235e.setProgress(this.f11240j);
        this.f11236f.setProgress(this.f11241k);
        this.f11237g.setProgress(this.f11242l);
        if (!this.f11244n) {
            this.f11234d.setVisibility(8);
        }
        this.f11238h.setText(this.f11244n ? C3335a.m13924c(this.f11239i, this.f11240j, this.f11241k, this.f11242l) : C3335a.m13923b(this.f11240j, this.f11241k, this.f11242l));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private void m13930h() {
        AbstractC3339c cVar = this.f11243m;
        if (cVar != null) {
            cVar.mo8463a(mo11282f());
        }
        if (this.f11245o) {
            dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j */
    private void m13931j(String str) {
        try {
            int parseColor = Color.parseColor('#' + str);
            this.f11239i = Color.alpha(parseColor);
            this.f11240j = Color.red(parseColor);
            this.f11241k = Color.green(parseColor);
            this.f11242l = Color.blue(parseColor);
            this.f11233c.setBackgroundColor(mo11282f());
            this.f11234d.setProgress(this.f11239i);
            this.f11235e.setProgress(this.f11240j);
            this.f11236f.setProgress(this.f11241k);
            this.f11237g.setProgress(this.f11242l);
        } catch (IllegalArgumentException unused) {
            this.f11238h.setError(this.f11232b.getResources().getText(C3342f.materialcolorpicker__errHex));
        }
    }

    /* renamed from: e */
    public void mo11281e() {
        this.f11245o = true;
    }

    /* renamed from: f */
    public int mo11282f() {
        return this.f11244n ? Color.argb(this.f11239i, this.f11240j, this.f11241k, this.f11242l) : Color.rgb(this.f11240j, this.f11241k, this.f11242l);
    }

    /* renamed from: i */
    public void mo11283i(AbstractC3339c cVar) {
        this.f11243m = cVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 21) {
            requestWindowFeature(1);
        }
        setContentView(C3341e.materialcolorpicker__layout_color_picker);
        this.f11233c = findViewById(C3340d.colorView);
        this.f11238h = (EditText) findViewById(C3340d.hexCode);
        this.f11234d = (SeekBar) findViewById(C3340d.alphaSeekBar);
        this.f11235e = (SeekBar) findViewById(C3340d.redSeekBar);
        this.f11236f = (SeekBar) findViewById(C3340d.greenSeekBar);
        this.f11237g = (SeekBar) findViewById(C3340d.blueSeekBar);
        this.f11234d.setOnSeekBarChangeListener(this);
        this.f11235e.setOnSeekBarChangeListener(this);
        this.f11236f.setOnSeekBarChangeListener(this);
        this.f11237g.setOnSeekBarChangeListener(this);
        EditText editText = this.f11238h;
        InputFilter[] inputFilterArr = new InputFilter[1];
        inputFilterArr[0] = new InputFilter.LengthFilter(this.f11244n ? 8 : 6);
        editText.setFilters(inputFilterArr);
        this.f11238h.setOnEditorActionListener(new C3337a());
        ((Button) findViewById(C3340d.okColorButton)).setOnClickListener(new View$OnClickListenerC3338b());
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar.getId() == C3340d.alphaSeekBar) {
            this.f11239i = i;
        } else if (seekBar.getId() == C3340d.redSeekBar) {
            this.f11240j = i;
        } else if (seekBar.getId() == C3340d.greenSeekBar) {
            this.f11241k = i;
        } else if (seekBar.getId() == C3340d.blueSeekBar) {
            this.f11242l = i;
        }
        this.f11233c.setBackgroundColor(mo11282f());
        this.f11238h.setText(this.f11244n ? C3335a.m13924c(this.f11239i, this.f11240j, this.f11241k, this.f11242l) : C3335a.m13923b(this.f11240j, this.f11241k, this.f11242l));
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    public void show() {
        super.show();
        m13929g();
    }
}
