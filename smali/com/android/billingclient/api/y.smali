.class final Lcom/android/billingclient/api/y;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/android/billingclient/api/z;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/android/billingclient/api/h;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/y;->a:Landroid/content/Context;

    new-instance p1, Lcom/android/billingclient/api/z;

    const/4 v0, 0x0

    invoke-direct {p1, p0, p2, v0}, Lcom/android/billingclient/api/z;-><init>(Lcom/android/billingclient/api/y;Lcom/android/billingclient/api/h;Lcom/android/billingclient/api/x;)V

    iput-object p1, p0, Lcom/android/billingclient/api/y;->b:Lcom/android/billingclient/api/z;

    return-void
.end method

.method static synthetic a(Lcom/android/billingclient/api/y;)Lcom/android/billingclient/api/z;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/y;->b:Lcom/android/billingclient/api/z;

    return-object p0
.end method


# virtual methods
.method final b()V
    .locals 4

    iget-object v0, p0, Lcom/android/billingclient/api/y;->b:Lcom/android/billingclient/api/z;

    iget-object v1, p0, Lcom/android/billingclient/api/y;->a:Landroid/content/Context;

    new-instance v2, Landroid/content/IntentFilter;

    const-string v3, "com.android.vending.billing.PURCHASES_UPDATED"

    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/android/billingclient/api/z;->c(Landroid/content/Context;Landroid/content/IntentFilter;)V

    return-void
.end method

.method final c()Lcom/android/billingclient/api/h;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/y;->b:Lcom/android/billingclient/api/z;

    invoke-static {v0}, Lcom/android/billingclient/api/z;->a(Lcom/android/billingclient/api/z;)Lcom/android/billingclient/api/h;

    move-result-object v0

    return-object v0
.end method

.method final d()V
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/y;->b:Lcom/android/billingclient/api/z;

    iget-object v1, p0, Lcom/android/billingclient/api/y;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/android/billingclient/api/z;->b(Landroid/content/Context;)V

    return-void
.end method
