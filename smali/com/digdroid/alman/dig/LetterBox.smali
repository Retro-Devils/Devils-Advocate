.class final Lcom/digdroid/alman/dig/LetterBox;
.super Landroidx/appcompat/widget/y;
.source ""


# instance fields
.field private f:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/y;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/digdroid/alman/dig/LetterBox;->f:F

    return-void
.end method


# virtual methods
.method public f(F)V
    .locals 0

    iput p1, p0, Lcom/digdroid/alman/dig/LetterBox;->f:F

    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    int-to-float p2, p1

    iget v0, p0, Lcom/digdroid/alman/dig/LetterBox;->f:F

    div-float v0, p2, v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setMeasuredDimension(II)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Z

    const/4 v0, 0x0

    aget-boolean v1, p1, v0

    const/4 v2, 0x1

    aget-boolean v2, p1, v2

    const/4 v3, 0x2

    aget-boolean p1, p1, v3

    if-nez v1, :cond_1

    if-nez p1, :cond_0

    const p1, 0x3f666666

    :goto_0
    mul-float p2, p2, p1

    goto :goto_1

    :cond_0
    if-nez v2, :cond_2

    const p1, 0x3f8851ec

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    const/high16 p1, 0x41100000    # 9.0f

    div-float p1, p2, p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-virtual {p0, v0, p1, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_2
    :goto_1
    invoke-virtual {p0, v0, p2}, Landroidx/appcompat/widget/y;->setTextSize(IF)V

    if-eqz v2, :cond_3

    const/16 p1, 0x35

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    :cond_3
    return-void
.end method
