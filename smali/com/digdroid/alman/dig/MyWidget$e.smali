.class Lcom/digdroid/alman/dig/MyWidget$e;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/MyWidget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lcom/digdroid/alman/dig/MyWidget$d;",
        ">;"
    }
.end annotation


# instance fields
.field a:Landroid/content/Context;

.field b:Landroid/appwidget/AppWidgetManager;

.field c:I

.field d:J

.field e:Z

.field f:Z

.field g:Landroid/widget/RemoteViews;

.field h:Landroid/os/Bundle;

.field i:Lcom/digdroid/alman/dig/c3;

.field final synthetic j:Lcom/digdroid/alman/dig/MyWidget;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MyWidget;Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MyWidget$e;->j:Lcom/digdroid/alman/dig/MyWidget;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p2, p0, Lcom/digdroid/alman/dig/MyWidget$e;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/digdroid/alman/dig/MyWidget$e;->b:Landroid/appwidget/AppWidgetManager;

    iput p4, p0, Lcom/digdroid/alman/dig/MyWidget$e;->c:I

    iput-object p5, p0, Lcom/digdroid/alman/dig/MyWidget$e;->h:Landroid/os/Bundle;

    invoke-static {p2}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/MyWidget$e;->i:Lcom/digdroid/alman/dig/c3;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Lcom/digdroid/alman/dig/MyWidget$d;
    .locals 9

    iget-object v0, p0, Lcom/digdroid/alman/dig/MyWidget$e;->j:Lcom/digdroid/alman/dig/MyWidget;

    iget-object v1, p0, Lcom/digdroid/alman/dig/MyWidget$e;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/digdroid/alman/dig/MyWidget$e;->b:Landroid/appwidget/AppWidgetManager;

    iget v3, p0, Lcom/digdroid/alman/dig/MyWidget$e;->c:I

    iget-wide v4, p0, Lcom/digdroid/alman/dig/MyWidget$e;->d:J

    iget-boolean v6, p0, Lcom/digdroid/alman/dig/MyWidget$e;->e:Z

    iget-boolean v7, p0, Lcom/digdroid/alman/dig/MyWidget$e;->f:Z

    iget-object v8, p0, Lcom/digdroid/alman/dig/MyWidget$e;->h:Landroid/os/Bundle;

    invoke-virtual/range {v0 .. v8}, Lcom/digdroid/alman/dig/MyWidget;->f(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;IJZZLandroid/os/Bundle;)Lcom/digdroid/alman/dig/MyWidget$d;

    move-result-object p1

    return-object p1
.end method

.method protected b(Lcom/digdroid/alman/dig/MyWidget$d;)V
    .locals 6

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Lcom/digdroid/alman/dig/MyWidget$d;->d:Ljava/lang/String;

    const v1, 0x7f09044b

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/digdroid/alman/dig/MyWidget$e;->g:Landroid/widget/RemoteViews;

    invoke-virtual {v2, v1, v0}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/MyWidget$e;->g:Landroid/widget/RemoteViews;

    iget-object v2, p1, Lcom/digdroid/alman/dig/MyWidget$d;->d:Ljava/lang/String;

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    goto :goto_0

    :cond_2
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    iget-object v0, p1, Lcom/digdroid/alman/dig/MyWidget$d;->e:Landroid/graphics/Bitmap;

    const v1, 0x7f09044a

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/digdroid/alman/dig/MyWidget$e;->g:Landroid/widget/RemoteViews;

    invoke-virtual {v2, v1, v0}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    goto :goto_1

    :cond_3
    iget v0, p1, Lcom/digdroid/alman/dig/MyWidget$d;->f:I

    if-lez v0, :cond_4

    iget-object v2, p0, Lcom/digdroid/alman/dig/MyWidget$e;->g:Landroid/widget/RemoteViews;

    invoke-virtual {v2, v1, v0}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    :cond_4
    :goto_1
    iget-wide v2, p1, Lcom/digdroid/alman/dig/MyWidget$d;->a:J

    iput-wide v2, p0, Lcom/digdroid/alman/dig/MyWidget$e;->d:J

    iget-boolean v0, p1, Lcom/digdroid/alman/dig/MyWidget$d;->b:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/MyWidget$e;->e:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/digdroid/alman/dig/MyWidget$e;->i:Lcom/digdroid/alman/dig/c3;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "systemwidget"

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/digdroid/alman/dig/MyWidget$e;->i:Lcom/digdroid/alman/dig/c3;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "widget"

    :goto_2
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/digdroid/alman/dig/MyWidget$e;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-wide v3, p0, Lcom/digdroid/alman/dig/MyWidget$e;->d:J

    invoke-virtual {v0, v2, v3, v4}, Lcom/digdroid/alman/dig/c3;->y(Ljava/lang/String;J)V

    iget-wide v2, p0, Lcom/digdroid/alman/dig/MyWidget$e;->d:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-ltz v0, :cond_7

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/MyWidget$e;->e:Z

    if-eqz v0, :cond_6

    new-instance v0, Landroid/content/Intent;

    iget-object v2, p0, Lcom/digdroid/alman/dig/MyWidget$e;->a:Landroid/content/Context;

    const-class v3, Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v2, p1, Lcom/digdroid/alman/dig/MyWidget$d;->c:Ljava/lang/String;

    const-string v3, "system"

    invoke-virtual {v0, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object p1, p1, Lcom/digdroid/alman/dig/MyWidget$d;->d:Ljava/lang/String;

    const-string v2, "name"

    invoke-virtual {v0, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_3

    :cond_6
    new-instance v0, Landroid/content/Intent;

    iget-object p1, p0, Lcom/digdroid/alman/dig/MyWidget$e;->a:Landroid/content/Context;

    const-class v2, Lcom/digdroid/alman/dig/WidgetActivity;

    invoke-direct {v0, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-wide v2, p0, Lcom/digdroid/alman/dig/MyWidget$e;->d:J

    const-string p1, "gameid"

    invoke-virtual {v0, p1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    goto :goto_3

    :cond_7
    new-instance v0, Landroid/content/Intent;

    iget-object p1, p0, Lcom/digdroid/alman/dig/MyWidget$e;->a:Landroid/content/Context;

    const-class v2, Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {v0, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :goto_3
    new-instance p1, Ljava/util/Random;

    invoke-direct {p1}, Ljava/util/Random;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/MyWidget$e;->a:Landroid/content/Context;

    invoke-virtual {p1}, Ljava/util/Random;->nextInt()I

    move-result p1

    const/high16 v3, 0x8000000

    invoke-static {v2, p1, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/MyWidget$e;->g:Landroid/widget/RemoteViews;

    invoke-virtual {v0, v1, p1}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/MyWidget$e;->b:Landroid/appwidget/AppWidgetManager;

    iget v0, p0, Lcom/digdroid/alman/dig/MyWidget$e;->c:I

    iget-object v1, p0, Lcom/digdroid/alman/dig/MyWidget$e;->g:Landroid/widget/RemoteViews;

    invoke-virtual {p1, v0, v1}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/MyWidget$e;->a([Ljava/lang/Void;)Lcom/digdroid/alman/dig/MyWidget$d;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/digdroid/alman/dig/MyWidget$d;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/MyWidget$e;->b(Lcom/digdroid/alman/dig/MyWidget$d;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-wide/16 v2, -0x1

    :try_start_0
    iget-object v4, p0, Lcom/digdroid/alman/dig/MyWidget$e;->i:Lcom/digdroid/alman/dig/c3;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "systemwidget"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Lcom/digdroid/alman/dig/MyWidget$e;->c:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v2, v3}, Lcom/digdroid/alman/dig/c3;->n(Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/digdroid/alman/dig/MyWidget$e;->d:J

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-ltz v8, :cond_0

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/MyWidget$e;->e:Z

    goto :goto_0

    :cond_0
    iput-boolean v0, p0, Lcom/digdroid/alman/dig/MyWidget$e;->e:Z

    iget-object v4, p0, Lcom/digdroid/alman/dig/MyWidget$e;->i:Lcom/digdroid/alman/dig/c3;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "widget"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Lcom/digdroid/alman/dig/MyWidget$e;->c:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v2, v3}, Lcom/digdroid/alman/dig/c3;->n(Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/digdroid/alman/dig/MyWidget$e;->d:J

    :goto_0
    iget-object v4, p0, Lcom/digdroid/alman/dig/MyWidget$e;->i:Lcom/digdroid/alman/dig/c3;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "widgettext"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Lcom/digdroid/alman/dig/MyWidget$e;->c:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v1}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v4

    iput-boolean v4, p0, Lcom/digdroid/alman/dig/MyWidget$e;->f:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    iput-wide v2, p0, Lcom/digdroid/alman/dig/MyWidget$e;->d:J

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/MyWidget$e;->e:Z

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/MyWidget$e;->f:Z

    :goto_1
    new-instance v0, Landroid/widget/RemoteViews;

    iget-object v1, p0, Lcom/digdroid/alman/dig/MyWidget$e;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f0c0106

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/MyWidget$e;->g:Landroid/widget/RemoteViews;

    return-void
.end method
