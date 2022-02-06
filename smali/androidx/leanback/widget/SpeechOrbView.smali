.class public Landroidx/leanback/widget/SpeechOrbView;
.super Landroidx/leanback/widget/SearchOrbView;
.source ""


# instance fields
.field private final t:F

.field private u:Landroidx/leanback/widget/SearchOrbView$c;

.field private v:Landroidx/leanback/widget/SearchOrbView$c;

.field private w:I

.field private x:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Landroidx/leanback/widget/SpeechOrbView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    invoke-direct {p0, p1, p2, p3}, Landroidx/leanback/widget/SearchOrbView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p2, 0x0

    iput p2, p0, Landroidx/leanback/widget/SpeechOrbView;->w:I

    iput-boolean p2, p0, Landroidx/leanback/widget/SpeechOrbView;->x:Z

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p3, Lb/l/e;->a:I

    const/4 v0, 0x1

    invoke-virtual {p1, p3, v0, v0}, Landroid/content/res/Resources;->getFraction(III)F

    move-result p3

    iput p3, p0, Landroidx/leanback/widget/SpeechOrbView;->t:F

    new-instance p3, Landroidx/leanback/widget/SearchOrbView$c;

    sget v0, Lb/l/b;->j:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    sget v1, Lb/l/b;->l:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    sget v2, Lb/l/b;->k:I

    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-direct {p3, v0, v1, v2}, Landroidx/leanback/widget/SearchOrbView$c;-><init>(III)V

    iput-object p3, p0, Landroidx/leanback/widget/SpeechOrbView;->v:Landroidx/leanback/widget/SearchOrbView$c;

    new-instance p3, Landroidx/leanback/widget/SearchOrbView$c;

    sget v0, Lb/l/b;->m:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-direct {p3, v1, p1, p2}, Landroidx/leanback/widget/SearchOrbView$c;-><init>(III)V

    iput-object p3, p0, Landroidx/leanback/widget/SpeechOrbView;->u:Landroidx/leanback/widget/SearchOrbView$c;

    invoke-virtual {p0}, Landroidx/leanback/widget/SpeechOrbView;->g()V

    return-void
.end method


# virtual methods
.method public f()V
    .locals 3

    iget-object v0, p0, Landroidx/leanback/widget/SpeechOrbView;->u:Landroidx/leanback/widget/SearchOrbView$c;

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/SearchOrbView;->setOrbColors(Landroidx/leanback/widget/SearchOrbView$c;)V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lb/l/d;->c:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/SearchOrbView;->setOrbIcon(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/SearchOrbView;->a(Z)V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroidx/leanback/widget/SearchOrbView;->b(Z)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {p0, v2}, Landroidx/leanback/widget/SearchOrbView;->c(F)V

    iput v1, p0, Landroidx/leanback/widget/SpeechOrbView;->w:I

    iput-boolean v0, p0, Landroidx/leanback/widget/SpeechOrbView;->x:Z

    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Landroidx/leanback/widget/SpeechOrbView;->v:Landroidx/leanback/widget/SearchOrbView$c;

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/SearchOrbView;->setOrbColors(Landroidx/leanback/widget/SearchOrbView$c;)V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lb/l/d;->d:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/SearchOrbView;->setOrbIcon(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->hasFocus()Z

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/SearchOrbView;->a(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/SearchOrbView;->c(F)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/leanback/widget/SpeechOrbView;->x:Z

    return-void
.end method

.method getLayoutResourceId()I
    .locals 1

    sget v0, Lb/l/h;->h:I

    return v0
.end method

.method public setListeningOrbColors(Landroidx/leanback/widget/SearchOrbView$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/leanback/widget/SpeechOrbView;->u:Landroidx/leanback/widget/SearchOrbView$c;

    return-void
.end method

.method public setNotListeningOrbColors(Landroidx/leanback/widget/SearchOrbView$c;)V
    .locals 0

    iput-object p1, p0, Landroidx/leanback/widget/SpeechOrbView;->v:Landroidx/leanback/widget/SearchOrbView$c;

    return-void
.end method

.method public setSoundLevel(I)V
    .locals 2

    iget-boolean v0, p0, Landroidx/leanback/widget/SpeechOrbView;->x:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/SpeechOrbView;->w:I

    if-le p1, v0, :cond_1

    sub-int/2addr p1, v0

    div-int/lit8 p1, p1, 0x2

    add-int/2addr v0, p1

    iput v0, p0, Landroidx/leanback/widget/SpeechOrbView;->w:I

    goto :goto_0

    :cond_1
    int-to-float p1, v0

    const v0, 0x3f333333

    mul-float p1, p1, v0

    float-to-int p1, p1

    iput p1, p0, Landroidx/leanback/widget/SpeechOrbView;->w:I

    :goto_0
    const/high16 p1, 0x3f800000    # 1.0f

    iget v0, p0, Landroidx/leanback/widget/SpeechOrbView;->t:F

    invoke-virtual {p0}, Landroidx/leanback/widget/SearchOrbView;->getFocusedZoom()F

    move-result v1

    sub-float/2addr v0, v1

    iget v1, p0, Landroidx/leanback/widget/SpeechOrbView;->w:I

    int-to-float v1, v1

    mul-float v0, v0, v1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    add-float/2addr v0, p1

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/SearchOrbView;->c(F)V

    return-void
.end method
