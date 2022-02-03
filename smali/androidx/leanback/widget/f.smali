.class final Landroidx/leanback/widget/f;
.super Landroidx/recyclerview/widget/RecyclerView$o;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/leanback/widget/f$h;,
        Landroidx/leanback/widget/f$f;,
        Landroidx/leanback/widget/f$g;,
        Landroidx/leanback/widget/f$d;,
        Landroidx/leanback/widget/f$e;
    }
.end annotation


# static fields
.field private static final s:Landroid/graphics/Rect;

.field static t:[I


# instance fields
.field A:I

.field final B:Landroid/util/SparseIntArray;

.field C:[I

.field D:Landroidx/recyclerview/widget/RecyclerView$v;

.field E:I

.field private F:Landroidx/leanback/widget/n;

.field private G:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/leanback/widget/o;",
            ">;"
        }
    .end annotation
.end field

.field H:Landroidx/leanback/widget/m;

.field I:I

.field J:I

.field K:Landroidx/leanback/widget/f$d;

.field L:Landroidx/leanback/widget/f$g;

.field private M:I

.field private N:I

.field O:I

.field P:I

.field private Q:I

.field private R:I

.field private S:[I

.field private T:I

.field private U:I

.field private V:I

.field private W:I

.field private X:I

.field private Y:I

.field Z:I

.field private a0:I

.field b0:Landroidx/leanback/widget/e;

.field private c0:I

.field final d0:Landroidx/leanback/widget/a0;

.field private final e0:Landroidx/leanback/widget/i;

.field private f0:I

.field private g0:I

.field private h0:[I

.field final i0:Landroidx/leanback/widget/z;

.field private j0:Landroidx/leanback/widget/c;

.field private final k0:Ljava/lang/Runnable;

.field private l0:Landroidx/leanback/widget/e$b;

.field m0:Landroidx/leanback/widget/f$f;

.field u:I

.field final v:Landroidx/leanback/widget/a;

.field w:I

.field private x:Landroidx/recyclerview/widget/j;

.field y:Landroidx/recyclerview/widget/RecyclerView$a0;

.field z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    sput-object v0, Landroidx/leanback/widget/f;->s:Landroid/graphics/Rect;

    const/4 v0, 0x2

    new-array v0, v0, [I

    sput-object v0, Landroidx/leanback/widget/f;->t:[I

    return-void
.end method

.method public constructor <init>(Landroidx/leanback/widget/a;)V
    .locals 3

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$o;-><init>()V

    const/16 v0, 0xa

    iput v0, p0, Landroidx/leanback/widget/f;->u:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/leanback/widget/f;->w:I

    invoke-static {p0}, Landroidx/recyclerview/widget/j;->a(Landroidx/recyclerview/widget/RecyclerView$o;)Landroidx/recyclerview/widget/j;

    move-result-object v1

    iput-object v1, p0, Landroidx/leanback/widget/f;->x:Landroidx/recyclerview/widget/j;

    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v1, p0, Landroidx/leanback/widget/f;->B:Landroid/util/SparseIntArray;

    const v1, 0x36200

    iput v1, p0, Landroidx/leanback/widget/f;->E:I

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/leanback/widget/f;->F:Landroidx/leanback/widget/n;

    iput-object v1, p0, Landroidx/leanback/widget/f;->G:Ljava/util/ArrayList;

    iput-object v1, p0, Landroidx/leanback/widget/f;->H:Landroidx/leanback/widget/m;

    const/4 v1, -0x1

    iput v1, p0, Landroidx/leanback/widget/f;->I:I

    iput v0, p0, Landroidx/leanback/widget/f;->J:I

    iput v0, p0, Landroidx/leanback/widget/f;->M:I

    const v2, 0x800033

    iput v2, p0, Landroidx/leanback/widget/f;->Y:I

    const/4 v2, 0x1

    iput v2, p0, Landroidx/leanback/widget/f;->a0:I

    iput v0, p0, Landroidx/leanback/widget/f;->c0:I

    new-instance v2, Landroidx/leanback/widget/a0;

    invoke-direct {v2}, Landroidx/leanback/widget/a0;-><init>()V

    iput-object v2, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    new-instance v2, Landroidx/leanback/widget/i;

    invoke-direct {v2}, Landroidx/leanback/widget/i;-><init>()V

    iput-object v2, p0, Landroidx/leanback/widget/f;->e0:Landroidx/leanback/widget/i;

    const/4 v2, 0x2

    new-array v2, v2, [I

    iput-object v2, p0, Landroidx/leanback/widget/f;->h0:[I

    new-instance v2, Landroidx/leanback/widget/z;

    invoke-direct {v2}, Landroidx/leanback/widget/z;-><init>()V

    iput-object v2, p0, Landroidx/leanback/widget/f;->i0:Landroidx/leanback/widget/z;

    new-instance v2, Landroidx/leanback/widget/f$a;

    invoke-direct {v2, p0}, Landroidx/leanback/widget/f$a;-><init>(Landroidx/leanback/widget/f;)V

    iput-object v2, p0, Landroidx/leanback/widget/f;->k0:Ljava/lang/Runnable;

    new-instance v2, Landroidx/leanback/widget/f$b;

    invoke-direct {v2, p0}, Landroidx/leanback/widget/f$b;-><init>(Landroidx/leanback/widget/f;)V

    iput-object v2, p0, Landroidx/leanback/widget/f;->l0:Landroidx/leanback/widget/e$b;

    iput-object p1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    iput v1, p0, Landroidx/leanback/widget/f;->O:I

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->H1(Z)V

    return-void
.end method

.method private A2(I)I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->R:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Landroidx/leanback/widget/f;->S:[I

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    aget p1, v0, p1

    return p1
.end method

.method private A3(I)I
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    neg-int v0, p1

    invoke-direct {p0, v0}, Landroidx/leanback/widget/f;->n3(I)V

    iget v0, p0, Landroidx/leanback/widget/f;->P:I

    add-int/2addr v0, p1

    iput v0, p0, Landroidx/leanback/widget/f;->P:I

    invoke-direct {p0}, Landroidx/leanback/widget/f;->u4()V

    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->invalidate()V

    return p1
.end method

.method private B3(IIZ)V
    .locals 3

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 v0, v0, 0x3

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->z3(I)I

    invoke-direct {p0, p2}, Landroidx/leanback/widget/f;->A3(I)I

    goto :goto_1

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/f;->w:I

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    move v2, p2

    move p2, p1

    move p1, v2

    :goto_0
    if-eqz p3, :cond_2

    iget-object p3, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {p3, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->o1(II)V

    goto :goto_1

    :cond_2
    iget-object p3, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {p3, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->Z1()V

    :goto_1
    return-void
.end method

.method private D2(Landroid/view/View;)I
    .locals 1

    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->M2(Landroid/view/View;)I

    move-result p1

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->c()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/a0$a;->h(I)I

    move-result p1

    return p1
.end method

.method private D3(Landroid/view/View;Landroid/view/View;Z)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, Landroidx/leanback/widget/f;->E3(Landroid/view/View;Landroid/view/View;ZII)V

    return-void
.end method

.method private E3(Landroid/view/View;Landroid/view/View;ZII)V
    .locals 5

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->i2(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p0, p1, p2}, Landroidx/leanback/widget/f;->H2(Landroid/view/View;Landroid/view/View;)I

    move-result v1

    iget v2, p0, Landroidx/leanback/widget/f;->I:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v0, v2, :cond_1

    iget v2, p0, Landroidx/leanback/widget/f;->J:I

    if-eq v1, v2, :cond_3

    :cond_1
    iput v0, p0, Landroidx/leanback/widget/f;->I:I

    iput v1, p0, Landroidx/leanback/widget/f;->J:I

    iput v4, p0, Landroidx/leanback/widget/f;->M:I

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 v0, v0, 0x3

    if-eq v0, v3, :cond_2

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->Y1()V

    :cond_2
    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0}, Landroidx/leanback/widget/a;->B1()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->invalidate()V

    :cond_3
    if-nez p1, :cond_4

    return-void

    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    :cond_5
    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-nez v0, :cond_6

    if-eqz p3, :cond_6

    return-void

    :cond_6
    sget-object v0, Landroidx/leanback/widget/f;->t:[I

    invoke-virtual {p0, p1, p2, v0}, Landroidx/leanback/widget/f;->C2(Landroid/view/View;Landroid/view/View;[I)Z

    move-result p1

    if-nez p1, :cond_7

    if-nez p4, :cond_7

    if-eqz p5, :cond_8

    :cond_7
    sget-object p1, Landroidx/leanback/widget/f;->t:[I

    aget p2, p1, v4

    add-int/2addr p2, p4

    aget p1, p1, v3

    add-int/2addr p1, p5

    invoke-direct {p0, p2, p1, p3}, Landroidx/leanback/widget/f;->B3(IIZ)V

    :cond_8
    return-void
.end method

.method private F2()I
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/f;->Z:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    invoke-virtual {p0, v0}, Landroidx/leanback/widget/f;->B2(I)I

    move-result v1

    invoke-direct {p0, v0}, Landroidx/leanback/widget/f;->A2(I)I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method private L2(Landroid/view/View;)I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->w:I

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->N2(Landroid/view/View;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->O2(Landroid/view/View;)I

    move-result p1

    :goto_0
    return p1
.end method

.method private M2(Landroid/view/View;)I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->w:I

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->O2(Landroid/view/View;)I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->N2(Landroid/view/View;)I

    move-result p1

    :goto_0
    return p1
.end method

.method private N2(Landroid/view/View;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/f$e;

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/f$e;->m(Landroid/view/View;)I

    move-result p1

    invoke-virtual {v0}, Landroidx/leanback/widget/f$e;->i()I

    move-result v0

    add-int/2addr p1, v0

    return p1
.end method

.method private O2(Landroid/view/View;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/f$e;

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/f$e;->q(Landroid/view/View;)I

    move-result p1

    invoke-virtual {v0}, Landroidx/leanback/widget/f$e;->j()I

    move-result v0

    add-int/2addr p1, v0

    return p1
.end method

.method private U1()Z
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->a()Z

    move-result v0

    return v0
.end method

.method private V1()V
    .locals 3

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    iget v1, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v2, 0x40000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, p0, Landroidx/leanback/widget/f;->g0:I

    neg-int v1, v1

    iget v2, p0, Landroidx/leanback/widget/f;->A:I

    sub-int/2addr v1, v2

    goto :goto_0

    :cond_0
    iget v1, p0, Landroidx/leanback/widget/f;->f0:I

    iget v2, p0, Landroidx/leanback/widget/f;->g0:I

    add-int/2addr v1, v2

    iget v2, p0, Landroidx/leanback/widget/f;->A:I

    add-int/2addr v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/leanback/widget/e;->b(I)V

    return-void
.end method

.method private X1()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    iput-object v0, p0, Landroidx/leanback/widget/f;->S:[I

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v0, v0, -0x401

    iput v0, p0, Landroidx/leanback/widget/f;->E:I

    return-void
.end method

.method private X2(Landroidx/recyclerview/widget/RecyclerView;ILandroid/graphics/Rect;)Z
    .locals 0

    iget p1, p0, Landroidx/leanback/widget/f;->I:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private Y2(Landroidx/recyclerview/widget/RecyclerView;ILandroid/graphics/Rect;)Z
    .locals 8

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result p1

    and-int/lit8 v0, p2, 0x2

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    move v2, p1

    const/4 p1, 0x0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    const/4 v0, -0x1

    :goto_0
    iget-object v4, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v4}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/leanback/widget/a0$a;->g()I

    move-result v4

    iget-object v5, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v5}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/leanback/widget/a0$a;->c()I

    move-result v5

    add-int/2addr v5, v4

    :goto_1
    if-eq p1, v2, :cond_2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-nez v7, :cond_1

    invoke-virtual {p0, v6}, Landroidx/leanback/widget/f;->R2(Landroid/view/View;)I

    move-result v7

    if-lt v7, v4, :cond_1

    invoke-virtual {p0, v6}, Landroidx/leanback/widget/f;->Q2(Landroid/view/View;)I

    move-result v7

    if-gt v7, v5, :cond_1

    invoke-virtual {v6, p2, p3}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v6

    if-eqz v6, :cond_1

    return v3

    :cond_1
    add-int/2addr p1, v0

    goto :goto_1

    :cond_2
    return v1
.end method

.method private a2()V
    .locals 15

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v0

    iget-object v1, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v1}, Landroidx/leanback/widget/e;->m()I

    move-result v1

    iget v2, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 v2, v2, -0x9

    iput v2, p0, Landroidx/leanback/widget/f;->E:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v0, :cond_5

    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v5

    invoke-direct {p0, v5}, Landroidx/leanback/widget/f;->i2(Landroid/view/View;)I

    move-result v6

    if-eq v1, v6, :cond_0

    :goto_1
    const/4 v2, 0x1

    goto :goto_3

    :cond_0
    iget-object v6, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v6, v1}, Landroidx/leanback/widget/e;->q(I)Landroidx/leanback/widget/e$a;

    move-result-object v6

    if-nez v6, :cond_1

    goto :goto_1

    :cond_1
    iget v7, v6, Landroidx/leanback/widget/e$a;->a:I

    invoke-virtual {p0, v7}, Landroidx/leanback/widget/f;->B2(I)I

    move-result v7

    iget-object v8, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v8}, Landroidx/leanback/widget/a0;->c()Landroidx/leanback/widget/a0$a;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/leanback/widget/a0$a;->g()I

    move-result v8

    add-int/2addr v7, v8

    iget v8, p0, Landroidx/leanback/widget/f;->P:I

    sub-int v14, v7, v8

    invoke-virtual {p0, v5}, Landroidx/leanback/widget/f;->R2(Landroid/view/View;)I

    move-result v12

    invoke-virtual {p0, v5}, Landroidx/leanback/widget/f;->S2(Landroid/view/View;)I

    move-result v7

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroidx/leanback/widget/f$e;

    invoke-virtual {v8}, Landroidx/recyclerview/widget/RecyclerView$p;->f()Z

    move-result v8

    if-eqz v8, :cond_2

    iget v8, p0, Landroidx/leanback/widget/f;->E:I

    or-int/lit8 v8, v8, 0x8

    iput v8, p0, Landroidx/leanback/widget/f;->E:I

    iget-object v8, p0, Landroidx/leanback/widget/f;->D:Landroidx/recyclerview/widget/RecyclerView$v;

    invoke-virtual {p0, v5, v8}, Landroidx/recyclerview/widget/RecyclerView$o;->y(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$v;)V

    invoke-virtual {p0, v1}, Landroidx/leanback/widget/f;->P2(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {p0, v5, v3}, Landroidx/recyclerview/widget/RecyclerView$o;->e(Landroid/view/View;I)V

    :cond_2
    move-object v11, v5

    invoke-virtual {p0, v11}, Landroidx/leanback/widget/f;->k3(Landroid/view/View;)V

    iget v5, p0, Landroidx/leanback/widget/f;->w:I

    if-nez v5, :cond_3

    invoke-virtual {p0, v11}, Landroidx/leanback/widget/f;->n2(Landroid/view/View;)I

    move-result v5

    goto :goto_2

    :cond_3
    invoke-virtual {p0, v11}, Landroidx/leanback/widget/f;->m2(Landroid/view/View;)I

    move-result v5

    :goto_2
    add-int v8, v12, v5

    move v13, v8

    iget v10, v6, Landroidx/leanback/widget/e$a;->a:I

    move-object v9, p0

    invoke-virtual/range {v9 .. v14}, Landroidx/leanback/widget/f;->h3(ILandroid/view/View;III)V

    if-eq v7, v5, :cond_4

    goto :goto_1

    :cond_4
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    :goto_3
    if-eqz v2, :cond_8

    iget-object v2, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v2}, Landroidx/leanback/widget/e;->p()I

    move-result v2

    sub-int/2addr v0, v4

    :goto_4
    if-lt v0, v3, :cond_6

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Landroidx/leanback/widget/f;->D:Landroidx/recyclerview/widget/RecyclerView$v;

    invoke-virtual {p0, v4, v5}, Landroidx/recyclerview/widget/RecyclerView$o;->y(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$v;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_4

    :cond_6
    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v0, v1}, Landroidx/leanback/widget/e;->t(I)V

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v1, 0x10000

    and-int/2addr v0, v1

    if-eqz v0, :cond_7

    invoke-direct {p0}, Landroidx/leanback/widget/f;->V1()V

    iget v0, p0, Landroidx/leanback/widget/f;->I:I

    if-ltz v0, :cond_8

    if-gt v0, v2, :cond_8

    :goto_5
    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->p()I

    move-result v0

    iget v1, p0, Landroidx/leanback/widget/f;->I:I

    if-ge v0, v1, :cond_8

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->a()Z

    goto :goto_5

    :cond_7
    :goto_6
    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->p()I

    move-result v0

    if-ge v0, v2, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {p0}, Landroidx/leanback/widget/f;->t4()V

    invoke-direct {p0}, Landroidx/leanback/widget/f;->u4()V

    return-void
.end method

.method private c2(Landroid/view/View;)I
    .locals 3

    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    if-eqz v0, :cond_1

    if-eq p1, v0, :cond_1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->E(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v2

    if-ne v2, p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method private d3()V
    .locals 3

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->b()V

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    iget-object v0, v0, Landroidx/leanback/widget/a0;->c:Landroidx/leanback/widget/a0$a;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->s0()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/leanback/widget/a0$a;->x(I)V

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    iget-object v0, v0, Landroidx/leanback/widget/a0;->b:Landroidx/leanback/widget/a0$a;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->a0()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/leanback/widget/a0$a;->x(I)V

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    iget-object v0, v0, Landroidx/leanback/widget/a0;->c:Landroidx/leanback/widget/a0$a;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->i0()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->j0()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroidx/leanback/widget/a0$a;->t(II)V

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    iget-object v0, v0, Landroidx/leanback/widget/a0;->b:Landroidx/leanback/widget/a0$a;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->k0()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h0()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroidx/leanback/widget/a0$a;->t(II)V

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/a0$a;->i()I

    move-result v0

    iput v0, p0, Landroidx/leanback/widget/f;->f0:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/leanback/widget/f;->P:I

    return-void
.end method

.method private f2(ZZII)V
    .locals 4

    iget v0, p0, Landroidx/leanback/widget/f;->I:I

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p0, v0, v1, p3, p4}, Landroidx/leanback/widget/f;->G3(Landroid/view/View;ZII)V

    :cond_0
    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    goto :goto_3

    :cond_1
    if-nez p1, :cond_5

    iget-object p1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->hasFocus()Z

    move-result p1

    if-nez p1, :cond_5

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->hasFocusable()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    iget-object p1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->focusableViewAvailable(Landroid/view/View;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result p1

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p1, :cond_4

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->hasFocusable()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    if-eqz p2, :cond_5

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0, v0, v1, p3, p4}, Landroidx/leanback/widget/f;->G3(Landroid/view/View;ZII)V

    :cond_5
    :goto_3
    return-void
.end method

.method private g2()V
    .locals 2

    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    iget-object v1, p0, Landroidx/leanback/widget/f;->k0:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lb/g/k/s;->a0(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void
.end method

.method private h2(I)I
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->i2(Landroid/view/View;)I

    move-result p1

    return p1
.end method

.method private i2(Landroid/view/View;)I
    .locals 2

    const/4 v0, -0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/leanback/widget/f$e;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$p;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I

    move-result p1

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method private i3()Z
    .locals 5

    iget-object v0, p0, Landroidx/leanback/widget/f;->y:Landroidx/recyclerview/widget/RecyclerView$a0;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$a0;->c()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v0, :cond_0

    iput v1, p0, Landroidx/leanback/widget/f;->I:I

    :goto_0
    iput v3, p0, Landroidx/leanback/widget/f;->J:I

    goto :goto_1

    :cond_0
    iget v4, p0, Landroidx/leanback/widget/f;->I:I

    if-lt v4, v0, :cond_1

    sub-int/2addr v0, v2

    iput v0, p0, Landroidx/leanback/widget/f;->I:I

    goto :goto_0

    :cond_1
    if-ne v4, v1, :cond_2

    if-lez v0, :cond_2

    iput v3, p0, Landroidx/leanback/widget/f;->I:I

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v0, p0, Landroidx/leanback/widget/f;->y:Landroidx/recyclerview/widget/RecyclerView$a0;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$a0;->b()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->m()I

    move-result v0

    if-ltz v0, :cond_3

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v0, v0, 0x100

    if-nez v0, :cond_3

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->r()I

    move-result v0

    iget v1, p0, Landroidx/leanback/widget/f;->Z:I

    if-ne v0, v1, :cond_3

    invoke-direct {p0}, Landroidx/leanback/widget/f;->s4()V

    invoke-direct {p0}, Landroidx/leanback/widget/f;->u4()V

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    iget v1, p0, Landroidx/leanback/widget/f;->W:I

    invoke-virtual {v0, v1}, Landroidx/leanback/widget/e;->F(I)V

    return v2

    :cond_3
    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Landroidx/leanback/widget/f;->E:I

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    const/high16 v1, 0x40000

    if-eqz v0, :cond_5

    iget v4, p0, Landroidx/leanback/widget/f;->Z:I

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->r()I

    move-result v0

    if-ne v4, v0, :cond_5

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_4

    const/4 v0, 0x1

    goto :goto_2

    :cond_4
    const/4 v0, 0x0

    :goto_2
    iget-object v4, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v4}, Landroidx/leanback/widget/e;->u()Z

    move-result v4

    if-eq v0, v4, :cond_7

    :cond_5
    iget v0, p0, Landroidx/leanback/widget/f;->Z:I

    invoke-static {v0}, Landroidx/leanback/widget/e;->g(I)Landroidx/leanback/widget/e;

    move-result-object v0

    iput-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    iget-object v4, p0, Landroidx/leanback/widget/f;->l0:Landroidx/leanback/widget/e$b;

    invoke-virtual {v0, v4}, Landroidx/leanback/widget/e;->D(Landroidx/leanback/widget/e$b;)V

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    iget v4, p0, Landroidx/leanback/widget/f;->E:I

    and-int/2addr v1, v4

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    const/4 v2, 0x0

    :goto_3
    invoke-virtual {v0, v2}, Landroidx/leanback/widget/e;->E(Z)V

    :cond_7
    invoke-direct {p0}, Landroidx/leanback/widget/f;->d3()V

    invoke-direct {p0}, Landroidx/leanback/widget/f;->u4()V

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    iget v1, p0, Landroidx/leanback/widget/f;->W:I

    invoke-virtual {v0, v1}, Landroidx/leanback/widget/e;->F(I)V

    iget-object v0, p0, Landroidx/leanback/widget/f;->D:Landroidx/recyclerview/widget/RecyclerView$v;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->x(Landroidx/recyclerview/widget/RecyclerView$v;)V

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->A()V

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/a0$a;->n()V

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/a0$a;->m()V

    return v3
.end method

.method private j2(ILandroid/view/View;Landroid/view/View;)I
    .locals 1

    invoke-virtual {p0, p2, p3}, Landroidx/leanback/widget/f;->H2(Landroid/view/View;Landroid/view/View;)I

    move-result p3

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroidx/leanback/widget/f$e;

    invoke-virtual {p2}, Landroidx/leanback/widget/f$e;->h()[I

    move-result-object v0

    aget p3, v0, p3

    invoke-virtual {p2}, Landroidx/leanback/widget/f$e;->h()[I

    move-result-object p2

    const/4 v0, 0x0

    aget p2, p2, v0

    sub-int/2addr p3, p2

    add-int/2addr p1, p3

    :cond_0
    return p1
.end method

.method private j3()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/leanback/widget/f;->D:Landroidx/recyclerview/widget/RecyclerView$v;

    iput-object v0, p0, Landroidx/leanback/widget/f;->y:Landroidx/recyclerview/widget/RecyclerView$a0;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/leanback/widget/f;->z:I

    iput v0, p0, Landroidx/leanback/widget/f;->A:I

    return-void
.end method

.method private k2(Landroid/view/View;Landroid/view/View;[I)Z
    .locals 2

    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->z2(Landroid/view/View;)I

    move-result v0

    if-eqz p2, :cond_0

    invoke-direct {p0, v0, p1, p2}, Landroidx/leanback/widget/f;->j2(ILandroid/view/View;Landroid/view/View;)I

    move-result v0

    :cond_0
    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->D2(Landroid/view/View;)I

    move-result p1

    iget p2, p0, Landroidx/leanback/widget/f;->N:I

    add-int/2addr v0, p2

    const/4 p2, 0x1

    const/4 v1, 0x0

    if-nez v0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    aput v1, p3, v1

    aput v1, p3, p2

    return v1

    :cond_2
    :goto_0
    aput v0, p3, v1

    aput p1, p3, p2

    return p2
.end method

.method private l3(III[I)V
    .locals 5

    iget-object v0, p0, Landroidx/leanback/widget/f;->D:Landroidx/recyclerview/widget/RecyclerView$v;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$v;->o(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/f$e;

    sget-object v1, Landroidx/leanback/widget/f;->s:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v2, v3

    iget v3, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v2, v3

    iget v3, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v3, v4

    iget v4, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v4

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->i0()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->j0()I

    move-result v4

    add-int/2addr v1, v4

    add-int/2addr v1, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {p2, v1, v2}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->k0()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h0()I

    move-result v2

    add-int/2addr v1, v2

    add-int/2addr v1, v3

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p3, v1, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    const/4 p2, 0x0

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/f;->n2(Landroid/view/View;)I

    move-result p3

    aput p3, p4, p2

    const/4 p2, 0x1

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/f;->m2(Landroid/view/View;)I

    move-result p3

    aput p3, p4, p2

    iget-object p2, p0, Landroidx/leanback/widget/f;->D:Landroidx/recyclerview/widget/RecyclerView$v;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$v;->B(Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method private m3(I)V
    .locals 4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v0

    iget v1, p0, Landroidx/leanback/widget/f;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method private n3(I)V
    .locals 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v0

    iget v1, p0, Landroidx/leanback/widget/f;->w:I

    const/4 v2, 0x0

    if-nez v1, :cond_0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return-void
.end method

.method private n4()V
    .locals 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v2

    invoke-direct {p0, v2}, Landroidx/leanback/widget/f;->o4(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private o4(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/f$e;

    invoke-virtual {v0}, Landroidx/leanback/widget/f$e;->k()Landroidx/leanback/widget/j;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/leanback/widget/f;->e0:Landroidx/leanback/widget/i;

    iget-object v1, v1, Landroidx/leanback/widget/i;->c:Landroidx/leanback/widget/i$a;

    invoke-virtual {v1, p1}, Landroidx/leanback/widget/i$a;->j(Landroid/view/View;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/leanback/widget/f$e;->t(I)V

    :goto_0
    iget-object v1, p0, Landroidx/leanback/widget/f;->e0:Landroidx/leanback/widget/i;

    iget-object v1, v1, Landroidx/leanback/widget/i;->b:Landroidx/leanback/widget/i$a;

    invoke-virtual {v1, p1}, Landroidx/leanback/widget/i$a;->j(Landroid/view/View;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/f$e;->u(I)V

    goto :goto_1

    :cond_0
    iget v1, p0, Landroidx/leanback/widget/f;->w:I

    invoke-virtual {v0, v1, p1}, Landroidx/leanback/widget/f$e;->g(ILandroid/view/View;)V

    iget v1, p0, Landroidx/leanback/widget/f;->w:I

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroidx/leanback/widget/f;->e0:Landroidx/leanback/widget/i;

    iget-object v1, v1, Landroidx/leanback/widget/i;->c:Landroidx/leanback/widget/i$a;

    invoke-virtual {v1, p1}, Landroidx/leanback/widget/i$a;->j(Landroid/view/View;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/f$e;->t(I)V

    :goto_1
    return-void
.end method

.method private r3()Z
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->v()Z

    move-result v0

    return v0
.end method

.method private r4()V
    .locals 4

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v0, v0, -0x401

    const/4 v1, 0x0

    invoke-direct {p0, v1}, Landroidx/leanback/widget/f;->u3(Z)Z

    move-result v2

    const/16 v3, 0x400

    if-eqz v2, :cond_0

    const/16 v1, 0x400

    :cond_0
    or-int/2addr v0, v1

    iput v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/2addr v0, v3

    if-eqz v0, :cond_1

    invoke-direct {p0}, Landroidx/leanback/widget/f;->g2()V

    :cond_1
    return-void
.end method

.method private s3()V
    .locals 3

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    iget v1, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v2, 0x40000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, p0, Landroidx/leanback/widget/f;->f0:I

    iget v2, p0, Landroidx/leanback/widget/f;->g0:I

    add-int/2addr v1, v2

    iget v2, p0, Landroidx/leanback/widget/f;->A:I

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    iget v1, p0, Landroidx/leanback/widget/f;->g0:I

    neg-int v1, v1

    iget v2, p0, Landroidx/leanback/widget/f;->A:I

    sub-int/2addr v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Landroidx/leanback/widget/e;->w(I)V

    return-void
.end method

.method private s4()V
    .locals 3

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    iget-object v0, v0, Landroidx/leanback/widget/a0;->c:Landroidx/leanback/widget/a0$a;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->s0()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/leanback/widget/a0$a;->x(I)V

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    iget-object v0, v0, Landroidx/leanback/widget/a0;->b:Landroidx/leanback/widget/a0$a;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->a0()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/leanback/widget/a0$a;->x(I)V

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    iget-object v0, v0, Landroidx/leanback/widget/a0;->c:Landroidx/leanback/widget/a0$a;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->i0()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->j0()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroidx/leanback/widget/a0$a;->t(II)V

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    iget-object v0, v0, Landroidx/leanback/widget/a0;->b:Landroidx/leanback/widget/a0$a;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->k0()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h0()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroidx/leanback/widget/a0$a;->t(II)V

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/a0$a;->i()I

    move-result v0

    iput v0, p0, Landroidx/leanback/widget/f;->f0:I

    return-void
.end method

.method private t3(Z)V
    .locals 4

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->a3()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/leanback/widget/f;->Z2()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Landroidx/leanback/widget/f;->L:Landroidx/leanback/widget/f$g;

    if-nez v0, :cond_4

    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->x1()V

    new-instance v0, Landroidx/leanback/widget/f$g;

    const/4 v1, 0x1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, -0x1

    :goto_1
    iget v2, p0, Landroidx/leanback/widget/f;->Z:I

    const/4 v3, 0x0

    if-le v2, v1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    invoke-direct {v0, p0, p1, v1}, Landroidx/leanback/widget/f$g;-><init>(Landroidx/leanback/widget/f;IZ)V

    iput v3, p0, Landroidx/leanback/widget/f;->M:I

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/f;->R1(Landroidx/recyclerview/widget/RecyclerView$z;)V

    goto :goto_3

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual {v0}, Landroidx/leanback/widget/f$g;->H()V

    goto :goto_3

    :cond_5
    invoke-virtual {v0}, Landroidx/leanback/widget/f$g;->G()V

    :goto_3
    return-void
.end method

.method private u3(Z)Z
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Landroidx/leanback/widget/f;->R:I

    const/4 v2, 0x0

    if-nez v1, :cond_15

    iget-object v1, v0, Landroidx/leanback/widget/f;->S:[I

    if-nez v1, :cond_0

    goto/16 :goto_c

    :cond_0
    iget-object v1, v0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    const/4 v3, 0x0

    if-nez v1, :cond_1

    move-object v1, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroidx/leanback/widget/e;->n()[Lb/d/d;

    move-result-object v1

    :goto_0
    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, -0x1

    :goto_1
    iget v8, v0, Landroidx/leanback/widget/f;->Z:I

    if-ge v5, v8, :cond_14

    if-nez v1, :cond_2

    move-object v8, v3

    goto :goto_2

    :cond_2
    aget-object v8, v1, v5

    :goto_2
    if-nez v8, :cond_3

    const/4 v9, 0x0

    goto :goto_3

    :cond_3
    invoke-virtual {v8}, Lb/d/d;->g()I

    move-result v9

    :goto_3
    const/4 v10, 0x0

    const/4 v11, -0x1

    :goto_4
    if-ge v10, v9, :cond_9

    invoke-virtual {v8, v10}, Lb/d/d;->d(I)I

    move-result v12

    add-int/lit8 v13, v10, 0x1

    invoke-virtual {v8, v13}, Lb/d/d;->d(I)I

    move-result v13

    :goto_5
    if-gt v12, v13, :cond_8

    iget v14, v0, Landroidx/leanback/widget/f;->z:I

    sub-int v14, v12, v14

    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v14

    if-nez v14, :cond_4

    goto :goto_7

    :cond_4
    if-eqz p1, :cond_5

    invoke-virtual {v0, v14}, Landroidx/leanback/widget/f;->k3(Landroid/view/View;)V

    :cond_5
    iget v15, v0, Landroidx/leanback/widget/f;->w:I

    if-nez v15, :cond_6

    invoke-virtual {v0, v14}, Landroidx/leanback/widget/f;->m2(Landroid/view/View;)I

    move-result v14

    goto :goto_6

    :cond_6
    invoke-virtual {v0, v14}, Landroidx/leanback/widget/f;->n2(Landroid/view/View;)I

    move-result v14

    :goto_6
    if-le v14, v11, :cond_7

    move v11, v14

    :cond_7
    :goto_7
    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    :cond_8
    add-int/lit8 v10, v10, 0x2

    goto :goto_4

    :cond_9
    iget-object v8, v0, Landroidx/leanback/widget/f;->y:Landroidx/recyclerview/widget/RecyclerView$a0;

    invoke-virtual {v8}, Landroidx/recyclerview/widget/RecyclerView$a0;->c()I

    move-result v8

    iget-object v9, v0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView;->n0()Z

    move-result v9

    const/4 v10, 0x1

    if-nez v9, :cond_11

    if-eqz p1, :cond_11

    if-gez v11, :cond_11

    if-lez v8, :cond_11

    if-gez v7, :cond_10

    iget v9, v0, Landroidx/leanback/widget/f;->I:I

    if-gez v9, :cond_a

    const/4 v9, 0x0

    goto :goto_8

    :cond_a
    if-lt v9, v8, :cond_b

    add-int/lit8 v9, v8, -0x1

    :cond_b
    :goto_8
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v12

    if-lez v12, :cond_e

    iget-object v12, v0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v13

    invoke-virtual {v12, v13}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/recyclerview/widget/RecyclerView$d0;->m()I

    move-result v12

    iget-object v13, v0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v14

    sub-int/2addr v14, v10

    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v14

    invoke-virtual {v13, v14}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object v13

    invoke-virtual {v13}, Landroidx/recyclerview/widget/RecyclerView$d0;->m()I

    move-result v13

    if-lt v9, v12, :cond_e

    if-gt v9, v13, :cond_e

    sub-int v14, v9, v12

    sub-int v9, v13, v9

    if-gt v14, v9, :cond_c

    add-int/lit8 v9, v12, -0x1

    goto :goto_9

    :cond_c
    add-int/lit8 v9, v13, 0x1

    :goto_9
    if-gez v9, :cond_d

    add-int/lit8 v14, v8, -0x1

    if-ge v13, v14, :cond_d

    add-int/lit8 v9, v13, 0x1

    goto :goto_a

    :cond_d
    if-lt v9, v8, :cond_e

    if-lez v12, :cond_e

    add-int/lit8 v9, v12, -0x1

    :cond_e
    :goto_a
    if-ltz v9, :cond_10

    if-ge v9, v8, :cond_10

    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    iget-object v12, v0, Landroidx/leanback/widget/f;->h0:[I

    invoke-direct {v0, v9, v7, v8, v12}, Landroidx/leanback/widget/f;->l3(III[I)V

    iget v7, v0, Landroidx/leanback/widget/f;->w:I

    if-nez v7, :cond_f

    iget-object v7, v0, Landroidx/leanback/widget/f;->h0:[I

    aget v7, v7, v10

    goto :goto_b

    :cond_f
    iget-object v7, v0, Landroidx/leanback/widget/f;->h0:[I

    aget v7, v7, v2

    :cond_10
    :goto_b
    if-ltz v7, :cond_11

    move v11, v7

    :cond_11
    if-gez v11, :cond_12

    const/4 v11, 0x0

    :cond_12
    iget-object v8, v0, Landroidx/leanback/widget/f;->S:[I

    aget v9, v8, v5

    if-eq v9, v11, :cond_13

    aput v11, v8, v5

    const/4 v6, 0x1

    :cond_13
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_14
    return v6

    :cond_15
    :goto_c
    return v2
.end method

.method private u4()V
    .locals 3

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->c()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/a0$a;->g()I

    move-result v1

    iget v2, p0, Landroidx/leanback/widget/f;->P:I

    sub-int/2addr v1, v2

    invoke-direct {p0}, Landroidx/leanback/widget/f;->F2()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {v0, v1, v2, v1, v2}, Landroidx/leanback/widget/a0$a;->B(IIII)V

    return-void
.end method

.method private v2(I)I
    .locals 9

    iget v0, p0, Landroidx/leanback/widget/f;->w:I

    const/16 v1, 0x82

    const/16 v2, 0x42

    const/16 v3, 0x21

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/16 v7, 0x11

    const/4 v8, 0x1

    if-nez v0, :cond_4

    const/high16 v0, 0x40000

    if-eq p1, v7, :cond_3

    if-eq p1, v3, :cond_2

    if-eq p1, v2, :cond_1

    if-eq p1, v1, :cond_0

    goto :goto_3

    :cond_0
    :goto_0
    const/4 v4, 0x3

    goto :goto_4

    :cond_1
    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/2addr p1, v0

    if-nez p1, :cond_9

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v4, 0x2

    goto :goto_4

    :cond_3
    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/2addr p1, v0

    if-nez p1, :cond_5

    goto :goto_4

    :cond_4
    if-ne v0, v8, :cond_8

    const/high16 v0, 0x80000

    if-eq p1, v7, :cond_7

    if-eq p1, v3, :cond_9

    if-eq p1, v2, :cond_6

    if-eq p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    const/4 v4, 0x1

    goto :goto_4

    :cond_6
    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/2addr p1, v0

    if-nez p1, :cond_2

    goto :goto_0

    :cond_7
    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/2addr p1, v0

    if-nez p1, :cond_0

    goto :goto_1

    :cond_8
    :goto_3
    const/16 v4, 0x11

    :cond_9
    :goto_4
    return v4
.end method

.method private w2(Landroid/view/View;[I)Z
    .locals 12

    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->i2(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/f;->R2(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/f;->Q2(Landroid/view/View;)I

    move-result v2

    iget-object v3, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v3}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/leanback/widget/a0$a;->g()I

    move-result v3

    iget-object v4, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v4}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/leanback/widget/a0$a;->c()I

    move-result v4

    iget-object v5, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v5, v0}, Landroidx/leanback/widget/e;->s(I)I

    move-result v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-ge v1, v3, :cond_5

    iget v1, p0, Landroidx/leanback/widget/f;->c0:I

    if-ne v1, v8, :cond_3

    move-object v1, p1

    :goto_0
    invoke-direct {p0}, Landroidx/leanback/widget/f;->r3()Z

    move-result v10

    if-eqz v10, :cond_2

    iget-object v1, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v1}, Landroidx/leanback/widget/e;->m()I

    move-result v10

    invoke-virtual {v1, v10, v0}, Landroidx/leanback/widget/e;->o(II)[Lb/d/d;

    move-result-object v1

    aget-object v1, v1, v5

    invoke-virtual {v1, v7}, Lb/d/d;->d(I)I

    move-result v10

    invoke-virtual {p0, v10}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {p0, v10}, Landroidx/leanback/widget/f;->R2(Landroid/view/View;)I

    move-result v11

    sub-int v11, v2, v11

    if-le v11, v4, :cond_1

    invoke-virtual {v1}, Lb/d/d;->g()I

    move-result v0

    if-le v0, v8, :cond_0

    invoke-virtual {v1, v8}, Lb/d/d;->d(I)I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v9

    move-object v9, v0

    goto :goto_2

    :cond_0
    move-object v2, v9

    move-object v9, v10

    goto :goto_2

    :cond_1
    move-object v1, v10

    goto :goto_0

    :cond_2
    move-object v2, v9

    move-object v9, v1

    goto :goto_2

    :cond_3
    move-object v2, v9

    :cond_4
    move-object v9, p1

    goto :goto_2

    :cond_5
    add-int v10, v4, v3

    if-le v2, v10, :cond_9

    iget v2, p0, Landroidx/leanback/widget/f;->c0:I

    if-ne v2, v8, :cond_8

    :cond_6
    iget-object v2, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v2}, Landroidx/leanback/widget/e;->p()I

    move-result v8

    invoke-virtual {v2, v0, v8}, Landroidx/leanback/widget/e;->o(II)[Lb/d/d;

    move-result-object v2

    aget-object v2, v2, v5

    invoke-virtual {v2}, Lb/d/d;->g()I

    move-result v8

    sub-int/2addr v8, v6

    invoke-virtual {v2, v8}, Lb/d/d;->d(I)I

    move-result v2

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroidx/leanback/widget/f;->Q2(Landroid/view/View;)I

    move-result v8

    sub-int/2addr v8, v1

    if-le v8, v4, :cond_7

    move-object v2, v9

    goto :goto_1

    :cond_7
    invoke-direct {p0}, Landroidx/leanback/widget/f;->U1()Z

    move-result v8

    if-nez v8, :cond_6

    :goto_1
    if-eqz v2, :cond_4

    goto :goto_2

    :cond_8
    move-object v2, p1

    goto :goto_2

    :cond_9
    move-object v2, v9

    :goto_2
    if-eqz v9, :cond_a

    invoke-virtual {p0, v9}, Landroidx/leanback/widget/f;->R2(Landroid/view/View;)I

    move-result v0

    :goto_3
    sub-int/2addr v0, v3

    goto :goto_4

    :cond_a
    if-eqz v2, :cond_b

    invoke-virtual {p0, v2}, Landroidx/leanback/widget/f;->Q2(Landroid/view/View;)I

    move-result v0

    add-int/2addr v3, v4

    goto :goto_3

    :cond_b
    const/4 v0, 0x0

    :goto_4
    if-eqz v9, :cond_c

    move-object p1, v9

    goto :goto_5

    :cond_c
    if-eqz v2, :cond_d

    move-object p1, v2

    :cond_d
    :goto_5
    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->D2(Landroid/view/View;)I

    move-result p1

    if-nez v0, :cond_f

    if-eqz p1, :cond_e

    goto :goto_6

    :cond_e
    return v7

    :cond_f
    :goto_6
    aput v0, p2, v7

    aput p1, p2, v6

    return v6
.end method

.method private w3()V
    .locals 4

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    const v1, 0x10040

    and-int/2addr v1, v0

    const/high16 v2, 0x10000

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    iget v2, p0, Landroidx/leanback/widget/f;->I:I

    const/high16 v3, 0x40000

    and-int/2addr v0, v3

    if-eqz v0, :cond_0

    iget v0, p0, Landroidx/leanback/widget/f;->g0:I

    neg-int v0, v0

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/f;->f0:I

    iget v3, p0, Landroidx/leanback/widget/f;->g0:I

    add-int/2addr v0, v3

    :goto_0
    invoke-virtual {v1, v2, v0}, Landroidx/leanback/widget/e;->y(II)V

    :cond_1
    return-void
.end method

.method private x3()V
    .locals 4

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    const v1, 0x10040

    and-int/2addr v1, v0

    const/high16 v2, 0x10000

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    iget v2, p0, Landroidx/leanback/widget/f;->I:I

    const/high16 v3, 0x40000

    and-int/2addr v0, v3

    if-eqz v0, :cond_0

    iget v0, p0, Landroidx/leanback/widget/f;->f0:I

    iget v3, p0, Landroidx/leanback/widget/f;->g0:I

    add-int/2addr v0, v3

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/f;->g0:I

    neg-int v0, v0

    :goto_0
    invoke-virtual {v1, v2, v0}, Landroidx/leanback/widget/e;->z(II)V

    :cond_1
    return-void
.end method

.method private y3(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V
    .locals 2

    iget-object v0, p0, Landroidx/leanback/widget/f;->D:Landroidx/recyclerview/widget/RecyclerView$v;

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/leanback/widget/f;->y:Landroidx/recyclerview/widget/RecyclerView$a0;

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "GridLayoutManager"

    const-string v1, "Recycler information was not released, bug!"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iput-object p1, p0, Landroidx/leanback/widget/f;->D:Landroidx/recyclerview/widget/RecyclerView$v;

    iput-object p2, p0, Landroidx/leanback/widget/f;->y:Landroidx/recyclerview/widget/RecyclerView$a0;

    const/4 p1, 0x0

    iput p1, p0, Landroidx/leanback/widget/f;->z:I

    iput p1, p0, Landroidx/leanback/widget/f;->A:I

    return-void
.end method

.method private z2(Landroid/view/View;)I
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->L2(Landroid/view/View;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/a0$a;->h(I)I

    move-result p1

    return p1
.end method

.method private z3(I)I
    .locals 6

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 v1, v0, 0x40

    const/4 v2, 0x1

    if-nez v1, :cond_1

    and-int/lit8 v0, v0, 0x3

    if-eq v0, v2, :cond_1

    if-lez p1, :cond_0

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/a0$a;->o()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/a0$a;->d()I

    move-result v0

    if-le p1, v0, :cond_1

    goto :goto_0

    :cond_0
    if-gez p1, :cond_1

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/a0$a;->p()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/a0$a;->e()I

    move-result v0

    if-ge p1, v0, :cond_1

    :goto_0
    move p1, v0

    :cond_1
    const/4 v0, 0x0

    if-nez p1, :cond_2

    return v0

    :cond_2
    neg-int v1, p1

    invoke-direct {p0, v1}, Landroidx/leanback/widget/f;->m3(I)V

    iget v1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 v1, v1, 0x3

    if-ne v1, v2, :cond_3

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->t4()V

    return p1

    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v1

    iget v3, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v4, 0x40000

    and-int/2addr v3, v4

    if-eqz v3, :cond_4

    if-lez p1, :cond_5

    goto :goto_1

    :cond_4
    if-gez p1, :cond_5

    :goto_1
    invoke-direct {p0}, Landroidx/leanback/widget/f;->s3()V

    goto :goto_2

    :cond_5
    invoke-direct {p0}, Landroidx/leanback/widget/f;->V1()V

    :goto_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v3

    if-le v3, v1, :cond_6

    const/4 v1, 0x1

    goto :goto_3

    :cond_6
    const/4 v1, 0x0

    :goto_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v3

    iget v5, p0, Landroidx/leanback/widget/f;->E:I

    and-int/2addr v4, v5

    if-eqz v4, :cond_7

    if-lez p1, :cond_8

    goto :goto_4

    :cond_7
    if-gez p1, :cond_8

    :goto_4
    invoke-direct {p0}, Landroidx/leanback/widget/f;->w3()V

    goto :goto_5

    :cond_8
    invoke-direct {p0}, Landroidx/leanback/widget/f;->x3()V

    :goto_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v4

    if-ge v4, v3, :cond_9

    goto :goto_6

    :cond_9
    const/4 v2, 0x0

    :goto_6
    or-int v0, v1, v2

    if-eqz v0, :cond_a

    invoke-direct {p0}, Landroidx/leanback/widget/f;->r4()V

    :cond_a
    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->invalidate()V

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->t4()V

    return p1
.end method


# virtual methods
.method B2(I)I
    .locals 4

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v1, 0x80000

    and-int/2addr v0, v1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, p0, Landroidx/leanback/widget/f;->Z:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-le v0, p1, :cond_2

    invoke-direct {p0, v0}, Landroidx/leanback/widget/f;->A2(I)I

    move-result v2

    iget v3, p0, Landroidx/leanback/widget/f;->X:I

    add-int/2addr v2, v3

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_1
    if-ge v1, p1, :cond_1

    invoke-direct {p0, v1}, Landroidx/leanback/widget/f;->A2(I)I

    move-result v2

    iget v3, p0, Landroidx/leanback/widget/f;->X:I

    add-int/2addr v2, v3

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    move v1, v0

    :cond_2
    return v1
.end method

.method C2(Landroid/view/View;Landroid/view/View;[I)Z
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/f;->c0:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    invoke-direct {p0, p1, p2, p3}, Landroidx/leanback/widget/f;->k2(Landroid/view/View;Landroid/view/View;[I)Z

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p1, p3}, Landroidx/leanback/widget/f;->w2(Landroid/view/View;[I)Z

    move-result p1

    return p1
.end method

.method C3(IIZI)V
    .locals 4

    iput p4, p0, Landroidx/leanback/widget/f;->N:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object p4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->C0()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->isLayoutRequested()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz p4, :cond_0

    invoke-direct {p0, p4}, Landroidx/leanback/widget/f;->i2(Landroid/view/View;)I

    move-result v1

    if-ne v1, p1, :cond_0

    :goto_0
    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    invoke-virtual {p0, p4, p3}, Landroidx/leanback/widget/f;->F3(Landroid/view/View;Z)V

    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 p1, p1, -0x21

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    goto :goto_1

    :cond_0
    iget v1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v2, v1, 0x200

    const/high16 v3, -0x80000000

    if-eqz v2, :cond_7

    and-int/lit8 v1, v1, 0x40

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    if-eqz p3, :cond_3

    iget-object v1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->isLayoutRequested()Z

    move-result v1

    if-nez v1, :cond_3

    iput p1, p0, Landroidx/leanback/widget/f;->I:I

    iput p2, p0, Landroidx/leanback/widget/f;->J:I

    iput v3, p0, Landroidx/leanback/widget/f;->M:I

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->b3()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->J2()Ljava/lang/String;

    move-result-object p1

    const-string p2, "setSelectionSmooth should not be called before first layout pass"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    invoke-virtual {p0, p1}, Landroidx/leanback/widget/f;->m4(I)I

    move-result p1

    iget p2, p0, Landroidx/leanback/widget/f;->I:I

    if-eq p1, p2, :cond_6

    iput p1, p0, Landroidx/leanback/widget/f;->I:I

    const/4 p1, 0x0

    iput p1, p0, Landroidx/leanback/widget/f;->J:I

    goto :goto_1

    :cond_3
    if-nez v0, :cond_4

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->l4()V

    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->x1()V

    :cond_4
    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_5

    if-eqz p4, :cond_5

    invoke-direct {p0, p4}, Landroidx/leanback/widget/f;->i2(Landroid/view/View;)I

    move-result v0

    if-ne v0, p1, :cond_5

    goto :goto_0

    :cond_5
    iput p1, p0, Landroidx/leanback/widget/f;->I:I

    iput p2, p0, Landroidx/leanback/widget/f;->J:I

    iput v3, p0, Landroidx/leanback/widget/f;->M:I

    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    or-int/lit16 p1, p1, 0x100

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->A1()V

    :cond_6
    :goto_1
    return-void

    :cond_7
    :goto_2
    iput p1, p0, Landroidx/leanback/widget/f;->I:I

    iput p2, p0, Landroidx/leanback/widget/f;->J:I

    iput v3, p0, Landroidx/leanback/widget/f;->M:I

    return-void
.end method

.method public D1(ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->b3()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {p0, p2, p3}, Landroidx/leanback/widget/f;->y3(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    iget p2, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 p2, p2, -0x4

    or-int/lit8 p2, p2, 0x2

    iput p2, p0, Landroidx/leanback/widget/f;->E:I

    iget p2, p0, Landroidx/leanback/widget/f;->w:I

    if-nez p2, :cond_1

    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->z3(I)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->A3(I)I

    move-result p1

    :goto_0
    invoke-direct {p0}, Landroidx/leanback/widget/f;->j3()V

    iget p2, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 p2, p2, -0x4

    iput p2, p0, Landroidx/leanback/widget/f;->E:I

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public E1(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0, v0}, Landroidx/leanback/widget/f;->e4(IIZI)V

    return-void
.end method

.method public E2()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->I:I

    return v0
.end method

.method public F1(ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->b3()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 v0, v0, -0x4

    or-int/lit8 v0, v0, 0x2

    iput v0, p0, Landroidx/leanback/widget/f;->E:I

    invoke-direct {p0, p2, p3}, Landroidx/leanback/widget/f;->y3(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    iget p2, p0, Landroidx/leanback/widget/f;->w:I

    const/4 p3, 0x1

    if-ne p2, p3, :cond_1

    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->z3(I)I

    move-result p1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->A3(I)I

    move-result p1

    :goto_0
    invoke-direct {p0}, Landroidx/leanback/widget/f;->j3()V

    iget p2, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 p2, p2, -0x4

    iput p2, p0, Landroidx/leanback/widget/f;->E:I

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method F3(Landroid/view/View;Z)V
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    :goto_0
    invoke-direct {p0, p1, v0, p2}, Landroidx/leanback/widget/f;->D3(Landroid/view/View;Landroid/view/View;Z)V

    return-void
.end method

.method public G()Landroidx/recyclerview/widget/RecyclerView$p;
    .locals 2

    new-instance v0, Landroidx/leanback/widget/f$e;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/leanback/widget/f$e;-><init>(II)V

    return-object v0
.end method

.method G2()I
    .locals 3

    iget v0, p0, Landroidx/leanback/widget/f;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->a0()I

    move-result v0

    neg-int v0, v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    if-gez v1, :cond_2

    goto :goto_0

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v2, 0x40000

    and-int/2addr v0, v2

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->s0()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    if-le v1, v0, :cond_2

    move v0, v1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->s0()I

    move-result v0

    neg-int v0, v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v2

    if-lez v2, :cond_2

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    if-gez v1, :cond_2

    :goto_0
    add-int/2addr v0, v1

    :cond_2
    :goto_1
    return v0
.end method

.method G3(Landroid/view/View;ZII)V
    .locals 7

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    :goto_0
    move-object v3, v0

    move-object v1, p0

    move-object v2, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Landroidx/leanback/widget/f;->E3(Landroid/view/View;Landroid/view/View;ZII)V

    return-void
.end method

.method public H(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/RecyclerView$p;
    .locals 1

    new-instance v0, Landroidx/leanback/widget/f$e;

    invoke-direct {v0, p1, p2}, Landroidx/leanback/widget/f$e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method H2(Landroid/view/View;Landroid/view/View;)I
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/leanback/widget/f$e;

    invoke-virtual {v1}, Landroidx/leanback/widget/f$e;->k()Landroidx/leanback/widget/j;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroidx/leanback/widget/j;->a()[Landroidx/leanback/widget/j$a;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x1

    if-le v2, v3, :cond_3

    :goto_0
    if-eq p2, p1, :cond_3

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v2

    const/4 v4, -0x1

    if-eq v2, v4, :cond_2

    const/4 v4, 0x1

    :goto_1
    array-length v5, v1

    if-ge v4, v5, :cond_2

    aget-object v5, v1, v4

    invoke-virtual {v5}, Landroidx/leanback/widget/j$a;->a()I

    move-result v5

    if-ne v5, v2, :cond_1

    return v4

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    goto :goto_0

    :cond_3
    :goto_2
    return v0
.end method

.method H3(I)V
    .locals 3

    iput p1, p0, Landroidx/leanback/widget/f;->O:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v1

    iget v2, p0, Landroidx/leanback/widget/f;->O:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public I(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/RecyclerView$p;
    .locals 1

    instance-of v0, p1, Landroidx/leanback/widget/f$e;

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/leanback/widget/f$e;

    check-cast p1, Landroidx/leanback/widget/f$e;

    invoke-direct {v0, p1}, Landroidx/leanback/widget/f$e;-><init>(Landroidx/leanback/widget/f$e;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView$p;

    if-eqz v0, :cond_1

    new-instance v0, Landroidx/leanback/widget/f$e;

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView$p;

    invoke-direct {v0, p1}, Landroidx/leanback/widget/f$e;-><init>(Landroidx/recyclerview/widget/RecyclerView$p;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_2

    new-instance v0, Landroidx/leanback/widget/f$e;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroidx/leanback/widget/f$e;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_2
    new-instance v0, Landroidx/leanback/widget/f$e;

    invoke-direct {v0, p1}, Landroidx/leanback/widget/f$e;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public I2()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->J:I

    return v0
.end method

.method I3(I)V
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->g0:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    if-ltz v0, :cond_1

    iput p1, p0, Landroidx/leanback/widget/f;->g0:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->A1()V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ExtraLayoutSpace must >= 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method J2()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GridLayoutManager:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getId()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public J3(ZZ)V
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v0, v0, -0x1801

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/16 p1, 0x800

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, v0

    if-eqz p2, :cond_1

    const/16 v1, 0x1000

    :cond_1
    or-int/2addr p1, v1

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    return-void
.end method

.method public K0(Landroidx/recyclerview/widget/RecyclerView$g;Landroidx/recyclerview/widget/RecyclerView$g;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Landroidx/leanback/widget/f;->X1()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/leanback/widget/f;->I:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/leanback/widget/f;->M:I

    iget-object v0, p0, Landroidx/leanback/widget/f;->i0:Landroidx/leanback/widget/z;

    invoke-virtual {v0}, Landroidx/leanback/widget/z;->b()V

    :cond_0
    instance-of v0, p2, Landroidx/leanback/widget/c;

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, Landroidx/leanback/widget/c;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Landroidx/leanback/widget/f;->j0:Landroidx/leanback/widget/c;

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->K0(Landroidx/recyclerview/widget/RecyclerView$g;Landroidx/recyclerview/widget/RecyclerView$g;)V

    return-void
.end method

.method public K2()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->V:I

    return v0
.end method

.method public K3(ZZ)V
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v0, v0, -0x6001

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/16 p1, 0x2000

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, v0

    if-eqz p2, :cond_1

    const/16 v1, 0x4000

    :cond_1
    or-int/2addr p1, v1

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    return-void
.end method

.method public L0(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/ArrayList;II)Z
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;II)Z"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    move/from16 v3, p4

    iget v4, v0, Landroidx/leanback/widget/f;->E:I

    const v5, 0x8000

    and-int/2addr v4, v5

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    return v5

    :cond_0
    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->hasFocus()Z

    move-result v4

    if-eqz v4, :cond_1b

    iget-object v4, v0, Landroidx/leanback/widget/f;->L:Landroidx/leanback/widget/f$g;

    if-eqz v4, :cond_1

    return v5

    :cond_1
    invoke-direct {v0, v2}, Landroidx/leanback/widget/f;->v2(I)I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->findFocus()Landroid/view/View;

    move-result-object v7

    invoke-direct {v0, v7}, Landroidx/leanback/widget/f;->c2(Landroid/view/View;)I

    move-result v7

    invoke-direct {v0, v7}, Landroidx/leanback/widget/f;->h2(I)I

    move-result v8

    const/4 v9, -0x1

    if-ne v8, v9, :cond_2

    const/4 v10, 0x0

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v10

    :goto_0
    if-eqz v10, :cond_3

    invoke-virtual {v10, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    :cond_3
    iget-object v11, v0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    if-eqz v11, :cond_1a

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v11

    if-nez v11, :cond_4

    goto/16 :goto_a

    :cond_4
    const/4 v11, 0x2

    const/4 v12, 0x3

    if-eq v4, v12, :cond_5

    if-ne v4, v11, :cond_6

    :cond_5
    iget-object v13, v0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v13}, Landroidx/leanback/widget/e;->r()I

    move-result v13

    if-gt v13, v5, :cond_6

    return v5

    :cond_6
    iget-object v13, v0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    if-eqz v13, :cond_7

    if-eqz v10, :cond_7

    invoke-virtual {v13, v8}, Landroidx/leanback/widget/e;->q(I)Landroidx/leanback/widget/e$a;

    move-result-object v13

    iget v13, v13, Landroidx/leanback/widget/e$a;->a:I

    goto :goto_1

    :cond_7
    const/4 v13, -0x1

    :goto_1
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v14

    if-eq v4, v5, :cond_9

    if-ne v4, v12, :cond_8

    goto :goto_2

    :cond_8
    const/4 v15, -0x1

    goto :goto_3

    :cond_9
    :goto_2
    const/4 v15, 0x1

    :goto_3
    if-lez v15, :cond_a

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v16

    add-int/lit8 v16, v16, -0x1

    move/from16 v6, v16

    goto :goto_4

    :cond_a
    const/4 v6, 0x0

    :goto_4
    if-ne v7, v9, :cond_c

    if-lez v15, :cond_b

    const/16 v16, 0x0

    goto :goto_5

    :cond_b
    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v7

    sub-int/2addr v7, v5

    move/from16 v16, v7

    goto :goto_5

    :cond_c
    add-int v16, v7, v15

    :goto_5
    move/from16 v7, v16

    :goto_6
    if-lez v15, :cond_d

    if-gt v7, v6, :cond_22

    goto :goto_7

    :cond_d
    if-lt v7, v6, :cond_22

    :goto_7
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v9

    invoke-virtual {v9}, Landroid/view/View;->getVisibility()I

    move-result v16

    if-nez v16, :cond_19

    invoke-virtual {v9}, Landroid/view/View;->hasFocusable()Z

    move-result v16

    if-nez v16, :cond_e

    goto/16 :goto_9

    :cond_e
    if-nez v10, :cond_f

    invoke-virtual {v9, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-le v9, v14, :cond_19

    goto/16 :goto_d

    :cond_f
    invoke-direct {v0, v7}, Landroidx/leanback/widget/f;->h2(I)I

    move-result v11

    iget-object v12, v0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v12, v11}, Landroidx/leanback/widget/e;->q(I)Landroidx/leanback/widget/e$a;

    move-result-object v12

    if-nez v12, :cond_11

    :cond_10
    :goto_8
    const/4 v11, 0x2

    goto :goto_9

    :cond_11
    if-ne v4, v5, :cond_12

    iget v12, v12, Landroidx/leanback/widget/e$a;->a:I

    if-ne v12, v13, :cond_10

    if-le v11, v8, :cond_10

    invoke-virtual {v9, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-le v9, v14, :cond_10

    goto/16 :goto_d

    :cond_12
    if-nez v4, :cond_13

    iget v12, v12, Landroidx/leanback/widget/e$a;->a:I

    if-ne v12, v13, :cond_10

    if-ge v11, v8, :cond_10

    invoke-virtual {v9, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-le v9, v14, :cond_10

    goto/16 :goto_d

    :cond_13
    const/4 v11, 0x3

    if-ne v4, v11, :cond_16

    iget v12, v12, Landroidx/leanback/widget/e$a;->a:I

    if-ne v12, v13, :cond_14

    goto :goto_8

    :cond_14
    if-ge v12, v13, :cond_15

    goto/16 :goto_d

    :cond_15
    invoke-virtual {v9, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    goto :goto_8

    :cond_16
    const/4 v11, 0x2

    if-ne v4, v11, :cond_19

    iget v12, v12, Landroidx/leanback/widget/e$a;->a:I

    if-ne v12, v13, :cond_17

    goto :goto_9

    :cond_17
    if-le v12, v13, :cond_18

    goto/16 :goto_d

    :cond_18
    invoke-virtual {v9, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    :cond_19
    :goto_9
    add-int/2addr v7, v15

    const/4 v12, 0x3

    goto :goto_6

    :cond_1a
    :goto_a
    return v5

    :cond_1b
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v4

    iget v6, v0, Landroidx/leanback/widget/f;->c0:I

    if-eqz v6, :cond_1f

    iget-object v6, v0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v6}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/leanback/widget/a0$a;->g()I

    move-result v6

    iget-object v7, v0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v7}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/leanback/widget/a0$a;->c()I

    move-result v7

    add-int/2addr v7, v6

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v8

    const/4 v9, 0x0

    :goto_b
    if-ge v9, v8, :cond_1d

    invoke-virtual {v0, v9}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v10

    invoke-virtual {v10}, Landroid/view/View;->getVisibility()I

    move-result v11

    if-nez v11, :cond_1c

    invoke-virtual {v0, v10}, Landroidx/leanback/widget/f;->R2(Landroid/view/View;)I

    move-result v11

    if-lt v11, v6, :cond_1c

    invoke-virtual {v0, v10}, Landroidx/leanback/widget/f;->Q2(Landroid/view/View;)I

    move-result v11

    if-gt v11, v7, :cond_1c

    invoke-virtual {v10, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    :cond_1c
    add-int/lit8 v9, v9, 0x1

    goto :goto_b

    :cond_1d
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ne v6, v4, :cond_20

    invoke-virtual/range {p0 .. p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v6

    const/4 v7, 0x0

    :goto_c
    if-ge v7, v6, :cond_20

    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v9

    if-nez v9, :cond_1e

    invoke-virtual {v8, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    :cond_1e
    add-int/lit8 v7, v7, 0x1

    goto :goto_c

    :cond_1f
    iget v6, v0, Landroidx/leanback/widget/f;->I:I

    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_20

    invoke-virtual {v6, v1, v2, v3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    :cond_20
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-eq v2, v4, :cond_21

    return v5

    :cond_21
    invoke-virtual/range {p1 .. p1}, Landroid/view/ViewGroup;->isFocusable()Z

    move-result v2

    if-eqz v2, :cond_22

    move-object/from16 v2, p1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_22
    :goto_d
    return v5
.end method

.method public L3(I)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/f;->c0:I

    return-void
.end method

.method M3(Z)V
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    const v1, -0x8001

    and-int/2addr v0, v1

    if-eqz p1, :cond_0

    const p1, 0x8000

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    or-int/2addr p1, v0

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    return-void
.end method

.method public N3(I)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/f;->Y:I

    return-void
.end method

.method public O3(I)V
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->w:I

    iput p1, p0, Landroidx/leanback/widget/f;->U:I

    if-nez v0, :cond_0

    iput p1, p0, Landroidx/leanback/widget/f;->W:I

    goto :goto_0

    :cond_0
    iput p1, p0, Landroidx/leanback/widget/f;->X:I

    :goto_0
    return-void
.end method

.method protected P2(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->D:Landroidx/recyclerview/widget/RecyclerView$v;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$v;->o(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public P3(I)V
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->e0:Landroidx/leanback/widget/i;

    invoke-virtual {v0}, Landroidx/leanback/widget/i;->a()Landroidx/leanback/widget/i$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/j$a;->f(I)V

    invoke-direct {p0}, Landroidx/leanback/widget/f;->n4()V

    return-void
.end method

.method public Q1(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;I)V
    .locals 0

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-virtual {p0, p3, p1, p2, p1}, Landroidx/leanback/widget/f;->e4(IIZI)V

    return-void
.end method

.method Q2(Landroid/view/View;)I
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->x:Landroidx/recyclerview/widget/j;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/j;->d(Landroid/view/View;)I

    move-result p1

    return p1
.end method

.method public Q3(F)V
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->e0:Landroidx/leanback/widget/i;

    invoke-virtual {v0}, Landroidx/leanback/widget/i;->a()Landroidx/leanback/widget/i$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/j$a;->g(F)V

    invoke-direct {p0}, Landroidx/leanback/widget/f;->n4()V

    return-void
.end method

.method public R(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/f;->w:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->r()I

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->R(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I

    move-result p1

    return p1
.end method

.method public R1(Landroidx/recyclerview/widget/RecyclerView$z;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->l4()V

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->R1(Landroidx/recyclerview/widget/RecyclerView$z;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$z;->h()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Landroidx/leanback/widget/f$d;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/leanback/widget/f$d;

    iput-object p1, p0, Landroidx/leanback/widget/f;->K:Landroidx/leanback/widget/f$d;

    instance-of v0, p1, Landroidx/leanback/widget/f$g;

    if-eqz v0, :cond_1

    check-cast p1, Landroidx/leanback/widget/f$g;

    iput-object p1, p0, Landroidx/leanback/widget/f;->L:Landroidx/leanback/widget/f$g;

    goto :goto_0

    :cond_0
    iput-object v1, p0, Landroidx/leanback/widget/f;->K:Landroidx/leanback/widget/f$d;

    :cond_1
    iput-object v1, p0, Landroidx/leanback/widget/f;->L:Landroidx/leanback/widget/f$g;

    :goto_0
    return-void
.end method

.method R2(Landroid/view/View;)I
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->x:Landroidx/recyclerview/widget/j;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/j;->g(Landroid/view/View;)I

    move-result p1

    return p1
.end method

.method public R3(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->e0:Landroidx/leanback/widget/i;

    invoke-virtual {v0}, Landroidx/leanback/widget/i;->a()Landroidx/leanback/widget/i$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/j$a;->h(Z)V

    invoke-direct {p0}, Landroidx/leanback/widget/f;->n4()V

    return-void
.end method

.method public S(Landroid/view/View;)I
    .locals 1

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->S(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/leanback/widget/f$e;

    iget p1, p1, Landroidx/leanback/widget/f$e;->h:I

    sub-int/2addr v0, p1

    return v0
.end method

.method S2(Landroid/view/View;)I
    .locals 1

    sget-object v0, Landroidx/leanback/widget/f;->s:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Landroidx/leanback/widget/f;->T(Landroid/view/View;Landroid/graphics/Rect;)V

    iget p1, p0, Landroidx/leanback/widget/f;->w:I

    if-nez p1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result p1

    :goto_0
    return p1
.end method

.method public S3(I)V
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->e0:Landroidx/leanback/widget/i;

    invoke-virtual {v0}, Landroidx/leanback/widget/i;->a()Landroidx/leanback/widget/i$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/j$a;->i(I)V

    invoke-direct {p0}, Landroidx/leanback/widget/f;->n4()V

    return-void
.end method

.method public T(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 2

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->T(Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/leanback/widget/f$e;

    iget v0, p2, Landroid/graphics/Rect;->left:I

    iget v1, p1, Landroidx/leanback/widget/f$e;->e:I

    add-int/2addr v0, v1

    iput v0, p2, Landroid/graphics/Rect;->left:I

    iget v0, p2, Landroid/graphics/Rect;->top:I

    iget v1, p1, Landroidx/leanback/widget/f$e;->f:I

    add-int/2addr v0, v1

    iput v0, p2, Landroid/graphics/Rect;->top:I

    iget v0, p2, Landroid/graphics/Rect;->right:I

    iget v1, p1, Landroidx/leanback/widget/f$e;->g:I

    sub-int/2addr v0, v1

    iput v0, p2, Landroid/graphics/Rect;->right:I

    iget v0, p2, Landroid/graphics/Rect;->bottom:I

    iget p1, p1, Landroidx/leanback/widget/f$e;->h:I

    sub-int/2addr v0, p1

    iput v0, p2, Landroid/graphics/Rect;->bottom:I

    return-void
.end method

.method public T0(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Lb/g/k/b0/c;)V
    .locals 5

    invoke-direct {p0, p1, p2}, Landroidx/leanback/widget/f;->y3(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->c()I

    move-result v0

    iget v1, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v2, 0x40000

    and-int/2addr v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/16 v4, 0x17

    if-le v0, v3, :cond_4

    invoke-virtual {p0, v2}, Landroidx/leanback/widget/f;->e3(I)Z

    move-result v2

    if-nez v2, :cond_4

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v2, v4, :cond_3

    iget v2, p0, Landroidx/leanback/widget/f;->w:I

    if-nez v2, :cond_2

    if-eqz v1, :cond_1

    sget-object v2, Lb/g/k/b0/c$a;->B:Lb/g/k/b0/c$a;

    goto :goto_1

    :cond_1
    sget-object v2, Lb/g/k/b0/c$a;->z:Lb/g/k/b0/c$a;

    goto :goto_1

    :cond_2
    sget-object v2, Lb/g/k/b0/c$a;->y:Lb/g/k/b0/c$a;

    :goto_1
    invoke-virtual {p3, v2}, Lb/g/k/b0/c;->b(Lb/g/k/b0/c$a;)V

    goto :goto_2

    :cond_3
    const/16 v2, 0x2000

    invoke-virtual {p3, v2}, Lb/g/k/b0/c;->a(I)V

    :goto_2
    invoke-virtual {p3, v3}, Lb/g/k/b0/c;->t0(Z)V

    :cond_4
    if-le v0, v3, :cond_8

    sub-int/2addr v0, v3

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/f;->e3(I)Z

    move-result v0

    if-nez v0, :cond_8

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, v4, :cond_7

    iget v0, p0, Landroidx/leanback/widget/f;->w:I

    if-nez v0, :cond_6

    if-eqz v1, :cond_5

    sget-object v0, Lb/g/k/b0/c$a;->z:Lb/g/k/b0/c$a;

    goto :goto_3

    :cond_5
    sget-object v0, Lb/g/k/b0/c$a;->B:Lb/g/k/b0/c$a;

    goto :goto_3

    :cond_6
    sget-object v0, Lb/g/k/b0/c$a;->A:Lb/g/k/b0/c$a;

    :goto_3
    invoke-virtual {p3, v0}, Lb/g/k/b0/c;->b(Lb/g/k/b0/c$a;)V

    goto :goto_4

    :cond_7
    const/16 v0, 0x1000

    invoke-virtual {p3, v0}, Lb/g/k/b0/c;->a(I)V

    :goto_4
    invoke-virtual {p3, v3}, Lb/g/k/b0/c;->t0(Z)V

    :cond_8
    invoke-virtual {p0, p1, p2}, Landroidx/leanback/widget/f;->o0(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I

    move-result v0

    invoke-virtual {p0, p1, p2}, Landroidx/leanback/widget/f;->R(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I

    move-result v1

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->A0(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)Z

    move-result v2

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->p0(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lb/g/k/b0/c$b;->b(IIZI)Lb/g/k/b0/c$b;

    move-result-object p1

    invoke-virtual {p3, p1}, Lb/g/k/b0/c;->c0(Ljava/lang/Object;)V

    invoke-direct {p0}, Landroidx/leanback/widget/f;->j3()V

    return-void
.end method

.method public T1()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public T2()I
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/a0$a;->j()I

    move-result v0

    return v0
.end method

.method public T3(I)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/f;->U:I

    iput p1, p0, Landroidx/leanback/widget/f;->V:I

    iput p1, p0, Landroidx/leanback/widget/f;->X:I

    iput p1, p0, Landroidx/leanback/widget/f;->W:I

    return-void
.end method

.method public U(Landroid/view/View;)I
    .locals 1

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->U(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/leanback/widget/f$e;

    iget p1, p1, Landroidx/leanback/widget/f$e;->e:I

    add-int/2addr v0, p1

    return v0
.end method

.method public U2()I
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/a0$a;->k()I

    move-result v0

    return v0
.end method

.method public U3(Z)V
    .locals 3

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v1, v0, 0x200

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eq v1, p1, :cond_2

    and-int/lit16 v0, v0, -0x201

    if-eqz p1, :cond_1

    const/16 v2, 0x200

    :cond_1
    or-int p1, v0, v2

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->A1()V

    :cond_2
    return-void
.end method

.method public V0(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;Landroid/view/View;Lb/g/k/b0/c;)V
    .locals 6

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iget-object p2, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    if-eqz p2, :cond_4

    instance-of p2, p1, Landroidx/leanback/widget/f$e;

    if-nez p2, :cond_0

    goto :goto_2

    :cond_0
    check-cast p1, Landroidx/leanback/widget/f$e;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I

    move-result p1

    if-ltz p1, :cond_1

    iget-object p2, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {p2, p1}, Landroidx/leanback/widget/e;->s(I)I

    move-result p2

    move v2, p2

    goto :goto_0

    :cond_1
    const/4 p2, -0x1

    const/4 v2, -0x1

    :goto_0
    if-gez v2, :cond_2

    return-void

    :cond_2
    iget-object p2, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {p2}, Landroidx/leanback/widget/e;->r()I

    move-result p2

    div-int/2addr p1, p2

    iget p2, p0, Landroidx/leanback/widget/f;->w:I

    const/4 v1, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-nez p2, :cond_3

    move v0, v2

    move v2, p1

    goto :goto_1

    :cond_3
    move v0, p1

    :goto_1
    invoke-static/range {v0 .. v5}, Lb/g/k/b0/c$c;->a(IIIIZZ)Lb/g/k/b0/c$c;

    move-result-object p1

    invoke-virtual {p4, p1}, Lb/g/k/b0/c;->d0(Ljava/lang/Object;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public V2()F
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/a0$a;->l()F

    move-result v0

    return v0
.end method

.method public V3(I)V
    .locals 0

    if-ltz p1, :cond_0

    iput p1, p0, Landroidx/leanback/widget/f;->a0:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public W0(Landroid/view/View;I)Landroid/view/View;
    .locals 7

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    const v1, 0x8000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq p2, v3, :cond_2

    if-ne p2, v4, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0, v1, p1, p2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    goto :goto_5

    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/leanback/widget/f;->m()Z

    move-result v5

    if-eqz v5, :cond_4

    if-ne p2, v3, :cond_3

    const/16 v1, 0x82

    goto :goto_1

    :cond_3
    const/16 v1, 0x21

    :goto_1
    iget-object v5, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0, v5, p1, v1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    :cond_4
    invoke-virtual {p0}, Landroidx/leanback/widget/f;->l()Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->d0()I

    move-result v1

    if-ne v1, v4, :cond_5

    const/4 v1, 0x1

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    :goto_2
    if-ne p2, v3, :cond_6

    const/4 v5, 0x1

    goto :goto_3

    :cond_6
    const/4 v5, 0x0

    :goto_3
    xor-int/2addr v1, v5

    if-eqz v1, :cond_7

    const/16 v1, 0x42

    goto :goto_4

    :cond_7
    const/16 v1, 0x11

    :goto_4
    iget-object v5, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0, v5, p1, v1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    goto :goto_5

    :cond_8
    move-object v0, v1

    :goto_5
    if-eqz v0, :cond_9

    return-object v0

    :cond_9
    iget-object v1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result v1

    const/high16 v5, 0x60000

    if-ne v1, v5, :cond_a

    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/view/ViewParent;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_a
    invoke-direct {p0, p2}, Landroidx/leanback/widget/f;->v2(I)I

    move-result v1

    iget-object v5, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    move-result v5

    if-eqz v5, :cond_b

    const/4 v5, 0x1

    goto :goto_6

    :cond_b
    const/4 v5, 0x0

    :goto_6
    const/high16 v6, 0x20000

    if-ne v1, v4, :cond_e

    if-nez v5, :cond_c

    iget v1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v1, v1, 0x1000

    if-nez v1, :cond_d

    :cond_c
    move-object v0, p1

    :cond_d
    iget v1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/2addr v1, v6

    if-eqz v1, :cond_14

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->a3()Z

    move-result v1

    if-nez v1, :cond_14

    invoke-direct {p0, v4}, Landroidx/leanback/widget/f;->t3(Z)V

    goto :goto_7

    :cond_e
    if-nez v1, :cond_11

    if-nez v5, :cond_f

    iget v1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v1, v1, 0x800

    if-nez v1, :cond_10

    :cond_f
    move-object v0, p1

    :cond_10
    iget v1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/2addr v1, v6

    if-eqz v1, :cond_14

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->Z2()Z

    move-result v1

    if-nez v1, :cond_14

    invoke-direct {p0, v2}, Landroidx/leanback/widget/f;->t3(Z)V

    goto :goto_7

    :cond_11
    const/4 v2, 0x3

    if-ne v1, v2, :cond_12

    if-nez v5, :cond_13

    iget v1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v1, v1, 0x4000

    if-nez v1, :cond_14

    goto :goto_7

    :cond_12
    if-ne v1, v3, :cond_14

    if-nez v5, :cond_13

    iget v1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v1, v1, 0x2000

    if-nez v1, :cond_14

    :cond_13
    :goto_7
    move-object v0, p1

    :cond_14
    if-eqz v0, :cond_15

    return-object v0

    :cond_15
    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/view/ViewParent;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_16

    return-object p2

    :cond_16
    if-eqz p1, :cond_17

    goto :goto_8

    :cond_17
    iget-object p1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    :goto_8
    return-object p1
.end method

.method W1(Landroid/view/View;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->v0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->hasFocusable()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method W2(Landroidx/recyclerview/widget/RecyclerView;ILandroid/graphics/Rect;)Z
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/f;->c0:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    invoke-direct {p0, p1, p2, p3}, Landroidx/leanback/widget/f;->X2(Landroidx/recyclerview/widget/RecyclerView;ILandroid/graphics/Rect;)Z

    move-result p1

    return p1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/leanback/widget/f;->Y2(Landroidx/recyclerview/widget/RecyclerView;ILandroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method W3(Landroidx/leanback/widget/m;)V
    .locals 0

    iput-object p1, p0, Landroidx/leanback/widget/f;->H:Landroidx/leanback/widget/m;

    return-void
.end method

.method public X(Landroid/view/View;)I
    .locals 1

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->X(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/leanback/widget/f$e;

    iget p1, p1, Landroidx/leanback/widget/f$e;->g:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public X0(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 1

    iget p1, p0, Landroidx/leanback/widget/f;->I:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget-object p1, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/leanback/widget/e;->m()I

    move-result p1

    if-ltz p1, :cond_0

    iget p1, p0, Landroidx/leanback/widget/f;->M:I

    const/high16 v0, -0x80000000

    if-eq p1, v0, :cond_0

    iget v0, p0, Landroidx/leanback/widget/f;->I:I

    add-int/2addr v0, p1

    if-gt p2, v0, :cond_0

    add-int/2addr p1, p3

    iput p1, p0, Landroidx/leanback/widget/f;->M:I

    :cond_0
    iget-object p1, p0, Landroidx/leanback/widget/f;->i0:Landroidx/leanback/widget/z;

    invoke-virtual {p1}, Landroidx/leanback/widget/z;->b()V

    return-void
.end method

.method public X3(Landroidx/leanback/widget/n;)V
    .locals 0

    iput-object p1, p0, Landroidx/leanback/widget/f;->F:Landroidx/leanback/widget/n;

    return-void
.end method

.method public Y(Landroid/view/View;)I
    .locals 1

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->Y(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/leanback/widget/f$e;

    iget p1, p1, Landroidx/leanback/widget/f$e;->f:I

    add-int/2addr v0, p1

    return v0
.end method

.method public Y0(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Landroidx/leanback/widget/f;->M:I

    iget-object p1, p0, Landroidx/leanback/widget/f;->i0:Landroidx/leanback/widget/z;

    invoke-virtual {p1}, Landroidx/leanback/widget/z;->b()V

    return-void
.end method

.method Y1()V
    .locals 11

    iget-object v0, p0, Landroidx/leanback/widget/f;->F:Landroidx/leanback/widget/n;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->c3()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/f;->I:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    move-object v5, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    :goto_0
    const/4 v0, 0x0

    if-eqz v5, :cond_4

    iget-object v1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v1, v5}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object v1

    iget-object v3, p0, Landroidx/leanback/widget/f;->F:Landroidx/leanback/widget/n;

    if-eqz v3, :cond_3

    iget-object v4, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    iget v6, p0, Landroidx/leanback/widget/f;->I:I

    if-nez v1, :cond_2

    const-wide/16 v7, -0x1

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->k()J

    move-result-wide v7

    :goto_1
    invoke-interface/range {v3 .. v8}, Landroidx/leanback/widget/n;->a(Landroid/view/ViewGroup;Landroid/view/View;IJ)V

    :cond_3
    iget-object v2, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    iget v3, p0, Landroidx/leanback/widget/f;->I:I

    iget v4, p0, Landroidx/leanback/widget/f;->J:I

    invoke-virtual {p0, v2, v1, v3, v4}, Landroidx/leanback/widget/f;->d2(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;II)V

    goto :goto_2

    :cond_4
    iget-object v5, p0, Landroidx/leanback/widget/f;->F:Landroidx/leanback/widget/n;

    if-eqz v5, :cond_5

    iget-object v6, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    const/4 v7, 0x0

    const/4 v8, -0x1

    const-wide/16 v9, -0x1

    invoke-interface/range {v5 .. v10}, Landroidx/leanback/widget/n;->a(Landroid/view/ViewGroup;Landroid/view/View;IJ)V

    :cond_5
    iget-object v3, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {p0, v3, v1, v2, v0}, Landroidx/leanback/widget/f;->d2(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;II)V

    :goto_2
    iget v1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x1

    if-eq v1, v2, :cond_7

    iget-object v1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->isLayoutRequested()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v1

    :goto_3
    if-ge v0, v1, :cond_7

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->isLayoutRequested()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-direct {p0}, Landroidx/leanback/widget/f;->g2()V

    goto :goto_4

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    return-void
.end method

.method public Y3(Landroidx/leanback/widget/o;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/leanback/widget/f;->G:Ljava/util/ArrayList;

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/leanback/widget/f;->G:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/leanback/widget/f;->G:Ljava/util/ArrayList;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :goto_0
    iget-object v0, p0, Landroidx/leanback/widget/f;->G:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public Z0(Landroidx/recyclerview/widget/RecyclerView;III)V
    .locals 2

    iget p1, p0, Landroidx/leanback/widget/f;->I:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    iget v0, p0, Landroidx/leanback/widget/f;->M:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_2

    add-int/2addr p1, v0

    if-gt p2, p1, :cond_0

    add-int v1, p2, p4

    if-ge p1, v1, :cond_0

    sub-int/2addr p3, p2

    add-int/2addr v0, p3

    :goto_0
    iput v0, p0, Landroidx/leanback/widget/f;->M:I

    goto :goto_1

    :cond_0
    if-ge p2, p1, :cond_1

    sub-int v1, p1, p4

    if-le p3, v1, :cond_1

    sub-int/2addr v0, p4

    goto :goto_0

    :cond_1
    if-le p2, p1, :cond_2

    if-ge p3, p1, :cond_2

    add-int/2addr v0, p4

    goto :goto_0

    :cond_2
    :goto_1
    iget-object p1, p0, Landroidx/leanback/widget/f;->i0:Landroidx/leanback/widget/z;

    invoke-virtual {p1}, Landroidx/leanback/widget/z;->b()V

    return-void
.end method

.method Z1()V
    .locals 10

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->c3()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/f;->I:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object v0

    iget-object v1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    iget v2, p0, Landroidx/leanback/widget/f;->I:I

    iget v3, p0, Landroidx/leanback/widget/f;->J:I

    invoke-virtual {p0, v1, v0, v2, v3}, Landroidx/leanback/widget/f;->e2(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;II)V

    goto :goto_1

    :cond_2
    iget-object v4, p0, Landroidx/leanback/widget/f;->F:Landroidx/leanback/widget/n;

    if-eqz v4, :cond_3

    iget-object v5, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    const/4 v6, 0x0

    const/4 v7, -0x1

    const-wide/16 v8, -0x1

    invoke-interface/range {v4 .. v9}, Landroidx/leanback/widget/n;->a(Landroid/view/ViewGroup;Landroid/view/View;IJ)V

    :cond_3
    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    const/4 v3, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Landroidx/leanback/widget/f;->e2(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;II)V

    :goto_1
    return-void
.end method

.method Z2()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->c0()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->X(I)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public Z3(I)V
    .locals 1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/leanback/widget/f;->w:I

    invoke-static {p0, p1}, Landroidx/recyclerview/widget/j;->b(Landroidx/recyclerview/widget/RecyclerView$o;I)Landroidx/recyclerview/widget/j;

    move-result-object v0

    iput-object v0, p0, Landroidx/leanback/widget/f;->x:Landroidx/recyclerview/widget/j;

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/a0;->d(I)V

    iget-object v0, p0, Landroidx/leanback/widget/f;->e0:Landroidx/leanback/widget/i;

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/i;->b(I)V

    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    or-int/lit16 p1, p1, 0x100

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    return-void
.end method

.method public a1(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 4

    iget p1, p0, Landroidx/leanback/widget/f;->I:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    iget-object p1, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroidx/leanback/widget/e;->m()I

    move-result p1

    if-ltz p1, :cond_1

    iget p1, p0, Landroidx/leanback/widget/f;->M:I

    const/high16 v0, -0x80000000

    if-eq p1, v0, :cond_1

    iget v1, p0, Landroidx/leanback/widget/f;->I:I

    add-int v2, v1, p1

    if-gt p2, v2, :cond_1

    add-int v3, p2, p3

    if-le v3, v2, :cond_0

    sub-int/2addr p2, v2

    add-int/2addr p1, p2

    iput p1, p0, Landroidx/leanback/widget/f;->M:I

    add-int/2addr v1, p1

    iput v1, p0, Landroidx/leanback/widget/f;->I:I

    iput v0, p0, Landroidx/leanback/widget/f;->M:I

    goto :goto_0

    :cond_0
    sub-int/2addr p1, p3

    iput p1, p0, Landroidx/leanback/widget/f;->M:I

    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/leanback/widget/f;->i0:Landroidx/leanback/widget/z;

    invoke-virtual {p1}, Landroidx/leanback/widget/z;->b()V

    return-void
.end method

.method a3()Z
    .locals 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->c0()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v2, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    sub-int/2addr v0, v1

    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->X(I)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method public a4(Z)V
    .locals 4

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v1, 0x10000

    and-int v2, v0, v1

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eq v2, p1, :cond_2

    const v2, -0x10001

    and-int/2addr v0, v2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    or-int/2addr v0, v1

    iput v0, p0, Landroidx/leanback/widget/f;->E:I

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->A1()V

    :cond_2
    return-void
.end method

.method public b1(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    add-int/2addr p3, p2

    :goto_0
    if-ge p2, p3, :cond_0

    iget-object p1, p0, Landroidx/leanback/widget/f;->i0:Landroidx/leanback/widget/z;

    invoke-virtual {p1, p2}, Landroidx/leanback/widget/z;->h(I)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method b2()V
    .locals 8

    iget-object v0, p0, Landroidx/leanback/widget/f;->D:Landroidx/recyclerview/widget/RecyclerView$v;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$v;->k()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v2, p0, Landroidx/leanback/widget/f;->C:[I

    if-eqz v2, :cond_1

    array-length v3, v2

    if-le v1, v3, :cond_4

    :cond_1
    if-nez v2, :cond_2

    const/16 v2, 0x10

    goto :goto_0

    :cond_2
    array-length v2, v2

    :goto_0
    if-ge v2, v1, :cond_3

    shl-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    new-array v2, v2, [I

    iput-object v2, p0, Landroidx/leanback/widget/f;->C:[I

    :cond_4
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v3, v1, :cond_6

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/RecyclerView$d0;

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$d0;->j()I

    move-result v5

    if-ltz v5, :cond_5

    iget-object v6, p0, Landroidx/leanback/widget/f;->C:[I

    add-int/lit8 v7, v4, 0x1

    aput v5, v6, v4

    move v4, v7

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    if-lez v4, :cond_7

    iget-object v0, p0, Landroidx/leanback/widget/f;->C:[I

    invoke-static {v0, v2, v4}, Ljava/util/Arrays;->sort([III)V

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    iget-object v1, p0, Landroidx/leanback/widget/f;->C:[I

    iget-object v2, p0, Landroidx/leanback/widget/f;->B:Landroid/util/SparseIntArray;

    invoke-virtual {v0, v1, v4, v2}, Landroidx/leanback/widget/e;->h([IILandroid/util/SparseIntArray;)V

    :cond_7
    iget-object v0, p0, Landroidx/leanback/widget/f;->B:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method protected b3()Z
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public b4(I)V
    .locals 3

    if-gez p1, :cond_1

    const/4 v0, -0x2

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid row height: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iput p1, p0, Landroidx/leanback/widget/f;->Q:I

    return-void
.end method

.method c3()Z
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->G:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c4(Z)V
    .locals 5

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v1, 0x20000

    and-int v2, v0, v1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-eq v2, p1, :cond_2

    const v2, -0x20001

    and-int/2addr v0, v2

    if-eqz p1, :cond_1

    const/high16 v4, 0x20000

    :cond_1
    or-int p1, v0, v4

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/2addr p1, v1

    if-eqz p1, :cond_2

    iget p1, p0, Landroidx/leanback/widget/f;->c0:I

    if-nez p1, :cond_2

    iget p1, p0, Landroidx/leanback/widget/f;->I:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_2

    iget v0, p0, Landroidx/leanback/widget/f;->J:I

    iget v1, p0, Landroidx/leanback/widget/f;->N:I

    invoke-virtual {p0, p1, v0, v3, v1}, Landroidx/leanback/widget/f;->C3(IIZI)V

    :cond_2
    return-void
.end method

.method public d1(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V
    .locals 12

    iget v0, p0, Landroidx/leanback/widget/f;->Z:I

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->c()I

    move-result v0

    if-gez v0, :cond_1

    return-void

    :cond_1
    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v0

    if-lez v0, :cond_2

    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    or-int/lit16 p1, p1, 0x80

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    return-void

    :cond_2
    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v1, v0, 0x200

    if-nez v1, :cond_3

    invoke-direct {p0}, Landroidx/leanback/widget/f;->X1()V

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/f;->r1(Landroidx/recyclerview/widget/RecyclerView$v;)V

    return-void

    :cond_3
    and-int/lit8 v0, v0, -0x4

    const/4 v1, 0x1

    or-int/2addr v0, v1

    iput v0, p0, Landroidx/leanback/widget/f;->E:I

    invoke-direct {p0, p1, p2}, Landroidx/leanback/widget/f;->y3(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->h()Z

    move-result p1

    const/high16 v0, -0x80000000

    const/4 v2, 0x0

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->p4()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result p1

    iget-object p2, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    if-eqz p2, :cond_a

    if-lez p1, :cond_a

    const p2, 0x7fffffff

    iget-object v1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView$d0;->n()I

    move-result v1

    iget-object v3, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    add-int/lit8 v4, p1, -0x1

    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$d0;->n()I

    move-result v3

    :goto_0
    if-ge v2, p1, :cond_8

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/leanback/widget/f$e;

    iget-object v6, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v6, v4}, Landroidx/recyclerview/widget/RecyclerView;->d0(Landroid/view/View;)I

    move-result v6

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$p;->c()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$p;->d()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v4}, Landroid/view/View;->isLayoutRequested()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v4}, Landroid/view/View;->hasFocus()Z

    move-result v7

    if-nez v7, :cond_4

    iget v7, p0, Landroidx/leanback/widget/f;->I:I

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I

    move-result v8

    if-eq v7, v8, :cond_6

    :cond_4
    invoke-virtual {v4}, Landroid/view/View;->hasFocus()Z

    move-result v7

    if-eqz v7, :cond_5

    iget v7, p0, Landroidx/leanback/widget/f;->I:I

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$p;->a()I

    move-result v5

    if-ne v7, v5, :cond_6

    :cond_5
    if-lt v6, v1, :cond_6

    if-le v6, v3, :cond_7

    :cond_6
    invoke-virtual {p0, v4}, Landroidx/leanback/widget/f;->R2(Landroid/view/View;)I

    move-result v5

    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-virtual {p0, v4}, Landroidx/leanback/widget/f;->Q2(Landroid/view/View;)I

    move-result v4

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_8
    if-le v0, p2, :cond_9

    sub-int/2addr v0, p2

    iput v0, p0, Landroidx/leanback/widget/f;->A:I

    :cond_9
    invoke-direct {p0}, Landroidx/leanback/widget/f;->V1()V

    invoke-direct {p0}, Landroidx/leanback/widget/f;->s3()V

    :cond_a
    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 p1, p1, -0x4

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    invoke-direct {p0}, Landroidx/leanback/widget/f;->j3()V

    return-void

    :cond_b
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->j()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->q4()V

    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->C0()Z

    move-result p1

    if-nez p1, :cond_d

    iget p1, p0, Landroidx/leanback/widget/f;->c0:I

    if-nez p1, :cond_d

    goto :goto_1

    :cond_d
    const/4 v1, 0x0

    :goto_1
    iget p1, p0, Landroidx/leanback/widget/f;->I:I

    const/4 v3, -0x1

    if-eq p1, v3, :cond_e

    iget v4, p0, Landroidx/leanback/widget/f;->M:I

    if-eq v4, v0, :cond_e

    add-int/2addr p1, v4

    iput p1, p0, Landroidx/leanback/widget/f;->I:I

    iput v2, p0, Landroidx/leanback/widget/f;->J:I

    :cond_e
    iput v2, p0, Landroidx/leanback/widget/f;->M:I

    iget p1, p0, Landroidx/leanback/widget/f;->I:I

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object p1

    iget v0, p0, Landroidx/leanback/widget/f;->I:I

    iget v4, p0, Landroidx/leanback/widget/f;->J:I

    iget-object v5, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->hasFocus()Z

    move-result v5

    iget-object v6, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    if-eqz v6, :cond_f

    invoke-virtual {v6}, Landroidx/leanback/widget/e;->m()I

    move-result v6

    goto :goto_2

    :cond_f
    const/4 v6, -0x1

    :goto_2
    iget-object v7, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    if-eqz v7, :cond_10

    invoke-virtual {v7}, Landroidx/leanback/widget/e;->p()I

    move-result v7

    goto :goto_3

    :cond_10
    const/4 v7, -0x1

    :goto_3
    iget v8, p0, Landroidx/leanback/widget/f;->w:I

    if-nez v8, :cond_11

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()I

    move-result v8

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->e()I

    move-result v9

    goto :goto_4

    :cond_11
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->d()I

    move-result v9

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->e()I

    move-result v8

    :goto_4
    invoke-direct {p0}, Landroidx/leanback/widget/f;->i3()Z

    move-result v10

    const/16 v11, 0x10

    if-eqz v10, :cond_12

    iget v2, p0, Landroidx/leanback/widget/f;->E:I

    or-int/lit8 v2, v2, 0x4

    iput v2, p0, Landroidx/leanback/widget/f;->E:I

    iget-object v2, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    iget v3, p0, Landroidx/leanback/widget/f;->I:I

    invoke-virtual {v2, v3}, Landroidx/leanback/widget/e;->G(I)V

    invoke-direct {p0}, Landroidx/leanback/widget/f;->a2()V

    goto :goto_6

    :cond_12
    iget v10, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 v10, v10, -0x5

    iput v10, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 v10, v10, -0x11

    if-eqz v5, :cond_13

    const/16 v2, 0x10

    :cond_13
    or-int/2addr v2, v10

    iput v2, p0, Landroidx/leanback/widget/f;->E:I

    if-eqz v1, :cond_15

    if-ltz v6, :cond_14

    iget v2, p0, Landroidx/leanback/widget/f;->I:I

    if-gt v2, v7, :cond_14

    if-ge v2, v6, :cond_15

    :cond_14
    iget v6, p0, Landroidx/leanback/widget/f;->I:I

    move v7, v6

    :cond_15
    iget-object v2, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v2, v6}, Landroidx/leanback/widget/e;->G(I)V

    if-eq v7, v3, :cond_16

    :goto_5
    invoke-direct {p0}, Landroidx/leanback/widget/f;->U1()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-virtual {p0, v7}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_16

    goto :goto_5

    :cond_16
    :goto_6
    invoke-virtual {p0}, Landroidx/leanback/widget/f;->t4()V

    iget-object v2, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v2}, Landroidx/leanback/widget/e;->m()I

    move-result v2

    iget-object v3, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v3}, Landroidx/leanback/widget/e;->p()I

    move-result v3

    neg-int v6, v8

    neg-int v7, v9

    invoke-direct {p0, v5, v1, v6, v7}, Landroidx/leanback/widget/f;->f2(ZZII)V

    invoke-direct {p0}, Landroidx/leanback/widget/f;->V1()V

    invoke-direct {p0}, Landroidx/leanback/widget/f;->s3()V

    iget-object v6, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v6}, Landroidx/leanback/widget/e;->m()I

    move-result v6

    if-ne v6, v2, :cond_16

    iget-object v2, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v2}, Landroidx/leanback/widget/e;->p()I

    move-result v2

    if-ne v2, v3, :cond_16

    invoke-direct {p0}, Landroidx/leanback/widget/f;->x3()V

    invoke-direct {p0}, Landroidx/leanback/widget/f;->w3()V

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->j()Z

    move-result p2

    if-eqz p2, :cond_17

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->b2()V

    :cond_17
    iget p2, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit16 v1, p2, 0x400

    if-eqz v1, :cond_18

    and-int/lit16 p2, p2, -0x401

    iput p2, p0, Landroidx/leanback/widget/f;->E:I

    goto :goto_7

    :cond_18
    invoke-direct {p0}, Landroidx/leanback/widget/f;->r4()V

    :goto_7
    iget p2, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_19

    iget p2, p0, Landroidx/leanback/widget/f;->I:I

    if-ne p2, v0, :cond_1a

    iget v0, p0, Landroidx/leanback/widget/f;->J:I

    if-ne v0, v4, :cond_1a

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object p2

    if-ne p2, p1, :cond_1a

    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_19

    goto :goto_8

    :cond_19
    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 p1, p1, 0x14

    if-ne p1, v11, :cond_1b

    :cond_1a
    :goto_8
    invoke-virtual {p0}, Landroidx/leanback/widget/f;->Y1()V

    :cond_1b
    invoke-virtual {p0}, Landroidx/leanback/widget/f;->Z1()V

    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 p1, p1, 0x40

    if-eqz p1, :cond_1c

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->G2()I

    move-result p1

    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->z3(I)I

    :cond_1c
    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 p1, p1, -0x4

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    invoke-direct {p0}, Landroidx/leanback/widget/f;->j3()V

    return-void
.end method

.method d2(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;II)V
    .locals 2

    iget-object v0, p0, Landroidx/leanback/widget/f;->G:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Landroidx/leanback/widget/f;->G:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/leanback/widget/o;

    invoke-virtual {v1, p1, p2, p3, p4}, Landroidx/leanback/widget/o;->a(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;II)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public d4(II)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0, p2}, Landroidx/leanback/widget/f;->e4(IIZI)V

    return-void
.end method

.method public e1(Landroidx/recyclerview/widget/RecyclerView$a0;)V
    .locals 0

    iget-object p1, p0, Landroidx/leanback/widget/f;->m0:Landroidx/leanback/widget/f$f;

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method e2(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;II)V
    .locals 2

    iget-object v0, p0, Landroidx/leanback/widget/f;->G:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    iget-object v1, p0, Landroidx/leanback/widget/f;->G:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/leanback/widget/o;

    invoke-virtual {v1, p1, p2, p3, p4}, Landroidx/leanback/widget/o;->b(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;II)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method e3(I)Z
    .locals 3

    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->X(I)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    if-ltz v1, :cond_1

    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v1

    iget-object v2, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getWidth()I

    move-result v2

    if-gt v1, v2, :cond_1

    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    if-ltz v1, :cond_1

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result p1

    iget-object v1, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v1

    if-gt p1, v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public e4(IIZI)V
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->I:I

    if-eq v0, p1, :cond_0

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/f;->J:I

    if-ne p2, v0, :cond_1

    iget v0, p0, Landroidx/leanback/widget/f;->N:I

    if-eq p4, v0, :cond_2

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/leanback/widget/f;->C3(IIZI)V

    :cond_2
    return-void
.end method

.method public f1(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;II)V
    .locals 6

    invoke-direct {p0, p1, p2}, Landroidx/leanback/widget/f;->y3(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    iget p1, p0, Landroidx/leanback/widget/f;->w:I

    if-nez p1, :cond_0

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-static {p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->k0()I

    move-result p4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h0()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-static {p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->i0()I

    move-result p4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->j0()I

    move-result v0

    :goto_0
    add-int/2addr p4, v0

    iput p2, p0, Landroidx/leanback/widget/f;->T:I

    iget v0, p0, Landroidx/leanback/widget/f;->Q:I

    const/4 v1, -0x2

    const-string v2, "wrong spec"

    const/high16 v3, 0x40000000    # 2.0f

    const/high16 v4, -0x80000000

    const/4 v5, 0x1

    if-ne v0, v1, :cond_8

    iget p2, p0, Landroidx/leanback/widget/f;->a0:I

    if-nez p2, :cond_1

    const/4 p2, 0x1

    :cond_1
    iput p2, p0, Landroidx/leanback/widget/f;->Z:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/leanback/widget/f;->R:I

    iget-object v0, p0, Landroidx/leanback/widget/f;->S:[I

    if-eqz v0, :cond_2

    array-length v0, v0

    if-eq v0, p2, :cond_3

    :cond_2
    new-array p2, p2, [I

    iput-object p2, p0, Landroidx/leanback/widget/f;->S:[I

    :cond_3
    iget-object p2, p0, Landroidx/leanback/widget/f;->y:Landroidx/recyclerview/widget/RecyclerView$a0;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->h()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->p4()V

    :cond_4
    invoke-direct {p0, v5}, Landroidx/leanback/widget/f;->u3(Z)Z

    if-eq p3, v4, :cond_7

    if-eqz p3, :cond_6

    if-ne p3, v3, :cond_5

    iget p2, p0, Landroidx/leanback/widget/f;->T:I

    goto/16 :goto_4

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-direct {p0}, Landroidx/leanback/widget/f;->F2()I

    move-result p2

    add-int/2addr p2, p4

    goto/16 :goto_4

    :cond_7
    invoke-direct {p0}, Landroidx/leanback/widget/f;->F2()I

    move-result p2

    add-int/2addr p2, p4

    iget p3, p0, Landroidx/leanback/widget/f;->T:I

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    goto :goto_4

    :cond_8
    if-eq p3, v4, :cond_d

    if-eqz p3, :cond_a

    if-ne p3, v3, :cond_9

    goto :goto_1

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    if-nez v0, :cond_b

    sub-int v0, p2, p4

    :cond_b
    iput v0, p0, Landroidx/leanback/widget/f;->R:I

    iget p2, p0, Landroidx/leanback/widget/f;->a0:I

    if-nez p2, :cond_c

    const/4 p2, 0x1

    :cond_c
    iput p2, p0, Landroidx/leanback/widget/f;->Z:I

    mul-int v0, v0, p2

    iget p3, p0, Landroidx/leanback/widget/f;->X:I

    sub-int/2addr p2, v5

    mul-int p3, p3, p2

    add-int/2addr v0, p3

    add-int p2, v0, p4

    goto :goto_4

    :cond_d
    :goto_1
    iget v1, p0, Landroidx/leanback/widget/f;->a0:I

    if-nez v1, :cond_f

    if-nez v0, :cond_f

    iput v5, p0, Landroidx/leanback/widget/f;->Z:I

    sub-int v0, p2, p4

    :cond_e
    :goto_2
    iput v0, p0, Landroidx/leanback/widget/f;->R:I

    goto :goto_3

    :cond_f
    if-nez v1, :cond_10

    iput v0, p0, Landroidx/leanback/widget/f;->R:I

    iget v1, p0, Landroidx/leanback/widget/f;->X:I

    add-int v2, p2, v1

    add-int/2addr v0, v1

    div-int/2addr v2, v0

    iput v2, p0, Landroidx/leanback/widget/f;->Z:I

    goto :goto_3

    :cond_10
    iput v1, p0, Landroidx/leanback/widget/f;->Z:I

    if-nez v0, :cond_e

    sub-int v0, p2, p4

    iget v2, p0, Landroidx/leanback/widget/f;->X:I

    add-int/lit8 v3, v1, -0x1

    mul-int v2, v2, v3

    sub-int/2addr v0, v2

    div-int/2addr v0, v1

    goto :goto_2

    :goto_3
    if-ne p3, v4, :cond_11

    iget p3, p0, Landroidx/leanback/widget/f;->R:I

    iget v0, p0, Landroidx/leanback/widget/f;->Z:I

    mul-int p3, p3, v0

    iget v1, p0, Landroidx/leanback/widget/f;->X:I

    sub-int/2addr v0, v5

    mul-int v1, v1, v0

    add-int/2addr p3, v1

    add-int/2addr p3, p4

    if-ge p3, p2, :cond_11

    move p2, p3

    :cond_11
    :goto_4
    iget p3, p0, Landroidx/leanback/widget/f;->w:I

    if-nez p3, :cond_12

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->J1(II)V

    goto :goto_5

    :cond_12
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->J1(II)V

    :goto_5
    invoke-direct {p0}, Landroidx/leanback/widget/f;->j3()V

    return-void
.end method

.method public f3()Z
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v1, 0x20000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f4(I)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v0, v1, v0}, Landroidx/leanback/widget/f;->e4(IIZI)V

    return-void
.end method

.method public g1(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/view/View;)Z
    .locals 2

    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    const v0, 0x8000

    and-int/2addr p1, v0

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    return v0

    :cond_0
    invoke-direct {p0, p2}, Landroidx/leanback/widget/f;->i2(Landroid/view/View;)I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_1

    return v0

    :cond_1
    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 p1, p1, 0x23

    if-nez p1, :cond_2

    invoke-direct {p0, p2, p3, v0}, Landroidx/leanback/widget/f;->D3(Landroid/view/View;Landroid/view/View;Z)V

    :cond_2
    return v0
.end method

.method g3()Z
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g4(III)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, p3}, Landroidx/leanback/widget/f;->e4(IIZI)V

    return-void
.end method

.method h3(ILandroid/view/View;III)V
    .locals 9

    iget v0, p0, Landroidx/leanback/widget/f;->w:I

    if-nez v0, :cond_0

    invoke-virtual {p0, p2}, Landroidx/leanback/widget/f;->m2(Landroid/view/View;)I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Landroidx/leanback/widget/f;->n2(Landroid/view/View;)I

    move-result v0

    :goto_0
    iget v1, p0, Landroidx/leanback/widget/f;->R:I

    if-lez v1, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_1
    iget v1, p0, Landroidx/leanback/widget/f;->Y:I

    and-int/lit8 v2, v1, 0x70

    iget v3, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v4, 0xc0000

    and-int/2addr v3, v4

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    const v3, 0x800007

    and-int/2addr v1, v3

    invoke-static {v1, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v1

    goto :goto_1

    :cond_2
    and-int/lit8 v1, v1, 0x7

    :goto_1
    iget v3, p0, Landroidx/leanback/widget/f;->w:I

    if-nez v3, :cond_3

    const/16 v5, 0x30

    if-eq v2, v5, :cond_a

    :cond_3
    if-ne v3, v4, :cond_4

    const/4 v5, 0x3

    if-ne v1, v5, :cond_4

    goto :goto_3

    :cond_4
    if-nez v3, :cond_5

    const/16 v5, 0x50

    if-eq v2, v5, :cond_6

    :cond_5
    if-ne v3, v4, :cond_7

    const/4 v5, 0x5

    if-ne v1, v5, :cond_7

    :cond_6
    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->A2(I)I

    move-result p1

    sub-int/2addr p1, v0

    :goto_2
    add-int/2addr p5, p1

    goto :goto_3

    :cond_7
    if-nez v3, :cond_8

    const/16 v5, 0x10

    if-eq v2, v5, :cond_9

    :cond_8
    if-ne v3, v4, :cond_a

    if-ne v1, v4, :cond_a

    :cond_9
    invoke-direct {p0, p1}, Landroidx/leanback/widget/f;->A2(I)I

    move-result p1

    sub-int/2addr p1, v0

    div-int/lit8 p1, p1, 0x2

    goto :goto_2

    :cond_a
    :goto_3
    iget p1, p0, Landroidx/leanback/widget/f;->w:I

    add-int/2addr v0, p5

    if-nez p1, :cond_b

    goto :goto_4

    :cond_b
    move v7, p5

    move p5, p3

    move p3, v7

    move v8, v0

    move v0, p4

    move p4, v8

    :goto_4
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/leanback/widget/f$e;

    move-object v1, p0

    move-object v2, p2

    move v3, p3

    move v4, p5

    move v5, p4

    move v6, v0

    invoke-virtual/range {v1 .. v6}, Landroidx/recyclerview/widget/RecyclerView$o;->F0(Landroid/view/View;IIII)V

    sget-object v1, Landroidx/leanback/widget/f;->s:Landroid/graphics/Rect;

    invoke-super {p0, p2, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->T(Landroid/view/View;Landroid/graphics/Rect;)V

    iget v2, v1, Landroid/graphics/Rect;->left:I

    sub-int/2addr p3, v2

    iget v2, v1, Landroid/graphics/Rect;->top:I

    sub-int/2addr p5, v2

    iget v2, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, p4

    iget p4, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p4, v0

    invoke-virtual {p1, p3, p5, v2, p4}, Landroidx/leanback/widget/f$e;->w(IIII)V

    invoke-direct {p0, p2}, Landroidx/leanback/widget/f;->o4(Landroid/view/View;)V

    return-void
.end method

.method public h4(I)V
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/f;->w:I

    const/4 v1, 0x1

    iput p1, p0, Landroidx/leanback/widget/f;->V:I

    if-ne v0, v1, :cond_0

    iput p1, p0, Landroidx/leanback/widget/f;->W:I

    goto :goto_0

    :cond_0
    iput p1, p0, Landroidx/leanback/widget/f;->X:I

    :goto_0
    return-void
.end method

.method public i1(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Landroidx/leanback/widget/f$h;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p1, Landroidx/leanback/widget/f$h;

    iget v0, p1, Landroidx/leanback/widget/f$h;->b:I

    iput v0, p0, Landroidx/leanback/widget/f;->I:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/leanback/widget/f;->M:I

    iget-object v0, p0, Landroidx/leanback/widget/f;->i0:Landroidx/leanback/widget/z;

    iget-object p1, p1, Landroidx/leanback/widget/f$h;->c:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/z;->f(Landroid/os/Bundle;)V

    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    or-int/lit16 p1, p1, 0x100

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->A1()V

    return-void
.end method

.method public i4(I)V
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/a0$a;->y(I)V

    return-void
.end method

.method public j1()Landroid/os/Parcelable;
    .locals 7

    new-instance v0, Landroidx/leanback/widget/f$h;

    invoke-direct {v0}, Landroidx/leanback/widget/f$h;-><init>()V

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->E2()I

    move-result v1

    iput v1, v0, Landroidx/leanback/widget/f$h;->b:I

    iget-object v1, p0, Landroidx/leanback/widget/f;->i0:Landroidx/leanback/widget/z;

    invoke-virtual {v1}, Landroidx/leanback/widget/z;->i()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v4

    invoke-direct {p0, v4}, Landroidx/leanback/widget/f;->i2(Landroid/view/View;)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_0

    iget-object v6, p0, Landroidx/leanback/widget/f;->i0:Landroidx/leanback/widget/z;

    invoke-virtual {v6, v1, v4, v5}, Landroidx/leanback/widget/z;->k(Landroid/os/Bundle;Landroid/view/View;I)Landroid/os/Bundle;

    move-result-object v1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iput-object v1, v0, Landroidx/leanback/widget/f$h;->c:Landroid/os/Bundle;

    return-object v0
.end method

.method public j4(I)V
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/a0$a;->z(I)V

    return-void
.end method

.method k3(Landroid/view/View;)V
    .locals 6

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/f$e;

    sget-object v1, Landroidx/leanback/widget/f;->s:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v2, v3

    iget v3, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v2, v3

    iget v3, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v3, v4

    iget v4, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v4

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, v1

    iget v1, p0, Landroidx/leanback/widget/f;->Q:I

    const/4 v4, 0x0

    const/4 v5, -0x2

    if-ne v1, v5, :cond_0

    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    goto :goto_0

    :cond_0
    iget v1, p0, Landroidx/leanback/widget/f;->R:I

    const/high16 v5, 0x40000000    # 2.0f

    invoke-static {v1, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    :goto_0
    iget v5, p0, Landroidx/leanback/widget/f;->w:I

    invoke-static {v4, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    if-nez v5, :cond_1

    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v4, v2, v5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v2

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v1, v3, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v0

    goto :goto_1

    :cond_1
    iget v5, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v4, v3, v5}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v3

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v1, v2, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v2

    move v0, v3

    :goto_1
    invoke-virtual {p1, v2, v0}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public k4(F)V
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v0}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/a0$a;->A(F)V

    return-void
.end method

.method public l()Z
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/f;->w:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget v0, p0, Landroidx/leanback/widget/f;->Z:I

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method l2(Landroidx/recyclerview/widget/RecyclerView;II)I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->I:I

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    return p3

    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    if-ge p3, p1, :cond_1

    return p3

    :cond_1
    add-int/lit8 v0, p2, -0x1

    if-ge p3, v0, :cond_2

    add-int/2addr p1, p2

    add-int/lit8 p1, p1, -0x1

    sub-int/2addr p1, p3

    :cond_2
    return p1
.end method

.method l4()V
    .locals 2

    iget-object v0, p0, Landroidx/leanback/widget/f;->K:Landroidx/leanback/widget/f$d;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroidx/leanback/widget/f$d;->q:Z

    :cond_0
    return-void
.end method

.method public m()Z
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/f;->w:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget v0, p0, Landroidx/leanback/widget/f;->Z:I

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method m2(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/f$e;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->V(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method m4(I)I
    .locals 1

    new-instance v0, Landroidx/leanback/widget/f$c;

    invoke-direct {v0, p0}, Landroidx/leanback/widget/f$c;-><init>(Landroidx/leanback/widget/f;)V

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView$z;->p(I)V

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/f;->R1(Landroidx/recyclerview/widget/RecyclerView$z;)V

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$z;->f()I

    move-result p1

    return p1
.end method

.method public n1(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;ILandroid/os/Bundle;)Z
    .locals 4

    invoke-virtual {p0}, Landroidx/leanback/widget/f;->f3()Z

    move-result p4

    const/4 v0, 0x1

    if-nez p4, :cond_0

    return v0

    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/leanback/widget/f;->y3(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 p2, 0x40000

    and-int/2addr p1, p2

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    const/16 v2, 0x2000

    const/16 v3, 0x1000

    if-lt p4, v1, :cond_7

    iget p4, p0, Landroidx/leanback/widget/f;->w:I

    if-nez p4, :cond_5

    sget-object p4, Lb/g/k/b0/c$a;->z:Lb/g/k/b0/c$a;

    invoke-virtual {p4}, Lb/g/k/b0/c$a;->b()I

    move-result p4

    if-ne p3, p4, :cond_4

    if-eqz p1, :cond_3

    :cond_2
    :goto_1
    const/16 p3, 0x1000

    goto :goto_3

    :cond_3
    :goto_2
    const/16 p3, 0x2000

    goto :goto_3

    :cond_4
    sget-object p4, Lb/g/k/b0/c$a;->B:Lb/g/k/b0/c$a;

    invoke-virtual {p4}, Lb/g/k/b0/c$a;->b()I

    move-result p4

    if-ne p3, p4, :cond_7

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_5
    sget-object p1, Lb/g/k/b0/c$a;->y:Lb/g/k/b0/c$a;

    invoke-virtual {p1}, Lb/g/k/b0/c$a;->b()I

    move-result p1

    if-ne p3, p1, :cond_6

    goto :goto_2

    :cond_6
    sget-object p1, Lb/g/k/b0/c$a;->A:Lb/g/k/b0/c$a;

    invoke-virtual {p1}, Lb/g/k/b0/c$a;->b()I

    move-result p1

    if-ne p3, p1, :cond_7

    goto :goto_1

    :cond_7
    :goto_3
    if-eq p3, v3, :cond_9

    if-eq p3, v2, :cond_8

    goto :goto_4

    :cond_8
    invoke-direct {p0, p2}, Landroidx/leanback/widget/f;->t3(Z)V

    const/4 p1, -0x1

    invoke-virtual {p0, p2, p1}, Landroidx/leanback/widget/f;->v3(ZI)I

    goto :goto_4

    :cond_9
    invoke-direct {p0, v0}, Landroidx/leanback/widget/f;->t3(Z)V

    invoke-virtual {p0, p2, v0}, Landroidx/leanback/widget/f;->v3(ZI)I

    :goto_4
    invoke-direct {p0}, Landroidx/leanback/widget/f;->j3()V

    return v0
.end method

.method n2(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/f$e;

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->W(Landroid/view/View;)I

    move-result p1

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr p1, v0

    return p1
.end method

.method public o0(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->w:I

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->r()I

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->o0(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I

    move-result p1

    return p1
.end method

.method o2()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->g0:I

    return v0
.end method

.method o3(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->j()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Landroidx/leanback/widget/f;->i0:Landroidx/leanback/widget/z;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    invoke-virtual {v1, p1, v0}, Landroidx/leanback/widget/z;->j(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public p(IILandroidx/recyclerview/widget/RecyclerView$a0;Landroidx/recyclerview/widget/RecyclerView$o$c;)V
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, v0, p3}, Landroidx/leanback/widget/f;->y3(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    iget p3, p0, Landroidx/leanback/widget/f;->w:I

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result p2

    if-eqz p2, :cond_3

    if-nez p1, :cond_1

    goto :goto_2

    :cond_1
    if-gez p1, :cond_2

    iget p2, p0, Landroidx/leanback/widget/f;->g0:I

    neg-int p2, p2

    goto :goto_1

    :cond_2
    iget p2, p0, Landroidx/leanback/widget/f;->f0:I

    iget p3, p0, Landroidx/leanback/widget/f;->g0:I

    add-int/2addr p2, p3

    :goto_1
    iget-object p3, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {p3, p2, p1, p4}, Landroidx/leanback/widget/e;->f(IILandroidx/recyclerview/widget/RecyclerView$o$c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0}, Landroidx/leanback/widget/f;->j3()V

    return-void

    :cond_3
    :goto_2
    invoke-direct {p0}, Landroidx/leanback/widget/f;->j3()V

    return-void

    :catchall_0
    move-exception p1

    invoke-direct {p0}, Landroidx/leanback/widget/f;->j3()V

    throw p1
.end method

.method p2(Landroidx/recyclerview/widget/RecyclerView$d0;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/recyclerview/widget/RecyclerView$d0;",
            "Ljava/lang/Class<",
            "+TE;>;)TE;"
        }
    .end annotation

    instance-of v0, p1, Landroidx/leanback/widget/b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroidx/leanback/widget/b;

    invoke-interface {v0, p2}, Landroidx/leanback/widget/b;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v1, p0, Landroidx/leanback/widget/f;->j0:Landroidx/leanback/widget/c;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$d0;->l()I

    move-result p1

    invoke-interface {v1, p1}, Landroidx/leanback/widget/c;->a(I)Landroidx/leanback/widget/b;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1, p2}, Landroidx/leanback/widget/b;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method p3(ZILandroid/graphics/Rect;)V
    .locals 0

    if-eqz p1, :cond_2

    iget p1, p0, Landroidx/leanback/widget/f;->I:I

    :goto_0
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->hasFocusable()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    goto :goto_1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method p4()V
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/f$e;

    iget-object v1, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v1}, Landroidx/leanback/widget/e;->m()I

    move-result v1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$p;->b()I

    move-result v0

    sub-int/2addr v1, v0

    :cond_0
    iput v1, p0, Landroidx/leanback/widget/f;->z:I

    return-void
.end method

.method public q(ILandroidx/recyclerview/widget/RecyclerView$o$c;)V
    .locals 5

    iget-object v0, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    iget v0, v0, Landroidx/leanback/widget/a;->R0:I

    if-eqz p1, :cond_0

    if-eqz v0, :cond_0

    iget v1, p0, Landroidx/leanback/widget/f;->I:I

    add-int/lit8 v2, v0, -0x1

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    sub-int v2, p1, v0

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    move v3, v1

    :goto_0
    if-ge v3, p1, :cond_0

    add-int v4, v1, v0

    if-ge v3, v4, :cond_0

    invoke-interface {p2, v3, v2}, Landroidx/recyclerview/widget/RecyclerView$o$c;->a(II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public q2()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->c0:I

    return v0
.end method

.method public q3(I)V
    .locals 5

    iget v0, p0, Landroidx/leanback/widget/f;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    if-ne p1, v2, :cond_0

    const/high16 v0, 0x40000

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    if-ne p1, v2, :cond_0

    const/high16 v0, 0x80000

    :goto_0
    iget v3, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v4, 0xc0000

    and-int/2addr v4, v3

    if-ne v4, v0, :cond_2

    return-void

    :cond_2
    const v4, -0xc0001

    and-int/2addr v3, v4

    or-int/2addr v0, v3

    iput v0, p0, Landroidx/leanback/widget/f;->E:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, Landroidx/leanback/widget/f;->E:I

    iget-object v0, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    iget-object v0, v0, Landroidx/leanback/widget/a0;->c:Landroidx/leanback/widget/a0$a;

    if-ne p1, v2, :cond_3

    const/4 v1, 0x1

    :cond_3
    invoke-virtual {v0, v1}, Landroidx/leanback/widget/a0$a;->w(Z)V

    return-void
.end method

.method q4()V
    .locals 5

    iget-object v0, p0, Landroidx/leanback/widget/f;->B:Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Landroidx/leanback/widget/f;->v:Landroidx/leanback/widget/a;

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->f0(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$d0;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView$d0;->n()I

    move-result v2

    if-ltz v2, :cond_0

    iget-object v3, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v3, v2}, Landroidx/leanback/widget/e;->q(I)Landroidx/leanback/widget/e$a;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v4, p0, Landroidx/leanback/widget/f;->B:Landroid/util/SparseIntArray;

    iget v3, v3, Landroidx/leanback/widget/e$a;->a:I

    invoke-virtual {v4, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public r1(Landroidx/recyclerview/widget/RecyclerView$v;)V
    .locals 1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->u1(ILandroidx/recyclerview/widget/RecyclerView$v;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r2()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f;->U:I

    return v0
.end method

.method public s2()I
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->e0:Landroidx/leanback/widget/i;

    invoke-virtual {v0}, Landroidx/leanback/widget/i;->a()Landroidx/leanback/widget/i$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/j$a;->b()I

    move-result v0

    return v0
.end method

.method public t2()F
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->e0:Landroidx/leanback/widget/i;

    invoke-virtual {v0}, Landroidx/leanback/widget/i;->a()Landroidx/leanback/widget/i$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/j$a;->c()F

    move-result v0

    return v0
.end method

.method t4()V
    .locals 7

    iget-object v0, p0, Landroidx/leanback/widget/f;->y:Landroidx/recyclerview/widget/RecyclerView$a0;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$a0;->c()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/f;->E:I

    const/high16 v1, 0x40000

    and-int/2addr v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->p()I

    move-result v0

    iget-object v3, p0, Landroidx/leanback/widget/f;->y:Landroidx/recyclerview/widget/RecyclerView$a0;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$a0;->c()I

    move-result v3

    sub-int/2addr v3, v2

    iget-object v4, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v4}, Landroidx/leanback/widget/e;->m()I

    move-result v4

    move v5, v4

    const/4 v4, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v0}, Landroidx/leanback/widget/e;->m()I

    move-result v0

    iget-object v3, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v3}, Landroidx/leanback/widget/e;->p()I

    move-result v4

    iget-object v3, p0, Landroidx/leanback/widget/f;->y:Landroidx/recyclerview/widget/RecyclerView$a0;

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$a0;->c()I

    move-result v3

    sub-int/2addr v3, v2

    move v5, v4

    move v4, v3

    const/4 v3, 0x0

    :goto_0
    if-ltz v0, :cond_9

    if-gez v5, :cond_2

    goto/16 :goto_5

    :cond_2
    if-ne v0, v3, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    if-ne v5, v4, :cond_4

    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_2
    if-nez v0, :cond_5

    iget-object v4, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v4}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/leanback/widget/a0$a;->o()Z

    move-result v4

    if-eqz v4, :cond_5

    if-nez v3, :cond_5

    iget-object v4, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v4}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/leanback/widget/a0$a;->p()Z

    move-result v4

    if-eqz v4, :cond_5

    return-void

    :cond_5
    const v4, 0x7fffffff

    if-eqz v0, :cond_6

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    sget-object v4, Landroidx/leanback/widget/f;->t:[I

    invoke-virtual {v0, v2, v4}, Landroidx/leanback/widget/e;->j(Z[I)I

    move-result v4

    sget-object v0, Landroidx/leanback/widget/f;->t:[I

    aget v0, v0, v2

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/leanback/widget/f;->L2(Landroid/view/View;)I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/f$e;

    invoke-virtual {v0}, Landroidx/leanback/widget/f$e;->h()[I

    move-result-object v0

    if-eqz v0, :cond_7

    array-length v6, v0

    if-lez v6, :cond_7

    array-length v6, v0

    sub-int/2addr v6, v2

    aget v6, v0, v6

    aget v0, v0, v1

    sub-int/2addr v6, v0

    add-int/2addr v5, v6

    goto :goto_3

    :cond_6
    const v5, 0x7fffffff

    :cond_7
    :goto_3
    const/high16 v0, -0x80000000

    if-eqz v3, :cond_8

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    sget-object v3, Landroidx/leanback/widget/f;->t:[I

    invoke-virtual {v0, v1, v3}, Landroidx/leanback/widget/e;->l(Z[I)I

    move-result v0

    sget-object v1, Landroidx/leanback/widget/f;->t:[I

    aget v1, v1, v2

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v1

    invoke-direct {p0, v1}, Landroidx/leanback/widget/f;->L2(Landroid/view/View;)I

    move-result v1

    goto :goto_4

    :cond_8
    const/high16 v1, -0x80000000

    :goto_4
    iget-object v2, p0, Landroidx/leanback/widget/f;->d0:Landroidx/leanback/widget/a0;

    invoke-virtual {v2}, Landroidx/leanback/widget/a0;->a()Landroidx/leanback/widget/a0$a;

    move-result-object v2

    invoke-virtual {v2, v0, v4, v1, v5}, Landroidx/leanback/widget/a0$a;->B(IIII)V

    :cond_9
    :goto_5
    return-void
.end method

.method public u2()I
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f;->e0:Landroidx/leanback/widget/i;

    invoke-virtual {v0}, Landroidx/leanback/widget/i;->a()Landroidx/leanback/widget/i$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/leanback/widget/j$a;->d()I

    move-result v0

    return v0
.end method

.method v3(ZI)I
    .locals 10

    iget-object v0, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    if-nez v0, :cond_0

    return p2

    :cond_0
    iget v1, p0, Landroidx/leanback/widget/f;->I:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    invoke-virtual {v0, v1}, Landroidx/leanback/widget/e;->s(I)I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    :goto_0
    const/4 v3, 0x0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v4, :cond_9

    if-eqz p2, :cond_9

    if-lez p2, :cond_2

    move v7, v6

    goto :goto_2

    :cond_2
    add-int/lit8 v7, v4, -0x1

    sub-int/2addr v7, v6

    :goto_2
    invoke-virtual {p0, v7}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {p0, v8}, Landroidx/leanback/widget/f;->W1(Landroid/view/View;)Z

    move-result v9

    if-nez v9, :cond_3

    goto :goto_4

    :cond_3
    invoke-direct {p0, v7}, Landroidx/leanback/widget/f;->h2(I)I

    move-result v7

    iget-object v9, p0, Landroidx/leanback/widget/f;->b0:Landroidx/leanback/widget/e;

    invoke-virtual {v9, v7}, Landroidx/leanback/widget/e;->s(I)I

    move-result v9

    if-ne v0, v2, :cond_4

    move v1, v7

    move-object v3, v8

    move v0, v9

    goto :goto_4

    :cond_4
    if-ne v9, v0, :cond_8

    if-lez p2, :cond_5

    if-gt v7, v1, :cond_6

    :cond_5
    if-gez p2, :cond_8

    if-ge v7, v1, :cond_8

    :cond_6
    if-lez p2, :cond_7

    add-int/lit8 p2, p2, -0x1

    goto :goto_3

    :cond_7
    add-int/lit8 p2, p2, 0x1

    :goto_3
    move v1, v7

    move-object v3, v8

    :cond_8
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_9
    if-eqz v3, :cond_c

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->v0()Z

    move-result p1

    if-eqz p1, :cond_a

    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    or-int/lit8 p1, p1, 0x20

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    iget p1, p0, Landroidx/leanback/widget/f;->E:I

    and-int/lit8 p1, p1, -0x21

    iput p1, p0, Landroidx/leanback/widget/f;->E:I

    :cond_a
    iput v1, p0, Landroidx/leanback/widget/f;->I:I

    iput v5, p0, Landroidx/leanback/widget/f;->J:I

    goto :goto_5

    :cond_b
    const/4 p1, 0x1

    invoke-virtual {p0, v3, p1}, Landroidx/leanback/widget/f;->F3(Landroid/view/View;Z)V

    :cond_c
    :goto_5
    return p2
.end method

.method final x2(Landroid/view/View;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/f$e;

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/f$e;->m(Landroid/view/View;)I

    move-result p1

    return p1
.end method

.method public y1(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method final y2(Landroid/view/View;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/leanback/widget/f$e;

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/f$e;->o(Landroid/view/View;)I

    move-result p1

    return p1
.end method
