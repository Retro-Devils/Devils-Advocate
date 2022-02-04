package com.digdroid.alman.dig;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import java.io.BufferedInputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: com.digdroid.alman.dig.g */
public class C2318g {

    /* renamed from: a */
    private AbstractC2319a f8187a = null;

    /* renamed from: b */
    private AbstractC2321c f8188b = null;

    /* renamed from: c */
    Context f8189c;

    /* renamed from: com.digdroid.alman.dig.g$a */
    public interface AbstractC2319a {
        /* renamed from: a */
        void mo7932a(boolean z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.g$b */
    public class AsyncTaskC2320b extends AsyncTask<String, Void, Boolean> {
        AsyncTaskC2320b() {
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:? */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:? */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:86:0x017f */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:169:? */
        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:171:? */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.util.zip.ZipOutputStream] */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* JADX WARN: Type inference failed for: r11v3, types: [java.util.zip.ZipOutputStream] */
        /* JADX WARN: Type inference failed for: r11v4 */
        /* JADX WARN: Type inference failed for: r11v5 */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        /* JADX WARN: Type inference failed for: r11v9 */
        /* JADX WARN: Type inference failed for: r11v10 */
        /* JADX WARN: Type inference failed for: r11v11 */
        /* JADX WARN: Type inference failed for: r11v12, types: [java.util.zip.ZipOutputStream] */
        /* JADX WARN: Type inference failed for: r15v0, types: [com.digdroid.alman.dig.g] */
        /* JADX WARN: Type inference failed for: r0v24, types: [com.digdroid.alman.dig.g] */
        /* JADX WARN: Type inference failed for: r24v14 */
        /* JADX WARN: Type inference failed for: r24v15 */
        /* JADX WARN: Type inference failed for: r24v16 */
        /* JADX WARN: Type inference failed for: r6v38, types: [com.digdroid.alman.dig.g] */
        /* JADX WARN: Type inference failed for: r0v52, types: [com.digdroid.alman.dig.g] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:75|76|(2:78|(2:80|(5:82|83|(14:85|86|87|88|89|90|91|92|93|94|95|96|(2:98|247)(2:99|246)|100)|245|113)))|114|(2:116|(5:118|119|(11:121|122|123|124|125|126|127|128|129|(2:131|250)(2:132|249)|133)|248|146))|147|148|149|150|151|152|153|154|155|156|157|158) */
        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(1:2)|3|4|5|6|7|8|9|10|11|12|13|14|15|(2:17|(5:19|20|(20:22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|(2:41|243)(1:244)|42)|242|73))|74|75|76|(2:78|(2:80|(5:82|83|(14:85|86|87|88|89|90|91|92|93|94|95|96|(2:98|247)(2:99|246)|100)|245|113)))|114|(2:116|(5:118|119|(11:121|122|123|124|125|126|127|128|129|(2:131|250)(2:132|249)|133)|248|146))|147|148|149|150|151|152|153|154|155|156|157|158|240|241) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x0292 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:152:0x0298 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x029e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:156:0x02a1 */
        /* JADX WARNING: Removed duplicated region for block: B:194:0x0312 A[SYNTHETIC, Splitter:B:194:0x0312] */
        /* JADX WARNING: Removed duplicated region for block: B:198:0x031c A[SYNTHETIC, Splitter:B:198:0x031c] */
        /* JADX WARNING: Removed duplicated region for block: B:202:0x0326 A[SYNTHETIC, Splitter:B:202:0x0326] */
        /* JADX WARNING: Removed duplicated region for block: B:206:0x0330 A[SYNTHETIC, Splitter:B:206:0x0330] */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x0337 A[SYNTHETIC, Splitter:B:210:0x0337] */
        /* JADX WARNING: Removed duplicated region for block: B:220:0x0350 A[SYNTHETIC, Splitter:B:220:0x0350] */
        /* JADX WARNING: Removed duplicated region for block: B:224:0x035a A[SYNTHETIC, Splitter:B:224:0x035a] */
        /* JADX WARNING: Removed duplicated region for block: B:228:0x0364 A[SYNTHETIC, Splitter:B:228:0x0364] */
        /* JADX WARNING: Removed duplicated region for block: B:232:0x036e A[SYNTHETIC, Splitter:B:232:0x036e] */
        /* JADX WARNING: Removed duplicated region for block: B:236:0x0375 A[SYNTHETIC, Splitter:B:236:0x0375] */
        /* JADX WARNING: Unknown variable types count: 5 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Boolean doInBackground(java.lang.String... r27) {
            /*
            // Method dump skipped, instructions count: 894
            */
            throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2318g.AsyncTaskC2320b.doInBackground(java.lang.String[]):java.lang.Boolean");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            if (C2318g.this.f8187a != null) {
                C2318g.this.f8187a.mo7932a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.g$c */
    public interface AbstractC2321c {
        /* renamed from: X */
        void mo7966X(boolean z);
    }

    /* renamed from: com.digdroid.alman.dig.g$d */
    class AsyncTaskC2322d extends AsyncTask<Void, Void, Boolean> {
        AsyncTaskC2322d() {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Can't wrap try/catch for region: R(13:5|6|7|(3:8|9|(13:11|(8:13|14|(2:16|17)|18|(2:21|22)|23|(2:26|27)|28)(3:34|(5:36|37|38|(1:40)|41)(4:43|44|45|(3:47|(1:49)|50)(2:51|(3:53|(1:55)|56)(2:187|88)))|42)|57|(2:59|(1:185)(3:61|62|63))|64|66|67|68|69|70|(3:71|72|(2:74|75)(1:188))|76|77)(2:186|90))|89|(2:92|93)|(2:96|97)|98|99|100|101|102|103) */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x01fc, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
            r9.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
            r13.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
            r12.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
            r11.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
            r10.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
            r9.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:?, code lost:
            r13.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
            r12.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
            r11.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
            r10.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
            r18 = r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
            r9 = r14;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x01cf, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d0, code lost:
            r13 = r9;
            r9 = r4;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x01f4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:102:0x01f7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x01f1 */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x01fc A[ExcHandler: all (th java.lang.Throwable), Splitter:B:8:0x0031] */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x021c A[SYNTHETIC, Splitter:B:124:0x021c] */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x0223 A[SYNTHETIC, Splitter:B:128:0x0223] */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x022a A[SYNTHETIC, Splitter:B:132:0x022a] */
        /* JADX WARNING: Removed duplicated region for block: B:136:0x0231 A[SYNTHETIC, Splitter:B:136:0x0231] */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x0238 A[SYNTHETIC, Splitter:B:140:0x0238] */
        /* JADX WARNING: Removed duplicated region for block: B:149:0x0246 A[SYNTHETIC, Splitter:B:149:0x0246] */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x024d A[SYNTHETIC, Splitter:B:153:0x024d] */
        /* JADX WARNING: Removed duplicated region for block: B:157:0x0254 A[SYNTHETIC, Splitter:B:157:0x0254] */
        /* JADX WARNING: Removed duplicated region for block: B:161:0x025b A[SYNTHETIC, Splitter:B:161:0x025b] */
        /* JADX WARNING: Removed duplicated region for block: B:165:0x0262 A[SYNTHETIC, Splitter:B:165:0x0262] */
        /* JADX WARNING: Removed duplicated region for block: B:173:0x0270  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01cf A[ExcHandler: all (th java.lang.Throwable), Splitter:B:69:0x01ae] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Boolean doInBackground(java.lang.Void... r20) {
            /*
            // Method dump skipped, instructions count: 681
            */
            throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2318g.AsyncTaskC2322d.doInBackground(java.lang.Void[]):java.lang.Boolean");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            if (C2318g.this.f8188b != null) {
                C2318g.this.f8188b.mo7966X(bool.booleanValue());
            }
        }
    }

    public C2318g(Context context) {
        this.f8189c = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8441c() {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        AsyncTaskC2320b bVar = new AsyncTaskC2320b();
        bVar.execute(externalStoragePublicDirectory.getAbsolutePath() + "/dig_backup_" + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + ".bak");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0043 A[SYNTHETIC, Splitter:B:27:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004a A[SYNTHETIC, Splitter:B:31:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0051 A[SYNTHETIC, Splitter:B:35:0x0051] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0058 A[SYNTHETIC, Splitter:B:39:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0068 A[SYNTHETIC, Splitter:B:44:0x0068] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8442d(java.lang.String r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.digdroid.alman.dig.C2318g.mo8442d(java.lang.String, java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8443e() {
        File[] b = C2372h2.m10298b(this.f8189c);
        if (b == null || b.length <= 0) {
            AbstractC2319a aVar = this.f8187a;
            if (aVar != null) {
                aVar.mo7932a(false);
                return;
            }
            return;
        }
        File file = new File(b[0].getAbsolutePath().replaceAll("\\/Android.*", "") + "/Dig/backup");
        if (!file.exists()) {
            try {
                file.mkdirs();
            } catch (Exception unused) {
            }
        }
        AsyncTaskC2320b bVar = new AsyncTaskC2320b();
        bVar.execute(file.getAbsolutePath() + "/dig_backup.bak");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo8444f() {
        new AsyncTaskC2322d().execute(new Void[0]);
    }

    /* renamed from: g */
    public void mo8445g(AbstractC2319a aVar) {
        this.f8187a = aVar;
    }

    /* renamed from: h */
    public void mo8446h(AbstractC2321c cVar) {
        this.f8188b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo8447i(BufferedInputStream bufferedInputStream, ZipOutputStream zipOutputStream, String str) {
        byte[] bArr = new byte[1024];
        try {
            zipOutputStream.putNextEntry(new ZipEntry(str));
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read > 0) {
                    zipOutputStream.write(bArr, 0, read);
                } else {
                    zipOutputStream.closeEntry();
                    return true;
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }
}
