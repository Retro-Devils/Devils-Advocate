package com.digdroid.alman.dig;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import java.util.Calendar;

/* renamed from: com.digdroid.alman.dig.e4 */
public class C2294e4 extends C2728t0 {
    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2728t0
    /* renamed from: B3 */
    public boolean mo8141B3(Intent intent) {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2728t0
    /* renamed from: D3 */
    public Cursor mo8142D3() {
        return this.f8804c0.mo8841e(mo9244E3(), this.f9286s0);
    }

    @Override // com.digdroid.alman.dig.AbstractC2577r1, com.digdroid.alman.dig.AbstractC2531p1, androidx.fragment.app.Fragment, com.digdroid.alman.dig.C2728t0
    /* renamed from: W0 */
    public void mo2537W0(Bundle bundle) {
        super.mo2537W0(bundle);
        long j = mo2568h0().getLong("released");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(1);
        instance.clear();
        instance.set(i, 0, 1);
        this.f9286s0.f8309a = instance.getTimeInMillis();
        instance.clear();
        instance.set(i + 1, 0, 1);
        this.f9286s0.f8310b = instance.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2728t0
    /* renamed from: z3 */
    public String mo8143z3() {
        return "system";
    }
}
