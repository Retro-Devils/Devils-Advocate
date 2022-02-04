package com.bumptech.glide.load.p122o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.o.y */
public class C1797y {

    /* renamed from: a */
    private boolean f7028a;

    /* renamed from: b */
    private final Handler f7029b = new Handler(Looper.getMainLooper(), new C1798a());

    /* renamed from: com.bumptech.glide.load.o.y$a */
    private static final class C1798a implements Handler.Callback {
        C1798a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((AbstractC1794v) message.obj).mo7361f();
            return true;
        }
    }

    C1797y() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo7388a(AbstractC1794v<?> vVar, boolean z) {
        if (!this.f7028a) {
            if (!z) {
                this.f7028a = true;
                vVar.mo7361f();
                this.f7028a = false;
            }
        }
        this.f7029b.obtainMessage(1, vVar).sendToTarget();
    }
}
