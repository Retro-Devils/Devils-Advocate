.class public Lcom/android/billingclient/api/g$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:Lcom/android/billingclient/api/SkuDetails;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Z

.field private e:I

.field private f:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/android/billingclient/api/g$b;->e:I

    return-void
.end method

.method synthetic constructor <init>(Lcom/android/billingclient/api/g$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/android/billingclient/api/g$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/g;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/g;

    invoke-direct {v0}, Lcom/android/billingclient/api/g;-><init>()V

    iget-object v1, p0, Lcom/android/billingclient/api/g$b;->a:Lcom/android/billingclient/api/SkuDetails;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/g;->a(Lcom/android/billingclient/api/g;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;

    iget-object v1, p0, Lcom/android/billingclient/api/g$b;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/g;->b(Lcom/android/billingclient/api/g;Ljava/lang/String;)Ljava/lang/String;

    iget-object v1, p0, Lcom/android/billingclient/api/g$b;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/g;->c(Lcom/android/billingclient/api/g;Ljava/lang/String;)Ljava/lang/String;

    iget-boolean v1, p0, Lcom/android/billingclient/api/g$b;->d:Z

    invoke-static {v0, v1}, Lcom/android/billingclient/api/g;->d(Lcom/android/billingclient/api/g;Z)Z

    iget v1, p0, Lcom/android/billingclient/api/g$b;->e:I

    invoke-static {v0, v1}, Lcom/android/billingclient/api/g;->e(Lcom/android/billingclient/api/g;I)I

    iget-object v1, p0, Lcom/android/billingclient/api/g$b;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/g;->f(Lcom/android/billingclient/api/g;Ljava/lang/String;)Ljava/lang/String;

    return-object v0
.end method

.method public b(Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/g$b;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/g$b;->a:Lcom/android/billingclient/api/SkuDetails;

    return-object p0
.end method
