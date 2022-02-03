.class public Lcom/digdroid/alman/dig/MyWidget;
.super Landroid/appwidget/AppWidgetProvider;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/MyWidget$e;,
        Lcom/digdroid/alman/dig/MyWidget$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/appwidget/AppWidgetProvider;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;JZ)V
    .locals 9

    invoke-static {p0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v2

    if-eqz p3, :cond_0

    const-string v0, "*"

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    move-object v3, v0

    new-instance v6, Lcom/digdroid/alman/dig/MyWidget$a;

    move-object v0, v6

    move-object v1, p0

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/MyWidget$a;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/b3;Ljava/lang/String;J)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    const-class v0, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/content/pm/ShortcutManager;

    invoke-virtual {v5}, Landroid/content/pm/ShortcutManager;->isRequestPinShortcutSupported()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {v0, p0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v1, 0x7f110295

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f110294

    new-instance v2, Lcom/digdroid/alman/dig/MyWidget$c;

    invoke-direct {v2, v6}, Lcom/digdroid/alman/dig/MyWidget$c;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v6

    const v7, 0x7f110245

    new-instance v8, Lcom/digdroid/alman/dig/MyWidget$b;

    move-object v0, v8

    move-object v1, p0

    move-wide v2, p1

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/MyWidget$b;-><init>(Landroid/app/Activity;JZLandroid/content/pm/ShortcutManager;)V

    invoke-virtual {v6, v7, v8}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    goto :goto_1

    :cond_1
    invoke-interface {v6}, Ljava/lang/Runnable;->run()V

    :goto_1
    return-void
.end method

.method static b(Landroid/content/Context;J)V
    .locals 11

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x19

    if-lt v0, v1, :cond_6

    new-instance v0, Lcom/digdroid/alman/dig/k0;

    invoke-direct {v0, p0, p1, p2}, Lcom/digdroid/alman/dig/k0;-><init>(Landroid/content/Context;J)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/k0;->a()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const-class v1, Landroid/content/pm/ShortcutManager;

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ShortcutManager;

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/digdroid/alman/dig/WidgetActivity;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "android.intent.action.MAIN"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "gameid"

    invoke-virtual {v2, v3, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    new-instance v3, Landroid/content/pm/ShortcutInfo$Builder;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "sc"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p0, p1}, Landroid/content/pm/ShortcutInfo$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, v0, Lcom/digdroid/alman/dig/k0;->j:Ljava/lang/String;

    invoke-virtual {v3, p1}, Landroid/content/pm/ShortcutInfo$Builder;->setShortLabel(Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object p1

    iget-object p2, v0, Lcom/digdroid/alman/dig/k0;->j:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/content/pm/ShortcutInfo$Builder;->setLongLabel(Ljava/lang/CharSequence;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object p1

    invoke-static {p0, v0}, Lcom/digdroid/alman/dig/MyWidget;->d(Landroid/content/Context;Lcom/digdroid/alman/dig/k0;)Landroid/graphics/drawable/Icon;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/pm/ShortcutInfo$Builder;->setIcon(Landroid/graphics/drawable/Icon;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object p0

    invoke-virtual {p0, v2}, Landroid/content/pm/ShortcutInfo$Builder;->setIntent(Landroid/content/Intent;)Landroid/content/pm/ShortcutInfo$Builder;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/pm/ShortcutInfo$Builder;->build()Landroid/content/pm/ShortcutInfo;

    move-result-object p0

    invoke-virtual {v1}, Landroid/content/pm/ShortcutManager;->getDynamicShortcuts()Ljava/util/List;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_2

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ShortcutInfo;

    invoke-virtual {v2}, Landroid/content/pm/ShortcutInfo;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/pm/ShortcutInfo;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x4

    const/4 v3, 0x1

    if-lt v0, v2, :cond_5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const-wide/32 v6, 0x36ee80

    add-long/2addr v4, v6

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    if-ge v2, v7, :cond_4

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/pm/ShortcutInfo;

    invoke-virtual {v7}, Landroid/content/pm/ShortcutInfo;->getLastChangedTimestamp()J

    move-result-wide v8

    cmp-long v10, v8, v4

    if-gez v10, :cond_3

    invoke-virtual {v7}, Landroid/content/pm/ShortcutInfo;->getLastChangedTimestamp()J

    move-result-wide v4

    invoke-virtual {v7}, Landroid/content/pm/ShortcutInfo;->getId()Ljava/lang/String;

    move-result-object v0

    move v6, v2

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    invoke-interface {p1, v6}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    if-eqz v0, :cond_2

    new-array v2, v3, [Ljava/lang/String;

    aput-object v0, v2, p2

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/pm/ShortcutManager;->removeDynamicShortcuts(Ljava/util/List;)V

    goto :goto_1

    :cond_5
    new-array p1, v3, [Landroid/content/pm/ShortcutInfo;

    aput-object p0, p1, p2

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroid/content/pm/ShortcutManager;->addDynamicShortcuts(Ljava/util/List;)Z

    :cond_6
    return-void
.end method

.method public static c(Landroid/content/Context;J)V
    .locals 23

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1a

    if-lt v3, v4, :cond_9

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "/settings.cfg"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/digdroid/alman/dig/n;

    invoke-direct {v4, v0}, Lcom/digdroid/alman/dig/n;-><init>(Landroid/content/Context;)V

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lcom/digdroid/alman/dig/n;->k(Ljava/io/File;)V

    const/16 v5, 0x3e8

    const-string v6, "tv_column_weight"

    invoke-virtual {v4, v6, v5}, Lcom/digdroid/alman/dig/n;->g(Ljava/lang/String;I)I

    move-result v5

    add-int/lit8 v7, v5, 0x1

    invoke-virtual {v4, v6, v7}, Lcom/digdroid/alman/dig/n;->p(Ljava/lang/String;I)V

    const-string v6, "tv_channel"

    invoke-virtual {v4, v6}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, ""

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    const-string v10, "android.intent.action.MAIN"

    if-eqz v9, :cond_1

    new-instance v7, Landroid/content/Intent;

    const-class v9, Lcom/digdroid/alman/dig/TVActivity;

    invoke-direct {v7, v0, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v7, v10}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    new-instance v9, Lb/q/a/a/c$a;

    invoke-direct {v9}, Lb/q/a/a/c$a;-><init>()V

    const-string v11, "TYPE_PREVIEW"

    invoke-virtual {v9, v11}, Lb/q/a/a/c$a;->e(Ljava/lang/String;)Lb/q/a/a/c$a;

    move-result-object v11

    const v12, 0x7f110206

    invoke-virtual {v0, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Lb/q/a/a/c$a;->d(Ljava/lang/String;)Lb/q/a/a/c$a;

    move-result-object v11

    invoke-virtual {v11, v7}, Lb/q/a/a/c$a;->b(Landroid/content/Intent;)Lb/q/a/a/c$a;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    sget-object v11, Lb/q/a/a/g$a;->a:Landroid/net/Uri;

    invoke-virtual {v9}, Lb/q/a/a/c$a;->a()Lb/q/a/a/c;

    move-result-object v9

    invoke-virtual {v9}, Lb/q/a/a/c;->b()Landroid/content/ContentValues;

    move-result-object v9

    invoke-virtual {v7, v11, v9}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v7

    invoke-static {v7}, Landroid/content/ContentUris;->parseId(Landroid/net/Uri;)J

    move-result-wide v11

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Lcom/digdroid/alman/dig/n;->r(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    return-void

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f070069

    invoke-static {v6, v7}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v6

    invoke-static {v0, v11, v12, v6}, Lb/q/a/a/d;->a(Landroid/content/Context;JLandroid/graphics/Bitmap;)Z

    invoke-static {v0, v11, v12}, Lb/q/a/a/g;->b(Landroid/content/Context;J)V

    goto :goto_0

    :cond_1
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    :goto_0
    new-instance v6, Lcom/digdroid/alman/dig/k0;

    invoke-direct {v6, v0, v1, v2}, Lcom/digdroid/alman/dig/k0;-><init>(Landroid/content/Context;J)V

    invoke-virtual {v6}, Lcom/digdroid/alman/dig/k0;->a()Z

    move-result v7

    if-nez v7, :cond_2

    return-void

    :cond_2
    new-instance v7, Landroid/content/Intent;

    const-class v9, Lcom/digdroid/alman/dig/TVWidgetActivity;

    invoke-direct {v7, v0, v9}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v7, v10}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v9, "gameid"

    invoke-virtual {v7, v9, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    invoke-static/range {p0 .. p0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v9

    const-string v10, "token"

    const-string v13, "0"

    invoke-virtual {v9, v10, v13}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    iget-wide v14, v6, Lcom/digdroid/alman/dig/k0;->c:J

    const-wide/16 v16, 0x0

    cmp-long v18, v14, v16

    if-ltz v18, :cond_3

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v14

    const/16 v15, 0x20

    if-ne v14, v15, :cond_3

    const-string v14, "userid"

    invoke-virtual {v9, v14, v13}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "https://digdroid.com/php/getcover3.php?game="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v14, v6, Lcom/digdroid/alman/dig/k0;->c:J

    invoke-virtual {v13, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v14, "&system="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v14, v6, Lcom/digdroid/alman/dig/k0;->h:Ljava/lang/String;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "&qual="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "med"

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "&user="

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "&token="

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    goto :goto_1

    :cond_3
    const/4 v9, 0x0

    :goto_1
    if-nez v9, :cond_4

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "android.resource://"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "/drawable/play"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v9

    :cond_4
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    const-string v14, "tv_program_ids"

    invoke-virtual {v4, v14}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v0, "tv_program_games"

    move-object/from16 v17, v3

    invoke-virtual {v4, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v18

    move-object/from16 v19, v0

    const-string v0, ","

    if-nez v18, :cond_5

    invoke-virtual {v15, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v15

    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v3, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_5
    const/4 v15, 0x0

    :goto_2
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v15, v3, :cond_7

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v20

    cmp-long v3, v20, v1

    if-nez v3, :cond_6

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Ljava/lang/String;

    invoke-static/range {v20 .. v20}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v20

    move-object/from16 v22, v4

    invoke-static/range {v20 .. v21}, Lb/q/a/a/g;->a(J)Landroid/net/Uri;

    move-result-object v4

    move-object/from16 v20, v14

    const/4 v14, 0x0

    invoke-virtual {v3, v4, v14, v14}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-object/from16 v14, v20

    move-object/from16 v4, v22

    goto :goto_2

    :cond_6
    move-object/from16 v22, v4

    move-object/from16 v20, v14

    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    :cond_7
    move-object/from16 v22, v4

    move-object/from16 v20, v14

    new-instance v3, Lb/q/a/a/f$a;

    invoke-direct {v3}, Lb/q/a/a/f$a;-><init>()V

    invoke-virtual {v3, v11, v12}, Lb/q/a/a/f$a;->i(J)Lb/q/a/a/f$a;

    move-result-object v4

    const/16 v11, 0xc

    invoke-virtual {v4, v11}, Lb/q/a/a/a$a;->g(I)Lb/q/a/a/a$a;

    move-result-object v4

    check-cast v4, Lb/q/a/a/f$a;

    iget-object v11, v6, Lcom/digdroid/alman/dig/k0;->j:Ljava/lang/String;

    invoke-virtual {v4, v11}, Lb/q/a/a/b$a;->c(Ljava/lang/String;)Lb/q/a/a/b$a;

    move-result-object v4

    check-cast v4, Lb/q/a/a/f$a;

    iget-object v6, v6, Lcom/digdroid/alman/dig/k0;->k:Ljava/lang/String;

    invoke-virtual {v4, v6}, Lb/q/a/a/b$a;->a(Ljava/lang/String;)Lb/q/a/a/b$a;

    move-result-object v4

    check-cast v4, Lb/q/a/a/f$a;

    const/4 v6, 0x3

    invoke-virtual {v4, v6}, Lb/q/a/a/a$a;->f(I)Lb/q/a/a/a$a;

    move-result-object v4

    check-cast v4, Lb/q/a/a/f$a;

    invoke-virtual {v4, v5}, Lb/q/a/a/f$a;->j(I)Lb/q/a/a/f$a;

    move-result-object v4

    invoke-virtual {v4, v9}, Lb/q/a/a/b$a;->b(Landroid/net/Uri;)Lb/q/a/a/b$a;

    move-result-object v4

    check-cast v4, Lb/q/a/a/f$a;

    const/4 v5, 0x1

    invoke-virtual {v7, v5}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    invoke-virtual {v4, v5}, Lb/q/a/a/a$a;->d(Landroid/net/Uri;)Lb/q/a/a/a$a;

    move-result-object v4

    check-cast v4, Lb/q/a/a/f$a;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "pr"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lb/q/a/a/a$a;->e(Ljava/lang/String;)Lb/q/a/a/a$a;

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    sget-object v5, Lb/q/a/a/g$b;->a:Landroid/net/Uri;

    invoke-virtual {v3}, Lb/q/a/a/f$a;->h()Lb/q/a/a/f;

    move-result-object v3

    invoke-virtual {v3}, Lb/q/a/a/f;->b()Landroid/content/ContentValues;

    move-result-object v3

    invoke-virtual {v4, v5, v3}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    move-result-object v3

    invoke-static {v3}, Landroid/content/ContentUris;->parseId(Landroid/net/Uri;)J

    move-result-wide v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/16 v2, 0xa

    if-lt v1, v2, :cond_8

    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4}, Lb/q/a/a/g;->a(J)Landroid/net/Uri;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4, v4}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_3

    :cond_8
    invoke-static {v0, v10}, Lcom/digdroid/alman/dig/m2;->a(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, v20

    move-object/from16 v2, v22

    invoke-virtual {v2, v3, v1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v13}, Lcom/digdroid/alman/dig/m2;->a(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, v19

    invoke-virtual {v2, v1, v0}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, v17

    invoke-virtual {v2, v0}, Lcom/digdroid/alman/dig/n;->r(Ljava/lang/String;)Z

    :cond_9
    return-void
.end method

.method static d(Landroid/content/Context;Lcom/digdroid/alman/dig/k0;)Landroid/graphics/drawable/Icon;
    .locals 1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p1, v0, :cond_0

    const p1, 0x7f0701c3

    invoke-static {p0, p1}, Landroid/graphics/drawable/Icon;->createWithResource(Landroid/content/Context;I)Landroid/graphics/drawable/Icon;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method private declared-synchronized e(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    const-string v1, "widgetId"

    const/4 v2, 0x0

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    const-string v3, "widgetspanx"

    invoke-virtual {p2, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    const-string v4, "widgetspany"

    invoke-virtual {p2, v4, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    if-lez v1, :cond_0

    if-lez v3, :cond_0

    if-lez p2, :cond_0

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v4, "appWidgetMinHeight"

    mul-int/lit8 p2, p2, 0x46

    add-int/lit8 p2, p2, -0x1e

    invoke-virtual {v2, v4, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v4, "appWidgetMinWidth"

    mul-int/lit8 v3, v3, 0x46

    add-int/lit8 v3, v3, -0x1e

    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v4, "appWidgetMaxHeight"

    invoke-virtual {v2, v4, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p2, "appWidgetMaxWidth"

    invoke-virtual {v2, p2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p0, p1, v0, v1, v2}, Lcom/digdroid/alman/dig/MyWidget;->onAppWidgetOptionsChanged(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized g(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 10

    monitor-enter p0

    :try_start_0
    array-length v0, p3

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    new-instance v9, Lcom/digdroid/alman/dig/MyWidget$e;

    aget v7, p3, v2

    const/4 v8, 0x0

    move-object v3, v9

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v3 .. v8}, Lcom/digdroid/alman/dig/MyWidget$e;-><init>(Lcom/digdroid/alman/dig/MyWidget;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V

    sget-object v3, Landroid/os/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v4, v1, [Ljava/lang/Void;

    invoke-virtual {v9, v3, v4}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method


# virtual methods
.method f(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;IJZZLandroid/os/Bundle;)Lcom/digdroid/alman/dig/MyWidget$d;
    .locals 12

    move-wide/from16 v0, p4

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v2

    new-instance v3, Lcom/digdroid/alman/dig/MyWidget$d;

    move-object v4, p0

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/MyWidget$d;-><init>(Lcom/digdroid/alman/dig/MyWidget;)V

    iput-wide v0, v3, Lcom/digdroid/alman/dig/MyWidget$d;->a:J

    move/from16 v5, p6

    iput-boolean v5, v3, Lcom/digdroid/alman/dig/MyWidget$d;->b:Z

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const-wide/16 v9, 0x0

    cmp-long v11, v0, v9

    if-gez v11, :cond_3

    new-instance v0, Ljava/util/HashSet;

    const-string v1, "homescreen"

    invoke-virtual {v2, v1}, Lcom/digdroid/alman/dig/b3;->r(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v5

    invoke-direct {v0, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-nez v9, :cond_0

    return-object v6

    :cond_0
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    invoke-virtual {v2, v1, v0}, Lcom/digdroid/alman/dig/b3;->H(Ljava/lang/String;Ljava/util/Set;)V

    invoke-virtual {v9, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "+"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v9, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v9, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v5, "*"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v9, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    const/4 v7, 0x1

    :cond_2
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v9

    iput-wide v9, v3, Lcom/digdroid/alman/dig/MyWidget$d;->a:J

    iput-boolean v7, v3, Lcom/digdroid/alman/dig/MyWidget$d;->b:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "widgettext"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v11, p3

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v0}, Lcom/digdroid/alman/dig/b3;->B(Ljava/lang/String;Z)V

    goto :goto_1

    :cond_3
    move v11, p3

    move-wide v9, v0

    move v7, v5

    const/4 v8, 0x0

    move/from16 v0, p7

    :goto_1
    new-instance v1, Lcom/digdroid/alman/dig/k0;

    move-object v2, p1

    invoke-direct {v1, p1, v9, v10}, Lcom/digdroid/alman/dig/k0;-><init>(Landroid/content/Context;J)V

    const/16 v5, 0x46

    if-nez v8, :cond_5

    if-nez p8, :cond_4

    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v9, 0x10

    if-lt v8, v9, :cond_4

    invoke-virtual {p2, p3}, Landroid/appwidget/AppWidgetManager;->getAppWidgetOptions(I)Landroid/os/Bundle;

    move-result-object v8

    goto :goto_2

    :cond_4
    move-object/from16 v8, p8

    :goto_2
    if-eqz v8, :cond_5

    const-string v5, "appWidgetMaxWidth"

    invoke-virtual {v8, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v5

    const-string v9, "appWidgetMaxHeight"

    invoke-virtual {v8, v9}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v8

    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    move-result v5

    :cond_5
    if-eqz v7, :cond_7

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/k0;->e()Z

    move-result v7

    if-nez v7, :cond_6

    return-object v6

    :cond_6
    iget-object v7, v1, Lcom/digdroid/alman/dig/k0;->i:Ljava/lang/String;

    iput-object v7, v3, Lcom/digdroid/alman/dig/MyWidget$d;->d:Ljava/lang/String;

    iget-object v7, v1, Lcom/digdroid/alman/dig/k0;->g:Ljava/lang/String;

    iput-object v7, v3, Lcom/digdroid/alman/dig/MyWidget$d;->c:Ljava/lang/String;

    invoke-virtual {v1, v5}, Lcom/digdroid/alman/dig/k0;->f(I)Landroid/graphics/Bitmap;

    move-result-object v5

    goto :goto_3

    :cond_7
    invoke-virtual {v1}, Lcom/digdroid/alman/dig/k0;->a()Z

    move-result v7

    if-nez v7, :cond_8

    return-object v6

    :cond_8
    iget-object v7, v1, Lcom/digdroid/alman/dig/k0;->j:Ljava/lang/String;

    iput-object v7, v3, Lcom/digdroid/alman/dig/MyWidget$d;->d:Ljava/lang/String;

    invoke-virtual {v1, v5}, Lcom/digdroid/alman/dig/k0;->b(I)Landroid/graphics/Bitmap;

    move-result-object v5

    :goto_3
    iput-object v5, v3, Lcom/digdroid/alman/dig/MyWidget$d;->e:Landroid/graphics/Bitmap;

    iget-object v5, v3, Lcom/digdroid/alman/dig/MyWidget$d;->e:Landroid/graphics/Bitmap;

    if-nez v5, :cond_a

    iget v5, v3, Lcom/digdroid/alman/dig/MyWidget$d;->f:I

    if-gez v5, :cond_a

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "icon_"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lcom/digdroid/alman/dig/k0;->h:Ljava/lang/String;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    const-string v8, "drawable"

    invoke-virtual {v5, v1, v8, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_9

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "play"

    invoke-virtual {v5, v2, v8, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    :cond_9
    iput v1, v3, Lcom/digdroid/alman/dig/MyWidget$d;->f:I

    :cond_a
    if-nez v0, :cond_b

    iput-object v6, v3, Lcom/digdroid/alman/dig/MyWidget$d;->d:Ljava/lang/String;

    :cond_b
    return-object v3
.end method

.method public declared-synchronized onAppWidgetOptionsChanged(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V
    .locals 8

    monitor-enter p0

    :try_start_0
    invoke-static {p1}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "widget"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v1, v4, v6

    if-gez v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "systemwidget"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v0

    cmp-long v2, v0, v6

    if-ltz v2, :cond_1

    :cond_0
    new-instance v6, Lcom/digdroid/alman/dig/MyWidget$e;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/MyWidget$e;-><init>(Lcom/digdroid/alman/dig/MyWidget;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V

    sget-object p1, Landroid/os/AsyncTask;->SERIAL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Void;

    invoke-virtual {v6, p1, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public onDeleted(Landroid/content/Context;[I)V
    .locals 5

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object p1

    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p2, v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "widget"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/digdroid/alman/dig/b3;->I(Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "systemwidget"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/digdroid/alman/dig/b3;->I(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public declared-synchronized onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    monitor-enter p0

    if-eqz p2, :cond_2

    :try_start_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.sec.android.widgetapp.APPWIDGET_RESIZE"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    invoke-direct {p0, p1, p2}, Lcom/digdroid/alman/dig/MyWidget;->e(Landroid/content/Context;Landroid/content/Intent;)V

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/appwidget/AppWidgetProvider;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_2
    :goto_0
    monitor-exit p0

    return-void
.end method

.method public onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
    .locals 1

    invoke-static {p1}, Lcom/digdroid/alman/dig/y3;->u(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/MyWidget;->g(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V

    :cond_0
    return-void
.end method
