.class Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/SDCardBroadcastReceiver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
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
.field a:Landroid/content/Context;

.field b:Landroid/content/Intent;

.field final synthetic c:Lcom/digdroid/alman/dig/SDCardBroadcastReceiver;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/SDCardBroadcastReceiver;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;->c:Lcom/digdroid/alman/dig/SDCardBroadcastReceiver;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p2, p0, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;->b:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "android.intent.action.MEDIA_MOUNTED"

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, v0, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;->a:Landroid/content/Context;

    if-eqz v3, :cond_8

    invoke-static {v3}, Lcom/digdroid/alman/dig/a4;->x(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_8

    iget-object v3, v0, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/digdroid/alman/dig/a4;->v(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_8

    iget-object v3, v0, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;->b:Landroid/content/Intent;

    if-nez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {v3}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "android.intent.action.MEDIA_EJECT"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "android.intent.action.MEDIA_REMOVED"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, "android.intent.action.MEDIA_BAD_REMOVAL"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    const-wide/32 v6, 0x1d4c0

    cmp-long v8, v4, v6

    if-gtz v8, :cond_2

    return-object v2

    :cond_2
    iget-object v6, v0, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;->a:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object v6

    invoke-virtual {v6}, Lcom/digdroid/alman/dig/u;->h()V

    invoke-virtual {v6}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v7

    iget-object v8, v0, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;->a:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object v8

    iget-object v9, v0, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;->a:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9, v6}, Lcom/digdroid/alman/dig/h3;->r(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/h3;

    move-result-object v6

    invoke-virtual {v6}, Lcom/digdroid/alman/dig/h3;->C()V

    iget-object v9, v0, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;->a:Landroid/content/Context;

    invoke-virtual {v9, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v9

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    const-string v10, "Android.*$"

    const-string v11, ""

    invoke-virtual {v9, v10, v11}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "SELECT _id,path FROM rompaths WHERE system!=\'none\'"

    invoke-virtual {v7, v10, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v11

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eqz v11, :cond_6

    :goto_0
    invoke-interface {v10, v15}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v12

    invoke-interface {v10, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v14

    if-lt v2, v14, :cond_4

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v11, v15, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-wide/32 v16, 0xea60

    cmp-long v2, v4, v16

    if-lez v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "UPDATE rompaths SET last_checked=0 WHERE _id="

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v6, v12, v13, v15}, Lcom/digdroid/alman/dig/h3;->b(JZ)V

    :cond_4
    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_1

    :cond_5
    const/4 v2, 0x0

    const/4 v14, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-wide/32 v1, 0xea60

    cmp-long v3, v4, v1

    if-lez v3, :cond_7

    const-string v1, "auto_scan"

    const/4 v2, 0x1

    invoke-virtual {v8, v1, v2}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v8, v15}, Lcom/digdroid/alman/dig/c3;->L(Z)V

    const-string v1, "sd_dirs_last_scanned"

    const-wide/16 v2, 0x0

    invoke-virtual {v8, v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->F(Ljava/lang/String;J)V

    iget-object v1, v0, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "find_dirs"

    invoke-static {v1, v2}, Lcom/digdroid/alman/dig/DatabaseService;->v(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "scan_dirs"

    invoke-static {v1, v2}, Lcom/digdroid/alman/dig/DatabaseService;->v(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "merge_games"

    invoke-static {v1, v2}, Lcom/digdroid/alman/dig/DatabaseService;->v(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_7
    const/4 v1, 0x0

    goto :goto_3

    :cond_8
    :goto_2
    move-object v1, v2

    return-object v1

    :catch_1
    move-object v1, v2

    :goto_3
    return-object v1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/SDCardBroadcastReceiver$a;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
