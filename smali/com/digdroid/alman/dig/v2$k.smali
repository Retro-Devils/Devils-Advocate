.class Lcom/digdroid/alman/dig/v2$k;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/v2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Float;",
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

    iput-object p1, p0, Lcom/digdroid/alman/dig/v2$k;->a:Lcom/digdroid/alman/dig/v2;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Float;)Ljava/lang/Void;
    .locals 11

    const/4 v0, 0x0

    aget-object v1, p1, v0

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x1

    aget-object p1, p1, v2

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v3, p0, Lcom/digdroid/alman/dig/v2$k;->a:Lcom/digdroid/alman/dig/v2;

    invoke-static {v3}, Lcom/digdroid/alman/dig/v2;->c(Lcom/digdroid/alman/dig/v2;)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    cmp-long v9, v3, v5

    if-ltz v9, :cond_4

    iget-object v3, p0, Lcom/digdroid/alman/dig/v2$k;->a:Lcom/digdroid/alman/dig/v2;

    iget-object v3, v3, Lcom/digdroid/alman/dig/v2;->b:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "SELECT c_rating,c_rating_count FROM roms WHERE mdbid="

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lcom/digdroid/alman/dig/v2$k;->a:Lcom/digdroid/alman/dig/v2;

    invoke-static {v9}, Lcom/digdroid/alman/dig/v2;->c(Lcom/digdroid/alman/dig/v2;)J

    move-result-wide v9

    invoke-virtual {v4, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    invoke-interface {v3, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getFloat(I)F

    move-result v0

    int-to-float v4, v2

    mul-float v0, v0, v4

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    cmpl-float v3, v1, v8

    if-ltz v3, :cond_1

    if-lez v2, :cond_1

    sub-float/2addr v0, v1

    cmpg-float v1, v0, v8

    if-gez v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    add-int/lit8 v2, v2, -0x1

    :cond_1
    cmpl-float v1, p1, v8

    if-ltz v1, :cond_2

    add-float/2addr v0, p1

    add-int/lit8 v2, v2, 0x1

    :cond_2
    if-lez v2, :cond_3

    int-to-float v1, v2

    div-float/2addr v0, v1

    :cond_3
    iget-object v1, p0, Lcom/digdroid/alman/dig/v2$k;->a:Lcom/digdroid/alman/dig/v2;

    iget-object v1, v1, Lcom/digdroid/alman/dig/v2;->b:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "UPDATE roms SET c_rating="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ",c_rating_count="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " WHERE mdbid="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/v2$k;->a:Lcom/digdroid/alman/dig/v2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/v2;->c(Lcom/digdroid/alman/dig/v2;)J

    move-result-wide v9

    invoke-virtual {v3, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_4
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "rating"

    cmpg-float v2, p1, v8

    if-gez v2, :cond_5

    invoke-virtual {v0, v1, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    goto :goto_0

    :cond_5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Float;)V

    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/v2$k;->a:Lcom/digdroid/alman/dig/v2;

    invoke-static {p1}, Lcom/digdroid/alman/dig/v2;->c(Lcom/digdroid/alman/dig/v2;)J

    move-result-wide v1

    const-string p1, "roms"

    cmp-long v3, v1, v5

    iget-object v1, p0, Lcom/digdroid/alman/dig/v2$k;->a:Lcom/digdroid/alman/dig/v2;

    iget-object v1, v1, Lcom/digdroid/alman/dig/v2;->b:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v2, Ljava/lang/StringBuilder;

    if-ltz v3, :cond_6

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mdbid="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/digdroid/alman/dig/v2$k;->a:Lcom/digdroid/alman/dig/v2;

    invoke-static {v3}, Lcom/digdroid/alman/dig/v2;->c(Lcom/digdroid/alman/dig/v2;)J

    move-result-wide v3

    goto :goto_1

    :cond_6
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "_id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/digdroid/alman/dig/v2$k;->a:Lcom/digdroid/alman/dig/v2;

    invoke-static {v3}, Lcom/digdroid/alman/dig/v2;->a(Lcom/digdroid/alman/dig/v2;)J

    move-result-wide v3

    :goto_1
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v0, v2, v7}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    return-object v7
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/v2$k;->a:Lcom/digdroid/alman/dig/v2;

    invoke-static {p1}, Lcom/digdroid/alman/dig/v2;->e(Lcom/digdroid/alman/dig/v2;)Ljava/lang/ref/WeakReference;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "request_refresh"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lb/n/a/a;->b(Landroid/content/Context;)Lb/n/a/a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lb/n/a/a;->d(Landroid/content/Intent;)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/v2$k;->a:Lcom/digdroid/alman/dig/v2;

    invoke-static {p1}, Lcom/digdroid/alman/dig/v2;->b(Lcom/digdroid/alman/dig/v2;)Lcom/digdroid/alman/dig/v2$j;

    move-result-object p1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/digdroid/alman/dig/v2$j;->a(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Float;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/v2$k;->a([Ljava/lang/Float;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/v2$k;->b(Ljava/lang/Void;)V

    return-void
.end method
