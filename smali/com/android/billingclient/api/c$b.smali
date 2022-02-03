.class Lcom/android/billingclient/api/c$b;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/android/billingclient/api/k;

.field private b:Z

.field final synthetic c:Lcom/android/billingclient/api/c;


# direct methods
.method private constructor <init>(Lcom/android/billingclient/api/c;Lcom/android/billingclient/api/k;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/c$b;->c:Lcom/android/billingclient/api/c;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    iput-object p2, p0, Lcom/android/billingclient/api/c$b;->a:Lcom/android/billingclient/api/k;

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/billingclient/api/c;Lcom/android/billingclient/api/k;Lcom/android/billingclient/api/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/android/billingclient/api/c$b;-><init>(Lcom/android/billingclient/api/c;Lcom/android/billingclient/api/k;)V

    return-void
.end method

.method static synthetic a(Lcom/android/billingclient/api/c$b;)Lcom/android/billingclient/api/k;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/c$b;->a:Lcom/android/billingclient/api/k;

    return-object p0
.end method


# virtual methods
.method public b(Landroid/content/Context;Landroid/content/IntentFilter;)V
    .locals 1

    iget-boolean v0, p0, Lcom/android/billingclient/api/c$b;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/c$b;->c:Lcom/android/billingclient/api/c;

    invoke-static {v0}, Lcom/android/billingclient/api/c;->a(Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/c$b;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/android/billingclient/api/c$b;->b:Z

    :cond_0
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 1

    iget-boolean v0, p0, Lcom/android/billingclient/api/c$b;->b:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/c$b;->c:Lcom/android/billingclient/api/c;

    invoke-static {v0}, Lcom/android/billingclient/api/c;->a(Lcom/android/billingclient/api/c;)Lcom/android/billingclient/api/c$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/android/billingclient/api/c$b;->b:Z

    goto :goto_0

    :cond_0
    const-string p1, "BillingBroadcastManager"

    const-string v0, "Receiver is not registered."

    invoke-static {p1, v0}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string p1, "BillingBroadcastManager"

    invoke-static {p2, p1}, Lc/a/a/a/a;->g(Landroid/content/Intent;Ljava/lang/String;)Lcom/android/billingclient/api/h;

    move-result-object p1

    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p2

    invoke-static {p2}, Lc/a/a/a/a;->f(Landroid/os/Bundle;)Ljava/util/List;

    move-result-object p2

    iget-object v0, p0, Lcom/android/billingclient/api/c$b;->a:Lcom/android/billingclient/api/k;

    invoke-interface {v0, p1, p2}, Lcom/android/billingclient/api/k;->a(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-void
.end method
