package com.digdroid.alman.dig;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.C0244k;

final class MyEditText extends C0244k {

    /* renamed from: e */
    static boolean f7668e = false;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.MyEditText$a */
    public class View$OnFocusChangeListenerC2118a implements View.OnFocusChangeListener {
        View$OnFocusChangeListenerC2118a() {
        }

        public void onFocusChange(View view, boolean z) {
            synchronized (MyEditText.class) {
                if (!MyEditText.this.isEnabled()) {
                    MyEditText.this.setBackgroundColor(0);
                } else if (!z) {
                    MyEditText.f7668e = false;
                    MyEditText.this.setBackgroundColor(C2553q3.m11127m());
                } else {
                    MyEditText.this.setBackgroundColor(-12303292);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.MyEditText$b */
    public class C2119b implements TextView.OnEditorActionListener {
        C2119b() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            return i == 6 || i == 5 || i == 2;
        }
    }

    public MyEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m9537a();
    }

    /* renamed from: a */
    private void m9537a() {
        setOnFocusChangeListener(new View$OnFocusChangeListenerC2118a());
        setOnEditorActionListener(new C2119b());
    }

    /* renamed from: b */
    public static boolean m9538b() {
        boolean z;
        synchronized (MyEditText.class) {
            z = f7668e;
        }
        return z;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        synchronized (MyEditText.class) {
            if (keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 4) {
                    if (keyCode == 96) {
                        f7668e = true;
                    } else if (keyCode != 97) {
                    }
                }
                f7668e = false;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }
}
