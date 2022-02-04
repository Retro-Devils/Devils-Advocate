package p006b.p057o.p058a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* renamed from: b.o.a.a */
public final class C1088a {

    /* renamed from: a */
    private static final Object f4994a = new Object();

    /* renamed from: b */
    private static C1088a f4995b;

    /* renamed from: c */
    private final Context f4996c;

    /* renamed from: d */
    private final HashMap<BroadcastReceiver, ArrayList<C1091c>> f4997d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, ArrayList<C1091c>> f4998e = new HashMap<>();

    /* renamed from: f */
    private final ArrayList<C1090b> f4999f = new ArrayList<>();

    /* renamed from: g */
    private final Handler f5000g;

    /* renamed from: b.o.a.a$a */
    class HandlerC1089a extends Handler {
        HandlerC1089a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                C1088a.this.mo5721a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.o.a.a$b */
    public static final class C1090b {

        /* renamed from: a */
        final Intent f5002a;

        /* renamed from: b */
        final ArrayList<C1091c> f5003b;

        C1090b(Intent intent, ArrayList<C1091c> arrayList) {
            this.f5002a = intent;
            this.f5003b = arrayList;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.o.a.a$c */
    public static final class C1091c {

        /* renamed from: a */
        final IntentFilter f5004a;

        /* renamed from: b */
        final BroadcastReceiver f5005b;

        /* renamed from: c */
        boolean f5006c;

        /* renamed from: d */
        boolean f5007d;

        C1091c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f5004a = intentFilter;
            this.f5005b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f5005b);
            sb.append(" filter=");
            sb.append(this.f5004a);
            if (this.f5007d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private C1088a(Context context) {
        this.f4996c = context;
        this.f5000g = new HandlerC1089a(context.getMainLooper());
    }

    /* renamed from: b */
    public static C1088a m6129b(Context context) {
        C1088a aVar;
        synchronized (f4994a) {
            if (f4995b == null) {
                f4995b = new C1088a(context.getApplicationContext());
            }
            aVar = f4995b;
        }
        return aVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r3 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r4 = r2[r3];
        r5 = r4.f5003b.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r6 >= r5) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r7 = r4.f5003b.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r7.f5007d != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r7.f5005b.onReceive(r10.f4996c, r4.f5002a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r3 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5721a() {
        /*
            r10 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<b.o.a.a$c>> r0 = r10.f4997d
            monitor-enter(r0)
            java.util.ArrayList<b.o.a.a$b> r1 = r10.f4999f     // Catch:{ all -> 0x0044 }
            int r1 = r1.size()     // Catch:{ all -> 0x0044 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return
        L_0x000d:
            b.o.a.a$b[] r2 = new p006b.p057o.p058a.C1088a.C1090b[r1]     // Catch:{ all -> 0x0044 }
            java.util.ArrayList<b.o.a.a$b> r3 = r10.f4999f     // Catch:{ all -> 0x0044 }
            r3.toArray(r2)     // Catch:{ all -> 0x0044 }
            java.util.ArrayList<b.o.a.a$b> r3 = r10.f4999f     // Catch:{ all -> 0x0044 }
            r3.clear()     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            r0 = 0
            r3 = 0
        L_0x001c:
            if (r3 >= r1) goto L_0x0000
            r4 = r2[r3]
            java.util.ArrayList<b.o.a.a$c> r5 = r4.f5003b
            int r5 = r5.size()
            r6 = 0
        L_0x0027:
            if (r6 >= r5) goto L_0x0041
            java.util.ArrayList<b.o.a.a$c> r7 = r4.f5003b
            java.lang.Object r7 = r7.get(r6)
            b.o.a.a$c r7 = (p006b.p057o.p058a.C1088a.C1091c) r7
            boolean r8 = r7.f5007d
            if (r8 != 0) goto L_0x003e
            android.content.BroadcastReceiver r7 = r7.f5005b
            android.content.Context r8 = r10.f4996c
            android.content.Intent r9 = r4.f5002a
            r7.onReceive(r8, r9)
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0027
        L_0x0041:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0044:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0048
        L_0x0047:
            throw r1
        L_0x0048:
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p057o.p058a.C1088a.mo5721a():void");
    }

    /* renamed from: c */
    public void mo5722c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f4997d) {
            C1091c cVar = new C1091c(intentFilter, broadcastReceiver);
            ArrayList<C1091c> arrayList = this.f4997d.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f4997d.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList<C1091c> arrayList2 = this.f4998e.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f4998e.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* renamed from: d */
    public boolean mo5723d(Intent intent) {
        String str;
        ArrayList<C1091c> arrayList;
        String str2;
        int i;
        ArrayList arrayList2;
        synchronized (this.f4997d) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f4996c.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<C1091c> arrayList3 = this.f4998e.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i2 = 0;
                while (i2 < arrayList3.size()) {
                    C1091c cVar = arrayList3.get(i2);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f5004a);
                    }
                    if (cVar.f5006c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i = i2;
                        arrayList = arrayList3;
                        str2 = action;
                        str = resolveTypeIfNeeded;
                        arrayList2 = arrayList4;
                    } else {
                        i = i2;
                        str2 = action;
                        arrayList2 = arrayList4;
                        arrayList = arrayList3;
                        str = resolveTypeIfNeeded;
                        int match = cVar.f5004a.match(action, resolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (match >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(match));
                            }
                            arrayList4 = arrayList2 == null ? new ArrayList() : arrayList2;
                            arrayList4.add(cVar);
                            cVar.f5006c = true;
                            i2 = i + 1;
                            action = str2;
                            arrayList3 = arrayList;
                            resolveTypeIfNeeded = str;
                        } else if (z) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (match != -4 ? match != -3 ? match != -2 ? match != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList2;
                    i2 = i + 1;
                    action = str2;
                    arrayList3 = arrayList;
                    resolveTypeIfNeeded = str;
                }
                if (arrayList4 != null) {
                    for (int i3 = 0; i3 < arrayList4.size(); i3++) {
                        ((C1091c) arrayList4.get(i3)).f5006c = false;
                    }
                    this.f4999f.add(new C1090b(intent, arrayList4));
                    if (!this.f5000g.hasMessages(1)) {
                        this.f5000g.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public void mo5724e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f4997d) {
            ArrayList<C1091c> remove = this.f4997d.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    C1091c cVar = remove.get(size);
                    cVar.f5007d = true;
                    for (int i = 0; i < cVar.f5004a.countActions(); i++) {
                        String action = cVar.f5004a.getAction(i);
                        ArrayList<C1091c> arrayList = this.f4998e.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C1091c cVar2 = arrayList.get(size2);
                                if (cVar2.f5005b == broadcastReceiver) {
                                    cVar2.f5007d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f4998e.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }
}
