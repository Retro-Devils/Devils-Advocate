.class Lcom/digdroid/alman/dig/z0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field a:Landroid/graphics/Typeface;

.field b:Z

.field c:Lcom/digdroid/alman/dig/MainActivity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v0, p1

    check-cast v0, Lcom/digdroid/alman/dig/MainActivity;

    iput-object v0, p0, Lcom/digdroid/alman/dig/z0;->c:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {p1}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    const-string v1, "language"

    const-string v2, "device"

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    :cond_0
    if-eqz p2, :cond_1

    const-string p2, "ja"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "ru"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "ko"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const-string p2, "ar"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    iput-boolean p2, p0, Lcom/digdroid/alman/dig/z0;->b:Z

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    const-string p2, "fonts/PressStart2P.ttf"

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/z0;->a:Landroid/graphics/Typeface;

    :cond_2
    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/z0;->b:Z

    if-nez v0, :cond_0

    const/4 v0, 0x6

    goto :goto_0

    :cond_0
    const/16 v0, 0xc

    :goto_0
    int-to-float v0, v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->e(F)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method b()F
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/z0;->c:Lcom/digdroid/alman/dig/MainActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/a4;->g(Z)Landroid/graphics/Point;

    move-result-object v0

    iget v1, v0, Landroid/graphics/Point;->y:I

    iget v0, v0, Landroid/graphics/Point;->x:I

    if-le v1, v0, :cond_0

    int-to-float v0, v0

    const/high16 v1, 0x41c80000    # 25.0f

    goto :goto_0

    :cond_0
    int-to-float v0, v0

    const/high16 v1, 0x420c0000    # 35.0f

    :goto_0
    div-float/2addr v0, v1

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/z0;->b:Z

    if-nez v1, :cond_1

    const v1, 0x3fa66666

    mul-float v0, v0, v1

    :cond_1
    return v0
.end method

.method public c(Ljava/lang/String;ZLjava/lang/String;ILandroid/widget/ImageView;Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    const/16 v1, 0x8

    if-eqz p2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {p5, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    if-eqz p2, :cond_1

    const/16 v0, 0x8

    :cond_1
    invoke-virtual {p6, v0}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    new-instance p2, Ljava/io/File;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "/"

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".png"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/z0;->c:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {p1}, Lcom/digdroid/alman/dig/l1;->b(Landroidx/fragment/app/d;)Lcom/digdroid/alman/dig/o1;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/o1;->I(Ljava/io/File;)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    sget-object p2, Lcom/bumptech/glide/load/o/j;->b:Lcom/bumptech/glide/load/o/j;

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/n1;->C0(Lcom/bumptech/glide/load/o/j;)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/n1;->T0(Z)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    goto :goto_1

    :cond_2
    iget-object p2, p0, Lcom/digdroid/alman/dig/z0;->c:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {p2}, Lcom/digdroid/alman/dig/l1;->b(Landroidx/fragment/app/d;)Lcom/digdroid/alman/dig/o1;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/o1;->K(Ljava/lang/String;)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    :goto_1
    invoke-virtual {p1, p5}, Lcom/bumptech/glide/j;->p0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;

    goto :goto_2

    :cond_3
    invoke-virtual {p0, p6, p7}, Lcom/digdroid/alman/dig/z0;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    invoke-virtual {p6, p4}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_2
    return-void
.end method

.method public d(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/z0;->e(Landroid/widget/TextView;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/widget/TextView;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Z

    const-string v0, "\\p{Latin}"

    invoke-virtual {p2, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result p2

    const/4 v0, 0x2

    aput-boolean p2, p1, v0

    return-void
.end method

.method public e(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/z0;->b:Z

    if-eqz v0, :cond_0

    invoke-static {p2}, Lcom/digdroid/alman/dig/y3;->x(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p2

    :cond_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-boolean p2, p0, Lcom/digdroid/alman/dig/z0;->b:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/digdroid/alman/dig/z0;->a:Landroid/graphics/Typeface;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_1
    return-void
.end method
