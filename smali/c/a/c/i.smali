.class public Lc/a/c/i;
.super Ljava/lang/Thread;
.source ""


# instance fields
.field private final b:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lc/a/c/n<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final c:Lc/a/c/h;

.field private final d:Lc/a/c/b;

.field private final e:Lc/a/c/q;

.field private volatile f:Z


# direct methods
.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Lc/a/c/h;Lc/a/c/b;Lc/a/c/q;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue<",
            "Lc/a/c/n<",
            "*>;>;",
            "Lc/a/c/h;",
            "Lc/a/c/b;",
            "Lc/a/c/q;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc/a/c/i;->f:Z

    iput-object p1, p0, Lc/a/c/i;->b:Ljava/util/concurrent/BlockingQueue;

    iput-object p2, p0, Lc/a/c/i;->c:Lc/a/c/h;

    iput-object p3, p0, Lc/a/c/i;->d:Lc/a/c/b;

    iput-object p4, p0, Lc/a/c/i;->e:Lc/a/c/q;

    return-void
.end method

.method private a(Lc/a/c/n;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/c/n<",
            "*>;)V"
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lc/a/c/n;->x()I

    move-result p1

    invoke-static {p1}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    :cond_0
    return-void
.end method

.method private b(Lc/a/c/n;Lc/a/c/u;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/c/n<",
            "*>;",
            "Lc/a/c/u;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1, p2}, Lc/a/c/n;->E(Lc/a/c/u;)Lc/a/c/u;

    move-result-object p2

    iget-object v0, p0, Lc/a/c/i;->e:Lc/a/c/q;

    invoke-interface {v0, p1, p2}, Lc/a/c/q;->a(Lc/a/c/n;Lc/a/c/u;)V

    return-void
.end method

.method private c()V
    .locals 1

    iget-object v0, p0, Lc/a/c/i;->b:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/c/n;

    invoke-virtual {p0, v0}, Lc/a/c/i;->d(Lc/a/c/n;)V

    return-void
.end method


# virtual methods
.method d(Lc/a/c/n;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/c/n<",
            "*>;)V"
        }
    .end annotation

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    :try_start_0
    const-string v2, "network-queue-take"

    invoke-virtual {p1, v2}, Lc/a/c/n;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lc/a/c/n;->A()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "network-discard-cancelled"

    invoke-virtual {p1, v2}, Lc/a/c/n;->h(Ljava/lang/String;)V

    invoke-virtual {p1}, Lc/a/c/n;->C()V

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lc/a/c/i;->a(Lc/a/c/n;)V

    iget-object v2, p0, Lc/a/c/i;->c:Lc/a/c/h;

    invoke-interface {v2, p1}, Lc/a/c/h;->a(Lc/a/c/n;)Lc/a/c/k;

    move-result-object v2

    const-string v3, "network-http-complete"

    invoke-virtual {p1, v3}, Lc/a/c/n;->b(Ljava/lang/String;)V

    iget-boolean v3, v2, Lc/a/c/k;->e:Z

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Lc/a/c/n;->z()Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v2, "not-modified"

    invoke-virtual {p1, v2}, Lc/a/c/n;->h(Ljava/lang/String;)V

    invoke-virtual {p1}, Lc/a/c/n;->C()V

    return-void

    :cond_1
    invoke-virtual {p1, v2}, Lc/a/c/n;->F(Lc/a/c/k;)Lc/a/c/p;

    move-result-object v2

    const-string v3, "network-parse-complete"

    invoke-virtual {p1, v3}, Lc/a/c/n;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lc/a/c/n;->M()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, v2, Lc/a/c/p;->b:Lc/a/c/b$a;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lc/a/c/i;->d:Lc/a/c/b;

    invoke-virtual {p1}, Lc/a/c/n;->l()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, Lc/a/c/p;->b:Lc/a/c/b$a;

    invoke-interface {v3, v4, v5}, Lc/a/c/b;->b(Ljava/lang/String;Lc/a/c/b$a;)V

    const-string v3, "network-cache-written"

    invoke-virtual {p1, v3}, Lc/a/c/n;->b(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, Lc/a/c/n;->B()V

    iget-object v3, p0, Lc/a/c/i;->e:Lc/a/c/q;

    invoke-interface {v3, p1, v2}, Lc/a/c/q;->b(Lc/a/c/n;Lc/a/c/p;)V

    invoke-virtual {p1, v2}, Lc/a/c/n;->D(Lc/a/c/p;)V
    :try_end_0
    .catch Lc/a/c/u; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    const-string v4, "Unhandled exception %s"

    invoke-static {v2, v4, v3}, Lc/a/c/v;->d(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v3, Lc/a/c/u;

    invoke-direct {v3, v2}, Lc/a/c/u;-><init>(Ljava/lang/Throwable;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v4, v0

    invoke-virtual {v3, v4, v5}, Lc/a/c/u;->a(J)V

    iget-object v0, p0, Lc/a/c/i;->e:Lc/a/c/q;

    invoke-interface {v0, p1, v3}, Lc/a/c/q;->a(Lc/a/c/n;Lc/a/c/u;)V

    goto :goto_0

    :catch_1
    move-exception v2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v3

    sub-long/2addr v3, v0

    invoke-virtual {v2, v3, v4}, Lc/a/c/u;->a(J)V

    invoke-direct {p0, p1, v2}, Lc/a/c/i;->b(Lc/a/c/n;Lc/a/c/u;)V

    :goto_0
    invoke-virtual {p1}, Lc/a/c/n;->C()V

    :goto_1
    return-void
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc/a/c/i;->f:Z

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public run()V
    .locals 2

    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    :goto_0
    :try_start_0
    invoke-direct {p0}, Lc/a/c/i;->c()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-boolean v0, p0, Lc/a/c/i;->f:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void

    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it"

    invoke-static {v1, v0}, Lc/a/c/v;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
