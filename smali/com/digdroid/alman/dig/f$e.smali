.class Lcom/digdroid/alman/dig/f$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/c/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f;->h(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/a/c/p$b<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/digdroid/alman/dig/f;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    iput-object p2, p0, Lcom/digdroid/alman/dig/f$e;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/f$e;->b(Lorg/json/JSONObject;)V

    return-void
.end method

.method public b(Lorg/json/JSONObject;)V
    .locals 5

    if-eqz p1, :cond_6

    :try_start_0
    const-string v0, "premium"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    iget-object v1, v1, Lcom/digdroid/alman/dig/f;->c:Landroid/content/Context;

    const-string v2, "premium"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/d0;->F(Landroid/content/Context;Lorg/json/JSONArray;)V

    :cond_0
    const-string v0, "themes"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    iget-object v0, v0, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/b3;

    const-string v1, "new_themes_updated"

    const-string v2, "themes"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    :cond_1
    const-string v0, "announcement"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    iget-object v0, v0, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/b3;

    const-string v1, "announcement"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/b3;->J(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    iget-object v0, v0, Lcom/digdroid/alman/dig/f;->c:Landroid/content/Context;

    if-eqz v0, :cond_2

    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    iget-object v2, v2, Lcom/digdroid/alman/dig/f;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "ANNOUNCEMENT"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    iget-object v1, v1, Lcom/digdroid/alman/dig/f;->c:Landroid/content/Context;

    invoke-static {v1}, Lb/n/a/a;->b(Landroid/content/Context;)Lb/n/a/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lb/n/a/a;->d(Landroid/content/Intent;)Z

    :cond_2
    const-string v0, "pass"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object p1, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    invoke-static {p1}, Lcom/digdroid/alman/dig/f;->b(Lcom/digdroid/alman/dig/f;)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/digdroid/alman/dig/f$e;->a:Ljava/lang/String;

    if-nez v0, :cond_4

    const-string v0, "userid"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    iget-object v1, v1, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/b3;

    const-string v2, "userid"

    invoke-virtual {v1, v2, v0}, Lcom/digdroid/alman/dig/b3;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    const-string v0, "token"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    iget-object v0, v0, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/b3;

    const-string v1, "token"

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->G(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    iget-object p1, p1, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/b3;

    const-string v0, "token_expires"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/32 v3, 0x7b98a00

    add-long/2addr v1, v3

    invoke-virtual {p1, v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    iget-object p1, p1, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/b3;

    const-string v0, "attest_retry_next"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    iget-object p1, p1, Lcom/digdroid/alman/dig/f;->f:Lcom/digdroid/alman/dig/b3;

    const-string v0, "attest_retry_in"

    const-wide/32 v1, 0x1b7740

    invoke-virtual {p1, v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    monitor-enter p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    iget-object v0, v0, Lcom/digdroid/alman/dig/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/digdroid/alman/dig/f$g;

    invoke-interface {v1}, Lcom/digdroid/alman/dig/f$g;->b()V

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    iget-object v0, v0, Lcom/digdroid/alman/dig/f;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/digdroid/alman/dig/f;->g:Z

    monitor-exit p1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/f$e;->b:Lcom/digdroid/alman/dig/f;

    invoke-static {p1}, Lcom/digdroid/alman/dig/f;->b(Lcom/digdroid/alman/dig/f;)V

    :cond_6
    :goto_1
    return-void
.end method
