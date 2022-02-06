.class Lcom/digdroid/alman/dig/p0;
.super Lcom/digdroid/alman/dig/q1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/p0$b;,
        Lcom/digdroid/alman/dig/p0$a;,
        Lcom/digdroid/alman/dig/p0$c;
    }
.end annotation


# instance fields
.field f:Lcom/digdroid/alman/dig/b3;

.field g:F

.field h:F

.field i:Lcom/digdroid/alman/dig/q0;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FLcom/digdroid/alman/dig/u;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 12

    move-object v0, p0

    invoke-direct/range {p0 .. p4}, Lcom/digdroid/alman/dig/q1;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;F)V

    new-instance v11, Lcom/digdroid/alman/dig/q0;

    const/high16 v5, 0x3f800000    # 1.0f

    move-object v1, v11

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move/from16 v10, p8

    invoke-direct/range {v1 .. v10}, Lcom/digdroid/alman/dig/q0;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLcom/digdroid/alman/dig/u;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v11, v0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v1

    iput-object v1, v0, Lcom/digdroid/alman/dig/p0;->f:Lcom/digdroid/alman/dig/b3;

    const-string v2, "game_list_scale"

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v1

    iput v1, v0, Lcom/digdroid/alman/dig/p0;->g:F

    iget-object v1, v0, Lcom/digdroid/alman/dig/p0;->f:Lcom/digdroid/alman/dig/b3;

    const-string v2, "game_list_spacing"

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v1

    iput v1, v0, Lcom/digdroid/alman/dig/p0;->h:F

    return-void
.end method

.method private j(Landroid/graphics/drawable/Drawable;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p1, p2}, Landroidx/core/graphics/drawable/a;->n(Landroid/graphics/drawable/Drawable;I)V

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, p2, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 2

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    if-eqz p3, :cond_3

    invoke-interface {p3}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/digdroid/alman/dig/p0$b;

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/p0;->e(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lcom/digdroid/alman/dig/p0$c;

    if-eqz v1, :cond_2

    invoke-virtual {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/p0;->c(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V

    goto :goto_0

    :cond_2
    instance-of v0, v0, Lcom/digdroid/alman/dig/p0$a;

    if-eqz v0, :cond_3

    invoke-virtual {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/p0;->d(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    :goto_0
    return-void
.end method

.method public c(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 7

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/p0$c;

    iget-object v0, p0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    iget-object v1, p1, Lcom/digdroid/alman/dig/p0$c;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    iget-object v2, p1, Lcom/digdroid/alman/dig/p0$c;->b:Landroid/widget/TextView;

    iget-object v3, p1, Lcom/digdroid/alman/dig/p0$c;->c:Landroid/widget/TextView;

    iget-object v4, p1, Lcom/digdroid/alman/dig/p0$c;->d:Landroidx/appcompat/widget/AppCompatRatingBar;

    iget-object v5, p1, Lcom/digdroid/alman/dig/p0$c;->e:Landroid/widget/TextView;

    move-object v6, p3

    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/q0;->c(Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatRatingBar;Landroid/widget/TextView;Landroid/database/Cursor;)V

    return-void
.end method

.method public d(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 9

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/p0$a;

    iget-object v1, p1, Lcom/digdroid/alman/dig/p0$a;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    iget-object v2, p1, Lcom/digdroid/alman/dig/p0$a;->b:Landroid/widget/TextView;

    iget-object v7, p1, Lcom/digdroid/alman/dig/p0$a;->c:Landroid/widget/TextView;

    iget-object v8, p1, Lcom/digdroid/alman/dig/p0$a;->d:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    iget-object v4, p1, Lcom/digdroid/alman/dig/p0$a;->e:Landroidx/appcompat/widget/AppCompatRatingBar;

    iget-object v5, p1, Lcom/digdroid/alman/dig/p0$a;->f:Landroid/widget/TextView;

    const/4 v3, 0x0

    move-object v6, p3

    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/q0;->c(Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatRatingBar;Landroid/widget/TextView;Landroid/database/Cursor;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q0;->h:Ljava/lang/String;

    const-string v0, "rating"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/q0;->h:Ljava/lang/String;

    const-string v0, "crating"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    invoke-virtual {p1, p3}, Lcom/digdroid/alman/dig/q0;->g(Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    invoke-virtual {v0, p3}, Lcom/digdroid/alman/dig/q0;->f(Landroid/database/Cursor;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/q1;->b(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-virtual {v7, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x7f1101f2

    invoke-virtual {p2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    invoke-virtual {v0, p2, p3}, Lcom/digdroid/alman/dig/q0;->e(Landroid/content/Context;Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v8, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public e(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 7

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/p0$b;

    iget-object v0, p0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    iget-object v2, p1, Lcom/digdroid/alman/dig/p0$b;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, p3

    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/q0;->c(Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatRatingBar;Landroid/widget/TextView;Landroid/database/Cursor;)V

    return-void
.end method

.method f(Landroid/view/View;)Lcom/digdroid/alman/dig/p0$c;
    .locals 7

    new-instance v0, Lcom/digdroid/alman/dig/p0$c;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/p0$c;-><init>(Lcom/digdroid/alman/dig/p0;)V

    const v1, 0x7f0901a9

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/digdroid/alman/dig/SquaredImageView;

    iput-object v1, v0, Lcom/digdroid/alman/dig/p0$c;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    iget v2, p0, Lcom/digdroid/alman/dig/q1;->d:F

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/SquaredImageView;->c(F)V

    iget-object v1, v0, Lcom/digdroid/alman/dig/p0$c;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/s3;

    iget v2, v2, Lcom/digdroid/alman/dig/s3;->d:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    const v1, 0x7f0901ac

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lcom/digdroid/alman/dig/p0$c;->b:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/s3;

    iget v2, v2, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const v1, 0x7f0901aa

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lcom/digdroid/alman/dig/p0$c;->c:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/s3;

    iget v2, v2, Lcom/digdroid/alman/dig/s3;->f:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const v1, 0x7f0901ae

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/AppCompatRatingBar;

    iput-object v1, v0, Lcom/digdroid/alman/dig/p0$c;->d:Landroidx/appcompat/widget/AppCompatRatingBar;

    const v1, 0x7f090329

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, v0, Lcom/digdroid/alman/dig/p0$c;->e:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/s3;

    iget v2, v2, Lcom/digdroid/alman/dig/s3;->g:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    iget-boolean v2, v1, Lcom/digdroid/alman/dig/q0;->o:Z

    const v3, 0x7f090328

    const/16 v4, 0x8

    if-eqz v2, :cond_0

    iget-object v1, v0, Lcom/digdroid/alman/dig/p0$c;->b:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, v0, Lcom/digdroid/alman/dig/p0$c;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_0
    iget-object v1, v1, Lcom/digdroid/alman/dig/q0;->h:Ljava/lang/String;

    const-string v2, "rating"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v5, 0x0

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/q0;->h:Ljava/lang/String;

    const-string v6, "crating"

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lcom/digdroid/alman/dig/p0$c;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v1, v0, Lcom/digdroid/alman/dig/p0$c;->c:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Lcom/digdroid/alman/dig/p0$c;->e:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    iget-object v3, v3, Lcom/digdroid/alman/dig/q0;->h:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, v0, Lcom/digdroid/alman/dig/p0$c;->d:Landroidx/appcompat/widget/AppCompatRatingBar;

    invoke-virtual {v1}, Landroid/widget/RatingBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/LayerDrawable;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const/16 v3, -0x2100

    invoke-direct {p0, v2, v3}, Lcom/digdroid/alman/dig/p0;->j(Landroid/graphics/drawable/Drawable;I)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    const v3, -0x7f777778

    invoke-direct {p0, v2, v3}, Lcom/digdroid/alman/dig/p0;->j(Landroid/graphics/drawable/Drawable;I)V

    invoke-virtual {v1, v5}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-direct {p0, v1, v3}, Lcom/digdroid/alman/dig/p0;->j(Landroid/graphics/drawable/Drawable;I)V

    :goto_3
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-object v0
.end method

.method g(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/q1;->e:Landroid/view/LayoutInflater;

    const p2, 0x7f0c005a

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/p0;->f(Landroid/view/View;)Lcom/digdroid/alman/dig/p0$c;

    return-object p1
.end method

.method h(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    iget-object p1, p0, Lcom/digdroid/alman/dig/q1;->e:Landroid/view/LayoutInflater;

    const p2, 0x7f0c005b

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/digdroid/alman/dig/p0$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/p0$a;-><init>(Lcom/digdroid/alman/dig/p0;)V

    const p3, 0x7f0901a9

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/digdroid/alman/dig/SquaredImageView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/p0$a;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    iget v1, p0, Lcom/digdroid/alman/dig/q1;->d:F

    invoke-virtual {p3, v1}, Lcom/digdroid/alman/dig/SquaredImageView;->c(F)V

    iget-object p3, p2, Lcom/digdroid/alman/dig/p0$a;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/s3;

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->d:I

    invoke-virtual {p3, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    const p3, 0x7f0901ac

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/p0$a;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/s3;

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const p3, 0x7f0903d3

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/p0$a;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/s3;

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->f:I

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const p3, 0x7f090318

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/p0$a;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/s3;

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->f:I

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const p3, 0x7f0901ae

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroidx/appcompat/widget/AppCompatRatingBar;

    iput-object p3, p2, Lcom/digdroid/alman/dig/p0$a;->e:Landroidx/appcompat/widget/AppCompatRatingBar;

    const p3, 0x7f090329

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/p0$a;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/s3;

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->g:I

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget p3, p0, Lcom/digdroid/alman/dig/p0;->h:F

    const/high16 v1, 0x41200000    # 10.0f

    mul-float p3, p3, v1

    invoke-static {p3}, Lcom/digdroid/alman/dig/p3;->d(F)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-virtual {p1, v1, p3, v2, p3}, Landroid/view/View;->setPadding(IIII)V

    iget p3, p0, Lcom/digdroid/alman/dig/p0;->g:F

    const/high16 v1, 0x42a00000    # 80.0f

    mul-float p3, p3, v1

    invoke-static {p3}, Lcom/digdroid/alman/dig/p3;->d(F)F

    move-result p3

    iget-object v1, p2, Lcom/digdroid/alman/dig/p0$a;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p2, Lcom/digdroid/alman/dig/p0$a;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    iput p3, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object p3, p2, Lcom/digdroid/alman/dig/p0$a;->b:Landroid/widget/TextView;

    iget v1, p0, Lcom/digdroid/alman/dig/p0;->g:F

    const/high16 v2, 0x41900000    # 18.0f

    mul-float v1, v1, v2

    invoke-static {v1}, Lcom/digdroid/alman/dig/p3;->u(F)F

    move-result v1

    invoke-virtual {p3, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget p3, p0, Lcom/digdroid/alman/dig/p0;->g:F

    const/high16 v1, 0x41a00000    # 20.0f

    mul-float p3, p3, v1

    invoke-static {p3}, Lcom/digdroid/alman/dig/p3;->d(F)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    iget-object v1, p2, Lcom/digdroid/alman/dig/p0$a;->b:Landroid/widget/TextView;

    invoke-virtual {v1, p3, v0, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v1, p2, Lcom/digdroid/alman/dig/p0$a;->c:Landroid/widget/TextView;

    iget v2, p0, Lcom/digdroid/alman/dig/p0;->g:F

    const/high16 v3, 0x41600000    # 14.0f

    mul-float v2, v2, v3

    invoke-static {v2}, Lcom/digdroid/alman/dig/p3;->u(F)F

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v1, p2, Lcom/digdroid/alman/dig/p0$a;->d:Landroid/widget/TextView;

    iget v2, p0, Lcom/digdroid/alman/dig/p0;->g:F

    const/high16 v3, 0x41400000    # 12.0f

    mul-float v2, v2, v3

    invoke-static {v2}, Lcom/digdroid/alman/dig/p3;->u(F)F

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v1, p2, Lcom/digdroid/alman/dig/p0$a;->d:Landroid/widget/TextView;

    invoke-virtual {v1, p3, v0, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    const v1, 0x7f0903d9

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p3, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    iget-object p3, p0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    iget-object p3, p3, Lcom/digdroid/alman/dig/q0;->h:Ljava/lang/String;

    const-string v1, "rating"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    const v2, 0x7f090328

    const/16 v3, 0x8

    if-nez p3, :cond_1

    iget-object p3, p0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    iget-object p3, p3, Lcom/digdroid/alman/dig/q0;->h:Ljava/lang/String;

    const-string v4, "crating"

    invoke-virtual {p3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p2, Lcom/digdroid/alman/dig/p0$a;->c:Landroid/widget/TextView;

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_1
    :goto_0
    iget-object p3, p2, Lcom/digdroid/alman/dig/p0$a;->c:Landroid/widget/TextView;

    invoke-virtual {p3, v3}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p3, p2, Lcom/digdroid/alman/dig/p0$a;->f:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p0;->i:Lcom/digdroid/alman/dig/q0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/q0;->h:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {p3, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p3, p2, Lcom/digdroid/alman/dig/p0$a;->e:Landroidx/appcompat/widget/AppCompatRatingBar;

    invoke-virtual {p3}, Landroid/widget/RatingBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    check-cast p3, Landroid/graphics/drawable/LayerDrawable;

    const/4 v1, 0x2

    invoke-virtual {p3, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/16 v2, -0x2100

    invoke-direct {p0, v1, v2}, Lcom/digdroid/alman/dig/p0;->j(Landroid/graphics/drawable/Drawable;I)V

    const/4 v1, 0x1

    invoke-virtual {p3, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const v2, -0x7f777778

    invoke-direct {p0, v1, v2}, Lcom/digdroid/alman/dig/p0;->j(Landroid/graphics/drawable/Drawable;I)V

    invoke-virtual {p3, v0}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-direct {p0, p3, v2}, Lcom/digdroid/alman/dig/p0;->j(Landroid/graphics/drawable/Drawable;I)V

    :goto_2
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-object p1
.end method

.method i(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/q1;->e:Landroid/view/LayoutInflater;

    const p2, 0x7f0c005d

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/digdroid/alman/dig/p0$b;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/p0$b;-><init>(Lcom/digdroid/alman/dig/p0;)V

    const p3, 0x7f0901ac

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/p0$b;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/s3;

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object p3, p0, Lcom/digdroid/alman/dig/p0;->f:Lcom/digdroid/alman/dig/b3;

    const-string v1, "game_title_scale"

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p3, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result p3

    iget-object v1, p2, Lcom/digdroid/alman/dig/p0$b;->a:Landroid/widget/TextView;

    const/high16 v2, 0x41900000    # 18.0f

    mul-float v2, v2, p3

    invoke-static {v2}, Lcom/digdroid/alman/dig/p3;->u(F)F

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    const/high16 v1, 0x41100000    # 9.0f

    mul-float v1, v1, p3

    invoke-static {v1}, Lcom/digdroid/alman/dig/p3;->e(F)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    const/high16 v2, 0x41700000    # 15.0f

    mul-float p3, p3, v2

    invoke-static {p3}, Lcom/digdroid/alman/dig/p3;->d(F)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    iget-object v2, p2, Lcom/digdroid/alman/dig/p0$b;->a:Landroid/widget/TextView;

    invoke-virtual {v2, p3, v1, p3, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-object p1
.end method

.method public newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p0;->f:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "title"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_1
    const-string v1, "list"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_2
    const-string v1, "grid"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/p0;->i(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/p0;->h(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/p0;->g(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :sswitch_data_0
    .sparse-switch
        0x308b46 -> :sswitch_2
        0x32b09e -> :sswitch_1
        0x6942258 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
