.class Lcom/android/billingclient/api/e;
.super Lcom/android/billingclient/api/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/billingclient/api/e$k;
    }
.end annotation


# instance fields
.field private a:I

.field private final b:Ljava/lang/String;

.field private final c:Landroid/os/Handler;

.field private final d:Lcom/android/billingclient/api/c;

.field private final e:Landroid/content/Context;

.field private final f:I

.field private final g:I

.field private h:Lc/a/b/a/a;

.field private i:Lcom/android/billingclient/api/e$k;

.field private j:Z

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private final o:Z

.field private p:Ljava/util/concurrent/ExecutorService;

.field private final q:Landroid/os/ResultReceiver;


# direct methods
.method constructor <init>(Landroid/content/Context;IIZLcom/android/billingclient/api/k;)V
    .locals 7

    const-string v6, "2.0.1"

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/android/billingclient/api/e;-><init>(Landroid/content/Context;IIZLcom/android/billingclient/api/k;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;IIZLcom/android/billingclient/api/k;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Lcom/android/billingclient/api/d;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/android/billingclient/api/e;->a:I

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/android/billingclient/api/e;->c:Landroid/os/Handler;

    new-instance v1, Lcom/android/billingclient/api/e$e;

    invoke-direct {v1, p0, v0}, Lcom/android/billingclient/api/e$e;-><init>(Lcom/android/billingclient/api/e;Landroid/os/Handler;)V

    iput-object v1, p0, Lcom/android/billingclient/api/e;->q:Landroid/os/ResultReceiver;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    iput p2, p0, Lcom/android/billingclient/api/e;->f:I

    iput p3, p0, Lcom/android/billingclient/api/e;->g:I

    iput-boolean p4, p0, Lcom/android/billingclient/api/e;->o:Z

    new-instance p2, Lcom/android/billingclient/api/c;

    invoke-direct {p2, p1, p5}, Lcom/android/billingclient/api/c;-><init>(Landroid/content/Context;Lcom/android/billingclient/api/k;)V

    iput-object p2, p0, Lcom/android/billingclient/api/e;->d:Lcom/android/billingclient/api/c;

    iput-object p6, p0, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    return-void
.end method

.method private A(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/e;->c:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private B(Ljava/lang/String;)Lcom/android/billingclient/api/Purchase$a;
    .locals 14

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Querying owned items, item type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "BillingClient"

    invoke-static {v1, v0}, Lc/a/a/a/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v2, p0, Lcom/android/billingclient/api/e;->n:Z

    iget-boolean v3, p0, Lcom/android/billingclient/api/e;->o:Z

    iget-object v4, p0, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    invoke-static {v2, v3, v4}, Lc/a/a/a/a;->d(ZZLjava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    const/4 v3, 0x0

    move-object v9, v3

    :cond_0
    :try_start_0
    iget-boolean v4, p0, Lcom/android/billingclient/api/e;->n:Z

    if-eqz v4, :cond_1

    iget-object v5, p0, Lcom/android/billingclient/api/e;->h:Lc/a/b/a/a;

    const/16 v6, 0x9

    iget-object v4, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    move-object v8, p1

    move-object v10, v2

    invoke-interface/range {v5 .. v10}, Lc/a/b/a/a;->Q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v4

    goto :goto_0

    :cond_1
    iget-object v4, p0, Lcom/android/billingclient/api/e;->h:Lc/a/b/a/a;

    const/4 v5, 0x3

    iget-object v6, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6, p1, v9}, Lc/a/b/a/a;->s0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    const-string v5, "getPurchase()"

    invoke-static {v4, v1, v5}, Lcom/android/billingclient/api/j;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Lcom/android/billingclient/api/h;

    move-result-object v5

    sget-object v6, Lcom/android/billingclient/api/i;->o:Lcom/android/billingclient/api/h;

    if-eq v5, v6, :cond_2

    new-instance p1, Lcom/android/billingclient/api/Purchase$a;

    invoke-direct {p1, v5, v3}, Lcom/android/billingclient/api/Purchase$a;-><init>(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-object p1

    :cond_2
    const-string v5, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    const-string v6, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    const-string v7, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v4, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_4

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Sku is owned: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v1, v11}, Lc/a/a/a/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    new-instance v11, Lcom/android/billingclient/api/Purchase;

    invoke-direct {v11, v9, v10}, Lcom/android/billingclient/api/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {v11}, Lcom/android/billingclient/api/Purchase;->d()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_3

    const-string v9, "BUG: empty/null token!"

    invoke-static {v1, v9}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Got an exception trying to decode the purchase: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/android/billingclient/api/Purchase$a;

    sget-object v0, Lcom/android/billingclient/api/i;->k:Lcom/android/billingclient/api/h;

    invoke-direct {p1, v0, v3}, Lcom/android/billingclient/api/Purchase$a;-><init>(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-object p1

    :cond_4
    const-string v5, "INAPP_CONTINUATION_TOKEN"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Continuation token: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lc/a/a/a/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance p1, Lcom/android/billingclient/api/Purchase$a;

    sget-object v1, Lcom/android/billingclient/api/i;->o:Lcom/android/billingclient/api/h;

    invoke-direct {p1, v1, v0}, Lcom/android/billingclient/api/Purchase$a;-><init>(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-object p1

    :catch_1
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Got exception trying to get purchases: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "; try to reconnect"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/android/billingclient/api/Purchase$a;

    sget-object v0, Lcom/android/billingclient/api/i;->p:Lcom/android/billingclient/api/h;

    invoke-direct {p1, v0, v3}, Lcom/android/billingclient/api/Purchase$a;-><init>(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-object p1
.end method

.method static synthetic i(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/c;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/e;->d:Lcom/android/billingclient/api/c;

    return-object p0
.end method

.method static synthetic j(Lcom/android/billingclient/api/e;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic k(Lcom/android/billingclient/api/e;I)I
    .locals 0

    iput p1, p0, Lcom/android/billingclient/api/e;->a:I

    return p1
.end method

.method static synthetic l(Lcom/android/billingclient/api/e;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->k:Z

    return p1
.end method

.method static synthetic m(Lcom/android/billingclient/api/e;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->j:Z

    return p1
.end method

.method static synthetic n(Lcom/android/billingclient/api/e;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->n:Z

    return p1
.end method

.method static synthetic o(Lcom/android/billingclient/api/e;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->m:Z

    return p1
.end method

.method static synthetic p(Lcom/android/billingclient/api/e;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic q(Lcom/android/billingclient/api/e;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/android/billingclient/api/e;->l:Z

    return p1
.end method

.method static synthetic r(Lcom/android/billingclient/api/e;Ljava/util/concurrent/Callable;JLjava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/billingclient/api/e;->y(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method static synthetic s(Lcom/android/billingclient/api/e;)Lcom/android/billingclient/api/h;
    .locals 0

    invoke-direct {p0}, Lcom/android/billingclient/api/e;->z()Lcom/android/billingclient/api/h;

    move-result-object p0

    return-object p0
.end method

.method static synthetic t(Lcom/android/billingclient/api/e;)Lc/a/b/a/a;
    .locals 0

    iget-object p0, p0, Lcom/android/billingclient/api/e;->h:Lc/a/b/a/a;

    return-object p0
.end method

.method static synthetic u(Lcom/android/billingclient/api/e;Lc/a/b/a/a;)Lc/a/b/a/a;
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/e;->h:Lc/a/b/a/a;

    return-object p1
.end method

.method static synthetic v(Lcom/android/billingclient/api/e;Ljava/lang/String;)Lcom/android/billingclient/api/Purchase$a;
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/e;->B(Ljava/lang/String;)Lcom/android/billingclient/api/Purchase$a;

    move-result-object p0

    return-object p0
.end method

.method static synthetic w(Lcom/android/billingclient/api/e;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/e;->A(Ljava/lang/Runnable;)V

    return-void
.end method

.method private x(Lcom/android/billingclient/api/h;)Lcom/android/billingclient/api/h;
    .locals 2

    iget-object v0, p0, Lcom/android/billingclient/api/e;->d:Lcom/android/billingclient/api/c;

    invoke-virtual {v0}, Lcom/android/billingclient/api/c;->c()Lcom/android/billingclient/api/k;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/android/billingclient/api/k;->a(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-object p1
.end method

.method private y(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;)Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "TT;>;J",
            "Ljava/lang/Runnable;",
            ")",
            "Ljava/util/concurrent/Future<",
            "TT;>;"
        }
    .end annotation

    long-to-double p2, p2

    const-wide v0, 0x3fee666666666666L    # 0.95

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p2, p2, v0

    double-to-long p2, p2

    iget-object v0, p0, Lcom/android/billingclient/api/e;->p:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    sget v0, Lc/a/a/a/a;->a:I

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/android/billingclient/api/e;->p:Ljava/util/concurrent/ExecutorService;

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/e;->p:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/android/billingclient/api/e;->c:Landroid/os/Handler;

    new-instance v1, Lcom/android/billingclient/api/e$f;

    invoke-direct {v1, p0, p1, p4}, Lcom/android/billingclient/api/e$f;-><init>(Lcom/android/billingclient/api/e;Ljava/util/concurrent/Future;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-object p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Async task throws exception "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "BillingClient"

    invoke-static {p2, p1}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private z()Lcom/android/billingclient/api/h;
    .locals 2

    iget v0, p0, Lcom/android/billingclient/api/e;->a:I

    if-eqz v0, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/android/billingclient/api/i;->k:Lcom/android/billingclient/api/h;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v0, Lcom/android/billingclient/api/i;->p:Lcom/android/billingclient/api/h;

    :goto_1
    return-object v0
.end method


# virtual methods
.method C(Ljava/lang/String;Ljava/util/List;)Lcom/android/billingclient/api/SkuDetails$a;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/android/billingclient/api/SkuDetails$a;"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v2, "BillingClient"

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_7

    add-int/lit8 v6, v5, 0x14

    if-le v6, v3, :cond_0

    move v7, v3

    goto :goto_1

    :cond_0
    move v7, v6

    :goto_1
    new-instance v8, Ljava/util/ArrayList;

    move-object/from16 v9, p2

    invoke-interface {v9, v5, v7}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v5

    invoke-direct {v8, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v14, Landroid/os/Bundle;

    invoke-direct {v14}, Landroid/os/Bundle;-><init>()V

    const-string v5, "ITEM_ID_LIST"

    invoke-virtual {v14, v5, v8}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    iget-object v5, v1, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    const-string v7, "playBillingLibraryVersion"

    invoke-virtual {v14, v7, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v5, 0x0

    :try_start_0
    iget-boolean v7, v1, Lcom/android/billingclient/api/e;->n:Z

    if-eqz v7, :cond_1

    iget-object v10, v1, Lcom/android/billingclient/api/e;->h:Lc/a/b/a/a;

    const/16 v11, 0x9

    iget-object v7, v1, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v12

    iget-boolean v7, v1, Lcom/android/billingclient/api/e;->n:Z

    iget-boolean v8, v1, Lcom/android/billingclient/api/e;->o:Z

    iget-object v13, v1, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    invoke-static {v7, v8, v13}, Lc/a/a/a/a;->b(ZZLjava/lang/String;)Landroid/os/Bundle;

    move-result-object v15

    move-object/from16 v13, p1

    invoke-interface/range {v10 .. v15}, Lc/a/b/a/a;->r0(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v7

    move-object/from16 v11, p1

    goto :goto_2

    :cond_1
    iget-object v7, v1, Lcom/android/billingclient/api/e;->h:Lc/a/b/a/a;

    const/4 v8, 0x3

    iget-object v10, v1, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v11, p1

    invoke-interface {v7, v8, v10, v11, v14}, Lc/a/b/a/a;->m0(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :goto_2
    const/4 v8, 0x4

    if-nez v7, :cond_2

    const-string v0, "querySkuDetailsAsync got null sku details list"

    invoke-static {v2, v0}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/android/billingclient/api/SkuDetails$a;

    const-string v2, "Null sku details list"

    invoke-direct {v0, v8, v2, v5}, Lcom/android/billingclient/api/SkuDetails$a;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object v0

    :cond_2
    const-string v10, "DETAILS_LIST"

    invoke-virtual {v7, v10}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v12

    const/4 v13, 0x6

    if-nez v12, :cond_4

    invoke-static {v7, v2}, Lc/a/a/a/a;->i(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v3

    invoke-static {v7, v2}, Lc/a/a/a/a;->h(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v3, :cond_3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "getSkuDetails() failed. Response code: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/android/billingclient/api/SkuDetails$a;

    invoke-direct {v2, v3, v4, v0}, Lcom/android/billingclient/api/SkuDetails$a;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object v2

    :cond_3
    const-string v3, "getSkuDetails() returned a bundle with neither an error nor a detail list."

    invoke-static {v2, v3}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/android/billingclient/api/SkuDetails$a;

    invoke-direct {v2, v13, v4, v0}, Lcom/android/billingclient/api/SkuDetails$a;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object v2

    :cond_4
    invoke-virtual {v7, v10}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    if-nez v7, :cond_5

    const-string v0, "querySkuDetailsAsync got null response list"

    invoke-static {v2, v0}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/android/billingclient/api/SkuDetails$a;

    invoke-direct {v2, v8, v0, v5}, Lcom/android/billingclient/api/SkuDetails$a;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object v2

    :cond_5
    const/4 v8, 0x0

    :goto_3
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v8, v10, :cond_6

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    :try_start_1
    new-instance v12, Lcom/android/billingclient/api/SkuDetails;

    invoke-direct {v12, v10}, Lcom/android/billingclient/api/SkuDetails;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Got sku details: "

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v2, v10}, Lc/a/a/a/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :catch_0
    const-string v0, "Got a JSON exception trying to decode SkuDetails."

    invoke-static {v2, v0}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/android/billingclient/api/SkuDetails$a;

    const-string v2, "Error trying to decode SkuDetails."

    invoke-direct {v0, v13, v2, v5}, Lcom/android/billingclient/api/SkuDetails$a;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object v0

    :cond_6
    move v5, v6

    goto/16 :goto_0

    :catch_1
    move-exception v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "querySkuDetailsAsync got a remote exception (try to reconnect)."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/android/billingclient/api/SkuDetails$a;

    const/4 v2, -0x1

    const-string v3, "Service connection is disconnected."

    invoke-direct {v0, v2, v3, v5}, Lcom/android/billingclient/api/SkuDetails$a;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object v0

    :cond_7
    new-instance v2, Lcom/android/billingclient/api/SkuDetails$a;

    const-string v3, ""

    invoke-direct {v2, v4, v3, v0}, Lcom/android/billingclient/api/SkuDetails$a;-><init>(ILjava/lang/String;Ljava/util/List;)V

    return-object v2
.end method

.method public a(Lcom/android/billingclient/api/a;Lcom/android/billingclient/api/b;)V
    .locals 3

    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->c()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lcom/android/billingclient/api/i;->p:Lcom/android/billingclient/api/h;

    :goto_0
    invoke-interface {p2, p1}, Lcom/android/billingclient/api/b;->a(Lcom/android/billingclient/api/h;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/a;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "BillingClient"

    const-string v0, "Please provide a valid purchase token."

    invoke-static {p1, v0}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/i;->j:Lcom/android/billingclient/api/h;

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/android/billingclient/api/e;->n:Z

    if-nez v0, :cond_2

    sget-object p1, Lcom/android/billingclient/api/i;->b:Lcom/android/billingclient/api/h;

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/android/billingclient/api/e$c;

    invoke-direct {v0, p0, p1, p2}, Lcom/android/billingclient/api/e$c;-><init>(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/a;Lcom/android/billingclient/api/b;)V

    const-wide/16 v1, 0x7530

    new-instance p1, Lcom/android/billingclient/api/e$d;

    invoke-direct {p1, p0, p2}, Lcom/android/billingclient/api/e$d;-><init>(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/b;)V

    invoke-direct {p0, v0, v1, v2, p1}, Lcom/android/billingclient/api/e;->y(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-direct {p0}, Lcom/android/billingclient/api/e;->z()Lcom/android/billingclient/api/h;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/android/billingclient/api/b;->a(Lcom/android/billingclient/api/h;)V

    :cond_3
    return-void
.end method

.method public b()V
    .locals 5

    const-string v0, "BillingClient"

    const/4 v1, 0x3

    :try_start_0
    iget-object v2, p0, Lcom/android/billingclient/api/e;->d:Lcom/android/billingclient/api/c;

    invoke-virtual {v2}, Lcom/android/billingclient/api/c;->b()V

    iget-object v2, p0, Lcom/android/billingclient/api/e;->i:Lcom/android/billingclient/api/e$k;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/android/billingclient/api/e$k;->e()V

    :cond_0
    iget-object v2, p0, Lcom/android/billingclient/api/e;->i:Lcom/android/billingclient/api/e$k;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/android/billingclient/api/e;->h:Lc/a/b/a/a;

    if-eqz v2, :cond_1

    const-string v2, "Unbinding from service."

    invoke-static {v0, v2}, Lc/a/a/a/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    iget-object v4, p0, Lcom/android/billingclient/api/e;->i:Lcom/android/billingclient/api/e$k;

    invoke-virtual {v2, v4}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iput-object v3, p0, Lcom/android/billingclient/api/e;->i:Lcom/android/billingclient/api/e$k;

    :cond_1
    iput-object v3, p0, Lcom/android/billingclient/api/e;->h:Lc/a/b/a/a;

    iget-object v2, p0, Lcom/android/billingclient/api/e;->p:Ljava/util/concurrent/ExecutorService;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    iput-object v3, p0, Lcom/android/billingclient/api/e;->p:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_0
    iput v1, p0, Lcom/android/billingclient/api/e;->a:I

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v2

    :try_start_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "There was an exception while ending connection: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    :goto_2
    iput v1, p0, Lcom/android/billingclient/api/e;->a:I

    goto :goto_4

    :goto_3
    throw v0

    :goto_4
    goto :goto_3
.end method

.method public c()Z
    .locals 2

    iget v0, p0, Lcom/android/billingclient/api/e;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/e;->h:Lc/a/b/a/a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/e;->i:Lcom/android/billingclient/api/e$k;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(Landroid/app/Activity;Lcom/android/billingclient/api/g;)Lcom/android/billingclient/api/h;
    .locals 13

    const-string v0, "BUY_INTENT"

    const-string v1, "; try to reconnect"

    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->c()Z

    move-result v2

    if-nez v2, :cond_0

    :goto_0
    sget-object p1, Lcom/android/billingclient/api/i;->p:Lcom/android/billingclient/api/h;

    :goto_1
    invoke-direct {p0, p1}, Lcom/android/billingclient/api/e;->x(Lcom/android/billingclient/api/h;)Lcom/android/billingclient/api/h;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p2}, Lcom/android/billingclient/api/g;->m()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2}, Lcom/android/billingclient/api/g;->k()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p2}, Lcom/android/billingclient/api/g;->l()Lcom/android/billingclient/api/SkuDetails;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/android/billingclient/api/SkuDetails;->e()Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x1

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    :goto_2
    const-string v9, "BillingClient"

    if-nez v8, :cond_2

    const-string p1, "Please fix the input params. SKU can\'t be null."

    invoke-static {v9, p1}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/i;->m:Lcom/android/billingclient/api/h;

    goto :goto_1

    :cond_2
    if-nez v6, :cond_3

    const-string p1, "Please fix the input params. SkuType can\'t be null."

    invoke-static {v9, p1}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/i;->n:Lcom/android/billingclient/api/h;

    goto :goto_1

    :cond_3
    const-string v7, "subs"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    iget-boolean v7, p0, Lcom/android/billingclient/api/e;->j:Z

    if-nez v7, :cond_4

    const-string p1, "Current client doesn\'t support subscriptions."

    invoke-static {v9, p1}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/i;->r:Lcom/android/billingclient/api/h;

    goto :goto_1

    :cond_4
    invoke-virtual {p2}, Lcom/android/billingclient/api/g;->i()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_5

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    :goto_3
    if-eqz v3, :cond_6

    iget-boolean v4, p0, Lcom/android/billingclient/api/e;->k:Z

    if-nez v4, :cond_6

    const-string p1, "Current client doesn\'t support subscriptions update."

    invoke-static {v9, p1}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/i;->s:Lcom/android/billingclient/api/h;

    goto :goto_1

    :cond_6
    invoke-virtual {p2}, Lcom/android/billingclient/api/g;->o()Z

    move-result v4

    const-string v7, "Current client doesn\'t support extra params for buy intent."

    if-eqz v4, :cond_7

    iget-boolean v4, p0, Lcom/android/billingclient/api/e;->l:Z

    if-nez v4, :cond_7

    :goto_4
    invoke-static {v9, v7}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/i;->g:Lcom/android/billingclient/api/h;

    goto :goto_1

    :cond_7
    if-eqz v5, :cond_8

    iget-boolean v4, p0, Lcom/android/billingclient/api/e;->l:Z

    if-nez v4, :cond_8

    goto :goto_4

    :cond_8
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Constructing buy intent for "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ", item type: "

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v9, v4}, Lc/a/a/a/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v4, p0, Lcom/android/billingclient/api/e;->l:Z

    const/4 v10, 0x0

    const-wide/16 v11, 0x1388

    if-eqz v4, :cond_e

    iget-boolean v3, p0, Lcom/android/billingclient/api/e;->n:Z

    iget-boolean v4, p0, Lcom/android/billingclient/api/e;->o:Z

    iget-object v7, p0, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    invoke-static {p2, v3, v4, v7}, Lc/a/a/a/a;->c(Lcom/android/billingclient/api/g;ZZLjava/lang/String;)Landroid/os/Bundle;

    move-result-object v7

    invoke-virtual {v2}, Lcom/android/billingclient/api/SkuDetails;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_9

    invoke-virtual {v2}, Lcom/android/billingclient/api/SkuDetails;->c()Ljava/lang/String;

    move-result-object v3

    const-string v4, "skuDetailsToken"

    invoke-virtual {v7, v4, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    if-eqz v5, :cond_b

    invoke-virtual {v2}, Lcom/android/billingclient/api/SkuDetails;->f()Ljava/lang/String;

    move-result-object v2

    const-string v3, "rewardToken"

    invoke-virtual {v7, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget v2, p0, Lcom/android/billingclient/api/e;->f:I

    if-eqz v2, :cond_a

    const-string v3, "childDirected"

    invoke-virtual {v7, v3, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_a
    iget v2, p0, Lcom/android/billingclient/api/e;->g:I

    if-eqz v2, :cond_b

    const-string v3, "underAgeOfConsent"

    invoke-virtual {v7, v3, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_b
    const/4 v2, 0x6

    iget-boolean v3, p0, Lcom/android/billingclient/api/e;->n:Z

    if-eqz v3, :cond_c

    const/16 p2, 0x9

    const/16 v4, 0x9

    goto :goto_5

    :cond_c
    invoke-virtual {p2}, Lcom/android/billingclient/api/g;->n()Z

    move-result p2

    if-eqz p2, :cond_d

    const/4 p2, 0x7

    const/4 v4, 0x7

    goto :goto_5

    :cond_d
    const/4 v4, 0x6

    :goto_5
    new-instance p2, Lcom/android/billingclient/api/e$g;

    move-object v2, p2

    move-object v3, p0

    move-object v5, v8

    invoke-direct/range {v2 .. v7}, Lcom/android/billingclient/api/e$g;-><init>(Lcom/android/billingclient/api/e;ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_6

    :cond_e
    if-eqz v3, :cond_f

    new-instance v2, Lcom/android/billingclient/api/e$h;

    invoke-direct {v2, p0, p2, v8}, Lcom/android/billingclient/api/e$h;-><init>(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/g;Ljava/lang/String;)V

    invoke-direct {p0, v2, v11, v12, v10}, Lcom/android/billingclient/api/e;->y(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p2

    goto :goto_7

    :cond_f
    new-instance p2, Lcom/android/billingclient/api/e$i;

    invoke-direct {p2, p0, v8, v6}, Lcom/android/billingclient/api/e$i;-><init>(Lcom/android/billingclient/api/e;Ljava/lang/String;Ljava/lang/String;)V

    :goto_6
    invoke-direct {p0, p2, v11, v12, v10}, Lcom/android/billingclient/api/e;->y(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p2

    :goto_7
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p2, v11, v12, v2}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    invoke-static {p2, v9}, Lc/a/a/a/a;->i(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v2

    invoke-static {p2, v9}, Lc/a/a/a/a;->h(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v2, :cond_10

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unable to buy item, Error response code: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v9, p1}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/android/billingclient/api/h;->d()Lcom/android/billingclient/api/h$b;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/android/billingclient/api/h$b;->c(I)Lcom/android/billingclient/api/h$b;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/android/billingclient/api/h$b;->b(Ljava/lang/String;)Lcom/android/billingclient/api/h$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/h$b;->a()Lcom/android/billingclient/api/h;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/android/billingclient/api/e;->x(Lcom/android/billingclient/api/h;)Lcom/android/billingclient/api/h;

    move-result-object p1

    return-object p1

    :cond_10
    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/android/billingclient/api/ProxyBillingActivity;

    invoke-direct {v2, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "result_receiver"

    iget-object v4, p0, Lcom/android/billingclient/api/e;->q:Landroid/os/ResultReceiver;

    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p2

    check-cast p2, Landroid/app/PendingIntent;

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {p1, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget-object p1, Lcom/android/billingclient/api/i;->o:Lcom/android/billingclient/api/h;

    return-object p1

    :catch_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Exception while launching billing flow: ; for sku: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v9, p1}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :catch_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Time out while launching billing flow: ; for sku: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v9, p1}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/i;->q:Lcom/android/billingclient/api/h;

    goto/16 :goto_1
.end method

.method public f(Ljava/lang/String;)Lcom/android/billingclient/api/Purchase$a;
    .locals 4

    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance p1, Lcom/android/billingclient/api/Purchase$a;

    sget-object v0, Lcom/android/billingclient/api/i;->p:Lcom/android/billingclient/api/h;

    invoke-direct {p1, v0, v1}, Lcom/android/billingclient/api/Purchase$a;-><init>(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-object p1

    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "BillingClient"

    const-string v0, "Please provide a valid SKU type."

    invoke-static {p1, v0}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/android/billingclient/api/Purchase$a;

    sget-object v0, Lcom/android/billingclient/api/i;->f:Lcom/android/billingclient/api/h;

    invoke-direct {p1, v0, v1}, Lcom/android/billingclient/api/Purchase$a;-><init>(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-object p1

    :cond_1
    new-instance v0, Lcom/android/billingclient/api/e$j;

    invoke-direct {v0, p0, p1}, Lcom/android/billingclient/api/e$j;-><init>(Lcom/android/billingclient/api/e;Ljava/lang/String;)V

    const-wide/16 v2, 0x1388

    invoke-direct {p0, v0, v2, v3, v1}, Lcom/android/billingclient/api/e;->y(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    :try_start_0
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v2, v3, v0}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/android/billingclient/api/Purchase$a;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    new-instance p1, Lcom/android/billingclient/api/Purchase$a;

    sget-object v0, Lcom/android/billingclient/api/i;->k:Lcom/android/billingclient/api/h;

    invoke-direct {p1, v0, v1}, Lcom/android/billingclient/api/Purchase$a;-><init>(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-object p1

    :catch_1
    new-instance p1, Lcom/android/billingclient/api/Purchase$a;

    sget-object v0, Lcom/android/billingclient/api/i;->q:Lcom/android/billingclient/api/h;

    invoke-direct {p1, v0, v1}, Lcom/android/billingclient/api/Purchase$a;-><init>(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-object p1
.end method

.method public g(Lcom/android/billingclient/api/l;Lcom/android/billingclient/api/m;)V
    .locals 5

    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object p1, Lcom/android/billingclient/api/i;->p:Lcom/android/billingclient/api/h;

    :goto_0
    invoke-interface {p2, p1, v1}, Lcom/android/billingclient/api/m;->a(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/android/billingclient/api/l;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/billingclient/api/l;->d()Ljava/util/List;

    move-result-object p1

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    const-string v3, "BillingClient"

    if-eqz v2, :cond_1

    const-string p1, "Please fix the input params. SKU type can\'t be empty."

    invoke-static {v3, p1}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/i;->f:Lcom/android/billingclient/api/h;

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    const-string p1, "Please fix the input params. The list of SKUs can\'t be empty."

    invoke-static {v3, p1}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/android/billingclient/api/i;->e:Lcom/android/billingclient/api/h;

    goto :goto_0

    :cond_2
    new-instance v2, Lcom/android/billingclient/api/e$a;

    invoke-direct {v2, p0, v0, p1, p2}, Lcom/android/billingclient/api/e$a;-><init>(Lcom/android/billingclient/api/e;Ljava/lang/String;Ljava/util/List;Lcom/android/billingclient/api/m;)V

    const-wide/16 v3, 0x7530

    new-instance p1, Lcom/android/billingclient/api/e$b;

    invoke-direct {p1, p0, p2}, Lcom/android/billingclient/api/e$b;-><init>(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/m;)V

    invoke-direct {p0, v2, v3, v4, p1}, Lcom/android/billingclient/api/e;->y(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-direct {p0}, Lcom/android/billingclient/api/e;->z()Lcom/android/billingclient/api/h;

    move-result-object p1

    invoke-interface {p2, p1, v1}, Lcom/android/billingclient/api/m;->a(Lcom/android/billingclient/api/h;Ljava/util/List;)V

    :cond_3
    return-void
.end method

.method public h(Lcom/android/billingclient/api/f;)V
    .locals 7

    invoke-virtual {p0}, Lcom/android/billingclient/api/e;->c()Z

    move-result v0

    const-string v1, "BillingClient"

    if-eqz v0, :cond_0

    const-string v0, "Service connection is valid. No need to re-initialize."

    invoke-static {v1, v0}, Lc/a/a/a/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/i;->o:Lcom/android/billingclient/api/h;

    invoke-interface {p1, v0}, Lcom/android/billingclient/api/f;->b(Lcom/android/billingclient/api/h;)V

    return-void

    :cond_0
    iget v0, p0, Lcom/android/billingclient/api/e;->a:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const-string v0, "Client is already in the process of connecting to billing service."

    invoke-static {v1, v0}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/i;->d:Lcom/android/billingclient/api/h;

    invoke-interface {p1, v0}, Lcom/android/billingclient/api/f;->b(Lcom/android/billingclient/api/h;)V

    return-void

    :cond_1
    const/4 v3, 0x3

    if-ne v0, v3, :cond_2

    const-string v0, "Client was already closed and can\'t be reused. Please create another instance."

    invoke-static {v1, v0}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/i;->p:Lcom/android/billingclient/api/h;

    invoke-interface {p1, v0}, Lcom/android/billingclient/api/f;->b(Lcom/android/billingclient/api/h;)V

    return-void

    :cond_2
    iput v2, p0, Lcom/android/billingclient/api/e;->a:I

    iget-object v0, p0, Lcom/android/billingclient/api/e;->d:Lcom/android/billingclient/api/c;

    invoke-virtual {v0}, Lcom/android/billingclient/api/c;->d()V

    const-string v0, "Starting in-app billing setup."

    invoke-static {v1, v0}, Lc/a/a/a/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/android/billingclient/api/e$k;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v3}, Lcom/android/billingclient/api/e$k;-><init>(Lcom/android/billingclient/api/e;Lcom/android/billingclient/api/f;Lcom/android/billingclient/api/e$e;)V

    iput-object v0, p0, Lcom/android/billingclient/api/e;->i:Lcom/android/billingclient/api/e$k;

    new-instance v0, Landroid/content/Intent;

    const-string v3, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "com.android.vending"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v4, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v0, v5}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ResolveInfo;

    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v4, :cond_5

    iget-object v6, v4, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v4, v4, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz v4, :cond_4

    new-instance v3, Landroid/content/ComponentName;

    invoke-direct {v3, v6, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    invoke-virtual {v4, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/android/billingclient/api/e;->b:Ljava/lang/String;

    const-string v3, "playBillingLibraryVersion"

    invoke-virtual {v4, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/android/billingclient/api/e;->e:Landroid/content/Context;

    iget-object v3, p0, Lcom/android/billingclient/api/e;->i:Lcom/android/billingclient/api/e$k;

    invoke-virtual {v0, v4, v3, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "Service was bonded successfully."

    invoke-static {v1, p1}, Lc/a/a/a/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    const-string v0, "Connection to Billing service is blocked."

    goto :goto_0

    :cond_4
    const-string v0, "The device doesn\'t have valid Play Store."

    :goto_0
    invoke-static {v1, v0}, Lc/a/a/a/a;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iput v5, p0, Lcom/android/billingclient/api/e;->a:I

    const-string v0, "Billing service unavailable on device."

    invoke-static {v1, v0}, Lc/a/a/a/a;->k(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/android/billingclient/api/i;->c:Lcom/android/billingclient/api/h;

    invoke-interface {p1, v0}, Lcom/android/billingclient/api/f;->b(Lcom/android/billingclient/api/h;)V

    return-void
.end method
