package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0230h0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p006b.p007a.C0754a;
import p006b.p007a.C0759f;
import p006b.p007a.C0763j;
import p006b.p030g.p039k.C1013s;

/* access modifiers changed from: package-private */
public class AlertController {

    /* renamed from: A */
    NestedScrollView f108A;

    /* renamed from: B */
    private int f109B = 0;

    /* renamed from: C */
    private Drawable f110C;

    /* renamed from: D */
    private ImageView f111D;

    /* renamed from: E */
    private TextView f112E;

    /* renamed from: F */
    private TextView f113F;

    /* renamed from: G */
    private View f114G;

    /* renamed from: H */
    ListAdapter f115H;

    /* renamed from: I */
    int f116I = -1;

    /* renamed from: J */
    private int f117J;

    /* renamed from: K */
    private int f118K;

    /* renamed from: L */
    int f119L;

    /* renamed from: M */
    int f120M;

    /* renamed from: N */
    int f121N;

    /* renamed from: O */
    int f122O;

    /* renamed from: P */
    private boolean f123P;

    /* renamed from: Q */
    private int f124Q = 0;

    /* renamed from: R */
    Handler f125R;

    /* renamed from: S */
    private final View.OnClickListener f126S = new View$OnClickListenerC0051a();

    /* renamed from: a */
    private final Context f127a;

    /* renamed from: b */
    final DialogC0097g f128b;

    /* renamed from: c */
    private final Window f129c;

    /* renamed from: d */
    private final int f130d;

    /* renamed from: e */
    private CharSequence f131e;

    /* renamed from: f */
    private CharSequence f132f;

    /* renamed from: g */
    ListView f133g;

    /* renamed from: h */
    private View f134h;

    /* renamed from: i */
    private int f135i;

    /* renamed from: j */
    private int f136j;

    /* renamed from: k */
    private int f137k;

    /* renamed from: l */
    private int f138l;

    /* renamed from: m */
    private int f139m;

    /* renamed from: n */
    private boolean f140n = false;

    /* renamed from: o */
    Button f141o;

    /* renamed from: p */
    private CharSequence f142p;

    /* renamed from: q */
    Message f143q;

    /* renamed from: r */
    private Drawable f144r;

    /* renamed from: s */
    Button f145s;

    /* renamed from: t */
    private CharSequence f146t;

    /* renamed from: u */
    Message f147u;

    /* renamed from: v */
    private Drawable f148v;

    /* renamed from: w */
    Button f149w;

    /* renamed from: x */
    private CharSequence f150x;

    /* renamed from: y */
    Message f151y;

    /* renamed from: z */
    private Drawable f152z;

    public static class RecycleListView extends ListView {

        /* renamed from: b */
        private final int f153b;

        /* renamed from: c */
        private final int f154c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0763j.f3730f2);
            this.f154c = obtainStyledAttributes.getDimensionPixelOffset(C0763j.f3735g2, -1);
            this.f153b = obtainStyledAttributes.getDimensionPixelOffset(C0763j.f3740h2, -1);
        }

        /* renamed from: a */
        public void mo175a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f153b, getPaddingRight(), z2 ? getPaddingBottom() : this.f154c);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class View$OnClickListenerC0051a implements View.OnClickListener {
        View$OnClickListenerC0051a() {
        }

        public void onClick(View view) {
            Message message;
            Message message2;
            AlertController alertController = AlertController.this;
            Message obtain = ((view != alertController.f141o || (message2 = alertController.f143q) == null) && (view != alertController.f145s || (message2 = alertController.f147u) == null)) ? (view != alertController.f149w || (message = alertController.f151y) == null) ? null : Message.obtain(message) : Message.obtain(message2);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f125R.obtainMessage(1, alertController2.f128b).sendToTarget();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$b */
    public class C0052b implements NestedScrollView.AbstractC0405b {

        /* renamed from: a */
        final /* synthetic */ View f156a;

        /* renamed from: b */
        final /* synthetic */ View f157b;

        C0052b(View view, View view2) {
            this.f156a = view;
            this.f157b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.AbstractC0405b
        /* renamed from: a */
        public void mo177a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m175g(nestedScrollView, this.f156a, this.f157b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$c */
    public class RunnableC0053c implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f159b;

        /* renamed from: c */
        final /* synthetic */ View f160c;

        RunnableC0053c(View view, View view2) {
            this.f159b = view;
            this.f160c = view2;
        }

        public void run() {
            AlertController.m175g(AlertController.this.f108A, this.f159b, this.f160c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$d */
    public class C0054d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f162a;

        /* renamed from: b */
        final /* synthetic */ View f163b;

        C0054d(View view, View view2) {
            this.f162a = view;
            this.f163b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m175g(absListView, this.f162a, this.f163b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$e */
    public class RunnableC0055e implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f165b;

        /* renamed from: c */
        final /* synthetic */ View f166c;

        RunnableC0055e(View view, View view2) {
            this.f165b = view;
            this.f166c = view2;
        }

        public void run() {
            AlertController.m175g(AlertController.this.f133g, this.f165b, this.f166c);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0056f {

        /* renamed from: A */
        public int f168A;

        /* renamed from: B */
        public int f169B;

        /* renamed from: C */
        public int f170C;

        /* renamed from: D */
        public int f171D;

        /* renamed from: E */
        public boolean f172E = false;

        /* renamed from: F */
        public boolean[] f173F;

        /* renamed from: G */
        public boolean f174G;

        /* renamed from: H */
        public boolean f175H;

        /* renamed from: I */
        public int f176I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f177J;

        /* renamed from: K */
        public Cursor f178K;

        /* renamed from: L */
        public String f179L;

        /* renamed from: M */
        public String f180M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f181N;

        /* renamed from: O */
        public AbstractC0061e f182O;

        /* renamed from: P */
        public boolean f183P = true;

        /* renamed from: a */
        public final Context f184a;

        /* renamed from: b */
        public final LayoutInflater f185b;

        /* renamed from: c */
        public int f186c = 0;

        /* renamed from: d */
        public Drawable f187d;

        /* renamed from: e */
        public int f188e = 0;

        /* renamed from: f */
        public CharSequence f189f;

        /* renamed from: g */
        public View f190g;

        /* renamed from: h */
        public CharSequence f191h;

        /* renamed from: i */
        public CharSequence f192i;

        /* renamed from: j */
        public Drawable f193j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f194k;

        /* renamed from: l */
        public CharSequence f195l;

        /* renamed from: m */
        public Drawable f196m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f197n;

        /* renamed from: o */
        public CharSequence f198o;

        /* renamed from: p */
        public Drawable f199p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f200q;

        /* renamed from: r */
        public boolean f201r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f202s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f203t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f204u;

        /* renamed from: v */
        public CharSequence[] f205v;

        /* renamed from: w */
        public ListAdapter f206w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f207x;

        /* renamed from: y */
        public int f208y;

        /* renamed from: z */
        public View f209z;

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        public class C0057a extends ArrayAdapter<CharSequence> {

            /* renamed from: b */
            final /* synthetic */ RecycleListView f210b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0057a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f210b = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0056f.this.f173F;
                if (zArr != null && zArr[i]) {
                    this.f210b.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        public class C0058b extends CursorAdapter {

            /* renamed from: b */
            private final int f212b;

            /* renamed from: c */
            private final int f213c;

            /* renamed from: d */
            final /* synthetic */ RecycleListView f214d;

            /* renamed from: e */
            final /* synthetic */ AlertController f215e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0058b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f214d = recycleListView;
                this.f215e = alertController;
                Cursor cursor2 = getCursor();
                this.f212b = cursor2.getColumnIndexOrThrow(C0056f.this.f179L);
                this.f213c = cursor2.getColumnIndexOrThrow(C0056f.this.f180M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f212b));
                RecycleListView recycleListView = this.f214d;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f213c) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0056f.this.f185b.inflate(this.f215e.f120M, viewGroup, false);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        public class C0059c implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ AlertController f217b;

            C0059c(AlertController alertController) {
                this.f217b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0056f.this.f207x.onClick(this.f217b.f128b, i);
                if (!C0056f.this.f175H) {
                    this.f217b.f128b.dismiss();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        public class C0060d implements AdapterView.OnItemClickListener {

            /* renamed from: b */
            final /* synthetic */ RecycleListView f219b;

            /* renamed from: c */
            final /* synthetic */ AlertController f220c;

            C0060d(RecycleListView recycleListView, AlertController alertController) {
                this.f219b = recycleListView;
                this.f220c = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0056f.this.f173F;
                if (zArr != null) {
                    zArr[i] = this.f219b.isItemChecked(i);
                }
                C0056f.this.f177J.onClick(this.f220c.f128b, i, this.f219b.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface AbstractC0061e {
            /* renamed from: a */
            void mo188a(ListView listView);
        }

        public C0056f(Context context) {
            this.f184a = context;
            this.f201r = true;
            this.f185b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m201b(androidx.appcompat.app.AlertController r11) {
            /*
            // Method dump skipped, instructions count: 169
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0056f.m201b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo182a(AlertController alertController) {
            View view = this.f190g;
            if (view != null) {
                alertController.mo167m(view);
            } else {
                CharSequence charSequence = this.f189f;
                if (charSequence != null) {
                    alertController.mo171r(charSequence);
                }
                Drawable drawable = this.f187d;
                if (drawable != null) {
                    alertController.mo169o(drawable);
                }
                int i = this.f186c;
                if (i != 0) {
                    alertController.mo168n(i);
                }
                int i2 = this.f188e;
                if (i2 != 0) {
                    alertController.mo168n(alertController.mo161d(i2));
                }
            }
            CharSequence charSequence2 = this.f191h;
            if (charSequence2 != null) {
                alertController.mo170p(charSequence2);
            }
            CharSequence charSequence3 = this.f192i;
            if (!(charSequence3 == null && this.f193j == null)) {
                alertController.mo166l(-1, charSequence3, this.f194k, null, this.f193j);
            }
            CharSequence charSequence4 = this.f195l;
            if (!(charSequence4 == null && this.f196m == null)) {
                alertController.mo166l(-2, charSequence4, this.f197n, null, this.f196m);
            }
            CharSequence charSequence5 = this.f198o;
            if (!(charSequence5 == null && this.f199p == null)) {
                alertController.mo166l(-3, charSequence5, this.f200q, null, this.f199p);
            }
            if (!(this.f205v == null && this.f178K == null && this.f206w == null)) {
                m201b(alertController);
            }
            View view2 = this.f209z;
            if (view2 == null) {
                int i3 = this.f208y;
                if (i3 != 0) {
                    alertController.mo172s(i3);
                }
            } else if (this.f172E) {
                alertController.mo174u(view2, this.f168A, this.f169B, this.f170C, this.f171D);
            } else {
                alertController.mo173t(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class HandlerC0062g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f222a;

        public HandlerC0062g(DialogInterface dialogInterface) {
            this.f222a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f222a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AlertController$h */
    public static class C0063h extends ArrayAdapter<CharSequence> {
        public C0063h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0097g gVar, Window window) {
        this.f127a = context;
        this.f128b = gVar;
        this.f129c = window;
        this.f125R = new HandlerC0062g(gVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0763j.f3598F, C0754a.alertDialogStyle, 0);
        this.f117J = obtainStyledAttributes.getResourceId(C0763j.f3603G, 0);
        this.f118K = obtainStyledAttributes.getResourceId(C0763j.f3613I, 0);
        this.f119L = obtainStyledAttributes.getResourceId(C0763j.f3623K, 0);
        this.f120M = obtainStyledAttributes.getResourceId(C0763j.f3628L, 0);
        this.f121N = obtainStyledAttributes.getResourceId(C0763j.f3638N, 0);
        this.f122O = obtainStyledAttributes.getResourceId(C0763j.f3618J, 0);
        this.f123P = obtainStyledAttributes.getBoolean(C0763j.f3633M, true);
        this.f130d = obtainStyledAttributes.getDimensionPixelSize(C0763j.f3608H, 0);
        obtainStyledAttributes.recycle();
        gVar.mo380d(1);
    }

    /* renamed from: A */
    private static boolean m172A(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0754a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: a */
    static boolean m173a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m173a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m174b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: g */
    static void m175g(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: j */
    private ViewGroup m176j(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: k */
    private int m177k() {
        int i = this.f118K;
        return i == 0 ? this.f117J : this.f124Q == 1 ? i : this.f117J;
    }

    /* renamed from: q */
    private void m178q(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f129c.findViewById(C0759f.scrollIndicatorUp);
        View findViewById2 = this.f129c.findViewById(C0759f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C1013s.m5794w0(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 == null) {
                return;
            }
        } else {
            if (findViewById != null && (i & 1) == 0) {
                viewGroup.removeView(findViewById);
                findViewById = null;
            }
            if (findViewById2 != null && (i & 2) == 0) {
                viewGroup.removeView(findViewById2);
                findViewById2 = null;
            }
            if (findViewById != null || findViewById2 != null) {
                if (this.f132f != null) {
                    this.f108A.setOnScrollChangeListener(new C0052b(findViewById, findViewById2));
                    this.f108A.post(new RunnableC0053c(findViewById, findViewById2));
                    return;
                }
                ListView listView = this.f133g;
                if (listView != null) {
                    listView.setOnScrollListener(new C0054d(findViewById, findViewById2));
                    this.f133g.post(new RunnableC0055e(findViewById, findViewById2));
                    return;
                }
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (findViewById2 == null) {
                    return;
                }
            } else {
                return;
            }
        }
        viewGroup.removeView(findViewById2);
    }

    /* renamed from: v */
    private void m179v(ViewGroup viewGroup) {
        boolean z;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f141o = button2;
        button2.setOnClickListener(this.f126S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f142p) || this.f144r != null) {
            this.f141o.setText(this.f142p);
            Drawable drawable = this.f144r;
            if (drawable != null) {
                int i = this.f130d;
                drawable.setBounds(0, 0, i, i);
                this.f141o.setCompoundDrawables(this.f144r, null, null, null);
            }
            this.f141o.setVisibility(0);
            z = true;
        } else {
            this.f141o.setVisibility(8);
            z = false;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f145s = button3;
        button3.setOnClickListener(this.f126S);
        if (!TextUtils.isEmpty(this.f146t) || this.f148v != null) {
            this.f145s.setText(this.f146t);
            Drawable drawable2 = this.f148v;
            if (drawable2 != null) {
                int i2 = this.f130d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f145s.setCompoundDrawables(this.f148v, null, null, null);
            }
            this.f145s.setVisibility(0);
            z |= true;
        } else {
            this.f145s.setVisibility(8);
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f149w = button4;
        button4.setOnClickListener(this.f126S);
        if (!TextUtils.isEmpty(this.f150x) || this.f152z != null) {
            this.f149w.setText(this.f150x);
            Drawable drawable3 = this.f152z;
            if (drawable3 != null) {
                int i3 = this.f130d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f149w.setCompoundDrawables(this.f152z, null, null, null);
            }
            this.f149w.setVisibility(0);
            z |= true;
        } else {
            this.f149w.setVisibility(8);
        }
        if (m172A(this.f127a)) {
            if (z) {
                button = this.f141o;
            } else if (z) {
                button = this.f145s;
            } else if (z) {
                button = this.f149w;
            }
            m174b(button);
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: w */
    private void m180w(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f129c.findViewById(C0759f.scrollView);
        this.f108A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f108A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f113F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f132f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f108A.removeView(this.f113F);
            if (this.f133g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f108A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f108A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f133g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: x */
    private void m181x(ViewGroup viewGroup) {
        View view = this.f134h;
        boolean z = false;
        if (view == null) {
            view = this.f135i != 0 ? LayoutInflater.from(this.f127a).inflate(this.f135i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m173a(view)) {
            this.f129c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f129c.findViewById(C0759f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f140n) {
                frameLayout.setPadding(this.f136j, this.f137k, this.f138l, this.f139m);
            }
            if (this.f133g != null) {
                ((C0230h0.C0231a) viewGroup.getLayoutParams()).f1030a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: y */
    private void m182y(ViewGroup viewGroup) {
        if (this.f114G != null) {
            viewGroup.addView(this.f114G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f129c.findViewById(C0759f.title_template).setVisibility(8);
            return;
        }
        this.f111D = (ImageView) this.f129c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f131e)) || !this.f123P) {
            this.f129c.findViewById(C0759f.title_template).setVisibility(8);
            this.f111D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f129c.findViewById(C0759f.alertTitle);
        this.f112E = textView;
        textView.setText(this.f131e);
        int i = this.f109B;
        if (i != 0) {
            this.f111D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f110C;
        if (drawable != null) {
            this.f111D.setImageDrawable(drawable);
            return;
        }
        this.f112E.setPadding(this.f111D.getPaddingLeft(), this.f111D.getPaddingTop(), this.f111D.getPaddingRight(), this.f111D.getPaddingBottom());
        this.f111D.setVisibility(8);
    }

    /* renamed from: z */
    private void m183z() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f129c.findViewById(C0759f.parentPanel);
        int i = C0759f.topPanel;
        View findViewById4 = findViewById3.findViewById(i);
        int i2 = C0759f.contentPanel;
        View findViewById5 = findViewById3.findViewById(i2);
        int i3 = C0759f.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i3);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C0759f.customPanel);
        m181x(viewGroup);
        View findViewById7 = viewGroup.findViewById(i);
        View findViewById8 = viewGroup.findViewById(i2);
        View findViewById9 = viewGroup.findViewById(i3);
        ViewGroup j = m176j(findViewById7, findViewById4);
        ViewGroup j2 = m176j(findViewById8, findViewById5);
        ViewGroup j3 = m176j(findViewById9, findViewById6);
        m180w(j2);
        m179v(j3);
        m182y(j);
        int i4 = 0;
        boolean z = viewGroup.getVisibility() != 8;
        boolean z2 = (j == null || j.getVisibility() == 8) ? false : true;
        boolean z3 = (j3 == null || j3.getVisibility() == 8) ? false : true;
        if (!(z3 || j2 == null || (findViewById2 = j2.findViewById(C0759f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f108A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f132f == null && this.f133g == null)) {
                view = j.findViewById(C0759f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(j2 == null || (findViewById = j2.findViewById(C0759f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f133g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo175a(z2, z3);
        }
        if (!z) {
            View view2 = this.f133g;
            if (view2 == null) {
                view2 = this.f108A;
            }
            if (view2 != null) {
                if (z3) {
                    i4 = 2;
                }
                int i5 = z2 ? 1 : 0;
                char c = z2 ? 1 : 0;
                char c2 = z2 ? 1 : 0;
                m178q(j2, view2, i5 | i4, 3);
            }
        }
        ListView listView2 = this.f133g;
        if (listView2 != null && (listAdapter = this.f115H) != null) {
            listView2.setAdapter(listAdapter);
            int i6 = this.f116I;
            if (i6 > -1) {
                listView2.setItemChecked(i6, true);
                listView2.setSelection(i6);
            }
        }
    }

    /* renamed from: c */
    public Button mo160c(int i) {
        if (i == -3) {
            return this.f149w;
        }
        if (i == -2) {
            return this.f145s;
        }
        if (i != -1) {
            return null;
        }
        return this.f141o;
    }

    /* renamed from: d */
    public int mo161d(int i) {
        TypedValue typedValue = new TypedValue();
        this.f127a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: e */
    public ListView mo162e() {
        return this.f133g;
    }

    /* renamed from: f */
    public void mo163f() {
        this.f128b.setContentView(m177k());
        m183z();
    }

    /* renamed from: h */
    public boolean mo164h(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f108A;
        return nestedScrollView != null && nestedScrollView.mo2345q(keyEvent);
    }

    /* renamed from: i */
    public boolean mo165i(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f108A;
        return nestedScrollView != null && nestedScrollView.mo2345q(keyEvent);
    }

    /* renamed from: l */
    public void mo166l(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f125R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f150x = charSequence;
            this.f151y = message;
            this.f152z = drawable;
        } else if (i == -2) {
            this.f146t = charSequence;
            this.f147u = message;
            this.f148v = drawable;
        } else if (i == -1) {
            this.f142p = charSequence;
            this.f143q = message;
            this.f144r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: m */
    public void mo167m(View view) {
        this.f114G = view;
    }

    /* renamed from: n */
    public void mo168n(int i) {
        this.f110C = null;
        this.f109B = i;
        ImageView imageView = this.f111D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f111D.setImageResource(this.f109B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: o */
    public void mo169o(Drawable drawable) {
        this.f110C = drawable;
        this.f109B = 0;
        ImageView imageView = this.f111D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f111D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: p */
    public void mo170p(CharSequence charSequence) {
        this.f132f = charSequence;
        TextView textView = this.f113F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void mo171r(CharSequence charSequence) {
        this.f131e = charSequence;
        TextView textView = this.f112E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: s */
    public void mo172s(int i) {
        this.f134h = null;
        this.f135i = i;
        this.f140n = false;
    }

    /* renamed from: t */
    public void mo173t(View view) {
        this.f134h = view;
        this.f135i = 0;
        this.f140n = false;
    }

    /* renamed from: u */
    public void mo174u(View view, int i, int i2, int i3, int i4) {
        this.f134h = view;
        this.f135i = 0;
        this.f140n = true;
        this.f136j = i;
        this.f137k = i2;
        this.f138l = i3;
        this.f139m = i4;
    }
}
