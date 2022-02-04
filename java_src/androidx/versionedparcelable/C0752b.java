package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p006b.p021d.C0823a;

/* renamed from: androidx.versionedparcelable.b */
class C0752b extends AbstractC0751a {

    /* renamed from: d */
    private final SparseIntArray f3555d;

    /* renamed from: e */
    private final Parcel f3556e;

    /* renamed from: f */
    private final int f3557f;

    /* renamed from: g */
    private final int f3558g;

    /* renamed from: h */
    private final String f3559h;

    /* renamed from: i */
    private int f3560i;

    /* renamed from: j */
    private int f3561j;

    /* renamed from: k */
    private int f3562k;

    C0752b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C0823a(), new C0823a(), new C0823a());
    }

    private C0752b(Parcel parcel, int i, int i2, String str, C0823a<String, Method> aVar, C0823a<String, Method> aVar2, C0823a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3555d = new SparseIntArray();
        this.f3560i = -1;
        this.f3561j = 0;
        this.f3562k = -1;
        this.f3556e = parcel;
        this.f3557f = i;
        this.f3558g = i2;
        this.f3561j = i;
        this.f3559h = str;
    }

    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: A */
    public void mo4519A(byte[] bArr) {
        if (bArr != null) {
            this.f3556e.writeInt(bArr.length);
            this.f3556e.writeByteArray(bArr);
            return;
        }
        this.f3556e.writeInt(-1);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: C */
    public void mo4521C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3556e, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: E */
    public void mo4523E(int i) {
        this.f3556e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: G */
    public void mo4525G(Parcelable parcelable) {
        this.f3556e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: I */
    public void mo4527I(String str) {
        this.f3556e.writeString(str);
    }

    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: a */
    public void mo4532a() {
        int i = this.f3560i;
        if (i >= 0) {
            int i2 = this.f3555d.get(i);
            int dataPosition = this.f3556e.dataPosition();
            this.f3556e.setDataPosition(i2);
            this.f3556e.writeInt(dataPosition - i2);
            this.f3556e.setDataPosition(dataPosition);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: b */
    public AbstractC0751a mo4533b() {
        Parcel parcel = this.f3556e;
        int dataPosition = parcel.dataPosition();
        int i = this.f3561j;
        if (i == this.f3557f) {
            i = this.f3558g;
        }
        return new C0752b(parcel, dataPosition, i, this.f3559h + "  ", this.f3552a, this.f3553b, this.f3554c);
    }

    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: g */
    public boolean mo4535g() {
        return this.f3556e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: i */
    public byte[] mo4537i() {
        int readInt = this.f3556e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f3556e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: k */
    public CharSequence mo4539k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3556e);
    }

    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: m */
    public boolean mo4541m(int i) {
        while (this.f3561j < this.f3558g) {
            int i2 = this.f3562k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f3556e.setDataPosition(this.f3561j);
            int readInt = this.f3556e.readInt();
            this.f3562k = this.f3556e.readInt();
            this.f3561j += readInt;
        }
        return this.f3562k == i;
    }

    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: o */
    public int mo4543o() {
        return this.f3556e.readInt();
    }

    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: q */
    public <T extends Parcelable> T mo4545q() {
        return (T) this.f3556e.readParcelable(C0752b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: s */
    public String mo4547s() {
        return this.f3556e.readString();
    }

    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: w */
    public void mo4551w(int i) {
        mo4532a();
        this.f3560i = i;
        this.f3555d.put(i, this.f3556e.dataPosition());
        mo4523E(0);
        mo4523E(i);
    }

    @Override // androidx.versionedparcelable.AbstractC0751a
    /* renamed from: y */
    public void mo4553y(boolean z) {
        this.f3556e.writeInt(z ? 1 : 0);
    }
}
