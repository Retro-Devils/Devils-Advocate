package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p006b.p030g.p038j.C0961i;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.w */
public final class C0295w {

    /* renamed from: a */
    private TextView f1238a;

    /* renamed from: b */
    private TextClassifier f1239b;

    C0295w(TextView textView) {
        this.f1238a = (TextView) C0961i.m5494c(textView);
    }

    /* renamed from: a */
    public TextClassifier mo1802a() {
        TextClassifier textClassifier = this.f1239b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f1238a.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    /* renamed from: b */
    public void mo1803b(TextClassifier textClassifier) {
        this.f1239b = textClassifier;
    }
}
