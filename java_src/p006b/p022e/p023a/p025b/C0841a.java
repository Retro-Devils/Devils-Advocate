package p006b.p022e.p023a.p025b;

import android.view.View;

/* renamed from: b.e.a.b.a */
public class C0841a {
    /* renamed from: a */
    public static String m4921a(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
