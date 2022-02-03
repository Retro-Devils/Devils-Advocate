.class Lcom/digdroid/alman/dig/e2$q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/e2;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/e2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/e2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2$q;->b:Lcom/digdroid/alman/dig/e2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2$q;->b:Lcom/digdroid/alman/dig/e2;

    iget-object v1, v0, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    invoke-virtual {v1}, Landroid/widget/AbsListView;->getSelectedItemPosition()I

    move-result v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/e2$q;->b:Lcom/digdroid/alman/dig/e2;

    iget-object v2, v2, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    invoke-virtual {v2}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/e2;->c(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2$q;->b:Lcom/digdroid/alman/dig/e2;

    iget-object v1, v1, Lcom/digdroid/alman/dig/e2;->e:Lcom/digdroid/alman/dig/MainActivity;

    const v2, 0x7f010022

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2$q;->b:Lcom/digdroid/alman/dig/e2;

    iput-object v0, v1, Lcom/digdroid/alman/dig/e2;->o:Landroid/view/View;

    :cond_0
    return-void
.end method
