.class final Lc/b/a/a/g/n;
.super Lc/b/a/a/g/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Lc/b/a/a/g/d<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lc/b/a/a/g/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/g/l<",
            "TTResult;>;"
        }
    .end annotation
.end field

.field private c:Z
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private volatile d:Z

.field private e:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TTResult;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field

.field private f:Ljava/lang/Exception;
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lc/b/a/a/g/d;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lc/b/a/a/g/n;->a:Ljava/lang/Object;

    new-instance v0, Lc/b/a/a/g/l;

    invoke-direct {v0}, Lc/b/a/a/g/l;-><init>()V

    iput-object v0, p0, Lc/b/a/a/g/n;->b:Lc/b/a/a/g/l;

    return-void
.end method

.method private final m()V
    .locals 2
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget-boolean v0, p0, Lc/b/a/a/g/n;->c:Z

    const-string v1, "Task is not yet complete"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/r;->k(ZLjava/lang/Object;)V

    return-void
.end method

.method private final n()V
    .locals 2
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget-boolean v0, p0, Lc/b/a/a/g/n;->c:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Task is already complete"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/r;->k(ZLjava/lang/Object;)V

    return-void
.end method

.method private final o()V
    .locals 2
    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation

    iget-boolean v0, p0, Lc/b/a/a/g/n;->d:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task is already canceled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final p()V
    .locals 2

    iget-object v0, p0, Lc/b/a/a/g/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lc/b/a/a/g/n;->c:Z

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lc/b/a/a/g/n;->b:Lc/b/a/a/g/l;

    invoke-virtual {v0, p0}, Lc/b/a/a/g/l;->a(Lc/b/a/a/g/d;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public final a(Lc/b/a/a/g/a;)Lc/b/a/a/g/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/g/a;",
            ")",
            "Lc/b/a/a/g/d<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lc/b/a/a/g/f;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lc/b/a/a/g/d;->b(Ljava/util/concurrent/Executor;Lc/b/a/a/g/a;)Lc/b/a/a/g/d;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/util/concurrent/Executor;Lc/b/a/a/g/a;)Lc/b/a/a/g/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lc/b/a/a/g/a;",
            ")",
            "Lc/b/a/a/g/d<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/g/n;->b:Lc/b/a/a/g/l;

    new-instance v1, Lc/b/a/a/g/g;

    invoke-direct {v1, p1, p2}, Lc/b/a/a/g/g;-><init>(Ljava/util/concurrent/Executor;Lc/b/a/a/g/a;)V

    invoke-virtual {v0, v1}, Lc/b/a/a/g/l;->b(Lc/b/a/a/g/k;)V

    invoke-direct {p0}, Lc/b/a/a/g/n;->p()V

    return-object p0
.end method

.method public final c(Lc/b/a/a/g/b;)Lc/b/a/a/g/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/g/b<",
            "-TTResult;>;)",
            "Lc/b/a/a/g/d<",
            "TTResult;>;"
        }
    .end annotation

    sget-object v0, Lc/b/a/a/g/f;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Lc/b/a/a/g/d;->d(Ljava/util/concurrent/Executor;Lc/b/a/a/g/b;)Lc/b/a/a/g/d;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/util/concurrent/Executor;Lc/b/a/a/g/b;)Lc/b/a/a/g/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lc/b/a/a/g/b<",
            "-TTResult;>;)",
            "Lc/b/a/a/g/d<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/g/n;->b:Lc/b/a/a/g/l;

    new-instance v1, Lc/b/a/a/g/i;

    invoke-direct {v1, p1, p2}, Lc/b/a/a/g/i;-><init>(Ljava/util/concurrent/Executor;Lc/b/a/a/g/b;)V

    invoke-virtual {v0, v1}, Lc/b/a/a/g/l;->b(Lc/b/a/a/g/k;)V

    invoke-direct {p0}, Lc/b/a/a/g/n;->p()V

    return-object p0
.end method

.method public final e()Ljava/lang/Exception;
    .locals 2

    iget-object v0, p0, Lc/b/a/a/g/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc/b/a/a/g/n;->f:Ljava/lang/Exception;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final f()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TTResult;"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/g/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lc/b/a/a/g/n;->m()V

    invoke-direct {p0}, Lc/b/a/a/g/n;->o()V

    iget-object v1, p0, Lc/b/a/a/g/n;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    iget-object v1, p0, Lc/b/a/a/g/n;->e:Ljava/lang/Object;

    monitor-exit v0

    return-object v1

    :cond_0
    new-instance v1, Lc/b/a/a/g/c;

    iget-object v2, p0, Lc/b/a/a/g/n;->f:Ljava/lang/Exception;

    invoke-direct {v1, v2}, Lc/b/a/a/g/c;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lc/b/a/a/g/n;->d:Z

    return v0
.end method

.method public final h()Z
    .locals 2

    iget-object v0, p0, Lc/b/a/a/g/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lc/b/a/a/g/n;->c:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lc/b/a/a/g/n;->d:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lc/b/a/a/g/n;->f:Ljava/lang/Exception;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final i(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc/b/a/a/g/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lc/b/a/a/g/n;->n()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lc/b/a/a/g/n;->c:Z

    iput-object p1, p0, Lc/b/a/a/g/n;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lc/b/a/a/g/n;->b:Lc/b/a/a/g/l;

    invoke-virtual {p1, p0}, Lc/b/a/a/g/l;->a(Lc/b/a/a/g/d;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final j(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/g/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lc/b/a/a/g/n;->n()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lc/b/a/a/g/n;->c:Z

    iput-object p1, p0, Lc/b/a/a/g/n;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lc/b/a/a/g/n;->b:Lc/b/a/a/g/l;

    invoke-virtual {p1, p0}, Lc/b/a/a/g/l;->a(Lc/b/a/a/g/d;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final k(Ljava/lang/Exception;)Z
    .locals 2

    const-string v0, "Exception must not be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/r;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lc/b/a/a/g/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lc/b/a/a/g/n;->c:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    monitor-exit v0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lc/b/a/a/g/n;->c:Z

    iput-object p1, p0, Lc/b/a/a/g/n;->f:Ljava/lang/Exception;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lc/b/a/a/g/n;->b:Lc/b/a/a/g/l;

    invoke-virtual {p1, p0}, Lc/b/a/a/g/l;->a(Lc/b/a/a/g/d;)V

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final l(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/g/n;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lc/b/a/a/g/n;->c:Z

    if-eqz v1, :cond_0

    const/4 p1, 0x0

    monitor-exit v0

    return p1

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lc/b/a/a/g/n;->c:Z

    iput-object p1, p0, Lc/b/a/a/g/n;->e:Ljava/lang/Object;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lc/b/a/a/g/n;->b:Lc/b/a/a/g/l;

    invoke-virtual {p1, p0}, Lc/b/a/a/g/l;->a(Lc/b/a/a/g/d;)V

    return v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
