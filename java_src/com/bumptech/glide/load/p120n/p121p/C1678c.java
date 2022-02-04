package com.bumptech.glide.load.p120n.p121p;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C1610c;
import com.bumptech.glide.EnumC1616g;
import com.bumptech.glide.load.EnumC1630a;
import com.bumptech.glide.load.p120n.AbstractC1655d;
import com.bumptech.glide.load.p120n.C1662g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.p.c */
public class C1678c implements AbstractC1655d<InputStream> {

    /* renamed from: b */
    private final Uri f6696b;

    /* renamed from: c */
    private final C1682e f6697c;

    /* renamed from: d */
    private InputStream f6698d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.n.p.c$a */
    public static class C1679a implements AbstractC1681d {

        /* renamed from: a */
        private static final String[] f6699a = {"_data"};

        /* renamed from: b */
        private final ContentResolver f6700b;

        C1679a(ContentResolver contentResolver) {
            this.f6700b = contentResolver;
        }

        @Override // com.bumptech.glide.load.p120n.p121p.AbstractC1681d
        /* renamed from: a */
        public Cursor mo7140a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f6700b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f6699a, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bumptech.glide.load.n.p.c$b */
    public static class C1680b implements AbstractC1681d {

        /* renamed from: a */
        private static final String[] f6701a = {"_data"};

        /* renamed from: b */
        private final ContentResolver f6702b;

        C1680b(ContentResolver contentResolver) {
            this.f6702b = contentResolver;
        }

        @Override // com.bumptech.glide.load.p120n.p121p.AbstractC1681d
        /* renamed from: a */
        public Cursor mo7140a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f6702b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f6701a, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, null);
        }
    }

    C1678c(Uri uri, C1682e eVar) {
        this.f6696b = uri;
        this.f6697c = eVar;
    }

    /* renamed from: d */
    private static C1678c m7976d(Context context, Uri uri, AbstractC1681d dVar) {
        return new C1678c(uri, new C1682e(ComponentCallbacks2C1610c.m7749c(context).mo6984j().mo7010g(), dVar, ComponentCallbacks2C1610c.m7749c(context).mo6979e(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static C1678c m7977f(Context context, Uri uri) {
        return m7976d(context, uri, new C1679a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C1678c m7978g(Context context, Uri uri) {
        return m7976d(context, uri, new C1680b(context.getContentResolver()));
    }

    /* renamed from: h */
    private InputStream m7979h() {
        InputStream d = this.f6697c.mo7142d(this.f6696b);
        int a = d != null ? this.f6697c.mo7141a(this.f6696b) : -1;
        return a != -1 ? new C1662g(d, a) : d;
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: a */
    public Class<InputStream> mo7092a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: b */
    public void mo7097b() {
        InputStream inputStream = this.f6698d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: c */
    public EnumC1630a mo7098c() {
        return EnumC1630a.LOCAL;
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.p120n.AbstractC1655d
    /* renamed from: e */
    public void mo7101e(EnumC1616g gVar, AbstractC1655d.AbstractC1656a<? super InputStream> aVar) {
        try {
            InputStream h = m7979h();
            this.f6698d = h;
            aVar.mo7109f(h);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
            }
            aVar.mo7108d(e);
        }
    }
}
