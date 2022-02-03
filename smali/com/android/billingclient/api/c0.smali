.class final Lcom/android/billingclient/api/c0;
.super Landroid/os/ResultReceiver;
.source ""


# instance fields
.field private final synthetic b:Lcom/android/billingclient/api/d;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/d;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/c0;->b:Lcom/android/billingclient/api/d;

    invoke-direct {p0, p2}, Landroid/os/ResultReceiver;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 4

    iget-object v0, p0, Lcom/android/billingclient/api/c0;->b:Lcom/android/billingclient/api/d;

    invoke-static {v0}, Lcom/android/billingclient/api/d;->n(Lcom/android/billingclient/api/d;)Lcom/android/billingclient/api/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/billingclient/api/y;->c()Lcom/android/billingclient/api/h;

    move-result-object v0

    const-string v1, "BillingClient"

    if-nez v0, :cond_0

    const-string p1, "PurchasesUpdatedListener is null - no way to return the response."

    invoke-static {v1, p1}, Lc/b/a/a/d/c/b;->k(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p2}, Lc/b/a/a/d/c/b;->g(Landroid/os/Bundle;)Ljava/util/List;

    move-result-object v2

    invoke-static {}, Lcom/android/billingclient/api/g;->b()Lcom/android/billingclient/api/g$a;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/android/billingclient/api/g$a;->c(I)Lcom/android/billingclient/api/g$a;

    move-result-object p1

    invoke-static {p2, v1}, Lc/b/a/a/d/c/b;->j(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/billingclient/api/g$a;->b(Ljava/lang/String;)Lcom/android/billingclient/api/g$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/g$a;->a()Lcom/android/billingclient/api/g;

    move-result-object p1

    invoke-interface {v0, p1, v2}, Lcom/android/billingclient/api/h;->a(Lcom/android/billingclient/api/g;Ljava/util/List;)V

    return-void
.end method
