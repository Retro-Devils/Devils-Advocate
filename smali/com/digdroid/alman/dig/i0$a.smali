.class Lcom/digdroid/alman/dig/i0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/c/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/i0;->j3(Lcom/digdroid/alman/dig/c4$b;)V
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
.field final synthetic a:Lcom/digdroid/alman/dig/c4$b;

.field final synthetic b:Lcom/digdroid/alman/dig/i0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/i0;Lcom/digdroid/alman/dig/c4$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/i0$a;->b:Lcom/digdroid/alman/dig/i0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/i0$a;->a:Lcom/digdroid/alman/dig/c4$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/i0$a;->b(Lorg/json/JSONObject;)V

    return-void
.end method

.method public b(Lorg/json/JSONObject;)V
    .locals 3

    if-eqz p1, :cond_0

    const-string v0, "status"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "ok"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/i0$a;->b:Lcom/digdroid/alman/dig/i0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE roms SET forumcreated=1 WHERE mdbid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/i0$a;->b:Lcom/digdroid/alman/dig/i0;

    iget-wide v1, v1, Lcom/digdroid/alman/dig/i0;->q0:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/i0$a;->a:Lcom/digdroid/alman/dig/c4$b;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/c4$b;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method
