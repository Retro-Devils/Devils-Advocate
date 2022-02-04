package com.digdroid.alman.dig;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

final class MyListView extends ListView {
    public MyListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Exception unused) {
        }
    }
}
