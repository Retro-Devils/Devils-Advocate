package p006b.p030g.p037i;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p006b.p030g.p038j.C0956d;

/* renamed from: b.g.i.c */
public class C0941c implements Spannable {

    /* renamed from: b */
    private static final Object f4630b = new Object();

    /* renamed from: c */
    private final Spannable f4631c;

    /* renamed from: d */
    private final C0942a f4632d;

    /* renamed from: e */
    private final PrecomputedText f4633e;

    /* renamed from: b.g.i.c$a */
    public static final class C0942a {

        /* renamed from: a */
        private final TextPaint f4634a;

        /* renamed from: b */
        private final TextDirectionHeuristic f4635b;

        /* renamed from: c */
        private final int f4636c;

        /* renamed from: d */
        private final int f4637d;

        /* renamed from: e */
        final PrecomputedText.Params f4638e;

        /* renamed from: b.g.i.c$a$a */
        public static class C0943a {

            /* renamed from: a */
            private final TextPaint f4639a;

            /* renamed from: b */
            private TextDirectionHeuristic f4640b;

            /* renamed from: c */
            private int f4641c;

            /* renamed from: d */
            private int f4642d;

            public C0943a(TextPaint textPaint) {
                this.f4639a = textPaint;
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    this.f4641c = 1;
                    this.f4642d = 1;
                } else {
                    this.f4642d = 0;
                    this.f4641c = 0;
                }
                this.f4640b = i >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            /* renamed from: a */
            public C0942a mo5385a() {
                return new C0942a(this.f4639a, this.f4640b, this.f4641c, this.f4642d);
            }

            /* renamed from: b */
            public C0943a mo5386b(int i) {
                this.f4641c = i;
                return this;
            }

            /* renamed from: c */
            public C0943a mo5387c(int i) {
                this.f4642d = i;
                return this;
            }

            /* renamed from: d */
            public C0943a mo5388d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f4640b = textDirectionHeuristic;
                return this;
            }
        }

        public C0942a(PrecomputedText.Params params) {
            this.f4634a = params.getTextPaint();
            this.f4635b = params.getTextDirection();
            this.f4636c = params.getBreakStrategy();
            this.f4637d = params.getHyphenationFrequency();
            this.f4638e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        @SuppressLint({"NewApi"})
        C0942a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f4638e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f4634a = textPaint;
            this.f4635b = textDirectionHeuristic;
            this.f4636c = i;
            this.f4637d = i2;
        }

        /* renamed from: a */
        public boolean mo5377a(C0942a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f4636c != aVar.mo5378b() || this.f4637d != aVar.mo5379c())) || this.f4634a.getTextSize() != aVar.mo5381e().getTextSize() || this.f4634a.getTextScaleX() != aVar.mo5381e().getTextScaleX() || this.f4634a.getTextSkewX() != aVar.mo5381e().getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (this.f4634a.getLetterSpacing() != aVar.mo5381e().getLetterSpacing() || !TextUtils.equals(this.f4634a.getFontFeatureSettings(), aVar.mo5381e().getFontFeatureSettings()))) || this.f4634a.getFlags() != aVar.mo5381e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f4634a.getTextLocales().equals(aVar.mo5381e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f4634a.getTextLocale().equals(aVar.mo5381e().getTextLocale())) {
                return false;
            }
            return this.f4634a.getTypeface() == null ? aVar.mo5381e().getTypeface() == null : this.f4634a.getTypeface().equals(aVar.mo5381e().getTypeface());
        }

        /* renamed from: b */
        public int mo5378b() {
            return this.f4636c;
        }

        /* renamed from: c */
        public int mo5379c() {
            return this.f4637d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic mo5380d() {
            return this.f4635b;
        }

        /* renamed from: e */
        public TextPaint mo5381e() {
            return this.f4634a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0942a)) {
                return false;
            }
            C0942a aVar = (C0942a) obj;
            if (!mo5377a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f4635b == aVar.mo5380d();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C0956d.m5484b(Float.valueOf(this.f4634a.getTextSize()), Float.valueOf(this.f4634a.getTextScaleX()), Float.valueOf(this.f4634a.getTextSkewX()), Float.valueOf(this.f4634a.getLetterSpacing()), Integer.valueOf(this.f4634a.getFlags()), this.f4634a.getTextLocales(), this.f4634a.getTypeface(), Boolean.valueOf(this.f4634a.isElegantTextHeight()), this.f4635b, Integer.valueOf(this.f4636c), Integer.valueOf(this.f4637d));
            } else if (i >= 21) {
                return C0956d.m5484b(Float.valueOf(this.f4634a.getTextSize()), Float.valueOf(this.f4634a.getTextScaleX()), Float.valueOf(this.f4634a.getTextSkewX()), Float.valueOf(this.f4634a.getLetterSpacing()), Integer.valueOf(this.f4634a.getFlags()), this.f4634a.getTextLocale(), this.f4634a.getTypeface(), Boolean.valueOf(this.f4634a.isElegantTextHeight()), this.f4635b, Integer.valueOf(this.f4636c), Integer.valueOf(this.f4637d));
            } else if (i >= 18) {
                return C0956d.m5484b(Float.valueOf(this.f4634a.getTextSize()), Float.valueOf(this.f4634a.getTextScaleX()), Float.valueOf(this.f4634a.getTextSkewX()), Integer.valueOf(this.f4634a.getFlags()), this.f4634a.getTextLocale(), this.f4634a.getTypeface(), this.f4635b, Integer.valueOf(this.f4636c), Integer.valueOf(this.f4637d));
            } else if (i >= 17) {
                return C0956d.m5484b(Float.valueOf(this.f4634a.getTextSize()), Float.valueOf(this.f4634a.getTextScaleX()), Float.valueOf(this.f4634a.getTextSkewX()), Integer.valueOf(this.f4634a.getFlags()), this.f4634a.getTextLocale(), this.f4634a.getTypeface(), this.f4635b, Integer.valueOf(this.f4636c), Integer.valueOf(this.f4637d));
            } else {
                return C0956d.m5484b(Float.valueOf(this.f4634a.getTextSize()), Float.valueOf(this.f4634a.getTextScaleX()), Float.valueOf(this.f4634a.getTextSkewX()), Integer.valueOf(this.f4634a.getFlags()), this.f4634a.getTypeface(), this.f4635b, Integer.valueOf(this.f4636c), Integer.valueOf(this.f4637d));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00df  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
            // Method dump skipped, instructions count: 325
            */
            throw new UnsupportedOperationException("Method not decompiled: p006b.p030g.p037i.C0941c.C0942a.toString():java.lang.String");
        }
    }

    /* renamed from: a */
    public C0942a mo5364a() {
        return this.f4632d;
    }

    /* renamed from: b */
    public PrecomputedText mo5365b() {
        Spannable spannable = this.f4631c;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f4631c.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f4631c.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f4631c.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f4631c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f4633e.getSpans(i, i2, cls) : (T[]) this.f4631c.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f4631c.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f4631c.nextSpanTransition(i, i2, cls);
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f4633e.removeSpan(obj);
        } else {
            this.f4631c.removeSpan(obj);
        }
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f4633e.setSpan(obj, i, i2, i3);
        } else {
            this.f4631c.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f4631c.subSequence(i, i2);
    }

    public String toString() {
        return this.f4631c.toString();
    }
}
