package com.digdroid.alman.dig;

import android.content.Intent;
import android.database.Cursor;

/* renamed from: com.digdroid.alman.dig.c0 */
public class C2214c0 extends C2728t0 {
    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2728t0
    /* renamed from: B3 */
    public boolean mo8141B3(Intent intent) {
        return intent.getBooleanExtra("favorite", false);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2728t0
    /* renamed from: D3 */
    public Cursor mo8142D3() {
        this.f9286s0.f8313e = true;
        return this.f8804c0.mo8841e(mo9244E3(), this.f9286s0);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.C2728t0
    /* renamed from: z3 */
    public String mo8143z3() {
        return "played";
    }
}
