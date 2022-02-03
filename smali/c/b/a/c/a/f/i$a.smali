.class public abstract Lc/b/a/c/a/f/i$a;
.super Landroid/os/Binder;
.source ""

# interfaces
.implements Lc/b/a/c/a/f/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/a/c/a/f/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/b/a/c/a/f/i$a$a;
    }
.end annotation


# direct methods
.method public static i(Landroid/os/IBinder;)Lc/b/a/c/a/f/i;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.youtube.player.internal.IYouTubeService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1

    instance-of v1, v0, Lc/b/a/c/a/f/i;

    if-eqz v1, :cond_1

    check-cast v0, Lc/b/a/c/a/f/i;

    return-object v0

    :cond_1
    new-instance v0, Lc/b/a/c/a/f/i$a$a;

    invoke-direct {v0, p0}, Lc/b/a/c/a/f/i$a$a;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
