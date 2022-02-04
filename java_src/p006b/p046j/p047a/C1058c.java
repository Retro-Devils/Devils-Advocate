package p006b.p046j.p047a;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* renamed from: b.j.a.c */
class C1058c extends AbstractC1056a {

    /* renamed from: b */
    private Context f4846b;

    /* renamed from: c */
    private Uri f4847c;

    C1058c(AbstractC1056a aVar, Context context, Uri uri) {
        super(aVar);
        this.f4846b = context;
        this.f4847c = uri;
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: a */
    public boolean mo5666a() {
        return C1057b.m6028a(this.f4846b, this.f4847c);
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: b */
    public boolean mo5667b() {
        return C1057b.m6029b(this.f4846b, this.f4847c);
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: c */
    public AbstractC1056a mo5668c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: d */
    public AbstractC1056a mo5669d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: e */
    public boolean mo5670e() {
        try {
            return DocumentsContract.deleteDocument(this.f4846b.getContentResolver(), this.f4847c);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: f */
    public boolean mo5671f() {
        return C1057b.m6031d(this.f4846b, this.f4847c);
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: j */
    public String mo5673j() {
        return C1057b.m6032e(this.f4846b, this.f4847c);
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: k */
    public Uri mo5674k() {
        return this.f4847c;
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: l */
    public boolean mo5675l() {
        return C1057b.m6034g(this.f4846b, this.f4847c);
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: m */
    public long mo5676m() {
        return C1057b.m6035h(this.f4846b, this.f4847c);
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: n */
    public long mo5677n() {
        return C1057b.m6036i(this.f4846b, this.f4847c);
    }

    @Override // p006b.p046j.p047a.AbstractC1056a
    /* renamed from: o */
    public AbstractC1056a[] mo5678o() {
        throw new UnsupportedOperationException();
    }
}
