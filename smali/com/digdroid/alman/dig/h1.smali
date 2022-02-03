.class Lcom/digdroid/alman/dig/h1;
.super Lcom/digdroid/alman/dig/a1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/h1$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLjava/lang/String;[ZLcom/digdroid/alman/dig/c1$a;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lcom/digdroid/alman/dig/a1;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLjava/lang/String;[ZLcom/digdroid/alman/dig/c1$a;)V

    iget p1, p0, Lcom/digdroid/alman/dig/h;->f:I

    int-to-double p1, p1

    const-wide/high16 p3, 0x4008000000000000L    # 3.0

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p1, p1, p3

    const-wide/high16 p3, 0x4000000000000000L    # 2.0

    div-double/2addr p1, p3

    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    long-to-int p2, p1

    iput p2, p0, Lcom/digdroid/alman/dig/h;->f:I

    return-void
.end method


# virtual methods
.method public j(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/digdroid/alman/dig/a1;->j(Landroidx/recyclerview/widget/RecyclerView$d0;I)V

    if-eqz p1, :cond_0

    check-cast p1, Lcom/digdroid/alman/dig/h1$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/h1$a;->y:Landroid/view/View;

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/h;->y(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public l(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0060

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0901a9

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/digdroid/alman/dig/SquaredImageView;

    iget v0, p0, Lcom/digdroid/alman/dig/h;->h:F

    invoke-virtual {p2, v0}, Lcom/digdroid/alman/dig/SquaredImageView;->c(F)V

    const p2, 0x7f09025f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/digdroid/alman/dig/LetterBox;

    iget v0, p0, Lcom/digdroid/alman/dig/h;->h:F

    invoke-virtual {p2, v0}, Lcom/digdroid/alman/dig/LetterBox;->f(F)V

    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    iget v0, p0, Lcom/digdroid/alman/dig/h;->f:I

    int-to-float v0, v0

    iget v1, p0, Lcom/digdroid/alman/dig/h;->h:F

    mul-float v0, v0, v1

    iget v1, p0, Lcom/digdroid/alman/dig/h;->g:F

    mul-float v0, v0, v1

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    const/4 v1, -0x2

    invoke-direct {p2, v0, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p2, Lcom/digdroid/alman/dig/h1$a;

    invoke-direct {p2, p0, p1}, Lcom/digdroid/alman/dig/h1$a;-><init>(Lcom/digdroid/alman/dig/h1;Landroid/view/View;)V

    return-object p2
.end method
