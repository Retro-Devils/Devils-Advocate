.class public final Lc/b/a/c/a/f/l;
.super Lc/b/a/c/a/f/n;
.source ""

# interfaces
.implements Lc/b/a/c/a/f/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/b/a/c/a/f/n<",
        "Lc/b/a/c/a/f/i;",
        ">;",
        "Lc/b/a/c/a/f/d;"
    }
.end annotation


# instance fields
.field private final l:Ljava/lang/String;

.field private final m:Ljava/lang/String;

.field private final n:Ljava/lang/String;

.field private o:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc/b/a/c/a/f/p$a;Lc/b/a/c/a/f/p$b;)V
    .locals 0

    invoke-direct {p0, p1, p5, p6}, Lc/b/a/c/a/f/n;-><init>(Landroid/content/Context;Lc/b/a/c/a/f/p$a;Lc/b/a/c/a/f/p$b;)V

    invoke-static {p2}, Lc/b/a/c/a/f/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lc/b/a/c/a/f/l;->l:Ljava/lang/String;

    const-string p1, "callingPackage cannot be null or empty"

    invoke-static {p3, p1}, Lc/b/a/c/a/f/b;->c(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lc/b/a/c/a/f/l;->m:Ljava/lang/String;

    const-string p1, "callingAppVersion cannot be null or empty"

    invoke-static {p4, p1}, Lc/b/a/c/a/f/b;->c(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lc/b/a/c/a/f/l;->n:Ljava/lang/String;

    return-void
.end method

.method private final y()V
    .locals 2

    invoke-virtual {p0}, Lc/b/a/c/a/f/n;->w()V

    iget-boolean v0, p0, Lc/b/a/c/a/f/l;->o:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Connection client has been released"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()Landroid/os/IBinder;
    .locals 2

    invoke-direct {p0}, Lc/b/a/c/a/f/l;->y()V

    :try_start_0
    invoke-virtual {p0}, Lc/b/a/c/a/f/n;->x()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lc/b/a/c/a/f/i;

    invoke-interface {v0}, Lc/b/a/c/a/f/i;->a()Landroid/os/IBinder;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final b(Z)V
    .locals 1

    invoke-virtual {p0}, Lc/b/a/c/a/f/n;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lc/b/a/c/a/f/n;->x()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lc/b/a/c/a/f/i;

    invoke-interface {v0, p1}, Lc/b/a/c/a/f/i;->b(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lc/b/a/c/a/f/l;->o:Z

    :cond_0
    return-void
.end method

.method protected final synthetic d(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 0

    invoke-static {p1}, Lc/b/a/c/a/f/i$a;->i(Landroid/os/IBinder;)Lc/b/a/c/a/f/i;

    move-result-object p1

    return-object p1
.end method

.method protected final j(Lc/b/a/c/a/f/h;Lc/b/a/c/a/f/n$e;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/c/a/f/h;",
            "Lc/b/a/c/a/f/n$e;",
            ")V"
        }
    .end annotation

    iget-object v3, p0, Lc/b/a/c/a/f/l;->m:Ljava/lang/String;

    iget-object v4, p0, Lc/b/a/c/a/f/l;->n:Ljava/lang/String;

    iget-object v5, p0, Lc/b/a/c/a/f/l;->l:Ljava/lang/String;

    const/16 v2, 0x4b2

    const/4 v6, 0x0

    move-object v0, p1

    move-object v1, p2

    invoke-interface/range {v0 .. v6}, Lc/b/a/c/a/f/h;->p(Lc/b/a/c/a/f/e;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final k()V
    .locals 1

    iget-boolean v0, p0, Lc/b/a/c/a/f/l;->o:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lc/b/a/c/a/f/l;->b(Z)V

    :cond_0
    invoke-super {p0}, Lc/b/a/c/a/f/n;->k()V

    return-void
.end method

.method protected final m()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.youtube.player.internal.IYouTubeService"

    return-object v0
.end method

.method protected final p()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.youtube.api.service.START"

    return-object v0
.end method
