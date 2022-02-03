.class public Lc/a/a/c;
.super Ljava/lang/Thread;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/a/c$b;
    }
.end annotation


# static fields
.field private static final b:Z


# instance fields
.field private final c:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lc/a/a/n<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lc/a/a/n<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final e:Lc/a/a/b;

.field private final f:Lc/a/a/q;

.field private volatile g:Z

.field private final h:Lc/a/a/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-boolean v0, Lc/a/a/v;->b:Z

    sput-boolean v0, Lc/a/a/c;->b:Z

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lc/a/a/b;Lc/a/a/q;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue<",
            "Lc/a/a/n<",
            "*>;>;",
            "Ljava/util/concurrent/BlockingQueue<",
            "Lc/a/a/n<",
            "*>;>;",
            "Lc/a/a/b;",
            "Lc/a/a/q;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc/a/a/c;->g:Z

    iput-object p1, p0, Lc/a/a/c;->c:Ljava/util/concurrent/BlockingQueue;

    iput-object p2, p0, Lc/a/a/c;->d:Ljava/util/concurrent/BlockingQueue;

    iput-object p3, p0, Lc/a/a/c;->e:Lc/a/a/b;

    iput-object p4, p0, Lc/a/a/c;->f:Lc/a/a/q;

    new-instance p1, Lc/a/a/c$b;

    invoke-direct {p1, p0}, Lc/a/a/c$b;-><init>(Lc/a/a/c;)V

    iput-object p1, p0, Lc/a/a/c;->h:Lc/a/a/c$b;

    return-void
.end method

.method static synthetic a(Lc/a/a/c;)Ljava/util/concurrent/BlockingQueue;
    .locals 0

    iget-object p0, p0, Lc/a/a/c;->d:Ljava/util/concurrent/BlockingQueue;

    return-object p0
.end method

.method static synthetic b(Lc/a/a/c;)Lc/a/a/q;
    .locals 0

    iget-object p0, p0, Lc/a/a/c;->f:Lc/a/a/q;

    return-object p0
.end method

.method private c()V
    .locals 1

    iget-object v0, p0, Lc/a/a/c;->c:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc/a/a/n;

    invoke-virtual {p0, v0}, Lc/a/a/c;->d(Lc/a/a/n;)V

    return-void
.end method


# virtual methods
.method d(Lc/a/a/n;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/n<",
            "*>;)V"
        }
    .end annotation

    const-string v0, "cache-queue-take"

    invoke-virtual {p1, v0}, Lc/a/a/n;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lc/a/a/n;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "cache-discard-canceled"

    invoke-virtual {p1, v0}, Lc/a/a/n;->h(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lc/a/a/c;->e:Lc/a/a/b;

    invoke-virtual {p1}, Lc/a/a/n;->l()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lc/a/a/b;->c(Ljava/lang/String;)Lc/a/a/b$a;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "cache-miss"

    invoke-virtual {p1, v0}, Lc/a/a/n;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lc/a/a/c;->h:Lc/a/a/c$b;

    invoke-static {v0, p1}, Lc/a/a/c$b;->c(Lc/a/a/c$b;Lc/a/a/n;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/a/a/c;->d:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {v0}, Lc/a/a/b$a;->a()Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "cache-hit-expired"

    invoke-virtual {p1, v1}, Lc/a/a/n;->b(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lc/a/a/n;->G(Lc/a/a/b$a;)Lc/a/a/n;

    iget-object v0, p0, Lc/a/a/c;->h:Lc/a/a/c$b;

    invoke-static {v0, p1}, Lc/a/a/c$b;->c(Lc/a/a/c$b;Lc/a/a/n;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lc/a/a/c;->d:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0, p1}, Ljava/util/concurrent/BlockingQueue;->put(Ljava/lang/Object;)V

    :cond_3
    return-void

    :cond_4
    const-string v1, "cache-hit"

    invoke-virtual {p1, v1}, Lc/a/a/n;->b(Ljava/lang/String;)V

    new-instance v1, Lc/a/a/k;

    iget-object v2, v0, Lc/a/a/b$a;->a:[B

    iget-object v3, v0, Lc/a/a/b$a;->g:Ljava/util/Map;

    invoke-direct {v1, v2, v3}, Lc/a/a/k;-><init>([BLjava/util/Map;)V

    invoke-virtual {p1, v1}, Lc/a/a/n;->F(Lc/a/a/k;)Lc/a/a/p;

    move-result-object v1

    const-string v2, "cache-hit-parsed"

    invoke-virtual {p1, v2}, Lc/a/a/n;->b(Ljava/lang/String;)V

    invoke-virtual {v0}, Lc/a/a/b$a;->b()Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    iget-object v0, p0, Lc/a/a/c;->f:Lc/a/a/q;

    invoke-interface {v0, p1, v1}, Lc/a/a/q;->b(Lc/a/a/n;Lc/a/a/p;)V

    goto :goto_0

    :cond_6
    const-string v2, "cache-hit-refresh-needed"

    invoke-virtual {p1, v2}, Lc/a/a/n;->b(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lc/a/a/n;->G(Lc/a/a/b$a;)Lc/a/a/n;

    const/4 v0, 0x1

    iput-boolean v0, v1, Lc/a/a/p;->d:Z

    iget-object v0, p0, Lc/a/a/c;->h:Lc/a/a/c$b;

    invoke-static {v0, p1}, Lc/a/a/c$b;->c(Lc/a/a/c$b;Lc/a/a/n;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lc/a/a/c;->f:Lc/a/a/q;

    new-instance v2, Lc/a/a/c$a;

    invoke-direct {v2, p0, p1}, Lc/a/a/c$a;-><init>(Lc/a/a/c;Lc/a/a/n;)V

    invoke-interface {v0, p1, v1, v2}, Lc/a/a/q;->c(Lc/a/a/n;Lc/a/a/p;Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public e()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc/a/a/c;->g:Z

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public run()V
    .locals 3

    sget-boolean v0, Lc/a/a/c;->b:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "start new dispatcher"

    invoke-static {v2, v0}, Lc/a/a/v;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    iget-object v0, p0, Lc/a/a/c;->e:Lc/a/a/b;

    invoke-interface {v0}, Lc/a/a/b;->a()V

    :goto_0
    :try_start_0
    invoke-direct {p0}, Lc/a/a/c;->c()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-boolean v0, p0, Lc/a/a/c;->g:Z

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    return-void

    :cond_1
    new-array v0, v1, [Ljava/lang/Object;

    const-string v2, "Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it"

    invoke-static {v2, v0}, Lc/a/a/v;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
