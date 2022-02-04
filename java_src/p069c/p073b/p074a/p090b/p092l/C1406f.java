package p069c.p073b.p074a.p090b.p092l;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: c.b.a.b.l.f */
public class C1406f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f6015a = new Matrix();

    public C1406f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f6015a.set(imageView.getImageMatrix());
        return this.f6015a;
    }

    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
