package com.digdroid.alman.dig;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.digdroid.alman.dig.AbstractC2531p1;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p069c.p070a.p071a.C1245p;
import p069c.p070a.p071a.C1252u;
import p069c.p070a.p071a.p072w.C1275n;

/* renamed from: com.digdroid.alman.dig.c */
public class C2209c extends AbstractC2531p1 {

    /* renamed from: n0 */
    MyListView f7923n0;

    /* renamed from: o0 */
    JSONArray f7924o0;

    /* renamed from: p0 */
    C2213d f7925p0;

    /* renamed from: q0 */
    String f7926q0;

    /* renamed from: com.digdroid.alman.dig.c$a */
    class C2210a implements AdapterView.OnItemClickListener {
        C2210a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C2213d dVar;
            boolean z;
            if (!C2209c.this.f7925p0.mo8134a(i)) {
                dVar = C2209c.this.f7925p0;
                z = true;
            } else {
                try {
                    AbstractC2531p1.AbstractC2532a aVar = C2209c.this.f8806m0;
                    aVar.mo8304z("https://digdroid.com/forums/discussion/" + C2209c.this.f7924o0.getJSONObject(i).getLong("DiscussionID"));
                } catch (Exception unused) {
                }
                dVar = C2209c.this.f7925p0;
                z = false;
            }
            dVar.mo8136c(i, z);
        }
    }

    /* renamed from: com.digdroid.alman.dig.c$b */
    class C2211b implements C1245p.AbstractC1247b<String> {
        C2211b() {
        }

        /* renamed from: b */
        public void mo6226a(String str) {
            if (str != null) {
                C2209c.this.mo8124g3(str);
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.c$c */
    class C2212c implements C1245p.AbstractC1246a {
        C2212c() {
        }

        @Override // p069c.p070a.p071a.C1245p.AbstractC1246a
        /* renamed from: a */
        public void mo6225a(C1252u uVar) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.c$d */
    public class C2213d extends BaseAdapter {

        /* renamed from: b */
        JSONArray f7930b;

        /* renamed from: c */
        boolean[] f7931c;

        /* renamed from: d */
        LayoutInflater f7932d;

        public C2213d(Context context, JSONArray jSONArray) {
            this.f7930b = jSONArray;
            this.f7931c = new boolean[jSONArray.length()];
            this.f7932d = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public boolean mo8134a(int i) {
            return this.f7931c[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public String mo8135b(String str) {
            String str2;
            StringBuilder sb;
            int lastIndexOf;
            Pattern compile = Pattern.compile("\\\"url\\\":\\\"(.*?)\\\"");
            try {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                str2 = "";
                for (int i = 0; i < length; i++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        if (jSONObject.has("attributes")) {
                            if (jSONObject.getJSONObject("attributes").has("list") && (lastIndexOf = str2.lastIndexOf("\n")) > 0) {
                                sb = new StringBuilder();
                                sb.append(str2.substring(0, lastIndexOf));
                                sb.append("!@#");
                                sb.append(str2.substring(lastIndexOf + 1));
                                sb.append("\n");
                            }
                        } else {
                            if (jSONObject.has("insert")) {
                                String string = jSONObject.getString("insert");
                                Matcher matcher = compile.matcher(string);
                                if (matcher.find()) {
                                    str2 = str2 + matcher.group(1).replaceAll("\\\\", "");
                                } else {
                                    sb = new StringBuilder();
                                    sb.append(str2);
                                    sb.append(string);
                                }
                            }
                        }
                        str2 = sb.toString();
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                str2 = "";
            }
            return str2.replaceAll("\n+", "\n\n").replaceAll("\n*$", "").replaceAll("\\!\\@\\#", "\n\n• ");
        }

        /* renamed from: c */
        public void mo8136c(int i, boolean z) {
            this.f7931c[i] = z;
            notifyDataSetChanged();
        }

        public int getCount() {
            return this.f7930b.length();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            int i2 = 0;
            View inflate = this.f7932d.inflate(R.layout.announcement, viewGroup, false);
            try {
                JSONObject jSONObject = this.f7930b.getJSONObject(i);
                long t = C2185a4.m9690t(jSONObject.getString("DateInserted"));
                Calendar.getInstance().setTimeInMillis(t);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM d, yyyy");
                TextView textView = (TextView) inflate.findViewById(R.id.date);
                textView.setText(simpleDateFormat.format(new Date(t)));
                textView.setTextColor(C2209c.this.f8800g0.f9401e & -855638017);
                TextView textView2 = (TextView) inflate.findViewById(R.id.title);
                textView2.setText(jSONObject.getString("Name"));
                textView2.setTextColor(C2209c.this.f8800g0.f9402f);
                TextView textView3 = (TextView) inflate.findViewById(R.id.body);
                textView3.setText(mo8135b(jSONObject.getString("Body")));
                textView3.setTextColor(C2209c.this.f8800g0.f9401e);
                if (!this.f7931c[i]) {
                    i2 = 8;
                }
                textView3.setVisibility(i2);
            } catch (Exception unused) {
            }
            return inflate;
        }
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
    public void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
        this.f7926q0 = bundle == null ? null : bundle.getString("announcements");
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
        View inflate = layoutInflater.inflate(R.layout.announcements, viewGroup, false);
        MyListView myListView = (MyListView) inflate.findViewById(R.id.announcements);
        this.f7923n0 = myListView;
        myListView.setDivider(new ColorDrawable(this.f8800g0.f9401e & 1090519039));
        this.f7923n0.setDividerHeight(C2185a4.m9675e(mo2575j0(), 1.5f));
        this.f7923n0.setOnItemClickListener(new C2210a());
        return inflate;
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
    /* renamed from: g3 */
    public void mo8124g3(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("announcements")) {
                this.f7926q0 = str;
                this.f7924o0 = jSONObject.getJSONArray("announcements");
                C2213d dVar = new C2213d(mo2575j0(), this.f7924o0);
                this.f7925p0 = dVar;
                this.f7923n0.setAdapter((ListAdapter) dVar);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: k1 */
    public /* bridge */ /* synthetic */ boolean mo2579k1(MenuItem menuItem) {
        return super.mo2579k1(menuItem);
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment
    /* renamed from: m1 */
    public /* bridge */ /* synthetic */ void mo2585m1() {
        super.mo2585m1();
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
        if (this.f8793Z.mo8198v()) {
            this.f7926q0 = null;
        }
        this.f8793Z.mo8176Y();
        mo8118X2(mo2501D0(R.string.announcements));
        String str = this.f7926q0;
        if (str != null) {
            mo8124g3(str);
            return;
        }
        try {
            C2490m2.m10682a(mo2552c0()).mo6218a(new C1275n(ServerService.f7700b + "/announcements.txt", new C2211b(), new C2212c()));
        } catch (Exception unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: s1 */
    public void mo2603s1(Bundle bundle) {
        bundle.putString("announcements", this.f7926q0);
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
        return "announcements";
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
}
