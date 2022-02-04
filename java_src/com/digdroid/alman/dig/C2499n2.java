package com.digdroid.alman.dig;

import java.util.Iterator;

/* renamed from: com.digdroid.alman.dig.n2 */
public /* synthetic */ class C2499n2 {
    /* renamed from: a */
    public static /* synthetic */ String m10796a(CharSequence charSequence, Iterable iterable) {
        if (charSequence != null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(charSequence);
                }
            }
            return sb.toString();
        }
        throw new NullPointerException("delimiter");
    }
}
