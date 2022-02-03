.class final Landroidx/leanback/widget/f$e;
.super Landroidx/recyclerview/widget/RecyclerView$p;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/leanback/widget/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# instance fields
.field e:I

.field f:I

.field g:I

.field h:I

.field private i:I

.field private j:I

.field private k:[I

.field private l:Landroidx/leanback/widget/j;


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$p;-><init>(II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$p;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$p;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$p;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-void
.end method

.method public constructor <init>(Landroidx/leanback/widget/f$e;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$p;-><init>(Landroidx/recyclerview/widget/RecyclerView$p;)V

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView$p;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$p;-><init>(Landroidx/recyclerview/widget/RecyclerView$p;)V

    return-void
.end method


# virtual methods
.method g(ILandroid/view/View;)V
    .locals 5

    iget-object v0, p0, Landroidx/leanback/widget/f$e;->l:Landroidx/leanback/widget/j;

    invoke-virtual {v0}, Landroidx/leanback/widget/j;->a()[Landroidx/leanback/widget/j$a;

    move-result-object v0

    iget-object v1, p0, Landroidx/leanback/widget/f$e;->k:[I

    if-eqz v1, :cond_0

    array-length v1, v1

    array-length v2, v0

    if-eq v1, v2, :cond_1

    :cond_0
    array-length v1, v0

    new-array v1, v1, [I

    iput-object v1, p0, Landroidx/leanback/widget/f$e;->k:[I

    :cond_1
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_2

    iget-object v3, p0, Landroidx/leanback/widget/f$e;->k:[I

    aget-object v4, v0, v2

    invoke-static {p2, v4, p1}, Landroidx/leanback/widget/k;->a(Landroid/view/View;Landroidx/leanback/widget/j$a;I)I

    move-result v4

    aput v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    if-nez p1, :cond_3

    iget-object p1, p0, Landroidx/leanback/widget/f$e;->k:[I

    aget p1, p1, v1

    iput p1, p0, Landroidx/leanback/widget/f$e;->i:I

    goto :goto_1

    :cond_3
    iget-object p1, p0, Landroidx/leanback/widget/f$e;->k:[I

    aget p1, p1, v1

    iput p1, p0, Landroidx/leanback/widget/f$e;->j:I

    :goto_1
    return-void
.end method

.method h()[I
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f$e;->k:[I

    return-object v0
.end method

.method i()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f$e;->i:I

    return v0
.end method

.method j()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f$e;->j:I

    return v0
.end method

.method k()Landroidx/leanback/widget/j;
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/f$e;->l:Landroidx/leanback/widget/j;

    return-object v0
.end method

.method l(Landroid/view/View;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iget v0, p0, Landroidx/leanback/widget/f$e;->f:I

    sub-int/2addr p1, v0

    iget v0, p0, Landroidx/leanback/widget/f$e;->h:I

    sub-int/2addr p1, v0

    return p1
.end method

.method m(Landroid/view/View;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p1

    iget v0, p0, Landroidx/leanback/widget/f$e;->e:I

    add-int/2addr p1, v0

    return p1
.end method

.method n()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f$e;->e:I

    return v0
.end method

.method o(Landroid/view/View;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result p1

    iget v0, p0, Landroidx/leanback/widget/f$e;->g:I

    sub-int/2addr p1, v0

    return p1
.end method

.method p()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f$e;->g:I

    return v0
.end method

.method q(Landroid/view/View;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    iget v0, p0, Landroidx/leanback/widget/f$e;->f:I

    add-int/2addr p1, v0

    return p1
.end method

.method r()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/f$e;->f:I

    return v0
.end method

.method s(Landroid/view/View;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    iget v0, p0, Landroidx/leanback/widget/f$e;->e:I

    sub-int/2addr p1, v0

    iget v0, p0, Landroidx/leanback/widget/f$e;->g:I

    sub-int/2addr p1, v0

    return p1
.end method

.method t(I)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/f$e;->i:I

    return-void
.end method

.method u(I)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/f$e;->j:I

    return-void
.end method

.method v(Landroidx/leanback/widget/j;)V
    .locals 0

    iput-object p1, p0, Landroidx/leanback/widget/f$e;->l:Landroidx/leanback/widget/j;

    return-void
.end method

.method w(IIII)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/f$e;->e:I

    iput p2, p0, Landroidx/leanback/widget/f$e;->f:I

    iput p3, p0, Landroidx/leanback/widget/f$e;->g:I

    iput p4, p0, Landroidx/leanback/widget/f$e;->h:I

    return-void
.end method
