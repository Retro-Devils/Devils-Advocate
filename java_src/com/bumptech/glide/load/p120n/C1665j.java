package com.bumptech.glide.load.p120n;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.C1634e;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p126p.C1829g;
import com.bumptech.glide.p144t.C2072c;
import com.bumptech.glide.p144t.C2077f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.n.j */
public class C1665j implements AbstractC1655d<InputStream> {

    /* renamed from: b */
    static final AbstractC1667b f6673b = new C1666a();

    /* renamed from: c */
    private final C1829g f6674c;

    /* renamed from: d */
    private final int f6675d;

    /* renamed from: e */
    private final AbstractC1667b f6676e;

    /* renamed from: f */
    private HttpURLConnection f6677f;

    /* renamed from: g */
    private InputStream f6678g;

    /* renamed from: h */
    private volatile boolean f6679h;

    /* renamed from: com.bumptech.glide.load.n.j$a */
    private static class C1666a implements AbstractC1667b {
        C1666a() {
        }

        @Override // com.bumptech.glide.load.p120n.C1665j.AbstractC1667b
        /* renamed from: a */
        public HttpURLConnection mo7126a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.n.j$b */
    public interface AbstractC1667b {
        /* renamed from: a */
        HttpURLConnection mo7126a(URL url);
    }

    public C1665j(C1829g gVar, int i) {
        this(gVar, i, f6673b);
    }

    C1665j(C1829g gVar, int i, AbstractC1667b bVar) {
        this.f6674c = gVar;
        this.f6675d = i;
        this.f6676e = bVar;
    }

    /* renamed from: d */
    private InputStream m7926d(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
            inputStream = C2072c.m9408b(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
        } else {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
            }
            inputStream = httpURLConnection.getInputStream();
        }
        this.f6678g = inputStream;
        return this.f6678g;
    }

    /* renamed from: f */
    private static boolean m7927f(int i) {
        return i / 100 == 2;
    }

    /* renamed from: g */
    private static boolean m7928g(int i) {
        return i / 100 == 3;
    }

    /* renamed from: h */
    private InputStream m7929h(URL url, int i, URL url2, Map<String, String> map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new C1634e("In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f6677f = this.f6676e.mo7126a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f6677f.addRequestProperty(entry.getKey(), entry.getValue());
            }
            this.f6677f.setConnectTimeout(this.f6675d);
            this.f6677f.setReadTimeout(this.f6675d);
            this.f6677f.setUseCaches(false);
            this.f6677f.setDoInput(true);
            this.f6677f.setInstanceFollowRedirects(false);
            this.f6677f.connect();
            this.f6678g = this.f6677f.getInputStream();
            if (this.f6679h) {
                return null;
            }
            int responseCode = this.f6677f.getResponseCode();
            if (m7927f(responseCode)) {
                return m7926d(this.f6677f);
            }
            if (m7928g(responseCode)) {
                String headerField = this.f6677f.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    mo7097b();
                    return m7929h(url3, i + 1, url, map);
                }
                throw new C1634e("Received empty or null redirect url");
            } else if (responseCode == -1) {
                throw new C1634e(responseCode);
            } else {
                throw new C1634e(this.f6677f.getResponseMessage(), responseCode);
            }
        } else {
            throw new C1634e("Too many (> 5) redirects!");
        }
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: a */
    public Class<InputStream> mo7092a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: b */
    public void mo7097b() {
        InputStream inputStream = this.f6678g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f6677f;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f6677f = null;
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: c */
    public EnumC1630a mo7098c() {
        return EnumC1630a.REMOTE;
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    public void cancel() {
        this.f6679h = true;
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: e */
    public void mo7101e(EnumC1616g gVar, AbstractC1655d.AbstractC1656a<? super InputStream> aVar) {
        StringBuilder sb;
        long b = C2077f.m9416b();
        try {
            aVar.mo7109f(m7929h(this.f6674c.mo7424h(), 0, null, this.f6674c.mo7423e()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C2077f.m9415a(b));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.mo7108d(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + C2077f.m9415a(b));
            }
            throw th;
        }
    }
}
