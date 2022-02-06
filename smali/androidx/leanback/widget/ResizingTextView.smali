.class Landroidx/leanback/widget/ResizingTextView;
.super Landroid/widget/TextView;
.source ""


# instance fields
.field private b:I

.field private c:I

.field private d:Z

.field private e:I

.field private f:I

.field private g:Z

.field private h:Z

.field private i:I

.field private j:F

.field private k:I

.field private l:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x1010084

    invoke-direct {p0, p1, p2, v0}, Landroidx/leanback/widget/ResizingTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/leanback/widget/ResizingTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 2

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/leanback/widget/ResizingTextView;->g:Z

    iput-boolean v0, p0, Landroidx/leanback/widget/ResizingTextView;->h:Z

    sget-object v1, Lb/l/l;->P:[I

    invoke-virtual {p1, p2, v1, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    :try_start_0
    sget p2, Lb/l/l;->R:I

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, p0, Landroidx/leanback/widget/ResizingTextView;->b:I

    sget p2, Lb/l/l;->U:I

    const/4 p3, -0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Landroidx/leanback/widget/ResizingTextView;->c:I

    sget p2, Lb/l/l;->Q:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Landroidx/leanback/widget/ResizingTextView;->d:Z

    sget p2, Lb/l/l;->T:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p2

    iput p2, p0, Landroidx/leanback/widget/ResizingTextView;->e:I

    sget p2, Lb/l/l;->S:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p2

    iput p2, p0, Landroidx/leanback/widget/ResizingTextView;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2
.end method

.method private a(II)V
    .locals 2

    invoke-virtual {p0}, Landroid/widget/TextView;->isPaddingRelative()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingStart()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingEnd()I

    move-result v1

    invoke-virtual {p0, v0, p1, v1, p2}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingRight()I

    move-result v1

    invoke-virtual {p0, v0, p1, v1, p2}, Landroid/widget/TextView;->setPadding(IIII)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected onMeasure(II)V
    .locals 6

    iget-boolean v0, p0, Landroidx/leanback/widget/ResizingTextView;->h:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Landroidx/leanback/widget/ResizingTextView;->i:I

    invoke-virtual {p0}, Landroid/widget/TextView;->getLineSpacingExtra()F

    move-result v0

    iput v0, p0, Landroidx/leanback/widget/ResizingTextView;->j:F

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I

    move-result v0

    iput v0, p0, Landroidx/leanback/widget/ResizingTextView;->k:I

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I

    move-result v0

    iput v0, p0, Landroidx/leanback/widget/ResizingTextView;->l:I

    iput-boolean v1, p0, Landroidx/leanback/widget/ResizingTextView;->h:Z

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/ResizingTextView;->i:I

    int-to-float v0, v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    iget v0, p0, Landroidx/leanback/widget/ResizingTextView;->j:F

    invoke-virtual {p0}, Landroid/widget/TextView;->getLineSpacingMultiplier()F

    move-result v3

    invoke-virtual {p0, v0, v3}, Landroid/widget/TextView;->setLineSpacing(FF)V

    iget v0, p0, Landroidx/leanback/widget/ResizingTextView;->k:I

    iget v3, p0, Landroidx/leanback/widget/ResizingTextView;->l:I

    invoke-direct {p0, v0, v3}, Landroidx/leanback/widget/ResizingTextView;->a(II)V

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v3, p0, Landroidx/leanback/widget/ResizingTextView;->b:I

    and-int/2addr v3, v1

    if-lez v3, :cond_1

    invoke-virtual {v0}, Landroid/text/Layout;->getLineCount()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getMaxLines()I

    move-result v3

    if-le v3, v1, :cond_1

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    move-result v3

    float-to-int v3, v3

    const/4 v4, -0x1

    iget v5, p0, Landroidx/leanback/widget/ResizingTextView;->c:I

    if-eqz v0, :cond_5

    if-eq v5, v4, :cond_2

    if-eq v3, v5, :cond_2

    int-to-float v3, v5

    invoke-virtual {p0, v2, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    const/4 v2, 0x1

    :cond_2
    iget v3, p0, Landroidx/leanback/widget/ResizingTextView;->j:F

    iget v4, p0, Landroidx/leanback/widget/ResizingTextView;->i:I

    int-to-float v4, v4

    add-float/2addr v3, v4

    iget v4, p0, Landroidx/leanback/widget/ResizingTextView;->c:I

    int-to-float v4, v4

    sub-float/2addr v3, v4

    iget-boolean v4, p0, Landroidx/leanback/widget/ResizingTextView;->d:Z

    if-eqz v4, :cond_3

    invoke-virtual {p0}, Landroid/widget/TextView;->getLineSpacingExtra()F

    move-result v4

    cmpl-float v4, v4, v3

    if-eqz v4, :cond_3

    invoke-virtual {p0}, Landroid/widget/TextView;->getLineSpacingMultiplier()F

    move-result v2

    invoke-virtual {p0, v3, v2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    const/4 v2, 0x1

    :cond_3
    iget v3, p0, Landroidx/leanback/widget/ResizingTextView;->k:I

    iget v4, p0, Landroidx/leanback/widget/ResizingTextView;->e:I

    add-int/2addr v3, v4

    iget v4, p0, Landroidx/leanback/widget/ResizingTextView;->l:I

    iget v5, p0, Landroidx/leanback/widget/ResizingTextView;->f:I

    add-int/2addr v4, v5

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I

    move-result v5

    if-ne v5, v3, :cond_4

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I

    move-result v5

    if-eq v5, v4, :cond_8

    :cond_4
    invoke-direct {p0, v3, v4}, Landroidx/leanback/widget/ResizingTextView;->a(II)V

    goto :goto_2

    :cond_5
    if-eq v5, v4, :cond_6

    iget v4, p0, Landroidx/leanback/widget/ResizingTextView;->i:I

    if-eq v3, v4, :cond_6

    int-to-float v3, v4

    invoke-virtual {p0, v2, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    const/4 v2, 0x1

    :cond_6
    iget-boolean v3, p0, Landroidx/leanback/widget/ResizingTextView;->d:Z

    if-eqz v3, :cond_7

    invoke-virtual {p0}, Landroid/widget/TextView;->getLineSpacingExtra()F

    move-result v3

    iget v4, p0, Landroidx/leanback/widget/ResizingTextView;->j:F

    cmpl-float v3, v3, v4

    if-eqz v3, :cond_7

    invoke-virtual {p0}, Landroid/widget/TextView;->getLineSpacingMultiplier()F

    move-result v2

    invoke-virtual {p0, v4, v2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    const/4 v2, 0x1

    :cond_7
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingTop()I

    move-result v3

    iget v4, p0, Landroidx/leanback/widget/ResizingTextView;->k:I

    if-ne v3, v4, :cond_9

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaddingBottom()I

    move-result v3

    iget v4, p0, Landroidx/leanback/widget/ResizingTextView;->l:I

    if-eq v3, v4, :cond_8

    goto :goto_1

    :cond_8
    move v1, v2

    goto :goto_2

    :cond_9
    :goto_1
    iget v2, p0, Landroidx/leanback/widget/ResizingTextView;->k:I

    iget v3, p0, Landroidx/leanback/widget/ResizingTextView;->l:I

    invoke-direct {p0, v2, v3}, Landroidx/leanback/widget/ResizingTextView;->a(II)V

    :goto_2
    iput-boolean v0, p0, Landroidx/leanback/widget/ResizingTextView;->g:Z

    if-eqz v1, :cond_a

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->onMeasure(II)V

    :cond_a
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/core/widget/i;->p(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method
