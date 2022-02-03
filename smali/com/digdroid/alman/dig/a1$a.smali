.class public Lcom/digdroid/alman/dig/a1$a;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/a1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field t:Lcom/digdroid/alman/dig/SquaredImageView;

.field u:Landroid/widget/TextView;

.field v:Landroid/widget/TextView;

.field w:Landroid/widget/TextView;

.field final synthetic x:Lcom/digdroid/alman/dig/a1;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/a1;Landroid/view/View;)V
    .locals 4

    iput-object p1, p0, Lcom/digdroid/alman/dig/a1$a;->x:Lcom/digdroid/alman/dig/a1;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    const v0, 0x7f0901a9

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/SquaredImageView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/a1$a;->t:Lcom/digdroid/alman/dig/SquaredImageView;

    const v0, 0x7f09025f

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/a1$a;->u:Landroid/widget/TextView;

    const/4 v1, 0x3

    new-array v1, v1, [Z

    iget-object v2, p1, Lcom/digdroid/alman/dig/a1;->p:Lcom/digdroid/alman/dig/z0;

    iget-boolean v2, v2, Lcom/digdroid/alman/dig/z0;->b:Z

    const/4 v3, 0x0

    aput-boolean v2, v1, v3

    const/4 v2, 0x1

    aput-boolean v3, v1, v2

    const/4 v2, 0x2

    aput-boolean v3, v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const v0, 0x7f0901ac

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/a1$a;->v:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/digdroid/alman/dig/h;->c:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const v0, 0x7f0901aa

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/digdroid/alman/dig/a1$a;->w:Landroid/widget/TextView;

    iget-object v0, p1, Lcom/digdroid/alman/dig/h;->c:Lcom/digdroid/alman/dig/t3;

    iget v0, v0, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p1, p1, Lcom/digdroid/alman/dig/a1;->o:Lcom/digdroid/alman/dig/c1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/c1$a;->w()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/a1$a;->v:Landroid/widget/TextView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/a1$a;->w:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method
