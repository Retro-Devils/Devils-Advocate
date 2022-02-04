package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p006b.p022e.p026b.p027k.C0864e;

/* renamed from: androidx.constraintlayout.widget.g */
public class C0331g extends View {

    /* renamed from: b */
    private int f1570b;

    /* renamed from: c */
    private View f1571c;

    /* renamed from: d */
    private int f1572d;

    /* renamed from: a */
    public void mo2021a(ConstraintLayout constraintLayout) {
        if (this.f1571c != null) {
            ConstraintLayout.C0312b bVar = (ConstraintLayout.C0312b) getLayoutParams();
            ConstraintLayout.C0312b bVar2 = (ConstraintLayout.C0312b) this.f1571c.getLayoutParams();
            bVar2.f1393n0.mo5151A0(0);
            C0864e.EnumC0866b w = bVar.f1393n0.mo5219w();
            C0864e.EnumC0866b bVar3 = C0864e.EnumC0866b.FIXED;
            if (w != bVar3) {
                bVar.f1393n0.mo5153B0(bVar2.f1393n0.mo5170N());
            }
            if (bVar.f1393n0.mo5167K() != bVar3) {
                bVar.f1393n0.mo5187e0(bVar2.f1393n0.mo5213t());
            }
            bVar2.f1393n0.mo5151A0(8);
        }
    }

    /* renamed from: b */
    public void mo2022b(ConstraintLayout constraintLayout) {
        if (this.f1570b == -1 && !isInEditMode()) {
            setVisibility(this.f1572d);
        }
        View findViewById = constraintLayout.findViewById(this.f1570b);
        this.f1571c = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C0312b) findViewById.getLayoutParams()).f1369b0 = true;
            this.f1571c.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1571c;
    }

    public int getEmptyVisibility() {
        return this.f1572d;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f1570b != i) {
            View view = this.f1571c;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.C0312b) this.f1571c.getLayoutParams()).f1369b0 = false;
                this.f1571c = null;
            }
            this.f1570b = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f1572d = i;
    }
}
