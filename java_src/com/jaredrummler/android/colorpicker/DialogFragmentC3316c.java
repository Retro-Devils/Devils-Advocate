package com.jaredrummler.android.colorpicker;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import com.jaredrummler.android.colorpicker.C3311b;
import com.jaredrummler.android.colorpicker.ColorPickerView;
import java.util.Arrays;
import java.util.Locale;
import p006b.p030g.p031d.C0901a;

/* renamed from: com.jaredrummler.android.colorpicker.c */
public class DialogFragmentC3316c extends DialogFragment implements View.OnTouchListener, ColorPickerView.AbstractC3309c, TextWatcher {

    /* renamed from: b */
    public static final int[] f11136b = {-769226, -1499549, -54125, -6543440, -10011977, -12627531, -14575885, -16537100, -16728876, -16738680, -11751600, -7617718, -3285959, -5317, -16121, -26624, -8825528, -10453621, -6381922};

    /* renamed from: c */
    AbstractC3327d f11137c;

    /* renamed from: d */
    FrameLayout f11138d;

    /* renamed from: e */
    int[] f11139e;

    /* renamed from: f */
    int f11140f;

    /* renamed from: g */
    int f11141g;

    /* renamed from: h */
    int f11142h;

    /* renamed from: i */
    boolean f11143i;

    /* renamed from: j */
    int f11144j;

    /* renamed from: k */
    C3311b f11145k;

    /* renamed from: l */
    LinearLayout f11146l;

    /* renamed from: m */
    SeekBar f11147m;

    /* renamed from: n */
    TextView f11148n;

    /* renamed from: o */
    private int f11149o;

    /* renamed from: p */
    ColorPickerView f11150p;

    /* renamed from: q */
    ColorPanelView f11151q;

    /* renamed from: r */
    EditText f11152r;

    /* renamed from: s */
    boolean f11153s;

    /* renamed from: t */
    private boolean f11154t;

    /* renamed from: u */
    private int f11155u;

    /* renamed from: com.jaredrummler.android.colorpicker.c$a */
    class DialogInterface$OnClickListenerC3317a implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC3317a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            DialogFragmentC3316c cVar = DialogFragmentC3316c.this;
            cVar.f11137c.mo8707w0(cVar.f11142h, cVar.f11140f);
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.c$b */
    class View$OnClickListenerC3318b implements View.OnClickListener {
        View$OnClickListenerC3318b() {
        }

        public void onClick(View view) {
            View view2;
            FrameLayout frameLayout;
            DialogFragmentC3316c.this.f11138d.removeAllViews();
            DialogFragmentC3316c cVar = DialogFragmentC3316c.this;
            int i = cVar.f11141g;
            if (i == 0) {
                cVar.f11141g = 1;
                ((Button) view).setText(cVar.f11155u != 0 ? DialogFragmentC3316c.this.f11155u : C3333j.cpv_custom);
                DialogFragmentC3316c cVar2 = DialogFragmentC3316c.this;
                frameLayout = cVar2.f11138d;
                view2 = cVar2.mo11256f();
            } else if (i == 1) {
                cVar.f11141g = 0;
                ((Button) view).setText(cVar.f11149o != 0 ? DialogFragmentC3316c.this.f11149o : C3333j.cpv_presets);
                DialogFragmentC3316c cVar3 = DialogFragmentC3316c.this;
                frameLayout = cVar3.f11138d;
                view2 = cVar3.mo11255e();
            } else {
                return;
            }
            frameLayout.addView(view2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.jaredrummler.android.colorpicker.c$c */
    public class View$OnClickListenerC3319c implements View.OnClickListener {
        View$OnClickListenerC3319c() {
        }

        public void onClick(View view) {
            int color = DialogFragmentC3316c.this.f11151q.getColor();
            DialogFragmentC3316c cVar = DialogFragmentC3316c.this;
            int i = cVar.f11140f;
            if (color == i) {
                cVar.f11137c.mo8707w0(cVar.f11142h, i);
                DialogFragmentC3316c.this.dismiss();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.jaredrummler.android.colorpicker.c$d */
    public class View$OnFocusChangeListenerC3320d implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC3320d() {
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                ((InputMethodManager) DialogFragmentC3316c.this.getActivity().getSystemService("input_method")).showSoftInput(DialogFragmentC3316c.this.f11152r, 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.jaredrummler.android.colorpicker.c$e */
    public class C3321e implements C3311b.AbstractC3312a {
        C3321e() {
        }

        @Override // com.jaredrummler.android.colorpicker.C3311b.AbstractC3312a
        /* renamed from: a */
        public void mo11248a(int i) {
            DialogFragmentC3316c cVar = DialogFragmentC3316c.this;
            int i2 = cVar.f11140f;
            if (i2 == i) {
                cVar.f11137c.mo8707w0(cVar.f11142h, i2);
                DialogFragmentC3316c.this.dismiss();
                return;
            }
            cVar.f11140f = i;
            if (cVar.f11143i) {
                cVar.mo11254d(i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.jaredrummler.android.colorpicker.c$f */
    public class RunnableC3322f implements Runnable {

        /* renamed from: b */
        final /* synthetic */ ColorPanelView f11161b;

        /* renamed from: c */
        final /* synthetic */ int f11162c;

        RunnableC3322f(ColorPanelView colorPanelView, int i) {
            this.f11161b = colorPanelView;
            this.f11162c = i;
        }

        public void run() {
            this.f11161b.setColor(this.f11162c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.jaredrummler.android.colorpicker.c$g */
    public class View$OnClickListenerC3323g implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ ColorPanelView f11164b;

        View$OnClickListenerC3323g(ColorPanelView colorPanelView) {
            this.f11164b = colorPanelView;
        }

        public void onClick(View view) {
            if (!(view.getTag() instanceof Boolean) || !((Boolean) view.getTag()).booleanValue()) {
                DialogFragmentC3316c.this.f11140f = this.f11164b.getColor();
                DialogFragmentC3316c.this.f11145k.mo11243a();
                for (int i = 0; i < DialogFragmentC3316c.this.f11146l.getChildCount(); i++) {
                    FrameLayout frameLayout = (FrameLayout) DialogFragmentC3316c.this.f11146l.getChildAt(i);
                    ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(C3331h.cpv_color_panel_view);
                    ImageView imageView = (ImageView) frameLayout.findViewById(C3331h.cpv_color_image_view);
                    imageView.setImageResource(colorPanelView == view ? C3330g.cpv_preset_checked : 0);
                    if ((colorPanelView != view || C0901a.m5294b(colorPanelView.getColor()) < 0.65d) && Color.alpha(colorPanelView.getColor()) > 165) {
                        imageView.setColorFilter((ColorFilter) null);
                    } else {
                        imageView.setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
                    }
                    colorPanelView.setTag(Boolean.valueOf(colorPanelView == view));
                }
                return;
            }
            DialogFragmentC3316c cVar = DialogFragmentC3316c.this;
            cVar.f11137c.mo8707w0(cVar.f11142h, cVar.f11140f);
            DialogFragmentC3316c.this.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.jaredrummler.android.colorpicker.c$h */
    public class View$OnLongClickListenerC3324h implements View.OnLongClickListener {

        /* renamed from: b */
        final /* synthetic */ ColorPanelView f11166b;

        View$OnLongClickListenerC3324h(ColorPanelView colorPanelView) {
            this.f11166b = colorPanelView;
        }

        public boolean onLongClick(View view) {
            this.f11166b.mo11201d();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.jaredrummler.android.colorpicker.c$i */
    public class C3325i implements SeekBar.OnSeekBarChangeListener {
        C3325i() {
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C3311b bVar;
            double d = (double) i;
            Double.isNaN(d);
            DialogFragmentC3316c.this.f11148n.setText(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf((int) ((d * 100.0d) / 255.0d))));
            int i2 = 255 - i;
            int i3 = 0;
            while (true) {
                bVar = DialogFragmentC3316c.this.f11145k;
                int[] iArr = bVar.f11125c;
                if (i3 >= iArr.length) {
                    break;
                }
                int i4 = iArr[i3];
                DialogFragmentC3316c.this.f11145k.f11125c[i3] = Color.argb(i2, Color.red(i4), Color.green(i4), Color.blue(i4));
                i3++;
            }
            bVar.notifyDataSetChanged();
            for (int i5 = 0; i5 < DialogFragmentC3316c.this.f11146l.getChildCount(); i5++) {
                FrameLayout frameLayout = (FrameLayout) DialogFragmentC3316c.this.f11146l.getChildAt(i5);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(C3331h.cpv_color_panel_view);
                ImageView imageView = (ImageView) frameLayout.findViewById(C3331h.cpv_color_image_view);
                if (frameLayout.getTag() == null) {
                    frameLayout.setTag(Integer.valueOf(colorPanelView.getBorderColor()));
                }
                int color = colorPanelView.getColor();
                int argb = Color.argb(i2, Color.red(color), Color.green(color), Color.blue(color));
                colorPanelView.setBorderColor(i2 <= 165 ? argb | -16777216 : ((Integer) frameLayout.getTag()).intValue());
                if (colorPanelView.getTag() != null && ((Boolean) colorPanelView.getTag()).booleanValue()) {
                    if (i2 > 165 && C0901a.m5294b(argb) < 0.65d) {
                        imageView.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
                    } else {
                        imageView.setColorFilter(-16777216, PorterDuff.Mode.SRC_IN);
                    }
                }
                colorPanelView.setColor(argb);
            }
            DialogFragmentC3316c.this.f11140f = Color.argb(i2, Color.red(DialogFragmentC3316c.this.f11140f), Color.green(DialogFragmentC3316c.this.f11140f), Color.blue(DialogFragmentC3316c.this.f11140f));
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* renamed from: com.jaredrummler.android.colorpicker.c$j */
    public static final class C3326j {

        /* renamed from: a */
        int f11169a = C3333j.cpv_default_title;

        /* renamed from: b */
        int f11170b = C3333j.cpv_presets;

        /* renamed from: c */
        int f11171c = C3333j.cpv_custom;

        /* renamed from: d */
        int f11172d = C3333j.cpv_select;

        /* renamed from: e */
        int f11173e = 1;

        /* renamed from: f */
        int[] f11174f = DialogFragmentC3316c.f11136b;

        /* renamed from: g */
        int f11175g = -16777216;

        /* renamed from: h */
        int f11176h = 0;

        /* renamed from: i */
        boolean f11177i = false;

        /* renamed from: j */
        boolean f11178j = true;

        /* renamed from: k */
        boolean f11179k = true;

        /* renamed from: l */
        boolean f11180l = true;

        /* renamed from: m */
        int f11181m = 1;

        C3326j() {
        }

        /* renamed from: a */
        public DialogFragmentC3316c mo11274a() {
            DialogFragmentC3316c cVar = new DialogFragmentC3316c();
            Bundle bundle = new Bundle();
            bundle.putInt("id", this.f11176h);
            bundle.putInt("dialogType", this.f11173e);
            bundle.putInt("color", this.f11175g);
            bundle.putIntArray("presets", this.f11174f);
            bundle.putBoolean("alpha", this.f11177i);
            bundle.putBoolean("allowCustom", this.f11179k);
            bundle.putBoolean("allowPresets", this.f11178j);
            bundle.putInt("dialogTitle", this.f11169a);
            bundle.putBoolean("showColorShades", this.f11180l);
            bundle.putInt("colorShape", this.f11181m);
            bundle.putInt("presetsButtonText", this.f11170b);
            bundle.putInt("customButtonText", this.f11171c);
            bundle.putInt("selectedButtonText", this.f11172d);
            cVar.setArguments(bundle);
            return cVar;
        }

        /* renamed from: b */
        public C3326j mo11275b(boolean z) {
            this.f11178j = z;
            return this;
        }

        /* renamed from: c */
        public C3326j mo11276c(int i) {
            this.f11175g = i;
            return this;
        }

        /* renamed from: d */
        public C3326j mo11277d(int i) {
            this.f11169a = i;
            return this;
        }

        /* renamed from: e */
        public C3326j mo11278e(int i) {
            this.f11173e = i;
            return this;
        }

        /* renamed from: f */
        public C3326j mo11279f(boolean z) {
            this.f11177i = z;
            return this;
        }

        /* renamed from: g */
        public void mo11280g(Activity activity) {
            mo11274a().show(activity.getFragmentManager(), "color-picker-dialog");
        }
    }

    /* renamed from: g */
    private int[] m13896g(int i) {
        return new int[]{m13904o(i, 0.9d), m13904o(i, 0.7d), m13904o(i, 0.5d), m13904o(i, 0.333d), m13904o(i, 0.166d), m13904o(i, -0.125d), m13904o(i, -0.25d), m13904o(i, -0.375d), m13904o(i, -0.5d), m13904o(i, -0.675d), m13904o(i, -0.7d), m13904o(i, -0.775d)};
    }

    /* renamed from: h */
    private int m13897h() {
        int i = 0;
        while (true) {
            int[] iArr = this.f11139e;
            if (i >= iArr.length) {
                return -1;
            }
            if (iArr[i] == this.f11140f) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: i */
    private void m13898i() {
        int alpha = Color.alpha(this.f11140f);
        int[] intArray = getArguments().getIntArray("presets");
        this.f11139e = intArray;
        if (intArray == null) {
            this.f11139e = f11136b;
        }
        int[] iArr = this.f11139e;
        boolean z = iArr == f11136b;
        this.f11139e = Arrays.copyOf(iArr, iArr.length);
        if (alpha != 255) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.f11139e;
                if (i >= iArr2.length) {
                    break;
                }
                int i2 = iArr2[i];
                this.f11139e[i] = Color.argb(alpha, Color.red(i2), Color.green(i2), Color.blue(i2));
                i++;
            }
        }
        int[] p = m13905p(this.f11139e, this.f11140f);
        this.f11139e = p;
        if (z && p.length == 19) {
            this.f11139e = m13901l(p, Color.argb(alpha, 0, 0, 0));
        }
    }

    /* renamed from: j */
    public static C3326j m13899j() {
        return new C3326j();
    }

    /* renamed from: k */
    private int m13900k(String str) {
        int i;
        int i2;
        int parseInt;
        String substring;
        if (str.startsWith("#")) {
            str = str.substring(1);
        }
        int i3 = -1;
        int i4 = 0;
        if (str.length() == 0) {
            i = 0;
        } else if (str.length() <= 2) {
            i = Integer.parseInt(str, 16);
        } else {
            if (str.length() == 3) {
                parseInt = Integer.parseInt(str.substring(0, 1), 16);
                i2 = Integer.parseInt(str.substring(1, 2), 16);
                substring = str.substring(2, 3);
            } else if (str.length() == 4) {
                int parseInt2 = Integer.parseInt(str.substring(0, 2), 16);
                i = Integer.parseInt(str.substring(2, 4), 16);
                i2 = parseInt2;
                i3 = 255;
                return Color.argb(i3, i4, i2, i);
            } else if (str.length() == 5) {
                parseInt = Integer.parseInt(str.substring(0, 1), 16);
                i2 = Integer.parseInt(str.substring(1, 3), 16);
                substring = str.substring(3, 5);
            } else if (str.length() == 6) {
                parseInt = Integer.parseInt(str.substring(0, 2), 16);
                i2 = Integer.parseInt(str.substring(2, 4), 16);
                substring = str.substring(4, 6);
            } else {
                if (str.length() == 7) {
                    i3 = Integer.parseInt(str.substring(0, 1), 16);
                    int parseInt3 = Integer.parseInt(str.substring(1, 3), 16);
                    int parseInt4 = Integer.parseInt(str.substring(3, 5), 16);
                    i = Integer.parseInt(str.substring(5, 7), 16);
                    i4 = parseInt3;
                    i2 = parseInt4;
                } else if (str.length() == 8) {
                    i3 = Integer.parseInt(str.substring(0, 2), 16);
                    int parseInt5 = Integer.parseInt(str.substring(2, 4), 16);
                    int parseInt6 = Integer.parseInt(str.substring(4, 6), 16);
                    i = Integer.parseInt(str.substring(6, 8), 16);
                    i4 = parseInt5;
                    i2 = parseInt6;
                } else {
                    i = -1;
                    i2 = -1;
                    i4 = -1;
                }
                return Color.argb(i3, i4, i2, i);
            }
            i = Integer.parseInt(substring, 16);
            i4 = parseInt;
            i3 = 255;
            return Color.argb(i3, i4, i2, i);
        }
        i2 = 0;
        i3 = 255;
        return Color.argb(i3, i4, i2, i);
    }

    /* renamed from: l */
    private int[] m13901l(int[] iArr, int i) {
        boolean z;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (iArr[i2] == i) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            return iArr;
        }
        int length2 = iArr.length + 1;
        int[] iArr2 = new int[length2];
        int i3 = length2 - 1;
        iArr2[i3] = i;
        System.arraycopy(iArr, 0, iArr2, 0, i3);
        return iArr2;
    }

    /* renamed from: m */
    private void m13902m(int i) {
        String str;
        EditText editText;
        if (this.f11153s) {
            editText = this.f11152r;
            str = String.format("%08X", Integer.valueOf(i));
        } else {
            editText = this.f11152r;
            str = String.format("%06X", Integer.valueOf(i & 16777215));
        }
        editText.setText(str);
    }

    /* renamed from: n */
    private void m13903n() {
        int alpha = 255 - Color.alpha(this.f11140f);
        this.f11147m.setMax(255);
        this.f11147m.setProgress(alpha);
        double d = (double) alpha;
        Double.isNaN(d);
        this.f11148n.setText(String.format(Locale.ENGLISH, "%d%%", Integer.valueOf((int) ((d * 100.0d) / 255.0d))));
        this.f11147m.setOnSeekBarChangeListener(new C3325i());
    }

    /* renamed from: o */
    private int m13904o(int i, double d) {
        long parseLong = Long.parseLong(String.format("#%06X", Integer.valueOf(16777215 & i)).substring(1), 16);
        double d2 = d < 0.0d ? 0.0d : 255.0d;
        if (d < 0.0d) {
            d *= -1.0d;
        }
        long j = parseLong >> 16;
        long j2 = (parseLong >> 8) & 255;
        long j3 = parseLong & 255;
        int alpha = Color.alpha(i);
        double d3 = (double) j;
        Double.isNaN(d3);
        int round = (int) (Math.round((d2 - d3) * d) + j);
        double d4 = (double) j2;
        Double.isNaN(d4);
        double d5 = (double) j3;
        Double.isNaN(d5);
        return Color.argb(alpha, round, (int) (Math.round((d2 - d4) * d) + j2), (int) (Math.round((d2 - d5) * d) + j3));
    }

    /* renamed from: p */
    private int[] m13905p(int[] iArr, int i) {
        boolean z;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (iArr[i2] == i) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            return iArr;
        }
        int length2 = iArr.length + 1;
        int[] iArr2 = new int[length2];
        iArr2[0] = i;
        System.arraycopy(iArr, 0, iArr2, 1, length2 - 1);
        return iArr2;
    }

    @Override // com.jaredrummler.android.colorpicker.ColorPickerView.AbstractC3309c
    /* renamed from: a */
    public void mo11236a(int i) {
        this.f11140f = i;
        this.f11151q.setColor(i);
        if (!this.f11154t) {
            m13902m(i);
            if (this.f11152r.hasFocus()) {
                ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f11152r.getWindowToken(), 0);
                this.f11152r.clearFocus();
            }
        }
        this.f11154t = false;
    }

    public void afterTextChanged(Editable editable) {
        int k;
        if (this.f11152r.isFocused() && (k = m13900k(editable.toString())) != this.f11150p.getColor()) {
            this.f11154t = true;
            this.f11150p.mo11222n(k, true);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo11254d(int i) {
        int[] g = m13896g(i);
        int i2 = 0;
        if (this.f11146l.getChildCount() != 0) {
            while (i2 < this.f11146l.getChildCount()) {
                FrameLayout frameLayout = (FrameLayout) this.f11146l.getChildAt(i2);
                ColorPanelView colorPanelView = (ColorPanelView) frameLayout.findViewById(C3331h.cpv_color_panel_view);
                colorPanelView.setColor(g[i2]);
                colorPanelView.setTag(Boolean.FALSE);
                ((ImageView) frameLayout.findViewById(C3331h.cpv_color_image_view)).setImageDrawable(null);
                i2++;
            }
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C3329f.cpv_item_horizontal_padding);
        int length = g.length;
        while (i2 < length) {
            int i3 = g[i2];
            View inflate = View.inflate(getActivity(), this.f11144j == 0 ? C3332i.cpv_color_item_square : C3332i.cpv_color_item_circle, null);
            ColorPanelView colorPanelView2 = (ColorPanelView) inflate.findViewById(C3331h.cpv_color_panel_view);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) colorPanelView2.getLayoutParams();
            marginLayoutParams.rightMargin = dimensionPixelSize;
            marginLayoutParams.leftMargin = dimensionPixelSize;
            colorPanelView2.setLayoutParams(marginLayoutParams);
            colorPanelView2.setColor(i3);
            this.f11146l.addView(inflate);
            colorPanelView2.post(new RunnableC3322f(colorPanelView2, i3));
            colorPanelView2.setOnClickListener(new View$OnClickListenerC3323g(colorPanelView2));
            colorPanelView2.setOnLongClickListener(new View$OnLongClickListenerC3324h(colorPanelView2));
            i2++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo11255e() {
        View inflate = View.inflate(getActivity(), C3332i.cpv_dialog_color_picker, null);
        this.f11150p = (ColorPickerView) inflate.findViewById(C3331h.cpv_color_picker_view);
        ColorPanelView colorPanelView = (ColorPanelView) inflate.findViewById(C3331h.cpv_color_panel_old);
        this.f11151q = (ColorPanelView) inflate.findViewById(C3331h.cpv_color_panel_new);
        ImageView imageView = (ImageView) inflate.findViewById(C3331h.cpv_arrow_right);
        this.f11152r = (EditText) inflate.findViewById(C3331h.cpv_hex);
        try {
            TypedValue typedValue = new TypedValue();
            TypedArray obtainStyledAttributes = getActivity().obtainStyledAttributes(typedValue.data, new int[]{16842806});
            int color = obtainStyledAttributes.getColor(0, -16777216);
            obtainStyledAttributes.recycle();
            imageView.setColorFilter(color);
        } catch (Exception unused) {
        }
        this.f11150p.setAlphaSliderVisible(this.f11153s);
        colorPanelView.setColor(getArguments().getInt("color"));
        this.f11150p.mo11222n(this.f11140f, true);
        this.f11151q.setColor(this.f11140f);
        m13902m(this.f11140f);
        if (!this.f11153s) {
            this.f11152r.setFilters(new InputFilter[]{new InputFilter.LengthFilter(6)});
        }
        this.f11151q.setOnClickListener(new View$OnClickListenerC3319c());
        inflate.setOnTouchListener(this);
        this.f11150p.setOnColorChangedListener(this);
        this.f11152r.addTextChangedListener(this);
        this.f11152r.setOnFocusChangeListener(new View$OnFocusChangeListenerC3320d());
        return inflate;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View mo11256f() {
        View inflate = View.inflate(getActivity(), C3332i.cpv_dialog_presets, null);
        this.f11146l = (LinearLayout) inflate.findViewById(C3331h.shades_layout);
        this.f11147m = (SeekBar) inflate.findViewById(C3331h.transparency_seekbar);
        this.f11148n = (TextView) inflate.findViewById(C3331h.transparency_text);
        GridView gridView = (GridView) inflate.findViewById(C3331h.gridView);
        m13898i();
        if (this.f11143i) {
            mo11254d(this.f11140f);
        } else {
            this.f11146l.setVisibility(8);
            inflate.findViewById(C3331h.shades_divider).setVisibility(8);
        }
        C3311b bVar = new C3311b(new C3321e(), this.f11139e, m13897h(), this.f11144j);
        this.f11145k = bVar;
        gridView.setAdapter((ListAdapter) bVar);
        if (this.f11153s) {
            m13903n();
        } else {
            inflate.findViewById(C3331h.transparency_layout).setVisibility(8);
            inflate.findViewById(C3331h.transparency_title).setVisibility(8);
        }
        return inflate;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (this.f11137c == null && (activity instanceof AbstractC3327d)) {
            this.f11137c = (AbstractC3327d) activity;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(android.os.Bundle r4) {
        /*
        // Method dump skipped, instructions count: 249
        */
        throw new UnsupportedOperationException("Method not decompiled: com.jaredrummler.android.colorpicker.DialogFragmentC3316c.onCreateDialog(android.os.Bundle):android.app.Dialog");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f11137c.mo8706n0(this.f11142h);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("color", this.f11140f);
        bundle.putInt("dialogType", this.f11141g);
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        DialogInterfaceC0068b bVar = (DialogInterfaceC0068b) getDialog();
        bVar.getWindow().clearFlags(131080);
        bVar.getWindow().setSoftInputMode(4);
        Button e = bVar.mo215e(-3);
        if (e != null) {
            e.setOnClickListener(new View$OnClickListenerC3318b());
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        EditText editText = this.f11152r;
        if (view == editText || !editText.hasFocus()) {
            return false;
        }
        this.f11152r.clearFocus();
        ((InputMethodManager) getActivity().getSystemService("input_method")).hideSoftInputFromWindow(this.f11152r.getWindowToken(), 0);
        this.f11152r.clearFocus();
        return true;
    }
}
