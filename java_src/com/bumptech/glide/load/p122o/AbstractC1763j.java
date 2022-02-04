package com.bumptech.glide.load.p122o;

import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.EnumC1632c;

/* renamed from: com.bumptech.glide.load.o.j */
public abstract class AbstractC1763j {

    /* renamed from: a */
    public static final AbstractC1763j f6910a = new C1764a();

    /* renamed from: b */
    public static final AbstractC1763j f6911b = new C1765b();

    /* renamed from: c */
    public static final AbstractC1763j f6912c = new C1766c();

    /* renamed from: d */
    public static final AbstractC1763j f6913d = new C1767d();

    /* renamed from: e */
    public static final AbstractC1763j f6914e = new C1768e();

    /* renamed from: com.bumptech.glide.load.o.j$a */
    class C1764a extends AbstractC1763j {
        C1764a() {
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: a */
        public boolean mo7315a() {
            return true;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: b */
        public boolean mo7316b() {
            return true;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: c */
        public boolean mo7317c(EnumC1630a aVar) {
            return aVar == EnumC1630a.REMOTE;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: d */
        public boolean mo7318d(boolean z, EnumC1630a aVar, EnumC1632c cVar) {
            return (aVar == EnumC1630a.RESOURCE_DISK_CACHE || aVar == EnumC1630a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.j$b */
    class C1765b extends AbstractC1763j {
        C1765b() {
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: a */
        public boolean mo7315a() {
            return false;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: b */
        public boolean mo7316b() {
            return false;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: c */
        public boolean mo7317c(EnumC1630a aVar) {
            return false;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: d */
        public boolean mo7318d(boolean z, EnumC1630a aVar, EnumC1632c cVar) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.j$c */
    class C1766c extends AbstractC1763j {
        C1766c() {
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: a */
        public boolean mo7315a() {
            return true;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: b */
        public boolean mo7316b() {
            return false;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: c */
        public boolean mo7317c(EnumC1630a aVar) {
            return (aVar == EnumC1630a.DATA_DISK_CACHE || aVar == EnumC1630a.MEMORY_CACHE) ? false : true;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: d */
        public boolean mo7318d(boolean z, EnumC1630a aVar, EnumC1632c cVar) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.j$d */
    class C1767d extends AbstractC1763j {
        C1767d() {
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: a */
        public boolean mo7315a() {
            return false;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: b */
        public boolean mo7316b() {
            return true;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: c */
        public boolean mo7317c(EnumC1630a aVar) {
            return false;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: d */
        public boolean mo7318d(boolean z, EnumC1630a aVar, EnumC1632c cVar) {
            return (aVar == EnumC1630a.RESOURCE_DISK_CACHE || aVar == EnumC1630a.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.j$e */
    class C1768e extends AbstractC1763j {
        C1768e() {
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: a */
        public boolean mo7315a() {
            return true;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: b */
        public boolean mo7316b() {
            return true;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: c */
        public boolean mo7317c(EnumC1630a aVar) {
            return aVar == EnumC1630a.REMOTE;
        }

        @Override // com.bumptech.glide.load.p122o.AbstractC1763j
        /* renamed from: d */
        public boolean mo7318d(boolean z, EnumC1630a aVar, EnumC1632c cVar) {
            return ((z && aVar == EnumC1630a.DATA_DISK_CACHE) || aVar == EnumC1630a.LOCAL) && cVar == EnumC1632c.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo7315a();

    /* renamed from: b */
    public abstract boolean mo7316b();

    /* renamed from: c */
    public abstract boolean mo7317c(EnumC1630a aVar);

    /* renamed from: d */
    public abstract boolean mo7318d(boolean z, EnumC1630a aVar, EnumC1632c cVar);
}
