package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.AsyncTask;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.DialogInterfaceC0068b;
import com.digdroid.alman.dig.C2391i;
import com.google.android.material.navigation.NavigationView;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import p006b.p057o.p058a.C1088a;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.q3 */
public class C2553q3 {

    /* renamed from: a */
    static C2774t3 f8891a;

    /* renamed from: b */
    static String f8892b;

    /* renamed from: c */
    static boolean f8893c;

    /* renamed from: com.digdroid.alman.dig.q3$a */
    class View$OnClickListenerC2554a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ Activity f8894b;

        /* renamed from: c */
        final /* synthetic */ TextView f8895c;

        /* renamed from: com.digdroid.alman.dig.q3$a$a */
        class C2555a implements C2391i.AbstractC2394b {
            C2555a() {
            }

            @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
            /* renamed from: a */
            public void mo8043a(String[] strArr) {
                View$OnClickListenerC2554a.this.f8895c.setText(strArr[0]);
            }
        }

        View$OnClickListenerC2554a(Activity activity, TextView textView) {
            this.f8894b = activity;
            this.f8895c = textView;
        }

        public void onClick(View view) {
            C2391i iVar = new C2391i(this.f8894b);
            iVar.mo8592h(new C2555a());
            iVar.mo8588d();
        }
    }

    /* renamed from: com.digdroid.alman.dig.q3$b */
    class DialogInterface$OnClickListenerC2556b implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ C2724s3 f8897b;

        /* renamed from: c */
        final /* synthetic */ EditText f8898c;

        /* renamed from: d */
        final /* synthetic */ EditText f8899d;

        /* renamed from: e */
        final /* synthetic */ EditText f8900e;

        /* renamed from: f */
        final /* synthetic */ TextView f8901f;

        /* renamed from: g */
        final /* synthetic */ CheckBox f8902g;

        /* renamed from: h */
        final /* synthetic */ Activity f8903h;

        DialogInterface$OnClickListenerC2556b(C2724s3 s3Var, EditText editText, EditText editText2, EditText editText3, TextView textView, CheckBox checkBox, Activity activity) {
            this.f8897b = s3Var;
            this.f8898c = editText;
            this.f8899d = editText2;
            this.f8900e = editText3;
            this.f8901f = textView;
            this.f8902g = checkBox;
            this.f8903h = activity;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            this.f8897b.mo8780q("author", this.f8898c.getText().toString().trim());
            this.f8897b.mo8780q("author_contact", this.f8899d.getText().toString().trim());
            this.f8897b.mo8780q("description", this.f8900e.getText().toString().trim());
            String charSequence = this.f8901f.getText().toString();
            if (charSequence.length() > 1 && charSequence.substring(0, 1).equals("/")) {
                this.f8897b.mo8782s("screenshots", charSequence);
            }
            this.f8897b.mo8776m("allow_playstore", this.f8902g.isChecked());
            C2724s3 s3Var = this.f8897b;
            s3Var.mo9216S(s3Var.f9252f.equals(C2553q3.f8891a.f9406j));
            new AsyncTaskC2558d(this.f8903h, this.f8897b).execute(new Void[0]);
        }
    }

    /* renamed from: com.digdroid.alman.dig.q3$c */
    class C2557c implements C2391i.AbstractC2394b {

        /* renamed from: a */
        final /* synthetic */ MainActivity f8904a;

        C2557c(MainActivity mainActivity) {
            this.f8904a = mainActivity;
        }

        @Override // com.digdroid.alman.dig.C2391i.AbstractC2394b
        /* renamed from: a */
        public void mo8043a(String[] strArr) {
            new AsyncTaskC2563g(this.f8904a, strArr[0]).execute(new Void[0]);
        }
    }

    /* renamed from: com.digdroid.alman.dig.q3$d */
    static class AsyncTaskC2558d extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        Activity f8905a;

        /* renamed from: b */
        Context f8906b;

        /* renamed from: c */
        C2724s3 f8907c;

        /* renamed from: d */
        File f8908d = null;

        /* renamed from: e */
        FileInputStream f8909e = null;

        /* renamed from: f */
        BufferedInputStream f8910f = null;

        /* renamed from: g */
        FileOutputStream f8911g = null;

        /* renamed from: h */
        BufferedOutputStream f8912h = null;

        /* renamed from: i */
        ZipOutputStream f8913i = null;

        /* renamed from: j */
        C2219c3 f8914j;

        /* renamed from: k */
        HashMap<String, String> f8915k;

        public AsyncTaskC2558d(Activity activity, C2724s3 s3Var) {
            this.f8905a = activity;
            this.f8906b = activity.getApplicationContext();
            this.f8907c = s3Var;
            this.f8914j = C2219c3.m9805k(activity);
            this.f8915k = new HashMap<>();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x01a7 A[Catch:{ Exception -> 0x02d0, all -> 0x02a6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x01d4 A[Catch:{ Exception -> 0x02d0, all -> 0x02a6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0201 A[Catch:{ Exception -> 0x02d0, all -> 0x02a6 }] */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x021f A[Catch:{ Exception -> 0x02d0, all -> 0x02a6 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Boolean doInBackground(java.lang.Void... r13) {
            /*
            // Method dump skipped, instructions count: 766
            */
            throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2553q3.AsyncTaskC2558d.doInBackground(java.lang.Void[]):java.lang.Boolean");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            File file;
            if (!bool.booleanValue() && (file = this.f8908d) != null && file.exists()) {
                try {
                    this.f8908d.delete();
                } catch (Exception unused) {
                }
            }
            if (!bool.booleanValue() && !this.f8914j.f7952g) {
                try {
                    if (!this.f8905a.isFinishing()) {
                        new DialogInterfaceC0068b.C0069a(this.f8905a, C2553q3.m11117c()).mo228h(R.string.bundle_fail).mo235o(R.string.ok, null).mo224d(false).mo221a().show();
                    }
                } catch (Exception unused2) {
                }
            }
            C2553q3.m11128n(this.f8906b, null, 0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo8977c(File file, String str) {
            boolean z;
            String str2 = this.f8905a.getString(R.string.adding) + " " + file.getName();
            C2553q3.m11128n(this.f8905a, str2, 0);
            byte[] bArr = new byte[1024];
            float length = (float) file.length();
            int max = Math.max(Math.round(length / 100.0f), 10000);
            try {
                this.f8909e = new FileInputStream(file);
                this.f8910f = new BufferedInputStream(this.f8909e);
                ZipEntry zipEntry = new ZipEntry(str + "/" + file.getName());
                zipEntry.setSize(file.length());
                this.f8913i.putNextEntry(zipEntry);
                int i = 0;
                loop0:
                while (true) {
                    int i2 = 0;
                    do {
                        int read = this.f8910f.read(bArr);
                        if (read <= 0) {
                            z = true;
                            break loop0;
                        } else if (this.f8914j.f7952g) {
                            z = false;
                            break loop0;
                        } else {
                            this.f8913i.write(bArr, 0, read);
                            i += read;
                            i2 += read;
                        }
                    } while (i2 < max);
                    C2553q3.m11128n(this.f8906b, str2, Math.round((float) Math.round((((float) i) * 100.0f) / length)));
                }
                this.f8913i.closeEntry();
                BufferedInputStream bufferedInputStream = this.f8910f;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Exception unused) {
                    }
                }
                FileInputStream fileInputStream = this.f8909e;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused2) {
                    }
                }
                return z;
            } catch (Exception unused3) {
                BufferedInputStream bufferedInputStream2 = this.f8910f;
                if (bufferedInputStream2 != null) {
                    try {
                        bufferedInputStream2.close();
                    } catch (Exception unused4) {
                    }
                }
                FileInputStream fileInputStream2 = this.f8909e;
                if (fileInputStream2 == null) {
                    return false;
                }
                try {
                    fileInputStream2.close();
                    return false;
                } catch (Exception unused5) {
                    return false;
                }
            } catch (Throwable th) {
                BufferedInputStream bufferedInputStream3 = this.f8910f;
                if (bufferedInputStream3 != null) {
                    try {
                        bufferedInputStream3.close();
                    } catch (Exception unused6) {
                    }
                }
                FileInputStream fileInputStream3 = this.f8909e;
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (Exception unused7) {
                    }
                }
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo8978d(String str, String str2) {
            HashMap<String, String> hashMap;
            String I = this.f8907c.mo9208I(str);
            if (I.equals("")) {
                return true;
            }
            if (this.f8915k.containsKey(I)) {
                this.f8907c.mo8782s(str, this.f8915k.get(I));
                return true;
            }
            File file = new File(I);
            if (!file.exists()) {
                return true;
            }
            if (file.isDirectory()) {
                this.f8907c.mo8782s(str, str2);
                File[] listFiles = file.listFiles();
                for (File file2 : listFiles) {
                    if (this.f8914j.f7952g) {
                        return false;
                    }
                    if (!(file2.isDirectory() || mo8977c(file2, str2))) {
                        return false;
                    }
                }
                hashMap = this.f8915k;
            } else {
                this.f8907c.mo8782s(str, str2 + "/" + file.getName());
                if (!mo8977c(file, str2)) {
                    return false;
                }
                hashMap = this.f8915k;
                str2 = str2 + "/" + file.getName();
            }
            hashMap.put(I, str2);
            return true;
        }
    }

    /* renamed from: com.digdroid.alman.dig.q3$e */
    public interface AbstractC2559e {
        /* renamed from: a */
        void mo8981a(ArrayList<C2724s3> arrayList);
    }

    /* renamed from: com.digdroid.alman.dig.q3$f */
    static class AsyncTaskC2560f extends AsyncTask<ActivityC2220c4, Void, ArrayList<C2724s3>> {

        /* renamed from: a */
        AbstractC2559e f8916a;

        /* access modifiers changed from: package-private */
        /* renamed from: com.digdroid.alman.dig.q3$f$a */
        public class C2561a implements FilenameFilter {

            /* renamed from: a */
            final /* synthetic */ Pattern f8917a;

            C2561a(Pattern pattern) {
                this.f8917a = pattern;
            }

            public boolean accept(File file, String str) {
                return this.f8917a.matcher(str).find() && !str.equals("___tmp.cfg");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.digdroid.alman.dig.q3$f$b */
        public class C2562b implements Comparator<C2724s3> {
            C2562b() {
            }

            /* renamed from: a */
            public int compare(C2724s3 s3Var, C2724s3 s3Var2) {
                return s3Var.mo8772i("name").compareToIgnoreCase(s3Var2.mo8772i("name"));
            }
        }

        public AsyncTaskC2560f(AbstractC2559e eVar) {
            this.f8916a = eVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public ArrayList<C2724s3> doInBackground(ActivityC2220c4... c4VarArr) {
            ActivityC2220c4 c4Var = c4VarArr[0];
            ArrayList<C2724s3> arrayList = new ArrayList<>();
            String C = new C2724s3(c4Var).mo9202C();
            if (C == null) {
                return null;
            }
            File file = new File(C);
            if (!file.exists()) {
                return null;
            }
            File[] listFiles = file.listFiles(new C2561a(Pattern.compile("\\.cfg$")));
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    C2724s3 s3Var = new C2724s3(c4Var);
                    s3Var.mo9213P(file2.getName());
                    arrayList.add(s3Var);
                }
            }
            Collections.sort(arrayList, new C2562b());
            return arrayList;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(ArrayList<C2724s3> arrayList) {
            if (arrayList != null) {
                this.f8916a.mo8981a(arrayList);
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.q3$g */
    static class AsyncTaskC2563g extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        MainActivity f8920a;

        /* renamed from: b */
        Context f8921b;

        /* renamed from: c */
        String f8922c;

        /* renamed from: d */
        C2219c3 f8923d;

        /* renamed from: e */
        String f8924e = null;

        public AsyncTaskC2563g(MainActivity mainActivity, String str) {
            this.f8920a = mainActivity;
            Context applicationContext = mainActivity.getApplicationContext();
            this.f8921b = applicationContext;
            this.f8923d = C2219c3.m9805k(applicationContext);
            this.f8922c = str;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: java.io.BufferedInputStream */
        /* JADX DEBUG: Multi-variable search result rejected for r14v3, resolved type: java.io.BufferedInputStream */
        /* JADX DEBUG: Multi-variable search result rejected for r14v9, resolved type: java.io.BufferedInputStream */
        /* JADX DEBUG: Multi-variable search result rejected for r14v13, resolved type: java.io.BufferedInputStream */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(11:43|44|(2:45|(1:69)(5:48|(13:50|51|52|53|54|55|56|57|58|59|60|61|62)(1:63)|64|(2:66|157)(2:67|156)|68))|69|70|71|72|73|74|75|(2:78|79)) */
        /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
            r11.flush();
            r11.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
            r15.flush();
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
            r14.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:?, code lost:
            r13.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
            r11.flush();
            r11.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
            r15.flush();
            r15.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
            r14.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
            r13.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e3, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e4, code lost:
            r11 = r12;
            r14 = r14;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x01d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x01d7 */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x021c A[SYNTHETIC, Splitter:B:107:0x021c] */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x0226 A[SYNTHETIC, Splitter:B:111:0x0226] */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0230 A[SYNTHETIC, Splitter:B:115:0x0230] */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0237 A[SYNTHETIC, Splitter:B:119:0x0237] */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x0248 A[SYNTHETIC, Splitter:B:127:0x0248] */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x0252 A[SYNTHETIC, Splitter:B:131:0x0252] */
        /* JADX WARNING: Removed duplicated region for block: B:135:0x025c A[SYNTHETIC, Splitter:B:135:0x025c] */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x0263 A[SYNTHETIC, Splitter:B:139:0x0263] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01de A[SYNTHETIC, Splitter:B:78:0x01de] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x01e3 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:43:0x0129] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Boolean doInBackground(java.lang.Void... r23) {
            /*
            // Method dump skipped, instructions count: 638
            */
            throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2553q3.AsyncTaskC2563g.doInBackground(java.lang.Void[]):java.lang.Boolean");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            C2553q3.m11128n(this.f8921b, null, 0);
            if (!bool.booleanValue() && !this.f8923d.f7952g && !this.f8920a.isFinishing()) {
                new DialogInterfaceC0068b.C0069a(this.f8920a, C2553q3.m11117c()).mo228h(R.string.theme_install_fail).mo224d(false).mo235o(R.string.ok, null).mo221a().show();
            }
            if (bool.booleanValue()) {
                C1088a.m6129b(this.f8921b).mo5723d(new Intent(this.f8921b.getPackageName() + "." + "request_refresh"));
                return;
            }
            String str = this.f8924e;
            if (str != null) {
                new C2724s3(this.f8920a, str).mo9228u();
            }
        }
    }

    /* renamed from: a */
    static void m11115a(Activity activity, C2724s3 s3Var) {
        View inflate = activity.getLayoutInflater().inflate(R.layout.theme_meta, (ViewGroup) null);
        EditText editText = (EditText) inflate.findViewById(R.id.name_edit);
        editText.setText(s3Var.mo8771h("author", ""));
        EditText editText2 = (EditText) inflate.findViewById(R.id.contact_edit);
        editText2.setText(s3Var.mo8771h("author_contact", ""));
        EditText editText3 = (EditText) inflate.findViewById(R.id.comments_edit);
        editText3.setText(s3Var.mo8771h("description", ""));
        TextView textView = (TextView) inflate.findViewById(R.id.screenshots_edit);
        String I = s3Var.mo9208I("screenshots");
        if (!I.equals("")) {
            textView.setText(I);
        }
        textView.setOnClickListener(new View$OnClickListenerC2554a(activity, textView));
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.allow_playstore);
        checkBox.setChecked(s3Var.mo8766c("allow_playstore", true));
        new DialogInterfaceC0068b.C0069a(activity).mo238r(R.string.theme_meta_title).mo240t(inflate).mo232l(R.string.cancel, null).mo235o(R.string.ok, new DialogInterface$OnClickListenerC2556b(s3Var, editText, editText2, editText3, textView, checkBox, activity)).mo221a().show();
    }

    /* renamed from: b */
    static int m11116b() {
        return f8891a.mo9320d();
    }

    /* renamed from: c */
    static int m11117c() {
        return f8891a.mo9321e();
    }

    /* renamed from: d */
    static float m11118d(float f) {
        return f8891a.f9397a.mo9230x(f);
    }

    /* renamed from: e */
    static float m11119e(float f) {
        return f8891a.f9397a.mo9231y(f);
    }

    /* renamed from: f */
    public static void m11120f(ActivityC2220c4 c4Var) {
        C2219c3 k = C2219c3.m9805k(c4Var);
        f8893c = k.mo8197u();
        C2724s3 s3Var = new C2724s3(c4Var, "black.cfg");
        if (!s3Var.mo9232z()) {
            s3Var.mo8773j("themes/black.cfg");
            s3Var.mo8782s("name", c4Var.getString(R.string.black));
            s3Var.mo9215R();
        }
        C2724s3 s3Var2 = new C2724s3(c4Var, "white.cfg");
        if (!s3Var2.mo9232z()) {
            s3Var2.mo8773j("themes/white.cfg");
            s3Var2.mo8782s("name", c4Var.getString(R.string.white));
            s3Var2.mo9215R();
        }
        C2724s3 s3Var3 = new C2724s3(c4Var, "grey.cfg");
        if (!s3Var3.mo9232z()) {
            s3Var3.mo8773j("themes/grey.cfg");
            s3Var3.mo8782s("name", c4Var.getString(R.string.grey));
            s3Var3.mo9215R();
        }
        C2724s3 s3Var4 = new C2724s3(c4Var, "darkblue.cfg");
        if (!s3Var4.mo9232z()) {
            s3Var4.mo8773j("themes/darkblue.cfg");
            s3Var4.mo8782s("name", c4Var.getString(R.string.blue_covers));
            s3Var4.mo9215R();
        }
        String q = k.mo8193q("theme_file", "black.cfg");
        f8892b = q;
        f8891a = new C2774t3(c4Var, q);
    }

    /* renamed from: g */
    public static StateListDrawable m11121g(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(m11122h(i));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, colorDrawable);
        stateListDrawable.addState(new int[]{16843623}, colorDrawable);
        stateListDrawable.addState(new int[]{16842908}, colorDrawable);
        stateListDrawable.addState(StateSet.WILD_CARD, new ColorDrawable(0));
        return stateListDrawable;
    }

    /* renamed from: h */
    public static int m11122h(int i) {
        return m11123i(i, 64);
    }

    /* renamed from: i */
    public static int m11123i(int i, int i2) {
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 8) & 255;
        int i5 = i & 255;
        return (i5 >= 128 ? i5 - i2 : i5 + i2) | Integer.MIN_VALUE | ((i3 >= 128 ? i3 - i2 : i3 + i2) << 16) | ((i4 >= 128 ? i4 - i2 : i4 + i2) << 8);
    }

    /* renamed from: j */
    static void m11124j(ActivityC2220c4 c4Var, AbstractC2559e eVar) {
        new AsyncTaskC2560f(eVar).execute(c4Var);
    }

    /* renamed from: k */
    static float m11125k(C2774t3 t3Var) {
        return 1.0f - (((float) ((t3Var.f9399c >> 24) & 255)) / 255.0f);
    }

    /* renamed from: l */
    static void m11126l(MainActivity mainActivity) {
        C2391i iVar = new C2391i(mainActivity);
        iVar.mo8591g(true);
        iVar.mo8592h(new C2557c(mainActivity));
        iVar.mo8588d();
    }

    /* renamed from: m */
    static int m11127m() {
        return -10066330;
    }

    /* renamed from: n */
    static void m11128n(Context context, String str, int i) {
        try {
            Intent intent = new Intent(context.getPackageName() + "." + "PROGRESS_UPDATE");
            intent.putExtra("label", str);
            intent.putExtra("progress", i);
            C1088a.m6129b(context).mo5723d(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: o */
    public static void m11129o(Context context, String str) {
        C2724s3 s3Var;
        C2219c3 k = C2219c3.m9805k(context);
        C2774t3 t3Var = f8891a;
        if (!(t3Var == null || (s3Var = t3Var.f9397a) == null)) {
            s3Var.mo9215R();
            k.mo8153B("new_theme_set", true);
        }
        f8892b = str;
        k.mo8202z("theme_file", str);
    }

    /* renamed from: p */
    public static void m11130p(C2774t3 t3Var) {
        t3Var.f9397a = f8891a.f9397a;
        f8891a = t3Var;
    }

    /* renamed from: q */
    public static void m11131q(View view) {
        m11132r(view, f8891a.f9399c);
    }

    /* renamed from: r */
    public static void m11132r(View view, int i) {
        StateListDrawable g = m11121g(i);
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(g);
        } else {
            view.setBackgroundDrawable(g);
        }
    }

    /* renamed from: s */
    public static void m11133s(TextView textView) {
        textView.setTextColor(f8891a.mo9320d());
        m11132r(textView, f8891a.mo9318b());
    }

    /* renamed from: t */
    public static void m11134t(Context context, NavigationView navigationView) {
        Resources resources = context.getResources();
        int color = resources.getColor(R.color.navBackgroundDark);
        navigationView.setBackgroundColor(color);
        navigationView.setItemBackground(m11121g(color));
        navigationView.setItemTextColor(resources.getColorStateList(R.color.nav_text_dark));
        navigationView.setItemIconTintList(resources.getColorStateList(R.color.nav_icon_dark));
    }

    /* renamed from: u */
    static float m11135u(float f) {
        return f8891a.f9397a.mo9225b0(f);
    }

    /* renamed from: v */
    static int m11136v() {
        return f8891a.mo9317a();
    }

    /* renamed from: w */
    static int m11137w() {
        return f8891a.f9398b;
    }
}
