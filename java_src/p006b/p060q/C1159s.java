package p006b.p060q;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b.q.s */
public class C1159s {

    /* renamed from: a */
    public final Map<String, Object> f5185a = new HashMap();

    /* renamed from: b */
    public View f5186b;

    /* renamed from: c */
    final ArrayList<AbstractC1142m> f5187c = new ArrayList<>();

    @Deprecated
    public C1159s() {
    }

    public C1159s(View view) {
        this.f5186b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1159s)) {
            return false;
        }
        C1159s sVar = (C1159s) obj;
        return this.f5186b == sVar.f5186b && this.f5185a.equals(sVar.f5185a);
    }

    public int hashCode() {
        return (this.f5186b.hashCode() * 31) + this.f5185a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f5186b + "\n") + "    values:";
        for (String str2 : this.f5185a.keySet()) {
            str = str + "    " + str2 + ": " + this.f5185a.get(str2) + "\n";
        }
        return str;
    }
}
