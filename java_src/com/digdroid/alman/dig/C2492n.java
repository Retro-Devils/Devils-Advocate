package com.digdroid.alman.dig;

import android.content.Context;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.n */
public class C2492n {

    /* renamed from: a */
    Context f8639a;

    /* renamed from: b */
    String f8640b;

    /* renamed from: c */
    boolean f8641c;

    /* renamed from: d */
    HashMap<String, String> f8642d = null;

    /* renamed from: e */
    private AbstractC2493a f8643e = null;

    /* renamed from: com.digdroid.alman.dig.n$a */
    public interface AbstractC2493a {
    }

    public C2492n(Context context) {
        this.f8639a = context.getApplicationContext();
        this.f8640b = "";
        this.f8641c = true;
    }

    public C2492n(C2492n nVar) {
        this.f8639a = nVar.f8639a;
        this.f8641c = nVar.f8641c;
        this.f8640b = nVar.f8640b;
        if (nVar.f8642d != null) {
            this.f8642d = new HashMap<>();
            for (Map.Entry<String, String> entry : nVar.f8642d.entrySet()) {
                this.f8642d.put(entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: b */
    private void m10683b() {
        if (!this.f8640b.equals("")) {
            String str = this.f8640b;
            if (!str.substring(str.length() - 1).equals("\n")) {
                this.f8640b += "\n";
            }
        }
    }

    /* renamed from: a */
    public void mo8765a(String str) {
        HashMap<String, String> hashMap = this.f8642d;
        if (hashMap != null && hashMap.containsKey(str)) {
            this.f8642d.remove(str);
        }
    }

    /* renamed from: c */
    public boolean mo8766c(String str, boolean z) {
        String i = mo8772i(str);
        return i.equals("") ? z : i.equalsIgnoreCase("true");
    }

    /* renamed from: d */
    public String mo8767d() {
        StringBuilder sb;
        String str;
        HashMap<String, String> hashMap = this.f8642d;
        if (hashMap != null) {
            this.f8640b = "";
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (this.f8641c) {
                    sb = new StringBuilder();
                    sb.append(this.f8640b);
                    sb.append(key);
                    sb.append(" = \"");
                    sb.append(value);
                    str = "\"\n";
                } else {
                    sb = new StringBuilder();
                    sb.append(this.f8640b);
                    sb.append(key);
                    sb.append("=");
                    sb.append(value);
                    str = "\n";
                }
                sb.append(str);
                this.f8640b = sb.toString();
            }
        }
        return this.f8640b;
    }

    /* renamed from: e */
    public float mo8768e(String str, float f) {
        String i = mo8772i(str);
        if (i.equals("")) {
            return f;
        }
        try {
            return Float.parseFloat(i);
        } catch (Exception unused) {
            return f;
        }
    }

    /* renamed from: f */
    public int mo8769f(String str, int i) {
        String i2 = mo8772i(str);
        if (i2.equals("")) {
            return i;
        }
        try {
            return (int) Long.parseLong(i2, 16);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: g */
    public int mo8770g(String str, int i) {
        String i2 = mo8772i(str);
        if (i2.equals("")) {
            return i;
        }
        try {
            return Integer.parseInt(i2);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: h */
    public String mo8771h(String str, String str2) {
        try {
            return URLDecoder.decode(mo8772i(str), "UTF-8");
        } catch (Exception unused) {
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public String mo8772i(String str) {
        HashMap<String, String> hashMap = this.f8642d;
        if (hashMap != null) {
            return hashMap.containsKey(str) ? this.f8642d.get(str) : "";
        }
        Matcher matcher = Pattern.compile(str + "\\s*\\=\\s*\\\"([^\\\"]+)\\\"").matcher(this.f8640b);
        return matcher.find() ? matcher.group(1) : "";
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[SYNTHETIC, Splitter:B:20:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8773j(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0047, all -> 0x0040 }
            r1.<init>()     // Catch:{ IOException -> 0x0047, all -> 0x0040 }
            android.content.Context r2 = r4.f8639a     // Catch:{ IOException -> 0x0047, all -> 0x0040 }
            android.content.res.AssetManager r2 = r2.getAssets()     // Catch:{ IOException -> 0x0047, all -> 0x0040 }
            java.io.InputStream r5 = r2.open(r5)     // Catch:{ IOException -> 0x0047, all -> 0x0040 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0047, all -> 0x0040 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0047, all -> 0x0040 }
            r3.<init>(r5)     // Catch:{ IOException -> 0x0047, all -> 0x0040 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0047, all -> 0x0040 }
            r5 = 1
        L_0x001b:
            java.lang.String r0 = r2.readLine()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            if (r0 == 0) goto L_0x002e
            if (r5 == 0) goto L_0x0025
            r5 = 0
            goto L_0x002a
        L_0x0025:
            r3 = 10
            r1.append(r3)     // Catch:{ IOException -> 0x003e, all -> 0x003b }
        L_0x002a:
            r1.append(r0)     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            goto L_0x001b
        L_0x002e:
            java.lang.String r5 = r1.toString()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r4.f8640b = r5     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r4.m10683b()     // Catch:{ IOException -> 0x003e, all -> 0x003b }
            r2.close()     // Catch:{ IOException -> 0x004d }
            goto L_0x004d
        L_0x003b:
            r5 = move-exception
            r0 = r2
            goto L_0x0041
        L_0x003e:
            r0 = r2
            goto L_0x0048
        L_0x0040:
            r5 = move-exception
        L_0x0041:
            if (r0 == 0) goto L_0x0046
            r0.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            throw r5
        L_0x0047:
        L_0x0048:
            if (r0 == 0) goto L_0x004d
            r0.close()
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2492n.mo8773j(java.lang.String):void");
    }

    /* renamed from: k */
    public void mo8774k(C2399i2 i2Var) {
        if (i2Var == null) {
            this.f8640b = "";
            return;
        }
        long length = i2Var.length();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(i2Var.mo8606i());
            char[] cArr = new char[((int) length)];
            int read = inputStreamReader.read(cArr);
            inputStreamReader.close();
            this.f8640b = new String(cArr, 0, read);
            m10683b();
        } catch (Exception unused) {
            this.f8640b = "";
        }
    }

    /* renamed from: l */
    public void mo8775l() {
        this.f8642d = new HashMap<>();
        String[] split = this.f8640b.split("\\n");
        Pattern compile = Pattern.compile("^(\\w+)\\s*\\=\\s*\\\"([^\\\"]+)\\\"");
        for (String str : split) {
            Matcher matcher = compile.matcher(str);
            if (matcher.find()) {
                this.f8642d.put(matcher.group(1), matcher.group(2));
            }
        }
        this.f8640b = null;
    }

    /* renamed from: m */
    public void mo8776m(String str, boolean z) {
        mo8782s(str, z ? "true" : "false");
    }

    /* renamed from: n */
    public void mo8777n(String str, float f) {
        mo8782s(str, "" + f);
    }

    /* renamed from: o */
    public void mo8778o(String str, int i) {
        mo8782s(str, Integer.toHexString(i));
    }

    /* renamed from: p */
    public void mo8779p(String str, int i) {
        mo8782s(str, "" + i);
    }

    /* renamed from: q */
    public void mo8780q(String str, String str2) {
        try {
            mo8782s(str, URLEncoder.encode(str2, "UTF-8"));
        } catch (Exception unused) {
            mo8782s(str, "");
        }
    }

    /* renamed from: r */
    public boolean mo8781r(String str) {
        mo8767d();
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(C2399i2.m10374d(this.f8639a, str).mo8608j());
            outputStreamWriter.write(this.f8640b);
            outputStreamWriter.flush();
            outputStreamWriter.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: s */
    public void mo8782s(String str, String str2) {
        String str3;
        StringBuilder sb;
        HashMap<String, String> hashMap = this.f8642d;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else if (!mo8772i(str).equals(str2)) {
            if (this.f8641c) {
                sb = new StringBuilder();
                sb.append(" = \"");
                sb.append(str2);
                str3 = "\"\n";
            } else {
                sb = new StringBuilder();
                sb.append("=");
                sb.append(str2);
                str3 = "\n";
            }
            sb.append(str3);
            String sb2 = sb.toString();
            String replaceAll = this.f8640b.replaceAll(str + "\\s*\\=[^\\n]*\\n", str + sb2);
            if (replaceAll.equals(this.f8640b)) {
                replaceAll = replaceAll + str + sb2;
            }
            this.f8640b = replaceAll;
        }
    }

    /* renamed from: t */
    public void mo8783t(boolean z) {
        this.f8641c = z;
    }
}
