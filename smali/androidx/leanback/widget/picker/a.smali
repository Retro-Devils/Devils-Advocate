.class public Landroidx/leanback/widget/picker/a;
.super Landroid/widget/FrameLayout;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/leanback/widget/picker/a$b;,
        Landroidx/leanback/widget/picker/a$d;,
        Landroidx/leanback/widget/picker/a$c;
    }
.end annotation


# instance fields
.field private b:Landroid/view/ViewGroup;

.field private c:Landroid/view/ViewGroup;

.field final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/leanback/widget/VerticalGridView;",
            ">;"
        }
    .end annotation
.end field

.field e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/leanback/widget/picker/b;",
            ">;"
        }
    .end annotation
.end field

.field private f:F

.field private g:F

.field private h:F

.field private i:F

.field private j:I

.field private k:Landroid/view/animation/Interpolator;

.field private l:Landroid/view/animation/Interpolator;

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/leanback/widget/picker/a$c;",
            ">;"
        }
    .end annotation
.end field

.field private n:F

.field private o:F

.field private p:I

.field private q:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation
.end field

.field private r:I

.field private s:I

.field private final t:Landroidx/leanback/widget/o;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    const/high16 p1, 0x40400000    # 3.0f

    iput p1, p0, Landroidx/leanback/widget/picker/a;->n:F

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Landroidx/leanback/widget/picker/a;->o:F

    const/4 p2, 0x0

    iput p2, p0, Landroidx/leanback/widget/picker/a;->p:I

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    sget p3, Lb/l/h;->c:I

    iput p3, p0, Landroidx/leanback/widget/picker/a;->r:I

    iput p2, p0, Landroidx/leanback/widget/picker/a;->s:I

    new-instance p2, Landroidx/leanback/widget/picker/a$a;

    invoke-direct {p2, p0}, Landroidx/leanback/widget/picker/a$a;-><init>(Landroidx/leanback/widget/picker/a;)V

    iput-object p2, p0, Landroidx/leanback/widget/picker/a;->t:Landroidx/leanback/widget/o;

    const/4 p2, 0x1

    invoke-virtual {p0, p2}, Landroid/widget/FrameLayout;->setEnabled(Z)V

    const/high16 p3, 0x40000

    invoke-virtual {p0, p3}, Landroid/widget/FrameLayout;->setDescendantFocusability(I)V

    iput p1, p0, Landroidx/leanback/widget/picker/a;->g:F

    iput p1, p0, Landroidx/leanback/widget/picker/a;->f:F

    const/high16 p1, 0x3f000000    # 0.5f

    iput p1, p0, Landroidx/leanback/widget/picker/a;->h:F

    const/4 p1, 0x0

    iput p1, p0, Landroidx/leanback/widget/picker/a;->i:F

    const/16 p1, 0xc8

    iput p1, p0, Landroidx/leanback/widget/picker/a;->j:I

    new-instance p1, Landroid/view/animation/DecelerateInterpolator;

    const/high16 p3, 0x40200000    # 2.5f

    invoke-direct {p1, p3}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    iput-object p1, p0, Landroidx/leanback/widget/picker/a;->k:Landroid/view/animation/Interpolator;

    new-instance p1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {p1, p3}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    iput-object p1, p0, Landroidx/leanback/widget/picker/a;->l:Landroid/view/animation/Interpolator;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p3, Lb/l/h;->a:I

    invoke-virtual {p1, p3, p0, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Landroidx/leanback/widget/picker/a;->b:Landroid/view/ViewGroup;

    sget p2, Lb/l/f;->p:I

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Landroidx/leanback/widget/picker/a;->c:Landroid/view/ViewGroup;

    return-void
.end method

.method private b(I)V
    .locals 2

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->m:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    iget-object v1, p0, Landroidx/leanback/widget/picker/a;->m:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/leanback/widget/picker/a$c;

    invoke-interface {v1, p0, p1}, Landroidx/leanback/widget/picker/a$c;->a(Landroidx/leanback/widget/picker/a;I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private f(Landroid/view/View;ZFFLandroid/view/animation/Interpolator;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    if-nez p2, :cond_0

    invoke-virtual {p1, p3}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    cmpl-float p2, p4, p2

    if-ltz p2, :cond_1

    invoke-virtual {p1, p4}, Landroid/view/View;->setAlpha(F)V

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    iget p2, p0, Landroidx/leanback/widget/picker/a;->j:I

    int-to-long p2, p2

    invoke-virtual {p1, p2, p3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1, p5}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    :goto_0
    return-void
.end method

.method private i()V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroidx/leanback/widget/picker/a;->getColumnsCount()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/leanback/widget/VerticalGridView;

    invoke-direct {p0, v1}, Landroidx/leanback/widget/picker/a;->j(Landroidx/leanback/widget/VerticalGridView;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private j(Landroidx/leanback/widget/VerticalGridView;)V
    .locals 5

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->isActivated()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroidx/leanback/widget/picker/a;->getActivatedVisibleItemCount()F

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/leanback/widget/picker/a;->getVisibleItemCount()F

    move-result v1

    :goto_0
    invoke-virtual {p0}, Landroidx/leanback/widget/picker/a;->getPickerItemHeightPixels()I

    move-result v2

    int-to-float v2, v2

    mul-float v2, v2, v1

    invoke-virtual {p1}, Landroidx/leanback/widget/a;->getVerticalSpacing()I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x3f800000    # 1.0f

    sub-float/2addr v1, v4

    mul-float v3, v3, v1

    add-float/2addr v2, v3

    float-to-int v1, v2

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private k()V
    .locals 6

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->isActivated()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Landroidx/leanback/widget/picker/a;->getColumnsCount()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/leanback/widget/VerticalGridView;

    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    if-ge v4, v5, :cond_0

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v0}, Landroid/view/View;->setFocusable(Z)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public a(I)Landroidx/leanback/widget/picker/b;
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->e:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/leanback/widget/picker/b;

    return-object p1
.end method

.method public c(II)V
    .locals 2

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/picker/b;

    invoke-virtual {v0}, Landroidx/leanback/widget/picker/b;->b()I

    move-result v1

    if-eq v1, p2, :cond_0

    invoke-virtual {v0, p2}, Landroidx/leanback/widget/picker/b;->f(I)V

    invoke-direct {p0, p1}, Landroidx/leanback/widget/picker/a;->b(I)V

    :cond_0
    return-void
.end method

.method public d(ILandroidx/leanback/widget/picker/b;)V
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/leanback/widget/VerticalGridView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/picker/a$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$g;->h()V

    :cond_0
    invoke-virtual {p2}, Landroidx/leanback/widget/picker/b;->b()I

    move-result v0

    invoke-virtual {p2}, Landroidx/leanback/widget/picker/b;->e()I

    move-result p2

    sub-int/2addr v0, p2

    invoke-virtual {p1, v0}, Landroidx/leanback/widget/a;->setSelectedPosition(I)V

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->isActivated()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x17

    if-eq v0, v1, :cond_0

    const/16 v1, 0x42

    if-eq v0, v1, :cond_0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->performClick()Z

    :cond_1
    return v0

    :cond_2
    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public e(IIZ)V
    .locals 2

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/picker/b;

    invoke-virtual {v0}, Landroidx/leanback/widget/picker/b;->b()I

    move-result v1

    if-eq v1, p2, :cond_1

    invoke-virtual {v0, p2}, Landroidx/leanback/widget/picker/b;->f(I)V

    invoke-direct {p0, p1}, Landroidx/leanback/widget/picker/a;->b(I)V

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/VerticalGridView;

    if-eqz v0, :cond_1

    iget-object v1, p0, Landroidx/leanback/widget/picker/a;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/leanback/widget/picker/b;

    invoke-virtual {p1}, Landroidx/leanback/widget/picker/b;->e()I

    move-result p1

    sub-int/2addr p2, p1

    if-eqz p3, :cond_0

    invoke-virtual {v0, p2}, Landroidx/leanback/widget/a;->setSelectedPositionSmooth(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2}, Landroidx/leanback/widget/a;->setSelectedPosition(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method g(Landroid/view/View;ZIZ)V
    .locals 6

    iget v0, p0, Landroidx/leanback/widget/picker/a;->p:I

    if-eq p3, v0, :cond_1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz p2, :cond_3

    if-eqz v0, :cond_2

    iget v3, p0, Landroidx/leanback/widget/picker/a;->g:F

    goto :goto_2

    :cond_2
    iget v3, p0, Landroidx/leanback/widget/picker/a;->f:F

    goto :goto_2

    :cond_3
    if-eqz v0, :cond_4

    iget v3, p0, Landroidx/leanback/widget/picker/a;->h:F

    goto :goto_2

    :cond_4
    iget v3, p0, Landroidx/leanback/widget/picker/a;->i:F

    :goto_2
    const/high16 v4, -0x40800000    # -1.0f

    iget-object v5, p0, Landroidx/leanback/widget/picker/a;->k:Landroid/view/animation/Interpolator;

    move-object v0, p0

    move-object v1, p1

    move v2, p4

    invoke-direct/range {v0 .. v5}, Landroidx/leanback/widget/picker/a;->f(Landroid/view/View;ZFFLandroid/view/animation/Interpolator;)V

    return-void
.end method

.method public getActivatedVisibleItemCount()F
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/picker/a;->n:F

    return v0
.end method

.method public getColumnsCount()I
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->e:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method protected getPickerItemHeightPixels()I
    .locals 2

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lb/l/c;->r:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method

.method public final getPickerItemLayoutId()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/picker/a;->r:I

    return v0
.end method

.method public final getPickerItemTextViewId()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/picker/a;->s:I

    return v0
.end method

.method public getSelectedColumn()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/picker/a;->p:I

    return v0
.end method

.method public final getSeparator()Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method public final getSeparators()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/CharSequence;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    return-object v0
.end method

.method public getVisibleItemCount()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method h(IZ)V
    .locals 6

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/VerticalGridView;

    invoke-virtual {v0}, Landroidx/leanback/widget/a;->getSelectedPosition()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$g;->c()I

    move-result v4

    if-ge v3, v4, :cond_2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_1

    if-ne v1, v3, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {p0, v4, v5, p1, p2}, Landroidx/leanback/widget/picker/a;->g(Landroid/view/View;ZIZ)V

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method protected onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/leanback/widget/picker/a;->getSelectedColumn()I

    move-result v0

    iget-object v1, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/VerticalGridView;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p2

    if-ge p1, p2, :cond_1

    iget-object p2, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/leanback/widget/VerticalGridView;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->hasFocus()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/picker/a;->setSelectedColumn(I)V

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setActivated(Z)V
    .locals 4

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->isActivated()Z

    move-result v0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->setActivated(Z)V

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->hasFocus()Z

    move-result v0

    invoke-virtual {p0}, Landroidx/leanback/widget/picker/a;->getSelectedColumn()I

    move-result v1

    const/high16 v2, 0x20000

    invoke-virtual {p0, v2}, Landroid/widget/FrameLayout;->setDescendantFocusability(I)V

    if-nez p1, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->isFocusable()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->requestFocus()Z

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p0}, Landroidx/leanback/widget/picker/a;->getColumnsCount()I

    move-result v3

    if-ge v2, v3, :cond_2

    iget-object v3, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/leanback/widget/VerticalGridView;

    invoke-virtual {v3, p1}, Landroid/view/ViewGroup;->setFocusable(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Landroidx/leanback/widget/picker/a;->i()V

    invoke-direct {p0}, Landroidx/leanback/widget/picker/a;->k()V

    if-eqz p1, :cond_3

    if-eqz v0, :cond_3

    if-ltz v1, :cond_3

    iget-object p1, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/leanback/widget/VerticalGridView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->requestFocus()Z

    :cond_3
    const/high16 p1, 0x40000

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setDescendantFocusability(I)V

    return-void
.end method

.method public setActivatedVisibleItemCount(F)V
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-lez v0, :cond_1

    iget v0, p0, Landroidx/leanback/widget/picker/a;->n:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Landroidx/leanback/widget/picker/a;->n:F

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->isActivated()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Landroidx/leanback/widget/picker/a;->i()V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public setColumns(Ljava/util/List;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/leanback/widget/picker/b;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    iget-object v3, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->clear()V

    iget-object v3, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    const-string v4, ""

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v1

    if-ge v3, v5, :cond_0

    iget-object v5, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v3, v1

    if-ne v0, v3, :cond_6

    :goto_1
    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Landroidx/leanback/widget/picker/a;->e:Ljava/util/ArrayList;

    iget p1, p0, Landroidx/leanback/widget/picker/a;->p:I

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v1

    if-le p1, v0, :cond_2

    iget-object p1, p0, Landroidx/leanback/widget/picker/a;->e:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    sub-int/2addr p1, v1

    iput p1, p0, Landroidx/leanback/widget/picker/a;->p:I

    :cond_2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/leanback/widget/picker/a;->getColumnsCount()I

    move-result v0

    iget-object v1, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    sget v1, Lb/l/h;->d:I

    iget-object v3, p0, Landroidx/leanback/widget/picker/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1, v3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v3, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, Landroidx/leanback/widget/picker/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_3
    const/4 v9, 0x0

    :goto_2
    if-ge v9, v0, :cond_5

    sget v1, Lb/l/h;->b:I

    iget-object v3, p0, Landroidx/leanback/widget/picker/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {p1, v1, v3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/leanback/widget/VerticalGridView;

    invoke-direct {p0, v1}, Landroidx/leanback/widget/picker/a;->j(Landroidx/leanback/widget/VerticalGridView;)V

    invoke-virtual {v1, v2}, Landroidx/leanback/widget/a;->setWindowAlignment(I)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->isActivated()Z

    move-result v3

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->setFocusable(Z)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V

    iget-object v3, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Landroidx/leanback/widget/picker/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v3, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    add-int/lit8 v10, v9, 0x1

    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    sget v3, Lb/l/h;->d:I

    iget-object v4, p0, Landroidx/leanback/widget/picker/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {p1, v3, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iget-object v4, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v4, p0, Landroidx/leanback/widget/picker/a;->c:Landroid/view/ViewGroup;

    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_4
    new-instance v3, Landroidx/leanback/widget/picker/a$b;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {p0}, Landroidx/leanback/widget/picker/a;->getPickerItemLayoutId()I

    move-result v7

    invoke-virtual {p0}, Landroidx/leanback/widget/picker/a;->getPickerItemTextViewId()I

    move-result v8

    move-object v4, v3

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Landroidx/leanback/widget/picker/a$b;-><init>(Landroidx/leanback/widget/picker/a;Landroid/content/Context;III)V

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    iget-object v3, p0, Landroidx/leanback/widget/picker/a;->t:Landroidx/leanback/widget/o;

    invoke-virtual {v1, v3}, Landroidx/leanback/widget/a;->setOnChildViewHolderSelectedListener(Landroidx/leanback/widget/o;)V

    move v9, v10

    goto :goto_2

    :cond_5
    return-void

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Separators size: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " must"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "equal the size of columns: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " + 1"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Separators size is: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ". At least one separator must be provided"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method

.method public final setPickerItemTextViewId(I)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/picker/a;->s:I

    return-void
.end method

.method public setSelectedColumn(I)V
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/picker/a;->p:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Landroidx/leanback/widget/picker/a;->p:I

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/leanback/widget/picker/a;->h(IZ)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final setSeparator(Ljava/lang/CharSequence;)V
    .locals 2

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/CharSequence;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/picker/a;->setSeparators(Ljava/util/List;)V

    return-void
.end method

.method public final setSeparators(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/CharSequence;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Landroidx/leanback/widget/picker/a;->q:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public setVisibleItemCount(F)V
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-lez v0, :cond_1

    iget v0, p0, Landroidx/leanback/widget/picker/a;->o:F

    cmpl-float v0, v0, p1

    if-eqz v0, :cond_0

    iput p1, p0, Landroidx/leanback/widget/picker/a;->o:F

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->isActivated()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0}, Landroidx/leanback/widget/picker/a;->i()V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
