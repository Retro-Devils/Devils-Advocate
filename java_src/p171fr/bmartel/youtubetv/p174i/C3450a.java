package p171fr.bmartel.youtubetv.p174i;

import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.util.Log;
import android.webkit.WebView;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p171fr.bmartel.youtubetv.C3439f;
import p171fr.bmartel.youtubetv.p173h.EnumC3448f;

/* renamed from: fr.bmartel.youtubetv.i.a */
public class C3450a {

    /* renamed from: a */
    private static final String f11717a = "a";

    /* access modifiers changed from: package-private */
    /* renamed from: fr.bmartel.youtubetv.i.a$a */
    public static class RunnableC3451a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ WebView f11718b;

        /* renamed from: c */
        final /* synthetic */ String f11719c;

        /* renamed from: d */
        final /* synthetic */ Object[] f11720d;

        RunnableC3451a(WebView webView, String str, Object[] objArr) {
            this.f11718b = webView;
            this.f11719c = str;
            this.f11720d = objArr;
        }

        public void run() {
            C3450a.m14194a(this.f11718b, this.f11719c, this.f11720d);
        }
    }

    /* renamed from: a */
    public static void m14194a(WebView webView, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:try{");
        sb.append(str);
        sb.append("(");
        int length = objArr.length;
        String str2 = "";
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            sb.append(str2);
            boolean z = obj instanceof String;
            if (z) {
                sb.append("'");
            }
            sb.append(obj);
            if (z) {
                sb.append("'");
            }
            i++;
            str2 = ",";
        }
        sb.append(")}catch(error){console.error(error.message);}");
        webView.loadUrl(sb.toString());
    }

    /* renamed from: b */
    public static void m14195b(WebView webView, String str, Object... objArr) {
        webView.post(new RunnableC3451a(webView, str, objArr));
    }

    /* renamed from: c */
    public static String m14196c(String str, String str2) {
        int i = 0;
        boolean z = false;
        while (true) {
            List<String> list = C3439f.f11665f;
            if (i >= list.size()) {
                return "";
            }
            if (str2.equals(list.get(i))) {
                z = true;
            }
            if (z && m14198e(m14197d(str, list.get(i)))) {
                return m14197d(str, list.get(i));
            }
            i++;
        }
    }

    /* renamed from: d */
    public static String m14197d(String str, String str2) {
        return "http://img.youtube.com/vi/" + str + "/" + str2 + ".jpg";
    }

    /* renamed from: e */
    public static boolean m14198e(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        httpURLConnection.disconnect();
        return responseCode != 404;
    }

    /* renamed from: f */
    public static List<Integer> m14199f(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
                }
            } catch (JSONException e) {
                Log.e(f11717a, "parse playback rates", e);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static List<String> m14200g(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty() && !str.equals("null")) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
            } catch (JSONException e) {
                Log.e(f11717a, "parse playlist", e);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static List<EnumC3448f> m14201h(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(EnumC3448f.m14189d(jSONArray.getString(i)));
                }
            } catch (JSONException e) {
                Log.e(f11717a, "parse quality levels", e);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public static void m14202i(boolean z, MediaMetadata.Builder builder, MediaSession mediaSession, int i, long j, float f) {
        if (mediaSession.isActive()) {
            if (z) {
                mediaSession.setMetadata(builder.build());
            }
            PlaybackState.Builder builder2 = new PlaybackState.Builder();
            builder2.setState(i, j, f);
            mediaSession.setPlaybackState(builder2.build());
        }
    }
}
