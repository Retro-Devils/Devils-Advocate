.class final Lcom/jaredrummler/android/colorpicker/b$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jaredrummler/android/colorpicker/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field a:Landroid/view/View;

.field b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

.field c:Landroid/widget/ImageView;

.field d:I

.field final synthetic e:Lcom/jaredrummler/android/colorpicker/b;


# direct methods
.method constructor <init>(Lcom/jaredrummler/android/colorpicker/b;Landroid/content/Context;)V
    .locals 1

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b;->e:Lcom/jaredrummler/android/colorpicker/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget p1, p1, Lcom/jaredrummler/android/colorpicker/b;->e:I

    if-nez p1, :cond_0

    sget p1, Lcom/jaredrummler/android/colorpicker/i;->b:I

    goto :goto_0

    :cond_0
    sget p1, Lcom/jaredrummler/android/colorpicker/i;->a:I

    :goto_0
    const/4 v0, 0x0

    invoke-static {p2, p1, v0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b;->a:Landroid/view/View;

    sget p2, Lcom/jaredrummler/android/colorpicker/h;->e:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b;->a:Landroid/view/View;

    sget p2, Lcom/jaredrummler/android/colorpicker/h;->b:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b;->c:Landroid/widget/ImageView;

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    invoke-virtual {p1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getBorderColor()I

    move-result p1

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/b$b;->d:I

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b;->a:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-void
.end method

.method private a(I)V
    .locals 4

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/b$b;->e:Lcom/jaredrummler/android/colorpicker/b;

    iget v1, v0, Lcom/jaredrummler/android/colorpicker/b;->d:I

    if-ne p1, v1, :cond_0

    iget-object v0, v0, Lcom/jaredrummler/android/colorpicker/b;->c:[I

    aget p1, v0, p1

    invoke-static {p1}, Lb/g/d/a;->b(I)D

    move-result-wide v0

    const-wide v2, 0x3fe4cccccccccccdL    # 0.65

    cmpl-double p1, v0, v2

    if-ltz p1, :cond_0

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b;->c:Landroid/widget/ImageView;

    const/high16 v0, -0x1000000

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, v0, v1}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b;->c:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :goto_0
    return-void
.end method

.method private b(I)V
    .locals 2

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/b$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    new-instance v1, Lcom/jaredrummler/android/colorpicker/b$b$a;

    invoke-direct {v1, p0, p1}, Lcom/jaredrummler/android/colorpicker/b$b$a;-><init>(Lcom/jaredrummler/android/colorpicker/b$b;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/b$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    new-instance v0, Lcom/jaredrummler/android/colorpicker/b$b$b;

    invoke-direct {v0, p0}, Lcom/jaredrummler/android/colorpicker/b$b$b;-><init>(Lcom/jaredrummler/android/colorpicker/b$b;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method


# virtual methods
.method c(I)V
    .locals 4

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/b$b;->e:Lcom/jaredrummler/android/colorpicker/b;

    iget-object v0, v0, Lcom/jaredrummler/android/colorpicker/b;->c:[I

    aget v0, v0, p1

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/b$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    invoke-virtual {v2, v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/b$b;->c:Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/b$b;->e:Lcom/jaredrummler/android/colorpicker/b;

    iget v3, v3, Lcom/jaredrummler/android/colorpicker/b;->d:I

    if-ne v3, p1, :cond_0

    sget v3, Lcom/jaredrummler/android/colorpicker/g;->b:I

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    const/16 v2, 0xff

    if-eq v1, v2, :cond_2

    const/16 v2, 0xa5

    if-gt v1, v2, :cond_1

    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/b$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    const/high16 v2, -0x1000000

    or-int/2addr v0, v2

    invoke-virtual {v1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setBorderColor(I)V

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/b$b;->c:Landroid/widget/ImageView;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v2, v1}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/b$b;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    iget v1, p0, Lcom/jaredrummler/android/colorpicker/b$b;->d:I

    invoke-virtual {v0, v1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setBorderColor(I)V

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/b$b;->c:Landroid/widget/ImageView;

    const/4 v1, -0x1

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    goto :goto_1

    :cond_2
    invoke-direct {p0, p1}, Lcom/jaredrummler/android/colorpicker/b$b;->a(I)V

    :goto_1
    invoke-direct {p0, p1}, Lcom/jaredrummler/android/colorpicker/b$b;->b(I)V

    return-void
.end method
