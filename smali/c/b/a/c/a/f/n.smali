.class public abstract Lc/b/a/c/a/f/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/c/a/f/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/b/a/c/a/f/n$e;,
        Lc/b/a/c/a/f/n$d;,
        Lc/b/a/c/a/f/n$c;,
        Lc/b/a/c/a/f/n$b;,
        Lc/b/a/c/a/f/n$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/os/IInterface;",
        ">",
        "Ljava/lang/Object;",
        "Lc/b/a/c/a/f/p;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field final b:Landroid/os/Handler;

.field private c:Landroid/os/IInterface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/b/a/c/a/f/p$a;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/b/a/c/a/f/p$a;",
            ">;"
        }
    .end annotation
.end field

.field private f:Z

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/b/a/c/a/f/p$b;",
            ">;"
        }
    .end annotation
.end field

.field private h:Z

.field private final i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lc/b/a/c/a/f/n$c<",
            "*>;>;"
        }
    .end annotation
.end field

.field private j:Landroid/content/ServiceConnection;

.field private k:Z


# direct methods
.method protected constructor <init>(Landroid/content/Context;Lc/b/a/c/a/f/p$a;Lc/b/a/c/a/f/p$b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lc/b/a/c/a/f/n;->e:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc/b/a/c/a/f/n;->f:Z

    iput-boolean v0, p0, Lc/b/a/c/a/f/n;->h:Z

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lc/b/a/c/a/f/n;->i:Ljava/util/ArrayList;

    iput-boolean v0, p0, Lc/b/a/c/a/f/n;->k:Z

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lc/b/a/c/a/f/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lc/b/a/c/a/f/n;->a:Landroid/content/Context;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lc/b/a/c/a/f/n;->d:Ljava/util/ArrayList;

    invoke-static {p2}, Lc/b/a/c/a/f/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lc/b/a/c/a/f/n;->g:Ljava/util/ArrayList;

    invoke-static {p3}, Lc/b/a/c/a/f/b;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lc/b/a/c/a/f/n$b;

    invoke-direct {p1, p0}, Lc/b/a/c/a/f/n$b;-><init>(Lc/b/a/c/a/f/n;)V

    iput-object p1, p0, Lc/b/a/c/a/f/n;->b:Landroid/os/Handler;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Clients must be created on the UI thread."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic e(Lc/b/a/c/a/f/n;Landroid/os/IInterface;)Landroid/os/IInterface;
    .locals 0

    iput-object p1, p0, Lc/b/a/c/a/f/n;->c:Landroid/os/IInterface;

    return-object p1
.end method

.method static synthetic f(Ljava/lang/String;)Lc/b/a/c/a/b;
    .locals 0

    invoke-static {p0}, Lc/b/a/c/a/f/n;->l(Ljava/lang/String;)Lc/b/a/c/a/b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic g(Lc/b/a/c/a/f/n;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lc/b/a/c/a/f/n;->d:Ljava/util/ArrayList;

    return-object p0
.end method

.method private h()V
    .locals 3

    iget-object v0, p0, Lc/b/a/c/a/f/n;->j:Landroid/content/ServiceConnection;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Lc/b/a/c/a/f/n;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "YouTubeClient"

    const-string v2, "Unexpected error from unbindService()"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lc/b/a/c/a/f/n;->c:Landroid/os/IInterface;

    iput-object v0, p0, Lc/b/a/c/a/f/n;->j:Landroid/content/ServiceConnection;

    return-void
.end method

.method private static l(Ljava/lang/String;)Lc/b/a/c/a/b;
    .locals 0

    :try_start_0
    invoke-static {p0}, Lc/b/a/c/a/b;->valueOf(Ljava/lang/String;)Lc/b/a/c/a/b;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    sget-object p0, Lc/b/a/c/a/b;->d:Lc/b/a/c/a/b;

    return-object p0

    :catch_1
    sget-object p0, Lc/b/a/c/a/b;->d:Lc/b/a/c/a/b;

    return-object p0
.end method

.method static synthetic o(Lc/b/a/c/a/f/n;)Z
    .locals 0

    iget-boolean p0, p0, Lc/b/a/c/a/f/n;->k:Z

    return p0
.end method

.method static synthetic q(Lc/b/a/c/a/f/n;)Ljava/util/ArrayList;
    .locals 0

    iget-object p0, p0, Lc/b/a/c/a/f/n;->i:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic r(Lc/b/a/c/a/f/n;)Landroid/os/IInterface;
    .locals 0

    iget-object p0, p0, Lc/b/a/c/a/f/n;->c:Landroid/os/IInterface;

    return-object p0
.end method

.method static synthetic s(Lc/b/a/c/a/f/n;)V
    .locals 0

    invoke-direct {p0}, Lc/b/a/c/a/f/n;->h()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc/b/a/c/a/f/n;->k:Z

    iget-object v0, p0, Lc/b/a/c/a/f/n;->a:Landroid/content/Context;

    invoke-static {v0}, Lc/b/a/c/a/a;->b(Landroid/content/Context;)Lc/b/a/c/a/b;

    move-result-object v0

    sget-object v1, Lc/b/a/c/a/b;->b:Lc/b/a/c/a/b;

    const/4 v2, 0x3

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lc/b/a/c/a/f/n;->b:Landroid/os/Handler;

    invoke-virtual {v1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lc/b/a/c/a/f/n;->p()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lc/b/a/c/a/f/n;->a:Landroid/content/Context;

    invoke-static {v1}, Lc/b/a/c/a/f/v;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    iget-object v1, p0, Lc/b/a/c/a/f/n;->j:Landroid/content/ServiceConnection;

    if-eqz v1, :cond_1

    const-string v1, "YouTubeClient"

    const-string v3, "Calling connect() while still connected, missing disconnect()."

    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-direct {p0}, Lc/b/a/c/a/f/n;->h()V

    :cond_1
    new-instance v1, Lc/b/a/c/a/f/n$f;

    invoke-direct {v1, p0}, Lc/b/a/c/a/f/n$f;-><init>(Lc/b/a/c/a/f/n;)V

    iput-object v1, p0, Lc/b/a/c/a/f/n;->j:Landroid/content/ServiceConnection;

    iget-object v3, p0, Lc/b/a/c/a/f/n;->a:Landroid/content/Context;

    const/16 v4, 0x81

    invoke-virtual {v3, v0, v1, v4}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lc/b/a/c/a/f/n;->b:Landroid/os/Handler;

    sget-object v1, Lc/b/a/c/a/b;->i:Lc/b/a/c/a/b;

    invoke-virtual {v0, v2, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    :cond_2
    return-void
.end method

.method protected abstract d(Landroid/os/IBinder;)Landroid/os/IInterface;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/IBinder;",
            ")TT;"
        }
    .end annotation
.end method

.method protected final i(Lc/b/a/c/a/b;)V
    .locals 7

    iget-object v0, p0, Lc/b/a/c/a/f/n;->b:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lc/b/a/c/a/f/n;->g:Ljava/util/ArrayList;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lc/b/a/c/a/f/n;->h:Z

    iget-object v1, p0, Lc/b/a/c/a/f/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_2

    iget-boolean v5, p0, Lc/b/a/c/a/f/n;->k:Z

    if-nez v5, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iget-object v5, p0, Lc/b/a/c/a/f/n;->g:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc/b/a/c/a/f/p$b;

    invoke-interface {v5, p1}, Lc/b/a/c/a/f/p$b;->a(Lc/b/a/c/a/b;)V

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    iput-boolean v3, p0, Lc/b/a/c/a/f/n;->h:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method protected abstract j(Lc/b/a/c/a/f/h;Lc/b/a/c/a/f/n$e;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/c/a/f/h;",
            "Lc/b/a/c/a/f/n$e;",
            ")V"
        }
    .end annotation
.end method

.method public k()V
    .locals 4

    invoke-virtual {p0}, Lc/b/a/c/a/f/n;->v()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc/b/a/c/a/f/n;->k:Z

    iget-object v1, p0, Lc/b/a/c/a/f/n;->i:Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lc/b/a/c/a/f/n;->i:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    :goto_0
    if-ge v0, v2, :cond_0

    iget-object v3, p0, Lc/b/a/c/a/f/n;->i:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc/b/a/c/a/f/n$c;

    invoke-virtual {v3}, Lc/b/a/c/a/f/n$c;->c()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/b/a/c/a/f/n;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Lc/b/a/c/a/f/n;->h()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method protected abstract m()Ljava/lang/String;
.end method

.method protected final n(Landroid/os/IBinder;)V
    .locals 1

    :try_start_0
    invoke-static {p1}, Lc/b/a/c/a/f/h$a;->i(Landroid/os/IBinder;)Lc/b/a/c/a/f/h;

    move-result-object p1

    new-instance v0, Lc/b/a/c/a/f/n$e;

    invoke-direct {v0, p0}, Lc/b/a/c/a/f/n$e;-><init>(Lc/b/a/c/a/f/n;)V

    invoke-virtual {p0, p1, v0}, Lc/b/a/c/a/f/n;->j(Lc/b/a/c/a/f/h;Lc/b/a/c/a/f/n$e;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string p1, "YouTubeClient"

    const-string v0, "service died"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method protected abstract p()Ljava/lang/String;
.end method

.method public final t()Z
    .locals 1

    iget-object v0, p0, Lc/b/a/c/a/f/n;->c:Landroid/os/IInterface;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method protected final u()V
    .locals 7

    iget-object v0, p0, Lc/b/a/c/a/f/n;->d:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lc/b/a/c/a/f/n;->f:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lc/b/a/c/a/f/b;->d(Z)V

    iget-object v1, p0, Lc/b/a/c/a/f/n;->b:Landroid/os/Handler;

    const/4 v4, 0x4

    invoke-virtual {v1, v4}, Landroid/os/Handler;->removeMessages(I)V

    iput-boolean v2, p0, Lc/b/a/c/a/f/n;->f:Z

    iget-object v1, p0, Lc/b/a/c/a/f/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-static {v2}, Lc/b/a/c/a/f/b;->d(Z)V

    iget-object v1, p0, Lc/b/a/c/a/f/n;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v4, 0x0

    :goto_2
    if-ge v4, v2, :cond_3

    iget-boolean v5, p0, Lc/b/a/c/a/f/n;->k:Z

    if-eqz v5, :cond_3

    invoke-virtual {p0}, Lc/b/a/c/a/f/n;->t()Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v5, p0, Lc/b/a/c/a/f/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc/b/a/c/a/f/p$a;

    invoke-interface {v5}, Lc/b/a/c/a/f/p$a;->a()V

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lc/b/a/c/a/f/n;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iput-boolean v3, p0, Lc/b/a/c/a/f/n;->f:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :goto_3
    throw v1

    :goto_4
    goto :goto_3
.end method

.method protected final v()V
    .locals 7

    iget-object v0, p0, Lc/b/a/c/a/f/n;->b:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    iget-object v0, p0, Lc/b/a/c/a/f/n;->d:Ljava/util/ArrayList;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lc/b/a/c/a/f/n;->f:Z

    iget-object v1, p0, Lc/b/a/c/a/f/n;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    iget-boolean v5, p0, Lc/b/a/c/a/f/n;->k:Z

    if-eqz v5, :cond_1

    iget-object v5, p0, Lc/b/a/c/a/f/n;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lc/b/a/c/a/f/p$a;

    invoke-interface {v5}, Lc/b/a/c/a/f/p$a;->c()V

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iput-boolean v3, p0, Lc/b/a/c/a/f/n;->f:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method

.method protected final w()V
    .locals 2

    invoke-virtual {p0}, Lc/b/a/c/a/f/n;->t()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not connected. Call connect() and wait for onConnected() to be called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final x()Landroid/os/IInterface;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lc/b/a/c/a/f/n;->w()V

    iget-object v0, p0, Lc/b/a/c/a/f/n;->c:Landroid/os/IInterface;

    return-object v0
.end method
