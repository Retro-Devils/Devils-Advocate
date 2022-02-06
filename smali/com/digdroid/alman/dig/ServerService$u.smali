.class Lcom/digdroid/alman/dig/ServerService$u;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/ServerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "u"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Lorg/json/JSONObject;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/ServerService;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/ServerService;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method private b(Lorg/json/JSONArray;)V
    .locals 20

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-virtual {v0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->h()V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iget-object v2, v1, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-static {v2}, Lcom/digdroid/alman/dig/ServerService;->g(Lcom/digdroid/alman/dig/ServerService;)Lcom/digdroid/alman/dig/b3;

    move-result-object v2

    const-string v3, "first_sync_t"

    const-wide/16 v4, 0x0

    invoke-virtual {v2, v3, v4, v5}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v4

    iget-object v2, v1, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-static {v2}, Lcom/digdroid/alman/dig/ServerService;->g(Lcom/digdroid/alman/dig/ServerService;)Lcom/digdroid/alman/dig/b3;

    move-result-object v2

    const-string v6, "last_sync_t"

    const-wide/32 v7, 0x77359400

    invoke-virtual {v2, v6, v7, v8}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v7

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Lorg/json/JSONArray;->length()I

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    const-string v9, "."

    const/16 v10, 0x320

    if-le v2, v10, :cond_0

    :try_start_1
    new-instance v11, Landroid/content/Intent;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v13, v1, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-virtual {v13}, Landroid/app/IntentService;->getPackageName()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, "STATS_START"

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v12, v1, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-virtual {v12}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v12

    invoke-static {v12}, Lb/n/a/a;->b(Landroid/content/Context;)Lb/n/a/a;

    move-result-object v12

    invoke-virtual {v12, v11}, Lb/n/a/a;->d(Landroid/content/Intent;)Z

    :cond_0
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_0
    if-ge v12, v2, :cond_4

    move-object/from16 v13, p1

    :try_start_2
    invoke-virtual {v13, v12}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;

    move-result-object v14

    move-object v15, v9

    invoke-virtual {v14, v11}, Lorg/json/JSONArray;->getLong(I)J

    move-result-wide v9

    const/4 v11, 0x1

    move/from16 v17, v2

    move-object/from16 v16, v3

    invoke-virtual {v14, v11}, Lorg/json/JSONArray;->getDouble(I)D

    move-result-wide v2

    double-to-float v2, v2

    const/4 v3, 0x2

    invoke-virtual {v14, v3}, Lorg/json/JSONArray;->getInt(I)I

    move-result v3

    if-le v3, v11, :cond_1

    const/high16 v11, 0x41200000    # 10.0f

    mul-float v2, v2, v11

    int-to-float v11, v3

    div-float/2addr v2, v11

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    int-to-double v1, v2

    const-wide/high16 v18, 0x4024000000000000L    # 10.0

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    div-double v1, v1, v18

    double-to-float v2, v1

    :cond_1
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "UPDATE roms SET c_rating="

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v2, ",c_rating_count="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",c_played_total="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x3

    invoke-virtual {v14, v2}, Lorg/json/JSONArray;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ",c_played_count="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x4

    invoke-virtual {v14, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",comments="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x6

    invoke-virtual {v14, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",lastcomment="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x7

    invoke-virtual {v14, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " WHERE mdbid="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const/4 v1, 0x5

    invoke-virtual {v14, v1}, Lorg/json/JSONArray;->getLong(I)J

    move-result-wide v1

    cmp-long v3, v1, v4

    if-lez v3, :cond_2

    move-wide v4, v1

    :cond_2
    cmp-long v3, v1, v7

    if-gez v3, :cond_3

    move-wide v7, v1

    :cond_3
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v1, p0

    move-object v9, v15

    move-object/from16 v3, v16

    move/from16 v2, v17

    const/16 v10, 0x320

    const/4 v11, 0x0

    goto/16 :goto_0

    :cond_4
    move/from16 v17, v2

    move-object/from16 v16, v3

    move-object v15, v9

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-object/from16 v1, p0

    :try_start_4
    iget-object v0, v1, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-static {v0}, Lcom/digdroid/alman/dig/ServerService;->g(Lcom/digdroid/alman/dig/ServerService;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    move-object/from16 v2, v16

    invoke-virtual {v0, v2, v4, v5}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    iget-object v0, v1, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-static {v0}, Lcom/digdroid/alman/dig/ServerService;->g(Lcom/digdroid/alman/dig/ServerService;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    invoke-virtual {v0, v6, v7, v8}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    move/from16 v0, v17

    const/16 v2, 0x320

    if-le v0, v2, :cond_5

    new-instance v0, Landroid/content/Intent;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v1, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-virtual {v3}, Landroid/app/IntentService;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v3, v15

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "STATS_END"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v2, v1, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-virtual {v2}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lb/n/a/a;->b(Landroid/content/Context;)Lb/n/a/a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lb/n/a/a;->d(Landroid/content/Intent;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_2

    :catch_0
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    :goto_2
    return-void
.end method


# virtual methods
.method protected varargs a([Lorg/json/JSONObject;)Ljava/lang/Void;
    .locals 4

    const-string v0, "stats"

    const-string v1, "status"

    const/4 v2, 0x0

    aget-object p1, p1, v2

    if-eqz p1, :cond_3

    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "badtoken"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-static {p1}, Lcom/digdroid/alman/dig/ServerService;->g(Lcom/digdroid/alman/dig/ServerService;)Lcom/digdroid/alman/dig/b3;

    move-result-object p1

    const-string v0, "token"

    const-string v1, "0"

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/b3;->G(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2}, Lcom/digdroid/alman/dig/ServerService;->e(Z)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-static {p1}, Lcom/digdroid/alman/dig/ServerService;->i(Lcom/digdroid/alman/dig/ServerService;)V

    goto :goto_0

    :cond_0
    const-string v3, "ok"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/ServerService$u;->b(Lorg/json/JSONArray;)V

    :cond_1
    new-instance p1, Lcom/digdroid/alman/dig/ServerService$r;

    iget-object v0, p0, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-direct {p1, v0}, Lcom/digdroid/alman/dig/ServerService$r;-><init>(Lcom/digdroid/alman/dig/ServerService;)V

    new-array v0, v2, [Ljava/lang/Void;

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-static {p1}, Lcom/digdroid/alman/dig/ServerService;->h(Lcom/digdroid/alman/dig/ServerService;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_3
    iget-object p1, p0, Lcom/digdroid/alman/dig/ServerService$u;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-static {p1}, Lcom/digdroid/alman/dig/ServerService;->h(Lcom/digdroid/alman/dig/ServerService;)V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/ServerService$u;->a([Lorg/json/JSONObject;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
