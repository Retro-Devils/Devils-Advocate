.class public abstract Lc/b/a/a/d/c/d;
.super Lc/b/a/a/d/c/e;
.source ""

# interfaces
.implements Lc/b/a/a/d/c/a;


# direct methods
.method public static i(Landroid/os/IBinder;)Lc/b/a/a/d/c/a;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.android.vending.billing.IInAppBillingService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lc/b/a/a/d/c/a;

    if-eqz v1, :cond_1

    check-cast v0, Lc/b/a/a/d/c/a;

    return-object v0

    :cond_1
    new-instance v0, Lc/b/a/a/d/c/c;

    invoke-direct {v0, p0}, Lc/b/a/a/d/c/c;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
