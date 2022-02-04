package androidx.leanback.widget.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.leanback.widget.picker.C0591c;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import p006b.p053m.C1080l;

public class DatePicker extends C0585a {

    /* renamed from: u */
    private static final int[] f2919u = {5, 2, 1};

    /* renamed from: A */
    int f2920A;

    /* renamed from: B */
    int f2921B;

    /* renamed from: C */
    final DateFormat f2922C;

    /* renamed from: D */
    C0591c.C0592a f2923D;

    /* renamed from: E */
    Calendar f2924E;

    /* renamed from: F */
    Calendar f2925F;

    /* renamed from: G */
    Calendar f2926G;

    /* renamed from: H */
    Calendar f2927H;

    /* renamed from: v */
    private String f2928v;

    /* renamed from: w */
    C0590b f2929w;

    /* renamed from: x */
    C0590b f2930x;

    /* renamed from: y */
    C0590b f2931y;

    /* renamed from: z */
    int f2932z;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.leanback.widget.picker.DatePicker$a */
    public class RunnableC0584a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ boolean f2933b;

        RunnableC0584a(boolean z) {
            this.f2933b = z;
        }

        public void run() {
            DatePicker.this.mo3553u(this.f2933b);
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DatePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2922C = new SimpleDateFormat("MM/dd/yyyy");
        m3105q();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1080l.f4927G);
        String string = obtainStyledAttributes.getString(C1080l.f4928H);
        String string2 = obtainStyledAttributes.getString(C1080l.f4929I);
        this.f2927H.clear();
        if (TextUtils.isEmpty(string) || !m3103o(string, this.f2927H)) {
            this.f2927H.set(1900, 0, 1);
        }
        this.f2924E.setTimeInMillis(this.f2927H.getTimeInMillis());
        this.f2927H.clear();
        if (TextUtils.isEmpty(string2) || !m3103o(string2, this.f2927H)) {
            this.f2927H.set(2100, 0, 1);
        }
        this.f2925F.setTimeInMillis(this.f2927H.getTimeInMillis());
        String string3 = obtainStyledAttributes.getString(C1080l.f4930J);
        setDatePickerFormat(TextUtils.isEmpty(string3) ? new String(android.text.format.DateFormat.getDateFormatOrder(context)) : string3);
    }

    /* renamed from: n */
    private static boolean m3102n(char c, char[] cArr) {
        for (char c2 : cArr) {
            if (c == c2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: o */
    private boolean m3103o(String str, Calendar calendar) {
        try {
            calendar.setTime(this.f2922C.parse(str));
            return true;
        } catch (ParseException unused) {
            Log.w("DatePicker", "Date: " + str + " not in format: " + "MM/dd/yyyy");
            return false;
        }
    }

    /* renamed from: p */
    private void m3104p(int i, int i2, int i3) {
        Calendar calendar;
        Calendar calendar2;
        this.f2926G.set(i, i2, i3);
        if (this.f2926G.before(this.f2924E)) {
            calendar = this.f2926G;
            calendar2 = this.f2924E;
        } else if (this.f2926G.after(this.f2925F)) {
            calendar = this.f2926G;
            calendar2 = this.f2925F;
        } else {
            return;
        }
        calendar.setTimeInMillis(calendar2.getTimeInMillis());
    }

    /* renamed from: q */
    private void m3105q() {
        C0591c.C0592a c = C0591c.m3145c(Locale.getDefault(), getContext().getResources());
        this.f2923D = c;
        this.f2927H = C0591c.m3144b(this.f2927H, c.f2967a);
        this.f2924E = C0591c.m3144b(this.f2924E, this.f2923D.f2967a);
        this.f2925F = C0591c.m3144b(this.f2925F, this.f2923D.f2967a);
        this.f2926G = C0591c.m3144b(this.f2926G, this.f2923D.f2967a);
        C0590b bVar = this.f2929w;
        if (bVar != null) {
            bVar.mo3597j(this.f2923D.f2968b);
            mo3556d(this.f2932z, this.f2929w);
        }
    }

    /* renamed from: r */
    private static boolean m3106r(C0590b bVar, int i) {
        if (i == bVar.mo3591d()) {
            return false;
        }
        bVar.mo3595h(i);
        return true;
    }

    /* renamed from: s */
    private static boolean m3107s(C0590b bVar, int i) {
        if (i == bVar.mo3592e()) {
            return false;
        }
        bVar.mo3596i(i);
        return true;
    }

    /* renamed from: t */
    private void m3108t(boolean z) {
        post(new RunnableC0584a(z));
    }

    @Override // androidx.leanback.widget.picker.C0585a
    /* renamed from: c */
    public final void mo3543c(int i, int i2) {
        this.f2927H.setTimeInMillis(this.f2926G.getTimeInMillis());
        int b = mo3555a(i).mo3589b();
        if (i == this.f2920A) {
            this.f2927H.add(5, i2 - b);
        } else if (i == this.f2932z) {
            this.f2927H.add(2, i2 - b);
        } else if (i == this.f2921B) {
            this.f2927H.add(1, i2 - b);
        } else {
            throw new IllegalArgumentException();
        }
        m3104p(this.f2927H.get(1), this.f2927H.get(2), this.f2927H.get(5));
        m3108t(false);
    }

    public long getDate() {
        return this.f2926G.getTimeInMillis();
    }

    public String getDatePickerFormat() {
        return this.f2928v;
    }

    public long getMaxDate() {
        return this.f2925F.getTimeInMillis();
    }

    public long getMinDate() {
        return this.f2924E.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public List<CharSequence> mo3548l() {
        String m = mo3549m(this.f2928v);
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        char[] cArr = {'Y', 'y', 'M', 'm', 'D', 'd'};
        boolean z = false;
        char c = 0;
        for (int i = 0; i < m.length(); i++) {
            char charAt = m.charAt(i);
            if (charAt != ' ') {
                if (charAt != '\'') {
                    if (z || !m3102n(charAt, cArr)) {
                        sb.append(charAt);
                    } else if (charAt != c) {
                        arrayList.add(sb.toString());
                        sb.setLength(0);
                    }
                    c = charAt;
                } else if (!z) {
                    sb.setLength(0);
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        arrayList.add(sb.toString());
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public String mo3549m(String str) {
        String str2;
        if (C0591c.f2966a) {
            str2 = android.text.format.DateFormat.getBestDateTimePattern(this.f2923D.f2967a, str);
        } else {
            DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(getContext());
            str2 = dateFormat instanceof SimpleDateFormat ? ((SimpleDateFormat) dateFormat).toLocalizedPattern() : "MM/dd/yyyy";
        }
        return TextUtils.isEmpty(str2) ? "MM/dd/yyyy" : str2;
    }

    public void setDatePickerFormat(String str) {
        if (TextUtils.isEmpty(str)) {
            str = new String(android.text.format.DateFormat.getDateFormatOrder(getContext()));
        }
        if (!TextUtils.equals(this.f2928v, str)) {
            this.f2928v = str;
            List<CharSequence> l = mo3548l();
            if (l.size() == str.length() + 1) {
                setSeparators(l);
                this.f2930x = null;
                this.f2929w = null;
                this.f2931y = null;
                this.f2932z = -1;
                this.f2920A = -1;
                this.f2921B = -1;
                String upperCase = str.toUpperCase();
                ArrayList arrayList = new ArrayList(3);
                for (int i = 0; i < upperCase.length(); i++) {
                    char charAt = upperCase.charAt(i);
                    if (charAt != 'D') {
                        if (charAt != 'M') {
                            if (charAt != 'Y') {
                                throw new IllegalArgumentException("datePicker format error");
                            } else if (this.f2931y == null) {
                                C0590b bVar = new C0590b();
                                this.f2931y = bVar;
                                arrayList.add(bVar);
                                this.f2921B = i;
                                this.f2931y.mo3594g("%d");
                            } else {
                                throw new IllegalArgumentException("datePicker format error");
                            }
                        } else if (this.f2929w == null) {
                            C0590b bVar2 = new C0590b();
                            this.f2929w = bVar2;
                            arrayList.add(bVar2);
                            this.f2929w.mo3597j(this.f2923D.f2968b);
                            this.f2932z = i;
                        } else {
                            throw new IllegalArgumentException("datePicker format error");
                        }
                    } else if (this.f2930x == null) {
                        C0590b bVar3 = new C0590b();
                        this.f2930x = bVar3;
                        arrayList.add(bVar3);
                        this.f2930x.mo3594g("%02d");
                        this.f2920A = i;
                    } else {
                        throw new IllegalArgumentException("datePicker format error");
                    }
                }
                setColumns(arrayList);
                m3108t(false);
                return;
            }
            throw new IllegalStateException("Separators size: " + l.size() + " must equal" + " the size of datePickerFormat: " + str.length() + " + 1");
        }
    }

    public void setMaxDate(long j) {
        this.f2927H.setTimeInMillis(j);
        if (this.f2927H.get(1) != this.f2925F.get(1) || this.f2927H.get(6) == this.f2925F.get(6)) {
            this.f2925F.setTimeInMillis(j);
            if (this.f2926G.after(this.f2925F)) {
                this.f2926G.setTimeInMillis(this.f2925F.getTimeInMillis());
            }
            m3108t(false);
        }
    }

    public void setMinDate(long j) {
        this.f2927H.setTimeInMillis(j);
        if (this.f2927H.get(1) != this.f2924E.get(1) || this.f2927H.get(6) == this.f2924E.get(6)) {
            this.f2924E.setTimeInMillis(j);
            if (this.f2926G.before(this.f2924E)) {
                this.f2926G.setTimeInMillis(this.f2924E.getTimeInMillis());
            }
            m3108t(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo3553u(boolean z) {
        int[] iArr = {this.f2920A, this.f2932z, this.f2921B};
        boolean z2 = true;
        boolean z3 = true;
        for (int length = f2919u.length - 1; length >= 0; length--) {
            if (iArr[length] >= 0) {
                int i = f2919u[length];
                C0590b a = mo3555a(iArr[length]);
                boolean s = m3107s(a, z2 ? this.f2924E.get(i) : this.f2926G.getActualMinimum(i)) | false | m3106r(a, z3 ? this.f2925F.get(i) : this.f2926G.getActualMaximum(i));
                z2 &= this.f2926G.get(i) == this.f2924E.get(i);
                z3 &= this.f2926G.get(i) == this.f2925F.get(i);
                if (s) {
                    mo3556d(iArr[length], a);
                }
                mo3558e(iArr[length], this.f2926G.get(i), z);
            }
        }
    }
}
