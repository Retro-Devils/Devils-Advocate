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
    static final PorterDuff.Mode f5248c = PorterDuff.Mode.SRC_IN;

    /* renamed from: d */
    private C1202h f5249d;

    /* renamed from: e */
    private PorterDuffColorFilter f5250e;

    /* renamed from: f */
    private ColorFilter f5251f;

    /* renamed from: g */
    private boolean f5252g;

    /* renamed from: h */
    private boolean f5253h;

    /* renamed from: i */
    private Drawable.ConstantState f5254i;

    /* renamed from: j */
    private final float[] f5255j;

    /* renamed from: k */
    private final Matrix f5256k;

    /* renamed from: l */
    private final Rect f5257l;

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
                this.f5284b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f5283a = C0903c.m5307d(string2);
            }
            this.f5285c = C0397g.m1942g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // p006b.p064s.p065a.p066a.C1194i.AbstractC1200f
        /* renamed from: c */
        public boolean mo5989c() {
            return true;
        }

        /* renamed from: e */
        public void mo5990e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C0397g.m1945j(xmlPullParser, "pathData")) {
                TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C1182a.f5221d);
                m6470f(k, xmlPullParser);
                k.recycle();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.s.a.a.i$c */
    public static class C1197c extends AbstractC1200f {

        /* renamed from: e */
        private int[] f5258e;

        /* renamed from: f */
        C0381b f5259f;

        /* renamed from: g */
        float f5260g = 0.0f;

        /* renamed from: h */
        C0381b f5261h;

        /* renamed from: i */
        float f5262i = 1.0f;

        /* renamed from: j */
        float f5263j = 1.0f;

        /* renamed from: k */
        float f5264k = 0.0f;

        /* renamed from: l */
        float f5265l = 1.0f;

        /* renamed from: m */
        float f5266m = 0.0f;

        /* renamed from: n */
        Paint.Cap f5267n = Paint.Cap.BUTT;

        /* renamed from: o */
        Paint.Join f5268o = Paint.Join.MITER;

        /* renamed from: p */
        float f5269p = 4.0f;

        C1197c() {
        }

        C1197c(C1197c cVar) {
            super(cVar);
            this.f5258e = cVar.f5258e;
            this.f5259f = cVar.f5259f;
            this.f5260g = cVar.f5260g;
            this.f5262i = cVar.f5262i;
            this.f5261h = cVar.f5261h;
            this.f5285c = cVar.f5285c;
            this.f5263j = cVar.f5263j;
            this.f5264k = cVar.f5264k;
            this.f5265l = cVar.f5265l;
            this.f5266m = cVar.f5266m;
            this.f5267n = cVar.f5267n;
            this.f5268o = cVar.f5268o;
            this.f5269p = cVar.f5269p;
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
            this.f5258e = null;
            if (C0397g.m1945j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f5284b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f5283a = C0903c.m5307d(string2);
                }
                this.f5261h = C0397g.m1940e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f5263j = C0397g.m1941f(typedArray, xmlPullParser, "fillAlpha", 12, this.f5263j);
                this.f5267n = m6473e(C0397g.m1942g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f5267n);
                this.f5268o = m6474f(C0397g.m1942g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f5268o);
                this.f5269p = C0397g.m1941f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f5269p);
                this.f5259f = C0397g.m1940e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f5262i = C0397g.m1941f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f5262i);
                this.f5260g = C0397g.m1941f(typedArray, xmlPullParser, "strokeWidth", 4, this.f5260g);
                this.f5265l = C0397g.m1941f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f5265l);
                this.f5266m = C0397g.m1941f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f5266m);
                this.f5264k = C0397g.m1941f(typedArray, xmlPullParser, "trimPathStart", 5, this.f5264k);
                this.f5285c = C0397g.m1942g(typedArray, xmlPullParser, "fillType", 13, this.f5285c);
            }
        }

        @Override // p006b.p064s.p065a.p066a.C1194i.AbstractC1199e
        /* renamed from: a */
        public boolean mo5991a() {
            return this.f5261h.mo2225i() || this.f5259f.mo2225i();
        }

        @Override // p006b.p064s.p065a.p066a.C1194i.AbstractC1199e
        /* renamed from: b */
        public boolean mo5992b(int[] iArr) {
            return this.f5259f.mo2226j(iArr) | this.f5261h.mo2226j(iArr);
        }

        /* renamed from: g */
        public void mo5993g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C1182a.f5220c);
            m6475h(k, xmlPullParser, theme);
            k.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f5263j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f5261h.mo2222e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f5262i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f5259f.mo2222e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f5260g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f5265l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f5266m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f5264k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f5263j = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f5261h.mo2227k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f5262i = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f5259f.mo2227k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f5260g = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f5265l = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f5266m = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f5264k = f;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.s.a.a.i$d */
    public static class C1198d extends AbstractC1199e {

        /* renamed from: a */
        final Matrix f5270a;

        /* renamed from: b */
        final ArrayList<AbstractC1199e> f5271b;

        /* renamed from: c */
        float f5272c;

        /* renamed from: d */
        private float f5273d;

        /* renamed from: e */
        private float f5274e;

        /* renamed from: f */
        private float f5275f;

        /* renamed from: g */
        private float f5276g;

        /* renamed from: h */
        private float f5277h;

        /* renamed from: i */
        private float f5278i;

        /* renamed from: j */
        final Matrix f5279j;

        /* renamed from: k */
        int f5280k;

        /* renamed from: l */
        private int[] f5281l;

        /* renamed from: m */
        private String f5282m;

        public C1198d() {
            super();
            this.f5270a = new Matrix();
            this.f5271b = new ArrayList<>();
            this.f5272c = 0.0f;
            this.f5273d = 0.0f;
            this.f5274e = 0.0f;
            this.f5275f = 1.0f;
            this.f5276g = 1.0f;
            this.f5277h = 0.0f;
            this.f5278i = 0.0f;
            this.f5279j = new Matrix();
            this.f5282m = null;
        }

        public C1198d(C1198d dVar, C0823a<String, Object> aVar) {
            super();
            AbstractC1200f fVar;
            this.f5270a = new Matrix();
            this.f5271b = new ArrayList<>();
            this.f5272c = 0.0f;
            this.f5273d = 0.0f;
            this.f5274e = 0.0f;
            this.f5275f = 1.0f;
            this.f5276g = 1.0f;
            this.f5277h = 0.0f;
            this.f5278i = 0.0f;
            Matrix matrix = new Matrix();
            this.f5279j = matrix;
            this.f5282m = null;
            this.f5272c = dVar.f5272c;
            this.f5273d = dVar.f5273d;
            this.f5274e = dVar.f5274e;
            this.f5275f = dVar.f5275f;
            this.f5276g = dVar.f5276g;
            this.f5277h = dVar.f5277h;
            this.f5278i = dVar.f5278i;
            this.f5281l = dVar.f5281l;
            String str = dVar.f5282m;
            this.f5282m = str;
            this.f5280k = dVar.f5280k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f5279j);
            ArrayList<AbstractC1199e> arrayList = dVar.f5271b;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC1199e eVar = arrayList.get(i);
                if (eVar instanceof C1198d) {
                    this.f5271b.add(new C1198d((C1198d) eVar, aVar));
                } else {
                    if (eVar instanceof C1197c) {
                        fVar = new C1197c((C1197c) eVar);
                    } else if (eVar instanceof C1196b) {
                        fVar = new C1196b((C1196b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f5271b.add(fVar);
                    String str2 = fVar.f5284b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m6479d() {
            this.f5279j.reset();
            this.f5279j.postTranslate(-this.f5273d, -this.f5274e);
            this.f5279j.postScale(this.f5275f, this.f5276g);
            this.f5279j.postRotate(this.f5272c, 0.0f, 0.0f);
            this.f5279j.postTranslate(this.f5277h + this.f5273d, this.f5278i + this.f5274e);
        }

        /* renamed from: e */
        private void m6480e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f5281l = null;
            this.f5272c = C0397g.m1941f(typedArray, xmlPullParser, "rotation", 5, this.f5272c);
            this.f5273d = typedArray.getFloat(1, this.f5273d);
            this.f5274e = typedArray.getFloat(2, this.f5274e);
            this.f5275f = C0397g.m1941f(typedArray, xmlPullParser, "scaleX", 3, this.f5275f);
            this.f5276g = C0397g.m1941f(typedArray, xmlPullParser, "scaleY", 4, this.f5276g);
            this.f5277h = C0397g.m1941f(typedArray, xmlPullParser, "translateX", 6, this.f5277h);
            this.f5278i = C0397g.m1941f(typedArray, xmlPullParser, "translateY", 7, this.f5278i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f5282m = string;
            }
            m6479d();
        }

        @Override // p006b.p064s.p065a.p066a.C1194i.AbstractC1199e
        /* renamed from: a */
        public boolean mo5991a() {
            for (int i = 0; i < this.f5271b.size(); i++) {
                if (this.f5271b.get(i).mo5991a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p006b.p064s.p065a.p066a.C1194i.AbstractC1199e
        /* renamed from: b */
        public boolean mo5992b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f5271b.size(); i++) {
                z |= this.f5271b.get(i).mo5992b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void mo6010c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C1182a.f5219b);
            m6480e(k, xmlPullParser);
            k.recycle();
        }

        public String getGroupName() {
            return this.f5282m;
        }

        public Matrix getLocalMatrix() {
            return this.f5279j;
        }

        public float getPivotX() {
            return this.f5273d;
        }

        public float getPivotY() {
            return this.f5274e;
        }

        public float getRotation() {
            return this.f5272c;
        }

        public float getScaleX() {
            return this.f5275f;
        }

        public float getScaleY() {
            return this.f5276g;
        }

        public float getTranslateX() {
            return this.f5277h;
        }

        public float getTranslateY() {
            return this.f5278i;
        }

        public void setPivotX(float f) {
            if (f != this.f5273d) {
                this.f5273d = f;
                m6479d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f5274e) {
                this.f5274e = f;
                m6479d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f5272c) {
                this.f5272c = f;
                m6479d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f5275f) {
                this.f5275f = f;
                m6479d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f5276g) {
                this.f5276g = f;
                m6479d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f5277h) {
                this.f5277h = f;
                m6479d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f5278i) {
                this.f5278i = f;
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
        protected C0903c.C0905b[] f5283a = null;

        /* renamed from: b */
        String f5284b;

        /* renamed from: c */
        int f5285c = 0;

        /* renamed from: d */
        int f5286d;

        public AbstractC1200f() {
            super();
        }

        public AbstractC1200f(AbstractC1200f fVar) {
            super();
            this.f5284b = fVar.f5284b;
            this.f5286d = fVar.f5286d;
            this.f5283a = C0903c.m5309f(fVar.f5283a);
        }

        /* renamed from: c */
        public boolean mo5989c() {
            return false;
        }

        /* renamed from: d */
        public void mo6027d(Path path) {
            path.reset();
            C0903c.C0905b[] bVarArr = this.f5283a;
            if (bVarArr != null) {
                C0903c.C0905b.m5317e(bVarArr, path);
            }
        }

        public C0903c.C0905b[] getPathData() {
            return this.f5283a;
        }

        public String getPathName() {
            return this.f5284b;
        }

        public void setPathData(C0903c.C0905b[] bVarArr) {
            if (!C0903c.m5305b(this.f5283a, bVarArr)) {
                this.f5283a = C0903c.m5309f(bVarArr);
            } else {
                C0903c.m5313j(this.f5283a, bVarArr);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.s.a.a.i$g */
    public static class C1201g {

        /* renamed from: a */
        private static final Matrix f5287a = new Matrix();

        /* renamed from: b */
        private final Path f5288b;

        /* renamed from: c */
        private final Path f5289c;

        /* renamed from: d */
        private final Matrix f5290d;

        /* renamed from: e */
        Paint f5291e;

        /* renamed from: f */
        Paint f5292f;

        /* renamed from: g */
        private PathMeasure f5293g;

        /* renamed from: h */
        private int f5294h;

        /* renamed from: i */
        final C1198d f5295i;

        /* renamed from: j */
        float f5296j;

        /* renamed from: k */
        float f5297k;

        /* renamed from: l */
        float f5298l;

        /* renamed from: m */
        float f5299m;

        /* renamed from: n */
        int f5300n;

        /* renamed from: o */
        String f5301o;

        /* renamed from: p */
        Boolean f5302p;

        /* renamed from: q */
        final C0823a<String, Object> f5303q;

        public C1201g() {
            this.f5290d = new Matrix();
            this.f5296j = 0.0f;
            this.f5297k = 0.0f;
            this.f5298l = 0.0f;
            this.f5299m = 0.0f;
            this.f5300n = 255;
            this.f5301o = null;
            this.f5302p = null;
            this.f5303q = new C0823a<>();
            this.f5295i = new C1198d();
            this.f5288b = new Path();
            this.f5289c = new Path();
        }

        public C1201g(C1201g gVar) {
            this.f5290d = new Matrix();
            this.f5296j = 0.0f;
            this.f5297k = 0.0f;
            this.f5298l = 0.0f;
            this.f5299m = 0.0f;
            this.f5300n = 255;
            this.f5301o = null;
            this.f5302p = null;
            C0823a<String, Object> aVar = new C0823a<>();
            this.f5303q = aVar;
            this.f5295i = new C1198d(gVar.f5295i, aVar);
            this.f5288b = new Path(gVar.f5288b);
            this.f5289c = new Path(gVar.f5289c);
            this.f5296j = gVar.f5296j;
            this.f5297k = gVar.f5297k;
            this.f5298l = gVar.f5298l;
            this.f5299m = gVar.f5299m;
            this.f5294h = gVar.f5294h;
            this.f5300n = gVar.f5300n;
            this.f5301o = gVar.f5301o;
            String str = gVar.f5301o;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f5302p = gVar.f5302p;
        }

        /* renamed from: a */
        private static float m6488a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m6489c(C1198d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f5270a.set(matrix);
            dVar.f5270a.preConcat(dVar.f5279j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f5271b.size(); i3++) {
                AbstractC1199e eVar = dVar.f5271b.get(i3);
                if (eVar instanceof C1198d) {
                    m6489c((C1198d) eVar, dVar.f5270a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof AbstractC1200f) {
                    m6490d(dVar, (AbstractC1200f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m6490d(C1198d dVar, AbstractC1200f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f5298l;
            float f2 = ((float) i2) / this.f5299m;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f5270a;
            this.f5290d.set(matrix);
            this.f5290d.postScale(f, f2);
            float e = m6491e(matrix);
            if (e != 0.0f) {
                fVar.mo6027d(this.f5288b);
                Path path = this.f5288b;
                this.f5289c.reset();
                if (fVar.mo5989c()) {
                    this.f5289c.setFillType(fVar.f5285c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f5289c.addPath(path, this.f5290d);
                    canvas.clipPath(this.f5289c);
                    return;
                }
                C1197c cVar = (C1197c) fVar;
                float f3 = cVar.f5264k;
                if (!(f3 == 0.0f && cVar.f5265l == 1.0f)) {
                    float f4 = cVar.f5266m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f5265l + f4) % 1.0f;
                    if (this.f5293g == null) {
                        this.f5293g = new PathMeasure();
                    }
                    this.f5293g.setPath(this.f5288b, false);
                    float length = this.f5293g.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f5293g.getSegment(f7, length, path, true);
                        this.f5293g.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f5293g.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f5289c.addPath(path, this.f5290d);
                if (cVar.f5261h.mo2228l()) {
                    C0381b bVar = cVar.f5261h;
                    if (this.f5292f == null) {
                        Paint paint = new Paint(1);
                        this.f5292f = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f5292f;
                    if (bVar.mo2224h()) {
                        Shader f9 = bVar.mo2223f();
                        f9.setLocalMatrix(this.f5290d);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f5263j * 255.0f));
                    } else {
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setColor(C1194i.m6460a(bVar.mo2222e(), cVar.f5263j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f5289c.setFillType(cVar.f5285c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f5289c, paint2);
                }
                if (cVar.f5259f.mo2228l()) {
                    C0381b bVar2 = cVar.f5259f;
                    if (this.f5291e == null) {
                        Paint paint3 = new Paint(1);
                        this.f5291e = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f5291e;
                    Paint.Join join = cVar.f5268o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f5267n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f5269p);
                    if (bVar2.mo2224h()) {
                        Shader f10 = bVar2.mo2223f();
                        f10.setLocalMatrix(this.f5290d);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.f5262i * 255.0f));
                    } else {
                        paint4.setShader(null);
                        paint4.setAlpha(255);
                        paint4.setColor(C1194i.m6460a(bVar2.mo2222e(), cVar.f5262i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f5260g * min * e);
                    canvas.drawPath(this.f5289c, paint4);
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
            m6489c(this.f5295i, f5287a, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean mo6032f() {
            if (this.f5302p == null) {
                this.f5302p = Boolean.valueOf(this.f5295i.mo5991a());
            }
            return this.f5302p.booleanValue();
        }

        /* renamed from: g */
        public boolean mo6033g(int[] iArr) {
            return this.f5295i.mo5992b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f5300n;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f5300n = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b.s.a.a.i$h */
    public static class C1202h extends Drawable.ConstantState {

        /* renamed from: a */
        int f5304a;

        /* renamed from: b */
        C1201g f5305b;

        /* renamed from: c */
        ColorStateList f5306c;

        /* renamed from: d */
        PorterDuff.Mode f5307d;

        /* renamed from: e */
        boolean f5308e;

        /* renamed from: f */
        Bitmap f5309f;

        /* renamed from: g */
        ColorStateList f5310g;

        /* renamed from: h */
        PorterDuff.Mode f5311h;

        /* renamed from: i */
        int f5312i;

        /* renamed from: j */
        boolean f5313j;

        /* renamed from: k */
        boolean f5314k;

        /* renamed from: l */
        Paint f5315l;

        public C1202h() {
            this.f5306c = null;
            this.f5307d = C1194i.f5248c;
            this.f5305b = new C1201g();
        }

        public C1202h(C1202h hVar) {
            this.f5306c = null;
            this.f5307d = C1194i.f5248c;
            if (hVar != null) {
                this.f5304a = hVar.f5304a;
                C1201g gVar = new C1201g(hVar.f5305b);
                this.f5305b = gVar;
                if (hVar.f5305b.f5292f != null) {
                    gVar.f5292f = new Paint(hVar.f5305b.f5292f);
                }
                if (hVar.f5305b.f5291e != null) {
                    this.f5305b.f5291e = new Paint(hVar.f5305b.f5291e);
                }
                this.f5306c = hVar.f5306c;
                this.f5307d = hVar.f5307d;
                this.f5308e = hVar.f5308e;
            }
        }

        /* renamed from: a */
        public boolean mo6038a(int i, int i2) {
            return i == this.f5309f.getWidth() && i2 == this.f5309f.getHeight();
        }

        /* renamed from: b */
        public boolean mo6039b() {
            return !this.f5314k && this.f5310g == this.f5306c && this.f5311h == this.f5307d && this.f5313j == this.f5308e && this.f5312i == this.f5305b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo6040c(int i, int i2) {
            if (this.f5309f == null || !mo6038a(i, i2)) {
                this.f5309f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f5314k = true;
            }
        }

        /* renamed from: d */
        public void mo6041d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f5309f, (Rect) null, rect, mo6042e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo6042e(ColorFilter colorFilter) {
            if (!mo6043f() && colorFilter == null) {
                return null;
            }
            if (this.f5315l == null) {
                Paint paint = new Paint();
                this.f5315l = paint;
                paint.setFilterBitmap(true);
            }
            this.f5315l.setAlpha(this.f5305b.getRootAlpha());
            this.f5315l.setColorFilter(colorFilter);
            return this.f5315l;
        }

        /* renamed from: f */
        public boolean mo6043f() {
            return this.f5305b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean mo6044g() {
            return this.f5305b.mo6032f();
        }

        public int getChangingConfigurations() {
            return this.f5304a;
        }

        /* renamed from: h */
        public boolean mo6046h(int[] iArr) {
            boolean g = this.f5305b.mo6033g(iArr);
            this.f5314k |= g;
            return g;
        }

        /* renamed from: i */
        public void mo6047i() {
            this.f5310g = this.f5306c;
            this.f5311h = this.f5307d;
            this.f5312i = this.f5305b.getRootAlpha();
            this.f5313j = this.f5308e;
            this.f5314k = false;
        }

        /* renamed from: j */
        public void mo6048j(int i, int i2) {
            this.f5309f.eraseColor(0);
            this.f5305b.mo6031b(new Canvas(this.f5309f), i, i2, null);
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
        private final Drawable.ConstantState f5316a;

        public C1203i(Drawable.ConstantState constantState) {
            this.f5316a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f5316a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f5316a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1194i iVar = new C1194i();
            iVar.f5247b = (VectorDrawable) this.f5316a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1194i iVar = new C1194i();
            iVar.f5247b = (VectorDrawable) this.f5316a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1194i iVar = new C1194i();
            iVar.f5247b = (VectorDrawable) this.f5316a.newDrawable(resources, theme);
            return iVar;
        }
    }

    C1194i() {
        this.f5253h = true;
        this.f5255j = new float[9];
        this.f5256k = new Matrix();
        this.f5257l = new Rect();
        this.f5249d = new C1202h();
    }

    C1194i(C1202h hVar) {
        this.f5253h = true;
        this.f5255j = new float[9];
        this.f5256k = new Matrix();
        this.f5257l = new Rect();
        this.f5249d = hVar;
        this.f5250e = mo5979j(this.f5250e, hVar.f5306c, hVar.f5307d);
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
            r0.f5247b = r6
            b.s.a.a.i$i r6 = new b.s.a.a.i$i
            android.graphics.drawable.Drawable r7 = r0.f5247b
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f5254i = r6
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
        C1202h hVar = this.f5249d;
        C1201g gVar = hVar.f5305b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f5295i);
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
                    dVar.f5271b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f5303q.put(cVar.getPathName(), cVar);
                    }
                    z = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    C1196b bVar2 = new C1196b();
                    bVar2.mo5990e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5271b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.f5303q.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    C1198d dVar2 = new C1198d();
                    dVar2.mo6010c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f5271b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f5303q.put(dVar2.getGroupName(), dVar2);
                    }
                    i = hVar.f5304a;
                    i2 = dVar2.f5280k;
                    hVar.f5304a = i2 | i;
                }
                i = hVar.f5304a;
                i2 = bVar.f5286d;
                hVar.f5304a = i2 | i;
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
        C1202h hVar = this.f5249d;
        C1201g gVar = hVar.f5305b;
        hVar.f5307d = m6465g(C0397g.m1942g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c = C0397g.m1938c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c != null) {
            hVar.f5306c = c;
        }
        hVar.f5308e = C0397g.m1936a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f5308e);
        gVar.f5298l = C0397g.m1941f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f5298l);
        float f = C0397g.m1941f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f5299m);
        gVar.f5299m = f;
        if (gVar.f5298l <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f > 0.0f) {
            gVar.f5296j = typedArray.getDimension(3, gVar.f5296j);
            float dimension = typedArray.getDimension(2, gVar.f5297k);
            gVar.f5297k = dimension;
            if (gVar.f5296j <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(C0397g.m1941f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f5301o = string;
                    gVar.f5303q.put(string, gVar);
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
        Drawable drawable = this.f5247b;
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
        return this.f5249d.f5305b.f5303q.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f5257l);
        if (this.f5257l.width() > 0 && this.f5257l.height() > 0) {
            ColorFilter colorFilter = this.f5251f;
            if (colorFilter == null) {
                colorFilter = this.f5250e;
            }
            canvas.getMatrix(this.f5256k);
            this.f5256k.getValues(this.f5255j);
            float abs = Math.abs(this.f5255j[0]);
            float abs2 = Math.abs(this.f5255j[4]);
            float abs3 = Math.abs(this.f5255j[1]);
            float abs4 = Math.abs(this.f5255j[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f5257l.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f5257l.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f5257l;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m6464f()) {
                    canvas.translate((float) this.f5257l.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f5257l.offsetTo(0, 0);
                this.f5249d.mo6040c(min, min2);
                if (!this.f5253h) {
                    this.f5249d.mo6048j(min, min2);
                } else if (!this.f5249d.mo6039b()) {
                    this.f5249d.mo6048j(min, min2);
                    this.f5249d.mo6047i();
                }
                this.f5249d.mo6041d(canvas, colorFilter, this.f5257l);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f5247b;
        return drawable != null ? C0398a.m1967d(drawable) : this.f5249d.f5305b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f5247b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f5249d.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5247b;
        return drawable != null ? C0398a.m1968e(drawable) : this.f5251f;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f5247b != null && Build.VERSION.SDK_INT >= 24) {
            return new C1203i(this.f5247b.getConstantState());
        }
        this.f5249d.f5304a = getChangingConfigurations();
        return this.f5249d;
    }

    @Override // p006b.p064s.p065a.p066a.AbstractC1193h
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f5247b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f5249d.f5305b.f5297k;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f5247b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f5249d.f5305b.f5296j;
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
        Drawable drawable = this.f5247b;
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
        this.f5253h = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            C0398a.m1970g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1202h hVar = this.f5249d;
        hVar.f5305b = new C1201g();
        TypedArray k = C0397g.m1946k(resources, theme, attributeSet, C1182a.f5218a);
        m6466i(k, xmlPullParser, theme);
        k.recycle();
        hVar.f5304a = getChangingConfigurations();
        hVar.f5314k = true;
        m6463e(resources, xmlPullParser, attributeSet, theme);
        this.f5250e = mo5979j(this.f5250e, hVar.f5306c, hVar.f5307d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f5247b;
        return drawable != null ? C0398a.m1971h(drawable) : this.f5249d.f5308e;
    }

    public boolean isStateful() {
        C1202h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f5247b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f5249d) != null && (hVar.mo6044g() || ((colorStateList = this.f5249d.f5306c) != null && colorStateList.isStateful())));
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
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f5252g && super.mutate() == this) {
            this.f5249d = new C1202h(this.f5249d);
            this.f5252g = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C1202h hVar = this.f5249d;
        ColorStateList colorStateList = hVar.f5306c;
        if (!(colorStateList == null || (mode = hVar.f5307d) == null)) {
            this.f5250e = mo5979j(this.f5250e, colorStateList, mode);
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
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f5249d.f5305b.getRootAlpha() != i) {
            this.f5249d.f5305b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            C0398a.m1973j(drawable, z);
        } else {
            this.f5249d.f5308e = z;
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
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f5251f = colorFilter;
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
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            C0398a.m1977n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            C0398a.m1978o(drawable, colorStateList);
            return;
        }
        C1202h hVar = this.f5249d;
        if (hVar.f5306c != colorStateList) {
            hVar.f5306c = colorStateList;
            this.f5250e = mo5979j(this.f5250e, colorStateList, hVar.f5307d);
            invalidateSelf();
        }
    }

    @Override // androidx.core.graphics.drawable.AbstractC0399b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            C0398a.m1979p(drawable, mode);
            return;
        }
        C1202h hVar = this.f5249d;
        if (hVar.f5307d != mode) {
            hVar.f5307d = mode;
            this.f5250e = mo5979j(this.f5250e, hVar.f5306c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5247b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f5247b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
