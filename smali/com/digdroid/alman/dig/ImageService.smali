.class public Lcom/digdroid/alman/dig/ImageService;
.super Landroid/app/IntentService;
.source ""


# instance fields
.field private b:Lcom/digdroid/alman/dig/o;

.field private c:Lcom/digdroid/alman/dig/b3;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "ImageService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/IntentService;->setIntentRedelivery(Z)V

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/ImageService;

    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/digdroid/alman/dig/ImageService$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/ImageService$a;-><init>(Landroid/content/Context;)V

    invoke-static {p0, v1}, Lcom/digdroid/alman/dig/f;->g(Landroid/content/Context;Lcom/digdroid/alman/dig/f$g;)Lcom/digdroid/alman/dig/f;

    move-result-object p0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/f;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method public static declared-synchronized b(Landroid/content/Context;)V
    .locals 3

    const-class v0, Lcom/digdroid/alman/dig/ImageService;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/digdroid/alman/dig/ImageService;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "start"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    :catch_0
    :goto_0
    monitor-exit v0

    return-void
.end method

.method public static declared-synchronized c(Landroid/content/Context;)V
    .locals 3

    const-class v0, Lcom/digdroid/alman/dig/ImageService;

    monitor-enter v0

    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/digdroid/alman/dig/ImageService;

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "move"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    :catch_0
    :goto_0
    monitor-exit v0

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/o;->j(Landroid/content/Context;)Lcom/digdroid/alman/dig/o;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/ImageService;->b:Lcom/digdroid/alman/dig/o;

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/ImageService;->c:Lcom/digdroid/alman/dig/b3;

    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 4

    invoke-static {p0}, Lcom/digdroid/alman/dig/z3;->w(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_7

    if-eqz p1, :cond_7

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/ImageService;->c:Lcom/digdroid/alman/dig/b3;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/b3;->Q(Z)V

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v0, "rename"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/ImageService;->b:Lcom/digdroid/alman/dig/o;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/o;->p()V

    goto :goto_2

    :cond_0
    const-string v0, "start"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p1, p0, Lcom/digdroid/alman/dig/ImageService;->b:Lcom/digdroid/alman/dig/o;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/o;->l()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_6

    invoke-virtual {p1}, Landroid/net/NetworkInfo;->getType()I

    move-result p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/ImageService;->c:Lcom/digdroid/alman/dig/b3;

    const-string v3, "wifi_only"

    invoke-virtual {v0, v3, v1}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object p1, p0, Lcom/digdroid/alman/dig/ImageService;->b:Lcom/digdroid/alman/dig/o;

    :goto_1
    invoke-virtual {p1}, Lcom/digdroid/alman/dig/o;->h()Z

    move-result p1

    move v1, p1

    goto :goto_2

    :cond_2
    if-eq p1, v1, :cond_3

    const/16 v0, 0x9

    if-ne p1, v0, :cond_6

    :cond_3
    iget-object p1, p0, Lcom/digdroid/alman/dig/ImageService;->b:Lcom/digdroid/alman/dig/o;

    goto :goto_1

    :cond_4
    const-string v0, "get_moby"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p1, p0, Lcom/digdroid/alman/dig/ImageService;->b:Lcom/digdroid/alman/dig/o;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/o;->k()V

    goto :goto_2

    :cond_5
    const-string v0, "get_gamefaqs"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/digdroid/alman/dig/ImageService;->b:Lcom/digdroid/alman/dig/o;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/o;->e()V

    :cond_6
    :goto_2
    if-eqz v1, :cond_7

    iget-object p1, p0, Lcom/digdroid/alman/dig/ImageService;->c:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p1, v2}, Lcom/digdroid/alman/dig/b3;->Q(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_7
    return-void
.end method
