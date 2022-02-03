.class public Lcom/digdroid/alman/dig/u;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static a:Landroid/database/sqlite/SQLiteDatabase;

.field private static b:Lcom/digdroid/alman/dig/z2;

.field private static c:Lcom/digdroid/alman/dig/u;


# instance fields
.field private d:Landroid/content/Context;

.field private e:Lcom/digdroid/alman/dig/c3;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/u;->e:Lcom/digdroid/alman/dig/c3;

    return-void
.end method

.method public static declared-synchronized e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/u;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/digdroid/alman/dig/u;->c:Lcom/digdroid/alman/dig/u;

    if-nez v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/u;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/u;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/digdroid/alman/dig/u;->c:Lcom/digdroid/alman/dig/u;

    :cond_0
    sget-object p0, Lcom/digdroid/alman/dig/u;->c:Lcom/digdroid/alman/dig/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method

.method private i(Ljava/lang/String;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/database/sqlite/SQLiteDatabase;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    new-instance v3, Lcom/digdroid/alman/dig/n;

    iget-object v4, v0, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-direct {v3, v4}, Lcom/digdroid/alman/dig/n;-><init>(Landroid/content/Context;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "systems/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, p2

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/digdroid/alman/dig/n;->j(Ljava/lang/String;)V

    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    const-string v5, "name"

    invoke-virtual {v3, v5}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "system"

    invoke-virtual {v3, v7}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "core"

    invoke-virtual {v3, v9}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "package"

    invoke-virtual {v3, v5}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v5, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "class"

    invoke-virtual {v3, v7}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4, v7, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v9, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "config_dir"

    invoke-virtual {v3, v7}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4, v7, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "rom_key"

    invoke-virtual {v3, v7}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4, v7, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "action"

    invoke-virtual {v3, v7}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v11, "action_type"

    invoke-virtual {v4, v11, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "data_type"

    invoke-virtual {v3, v7}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4, v7, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "takes_zip"

    invoke-virtual {v3, v7}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, ""

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    const-string v15, "true"

    const/4 v14, 0x1

    if-nez v13, :cond_1

    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    goto :goto_0

    :cond_0
    const/4 v11, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v11, 0x1

    :goto_1
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v4, v7, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {v10, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const-string v11, "SELECT _id,user_edited FROM emulators WHERE system=\'"

    const/4 v13, 0x0

    if-nez v7, :cond_2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "\' AND core="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v10}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_2

    :cond_2
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "\' AND name="

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v6}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    :goto_2
    invoke-virtual {v1, v6, v13}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v7

    const-string v10, "emulators"

    move-object/from16 p1, v8

    if-eqz v7, :cond_3

    const/4 v7, 0x0

    invoke-interface {v6, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    invoke-interface {v6, v14}, Landroid/database/Cursor;->getInt(I)I

    move-result v11

    if-nez v11, :cond_4

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "_id="

    invoke-virtual {v11, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1, v10, v4, v11, v13}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    goto :goto_3

    :cond_3
    invoke-virtual {v1, v10, v13, v4}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v7

    :cond_4
    :goto_3
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    invoke-virtual {v3, v9}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v3, v5}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/u;->g(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v5, p1

    move-object/from16 v4, p5

    invoke-virtual {v4, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p1

    :goto_4
    const-string v1, "default"

    invoke-virtual {v3, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    :cond_6
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v2, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    return-void
.end method

.method private j(Ljava/lang/String;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 4

    new-instance v0, Lcom/digdroid/alman/dig/n;

    iget-object v1, p0, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/digdroid/alman/dig/n;-><init>(Landroid/content/Context;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "systems/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/digdroid/alman/dig/n;->j(Ljava/lang/String;)V

    new-instance p2, Landroid/content/ContentValues;

    invoke-direct {p2}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "slug"

    invoke-virtual {p2, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "parent"

    invoke-virtual {p2, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "extensions"

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "folder_extensions"

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "folder_exts"

    invoke-virtual {p2, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "type"

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "generation"

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "introduced"

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/digdroid/alman/dig/a4;->t(Ljava/lang/String;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "slug=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "systems"

    const/4 v2, 0x0

    invoke-virtual {p3, v1, p2, p1, v2}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "name"

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, p1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v3, "numgames"

    invoke-virtual {p2, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const/4 p1, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v3, "emulator"

    invoke-virtual {p2, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string p1, "retroarch_overlay"

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "overlay"

    invoke-virtual {p2, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v1, v2, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    :cond_0
    return-void
.end method


# virtual methods
.method a(Ljava/util/HashMap;Ljava/util/HashMap;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "SELECT slug FROM systems WHERE emulator<0"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_0
    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :goto_0
    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :cond_2
    :goto_1
    const-wide/16 v4, 0x0

    cmp-long v6, v1, v4

    if-ltz v6, :cond_3

    sget-object v4, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "UPDATE systems SET emulator="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " WHERE slug=\'"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_3
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_4
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-void
.end method

.method public b()Landroid/content/ContentValues;
    .locals 5

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "mdbid"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "gdbid"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "merged_with"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "emulator"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "favorite"

    invoke-virtual {v0, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v3, "released"

    invoke-virtual {v0, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v3, "last_played"

    invoke-virtual {v0, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v3, "times_played"

    invoke-virtual {v0, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v3, "time_played"

    invoke-virtual {v0, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v3, "developer"

    const-string v4, ""

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "publisher"

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "info"

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "notes"

    invoke-virtual {v0, v3, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v3, 0x5307

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "cover_status"

    invoke-virtual {v0, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "cover_requested"

    invoke-virtual {v0, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v3, "ignored"

    invoke-virtual {v0, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "present"

    invoke-virtual {v0, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "crc"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public c()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/u;->b:Lcom/digdroid/alman/dig/z2;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public d(Landroid/database/sqlite/SQLiteDatabase;Ljava/util/HashMap;Ljava/util/HashMap;)Z
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/database/sqlite/SQLiteDatabase;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;)Z"
        }
    .end annotation

    move-object/from16 v6, p0

    const-string v0, "^emu_([^_]+)_"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v7

    iget-object v0, v6, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "systems"

    invoke-virtual {v0, v2}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    array-length v0, v8

    int-to-long v2, v0

    long-to-float v9, v2

    const/high16 v10, 0x41f00000    # 30.0f

    div-float v0, v9, v10

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    int-to-long v11, v0

    const-wide/16 v13, 0x0

    move-wide/from16 v16, v13

    move-wide/from16 v18, v16

    const/4 v15, 0x0

    :goto_0
    array-length v0, v8

    const/4 v1, 0x1

    if-ge v15, v0, :cond_2

    aget-object v2, v8, v15

    invoke-virtual {v7, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/u;->i(Ljava/lang/String;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;Ljava/util/HashMap;Ljava/util/HashMap;)V

    :cond_0
    const-wide/16 v0, 0x1

    add-long v16, v16, v0

    cmp-long v0, v16, v11

    if-ltz v0, :cond_1

    add-long v0, v18, v16

    new-instance v2, Landroid/content/Intent;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, v6, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "INSTALL_PROGRESS"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    long-to-float v3, v0

    mul-float v3, v3, v10

    div-float/2addr v3, v9

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    add-int/lit8 v3, v3, 0xa

    const-string v4, "progress"

    invoke-virtual {v2, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v3, v6, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-static {v3}, Lb/o/a/a;->b(Landroid/content/Context;)Lb/o/a/a;

    move-result-object v3

    invoke-virtual {v3, v2}, Lb/o/a/a;->d(Landroid/content/Intent;)Z

    move-wide/from16 v18, v0

    move-wide/from16 v16, v13

    :cond_1
    add-int/lit8 v15, v15, 0x1

    goto :goto_0

    :catch_0
    :cond_2
    return v1
.end method

.method public f(Landroid/database/sqlite/SQLiteDatabase;)Z
    .locals 7

    iget-object v0, p0, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0

    const-string v1, "^sys_(\\w+).cfg$"

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "systems"

    invoke-virtual {v0, v3}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    array-length v3, v0

    const/4 v4, 0x1

    if-ge v2, v3, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v1, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v5, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4, v3, p1}, Lcom/digdroid/alman/dig/u;->j(Ljava/lang/String;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v4

    :catch_0
    return v2
.end method

.method public g(Ljava/lang/String;)Z
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ApplicationInfo;

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public declared-synchronized h()V
    .locals 8

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    const-string v1, "games.db"

    invoke-static {v0, v1, p0}, Lcom/digdroid/alman/dig/z2;->a(Landroid/content/Context;Ljava/lang/String;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/z2;

    move-result-object v0

    sput-object v0, Lcom/digdroid/alman/dig/u;->b:Lcom/digdroid/alman/dig/z2;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    sput-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->enableWriteAheadLogging()Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/u;->e:Lcom/digdroid/alman/dig/c3;

    const-string v1, "data_version"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v1, 0x1cf

    if-lt v0, v1, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN has_images INTEGER"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :try_start_2
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE INDEX has_images_idx ON roms (has_images)"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_1
    :try_start_3
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE INDEX mergedidx ON roms (merged_with)"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN merged_last_played INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN merged_times_played INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN merged_time_played INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_2
    :try_start_4
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN rating real"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_3
    :try_start_5
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN c_rating REAL NOT NULL DEFAULT 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN c_rating_count INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN c_played_total INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN c_played_count INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE INDEX cratingidx ON roms (c_rating)"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE INDEX cratingcountidx ON roms (c_rating_count)"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE INDEX cplayedtotalidx ON roms (c_played_total)"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE INDEX cplayedcountidx ON roms (c_played_count)"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_4
    :try_start_6
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN foldername text"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catch_5
    :try_start_7
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN fuzzy_match integer"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE INDEX fuzzyidx ON roms (fuzzy_match)"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catch_6
    :try_start_8
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN forumcreated INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :catch_7
    :try_start_9
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN comments INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN lastcomment INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :catch_8
    :try_start_a
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN youtube TEXT"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    :catch_9
    :try_start_b
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE roms ADD COLUMN age_rating INTEGER"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE INDEX ageidx ON roms (age_rating)"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_a
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :catch_a
    :try_start_c
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE INDEX mdbididx ON roms (mdbid)"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_b
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    :catch_b
    :try_start_d
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE systems ADD COLUMN folder_exts text"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_c
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    :catch_c
    :try_start_e
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE systems ADD COLUMN type text"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE systems ADD COLUMN introduced integer"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE systems ADD COLUMN generation integer"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_d
    .catchall {:try_start_e .. :try_end_e} :catchall_0

    :catch_d
    :try_start_f
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE systems ADD COLUMN ignored integer not null default 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_e
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    :catch_e
    :try_start_10
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE systems ADD COLUMN overlay_opacity real not null default 0.7"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_f
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    :catch_f
    :try_start_11
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE systems ADD COLUMN user_set_overlay integer not null default 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_10
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    :catch_10
    :try_start_12
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE systems ADD COLUMN parent text"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_11
    .catchall {:try_start_12 .. :try_end_12} :catchall_0

    :catch_11
    :try_start_13
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE systems ADD COLUMN show_covers INTEGER NOT NULL DEFAULT 1"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE systems ADD COLUMN show_merged INTEGER NOT NULL DEFAULT 1"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_12
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    :catch_12
    :try_start_14
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE systems ADD COLUMN forumcreated INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_13
    .catchall {:try_start_14 .. :try_end_14} :catchall_0

    :catch_13
    :try_start_15
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE systems ADD COLUMN has_theme_icon INTEGER"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_14
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    :catch_14
    :try_start_16
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE systems ADD COLUMN icon_aspect_ratio REAL NOT NULL DEFAULT 1.0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_15
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    :catch_15
    :try_start_17
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE rompaths ADD COLUMN present integer not null default 1"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_16
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    :catch_16
    :try_start_18
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE rompaths ADD COLUMN restoring integer not null default 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_17
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    :catch_17
    :try_start_19
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE rompaths ADD COLUMN matches integer not null default 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_18
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    :catch_18
    :try_start_1a
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE rompaths ADD COLUMN uri text"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_19
    .catchall {:try_start_1a .. :try_end_1a} :catchall_0

    :catch_19
    :try_start_1b
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE emulators ADD COLUMN data_type text"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_1a
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    :catch_1a
    :try_start_1c
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE emulators ADD COLUMN action_type text"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_1c
    .catch Ljava/lang/Exception; {:try_start_1c .. :try_end_1c} :catch_1b
    .catchall {:try_start_1c .. :try_end_1c} :catchall_0

    :catch_1b
    :try_start_1d
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE emulators ADD COLUMN takes_zip integer"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_1c
    .catchall {:try_start_1d .. :try_end_1d} :catchall_0

    :catch_1c
    :try_start_1e
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE emulators ADD COLUMN config_dir text"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_1d
    .catchall {:try_start_1e .. :try_end_1e} :catchall_0

    :catch_1d
    :try_start_1f
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE emulators ADD COLUMN use_retroarch64 integer not null default 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_1e
    .catchall {:try_start_1f .. :try_end_1f} :catchall_0

    :catch_1e
    :try_start_20
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE emulators ADD COLUMN user_edited integer not null default 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_1f
    .catchall {:try_start_20 .. :try_end_20} :catchall_0

    :catch_1f
    :try_start_21
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE TABLE collections(_id integer primary key autoincrement, name text, parent integer )"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE INDEX collectionidx ON collections( parent, name ) "

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE TABLE gamecollection( _id integer primary key autoincrement, game integer, collection integer)"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE INDEX colectiongameidx ON gamegenres( game )"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE INDEX colectioncolectionidx ON gamegenres( genre )"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_20
    .catchall {:try_start_21 .. :try_end_21} :catchall_0

    :catch_20
    :try_start_22
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE collections ADD COLUMN isfolder integer"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_22
    .catch Ljava/lang/Exception; {:try_start_22 .. :try_end_22} :catch_21
    .catchall {:try_start_22 .. :try_end_22} :catchall_0

    :catch_21
    const/4 v0, 0x0

    const/4 v1, 0x7

    :try_start_23
    sget-object v3, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v4, "CREATE TABLE main(_id integer primary key autoincrement, type integer)"

    invoke-virtual {v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    const-string v5, "type"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    sget-object v5, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v6, "main"

    invoke-virtual {v5, v6, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_23
    .catch Ljava/lang/Exception; {:try_start_23 .. :try_end_23} :catch_22
    .catchall {:try_start_23 .. :try_end_23} :catchall_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catch_22
    :cond_1
    :try_start_24
    sget-object v3, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v4, "ALTER TABLE main ADD COLUMN position INTEGER"

    invoke-virtual {v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v3, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v4, "ALTER TABLE main ADD COLUMN enabled integer NOT NULL DEFAULT 1"

    invoke-virtual {v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v3, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v4, "ALTER TABLE main ADD COLUMN itemid integer"

    invoke-virtual {v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v3, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v4, "ALTER TABLE main ADD COLUMN itemaux integer"

    invoke-virtual {v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :goto_1
    if-ge v2, v1, :cond_3

    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    const-string v4, "position"

    const/4 v5, 0x6

    if-ge v2, v5, :cond_2

    move v5, v2

    goto :goto_2

    :cond_2
    const v5, 0x98967f

    :goto_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    sget-object v4, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v5, "main"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "type="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v3, v6, v0}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_23
    .catchall {:try_start_24 .. :try_end_24} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :catch_23
    :cond_3
    :try_start_25
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE TABLE themes(_id integer primary key autoincrement, name text, forum_id integer, image_url text, modified integer)"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE INDEX themenameidx ON themes( name ) "

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "CREATE INDEX thememodifiedidx ON themes( modified ) "

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_25
    .catch Ljava/lang/Exception; {:try_start_25 .. :try_end_25} :catch_24
    .catchall {:try_start_25 .. :try_end_25} :catchall_0

    :catch_24
    :try_start_26
    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE themes ADD COLUMN minsize INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "ALTER TABLE themes ADD COLUMN maxsize INTEGER NOT NULL DEFAULT 0"

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_26
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_26} :catch_25
    .catchall {:try_start_26 .. :try_end_26} :catchall_0

    :catch_25
    :try_start_27
    iget-object v0, p0, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/digdroid/alman/dig/a4;->v(Landroid/content/Context;)Z

    move-result v0
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_0

    if-eqz v0, :cond_4

    monitor-exit p0

    return-void

    :cond_4
    :try_start_28
    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "INSTALL_PROGRESS"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "progress"

    const/4 v2, 0x5

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v1, p0, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-static {v1}, Lb/o/a/a;->b(Landroid/content/Context;)Lb/o/a/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lb/o/a/a;->d(Landroid/content/Intent;)Z

    sget-object v0, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/u;->f(Landroid/database/sqlite/SQLiteDatabase;)Z

    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "INSTALL_PROGRESS"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "progress"

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v1, p0, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-static {v1}, Lb/o/a/a;->b(Landroid/content/Context;)Lb/o/a/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lb/o/a/a;->d(Landroid/content/Intent;)Z

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sget-object v2, Lcom/digdroid/alman/dig/u;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {p0, v2, v0, v1}, Lcom/digdroid/alman/dig/u;->d(Landroid/database/sqlite/SQLiteDatabase;Ljava/util/HashMap;Ljava/util/HashMap;)Z

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/u;->a(Ljava/util/HashMap;Ljava/util/HashMap;)V

    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "INSTALL_PROGRESS"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "progress"

    const/16 v2, 0x28

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object v1, p0, Lcom/digdroid/alman/dig/u;->d:Landroid/content/Context;

    invoke-static {v1}, Lb/o/a/a;->b(Landroid/content/Context;)Lb/o/a/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lb/o/a/a;->d(Landroid/content/Intent;)Z
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_0

    :cond_5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_4

    :goto_3
    throw v0

    :goto_4
    goto :goto_3
.end method
