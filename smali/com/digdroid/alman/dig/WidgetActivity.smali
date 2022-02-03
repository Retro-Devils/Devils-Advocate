.class public Lcom/digdroid/alman/dig/WidgetActivity;
.super Lcom/digdroid/alman/dig/c4;
.source ""


# instance fields
.field T:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/c4;-><init>()V

    return-void
.end method


# virtual methods
.method j1()V
    .locals 11

    iget-wide v0, p0, Lcom/digdroid/alman/dig/t;->C:J

    const-wide/16 v2, -0x1

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-gez v6, :cond_0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/z3;->d1()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "gameid"

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/WidgetActivity;->T:J

    iget-object v2, p0, Lcom/digdroid/alman/dig/t;->x:Lcom/digdroid/alman/dig/o0;

    const/4 v3, 0x0

    invoke-virtual {v2, p0, v0, v1, v3}, Lcom/digdroid/alman/dig/o0;->i(Lcom/digdroid/alman/dig/z3;JLcom/digdroid/alman/dig/h0;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->z:Lcom/digdroid/alman/dig/b0;

    new-instance v1, Lcom/digdroid/alman/dig/WidgetActivity$c;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/WidgetActivity$c;-><init>(Lcom/digdroid/alman/dig/WidgetActivity;)V

    iput-object v1, v0, Lcom/digdroid/alman/dig/b0;->j:Lcom/digdroid/alman/dig/b0$m;

    iget-wide v0, p0, Lcom/digdroid/alman/dig/t;->C:J

    iput-wide v0, p0, Lcom/digdroid/alman/dig/WidgetActivity;->T:J

    iput-wide v2, p0, Lcom/digdroid/alman/dig/t;->C:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/digdroid/alman/dig/t;->B:J

    sub-long v8, v0, v2

    iget-object v4, p0, Lcom/digdroid/alman/dig/t;->z:Lcom/digdroid/alman/dig/b0;

    iget-wide v6, p0, Lcom/digdroid/alman/dig/WidgetActivity;->T:J

    iget-boolean v10, p0, Lcom/digdroid/alman/dig/t;->E:Z

    move-object v5, p0

    invoke-virtual/range {v4 .. v10}, Lcom/digdroid/alman/dig/b0;->x(Landroid/app/Activity;JJZ)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0}, Lcom/digdroid/alman/dig/q3;->f(Lcom/digdroid/alman/dig/c4;)V

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/c4;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c0029

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    return-void
.end method

.method protected onResume()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/d;->onResume()V

    new-instance v0, Lcom/digdroid/alman/dig/WidgetActivity$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/WidgetActivity$a;-><init>(Lcom/digdroid/alman/dig/WidgetActivity;)V

    invoke-static {p0}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/c3;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/t$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v0}, Lcom/digdroid/alman/dig/t$a;-><init>(Lcom/digdroid/alman/dig/t;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Callable;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v1

    new-instance v2, Lcom/digdroid/alman/dig/WidgetActivity$b;

    invoke-direct {v2, p0, v0}, Lcom/digdroid/alman/dig/WidgetActivity$b;-><init>(Lcom/digdroid/alman/dig/WidgetActivity;Ljava/util/concurrent/Callable;)V

    invoke-virtual {v1, p0, v2}, Lcom/digdroid/alman/dig/d0;->l(Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$r;)V

    :goto_0
    return-void
.end method

.method protected onStart()V
    .locals 0

    invoke-super {p0}, Landroidx/appcompat/app/c;->onStart()V

    return-void
.end method
