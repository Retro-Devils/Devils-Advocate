.class final Lcom/android/billingclient/api/d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Z

.field private c:Lcom/android/billingclient/api/e;

.field final synthetic d:Lcom/android/billingclient/api/d;


# direct methods
.method private constructor <init>(Lcom/android/billingclient/api/d;Lcom/android/billingclient/api/e;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/d$a;->a:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/android/billingclient/api/d$a;->b:Z

    iput-object p2, p0, Lcom/android/billingclient/api/d$a;->c:Lcom/android/billingclient/api/e;

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/billingclient/api/d;Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/c0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/d$a;-><init>(Lcom/android/billingclient/api/d;Lcom/android/billingclient/api/e;)V

    return-void
.end method

.method static synthetic a(Lcom/android/billingclient/api/d$a;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/d$a;->a:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic c(Lcom/android/billingclient/api/d$a;Lcom/android/billingclient/api/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/d$a;->d(Lcom/android/billingclient/api/g;)V

    return-void
.end method

.method private final d(Lcom/android/billingclient/api/g;)V
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    new-instance v1, Lcom/android/billingclient/api/p;

    invoke-direct {v1, p0, p1}, Lcom/android/billingclient/api/p;-><init>(Lcom/android/billingclient/api/d$a;Lcom/android/billingclient/api/g;)V

    invoke-static {v0, v1}, Lcom/android/billingclient/api/d;->s(Lcom/android/billingclient/api/d;Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic e(Lcom/android/billingclient/api/d$a;)Lcom/android/billingclient/api/e;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/d$a;->c:Lcom/android/billingclient/api/e;

    return-object p0
.end method

.method static synthetic f(Lcom/android/billingclient/api/d$a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/android/billingclient/api/d$a;->b:Z

    return p0
.end method


# virtual methods
.method final b()V
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/d$a;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Lcom/android/billingclient/api/d$a;->c:Lcom/android/billingclient/api/e;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/android/billingclient/api/d$a;->b:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    const-string p1, "BillingClient"

    const-string v0, "Billing service connected."

    invoke-static {p1, v0}, Lc/b/a/a/d/c/b;->h(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    invoke-static {p2}, Lc/b/a/a/d/c/d;->i(Landroid/os/IBinder;)Lc/b/a/a/d/c/a;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/android/billingclient/api/d;->o(Lcom/android/billingclient/api/d;Lc/b/a/a/d/c/a;)Lc/b/a/a/d/c/a;

    iget-object p1, p0, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    new-instance p2, Lcom/android/billingclient/api/r;

    invoke-direct {p2, p0}, Lcom/android/billingclient/api/r;-><init>(Lcom/android/billingclient/api/d$a;)V

    new-instance v0, Lcom/android/billingclient/api/q;

    invoke-direct {v0, p0}, Lcom/android/billingclient/api/q;-><init>(Lcom/android/billingclient/api/d$a;)V

    const-wide/16 v1, 0x7530

    invoke-static {p1, p2, v1, v2, v0}, Lcom/android/billingclient/api/d;->q(Lcom/android/billingclient/api/d;Ljava/util/concurrent/Callable;JLjava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    invoke-static {p1}, Lcom/android/billingclient/api/d;->E(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/g;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/d$a;->d(Lcom/android/billingclient/api/g;)V

    :cond_0
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "BillingClient"

    const-string v0, "Billing service disconnected."

    invoke-static {p1, v0}, Lc/b/a/a/d/c/b;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/billingclient/api/d;->o(Lcom/android/billingclient/api/d;Lc/b/a/a/d/c/a;)Lc/b/a/a/d/c/a;

    iget-object p1, p0, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/billingclient/api/d;->j(Lcom/android/billingclient/api/d;I)I

    iget-object p1, p0, Lcom/android/billingclient/api/d$a;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/d$a;->c:Lcom/android/billingclient/api/e;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/android/billingclient/api/e;->a()V

    :cond_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method
