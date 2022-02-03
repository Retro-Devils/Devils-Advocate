.class Lcom/digdroid/alman/dig/f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/f$g;
    }
.end annotation


# static fields
.field private static a:Ljava/lang/String; = "AIzaSyCjUGS0FaPsJExUR4cgeYG8R9-t4hGQMM8"

.field private static b:Lcom/digdroid/alman/dig/f;


# instance fields
.field c:Landroid/content/Context;

.field d:Lc/a/a/o;

.field e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/digdroid/alman/dig/f$g;",
            ">;"
        }
    .end annotation
.end field

.field f:Lcom/digdroid/alman/dig/c3;

.field g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/f;->c:Landroid/content/Context;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/f;->e:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/f;->g:Z

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/f;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/m2;->a(Landroid/content/Context;)Lc/a/a/o;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/f;->d:Lc/a/a/o;

    iget-object p1, p0, Lcom/digdroid/alman/dig/f;->c:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/c3;

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/f;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/f;->e(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/digdroid/alman/dig/f;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/f;->f()V

    return-void
.end method

.method static synthetic c(Lcom/digdroid/alman/dig/f;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/f;->h(Ljava/lang/String;)V

    return-void
.end method

.method private e(Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Lcom/digdroid/alman/dig/a4;->l(Ljava/lang/String;)[B

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/f;->c:Landroid/content/Context;

    invoke-static {v0}, Lc/b/a/a/e/c;->a(Landroid/content/Context;)Lc/b/a/a/e/e;

    move-result-object v0

    sget-object v1, Lcom/digdroid/alman/dig/f;->a:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Lc/b/a/a/e/e;->j([BLjava/lang/String;)Lc/b/a/a/g/d;

    move-result-object p1

    new-instance v0, Lcom/digdroid/alman/dig/f$d;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/f$d;-><init>(Lcom/digdroid/alman/dig/f;)V

    invoke-virtual {p1, v0}, Lc/b/a/a/g/d;->c(Lc/b/a/a/g/b;)Lc/b/a/a/g/d;

    move-result-object p1

    new-instance v0, Lcom/digdroid/alman/dig/f$c;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/f$c;-><init>(Lcom/digdroid/alman/dig/f;)V

    invoke-virtual {p1, v0}, Lc/b/a/a/g/d;->a(Lc/b/a/a/g/a;)Lc/b/a/a/g/d;

    return-void
.end method

.method private declared-synchronized f()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/digdroid/alman/dig/f$g;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/f$g;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/f;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method public static declared-synchronized g(Landroid/content/Context;Lcom/digdroid/alman/dig/f$g;)Lcom/digdroid/alman/dig/f;
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/f;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/digdroid/alman/dig/f;->b:Lcom/digdroid/alman/dig/f;

    if-nez v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/f;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/f;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/digdroid/alman/dig/f;->b:Lcom/digdroid/alman/dig/f;

    :cond_0
    sget-object p0, Lcom/digdroid/alman/dig/f;->b:Lcom/digdroid/alman/dig/f;

    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v1, Lcom/digdroid/alman/dig/f;->b:Lcom/digdroid/alman/dig/f;

    iget-object v1, v1, Lcom/digdroid/alman/dig/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object p0, Lcom/digdroid/alman/dig/f;->b:Lcom/digdroid/alman/dig/f;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private h(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/c3;

    const-string v1, "userid"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/digdroid/alman/dig/ServerService;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v0, :cond_0

    const-string v3, "/newuser2.php"

    goto :goto_0

    :cond_0
    const-string v3, "/refreshuser2.php"

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const-string v4, "jws"

    invoke-virtual {v3, v4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_1

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    new-instance p1, Lc/a/a/w/k;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v3}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    new-instance v3, Lcom/digdroid/alman/dig/f$e;

    invoke-direct {v3, p0, v0}, Lcom/digdroid/alman/dig/f$e;-><init>(Lcom/digdroid/alman/dig/f;Ljava/lang/String;)V

    new-instance v0, Lcom/digdroid/alman/dig/f$f;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/f$f;-><init>(Lcom/digdroid/alman/dig/f;)V

    invoke-direct {p1, v2, v1, v3, v0}, Lc/a/a/w/k;-><init>(Ljava/lang/String;Lorg/json/JSONObject;Lc/a/a/p$b;Lc/a/a/p$a;)V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, v0}, Lc/a/a/n;->L(Z)Lc/a/a/n;

    iget-object v0, p0, Lcom/digdroid/alman/dig/f;->d:Lc/a/a/o;

    invoke-virtual {v0, p1}, Lc/a/a/o;->a(Lc/a/a/n;)Lc/a/a/n;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-direct {p0}, Lcom/digdroid/alman/dig/f;->f()V

    :goto_1
    return-void
.end method


# virtual methods
.method public declared-synchronized d()V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/f;->c:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    monitor-enter p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/c3;

    const-string v1, "token"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x20

    const-wide/16 v2, 0x0

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/c3;

    const-string v1, "token_expires"

    invoke-virtual {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->n(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    cmp-long v6, v0, v4

    if-lez v6, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/digdroid/alman/dig/f$g;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/f$g;->b()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :try_start_3
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/f;->g:Z

    if-eqz v0, :cond_3

    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :cond_3
    const/4 v0, 0x1

    :try_start_4
    iput-boolean v0, p0, Lcom/digdroid/alman/dig/f;->g:Z

    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v0, p0, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/c3;

    const-string v1, "attest_retry_next"

    invoke-virtual {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->n(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-lez v4, :cond_4

    invoke-direct {p0}, Lcom/digdroid/alman/dig/f;->f()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    monitor-exit p0

    return-void

    :cond_4
    :try_start_6
    iget-object v0, p0, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/c3;

    const-string v1, "attest_retry_in"

    const-wide/32 v2, 0x1b7740

    invoke-virtual {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->n(Ljava/lang/String;J)J

    move-result-wide v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/c3;

    const-string v3, "attest_retry_next"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    add-long/2addr v4, v0

    invoke-virtual {v2, v3, v4, v5}, Lcom/digdroid/alman/dig/c3;->F(Ljava/lang/String;J)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/c3;

    const-string v3, "attest_retry_in"

    const-wide/16 v4, 0x2

    mul-long v0, v0, v4

    const-wide/32 v4, 0x7b98a00

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-virtual {v2, v3, v0, v1}, Lcom/digdroid/alman/dig/c3;->F(Ljava/lang/String;J)V

    invoke-static {}, Lc/b/a/a/b/d;->k()Lc/b/a/a/b/d;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/f;->c:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lc/b/a/a/b/d;->e(Landroid/content/Context;)I

    move-result v0

    if-eqz v0, :cond_5

    invoke-direct {p0}, Lcom/digdroid/alman/dig/f;->f()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    monitor-exit p0

    return-void

    :cond_5
    :try_start_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/digdroid/alman/dig/ServerService;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/gettoken.php"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lc/a/a/w/n;

    const/4 v2, 0x0

    new-instance v3, Lcom/digdroid/alman/dig/f$a;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/f$a;-><init>(Lcom/digdroid/alman/dig/f;)V

    new-instance v4, Lcom/digdroid/alman/dig/f$b;

    invoke-direct {v4, p0}, Lcom/digdroid/alman/dig/f$b;-><init>(Lcom/digdroid/alman/dig/f;)V

    invoke-direct {v1, v2, v0, v3, v4}, Lc/a/a/w/n;-><init>(ILjava/lang/String;Lc/a/a/p$b;Lc/a/a/p$a;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    iget-object v0, p0, Lcom/digdroid/alman/dig/f;->d:Lc/a/a/o;

    invoke-virtual {v0, v1}, Lc/a/a/o;->a(Lc/a/a/n;)Lc/a/a/n;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    goto :goto_1

    :catch_0
    :try_start_9
    invoke-direct {p0}, Lcom/digdroid/alman/dig/f;->f()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :try_start_b
    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method
