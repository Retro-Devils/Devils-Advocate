package com.digdroid.alman.dig;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.digdroid.alman.dig.TextureVideoView;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

/* renamed from: com.digdroid.alman.dig.r3 */
public abstract class AbstractActivityC2664r3 extends AbstractActivityC2852x2 implements TextureVideoView.AbstractC2157f {

    /* renamed from: T0 */
    C2774t3 f9121T0;

    /* renamed from: U0 */
    private ArrayList<String> f9122U0;

    /* renamed from: V0 */
    private ArrayList<Integer> f9123V0;

    /* renamed from: W0 */
    private int f9124W0;

    /* renamed from: X0 */
    private String f9125X0;

    /* renamed from: Y0 */
    private int f9126Y0;

    /* renamed from: Z0 */
    private String f9127Z0;

    /* renamed from: a1 */
    private String f9128a1;

    /* renamed from: b1 */
    private int f9129b1;

    /* renamed from: c1 */
    private String f9130c1;

    /* renamed from: d1 */
    private String f9131d1;

    /* renamed from: e1 */
    private String f9132e1;

    /* renamed from: f1 */
    private String f9133f1;

    /* renamed from: g1 */
    private String f9134g1;

    /* renamed from: h1 */
    private MediaPlayer f9135h1;

    /* renamed from: i1 */
    private String f9136i1;

    /* renamed from: j1 */
    private int f9137j1;

    /* renamed from: k1 */
    private boolean f9138k1;

    /* renamed from: l1 */
    private C2677m f9139l1 = null;

    /* renamed from: m1 */
    private C2688v f9140m1 = null;

    /* renamed from: n1 */
    private ArrayList<String> f9141n1;

    /* renamed from: o1 */
    private ArrayList<String> f9142o1;

    /* renamed from: p1 */
    private C2682p f9143p1;

    /* renamed from: q1 */
    private Handler f9144q1 = new Handler();

    /* renamed from: r1 */
    private Runnable f9145r1 = new RunnableC2670f();

    /* renamed from: s1 */
    private Runnable f9146s1 = new RunnableC2671g();

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r3$a */
    public class C2665a implements MediaPlayer.OnSeekCompleteListener {
        C2665a() {
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            if (!AbstractActivityC2664r3.this.f9138k1) {
                AbstractActivityC2664r3.this.f9135h1.start();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r3$b */
    public class C2666b implements AbstractC2686t {

        /* renamed from: a */
        final /* synthetic */ String f9148a;

        C2666b(String str) {
            this.f9148a = str;
        }

        @Override // com.digdroid.alman.dig.AbstractActivityC2664r3.AbstractC2686t
        /* renamed from: a */
        public void mo9133a() {
            AbstractActivityC2664r3.this.f9128a1 = this.f9148a;
        }

        @Override // com.digdroid.alman.dig.AbstractActivityC2664r3.AbstractC2686t
        /* renamed from: b */
        public void mo9134b() {
        }
    }

    /* renamed from: com.digdroid.alman.dig.r3$c */
    class C2667c implements AbstractC2683q {

        /* renamed from: a */
        final /* synthetic */ String f9150a;

        /* renamed from: b */
        final /* synthetic */ String f9151b;

        /* renamed from: c */
        final /* synthetic */ String f9152c;

        C2667c(String str, String str2, String str3) {
            this.f9150a = str;
            this.f9151b = str2;
            this.f9152c = str3;
        }

        @Override // com.digdroid.alman.dig.AbstractActivityC2664r3.AbstractC2683q
        /* renamed from: a */
        public void mo9135a() {
            AbstractActivityC2664r3.this.mo9131U2(this.f9150a, this.f9151b, this.f9152c);
        }

        @Override // com.digdroid.alman.dig.AbstractActivityC2664r3.AbstractC2683q
        /* renamed from: b */
        public void mo9136b(String str, int i) {
            if (!str.equals(AbstractActivityC2664r3.this.f9125X0)) {
                AbstractActivityC2664r3.this.f9144q1.removeCallbacksAndMessages(null);
                AbstractActivityC2664r3.this.m11392Y2();
                AbstractActivityC2664r3.this.m11390W2(str, i + 5000);
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.r3$d */
    class C2668d implements AbstractC2687u {

        /* renamed from: a */
        final /* synthetic */ String f9154a;

        /* renamed from: b */
        final /* synthetic */ String f9155b;

        C2668d(String str, String str2) {
            this.f9154a = str;
            this.f9155b = str2;
        }

        @Override // com.digdroid.alman.dig.AbstractActivityC2664r3.AbstractC2687u
        /* renamed from: a */
        public void mo9137a() {
            AbstractActivityC2664r3.this.f9130c1 = "";
            AbstractActivityC2664r3.this.f9131d1 = "";
        }

        @Override // com.digdroid.alman.dig.AbstractActivityC2664r3.AbstractC2687u
        /* renamed from: b */
        public void mo9138b() {
            AbstractActivityC2664r3.this.f9130c1 = this.f9154a;
            AbstractActivityC2664r3.this.f9131d1 = this.f9155b;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r3$e */
    public class C2669e implements AbstractC2686t {

        /* renamed from: a */
        final /* synthetic */ String f9157a;

        /* renamed from: b */
        final /* synthetic */ AbstractC2687u f9158b;

        /* renamed from: c */
        final /* synthetic */ String f9159c;

        /* renamed from: d */
        final /* synthetic */ String f9160d;

        C2669e(String str, AbstractC2687u uVar, String str2, String str3) {
            this.f9157a = str;
            this.f9158b = uVar;
            this.f9159c = str2;
            this.f9160d = str3;
        }

        @Override // com.digdroid.alman.dig.AbstractActivityC2664r3.AbstractC2686t
        /* renamed from: a */
        public void mo9133a() {
            AbstractActivityC2664r3.this.f9144q1.removeCallbacksAndMessages(null);
            AbstractActivityC2664r3.this.f9127Z0 = this.f9157a;
            this.f9158b.mo9138b();
        }

        @Override // com.digdroid.alman.dig.AbstractActivityC2664r3.AbstractC2686t
        /* renamed from: b */
        public void mo9134b() {
            if (AbstractActivityC2664r3.this.f9127Z0 != null) {
                this.f9158b.mo9137a();
            }
            AbstractActivityC2664r3.this.f9127Z0 = null;
            AbstractActivityC2664r3.this.mo9131U2(this.f9159c, this.f9160d, null);
            this.f9158b.mo9138b();
        }
    }

    /* renamed from: com.digdroid.alman.dig.r3$f */
    class RunnableC2670f implements Runnable {
        RunnableC2670f() {
        }

        public void run() {
            AbstractActivityC2664r3.this.m11388S2();
            AbstractActivityC2664r3.this.f9144q1.postDelayed(this, (long) AbstractActivityC2664r3.this.f9121T0.f9428x);
        }
    }

    /* renamed from: com.digdroid.alman.dig.r3$g */
    class RunnableC2671g implements Runnable {
        RunnableC2671g() {
        }

        public void run() {
            new AsyncTaskC2679n(AbstractActivityC2664r3.this, null).execute(new Void[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r3$h */
    public class C2672h implements AbstractC2683q {

        /* renamed from: a */
        final /* synthetic */ String f9164a;

        /* renamed from: b */
        final /* synthetic */ String f9165b;

        C2672h(String str, String str2) {
            this.f9164a = str;
            this.f9165b = str2;
        }

        @Override // com.digdroid.alman.dig.AbstractActivityC2664r3.AbstractC2683q
        /* renamed from: a */
        public void mo9135a() {
            String str = this.f9165b;
            String str2 = this.f9164a;
            str2.hashCode();
            char c = 65535;
            switch (str2.hashCode()) {
                case -1268966290:
                    if (str2.equals("folder")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3143036:
                    if (str2.equals("file")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3387192:
                    if (str2.equals("none")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (!AbstractActivityC2664r3.this.f9132e1.equals("folder") || !str.equals(AbstractActivityC2664r3.this.f9133f1)) {
                        AbstractActivityC2664r3.this.m11391X2();
                        new AsyncTaskC2681o(AbstractActivityC2664r3.this, null).execute(new Void[0]);
                        break;
                    }
                case 1:
                    if (!str.equals(AbstractActivityC2664r3.this.f9136i1) && AbstractActivityC2664r3.this.m11384O2(str).equals("audio") && new File(str).exists()) {
                        AbstractActivityC2664r3.this.m11391X2();
                        AbstractActivityC2664r3.this.m11386Q2(str, 0);
                        break;
                    }
                case 2:
                    AbstractActivityC2664r3.this.m11391X2();
                    break;
            }
            AbstractActivityC2664r3.this.f9132e1 = this.f9164a;
            AbstractActivityC2664r3.this.f9133f1 = this.f9165b;
        }

        @Override // com.digdroid.alman.dig.AbstractActivityC2664r3.AbstractC2683q
        /* renamed from: b */
        public void mo9136b(String str, int i) {
            if (!str.equals(AbstractActivityC2664r3.this.f9136i1)) {
                AbstractActivityC2664r3.this.m11391X2();
                AbstractActivityC2664r3.this.m11386Q2(str, i);
                AbstractActivityC2664r3.this.f9132e1 = this.f9164a;
                AbstractActivityC2664r3.this.f9133f1 = this.f9165b;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r3$i */
    public class C2673i implements MediaPlayer.OnPreparedListener {
        C2673i() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            AbstractActivityC2664r3.this.f9135h1.seekTo(AbstractActivityC2664r3.this.f9137j1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r3$j */
    public class C2674j implements MediaPlayer.OnCompletionListener {
        C2674j() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            if (AbstractActivityC2664r3.this.f9132e1.equals("file")) {
                AbstractActivityC2664r3.this.f9135h1.seekTo(0);
            } else {
                new AsyncTaskC2681o(AbstractActivityC2664r3.this, null).execute(new Void[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r3$k */
    public class C2675k {

        /* renamed from: a */
        String f9169a;

        /* renamed from: b */
        ArrayList<Integer> f9170b = new ArrayList<>();

        /* renamed from: c */
        FilenameFilter f9171c;

        /* renamed from: d */
        ArrayList<String> f9172d;

        public C2675k(String str, FilenameFilter filenameFilter, ArrayList<String> arrayList) {
            this.f9169a = str;
            this.f9171c = filenameFilter;
            this.f9172d = arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public File mo9143a() {
            File[] listFiles;
            int nextInt;
            File file;
            if (this.f9169a == null) {
                return null;
            }
            File file2 = new File(this.f9169a);
            if (!file2.exists() || !file2.isDirectory() || (listFiles = file2.listFiles(this.f9171c)) == null || listFiles.length == 0) {
                return null;
            }
            if (listFiles.length == 1) {
                return listFiles[0];
            }
            int length = listFiles.length;
            if (this.f9170b.size() == 0) {
                for (int i = 0; i < length; i++) {
                    this.f9170b.add(Integer.valueOf(i));
                }
            }
            Random random = new Random();
            do {
                nextInt = random.nextInt(this.f9170b.size());
                int intValue = this.f9170b.get(nextInt).intValue();
                if (intValue >= length) {
                    return null;
                }
                file = listFiles[intValue];
            } while (this.f9172d.contains(file.getAbsolutePath()));
            this.f9170b.remove(nextInt);
            this.f9172d.add(file.getAbsolutePath());
            while (true) {
                if (this.f9172d.size() <= 10 && this.f9172d.size() <= length / 2) {
                    return file;
                }
                this.f9172d.remove(0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.digdroid.alman.dig.r3$l */
    public class AsyncTaskC2676l extends AsyncTask<Void, Void, Void> {
        private AsyncTaskC2676l() {
        }

        /* synthetic */ AsyncTaskC2676l(AbstractActivityC2664r3 r3Var, C2666b bVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            File[] listFiles;
            File[] listFiles2;
            synchronized (AbstractActivityC2664r3.class) {
                AbstractActivityC2664r3.this.f9123V0 = new ArrayList();
                AbstractActivityC2664r3.this.f9122U0 = new ArrayList();
                AbstractActivityC2664r3.this.f9124W0 = 0;
                File file = new File(C2185a4.m9678h(AbstractActivityC2664r3.this) + "/Covers");
                if (file.exists() && (listFiles = file.listFiles()) != null) {
                    for (File file2 : listFiles) {
                        if (file2.exists() && file2.isDirectory() && (listFiles2 = file2.listFiles()) != null && listFiles2.length > 0) {
                            AbstractActivityC2664r3.this.f9122U0.add(file2.getName());
                            AbstractActivityC2664r3.this.f9123V0.add(Integer.valueOf(listFiles2.length));
                            AbstractActivityC2664r3.m11402j2(AbstractActivityC2664r3.this, listFiles2.length);
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void r4) {
            AbstractActivityC2664r3.this.f9144q1.postDelayed(AbstractActivityC2664r3.this.f9145r1, 0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r3$m */
    public class C2677m extends C2675k {

        /* renamed from: com.digdroid.alman.dig.r3$m$a */
        class C2678a implements FilenameFilter {

            /* renamed from: a */
            final /* synthetic */ AbstractActivityC2664r3 f9176a;

            C2678a(AbstractActivityC2664r3 r3Var) {
                this.f9176a = r3Var;
            }

            public boolean accept(File file, String str) {
                String O2 = this.f9176a.m11384O2(str);
                return O2.equals("image") || O2.equals("video");
            }
        }

        public C2677m(String str, ArrayList<String> arrayList) {
            super(str, new C2678a(AbstractActivityC2664r3.this), arrayList);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.digdroid.alman.dig.r3$n */
    public class AsyncTaskC2679n extends AsyncTask<Void, Void, File> {

        /* access modifiers changed from: package-private */
        /* renamed from: com.digdroid.alman.dig.r3$n$a */
        public class C2680a implements AbstractC2686t {
            C2680a() {
            }

            @Override // com.digdroid.alman.dig.AbstractActivityC2664r3.AbstractC2686t
            /* renamed from: a */
            public void mo9133a() {
                AbstractActivityC2664r3.this.f9144q1.postDelayed(AbstractActivityC2664r3.this.f9146s1, (long) AbstractActivityC2664r3.this.f9121T0.f9428x);
            }

            @Override // com.digdroid.alman.dig.AbstractActivityC2664r3.AbstractC2686t
            /* renamed from: b */
            public void mo9134b() {
            }
        }

        private AsyncTaskC2679n() {
        }

        /* synthetic */ AsyncTaskC2679n(AbstractActivityC2664r3 r3Var, C2666b bVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public File doInBackground(Void... voidArr) {
            if (AbstractActivityC2664r3.this.f9139l1 == null) {
                AbstractActivityC2664r3 r3Var = AbstractActivityC2664r3.this;
                r3Var.f9139l1 = new C2677m(r3Var.f9121T0.f9417m, r3Var.f9141n1);
            }
            return AbstractActivityC2664r3.this.f9139l1.mo9143a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(File file) {
            if (AbstractActivityC2664r3.this.f9127Z0 == null && file != null) {
                String O2 = AbstractActivityC2664r3.this.m11384O2(file.getAbsolutePath());
                if (O2.equals("image")) {
                    C2680a aVar = new C2680a();
                    AbstractActivityC2664r3 r3Var = AbstractActivityC2664r3.this;
                    new AsyncTaskC2685s(C2553q3.m11125k(r3Var.f9121T0), aVar).execute(file);
                    AbstractActivityC2664r3.this.f9125X0 = "";
                    AbstractActivityC2664r3.this.mo9233V0();
                } else if (O2.equals("video")) {
                    if (AbstractActivityC2664r3.this.m11389V2()) {
                        AbstractActivityC2664r3 r3Var2 = AbstractActivityC2664r3.this;
                        r3Var2.f9137j1 = r3Var2.f9135h1.getCurrentPosition();
                    }
                    AbstractActivityC2664r3.this.m11390W2(file.getAbsolutePath(), 0);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.digdroid.alman.dig.r3$o */
    public class AsyncTaskC2681o extends AsyncTask<Void, Void, File> {
        private AsyncTaskC2681o() {
        }

        /* synthetic */ AsyncTaskC2681o(AbstractActivityC2664r3 r3Var, C2666b bVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public File doInBackground(Void... voidArr) {
            if (AbstractActivityC2664r3.this.f9140m1 == null) {
                AbstractActivityC2664r3 r3Var = AbstractActivityC2664r3.this;
                r3Var.f9140m1 = new C2688v(r3Var.f9121T0.f9419o, r3Var.f9142o1);
            }
            return AbstractActivityC2664r3.this.f9140m1.mo9143a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(File file) {
            if (file != null) {
                AbstractActivityC2664r3.this.m11386Q2(file.getAbsolutePath(), 0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r3$p */
    public class C2682p {

        /* renamed from: a */
        private HashMap<String, String> f9180a = new HashMap<>();

        /* renamed from: b */
        private HashMap<String, Integer> f9181b = new HashMap<>();

        C2682p() {
        }

        /* renamed from: a */
        public void mo9157a(String str, String str2, AbstractC2683q qVar) {
            HashMap hashMap;
            if (str.equals("file")) {
                if (this.f9181b.containsKey(str2)) {
                    qVar.mo9136b(str2, this.f9181b.get(str2).intValue());
                    hashMap = this.f9181b;
                }
                qVar.mo9135a();
                return;
            }
            if (str.equals("folder") && this.f9180a.containsKey(str2)) {
                String str3 = this.f9180a.get(str2);
                if (this.f9181b.containsKey(str3)) {
                    qVar.mo9136b(str3, this.f9181b.get(str3).intValue());
                    this.f9181b.remove(str3);
                } else {
                    qVar.mo9135a();
                }
                hashMap = this.f9180a;
            }
            qVar.mo9135a();
            return;
            hashMap.remove(str2);
        }

        /* renamed from: b */
        public void mo9158b(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("resumeable_positions");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("resumeable_files");
            for (int i = 0; i < stringArrayList.size(); i++) {
                this.f9181b.put(stringArrayList.get(i), integerArrayList.get(i));
            }
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("resumeable_folders");
            ArrayList<String> stringArrayList3 = bundle.getStringArrayList("resumeable_folder_files");
            for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                this.f9180a.put(stringArrayList2.get(i2), stringArrayList3.get(i2));
            }
        }

        /* renamed from: c */
        public void mo9159c(String str, String str2, String str3, int i) {
            this.f9181b.put(str3, Integer.valueOf(i));
            if (str.equals("folder")) {
                this.f9180a.put(str2, str3);
            }
        }

        /* renamed from: d */
        public void mo9160d(Bundle bundle) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : this.f9181b.entrySet()) {
                arrayList2.add(entry.getKey());
                arrayList.add(entry.getValue());
            }
            bundle.putStringArrayList("resumeable_files", arrayList2);
            bundle.putIntegerArrayList("resumeable_positions", arrayList);
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList<String> arrayList4 = new ArrayList<>();
            for (Map.Entry<String, String> entry2 : this.f9180a.entrySet()) {
                arrayList3.add(entry2.getKey());
                arrayList4.add(entry2.getValue());
            }
            bundle.putStringArrayList("resumeable_folders", arrayList3);
            bundle.putStringArrayList("resumeable_folder_files", arrayList4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r3$q */
    public interface AbstractC2683q {
        /* renamed from: a */
        void mo9135a();

        /* renamed from: b */
        void mo9136b(String str, int i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r3$r */
    public class AsyncTaskC2684r extends AsyncTask<Void, Void, File> {
        AsyncTaskC2684r() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public File doInBackground(Void... voidArr) {
            File[] listFiles;
            synchronized (AbstractActivityC2664r3.class) {
                if (!(AbstractActivityC2664r3.this.f9124W0 <= 0 || AbstractActivityC2664r3.this.f9122U0 == null || AbstractActivityC2664r3.this.f9123V0 == null)) {
                    Random random = new Random();
                    int nextInt = random.nextInt(AbstractActivityC2664r3.this.f9124W0);
                    int i = 0;
                    while (true) {
                        if (i >= AbstractActivityC2664r3.this.f9122U0.size()) {
                            break;
                        } else if (nextInt < ((Integer) AbstractActivityC2664r3.this.f9123V0.get(i)).intValue()) {
                            break;
                        } else {
                            nextInt -= ((Integer) AbstractActivityC2664r3.this.f9123V0.get(i)).intValue();
                            i++;
                        }
                    }
                    if (i < AbstractActivityC2664r3.this.f9122U0.size()) {
                        File file = new File(C2185a4.m9678h(AbstractActivityC2664r3.this) + "/Covers/" + ((String) AbstractActivityC2664r3.this.f9122U0.get(i)));
                        if (file.exists() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
                            return listFiles[random.nextInt(listFiles.length)];
                        }
                    }
                }
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(File file) {
            if (AbstractActivityC2664r3.this.f9127Z0 == null && file != null) {
                AbstractActivityC2664r3 r3Var = AbstractActivityC2664r3.this;
                new AsyncTaskC2685s(C2553q3.m11125k(r3Var.f9121T0), null).execute(file);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.digdroid.alman.dig.r3$s */
    public class AsyncTaskC2685s extends AsyncTask<File, Void, Bitmap> {

        /* renamed from: a */
        AbstractC2686t f9184a;

        /* renamed from: b */
        float f9185b;

        /* renamed from: c */
        ImageView f9186c;

        public AsyncTaskC2685s(float f, AbstractC2686t tVar) {
            this.f9185b = f;
            this.f9184a = tVar;
            this.f9186c = null;
        }

        public AsyncTaskC2685s(ImageView imageView, float f, AbstractC2686t tVar) {
            this.f9185b = f;
            this.f9184a = tVar;
            this.f9186c = imageView;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Bitmap doInBackground(File... fileArr) {
            if (!fileArr[0].exists()) {
                return null;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(fileArr[0].getAbsolutePath(), options);
                while (Math.max(options.outHeight, options.outWidth) / i > 1600) {
                    i *= 2;
                }
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = i;
                return BitmapFactory.decodeFile(fileArr[0].getAbsolutePath(), options2);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            AbstractC2686t tVar;
            if (bitmap != null) {
                try {
                    if (this.f9186c == null) {
                        ((TextureVideoView) AbstractActivityC2664r3.this.findViewById(R.id.videowall)).setVisibility(AbstractActivityC2664r3.this.f9127Z0 != null ? 4 : 8);
                        this.f9186c = (ImageView) AbstractActivityC2664r3.this.findViewById(R.id.wallpaper);
                    }
                    this.f9186c.setScaleType(AbstractActivityC2664r3.this.f9121T0.f9420p.equals("fillscreen") ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
                    Drawable drawable = this.f9186c.getDrawable();
                    if (drawable instanceof BitmapDrawable) {
                        Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                        this.f9186c.setImageBitmap(bitmap);
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                    } else {
                        this.f9186c.setImageBitmap(bitmap);
                    }
                    this.f9186c.setAlpha(this.f9185b);
                    this.f9186c.setVisibility(0);
                    AbstractC2686t tVar2 = this.f9184a;
                    if (tVar2 != null) {
                        tVar2.mo9133a();
                    }
                } catch (Exception unused) {
                    tVar = this.f9184a;
                    if (tVar == null) {
                    }
                }
            } else {
                tVar = this.f9184a;
                if (tVar == null) {
                    return;
                }
                tVar.mo9134b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r3$t */
    public interface AbstractC2686t {
        /* renamed from: a */
        void mo9133a();

        /* renamed from: b */
        void mo9134b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r3$u */
    public interface AbstractC2687u {
        /* renamed from: a */
        void mo9137a();

        /* renamed from: b */
        void mo9138b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.r3$v */
    public class C2688v extends C2675k {

        /* renamed from: com.digdroid.alman.dig.r3$v$a */
        class C2689a implements FilenameFilter {

            /* renamed from: a */
            final /* synthetic */ AbstractActivityC2664r3 f9189a;

            C2689a(AbstractActivityC2664r3 r3Var) {
                this.f9189a = r3Var;
            }

            public boolean accept(File file, String str) {
                return this.f9189a.m11384O2(str).equals("audio");
            }
        }

        public C2688v(String str, ArrayList<String> arrayList) {
            super(str, new C2689a(AbstractActivityC2664r3.this), arrayList);
        }
    }

    /* renamed from: N2 */
    private void m11383N2() {
        ImageView imageView = (ImageView) findViewById(R.id.wallpaper);
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            imageView.setImageBitmap(null);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: O2 */
    private String m11384O2(String str) {
        String mimeTypeFromExtension;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(lastIndexOf + 1))) == null) {
            return "none";
        }
        int lastIndexOf2 = mimeTypeFromExtension.lastIndexOf(47);
        return lastIndexOf2 > 0 ? mimeTypeFromExtension.substring(0, lastIndexOf2) : mimeTypeFromExtension;
    }

    /* renamed from: P2 */
    private void m11385P2() {
        this.f9144q1.removeCallbacks(this.f9145r1);
        this.f9144q1.removeCallbacks(this.f9146s1);
        m11392Y2();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: Q2 */
    private void m11386Q2(String str, int i) {
        this.f9136i1 = str;
        this.f9137j1 = i;
        MediaPlayer mediaPlayer = this.f9135h1;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f9135h1.stop();
            }
            this.f9135h1.release();
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.f9135h1 = mediaPlayer2;
        mediaPlayer2.setOnPreparedListener(new C2673i());
        this.f9135h1.setOnCompletionListener(new C2674j());
        this.f9135h1.setOnSeekCompleteListener(new C2665a());
        try {
            this.f9135h1.setDataSource(str);
            this.f9135h1.prepareAsync();
        } catch (Exception unused) {
        }
        mo9370K1();
    }

    /* renamed from: R2 */
    private void m11387R2(String str) {
        String str2;
        this.f9134g1 = str;
        if (str == null) {
            C2774t3 t3Var = this.f9121T0;
            str2 = t3Var.f9418n;
            str = t3Var.f9419o;
        } else {
            str2 = "file";
        }
        this.f9143p1.mo9157a(str2, str, new C2672h(str2, str));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: S2 */
    private void m11388S2() {
        new AsyncTaskC2684r().execute(new Void[0]);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: V2 */
    private boolean m11389V2() {
        MediaPlayer mediaPlayer = this.f9135h1;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: W2 */
    private void m11390W2(String str, int i) {
        TextureVideoView textureVideoView = (TextureVideoView) findViewById(R.id.videowall);
        this.f9125X0 = str;
        this.f9126Y0 = i;
        ((ImageView) findViewById(R.id.wallpaper)).setVisibility(8);
        textureVideoView.setVisibility(0);
        textureVideoView.setAlpha(C2553q3.m11125k(this.f9121T0));
        textureVideoView.setListener(this);
        textureVideoView.setScaleType(this.f9121T0.f9420p.equals("fillscreen") ? TextureVideoView.EnumC2158g.CENTER_CROP : TextureVideoView.EnumC2158g.FIT_CENTER);
        textureVideoView.setDataSource(str);
        textureVideoView.mo8002q(this.f9126Y0);
        if (!this.f9138k1) {
            textureVideoView.mo7997o();
        }
        mo9370K1();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: X2 */
    private void m11391X2() {
        MediaPlayer mediaPlayer = this.f9135h1;
        if (mediaPlayer != null) {
            try {
                this.f9137j1 = mediaPlayer.getCurrentPosition();
                if (!this.f9136i1.equals("")) {
                    this.f9143p1.mo9159c(this.f9132e1, this.f9133f1, this.f9136i1, this.f9137j1);
                }
                this.f9136i1 = "";
                if (this.f9135h1.isPlaying()) {
                    this.f9135h1.stop();
                }
                this.f9135h1.release();
                this.f9135h1 = null;
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: Y2 */
    private void m11392Y2() {
        if (!this.f9125X0.equals("")) {
            TextureVideoView textureVideoView = (TextureVideoView) findViewById(R.id.videowall);
            try {
                this.f9143p1.mo9159c(this.f9130c1, this.f9131d1, this.f9125X0, textureVideoView.getPosition());
                textureVideoView.mo8003r();
            } catch (Exception unused) {
            }
            this.f9125X0 = "";
        }
    }

    /* renamed from: j2 */
    static /* synthetic */ int m11402j2(AbstractActivityC2664r3 r3Var, int i) {
        int i2 = r3Var.f9124W0 + i;
        r3Var.f9124W0 = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractActivityC2802v3
    /* renamed from: B1 */
    public boolean mo9127B1() {
        return (this.f9121T0.f9416l.equals("folder") && !this.f9125X0.equals("")) || (this.f9121T0.f9418n.equals("folder") && !this.f9136i1.equals(""));
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractActivityC2802v3
    /* renamed from: C1 */
    public boolean mo9128C1() {
        return this.f9138k1;
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractActivityC2802v3
    /* renamed from: D1 */
    public boolean mo9129D1() {
        return !this.f9125X0.equals("") || !this.f9136i1.equals("");
    }

    @Override // com.digdroid.alman.dig.AbstractC2531p1.AbstractC2532a
    /* renamed from: G */
    public void mo8903G(C2774t3 t3Var, String str, String str2) {
        String str3;
        this.f9121T0 = t3Var;
        String str4 = this.f9275w.mo8180c("show_foreground", true) ? t3Var.f9427w : "";
        if (!str4.equals(this.f9128a1)) {
            ImageView imageView = (ImageView) findViewById(R.id.foreground);
            if (str4.equals("")) {
                imageView.setVisibility(8);
                this.f9128a1 = str4;
            } else {
                new AsyncTaskC2685s(imageView, 1.0f, new C2666b(str4)).execute(new File(str4));
            }
        }
        String str5 = null;
        if (!str4.equals("") && this.f9275w.mo8180c("show_foreground", true)) {
            new AsyncTaskC2685s((ImageView) findViewById(R.id.foreground), 1.0f, null).execute(new File(str4));
        }
        int i = t3Var.f9407c | -16777216;
        ((FrameLayout) findViewById(R.id.mainscreen)).setBackgroundColor(i);
        if (str == null || m11384O2(str).equals("image")) {
            str3 = t3Var.f9416l;
            str5 = str;
            str = t3Var.f9417m;
        } else {
            str3 = "file";
        }
        this.f9143p1.mo9157a(str3, str, new C2667c(str3, str, str5));
        mo9130T2(str3, str, str5, new C2668d(str3, str));
        if (i != this.f9129b1) {
            ((ImageView) findViewById(R.id.wallpaper)).setAlpha(C2553q3.m11125k(t3Var));
            ((TextureVideoView) findViewById(R.id.videowall)).setAlpha(C2553q3.m11125k(t3Var));
            this.f9129b1 = i;
        }
        m11387R2(str2);
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractActivityC2533p2
    /* renamed from: R1 */
    public void mo8920R1() {
        String str = this.f9121T0.f9418n;
        if (str == null || !str.equals("folder")) {
            String str2 = this.f9121T0.f9416l;
            if (str2 != null && str2.equals("folder")) {
                new AsyncTaskC2679n(this, null).execute(new Void[0]);
                return;
            }
            return;
        }
        new AsyncTaskC2681o(this, null).execute(new Void[0]);
    }

    /* renamed from: T2 */
    public void mo9130T2(String str, String str2, String str3, AbstractC2687u uVar) {
        if (str3 == null) {
            if (this.f9127Z0 != null) {
                this.f9127Z0 = null;
                if (!this.f9125X0.equals("")) {
                    ((ImageView) findViewById(R.id.wallpaper)).setVisibility(8);
                    ((TextureVideoView) findViewById(R.id.videowall)).setVisibility(0);
                } else {
                    uVar.mo9137a();
                    mo9131U2(str, str2, null);
                }
            }
            uVar.mo9138b();
            return;
        }
        new AsyncTaskC2685s(1.0f, new C2669e(str3, uVar, str, str2)).execute(new File(str3));
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractActivityC2533p2
    /* renamed from: U1 */
    public void mo8923U1() {
        TextureVideoView textureVideoView;
        MediaPlayer mediaPlayer;
        String str = this.f9136i1;
        if (!(str == null || str.equals("") || (mediaPlayer = this.f9135h1) == null || mediaPlayer == null)) {
            mediaPlayer.pause();
            this.f9138k1 = true;
        }
        String str2 = this.f9125X0;
        if (str2 != null && !str2.equals("") && (textureVideoView = (TextureVideoView) findViewById(R.id.videowall)) != null) {
            textureVideoView.mo7996n();
            this.f9138k1 = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U2 */
    public void mo9131U2(String str, String str2, String str3) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1354554468:
                if (str.equals("covers")) {
                    c = 0;
                    break;
                }
                break;
            case -1268966290:
                if (str.equals("folder")) {
                    c = 1;
                    break;
                }
                break;
            case 3143036:
                if (str.equals("file")) {
                    c = 2;
                    break;
                }
                break;
            case 3387192:
                if (str.equals("none")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (str3 == null && !this.f9130c1.equals("covers")) {
                    this.f9144q1.removeCallbacksAndMessages(null);
                    m11392Y2();
                    if (this.f9124W0 == 0) {
                        new AsyncTaskC2676l(this, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                        return;
                    } else {
                        this.f9144q1.postDelayed(this.f9145r1, 0);
                        return;
                    }
                } else {
                    return;
                }
            case 1:
                if (str3 != null) {
                    return;
                }
                if (!this.f9130c1.equals("folder") || !this.f9131d1.equals(str2)) {
                    this.f9144q1.removeCallbacksAndMessages(null);
                    m11392Y2();
                    new AsyncTaskC2679n(this, null).execute(new Void[0]);
                    return;
                }
                return;
            case 2:
                this.f9144q1.removeCallbacksAndMessages(null);
                String O2 = m11384O2(str2);
                if (O2.equals("image")) {
                    m11392Y2();
                    if (str3 != null) {
                        return;
                    }
                    if (!this.f9130c1.equals("file") || !str2.equals(this.f9131d1)) {
                        new AsyncTaskC2685s(C2553q3.m11125k(this.f9121T0), null).execute(new File(str2));
                        return;
                    }
                    return;
                } else if (O2.equals("video") && !str2.equals(this.f9125X0)) {
                    m11392Y2();
                    m11390W2(str2, 0);
                    return;
                } else {
                    return;
                }
            case 3:
                this.f9144q1.removeCallbacksAndMessages(null);
                m11392Y2();
                if (str3 == null) {
                    ((ImageView) findViewById(R.id.wallpaper)).setVisibility(8);
                }
                ((TextureVideoView) findViewById(R.id.videowall)).setVisibility(8);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.digdroid.alman.dig.AbstractActivityC2533p2
    /* renamed from: V1 */
    public void mo8924V1() {
        TextureVideoView textureVideoView;
        MediaPlayer mediaPlayer;
        String str = this.f9136i1;
        if (!(str == null || str.equals("") || (mediaPlayer = this.f9135h1) == null)) {
            mediaPlayer.start();
            this.f9138k1 = false;
        }
        String str2 = this.f9125X0;
        if (str2 != null && !str2.equals("") && (textureVideoView = (TextureVideoView) findViewById(R.id.videowall)) != null) {
            textureVideoView.mo7997o();
            this.f9138k1 = false;
        }
    }

    @Override // com.digdroid.alman.dig.TextureVideoView.AbstractC2157f
    /* renamed from: c */
    public void mo8014c() {
        TextureVideoView textureVideoView = (TextureVideoView) findViewById(R.id.videowall);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, com.digdroid.alman.dig.AbstractActivityC2533p2, androidx.core.app.ActivityC0361e, com.digdroid.alman.dig.ActivityC2725t, com.digdroid.alman.dig.ActivityC2220c4, com.digdroid.alman.dig.ActivityC2800v1, com.digdroid.alman.dig.AbstractActivityC2802v3, com.digdroid.alman.dig.ActivityC2888z3, androidx.appcompat.app.ActivityC0070c, com.digdroid.alman.dig.AbstractActivityC2260e0
    public void onCreate(Bundle bundle) {
        boolean z;
        C2553q3.m11120f((MainActivity) this);
        setTheme(C2553q3.m11136v());
        this.f9121T0 = C2553q3.f8899a;
        C2219c3 k = C2219c3.m9805k(getApplicationContext());
        this.f9275w = k;
        String q = k.mo8193q("language", "device");
        if (Build.VERSION.SDK_INT >= 17) {
            Resources resources = getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            Configuration configuration = resources.getConfiguration();
            if (q.equals("device")) {
                configuration.setLocale(Locale.getDefault());
            } else {
                configuration.setLocale(new Locale(q));
            }
            resources.updateConfiguration(configuration, displayMetrics);
        }
        super.onCreate(bundle);
        ((FrameLayout) findViewById(R.id.mainscreen)).setBackgroundColor(this.f9121T0.f9407c | -16777216);
        this.f9143p1 = new C2682p();
        this.f9125X0 = "";
        this.f9136i1 = "";
        this.f9130c1 = "";
        this.f9131d1 = "";
        this.f9132e1 = "";
        this.f9133f1 = "";
        this.f9127Z0 = null;
        this.f9134g1 = null;
        this.f9128a1 = "";
        this.f9129b1 = this.f9121T0.f9407c | -16777216;
        synchronized (AbstractActivityC2664r3.class) {
            if (bundle == null) {
                this.f9122U0 = new ArrayList<>();
                this.f9123V0 = new ArrayList<>();
                z = false;
                this.f9124W0 = 0;
                this.f9141n1 = new ArrayList<>();
                this.f9142o1 = new ArrayList<>();
            } else {
                this.f9122U0 = bundle.getStringArrayList("cover_systems");
                this.f9123V0 = bundle.getIntegerArrayList("cover_counts");
                this.f9124W0 = bundle.getInt("cover_total");
                this.f9143p1.mo9158b(bundle);
                this.f9141n1 = bundle.getStringArrayList("last_videos");
                this.f9142o1 = bundle.getStringArrayList("last_sounds");
                z = bundle.getBoolean("media_paused");
            }
        }
        this.f9138k1 = z;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, com.digdroid.alman.dig.AbstractActivityC2533p2, androidx.appcompat.app.ActivityC0070c
    public void onDestroy() {
        C2724s3 s3Var;
        super.onDestroy();
        C2774t3 t3Var = C2553q3.f8899a;
        if (t3Var != null && (s3Var = t3Var.f9405a) != null) {
            s3Var.mo9215R();
        }
    }

    @Override // androidx.fragment.app.ActivityC0447d, com.digdroid.alman.dig.AbstractActivityC2533p2, com.digdroid.alman.dig.AbstractActivityC2802v3, com.digdroid.alman.dig.AbstractActivityC2260e0
    public void onPause() {
        super.onPause();
        m11383N2();
        m11385P2();
        m11391X2();
    }

    @Override // androidx.fragment.app.ActivityC0447d, com.digdroid.alman.dig.AbstractActivityC2533p2, com.digdroid.alman.dig.AbstractActivityC2852x2, com.digdroid.alman.dig.AbstractActivityC2802v3
    public void onResume() {
        super.onResume();
        this.f9125X0 = "";
        this.f9136i1 = "";
        this.f9130c1 = "";
        this.f9131d1 = "";
        this.f9132e1 = "";
        this.f9133f1 = "";
        this.f9127Z0 = null;
        this.f9134g1 = null;
        this.f9128a1 = "";
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC0447d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0361e, com.digdroid.alman.dig.ActivityC2725t, com.digdroid.alman.dig.ActivityC2888z3, androidx.appcompat.app.ActivityC0070c, com.digdroid.alman.dig.AbstractActivityC2260e0
    public void onSaveInstanceState(Bundle bundle) {
        m11391X2();
        m11392Y2();
        synchronized (AbstractActivityC2664r3.class) {
            bundle.putStringArrayList("cover_systems", this.f9122U0);
            bundle.putIntegerArrayList("cover_counts", this.f9123V0);
            bundle.putInt("cover_total", this.f9124W0);
        }
        bundle.putStringArrayList("last_videos", this.f9141n1);
        bundle.putStringArrayList("last_sounds", this.f9142o1);
        this.f9143p1.mo9160d(bundle);
        bundle.putBoolean("media_paused", this.f9138k1);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.digdroid.alman.dig.TextureVideoView.AbstractC2157f
    /* renamed from: r0 */
    public void mo8015r0() {
        TextureVideoView textureVideoView = (TextureVideoView) findViewById(R.id.videowall);
        if (this.f9130c1.equals("file")) {
            m11390W2(this.f9131d1, 0);
        } else if (this.f9130c1.equals("folder")) {
            textureVideoView.mo8003r();
            new AsyncTaskC2679n(this, null).execute(new Void[0]);
        }
    }
}
