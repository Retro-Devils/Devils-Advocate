.class Lcom/digdroid/alman/dig/v2$i;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/v2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/v2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v2$i;->a:Lcom/digdroid/alman/dig/v2;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 4

    iget-object p1, p0, Lcom/digdroid/alman/dig/v2$i;->a:Lcom/digdroid/alman/dig/v2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/v2;->b:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT mdbid,rating FROM roms WHERE _id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/v2$i;->a:Lcom/digdroid/alman/dig/v2;

    invoke-static {v1}, Lcom/digdroid/alman/dig/v2;->a(Lcom/digdroid/alman/dig/v2;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/v2$i;->a:Lcom/digdroid/alman/dig/v2;

    invoke-static {p1}, Lcom/digdroid/alman/dig/v2;->b(Lcom/digdroid/alman/dig/v2;)Lcom/digdroid/alman/dig/v2$j;

    move-result-object p1

    invoke-interface {p1, v2}, Lcom/digdroid/alman/dig/v2$j;->a(Z)V

    return-object v1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/v2$i;->a:Lcom/digdroid/alman/dig/v2;

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/digdroid/alman/dig/v2;->d(Lcom/digdroid/alman/dig/v2;J)J

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/digdroid/alman/dig/v2$i;->a:Lcom/digdroid/alman/dig/v2;

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    iput v0, v2, Lcom/digdroid/alman/dig/v2;->g:F

    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object v1
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/v2$i;->a:Lcom/digdroid/alman/dig/v2;

    invoke-static {p1}, Lcom/digdroid/alman/dig/v2;->e(Lcom/digdroid/alman/dig/v2;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/digdroid/alman/dig/v2$i;->a:Lcom/digdroid/alman/dig/v2;

    invoke-static {p1}, Lcom/digdroid/alman/dig/v2;->e(Lcom/digdroid/alman/dig/v2;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/v2$i;->a:Lcom/digdroid/alman/dig/v2;

    iget-boolean v0, p1, Lcom/digdroid/alman/dig/v2;->c:Z

    if-eqz v0, :cond_1

    iget v0, p1, Lcom/digdroid/alman/dig/v2;->g:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1

    invoke-static {p1}, Lcom/digdroid/alman/dig/v2;->b(Lcom/digdroid/alman/dig/v2;)Lcom/digdroid/alman/dig/v2$j;

    move-result-object p1

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/digdroid/alman/dig/v2$j;->a(Z)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/digdroid/alman/dig/v2;->g()V

    :cond_2
    :goto_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/v2$i;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/v2$i;->b(Ljava/lang/Void;)V

    return-void
.end method
