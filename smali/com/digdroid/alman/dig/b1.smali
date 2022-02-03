.class Lcom/digdroid/alman/dig/b1;
.super Lcom/digdroid/alman/dig/a1;
.source ""


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FFLjava/lang/String;[ZLcom/digdroid/alman/dig/c1$a;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Lcom/digdroid/alman/dig/a1;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FFLjava/lang/String;[ZLcom/digdroid/alman/dig/c1$a;)V

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
.method public l(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0061

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

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

    const v0, 0x7f0901a9

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/SquaredImageView;

    iget v1, p0, Lcom/digdroid/alman/dig/h;->h:F

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/SquaredImageView;->c(F)V

    const v0, 0x7f09025f

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/LetterBox;

    iget v1, p0, Lcom/digdroid/alman/dig/h;->h:F

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/LetterBox;->f(F)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p2, Lcom/digdroid/alman/dig/a1$a;

    invoke-direct {p2, p0, p1}, Lcom/digdroid/alman/dig/a1$a;-><init>(Lcom/digdroid/alman/dig/a1;Landroid/view/View;)V

    return-object p2
.end method
