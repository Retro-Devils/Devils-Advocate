package com.digdroid.alman.dig;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.FileObserver;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p069c.p118d.p119a.AbstractC1560a;
import p069c.p118d.p119a.AbstractC1563b;

/* renamed from: com.digdroid.alman.dig.y */
public class DialogFragmentC2864y extends DialogFragment {

    /* renamed from: b */
    private static final String f9660b = DialogFragmentC2864y.class.getSimpleName();

    /* renamed from: c */
    private String f9661c;

    /* renamed from: d */
    private String f9662d;

    /* renamed from: e */
    private boolean f9663e = false;

    /* renamed from: f */
    private AbstractC1560a<AbstractC2879m> f9664f = AbstractC1560a.m7603b();

    /* renamed from: g */
    private Button f9665g;

    /* renamed from: h */
    private Button f9666h;

    /* renamed from: i */
    private ImageButton f9667i;

    /* renamed from: j */
    private ImageButton f9668j;

    /* renamed from: k */
    private TextView f9669k;

    /* renamed from: l */
    private ListView f9670l;

    /* renamed from: m */
    private ArrayAdapter<String> f9671m;

    /* renamed from: n */
    private List<String> f9672n;

    /* renamed from: o */
    private File f9673o;

    /* renamed from: p */
    private File[] f9674p;

    /* renamed from: q */
    private FileObserver f9675q;

    /* renamed from: r */
    private boolean f9676r;

    /* renamed from: s */
    private boolean f9677s;

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.y$a */
    public class C2865a implements AbstractC1563b<AbstractC2879m> {
        C2865a() {
        }

        /* renamed from: b */
        public void mo6878a(AbstractC2879m mVar) {
            mVar.mo8587b(DialogFragmentC2864y.this.f9673o.getAbsolutePath());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.y$b */
    public class C2866b implements AbstractC1563b<AbstractC2879m> {
        C2866b() {
        }

        /* renamed from: b */
        public void mo6878a(AbstractC2879m mVar) {
            mVar.mo8586a();
        }
    }

    /* renamed from: com.digdroid.alman.dig.y$c */
    class View$OnClickListenerC2867c implements View.OnClickListener {
        View$OnClickListenerC2867c() {
        }

        public void onClick(View view) {
            DialogFragmentC2864y yVar = DialogFragmentC2864y.this;
            if (yVar.m11886D(yVar.f9673o)) {
                DialogFragmentC2864y.this.m11891I();
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.y$d */
    class View$OnClickListenerC2868d implements View.OnClickListener {

        /* renamed from: com.digdroid.alman.dig.y$d$a */
        class C2869a implements AbstractC1563b<AbstractC2879m> {
            C2869a() {
            }

            /* renamed from: b */
            public void mo6878a(AbstractC2879m mVar) {
                mVar.mo8586a();
            }
        }

        View$OnClickListenerC2868d() {
        }

        public void onClick(View view) {
            DialogFragmentC2864y.this.f9664f.mo6872a(new C2869a());
        }
    }

    /* renamed from: com.digdroid.alman.dig.y$e */
    class C2870e implements AdapterView.OnItemClickListener {
        C2870e() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            DialogFragmentC2864y.m11885C("Selected index: %d", new Object[]{Integer.valueOf(i)});
            if (DialogFragmentC2864y.this.f9674p != null && i >= 0 && i < DialogFragmentC2864y.this.f9674p.length) {
                DialogFragmentC2864y yVar = DialogFragmentC2864y.this;
                yVar.m11917z(yVar.f9674p[i]);
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.y$f */
    class View$OnClickListenerC2871f implements View.OnClickListener {
        View$OnClickListenerC2871f() {
        }

        public void onClick(View view) {
            File parentFile;
            if (DialogFragmentC2864y.this.f9673o != null && (parentFile = DialogFragmentC2864y.this.f9673o.getParentFile()) != null) {
                DialogFragmentC2864y.this.m11917z(parentFile);
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.y$g */
    class View$OnClickListenerC2872g implements View.OnClickListener {
        View$OnClickListenerC2872g() {
        }

        public void onClick(View view) {
            DialogFragmentC2864y.this.m11888F();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.y$h */
    public class DialogInterface$OnClickListenerC2873h implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ EditText f9686b;

        DialogInterface$OnClickListenerC2873h(EditText editText) {
            this.f9686b = editText;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            DialogFragmentC2864y.this.f9661c = this.f9686b.getText().toString();
            Toast.makeText(DialogFragmentC2864y.this.getActivity(), DialogFragmentC2864y.this.m11884B(), 0).show();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.y$i */
    public class DialogInterface$OnClickListenerC2874i implements DialogInterface.OnClickListener {
        DialogInterface$OnClickListenerC2874i() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.y$j */
    public class C2875j implements TextWatcher {

        /* renamed from: b */
        final /* synthetic */ AlertDialog f9689b;

        /* renamed from: c */
        final /* synthetic */ TextView f9690c;

        C2875j(AlertDialog alertDialog, TextView textView) {
            this.f9689b = alertDialog;
            this.f9690c = textView;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f9689b.getButton(-1).setEnabled(charSequence.length() != 0);
            this.f9690c.setText(DialogFragmentC2864y.this.getString(R.string.create_folder_msg, charSequence.toString()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.y$k */
    public class FileObserverC2876k extends FileObserver {

        /* renamed from: com.digdroid.alman.dig.y$k$a */
        class RunnableC2877a implements Runnable {
            RunnableC2877a() {
            }

            public void run() {
                DialogFragmentC2864y.this.m11890H();
            }
        }

        FileObserverC2876k(String str, int i) {
            super(str, i);
        }

        public void onEvent(int i, String str) {
            DialogFragmentC2864y.m11885C("FileObserver received event %d", new Object[]{Integer.valueOf(i)});
            Activity activity = DialogFragmentC2864y.this.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new RunnableC2877a());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.digdroid.alman.dig.y$l */
    public class AsyncTaskC2878l extends AsyncTask<File, Void, Boolean> {

        /* renamed from: a */
        File f9694a;

        /* renamed from: b */
        File[] f9695b;

        /* renamed from: c */
        ArrayList<String> f9696c;

        AsyncTaskC2878l() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Boolean doInBackground(File... fileArr) {
            File[] listFiles;
            int i = 0;
            File file = fileArr[0];
            this.f9694a = file;
            DialogFragmentC2864y.this.f9676r = file.isDirectory();
            DialogFragmentC2864y.this.f9677s = this.f9694a.canRead();
            this.f9695b = null;
            this.f9696c = new ArrayList<>();
            if (DialogFragmentC2864y.this.f9676r && (listFiles = this.f9694a.listFiles()) != null) {
                int i2 = 0;
                for (File file2 : listFiles) {
                    if (DialogFragmentC2864y.this.f9663e || file2.isDirectory()) {
                        i2++;
                    }
                }
                this.f9695b = new File[i2];
                int i3 = 0;
                int i4 = 0;
                while (i3 < i2) {
                    File file3 = listFiles[i4];
                    if (DialogFragmentC2864y.this.f9663e || file3.isDirectory()) {
                        this.f9695b[i3] = file3;
                        i3++;
                    }
                    i4++;
                }
                Arrays.sort(this.f9695b);
                while (true) {
                    File[] fileArr2 = this.f9695b;
                    if (i >= fileArr2.length) {
                        break;
                    }
                    File file4 = fileArr2[i];
                    String name = file4.getName();
                    if (DialogFragmentC2864y.this.f9663e && file4.isDirectory()) {
                        name = name + "/";
                    }
                    this.f9696c.add(name);
                    i++;
                }
            }
            DialogFragmentC2864y.this.f9673o = this.f9694a;
            return Boolean.TRUE;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            TextView textView;
            String str;
            if (bool.booleanValue()) {
                if (!DialogFragmentC2864y.this.f9676r) {
                    DialogFragmentC2864y.this.f9669k.setText(this.f9694a.getAbsolutePath());
                    DialogFragmentC2864y.this.f9674p = this.f9695b;
                } else {
                    if (DialogFragmentC2864y.this.f9663e) {
                        textView = DialogFragmentC2864y.this.f9669k;
                        str = "";
                    } else {
                        textView = DialogFragmentC2864y.this.f9669k;
                        str = this.f9694a.getAbsolutePath();
                    }
                    textView.setText(str);
                    DialogFragmentC2864y.this.f9674p = this.f9695b;
                }
                DialogFragmentC2864y.this.f9672n.clear();
                DialogFragmentC2864y.this.f9672n.addAll(this.f9696c);
                DialogFragmentC2864y.this.f9671m.notifyDataSetChanged();
                DialogFragmentC2864y yVar = DialogFragmentC2864y.this;
                yVar.f9675q = yVar.m11883A(this.f9694a.getAbsolutePath());
                DialogFragmentC2864y.this.f9675q.startWatching();
                DialogFragmentC2864y.this.m11889G();
            }
        }
    }

    /* renamed from: com.digdroid.alman.dig.y$m */
    public interface AbstractC2879m {
        /* renamed from: a */
        void mo8586a();

        /* renamed from: b */
        void mo8587b(String str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: A */
    private FileObserver m11883A(String str) {
        return new FileObserverC2876k(str, 960);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: B */
    private int m11884B() {
        File file;
        File file2 = this.f9673o;
        if (file2 != null && !file2.isDirectory()) {
            return R.string.create_folder_error;
        }
        if (this.f9661c == null || (file = this.f9673o) == null || !file.canWrite()) {
            File file3 = this.f9673o;
            return (file3 == null || file3.canWrite()) ? R.string.create_folder_error : R.string.create_folder_error_no_write_access;
        }
        File file4 = new File(this.f9673o, this.f9661c);
        return file4.exists() ? R.string.create_folder_error_already_exists : file4.mkdir() ? R.string.create_folder_success : R.string.create_folder_error;
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static void m11885C(String str, Object... objArr) {
        Log.d(f9660b, String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: D */
    private boolean m11886D(File file) {
        return file != null && (this.f9663e || this.f9676r);
    }

    /* renamed from: E */
    public static DialogFragmentC2864y m11887E() {
        return new DialogFragmentC2864y();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: F */
    private void m11888F() {
        View inflate = getActivity().getLayoutInflater().inflate(R.layout.dialog_new_folder, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.msgText);
        EditText editText = (EditText) inflate.findViewById(R.id.editText);
        editText.setText(this.f9661c);
        boolean z = true;
        textView.setText(getString(R.string.create_folder_msg, this.f9661c));
        AlertDialog show = new AlertDialog.Builder(getActivity(), C2553q3.m11117c()).setTitle(R.string.create_folder_label).setView(inflate).setNegativeButton(R.string.cancel_label, new DialogInterface$OnClickListenerC2874i()).setPositiveButton(R.string.confirm_label, new DialogInterface$OnClickListenerC2873h(editText)).show();
        Button button = show.getButton(-1);
        if (editText.getText().length() == 0) {
            z = false;
        }
        button.setEnabled(z);
        editText.addTextChangedListener(new C2875j(show, textView));
        editText.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: G */
    private void m11889G() {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing() && this.f9673o != null) {
            Button button = this.f9665g;
            boolean z = this.f9676r;
            button.setEnabled((z && !this.f9663e) || (!z && this.f9663e));
            getActivity().invalidateOptionsMenu();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: H */
    private void m11890H() {
        File file = this.f9673o;
        if (file != null) {
            m11917z(file);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: I */
    private void m11891I() {
        AbstractC1563b<AbstractC2879m> bVar;
        AbstractC1560a<AbstractC2879m> aVar;
        File file = this.f9673o;
        if (file != null) {
            m11885C("Returning %s as result", file.getAbsolutePath());
            aVar = this.f9664f;
            bVar = new C2865a();
        } else {
            aVar = this.f9664f;
            bVar = new C2866b();
        }
        aVar.mo6872a(bVar);
    }

    /* renamed from: y */
    private void m11916y() {
        int i;
        TypedArray obtainStyledAttributes;
        Resources.Theme theme = getActivity().getTheme();
        if (theme == null || (obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{16842801})) == null) {
            i = 16777215;
        } else {
            i = obtainStyledAttributes.getColor(0, 16777215);
            obtainStyledAttributes.recycle();
        }
        if (i != 16777215) {
            double red = (double) Color.red(i);
            Double.isNaN(red);
            double green = (double) Color.green(i);
            Double.isNaN(green);
            double d = (red * 0.21d) + (green * 0.72d);
            double blue = (double) Color.blue(i);
            Double.isNaN(blue);
            if (d + (blue * 0.07d) < 128.0d) {
                this.f9667i.setImageResource(R.drawable.APKTOOL_DUMMY_1b6);
                this.f9668j.setImageResource(R.drawable.APKTOOL_DUMMY_93);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: z */
    private void m11917z(File file) {
        if (file != null) {
            new AsyncTaskC2878l().execute(file);
        }
    }

    /* renamed from: J */
    public void mo9468J(AbstractC2879m mVar) {
        this.f9664f = AbstractC1560a.m7604c(mVar);
    }

    /* renamed from: K */
    public void mo9469K(String str) {
        this.f9662d = str;
    }

    /* renamed from: L */
    public void mo9470L(boolean z) {
        this.f9663e = z;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        boolean z = activity instanceof AbstractC2879m;
        AbstractC2879m mVar = activity;
        if (!z) {
            Fragment targetFragment = getTargetFragment();
            boolean z2 = targetFragment instanceof AbstractC2879m;
            mVar = targetFragment;
            if (!z2) {
                return;
            }
        }
        this.f9664f = AbstractC1560a.m7605d(mVar);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f9661c = "New folder";
        if (bundle != null) {
            this.f9662d = bundle.getString("CURRENT_DIRECTORY");
            this.f9663e = bundle.getBoolean("select_file");
        }
        if (getShowsDialog()) {
            setStyle(1, 0);
        } else {
            setHasOptionsMenu(true);
        }
        if (TextUtils.isEmpty(this.f9661c)) {
            throw new IllegalArgumentException("New directory name must have a strictly positive length (not zero) when user is not allowed to modify it.");
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.directory_chooser, menu);
        MenuItem findItem = menu.findItem(R.id.new_folder_item);
        if (findItem != null) {
            findItem.setVisible(m11886D(this.f9673o) && this.f9661c != null);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.directory_chooser, viewGroup, false);
        this.f9665g = (Button) inflate.findViewById(R.id.btnConfirm);
        this.f9666h = (Button) inflate.findViewById(R.id.btnCancel);
        this.f9667i = (ImageButton) inflate.findViewById(R.id.btnNavUp);
        this.f9668j = (ImageButton) inflate.findViewById(R.id.btnCreateFolder);
        this.f9669k = (TextView) inflate.findViewById(R.id.txtvSelectedFolder);
        this.f9670l = (ListView) inflate.findViewById(R.id.directoryList);
        ((TextView) inflate.findViewById(R.id.txtvSelectedFolderLabel)).setText(R.string.selected);
        this.f9665g.setOnClickListener(new View$OnClickListenerC2867c());
        this.f9666h.setOnClickListener(new View$OnClickListenerC2868d());
        this.f9670l.setOnItemClickListener(new C2870e());
        this.f9667i.setOnClickListener(new View$OnClickListenerC2871f());
        this.f9668j.setOnClickListener(new View$OnClickListenerC2872g());
        if (!getShowsDialog()) {
            this.f9668j.setVisibility(8);
        }
        m11916y();
        this.f9672n = new ArrayList();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), 17367043, this.f9672n);
        this.f9671m = arrayAdapter;
        this.f9670l.setAdapter((ListAdapter) arrayAdapter);
        m11917z(new File(this.f9662d));
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        this.f9664f = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.new_folder_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        m11888F();
        return true;
    }

    public void onPause() {
        super.onPause();
        FileObserver fileObserver = this.f9675q;
        if (fileObserver != null) {
            fileObserver.stopWatching();
        }
    }

    public void onResume() {
        super.onResume();
        FileObserver fileObserver = this.f9675q;
        if (fileObserver != null) {
            fileObserver.startWatching();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("CURRENT_DIRECTORY", this.f9662d);
        bundle.putBoolean("select_file", this.f9663e);
    }
}
