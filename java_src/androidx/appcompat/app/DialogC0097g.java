package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p006b.p007a.C0754a;
import p006b.p007a.p014o.AbstractC0785b;
import p006b.p030g.p039k.C0998e;

/* renamed from: androidx.appcompat.app.g */
public class DialogC0097g extends Dialog implements AbstractC0071d {

    /* renamed from: b */
    private AbstractC0072e f328b;

    /* renamed from: c */
    private final C0998e.AbstractC0999a f329c = new C0098a();

    /* renamed from: androidx.appcompat.app.g$a */
    class C0098a implements C0998e.AbstractC0999a {
        C0098a() {
        }

        @Override // p006b.p030g.p039k.C0998e.AbstractC0999a
        /* renamed from: h */
        public boolean mo390h(KeyEvent keyEvent) {
            return DialogC0097g.this.mo379c(keyEvent);
        }
    }

    public DialogC0097g(Context context, int i) {
        super(context, m423b(context, i));
        AbstractC0072e a = mo377a();
        a.mo285F(m423b(context, i));
        a.mo297q(null);
    }

    /* renamed from: b */
    private static int m423b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0754a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.AbstractC0071d
    /* renamed from: S */
    public void mo249S(AbstractC0785b bVar) {
    }

    /* renamed from: a */
    public AbstractC0072e mo377a() {
        if (this.f328b == null) {
            this.f328b = AbstractC0072e.m272h(this, this);
        }
        return this.f328b;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo377a().mo287d(view, layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo379c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: d */
    public boolean mo380d(int i) {
        return mo377a().mo304z(i);
    }

    public void dismiss() {
        super.dismiss();
        mo377a().mo298r();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C0998e.m5674e(this.f329c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) mo377a().mo290i(i);
    }

    public void invalidateOptionsMenu() {
        mo377a().mo295o();
    }

    @Override // androidx.appcompat.app.AbstractC0071d
    /* renamed from: l0 */
    public void mo262l0(AbstractC0785b bVar) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        mo377a().mo294n();
        super.onCreate(bundle);
        mo377a().mo297q(bundle);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        mo377a().mo303w();
    }

    @Override // androidx.appcompat.app.AbstractC0071d
    /* renamed from: p0 */
    public AbstractC0785b mo276p0(AbstractC0785b.AbstractC0786a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        mo377a().mo281B(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        mo377a().mo282C(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        mo377a().mo283D(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        mo377a().mo286G(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        mo377a().mo286G(charSequence);
    }
}
