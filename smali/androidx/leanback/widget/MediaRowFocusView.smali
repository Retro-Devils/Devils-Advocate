.class Landroidx/leanback/widget/MediaRowFocusView;
.super Landroid/view/View;
.source ""


# instance fields
.field private final b:Landroid/graphics/Paint;

.field private final c:Landroid/graphics/RectF;

.field private d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Landroidx/leanback/widget/MediaRowFocusView;->c:Landroid/graphics/RectF;

    invoke-direct {p0, p1}, Landroidx/leanback/widget/MediaRowFocusView;->a(Landroid/content/Context;)Landroid/graphics/Paint;

    move-result-object p1

    iput-object p1, p0, Landroidx/leanback/widget/MediaRowFocusView;->b:Landroid/graphics/Paint;

    return-void
.end method

.method private a(Landroid/content/Context;)Landroid/graphics/Paint;
    .locals 2

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v1, Lb/l/b;->e:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-object v0
.end method


# virtual methods
.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroidx/leanback/widget/MediaRowFocusView;->d:I

    mul-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Landroidx/leanback/widget/MediaRowFocusView;->c:Landroid/graphics/RectF;

    neg-int v2, v0

    int-to-float v2, v2

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/2addr v4, v0

    int-to-float v0, v4

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v2, v3, v0}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v0, p0, Landroidx/leanback/widget/MediaRowFocusView;->c:Landroid/graphics/RectF;

    iget v1, p0, Landroidx/leanback/widget/MediaRowFocusView;->d:I

    int-to-float v2, v1

    int-to-float v1, v1

    iget-object v3, p0, Landroidx/leanback/widget/MediaRowFocusView;->b:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v1, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void
.end method
