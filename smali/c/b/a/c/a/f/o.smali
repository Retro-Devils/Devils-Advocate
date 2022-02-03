.class public final Lc/b/a/c/a/f/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/c/a/c;


# instance fields
.field private a:Lc/b/a/c/a/f/d;

.field private b:Lc/b/a/c/a/f/f;


# direct methods
.method public constructor <init>(Lc/b/a/c/a/f/d;Lc/b/a/c/a/f/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "connectionClient cannot be null"

    invoke-static {p1, v0}, Lc/b/a/c/a/f/b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/b/a/c/a/f/d;

    iput-object p1, p0, Lc/b/a/c/a/f/o;->a:Lc/b/a/c/a/f/d;

    const-string p1, "embeddedPlayer cannot be null"

    invoke-static {p2, p1}, Lc/b/a/c/a/f/b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc/b/a/c/a/f/f;

    iput-object p1, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lc/b/a/c/a/f/o;->i(Z)V

    return-void
.end method

.method public final b()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0}, Lc/b/a/c/a/f/f;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lc/b/a/c/a/f/m;

    invoke-direct {v1, v0}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lc/b/a/c/a/f/o;->p(Ljava/lang/String;I)V

    return-void
.end method

.method public final d()Z
    .locals 2

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0}, Lc/b/a/c/a/f/f;->f()Z

    move-result v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    new-instance v1, Lc/b/a/c/a/f/m;

    invoke-direct {v1, v0}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final e()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0}, Lc/b/a/c/a/f/f;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lc/b/a/c/a/f/m;

    invoke-direct {v1, v0}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final f(Lc/b/a/c/a/c$c;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    new-instance v1, Lc/b/a/c/a/f/o$a;

    invoke-direct {v1, p0, p1}, Lc/b/a/c/a/f/o$a;-><init>(Lc/b/a/c/a/f/o;Lc/b/a/c/a/c$c;)V

    invoke-interface {v0, v1}, Lc/b/a/c/a/f/f;->D(Lc/b/a/c/a/f/g;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lc/b/a/c/a/f/m;

    invoke-direct {v0, p1}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final g()Landroid/view/View;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0}, Lc/b/a/c/a/f/f;->T()Lc/b/a/c/a/f/q;

    move-result-object v0

    invoke-static {v0}, Lc/b/a/c/a/f/r;->m(Lc/b/a/c/a/f/q;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lc/b/a/c/a/f/m;

    invoke-direct {v1, v0}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final h(Landroid/content/res/Configuration;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0, p1}, Lc/b/a/c/a/f/f;->Y(Landroid/content/res/Configuration;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lc/b/a/c/a/f/m;

    invoke-direct {v0, p1}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final i(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0, p1}, Lc/b/a/c/a/f/f;->b(Z)V

    iget-object v0, p0, Lc/b/a/c/a/f/o;->a:Lc/b/a/c/a/f/d;

    invoke-interface {v0, p1}, Lc/b/a/c/a/f/d;->b(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object p1, p0, Lc/b/a/c/a/f/o;->a:Lc/b/a/c/a/f/d;

    invoke-interface {p1}, Lc/b/a/c/a/f/p;->k()V

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lc/b/a/c/a/f/m;

    invoke-direct {v0, p1}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final j(ILandroid/view/KeyEvent;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0, p1, p2}, Lc/b/a/c/a/f/f;->w(ILandroid/view/KeyEvent;)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance p2, Lc/b/a/c/a/f/m;

    invoke-direct {p2, p1}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public final k(Landroid/os/Bundle;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0, p1}, Lc/b/a/c/a/f/f;->P(Landroid/os/Bundle;)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance v0, Lc/b/a/c/a/f/m;

    invoke-direct {v0, p1}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final l()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0}, Lc/b/a/c/a/f/f;->g0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lc/b/a/c/a/f/m;

    invoke-direct {v1, v0}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final m(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0, p1}, Lc/b/a/c/a/f/f;->o0(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lc/b/a/c/a/f/m;

    invoke-direct {v0, p1}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final n(ILandroid/view/KeyEvent;)Z
    .locals 1

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0, p1, p2}, Lc/b/a/c/a/f/f;->m0(ILandroid/view/KeyEvent;)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    new-instance p2, Lc/b/a/c/a/f/m;

    invoke-direct {p2, p1}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public final o()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0}, Lc/b/a/c/a/f/f;->C()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lc/b/a/c/a/f/m;

    invoke-direct {v1, v0}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final p(Ljava/lang/String;I)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0, p1, p2}, Lc/b/a/c/a/f/f;->r(Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance p2, Lc/b/a/c/a/f/m;

    invoke-direct {p2, p1}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw p2
.end method

.method public final q()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0}, Lc/b/a/c/a/f/f;->c0()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lc/b/a/c/a/f/m;

    invoke-direct {v1, v0}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final r()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0}, Lc/b/a/c/a/f/f;->A()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lc/b/a/c/a/f/m;

    invoke-direct {v1, v0}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final s()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0}, Lc/b/a/c/a/f/f;->Z()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lc/b/a/c/a/f/m;

    invoke-direct {v1, v0}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final t()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0}, Lc/b/a/c/a/f/f;->K()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lc/b/a/c/a/f/m;

    invoke-direct {v1, v0}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final u()Landroid/os/Bundle;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lc/b/a/c/a/f/o;->b:Lc/b/a/c/a/f/f;

    invoke-interface {v0}, Lc/b/a/c/a/f/f;->v()Landroid/os/Bundle;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Lc/b/a/c/a/f/m;

    invoke-direct {v1, v0}, Lc/b/a/c/a/f/m;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method
