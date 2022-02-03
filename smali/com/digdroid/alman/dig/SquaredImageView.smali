.class final Lcom/digdroid/alman/dig/SquaredImageView;
.super Landroidx/appcompat/widget/o;
.source ""


# instance fields
.field d:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/o;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/digdroid/alman/dig/SquaredImageView;->d:F

    return-void
.end method


# virtual methods
.method public c(F)V
    .locals 0

    iput p1, p0, Lcom/digdroid/alman/dig/SquaredImageView;->d:F

    return-void
.end method

.method protected onMeasure(II)V
    .locals 1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p2, p1

    iget v0, p0, Lcom/digdroid/alman/dig/SquaredImageView;->d:F

    div-float/2addr p2, v0

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/widget/ImageView;->setMeasuredDimension(II)V

    return-void
.end method
