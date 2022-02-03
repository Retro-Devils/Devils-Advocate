.class public abstract Lc/b/a/a/f/b/f;
.super Lc/b/a/a/d/a/b;
.source ""

# interfaces
.implements Lc/b/a/a/f/b/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "com.google.android.gms.signin.internal.ISignInCallbacks"

    invoke-direct {p0, v0}, Lc/b/a/a/d/a/b;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected w0(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 0

    const/4 p4, 0x3

    if-eq p1, p4, :cond_4

    const/4 p4, 0x4

    if-eq p1, p4, :cond_3

    const/4 p4, 0x6

    if-eq p1, p4, :cond_2

    const/4 p4, 0x7

    if-eq p1, p4, :cond_1

    const/16 p4, 0x8

    if-eq p1, p4, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sget-object p1, Lc/b/a/a/f/b/k;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lc/b/a/a/d/a/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lc/b/a/a/f/b/k;

    invoke-interface {p0, p1}, Lc/b/a/a/f/b/e;->Q(Lc/b/a/a/f/b/k;)V

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lc/b/a/a/d/a/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    sget-object p4, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lc/b/a/a/d/a/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    invoke-interface {p0, p1, p2}, Lc/b/a/a/f/b/e;->x(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lc/b/a/a/d/a/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-interface {p0, p1}, Lc/b/a/a/f/b/e;->u(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    :cond_3
    sget-object p1, Lcom/google/android/gms/common/api/Status;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lc/b/a/a/d/a/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/common/api/Status;

    invoke-interface {p0, p1}, Lc/b/a/a/f/b/e;->q0(Lcom/google/android/gms/common/api/Status;)V

    goto :goto_0

    :cond_4
    sget-object p1, Lc/b/a/a/b/a;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p1}, Lc/b/a/a/d/a/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lc/b/a/a/b/a;

    sget-object p4, Lc/b/a/a/f/b/b;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-static {p2, p4}, Lc/b/a/a/d/a/c;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Lc/b/a/a/f/b/b;

    invoke-interface {p0, p1, p2}, Lc/b/a/a/f/b/e;->a0(Lc/b/a/a/b/a;Lc/b/a/a/f/b/b;)V

    :goto_0
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    const/4 p1, 0x1

    return p1
.end method
