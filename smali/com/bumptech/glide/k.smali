.class public Lcom/bumptech/glide/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements Lcom/bumptech/glide/o/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/k$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/content/ComponentCallbacks2;",
        "Lcom/bumptech/glide/o/i;"
    }
.end annotation


# static fields
.field private static final b:Lcom/bumptech/glide/r/f;

.field private static final c:Lcom/bumptech/glide/r/f;

.field private static final d:Lcom/bumptech/glide/r/f;


# instance fields
.field protected final e:Lcom/bumptech/glide/c;

.field protected final f:Landroid/content/Context;

.field final g:Lcom/bumptech/glide/o/h;

.field private final h:Lcom/bumptech/glide/o/n;

.field private final i:Lcom/bumptech/glide/o/m;

.field private final j:Lcom/bumptech/glide/o/p;

.field private final k:Ljava/lang/Runnable;

.field private final l:Landroid/os/Handler;

.field private final m:Lcom/bumptech/glide/o/c;

.field private final n:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/bumptech/glide/r/e<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private o:Lcom/bumptech/glide/r/f;

.field private p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/bumptech/glide/r/f;->e0(Ljava/lang/Class;)Lcom/bumptech/glide/r/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/r/a;->K()Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/r/f;

    sput-object v0, Lcom/bumptech/glide/k;->b:Lcom/bumptech/glide/r/f;

    const-class v0, Lcom/bumptech/glide/load/q/h/c;

    invoke-static {v0}, Lcom/bumptech/glide/r/f;->e0(Ljava/lang/Class;)Lcom/bumptech/glide/r/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/r/a;->K()Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/r/f;

    sput-object v0, Lcom/bumptech/glide/k;->c:Lcom/bumptech/glide/r/f;

    sget-object v0, Lcom/bumptech/glide/load/o/j;->c:Lcom/bumptech/glide/load/o/j;

    invoke-static {v0}, Lcom/bumptech/glide/r/f;->f0(Lcom/bumptech/glide/load/o/j;)Lcom/bumptech/glide/r/f;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/g;->e:Lcom/bumptech/glide/g;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/r/a;->R(Lcom/bumptech/glide/g;)Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/r/f;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/r/a;->Y(Z)Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/r/f;

    sput-object v0, Lcom/bumptech/glide/k;->d:Lcom/bumptech/glide/r/f;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/c;Lcom/bumptech/glide/o/h;Lcom/bumptech/glide/o/m;Landroid/content/Context;)V
    .locals 7

    new-instance v4, Lcom/bumptech/glide/o/n;

    invoke-direct {v4}, Lcom/bumptech/glide/o/n;-><init>()V

    invoke-virtual {p1}, Lcom/bumptech/glide/c;->g()Lcom/bumptech/glide/o/d;

    move-result-object v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/bumptech/glide/k;-><init>(Lcom/bumptech/glide/c;Lcom/bumptech/glide/o/h;Lcom/bumptech/glide/o/m;Lcom/bumptech/glide/o/n;Lcom/bumptech/glide/o/d;Landroid/content/Context;)V

    return-void
.end method

.method constructor <init>(Lcom/bumptech/glide/c;Lcom/bumptech/glide/o/h;Lcom/bumptech/glide/o/m;Lcom/bumptech/glide/o/n;Lcom/bumptech/glide/o/d;Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/bumptech/glide/o/p;

    invoke-direct {v0}, Lcom/bumptech/glide/o/p;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/k;->j:Lcom/bumptech/glide/o/p;

    new-instance v0, Lcom/bumptech/glide/k$a;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/k$a;-><init>(Lcom/bumptech/glide/k;)V

    iput-object v0, p0, Lcom/bumptech/glide/k;->k:Ljava/lang/Runnable;

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lcom/bumptech/glide/k;->l:Landroid/os/Handler;

    iput-object p1, p0, Lcom/bumptech/glide/k;->e:Lcom/bumptech/glide/c;

    iput-object p2, p0, Lcom/bumptech/glide/k;->g:Lcom/bumptech/glide/o/h;

    iput-object p3, p0, Lcom/bumptech/glide/k;->i:Lcom/bumptech/glide/o/m;

    iput-object p4, p0, Lcom/bumptech/glide/k;->h:Lcom/bumptech/glide/o/n;

    iput-object p6, p0, Lcom/bumptech/glide/k;->f:Landroid/content/Context;

    invoke-virtual {p6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    new-instance p6, Lcom/bumptech/glide/k$b;

    invoke-direct {p6, p0, p4}, Lcom/bumptech/glide/k$b;-><init>(Lcom/bumptech/glide/k;Lcom/bumptech/glide/o/n;)V

    invoke-interface {p5, p3, p6}, Lcom/bumptech/glide/o/d;->a(Landroid/content/Context;Lcom/bumptech/glide/o/c$a;)Lcom/bumptech/glide/o/c;

    move-result-object p3

    iput-object p3, p0, Lcom/bumptech/glide/k;->m:Lcom/bumptech/glide/o/c;

    invoke-static {}, Lcom/bumptech/glide/t/k;->o()Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-interface {p2, p0}, Lcom/bumptech/glide/o/h;->a(Lcom/bumptech/glide/o/i;)V

    :goto_0
    invoke-interface {p2, p3}, Lcom/bumptech/glide/o/h;->a(Lcom/bumptech/glide/o/i;)V

    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Lcom/bumptech/glide/c;->i()Lcom/bumptech/glide/e;

    move-result-object p3

    invoke-virtual {p3}, Lcom/bumptech/glide/e;->c()Ljava/util/List;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p2, p0, Lcom/bumptech/glide/k;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Lcom/bumptech/glide/c;->i()Lcom/bumptech/glide/e;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bumptech/glide/e;->d()Lcom/bumptech/glide/r/f;

    move-result-object p2

    invoke-virtual {p0, p2}, Lcom/bumptech/glide/k;->A(Lcom/bumptech/glide/r/f;)V

    invoke-virtual {p1, p0}, Lcom/bumptech/glide/c;->o(Lcom/bumptech/glide/k;)V

    return-void
.end method

.method private D(Lcom/bumptech/glide/r/j/h;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/r/j/h<",
            "*>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/k;->C(Lcom/bumptech/glide/r/j/h;)Z

    move-result v0

    invoke-interface {p1}, Lcom/bumptech/glide/r/j/h;->g()Lcom/bumptech/glide/r/c;

    move-result-object v1

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/k;->e:Lcom/bumptech/glide/c;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/c;->p(Lcom/bumptech/glide/r/j/h;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/bumptech/glide/r/j/h;->j(Lcom/bumptech/glide/r/c;)V

    invoke-interface {v1}, Lcom/bumptech/glide/r/c;->clear()V

    :cond_0
    return-void
.end method


# virtual methods
.method protected declared-synchronized A(Lcom/bumptech/glide/r/f;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Lcom/bumptech/glide/r/a;->c()Lcom/bumptech/glide/r/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/r/f;

    invoke-virtual {p1}, Lcom/bumptech/glide/r/a;->b()Lcom/bumptech/glide/r/a;

    move-result-object p1

    check-cast p1, Lcom/bumptech/glide/r/f;

    iput-object p1, p0, Lcom/bumptech/glide/k;->o:Lcom/bumptech/glide/r/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized B(Lcom/bumptech/glide/r/j/h;Lcom/bumptech/glide/r/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/r/j/h<",
            "*>;",
            "Lcom/bumptech/glide/r/c;",
            ")V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/k;->j:Lcom/bumptech/glide/o/p;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/o/p;->n(Lcom/bumptech/glide/r/j/h;)V

    iget-object p1, p0, Lcom/bumptech/glide/k;->h:Lcom/bumptech/glide/o/n;

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/o/n;->g(Lcom/bumptech/glide/r/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method declared-synchronized C(Lcom/bumptech/glide/r/j/h;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/r/j/h<",
            "*>;)Z"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-interface {p1}, Lcom/bumptech/glide/r/j/h;->g()Lcom/bumptech/glide/r/c;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v2, p0, Lcom/bumptech/glide/k;->h:Lcom/bumptech/glide/o/n;

    invoke-virtual {v2, v0}, Lcom/bumptech/glide/o/n;->a(Lcom/bumptech/glide/r/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bumptech/glide/k;->j:Lcom/bumptech/glide/o/p;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/o/p;->o(Lcom/bumptech/glide/r/j/h;)V

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/bumptech/glide/r/j/h;->j(Lcom/bumptech/glide/r/c;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v1

    :cond_1
    const/4 p1, 0x0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/bumptech/glide/k;->z()V

    iget-object v0, p0, Lcom/bumptech/glide/k;->j:Lcom/bumptech/glide/o/p;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/p;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized f()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/bumptech/glide/k;->y()V

    iget-object v0, p0, Lcom/bumptech/glide/k;->j:Lcom/bumptech/glide/o/p;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/p;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized k()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/k;->j:Lcom/bumptech/glide/o/p;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/p;->k()V

    iget-object v0, p0, Lcom/bumptech/glide/k;->j:Lcom/bumptech/glide/o/p;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/p;->m()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/r/j/h;

    invoke-virtual {p0, v1}, Lcom/bumptech/glide/k;->o(Lcom/bumptech/glide/r/j/h;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/k;->j:Lcom/bumptech/glide/o/p;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/p;->l()V

    iget-object v0, p0, Lcom/bumptech/glide/k;->h:Lcom/bumptech/glide/o/n;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/n;->b()V

    iget-object v0, p0, Lcom/bumptech/glide/k;->g:Lcom/bumptech/glide/o/h;

    invoke-interface {v0, p0}, Lcom/bumptech/glide/o/h;->b(Lcom/bumptech/glide/o/i;)V

    iget-object v0, p0, Lcom/bumptech/glide/k;->g:Lcom/bumptech/glide/o/h;

    iget-object v1, p0, Lcom/bumptech/glide/k;->m:Lcom/bumptech/glide/o/c;

    invoke-interface {v0, v1}, Lcom/bumptech/glide/o/h;->b(Lcom/bumptech/glide/o/i;)V

    iget-object v0, p0, Lcom/bumptech/glide/k;->l:Landroid/os/Handler;

    iget-object v1, p0, Lcom/bumptech/glide/k;->k:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/bumptech/glide/k;->e:Lcom/bumptech/glide/c;

    invoke-virtual {v0, p0}, Lcom/bumptech/glide/c;->s(Lcom/bumptech/glide/k;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public l(Ljava/lang/Class;)Lcom/bumptech/glide/j;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResourceType:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TResourceType;>;)",
            "Lcom/bumptech/glide/j<",
            "TResourceType;>;"
        }
    .end annotation

    new-instance v0, Lcom/bumptech/glide/j;

    iget-object v1, p0, Lcom/bumptech/glide/k;->e:Lcom/bumptech/glide/c;

    iget-object v2, p0, Lcom/bumptech/glide/k;->f:Landroid/content/Context;

    invoke-direct {v0, v1, p0, p1, v2}, Lcom/bumptech/glide/j;-><init>(Lcom/bumptech/glide/c;Lcom/bumptech/glide/k;Ljava/lang/Class;Landroid/content/Context;)V

    return-object v0
.end method

.method public m()Lcom/bumptech/glide/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/j<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const-class v0, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/k;->l(Ljava/lang/Class;)Lcom/bumptech/glide/j;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/k;->b:Lcom/bumptech/glide/r/f;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/j;->f0(Lcom/bumptech/glide/r/a;)Lcom/bumptech/glide/j;

    move-result-object v0

    return-object v0
.end method

.method public n()Lcom/bumptech/glide/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/j<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    const-class v0, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v0}, Lcom/bumptech/glide/k;->l(Ljava/lang/Class;)Lcom/bumptech/glide/j;

    move-result-object v0

    return-object v0
.end method

.method public o(Lcom/bumptech/glide/r/j/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/r/j/h<",
            "*>;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/bumptech/glide/k;->D(Lcom/bumptech/glide/r/j/h;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public onLowMemory()V
    .locals 0

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 1

    const/16 v0, 0x3c

    if-ne p1, v0, :cond_0

    iget-boolean p1, p0, Lcom/bumptech/glide/k;->p:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/k;->x()V

    :cond_0
    return-void
.end method

.method p()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/r/e<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/k;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object v0
.end method

.method declared-synchronized q()Lcom/bumptech/glide/r/f;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/k;->o:Lcom/bumptech/glide/r/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method r(Ljava/lang/Class;)Lcom/bumptech/glide/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/bumptech/glide/l<",
            "*TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/k;->e:Lcom/bumptech/glide/c;

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->i()Lcom/bumptech/glide/e;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/e;->e(Ljava/lang/Class;)Lcom/bumptech/glide/l;

    move-result-object p1

    return-object p1
.end method

.method public s(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            ")",
            "Lcom/bumptech/glide/j<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bumptech/glide/k;->n()Lcom/bumptech/glide/j;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/j;->r0(Landroid/graphics/drawable/Drawable;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1
.end method

.method public t(Ljava/io/File;)Lcom/bumptech/glide/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            ")",
            "Lcom/bumptech/glide/j<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bumptech/glide/k;->n()Lcom/bumptech/glide/j;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/j;->s0(Ljava/io/File;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized toString()Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{tracker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bumptech/glide/k;->h:Lcom/bumptech/glide/o/n;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", treeNode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bumptech/glide/k;->i:Lcom/bumptech/glide/o/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public u(Ljava/lang/Integer;)Lcom/bumptech/glide/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            ")",
            "Lcom/bumptech/glide/j<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bumptech/glide/k;->n()Lcom/bumptech/glide/j;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/j;->t0(Ljava/lang/Integer;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1
.end method

.method public v(Ljava/lang/String;)Lcom/bumptech/glide/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/bumptech/glide/j<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/bumptech/glide/k;->n()Lcom/bumptech/glide/j;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/j;->v0(Ljava/lang/String;)Lcom/bumptech/glide/j;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized w()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/k;->h:Lcom/bumptech/glide/o/n;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/n;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized x()V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/bumptech/glide/k;->w()V

    iget-object v0, p0, Lcom/bumptech/glide/k;->i:Lcom/bumptech/glide/o/m;

    invoke-interface {v0}, Lcom/bumptech/glide/o/m;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/k;

    invoke-virtual {v1}, Lcom/bumptech/glide/k;->w()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public declared-synchronized y()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/k;->h:Lcom/bumptech/glide/o/n;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/n;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized z()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/k;->h:Lcom/bumptech/glide/o/n;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/n;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
