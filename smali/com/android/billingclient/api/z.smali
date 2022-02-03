.class final Lcom/android/billingclient/api/z;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field private final a:Lcom/android/billingclient/api/h;

.field private b:Z

.field private final synthetic c:Lcom/android/billingclient/api/y;


# direct methods
.method private constructor <init>(Lcom/android/billingclient/api/y;Lcom/android/billingclient/api/h;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/z;->c:Lcom/android/billingclient/api/y;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p2, p0, Lcom/android/billingclient/api/z;->a:Lcom/android/billingclient/api/h;

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/billingclient/api/y;Lcom/android/billingclient/api/h;Lcom/android/billingclient/api/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/z;-><init>(Lcom/android/billingclient/api/y;Lcom/android/billingclient/api/h;)V

    return-void
.end method

.method static synthetic a(Lcom/android/billingclient/api/z;)Lcom/android/billingclient/api/h;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/z;->a:Lcom/android/billingclient/api/h;

    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/Context;)V
    .locals 1

    iget-boolean v0, p0, Lcom/android/billingclient/api/z;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/z;->c:Lcom/android/billingclient/api/y;

    invoke-static {v0}, Lcom/android/billingclient/api/y;->a(Lcom/android/billingclient/api/y;)Lcom/android/billingclient/api/z;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/android/billingclient/api/z;->b:Z

    return-void

    :cond_0
    const-string p1, "BillingBroadcastManager"

    const-string v0, "Receiver is not registered."

    invoke-static {p1, v0}, Lc/b/a/a/d/c/b;->k(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final c(Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 1

    iget-boolean v0, p0, Lcom/android/billingclient/api/z;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/z;->c:Lcom/android/billingclient/api/y;

    invoke-static {v0}, Lcom/android/billingclient/api/y;->a(Lcom/android/billingclient/api/y;)Lcom/android/billingclient/api/z;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/android/billingclient/api/z;->b:Z

    :cond_0
    return-void
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string p1, "BillingBroadcastManager"

    invoke-static {p2, p1}, Lc/b/a/a/d/c/b;->i(Landroid/content/Intent;Ljava/lang/String;)Lcom/android/billingclient/api/g;

    move-result-object p1

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    invoke-static {p2}, Lc/b/a/a/d/c/b;->g(Landroid/os/Bundle;)Ljava/util/List;

    move-result-object p2

    iget-object v0, p0, Lcom/android/billingclient/api/z;->a:Lcom/android/billingclient/api/h;

    invoke-interface {v0, p1, p2}, Lcom/android/billingclient/api/h;->a(Lcom/android/billingclient/api/g;Ljava/util/List;)V

    return-void
.end method
