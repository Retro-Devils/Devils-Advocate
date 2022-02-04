package p006b.p064s.p065a.p066a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p005c.C0381b;
import androidx.core.content.p005c.C0397g;
import androidx.core.graphics.drawable.C0398a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p006b.p021d.C0823a;
import p006b.p030g.p031d.C0903c;

/* renamed from: b.s.a.a.i */
public class C1194i extends AbstractC1193h {

    /* renamed from: c */
    static final PorterDuff.Mode f5255c = PorterDuff.Mode.SRC_IN;

    /* renamed from: d */
    private C1202h f5256d;

    /* renamed from: e */
    private PorterDuffColorFilter f5257e;

    /* renamed from: f */
    private ColorFilter f5258f;

    /* renamed from: g */
    private boolean f5259g;

    /* renamed from: h */
    private boolean f5260h;

    /* renamed from: i */
    private Drawable.ConstantState f5261i;

    /* renamed from: j */
    private final float[] f5262j;

    /* renamed from: k */
    private final Matrix f5263k;

    /* renamed from: l */
    private final Rect f5264l;

    /* access modifiers changed from: private */
    /* renamed from: b.s.a.a.i$b */
    public static class C1196b extends AbstractC1200f {
        C1196b() {
        }

        C1196b(C1196b bVar) {
            super(bVar);
        }

        /* renamed from: f */
        private void m6470f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5291b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f5290a = C0903c.m5307d(string2);
            }
            this.f5292c = C0397g.m1942g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // p006b.p064s.p065a.p066a.C1194i.AbstractC1200f
        /* renamed from: c */
        public boolean mo5989c() {
            return true;
        }

        /* renamed from: e */
        public void mo5990e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0397g.m1945j(xmlPullParser, "pathData")) {
                TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C1182a.f5228d);
                m6470f(k, xmlPullParser);
                k.recycle();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.s.a.a.i$c */
    public static class C1197c extends AbstractC1200f {

        /* renamed from: e */
        private int[] f5265e;

        /* renamed from: f */
        C0381b f5266f;

        /* renamed from: g */
        float f5267g = 0.0f;

        /* renamed from: h */
        C0381b f5268h;

        /* renamed from: i */
        float f5269i = 1.0f;

        /* renamed from: j */
        float f5270j = 1.0f;

        /* renamed from: k */
        float f5271k = 0.0f;

        /* renamed from: l */
        float f5272l = 1.0f;

        /* renamed from: m */
        float f5273m = 0.0f;

        /* renamed from: n */
        Paint.Cap f5274n = Paint.Cap.BUTT;

        /* renamed from: o */
        Paint.Join f5275o = Paint.Join.MITER;

        /* renamed from: p */
        float f5276p = 4.0f;

        C1197c() {
        }

        C1197c(C1197c cVar) {
            super(cVar);
            this.f5265e = cVar.f5265e;
            this.f5266f = cVar.f5266f;
            this.f5267g = cVar.f5267g;
            this.f5269i = cVar.f5269i;
            this.f5268h = cVar.f5268h;
            this.f5292c = cVar.f5292c;
            this.f5270j = cVar.f5270j;
            this.f5271k = cVar.f5271k;
            this.f5272l = cVar.f5272l;
            this.f5273m = cVar.f5273m;
            this.f5274n = cVar.f5274n;
            this.f5275o = cVar.f5275o;
            this.f5276p = cVar.f5276p;
        }

        /* renamed from: e */
        private Paint.Cap m6473e(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: f */
        private Paint.Join m6474f(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: h */
        private void m6475h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f5265e = null;
            if (C0397g.m1945j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f5291b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f5290a = C0903c.m5307d(string2);
                }
                this.f5268h = C0397g.m1940e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f5270j = C0397g.m1941f(typedArray, xmlPullParser, "fillAlpha", 12, this.f5270j);
                this.f5274n = m6473e(C0397g.m1942g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f5274n);
                this.f5275o = m6474f(C0397g.m1942g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f5275o);
                this.f5276p = C0397g.m1941f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f5276p);
                this.f5266f = C0397g.m1940e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f5269i = C0397g.m1941f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f5269i);
                this.f5267g = C0397g.m1941f(typedArray, xmlPullParser, "strokeWidth", 4, this.f5267g);
                this.f5272l = C0397g.m1941f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f5272l);
                this.f5273m = C0397g.m1941f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f5273m);
                this.f5271k = C0397g.m1941f(typedArray, xmlPullParser, "trimPathStart", 5, this.f5271k);
                this.f5292c = C0397g.m1942g(typedArray, xmlPullParser, "fillType", 13, this.f5292c);
            }
        }

        @Override // p006b.p064s.p065a.p066a.C1194i.AbstractC1199e
        /* renamed from: a */
        public boolean mo5991a() {
            return this.f5268h.mo2225i() || this.f5266f.mo2225i();
        }

        @Override // p006b.p064s.p065a.p066a.C1194i.AbstractC1199e
        /* renamed from: b */
        public boolean mo5992b(int[] iArr) {
            return this.f5266f.mo2226j(iArr) | this.f5268h.mo2226j(iArr);
        }

        /* renamed from: g */
        public void mo5993g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C1182a.f5227c);
            m6475h(k, xmlPullParser, theme);
            k.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f5270j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f5268h.mo2222e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f5269i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f5266f.mo2222e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f5267g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f5272l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f5273m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f5271k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f5270j = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f5268h.mo2227k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f5269i = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f5266f.mo2227k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f5267g = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f5272l = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f5273m = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f5271k = f;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.s.a.a.i$d */
    public static class C1198d extends AbstractC1199e {

        /* renamed from: a */
        final Matrix f5277a;

        /* renamed from: b */
        final ArrayList<AbstractC1199e> f5278b;

        /* renamed from: c */
        float f5279c;

        /* renamed from: d */
        private float f5280d;

        /* renamed from: e */
        private float f5281e;

        /* renamed from: f */
        private float f5282f;

        /* renamed from: g */
        private float f5283g;

        /* renamed from: h */
        private float f5284h;

        /* renamed from: i */
        private float f5285i;

        /* renamed from: j */
        final Matrix f5286j;

        /* renamed from: k */
        int f5287k;

        /* renamed from: l */
        private int[] f5288l;

        /* renamed from: m */
        private String f5289m;

        public C1198d() {
            super();
            this.f5277a = new Matrix();
            this.f5278b = new ArrayList<>();
            this.f5279c = 0.0f;
            this.f5280d = 0.0f;
            this.f5281e = 0.0f;
            this.f5282f = 1.0f;
            this.f5283g = 1.0f;
            this.f5284h = 0.0f;
            this.f5285i = 0.0f;
            this.f5286j = new Matrix();
            this.f5289m = null;
        }

        public C1198d(C1198d dVar, C0823a<String, Object> aVar) {
            super();
            AbstractC1200f fVar;
            this.f5277a = new Matrix();
            this.f5278b = new ArrayList<>();
            this.f5279c = 0.0f;
            this.f5280d = 0.0f;
            this.f5281e = 0.0f;
            this.f5282f = 1.0f;
            this.f5283g = 1.0f;
            this.f5284h = 0.0f;
            this.f5285i = 0.0f;
            Matrix matrix = new Matrix();
            this.f5286j = matrix;
            this.f5289m = null;
            this.f5279c = dVar.f5279c;
            this.f5280d = dVar.f5280d;
            this.f5281e = dVar.f5281e;
            this.f5282f = dVar.f5282f;
            this.f5283g = dVar.f5283g;
            this.f5284h = dVar.f5284h;
            this.f5285i = dVar.f5285i;
            this.f5288l = dVar.f5288l;
            String str = dVar.f5289m;
            this.f5289m = str;
            this.f5287k = dVar.f5287k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f5286j);
            ArrayList<AbstractC1199e> arrayList = dVar.f5278b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC1199e eVar = arrayList.get(i);
                if (eVar instanceof C1198d) {
                    this.f5278b.add(new C1198d((C1198d) eVar, aVar));
                } else {
                    if (eVar instanceof C1197c) {
                        fVar = new C1197c((C1197c) eVar);
                    } else if (eVar instanceof C1196b) {
                        fVar = new C1196b((C1196b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f5278b.add(fVar);
                    String str2 = fVar.f5291b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m6479d() {
            this.f5286j.reset();
            this.f5286j.postTranslate(-this.f5280d, -this.f5281e);
            this.f5286j.postScale(this.f5282f, this.f5283g);
            this.f5286j.postRotate(this.f5279c, 0.0f, 0.0f);
            this.f5286j.postTranslate(this.f5284h + this.f5280d, this.f5285i + this.f5281e);
        }

        /* renamed from: e */
        private void m6480e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f5288l = null;
            this.f5279c = C0397g.m1941f(typedArray, xmlPullParser, "rotation", 5, this.f5279c);
            this.f5280d = typedArray.getFloat(1, this.f5280d);
            this.f5281e = typedArray.getFloat(2, this.f5281e);
            this.f5282f = C0397g.m1941f(typedArray, xmlPullParser, "scaleX", 3, this.f5282f);
            this.f5283g = C0397g.m1941f(typedArray, xmlPullParser, "scaleY", 4, this.f5283g);
            this.f5284h = C0397g.m1941f(typedArray, xmlPullParser, "translateX", 6, this.f5284h);
            this.f5285i = C0397g.m1941f(typedArray, xmlPullParser, "translateY", 7, this.f5285i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5289m = string;
            }
            m6479d();
        }

        @Override // p006b.p064s.p065a.p066a.C1194i.AbstractC1199e
        /* renamed from: a */
        public boolean mo5991a() {
            for (int i = 0; i < this.f5278b.size(); i++) {
                if (this.f5278b.get(i).mo5991a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p006b.p064s.p065a.p066a.C1194i.AbstractC1199e
        /* renamed from: b */
        public boolean mo5992b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f5278b.size(); i++) {
                z |= this.f5278b.get(i).mo5992b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void mo6010c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C1182a.f5226b);
            m6480e(k, xmlPullParser);
            k.recycle();
        }

        public String getGroupName() {
            return this.f5289m;
        }

        public Matrix getLocalMatrix() {
            return this.f5286j;
        }

        public float getPivotX() {
            return this.f5280d;
        }

        public float getPivotY() {
            return this.f5281e;
        }

        public float getRotation() {
            return this.f5279c;
        }

        public float getScaleX() {
            return this.f5282f;
        }

        public float getScaleY() {
            return this.f5283g;
        }

        public float getTranslateX() {
            return this.f5284h;
        }

        public float getTranslateY() {
            return this.f5285i;
        }

        public void setPivotX(float f) {
            if (f != this.f5280d) {
                this.f5280d = f;
                m6479d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f5281e) {
                this.f5281e = f;
                m6479d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f5279c) {
                this.f5279c = f;
                m6479d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f5282f) {
                this.f5282f = f;
                m6479d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f5283g) {
                this.f5283g = f;
                m6479d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f5284h) {
                this.f5284h = f;
                m6479d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f5285i) {
                this.f5285i = f;
                m6479d();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.s.a.a.i$e */
    public static abstract class AbstractC1199e {
        private AbstractC1199e() {
        }

        /* renamed from: a */
        public boolean mo5991a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo5992b(int[] iArr) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.s.a.a.i$f */
    public static abstract class AbstractC1200f extends AbstractC1199e {

        /* renamed from: a */
        protected C0903c.C0905b[] f5290a = null;

        /* renamed from: b */
        String f5291b;

        /* renamed from: c */
        int f5292c = 0;

        /* renamed from: d */
        int f5293d;

        public AbstractC1200f() {
            super();
        }

        public AbstractC1200f(AbstractC1200f fVar) {
            super();
            this.f5291b = fVar.f5291b;
            this.f5293d = fVar.f5293d;
            this.f5290a = C0903c.m5309f(fVar.f5290a);
        }

        /* renamed from: c */
        public boolean mo5989c() {
            return false;
        }

        /* renamed from: d */
        public void mo6027d(Path path) {
            path.reset();
            C0903c.C0905b[] bVarArr = this.f5290a;
            if (bVarArr != null) {
                C0903c.C0905b.m5317e(bVarArr, path);
            }
        }

        public C0903c.C0905b[] getPathData() {
            return this.f5290a;
        }

        public String getPathName() {
            return this.f5291b;
        }

        public void setPathData(C0903c.C0905b[] bVarArr) {
            if (!C0903c.m5305b(this.f5290a, bVarArr)) {
                this.f5290a = C0903c.m5309f(bVarArr);
            } else {
                C0903c.m5313j(this.f5290a, bVarArr);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.s.a.a.i$g */
    public static class C1201g {

        /* renamed from: a */
        private static final Matrix f5294a = new Matrix();

        /* renamed from: b */
        private final Path f5295b;

        /* renamed from: c */
        private final Path f5296c;

        /* renamed from: d */
        private final Matrix f5297d;

        /* renamed from: e */
        Paint f5298e;

        /* renamed from: f */
        Paint f5299f;

        /* renamed from: g */
        private PathMeasure f5300g;

        /* renamed from: h */
        private int f5301h;

        /* renamed from: i */
        final C1198d f5302i;

        /* renamed from: j */
        float f5303j;

        /* renamed from: k */
        float f5304k;

        /* renamed from: l */
        float f5305l;

        /* renamed from: m */
        float f5306m;

        /* renamed from: n */
        int f5307n;

        /* renamed from: o */
        String f5308o;

        /* renamed from: p */
        Boolean f5309p;

        /* renamed from: q */
        final C0823a<String, Object> f5310q;

        public C1201g() {
            this.f5297d = new Matrix();
            this.f5303j = 0.0f;
            this.f5304k = 0.0f;
            this.f5305l = 0.0f;
            this.f5306m = 0.0f;
            this.f5307n = 255;
            this.f5308o = null;
            this.f5309p = null;
            this.f5310q = new C0823a<>();
            this.f5302i = new C1198d();
            this.f5295b = new Path();
            this.f5296c = new Path();
        }

        public C1201g(C1201g gVar) {
            this.f5297d = new Matrix();
            this.f5303j = 0.0f;
            this.f5304k = 0.0f;
            this.f5305l = 0.0f;
            this.f5306m = 0.0f;
            this.f5307n = 255;
            this.f5308o = null;
            this.f5309p = null;
            C0823a<String, Object> aVar = new C0823a<>();
            this.f5310q = aVar;
            this.f5302i = new C1198d(gVar.f5302i, aVar);
            this.f5295b = new Path(gVar.f5295b);
            this.f5296c = new Path(gVar.f5296c);
            this.f5303j = gVar.f5303j;
            this.f5304k = gVar.f5304k;
            this.f5305l = gVar.f5305l;
            this.f5306m = gVar.f5306m;
            this.f5301h = gVar.f5301h;
            this.f5307n = gVar.f5307n;
            this.f5308o = gVar.f5308o;
            String str = gVar.f5308o;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f5309p = gVar.f5309p;
        }

        /* renamed from: a */
        private static float m6488a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m6489c(C1198d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f5277a.set(matrix);
            dVar.f5277a.preConcat(dVar.f5286j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f5278b.size(); i3++) {
                AbstractC1199e eVar = dVar.f5278b.get(i3);
                if (eVar instanceof C1198d) {
                    m6489c((C1198d) eVar, dVar.f5277a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof AbstractC1200f) {
                    m6490d(dVar, (AbstractC1200f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m6490d(C1198d dVar, AbstractC1200f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f5305l;
            float f2 = ((float) i2) / this.f5306m;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f5277a;
            this.f5297d.set(matrix);
            this.f5297d.postScale(f, f2);
            float e = m6491e(matrix);
            if (e != 0.0f) {
                fVar.mo6027d(this.f5295b);
                Path path = this.f5295b;
                this.f5296c.reset();
                if (fVar.mo5989c()) {
                    this.f5296c.setFillType(fVar.f5292c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f5296c.addPath(path, this.f5297d);
                    canvas.clipPath(this.f5296c);
                    return;
                }
                C1197c cVar = (C1197c) fVar;
                float f3 = cVar.f5271k;
                if (!(f3 == 0.0f && cVar.f5272l == 1.0f)) {
                    float f4 = cVar.f5273m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f5272l + f4) % 1.0f;
                    if (this.f5300g == null) {
                        this.f5300g = new PathMeasure();
                    }
                    this.f5300g.setPath(this.f5295b, false);
                    float length = this.f5300g.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f5300g.getSegment(f7, length, path, true);
                        this.f5300g.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f5300g.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f5296c.addPath(path, this.f5297d);
                if (cVar.f5268h.mo2228l()) {
                    C0381b bVar = cVar.f5268h;
                    if (this.f5299f == null) {
                        Paint paint = new Paint(1);
                        this.f5299f = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f5299f;
                    if (bVar.mo2224h()) {
                        Shader f9 = bVar.mo2223f();
                        f9.setLocalMatrix(this.f5297d);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f5270j * 255.0f));
                    } else {
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setColor(C1194i.m6460a(bVar.mo2222e(), cVar.f5270j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f5296c.setFillType(cVar.f5292c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f5296c, paint2);
                }
                if (cVar.f5266f.mo2228l()) {
                    C0381b bVar2 = cVar.f5266f;
                    if (this.f5298e == null) {
                        Paint paint3 = new Paint(1);
                        this.f5298e = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f5298e;
                    Paint.Join join = cVar.f5275o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f5274n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f5276p);
                    if (bVar2.mo2224h()) {
                        Shader f10 = bVar2.mo2223f();
                        f10.setLocalMatrix(this.f5297d);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.f5269i * 255.0f));
                    } else {
                        paint4.setShader(null);
                        paint4.setAlpha(255);
                        paint4.setColor(C1194i.m6460a(bVar2.mo2222e(), cVar.f5269i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f5267g * min * e);
                    canvas.drawPath(this.f5296c, paint4);
                }
            }
        }

        /* renamed from: e */
        private float m6491e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m6488a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void mo6031b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m6489c(this.f5302i, f5294a, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean mo6032f() {
            if (this.f5309p == null) {
                this.f5309p = Boolean.valueOf(this.f5302i.mo5991a());
            }
            return this.f5309p.booleanValue();
        }

        /* renamed from: g */
        public boolean mo6033g(int[] iArr) {
            return this.f5302i.mo5992b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f5307n;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f5307n = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.s.a.a.i$h */
    public static class C1202h extends Drawable.ConstantState {

        /* renamed from: a */
        int f5311a;

        /* renamed from: b */
        C1201g f5312b;

        /* renamed from: c */
        ColorStateList f5313c;

        /* renamed from: d */
        PorterDuff.Mode f5314d;

        /* renamed from: e */
        boolean f5315e;

        /* renamed from: f */
        Bitmap f5316f;

        /* renamed from: g */
        ColorStateList f5317g;

        /* renamed from: h */
        PorterDuff.Mode f5318h;

        /* renamed from: i */
        int f5319i;

        /* renamed from: j */
        boolean f5320j;

        /* renamed from: k */
        boolean f5321k;

        /* renamed from: l */
        Paint f5322l;

        public C1202h() {
            this.f5313c = null;
            this.f5314d = C1194i.f5255c;
            this.f5312b = new C1201g();
        }

        public C1202h(C1202h hVar) {
            this.f5313c = null;
            this.f5314d = C1194i.f5255c;
            if (hVar != null) {
                this.f5311a = hVar.f5311a;
                C1201g gVar = new C1201g(hVar.f5312b);
                this.f5312b = gVar;
                if (hVar.f5312b.f5299f != null) {
                    gVar.f5299f = new Paint(hVar.f5312b.f5299f);
                }
                if (hVar.f5312b.f5298e != null) {
                    this.f5312b.f5298e = new Paint(hVar.f5312b.f5298e);
                }
                this.f5313c = hVar.f5313c;
                this.f5314d = hVar.f5314d;
                this.f5315e = hVar.f5315e;
            }
        }

        /* renamed from: a */
        public boolean mo6038a(int i, int i2) {
            return i == this.f5316f.getWidth() && i2 == this.f5316f.getHeight();
        }

        /* renamed from: b */
        public boolean mo6039b() {
            return !this.f5321k && this.f5317g == this.f5313c && this.f5318h == this.f5314d && this.f5320j == this.f5315e && this.f5319i == this.f5312b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo6040c(int i, int i2) {
            if (this.f5316f == null || !mo6038a(i, i2)) {
                this.f5316f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f5321k = true;
            }
        }

        /* renamed from: d */
        public void mo6041d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f5316f, (Rect) null, rect, mo6042e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo6042e(ColorFilter colorFilter) {
            if (!mo6043f() && colorFilter == null) {
                return null;
            }
            if (this.f5322l == null) {
                Paint paint = new Paint();
                this.f5322l = paint;
                paint.setFilterBitmap(true);
            }
            this.f5322l.setAlpha(this.f5312b.getRootAlpha());
            this.f5322l.setColorFilter(colorFilter);
            return this.f5322l;
        }

        /* renamed from: f */
        public boolean mo6043f() {
            return this.f5312b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean mo6044g() {
            return this.f5312b.mo6032f();
        }

        public int getChangingConfigurations() {
            return this.f5311a;
        }

        /* renamed from: h */
        public boolean mo6046h(int[] iArr) {
            boolean g = this.f5312b.mo6033g(iArr);
            this.f5321k |= g;
            return g;
        }

        /* renamed from: i */
        public void mo6047i() {
            this.f5317g = this.f5313c;
            this.f5318h = this.f5314d;
            this.f5319i = this.f5312b.getRootAlpha();
            this.f5320j = this.f5315e;
            this.f5321k = false;
        }

        /* renamed from: j */
        public void mo6048j(int i, int i2) {
            this.f5316f.eraseColor(0);
            this.f5312b.mo6031b(new Canvas(this.f5316f), i, i2, null);
        }

        public Drawable newDrawable() {
            return new C1194i(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C1194i(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.s.a.a.i$i */
    public static class C1203i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f5323a;

        public C1203i(Drawable.ConstantState constantState) {
            this.f5323a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f5323a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f5323a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1194i iVar = new C1194i();
            iVar.f5254b = (VectorDrawable) this.f5323a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1194i iVar = new C1194i();
            iVar.f5254b = (VectorDrawable) this.f5323a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1194i iVar = new C1194i();
            iVar.f5254b = (VectorDrawable) this.f5323a.newDrawable(resources, theme);
            return iVar;
        }
    }

    C1194i() {
        this.f5260h = true;
        this.f5262j = new float[9];
        this.f5263k = new Matrix();
        this.f5264l = new Rect();
        this.f5256d = new C1202h();
    }

    C1194i(C1202h hVar) {
        this.f5260h = true;
        this.f5262j = new float[9];
        this.f5263k = new Matrix();
        this.f5264l = new Rect();
        this.f5256d = hVar;
        this.f5257e = mo5979j(this.f5257e, hVar.f5313c, hVar.f5314d);
    }

    /* renamed from: a */
    static int m6460a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p006b.p064s.p065a.p066a.C1194i m6461b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            b.s.a.a.i r0 = new b.s.a.a.i
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.p005c.C0390f.m1923a(r6, r7, r8)
            r0.f5254b = r6
            b.s.a.a.i$i r6 = new b.s.a.a.i$i
            android.graphics.drawable.Drawable r7 = r0.f5254b
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f5261i = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            b.s.a.a.i r6 = m6462c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            goto L_0x0048
        L_0x0047:
            r6 = move-exception
        L_0x0048:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p006b.p064s.p065a.p066a.C1194i.m6461b(android.content.res.Resources, int, android.content.res.Resources$Theme):b.s.a.a.i");
    }

    /* renamed from: c */
    public static C1194i m6462c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1194i iVar = new C1194i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v15, resolved type: b.s.a.a.i$c */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    private void m6463e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        C1196b bVar;
        C1202h hVar = this.f5256d;
        C1201g gVar = hVar.f5312b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f5302i);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C1198d dVar = (C1198d) arrayDeque.peek();
                if ("path".equals(name)) {
                    C1197c cVar = new C1197c();
                    cVar.mo5993g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5278b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f5310q.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    C1196b bVar2 = new C1196b();
                    bVar2.mo5990e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5278b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.f5310q.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    C1198d dVar2 = new C1198d();
                    dVar2.mo6010c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5278b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f5310q.put(dVar2.getGroupName(), dVar2);
                    }
                    i = hVar.f5311a;
                    i2 = dVar2.f5287k;
                    hVar.f5311a = i2 | i;
                }
                i = hVar.f5311a;
                i2 = bVar.f5293d;
                hVar.f5311a = i2 | i;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    /* renamed from: f */
    private boolean m6464f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C0398a.m1969f(this) == 1;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m6465g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: i */
    private void m6466i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C1202h hVar = this.f5256d;
        C1201g gVar = hVar.f5312b;
        hVar.f5314d = m6465g(C0397g.m1942g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c = C0397g.m1938c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c != null) {
            hVar.f5313c = c;
        }
        hVar.f5315e = C0397g.m1936a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f5315e);
        gVar.f5305l = C0397g.m1941f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f5305l);
        float f = C0397g.m1941f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f5306m);
        gVar.f5306m = f;
        if (gVar.f5305l <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f > 0.0f) {
            gVar.f5303j = typedArray.getDimension(3, gVar.f5303j);
            float dimension = typedArray.getDimension(2, gVar.f5304k);
            gVar.f5304k = dimension;
            if (gVar.f5303j <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(C0397g.m1941f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f5308o = string;
                    gVar.f5310q.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f5254b;
        if (drawable == null) {
            return false;
        }
        C0398a.m1965b(drawable);
        return false;
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo5964d(String str) {
        return this.f5256d.f5312b.f5310q.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f5264l);
        if (this.f5264l.width() > 0 && this.f5264l.height() > 0) {
            ColorFilter colorFilter = this.f5258f;
            if (colorFilter == null) {
                colorFilter = this.f5257e;
            }
            canvas.getMatrix(this.f5263k);
            this.f5263k.getValues(this.f5262j);
            float abs = Math.abs(this.f5262j[0]);
            float abs2 = Math.abs(this.f5262j[4]);
            float abs3 = Math.abs(this.f5262j[1]);
            float abs4 = Math.abs(this.f5262j[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f5264l.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f5264l.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f5264l;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m6464f()) {
                    canvas.translate((float) this.f5264l.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f5264l.offsetTo(0, 0);
                this.f5256d.mo6040c(min, min2);
                if (!this.f5260h) {
                    this.f5256d.mo6048j(min, min2);
                } else if (!this.f5256d.mo6039b()) {
                    this.f5256d.mo6048j(min, min2);
                    this.f5256d.mo6047i();
                }
                this.f5256d.mo6041d(canvas, colorFilter, this.f5264l);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f5254b;
        return drawable != null ? C0398a.m1967d(drawable) : this.f5256d.f5312b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f5254b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f5256d.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5254b;
        return drawable != null ? C0398a.m1968e(drawable) : this.f5258f;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f5254b != null && Build.VERSION.SDK_INT >= 24) {
            return new C1203i(this.f5254b.getConstantState());
        }
        this.f5256d.f5311a = getChangingConfigurations();
        return this.f5256d;
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f5254b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f5256d.f5312b.f5304k;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f5254b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f5256d.f5312b.f5303j;
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo5973h(boolean z) {
        this.f5260h = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            C0398a.m1970g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1202h hVar = this.f5256d;
        hVar.f5312b = new C1201g();
        TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C1182a.f5225a);
        m6466i(k, xmlPullParser, theme);
        k.recycle();
        hVar.f5311a = getChangingConfigurations();
        hVar.f5321k = true;
        m6463e(resources, xmlPullParser, attributeSet, theme);
        this.f5257e = mo5979j(this.f5257e, hVar.f5313c, hVar.f5314d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f5254b;
        return drawable != null ? C0398a.m1971h(drawable) : this.f5256d.f5315e;
    }

    public boolean isStateful() {
        C1202h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f5254b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f5256d) != null && (hVar.mo6044g() || ((colorStateList = this.f5256d.f5313c) != null && colorStateList.isStateful())));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public PorterDuffColorFilter mo5979j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5259g && super.mutate() == this) {
            this.f5256d = new C1202h(this.f5256d);
            this.f5259g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1202h hVar = this.f5256d;
        ColorStateList colorStateList = hVar.f5313c;
        if (!(colorStateList == null || (mode = hVar.f5314d) == null)) {
            this.f5257e = mo5979j(this.f5257e, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.mo6044g() || !hVar.mo6046h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f5256d.f5312b.getRootAlpha() != i) {
            this.f5256d.f5312b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            C0398a.m1973j(drawable, z);
        } else {
            this.f5256d.f5315e = z;
        }
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f5258f = colorFilter;
        invalidateSelf();
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTint(int i) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            C0398a.m1977n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            C0398a.m1978o(drawable, colorStateList);
            return;
        }
        C1202h hVar = this.f5256d;
        if (hVar.f5313c != colorStateList) {
            hVar.f5313c = colorStateList;
            this.f5257e = mo5979j(this.f5257e, colorStateList, hVar.f5314d);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            C0398a.m1979p(drawable, mode);
            return;
        }
        C1202h hVar = this.f5256d;
        if (hVar.f5314d != mode) {
            hVar.f5314d = mode;
            this.f5257e = mo5979j(this.f5257e, hVar.f5313c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5254b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5254b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
