package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
class C0200b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f934a;

    public C0200b(ActionBarContainer actionBarContainer) {
        this.f934a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f934a;
        if (actionBarContainer.f658i) {
            Drawable drawable = actionBarContainer.f657h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f655f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f934a;
        Drawable drawable3 = actionBarContainer2.f656g;
        if (drawable3 != null && actionBarContainer2.f659j) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f934a;
        if (actionBarContainer.f658i) {
            drawable = actionBarContainer.f657h;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f655f;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
