package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0378a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import p006b.p007a.C0754a;
import p006b.p007a.C0759f;
import p006b.p041h.p042a.AbstractC1040c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.q0 */
class View$OnClickListenerC0272q0 extends AbstractC1040c implements View.OnClickListener {

    /* renamed from: m */
    private final SearchView f1158m;

    /* renamed from: n */
    private final SearchableInfo f1159n;

    /* renamed from: o */
    private final Context f1160o;

    /* renamed from: p */
    private final WeakHashMap<String, Drawable.ConstantState> f1161p;

    /* renamed from: q */
    private final int f1162q;

    /* renamed from: r */
    private boolean f1163r = false;

    /* renamed from: s */
    private int f1164s = 1;

    /* renamed from: t */
    private ColorStateList f1165t;

    /* renamed from: u */
    private int f1166u = -1;

    /* renamed from: v */
    private int f1167v = -1;

    /* renamed from: w */
    private int f1168w = -1;

    /* renamed from: x */
    private int f1169x = -1;

    /* renamed from: y */
    private int f1170y = -1;

    /* renamed from: z */
    private int f1171z = -1;

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.q0$a */
    public static final class C0273a {

        /* renamed from: a */
        public final TextView f1172a;

        /* renamed from: b */
        public final TextView f1173b;

        /* renamed from: c */
        public final ImageView f1174c;

        /* renamed from: d */
        public final ImageView f1175d;

        /* renamed from: e */
        public final ImageView f1176e;

        public C0273a(View view) {
            this.f1172a = (TextView) view.findViewById(16908308);
            this.f1173b = (TextView) view.findViewById(16908309);
            this.f1174c = (ImageView) view.findViewById(16908295);
            this.f1175d = (ImageView) view.findViewById(16908296);
            this.f1176e = (ImageView) view.findViewById(C0759f.edit_query);
        }
    }

    public View$OnClickListenerC0272q0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f1158m = searchView;
        this.f1159n = searchableInfo;
        this.f1162q = searchView.getSuggestionCommitIconResId();
        this.f1160o = context;
        this.f1161p = weakHashMap;
    }

    /* renamed from: A */
    private void m1346A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1161p.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    private void m1347B(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras == null || extras.getBoolean("in_progress")) {
        }
    }

    /* renamed from: k */
    private Drawable m1348k(String str) {
        Drawable.ConstantState constantState = this.f1161p.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    private CharSequence m1349l(CharSequence charSequence) {
        if (this.f1165t == null) {
            TypedValue typedValue = new TypedValue();
            this.f4790e.getTheme().resolveAttribute(C0754a.textColorSearchUrl, typedValue, true);
            this.f1165t = this.f4790e.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1165t, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    private Drawable m1350m(ComponentName componentName) {
        String nameNotFoundException;
        PackageManager packageManager = this.f4790e.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            nameNotFoundException = "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString();
            Log.w("SuggestionsAdapter", nameNotFoundException);
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            nameNotFoundException = e.toString();
        }
    }

    /* renamed from: n */
    private Drawable m1351n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1161p.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1161p.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1160o.getResources());
        }
        Drawable m = m1350m(componentName);
        if (m != null) {
            constantState = m.getConstantState();
        }
        this.f1161p.put(flattenToShortString, constantState);
        return m;
    }

    /* renamed from: o */
    public static String m1352o(Cursor cursor, String str) {
        return m1358w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: p */
    private Drawable m1353p() {
        Drawable n = m1351n(this.f1159n.getSearchActivity());
        return n != null ? n : this.f4790e.getPackageManager().getDefaultActivityIcon();
    }

    /* renamed from: q */
    private Drawable m1354q(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return mo1711r(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            } else {
                InputStream openInputStream = this.f1160o.getContentResolver().openInputStream(uri);
                if (openInputStream != null) {
                    try {
                        return Drawable.createFromStream(openInputStream, null);
                    } finally {
                        try {
                            openInputStream.close();
                        } catch (IOException e) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e);
                        }
                    }
                } else {
                    throw new FileNotFoundException("Failed to open " + uri);
                }
            }
        } catch (FileNotFoundException e2) {
            Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e2.getMessage());
            return null;
        }
    }

    /* renamed from: s */
    private Drawable m1355s(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1160o.getPackageName() + "/" + parseInt;
            Drawable k = m1348k(str2);
            if (k != null) {
                return k;
            }
            Drawable d = C0378a.m1874d(this.f1160o, parseInt);
            m1346A(str2, d);
            return d;
        } catch (NumberFormatException unused) {
            Drawable k2 = m1348k(str);
            if (k2 != null) {
                return k2;
            }
            Drawable q = m1354q(Uri.parse(str));
            m1346A(str, q);
            return q;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: t */
    private Drawable m1356t(Cursor cursor) {
        int i = this.f1169x;
        if (i == -1) {
            return null;
        }
        Drawable s = m1355s(cursor.getString(i));
        return s != null ? s : m1353p();
    }

    /* renamed from: u */
    private Drawable m1357u(Cursor cursor) {
        int i = this.f1170y;
        if (i == -1) {
            return null;
        }
        return m1355s(cursor.getString(i));
    }

    /* renamed from: w */
    private static String m1358w(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: y */
    private void m1359y(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    private void m1360z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    @Override // p006b.p041h.p042a.AbstractC1035a, p006b.p041h.p042a.C1038b.AbstractC1039a
    /* renamed from: a */
    public void mo1700a(Cursor cursor) {
        if (this.f1163r) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo1700a(cursor);
            if (cursor != null) {
                this.f1166u = cursor.getColumnIndex("suggest_text_1");
                this.f1167v = cursor.getColumnIndex("suggest_text_2");
                this.f1168w = cursor.getColumnIndex("suggest_text_2_url");
                this.f1169x = cursor.getColumnIndex("suggest_icon_1");
                this.f1170y = cursor.getColumnIndex("suggest_icon_2");
                this.f1171z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // p006b.p041h.p042a.AbstractC1035a, p006b.p041h.p042a.C1038b.AbstractC1039a
    /* renamed from: b */
    public CharSequence mo1701b(Cursor cursor) {
        String o;
        String o2;
        if (cursor == null) {
            return null;
        }
        String o3 = m1352o(cursor, "suggest_intent_query");
        if (o3 != null) {
            return o3;
        }
        if (this.f1159n.shouldRewriteQueryFromData() && (o2 = m1352o(cursor, "suggest_intent_data")) != null) {
            return o2;
        }
        if (!this.f1159n.shouldRewriteQueryFromText() || (o = m1352o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o;
    }

    @Override // p006b.p041h.p042a.C1038b.AbstractC1039a
    /* renamed from: d */
    public Cursor mo1702d(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1158m.getVisibility() == 0 && this.f1158m.getWindowVisibility() == 0) {
            try {
                Cursor v = mo1712v(this.f1159n, charSequence2, 50);
                if (v != null) {
                    v.getCount();
                    return v;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    @Override // p006b.p041h.p042a.AbstractC1035a
    /* renamed from: e */
    public void mo1703e(View view, Context context, Cursor cursor) {
        C0273a aVar = (C0273a) view.getTag();
        int i = this.f1171z;
        int i2 = i != -1 ? cursor.getInt(i) : 0;
        if (aVar.f1172a != null) {
            m1360z(aVar.f1172a, m1358w(cursor, this.f1166u));
        }
        if (aVar.f1173b != null) {
            String w = m1358w(cursor, this.f1168w);
            CharSequence l = w != null ? m1349l(w) : m1358w(cursor, this.f1167v);
            if (TextUtils.isEmpty(l)) {
                TextView textView = aVar.f1172a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1172a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1172a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1172a.setMaxLines(1);
                }
            }
            m1360z(aVar.f1173b, l);
        }
        ImageView imageView = aVar.f1174c;
        if (imageView != null) {
            m1359y(imageView, m1356t(cursor), 4);
        }
        ImageView imageView2 = aVar.f1175d;
        if (imageView2 != null) {
            m1359y(imageView2, m1357u(cursor), 8);
        }
        int i3 = this.f1164s;
        if (i3 == 2 || (i3 == 1 && (i2 & 1) != 0)) {
            aVar.f1176e.setVisibility(0);
            aVar.f1176e.setTag(aVar.f1172a.getText());
            aVar.f1176e.setOnClickListener(this);
            return;
        }
        aVar.f1176e.setVisibility(8);
    }

    @Override // p006b.p041h.p042a.AbstractC1035a
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View g = mo5594g(this.f4790e, this.f4789d, viewGroup);
            if (g != null) {
                ((C0273a) g.getTag()).f1172a.setText(e.toString());
            }
            return g;
        }
    }

    @Override // p006b.p041h.p042a.AbstractC1035a
    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View h = mo1706h(this.f4790e, this.f4789d, viewGroup);
            if (h != null) {
                ((C0273a) h.getTag()).f1172a.setText(e.toString());
            }
            return h;
        }
    }

    @Override // p006b.p041h.p042a.AbstractC1035a, p006b.p041h.p042a.AbstractC1040c
    /* renamed from: h */
    public View mo1706h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h = super.mo1706h(context, cursor, viewGroup);
        h.setTag(new C0273a(h));
        ((ImageView) h.findViewById(C0759f.edit_query)).setImageResource(this.f1162q);
        return h;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1347B(mo5592c());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1347B(mo5592c());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1158m.mo1050U((CharSequence) tag);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Drawable mo1711r(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f4790e.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public Cursor mo1712v(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f4790e.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    /* renamed from: x */
    public void mo1713x(int i) {
        this.f1164s = i;
    }
}
