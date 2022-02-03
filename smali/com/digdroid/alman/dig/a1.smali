.class Lcom/digdroid/alman/dig/a1;
.super Lcom/digdroid/alman/dig/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/a1$a;
    }
.end annotation


# instance fields
.field l:Ljava/lang/String;

.field m:[Z

.field n:Landroid/app/Activity;

.field o:Lcom/digdroid/alman/dig/c1$a;

.field p:Lcom/digdroid/alman/dig/z0;

.field q:Lcom/digdroid/alman/dig/m;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLjava/lang/String;[ZLcom/digdroid/alman/dig/c1$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/digdroid/alman/dig/h;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FF)V

    iput-object p6, p0, Lcom/digdroid/alman/dig/a1;->l:Ljava/lang/String;

    iput-object p7, p0, Lcom/digdroid/alman/dig/a1;->m:[Z

    iput-object p1, p0, Lcom/digdroid/alman/dig/a1;->n:Landroid/app/Activity;

    invoke-interface {p8}, Lcom/digdroid/alman/dig/c1$a;->b()Lcom/digdroid/alman/dig/m;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/a1;->q:Lcom/digdroid/alman/dig/m;

    iput-object p8, p0, Lcom/digdroid/alman/dig/a1;->o:Lcom/digdroid/alman/dig/c1$a;

    new-instance p2, Lcom/digdroid/alman/dig/z0;

    invoke-interface {p8}, Lcom/digdroid/alman/dig/c1$a;->c()Z

    move-result p3

    invoke-direct {p2, p1, p3}, Lcom/digdroid/alman/dig/z0;-><init>(Landroid/app/Activity;Z)V

    iput-object p2, p0, Lcom/digdroid/alman/dig/a1;->p:Lcom/digdroid/alman/dig/z0;

    return-void
.end method


# virtual methods
.method public j(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 12

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_2

    iget v0, p0, Lcom/digdroid/alman/dig/h;->e:I

    if-ge p2, v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    invoke-interface {v0, p2}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    check-cast p1, Lcom/digdroid/alman/dig/a1$a;

    iget-object v0, p1, Lcom/digdroid/alman/dig/a1$a;->v:Landroid/widget/TextView;

    iget-object v1, p1, Lcom/digdroid/alman/dig/a1$a;->w:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/a1;->o:Lcom/digdroid/alman/dig/c1$a;

    iget-object v3, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    invoke-interface {v2, v3}, Lcom/digdroid/alman/dig/c1$a;->a(Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object v2

    iget-object v4, p0, Lcom/digdroid/alman/dig/a1;->p:Lcom/digdroid/alman/dig/z0;

    iget-object v3, p0, Lcom/digdroid/alman/dig/a1;->o:Lcom/digdroid/alman/dig/c1$a;

    iget-object v5, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    invoke-interface {v3, v5}, Lcom/digdroid/alman/dig/c1$a;->f(Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object v5

    iget-object v3, p0, Lcom/digdroid/alman/dig/a1;->m:[Z

    aget-boolean v6, v3, p2

    iget-object v7, p0, Lcom/digdroid/alman/dig/a1;->l:Ljava/lang/String;

    iget-object v3, p0, Lcom/digdroid/alman/dig/a1;->q:Lcom/digdroid/alman/dig/m;

    invoke-virtual {v3, p2}, Lcom/digdroid/alman/dig/m;->a(I)I

    move-result v8

    iget-object v9, p1, Lcom/digdroid/alman/dig/a1$a;->t:Lcom/digdroid/alman/dig/SquaredImageView;

    iget-object v10, p1, Lcom/digdroid/alman/dig/a1$a;->u:Landroid/widget/TextView;

    move-object v11, v2

    invoke-virtual/range {v4 .. v11}, Lcom/digdroid/alman/dig/z0;->c(Ljava/lang/String;ZLjava/lang/String;ILandroid/widget/ImageView;Landroid/widget/TextView;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/a1;->o:Lcom/digdroid/alman/dig/c1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/c1$a;->w()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/a1;->o:Lcom/digdroid/alman/dig/c1$a;

    iget-object p2, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    invoke-interface {p1, p2}, Lcom/digdroid/alman/dig/c1$a;->d(Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    const/16 p1, 0x8

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_0
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

    const p2, 0x7f0901a8

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/digdroid/alman/dig/SquaredImageView;

    iget v0, p0, Lcom/digdroid/alman/dig/h;->h:F

    invoke-virtual {p2, v0}, Lcom/digdroid/alman/dig/SquaredImageView;->c(F)V

    const p2, 0x7f09025e

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

    new-instance p2, Lcom/digdroid/alman/dig/a1$a;

    invoke-direct {p2, p0, p1}, Lcom/digdroid/alman/dig/a1$a;-><init>(Lcom/digdroid/alman/dig/a1;Landroid/view/View;)V

    return-object p2
.end method
