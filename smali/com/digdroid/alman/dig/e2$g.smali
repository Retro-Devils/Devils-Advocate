.class Lcom/digdroid/alman/dig/e2$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/e2;->b(Landroid/database/Cursor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/database/Cursor;

.field final synthetic c:Lcom/digdroid/alman/dig/e2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/e2;Landroid/database/Cursor;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2$g;->c:Lcom/digdroid/alman/dig/e2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/e2$g;->b:Landroid/database/Cursor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2$g;->c:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2$g;->c:Lcom/digdroid/alman/dig/e2;

    iget-object v1, v1, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->k1(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2$g;->c:Lcom/digdroid/alman/dig/e2;

    iget-object v3, v1, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

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
    iget-object v3, p0, Lcom/digdroid/alman/dig/e2$g;->b:Landroid/database/Cursor;

    invoke-virtual {v1, v3}, Lcom/digdroid/alman/dig/h;->u(Landroid/database/Cursor;)V

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/h;->c()I

    move-result v3

    if-lt v0, v3, :cond_2

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/h;->c()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_2
    iget-object v1, p0, Lcom/digdroid/alman/dig/e2$g;->c:Lcom/digdroid/alman/dig/e2;

    iget-object v1, v1, Lcom/digdroid/alman/dig/e2;->k:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->k1(I)V

    return-void
.end method
