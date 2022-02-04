package com.bumptech.glide.load.p122o.p125c0;

import android.os.Build;
import android.os.StrictMode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.c0.b */
public final class C1745b {

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.o.c0.b$a */
    public class C1746a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f6828a;

        C1746a(Pattern pattern) {
            this.f6828a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f6828a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    static int m8184a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return Build.VERSION.SDK_INT < 17 ? Math.max(m8185b(), availableProcessors) : availableProcessors;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static int m8185b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new C1746a(Pattern.compile("cpu[0-9]+")));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
