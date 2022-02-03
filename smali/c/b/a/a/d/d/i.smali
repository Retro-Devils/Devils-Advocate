.class public final Lc/b/a/a/d/d/i;
.super Lc/b/a/a/d/d/a;
.source ""

# interfaces
.implements Lc/b/a/a/d/d/h;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.gms.safetynet.internal.ISafetyNetService"

    invoke-direct {p0, p1, v0}, Lc/b/a/a/d/d/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final p0(Lc/b/a/a/d/d/f;[BLjava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lc/b/a/a/d/d/a;->i()Landroid/os/Parcel;

    move-result-object v0

    invoke-static {v0, p1}, Lc/b/a/a/d/d/c;->b(Landroid/os/Parcel;Landroid/os/IInterface;)V

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    invoke-virtual {v0, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    const/4 p1, 0x7

    invoke-virtual {p0, p1, v0}, Lc/b/a/a/d/d/a;->j(ILandroid/os/Parcel;)V

    return-void
.end method
