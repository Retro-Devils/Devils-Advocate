.class final Lcom/android/billingclient/api/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/android/billingclient/api/g;

.field private final synthetic c:Lcom/android/billingclient/api/d$a;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/d$a;Lcom/android/billingclient/api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/p;->c:Lcom/android/billingclient/api/d$a;

    iput-object p2, p0, Lcom/android/billingclient/api/p;->b:Lcom/android/billingclient/api/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/android/billingclient/api/p;->c:Lcom/android/billingclient/api/d$a;

    invoke-static {v0}, Lcom/android/billingclient/api/d$a;->a(Lcom/android/billingclient/api/d$a;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/p;->c:Lcom/android/billingclient/api/d$a;

    invoke-static {v1}, Lcom/android/billingclient/api/d$a;->e(Lcom/android/billingclient/api/d$a;)Lcom/android/billingclient/api/e;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/android/billingclient/api/p;->c:Lcom/android/billingclient/api/d$a;

    invoke-static {v1}, Lcom/android/billingclient/api/d$a;->e(Lcom/android/billingclient/api/d$a;)Lcom/android/billingclient/api/e;

    move-result-object v1

    iget-object v2, p0, Lcom/android/billingclient/api/p;->b:Lcom/android/billingclient/api/g;

    invoke-interface {v1, v2}, Lcom/android/billingclient/api/e;->b(Lcom/android/billingclient/api/g;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
