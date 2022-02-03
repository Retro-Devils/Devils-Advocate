.class Lcom/digdroid/alman/dig/b0$b$b;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/b0$b;->b(Ljava/lang/Void;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/b0$b;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/b0$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0$b$b;->a:Lcom/digdroid/alman/dig/b0$b;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Long;
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$b$b;->a:Lcom/digdroid/alman/dig/b0$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/b0$b;->d:Lcom/digdroid/alman/dig/b0;

    invoke-static {p1}, Lcom/digdroid/alman/dig/b0;->d(Lcom/digdroid/alman/dig/b0;)Lcom/digdroid/alman/dig/u;

    move-result-object p1

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT mdbid FROM roms WHERE _id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0$b$b;->a:Lcom/digdroid/alman/dig/b0$b;

    iget-wide v1, v1, Lcom/digdroid/alman/dig/b0$b;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, -0x1

    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method protected b(Ljava/lang/Long;)V
    .locals 5

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0$b$b;->a:Lcom/digdroid/alman/dig/b0$b;

    iget-object v0, v0, Lcom/digdroid/alman/dig/b0$b;->c:Landroid/app/Activity;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$b$b;->a:Lcom/digdroid/alman/dig/b0$b;

    iget-wide v3, p1, Lcom/digdroid/alman/dig/b0$b;->b:J

    invoke-static {v0, v1, v2, v3, v4}, Lcom/digdroid/alman/dig/ServerService;->q(Landroid/content/Context;JJ)V

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$b$b;->a:Lcom/digdroid/alman/dig/b0$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/b0$b;->d:Lcom/digdroid/alman/dig/b0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/b0;->j:Lcom/digdroid/alman/dig/b0$l;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/digdroid/alman/dig/b0$l;->a()V

    :cond_1
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/b0$b$b;->a([Ljava/lang/Void;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/b0$b$b;->b(Ljava/lang/Long;)V

    return-void
.end method
