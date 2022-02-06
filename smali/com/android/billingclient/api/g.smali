.class public Lcom/android/billingclient/api/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/g$b;
    }
.end annotation


# instance fields
.field private a:Lcom/android/billingclient/api/SkuDetails;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Z

.field private e:I

.field private f:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/android/billingclient/api/g;->e:I

    return-void
.end method

.method static synthetic a(Lcom/android/billingclient/api/g;Lcom/android/billingclient/api/SkuDetails;)Lcom/android/billingclient/api/SkuDetails;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/g;->a:Lcom/android/billingclient/api/SkuDetails;

    return-object p1
.end method

.method static synthetic b(Lcom/android/billingclient/api/g;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/g;->b:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Lcom/android/billingclient/api/g;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/g;->c:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lcom/android/billingclient/api/g;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/g;->d:Z

    return p1
.end method

.method static synthetic e(Lcom/android/billingclient/api/g;I)I
    .locals 0

    iput p1, p0, Lcom/android/billingclient/api/g;->e:I

    return p1
.end method

.method static synthetic f(Lcom/android/billingclient/api/g;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/g;->f:Ljava/lang/String;

    return-object p1
.end method

.method public static p()Lcom/android/billingclient/api/g$b;
    .locals 2

    new-instance v0, Lcom/android/billingclient/api/g$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/android/billingclient/api/g$b;-><init>(Lcom/android/billingclient/api/g$a;)V

    return-object v0
.end method


# virtual methods
.method public g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/g;->c:Ljava/lang/String;

    return-object v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/g;->f:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/g;->b:Ljava/lang/String;

    return-object v0
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lcom/android/billingclient/api/g;->e:I

    return v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/g;->a:Lcom/android/billingclient/api/SkuDetails;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public l()Lcom/android/billingclient/api/SkuDetails;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/g;->a:Lcom/android/billingclient/api/SkuDetails;

    return-object v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/android/billingclient/api/g;->a:Lcom/android/billingclient/api/SkuDetails;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/android/billingclient/api/SkuDetails;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public n()Z
    .locals 1

    iget-boolean v0, p0, Lcom/android/billingclient/api/g;->d:Z

    return v0
.end method

.method o()Z
    .locals 1

    iget-boolean v0, p0, Lcom/android/billingclient/api/g;->d:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/android/billingclient/api/g;->c:Ljava/lang/String;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/android/billingclient/api/g;->f:Ljava/lang/String;

    if-nez v0, :cond_1

    iget v0, p0, Lcom/android/billingclient/api/g;->e:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
