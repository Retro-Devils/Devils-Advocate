.class Lcom/digdroid/alman/dig/x0;
.super Lcom/digdroid/alman/dig/u1;
.source ""


# instance fields
.field u:Landroid/widget/ImageView;

.field v:Landroid/widget/TextView;

.field w:Landroid/widget/TextView;

.field x:Landroidx/appcompat/widget/AppCompatRatingBar;

.field y:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/u1;-><init>(Landroid/view/View;)V

    return-void
.end method

.method private M(Landroid/graphics/drawable/Drawable;I)V
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
.method public N(Lcom/digdroid/alman/dig/s3;ZLjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/u1;->t:Landroid/view/View;

    const v1, 0x7f0901a9

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/x0;->u:Landroid/widget/ImageView;

    iget v1, p1, Lcom/digdroid/alman/dig/s3;->d:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/u1;->t:Landroid/view/View;

    const v1, 0x7f0901ac

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/x0;->v:Landroid/widget/TextView;

    iget v1, p1, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/u1;->t:Landroid/view/View;

    const v1, 0x7f0901aa

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/x0;->w:Landroid/widget/TextView;

    iget v1, p1, Lcom/digdroid/alman/dig/s3;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/u1;->t:Landroid/view/View;

    const v1, 0x7f0901ae

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/AppCompatRatingBar;

    iput-object v0, p0, Lcom/digdroid/alman/dig/x0;->x:Landroidx/appcompat/widget/AppCompatRatingBar;

    iget-object v0, p0, Lcom/digdroid/alman/dig/u1;->t:Landroid/view/View;

    const v1, 0x7f090329

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/x0;->y:Landroid/widget/TextView;

    iget p1, p1, Lcom/digdroid/alman/dig/s3;->g:I

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const p1, 0x7f090328

    const/16 v0, 0x8

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/x0;->v:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/x0;->w:Landroid/widget/TextView;

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/u1;->t:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_0
    const-string p2, "rating"

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_2

    const-string v1, "crating"

    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/x0;->w:Landroid/widget/TextView;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/x0;->w:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/u1;->t:Landroid/view/View;

    invoke-virtual {v1, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/x0;->y:Landroid/widget/TextView;

    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/x0;->x:Landroidx/appcompat/widget/AppCompatRatingBar;

    invoke-virtual {p1}, Landroid/widget/RatingBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/LayerDrawable;

    const/4 p2, 0x2

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const/16 p3, -0x2100

    invoke-direct {p0, p2, p3}, Lcom/digdroid/alman/dig/x0;->M(Landroid/graphics/drawable/Drawable;I)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    const p3, -0x7f777778

    invoke-direct {p0, p2, p3}, Lcom/digdroid/alman/dig/x0;->M(Landroid/graphics/drawable/Drawable;I)V

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lcom/digdroid/alman/dig/x0;->M(Landroid/graphics/drawable/Drawable;I)V

    :goto_3
    return-void
.end method
