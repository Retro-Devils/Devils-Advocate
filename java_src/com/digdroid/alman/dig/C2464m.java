package com.digdroid.alman.dig;

import android.graphics.Color;
import java.util.Random;

/* access modifiers changed from: package-private */
/* renamed from: com.digdroid.alman.dig.m */
public class C2464m {

    /* renamed from: a */
    final boolean f8599a;

    /* renamed from: b */
    final int f8600b;

    /* renamed from: c */
    final int f8601c;

    /* renamed from: d */
    final int f8602d;

    /* renamed from: e */
    final int f8603e;

    /* renamed from: f */
    final int f8604f;

    /* renamed from: g */
    final int f8605g;

    /* renamed from: h */
    final int f8606h;

    /* renamed from: i */
    int f8607i;

    public C2464m(boolean z, int i, int i2, int i3) {
        this.f8599a = z;
        this.f8600b = (i >> 16) & 255;
        this.f8601c = (i2 >> 16) & 255;
        this.f8602d = (i >> 8) & 255;
        this.f8603e = (i2 >> 8) & 255;
        this.f8604f = i & 255;
        this.f8605g = i2 & 255;
        this.f8606h = i3;
        if (!z) {
            mo8727c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo8725a(int i) {
        return this.f8599a ? mo8726b(i) : this.f8607i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo8726b(int i) {
        int i2 = this.f8606h;
        int i3 = i2 * 2;
        int i4 = i % (i3 - 2);
        float f = (i4 < i2 ? (float) i4 : (float) ((i3 - i4) - 2)) / ((float) (i2 - 1));
        int i5 = this.f8600b;
        int round = Math.round(((float) i5) + (((float) (this.f8601c - i5)) * f));
        int i6 = this.f8602d;
        int round2 = Math.round(((float) i6) + (((float) (this.f8603e - i6)) * f));
        int i7 = this.f8604f;
        return Color.argb(255, round, round2, Math.round(((float) i7) + (((float) (this.f8605g - i7)) * f)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8727c() {
        Random random = new Random();
        int i = this.f8600b;
        int i2 = this.f8602d;
        int i3 = this.f8604f;
        int i4 = this.f8601c;
        int i5 = this.f8603e;
        int i6 = this.f8605g;
        if (i > i4) {
            i4 = i;
            i = i4;
        }
        if (i2 > i5) {
            i5 = i2;
            i2 = i5;
        }
        if (i3 > i6) {
            i6 = i3;
            i3 = i6;
        }
        this.f8607i = Color.argb(255, i + random.nextInt(Math.abs(i4 - i) + 1), i2 + random.nextInt(Math.abs(i5 - i2) + 1), i3 + random.nextInt(Math.abs(i6 - i3) + 1));
    }
}
