package p006b.p030g.p038j;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* renamed from: b.g.j.b */
public class C0954b extends Writer {

    /* renamed from: b */
    private final String f4656b;

    /* renamed from: c */
    private StringBuilder f4657c = new StringBuilder(128);

    public C0954b(String str) {
        this.f4656b = str;
    }

    /* renamed from: a */
    private void m5481a() {
        if (this.f4657c.length() > 0) {
            Log.d(this.f4656b, this.f4657c.toString());
            StringBuilder sb = this.f4657c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
    public void close() {
        m5481a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        m5481a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m5481a();
            } else {
                this.f4657c.append(c);
            }
        }
    }
}
