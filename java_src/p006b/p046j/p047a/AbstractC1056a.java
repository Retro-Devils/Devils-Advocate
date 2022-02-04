package p006b.p046j.p047a;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;

/* renamed from: b.j.a.a */
public abstract class AbstractC1056a {

    /* renamed from: a */
    private final AbstractC1056a f4849a;

    AbstractC1056a(AbstractC1056a aVar) {
        this.f4849a = aVar;
    }

    /* renamed from: h */
    public static AbstractC1056a m6013h(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT >= 19) {
            return new C1058c(null, context, uri);
        }
        return null;
    }

    /* renamed from: i */
    public static AbstractC1056a m6014i(Context context, Uri uri) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new C1059d(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
        }
        return null;
    }

    /* renamed from: a */
    public abstract boolean mo5666a();

    /* renamed from: b */
    public abstract boolean mo5667b();

    /* renamed from: c */
    public abstract AbstractC1056a mo5668c(String str);

    /* renamed from: d */
    public abstract AbstractC1056a mo5669d(String str, String str2);

    /* renamed from: e */
    public abstract boolean mo5670e();

    /* renamed from: f */
    public abstract boolean mo5671f();

    /* renamed from: g */
    public AbstractC1056a mo5672g(String str) {
        AbstractC1056a[] o = mo5678o();
        for (AbstractC1056a aVar : o) {
            if (str.equals(aVar.mo5673j())) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: j */
    public abstract String mo5673j();

    /* renamed from: k */
    public abstract Uri mo5674k();

    /* renamed from: l */
    public abstract boolean mo5675l();

    /* renamed from: m */
    public abstract long mo5676m();

    /* renamed from: n */
    public abstract long mo5677n();

    /* renamed from: o */
    public abstract AbstractC1056a[] mo5678o();
}
