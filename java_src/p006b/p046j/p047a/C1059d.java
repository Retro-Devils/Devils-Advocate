package p006b.p046j.p047a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: b.j.a.d */
class C1059d extends AbstractC1056a {

    /* renamed from: b */
    private Context f4852b;

    /* renamed from: c */
    private Uri f4853c;

    C1059d(AbstractC1056a aVar, Context context, Uri uri) {
        super(aVar);
        this.f4852b = context;
        this.f4853c = uri;
    }

    /* renamed from: p */
    private static void m6052p(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: q */
    private static Uri m6053q(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: a */
    public boolean mo5666a() {
        return C1057b.m6028a(this.f4852b, this.f4853c);
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: b */
    public boolean mo5667b() {
        return C1057b.m6029b(this.f4852b, this.f4853c);
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: c */
    public AbstractC1056a mo5668c(String str) {
        Uri q = m6053q(this.f4852b, this.f4853c, "vnd.android.document/directory", str);
        if (q != null) {
            return new C1059d(this, this.f4852b, q);
        }
        return null;
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: d */
    public AbstractC1056a mo5669d(String str, String str2) {
        Uri q = m6053q(this.f4852b, this.f4853c, str, str2);
        if (q != null) {
            return new C1059d(this, this.f4852b, q);
        }
        return null;
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: e */
    public boolean mo5670e() {
        try {
            return DocumentsContract.deleteDocument(this.f4852b.getContentResolver(), this.f4853c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: f */
    public boolean mo5671f() {
        return C1057b.m6031d(this.f4852b, this.f4853c);
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: j */
    public String mo5673j() {
        return C1057b.m6032e(this.f4852b, this.f4853c);
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: k */
    public Uri mo5674k() {
        return this.f4853c;
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: l */
    public boolean mo5675l() {
        return C1057b.m6034g(this.f4852b, this.f4853c);
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: m */
    public long mo5676m() {
        return C1057b.m6035h(this.f4852b, this.f4853c);
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: n */
    public long mo5677n() {
        return C1057b.m6036i(this.f4852b, this.f4853c);
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: o */
    public AbstractC1056a[] mo5678o() {
        ContentResolver contentResolver = this.f4852b.getContentResolver();
        Uri uri = this.f4853c;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
            while (cursor.moveToNext()) {
                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f4853c, cursor.getString(0)));
            }
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
        } catch (Throwable th) {
            m6052p(null);
            throw th;
        }
        m6052p(cursor);
        Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
        AbstractC1056a[] aVarArr = new AbstractC1056a[uriArr.length];
        for (int i = 0; i < uriArr.length; i++) {
            aVarArr[i] = new C1059d(this, this.f4852b, uriArr[i]);
        }
        return aVarArr;
    }
}
