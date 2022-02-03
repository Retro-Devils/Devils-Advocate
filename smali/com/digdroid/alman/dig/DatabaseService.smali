.class public Lcom/digdroid/alman/dig/DatabaseService;
.super Landroid/app/IntentService;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/DatabaseService$d;
    }
.end annotation


# instance fields
.field b:Lcom/digdroid/alman/dig/u;

.field c:Landroid/database/sqlite/SQLiteDatabase;

.field d:Landroid/database/sqlite/SQLiteDatabase;

.field e:Lcom/digdroid/alman/dig/l0;

.field f:Lcom/digdroid/alman/dig/b3;

.field g:Lcom/digdroid/alman/dig/o0;

.field h:Lcom/digdroid/alman/dig/g3;

.field i:J

.field j:J

.field k:Z

.field l:I

.field m:I

.field n:J


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "DatabaseService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/IntentService;->setIntentRedelivery(Z)V

    return-void
.end method

.method public static t(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/digdroid/alman/dig/DatabaseService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static u(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/digdroid/alman/dig/DatabaseService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "param"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public static v(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Z)V
    .locals 2

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/digdroid/alman/dig/DatabaseService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    invoke-virtual {v0, p4, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;JLandroid/content/ContentValues;)Z
    .locals 11

    const-string v0, "roms"

    const-string v1, "gdbid"

    const-string v2, "mdbid"

    const-wide/16 v3, 0x0

    const/4 v5, -0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    cmp-long v8, p2, v3

    if-gez v8, :cond_0

    invoke-virtual {p4, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p4, v1, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "cover_status"

    invoke-virtual {p4, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p1, v0, v7, p4}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    return v6

    :cond_0
    iget-object v8, p0, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "SELECT g.gdbid,t.title,g.info,g.publisher,g.developer,g.released,g.genres,g.gfcover,g.age_rating,g.youtube FROM games as g,titles as t WHERE g._id="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v10, " AND t.rowid="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v9

    if-nez v9, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    return v6

    :cond_1
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p4, v2, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-interface {v8, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide p2

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p4, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const/4 p2, 0x1

    invoke-interface {v8, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v1, "&amp;"

    const-string v2, "&"

    invoke-virtual {p3, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v1, " \' "

    const-string v2, " & "

    invoke-virtual {p3, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v1, "title"

    invoke-virtual {p4, v1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p3, p0, Lcom/digdroid/alman/dig/DatabaseService;->g:Lcom/digdroid/alman/dig/o0;

    invoke-interface {v8, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Lcom/digdroid/alman/dig/o0;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v1, "sortname"

    invoke-virtual {p4, v1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p3, "info"

    invoke-virtual {p4, p3, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p3, 0x3

    invoke-interface {v8, p3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    const-string v2, "SELECT name FROM publishers WHERE rowid="

    if-nez v1, :cond_3

    invoke-interface {v8, p3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9

    iget-object p3, p0, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p3

    invoke-interface {p3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v9, "publisher"

    invoke-virtual {p4, v9, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-interface {p3}, Landroid/database/Cursor;->close()V

    :cond_3
    const/4 p3, 0x4

    invoke-interface {v8, p3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-interface {v8, p3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9

    iget-object p3, p0, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p3

    invoke-interface {p3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "developer"

    invoke-virtual {p4, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    invoke-interface {p3}, Landroid/database/Cursor;->close()V

    :cond_5
    const/4 p3, 0x5

    invoke-interface {v8, p3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    const-string v1, "released"

    invoke-virtual {p4, v1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const/4 p3, 0x7

    invoke-interface {v8, p3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v1, "gfcover"

    invoke-virtual {p4, v1, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p3, 0x8

    invoke-interface {v8, p3}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    const-string v2, "age_rating"

    if-eqz v1, :cond_6

    invoke-virtual {p4, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_0

    :cond_6
    invoke-interface {v8, p3}, Landroid/database/Cursor;->getInt(I)I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p4, v2, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :goto_0
    const/16 p3, 0x9

    invoke-interface {v8, p3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    const-string v5, "youtube"

    cmp-long v9, v1, v3

    if-nez v9, :cond_7

    :catch_0
    invoke-virtual {p4, v5, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_7
    :try_start_0
    invoke-interface {v8, p3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-static {v1, v2}, Lcom/digdroid/alman/dig/y3;->q(J)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, v5, p3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    iget-object p3, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p3, v0, v7, p4}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide p3

    const/4 v0, 0x6

    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_2
    array-length v2, v0

    if-ge v1, v2, :cond_9

    aget-object v2, v0, v1

    const/16 v3, 0x10

    invoke-static {v2, v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v2

    iget-object v4, p0, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "SELECT name FROM genres WHERE rowid="

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_8

    iget-object v3, p0, Lcom/digdroid/alman/dig/DatabaseService;->g:Lcom/digdroid/alman/dig/o0;

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/digdroid/alman/dig/o0;->f(Ljava/lang/String;)I

    move-result v3

    if-ltz v3, :cond_8

    iget-object v4, p0, Lcom/digdroid/alman/dig/DatabaseService;->g:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {v4, p3, p4, v3}, Lcom/digdroid/alman/dig/o0;->a(JI)V

    :cond_8
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_9
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    iget-object p3, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "UPDATE systems SET numgames=numgames+1 WHERE slug=\'"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return p2
.end method

.method b()V
    .locals 7

    const-wide/16 v0, 0x1f4

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/DatabaseService;->s(J)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "SELECT _id,path,present,system FROM rompaths WHERE system!=\'none\'"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    :cond_0
    const/4 v3, 0x2

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    new-instance v5, Ljava/io/File;

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v5

    if-eq v5, v3, :cond_2

    iget-object v1, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "UPDATE rompaths SET last_checked=0 WHERE _id="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {p0, v1, v4}, Lcom/digdroid/alman/dig/DatabaseService;->d(IZ)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/DatabaseService;->h:Lcom/digdroid/alman/dig/g3;

    const/4 v3, 0x3

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/digdroid/alman/dig/g3;->D(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/DatabaseService;->m()V

    const/4 v1, 0x1

    :cond_2
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-nez v3, :cond_0

    move v2, v1

    :cond_3
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/DatabaseService;->n()V

    :cond_4
    return-void
.end method

.method c(ILjava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/util/regex/Pattern;Ljava/util/regex/Pattern;)Z
    .locals 20

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    invoke-virtual/range {p4 .. p4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v11

    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    const/4 v6, 0x1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "present"

    invoke-virtual {v5, v8, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v7, "j2me"

    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-string v12, ""

    const-string v13, " AND system=\'"

    const-string v14, "pathid="

    const-string v15, "roms"

    move-object/from16 v16, v7

    if-eqz v8, :cond_0

    invoke-virtual/range {p4 .. p4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v8

    invoke-virtual {v8}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iget-object v6, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "\' AND ((foldername IS NULL AND filename="

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, ") OR (foldername IS NOT NULL AND foldername="

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "))"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v6, v15, v5, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    if-lez v5, :cond_1

    const/4 v5, 0x0

    return v5

    :cond_0
    const-string v6, "collection.xml"

    invoke-virtual {v11, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    iget-object v6, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "\' AND filename="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v11}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v6, v15, v5, v7, v8}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    if-lez v5, :cond_2

    const/4 v5, 0x0

    return v5

    :cond_1
    const/4 v8, 0x0

    :cond_2
    const-wide/16 v5, -0x1

    iput-wide v5, v0, Lcom/digdroid/alman/dig/DatabaseService;->n:J

    const-string v7, "."

    invoke-virtual {v11, v7}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v7

    if-ltz v7, :cond_3

    add-int/lit8 v12, v7, 0x1

    invoke-virtual {v11, v12}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v12

    :cond_3
    invoke-virtual/range {p4 .. p4}, Ljava/io/File;->isDirectory()Z

    move-result v13

    if-eqz v13, :cond_6

    if-eqz v4, :cond_5

    const/4 v3, 0x0

    invoke-virtual {v0, v9, v10, v4, v3}, Lcom/digdroid/alman/dig/DatabaseService;->g(Ljava/lang/String;Ljava/io/File;Ljava/util/regex/Pattern;Z)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    iget-object v3, v0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    const/4 v6, 0x1

    const/16 v7, 0x50

    const/4 v12, 0x0

    move-object/from16 v4, p3

    move-object v5, v11

    move-object v13, v8

    move v8, v12

    invoke-virtual/range {v3 .. v8}, Lcom/digdroid/alman/dig/l0;->e(Ljava/lang/String;Ljava/lang/String;ZIZ)J

    move-result-wide v3

    move-object v7, v13

    :goto_0
    move-wide v13, v3

    :goto_1
    move-object v4, v2

    goto/16 :goto_c

    :cond_5
    :goto_2
    const/4 v1, 0x0

    return v1

    :cond_6
    move-object v13, v8

    const-string v4, "mame"

    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v8, "gz"

    const-string v14, "rar"

    const-string v15, "\'"

    const-string v13, " AND g._id=s.gameid AND sys._id=g.system AND sys.slug=\'"

    const-string v5, "SELECT s.gameid FROM slugs as s,games as g,systems as sys WHERE s.slug="

    const-string v6, "7z"

    const-string v2, "zip"

    if-nez v4, :cond_17

    const-string v4, "neogeo"

    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto/16 :goto_9

    :cond_7
    const-string v4, "conf"

    invoke-virtual {v12, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    move-object v4, v2

    int-to-long v2, v1

    invoke-virtual {v0, v10, v2, v3}, Lcom/digdroid/alman/dig/DatabaseService;->h(Ljava/io/File;J)Landroid/content/ContentValues;

    move-result-object v2

    if-eqz v2, :cond_9

    move-object/from16 v3, v16

    const-wide/16 v14, -0x1

    invoke-virtual {v0, v3, v14, v15, v2}, Lcom/digdroid/alman/dig/DatabaseService;->a(Ljava/lang/String;JLandroid/content/ContentValues;)Z

    move-result v1

    return v1

    :cond_8
    move-object v4, v2

    :cond_9
    move-object/from16 v16, v14

    move-object/from16 v17, v15

    const-wide/16 v14, -0x1

    const-string v2, "pc"

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    int-to-long v2, v1

    invoke-virtual {v0, v10, v2, v3}, Lcom/digdroid/alman/dig/DatabaseService;->i(Ljava/io/File;J)Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, 0x1

    return v2

    :cond_a
    const-string v2, "naomi"

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    const/4 v3, 0x0

    if-lez v7, :cond_b

    invoke-virtual {v11, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :cond_b
    move-object v7, v11

    :goto_3
    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    return v3

    :cond_c
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v7}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v3, v17

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v5, 0x0

    invoke-virtual {v3, v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_d

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v13

    goto :goto_4

    :cond_d
    move-wide v13, v14

    :goto_4
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_5

    :cond_e
    move-wide v13, v14

    :goto_5
    const-wide/16 v2, 0x0

    cmp-long v5, v13, v2

    if-gez v5, :cond_f

    invoke-virtual/range {p4 .. p4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/digdroid/alman/dig/e4;->c(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_f

    move-object/from16 v5, p5

    invoke-virtual {v0, v9, v10, v5}, Lcom/digdroid/alman/dig/DatabaseService;->w(Ljava/lang/String;Ljava/io/File;Ljava/util/regex/Pattern;)J

    move-result-wide v13

    goto :goto_6

    :cond_f
    move-object/from16 v5, p5

    :goto_6
    cmp-long v7, v13, v2

    if-gez v7, :cond_16

    invoke-virtual {v12, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    move-object/from16 v2, v16

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    invoke-virtual {v5, v11}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-nez v2, :cond_10

    const/4 v2, 0x0

    return v2

    :cond_10
    invoke-virtual/range {p4 .. p4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/digdroid/alman/dig/y3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_12

    iget-object v3, v0, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SELECT c.gameid FROM chuds as c,systems as s,games as g WHERE c.sha1=x\'"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' AND s.slug=\'"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, p2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\' AND g._id=c.gameid AND g.system=s._id"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_11

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    move-wide v13, v4

    :cond_11
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    goto :goto_7

    :cond_12
    move-object/from16 v2, p2

    :goto_7
    const-wide/16 v3, 0x0

    cmp-long v5, v13, v3

    if-gez v5, :cond_13

    iget-object v3, v0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    const/4 v6, 0x0

    const/16 v7, 0x50

    const/4 v8, 0x0

    move-object/from16 v4, p3

    move-object v5, v11

    invoke-virtual/range {v3 .. v8}, Lcom/digdroid/alman/dig/l0;->e(Ljava/lang/String;Ljava/lang/String;ZIZ)J

    move-result-wide v3

    goto :goto_8

    :cond_13
    move-wide v3, v13

    :goto_8
    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-gez v7, :cond_15

    invoke-virtual/range {p4 .. p4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v12

    array-length v5, v12

    const/4 v13, 0x2

    if-lt v5, v13, :cond_15

    iget-object v3, v0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    array-length v4, v12

    sub-int/2addr v4, v13

    aget-object v5, v12, v4

    const/4 v6, 0x0

    const/16 v7, 0x50

    const/4 v8, 0x0

    move-object/from16 v4, p3

    invoke-virtual/range {v3 .. v8}, Lcom/digdroid/alman/dig/l0;->e(Ljava/lang/String;Ljava/lang/String;ZIZ)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    array-length v5, v12

    if-ltz v7, :cond_14

    sub-int/2addr v5, v13

    aget-object v7, v12, v5

    goto/16 :goto_0

    :cond_14
    const/4 v13, 0x3

    if-lt v5, v13, :cond_15

    iget-object v3, v0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    array-length v4, v12

    sub-int/2addr v4, v13

    aget-object v5, v12, v4

    const/4 v6, 0x0

    const/16 v7, 0x50

    const/4 v8, 0x0

    move-object/from16 v4, p3

    invoke-virtual/range {v3 .. v8}, Lcom/digdroid/alman/dig/l0;->e(Ljava/lang/String;Ljava/lang/String;ZIZ)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-ltz v7, :cond_15

    array-length v5, v12

    sub-int/2addr v5, v13

    aget-object v7, v12, v5

    goto/16 :goto_0

    :cond_15
    move-wide v13, v3

    const/4 v7, 0x0

    goto/16 :goto_1

    :cond_16
    move-object/from16 v4, p2

    const/4 v7, 0x0

    goto/16 :goto_c

    :cond_17
    :goto_9
    move-object/from16 v4, p2

    move-object v3, v15

    move-object/from16 v19, v14

    move-object v14, v2

    move-object/from16 v2, v19

    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_18

    invoke-virtual {v12, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_18

    invoke-virtual {v12, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    invoke-virtual {v12, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    const/4 v2, 0x0

    return v2

    :cond_18
    const/4 v2, 0x0

    if-lez v7, :cond_19

    invoke-virtual {v11, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    goto :goto_a

    :cond_19
    move-object v2, v11

    :goto_a
    iget-object v6, v0, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v6, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v5

    if-eqz v5, :cond_1a

    const/4 v5, 0x0

    invoke-interface {v2, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    move-wide/from16 v17, v6

    goto :goto_b

    :cond_1a
    const/4 v5, 0x0

    const-wide/16 v17, -0x1

    :goto_b
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    const-wide/16 v6, 0x0

    cmp-long v2, v17, v6

    if-gez v2, :cond_1b

    return v5

    :cond_1b
    move-object v7, v3

    move-wide/from16 v13, v17

    :goto_c
    iget-object v2, v0, Lcom/digdroid/alman/dig/DatabaseService;->b:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/u;->b()Landroid/content/ContentValues;

    move-result-object v2

    const-string v3, "system"

    invoke-virtual {v2, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v3, "pathid"

    invoke-virtual {v2, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "filename"

    invoke-virtual {v2, v1, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "foldername"

    invoke-virtual {v2, v1, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-wide v5, v0, Lcom/digdroid/alman/dig/DatabaseService;->n:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v3, "crc"

    invoke-virtual {v2, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-wide/16 v5, 0x0

    cmp-long v1, v13, v5

    if-gez v1, :cond_1c

    iget-object v1, v0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    invoke-virtual/range {p4 .. p4}, Ljava/io/File;->isDirectory()Z

    move-result v3

    invoke-virtual {v1, v11, v3}, Lcom/digdroid/alman/dig/l0;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    iget-object v3, v0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    invoke-virtual {v3, v1}, Lcom/digdroid/alman/dig/l0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "title"

    invoke-virtual {v2, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v0, Lcom/digdroid/alman/dig/DatabaseService;->g:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {v3, v1}, Lcom/digdroid/alman/dig/o0;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "sortname"

    invoke-virtual {v2, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1c
    invoke-virtual {v0, v4, v13, v14, v2}, Lcom/digdroid/alman/dig/DatabaseService;->a(Ljava/lang/String;JLandroid/content/ContentValues;)Z

    move-result v1

    return v1
.end method

.method d(IZ)V
    .locals 20

    move-object/from16 v7, p0

    move/from16 v8, p1

    if-gez v8, :cond_0

    return-void

    :cond_0
    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT p.path,p.system,p.last_checked,p.present,s.parent FROM rompaths as p,systems as s WHERE p._id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " AND s.slug=p.system"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v9, 0x0

    invoke-virtual {v0, v1, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    const-string v10, "UPDATE roms SET present=0,pathid=-1 WHERE pathid="

    if-nez v1, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/digdroid/alman/dig/DatabaseService;->n()V

    return-void

    :cond_1
    const/4 v11, 0x0

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v12, 0x1

    invoke-interface {v0, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    const/4 v2, 0x2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    const/4 v5, 0x3

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    if-ne v5, v12, :cond_2

    const/4 v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x4

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v15

    const-string v2, "UPDATE roms SET present=0 WHERE pathid="

    if-nez v15, :cond_4

    if-eqz v5, :cond_3

    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UPDATE rompaths SET present=0 WHERE _id="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->h:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v0, v13}, Lcom/digdroid/alman/dig/g3;->D(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/digdroid/alman/dig/DatabaseService;->n()V

    :cond_3
    return-void

    :cond_4
    if-nez p2, :cond_c

    const-string v0, "pc"

    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v15, "/"

    if-eqz v0, :cond_5

    new-instance v0, Ljava/io/File;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "collection.xml"

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v0, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    iget-object v11, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "SELECT filename,present FROM roms WHERE pathid="

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, " AND ignored=0"

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/4 v12, 0x0

    invoke-virtual {v11, v9, v12}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v11

    if-eqz v11, :cond_a

    :goto_2
    new-instance v11, Ljava/io/File;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v17, v1

    move-wide/from16 v18, v3

    const/4 v1, 0x0

    invoke-interface {v9, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v12, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v11, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    if-nez v0, :cond_8

    invoke-virtual {v11}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_5

    :cond_7
    move-object/from16 v1, v17

    move-wide/from16 v3, v18

    goto :goto_2

    :cond_8
    :goto_3
    const/4 v0, 0x1

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    if-nez v1, :cond_9

    const-wide/16 v0, 0x0

    iget-object v3, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "UPDATE rompaths SET last_checked=0 WHERE _id="

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    move-wide v3, v0

    goto :goto_4

    :cond_9
    move-wide/from16 v3, v18

    :goto_4
    const/4 v0, 0x1

    goto :goto_6

    :cond_a
    move-wide/from16 v18, v3

    :goto_5
    move-wide/from16 v3, v18

    :goto_6
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    if-nez v0, :cond_b

    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UPDATE rompaths SET present=0,last_checked="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " WHERE _id="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->h:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v0, v13}, Lcom/digdroid/alman/dig/g3;->D(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/digdroid/alman/dig/DatabaseService;->n()V

    return-void

    :cond_b
    move-object v0, v9

    goto :goto_7

    :cond_c
    move-wide/from16 v18, v3

    :goto_7
    if-nez v5, :cond_d

    iget-object v1, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "UPDATE rompaths SET present=1 WHERE _id="

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_d
    invoke-virtual {v6}, Ljava/io/File;->lastModified()J

    move-result-wide v11

    cmp-long v1, v3, v11

    if-lez v1, :cond_e

    return-void

    :cond_e
    :try_start_0
    iget-object v1, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SELECT extensions,folder_exts,ignored FROM systems WHERE slug=\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\' AND ignored=0"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    nop

    :goto_8
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-nez v1, :cond_f

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-void

    :cond_f
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\\.("

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v4, 0x0

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ")$"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v5, 0x2

    invoke-static {v1, v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v9

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v5

    if-nez v5, :cond_10

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v11, ""

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_10

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x2

    invoke-static {v1, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    move-object v11, v1

    goto :goto_9

    :cond_10
    const/4 v11, 0x0

    :goto_9
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v12

    if-nez v12, :cond_11

    return-void

    :cond_11
    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->f:Lcom/digdroid/alman/dig/b3;

    const-string v1, "unmerged_files"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Lcom/digdroid/alman/dig/b3;->A(Ljava/lang/String;Z)V

    const-wide/16 v0, 0x7d0

    invoke-virtual {v7, v0, v1}, Lcom/digdroid/alman/dig/DatabaseService;->s(J)V

    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->h:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v0, v13}, Lcom/digdroid/alman/dig/g3;->D(Ljava/lang/String;)V

    const/4 v6, 0x0

    const/4 v15, 0x0

    :goto_a
    array-length v0, v12

    if-ge v6, v0, :cond_15

    :try_start_1
    aget-object v4, v12, v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object v2, v13

    move-object v3, v14

    move-object v5, v9

    move/from16 v16, v6

    move-object v6, v11

    :try_start_2
    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/DatabaseService;->c(ILjava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/util/regex/Pattern;Ljava/util/regex/Pattern;)Z

    move-result v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    if-eqz v0, :cond_12

    const/4 v0, 0x1

    goto :goto_b

    :cond_12
    move v0, v15

    :goto_b
    if-nez v0, :cond_13

    if-eqz p2, :cond_14

    :cond_13
    :try_start_3
    invoke-virtual/range {p0 .. p0}, Lcom/digdroid/alman/dig/DatabaseService;->m()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :cond_14
    move v15, v0

    goto :goto_c

    :catch_2
    move/from16 v16, v6

    :catch_3
    :goto_c
    add-int/lit8 v6, v16, 0x1

    goto :goto_a

    :cond_15
    if-eqz v15, :cond_16

    invoke-static/range {p0 .. p0}, Lcom/digdroid/alman/dig/ServerService;->v(Landroid/content/Context;)V

    :cond_16
    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT merged_with FROM roms WHERE pathid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " AND (ignored=1 OR present=0) AND merged_with>=0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_18

    :cond_17
    iget-object v1, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UPDATE roms SET merged_with=-1 WHERE merged_with="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_17

    :cond_18
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "last_checked"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v1, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "_id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "rompaths"

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v0, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_19

    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_19
    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT foldername FROM roms WHERE pathid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " AND foldername IS NOT NULL"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_1f

    :cond_1a
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1e

    iget-object v1, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SELECT _id FROM roms WHERE foldername="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v2}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_1c

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v2

    const/4 v4, 0x1

    if-le v2, v4, :cond_1d

    :cond_1b
    iget-object v2, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "UPDATE roms SET foldername=NULL,title=filename,merged_with=-1 WHERE _id="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v6, 0x0

    invoke-interface {v1, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v2, v7, Lcom/digdroid/alman/dig/DatabaseService;->g:Lcom/digdroid/alman/dig/o0;

    invoke-interface {v1, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    iget-object v5, v7, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v2, v8, v9, v5}, Lcom/digdroid/alman/dig/o0;->s(JLandroid/database/sqlite/SQLiteDatabase;)V

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_1b

    goto :goto_d

    :cond_1c
    const/4 v4, 0x1

    :cond_1d
    const/4 v6, 0x0

    :goto_d
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_e

    :cond_1e
    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v6, 0x0

    :goto_e
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1a

    :cond_1f
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    iget-object v0, v7, Lcom/digdroid/alman/dig/DatabaseService;->h:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v0, v13}, Lcom/digdroid/alman/dig/g3;->D(Ljava/lang/String;)V

    if-nez v15, :cond_20

    if-eqz p2, :cond_21

    :cond_20
    invoke-virtual/range {p0 .. p0}, Lcom/digdroid/alman/dig/DatabaseService;->n()V

    :cond_21
    invoke-virtual/range {p0 .. p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    return-void
.end method

.method e()V
    .locals 23

    move-object/from16 v6, p0

    iget-object v0, v6, Lcom/digdroid/alman/dig/DatabaseService;->f:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v7, 0x0

    invoke-virtual {v6, v7}, Lcom/digdroid/alman/dig/DatabaseService;->q(Z)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iget-object v0, v6, Lcom/digdroid/alman/dig/DatabaseService;->f:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->d()J

    move-result-wide v10

    iget-object v0, v6, Lcom/digdroid/alman/dig/DatabaseService;->f:Lcom/digdroid/alman/dig/b3;

    const-string v12, "sd_dirs_last_scanned"

    invoke-virtual {v0, v12, v10, v11}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v13

    iput-boolean v7, v6, Lcom/digdroid/alman/dig/DatabaseService;->k:Z

    invoke-virtual/range {p0 .. p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/y3;->y(Landroid/content/Context;)Ljava/io/File;

    move-result-object v15

    invoke-static/range {p0 .. p0}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_e

    array-length v0, v4

    if-eqz v0, :cond_e

    aget-object v0, v4, v7

    if-nez v0, :cond_1

    goto/16 :goto_8

    :cond_1
    array-length v0, v4

    const-string v5, "/Android/data.*"

    const-string v3, ""

    const/4 v2, 0x1

    if-le v0, v2, :cond_4

    aget-object v0, v4, v2

    if-eqz v0, :cond_4

    invoke-static/range {p0 .. p0}, Lcom/digdroid/alman/dig/h2;->d(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v1

    array-length v0, v1

    sub-int/2addr v0, v2

    move/from16 v16, v0

    :goto_0
    if-ltz v16, :cond_3

    aget-object v17, v1, v16

    const/16 v18, 0x0

    if-nez v16, :cond_2

    move-wide/from16 v19, v10

    goto :goto_1

    :cond_2
    move-wide/from16 v19, v13

    :goto_1
    move-object/from16 v0, p0

    move-object/from16 v21, v1

    move-object/from16 v1, v17

    move/from16 v2, v18

    move-object/from16 v22, v3

    move-object v3, v15

    move-object v7, v4

    move-object/from16 v18, v12

    move-object v12, v5

    move-wide/from16 v4, v19

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/DatabaseService;->f(Ljava/lang/String;ILjava/io/File;J)V

    add-int/lit8 v16, v16, -0x1

    move-object v4, v7

    move-object v5, v12

    move-object/from16 v12, v18

    move-object/from16 v1, v21

    move-object/from16 v3, v22

    const/4 v2, 0x1

    const/4 v7, 0x0

    goto :goto_0

    :cond_3
    move-object v7, v4

    move-object/from16 v18, v12

    move-object v12, v5

    move-wide/from16 v19, v8

    const/4 v9, 0x1

    move-object v8, v3

    goto/16 :goto_6

    :cond_4
    move-object/from16 v22, v3

    move-object v7, v4

    move-object/from16 v18, v12

    move-object v12, v5

    const/4 v0, 0x0

    :try_start_0
    aget-object v1, v7, v0

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    move-object/from16 v4, v22

    :try_start_1
    invoke-virtual {v0, v12, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object v3, v15

    move-wide/from16 v19, v8

    move-object v8, v4

    move-wide v4, v10

    :try_start_2
    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/DatabaseService;->f(Ljava/lang/String;ILjava/io/File;J)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4

    :try_start_3
    new-instance v0, Ljava/io/File;

    const-string v1, "/storage"

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v9

    array-length v4, v9

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v4, :cond_6

    aget-object v0, v9, v5

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "sdcard0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "emulated"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object v3, v15

    move/from16 v16, v4

    move/from16 v21, v5

    move-wide v4, v13

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/DatabaseService;->f(Ljava/lang/String;ILjava/io/File;J)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_3

    :cond_5
    move/from16 v16, v4

    move/from16 v21, v5

    :goto_3
    add-int/lit8 v5, v21, 0x1

    move/from16 v4, v16

    goto :goto_2

    :catch_0
    :cond_6
    :try_start_4
    invoke-static/range {p0 .. p0}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v0

    array-length v1, v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    const/4 v2, 0x2

    if-lt v1, v2, :cond_7

    const/4 v9, 0x1

    :try_start_5
    aget-object v0, v0, v9

    if-nez v0, :cond_a

    goto :goto_4

    :cond_7
    const/4 v9, 0x1

    :goto_4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "/mnt/external_sd"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "/mnt/extSdCard"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v1, "/mnt/sdcard1"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v6, Lcom/digdroid/alman/dig/DatabaseService;->f:Lcom/digdroid/alman/dig/b3;

    const-string v2, "sdcard_path"

    invoke-virtual {v1, v2, v8}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :cond_9
    :goto_5
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_9

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object v3, v15

    move-wide v4, v13

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/DatabaseService;->f(Ljava/lang/String;ILjava/io/File;J)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_5

    :catch_1
    nop

    goto :goto_6

    :catch_2
    move-wide/from16 v19, v8

    const/4 v9, 0x1

    move-object v8, v4

    goto :goto_6

    :catch_3
    move-wide/from16 v19, v8

    move-object/from16 v8, v22

    :catch_4
    const/4 v9, 0x1

    :cond_a
    :goto_6
    iget-boolean v0, v6, Lcom/digdroid/alman/dig/DatabaseService;->k:Z

    if-nez v0, :cond_b

    const/4 v0, 0x0

    aget-object v0, v7, v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v12, v8}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object v3, v15

    move-wide v4, v10

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/DatabaseService;->f(Ljava/lang/String;ILjava/io/File;J)V

    :cond_b
    array-length v0, v7

    if-eq v0, v9, :cond_c

    aget-object v0, v7, v9

    if-nez v0, :cond_d

    :cond_c
    invoke-static/range {p0 .. p0}, Lcom/digdroid/alman/dig/h2;->d(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v7

    array-length v0, v7

    sub-int/2addr v0, v9

    move v8, v0

    :goto_7
    if-lez v8, :cond_d

    aget-object v1, v7, v8

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object v3, v15

    move-wide v4, v13

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/DatabaseService;->f(Ljava/lang/String;ILjava/io/File;J)V

    add-int/lit8 v8, v8, -0x1

    goto :goto_7

    :cond_d
    iget-object v0, v6, Lcom/digdroid/alman/dig/DatabaseService;->f:Lcom/digdroid/alman/dig/b3;

    move-wide/from16 v1, v19

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->C(J)V

    iget-object v0, v6, Lcom/digdroid/alman/dig/DatabaseService;->f:Lcom/digdroid/alman/dig/b3;

    move-object/from16 v3, v18

    invoke-virtual {v0, v3, v1, v2}, Lcom/digdroid/alman/dig/b3;->y(Ljava/lang/String;J)V

    iget-object v0, v6, Lcom/digdroid/alman/dig/DatabaseService;->f:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0, v9}, Lcom/digdroid/alman/dig/b3;->L(Z)V

    :cond_e
    :goto_8
    return-void
.end method

.method f(Ljava/lang/String;ILjava/io/File;J)V
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move/from16 v8, p2

    if-eqz v7, :cond_7

    const/16 v0, 0xc

    if-lt v8, v0, :cond_0

    goto/16 :goto_1

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual/range {p3 .. p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, v6, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT _id FROM rompaths WHERE (system=\'none\' OR system=\'ignore\') AND path="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {p1 .. p1}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v9, 0x0

    invoke-virtual {v0, v1, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    if-eqz v1, :cond_2

    return-void

    :cond_2
    invoke-static/range {p0 .. p1}, Lcom/digdroid/alman/dig/h2;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    const/4 v10, 0x1

    if-eqz v0, :cond_3

    iput-boolean v10, v6, Lcom/digdroid/alman/dig/DatabaseService;->k:Z

    :cond_3
    :try_start_0
    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    if-ne v8, v10, :cond_4

    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "users"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    return-void

    :cond_4
    invoke-virtual {v11}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "$RECYCLE.BIN"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    return-void

    :cond_5
    new-instance v0, Lcom/digdroid/alman/dig/DatabaseService$a;

    invoke-direct {v0, v6}, Lcom/digdroid/alman/dig/DatabaseService$a;-><init>(Lcom/digdroid/alman/dig/DatabaseService;)V

    invoke-virtual {v11, v0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v12

    array-length v13, v12

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_0
    if-ge v15, v13, :cond_6

    aget-object v0, v12, v15

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v2, v8, 0x1

    move-object/from16 v0, p0

    move-object/from16 v3, p3

    move-wide/from16 v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/DatabaseService;->f(Ljava/lang/String;ILjava/io/File;J)V

    add-int/lit8 v15, v15, 0x1

    goto :goto_0

    :cond_6
    invoke-virtual {v11}, Ljava/io/File;->lastModified()J

    move-result-wide v0

    cmp-long v2, v0, p4

    if-lez v2, :cond_7

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "path"

    invoke-virtual {v0, v1, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "system"

    const-string v2, "none"

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "last_checked"

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "selected"

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v1, v6, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v2, "rompaths"

    invoke-virtual {v1, v2, v9, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_7
    :goto_1
    return-void
.end method

.method g(Ljava/lang/String;Ljava/io/File;Ljava/util/regex/Pattern;Z)Z
    .locals 3

    invoke-virtual {p2}, Ljava/io/File;->isDirectory()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const-string v0, "amiga"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    xor-int/lit8 p1, p4, 0x1

    return p1

    :cond_0
    const-string v0, "scumm"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    if-eqz p4, :cond_1

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 p2, 0xa

    if-ge p1, p2, :cond_1

    return v1

    :cond_1
    return v2

    :cond_2
    :try_start_0
    new-instance p1, Lcom/digdroid/alman/dig/DatabaseService$b;

    invoke-direct {p1, p0, p3}, Lcom/digdroid/alman/dig/DatabaseService$b;-><init>(Lcom/digdroid/alman/dig/DatabaseService;Ljava/util/regex/Pattern;)V

    invoke-virtual {p2, p1}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object p1

    array-length p1, p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-lez p1, :cond_3

    const/4 v1, 0x1

    :catch_0
    :cond_3
    return v1
.end method

.method h(Ljava/io/File;J)Landroid/content/ContentValues;
    .locals 9

    invoke-static {p1}, Lcom/digdroid/alman/dig/y3;->e(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    new-instance v3, Ljava/io/File;

    const-string v4, "res"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_1

    new-instance v4, Ljava/io/File;

    const-string v5, "res.jar"

    invoke-direct {v4, v2, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_1

    return-object v1

    :cond_1
    const-string v4, "MIDlet-Name:\\s*([^\\n\\r]*)"

    const/4 v5, 0x2

    invoke-static {v4, v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-nez v6, :cond_2

    return-object v1

    :cond_2
    iget-object v1, p0, Lcom/digdroid/alman/dig/DatabaseService;->b:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/u;->b()Landroid/content/ContentValues;

    move-result-object v1

    const-wide/16 v6, 0x0

    cmp-long v8, p2, v6

    if-gez v8, :cond_3

    return-object v1

    :cond_3
    const/4 v6, 0x1

    invoke-virtual {v4, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    const-string v7, "system"

    const-string v8, "j2me"

    invoke-virtual {v1, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string p3, "pathid"

    invoke-virtual {v1, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "filename"

    invoke-virtual {v1, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "foldername"

    invoke-virtual {v1, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "title"

    invoke-virtual {v1, p1, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/DatabaseService;->g:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {p1, v4}, Lcom/digdroid/alman/dig/o0;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "sortname"

    invoke-virtual {v1, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p3, "cover_status"

    invoke-virtual {v1, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string p2, "MIDlet-Vendor:\\s*([^\\n\\r]*)"

    invoke-static {p2, v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {p2, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    const-string p3, "publisher"

    invoke-virtual {v1, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    const-string p2, "MIDlet-Description:\\s*(.*?)(?:MIDlet-|$)"

    invoke-static {p2, v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-virtual {p2, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    const-string p3, "info"

    invoke-virtual {v1, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    const-string p2, "MIDlet-Icon:\\s*\\/?([^\\n\\r]*)"

    invoke-static {p2, v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result p3

    const-string v4, ""

    if-eqz p3, :cond_6

    :goto_0
    invoke-virtual {p2, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_6
    const-string p2, "MIDlet-1:\\s*(?:.*?),\\s*\\/?(.*?),"

    invoke-static {p2, v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->find()Z

    move-result p3

    if-eqz p3, :cond_7

    goto :goto_0

    :cond_7
    move-object p2, v4

    :goto_1
    new-instance p3, Ljava/io/File;

    const-string v0, "icon.png"

    invoke-direct {p3, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    new-instance p3, Ljava/io/File;

    invoke-direct {p3, v3, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :cond_8
    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/digdroid/alman/dig/t1;->p(Landroid/content/Context;)Lcom/digdroid/alman/dig/t1;

    move-result-object p2

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, p1, v0, v8}, Lcom/digdroid/alman/dig/t1;->j(ZLjava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/digdroid/alman/dig/y3;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    return-object v1
.end method

.method i(Ljava/io/File;J)Z
    .locals 20

    move-object/from16 v0, p0

    move-wide/from16 v1, p2

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "collection.xml"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    return v4

    :cond_0
    invoke-static/range {p1 .. p1}, Lcom/digdroid/alman/dig/y3;->e(Ljava/io/File;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    return v4

    :cond_1
    const-string v5, "<game>"

    invoke-virtual {v3, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    array-length v5, v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v6, v5, :cond_9

    aget-object v8, v3, v6

    const-string v9, "<id>(.*?)<\\/id>"

    invoke-static {v9}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/regex/Matcher;->find()Z

    move-result v10

    const/4 v11, 0x1

    if-eqz v10, :cond_7

    invoke-virtual {v9, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v9

    const-string v10, "<description>(.*?)<\\/description>"

    invoke-static {v10}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/regex/Matcher;->find()Z

    move-result v10

    if-eqz v10, :cond_7

    const-wide/16 v12, 0x0

    cmp-long v10, v1, v12

    if-gez v10, :cond_2

    return v11

    :cond_2
    invoke-virtual {v8, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v8

    new-instance v10, Landroid/content/ContentValues;

    invoke-direct {v10}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const-string v15, "present"

    invoke-virtual {v10, v15, v14}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v14, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "pathid="

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v11, " AND system=\'pc\' AND filename="

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, ""

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v15, "roms"

    const/4 v4, 0x0

    invoke-virtual {v14, v15, v10, v11, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v10

    if-lez v10, :cond_3

    goto/16 :goto_3

    :cond_3
    iget-object v14, v0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    const/16 v17, 0x0

    const/16 v18, 0x50

    const/16 v19, 0x0

    const-string v15, "pc"

    move-object/from16 v16, v8

    invoke-virtual/range {v14 .. v19}, Lcom/digdroid/alman/dig/l0;->e(Ljava/lang/String;Ljava/lang/String;ZIZ)J

    move-result-wide v10

    iget-object v14, v0, Lcom/digdroid/alman/dig/DatabaseService;->b:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v14}, Lcom/digdroid/alman/dig/u;->b()Landroid/content/ContentValues;

    move-result-object v14

    const-string v15, "system"

    const-string v4, "pc"

    invoke-virtual {v14, v15, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {p2 .. p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v15

    const-string v12, "pathid"

    invoke-virtual {v14, v12, v15}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v12, "filename"

    invoke-virtual {v14, v12, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v12, 0x0

    cmp-long v9, v10, v12

    if-gez v9, :cond_4

    iget-object v9, v0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    const/4 v12, 0x0

    invoke-virtual {v9, v8, v12}, Lcom/digdroid/alman/dig/l0;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v8

    iget-object v9, v0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    invoke-virtual {v9, v8}, Lcom/digdroid/alman/dig/l0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "title"

    invoke-virtual {v14, v9, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v9, v0, Lcom/digdroid/alman/dig/DatabaseService;->g:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {v9, v8}, Lcom/digdroid/alman/dig/o0;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "sortname"

    invoke-virtual {v14, v9, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    iget-object v8, v0, Lcom/digdroid/alman/dig/DatabaseService;->f:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v8}, Lcom/digdroid/alman/dig/b3;->u()Z

    move-result v8

    if-eqz v8, :cond_5

    iget-object v8, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v9, "SELECT _id FROM emulators WHERE name=\'Magic DosBox (TV)\'"

    const/4 v12, 0x0

    goto :goto_1

    :cond_5
    const/4 v12, 0x0

    iget-object v8, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v9, "SELECT _id FROM emulators WHERE name=\'Magic DosBox\'"

    :goto_1
    invoke-virtual {v8, v9, v12}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v9

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    invoke-interface {v8, v9}, Landroid/database/Cursor;->getInt(I)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const-string v13, "emulator"

    invoke-virtual {v14, v13, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    goto :goto_2

    :cond_6
    const/4 v9, 0x0

    :goto_2
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0, v4, v10, v11, v14}, Lcom/digdroid/alman/dig/DatabaseService;->a(Ljava/lang/String;JLandroid/content/ContentValues;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/4 v7, 0x1

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v9, 0x0

    :cond_8
    :goto_4
    add-int/lit8 v6, v6, 0x1

    const/4 v4, 0x0

    goto/16 :goto_0

    :cond_9
    return v7
.end method

.method j()V
    .locals 7

    iget-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "SELECT _id,merged_with FROM roms WHERE pathid=-1"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DELETE FROM gamegenres WHERE game="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_1

    iget-object v2, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "UPDATE roms SET merged_with=-1 WHERE merged_with="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "DELETE FROM roms WHERE pathid=-1"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    return-void
.end method

.method k(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/digdroid/alman/dig/DatabaseService$d;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            ">;",
            "Lcom/digdroid/alman/dig/DatabaseService$d;",
            ")Z"
        }
    .end annotation

    iget-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0, p2, v3}, Lcom/digdroid/alman/dig/l0;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    invoke-virtual {v0, p2}, Lcom/digdroid/alman/dig/l0;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    invoke-virtual {v0, p2}, Lcom/digdroid/alman/dig/l0;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    invoke-virtual {v3, p2}, Lcom/digdroid/alman/dig/l0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    iget-object v4, p0, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SELECT s.slug,t.title FROM systems as s,titles as t WHERE t.title MATCH "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " AND s._id=t.system"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    invoke-virtual {v4, v0, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_8

    const/4 v4, 0x0

    :cond_2
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    if-eqz v3, :cond_4

    const-string v6, "pc"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    const-string v6, "scumm"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p5, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, p0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/digdroid/alman/dig/l0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {p2, v6}, Ld/a/b/a;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    const/16 v7, 0x5f

    if-lt v6, v7, :cond_7

    invoke-virtual {p5, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/regex/Pattern;

    invoke-virtual {p0, v5, p1, v6, v2}, Lcom/digdroid/alman/dig/DatabaseService;->g(Ljava/lang/String;Ljava/io/File;Ljava/util/regex/Pattern;Z)Z

    move-result v6

    if-eqz v6, :cond_7

    goto :goto_2

    :cond_4
    const-string v6, "mame"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    const-string v6, "neogeo"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    if-eqz p3, :cond_6

    invoke-virtual {p4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/regex/Pattern;

    invoke-virtual {v6, p3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_7

    :cond_6
    iget-object v6, p0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/digdroid/alman/dig/l0;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {p2, v6}, Ld/a/b/a;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    const/16 v7, 0x5a

    if-lt v6, v7, :cond_7

    :goto_2
    invoke-virtual {p6, v5}, Lcom/digdroid/alman/dig/DatabaseService$d;->e(Ljava/lang/String;)V

    const/4 v4, 0x1

    :cond_7
    :goto_3
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-nez v5, :cond_2

    move v1, v4

    :cond_8
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return v1
.end method

.method l()V
    .locals 18

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v2, v3}, Lcom/digdroid/alman/dig/DatabaseService;->s(J)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    :goto_0
    iget-object v5, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v6, "SELECT _id,title,system FROM roms WHERE merged_with<0 AND ignored=0 AND present=1 LIMIT 1"

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v6

    if-nez v6, :cond_2

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    iget-object v3, v0, Lcom/digdroid/alman/dig/DatabaseService;->f:Lcom/digdroid/alman/dig/b3;

    const-string v5, "unmerged_files"

    invoke-virtual {v3, v5, v2}, Lcom/digdroid/alman/dig/b3;->A(Ljava/lang/String;Z)V

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, v0, Lcom/digdroid/alman/dig/DatabaseService;->h:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v3, v2}, Lcom/digdroid/alman/dig/g3;->D(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    if-eqz v4, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/digdroid/alman/dig/DatabaseService;->n()V

    :cond_1
    return-void

    :cond_2
    invoke-interface {v5, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    invoke-interface {v5, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x2

    invoke-interface {v5, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    iget-object v5, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "SELECT _id,last_played,times_played,time_played,present FROM roms WHERE system=\'"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "\' AND title="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " AND ignored=0 AND present=1 ORDER BY filename ASC"

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v5

    if-nez v5, :cond_3

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    iget-object v4, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "SELECT _id,last_played,times_played,time_played,present FROM roms WHERE _id="

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v5

    if-nez v5, :cond_3

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    goto/16 :goto_4

    :cond_3
    const-wide/16 v8, -0x1

    :cond_4
    const/4 v5, 0x4

    invoke-interface {v4, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    if-ne v5, v3, :cond_5

    invoke-interface {v4, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    goto :goto_2

    :cond_5
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-nez v5, :cond_4

    :goto_2
    move-wide v11, v8

    const-wide/16 v8, 0x0

    cmp-long v5, v11, v8

    if-gez v5, :cond_6

    goto/16 :goto_4

    :cond_6
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-wide v13, v8

    const/4 v5, 0x0

    :goto_3
    iget-object v15, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "UPDATE roms SET merged_with="

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " WHERE _id="

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v16, v11

    invoke-interface {v4, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v11

    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v15, v6}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-interface {v4, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    const/4 v6, 0x2

    invoke-interface {v4, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    add-int/2addr v5, v7

    const/4 v7, 0x3

    invoke-interface {v4, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v11

    add-long/2addr v13, v11

    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v7

    if-nez v7, :cond_9

    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    move-result v6

    if-le v6, v3, :cond_7

    iget-object v6, v0, Lcom/digdroid/alman/dig/DatabaseService;->f:Lcom/digdroid/alman/dig/b3;

    const-string v7, "merged_games"

    invoke-virtual {v6, v7, v3}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "UPDATE systems SET numgames=numgames-"

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    move-result v11

    sub-int/2addr v11, v3

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, " WHERE slug=\'"

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v11, "\'"

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_7
    invoke-interface {v4}, Landroid/database/Cursor;->getCount()I

    move-result v6

    if-le v6, v3, :cond_8

    invoke-virtual {v1, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_8
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-string v7, "merged_last_played"

    invoke-virtual {v4, v7, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "merged_times_played"

    invoke-virtual {v4, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-string v6, "merged_time_played"

    invoke-virtual {v4, v6, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v5, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "_id="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v11, v16

    invoke-virtual {v6, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "roms"

    const/4 v15, 0x0

    invoke-virtual {v5, v7, v4, v6, v15}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    invoke-virtual/range {p0 .. p0}, Lcom/digdroid/alman/dig/DatabaseService;->m()V

    :goto_4
    const/4 v4, 0x1

    goto/16 :goto_0

    :cond_9
    move-wide/from16 v11, v16

    const/4 v7, 0x0

    goto/16 :goto_3
.end method

.method m()V
    .locals 7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/digdroid/alman/dig/DatabaseService;->i:J

    sub-long v2, v0, v2

    iget-wide v4, p0, Lcom/digdroid/alman/dig/DatabaseService;->j:J

    cmp-long v6, v2, v4

    if-ltz v6, :cond_0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->i:J

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/DatabaseService;->n()V

    :cond_0
    return-void
.end method

.method n()V
    .locals 3

    :try_start_0
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/app/IntentService;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "request_refresh"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lb/n/a/a;->b(Landroid/content/Context;)Lb/n/a/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lb/n/a/a;->d(Landroid/content/Intent;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method o(Ljava/io/File;Ljava/util/regex/Pattern;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/util/regex/Pattern;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/regex/Pattern;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v7, p0

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iput v9, v7, Lcom/digdroid/alman/dig/DatabaseService;->l:I

    iput v9, v7, Lcom/digdroid/alman/dig/DatabaseService;->m:I

    new-instance v0, Lcom/digdroid/alman/dig/DatabaseService$c;

    move-object/from16 v1, p2

    invoke-direct {v0, v7, v1}, Lcom/digdroid/alman/dig/DatabaseService$c;-><init>(Lcom/digdroid/alman/dig/DatabaseService;Ljava/util/regex/Pattern;)V

    move-object/from16 v11, p1

    invoke-virtual {v11, v0}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v12

    if-nez v12, :cond_0

    return-void

    :cond_0
    new-instance v13, Lcom/digdroid/alman/dig/DatabaseService$d;

    invoke-direct {v13, v7}, Lcom/digdroid/alman/dig/DatabaseService$d;-><init>(Lcom/digdroid/alman/dig/DatabaseService;)V

    const/4 v14, 0x0

    :goto_0
    array-length v0, v12

    const-string v15, "scumm"

    const-string v6, "pc"

    const-string v5, ""

    const-string v3, "path"

    const/4 v2, 0x0

    if-ge v14, v0, :cond_1f

    :try_start_0
    aget-object v0, v12, v14

    move-object/from16 p2, v5

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    iget-object v4, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "SELECT r.pathid,p.path FROM roms as r,rompaths as p WHERE r.filename="

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v5}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " AND p._id=r.pathid AND p.restoring=1"

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_3

    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v17, v3

    const/4 v9, 0x0

    invoke-interface {v1, v9}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const v4, 0x3f8147ae

    goto :goto_2

    :cond_1
    const/high16 v4, 0x3f800000    # 1.0f

    :goto_2
    invoke-virtual {v13, v2, v4}, Lcom/digdroid/alman/dig/DatabaseService$d;->f(Ljava/lang/String;F)V

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_3

    :cond_2
    move-object/from16 v3, v17

    const/4 v2, 0x0

    goto :goto_1

    :cond_3
    move-object/from16 v17, v3

    const/4 v3, 0x1

    const/4 v2, 0x0

    :goto_3
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    if-nez v2, :cond_1d

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v4, "."

    invoke-virtual {v5, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    if-lez v4, :cond_4

    add-int/lit8 v9, v4, 0x1

    invoke-virtual {v5, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v9

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_4
    move-object/from16 v9, p2

    :goto_4
    const-string v3, "neogeo"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_b

    const-string v4, "gz"

    const-string v11, "rar"

    move-object/from16 v18, v12

    const-string v12, "7z"

    move-object/from16 v19, v10

    const-string v10, "zip"

    if-nez v3, :cond_9

    :try_start_1
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    :cond_5
    iget-object v3, v7, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    move/from16 v20, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v21, v4

    const-string v4, "SELECT sys.slug FROM systems as sys,games as g,slugs as s WHERE s.slug="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " AND g._id=s.gameid AND sys._id=g.system"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v3, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_8

    :cond_6
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v13, v3}, Lcom/digdroid/alman/dig/DatabaseService$d;->e(Ljava/lang/String;)V

    :cond_7
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_6

    :cond_8
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto :goto_5

    :cond_9
    move/from16 v20, v2

    move-object/from16 v21, v4

    :goto_5
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/digdroid/alman/dig/e4;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    new-instance v4, Lcom/digdroid/alman/dig/e4;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Lcom/digdroid/alman/dig/e4;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_a

    move/from16 v2, v20

    const/4 v1, 0x0

    :goto_6
    :try_start_2
    invoke-virtual {v4}, Lcom/digdroid/alman/dig/e4;->d()Lcom/digdroid/alman/dig/e4$a;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_9

    if-eqz v3, :cond_f

    if-nez v2, :cond_f

    add-int/lit8 v20, v1, 0x1

    move-object/from16 v22, v0

    const/16 v0, 0x1e

    if-ge v1, v0, :cond_e

    :try_start_3
    iget-wide v0, v3, Lcom/digdroid/alman/dig/e4$a;->c:J
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_7

    move/from16 v23, v2

    :try_start_4
    iget-object v2, v7, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    move-object/from16 v24, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_5

    move-object/from16 v25, v6

    :try_start_5
    const-string v6, "SELECT gameid FROM crcs WHERE rowid="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    if-eqz v1, :cond_c

    move/from16 v26, v14

    move-object/from16 v27, v15

    const/4 v1, 0x0

    :try_start_6
    invoke-interface {v0, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    iget-object v1, v7, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SELECT s.slug FROM systems as s,games as g WHERE g._id="

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " AND s._id=g.system"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_a

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    move-object/from16 v14, p3

    :try_start_7
    invoke-virtual {v14, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/regex/Pattern;

    iget-object v15, v3, Lcom/digdroid/alman/dig/e4$a;->a:Ljava/lang/String;

    invoke-virtual {v2, v15}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2

    if-eqz v2, :cond_b

    :try_start_8
    invoke-virtual {v13, v6}, Lcom/digdroid/alman/dig/DatabaseService$d;->e(Ljava/lang/String;)V

    goto :goto_7

    :cond_a
    move-object/from16 v14, p3

    move/from16 v2, v23

    :cond_b
    :goto_7
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    move/from16 v23, v2

    goto :goto_9

    :catch_0
    move-object/from16 v31, p2

    move-object/from16 v30, v5

    move-object/from16 v28, v17

    move/from16 v1, v20

    move-object/from16 v29, v21

    move-object/from16 v15, v22

    goto :goto_8

    :catch_1
    move-object/from16 v14, p3

    :catch_2
    move-object/from16 v31, p2

    move-object/from16 v30, v5

    move-object/from16 v28, v17

    move/from16 v1, v20

    move-object/from16 v29, v21

    move-object/from16 v15, v22

    move/from16 v2, v23

    :goto_8
    move-object/from16 v14, v25

    goto/16 :goto_f

    :cond_c
    move/from16 v26, v14

    move-object/from16 v27, v15

    const/4 v4, 0x0

    move-object/from16 v14, p3

    :goto_9
    :try_start_9
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    if-nez v23, :cond_d

    const/4 v1, 0x0

    iget-object v3, v3, Lcom/digdroid/alman/dig/e4$a;->a:Ljava/lang/String;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_3

    const/4 v6, 0x0

    move-object/from16 v15, v22

    move-object/from16 v0, p0

    const/4 v2, 0x1

    move-object v2, v5

    move-object/from16 v28, v17

    move-object/from16 v29, v21

    move-object/from16 v16, v24

    move-object/from16 v4, p3

    move-object/from16 v31, p2

    move-object/from16 v30, v5

    move-object v5, v6

    move-object/from16 v14, v25

    move-object v6, v13

    :try_start_a
    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/DatabaseService;->k(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/digdroid/alman/dig/DatabaseService$d;)Z

    move-result v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6

    move v2, v0

    goto :goto_a

    :cond_d
    move-object/from16 v31, p2

    move-object/from16 v30, v5

    move-object/from16 v28, v17

    move-object/from16 v29, v21

    move-object/from16 v15, v22

    move-object/from16 v16, v24

    move-object/from16 v14, v25

    move/from16 v2, v23

    :goto_a
    move-object v6, v14

    move-object v0, v15

    move-object/from16 v4, v16

    move/from16 v1, v20

    move/from16 v14, v26

    move-object/from16 v15, v27

    move-object/from16 v17, v28

    move-object/from16 v21, v29

    move-object/from16 v5, v30

    move-object/from16 p2, v31

    goto/16 :goto_6

    :catch_3
    move-object/from16 v31, p2

    move-object/from16 v30, v5

    goto :goto_b

    :catch_4
    move-object/from16 v31, p2

    move-object/from16 v30, v5

    move/from16 v26, v14

    move-object/from16 v27, v15

    :goto_b
    move-object/from16 v28, v17

    move-object/from16 v29, v21

    move-object/from16 v15, v22

    move-object/from16 v14, v25

    goto :goto_c

    :catch_5
    move-object/from16 v31, p2

    move-object/from16 v30, v5

    move/from16 v26, v14

    move-object/from16 v27, v15

    move-object/from16 v28, v17

    move-object/from16 v29, v21

    move-object/from16 v15, v22

    move-object v14, v6

    :catch_6
    :goto_c
    move/from16 v1, v20

    goto :goto_e

    :catch_7
    move-object/from16 v31, p2

    move/from16 v23, v2

    move-object/from16 v30, v5

    move/from16 v26, v14

    move-object/from16 v27, v15

    move-object/from16 v28, v17

    move-object/from16 v29, v21

    move-object/from16 v15, v22

    move-object v14, v6

    move/from16 v1, v20

    goto :goto_f

    :cond_e
    move-object/from16 v31, p2

    move/from16 v23, v2

    move-object/from16 v16, v4

    move-object/from16 v30, v5

    move/from16 v26, v14

    move-object/from16 v27, v15

    move-object/from16 v28, v17

    move-object/from16 v29, v21

    move-object/from16 v15, v22

    move-object v14, v6

    move/from16 v1, v20

    goto :goto_d

    :cond_f
    move-object/from16 v31, p2

    move/from16 v23, v2

    move-object/from16 v16, v4

    move-object/from16 v30, v5

    move/from16 v26, v14

    move-object/from16 v27, v15

    move-object/from16 v28, v17

    move-object/from16 v29, v21

    move-object v15, v0

    move-object v14, v6

    :goto_d
    :try_start_b
    invoke-virtual/range {v16 .. v16}, Lcom/digdroid/alman/dig/e4;->a()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8

    :catch_8
    :goto_e
    move/from16 v2, v23

    goto :goto_f

    :catch_9
    move-object/from16 v31, p2

    move/from16 v23, v2

    move-object/from16 v30, v5

    move/from16 v26, v14

    move-object/from16 v27, v15

    move-object/from16 v28, v17

    move-object/from16 v29, v21

    move-object v15, v0

    move-object v14, v6

    :goto_f
    if-nez v2, :cond_10

    if-lez v1, :cond_10

    goto/16 :goto_16

    :cond_10
    move v1, v2

    goto :goto_11

    :catch_a
    :goto_10
    move/from16 v26, v14

    goto/16 :goto_16

    :cond_11
    move-object/from16 v31, p2

    move-object/from16 v30, v5

    move/from16 v26, v14

    move-object/from16 v27, v15

    move-object/from16 v28, v17

    move-object/from16 v29, v21

    move-object v15, v0

    move-object v14, v6

    move/from16 v1, v20

    :goto_11
    const-wide/16 v2, -0x1

    if-nez v1, :cond_12

    :try_start_c
    const-string v0, "conf"

    invoke-virtual {v9, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual {v7, v15, v2, v3}, Lcom/digdroid/alman/dig/DatabaseService;->h(Ljava/io/File;J)Landroid/content/ContentValues;

    move-result-object v0

    if-eqz v0, :cond_12

    const-string v0, "j2me"

    invoke-virtual {v13, v0}, Lcom/digdroid/alman/dig/DatabaseService$d;->e(Ljava/lang/String;)V

    const/4 v1, 0x1

    :cond_12
    if-nez v1, :cond_13

    const-string v0, "collection.xml"

    move-object/from16 v6, v30

    invoke-virtual {v6, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-virtual {v7, v15, v2, v3}, Lcom/digdroid/alman/dig/DatabaseService;->i(Ljava/io/File;J)Z

    move-result v0

    if-eqz v0, :cond_14

    invoke-virtual {v13, v14}, Lcom/digdroid/alman/dig/DatabaseService$d;->e(Ljava/lang/String;)V

    const/4 v1, 0x1

    goto :goto_12

    :cond_13
    move-object/from16 v6, v30

    :cond_14
    :goto_12
    if-nez v1, :cond_17

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    invoke-virtual {v9, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    move-object/from16 v0, v29

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_17

    :cond_15
    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v0, p0

    move-object v2, v6

    move-object/from16 v4, p3

    move-object v6, v13

    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/DatabaseService;->k(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/digdroid/alman/dig/DatabaseService$d;)Z

    move-result v2

    const/4 v9, 0x0

    :cond_16
    const/4 v10, 0x2

    const/4 v12, 0x1

    goto/16 :goto_15

    :cond_17
    if-nez v1, :cond_1c

    invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/y3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_19

    iget-object v2, v7, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SELECT s.slug FROM chuds as c,games as g,systems as s WHERE c.sha1=x\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' AND g._id=c.gameid AND s._id=g.system"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v9, 0x0

    invoke-virtual {v2, v0, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_18

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v1}, Lcom/digdroid/alman/dig/DatabaseService$d;->e(Ljava/lang/String;)V

    const/4 v1, 0x1

    :cond_18
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    goto :goto_13

    :cond_19
    const/4 v9, 0x0

    :goto_13
    if-nez v1, :cond_1a

    move-object/from16 v0, p0

    move-object v1, v15

    move-object v2, v6

    move-object v3, v6

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object v10, v6

    move-object v6, v13

    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/DatabaseService;->k(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/digdroid/alman/dig/DatabaseService$d;)Z

    move-result v0

    move v2, v0

    goto :goto_14

    :cond_1a
    move-object v10, v6

    move v2, v1

    :goto_14
    if-nez v2, :cond_16

    invoke-virtual {v15}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    array-length v0, v11

    const/4 v12, 0x1

    if-lt v0, v12, :cond_1b

    array-length v0, v11

    sub-int/2addr v0, v12

    aget-object v2, v11, v0

    move-object/from16 v0, p0

    move-object v1, v15

    move-object v3, v10

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object v6, v13

    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/DatabaseService;->k(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/digdroid/alman/dig/DatabaseService$d;)Z

    move-result v2

    if-nez v2, :cond_1b

    array-length v0, v11

    const/4 v6, 0x2

    if-lt v0, v6, :cond_1b

    array-length v0, v11

    sub-int/2addr v0, v6

    aget-object v2, v11, v0

    move-object/from16 v0, p0

    move-object v1, v15

    move-object v3, v10

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    const/4 v10, 0x2

    move-object v6, v13

    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/DatabaseService;->k(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;Lcom/digdroid/alman/dig/DatabaseService$d;)Z

    move-result v2

    goto :goto_15

    :cond_1b
    const/4 v10, 0x2

    goto :goto_15

    :cond_1c
    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v12, 0x1

    move v2, v1

    goto :goto_15

    :cond_1d
    move-object/from16 v31, p2

    move/from16 v20, v2

    move-object/from16 v19, v10

    move-object/from16 v18, v12

    move/from16 v26, v14

    move-object/from16 v27, v15

    move-object/from16 v28, v17

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v12, 0x1

    move-object v14, v6

    :goto_15
    if-eqz v2, :cond_1e

    invoke-virtual {v13}, Lcom/digdroid/alman/dig/DatabaseService$d;->b()F

    move-result v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c

    const/high16 v1, 0x41f00000    # 30.0f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_1e

    goto :goto_17

    :catch_b
    move-object/from16 v19, v10

    move-object/from16 v18, v12

    goto/16 :goto_10

    :catch_c
    :cond_1e
    :goto_16
    add-int/lit8 v14, v26, 0x1

    move-object/from16 v11, p1

    move-object/from16 v12, v18

    move-object/from16 v10, v19

    const/4 v9, 0x0

    goto/16 :goto_0

    :cond_1f
    move-object v9, v2

    move-object/from16 v28, v3

    move-object/from16 v31, v5

    move-object v14, v6

    move-object/from16 v19, v10

    move-object/from16 v27, v15

    const/4 v10, 0x2

    const/4 v12, 0x1

    :goto_17
    invoke-virtual {v13}, Lcom/digdroid/alman/dig/DatabaseService$d;->c()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_29

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x4

    if-le v2, v3, :cond_22

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v2, v28

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    iget-object v3, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SELECT matches,system FROM rompaths WHERE _id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    invoke-virtual {v13}, Lcom/digdroid/alman/dig/DatabaseService$d;->b()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    if-ge v3, v5, :cond_20

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v13, v0}, Lcom/digdroid/alman/dig/DatabaseService$d;->a(Ljava/lang/String;)V

    move-object/from16 v31, v1

    move-object/from16 v28, v2

    goto :goto_17

    :cond_20
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {v1, v2, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "last_checked"

    move-object/from16 v5, v19

    invoke-virtual {v1, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "selected"

    invoke-virtual {v1, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "restoring"

    invoke-virtual {v1, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "matches"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v2, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "_id="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "rompaths"

    invoke-virtual {v2, v4, v1, v3, v9}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    invoke-virtual {v7, v0, v12}, Lcom/digdroid/alman/dig/DatabaseService;->d(IZ)V

    goto/16 :goto_1c

    :cond_21
    move-object/from16 v5, v19

    goto :goto_18

    :cond_22
    move-object/from16 v5, v19

    move-object/from16 v2, v28

    :goto_18
    const/4 v4, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_28

    iget-object v3, v7, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "SELECT _id FROM rompaths WHERE system!=\'none\' AND path="

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v8}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6, v9}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v6

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    if-eqz v6, :cond_23

    invoke-virtual {v13, v0}, Lcom/digdroid/alman/dig/DatabaseService$d;->a(Ljava/lang/String;)V

    goto/16 :goto_1b

    :cond_23
    invoke-virtual {v13}, Lcom/digdroid/alman/dig/DatabaseService$d;->b()F

    move-result v3

    move-object/from16 v19, v5

    float-to-double v4, v3

    const-wide/high16 v15, 0x403e000000000000L    # 30.0

    cmpg-double v3, v4, v15

    if-gez v3, :cond_27

    const/4 v4, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    move-object/from16 v3, v27

    goto :goto_19

    :sswitch_0
    move-object/from16 v3, v27

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_24

    goto :goto_19

    :cond_24
    const/4 v4, 0x2

    goto :goto_19

    :sswitch_1
    move-object/from16 v3, v27

    const-string v5, "amiga"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_25

    goto :goto_19

    :cond_25
    const/4 v4, 0x1

    goto :goto_19

    :sswitch_2
    move-object/from16 v3, v27

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_26

    goto :goto_19

    :cond_26
    const/4 v4, 0x0

    :goto_19
    packed-switch v4, :pswitch_data_0

    iget v4, v7, Lcom/digdroid/alman/dig/DatabaseService;->l:I

    goto :goto_1a

    :pswitch_0
    iget v4, v7, Lcom/digdroid/alman/dig/DatabaseService;->m:I

    iget v5, v7, Lcom/digdroid/alman/dig/DatabaseService;->l:I

    add-int/2addr v4, v5

    :goto_1a
    const/4 v5, 0x5

    if-lt v4, v5, :cond_27

    invoke-virtual {v13, v0}, Lcom/digdroid/alman/dig/DatabaseService$d;->d(Ljava/lang/String;)I

    move-result v5

    mul-int/lit8 v5, v5, 0x2

    if-ge v5, v4, :cond_27

    invoke-virtual {v13, v0}, Lcom/digdroid/alman/dig/DatabaseService$d;->a(Ljava/lang/String;)V

    move-object/from16 v31, v1

    move-object/from16 v28, v2

    move-object/from16 v27, v3

    goto/16 :goto_17

    :cond_27
    iget-object v1, v7, Lcom/digdroid/alman/dig/DatabaseService;->h:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v1, v0, v8}, Lcom/digdroid/alman/dig/g3;->u(Ljava/lang/String;Ljava/lang/String;)J

    move-result-wide v0

    long-to-int v1, v0

    invoke-virtual {v7, v1, v12}, Lcom/digdroid/alman/dig/DatabaseService;->d(IZ)V

    goto :goto_1c

    :cond_28
    :goto_1b
    move-object/from16 v31, v1

    move-object/from16 v28, v2

    move-object/from16 v19, v5

    goto/16 :goto_17

    :cond_29
    :goto_1c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdf3 -> :sswitch_2
        0x58a0b57 -> :sswitch_1
        0x6835485 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public onCreate()V
    .locals 2

    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->b:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->h()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->b:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/z1;->b(Landroid/content/Context;)Lcom/digdroid/alman/dig/z1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z1;->c()Z

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z1;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->f:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/DatabaseService;->b:Lcom/digdroid/alman/dig/u;

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/o0;->g(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/o0;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->g:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/o0;->o()V

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/DatabaseService;->b:Lcom/digdroid/alman/dig/u;

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/g3;->q(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/g3;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->h:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/g3;->B()V

    new-instance v0, Lcom/digdroid/alman/dig/l0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    invoke-direct {v0, v1}, Lcom/digdroid/alman/dig/l0;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    return-void
.end method

.method protected onHandleIntent(Landroid/content/Intent;)V
    .locals 4

    invoke-static {p0}, Lcom/digdroid/alman/dig/y3;->w(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_9

    if-eqz p1, :cond_9

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->f:Lcom/digdroid/alman/dig/b3;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/b3;->V(Z)V

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v2, "check_paths"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/DatabaseService;->b()V

    goto/16 :goto_0

    :cond_0
    const-string v2, "romupdates"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v0, "pathid"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const-string v1, "rescan"

    invoke-virtual {p1, v1, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/DatabaseService;->d(IZ)V

    goto/16 :goto_0

    :cond_1
    const-string v2, "kill_orphans"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/DatabaseService;->j()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/DatabaseService;->x()V

    goto :goto_0

    :cond_2
    const-string v2, "find_dirs"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/DatabaseService;->e()V

    goto :goto_0

    :cond_3
    const-string v2, "scan_dirs"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/DatabaseService;->p()V

    goto :goto_0

    :cond_4
    const-string v2, "scan_dir"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const-string v0, "param"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/DatabaseService;->r(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    const-string p1, "scandroid"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/DatabaseService;->q(Z)V

    goto :goto_0

    :cond_6
    const-string p1, "merge_games"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/DatabaseService;->l()V

    goto :goto_0

    :cond_7
    const-string p1, "sync"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "com.digdroid.alman.dig.action.SYNC"

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/ServerService;->t(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :cond_8
    const-string p1, "update_masterbase"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/DatabaseService;->f:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p1, v3}, Lcom/digdroid/alman/dig/b3;->V(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_9
    :goto_1
    return-void
.end method

.method p()V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v2, "SELECT _id,path FROM rompaths WHERE system=\'none\' LIMIT 1"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    if-nez v4, :cond_0

    return-void

    :cond_0
    const-wide/16 v4, 0x7d0

    invoke-virtual {v0, v4, v5}, Lcom/digdroid/alman/dig/DatabaseService;->s(J)V

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    iget-object v5, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v6, "SELECT extensions,slug FROM systems"

    invoke-virtual {v5, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v6

    const-string v7, ")$"

    const-string v8, "\\.("

    const-string v9, ""

    const/4 v10, 0x2

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v6, :cond_4

    :goto_0
    invoke-interface {v5, v12}, Landroid/database/Cursor;->isNull(I)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-interface {v5, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    invoke-interface {v5, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v5, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v10}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v13

    invoke-virtual {v4, v6, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v5, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v13, "\\|"

    invoke-virtual {v6, v13}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v13, v6

    const/4 v14, 0x0

    :goto_1
    if-ge v14, v13, :cond_2

    aget-object v15, v6, v14

    const-string v10, "folder"

    invoke-virtual {v15, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1

    invoke-virtual {v1, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v14, v14, 0x1

    const/4 v10, 0x2

    goto :goto_1

    :cond_2
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_2

    :cond_3
    const/4 v10, 0x2

    goto :goto_0

    :cond_4
    :goto_2
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    iget-object v6, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v10, "SELECT folder_exts,slug FROM systems"

    invoke-virtual {v6, v10, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v10

    if-eqz v10, :cond_7

    :cond_5
    invoke-interface {v6, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_6

    invoke-interface {v6, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v6, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x2

    invoke-static {v13, v14}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v13

    invoke-virtual {v5, v10, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v10

    if-nez v10, :cond_5

    :cond_7
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    const-string v6, "zip"

    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v6, "rar"

    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v6, "7z"

    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v6, "gz"

    invoke-virtual {v1, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "|"

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    goto :goto_3

    :cond_8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x2

    invoke-static {v1, v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    :goto_4
    iget-object v6, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v6, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v7

    const-string v8, "DELETE FROM rompaths WHERE _id="

    if-nez v7, :cond_f

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    iget-object v1, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v2, "DELETE FROM rompaths WHERE system=\'none\'"

    invoke-virtual {v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/digdroid/alman/dig/DatabaseService;->m()V

    iget-object v1, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v2, "SELECT _id,path FROM rompaths WHERE system=\'pc\' OR system=\'scumm\' OR system=\'amiga\'"

    invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_e

    :cond_9
    invoke-interface {v1, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v4, ".MagicBox"

    invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_a

    const/4 v7, 0x2

    goto/16 :goto_7

    :cond_a
    iget-object v4, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SELECT _id,path,system FROM rompaths WHERE path LIKE "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "%"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v5

    if-eqz v5, :cond_d

    :cond_b
    invoke-interface {v4, v12}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    invoke-interface {v4, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/16 v9, 0x2f

    invoke-virtual {v7, v9}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v9

    invoke-virtual {v7, v12, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    iget-object v7, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "UPDATE roms SET pathid=-1,ignored=1,present=0 WHERE pathid="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v7, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v5, v0, Lcom/digdroid/alman/dig/DatabaseService;->h:Lcom/digdroid/alman/dig/g3;

    const/4 v7, 0x2

    invoke-interface {v4, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/digdroid/alman/dig/g3;->D(Ljava/lang/String;)V

    goto :goto_5

    :cond_c
    const/4 v7, 0x2

    :goto_5
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-nez v5, :cond_b

    goto :goto_6

    :cond_d
    const/4 v7, 0x2

    :goto_6
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    :goto_7
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_9

    :cond_e
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    invoke-virtual/range {p0 .. p0}, Lcom/digdroid/alman/dig/DatabaseService;->n()V

    return-void

    :cond_f
    const/4 v7, 0x2

    invoke-interface {v6, v12}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9

    invoke-interface {v6, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v13}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v13

    if-eqz v13, :cond_10

    invoke-virtual {v0, v6, v1, v4, v5}, Lcom/digdroid/alman/dig/DatabaseService;->o(Ljava/io/File;Ljava/util/regex/Pattern;Ljava/util/HashMap;Ljava/util/HashMap;)V

    :cond_10
    iget-object v6, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto/16 :goto_4
.end method

.method q(Z)V
    .locals 13

    iget-object v0, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "SELECT ignored FROM systems WHERE slug=\'android\'"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v4, "UPDATE roms SET present=0 WHERE system=\'android\'"

    invoke-virtual {v1, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/IntentService;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/16 v4, 0x80

    invoke-virtual {v1, v4}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v5, "android"

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ApplicationInfo;

    iget v6, v4, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v7, v6, 0x1

    if-nez v7, :cond_2

    const/high16 v7, 0x2000000

    and-int/2addr v6, v7

    if-nez v6, :cond_4

    iget-object v6, v4, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    if-eqz v6, :cond_3

    const-string v7, "isGame"

    invoke-virtual {v6, v7, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_2

    :cond_3
    const/4 v6, 0x0

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v6, 0x1

    :goto_3
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "present"

    invoke-virtual {v7, v9, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v8, "ignored"

    if-eqz p1, :cond_5

    xor-int/lit8 v9, v6, 0x1

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    :cond_5
    iget-object v9, v4, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget-object v10, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "system=\'android\' AND filename="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v12, "roms"

    invoke-virtual {v10, v12, v7, v11, v2}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v7

    if-nez v7, :cond_2

    iget-object v7, p0, Lcom/digdroid/alman/dig/DatabaseService;->b:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v7}, Lcom/digdroid/alman/dig/u;->b()Landroid/content/ContentValues;

    move-result-object v7

    const-string v10, "system"

    invoke-virtual {v7, v10, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v10, "pathid"

    invoke-virtual {v7, v10, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p0}, Landroid/app/IntentService;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "title"

    invoke-virtual {v7, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v5, p0, Lcom/digdroid/alman/dig/DatabaseService;->g:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {v5, v4}, Lcom/digdroid/alman/dig/o0;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "sortname"

    invoke-virtual {v7, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "filename"

    invoke-virtual {v7, v4, v9}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    xor-int/lit8 v4, v6, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual {v7, v8, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    iget-object v4, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v4, v12, v2, v7}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v4

    iget-object v6, p0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "UPDATE roms SET merged_with=_id WHERE _id="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v6, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_6
    iget-object p1, p0, Lcom/digdroid/alman/dig/DatabaseService;->h:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {p1, v5}, Lcom/digdroid/alman/dig/g3;->D(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/DatabaseService;->n()V

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    return-void
.end method

.method r(Ljava/lang/String;)V
    .locals 7

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/y3;->y(Landroid/content/Context;)Ljava/io/File;

    move-result-object v4

    const/4 v3, 0x0

    const-wide/16 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-virtual/range {v1 .. v6}, Lcom/digdroid/alman/dig/DatabaseService;->f(Ljava/lang/String;ILjava/io/File;J)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/DatabaseService;->p()V

    invoke-virtual {p0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/DatabaseService;->l()V

    return-void
.end method

.method s(J)V
    .locals 0

    iput-wide p1, p0, Lcom/digdroid/alman/dig/DatabaseService;->j:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/digdroid/alman/dig/DatabaseService;->i:J

    return-void
.end method

.method w(Ljava/lang/String;Ljava/io/File;Ljava/util/regex/Pattern;)J
    .locals 22

    move-object/from16 v0, p0

    :try_start_0
    new-instance v3, Lcom/digdroid/alman/dig/e4;

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/digdroid/alman/dig/e4;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const/4 v4, 0x0

    const-wide/16 v5, -0x2

    const/4 v7, 0x0

    :goto_0
    :try_start_1
    invoke-virtual {v3}, Lcom/digdroid/alman/dig/e4;->d()Lcom/digdroid/alman/dig/e4$a;

    move-result-object v8

    if-eqz v8, :cond_3

    const-wide/16 v9, 0x0

    cmp-long v11, v5, v9

    if-gez v11, :cond_3

    add-int/lit8 v11, v7, 0x1

    const/16 v12, 0x1e

    if-ge v7, v12, :cond_3

    iget-object v7, v8, Lcom/digdroid/alman/dig/e4$a;->a:Ljava/lang/String;

    move-object/from16 v12, p3

    invoke-virtual {v12, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/regex/Matcher;->find()Z

    move-result v7

    iget-wide v13, v8, Lcom/digdroid/alman/dig/e4$a;->c:J

    iput-wide v13, v0, Lcom/digdroid/alman/dig/DatabaseService;->n:J

    iget-object v8, v0, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT g._id,g.gdbid,g.gfcover FROM games as g,crcs as c,systems as s WHERE c.rowid="

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " AND g._id=c.gameid AND s.slug=\'"

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, p1

    invoke-virtual {v15, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' AND g.system=s._id"

    invoke-virtual {v15, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v13, 0x0

    invoke-virtual {v8, v2, v13}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    const/4 v8, 0x2

    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    if-eqz v7, :cond_2

    const/4 v7, 0x1

    invoke-interface {v2, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v13

    cmp-long v7, v13, v9

    if-gez v7, :cond_2

    if-eqz v8, :cond_0

    const-string v7, ""

    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    :cond_0
    iget-object v7, v0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v18

    const/16 v19, 0x0

    const/16 v20, 0x55

    const/16 v21, 0x1

    move-object/from16 v16, v7

    move-object/from16 v17, p1

    invoke-virtual/range {v16 .. v21}, Lcom/digdroid/alman/dig/l0;->e(Ljava/lang/String;Ljava/lang/String;ZIZ)J

    move-result-wide v7

    cmp-long v13, v7, v9

    if-ltz v13, :cond_2

    move-wide v5, v7

    goto :goto_1

    :cond_1
    if-eqz v7, :cond_2

    iget-object v5, v0, Lcom/digdroid/alman/dig/DatabaseService;->e:Lcom/digdroid/alman/dig/l0;

    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v18

    const/16 v19, 0x0

    const/16 v20, 0x50

    const/16 v21, 0x0

    move-object/from16 v16, v5

    move-object/from16 v17, p1

    invoke-virtual/range {v16 .. v21}, Lcom/digdroid/alman/dig/l0;->e(Ljava/lang/String;Ljava/lang/String;ZIZ)J

    move-result-wide v5

    :cond_2
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    move v7, v11

    goto/16 :goto_0

    :cond_3
    invoke-virtual {v3}, Lcom/digdroid/alman/dig/e4;->a()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-wide v5

    :catch_0
    const-wide/16 v1, -0x1

    return-wide v1

    :catch_1
    const-wide/16 v1, -0x1

    return-wide v1
.end method

.method x()V
    .locals 16

    move-object/from16 v0, p0

    :goto_0
    iget-object v1, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v2, "SELECT _id,mdbid FROM roms WHERE age_rating IS NULL LIMIT 100"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-void

    :cond_0
    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const/4 v4, 0x0

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    const/4 v7, 0x1

    invoke-interface {v1, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v8

    const-wide/16 v10, 0x0

    const/4 v12, -0x1

    const-string v13, "age_rating"

    const-string v14, "youtube"

    cmp-long v15, v8, v10

    if-ltz v15, :cond_4

    iget-object v15, v0, Lcom/digdroid/alman/dig/DatabaseService;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "SELECT age_rating,youtube FROM games WHERE _id="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v15, v8, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v8, v4}, Landroid/database/Cursor;->isNull(I)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :cond_1
    invoke-interface {v8, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :goto_1
    invoke-virtual {v2, v13, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-interface {v8, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9

    const-wide/16 v11, 0x0

    cmp-long v4, v9, v11

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    :try_start_0
    invoke-interface {v8, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9

    invoke-static {v9, v10}, Lcom/digdroid/alman/dig/y3;->q(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v14, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_3
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v13, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :catch_0
    :goto_2
    invoke-virtual {v2, v14, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    goto :goto_4

    :cond_4
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2, v13, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {v2, v14, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :goto_4
    iget-object v4, v0, Lcom/digdroid/alman/dig/DatabaseService;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "_id="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, "roms"

    invoke-virtual {v4, v6, v2, v5, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    goto/16 :goto_0
.end method
