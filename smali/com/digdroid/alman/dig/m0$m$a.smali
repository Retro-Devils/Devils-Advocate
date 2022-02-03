.class Lcom/digdroid/alman/dig/m0$m$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/m0$m;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/m0$m;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/m0$m;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/m0$m$a;->b:Lcom/digdroid/alman/dig/m0$m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$m$a;->b:Lcom/digdroid/alman/dig/m0$m;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0$m;->a:Lcom/digdroid/alman/dig/m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "SELECT  p.path,r.filename FROM rompaths as p,roms as r WHERE r._id="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0$m$a;->b:Lcom/digdroid/alman/dig/m0$m;

    iget-object v0, v0, Lcom/digdroid/alman/dig/m0$m;->a:Lcom/digdroid/alman/dig/m0;

    iget-wide v0, v0, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " AND p._id=r.pathid"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/digdroid/alman/dig/m0$m$a;->b:Lcom/digdroid/alman/dig/m0$m;

    iget-object v1, v1, Lcom/digdroid/alman/dig/m0$m;->a:Lcom/digdroid/alman/dig/m0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UPDATE roms SET merged_with=-1 WHERE merged_with="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/digdroid/alman/dig/m0$m$a;->b:Lcom/digdroid/alman/dig/m0$m;

    iget-object v3, v3, Lcom/digdroid/alman/dig/m0$m;->a:Lcom/digdroid/alman/dig/m0;

    iget-wide v3, v3, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/m0$m$a;->b:Lcom/digdroid/alman/dig/m0$m;

    iget-object v1, v1, Lcom/digdroid/alman/dig/m0$m;->a:Lcom/digdroid/alman/dig/m0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DELETE FROM roms WHERE _id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/digdroid/alman/dig/m0$m$a;->b:Lcom/digdroid/alman/dig/m0$m;

    iget-object v3, v3, Lcom/digdroid/alman/dig/m0$m;->a:Lcom/digdroid/alman/dig/m0;

    iget-wide v3, v3, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/m0$m$a;->b:Lcom/digdroid/alman/dig/m0$m;

    iget-object v1, v1, Lcom/digdroid/alman/dig/m0$m;->a:Lcom/digdroid/alman/dig/m0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DELETE FROM gamegenres WHERE game="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/digdroid/alman/dig/m0$m$a;->b:Lcom/digdroid/alman/dig/m0$m;

    iget-object v3, v3, Lcom/digdroid/alman/dig/m0$m;->a:Lcom/digdroid/alman/dig/m0;

    iget-wide v3, v3, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/m0$m$a;->b:Lcom/digdroid/alman/dig/m0$m;

    iget-object v1, v1, Lcom/digdroid/alman/dig/m0$m;->a:Lcom/digdroid/alman/dig/m0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    const-string v2, "merge_games"

    invoke-static {v1, v2}, Lcom/digdroid/alman/dig/DatabaseService;->t(Landroid/content/Context;Ljava/lang/String;)V

    :cond_1
    new-instance v1, Landroidx/appcompat/app/b$a;

    iget-object v2, p0, Lcom/digdroid/alman/dig/m0$m$a;->b:Lcom/digdroid/alman/dig/m0$m;

    iget-object v2, v2, Lcom/digdroid/alman/dig/m0$m;->a:Lcom/digdroid/alman/dig/m0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    if-eqz v0, :cond_2

    const v2, 0x7f1100c2

    goto :goto_1

    :cond_2
    const v2, 0x7f1100bd

    :goto_1
    invoke-virtual {v1, v2}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v1

    const v2, 0x7f1101d8

    new-instance v3, Lcom/digdroid/alman/dig/m0$m$a$a;

    invoke-direct {v3, p0, v0}, Lcom/digdroid/alman/dig/m0$m$a$a;-><init>(Lcom/digdroid/alman/dig/m0$m$a;Z)V

    invoke-virtual {v1, v2, v3}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Dialog;->show()V

    :cond_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-void
.end method
