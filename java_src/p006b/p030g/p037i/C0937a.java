package p006b.p030g.p037i;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: b.g.i.a */
public final class C0937a {

    /* renamed from: a */
    static final AbstractC0944d f4611a;

    /* renamed from: b */
    private static final String f4612b = Character.toString(8206);

    /* renamed from: c */
    private static final String f4613c = Character.toString(8207);

    /* renamed from: d */
    static final C0937a f4614d;

    /* renamed from: e */
    static final C0937a f4615e;

    /* renamed from: f */
    private final boolean f4616f;

    /* renamed from: g */
    private final int f4617g;

    /* renamed from: h */
    private final AbstractC0944d f4618h;

    /* renamed from: b.g.i.a$a */
    public static final class C0938a {

        /* renamed from: a */
        private boolean f4619a;

        /* renamed from: b */
        private int f4620b;

        /* renamed from: c */
        private AbstractC0944d f4621c;

        public C0938a() {
            m5442c(C0937a.m5433e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C0937a m5441b(boolean z) {
            return z ? C0937a.f4615e : C0937a.f4614d;
        }

        /* renamed from: c */
        private void m5442c(boolean z) {
            this.f4619a = z;
            this.f4621c = C0937a.f4611a;
            this.f4620b = 2;
        }

        /* renamed from: a */
        public C0937a mo5359a() {
            return (this.f4620b == 2 && this.f4621c == C0937a.f4611a) ? m5441b(this.f4619a) : new C0937a(this.f4619a, this.f4620b, this.f4621c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.g.i.a$b */
    public static class C0939b {

        /* renamed from: a */
        private static final byte[] f4622a = new byte[1792];

        /* renamed from: b */
        private final CharSequence f4623b;

        /* renamed from: c */
        private final boolean f4624c;

        /* renamed from: d */
        private final int f4625d;

        /* renamed from: e */
        private int f4626e;

        /* renamed from: f */
        private char f4627f;

        static {
            for (int i = 0; i < 1792; i++) {
                f4622a[i] = Character.getDirectionality(i);
            }
        }

        C0939b(CharSequence charSequence, boolean z) {
            this.f4623b = charSequence;
            this.f4624c = z;
            this.f4625d = charSequence.length();
        }

        /* renamed from: c */
        private static byte m5444c(char c) {
            return c < 1792 ? f4622a[c] : Character.getDirectionality(c);
        }

        /* renamed from: f */
        private byte m5445f() {
            char charAt;
            int i = this.f4626e;
            do {
                int i2 = this.f4626e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f4623b;
                int i3 = i2 - 1;
                this.f4626e = i3;
                charAt = charSequence.charAt(i3);
                this.f4627f = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f4626e = i;
            this.f4627f = ';';
            return 13;
        }

        /* renamed from: g */
        private byte m5446g() {
            char charAt;
            do {
                int i = this.f4626e;
                if (i >= this.f4625d) {
                    return 12;
                }
                CharSequence charSequence = this.f4623b;
                this.f4626e = i + 1;
                charAt = charSequence.charAt(i);
                this.f4627f = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: h */
        private byte m5447h() {
            char charAt;
            int i = this.f4626e;
            while (true) {
                int i2 = this.f4626e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f4623b;
                int i3 = i2 - 1;
                this.f4626e = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f4627f = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f4626e;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f4623b;
                        int i5 = i4 - 1;
                        this.f4626e = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f4627f = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f4626e = i;
            this.f4627f = '>';
            return 13;
        }

        /* renamed from: i */
        private byte m5448i() {
            char charAt;
            int i = this.f4626e;
            while (true) {
                int i2 = this.f4626e;
                if (i2 < this.f4625d) {
                    CharSequence charSequence = this.f4623b;
                    this.f4626e = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f4627f = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f4626e;
                            if (i3 >= this.f4625d) {
                                break;
                            }
                            CharSequence charSequence2 = this.f4623b;
                            this.f4626e = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f4627f = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f4626e = i;
                    this.f4627f = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte mo5360a() {
            char charAt = this.f4623b.charAt(this.f4626e - 1);
            this.f4627f = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f4623b, this.f4626e);
                this.f4626e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f4626e--;
            byte c = m5444c(this.f4627f);
            if (!this.f4624c) {
                return c;
            }
            char c2 = this.f4627f;
            return c2 == '>' ? m5447h() : c2 == ';' ? m5445f() : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public byte mo5361b() {
            char charAt = this.f4623b.charAt(this.f4626e);
            this.f4627f = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f4623b, this.f4626e);
                this.f4626e += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f4626e++;
            byte c = m5444c(this.f4627f);
            if (!this.f4624c) {
                return c;
            }
            char c2 = this.f4627f;
            return c2 == '<' ? m5448i() : c2 == '&' ? m5446g() : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo5362d() {
            this.f4626e = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f4626e < this.f4625d && i == 0) {
                byte b = mo5361b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f4626e > 0) {
                switch (mo5360a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo5363e() {
            this.f4626e = this.f4625d;
            int i = 0;
            int i2 = 0;
            while (this.f4626e > 0) {
                byte a = mo5360a();
                if (a != 0) {
                    if (a == 1 || a == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 != 0) {
                        }
                    } else if (a != 9) {
                        switch (a) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 != 0) {
                    }
                }
                i2 = i;
            }
            return 0;
        }
    }

    static {
        AbstractC0944d dVar = C0945e.f4645c;
        f4611a = dVar;
        f4614d = new C0937a(false, 2, dVar);
        f4615e = new C0937a(true, 2, dVar);
    }

    C0937a(boolean z, int i, AbstractC0944d dVar) {
        this.f4616f = z;
        this.f4617g = i;
        this.f4618h = dVar;
    }

    /* renamed from: a */
    private static int m5430a(CharSequence charSequence) {
        return new C0939b(charSequence, false).mo5362d();
    }

    /* renamed from: b */
    private static int m5431b(CharSequence charSequence) {
        return new C0939b(charSequence, false).mo5363e();
    }

    /* renamed from: c */
    public static C0937a m5432c() {
        return new C0938a().mo5359a();
    }

    /* renamed from: e */
    static boolean m5433e(Locale locale) {
        return C0952f.m5479b(locale) == 1;
    }

    /* renamed from: f */
    private String m5434f(CharSequence charSequence, AbstractC0944d dVar) {
        boolean a = dVar.mo5389a(charSequence, 0, charSequence.length());
        return (this.f4616f || (!a && m5431b(charSequence) != 1)) ? this.f4616f ? (!a || m5431b(charSequence) == -1) ? f4613c : "" : "" : f4612b;
    }

    /* renamed from: g */
    private String m5435g(CharSequence charSequence, AbstractC0944d dVar) {
        boolean a = dVar.mo5389a(charSequence, 0, charSequence.length());
        return (this.f4616f || (!a && m5430a(charSequence) != 1)) ? this.f4616f ? (!a || m5430a(charSequence) == -1) ? f4613c : "" : "" : f4612b;
    }

    /* renamed from: d */
    public boolean mo5354d() {
        return (this.f4617g & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence mo5355h(CharSequence charSequence) {
        return mo5356i(charSequence, this.f4618h, true);
    }

    /* renamed from: i */
    public CharSequence mo5356i(CharSequence charSequence, AbstractC0944d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = dVar.mo5389a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo5354d() && z) {
            spannableStringBuilder.append((CharSequence) m5435g(charSequence, a ? C0945e.f4644b : C0945e.f4643a));
        }
        if (a != this.f4616f) {
            spannableStringBuilder.append(a ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) m5434f(charSequence, a ? C0945e.f4644b : C0945e.f4643a));
        }
        return spannableStringBuilder;
    }

    /* renamed from: j */
    public String mo5357j(String str) {
        return mo5358k(str, this.f4618h, true);
    }

    /* renamed from: k */
    public String mo5358k(String str, AbstractC0944d dVar, boolean z) {
        if (str == null) {
            return null;
        }
        return mo5356i(str, dVar, z).toString();
    }
}
