.class Lcom/digdroid/alman/dig/WidgetActivity$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/b0$l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/WidgetActivity;->h1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/WidgetActivity;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/WidgetActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/WidgetActivity$c;->a:Lcom/digdroid/alman/dig/WidgetActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/WidgetActivity$c;->a:Lcom/digdroid/alman/dig/WidgetActivity;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/y3;->a1()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/WidgetActivity$c;->a:Lcom/digdroid/alman/dig/WidgetActivity;

    invoke-static {v0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/WidgetActivity$c;->a:Lcom/digdroid/alman/dig/WidgetActivity;

    iget-boolean v2, v1, Lcom/digdroid/alman/dig/t;->E:Z

    if-eqz v2, :cond_0

    const-string v2, "retroarch"

    invoke-static {v1, v2}, Lcom/digdroid/alman/dig/z3;->D(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->u()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/WidgetActivity$c;->a:Lcom/digdroid/alman/dig/WidgetActivity;

    iget-wide v1, v0, Lcom/digdroid/alman/dig/WidgetActivity;->T:J

    invoke-static {v0, v1, v2}, Lcom/digdroid/alman/dig/MyWidget;->c(Landroid/content/Context;J)V

    :cond_1
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    return-void
.end method
