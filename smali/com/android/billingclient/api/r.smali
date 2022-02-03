.class final Lcom/android/billingclient/api/r;
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
.field private final synthetic a:Lcom/android/billingclient/api/d$a;


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/d$a;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()Ljava/lang/Void;
    .locals 10

    iget-object v0, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    invoke-static {v0}, Lcom/android/billingclient/api/d$a;->a(Lcom/android/billingclient/api/d$a;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    invoke-static {v1}, Lcom/android/billingclient/api/d$a;->f(Lcom/android/billingclient/api/d$a;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v2

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x3

    const/4 v1, 0x0

    :try_start_1
    iget-object v3, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v3, v3, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    invoke-static {v3}, Lcom/android/billingclient/api/d;->v(Lcom/android/billingclient/api/d;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const/16 v4, 0xd

    const/16 v5, 0xd

    const/4 v6, 0x3

    :goto_0
    if-lt v5, v0, :cond_2

    :try_start_2
    iget-object v7, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v7, v7, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    invoke-static {v7}, Lcom/android/billingclient/api/d;->z(Lcom/android/billingclient/api/d;)Lc/b/a/a/d/c/a;

    move-result-object v7

    const-string v8, "subs"

    invoke-interface {v7, v5, v3, v8}, Lc/b/a/a/d/c/a;->J(ILjava/lang/String;Ljava/lang/String;)I

    move-result v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, -0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_1
    iget-object v7, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v7, v7, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    const/4 v8, 0x5

    const/4 v9, 0x1

    if-lt v5, v8, :cond_3

    const/4 v8, 0x1

    goto :goto_2

    :cond_3
    const/4 v8, 0x0

    :goto_2
    invoke-static {v7, v8}, Lcom/android/billingclient/api/d;->u(Lcom/android/billingclient/api/d;Z)Z

    iget-object v7, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v7, v7, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    if-lt v5, v0, :cond_4

    const/4 v8, 0x1

    goto :goto_3

    :cond_4
    const/4 v8, 0x0

    :goto_3
    invoke-static {v7, v8}, Lcom/android/billingclient/api/d;->w(Lcom/android/billingclient/api/d;Z)Z

    if-ge v5, v0, :cond_5

    const-string v5, "BillingClient"

    const-string v7, "In-app billing API does not support subscription on this device."

    invoke-static {v5, v7}, Lc/b/a/a/d/c/b;->h(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    const/16 v5, 0xd

    :goto_4
    if-lt v5, v0, :cond_7

    iget-object v7, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v7, v7, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    invoke-static {v7}, Lcom/android/billingclient/api/d;->z(Lcom/android/billingclient/api/d;)Lc/b/a/a/d/c/a;

    move-result-object v7

    const-string v8, "inapp"

    invoke-interface {v7, v5, v3, v8}, Lc/b/a/a/d/c/a;->J(ILjava/lang/String;Ljava/lang/String;)I

    move-result v6

    if-nez v6, :cond_6

    goto :goto_5

    :cond_6
    add-int/lit8 v5, v5, -0x1

    goto :goto_4

    :cond_7
    const/4 v5, 0x0

    :goto_5
    iget-object v3, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v3, v3, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    if-lt v5, v4, :cond_8

    const/4 v4, 0x1

    goto :goto_6

    :cond_8
    const/4 v4, 0x0

    :goto_6
    invoke-static {v3, v4}, Lcom/android/billingclient/api/d;->A(Lcom/android/billingclient/api/d;Z)Z

    iget-object v3, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v3, v3, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    const/16 v4, 0xc

    if-lt v5, v4, :cond_9

    const/4 v4, 0x1

    goto :goto_7

    :cond_9
    const/4 v4, 0x0

    :goto_7
    invoke-static {v3, v4}, Lcom/android/billingclient/api/d;->C(Lcom/android/billingclient/api/d;Z)Z

    iget-object v3, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v3, v3, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    const/16 v4, 0xa

    if-lt v5, v4, :cond_a

    const/4 v4, 0x1

    goto :goto_8

    :cond_a
    const/4 v4, 0x0

    :goto_8
    invoke-static {v3, v4}, Lcom/android/billingclient/api/d;->D(Lcom/android/billingclient/api/d;Z)Z

    iget-object v3, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v3, v3, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    const/16 v4, 0x9

    if-lt v5, v4, :cond_b

    const/4 v4, 0x1

    goto :goto_9

    :cond_b
    const/4 v4, 0x0

    :goto_9
    invoke-static {v3, v4}, Lcom/android/billingclient/api/d;->F(Lcom/android/billingclient/api/d;Z)Z

    iget-object v3, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v3, v3, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    const/16 v4, 0x8

    if-lt v5, v4, :cond_c

    const/4 v4, 0x1

    goto :goto_a

    :cond_c
    const/4 v4, 0x0

    :goto_a
    invoke-static {v3, v4}, Lcom/android/billingclient/api/d;->G(Lcom/android/billingclient/api/d;Z)Z

    iget-object v3, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v3, v3, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    const/4 v4, 0x6

    if-lt v5, v4, :cond_d

    goto :goto_b

    :cond_d
    const/4 v9, 0x0

    :goto_b
    invoke-static {v3, v9}, Lcom/android/billingclient/api/d;->H(Lcom/android/billingclient/api/d;Z)Z

    if-ge v5, v0, :cond_e

    const-string v0, "BillingClient"

    const-string v3, "In-app billing API version 3 is not supported on this device."

    invoke-static {v0, v3}, Lc/b/a/a/d/c/b;->k(Ljava/lang/String;Ljava/lang/String;)V

    :cond_e
    if-nez v6, :cond_f

    iget-object v0, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v0, v0, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    const/4 v3, 0x2

    invoke-static {v0, v3}, Lcom/android/billingclient/api/d;->j(Lcom/android/billingclient/api/d;I)I

    goto :goto_c

    :cond_f
    iget-object v0, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v0, v0, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    invoke-static {v0, v1}, Lcom/android/billingclient/api/d;->j(Lcom/android/billingclient/api/d;I)I

    iget-object v0, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v0, v0, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    invoke-static {v0, v2}, Lcom/android/billingclient/api/d;->o(Lcom/android/billingclient/api/d;Lc/b/a/a/d/c/a;)Lc/b/a/a/d/c/a;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_c

    :catch_0
    move v0, v6

    :catch_1
    const-string v3, "BillingClient"

    const-string v4, "Exception while checking if billing is supported; try to reconnect"

    invoke-static {v3, v4}, Lc/b/a/a/d/c/b;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v3, v3, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    invoke-static {v3, v1}, Lcom/android/billingclient/api/d;->j(Lcom/android/billingclient/api/d;I)I

    iget-object v1, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    iget-object v1, v1, Lcom/android/billingclient/api/d$a;->d:Lcom/android/billingclient/api/d;

    invoke-static {v1, v2}, Lcom/android/billingclient/api/d;->o(Lcom/android/billingclient/api/d;Lc/b/a/a/d/c/a;)Lc/b/a/a/d/c/a;

    move v6, v0

    :goto_c
    iget-object v0, p0, Lcom/android/billingclient/api/r;->a:Lcom/android/billingclient/api/d$a;

    if-nez v6, :cond_10

    sget-object v1, Lcom/android/billingclient/api/u;->p:Lcom/android/billingclient/api/g;

    goto :goto_d

    :cond_10
    sget-object v1, Lcom/android/billingclient/api/u;->a:Lcom/android/billingclient/api/g;

    :goto_d
    invoke-static {v0, v1}, Lcom/android/billingclient/api/d$a;->c(Lcom/android/billingclient/api/d$a;Lcom/android/billingclient/api/g;)V

    return-object v2

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_f

    :goto_e
    throw v1

    :goto_f
    goto :goto_e
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-direct {p0}, Lcom/android/billingclient/api/r;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
