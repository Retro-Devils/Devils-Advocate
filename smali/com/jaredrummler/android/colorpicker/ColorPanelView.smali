.class public Lcom/jaredrummler/android/colorpicker/ColorPanelView;
.super Landroid/view/View;
.source ""


# instance fields
.field private b:Landroid/graphics/drawable/Drawable;

.field private c:Landroid/graphics/Paint;

.field private d:Landroid/graphics/Paint;

.field private e:Landroid/graphics/Paint;

.field private f:Landroid/graphics/Paint;

.field private g:Landroid/graphics/Rect;

.field private h:Landroid/graphics/Rect;

.field private i:Landroid/graphics/RectF;

.field private j:Z

.field private k:I

.field private l:I

.field private m:I

.field private n:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p3, Landroid/graphics/RectF;

    invoke-direct {p3}, Landroid/graphics/RectF;-><init>()V

    iput-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->i:Landroid/graphics/RectF;

    const p3, -0x919192

    iput p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    const/high16 p3, -0x1000000

    iput p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    invoke-direct {p0, p1, p2}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method private a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/jaredrummler/android/colorpicker/k;->m:[I

    invoke-virtual {v0, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    sget v0, Lcom/jaredrummler/android/colorpicker/k;->o:I

    const/4 v1, 0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->n:I

    sget v0, Lcom/jaredrummler/android/colorpicker/k;->p:I

    const/4 v2, 0x0

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->j:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->n:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Color preview is only available in circle mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    sget v0, Lcom/jaredrummler/android/colorpicker/k;->n:I

    const v3, -0x919192

    invoke-virtual {p2, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    iget p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    if-ne p2, v3, :cond_2

    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    iget p2, p2, Landroid/util/TypedValue;->data:I

    new-array v0, v1, [I

    const v3, 0x1010038

    aput v3, v0, v2

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p2

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    invoke-virtual {p2, v2, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    :cond_2
    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p1, p2}, Lcom/jaredrummler/android/colorpicker/e;->a(Landroid/content/Context;F)I

    move-result p2

    iput p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->c:Landroid/graphics/Paint;

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->d:Landroid/graphics/Paint;

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    iget-boolean p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->j:Z

    if-eqz p2, :cond_3

    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->f:Landroid/graphics/Paint;

    :cond_3
    iget p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->n:I

    if-ne p2, v1, :cond_4

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lcom/jaredrummler/android/colorpicker/g;->a:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->e:Landroid/graphics/Paint;

    invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    new-instance p2, Landroid/graphics/BitmapShader;

    sget-object v0, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    invoke-direct {p2, p1, v0, v0}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_4
    return-void
.end method

.method private b()V
    .locals 5

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->g:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    add-int/2addr v1, v2

    iget v3, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v2

    iget v4, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v4, v2

    iget v0, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v2

    new-instance v2, Landroid/graphics/RectF;

    int-to-float v1, v1

    int-to-float v3, v3

    int-to-float v0, v0

    int-to-float v4, v4

    invoke-direct {v2, v1, v3, v0, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->i:Landroid/graphics/RectF;

    return-void
.end method

.method private c()V
    .locals 5

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->g:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    add-int/2addr v1, v2

    iget v3, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v2

    iget v4, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v4, v2

    iget v0, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr v0, v2

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2, v1, v3, v0, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->h:Landroid/graphics/Rect;

    new-instance v0, Lcom/jaredrummler/android/colorpicker/a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x40800000    # 4.0f

    invoke-static {v1, v2}, Lcom/jaredrummler/android/colorpicker/e;->a(Landroid/content/Context;F)I

    move-result v1

    invoke-direct {v0, v1}, Lcom/jaredrummler/android/colorpicker/a;-><init>(I)V

    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->b:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->h:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->h:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->h:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    iget-object v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->h:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    int-to-float v4, v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 12

    const/4 v0, 0x2

    new-array v1, v0, [I

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    invoke-virtual {p0, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    const/4 v6, 0x1

    aget v7, v1, v6

    div-int/lit8 v8, v5, 0x2

    add-int/2addr v7, v8

    const/4 v8, 0x0

    aget v9, v1, v8

    div-int/2addr v4, v0

    add-int/2addr v9, v4

    invoke-static {p0}, Lb/g/k/s;->y(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    sub-int v9, v0, v9

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "#"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    move-result v4

    const/16 v10, 0xff

    if-eq v4, v10, :cond_1

    iget v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    new-array v4, v6, [Ljava/lang/Object;

    const v10, 0xffffff

    iget v11, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    and-int/2addr v10, v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v4, v8

    const-string v10, "%06X"

    invoke-static {v10, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    :goto_0
    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v4, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v3

    if-ge v7, v3, :cond_2

    const v3, 0x800035

    aget v1, v1, v6

    add-int/2addr v1, v5

    iget v2, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v2

    invoke-virtual {v0, v3, v9, v1}, Landroid/widget/Toast;->setGravity(III)V

    goto :goto_1

    :cond_2
    const/16 v1, 0x51

    invoke-virtual {v0, v1, v8, v5}, Landroid/widget/Toast;->setGravity(III)V

    :goto_1
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public getBorderColor()I
    .locals 1

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    return v0
.end method

.method public getColor()I
    .locals 1

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    return v0
.end method

.method public getShape()I
    .locals 1

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->n:I

    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->c:Landroid/graphics/Paint;

    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->d:Landroid/graphics/Paint;

    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->n:I

    if-nez v0, :cond_2

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->g:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_0
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->b:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->h:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    goto/16 :goto_0

    :cond_2
    const/4 v1, 0x1

    if-ne v0, v1, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    if-lez v1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    int-to-float v3, v0

    iget-object v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->c:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_3
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    invoke-static {v1}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    const/16 v2, 0xff

    if-ge v1, v2, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    sub-int v3, v0, v3

    int-to-float v3, v3

    iget-object v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_4
    iget-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->j:Z

    if-eqz v1, :cond_5

    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->i:Landroid/graphics/RectF;

    const/high16 v4, 0x42b40000    # 90.0f

    const/high16 v5, 0x43340000    # 180.0f

    const/4 v6, 0x1

    iget-object v7, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->f:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v9, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->i:Landroid/graphics/RectF;

    const/high16 v10, 0x43870000    # 270.0f

    const/high16 v11, 0x43340000    # 180.0f

    const/4 v12, 0x1

    iget-object v13, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->d:Landroid/graphics/Paint;

    move-object v8, p1

    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->k:I

    sub-int/2addr v0, v3

    int-to-float v0, v0

    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2, v0, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_6
    :goto_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->n:I

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    :goto_0
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-super {p0, p1, p1}, Landroid/view/View;->onMeasure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    goto :goto_0

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    :goto_1
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Landroid/os/Bundle;

    if-eqz v0, :cond_0

    check-cast p1, Landroid/os/Bundle;

    const-string v0, "color"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    const-string v0, "instanceState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    const-string v2, "instanceState"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    const-string v2, "color"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->n:I

    if-eqz p3, :cond_0

    iget-boolean p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->j:Z

    if-eqz p3, :cond_2

    :cond_0
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->g:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p4

    iput p4, p3, Landroid/graphics/Rect;->left:I

    iget-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->g:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p4

    sub-int/2addr p1, p4

    iput p1, p3, Landroid/graphics/Rect;->right:I

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->g:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    iput p3, p1, Landroid/graphics/Rect;->top:I

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->g:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p2, p3

    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    iget-boolean p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->j:Z

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->b()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->c()V

    :cond_2
    :goto_0
    return-void
.end method

.method public setBorderColor(I)V
    .locals 0

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->l:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setColor(I)V
    .locals 0

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->m:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setOriginalColor(I)V
    .locals 1

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->f:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setShape(I)V
    .locals 0

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->n:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method
