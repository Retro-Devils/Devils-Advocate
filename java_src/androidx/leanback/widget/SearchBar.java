package androidx.leanback.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.leanback.widget.SearchEditText;
import androidx.leanback.widget.SearchOrbView;
import java.util.ArrayList;
import p006b.p053m.C1070b;
import p006b.p053m.C1071c;
import p006b.p053m.C1074f;
import p006b.p053m.C1075g;
import p006b.p053m.C1076h;
import p006b.p053m.C1077i;
import p006b.p053m.C1078j;

public class SearchBar extends RelativeLayout {

    /* renamed from: b */
    static final String f2689b = SearchBar.class.getSimpleName();

    /* renamed from: A */
    boolean f2690A;

    /* renamed from: B */
    private final Context f2691B;

    /* renamed from: C */
    private AudioManager f2692C;

    /* renamed from: D */
    private AbstractC0541l f2693D;

    /* renamed from: c */
    AbstractC0540k f2694c;

    /* renamed from: d */
    SearchEditText f2695d;

    /* renamed from: e */
    SpeechOrbView f2696e;

    /* renamed from: f */
    private ImageView f2697f;

    /* renamed from: g */
    String f2698g;

    /* renamed from: h */
    private String f2699h;

    /* renamed from: i */
    private String f2700i;

    /* renamed from: j */
    private Drawable f2701j;

    /* renamed from: k */
    final Handler f2702k;

    /* renamed from: l */
    private final InputMethodManager f2703l;

    /* renamed from: m */
    boolean f2704m;

    /* renamed from: n */
    private Drawable f2705n;

    /* renamed from: o */
    private final int f2706o;

    /* renamed from: p */
    private final int f2707p;

    /* renamed from: q */
    private final int f2708q;

    /* renamed from: r */
    private final int f2709r;

    /* renamed from: s */
    private int f2710s;

    /* renamed from: t */
    private int f2711t;

    /* renamed from: u */
    private int f2712u;

    /* renamed from: v */
    private SpeechRecognizer f2713v;

    /* renamed from: w */
    private AbstractC0596t f2714w;

    /* renamed from: x */
    private boolean f2715x;

    /* renamed from: y */
    SoundPool f2716y;

    /* renamed from: z */
    SparseIntArray f2717z;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.leanback.widget.SearchBar$a */
    public class RunnableC0527a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ int f2718b;

        RunnableC0527a(int i) {
            this.f2718b = i;
        }

        public void run() {
            SearchBar.this.f2716y.play(SearchBar.this.f2717z.get(this.f2718b), 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$b */
    class View$OnFocusChangeListenerC0528b implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC0528b() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchBar searchBar = SearchBar.this;
            if (z) {
                searchBar.mo3090h();
            } else {
                searchBar.mo3083a();
            }
            SearchBar.this.mo3095n(z);
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$c */
    class RunnableC0529c implements Runnable {
        RunnableC0529c() {
        }

        public void run() {
            SearchBar searchBar = SearchBar.this;
            searchBar.setSearchQueryInternal(searchBar.f2695d.getText().toString());
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$d */
    class C0530d implements TextWatcher {

        /* renamed from: b */
        final /* synthetic */ Runnable f2722b;

        C0530d(Runnable runnable) {
            this.f2722b = runnable;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchBar searchBar = SearchBar.this;
            if (!searchBar.f2690A) {
                searchBar.f2702k.removeCallbacks(this.f2722b);
                SearchBar.this.f2702k.post(this.f2722b);
            }
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$e */
    class C0531e implements SearchEditText.AbstractC0542a {
        C0531e() {
        }

        @Override // androidx.leanback.widget.SearchEditText.AbstractC0542a
        /* renamed from: a */
        public void mo3116a() {
            SearchBar searchBar = SearchBar.this;
            AbstractC0540k kVar = searchBar.f2694c;
            if (kVar != null) {
                kVar.mo3134b(searchBar.f2698g);
            }
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$f */
    class C0532f implements TextView.OnEditorActionListener {

        /* renamed from: androidx.leanback.widget.SearchBar$f$a */
        class RunnableC0533a implements Runnable {
            RunnableC0533a() {
            }

            public void run() {
                SearchBar.this.mo3093k();
            }
        }

        /* renamed from: androidx.leanback.widget.SearchBar$f$b */
        class RunnableC0534b implements Runnable {
            RunnableC0534b() {
            }

            public void run() {
                SearchBar searchBar = SearchBar.this;
                searchBar.f2694c.mo3134b(searchBar.f2698g);
            }
        }

        /* renamed from: androidx.leanback.widget.SearchBar$f$c */
        class RunnableC0535c implements Runnable {
            RunnableC0535c() {
            }

            public void run() {
                SearchBar searchBar = SearchBar.this;
                searchBar.f2704m = true;
                searchBar.f2696e.requestFocus();
            }
        }

        C0532f() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            Handler handler;
            Runnable cVar;
            if (3 == i || i == 0) {
                SearchBar searchBar = SearchBar.this;
                if (searchBar.f2694c != null) {
                    searchBar.mo3083a();
                    handler = SearchBar.this.f2702k;
                    cVar = new RunnableC0533a();
                    handler.postDelayed(cVar, 500);
                    return true;
                }
            }
            if (1 == i) {
                SearchBar searchBar2 = SearchBar.this;
                if (searchBar2.f2694c != null) {
                    searchBar2.mo3083a();
                    handler = SearchBar.this.f2702k;
                    cVar = new RunnableC0534b();
                    handler.postDelayed(cVar, 500);
                    return true;
                }
            }
            if (2 != i) {
                return false;
            }
            SearchBar.this.mo3083a();
            handler = SearchBar.this.f2702k;
            cVar = new RunnableC0535c();
            handler.postDelayed(cVar, 500);
            return true;
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$g */
    class View$OnClickListenerC0536g implements View.OnClickListener {
        View$OnClickListenerC0536g() {
        }

        public void onClick(View view) {
            SearchBar.this.mo3094l();
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$h */
    class View$OnFocusChangeListenerC0537h implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC0537h() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchBar searchBar = SearchBar.this;
            if (z) {
                searchBar.mo3083a();
                SearchBar searchBar2 = SearchBar.this;
                if (searchBar2.f2704m) {
                    searchBar2.mo3091i();
                    SearchBar.this.f2704m = false;
                }
            } else {
                searchBar.mo3092j();
            }
            SearchBar.this.mo3095n(z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.leanback.widget.SearchBar$i */
    public class RunnableC0538i implements Runnable {
        RunnableC0538i() {
        }

        public void run() {
            SearchBar.this.f2695d.requestFocusFromTouch();
            SearchBar.this.f2695d.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, (float) SearchBar.this.f2695d.getWidth(), (float) SearchBar.this.f2695d.getHeight(), 0));
            SearchBar.this.f2695d.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, (float) SearchBar.this.f2695d.getWidth(), (float) SearchBar.this.f2695d.getHeight(), 0));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.leanback.widget.SearchBar$j */
    public class C0539j implements RecognitionListener {
        C0539j() {
        }

        public void onBeginningOfSpeech() {
        }

        public void onBufferReceived(byte[] bArr) {
        }

        public void onEndOfSpeech() {
        }

        public void onError(int i) {
            String str;
            String str2;
            switch (i) {
                case 1:
                    str = SearchBar.f2689b;
                    str2 = "recognizer network timeout";
                    Log.w(str, str2);
                    break;
                case 2:
                    str = SearchBar.f2689b;
                    str2 = "recognizer network error";
                    Log.w(str, str2);
                    break;
                case 3:
                    str = SearchBar.f2689b;
                    str2 = "recognizer audio error";
                    Log.w(str, str2);
                    break;
                case 4:
                    str = SearchBar.f2689b;
                    str2 = "recognizer server error";
                    Log.w(str, str2);
                    break;
                case 5:
                    str = SearchBar.f2689b;
                    str2 = "recognizer client error";
                    Log.w(str, str2);
                    break;
                case 6:
                    str = SearchBar.f2689b;
                    str2 = "recognizer speech timeout";
                    Log.w(str, str2);
                    break;
                case 7:
                    str = SearchBar.f2689b;
                    str2 = "recognizer no match";
                    Log.w(str, str2);
                    break;
                case 8:
                    str = SearchBar.f2689b;
                    str2 = "recognizer busy";
                    Log.w(str, str2);
                    break;
                case 9:
                    str = SearchBar.f2689b;
                    str2 = "recognizer insufficient permissions";
                    Log.w(str, str2);
                    break;
                default:
                    Log.d(SearchBar.f2689b, "recognizer other error");
                    break;
            }
            SearchBar.this.mo3092j();
            SearchBar.this.mo3084e();
        }

        public void onEvent(int i, Bundle bundle) {
        }

        public void onPartialResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList != null && stringArrayList.size() != 0) {
                SearchBar.this.f2695d.mo3138g(stringArrayList.get(0), stringArrayList.size() > 1 ? stringArrayList.get(1) : null);
            }
        }

        public void onReadyForSpeech(Bundle bundle) {
            SearchBar.this.f2696e.mo3182f();
            SearchBar.this.mo3085f();
        }

        public void onResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            if (stringArrayList != null) {
                SearchBar.this.f2698g = stringArrayList.get(0);
                SearchBar searchBar = SearchBar.this;
                searchBar.f2695d.setText(searchBar.f2698g);
                SearchBar.this.mo3093k();
            }
            SearchBar.this.mo3092j();
            SearchBar.this.mo3086g();
        }

        public void onRmsChanged(float f) {
            SearchBar.this.f2696e.setSoundLevel(f < 0.0f ? 0 : (int) (f * 10.0f));
        }
    }

    /* renamed from: androidx.leanback.widget.SearchBar$k */
    public interface AbstractC0540k {
        /* renamed from: a */
        void mo3133a(String str);

        /* renamed from: b */
        void mo3134b(String str);

        /* renamed from: c */
        void mo3135c(String str);
    }

    /* renamed from: androidx.leanback.widget.SearchBar$l */
    public interface AbstractC0541l {
        /* renamed from: a */
        void mo3136a();
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2702k = new Handler();
        this.f2704m = false;
        this.f2717z = new SparseIntArray();
        this.f2690A = false;
        this.f2691B = context;
        Resources resources = getResources();
        LayoutInflater.from(getContext()).inflate(C1076h.lb_search_bar, (ViewGroup) this, true);
        this.f2712u = getResources().getDimensionPixelSize(C1071c.lb_search_bar_height);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.f2712u);
        layoutParams.addRule(10, -1);
        setLayoutParams(layoutParams);
        setBackgroundColor(0);
        setClipChildren(false);
        this.f2698g = "";
        this.f2703l = (InputMethodManager) context.getSystemService("input_method");
        this.f2707p = resources.getColor(C1070b.lb_search_bar_text_speech_mode);
        this.f2706o = resources.getColor(C1070b.lb_search_bar_text);
        this.f2711t = resources.getInteger(C1075g.lb_search_bar_speech_mode_background_alpha);
        this.f2710s = resources.getInteger(C1075g.lb_search_bar_text_mode_background_alpha);
        this.f2709r = resources.getColor(C1070b.lb_search_bar_hint_speech_mode);
        this.f2708q = resources.getColor(C1070b.lb_search_bar_hint);
        this.f2692C = (AudioManager) context.getSystemService("audio");
    }

    /* renamed from: b */
    private boolean m2752b() {
        return this.f2696e.isFocused();
    }

    /* renamed from: c */
    private void m2753c(Context context) {
        int[] iArr = {C1077i.lb_voice_failure, C1077i.lb_voice_open, C1077i.lb_voice_no_input, C1077i.lb_voice_success};
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            this.f2717z.put(i2, this.f2716y.load(context, i2, 1));
        }
    }

    /* renamed from: d */
    private void m2754d(int i) {
        this.f2702k.post(new RunnableC0527a(i));
    }

    /* renamed from: m */
    private void m2755m() {
        String string = getResources().getString(C1078j.lb_search_bar_hint);
        if (!TextUtils.isEmpty(this.f2700i)) {
            if (m2752b()) {
                string = getResources().getString(C1078j.lb_search_bar_hint_with_title_speech, this.f2700i);
            } else {
                string = getResources().getString(C1078j.lb_search_bar_hint_with_title, this.f2700i);
            }
        } else if (m2752b()) {
            string = getResources().getString(C1078j.lb_search_bar_hint_speech);
        }
        this.f2699h = string;
        SearchEditText searchEditText = this.f2695d;
        if (searchEditText != null) {
            searchEditText.setHint(string);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3083a() {
        this.f2703l.hideSoftInputFromWindow(this.f2695d.getWindowToken(), 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3084e() {
        m2754d(C1077i.lb_voice_failure);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo3085f() {
        m2754d(C1077i.lb_voice_open);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3086g() {
        m2754d(C1077i.lb_voice_success);
    }

    public Drawable getBadgeDrawable() {
        return this.f2701j;
    }

    public CharSequence getHint() {
        return this.f2699h;
    }

    public String getTitle() {
        return this.f2700i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo3090h() {
        this.f2702k.post(new RunnableC0538i());
    }

    /* renamed from: i */
    public void mo3091i() {
        AbstractC0541l lVar;
        if (!this.f2690A) {
            if (!hasFocus()) {
                requestFocus();
            }
            if (this.f2714w != null) {
                this.f2695d.setText("");
                this.f2695d.setHint("");
                this.f2714w.mo3606a();
                this.f2690A = true;
            } else if (this.f2713v != null) {
                if (getContext().checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0) {
                    this.f2690A = true;
                    this.f2695d.setText("");
                    Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                    intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                    intent.putExtra("android.speech.extra.PARTIAL_RESULTS", true);
                    this.f2713v.setRecognitionListener(new C0539j());
                    this.f2715x = true;
                    this.f2713v.startListening(intent);
                } else if (Build.VERSION.SDK_INT < 23 || (lVar = this.f2693D) == null) {
                    throw new IllegalStateException("android.permission.RECORD_AUDIO required for search");
                } else {
                    lVar.mo3136a();
                }
            }
        }
    }

    /* renamed from: j */
    public void mo3092j() {
        if (this.f2690A) {
            this.f2695d.setText(this.f2698g);
            this.f2695d.setHint(this.f2699h);
            this.f2690A = false;
            if (this.f2714w == null && this.f2713v != null) {
                this.f2696e.mo3183g();
                if (this.f2715x) {
                    this.f2713v.cancel();
                    this.f2715x = false;
                }
                this.f2713v.setRecognitionListener(null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo3093k() {
        AbstractC0540k kVar;
        if (!TextUtils.isEmpty(this.f2698g) && (kVar = this.f2694c) != null) {
            kVar.mo3133a(this.f2698g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3094l() {
        if (this.f2690A) {
            mo3092j();
        } else {
            mo3091i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo3095n(boolean z) {
        SearchEditText searchEditText;
        int i;
        SearchEditText searchEditText2;
        int i2;
        if (z) {
            this.f2705n.setAlpha(this.f2711t);
            if (m2752b()) {
                searchEditText2 = this.f2695d;
                i2 = this.f2709r;
            } else {
                searchEditText2 = this.f2695d;
                i2 = this.f2707p;
            }
            searchEditText2.setTextColor(i2);
            searchEditText = this.f2695d;
            i = this.f2709r;
        } else {
            this.f2705n.setAlpha(this.f2710s);
            this.f2695d.setTextColor(this.f2706o);
            searchEditText = this.f2695d;
            i = this.f2708q;
        }
        searchEditText.setHintTextColor(i);
        m2755m();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2716y = new SoundPool(2, 1, 0);
        m2753c(this.f2691B);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        mo3092j();
        this.f2716y.release();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2705n = ((RelativeLayout) findViewById(C1074f.lb_search_bar_items)).getBackground();
        this.f2695d = (SearchEditText) findViewById(C1074f.lb_search_text_editor);
        ImageView imageView = (ImageView) findViewById(C1074f.lb_search_bar_badge);
        this.f2697f = imageView;
        Drawable drawable = this.f2701j;
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        }
        this.f2695d.setOnFocusChangeListener(new View$OnFocusChangeListenerC0528b());
        this.f2695d.addTextChangedListener(new C0530d(new RunnableC0529c()));
        this.f2695d.setOnKeyboardDismissListener(new C0531e());
        this.f2695d.setOnEditorActionListener(new C0532f());
        this.f2695d.setPrivateImeOptions("escapeNorth,voiceDismiss");
        SpeechOrbView speechOrbView = (SpeechOrbView) findViewById(C1074f.lb_search_bar_speech_orb);
        this.f2696e = speechOrbView;
        speechOrbView.setOnOrbClickedListener(new View$OnClickListenerC0536g());
        this.f2696e.setOnFocusChangeListener(new View$OnFocusChangeListenerC0537h());
        mo3095n(hasFocus());
        m2755m();
    }

    public void setBadgeDrawable(Drawable drawable) {
        ImageView imageView;
        int i;
        this.f2701j = drawable;
        ImageView imageView2 = this.f2697f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
            if (drawable != null) {
                imageView = this.f2697f;
                i = 0;
            } else {
                imageView = this.f2697f;
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setNextFocusDownId(int i) {
        this.f2696e.setNextFocusDownId(i);
        this.f2695d.setNextFocusDownId(i);
    }

    public void setPermissionListener(AbstractC0541l lVar) {
        this.f2693D = lVar;
    }

    public void setSearchAffordanceColors(SearchOrbView.C0545c cVar) {
        SpeechOrbView speechOrbView = this.f2696e;
        if (speechOrbView != null) {
            speechOrbView.setNotListeningOrbColors(cVar);
        }
    }

    public void setSearchAffordanceColorsInListening(SearchOrbView.C0545c cVar) {
        SpeechOrbView speechOrbView = this.f2696e;
        if (speechOrbView != null) {
            speechOrbView.setListeningOrbColors(cVar);
        }
    }

    public void setSearchBarListener(AbstractC0540k kVar) {
        this.f2694c = kVar;
    }

    public void setSearchQuery(String str) {
        mo3092j();
        this.f2695d.setText(str);
        setSearchQueryInternal(str);
    }

    /* access modifiers changed from: package-private */
    public void setSearchQueryInternal(String str) {
        if (!TextUtils.equals(this.f2698g, str)) {
            this.f2698g = str;
            AbstractC0540k kVar = this.f2694c;
            if (kVar != null) {
                kVar.mo3135c(str);
            }
        }
    }

    @Deprecated
    public void setSpeechRecognitionCallback(AbstractC0596t tVar) {
        this.f2714w = tVar;
        if (tVar != null && this.f2713v != null) {
            throw new IllegalStateException("Can't have speech recognizer and request");
        }
    }

    public void setSpeechRecognizer(SpeechRecognizer speechRecognizer) {
        mo3092j();
        SpeechRecognizer speechRecognizer2 = this.f2713v;
        if (speechRecognizer2 != null) {
            speechRecognizer2.setRecognitionListener(null);
            if (this.f2715x) {
                this.f2713v.cancel();
                this.f2715x = false;
            }
        }
        this.f2713v = speechRecognizer;
        if (this.f2714w != null && speechRecognizer != null) {
            throw new IllegalStateException("Can't have speech recognizer and request");
        }
    }

    public void setTitle(String str) {
        this.f2700i = str;
        m2755m();
    }
}
