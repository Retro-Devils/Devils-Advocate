.class Lcom/digdroid/alman/dig/t0$j$a$a$a;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t0$j$a$a;->a(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Landroid/database/Cursor;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/digdroid/alman/dig/t0$j$a$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t0$j$a$a;J)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t0$j$a$a$a;->b:Lcom/digdroid/alman/dig/t0$j$a$a;

    iput-wide p2, p0, Lcom/digdroid/alman/dig/t0$j$a$a$a;->a:J

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Landroid/database/Cursor;)Ljava/lang/Void;
    .locals 8

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    :cond_0
    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    iget-object v1, p0, Lcom/digdroid/alman/dig/t0$j$a$a$a;->b:Lcom/digdroid/alman/dig/t0$j$a$a;

    iget-object v1, v1, Lcom/digdroid/alman/dig/t0$j$a$a;->a:Lcom/digdroid/alman/dig/t0$j$a;

    iget-object v1, v1, Lcom/digdroid/alman/dig/t0$j$a;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SELECT _id FROM gamecollection WHERE collection="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v6, p0, Lcom/digdroid/alman/dig/t0$j$a$a$a;->a:J

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " AND game="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v5

    if-nez v5, :cond_1

    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    iget-wide v6, p0, Lcom/digdroid/alman/dig/t0$j$a$a$a;->a:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v7, "collection"

    invoke-virtual {v5, v7, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "game"

    invoke-virtual {v5, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v3, p0, Lcom/digdroid/alman/dig/t0$j$a$a$a;->b:Lcom/digdroid/alman/dig/t0$j$a$a;

    iget-object v3, v3, Lcom/digdroid/alman/dig/t0$j$a$a;->a:Lcom/digdroid/alman/dig/t0$j$a;

    iget-object v3, v3, Lcom/digdroid/alman/dig/t0$j$a;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v4, "gamecollection"

    invoke-virtual {v3, v4, v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object v2
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0$j$a$a$a;->b:Lcom/digdroid/alman/dig/t0$j$a$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t0$j$a$a;->a:Lcom/digdroid/alman/dig/t0$j$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t0$j$a;->d:Lcom/digdroid/alman/dig/t0$j;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t0$j;->a:Lcom/digdroid/alman/dig/t0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->R()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0$j$a$a$a;->b:Lcom/digdroid/alman/dig/t0$j$a$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t0$j$a$a;->a:Lcom/digdroid/alman/dig/t0$j$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t0$j$a;->d:Lcom/digdroid/alman/dig/t0$j;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t0$j;->a:Lcom/digdroid/alman/dig/t0;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/r1;->G2(Z)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Landroid/database/Cursor;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t0$j$a$a$a;->a([Landroid/database/Cursor;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t0$j$a$a$a;->b(Ljava/lang/Void;)V

    return-void
.end method
