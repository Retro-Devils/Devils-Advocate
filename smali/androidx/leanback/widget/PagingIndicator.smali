.class public Landroidx/leanback/widget/PagingIndicator;
.super Landroid/view/View;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/leanback/widget/PagingIndicator$d;
    }
.end annotation


# static fields
.field private static final b:Landroid/animation/TimeInterpolator;

.field private static final c:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/leanback/widget/PagingIndicator$d;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final d:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/leanback/widget/PagingIndicator$d;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Landroidx/leanback/widget/PagingIndicator$d;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final A:Landroid/animation/AnimatorSet;

.field B:Landroid/graphics/Bitmap;

.field C:Landroid/graphics/Paint;

.field final D:Landroid/graphics/Rect;

.field final E:F

.field f:Z

.field final g:I

.field final h:I

.field private final i:I

.field final j:I

.field final k:I

.field private final l:I

.field private final m:I

.field private n:[Landroidx/leanback/widget/PagingIndicator$d;

.field private o:[I

.field private p:[I

.field private q:[I

.field r:I

.field private s:I

.field private t:I

.field private u:I

.field v:I

.field final w:Landroid/graphics/Paint;

.field final x:Landroid/graphics/Paint;

.field private final y:Landroid/animation/AnimatorSet;

.field private final z:Landroid/animation/AnimatorSet;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Float;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v1, Landroidx/leanback/widget/PagingIndicator;->b:Landroid/animation/TimeInterpolator;

    new-instance v1, Landroidx/leanback/widget/PagingIndicator$a;

    const-string v2, "alpha"

    invoke-direct {v1, v0, v2}, Landroidx/leanback/widget/PagingIndicator$a;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v1, Landroidx/leanback/widget/PagingIndicator;->c:Landroid/util/Property;

    new-instance v1, Landroidx/leanback/widget/PagingIndicator$b;

    const-string v2, "diameter"

    invoke-direct {v1, v0, v2}, Landroidx/leanback/widget/PagingIndicator$b;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v1, Landroidx/leanback/widget/PagingIndicator;->d:Landroid/util/Property;

    new-instance v1, Landroidx/leanback/widget/PagingIndicator$c;

    const-string v2, "translation_x"

    invoke-direct {v1, v0, v2}, Landroidx/leanback/widget/PagingIndicator$c;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v1, Landroidx/leanback/widget/PagingIndicator;->e:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroidx/leanback/widget/PagingIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v0, Landroid/animation/AnimatorSet;

    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v0, p0, Landroidx/leanback/widget/PagingIndicator;->A:Landroid/animation/AnimatorSet;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget-object v2, Lb/l/l;->l:[I

    const/4 v3, 0x0

    invoke-virtual {p1, p2, v2, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    sget p2, Lb/l/l;->s:I

    sget p3, Lb/l/c;->f:I

    invoke-direct {p0, p1, p2, p3}, Landroidx/leanback/widget/PagingIndicator;->g(Landroid/content/res/TypedArray;II)I

    move-result p2

    iput p2, p0, Landroidx/leanback/widget/PagingIndicator;->h:I

    mul-int/lit8 p3, p2, 0x2

    iput p3, p0, Landroidx/leanback/widget/PagingIndicator;->g:I

    sget p3, Lb/l/l;->o:I

    sget v2, Lb/l/c;->b:I

    invoke-direct {p0, p1, p3, v2}, Landroidx/leanback/widget/PagingIndicator;->g(Landroid/content/res/TypedArray;II)I

    move-result p3

    iput p3, p0, Landroidx/leanback/widget/PagingIndicator;->k:I

    mul-int/lit8 v2, p3, 0x2

    iput v2, p0, Landroidx/leanback/widget/PagingIndicator;->j:I

    sget v4, Lb/l/l;->r:I

    sget v5, Lb/l/c;->e:I

    invoke-direct {p0, p1, v4, v5}, Landroidx/leanback/widget/PagingIndicator;->g(Landroid/content/res/TypedArray;II)I

    move-result v4

    iput v4, p0, Landroidx/leanback/widget/PagingIndicator;->i:I

    sget v4, Lb/l/l;->q:I

    sget v5, Lb/l/c;->a:I

    invoke-direct {p0, p1, v4, v5}, Landroidx/leanback/widget/PagingIndicator;->g(Landroid/content/res/TypedArray;II)I

    move-result v4

    iput v4, p0, Landroidx/leanback/widget/PagingIndicator;->l:I

    sget v4, Lb/l/l;->p:I

    sget v5, Lb/l/b;->d:I

    invoke-direct {p0, p1, v4, v5}, Landroidx/leanback/widget/PagingIndicator;->f(Landroid/content/res/TypedArray;II)I

    move-result v4

    new-instance v5, Landroid/graphics/Paint;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v5, p0, Landroidx/leanback/widget/PagingIndicator;->w:Landroid/graphics/Paint;

    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    sget v4, Lb/l/l;->m:I

    sget v5, Lb/l/b;->b:I

    invoke-direct {p0, p1, v4, v5}, Landroidx/leanback/widget/PagingIndicator;->f(Landroid/content/res/TypedArray;II)I

    move-result v4

    iput v4, p0, Landroidx/leanback/widget/PagingIndicator;->v:I

    iget-object v4, p0, Landroidx/leanback/widget/PagingIndicator;->C:Landroid/graphics/Paint;

    if-nez v4, :cond_0

    sget v4, Lb/l/l;->n:I

    invoke-virtual {p1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {p1, v4, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    invoke-virtual {p0, v4}, Landroidx/leanback/widget/PagingIndicator;->setArrowColor(I)V

    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Landroidx/leanback/widget/PagingIndicator;->f:Z

    sget p1, Lb/l/b;->c:I

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    sget v4, Lb/l/c;->d:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    iput v4, p0, Landroidx/leanback/widget/PagingIndicator;->m:I

    new-instance v5, Landroid/graphics/Paint;

    invoke-direct {v5, v6}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v5, p0, Landroidx/leanback/widget/PagingIndicator;->x:Landroid/graphics/Paint;

    sget v7, Lb/l/c;->c:I

    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    int-to-float v4, v4

    int-to-float v1, v1

    invoke-virtual {v5, v4, v1, v1, p1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    invoke-direct {p0}, Landroidx/leanback/widget/PagingIndicator;->h()Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Landroidx/leanback/widget/PagingIndicator;->B:Landroid/graphics/Bitmap;

    new-instance p1, Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/leanback/widget/PagingIndicator;->B:Landroid/graphics/Bitmap;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    iget-object v4, p0, Landroidx/leanback/widget/PagingIndicator;->B:Landroid/graphics/Bitmap;

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-direct {p1, v3, v3, v1, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object p1, p0, Landroidx/leanback/widget/PagingIndicator;->D:Landroid/graphics/Rect;

    iget-object p1, p0, Landroidx/leanback/widget/PagingIndicator;->B:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    int-to-float p1, p1

    int-to-float v1, v2

    div-float/2addr p1, v1

    iput p1, p0, Landroidx/leanback/widget/PagingIndicator;->E:F

    new-instance p1, Landroid/animation/AnimatorSet;

    invoke-direct {p1}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object p1, p0, Landroidx/leanback/widget/PagingIndicator;->y:Landroid/animation/AnimatorSet;

    const/4 v1, 0x3

    new-array v2, v1, [Landroid/animation/Animator;

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {p0, v4, v5}, Landroidx/leanback/widget/PagingIndicator;->c(FF)Landroid/animation/Animator;

    move-result-object v7

    aput-object v7, v2, v3

    mul-int/lit8 v7, p2, 0x2

    int-to-float v7, v7

    mul-int/lit8 v8, p3, 0x2

    int-to-float v8, v8

    invoke-direct {p0, v7, v8}, Landroidx/leanback/widget/PagingIndicator;->d(FF)Landroid/animation/Animator;

    move-result-object v7

    aput-object v7, v2, v6

    invoke-direct {p0}, Landroidx/leanback/widget/PagingIndicator;->e()Landroid/animation/Animator;

    move-result-object v7

    const/4 v8, 0x2

    aput-object v7, v2, v8

    invoke-virtual {p1, v2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    iput-object v2, p0, Landroidx/leanback/widget/PagingIndicator;->z:Landroid/animation/AnimatorSet;

    new-array v1, v1, [Landroid/animation/Animator;

    invoke-direct {p0, v5, v4}, Landroidx/leanback/widget/PagingIndicator;->c(FF)Landroid/animation/Animator;

    move-result-object v4

    aput-object v4, v1, v3

    mul-int/lit8 p3, p3, 0x2

    int-to-float p3, p3

    mul-int/lit8 p2, p2, 0x2

    int-to-float p2, p2

    invoke-direct {p0, p3, p2}, Landroidx/leanback/widget/PagingIndicator;->d(FF)Landroid/animation/Animator;

    move-result-object p2

    aput-object p2, v1, v6

    invoke-direct {p0}, Landroidx/leanback/widget/PagingIndicator;->e()Landroid/animation/Animator;

    move-result-object p2

    aput-object p2, v1, v8

    invoke-virtual {v2, v1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    new-array p2, v8, [Landroid/animation/Animator;

    aput-object p1, p2, v3

    aput-object v2, p2, v6

    invoke-virtual {v0, p2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    const/4 p1, 0x0

    invoke-virtual {p0, v6, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    return-void
.end method

.method private a()V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroidx/leanback/widget/PagingIndicator;->t:I

    const/high16 v2, -0x40800000    # -1.0f

    const/high16 v3, 0x3f800000    # 1.0f

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Landroidx/leanback/widget/PagingIndicator;->n:[Landroidx/leanback/widget/PagingIndicator$d;

    aget-object v1, v1, v0

    invoke-virtual {v1}, Landroidx/leanback/widget/PagingIndicator$d;->b()V

    iget-object v1, p0, Landroidx/leanback/widget/PagingIndicator;->n:[Landroidx/leanback/widget/PagingIndicator$d;

    aget-object v4, v1, v0

    iget v5, p0, Landroidx/leanback/widget/PagingIndicator;->u:I

    if-ne v0, v5, :cond_0

    goto :goto_1

    :cond_0
    const/high16 v2, 0x3f800000    # 1.0f

    :goto_1
    iput v2, v4, Landroidx/leanback/widget/PagingIndicator$d;->h:F

    aget-object v1, v1, v0

    iget-object v2, p0, Landroidx/leanback/widget/PagingIndicator;->p:[I

    aget v2, v2, v0

    int-to-float v2, v2

    iput v2, v1, Landroidx/leanback/widget/PagingIndicator$d;->d:F

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/leanback/widget/PagingIndicator;->n:[Landroidx/leanback/widget/PagingIndicator$d;

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroidx/leanback/widget/PagingIndicator$d;->h()V

    iget-object v0, p0, Landroidx/leanback/widget/PagingIndicator;->n:[Landroidx/leanback/widget/PagingIndicator$d;

    iget v1, p0, Landroidx/leanback/widget/PagingIndicator;->t:I

    aget-object v4, v0, v1

    iget v5, p0, Landroidx/leanback/widget/PagingIndicator;->u:I

    if-ge v5, v1, :cond_2

    goto :goto_2

    :cond_2
    const/high16 v2, 0x3f800000    # 1.0f

    :goto_2
    iput v2, v4, Landroidx/leanback/widget/PagingIndicator$d;->h:F

    aget-object v0, v0, v1

    iget-object v2, p0, Landroidx/leanback/widget/PagingIndicator;->o:[I

    aget v2, v2, v1

    :goto_3
    int-to-float v2, v2

    iput v2, v0, Landroidx/leanback/widget/PagingIndicator$d;->d:F

    add-int/lit8 v1, v1, 0x1

    iget v0, p0, Landroidx/leanback/widget/PagingIndicator;->s:I

    if-ge v1, v0, :cond_3

    iget-object v0, p0, Landroidx/leanback/widget/PagingIndicator;->n:[Landroidx/leanback/widget/PagingIndicator$d;

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroidx/leanback/widget/PagingIndicator$d;->b()V

    iget-object v0, p0, Landroidx/leanback/widget/PagingIndicator;->n:[Landroidx/leanback/widget/PagingIndicator$d;

    aget-object v2, v0, v1

    iput v3, v2, Landroidx/leanback/widget/PagingIndicator$d;->h:F

    aget-object v0, v0, v1

    iget-object v2, p0, Landroidx/leanback/widget/PagingIndicator;->q:[I

    aget v2, v2, v1

    goto :goto_3

    :cond_3
    return-void
.end method

.method private b()V
    .locals 11

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-direct {p0}, Landroidx/leanback/widget/PagingIndicator;->getRequiredWidth()I

    move-result v3

    add-int/2addr v0, v2

    div-int/lit8 v0, v0, 0x2

    iget v2, p0, Landroidx/leanback/widget/PagingIndicator;->s:I

    new-array v4, v2, [I

    iput-object v4, p0, Landroidx/leanback/widget/PagingIndicator;->o:[I

    new-array v5, v2, [I

    iput-object v5, p0, Landroidx/leanback/widget/PagingIndicator;->p:[I

    new-array v2, v2, [I

    iput-object v2, p0, Landroidx/leanback/widget/PagingIndicator;->q:[I

    iget-boolean v6, p0, Landroidx/leanback/widget/PagingIndicator;->f:Z

    const/4 v7, 0x1

    const/4 v8, 0x0

    div-int/lit8 v3, v3, 0x2

    if-eqz v6, :cond_0

    sub-int/2addr v0, v3

    iget v3, p0, Landroidx/leanback/widget/PagingIndicator;->h:I

    add-int v6, v0, v3

    iget v9, p0, Landroidx/leanback/widget/PagingIndicator;->i:I

    sub-int/2addr v6, v9

    iget v10, p0, Landroidx/leanback/widget/PagingIndicator;->l:I

    add-int/2addr v6, v10

    aput v6, v4, v8

    add-int v4, v0, v3

    aput v4, v5, v8

    add-int/2addr v0, v3

    mul-int/lit8 v9, v9, 0x2

    sub-int/2addr v0, v9

    mul-int/lit8 v10, v10, 0x2

    add-int/2addr v0, v10

    aput v0, v2, v8

    :goto_0
    iget v0, p0, Landroidx/leanback/widget/PagingIndicator;->s:I

    if-ge v7, v0, :cond_1

    iget-object v0, p0, Landroidx/leanback/widget/PagingIndicator;->o:[I

    iget-object v2, p0, Landroidx/leanback/widget/PagingIndicator;->p:[I

    add-int/lit8 v3, v7, -0x1

    aget v4, v2, v3

    iget v5, p0, Landroidx/leanback/widget/PagingIndicator;->l:I

    add-int/2addr v4, v5

    aput v4, v0, v7

    aget v4, v2, v3

    iget v6, p0, Landroidx/leanback/widget/PagingIndicator;->i:I

    add-int/2addr v4, v6

    aput v4, v2, v7

    iget-object v2, p0, Landroidx/leanback/widget/PagingIndicator;->q:[I

    aget v0, v0, v3

    add-int/2addr v0, v5

    aput v0, v2, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    add-int/2addr v0, v3

    iget v3, p0, Landroidx/leanback/widget/PagingIndicator;->h:I

    sub-int v6, v0, v3

    iget v9, p0, Landroidx/leanback/widget/PagingIndicator;->i:I

    add-int/2addr v6, v9

    iget v10, p0, Landroidx/leanback/widget/PagingIndicator;->l:I

    sub-int/2addr v6, v10

    aput v6, v4, v8

    sub-int v4, v0, v3

    aput v4, v5, v8

    sub-int/2addr v0, v3

    mul-int/lit8 v9, v9, 0x2

    add-int/2addr v0, v9

    mul-int/lit8 v10, v10, 0x2

    sub-int/2addr v0, v10

    aput v0, v2, v8

    :goto_1
    iget v0, p0, Landroidx/leanback/widget/PagingIndicator;->s:I

    if-ge v7, v0, :cond_1

    iget-object v0, p0, Landroidx/leanback/widget/PagingIndicator;->o:[I

    iget-object v2, p0, Landroidx/leanback/widget/PagingIndicator;->p:[I

    add-int/lit8 v3, v7, -0x1

    aget v4, v2, v3

    iget v5, p0, Landroidx/leanback/widget/PagingIndicator;->l:I

    sub-int/2addr v4, v5

    aput v4, v0, v7

    aget v4, v2, v3

    iget v6, p0, Landroidx/leanback/widget/PagingIndicator;->i:I

    sub-int/2addr v4, v6

    aput v4, v2, v7

    iget-object v2, p0, Landroidx/leanback/widget/PagingIndicator;->q:[I

    aget v0, v0, v3

    sub-int/2addr v0, v5

    aput v0, v2, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    iget v0, p0, Landroidx/leanback/widget/PagingIndicator;->k:I

    add-int/2addr v1, v0

    iput v1, p0, Landroidx/leanback/widget/PagingIndicator;->r:I

    invoke-direct {p0}, Landroidx/leanback/widget/PagingIndicator;->a()V

    return-void
.end method

.method private c(FF)Landroid/animation/Animator;
    .locals 3

    sget-object v0, Landroidx/leanback/widget/PagingIndicator;->c:Landroid/util/Property;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 p1, 0x1

    aput p2, v1, p1

    const/4 p1, 0x0

    invoke-static {p1, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const-wide/16 v0, 0xa7

    invoke-virtual {p1, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object p2, Landroidx/leanback/widget/PagingIndicator;->b:Landroid/animation/TimeInterpolator;

    invoke-virtual {p1, p2}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-object p1
.end method

.method private d(FF)Landroid/animation/Animator;
    .locals 3

    sget-object v0, Landroidx/leanback/widget/PagingIndicator;->d:Landroid/util/Property;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 p1, 0x1

    aput p2, v1, p1

    const/4 p1, 0x0

    invoke-static {p1, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const-wide/16 v0, 0x1a1

    invoke-virtual {p1, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object p2, Landroidx/leanback/widget/PagingIndicator;->b:Landroid/animation/TimeInterpolator;

    invoke-virtual {p1, p2}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-object p1
.end method

.method private e()Landroid/animation/Animator;
    .locals 4

    sget-object v0, Landroidx/leanback/widget/PagingIndicator;->e:Landroid/util/Property;

    const/4 v1, 0x2

    new-array v1, v1, [F

    iget v2, p0, Landroidx/leanback/widget/PagingIndicator;->l:I

    neg-int v2, v2

    iget v3, p0, Landroidx/leanback/widget/PagingIndicator;->i:I

    add-int/2addr v2, v3

    int-to-float v2, v2

    const/4 v3, 0x0

    aput v2, v1, v3

    const/4 v2, 0x1

    const/4 v3, 0x0

    aput v3, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0x1a1

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    sget-object v1, Landroidx/leanback/widget/PagingIndicator;->b:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-object v0
.end method

.method private f(Landroid/content/res/TypedArray;II)I
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    return p1
.end method

.method private g(Landroid/content/res/TypedArray;II)I
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result p1

    return p1
.end method

.method private getDesiredHeight()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    iget v1, p0, Landroidx/leanback/widget/PagingIndicator;->j:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v0, v1

    iget v1, p0, Landroidx/leanback/widget/PagingIndicator;->m:I

    add-int/2addr v0, v1

    return v0
.end method

.method private getDesiredWidth()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-direct {p0}, Landroidx/leanback/widget/PagingIndicator;->getRequiredWidth()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method private getRequiredWidth()I
    .locals 3

    iget v0, p0, Landroidx/leanback/widget/PagingIndicator;->h:I

    mul-int/lit8 v0, v0, 0x2

    iget v1, p0, Landroidx/leanback/widget/PagingIndicator;->l:I

    mul-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    iget v1, p0, Landroidx/leanback/widget/PagingIndicator;->s:I

    add-int/lit8 v1, v1, -0x3

    iget v2, p0, Landroidx/leanback/widget/PagingIndicator;->i:I

    mul-int v1, v1, v2

    add-int/2addr v0, v1

    return v0
.end method

.method private h()Landroid/graphics/Bitmap;
    .locals 9

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lb/l/d;->b:I

    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v2

    iget-boolean v0, p0, Landroidx/leanback/widget/PagingIndicator;->f:Z

    if-eqz v0, :cond_0

    return-object v2

    :cond_0
    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method private setSelectedPage(I)V
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/PagingIndicator;->t:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/leanback/widget/PagingIndicator;->t:I

    invoke-direct {p0}, Landroidx/leanback/widget/PagingIndicator;->a()V

    return-void
.end method


# virtual methods
.method getDotSelectedLeftX()[I
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/PagingIndicator;->p:[I

    return-object v0
.end method

.method getDotSelectedRightX()[I
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/PagingIndicator;->q:[I

    return-object v0
.end method

.method getDotSelectedX()[I
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/PagingIndicator;->o:[I

    return-object v0
.end method

.method getPageCount()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/PagingIndicator;->s:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroidx/leanback/widget/PagingIndicator;->s:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Landroidx/leanback/widget/PagingIndicator;->n:[Landroidx/leanback/widget/PagingIndicator$d;

    aget-object v1, v1, v0

    invoke-virtual {v1, p1}, Landroidx/leanback/widget/PagingIndicator$d;->c(Landroid/graphics/Canvas;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    invoke-direct {p0}, Landroidx/leanback/widget/PagingIndicator;->getDesiredHeight()I

    move-result v0

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    const/high16 v3, -0x80000000

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_0
    invoke-direct {p0}, Landroidx/leanback/widget/PagingIndicator;->getDesiredWidth()I

    move-result p2

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    if-eq v1, v3, :cond_3

    if-eq v1, v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    goto :goto_1

    :cond_3
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    :goto_1
    invoke-virtual {p0, p2, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public onRtlPropertiesChanged(I)V
    .locals 3

    invoke-super {p0, p1}, Landroid/view/View;->onRtlPropertiesChanged(I)V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-boolean v1, p0, Landroidx/leanback/widget/PagingIndicator;->f:Z

    if-eq v1, p1, :cond_2

    iput-boolean p1, p0, Landroidx/leanback/widget/PagingIndicator;->f:Z

    invoke-direct {p0}, Landroidx/leanback/widget/PagingIndicator;->h()Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Landroidx/leanback/widget/PagingIndicator;->B:Landroid/graphics/Bitmap;

    iget-object p1, p0, Landroidx/leanback/widget/PagingIndicator;->n:[Landroidx/leanback/widget/PagingIndicator$d;

    if-eqz p1, :cond_1

    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_1

    aget-object v2, p1, v0

    invoke-virtual {v2}, Landroidx/leanback/widget/PagingIndicator$d;->g()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Landroidx/leanback/widget/PagingIndicator;->b()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_2
    return-void
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    invoke-direct {p0}, Landroidx/leanback/widget/PagingIndicator;->b()V

    return-void
.end method

.method public setArrowBackgroundColor(I)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/PagingIndicator;->v:I

    return-void
.end method

.method public setArrowColor(I)V
    .locals 3

    iget-object v0, p0, Landroidx/leanback/widget/PagingIndicator;->C:Landroid/graphics/Paint;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Landroidx/leanback/widget/PagingIndicator;->C:Landroid/graphics/Paint;

    :cond_0
    iget-object v0, p0, Landroidx/leanback/widget/PagingIndicator;->C:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, p1, v2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    return-void
.end method

.method public setDotBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/PagingIndicator;->w:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public setPageCount(I)V
    .locals 3

    if-lez p1, :cond_1

    iput p1, p0, Landroidx/leanback/widget/PagingIndicator;->s:I

    new-array p1, p1, [Landroidx/leanback/widget/PagingIndicator$d;

    iput-object p1, p0, Landroidx/leanback/widget/PagingIndicator;->n:[Landroidx/leanback/widget/PagingIndicator$d;

    const/4 p1, 0x0

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Landroidx/leanback/widget/PagingIndicator;->s:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Landroidx/leanback/widget/PagingIndicator;->n:[Landroidx/leanback/widget/PagingIndicator$d;

    new-instance v2, Landroidx/leanback/widget/PagingIndicator$d;

    invoke-direct {v2, p0}, Landroidx/leanback/widget/PagingIndicator$d;-><init>(Landroidx/leanback/widget/PagingIndicator;)V

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Landroidx/leanback/widget/PagingIndicator;->b()V

    invoke-direct {p0, p1}, Landroidx/leanback/widget/PagingIndicator;->setSelectedPage(I)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The page count should be a positive integer"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method
