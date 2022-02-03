.class Lcom/android/billingclient/api/e$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/billingclient/api/e;->a(Lcom/android/billingclient/api/a;Lcom/android/billingclient/api/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/android/billingclient/api/a;

.field final synthetic b:Lcom/android/billingclient/api/b;

.field final synthetic c:Lcom/android/billingclient/api/e;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/a;Lcom/android/billingclient/api/b;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/e$c;->c:Lcom/android/billingclient/api/e;

    iput-object p2, p0, Lcom/android/billingclient/api/e$c;->a:Lcom/android/billingclient/api/a;

    iput-object p3, p0, Lcom/android/billingclient/api/e$c;->b:Lcom/android/billingclient/api/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/e$c;->c:Lcom/android/billingclient/api/e;

    invoke-static {v1}, Lcom/android/billingclient/api/e;->t(Lcom/android/billingclient/api/e;)Lc/a/b/a/a;

    move-result-object v1

    const/16 v2, 0x9

    iget-object v3, p0, Lcom/android/billingclient/api/e$c;->c:Lcom/android/billingclient/api/e;

    invoke-static {v3}, Lcom/android/billingclient/api/e;->p(Lcom/android/billingclient/api/e;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/android/billingclient/api/e$c;->a:Lcom/android/billingclient/api/a;

    invoke-virtual {v4}, Lcom/android/billingclient/api/a;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/android/billingclient/api/e$c;->a:Lcom/android/billingclient/api/a;

    iget-object v6, p0, Lcom/android/billingclient/api/e$c;->c:Lcom/android/billingclient/api/e;

    invoke-static {v6}, Lcom/android/billingclient/api/e;->j(Lcom/android/billingclient/api/e;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lc/a/a/a/a;->a(Lcom/android/billingclient/api/a;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v5

    invoke-interface {v1, v2, v3, v4, v5}, Lc/a/b/a/a;->H(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "BillingClient"

    invoke-static {v1, v2}, Lc/a/a/a/a;->i(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v3

    invoke-static {v1, v2}, Lc/a/a/a/a;->h(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/android/billingclient/api/e$c;->c:Lcom/android/billingclient/api/e;

    new-instance v4, Lcom/android/billingclient/api/e$c$b;

    invoke-direct {v4, p0, v3, v1}, Lcom/android/billingclient/api/e$c$b;-><init>(Lcom/android/billingclient/api/e$c;ILjava/lang/String;)V

    invoke-static {v2, v4}, Lcom/android/billingclient/api/e;->w(Lcom/android/billingclient/api/e;Ljava/lang/Runnable;)V

    return-object v0

    :catch_0
    move-exception v1

    iget-object v2, p0, Lcom/android/billingclient/api/e$c;->c:Lcom/android/billingclient/api/e;

    new-instance v3, Lcom/android/billingclient/api/e$c$a;

    invoke-direct {v3, p0, v1}, Lcom/android/billingclient/api/e$c$a;-><init>(Lcom/android/billingclient/api/e$c;Ljava/lang/Exception;)V

    invoke-static {v2, v3}, Lcom/android/billingclient/api/e;->w(Lcom/android/billingclient/api/e;Ljava/lang/Runnable;)V

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/android/billingclient/api/e$c;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
