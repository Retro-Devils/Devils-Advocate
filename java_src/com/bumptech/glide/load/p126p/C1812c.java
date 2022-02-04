package com.bumptech.glide.load.p126p;

import android.util.Log;
import com.bumptech.glide.load.AbstractC1633d;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.p144t.C2068a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.bumptech.glide.load.p.c */
public class C1812c implements AbstractC1633d<ByteBuffer> {
    /* renamed from: c */
    public boolean mo7072a(ByteBuffer byteBuffer, File file, C1647i iVar) {
        try {
            C2068a.m9402e(byteBuffer, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }
}
