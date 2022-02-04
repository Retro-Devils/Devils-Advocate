package p006b.p060q;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b.q.s */
public class C1159s {

    /* renamed from: a */
    public final Map<String, Object> f5192a = new HashMap();

    /* renamed from: b */
    public View f5193b;

    /* renamed from: c */
    final ArrayList<AbstractC1142m> f5194c = new ArrayList<>();

    @Deprecated
    public C1159s() {
    }

    public C1159s(View view) {
        this.f5193b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1159s)) {
            return false;
        }
        C1159s sVar = (C1159s) obj;
        return this.f5193b == sVar.f5193b && this.f5192a.equals(sVar.f5192a);
    }

    public int hashCode() {
        return (this.f5193b.hashCode() * 31) + this.f5192a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f5193b + "\n") + "    values:";
        for (String str2 : this.f5192a.keySet()) {
            str = str + "    " + str2 + ": " + this.f5192a.get(str2) + "\n";
        }
        return str;
    }
}
