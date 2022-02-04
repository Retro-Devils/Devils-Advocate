package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: a */
    static final PorterDuff.Mode f2085a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public int f2086b = -1;

    /* renamed from: c */
    Object f2087c;

    /* renamed from: d */
    public byte[] f2088d = null;

    /* renamed from: e */
    public Parcelable f2089e = null;

    /* renamed from: f */
    public int f2090f = 0;

    /* renamed from: g */
    public int f2091g = 0;

    /* renamed from: h */
    public ColorStateList f2092h = null;

    /* renamed from: i */
    PorterDuff.Mode f2093i = f2085a;

    /* renamed from: j */
    public String f2094j = null;

    public IconCompat() {
    }

    private IconCompat(int i) {
        this.f2086b = i;
    }

    /* renamed from: a */
    static Bitmap m1948a(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: b */
    public static IconCompat m1949b(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f2090f = i;
            if (resources != null) {
                try {
                    iconCompat.f2087c = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f2087c = str;
            }
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    /* renamed from: d */
    private static int m1950d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    /* renamed from: f */
    private static String m1951f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    /* renamed from: h */
    private static int m1952h(Icon icon) {
        StringBuilder sb;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            e = e;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (InvocationTargetException e2) {
            e = e2;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e3) {
            e = e3;
            sb = new StringBuilder();
            sb.append("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        }
    }

    /* renamed from: j */
    private static Uri m1953j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (InvocationTargetException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    /* renamed from: k */
    private InputStream m1954k(Context context) {
        Throwable e;
        String str;
        StringBuilder sb;
        Uri i = mo2246i();
        String scheme = i.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(i);
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
                sb.append(str);
                sb.append(i);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f2087c));
            } catch (FileNotFoundException e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
                sb.append(str);
                sb.append(i);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        }
    }

    /* renamed from: p */
    private static String m1955p(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* renamed from: c */
    public int mo2243c() {
        int i = this.f2086b;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1950d((Icon) this.f2087c);
        }
        if (i == 2) {
            return this.f2090f;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: e */
    public String mo2244e() {
        int i = this.f2086b;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1951f((Icon) this.f2087c);
        }
        if (i == 2) {
            return ((String) this.f2087c).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: g */
    public int mo2245g() {
        int i = this.f2086b;
        return (i != -1 || Build.VERSION.SDK_INT < 23) ? i : m1952h((Icon) this.f2087c);
    }

    /* renamed from: i */
    public Uri mo2246i() {
        int i = this.f2086b;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return m1953j((Icon) this.f2087c);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f2087c);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: l */
    public void mo2247l() {
        Parcelable parcelable;
        this.f2093i = PorterDuff.Mode.valueOf(this.f2094j);
        switch (this.f2086b) {
            case -1:
                parcelable = this.f2089e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f2089e;
                if (parcelable == null) {
                    byte[] bArr = this.f2088d;
                    this.f2087c = bArr;
                    this.f2086b = 3;
                    this.f2090f = 0;
                    this.f2091g = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                this.f2087c = new String(this.f2088d, Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2087c = this.f2088d;
                return;
        }
        this.f2087c = parcelable;
    }

    /* renamed from: m */
    public void mo2248m(boolean z) {
        this.f2094j = this.f2093i.name();
        switch (this.f2086b) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f2087c).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2088d = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f2088d = ((String) this.f2087c).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2088d = (byte[]) this.f2087c;
                return;
            case 4:
            case 6:
                this.f2088d = this.f2087c.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f2089e = (Parcelable) this.f2087c;
    }

    @Deprecated
    /* renamed from: n */
    public Icon mo2249n() {
        return mo2250o(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 >= 26) goto L_0x005f;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Icon mo2250o(android.content.Context r4) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.mo2250o(android.content.Context):android.graphics.drawable.Icon");
    }

    public String toString() {
        int i;
        if (this.f2086b == -1) {
            return String.valueOf(this.f2087c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m1955p(this.f2086b));
        switch (this.f2086b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2087c).getWidth());
                sb.append("x");
                i = ((Bitmap) this.f2087c).getHeight();
                sb.append(i);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(mo2244e());
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(mo2243c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2090f);
                if (this.f2091g != 0) {
                    sb.append(" off=");
                    i = this.f2091g;
                    sb.append(i);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2087c);
                break;
        }
        if (this.f2092h != null) {
            sb.append(" tint=");
            sb.append(this.f2092h);
        }
        if (this.f2093i != f2085a) {
            sb.append(" mode=");
            sb.append(this.f2093i);
        }
        sb.append(")");
        return sb.toString();
    }
}
