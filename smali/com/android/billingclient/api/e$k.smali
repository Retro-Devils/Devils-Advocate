.class final Lcom/android/billingclient/api/e$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "k"
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Z

.field private c:Lcom/android/billingclient/api/f;

.field final synthetic d:Lcom/android/billingclient/api/e;


# direct methods
.method private constructor <init>(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/f;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/e$k;->d:Lcom/android/billingclient/api/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/e$k;->a:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e$k;->b:Z

    iput-object p2, p0, Lcom/android/billingclient/api/e$k;->c:Lcom/android/billingclient/api/f;

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/f;Lcom/android/billingclient/api/e$e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/e$k;-><init>(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/f;)V

    return-void
.end method

.method static synthetic a(Lcom/android/billingclient/api/e$k;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/e$k;->a:Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic b(Lcom/android/billingclient/api/e$k;)Lcom/android/billingclient/api/f;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/e$k;->c:Lcom/android/billingclient/api/f;

    return-object p0
.end method

.method static synthetic c(Lcom/android/billingclient/api/e$k;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/android/billingclient/api/e$k;->b:Z

    return p0
.end method

.method static synthetic d(Lcom/android/billingclient/api/e$k;Lcom/android/billingclient/api/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/e$k;->f(Lcom/android/billingclient/api/h;)V

    return-void
.end method

.method private f(Lcom/android/billingclient/api/h;)V
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/e$k;->d:Lcom/android/billingclient/api/e;

    new-instance v1, Lcom/android/billingclient/api/e$k$a;

    invoke-direct {v1, p0, p1}, Lcom/android/billingclient/api/e$k$a;-><init>(Lcom/android/billingclient/api/e$k;Lcom/android/billingclient/api/h;)V

    invoke-static {v0, v1}, Lcom/android/billingclient/api/e;->w(Lcom/android/billingclient/api/e;Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method e()V
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/e$k;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Lcom/android/billingclient/api/e$k;->c:Lcom/android/billingclient/api/f;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/android/billingclient/api/e$k;->b:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    const-string p1, "BillingClient"

    const-string v0, "Billing service connected."

    invoke-static {p1, v0}, Lc/a/a/a/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/e$k;->d:Lcom/android/billingclient/api/e;

    invoke-static {p2}, Lc/a/b/a/a$a;->i(Landroid/os/IBinder;)Lc/a/b/a/a;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/android/billingclient/api/e;->u(Lcom/android/billingclient/api/e;Lc/a/b/a/a;)Lc/a/b/a/a;

    iget-object p1, p0, Lcom/android/billingclient/api/e$k;->d:Lcom/android/billingclient/api/e;

    new-instance p2, Lcom/android/billingclient/api/e$k$b;

    invoke-direct {p2, p0}, Lcom/android/billingclient/api/e$k$b;-><init>(Lcom/android/billingclient/api/e$k;)V

    new-instance v0, Lcom/android/billingclient/api/e$k$c;

    invoke-direct {v0, p0}, Lcom/android/billingclient/api/e$k$c;-><init>(Lcom/android/billingclient/api/e$k;)V

    const-wide/16 v1, 0x7530

    invoke-static {p1, p2, v1, v2, v0}, Lcom/android/billingclient/api/e;->r(Lcom/android/billingclient/api/e;Ljava/util/concurrent/Callable;JLjava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/android/billingclient/api/e$k;->d:Lcom/android/billingclient/api/e;

    invoke-static {p1}, Lcom/android/billingclient/api/e;->s(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/e$k;->f(Lcom/android/billingclient/api/h;)V

    :cond_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "BillingClient"

    const-string v0, "Billing service disconnected."

    invoke-static {p1, v0}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/e$k;->d:Lcom/android/billingclient/api/e;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/billingclient/api/e;->u(Lcom/android/billingclient/api/e;Lc/a/b/a/a;)Lc/a/b/a/a;

    iget-object p1, p0, Lcom/android/billingclient/api/e$k;->d:Lcom/android/billingclient/api/e;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/billingclient/api/e;->k(Lcom/android/billingclient/api/e;I)I

    iget-object p1, p0, Lcom/android/billingclient/api/e$k;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/e$k;->c:Lcom/android/billingclient/api/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/android/billingclient/api/f;->a()V

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
