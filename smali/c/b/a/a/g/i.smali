.class final Lc/b/a/a/g/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/a/g/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lc/b/a/a/g/k<",
        "TTResult;>;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/lang/Object;

.field private c:Lc/b/a/a/g/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/g/b<",
            "-TTResult;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "mLock"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lc/b/a/a/g/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Lc/b/a/a/g/b<",
            "-TTResult;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lc/b/a/a/g/i;->b:Ljava/lang/Object;

    iput-object p1, p0, Lc/b/a/a/g/i;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lc/b/a/a/g/i;->c:Lc/b/a/a/g/b;

    return-void
.end method

.method static synthetic b(Lc/b/a/a/g/i;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lc/b/a/a/g/i;->b:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic c(Lc/b/a/a/g/i;)Lc/b/a/a/g/b;
    .locals 0

    iget-object p0, p0, Lc/b/a/a/g/i;->c:Lc/b/a/a/g/b;

    return-object p0
.end method


# virtual methods
.method public final a(Lc/b/a/a/g/d;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/b/a/a/g/d<",
            "TTResult;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lc/b/a/a/g/d;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc/b/a/a/g/i;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc/b/a/a/g/i;->c:Lc/b/a/a/g/b;

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lc/b/a/a/g/i;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lc/b/a/a/g/j;

    invoke-direct {v1, p0, p1}, Lc/b/a/a/g/j;-><init>(Lc/b/a/a/g/i;Lc/b/a/a/g/d;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-void
.end method
