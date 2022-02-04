package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.leanback.widget.SearchOrbView;
import p006b.p053m.C1070b;
import p006b.p053m.C1072d;
import p006b.p053m.C1073e;
import p006b.p053m.C1076h;

public class SpeechOrbView extends SearchOrbView {

    /* renamed from: t */
    private final float f2773t;

    /* renamed from: u */
    private SearchOrbView.C0545c f2774u;

    /* renamed from: v */
    private SearchOrbView.C0545c f2775v;

    /* renamed from: w */
    private int f2776w;

    /* renamed from: x */
    private boolean f2777x;

    public SpeechOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpeechOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2776w = 0;
        this.f2777x = false;
        Resources resources = context.getResources();
        this.f2773t = resources.getFraction(C1073e.lb_search_bar_speech_orb_max_level_zoom, 1, 1);
        this.f2775v = new SearchOrbView.C0545c(resources.getColor(C1070b.lb_speech_orb_not_recording), resources.getColor(C1070b.lb_speech_orb_not_recording_pulsed), resources.getColor(C1070b.lb_speech_orb_not_recording_icon));
        int i2 = C1070b.lb_speech_orb_recording;
        this.f2774u = new SearchOrbView.C0545c(resources.getColor(i2), resources.getColor(i2), 0);
        mo3183g();
    }

    /* renamed from: f */
    public void mo3182f() {
        setOrbColors(this.f2774u);
        setOrbIcon(getResources().getDrawable(C1072d.APKTOOL_DUMMY_17b));
        mo3144a(true);
        mo3145b(false);
        mo3146c(1.0f);
        this.f2776w = 0;
        this.f2777x = true;
    }

    /* renamed from: g */
    public void mo3183g() {
        setOrbColors(this.f2775v);
        setOrbIcon(getResources().getDrawable(C1072d.APKTOOL_DUMMY_17c));
        mo3144a(hasFocus());
        mo3146c(1.0f);
        this.f2777x = false;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.leanback.widget.SearchOrbView
    public int getLayoutResourceId() {
        return C1076h.lb_speech_orb;
    }

    public void setListeningOrbColors(SearchOrbView.C0545c cVar) {
        this.f2774u = cVar;
    }

    public void setNotListeningOrbColors(SearchOrbView.C0545c cVar) {
        this.f2775v = cVar;
    }

    public void setSoundLevel(int i) {
        if (this.f2777x) {
            int i2 = this.f2776w;
            if (i > i2) {
                this.f2776w = i2 + ((i - i2) / 2);
            } else {
                this.f2776w = (int) (((float) i2) * 0.7f);
            }
            mo3146c((((this.f2773t - getFocusedZoom()) * ((float) this.f2776w)) / 100.0f) + 1.0f);
        }
    }
}
