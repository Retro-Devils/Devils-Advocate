.class public Lcom/digdroid/alman/dig/ServerService;
.super Landroid/app/IntentService;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/ServerService$s;,
        Lcom/digdroid/alman/dig/ServerService$r;,
        Lcom/digdroid/alman/dig/ServerService$u;,
        Lcom/digdroid/alman/dig/ServerService$t;
    }
.end annotation


# static fields
.field public static b:Ljava/lang/String; = "https://digdroid.com/php"

.field private static c:Ljava/lang/Object; = null

.field private static d:Z = false

.field private static e:Ljava/lang/String; = ""


# instance fields
.field private f:Lcom/digdroid/alman/dig/b3;

.field g:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/digdroid/alman/dig/ServerService;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const-string v0, "ServerService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/IntentService;->setIntentRedelivery(Z)V

    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/ServerService;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/ServerService;->u()V

    return-void
.end method

.method static synthetic b(Lcom/digdroid/alman/dig/ServerService;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/digdroid/alman/dig/ServerService;->n(J)V

    return-void
.end method

.method static synthetic c()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/ServerService;->c:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic d()Z
    .locals 1

    sget-boolean v0, Lcom/digdroid/alman/dig/ServerService;->d:Z

    return v0
.end method

.method static synthetic e(Z)Z
    .locals 0

    sput-boolean p0, Lcom/digdroid/alman/dig/ServerService;->d:Z

    return p0
.end method

.method static synthetic f(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/digdroid/alman/dig/ServerService;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sput-object p0, Lcom/digdroid/alman/dig/ServerService;->e:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic g(Lcom/digdroid/alman/dig/ServerService;)Lcom/digdroid/alman/dig/b3;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/ServerService;->f:Lcom/digdroid/alman/dig/b3;

    return-object p0
.end method

.method static synthetic h(Lcom/digdroid/alman/dig/ServerService;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/ServerService;->k()V

    return-void
.end method

.method static synthetic i(Lcom/digdroid/alman/dig/ServerService;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/ServerService;->l()V

    return-void
.end method

.method public static j(Landroid/content/Context;JI)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ",{\"id\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ",\"badvideo\":"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "}"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/digdroid/alman/dig/ServerService;->r(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private k()V
    .locals 2

    sget-object v0, Lcom/digdroid/alman/dig/ServerService;->c:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    sput-boolean v1, Lcom/digdroid/alman/dig/ServerService;->d:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/ServerService;->l()V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method private l()V
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/ServerService;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    sget-object v0, Lcom/digdroid/alman/dig/ServerService;->e:Ljava/lang/String;

    invoke-static {p0, v0}, Lcom/digdroid/alman/dig/ServerService;->r(Landroid/content/Context;Ljava/lang/String;)V

    const-string v0, ""

    sput-object v0, Lcom/digdroid/alman/dig/ServerService;->e:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static m(Landroid/content/Context;Ljava/lang/String;J)V
    .locals 2

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/digdroid/alman/dig/ServerService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "gameid"

    invoke-virtual {v0, p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method private n(J)V
    .locals 4

    const-string v0, "0"

    :try_start_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/ServerService;->f:Lcom/digdroid/alman/dig/b3;

    const-string v2, "userid"

    invoke-virtual {v1, v2, v0}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/ServerService;->f:Lcom/digdroid/alman/dig/b3;

    const-string v3, "token"

    invoke-virtual {v2, v3, v0}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "{\"userid\":\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\",\"token\":\""

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\",\"gameid\":"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "}"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v0, Lcom/digdroid/alman/dig/ServerService;->b:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/gamestats.php"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lc/a/c/w/k;

    new-instance v1, Lcom/digdroid/alman/dig/ServerService$l;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/ServerService$l;-><init>(Lcom/digdroid/alman/dig/ServerService;)V

    new-instance v2, Lcom/digdroid/alman/dig/ServerService$m;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/ServerService$m;-><init>(Lcom/digdroid/alman/dig/ServerService;)V

    invoke-direct {v0, p1, p2, v1, v2}, Lc/a/c/w/k;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Lc/a/c/p$b;Lc/a/c/p$a;)V

    :try_start_1
    invoke-static {p0}, Lcom/digdroid/alman/dig/l2;->a(Landroid/content/Context;)Lc/a/c/o;

    move-result-object p1

    invoke-virtual {p1, v0}, Lc/a/c/o;->a(Lc/a/c/n;)Lc/a/c/n;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    return-void
.end method

.method public static q(Landroid/content/Context;JJ)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ",{\"id\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ",\"played\":"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "}"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/digdroid/alman/dig/ServerService;->r(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private static r(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lcom/digdroid/alman/dig/ServerService$t;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/ServerService$t;-><init>(Landroid/content/Context;)V

    const/4 p0, 0x1

    new-array p0, p0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, p0, v1

    invoke-virtual {v0, p0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public static s(Landroid/content/Context;JF)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ",{\"id\":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ",\"rating\":"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, "}"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/digdroid/alman/dig/ServerService;->r(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static t(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/digdroid/alman/dig/ServerService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    const-string p1, "ZZZ"

    invoke-static {p1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method private declared-synchronized u()V
    .locals 13

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/digdroid/alman/dig/ServerService;->c:Ljava/lang/Object;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-boolean v1, Lcom/digdroid/alman/dig/ServerService;->d:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/digdroid/alman/dig/ServerService;->f:Lcom/digdroid/alman/dig/b3;

    const-string v2, "sync_retry_next"

    const-wide/16 v3, 0x0

    invoke-virtual {v1, v2, v3, v4}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    cmp-long v7, v1, v5

    if-lez v7, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/ServerService;->f:Lcom/digdroid/alman/dig/b3;

    const-string v2, "sync_retry_next"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/32 v7, 0x1b7740

    add-long/2addr v5, v7

    invoke-virtual {v1, v2, v5, v6}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    const/4 v1, 0x1

    sput-boolean v1, Lcom/digdroid/alman/dig/ServerService;->d:Z

    invoke-virtual {p0}, Landroid/app/IntentService;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const/4 v5, 0x0

    if-nez v2, :cond_1

    sput-boolean v5, Lcom/digdroid/alman/dig/ServerService;->d:Z

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    new-instance v6, Ljava/io/File;

    const-string v7, "queue.json"

    invoke-direct {v6, v2, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    const-string v2, ","

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v7

    if-eqz v7, :cond_2

    new-instance v2, Ljava/io/FileReader;

    invoke-direct {v2, v6}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v6

    long-to-int v7, v6

    new-array v6, v7, [C

    invoke-virtual {v2, v6}, Ljava/io/FileReader;->read([C)I

    move-result v7

    invoke-virtual {v2}, Ljava/io/FileReader;->close()V

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v6, v5, v7}, Ljava/lang/String;-><init>([CII)V

    :cond_2
    iget-object v6, p0, Lcom/digdroid/alman/dig/ServerService;->f:Lcom/digdroid/alman/dig/b3;

    const-string v7, "userid"

    const-string v8, "0"

    invoke-virtual {v6, v7, v8}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/digdroid/alman/dig/ServerService;->f:Lcom/digdroid/alman/dig/b3;

    const-string v8, "token"

    const-string v9, "0"

    invoke-virtual {v7, v8, v9}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/digdroid/alman/dig/ServerService;->f:Lcom/digdroid/alman/dig/b3;

    const-string v9, "first_sync_t"

    invoke-virtual {v8, v9, v3, v4}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v3

    iget-object v8, p0, Lcom/digdroid/alman/dig/ServerService;->f:Lcom/digdroid/alman/dig/b3;

    const-string v9, "last_sync_t"

    const-wide/32 v10, 0x77359400

    invoke-virtual {v8, v9, v10, v11}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v8
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {p0}, Landroid/app/IntentService;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v10

    invoke-virtual {p0}, Landroid/app/IntentService;->getPackageName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v10

    iget v10, v10, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    :catch_0
    const/4 v10, 0x0

    :goto_0
    :try_start_5
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "{\"userid\":\""

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\",\"token\":\""

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\",\"version\":"

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ",\"updates\":["

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "],\"firstt\":"

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ",\"lastt\":"

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/digdroid/alman/dig/ServerService;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/sync.php"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lc/a/c/w/k;

    new-instance v3, Lcom/digdroid/alman/dig/ServerService$n;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/ServerService$n;-><init>(Lcom/digdroid/alman/dig/ServerService;)V

    new-instance v4, Lcom/digdroid/alman/dig/ServerService$o;

    invoke-direct {v4, p0}, Lcom/digdroid/alman/dig/ServerService$o;-><init>(Lcom/digdroid/alman/dig/ServerService;)V

    invoke-direct {v1, v0, v2, v3, v4}, Lc/a/c/w/k;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Lc/a/c/p$b;Lc/a/c/p$a;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    invoke-static {p0}, Lcom/digdroid/alman/dig/l2;->a(Landroid/content/Context;)Lc/a/c/o;

    move-result-object v0

    invoke-virtual {v0, v1}, Lc/a/c/o;->a(Lc/a/c/n;)Lc/a/c/n;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_1

    :catch_1
    :try_start_9
    invoke-direct {p0}, Lcom/digdroid/alman/dig/ServerService;->k()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :goto_1
    monitor-exit p0

    return-void

    :catch_2
    :try_start_a
    sput-boolean v5, Lcom/digdroid/alman/dig/ServerService;->d:Z

    monitor-exit v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    monitor-exit p0

    return-void

    :cond_3
    :goto_2
    :try_start_b
    monitor-exit v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v1

    :try_start_c
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :try_start_d
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public static v(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object p0

    const-string v0, "first_sync_t"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/b3;->I(Ljava/lang/String;)V

    const-string v0, "last_sync_t"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/b3;->I(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method o()V
    .locals 9

    const/4 v0, 0x1

    iput v0, p0, Lcom/digdroid/alman/dig/ServerService;->g:I

    :goto_0
    iget v0, p0, Lcom/digdroid/alman/dig/ServerService;->g:I

    if-lez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://api.thegamesdb.net/Games/ByPlatformID?id=23&fields=publishers,genres,overview&apikey=98d4ee59533bec49fd68e12987bd7e0649667f63cf560232a04b62228dd89578&page="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/digdroid/alman/dig/ServerService;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v0, Lcom/digdroid/alman/dig/ServerService$s;

    const/4 v4, 0x0

    new-instance v6, Lcom/digdroid/alman/dig/ServerService$g;

    invoke-direct {v6, p0}, Lcom/digdroid/alman/dig/ServerService$g;-><init>(Lcom/digdroid/alman/dig/ServerService;)V

    new-instance v7, Lcom/digdroid/alman/dig/ServerService$h;

    invoke-direct {v7, p0}, Lcom/digdroid/alman/dig/ServerService$h;-><init>(Lcom/digdroid/alman/dig/ServerService;)V

    const/4 v8, 0x0

    move-object v2, v0

    move-object v3, p0

    invoke-direct/range {v2 .. v8}, Lcom/digdroid/alman/dig/ServerService$s;-><init>(Lcom/digdroid/alman/dig/ServerService;ILjava/lang/String;Lc/a/c/p$b;Lc/a/c/p$a;Ljava/util/HashMap;)V

    invoke-static {p0}, Lcom/digdroid/alman/dig/l2;->a(Landroid/content/Context;)Lc/a/c/o;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc/a/c/o;->a(Lc/a/c/n;)Lc/a/c/n;

    const-wide/16 v0, 0x4e20

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onCreate()V
    .locals 1

    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/ServerService;->f:Lcom/digdroid/alman/dig/b3;

    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 4

    if-eqz p1, :cond_9

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/ServerService;->f:Lcom/digdroid/alman/dig/b3;

    const-string v3, "wifi_only"

    invoke-virtual {v2, v3, v1}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    if-eq v0, v1, :cond_2

    const/16 v1, 0x9

    if-eq v0, v1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    return-void

    :cond_3
    const-string v1, "com.digdroid.alman.dig.action.SYNC"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance p1, Lcom/digdroid/alman/dig/ServerService$i;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/ServerService$i;-><init>(Lcom/digdroid/alman/dig/ServerService;)V

    :goto_1
    invoke-static {p0, p1}, Lcom/digdroid/alman/dig/f;->g(Landroid/content/Context;Lcom/digdroid/alman/dig/f$g;)Lcom/digdroid/alman/dig/f;

    move-result-object p1

    :goto_2
    invoke-virtual {p1}, Lcom/digdroid/alman/dig/f;->d()V

    goto :goto_3

    :cond_4
    const-string v1, "com.digdroid.alman.dig.action.GAME_STATS"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v0, Lcom/digdroid/alman/dig/ServerService$j;

    invoke-direct {v0, p0, p1}, Lcom/digdroid/alman/dig/ServerService$j;-><init>(Lcom/digdroid/alman/dig/ServerService;Landroid/content/Intent;)V

    invoke-static {p0, v0}, Lcom/digdroid/alman/dig/f;->g(Landroid/content/Context;Lcom/digdroid/alman/dig/f$g;)Lcom/digdroid/alman/dig/f;

    move-result-object p1

    goto :goto_2

    :cond_5
    const-string p1, "com.digdroid.alman.dig.action.ATTESTED_SERVICES"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance p1, Lcom/digdroid/alman/dig/ServerService$k;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/ServerService$k;-><init>(Lcom/digdroid/alman/dig/ServerService;)V

    goto :goto_1

    :cond_6
    const-string p1, "com.digdroid.alman.dig.action.ATTEST"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    const/4 p1, 0x0

    goto :goto_1

    :cond_7
    const-string p1, "com.digdroid.alman.dig.action.GETTGDB"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/ServerService;->p()V

    goto :goto_3

    :cond_8
    const-string p1, "com.digdroid.alman.dig.action.GETMAME"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/ServerService;->o()V

    :cond_9
    :goto_3
    return-void
.end method

.method public p()V
    .locals 26

    move-object/from16 v7, p0

    invoke-virtual/range {p0 .. p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/z1;->b(Landroid/content/Context;)Lcom/digdroid/alman/dig/z1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z1;->c()Z

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z1;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/t1;->p(Landroid/content/Context;)Lcom/digdroid/alman/dig/t1;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v10

    const-string v0, "SELECT g._id,g.gdbid,s.slug FROM games as g,systems as s WHERE g.gdbid>=0 AND s._id=g.system AND (s.slug=\'3ds\')"

    const/4 v1, 0x0

    invoke-virtual {v8, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v11

    invoke-interface {v11}, Landroid/database/Cursor;->getCount()I

    move-result v0

    int-to-long v12, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "to get: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ZZX"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v14, Ljava/util/Random;

    invoke-direct {v14}, Ljava/util/Random;-><init>()V

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, v12, v0

    if-lez v2, :cond_4

    long-to-int v2, v12

    invoke-virtual {v14, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    invoke-interface {v11, v2}, Landroid/database/Cursor;->moveToPosition(I)Z

    const/4 v2, 0x1

    invoke-interface {v11, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    cmp-long v4, v2, v0

    if-gez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    invoke-interface {v11, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v4, 0x0

    aget-object v5, v10, v4

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, "/Server/Covers-lo/"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v6, v10, v4

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, "/Server/Covers-hi/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    :cond_1
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    if-nez v6, :cond_2

    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    :cond_2
    invoke-interface {v11, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    new-instance v15, Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-object/from16 v16, v10

    const-string v10, ".png"

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v15, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v6, Ljava/io/File;

    move-object/from16 v17, v11

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE games SET gdbid=-1 WHERE _id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    move-object/from16 v10, v16

    move-object/from16 v11, v17

    goto/16 :goto_0

    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "https://cdn.thegamesdb.net/images/original/boxart/front/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v10, "-1.jpg"

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "-1.png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v18

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v19, v4

    const-string v4, "https://cdn.thegamesdb.net/images/thumb/boxart/front/"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v21

    new-instance v22, Lcom/digdroid/alman/dig/ServerService$p;

    move-object/from16 v0, v22

    move-object/from16 v1, p0

    move-object/from16 v2, v21

    move-object v3, v8

    move-wide/from16 v4, v19

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/ServerService$p;-><init>(Lcom/digdroid/alman/dig/ServerService;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;J)V

    new-instance v23, Lcom/digdroid/alman/dig/ServerService$q;

    move-object/from16 v0, v23

    move-object v2, v9

    move-object v3, v6

    move-object v4, v8

    move-object/from16 v24, v6

    move-wide/from16 v5, v19

    invoke-direct/range {v0 .. v6}, Lcom/digdroid/alman/dig/ServerService$q;-><init>(Lcom/digdroid/alman/dig/ServerService;Lcom/digdroid/alman/dig/t1;Ljava/io/File;Landroid/database/sqlite/SQLiteDatabase;J)V

    new-instance v6, Lcom/digdroid/alman/dig/ServerService$s;

    const/4 v2, 0x0

    const/16 v25, 0x0

    move-object v0, v6

    move-object/from16 v3, v21

    move-object/from16 v4, v23

    move-object/from16 v5, v22

    move-wide/from16 v21, v12

    move-object v12, v6

    move-object/from16 v6, v25

    invoke-direct/range {v0 .. v6}, Lcom/digdroid/alman/dig/ServerService$s;-><init>(Lcom/digdroid/alman/dig/ServerService;ILjava/lang/String;Lc/a/c/p$b;Lc/a/c/p$a;Ljava/util/HashMap;)V

    new-instance v13, Lcom/digdroid/alman/dig/ServerService$a;

    move-object v0, v13

    move-object v2, v10

    move-object v3, v8

    move-wide/from16 v4, v19

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/ServerService$a;-><init>(Lcom/digdroid/alman/dig/ServerService;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;J)V

    new-instance v23, Lcom/digdroid/alman/dig/ServerService$b;

    move-object/from16 v0, v23

    move-object v2, v9

    move-object/from16 v3, v24

    move-object v4, v8

    move-wide/from16 v5, v19

    invoke-direct/range {v0 .. v6}, Lcom/digdroid/alman/dig/ServerService$b;-><init>(Lcom/digdroid/alman/dig/ServerService;Lcom/digdroid/alman/dig/t1;Ljava/io/File;Landroid/database/sqlite/SQLiteDatabase;J)V

    new-instance v6, Lcom/digdroid/alman/dig/ServerService$s;

    const/4 v2, 0x0

    const/16 v24, 0x0

    move-object v0, v6

    move-object v3, v10

    move-object/from16 v4, v23

    move-object v5, v13

    move-object v10, v6

    move-object/from16 v6, v24

    invoke-direct/range {v0 .. v6}, Lcom/digdroid/alman/dig/ServerService$s;-><init>(Lcom/digdroid/alman/dig/ServerService;ILjava/lang/String;Lc/a/c/p$b;Lc/a/c/p$a;Ljava/util/HashMap;)V

    new-instance v6, Lcom/digdroid/alman/dig/ServerService$c;

    move-object v0, v6

    move-object/from16 v2, v18

    move-object v3, v8

    move-wide/from16 v4, v19

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/ServerService$c;-><init>(Lcom/digdroid/alman/dig/ServerService;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;J)V

    new-instance v4, Lcom/digdroid/alman/dig/ServerService$d;

    invoke-direct {v4, v7, v9, v15, v12}, Lcom/digdroid/alman/dig/ServerService$d;-><init>(Lcom/digdroid/alman/dig/ServerService;Lcom/digdroid/alman/dig/t1;Ljava/io/File;Lcom/digdroid/alman/dig/ServerService$s;)V

    new-instance v12, Lcom/digdroid/alman/dig/ServerService$s;

    const/4 v2, 0x0

    const/4 v13, 0x0

    move-object v0, v12

    move-object/from16 v3, v18

    move-object v5, v6

    move-object v6, v13

    invoke-direct/range {v0 .. v6}, Lcom/digdroid/alman/dig/ServerService$s;-><init>(Lcom/digdroid/alman/dig/ServerService;ILjava/lang/String;Lc/a/c/p$b;Lc/a/c/p$a;Ljava/util/HashMap;)V

    new-instance v5, Lcom/digdroid/alman/dig/ServerService$e;

    invoke-direct {v5, v7, v11, v12}, Lcom/digdroid/alman/dig/ServerService$e;-><init>(Lcom/digdroid/alman/dig/ServerService;Ljava/lang/String;Lcom/digdroid/alman/dig/ServerService$s;)V

    new-instance v4, Lcom/digdroid/alman/dig/ServerService$f;

    invoke-direct {v4, v7, v9, v15, v10}, Lcom/digdroid/alman/dig/ServerService$f;-><init>(Lcom/digdroid/alman/dig/ServerService;Lcom/digdroid/alman/dig/t1;Ljava/io/File;Lcom/digdroid/alman/dig/ServerService$s;)V

    new-instance v10, Lcom/digdroid/alman/dig/ServerService$s;

    const/4 v6, 0x0

    move-object v0, v10

    move-object v3, v11

    invoke-direct/range {v0 .. v6}, Lcom/digdroid/alman/dig/ServerService$s;-><init>(Lcom/digdroid/alman/dig/ServerService;ILjava/lang/String;Lc/a/c/p$b;Lc/a/c/p$a;Ljava/util/HashMap;)V

    invoke-static/range {p0 .. p0}, Lcom/digdroid/alman/dig/l2;->a(Landroid/content/Context;)Lc/a/c/o;

    move-result-object v0

    invoke-virtual {v0, v10}, Lc/a/c/o;->a(Lc/a/c/n;)Lc/a/c/n;

    const-wide/16 v0, 0x2710

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-object/from16 v10, v16

    move-object/from16 v11, v17

    move-wide/from16 v12, v21

    goto/16 :goto_0

    :cond_4
    return-void
.end method
