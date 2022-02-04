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
    private final Activity f11223b;

    /* renamed from: c */
    private View f11224c;

    /* renamed from: d */
    private SeekBar f11225d;

    /* renamed from: e */
    private SeekBar f11226e;

    /* renamed from: f */
    private SeekBar f11227f;

    /* renamed from: g */
    private SeekBar f11228g;

    /* renamed from: h */
    private EditText f11229h;

    /* renamed from: i */
    private int f11230i;

    /* renamed from: j */
    private int f11231j;

    /* renamed from: k */
    private int f11232k;

    /* renamed from: l */
    private int f11233l;

    /* renamed from: m */
    private AbstractC3339c f11234m;

    /* renamed from: n */
    private boolean f11235n;

    /* renamed from: o */
    private boolean f11236o;

    /* renamed from: com.pes.androidmaterialcolorpickerdialog.b$a */
    class C3337a implements TextView.OnEditorActionListener {
        C3337a() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3 && i != 6 && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                return false;
            }
            DialogC3336b.this.m13931j(textView.getText().toString());
            ((InputMethodManager) DialogC3336b.this.f11223b.getSystemService("input_method")).hideSoftInputFromWindow(DialogC3336b.this.f11229h.getWindowToken(), 0);
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
        this.f11223b = activity;
        if (activity instanceof AbstractC3339c) {
            this.f11234m = (AbstractC3339c) activity;
        }
        this.f11230i = 255;
        this.f11231j = 0;
        this.f11232k = 0;
        this.f11233l = 0;
        this.f11235n = false;
        this.f11236o = false;
    }

    public DialogC3336b(Activity activity, int i, int i2, int i3) {
        this(activity);
        this.f11231j = C3335a.m13922a(i);
        this.f11232k = C3335a.m13922a(i2);
        this.f11233l = C3335a.m13922a(i3);
    }

    public DialogC3336b(Activity activity, int i, int i2, int i3, int i4) {
        this(activity);
        this.f11230i = C3335a.m13922a(i);
        this.f11231j = C3335a.m13922a(i2);
        this.f11232k = C3335a.m13922a(i3);
        this.f11233l = C3335a.m13922a(i4);
        this.f11235n = true;
    }

    /* renamed from: g */
    private void m13929g() {
        this.f11224c.setBackgroundColor(mo11282f());
        this.f11225d.setProgress(this.f11230i);
        this.f11226e.setProgress(this.f11231j);
        this.f11227f.setProgress(this.f11232k);
        this.f11228g.setProgress(this.f11233l);
        if (!this.f11235n) {
            this.f11225d.setVisibility(8);
        }
        this.f11229h.setText(this.f11235n ? C3335a.m13924c(this.f11230i, this.f11231j, this.f11232k, this.f11233l) : C3335a.m13923b(this.f11231j, this.f11232k, this.f11233l));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: h */
    private void m13930h() {
        AbstractC3339c cVar = this.f11234m;
        if (cVar != null) {
            cVar.mo8463a(mo11282f());
        }
        if (this.f11236o) {
            dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j */
    private void m13931j(String str) {
        try {
            int parseColor = Color.parseColor('#' + str);
            this.f11230i = Color.alpha(parseColor);
            this.f11231j = Color.red(parseColor);
            this.f11232k = Color.green(parseColor);
            this.f11233l = Color.blue(parseColor);
            this.f11224c.setBackgroundColor(mo11282f());
            this.f11225d.setProgress(this.f11230i);
            this.f11226e.setProgress(this.f11231j);
            this.f11227f.setProgress(this.f11232k);
            this.f11228g.setProgress(this.f11233l);
        } catch (IllegalArgumentException unused) {
            this.f11229h.setError(this.f11223b.getResources().getText(C3342f.materialcolorpicker__errHex));
        }
    }

    /* renamed from: e */
    public void mo11281e() {
        this.f11236o = true;
    }

    /* renamed from: f */
    public int mo11282f() {
        return this.f11235n ? Color.argb(this.f11230i, this.f11231j, this.f11232k, this.f11233l) : Color.rgb(this.f11231j, this.f11232k, this.f11233l);
    }

    /* renamed from: i */
    public void mo11283i(AbstractC3339c cVar) {
        this.f11234m = cVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 21) {
            requestWindowFeature(1);
        }
        setContentView(C3341e.materialcolorpicker__layout_color_picker);
        this.f11224c = findViewById(C3340d.colorView);
        this.f11229h = (EditText) findViewById(C3340d.hexCode);
        this.f11225d = (SeekBar) findViewById(C3340d.alphaSeekBar);
        this.f11226e = (SeekBar) findViewById(C3340d.redSeekBar);
        this.f11227f = (SeekBar) findViewById(C3340d.greenSeekBar);
        this.f11228g = (SeekBar) findViewById(C3340d.blueSeekBar);
        this.f11225d.setOnSeekBarChangeListener(this);
        this.f11226e.setOnSeekBarChangeListener(this);
        this.f11227f.setOnSeekBarChangeListener(this);
        this.f11228g.setOnSeekBarChangeListener(this);
        EditText editText = this.f11229h;
        InputFilter[] inputFilterArr = new InputFilter[1];
        inputFilterArr[0] = new InputFilter.LengthFilter(this.f11235n ? 8 : 6);
        editText.setFilters(inputFilterArr);
        this.f11229h.setOnEditorActionListener(new C3337a());
        ((Button) findViewById(C3340d.okColorButton)).setOnClickListener(new View$OnClickListenerC3338b());
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (seekBar.getId() == C3340d.alphaSeekBar) {
            this.f11230i = i;
        } else if (seekBar.getId() == C3340d.redSeekBar) {
            this.f11231j = i;
        } else if (seekBar.getId() == C3340d.greenSeekBar) {
            this.f11232k = i;
        } else if (seekBar.getId() == C3340d.blueSeekBar) {
            this.f11233l = i;
        }
        this.f11224c.setBackgroundColor(mo11282f());
        this.f11229h.setText(this.f11235n ? C3335a.m13924c(this.f11230i, this.f11231j, this.f11232k, this.f11233l) : C3335a.m13923b(this.f11231j, this.f11232k, this.f11233l));
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
