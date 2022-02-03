.class public abstract Lcom/digdroid/alman/dig/x2;
.super Lcom/digdroid/alman/dig/a2;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/a2;-><init>()V

    return-void
.end method


# virtual methods
.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 6

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/d;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x64

    if-ne p1, v0, :cond_0

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/t;->E:Z

    if-eqz p1, :cond_c

    const-string p1, "retroarch"

    invoke-static {p0, p1}, Lcom/digdroid/alman/dig/a4;->F(Landroid/content/Context;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_0
    const/16 v0, 0x65

    const/4 v1, 0x3

    const/16 v2, 0x13

    const/4 v3, -0x1

    if-ne p1, v0, :cond_2

    if-ne p2, v3, :cond_2

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v2, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string p3, "scan_uri"

    invoke-static {p2, p3, p1}, Lcom/digdroid/alman/dig/DatabaseService;->w(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)V

    goto/16 :goto_2

    :cond_2
    const/16 v0, 0x68

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-ne p1, v0, :cond_4

    if-ne p2, v3, :cond_4

    if-eqz p3, :cond_4

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v2, :cond_3

    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    :cond_3
    iget-object p2, p0, Lcom/digdroid/alman/dig/t;->y:Lcom/digdroid/alman/dig/h3;

    iget-object p3, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v0, "___tmp_system_rom_path"

    invoke-virtual {p3, v0, v5}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p3, p1, v4}, Lcom/digdroid/alman/dig/h3;->a(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object p1

    if-eqz p1, :cond_c

    instance-of p2, p1, Lcom/digdroid/alman/dig/g3;

    if-eqz p2, :cond_c

    check-cast p1, Lcom/digdroid/alman/dig/g3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/g3;->M3()V

    goto/16 :goto_2

    :cond_4
    const/16 v0, 0x66

    if-ne p1, v0, :cond_5

    if-ne p2, v3, :cond_5

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    invoke-static {p0}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p2

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "dig_dir"

    invoke-virtual {p2, v0, p3}, Lcom/digdroid/alman/dig/c3;->G(Ljava/lang/String;Ljava/lang/String;)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v2, :cond_c

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    goto/16 :goto_2

    :cond_5
    const/16 v0, 0x69

    if-ne p1, v0, :cond_6

    if-ne p2, v3, :cond_6

    if-eqz p3, :cond_6

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    invoke-static {p0}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p2

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "retroarch_dir"

    invoke-virtual {p2, v0, p3}, Lcom/digdroid/alman/dig/c3;->G(Ljava/lang/String;Ljava/lang/String;)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v2, :cond_c

    goto :goto_0

    :cond_6
    const/16 v0, 0x67

    if-ne p1, v0, :cond_8

    if-ne p2, v3, :cond_8

    if-eqz p3, :cond_8

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt p2, v2, :cond_7

    invoke-virtual {p0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    :cond_7
    new-instance p2, Lcom/digdroid/alman/dig/x2$a;

    invoke-direct {p2, p0, p1}, Lcom/digdroid/alman/dig/x2$a;-><init>(Lcom/digdroid/alman/dig/x2;Landroid/net/Uri;)V

    new-instance p1, Lcom/digdroid/alman/dig/t$a;

    invoke-direct {p1, p0, v5, p2}, Lcom/digdroid/alman/dig/t$a;-><init>(Lcom/digdroid/alman/dig/t;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Callable;)V

    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array p3, v4, [Ljava/lang/Void;

    invoke-virtual {p1, p2, p3}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto/16 :goto_2

    :cond_8
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_9

    if-ne p2, v3, :cond_9

    if-eqz p3, :cond_9

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance p1, Lcom/digdroid/alman/dig/x2$b;

    invoke-direct {p1, p0, p3}, Lcom/digdroid/alman/dig/x2$b;-><init>(Lcom/digdroid/alman/dig/x2;Landroid/content/Intent;)V

    new-instance p2, Lcom/digdroid/alman/dig/t$a;

    invoke-direct {p2, p0, p1, v5}, Lcom/digdroid/alman/dig/t$a;-><init>(Lcom/digdroid/alman/dig/t;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Callable;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array p3, v4, [Ljava/lang/Void;

    invoke-virtual {p2, p1, p3}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto/16 :goto_2

    :cond_9
    const/16 v0, 0x3e8

    if-lt p1, v0, :cond_a

    if-ne p2, v3, :cond_a

    if-eqz p3, :cond_a

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance p2, Lcom/digdroid/alman/dig/x2$c;

    invoke-direct {p2, p0, p3, p1}, Lcom/digdroid/alman/dig/x2$c;-><init>(Lcom/digdroid/alman/dig/x2;Landroid/content/Intent;I)V

    new-instance p1, Lcom/digdroid/alman/dig/t$a;

    invoke-direct {p1, p0, p2, v5}, Lcom/digdroid/alman/dig/t$a;-><init>(Lcom/digdroid/alman/dig/t;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Callable;)V

    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array p3, v4, [Ljava/lang/Void;

    invoke-virtual {p1, p2, p3}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_2

    :cond_a
    const/16 v0, 0xca

    if-ne p1, v0, :cond_c

    if-ne p2, v3, :cond_c

    if-eqz p3, :cond_c

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_c

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/Activity;->getFilesDir()Ljava/io/File;

    move-result-object p2

    if-eqz p2, :cond_c

    iget-object p3, p0, Lcom/digdroid/alman/dig/t;->A:Lcom/digdroid/alman/dig/t1;

    if-eqz p3, :cond_c

    new-instance p3, Ljava/io/File;

    const-string v0, "dig_backup.bak"

    invoke-direct {p3, p2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/t;->A:Lcom/digdroid/alman/dig/t1;

    invoke-virtual {p2, p1, p3}, Lcom/digdroid/alman/dig/t1;->B(Landroid/net/Uri;Ljava/io/File;)Z

    move-result p1

    const p2, 0x7f1101da

    if-nez p1, :cond_b

    new-instance p1, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result p3

    invoke-direct {p1, p0, p3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const p3, 0x7f1101cc

    invoke-virtual {p1, p3}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, p2, v5}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    goto :goto_1

    :cond_b
    new-instance p1, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result p3

    invoke-direct {p1, p0, p3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const p3, 0x7f11021a

    invoke-virtual {p1, p3}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const p3, 0x7f11005a

    invoke-virtual {p1, p3, v5}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    new-instance p3, Lcom/digdroid/alman/dig/x2$d;

    invoke-direct {p3, p0}, Lcom/digdroid/alman/dig/x2$d;-><init>(Lcom/digdroid/alman/dig/x2;)V

    invoke-virtual {p1, p2, p3}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    :goto_1
    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_c
    :goto_2
    return-void
.end method

.method public onResume()V
    .locals 14

    invoke-super {p0}, Lcom/digdroid/alman/dig/p2;->onResume()V

    iget-wide v6, p0, Lcom/digdroid/alman/dig/t;->C:J

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, -0x1

    cmp-long v0, v6, v9

    if-ltz v0, :cond_0

    iput-wide v11, p0, Lcom/digdroid/alman/dig/t;->C:J

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/digdroid/alman/dig/t;->B:J

    sub-long v4, v0, v2

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    cmp-long v2, v4, v0

    if-gez v2, :cond_0

    new-instance v13, Lcom/digdroid/alman/dig/x2$e;

    move-object v0, v13

    move-object v1, p0

    move-wide v2, v6

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/x2$e;-><init>(Lcom/digdroid/alman/dig/x2;JJ)V

    new-instance v0, Lcom/digdroid/alman/dig/x2$f;

    invoke-direct {v0, p0, v6, v7}, Lcom/digdroid/alman/dig/x2$f;-><init>(Lcom/digdroid/alman/dig/x2;J)V

    new-instance v1, Lcom/digdroid/alman/dig/t$a;

    invoke-direct {v1, p0, v0, v13}, Lcom/digdroid/alman/dig/t$a;-><init>(Lcom/digdroid/alman/dig/t;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Callable;)V

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v2, v8, [Ljava/lang/Void;

    invoke-virtual {v1, v0, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/z3;->c1()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v1, "get_game_image"

    invoke-virtual {v0, v1, v11, v12}, Lcom/digdroid/alman/dig/c3;->n(Ljava/lang/String;J)J

    move-result-wide v2

    cmp-long v0, v2, v9

    if-ltz v0, :cond_1

    :try_start_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v0, v1, v11, v12}, Lcom/digdroid/alman/dig/c3;->F(Ljava/lang/String;J)V

    new-instance v0, Lcom/digdroid/alman/dig/x2$g;

    invoke-direct {v0, p0, v2, v3}, Lcom/digdroid/alman/dig/x2$g;-><init>(Lcom/digdroid/alman/dig/x2;J)V

    new-instance v1, Lcom/digdroid/alman/dig/t$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, Lcom/digdroid/alman/dig/t$a;-><init>(Lcom/digdroid/alman/dig/t;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Callable;)V

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v2, v8, [Ljava/lang/Void;

    invoke-virtual {v1, v0, v2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    return-void
.end method
