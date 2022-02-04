package p006b.p030g.p039k.p040b0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: b.g.k.b0.a */
public final class C0977a extends ClickableSpan {

    /* renamed from: b */
    private final int f4683b;

    /* renamed from: c */
    private final C0979c f4684c;

    /* renamed from: d */
    private final int f4685d;

    public C0977a(int i, C0979c cVar, int i2) {
        this.f4683b = i;
        this.f4684c = cVar;
        this.f4685d = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f4683b);
        this.f4684c.mo5461Q(this.f4685d, bundle);
    }
}
