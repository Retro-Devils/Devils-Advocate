.class Lcom/digdroid/alman/dig/e2$p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/e2;->x(IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Z

.field final synthetic d:Lcom/digdroid/alman/dig/e2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/e2;IZ)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2$p;->d:Lcom/digdroid/alman/dig/e2;

    iput p2, p0, Lcom/digdroid/alman/dig/e2$p;->b:I

    iput-boolean p3, p0, Lcom/digdroid/alman/dig/e2$p;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget v0, p0, Lcom/digdroid/alman/dig/e2$p;->b:I

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2$p;->d:Lcom/digdroid/alman/dig/e2;

    iget-object v2, v1, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v1

    :goto_0
    check-cast v1, Lcom/digdroid/alman/dig/h;

    goto :goto_1

    :cond_0
    iget-object v1, v1, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/h;->c()I

    move-result v1

    if-lt v0, v1, :cond_2

    add-int/lit8 v1, v1, -0x1

    const/4 v0, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_2
    iget-boolean v1, p0, Lcom/digdroid/alman/dig/e2$p;->c:Z

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2$p;->d:Lcom/digdroid/alman/dig/e2;

    iget-object v1, v1, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->k1(I)V

    :cond_3
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2$p;->d:Lcom/digdroid/alman/dig/e2;

    iget-object v2, v1, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    if-eqz v2, :cond_4

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/e2;->A(I)V

    :cond_4
    return-void
.end method
