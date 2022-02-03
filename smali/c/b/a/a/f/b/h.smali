.class public final Lc/b/a/a/f/b/h;
.super Lc/b/a/a/d/a/a;
.source ""

# interfaces
.implements Lc/b/a/a/f/b/g;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.signin.internal.ISignInService"

    invoke-direct {p0, p1, v0}, Lc/b/a/a/d/a/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final V(Lc/b/a/a/f/b/i;Lc/b/a/a/f/b/e;)V
    .locals 1

    invoke-virtual {p0}, Lc/b/a/a/d/a/a;->i()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lc/b/a/a/d/a/c;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p2}, Lc/b/a/a/d/a/c;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 p1, 0xc

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/d/a/a;->j(ILandroid/os/Parcel;)V

    return-void
.end method
