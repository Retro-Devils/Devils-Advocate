package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.fragment.app.ActivityC0447d;
import com.bumptech.glide.load.AbstractC1649k;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p120n.C1668k;
import com.bumptech.glide.load.p120n.C1671m;
import com.bumptech.glide.load.p122o.C1769k;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1690b;
import com.bumptech.glide.load.p122o.p123a0.AbstractC1695e;
import com.bumptech.glide.load.p122o.p124b0.AbstractC1727h;
import com.bumptech.glide.load.p126p.C1801a;
import com.bumptech.glide.load.p126p.C1805b;
import com.bumptech.glide.load.p126p.C1812c;
import com.bumptech.glide.load.p126p.C1813d;
import com.bumptech.glide.load.p126p.C1816e;
import com.bumptech.glide.load.p126p.C1821f;
import com.bumptech.glide.load.p126p.C1829g;
import com.bumptech.glide.load.p126p.C1836k;
import com.bumptech.glide.load.p126p.C1855s;
import com.bumptech.glide.load.p126p.C1860t;
import com.bumptech.glide.load.p126p.C1861u;
import com.bumptech.glide.load.p126p.C1865v;
import com.bumptech.glide.load.p126p.C1868w;
import com.bumptech.glide.load.p126p.C1873x;
import com.bumptech.glide.load.p126p.p127y.C1875a;
import com.bumptech.glide.load.p126p.p127y.C1877b;
import com.bumptech.glide.load.p126p.p127y.C1879c;
import com.bumptech.glide.load.p126p.p127y.C1881d;
import com.bumptech.glide.load.p126p.p127y.C1883e;
import com.bumptech.glide.load.p126p.p127y.C1888f;
import com.bumptech.glide.load.p128q.p129d.C1895a;
import com.bumptech.glide.load.p128q.p129d.C1896a0;
import com.bumptech.glide.load.p128q.p129d.C1898b;
import com.bumptech.glide.load.p128q.p129d.C1899b0;
import com.bumptech.glide.load.p128q.p129d.C1908c;
import com.bumptech.glide.load.p128q.p129d.C1912g;
import com.bumptech.glide.load.p128q.p129d.C1913h;
import com.bumptech.glide.load.p128q.p129d.C1916k;
import com.bumptech.glide.load.p128q.p129d.C1930m;
import com.bumptech.glide.load.p128q.p129d.C1936p;
import com.bumptech.glide.load.p128q.p129d.C1942t;
import com.bumptech.glide.load.p128q.p129d.C1944v;
import com.bumptech.glide.load.p128q.p129d.C1947x;
import com.bumptech.glide.load.p128q.p129d.C1948y;
import com.bumptech.glide.load.p128q.p130e.C1952a;
import com.bumptech.glide.load.p128q.p131f.C1958d;
import com.bumptech.glide.load.p128q.p131f.C1959e;
import com.bumptech.glide.load.p128q.p132g.C1960a;
import com.bumptech.glide.load.p128q.p133h.C1962a;
import com.bumptech.glide.load.p128q.p133h.C1966c;
import com.bumptech.glide.load.p128q.p133h.C1968d;
import com.bumptech.glide.load.p128q.p133h.C1976h;
import com.bumptech.glide.load.p128q.p133h.C1978j;
import com.bumptech.glide.load.p128q.p134i.C1979a;
import com.bumptech.glide.load.p128q.p134i.C1980b;
import com.bumptech.glide.load.p128q.p134i.C1981c;
import com.bumptech.glide.load.p128q.p134i.C1982d;
import com.bumptech.glide.p136n.AbstractC1996a;
import com.bumptech.glide.p137o.AbstractC2006d;
import com.bumptech.glide.p137o.C2016l;
import com.bumptech.glide.p138p.AbstractC2025b;
import com.bumptech.glide.p138p.C2027d;
import com.bumptech.glide.p140r.AbstractC2042e;
import com.bumptech.glide.p140r.C2043f;
import com.bumptech.glide.p140r.p141j.AbstractC2055h;
import com.bumptech.glide.p140r.p141j.C2053f;
import com.bumptech.glide.p144t.C2081j;
import com.bumptech.glide.p144t.C2082k;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bumptech.glide.c */
public class ComponentCallbacks2C1610c implements ComponentCallbacks2 {

    /* renamed from: b */
    private static volatile ComponentCallbacks2C1610c f6525b;

    /* renamed from: c */
    private static volatile boolean f6526c;

    /* renamed from: d */
    private final C1769k f6527d;

    /* renamed from: e */
    private final AbstractC1695e f6528e;

    /* renamed from: f */
    private final AbstractC1727h f6529f;

    /* renamed from: g */
    private final C1614e f6530g;

    /* renamed from: h */
    private final C1618i f6531h;

    /* renamed from: i */
    private final AbstractC1690b f6532i;

    /* renamed from: j */
    private final C2016l f6533j;

    /* renamed from: k */
    private final AbstractC2006d f6534k;

    /* renamed from: l */
    private final List<ComponentCallbacks2C1626k> f6535l = new ArrayList();

    /* renamed from: m */
    private final AbstractC1611a f6536m;

    /* renamed from: n */
    private EnumC1615f f6537n = EnumC1615f.NORMAL;

    /* renamed from: com.bumptech.glide.c$a */
    public interface AbstractC1611a {
        /* renamed from: a */
        C2043f mo6993a();
    }

    ComponentCallbacks2C1610c(Context context, C1769k kVar, AbstractC1727h hVar, AbstractC1695e eVar, AbstractC1690b bVar, C2016l lVar, AbstractC2006d dVar, int i, AbstractC1611a aVar, Map<Class<?>, AbstractC1629l<?, ?>> map, List<AbstractC2042e<Object>> list, boolean z, boolean z2) {
        AbstractC1649k kVar2;
        AbstractC1649k kVar3;
        this.f6527d = kVar;
        this.f6528e = eVar;
        this.f6532i = bVar;
        this.f6529f = hVar;
        this.f6533j = lVar;
        this.f6534k = dVar;
        this.f6536m = aVar;
        Resources resources = context.getResources();
        C1618i iVar = new C1618i();
        this.f6531h = iVar;
        iVar.mo7018o(new C1916k());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            iVar.mo7018o(new C1936p());
        }
        List<ImageHeaderParser> g = iVar.mo7010g();
        C1962a aVar2 = new C1962a(context, g, eVar, bVar);
        AbstractC1649k<ParcelFileDescriptor, Bitmap> h = C1899b0.m8653h(eVar);
        C1930m mVar = new C1930m(iVar.mo7010g(), resources.getDisplayMetrics(), eVar, bVar);
        if (!z2 || i2 < 28) {
            kVar2 = new C1912g(mVar);
            kVar3 = new C1948y(mVar, bVar);
        } else {
            kVar3 = new C1942t();
            kVar2 = new C1913h();
        }
        C1958d dVar2 = new C1958d(context);
        C1855s.C1858c cVar = new C1855s.C1858c(resources);
        C1855s.C1859d dVar3 = new C1855s.C1859d(resources);
        C1855s.C1857b bVar2 = new C1855s.C1857b(resources);
        C1855s.C1856a aVar3 = new C1855s.C1856a(resources);
        C1908c cVar2 = new C1908c(bVar);
        C1979a aVar4 = new C1979a();
        C1982d dVar4 = new C1982d();
        ContentResolver contentResolver = context.getContentResolver();
        iVar.mo7005a(ByteBuffer.class, new C1812c()).mo7005a(InputStream.class, new C1860t(bVar)).mo7009e("Bitmap", ByteBuffer.class, Bitmap.class, kVar2).mo7009e("Bitmap", InputStream.class, Bitmap.class, kVar3);
        if (C1671m.m7948c()) {
            iVar.mo7009e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new C1944v(mVar));
        }
        iVar.mo7009e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, h).mo7009e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C1899b0.m8648c(eVar)).mo7008d(Bitmap.class, Bitmap.class, C1865v.C1866a.m8561a()).mo7009e("Bitmap", Bitmap.class, Bitmap.class, new C1896a0()).mo7006b(Bitmap.class, cVar2).mo7009e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1895a(resources, kVar2)).mo7009e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1895a(resources, kVar3)).mo7009e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C1895a(resources, h)).mo7006b(BitmapDrawable.class, new C1898b(eVar, cVar2)).mo7009e("Gif", InputStream.class, C1966c.class, new C1978j(g, aVar2, bVar)).mo7009e("Gif", ByteBuffer.class, C1966c.class, aVar2).mo7006b(C1966c.class, new C1968d()).mo7008d(AbstractC1996a.class, AbstractC1996a.class, C1865v.C1866a.m8561a()).mo7009e("Bitmap", AbstractC1996a.class, Bitmap.class, new C1976h(eVar)).mo7007c(Uri.class, Drawable.class, dVar2).mo7007c(Uri.class, Bitmap.class, new C1947x(dVar2, eVar)).mo7019p(new C1952a.C1953a()).mo7008d(File.class, ByteBuffer.class, new C1813d.C1815b()).mo7008d(File.class, InputStream.class, new C1821f.C1827e()).mo7007c(File.class, File.class, new C1960a()).mo7008d(File.class, ParcelFileDescriptor.class, new C1821f.C1823b()).mo7008d(File.class, File.class, C1865v.C1866a.m8561a()).mo7019p(new C1668k.C1669a(bVar));
        if (C1671m.m7948c()) {
            iVar.mo7019p(new C1671m.C1672a());
        }
        Class cls = Integer.TYPE;
        iVar.mo7008d(cls, InputStream.class, cVar).mo7008d(cls, ParcelFileDescriptor.class, bVar2).mo7008d(Integer.class, InputStream.class, cVar).mo7008d(Integer.class, ParcelFileDescriptor.class, bVar2).mo7008d(Integer.class, Uri.class, dVar3).mo7008d(cls, AssetFileDescriptor.class, aVar3).mo7008d(Integer.class, AssetFileDescriptor.class, aVar3).mo7008d(cls, Uri.class, dVar3).mo7008d(String.class, InputStream.class, new C1816e.C1819c()).mo7008d(Uri.class, InputStream.class, new C1816e.C1819c()).mo7008d(String.class, InputStream.class, new C1861u.C1864c()).mo7008d(String.class, ParcelFileDescriptor.class, new C1861u.C1863b()).mo7008d(String.class, AssetFileDescriptor.class, new C1861u.C1862a()).mo7008d(Uri.class, InputStream.class, new C1877b.C1878a()).mo7008d(Uri.class, InputStream.class, new C1801a.C1804c(context.getAssets())).mo7008d(Uri.class, ParcelFileDescriptor.class, new C1801a.C1803b(context.getAssets())).mo7008d(Uri.class, InputStream.class, new C1879c.C1880a(context)).mo7008d(Uri.class, InputStream.class, new C1881d.C1882a(context));
        if (i2 >= 29) {
            iVar.mo7008d(Uri.class, InputStream.class, new C1883e.C1886c(context));
            iVar.mo7008d(Uri.class, ParcelFileDescriptor.class, new C1883e.C1885b(context));
        }
        iVar.mo7008d(Uri.class, InputStream.class, new C1868w.C1872d(contentResolver)).mo7008d(Uri.class, ParcelFileDescriptor.class, new C1868w.C1870b(contentResolver)).mo7008d(Uri.class, AssetFileDescriptor.class, new C1868w.C1869a(contentResolver)).mo7008d(Uri.class, InputStream.class, new C1873x.C1874a()).mo7008d(URL.class, InputStream.class, new C1888f.C1889a()).mo7008d(Uri.class, File.class, new C1836k.C1837a(context)).mo7008d(C1829g.class, InputStream.class, new C1875a.C1876a()).mo7008d(byte[].class, ByteBuffer.class, new C1805b.C1806a()).mo7008d(byte[].class, InputStream.class, new C1805b.C1810d()).mo7008d(Uri.class, Uri.class, C1865v.C1866a.m8561a()).mo7008d(Drawable.class, Drawable.class, C1865v.C1866a.m8561a()).mo7007c(Drawable.class, Drawable.class, new C1959e()).mo7020q(Bitmap.class, BitmapDrawable.class, new C1980b(resources)).mo7020q(Bitmap.class, byte[].class, aVar4).mo7020q(Drawable.class, byte[].class, new C1981c(eVar, aVar4, dVar4)).mo7020q(C1966c.class, byte[].class, dVar4);
        if (i2 >= 23) {
            AbstractC1649k<ByteBuffer, Bitmap> d = C1899b0.m8649d(eVar);
            iVar.mo7007c(ByteBuffer.class, Bitmap.class, d);
            iVar.mo7007c(ByteBuffer.class, BitmapDrawable.class, new C1895a(resources, d));
        }
        this.f6530g = new C1614e(context, bVar, iVar, new C2053f(), aVar, map, list, kVar, z, i);
    }

    /* renamed from: a */
    private static void m7748a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f6526c) {
            f6526c = true;
            m7752m(context, generatedAppGlideModule);
            f6526c = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: c */
    public static ComponentCallbacks2C1610c m7749c(Context context) {
        if (f6525b == null) {
            GeneratedAppGlideModule d = m7750d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C1610c.class) {
                if (f6525b == null) {
                    m7748a(context, d);
                }
            }
        }
        return f6525b;
    }

    /* renamed from: d */
    private static GeneratedAppGlideModule m7750d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            m7754q(e);
        }
        return null;
    }

    /* renamed from: l */
    private static C2016l m7751l(Context context) {
        C2081j.m9433e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m7749c(context).mo6985k();
    }

    /* renamed from: m */
    private static void m7752m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m7753n(context, new C1612d(), generatedAppGlideModule);
    }

    /* renamed from: n */
    private static void m7753n(Context context, C1612d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<AbstractC2025b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo6975c()) {
            emptyList = new C2027d(applicationContext).mo7717a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo6971d().isEmpty()) {
            Set<Class<?>> d = generatedAppGlideModule.mo6971d();
            Iterator<AbstractC2025b> it = emptyList.iterator();
            while (it.hasNext()) {
                AbstractC2025b next = it.next();
                if (d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<AbstractC2025b> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        dVar.mo6995b(generatedAppGlideModule != null ? generatedAppGlideModule.mo6972e() : null);
        for (AbstractC2025b bVar : emptyList) {
            bVar.mo7716b(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo6974b(applicationContext, dVar);
        }
        ComponentCallbacks2C1610c a = dVar.mo6994a(applicationContext);
        for (AbstractC2025b bVar2 : emptyList) {
            try {
                bVar2.mo7715a(applicationContext, a, a.f6531h);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + bVar2.getClass().getName(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo6973a(applicationContext, a, a.f6531h);
        }
        applicationContext.registerComponentCallbacks(a);
        f6525b = a;
    }

    /* renamed from: q */
    private static void m7754q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static ComponentCallbacks2C1626k m7755t(Activity activity) {
        return m7751l(activity).mo7690d(activity);
    }

    /* renamed from: u */
    public static ComponentCallbacks2C1626k m7756u(Context context) {
        return m7751l(context).mo7691e(context);
    }

    /* renamed from: v */
    public static ComponentCallbacks2C1626k m7757v(ActivityC0447d dVar) {
        return m7751l(dVar).mo7692f(dVar);
    }

    /* renamed from: b */
    public void mo6978b() {
        C2082k.m9434a();
        this.f6529f.mo7229b();
        this.f6528e.mo7181b();
        this.f6532i.mo7159b();
    }

    /* renamed from: e */
    public AbstractC1690b mo6979e() {
        return this.f6532i;
    }

    /* renamed from: f */
    public AbstractC1695e mo6980f() {
        return this.f6528e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public AbstractC2006d mo6981g() {
        return this.f6534k;
    }

    /* renamed from: h */
    public Context mo6982h() {
        return this.f6530g.getBaseContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C1614e mo6983i() {
        return this.f6530g;
    }

    /* renamed from: j */
    public C1618i mo6984j() {
        return this.f6531h;
    }

    /* renamed from: k */
    public C2016l mo6985k() {
        return this.f6533j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo6986o(ComponentCallbacks2C1626k kVar) {
        synchronized (this.f6535l) {
            if (!this.f6535l.contains(kVar)) {
                this.f6535l.add(kVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo6978b();
    }

    public void onTrimMemory(int i) {
        mo6991r(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo6990p(AbstractC2055h<?> hVar) {
        synchronized (this.f6535l) {
            for (ComponentCallbacks2C1626k kVar : this.f6535l) {
                if (kVar.mo7040D(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void mo6991r(int i) {
        C2082k.m9434a();
        for (ComponentCallbacks2C1626k kVar : this.f6535l) {
            kVar.onTrimMemory(i);
        }
        this.f6529f.mo7221a(i);
        this.f6528e.mo7180a(i);
        this.f6532i.mo7158a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo6992s(ComponentCallbacks2C1626k kVar) {
        synchronized (this.f6535l) {
            if (this.f6535l.contains(kVar)) {
                this.f6535l.remove(kVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}
