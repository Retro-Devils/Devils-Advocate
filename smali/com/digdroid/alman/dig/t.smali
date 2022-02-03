.class public Lcom/digdroid/alman/dig/t;
.super Landroidx/appcompat/app/c;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/b0$j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/t$b;,
        Lcom/digdroid/alman/dig/t$a;
    }
.end annotation


# instance fields
.field A:Lcom/digdroid/alman/dig/t1;

.field B:J

.field C:J

.field D:Ljava/lang/String;

.field E:Z

.field u:Lcom/digdroid/alman/dig/u;

.field v:Lcom/digdroid/alman/dig/z1;

.field w:Lcom/digdroid/alman/dig/b3;

.field x:Lcom/digdroid/alman/dig/o0;

.field y:Lcom/digdroid/alman/dig/g3;

.field z:Lcom/digdroid/alman/dig/b0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t;->u:Lcom/digdroid/alman/dig/u;

    iput-object v0, p0, Lcom/digdroid/alman/dig/t;->v:Lcom/digdroid/alman/dig/z1;

    return-void
.end method


# virtual methods
.method V0()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t;->u:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->u:Lcom/digdroid/alman/dig/u;

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/g3;->q(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/g3;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t;->y:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/g3;->e()V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->u:Lcom/digdroid/alman/dig/u;

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/o0;->g(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/o0;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t;->x:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t;->y:Lcom/digdroid/alman/dig/g3;

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->x:Lcom/digdroid/alman/dig/o0;

    invoke-static {v0, v1, v2}, Lcom/digdroid/alman/dig/b0;->n(Landroid/content/Context;Lcom/digdroid/alman/dig/g3;Lcom/digdroid/alman/dig/o0;)Lcom/digdroid/alman/dig/b0;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t;->z:Lcom/digdroid/alman/dig/b0;

    invoke-virtual {v0, p0}, Lcom/digdroid/alman/dig/b0;->y(Lcom/digdroid/alman/dig/b0$j;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->u:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->h()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->x:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/o0;->o()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->y:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/g3;->B()V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/t1;->p(Landroid/content/Context;)Lcom/digdroid/alman/dig/t1;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t;->A:Lcom/digdroid/alman/dig/t1;

    return-void
.end method

.method W0()Z
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const-string v2, "data_version"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/b3;->l(Ljava/lang/String;I)I

    move-result v1

    const/16 v4, 0x1c8

    if-ge v1, v4, :cond_0

    iget-object v5, v0, Lcom/digdroid/alman/dig/t;->A:Lcom/digdroid/alman/dig/t1;

    invoke-virtual {v5}, Lcom/digdroid/alman/dig/t1;->A()V

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/digdroid/alman/dig/z1;->b(Landroid/content/Context;)Lcom/digdroid/alman/dig/z1;

    move-result-object v5

    iput-object v5, v0, Lcom/digdroid/alman/dig/t;->v:Lcom/digdroid/alman/dig/z1;

    invoke-virtual {v5}, Lcom/digdroid/alman/dig/z1;->c()Z

    move-result v5

    if-nez v5, :cond_1

    return v3

    :cond_1
    const/16 v5, 0x110

    const/4 v6, 0x1

    if-ge v1, v5, :cond_2

    iget-object v5, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const-string v7, "sdcard_path"

    const-string v8, ""

    invoke-virtual {v5, v7, v8}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    iget-object v7, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const-string v8, "num_storage_dirs"

    invoke-virtual {v7, v8, v6}, Lcom/digdroid/alman/dig/b3;->x(Ljava/lang/String;I)V

    iget-object v7, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const-string v8, "storage_dir0"

    invoke-virtual {v7, v8, v5}, Lcom/digdroid/alman/dig/b3;->z(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    const/16 v5, 0x165

    if-ge v1, v5, :cond_3

    iget-object v5, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const/high16 v7, 0x432a0000    # 170.0f

    const-string v8, "games_block_size"

    invoke-virtual {v5, v8, v7}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v7

    const-string v8, "game_block_size"

    invoke-virtual {v5, v8, v7}, Lcom/digdroid/alman/dig/b3;->D(Ljava/lang/String;F)V

    :cond_3
    const/16 v5, 0x167

    const/4 v7, 0x0

    if-ge v1, v5, :cond_5

    invoke-virtual {v0, v7}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    if-eqz v5, :cond_5

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/Icons/Home/"

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v8, 0x1

    :goto_0
    const/4 v9, 0x7

    if-gt v8, v9, :cond_5

    new-instance v9, Ljava/io/File;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, ".png"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v10

    if-eqz v10, :cond_4

    :try_start_0
    new-instance v10, Ljava/io/File;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8}, Lcom/digdroid/alman/dig/s1;->E3(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v10}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_4
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_5
    const/16 v5, 0x1ad

    if-ge v1, v5, :cond_6

    iget-object v5, v0, Lcom/digdroid/alman/dig/t;->u:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v5}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    const-string v8, "UPDATE roms SET cover_status=cover_status|20480 WHERE (cover_status&8192)=0"

    invoke-virtual {v5, v8}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_6
    const/16 v5, 0x1ac

    if-ge v1, v5, :cond_7

    iget-object v5, v0, Lcom/digdroid/alman/dig/t;->u:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v5}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    const-string v8, "UPDATE roms SET age_rating=NULL"

    invoke-virtual {v5, v8}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_7
    const/16 v5, 0x1bf

    if-ge v1, v5, :cond_8

    iget-object v5, v0, Lcom/digdroid/alman/dig/t;->u:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v5}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    const-string v8, "UPDATE roms SET age_rating=NULL WHERE youtube IS NULL"

    invoke-virtual {v5, v8}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_8
    if-ge v1, v4, :cond_d

    iget-object v5, v0, Lcom/digdroid/alman/dig/t;->u:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v5}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    iget-object v8, v0, Lcom/digdroid/alman/dig/t;->v:Lcom/digdroid/alman/dig/z1;

    invoke-virtual {v8}, Lcom/digdroid/alman/dig/z1;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "SELECT _id,youtube FROM games WHERE videoversion>"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v8

    if-eqz v8, :cond_c

    :cond_9
    invoke-interface {v1, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-nez v8, :cond_b

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    invoke-interface {v1, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    new-instance v12, Landroid/content/ContentValues;

    invoke-direct {v12}, Landroid/content/ContentValues;-><init>()V

    const-wide/16 v13, 0x0

    const-string v15, "youtube"

    cmp-long v16, v10, v13

    if-nez v16, :cond_a

    :catch_1
    invoke-virtual {v12, v15, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_a
    :try_start_1
    invoke-static {v10, v11}, Lcom/digdroid/alman/dig/y3;->q(J)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12, v15, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "mdbid="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, " AND youtube IS NULL"

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "roms"

    invoke-virtual {v5, v9, v12, v8, v7}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    :cond_b
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v8

    if-nez v8, :cond_9

    :cond_c
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_d
    iget-object v1, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v1, v2, v4}, Lcom/digdroid/alman/dig/b3;->E(Ljava/lang/String;I)V

    return v6
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onCreate(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/digdroid/alman/dig/t;->C:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/t;->B:J

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t;->D:Ljava/lang/String;

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "game_launched"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/t;->C:J

    const-string v0, "game_launch_time"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/t;->B:J

    const-string v0, "system_launched"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t;->D:Ljava/lang/String;

    const-string v0, "is_retroarch"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    :goto_0
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/t;->E:Z

    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 3

    iget-wide v0, p0, Lcom/digdroid/alman/dig/t;->C:J

    const-string v2, "game_launched"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-wide v0, p0, Lcom/digdroid/alman/dig/t;->B:J

    const-string v2, "game_launch_time"

    invoke-virtual {p1, v2, v0, v1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->D:Ljava/lang/String;

    const-string v1, "system_launched"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/t;->E:Z

    const-string v1, "is_retroarch"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-super {p0, p1}, Landroidx/appcompat/app/c;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public s0(JJLjava/lang/String;Z)V
    .locals 0

    iput-wide p1, p0, Lcom/digdroid/alman/dig/t;->C:J

    iput-wide p3, p0, Lcom/digdroid/alman/dig/t;->B:J

    iget-object p1, p0, Lcom/digdroid/alman/dig/t;->y:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {p1, p5}, Lcom/digdroid/alman/dig/g3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/t;->D:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/digdroid/alman/dig/t;->E:Z

    return-void
.end method

.method public t0(ZZZ)V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "update_masterbase"

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/DatabaseService;->t(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/digdroid/alman/dig/t$b;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/digdroid/alman/dig/t$b;-><init>(Lcom/digdroid/alman/dig/t;ZZZ)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Void;

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
