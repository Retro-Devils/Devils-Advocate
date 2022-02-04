package androidx.leanback.widget;

import android.util.Property;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.leanback.widget.p */
public abstract class AbstractC0583p<PropertyT extends Property> {

    /* renamed from: a */
    final List<PropertyT> f2914a;

    /* renamed from: b */
    final List<PropertyT> f2915b;

    /* renamed from: c */
    private int[] f2916c = new int[4];

    /* renamed from: d */
    private float[] f2917d = new float[4];

    /* renamed from: e */
    private final List<AbstractC0593q> f2918e = new ArrayList(4);

    public AbstractC0583p() {
        ArrayList arrayList = new ArrayList();
        this.f2914a = arrayList;
        this.f2915b = Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final float mo3540a(int i) {
        return this.f2917d[i];
    }

    /* renamed from: b */
    public void mo3541b() {
        for (int i = 0; i < this.f2918e.size(); i++) {
            this.f2918e.get(i).mo3600c(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo3542c() {
        if (this.f2914a.size() >= 2) {
            float a = mo3540a(0);
            int i = 1;
            while (i < this.f2914a.size()) {
                float a2 = mo3540a(i);
                if (a2 < a) {
                    int i2 = i - 1;
                    throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is smaller than Property[%d]\"%s\"", Integer.valueOf(i), this.f2914a.get(i).getName(), Integer.valueOf(i2), this.f2914a.get(i2).getName()));
                } else if (a == -3.4028235E38f && a2 == Float.MAX_VALUE) {
                    int i3 = i - 1;
                    throw new IllegalStateException(String.format("Parallax Property[%d]\"%s\" is UNKNOWN_BEFORE and Property[%d]\"%s\" is UNKNOWN_AFTER", Integer.valueOf(i3), this.f2914a.get(i3).getName(), Integer.valueOf(i), this.f2914a.get(i).getName()));
                } else {
                    i++;
                    a = a2;
                }
            }
        }
    }
}
