package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

public class NonOverlappingLinearLayout extends LinearLayout {

    /* renamed from: b */
    boolean f2630b;

    /* renamed from: c */
    boolean f2631c;

    /* renamed from: d */
    final ArrayList<ArrayList<View>> f2632d;

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NonOverlappingLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2630b = false;
        this.f2632d = new ArrayList<>();
    }

    public void focusableViewAvailable(View view) {
        int i;
        if (this.f2631c) {
            View view2 = view;
            while (true) {
                if (view2 == this || view2 == null) {
                    i = -1;
                } else if (view2.getParent() == this) {
                    i = indexOfChild(view2);
                    break;
                } else {
                    view2 = (View) view2.getParent();
                }
            }
            if (i != -1) {
                this.f2632d.get(i).add(view);
                return;
            }
            return;
        }
        super.focusableViewAvailable(view);
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    /*  JADX ERROR: StackOverflowError in pass: MarkFinallyVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.isSame(InsnNode.java:303)
        	at jadx.core.dex.instructions.IndexInsnNode.isSame(IndexInsnNode.java:36)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.sameInsns(MarkFinallyVisitor.java:451)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.compareBlocks(MarkFinallyVisitor.java:436)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:408)
        	at jadx.core.dex.visitors.MarkFinallyVisitor.checkBlocksTree(MarkFinallyVisitor.java:411)
        */
    protected void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.NonOverlappingLinearLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void setFocusableViewAvailableFixEnabled(boolean z) {
        this.f2630b = z;
    }
}
