.class public Lcom/digdroid/alman/dig/i3$a;
.super Landroidx/recyclerview/widget/RecyclerView$d0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/i3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field t:Landroid/widget/ImageView;

.field u:Landroid/widget/TextView;

.field v:Landroid/widget/TextView;

.field final synthetic w:Lcom/digdroid/alman/dig/i3;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/i3;Landroid/view/View;)V
    .locals 3

    iput-object p1, p0, Lcom/digdroid/alman/dig/i3$a;->w:Lcom/digdroid/alman/dig/i3;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$d0;-><init>(Landroid/view/View;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    iget v1, p1, Lcom/digdroid/alman/dig/h;->f:I

    int-to-float v1, v1

    iget v2, p1, Lcom/digdroid/alman/dig/h;->g:F

    mul-float v1, v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v0, 0x7f0903d5

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/i3$a;->t:Landroid/widget/ImageView;

    const v0, 0x7f0903d7

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/i3$a;->u:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/digdroid/alman/dig/h;->c:Lcom/digdroid/alman/dig/s3;

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const v0, 0x7f0903d6

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/digdroid/alman/dig/i3$a;->v:Landroid/widget/TextView;

    iget-object v0, p1, Lcom/digdroid/alman/dig/h;->c:Lcom/digdroid/alman/dig/s3;

    iget v0, v0, Lcom/digdroid/alman/dig/s3;->f:I

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-boolean p1, p1, Lcom/digdroid/alman/dig/i3;->r:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/i3$a;->u:Landroid/widget/TextView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/i3$a;->v:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method
