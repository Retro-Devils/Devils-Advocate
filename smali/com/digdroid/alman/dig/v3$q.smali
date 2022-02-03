.class Lcom/digdroid/alman/dig/v3$q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v3;->y1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/digdroid/alman/dig/v3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v3;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v3$q;->b:Lcom/digdroid/alman/dig/v3;

    iput p2, p0, Lcom/digdroid/alman/dig/v3$q;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFocusChange(Landroid/view/View;Z)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/v3$q;->b:Lcom/digdroid/alman/dig/v3;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->l()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x1

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/digdroid/alman/dig/v3$q;->b:Lcom/digdroid/alman/dig/v3;

    iget-object v1, p2, Lcom/digdroid/alman/dig/v3;->h0:[Z

    iget v2, p0, Lcom/digdroid/alman/dig/v3$q;->a:I

    aget-boolean v1, v1, v2

    if-eqz v1, :cond_2

    const v1, 0x7f010023

    invoke-static {p2, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {p2, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/v3$q;->b:Lcom/digdroid/alman/dig/v3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/v3;->h0:[Z

    iget p2, p0, Lcom/digdroid/alman/dig/v3$q;->a:I

    const/4 v0, 0x0

    aput-boolean v0, p1, p2

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/v3$q;->b:Lcom/digdroid/alman/dig/v3;

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/v3;->E1()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/digdroid/alman/dig/v3$q;->b:Lcom/digdroid/alman/dig/v3;

    iget-object v1, p2, Lcom/digdroid/alman/dig/v3;->h0:[Z

    iget v2, p0, Lcom/digdroid/alman/dig/v3$q;->a:I

    aget-boolean v1, v1, v2

    if-nez v1, :cond_2

    iput v2, p2, Lcom/digdroid/alman/dig/v3;->p0:I

    const v1, 0x7f010021

    invoke-static {p2, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {p2, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/v3$q;->b:Lcom/digdroid/alman/dig/v3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/v3;->h0:[Z

    iget p2, p0, Lcom/digdroid/alman/dig/v3$q;->a:I

    aput-boolean v0, p1, p2

    :cond_2
    :goto_0
    return-void
.end method
