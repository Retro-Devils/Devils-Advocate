.class public final Lcom/android/billingclient/api/d$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private b:I

.field private c:I

.field private d:Z

.field private e:Lcom/android/billingclient/api/k;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/android/billingclient/api/d$b;->b:I

    iput v0, p0, Lcom/android/billingclient/api/d$b;->c:I

    iput-object p1, p0, Lcom/android/billingclient/api/d$b;->a:Landroid/content/Context;

    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lcom/android/billingclient/api/d$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/d$b;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/d;
    .locals 7

    iget-object v1, p0, Lcom/android/billingclient/api/d$b;->a:Landroid/content/Context;

    if-eqz v1, :cond_2

    iget-object v5, p0, Lcom/android/billingclient/api/d$b;->e:Lcom/android/billingclient/api/k;

    if-eqz v5, :cond_1

    iget-boolean v4, p0, Lcom/android/billingclient/api/d$b;->d:Z

    const/4 v0, 0x1

    if-ne v4, v0, :cond_0

    new-instance v6, Lcom/android/billingclient/api/e;

    iget v2, p0, Lcom/android/billingclient/api/d$b;->b:I

    iget v3, p0, Lcom/android/billingclient/api/d$b;->c:I

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/android/billingclient/api/e;-><init>(Landroid/content/Context;IIZLcom/android/billingclient/api/k;)V

    return-object v6

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Support for pending purchases must be enabled. Enable this by calling \'enablePendingPurchases()\' on BillingClientBuilder."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Please provide a valid listener for purchases updates."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Please provide a valid Context."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()Lcom/android/billingclient/api/d$b;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/android/billingclient/api/d$b;->d:Z

    return-object p0
.end method

.method public c(Lcom/android/billingclient/api/k;)Lcom/android/billingclient/api/d$b;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/d$b;->e:Lcom/android/billingclient/api/k;

    return-object p0
.end method
