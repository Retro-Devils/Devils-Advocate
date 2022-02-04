package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p006b.p007a.C0754a;

/* renamed from: androidx.appcompat.app.b */
public class DialogInterfaceC0068b extends DialogC0097g implements DialogInterface {

    /* renamed from: d */
    final AlertController f224d = new AlertController(getContext(), this, getWindow());

    /* renamed from: androidx.appcompat.app.b$a */
    public static class C0069a {

        /* renamed from: a */
        private final AlertController.C0056f f225a;

        /* renamed from: b */
        private final int f226b;

        public C0069a(Context context) {
            this(context, DialogInterfaceC0068b.m227g(context, 0));
        }

        public C0069a(Context context, int i) {
            this.f225a = new AlertController.C0056f(new ContextThemeWrapper(context, DialogInterfaceC0068b.m227g(context, i)));
            this.f226b = i;
        }

        /* renamed from: a */
        public DialogInterfaceC0068b mo221a() {
            DialogInterfaceC0068b bVar = new DialogInterfaceC0068b(this.f225a.f184a, this.f226b);
            this.f225a.mo182a(bVar.f224d);
            bVar.setCancelable(this.f225a.f201r);
            if (this.f225a.f201r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f225a.f202s);
            bVar.setOnDismissListener(this.f225a.f203t);
            DialogInterface.OnKeyListener onKeyListener = this.f225a.f204u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        /* renamed from: b */
        public Context mo222b() {
            return this.f225a.f184a;
        }

        /* renamed from: c */
        public C0069a mo223c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056f fVar = this.f225a;
            fVar.f206w = listAdapter;
            fVar.f207x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0069a mo224d(boolean z) {
            this.f225a.f201r = z;
            return this;
        }

        /* renamed from: e */
        public C0069a mo225e(View view) {
            this.f225a.f190g = view;
            return this;
        }

        /* renamed from: f */
        public C0069a mo226f(Drawable drawable) {
            this.f225a.f187d = drawable;
            return this;
        }

        /* renamed from: g */
        public C0069a mo227g(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056f fVar = this.f225a;
            fVar.f205v = charSequenceArr;
            fVar.f207x = onClickListener;
            return this;
        }

        /* renamed from: h */
        public C0069a mo228h(int i) {
            AlertController.C0056f fVar = this.f225a;
            fVar.f191h = fVar.f184a.getText(i);
            return this;
        }

        /* renamed from: i */
        public C0069a mo229i(CharSequence charSequence) {
            this.f225a.f191h = charSequence;
            return this;
        }

        /* renamed from: j */
        public C0069a mo230j(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0056f fVar = this.f225a;
            fVar.f178K = cursor;
            fVar.f177J = onMultiChoiceClickListener;
            fVar.f180M = str;
            fVar.f179L = str2;
            fVar.f174G = true;
            return this;
        }

        /* renamed from: k */
        public C0069a mo231k(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.C0056f fVar = this.f225a;
            fVar.f205v = charSequenceArr;
            fVar.f177J = onMultiChoiceClickListener;
            fVar.f173F = zArr;
            fVar.f174G = true;
            return this;
        }

        /* renamed from: l */
        public C0069a mo232l(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056f fVar = this.f225a;
            fVar.f195l = fVar.f184a.getText(i);
            this.f225a.f197n = onClickListener;
            return this;
        }

        /* renamed from: m */
        public C0069a mo233m(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056f fVar = this.f225a;
            fVar.f198o = fVar.f184a.getText(i);
            this.f225a.f200q = onClickListener;
            return this;
        }

        /* renamed from: n */
        public C0069a mo234n(DialogInterface.OnKeyListener onKeyListener) {
            this.f225a.f204u = onKeyListener;
            return this;
        }

        /* renamed from: o */
        public C0069a mo235o(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056f fVar = this.f225a;
            fVar.f192i = fVar.f184a.getText(i);
            this.f225a.f194k = onClickListener;
            return this;
        }

        /* renamed from: p */
        public C0069a mo236p(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056f fVar = this.f225a;
            fVar.f206w = listAdapter;
            fVar.f207x = onClickListener;
            fVar.f176I = i;
            fVar.f175H = true;
            return this;
        }

        /* renamed from: q */
        public C0069a mo237q(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0056f fVar = this.f225a;
            fVar.f205v = charSequenceArr;
            fVar.f207x = onClickListener;
            fVar.f176I = i;
            fVar.f175H = true;
            return this;
        }

        /* renamed from: r */
        public C0069a mo238r(int i) {
            AlertController.C0056f fVar = this.f225a;
            fVar.f189f = fVar.f184a.getText(i);
            return this;
        }

        /* renamed from: s */
        public C0069a mo239s(CharSequence charSequence) {
            this.f225a.f189f = charSequence;
            return this;
        }

        /* renamed from: t */
        public C0069a mo240t(View view) {
            AlertController.C0056f fVar = this.f225a;
            fVar.f209z = view;
            fVar.f208y = 0;
            fVar.f172E = false;
            return this;
        }
    }

    protected DialogInterfaceC0068b(Context context, int i) {
        super(context, m227g(context, i));
    }

    /* renamed from: g */
    static int m227g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0754a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public Button mo215e(int i) {
        return this.f224d.mo160c(i);
    }

    /* renamed from: f */
    public ListView mo216f() {
        return this.f224d.mo162e();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.DialogC0097g
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f224d.mo163f();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f224d.mo164h(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f224d.mo165i(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Dialog, androidx.appcompat.app.DialogC0097g
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f224d.mo171r(charSequence);
    }
}
