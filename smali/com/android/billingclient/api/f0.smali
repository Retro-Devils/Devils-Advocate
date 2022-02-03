.class final Lcom/android/billingclient/api/f0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/android/billingclient/api/a;

.field final synthetic b:Lcom/android/billingclient/api/b;

.field private final synthetic c:Lcom/android/billingclient/api/d;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/d;Lcom/android/billingclient/api/a;Lcom/android/billingclient/api/b;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/f0;->c:Lcom/android/billingclient/api/d;

    iput-object p2, p0, Lcom/android/billingclient/api/f0;->a:Lcom/android/billingclient/api/a;

    iput-object p3, p0, Lcom/android/billingclient/api/f0;->b:Lcom/android/billingclient/api/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Ljava/lang/Void;
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/f0;->c:Lcom/android/billingclient/api/d;

    invoke-static {v1}, Lcom/android/billingclient/api/d;->z(Lcom/android/billingclient/api/d;)Lc/b/a/a/d/c/a;

    move-result-object v1

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/android/billingclient/api/f0;->c:Lcom/android/billingclient/api/d;

    invoke-static {v3}, Lcom/android/billingclient/api/d;->v(Lcom/android/billingclient/api/d;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/android/billingclient/api/f0;->a:Lcom/android/billingclient/api/a;

    invoke-virtual {v4}, Lcom/android/billingclient/api/a;->a()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/android/billingclient/api/f0;->a:Lcom/android/billingclient/api/a;

    iget-object v6, p0, Lcom/android/billingclient/api/f0;->c:Lcom/android/billingclient/api/d;

    invoke-static {v6}, Lcom/android/billingclient/api/d;->B(Lcom/android/billingclient/api/d;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lc/b/a/a/d/c/b;->c(Lcom/android/billingclient/api/a;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    invoke-interface {v1, v2, v3, v4, v5}, Lc/b/a/a/d/c/a;->i0(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "BillingClient"

    invoke-static {v1, v2}, Lc/b/a/a/d/c/b;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v3

    invoke-static {v1, v2}, Lc/b/a/a/d/c/b;->j(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/android/billingclient/api/f0;->c:Lcom/android/billingclient/api/d;

    new-instance v4, Lcom/android/billingclient/api/g0;

    invoke-direct {v4, p0, v3, v1}, Lcom/android/billingclient/api/g0;-><init>(Lcom/android/billingclient/api/f0;ILjava/lang/String;)V

    invoke-static {v2, v4}, Lcom/android/billingclient/api/d;->s(Lcom/android/billingclient/api/d;Ljava/lang/Runnable;)V

    return-object v0

    :catch_0
    move-exception v1

    iget-object v2, p0, Lcom/android/billingclient/api/f0;->c:Lcom/android/billingclient/api/d;

    new-instance v3, Lcom/android/billingclient/api/h0;

    invoke-direct {v3, p0, v1}, Lcom/android/billingclient/api/h0;-><init>(Lcom/android/billingclient/api/f0;Ljava/lang/Exception;)V

    invoke-static {v2, v3}, Lcom/android/billingclient/api/d;->s(Lcom/android/billingclient/api/d;Ljava/lang/Runnable;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lcom/android/billingclient/api/f0;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
