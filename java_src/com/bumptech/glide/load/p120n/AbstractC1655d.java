package com.bumptech.glide.load.p120n;

import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.EnumC1630a;

/* renamed from: com.bumptech.glide.load.n.d */
public interface AbstractC1655d<T> {

    /* renamed from: com.bumptech.glide.load.n.d$a */
    public interface AbstractC1656a<T> {
        /* renamed from: d */
        void mo7108d(Exception exc);

        /* renamed from: f */
        void mo7109f(T t);
    }

    /* renamed from: a */
    Class<T> mo7092a();

    /* renamed from: b */
    void mo7097b();

    /* renamed from: c */
    EnumC1630a mo7098c();

    void cancel();

    /* renamed from: e */
    void mo7101e(EnumC1616g gVar, AbstractC1656a<? super T> aVar);
}
