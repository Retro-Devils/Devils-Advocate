.class Lcom/digdroid/alman/dig/m0$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/m0;->c(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/m0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/m0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/m0$g;->b:Lcom/digdroid/alman/dig/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$g;->b:Lcom/digdroid/alman/dig/m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "SELECT mdbid FROM roms WHERE _id="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0$g;->b:Lcom/digdroid/alman/dig/m0;

    iget-wide v0, v0, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-eqz p2, :cond_2

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_2

    iget-object v5, p0, Lcom/digdroid/alman/dig/m0$g;->b:Lcom/digdroid/alman/dig/m0;

    iget-object v5, v5, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    invoke-static {v5}, Lcom/digdroid/alman/dig/z1;->b(Landroid/content/Context;)Lcom/digdroid/alman/dig/z1;

    move-result-object v5

    invoke-virtual {v5}, Lcom/digdroid/alman/dig/z1;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "SELECT youtube FROM games WHERE _id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1, p2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    new-instance p2, Landroid/content/ContentValues;

    invoke-direct {p2}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "youtube"

    cmp-long v7, v5, v3

    if-nez v7, :cond_0

    :catch_0
    invoke-virtual {p2, v2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-static {v5, v6}, Lcom/digdroid/alman/dig/y3;->q(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v2, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iget-object v2, p0, Lcom/digdroid/alman/dig/m0$g;->b:Lcom/digdroid/alman/dig/m0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "_id="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/digdroid/alman/dig/m0$g;->b:Lcom/digdroid/alman/dig/m0;

    iget-wide v4, v4, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "roms"

    invoke-virtual {v2, v4, p2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    iget-object p2, p0, Lcom/digdroid/alman/dig/m0$g;->b:Lcom/digdroid/alman/dig/m0;

    iget-object p2, p2, Lcom/digdroid/alman/dig/m0;->d:Lcom/digdroid/alman/dig/m0$p;

    invoke-interface {p2}, Lcom/digdroid/alman/dig/m0$p;->b()V

    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-void
.end method
