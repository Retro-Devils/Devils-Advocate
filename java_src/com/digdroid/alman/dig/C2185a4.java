package com.digdroid.alman.dig;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import java.io.File;
import java.io.FileReader;
import java.nio.ByteBuffer;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.digdroid.alman.dig.a4 */
public class C2185a4 {
    /* renamed from: A */
    static File m9663A(Context context) {
        return m9664B(context, Build.VERSION.SDK_INT == 30);
    }

    /* renamed from: B */
    static File m9664B(Context context, boolean z) {
        File[] listFiles;
        if (z) {
            try {
                C2399i2 d = m9674d(context);
                if (d == null || (listFiles = d.listFiles()) == null) {
                    return null;
                }
                for (File file : listFiles) {
                    if (file.getName().equalsIgnoreCase("tmp")) {
                        return file;
                    }
                }
                C2399i2 i2Var = new C2399i2(d, "tmp");
                if (!i2Var.exists()) {
                    i2Var.mkdirs();
                }
                return i2Var;
            } catch (Exception unused) {
            }
        } else {
            String[] d2 = C2372h2.m10300d(context);
            if (!(d2 == null || d2.length == 0)) {
                String q = C2219c3.m9805k(context).mo8193q("temp_storage_dir", d2[0]);
                File externalFilesDir = context.getExternalFilesDir(null);
                if (externalFilesDir == null) {
                    return null;
                }
                File file2 = new File(externalFilesDir.getAbsolutePath().replace(d2[0], q) + "/tmp");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                return file2;
            }
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|(5:7|8|9|10|(4:11|12|13|14))|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005d, code lost:
        if (r2 == null) goto L_0x0060;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0037 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004a A[SYNTHETIC, Splitter:B:27:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0051 A[SYNTHETIC, Splitter:B:31:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0058 A[SYNTHETIC, Splitter:B:38:0x0058] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m9665C(android.content.Context r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2185a4.m9665C(android.content.Context, java.lang.String):void");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: D */
    public static int m9666D(MainActivity mainActivity) {
        char c;
        C2219c3 k = C2219c3.m9805k(mainActivity);
        String str = C2219c3.m9805k(mainActivity).f7963j;
        str.hashCode();
        switch (str.hashCode()) {
            case -1372576080:
                if (str.equals("icons_top")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1454535408:
                if (str.equals("icons_bottom")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1544803905:
                if (str.equals("default")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                Point g = mainActivity.mo8203g(true);
                float min = ((float) Math.min(g.x, g.y)) / k.mo8183f("icons_toolbar_scale", 10.0f);
                return Math.round((1.25f * min) + (min * k.mo8183f("toolbar_icons_padding", 0.0f)));
            case 2:
                TypedArray obtainStyledAttributes = mainActivity.obtainStyledAttributes(new int[]{R.attr.actionBarSize});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                return dimensionPixelSize;
            default:
                return 0;
        }
    }

    /* renamed from: E */
    public static String m9667E(String str) {
        return str.replaceAll("&quot;", "\"").replaceAll("&amp;", "&").replaceAll("&lt;", "<").replaceAll("&gt;", ">").replaceAll("\\&apos\\;", "'");
    }

    /* renamed from: F */
    static void m9668F(Context context, String str) {
        if (context != null) {
            try {
                File filesDir = context.getFilesDir();
                File file = new File(filesDir, str + ".lock");
                if (file.exists()) {
                    file.delete();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: G */
    public static void m9669G(Context context) {
        m9668F(context, "restore");
    }

    /* renamed from: H */
    public static void m9670H(Context context) {
        m9668F(context, "services");
    }

    /* renamed from: a */
    static String m9671a(byte[] bArr, int i) {
        char[] charArray = "0123456789abcdef".toCharArray();
        char[] cArr = new char[(i * 2)];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = i2 * 2;
            cArr[i4] = charArray[i3 >>> 4];
            cArr[i4 + 1] = charArray[i3 & 15];
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:? */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.io.BufferedInputStream */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: java.io.BufferedInputStream */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:28|29|30|31|32|(2:33|(1:35)(1:95))|36|37|38|39|40|41|42|43|44|105) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|15|16|99) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:(2:21|22)|23|24|25|26|101) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x002e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0031 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0052 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0055 */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0078 A[SYNTHETIC, Splitter:B:62:0x0078] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x007f A[SYNTHETIC, Splitter:B:66:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0086 A[SYNTHETIC, Splitter:B:70:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x008d A[SYNTHETIC, Splitter:B:74:0x008d] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0096 A[SYNTHETIC, Splitter:B:82:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x009d A[SYNTHETIC, Splitter:B:86:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00a4 A[SYNTHETIC, Splitter:B:90:0x00a4] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m9672b(android.content.Context r5, java.lang.String r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2185a4.m9672b(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: c */
    public static synchronized void m9673c(Context context) {
        synchronized (C2185a4.class) {
            if (context != null) {
                C2883y3.m11943y(context).mo9501D(0);
                File filesDir = context.getFilesDir();
                if (filesDir != null) {
                    File file = new File(filesDir, "tmpfiles.txt");
                    if (file.exists()) {
                        long length = file.length();
                        try {
                            FileReader fileReader = new FileReader(file);
                            char[] cArr = new char[((int) length)];
                            int read = fileReader.read(cArr);
                            fileReader.close();
                            String[] split = new String(cArr, 0, read).split(":");
                            ArrayList arrayList = new ArrayList();
                            for (String str : split) {
                                if (!str.equals("")) {
                                    File file2 = new File(str);
                                    if (file2.exists()) {
                                        try {
                                            file2.delete();
                                        } catch (Exception unused) {
                                            arrayList.add(str);
                                        }
                                    }
                                }
                            }
                            try {
                                file.delete();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    m9665C(context, (String) it.next());
                                }
                            } catch (Exception unused2) {
                            }
                        } catch (Exception unused3) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    static C2399i2 m9674d(Context context) {
        String q = C2219c3.m9805k(context).mo8193q("dig_dir", null);
        if (q == null) {
            return null;
        }
        return C2399i2.m10374d(context, q);
    }

    /* renamed from: e */
    public static int m9675e(Context context, float f) {
        return Math.round(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[SYNTHETIC, Splitter:B:11:0x0024] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m9676f(com.digdroid.alman.dig.C2399i2 r5) {
        /*
            long r0 = r5.length()
            r2 = 0
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0021 }
            java.io.InputStream r5 = r5.mo8606i()     // Catch:{ Exception -> 0x0021 }
            r3.<init>(r5)     // Catch:{ Exception -> 0x0021 }
            int r5 = (int) r0
            char[] r5 = new char[r5]     // Catch:{ Exception -> 0x001f }
            int r0 = r3.read(r5)     // Catch:{ Exception -> 0x001f }
            r3.close()     // Catch:{ Exception -> 0x001f }
            java.lang.String r1 = new java.lang.String     // Catch:{ Exception -> 0x001f }
            r4 = 0
            r1.<init>(r5, r4, r0)     // Catch:{ Exception -> 0x001f }
            return r1
        L_0x001f:
            goto L_0x0022
        L_0x0021:
            r3 = r2
        L_0x0022:
            if (r3 == 0) goto L_0x0027
            r3.close()     // Catch:{ Exception -> 0x0027 }
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2185a4.m9676f(com.digdroid.alman.dig.i2):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x005d A[SYNTHETIC, Splitter:B:24:0x005d] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m9677g(java.lang.String r6) {
        /*
            r0 = 46
            int r0 = r6.lastIndexOf(r0)
            r1 = 0
            r2 = 2
            if (r0 < r2) goto L_0x0060
            int r0 = r0 + 1
            java.lang.String r0 = r6.substring(r0)
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r2 = "chd"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x001d
            goto L_0x0060
        L_0x001d:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x005a }
            r0.<init>(r6)     // Catch:{ Exception -> 0x005a }
            r6 = 200(0xc8, float:2.8E-43)
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x0058 }
            r2 = 12
            r3 = 0
            r0.read(r6, r3, r2)     // Catch:{ Exception -> 0x0058 }
            r2 = 4
            r0.read(r6, r3, r2)     // Catch:{ Exception -> 0x0058 }
            r4 = 3
            byte r5 = r6[r4]     // Catch:{ Exception -> 0x0058 }
            if (r5 == r4) goto L_0x0044
            if (r5 == r2) goto L_0x0041
            r2 = 5
            if (r5 == r2) goto L_0x003e
            r0.close()     // Catch:{ Exception -> 0x0058 }
            return r1
        L_0x003e:
            r2 = 84
            goto L_0x0046
        L_0x0041:
            r2 = 48
            goto L_0x0046
        L_0x0044:
            r2 = 80
        L_0x0046:
            int r2 = r2 + -16
            r0.read(r6, r3, r2)     // Catch:{ Exception -> 0x0058 }
            r2 = 20
            r0.read(r6, r3, r2)     // Catch:{ Exception -> 0x0058 }
            r0.close()     // Catch:{ Exception -> 0x0058 }
            java.lang.String r6 = m9671a(r6, r2)     // Catch:{ Exception -> 0x0058 }
            return r6
        L_0x0058:
            goto L_0x005b
        L_0x005a:
            r0 = r1
        L_0x005b:
            if (r0 == 0) goto L_0x0060
            r0.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2185a4.m9677g(java.lang.String):java.lang.String");
    }

    /* renamed from: h */
    public static String m9678h(Context context) {
        try {
            String i = m9679i(context);
            return i == null ? "" : i;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: i */
    public static String m9679i(Context context) {
        if (context == null) {
            return "";
        }
        C2219c3 k = C2219c3.m9805k(context);
        int l = k.mo8188l("cover_storage", -1);
        if (l == -1) {
            l = k.mo8177Z() ? 2 : 1;
        }
        if (l == 0) {
            return k.mo8193q("cover_dir", "");
        }
        File[] b = C2372h2.m10298b(context);
        return (l != 2 || b == null || b.length <= 1 || b[1] == null) ? (b == null || b.length <= 0 || b[0] == null) ? "" : b[0].getAbsolutePath() : b[1].getAbsolutePath();
    }

    /* renamed from: j */
    public static String m9680j(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf < 2 ? "" : str.substring(lastIndexOf + 1);
    }

    /* renamed from: k */
    public static Point m9681k(Activity activity) {
        Point point = new Point();
        C2219c3 k = C2219c3.m9805k(activity);
        if (k.mo8180c("aspect_ratio_hack", false) || Build.VERSION.SDK_INT < 17 || (!k.mo8180c("hide_navbar", false) && k.mo8188l("orientation", 0) != 3)) {
            activity.getWindowManager().getDefaultDisplay().getSize(point);
        } else {
            activity.getWindowManager().getDefaultDisplay().getRealSize(point);
        }
        return point;
    }

    /* renamed from: l */
    static byte[] m9682l(String str) {
        if (str.length() % 2 == 1) {
            str = "0" + str;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int parseInt = Integer.parseInt(str.substring(i2, i2 + 2), 16);
            if (parseInt > 127) {
                parseInt -= 256;
            }
            bArr[i] = (byte) (parseInt & 255);
        }
        return bArr;
    }

    /* renamed from: m */
    static boolean m9683m(Context context, String str) {
        if (context == null) {
            return false;
        }
        File filesDir = context.getFilesDir();
        return new File(filesDir, str + ".lock").exists();
    }

    /* renamed from: n */
    public static boolean m9684n(String str, String str2) {
        return m9680j(str).equalsIgnoreCase(str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e A[SYNTHETIC, Splitter:B:15:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m9685o(android.content.Context r4, java.lang.String r5) {
        /*
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            r3.<init>()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            r3.append(r5)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.String r5 = ".lock"
            r3.append(r5)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.String r5 = r3.toString()     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            r2.<init>(r4, r5)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0052, all -> 0x004b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0049, all -> 0x0046 }
            r4.<init>()     // Catch:{ Exception -> 0x0049, all -> 0x0046 }
            java.lang.String r5 = ""
            r4.append(r5)     // Catch:{ Exception -> 0x0049, all -> 0x0046 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0049, all -> 0x0046 }
            r4.append(r2)     // Catch:{ Exception -> 0x0049, all -> 0x0046 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0049, all -> 0x0046 }
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x0049, all -> 0x0046 }
            r1.write(r4)     // Catch:{ Exception -> 0x0049, all -> 0x0046 }
            r1.close()     // Catch:{ Exception -> 0x0049, all -> 0x0046 }
            r1.close()     // Catch:{ Exception -> 0x0058 }
            goto L_0x0058
        L_0x0046:
            r4 = move-exception
            r0 = r1
            goto L_0x004c
        L_0x0049:
            r0 = r1
            goto L_0x0053
        L_0x004b:
            r4 = move-exception
        L_0x004c:
            if (r0 == 0) goto L_0x0051
            r0.close()     // Catch:{ Exception -> 0x0051 }
        L_0x0051:
            throw r4
        L_0x0052:
        L_0x0053:
            if (r0 == 0) goto L_0x0058
            r0.close()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2185a4.m9685o(android.content.Context, java.lang.String):void");
    }

    /* renamed from: p */
    public static void m9686p(Context context) {
        m9685o(context, "restore");
    }

    /* renamed from: q */
    public static void m9687q(Context context) {
        m9685o(context, "services");
    }

    /* renamed from: r */
    static String m9688r(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j);
        return Base64.encodeToString(allocate.array(), 11);
    }

    /* renamed from: s */
    public static boolean m9689s(Context context, String str) {
        for (ApplicationInfo applicationInfo : context.getPackageManager().getInstalledApplications(0)) {
            if (applicationInfo.packageName.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public static long m9690t(String str) {
        SimpleDateFormat simpleDateFormat;
        if (Pattern.compile("^\\d\\d\\d\\d$").matcher(str).find()) {
            simpleDateFormat = new SimpleDateFormat("yyyy");
        } else if (Pattern.compile("^\\d\\d/\\d\\d/\\d\\d\\d\\d$").matcher(str).find()) {
            simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        } else if (Pattern.compile("^\\d\\d\\d\\d/\\d\\d/\\d\\d$").matcher(str).find()) {
            simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        } else if (Pattern.compile("^\\d\\d\\d\\d-\\d\\d-\\d\\d \\d\\d:\\d\\d:\\d\\d$").matcher(str).find()) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        } else {
            Matcher matcher = Pattern.compile("(\\d\\d\\d\\d)").matcher(str);
            if (matcher.find()) {
                str = matcher.group(1);
                simpleDateFormat = new SimpleDateFormat("yyyy");
            }
            return 0;
        }
        try {
            return simpleDateFormat.parse(str).getTime();
        } catch (Exception unused) {
        }
    }

    /* renamed from: u */
    public static void m9691u(Activity activity) {
        if (activity != null && !activity.isFinishing()) {
            Intent intent = activity.getIntent();
            intent.setFlags(268468224);
            activity.finish();
            activity.startActivity(intent);
        }
    }

    /* renamed from: v */
    public static boolean m9692v(Context context) {
        return m9683m(context, "restore");
    }

    /* renamed from: w */
    public static String m9693w(String str) {
        return str.replaceAll("[^\\w\\. \\(\\)]", "").trim();
    }

    /* renamed from: x */
    public static boolean m9694x(Context context) {
        return m9683m(context, "services");
    }

    /* renamed from: y */
    public static void m9695y(Activity activity, int i, String str) {
        if (activity != null) {
            String h = m9678h(activity);
            String g = C2399i2.m10374d(activity, h).mo8601g();
            C2219c3 k = C2219c3.m9805k(activity);
            k.mo8156E("cover_storage", i);
            if (i == 0) {
                k.mo8158G("cover_dir", str);
            }
            if (!g.equals(C2399i2.m10374d(activity, m9678h(activity)).mo8601g())) {
                C2749t1.m11663p(activity).mo9266a(activity, h, m9678h(activity));
            }
        }
    }

    /* renamed from: z */
    public static String m9696z(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
    }
}
