package androidx.leanback.widget.picker;

/* renamed from: androidx.leanback.widget.picker.b */
public class C0590b {

    /* renamed from: a */
    private int f2961a;

    /* renamed from: b */
    private int f2962b;

    /* renamed from: c */
    private int f2963c;

    /* renamed from: d */
    private CharSequence[] f2964d;

    /* renamed from: e */
    private String f2965e;

    /* renamed from: a */
    public int mo3588a() {
        return (this.f2963c - this.f2962b) + 1;
    }

    /* renamed from: b */
    public int mo3589b() {
        return this.f2961a;
    }

    /* renamed from: c */
    public CharSequence mo3590c(int i) {
        CharSequence[] charSequenceArr = this.f2964d;
        if (charSequenceArr != null) {
            return charSequenceArr[i];
        }
        return String.format(this.f2965e, Integer.valueOf(i));
    }

    /* renamed from: d */
    public int mo3591d() {
        return this.f2963c;
    }

    /* renamed from: e */
    public int mo3592e() {
        return this.f2962b;
    }

    /* renamed from: f */
    public void mo3593f(int i) {
        this.f2961a = i;
    }

    /* renamed from: g */
    public void mo3594g(String str) {
        this.f2965e = str;
    }

    /* renamed from: h */
    public void mo3595h(int i) {
        this.f2963c = i;
    }

    /* renamed from: i */
    public void mo3596i(int i) {
        this.f2962b = i;
    }

    /* renamed from: j */
    public void mo3597j(CharSequence[] charSequenceArr) {
        this.f2964d = charSequenceArr;
    }
}
