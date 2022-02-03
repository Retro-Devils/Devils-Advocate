.class Lcom/digdroid/alman/dig/e1;
.super Lcom/digdroid/alman/dig/q1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/e1$b;,
        Lcom/digdroid/alman/dig/e1$a;
    }
.end annotation


# instance fields
.field f:Ljava/lang/String;

.field g:[Z

.field h:Lcom/digdroid/alman/dig/e1$a;

.field i:Lcom/digdroid/alman/dig/z0;

.field j:Lcom/digdroid/alman/dig/m;

.field k:Landroid/content/res/Resources;

.field l:F

.field m:F


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FLjava/lang/String;[ZLcom/digdroid/alman/dig/e1$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/digdroid/alman/dig/q1;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;F)V

    iput-object p5, p0, Lcom/digdroid/alman/dig/e1;->f:Ljava/lang/String;

    iput-object p6, p0, Lcom/digdroid/alman/dig/e1;->g:[Z

    invoke-interface {p7}, Lcom/digdroid/alman/dig/e1$a;->b()Lcom/digdroid/alman/dig/m;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/e1;->j:Lcom/digdroid/alman/dig/m;

    iput-object p7, p0, Lcom/digdroid/alman/dig/e1;->h:Lcom/digdroid/alman/dig/e1$a;

    invoke-interface {p7}, Lcom/digdroid/alman/dig/e1$a;->k()F

    move-result p2

    iput p2, p0, Lcom/digdroid/alman/dig/e1;->l:F

    invoke-interface {p7}, Lcom/digdroid/alman/dig/e1$a;->m()F

    move-result p2

    iput p2, p0, Lcom/digdroid/alman/dig/e1;->m:F

    new-instance p2, Lcom/digdroid/alman/dig/z0;

    invoke-interface {p7}, Lcom/digdroid/alman/dig/e1$a;->c()Z

    move-result p3

    invoke-direct {p2, p1, p3}, Lcom/digdroid/alman/dig/z0;-><init>(Landroid/app/Activity;Z)V

    iput-object p2, p0, Lcom/digdroid/alman/dig/e1;->i:Lcom/digdroid/alman/dig/z0;

    invoke-virtual {p1}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/e1;->k:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 8

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/e1$b;

    iget-object p2, p0, Lcom/digdroid/alman/dig/e1;->h:Lcom/digdroid/alman/dig/e1$a;

    invoke-interface {p2, p3}, Lcom/digdroid/alman/dig/e1$a;->a(Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p3}, Landroid/database/Cursor;->getPosition()I

    move-result v0

    if-ltz v0, :cond_2

    iget-object v1, p0, Lcom/digdroid/alman/dig/e1;->g:[Z

    array-length v1, v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lcom/digdroid/alman/dig/e1;->i:Lcom/digdroid/alman/dig/z0;

    iget-object v2, p0, Lcom/digdroid/alman/dig/e1;->h:Lcom/digdroid/alman/dig/e1$a;

    invoke-interface {v2, p3}, Lcom/digdroid/alman/dig/e1$a;->f(Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/e1;->g:[Z

    aget-boolean v3, v3, v0

    iget-object v4, p0, Lcom/digdroid/alman/dig/e1;->f:Ljava/lang/String;

    iget-object v5, p0, Lcom/digdroid/alman/dig/e1;->j:Lcom/digdroid/alman/dig/m;

    invoke-virtual {v5, v0}, Lcom/digdroid/alman/dig/m;->a(I)I

    move-result v5

    iget-object v6, p1, Lcom/digdroid/alman/dig/e1$b;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    iget-object v7, p1, Lcom/digdroid/alman/dig/e1$b;->b:Lcom/digdroid/alman/dig/LetterBox;

    move-object v0, v1

    move-object v1, v2

    move v2, v3

    move-object v3, v4

    move v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, p2

    invoke-virtual/range {v0 .. v7}, Lcom/digdroid/alman/dig/z0;->c(Ljava/lang/String;ZLjava/lang/String;ILandroid/widget/ImageView;Landroid/widget/TextView;Ljava/lang/String;)V

    iget-object v0, p1, Lcom/digdroid/alman/dig/e1$b;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/e1;->h:Lcom/digdroid/alman/dig/e1$a;

    invoke-interface {p2, p3}, Lcom/digdroid/alman/dig/e1$a;->d(Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    iget-object p1, p1, Lcom/digdroid/alman/dig/e1$b;->d:Landroid/widget/TextView;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_1
    iget-object p1, p1, Lcom/digdroid/alman/dig/e1$b;->d:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method

.method public newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    iget-object p1, p0, Lcom/digdroid/alman/dig/q1;->e:Landroid/view/LayoutInflater;

    const p2, 0x7f0c0063

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/digdroid/alman/dig/e1$b;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/e1$b;-><init>(Lcom/digdroid/alman/dig/e1;)V

    const p3, 0x7f0901a8

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/digdroid/alman/dig/SquaredImageView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/e1$b;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    iget v1, p0, Lcom/digdroid/alman/dig/q1;->d:F

    invoke-virtual {p3, v1}, Lcom/digdroid/alman/dig/SquaredImageView;->c(F)V

    const p3, 0x7f09025e

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/digdroid/alman/dig/LetterBox;

    iput-object p3, p2, Lcom/digdroid/alman/dig/e1$b;->b:Lcom/digdroid/alman/dig/LetterBox;

    iget v1, p0, Lcom/digdroid/alman/dig/q1;->d:F

    invoke-virtual {p3, v1}, Lcom/digdroid/alman/dig/LetterBox;->f(F)V

    const/4 p3, 0x3

    new-array p3, p3, [Z

    iget-object v1, p0, Lcom/digdroid/alman/dig/e1;->i:Lcom/digdroid/alman/dig/z0;

    iget-boolean v1, v1, Lcom/digdroid/alman/dig/z0;->b:Z

    aput-boolean v1, p3, v0

    const/4 v1, 0x1

    aput-boolean v1, p3, v1

    const/4 v1, 0x2

    aput-boolean v0, p3, v1

    iget-object v1, p2, Lcom/digdroid/alman/dig/e1$b;->b:Lcom/digdroid/alman/dig/LetterBox;

    invoke-virtual {v1, p3}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const p3, 0x7f0901ab

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/e1$b;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/s3;

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const p3, 0x7f0901a9

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/e1$b;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/s3;

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->f:I

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget p3, p0, Lcom/digdroid/alman/dig/e1;->m:F

    const/high16 v1, 0x41200000    # 10.0f

    mul-float p3, p3, v1

    invoke-static {p3}, Lcom/digdroid/alman/dig/p3;->e(F)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-virtual {p1, v1, p3, v2, p3}, Landroid/view/View;->setPadding(IIII)V

    iget p3, p0, Lcom/digdroid/alman/dig/e1;->l:F

    const/high16 v1, 0x42480000    # 50.0f

    mul-float p3, p3, v1

    invoke-static {p3}, Lcom/digdroid/alman/dig/p3;->e(F)F

    move-result p3

    const v1, 0x7f09020a

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    new-instance v2, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    const/4 v3, -0x2

    invoke-direct {v2, p3, v3}, Landroidx/constraintlayout/widget/ConstraintLayout$b;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p3, p2, Lcom/digdroid/alman/dig/e1$b;->c:Landroid/widget/TextView;

    iget v1, p0, Lcom/digdroid/alman/dig/e1;->l:F

    const/high16 v2, 0x41900000    # 18.0f

    mul-float v1, v1, v2

    invoke-static {v1}, Lcom/digdroid/alman/dig/p3;->u(F)F

    move-result v1

    invoke-virtual {p3, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget p3, p0, Lcom/digdroid/alman/dig/e1;->l:F

    const/high16 v1, 0x41a00000    # 20.0f

    mul-float p3, p3, v1

    invoke-static {p3}, Lcom/digdroid/alman/dig/p3;->d(F)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    iget-object v1, p2, Lcom/digdroid/alman/dig/e1$b;->c:Landroid/widget/TextView;

    invoke-virtual {v1, p3, v0, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v1, p2, Lcom/digdroid/alman/dig/e1$b;->d:Landroid/widget/TextView;

    iget v2, p0, Lcom/digdroid/alman/dig/e1;->l:F

    const/high16 v3, 0x41600000    # 14.0f

    mul-float v2, v2, v3

    invoke-static {v2}, Lcom/digdroid/alman/dig/p3;->u(F)F

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v1, p2, Lcom/digdroid/alman/dig/e1$b;->d:Landroid/widget/TextView;

    invoke-virtual {v1, p3, v0, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-object p1
.end method
