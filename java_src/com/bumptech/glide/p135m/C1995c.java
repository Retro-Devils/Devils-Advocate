package com.bumptech.glide.p135m;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.m.c */
public final class C1995c {

    /* renamed from: a */
    static final Charset f7371a = Charset.forName("US-ASCII");

    /* renamed from: b */
    static final Charset f7372b = Charset.forName("UTF-8");

    /* renamed from: a */
    static void m9012a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    static void m9013b(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m9013b(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
