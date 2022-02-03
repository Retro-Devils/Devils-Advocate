.class Lcom/digdroid/alman/dig/e2$r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/e2;->A(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/digdroid/alman/dig/e2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/e2;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2$r;->c:Lcom/digdroid/alman/dig/e2;

    iput p2, p0, Lcom/digdroid/alman/dig/e2$r;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2$r;->c:Lcom/digdroid/alman/dig/e2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/e2;->l:Landroidx/recyclerview/widget/LinearLayoutManager;

    iget v1, p0, Lcom/digdroid/alman/dig/e2$r;->b:I

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->F(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/digdroid/alman/dig/e2$r;->c:Lcom/digdroid/alman/dig/e2;

    iget-object v2, v1, Lcom/digdroid/alman/dig/e2;->m:Landroidx/recyclerview/widget/h;

    iget-object v1, v1, Lcom/digdroid/alman/dig/e2;->l:Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v2, v1, v0}, Landroidx/recyclerview/widget/h;->c(Landroidx/recyclerview/widget/RecyclerView$o;Landroid/view/View;)[I

    move-result-object v0

    const/4 v1, 0x0

    aget v2, v0, v1

    const/4 v3, 0x1

    if-nez v2, :cond_0

    aget v2, v0, v3

    if-eqz v2, :cond_1

    :cond_0
    iget-object v2, p0, Lcom/digdroid/alman/dig/e2$r;->c:Lcom/digdroid/alman/dig/e2;

    iget-object v2, v2, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    aget v1, v0, v1

    aget v0, v0, v3

    invoke-virtual {v2, v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->o1(II)V

    :cond_1
    return-void
.end method
