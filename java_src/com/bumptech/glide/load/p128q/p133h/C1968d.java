package com.bumptech.glide.load.p128q.p133h;

import android.util.Log;
import com.bumptech.glide.load.AbstractC1650l;
import com.bumptech.glide.load.C1647i;
import com.bumptech.glide.load.EnumC1632c;
import com.bumptech.glide.load.p122o.AbstractC1794v;
import com.bumptech.glide.p144t.C2068a;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.q.h.d */
public class C1968d implements AbstractC1650l<C1966c> {
    @Override // com.bumptech.glide.load.AbstractC1650l
    /* renamed from: b */
    public EnumC1632c mo7090b(C1647i iVar) {
        return EnumC1632c.SOURCE;
    }

    /* renamed from: c */
    public boolean mo7072a(AbstractC1794v<C1966c> vVar, File file, C1647i iVar) {
        try {
            C2068a.m9402e(vVar.mo7358c().mo7578c(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }
}
