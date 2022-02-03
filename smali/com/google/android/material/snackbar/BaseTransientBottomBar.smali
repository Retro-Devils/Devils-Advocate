.class public abstract Lcom/google/android/material/snackbar/BaseTransientBottomBar;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$s;,
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;,
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;,
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$t;,
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$u;,
        Lcom/google/android/material/snackbar/BaseTransientBottomBar$r;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<B:",
        "Lcom/google/android/material/snackbar/BaseTransientBottomBar<",
        "TB;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field static final a:Landroid/os/Handler;

.field private static final b:Z

.field private static final c:[I

.field private static final d:Ljava/lang/String;


# instance fields
.field private final e:Landroid/view/ViewGroup;

.field private final f:Landroid/content/Context;

.field protected final g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

.field private final h:Lcom/google/android/material/snackbar/a;

.field private i:I

.field private j:Z

.field private k:Landroid/view/View;

.field private final l:Ljava/lang/Runnable;

.field private m:Landroid/graphics/Rect;

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private r:I

.field private s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/material/snackbar/BaseTransientBottomBar$r<",
            "TB;>;>;"
        }
    .end annotation
.end field

.field private t:Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;

.field private final u:Landroid/view/accessibility/AccessibilityManager;

.field v:Lcom/google/android/material/snackbar/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/16 v3, 0x10

    if-lt v0, v3, :cond_0

    const/16 v3, 0x13

    if-gt v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b:Z

    new-array v0, v1, [I

    sget v1, Lc/b/a/b/b;->v:I

    aput v1, v0, v2

    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->c:[I

    const-class v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->d:Ljava/lang/String;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Lcom/google/android/material/snackbar/BaseTransientBottomBar$i;

    invoke-direct {v2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$i;-><init>()V

    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    sput-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->a:Landroid/os/Handler;

    return-void
.end method

.method protected constructor <init>(Landroid/view/ViewGroup;Landroid/view/View;Lcom/google/android/material/snackbar/a;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$j;

    invoke-direct {v0, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$j;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    iput-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->l:Ljava/lang/Runnable;

    new-instance v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$m;

    invoke-direct {v0, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$m;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    iput-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->v:Lcom/google/android/material/snackbar/b$b;

    if-eqz p1, :cond_4

    if-eqz p2, :cond_3

    if-eqz p3, :cond_2

    iput-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->e:Landroid/view/ViewGroup;

    iput-object p3, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->h:Lcom/google/android/material/snackbar/a;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p3

    iput-object p3, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->f:Landroid/content/Context;

    invoke-static {p3}, Lcom/google/android/material/internal/o;->a(Landroid/content/Context;)V

    invoke-static {p3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->A()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    iput-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    instance-of v0, p2, Lcom/google/android/material/snackbar/SnackbarContentLayout;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/google/android/material/snackbar/SnackbarContentLayout;

    invoke-virtual {p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;->getActionTextColorAlpha()F

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/SnackbarContentLayout;->c(F)V

    :cond_0
    invoke-virtual {p1, p2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    instance-of v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    new-instance v0, Landroid/graphics/Rect;

    iget v1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v3, p2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-direct {v0, v1, v2, v3, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->m:Landroid/graphics/Rect;

    :cond_1
    const/4 p2, 0x1

    invoke-static {p1, p2}, Lb/g/k/s;->k0(Landroid/view/View;I)V

    invoke-static {p1, p2}, Lb/g/k/s;->s0(Landroid/view/View;I)V

    invoke-static {p1, p2}, Lb/g/k/s;->q0(Landroid/view/View;Z)V

    new-instance p2, Lcom/google/android/material/snackbar/BaseTransientBottomBar$k;

    invoke-direct {p2, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$k;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    invoke-static {p1, p2}, Lb/g/k/s;->u0(Landroid/view/View;Lb/g/k/p;)V

    new-instance p2, Lcom/google/android/material/snackbar/BaseTransientBottomBar$l;

    invoke-direct {p2, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$l;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    invoke-static {p1, p2}, Lb/g/k/s;->i0(Landroid/view/View;Lb/g/k/a;)V

    const-string p1, "accessibility"

    invoke-virtual {p3, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/accessibility/AccessibilityManager;

    iput-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->u:Landroid/view/accessibility/AccessibilityManager;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Transient bottom bar must have non-null callback"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Transient bottom bar must have non-null content"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Transient bottom bar must have non-null parent"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private B()I
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    :cond_0
    return v0
.end method

.method private C()I
    .locals 2

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->getLocationOnScreen([I)V

    const/4 v1, 0x1

    aget v0, v0, v1

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method private G()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;->f()Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;

    move-result-object v0

    instance-of v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private K(Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->t:Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->x()Lcom/google/android/material/behavior/SwipeDismissBehavior;

    move-result-object v0

    :cond_0
    instance-of v1, v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;

    invoke-static {v1, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;->O(Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    :cond_1
    new-instance v1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$p;

    invoke-direct {v1, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$p;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/behavior/SwipeDismissBehavior;->K(Lcom/google/android/material/behavior/SwipeDismissBehavior$c;)V

    invoke-virtual {p1, v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;->o(Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;)V

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->k:Landroid/view/View;

    if-nez v0, :cond_2

    const/16 v0, 0x50

    iput v0, p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;->g:I

    :cond_2
    return-void
.end method

.method private M()Z
    .locals 1

    iget v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->q:I

    if-lez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->j:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private P()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->p()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->I()V

    :goto_0
    return-void
.end method

.method private Q()V
    .locals 5

    const/4 v0, 0x2

    new-array v1, v0, [F

    fill-array-data v1, :array_0

    invoke-direct {p0, v1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->u([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    new-array v2, v0, [F

    fill-array-data v2, :array_1

    invoke-direct {p0, v2}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->y([F)Landroid/animation/ValueAnimator;

    move-result-object v2

    new-instance v3, Landroid/animation/AnimatorSet;

    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    new-array v0, v0, [Landroid/animation/Animator;

    const/4 v4, 0x0

    aput-object v1, v0, v4

    const/4 v1, 0x1

    aput-object v2, v0, v1

    invoke-virtual {v3, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    const-wide/16 v0, 0x96

    invoke-virtual {v3, v0, v1}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    new-instance v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$a;

    invoke-direct {v0, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$a;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    invoke-virtual {v3, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v3}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f4ccccd
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private R(I)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-direct {p0, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->u([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v1, 0x4b

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;

    invoke-direct {v1, p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$b;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;I)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    nop

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method private S()V
    .locals 5

    invoke-direct {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->B()I

    move-result v0

    sget-boolean v1, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-static {v1, v0}, Lb/g/k/s;->U(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    int-to-float v2, v0

    invoke-virtual {v1, v2}, Landroid/widget/FrameLayout;->setTranslationY(F)V

    :goto_0
    new-instance v1, Landroid/animation/ValueAnimator;

    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x0

    aput v0, v2, v3

    const/4 v4, 0x1

    aput v3, v2, v4

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    sget-object v2, Lc/b/a/b/l/a;->b:Landroid/animation/TimeInterpolator;

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v2, 0xfa

    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v2, Lcom/google/android/material/snackbar/BaseTransientBottomBar$e;

    invoke-direct {v2, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$e;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance v2, Lcom/google/android/material/snackbar/BaseTransientBottomBar$f;

    invoke-direct {v2, p0, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$f;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;I)V

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private T(I)V
    .locals 4

    new-instance v0, Landroid/animation/ValueAnimator;

    invoke-direct {v0}, Landroid/animation/ValueAnimator;-><init>()V

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x0

    aput v2, v1, v2

    invoke-direct {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->B()I

    move-result v2

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setIntValues([I)V

    sget-object v1, Lc/b/a/b/l/a;->b:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$g;

    invoke-direct {v1, p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$g;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;I)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    new-instance p1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$h;

    invoke-direct {p1, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$h;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method

.method private U()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->m:Landroid/graphics/Rect;

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->k:Landroid/view/View;

    if-eqz v2, :cond_1

    iget v2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->r:I

    goto :goto_0

    :cond_1
    iget v2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->n:I

    :goto_0
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v2

    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->o:I

    add-int/2addr v2, v3

    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, v1, Landroid/graphics/Rect;->right:I

    iget v2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->p:I

    add-int/2addr v1, v2

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->requestLayout()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_2

    invoke-direct {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->M()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->l:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->l:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->post(Ljava/lang/Runnable;)Z

    :cond_2
    return-void

    :cond_3
    :goto_1
    sget-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->d:Ljava/lang/String;

    const-string v1, "Unable to update margins because layout params are not MarginLayoutParams"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method static synthetic a(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->f:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic b(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)I
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->z()I

    move-result p0

    return p0
.end method

.method static synthetic c(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->Q()V

    return-void
.end method

.method static synthetic d(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->S()V

    return-void
.end method

.method static synthetic e(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)Lcom/google/android/material/snackbar/a;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->h:Lcom/google/android/material/snackbar/a;

    return-object p0
.end method

.method static synthetic f()Z
    .locals 1

    sget-boolean v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->b:Z

    return v0
.end method

.method static synthetic g(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)I
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->C()I

    move-result p0

    return p0
.end method

.method static synthetic h(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)I
    .locals 0

    iget p0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->q:I

    return p0
.end method

.method static synthetic i(Lcom/google/android/material/snackbar/BaseTransientBottomBar;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->q:I

    return p1
.end method

.method static synthetic j()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic k(Lcom/google/android/material/snackbar/BaseTransientBottomBar;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->n:I

    return p1
.end method

.method static synthetic l(Lcom/google/android/material/snackbar/BaseTransientBottomBar;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->o:I

    return p1
.end method

.method static synthetic m(Lcom/google/android/material/snackbar/BaseTransientBottomBar;I)I
    .locals 0

    iput p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->p:I

    return p1
.end method

.method static synthetic n(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->U()V

    return-void
.end method

.method static synthetic o(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->P()V

    return-void
.end method

.method private q(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-virtual {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;->getAnimationMode()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->R(I)V

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->T(I)V

    :goto_0
    return-void
.end method

.method private r()I
    .locals 4

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->k:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v1, 0x2

    new-array v2, v1, [I

    invoke-virtual {v0, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v0, 0x1

    aget v2, v2, v0

    new-array v1, v1, [I

    iget-object v3, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->e:Landroid/view/ViewGroup;

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    aget v0, v1, v0

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->e:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v1

    add-int/2addr v0, v1

    sub-int/2addr v0, v2

    return v0
.end method

.method private varargs u([F)Landroid/animation/ValueAnimator;
    .locals 1

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    sget-object v0, Lc/b/a/b/l/a;->a:Landroid/animation/TimeInterpolator;

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$c;

    invoke-direct {v0, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$c;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-object p1
.end method

.method private varargs y([F)Landroid/animation/ValueAnimator;
    .locals 1

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    sget-object v0, Lc/b/a/b/l/a;->d:Landroid/animation/TimeInterpolator;

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$d;

    invoke-direct {v0, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$d;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    invoke-virtual {p1, v0}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-object p1
.end method

.method private z()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->f:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    iget v0, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    return v0
.end method


# virtual methods
.method protected A()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->D()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lc/b/a/b/h;->q:I

    goto :goto_0

    :cond_0
    sget v0, Lc/b/a/b/h;->a:I

    :goto_0
    return v0
.end method

.method protected D()Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->f:Landroid/content/Context;

    sget-object v1, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->c:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    if-eq v3, v2, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method final E(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->L()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->q(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->H(I)V

    :goto_0
    return-void
.end method

.method public F()Z
    .locals 2

    invoke-static {}, Lcom/google/android/material/snackbar/b;->c()Lcom/google/android/material/snackbar/b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->v:Lcom/google/android/material/snackbar/b$b;

    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/b;->e(Lcom/google/android/material/snackbar/b$b;)Z

    move-result v0

    return v0
.end method

.method H(I)V
    .locals 2

    invoke-static {}, Lcom/google/android/material/snackbar/b;->c()Lcom/google/android/material/snackbar/b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->v:Lcom/google/android/material/snackbar/b$b;

    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/b;->h(Lcom/google/android/material/snackbar/b$b;)V

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->s:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->s:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$r;

    invoke-virtual {v1, p0, p1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$r;->a(Ljava/lang/Object;I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method I()V
    .locals 2

    invoke-static {}, Lcom/google/android/material/snackbar/b;->c()Lcom/google/android/material/snackbar/b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->v:Lcom/google/android/material/snackbar/b$b;

    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/b;->i(Lcom/google/android/material/snackbar/b$b;)V

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->s:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->s:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$r;

    invoke-virtual {v1, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$r;->b(Ljava/lang/Object;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public J(I)Lcom/google/android/material/snackbar/BaseTransientBottomBar;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TB;"
        }
    .end annotation

    iput p1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i:I

    return-object p0
.end method

.method L()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->u:Landroid/view/accessibility/AccessibilityManager;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->getEnabledAccessibilityServiceList(I)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public N()V
    .locals 3

    invoke-static {}, Lcom/google/android/material/snackbar/b;->c()Lcom/google/android/material/snackbar/b;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->w()I

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->v:Lcom/google/android/material/snackbar/b$b;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/snackbar/b;->m(ILcom/google/android/material/snackbar/b$b;)V

    return-void
.end method

.method final O()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    new-instance v1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$n;

    invoke-direct {v1, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$n;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;->setOnAttachStateChangeListener(Lcom/google/android/material/snackbar/BaseTransientBottomBar$t;)V

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    invoke-direct {p0, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->K(Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;)V

    :cond_0
    invoke-direct {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->r()I

    move-result v0

    iput v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->r:I

    invoke-direct {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->U()V

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->e:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_1
    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    invoke-static {v0}, Lb/g/k/s;->O(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->P()V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    new-instance v1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$o;

    invoke-direct {v1, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$o;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    invoke-virtual {v0, v1}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;->setOnLayoutChangeListener(Lcom/google/android/material/snackbar/BaseTransientBottomBar$u;)V

    return-void
.end method

.method p()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->g:Lcom/google/android/material/snackbar/BaseTransientBottomBar$v;

    new-instance v1, Lcom/google/android/material/snackbar/BaseTransientBottomBar$q;

    invoke-direct {v1, p0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$q;-><init>(Lcom/google/android/material/snackbar/BaseTransientBottomBar;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public s()V
    .locals 1

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->t(I)V

    return-void
.end method

.method protected t(I)V
    .locals 2

    invoke-static {}, Lcom/google/android/material/snackbar/b;->c()Lcom/google/android/material/snackbar/b;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->v:Lcom/google/android/material/snackbar/b$b;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/material/snackbar/b;->b(Lcom/google/android/material/snackbar/b$b;I)V

    return-void
.end method

.method public v()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->f:Landroid/content/Context;

    return-object v0
.end method

.method public w()I
    .locals 1

    iget v0, p0, Lcom/google/android/material/snackbar/BaseTransientBottomBar;->i:I

    return v0
.end method

.method protected x()Lcom/google/android/material/behavior/SwipeDismissBehavior;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/material/behavior/SwipeDismissBehavior<",
            "+",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;

    invoke-direct {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;-><init>()V

    return-object v0
.end method
