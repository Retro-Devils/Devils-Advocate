package com.digdroid.alman.dig;

import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import com.digdroid.alman.dig.C2391i;
import java.util.ArrayList;

/* renamed from: com.digdroid.alman.dig.r */
class C2564r extends BaseAdapter {

    /* renamed from: b */
    private final Activity f8925b;

    /* renamed from: c */
    private C2774t3 f8926c;

    /* renamed from: d */
    private C2724s3 f8927d;

    /* renamed from: e */
    String f8928e;

    /* renamed from: f */
    int[] f8929f;

    /* renamed from: g */
    String[] f8930g = C2690s.f9183o0;

    /* renamed from: h */
    int[] f8931h = C2690s.f9182n0;

    /* renamed from: i */
    LayoutInflater f8932i;

    /* renamed from: com.digdroid.alman.dig.r$a */
    class C2565a implements TextWatcher {

        /* renamed from: b */
        final /* synthetic */ int f8933b;

        C2565a(int i) {
            this.f8933b = i;
        }

        public void afterTextChanged(Editable editable) {
            String trim = editable.toString().trim();
            if (!trim.equals("")) {
                C2564r.this.f8927d.mo8782s(C2564r.this.f8930g[this.f8933b], trim);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.digdroid.alman.dig.r$b */
    class C2566b implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ Spinner f8935b;

        /* renamed from: c */
        final /* synthetic */ int f8936c;

        /* renamed from: com.digdroid.alman.dig.r$b$a */
        class C2567a implements C2391i.AbstractC2394b {
            C2567a() {
            }

            @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
            /* renamed from: a */
            public void mo8043a(String[] strArr) {
                C2724s3 s3Var = C2564r.this.f8927d;
                C2566b bVar = C2566b.this;
                C2564r rVar = C2564r.this;
                s3Var.mo8782s(rVar.mo8994c(rVar.f8930g[bVar.f8936c]), "file");
                C2564r.this.f8927d.mo8782s(C2564r.this.mo8994c("media_path"), strArr[0]);
                C2564r.this.notifyDataSetChanged();
                C2564r.this.mo8995d();
            }
        }

        /* renamed from: com.digdroid.alman.dig.r$b$b */
        class C2568b implements C2391i.AbstractC2394b {
            C2568b() {
            }

            @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
            /* renamed from: a */
            public void mo8043a(String[] strArr) {
                C2724s3 s3Var = C2564r.this.f8927d;
                C2566b bVar = C2566b.this;
                C2564r rVar = C2564r.this;
                s3Var.mo8782s(rVar.mo8994c(rVar.f8930g[bVar.f8936c]), "folder");
                C2564r.this.f8927d.mo8782s(C2564r.this.mo8994c("media_path"), strArr[0]);
                C2564r.this.notifyDataSetChanged();
                C2564r.this.mo8995d();
            }
        }

        C2566b(Spinner spinner, int i) {
            this.f8935b = spinner;
            this.f8936c = i;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != ((Integer) this.f8935b.getTag()).intValue()) {
                if (i == 0) {
                    C2724s3 s3Var = C2564r.this.f8927d;
                    C2564r rVar = C2564r.this;
                    s3Var.mo8782s(rVar.mo8994c(rVar.f8930g[this.f8936c]), "none");
                } else if (i == 1) {
                    C2391i iVar = new C2391i(C2564r.this.f8925b);
                    iVar.mo8593i(C2564r.this.f8925b.getString(R.string.choose_media_file));
                    iVar.mo8591g(true);
                    iVar.mo8592h(new C2567a());
                    iVar.mo8588d();
                } else if (i == 2) {
                    C2391i iVar2 = new C2391i(C2564r.this.f8925b);
                    iVar2.mo8593i(C2564r.this.f8925b.getString(R.string.choose_media_folder));
                    iVar2.mo8592h(new C2568b());
                    iVar2.mo8588d();
                } else if (i == 3) {
                    C2724s3 s3Var2 = C2564r.this.f8927d;
                    C2564r rVar2 = C2564r.this;
                    s3Var2.mo8782s(rVar2.mo8994c(rVar2.f8930g[this.f8936c]), "covers");
                    C2564r.this.mo8995d();
                }
                C2564r.this.notifyDataSetChanged();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.digdroid.alman.dig.r$c */
    class C2569c implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ Spinner f8940b;

        /* renamed from: c */
        final /* synthetic */ int f8941c;

        C2569c(Spinner spinner, int i) {
            this.f8940b = spinner;
            this.f8941c = i;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C2724s3 s3Var;
            String c;
            String str;
            if (i != ((Integer) this.f8940b.getTag()).intValue()) {
                if (i == 0) {
                    s3Var = C2564r.this.f8927d;
                    C2564r rVar = C2564r.this;
                    c = rVar.mo8994c(rVar.f8930g[this.f8941c]);
                    str = "fillscreen";
                } else if (i == 1) {
                    s3Var = C2564r.this.f8927d;
                    C2564r rVar2 = C2564r.this;
                    c = rVar2.mo8994c(rVar2.f8930g[this.f8941c]);
                    str = "fitmedia";
                } else {
                    return;
                }
                s3Var.mo8782s(c, str);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.digdroid.alman.dig.r$d */
    class C2570d implements TextWatcher {

        /* renamed from: b */
        final /* synthetic */ int f8943b;

        C2570d(int i) {
            this.f8943b = i;
        }

        public void afterTextChanged(Editable editable) {
            try {
                int parseInt = Integer.parseInt(editable.toString().trim());
                if (parseInt > 0) {
                    C2724s3 s3Var = C2564r.this.f8927d;
                    C2564r rVar = C2564r.this;
                    s3Var.mo8779p(rVar.mo8994c(rVar.f8930g[this.f8943b]), parseInt);
                }
            } catch (Exception unused) {
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.digdroid.alman.dig.r$e */
    class C2571e implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ Spinner f8945b;

        /* renamed from: c */
        final /* synthetic */ int f8946c;

        /* renamed from: com.digdroid.alman.dig.r$e$a */
        class C2572a implements C2391i.AbstractC2394b {
            C2572a() {
            }

            @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
            /* renamed from: a */
            public void mo8043a(String[] strArr) {
                C2724s3 s3Var = C2564r.this.f8927d;
                C2571e eVar = C2571e.this;
                C2564r rVar = C2564r.this;
                s3Var.mo8782s(rVar.mo8994c(rVar.f8930g[eVar.f8946c]), "file");
                C2564r.this.f8927d.mo8782s(C2564r.this.mo8994c("sound_path"), strArr[0]);
                C2564r.this.notifyDataSetChanged();
            }
        }

        /* renamed from: com.digdroid.alman.dig.r$e$b */
        class C2573b implements C2391i.AbstractC2394b {
            C2573b() {
            }

            @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
            /* renamed from: a */
            public void mo8043a(String[] strArr) {
                C2724s3 s3Var = C2564r.this.f8927d;
                C2571e eVar = C2571e.this;
                C2564r rVar = C2564r.this;
                s3Var.mo8782s(rVar.mo8994c(rVar.f8930g[eVar.f8946c]), "folder");
                C2564r.this.f8927d.mo8782s(C2564r.this.mo8994c("sound_path"), strArr[0]);
                C2564r.this.notifyDataSetChanged();
            }
        }

        C2571e(Spinner spinner, int i) {
            this.f8945b = spinner;
            this.f8946c = i;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != ((Integer) this.f8945b.getTag()).intValue()) {
                if (i == 0) {
                    C2724s3 s3Var = C2564r.this.f8927d;
                    C2564r rVar = C2564r.this;
                    s3Var.mo8782s(rVar.mo8994c(rVar.f8930g[this.f8946c]), "none");
                } else if (i == 1) {
                    C2391i iVar = new C2391i(C2564r.this.f8925b);
                    iVar.mo8593i(C2564r.this.f8925b.getString(R.string.choose_media_file));
                    iVar.mo8591g(true);
                    iVar.mo8592h(new C2572a());
                    iVar.mo8588d();
                } else if (i == 2) {
                    C2391i iVar2 = new C2391i(C2564r.this.f8925b);
                    iVar2.mo8593i(C2564r.this.f8925b.getString(R.string.choose_media_folder));
                    iVar2.mo8592h(new C2573b());
                    iVar2.mo8588d();
                }
                C2564r.this.notifyDataSetChanged();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r$f */
    public class C2574f implements AdapterView.OnItemSelectedListener {

        /* renamed from: b */
        final /* synthetic */ Spinner f8950b;

        /* renamed from: c */
        final /* synthetic */ String f8951c;

        /* renamed from: d */
        final /* synthetic */ boolean f8952d;

        /* renamed from: com.digdroid.alman.dig.r$f$a */
        class C2575a implements C2391i.AbstractC2394b {
            C2575a() {
            }

            @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
            /* renamed from: a */
            public void mo8043a(String[] strArr) {
                C2564r.this.f8927d.mo8782s(C2574f.this.f8951c, strArr[0]);
                C2564r.this.notifyDataSetChanged();
            }
        }

        C2574f(Spinner spinner, String str, boolean z) {
            this.f8950b = spinner;
            this.f8951c = str;
            this.f8952d = z;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != ((Integer) this.f8950b.getTag()).intValue()) {
                if (i == 0) {
                    C2564r.this.f8927d.mo8782s(this.f8951c, "");
                } else if (i == 1) {
                    C2391i iVar = new C2391i(C2564r.this.f8925b);
                    iVar.mo8591g(this.f8952d);
                    iVar.mo8592h(new C2575a());
                    iVar.mo8588d();
                }
                C2564r.this.notifyDataSetChanged();
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public C2564r(Activity activity, C2774t3 t3Var, C2724s3 s3Var, String str, int[] iArr) {
        this.f8925b = activity;
        this.f8926c = t3Var;
        this.f8927d = s3Var;
        this.f8928e = str;
        this.f8929f = iArr;
        this.f8932i = (LayoutInflater) activity.getSystemService("layout_inflater");
    }

    public boolean areAllItemsEnabled() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo8994c(String str) {
        if (this.f8928e.equals("default")) {
            return str;
        }
        return this.f8928e + "_" + str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo8995d() {
        if ((this.f8927d.mo8769f(mo8994c(this.f8930g[9]), 0) & -16777216) == -16777216) {
            new DialogInterfaceC0068b.C0069a(this.f8925b, C2553q3.m11117c()).mo228h(R.string.inform_background).mo235o(R.string.ok, null).mo221a().show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo8996e(ViewGroup viewGroup, String str, int i, boolean z) {
        View inflate = this.f8932i.inflate(R.layout.custom_theme_media, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.custom_media);
        textView.setText(i);
        textView.setTextColor(this.f8926c.f9401e);
        TextView textView2 = (TextView) inflate.findViewById(R.id.media_path);
        if (!this.f8927d.mo8772i(str).equals("")) {
            textView2.setVisibility(0);
            textView2.setTextColor(this.f8926c.f9403g);
            textView2.setText(this.f8927d.mo8772i(str));
        } else {
            textView2.setVisibility(8);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f8925b.getString(R.string.none));
        arrayList.add(this.f8925b.getString(z ? R.string.file : R.string.folder));
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.f8925b, 17367048, arrayList);
        arrayAdapter.setDropDownViewResource(17367049);
        Spinner spinner = (Spinner) inflate.findViewById(R.id.custom_media_spinner);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        int i2 = !this.f8927d.mo8772i(str).equals("");
        spinner.setTag(Integer.valueOf(i2));
        spinner.setSelection(i2);
        spinner.setOnItemSelectedListener(new C2574f(spinner, str, z));
        return inflate;
    }

    public int getCount() {
        int[] iArr = this.f8929f;
        if (iArr == null) {
            return 0;
        }
        return iArr.length;
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0423  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
        /*
        // Method dump skipped, instructions count: 1138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2564r.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public boolean isEnabled(int i) {
        return true;
    }
}
