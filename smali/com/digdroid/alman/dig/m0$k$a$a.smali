.class Lcom/digdroid/alman/dig/m0$k$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/m0$o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/m0$k$a;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/m0$k$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/m0$k$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/m0$k$a$a;->a:Lcom/digdroid/alman/dig/m0$k$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0$k$a$a;->a:Lcom/digdroid/alman/dig/m0$k$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/m0$k$a;->c:Lcom/digdroid/alman/dig/m0$k;

    iget-object v0, v0, Lcom/digdroid/alman/dig/m0$k;->a:Lcom/digdroid/alman/dig/m0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT _id FROM gamecollection WHERE collection="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " AND game="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/m0$k$a$a;->a:Lcom/digdroid/alman/dig/m0$k$a;

    iget-object v2, v2, Lcom/digdroid/alman/dig/m0$k$a;->c:Lcom/digdroid/alman/dig/m0$k;

    iget-object v2, v2, Lcom/digdroid/alman/dig/m0$k;->a:Lcom/digdroid/alman/dig/m0;

    iget-wide v2, v2, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "collection"

    invoke-virtual {v1, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$k$a$a;->a:Lcom/digdroid/alman/dig/m0$k$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$k$a;->c:Lcom/digdroid/alman/dig/m0$k;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$k;->a:Lcom/digdroid/alman/dig/m0;

    iget-wide p1, p1, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "game"

    invoke-virtual {v1, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$k$a$a;->a:Lcom/digdroid/alman/dig/m0$k$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$k$a;->c:Lcom/digdroid/alman/dig/m0$k;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$k;->a:Lcom/digdroid/alman/dig/m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string p2, "gamecollection"

    invoke-virtual {p1, p2, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$k$a$a;->a:Lcom/digdroid/alman/dig/m0$k$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$k$a;->c:Lcom/digdroid/alman/dig/m0$k;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$k;->a:Lcom/digdroid/alman/dig/m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0;->d:Lcom/digdroid/alman/dig/m0$p;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/m0$p;->b()V

    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-void
.end method
