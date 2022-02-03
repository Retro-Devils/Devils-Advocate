.class public final Lcom/google/android/material/datepicker/g;
.super Lcom/google/android/material/datepicker/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/datepicker/g$l;,
        Lcom/google/android/material/datepicker/g$k;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/material/datepicker/m<",
        "TS;>;"
    }
.end annotation


# static fields
.field static final a0:Ljava/lang/Object;

.field static final b0:Ljava/lang/Object;

.field static final c0:Ljava/lang/Object;

.field static final d0:Ljava/lang/Object;


# instance fields
.field private e0:I

.field private f0:Lcom/google/android/material/datepicker/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/datepicker/d<",
            "TS;>;"
        }
    .end annotation
.end field

.field private g0:Lcom/google/android/material/datepicker/a;

.field private h0:Lcom/google/android/material/datepicker/i;

.field private i0:Lcom/google/android/material/datepicker/g$k;

.field private j0:Lcom/google/android/material/datepicker/c;

.field private k0:Landroidx/recyclerview/widget/RecyclerView;

.field private l0:Landroidx/recyclerview/widget/RecyclerView;

.field private m0:Landroid/view/View;

.field private n0:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "MONTHS_VIEW_GROUP_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/g;->a0:Ljava/lang/Object;

    const-string v0, "NAVIGATION_PREV_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/g;->b0:Ljava/lang/Object;

    const-string v0, "NAVIGATION_NEXT_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/g;->c0:Ljava/lang/Object;

    const-string v0, "SELECTOR_TOGGLE_TAG"

    sput-object v0, Lcom/google/android/material/datepicker/g;->d0:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/material/datepicker/m;-><init>()V

    return-void
.end method

.method static C2(Landroid/content/Context;)I
    .locals 1

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Lc/b/a/b/d;->k:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    return p0
.end method

.method private E2(I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->l0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/google/android/material/datepicker/g$a;

    invoke-direct {v1, p0, p1}, Lcom/google/android/material/datepicker/g$a;-><init>(Lcom/google/android/material/datepicker/g;I)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic p2(Lcom/google/android/material/datepicker/g;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/g;->l0:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method static synthetic q2(Lcom/google/android/material/datepicker/g;)Lcom/google/android/material/datepicker/a;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/g;->g0:Lcom/google/android/material/datepicker/a;

    return-object p0
.end method

.method static synthetic r2(Lcom/google/android/material/datepicker/g;)Lcom/google/android/material/datepicker/d;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/g;->f0:Lcom/google/android/material/datepicker/d;

    return-object p0
.end method

.method static synthetic s2(Lcom/google/android/material/datepicker/g;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/g;->k0:Landroidx/recyclerview/widget/RecyclerView;

    return-object p0
.end method

.method static synthetic t2(Lcom/google/android/material/datepicker/g;)Lcom/google/android/material/datepicker/c;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/g;->j0:Lcom/google/android/material/datepicker/c;

    return-object p0
.end method

.method static synthetic u2(Lcom/google/android/material/datepicker/g;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/g;->n0:Landroid/view/View;

    return-object p0
.end method

.method static synthetic v2(Lcom/google/android/material/datepicker/g;Lcom/google/android/material/datepicker/i;)Lcom/google/android/material/datepicker/i;
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/g;->h0:Lcom/google/android/material/datepicker/i;

    return-object p1
.end method

.method private w2(Landroid/view/View;Lcom/google/android/material/datepicker/k;)V
    .locals 4

    sget v0, Lc/b/a/b/f;->f:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    sget-object v1, Lcom/google/android/material/datepicker/g;->d0:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    new-instance v1, Lcom/google/android/material/datepicker/g$f;

    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/g$f;-><init>(Lcom/google/android/material/datepicker/g;)V

    invoke-static {v0, v1}, Lb/g/k/s;->i0(Landroid/view/View;Lb/g/k/a;)V

    sget v1, Lc/b/a/b/f;->h:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    sget-object v2, Lcom/google/android/material/datepicker/g;->b0:Ljava/lang/Object;

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    sget v2, Lc/b/a/b/f;->g:I

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/material/button/MaterialButton;

    sget-object v3, Lcom/google/android/material/datepicker/g;->c0:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setTag(Ljava/lang/Object;)V

    sget v3, Lc/b/a/b/f;->m:I

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/material/datepicker/g;->m0:Landroid/view/View;

    sget v3, Lc/b/a/b/f;->j:I

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/datepicker/g;->n0:Landroid/view/View;

    sget-object p1, Lcom/google/android/material/datepicker/g$k;->b:Lcom/google/android/material/datepicker/g$k;

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/g;->G2(Lcom/google/android/material/datepicker/g$k;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->h0:Lcom/google/android/material/datepicker/i;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/i;->k()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->l0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, Lcom/google/android/material/datepicker/g$g;

    invoke-direct {v3, p0, p2, v0}, Lcom/google/android/material/datepicker/g$g;-><init>(Lcom/google/android/material/datepicker/g;Lcom/google/android/material/datepicker/k;Lcom/google/android/material/button/MaterialButton;)V

    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/RecyclerView;->k(Landroidx/recyclerview/widget/RecyclerView$t;)V

    new-instance p1, Lcom/google/android/material/datepicker/g$h;

    invoke-direct {p1, p0}, Lcom/google/android/material/datepicker/g$h;-><init>(Lcom/google/android/material/datepicker/g;)V

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Lcom/google/android/material/datepicker/g$i;

    invoke-direct {p1, p0, p2}, Lcom/google/android/material/datepicker/g$i;-><init>(Lcom/google/android/material/datepicker/g;Lcom/google/android/material/datepicker/k;)V

    invoke-virtual {v2, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Lcom/google/android/material/datepicker/g$j;

    invoke-direct {p1, p0, p2}, Lcom/google/android/material/datepicker/g$j;-><init>(Lcom/google/android/material/datepicker/g;Lcom/google/android/material/datepicker/k;)V

    invoke-virtual {v1, p1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private x2()Landroidx/recyclerview/widget/RecyclerView$n;
    .locals 1

    new-instance v0, Lcom/google/android/material/datepicker/g$e;

    invoke-direct {v0, p0}, Lcom/google/android/material/datepicker/g$e;-><init>(Lcom/google/android/material/datepicker/g;)V

    return-object v0
.end method


# virtual methods
.method A2()Lcom/google/android/material/datepicker/i;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->h0:Lcom/google/android/material/datepicker/i;

    return-object v0
.end method

.method public B2()Lcom/google/android/material/datepicker/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/material/datepicker/d<",
            "TS;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->f0:Lcom/google/android/material/datepicker/d;

    return-object v0
.end method

.method D2()Landroidx/recyclerview/widget/LinearLayoutManager;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->l0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    return-object v0
.end method

.method F2(Lcom/google/android/material/datepicker/i;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->l0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/k;

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/k;->x(Lcom/google/android/material/datepicker/i;)I

    move-result v1

    iget-object v2, p0, Lcom/google/android/material/datepicker/g;->h0:Lcom/google/android/material/datepicker/i;

    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/k;->x(Lcom/google/android/material/datepicker/i;)I

    move-result v0

    sub-int v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x3

    if-le v2, v5, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-lez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    iput-object p1, p0, Lcom/google/android/material/datepicker/g;->h0:Lcom/google/android/material/datepicker/i;

    if-eqz v2, :cond_2

    if-eqz v3, :cond_2

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->l0:Landroidx/recyclerview/widget/RecyclerView;

    add-int/lit8 v0, v1, -0x3

    goto :goto_2

    :cond_2
    if-eqz v2, :cond_3

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->l0:Landroidx/recyclerview/widget/RecyclerView;

    add-int/lit8 v0, v1, 0x3

    :goto_2
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->k1(I)V

    :cond_3
    invoke-direct {p0, v1}, Lcom/google/android/material/datepicker/g;->E2(I)V

    return-void
.end method

.method G2(Lcom/google/android/material/datepicker/g$k;)V
    .locals 4

    iput-object p1, p0, Lcom/google/android/material/datepicker/g;->i0:Lcom/google/android/material/datepicker/g$k;

    sget-object v0, Lcom/google/android/material/datepicker/g$k;->c:Lcom/google/android/material/datepicker/g$k;

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->k0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->k0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/q;

    iget-object v3, p0, Lcom/google/android/material/datepicker/g;->h0:Lcom/google/android/material/datepicker/i;

    iget v3, v3, Lcom/google/android/material/datepicker/i;->e:I

    invoke-virtual {v0, v3}, Lcom/google/android/material/datepicker/q;->w(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->E1(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->m0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->n0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/google/android/material/datepicker/g$k;->b:Lcom/google/android/material/datepicker/g$k;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->m0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->n0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/g;->h0:Lcom/google/android/material/datepicker/i;

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/g;->F2(Lcom/google/android/material/datepicker/i;)V

    :cond_1
    :goto_0
    return-void
.end method

.method H2()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->i0:Lcom/google/android/material/datepicker/g$k;

    sget-object v1, Lcom/google/android/material/datepicker/g$k;->c:Lcom/google/android/material/datepicker/g$k;

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/google/android/material/datepicker/g$k;->b:Lcom/google/android/material/datepicker/g$k;

    invoke-virtual {p0, v0}, Lcom/google/android/material/datepicker/g;->G2(Lcom/google/android/material/datepicker/g$k;)V

    goto :goto_0

    :cond_0
    sget-object v2, Lcom/google/android/material/datepicker/g$k;->b:Lcom/google/android/material/datepicker/g$k;

    if-ne v0, v2, :cond_1

    invoke-virtual {p0, v1}, Lcom/google/android/material/datepicker/g;->G2(Lcom/google/android/material/datepicker/g$k;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public W0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->W0(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object p1

    :cond_0
    const-string v0, "THEME_RES_ID_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/google/android/material/datepicker/g;->e0:I

    const-string v0, "GRID_SELECTOR_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/d;

    iput-object v0, p0, Lcom/google/android/material/datepicker/g;->f0:Lcom/google/android/material/datepicker/d;

    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/a;

    iput-object v0, p0, Lcom/google/android/material/datepicker/g;->g0:Lcom/google/android/material/datepicker/a;

    const-string v0, "CURRENT_MONTH_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/datepicker/i;

    iput-object p1, p0, Lcom/google/android/material/datepicker/g;->h0:Lcom/google/android/material/datepicker/i;

    return-void
.end method

.method public a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    new-instance p3, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v0

    iget v1, p0, Lcom/google/android/material/datepicker/g;->e0:I

    invoke-direct {p3, v0, v1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    new-instance v0, Lcom/google/android/material/datepicker/c;

    invoke-direct {v0, p3}, Lcom/google/android/material/datepicker/c;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/android/material/datepicker/g;->j0:Lcom/google/android/material/datepicker/c;

    invoke-virtual {p1, p3}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->g0:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->k()Lcom/google/android/material/datepicker/i;

    move-result-object v0

    invoke-static {p3}, Lcom/google/android/material/datepicker/h;->u2(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    sget v1, Lc/b/a/b/h;->o:I

    const/4 v9, 0x1

    goto :goto_0

    :cond_0
    sget v1, Lc/b/a/b/h;->m:I

    const/4 v9, 0x0

    :goto_0
    invoke-virtual {p1, v1, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    sget p2, Lc/b/a/b/f;->k:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/GridView;

    new-instance v1, Lcom/google/android/material/datepicker/g$b;

    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/g$b;-><init>(Lcom/google/android/material/datepicker/g;)V

    invoke-static {p2, v1}, Lb/g/k/s;->i0(Landroid/view/View;Lb/g/k/a;)V

    new-instance v1, Lcom/google/android/material/datepicker/f;

    invoke-direct {v1}, Lcom/google/android/material/datepicker/f;-><init>()V

    invoke-virtual {p2, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget v0, v0, Lcom/google/android/material/datepicker/i;->f:I

    invoke-virtual {p2, v0}, Landroid/widget/GridView;->setNumColumns(I)V

    invoke-virtual {p2, v3}, Landroid/widget/GridView;->setEnabled(Z)V

    sget p2, Lc/b/a/b/f;->l:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lcom/google/android/material/datepicker/g;->l0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, Lcom/google/android/material/datepicker/g$c;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v6

    const/4 v8, 0x0

    move-object v4, p2

    move-object v5, p0

    move v7, v9

    invoke-direct/range {v4 .. v9}, Lcom/google/android/material/datepicker/g$c;-><init>(Lcom/google/android/material/datepicker/g;Landroid/content/Context;IZI)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->l0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object p2, p0, Lcom/google/android/material/datepicker/g;->l0:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v0, Lcom/google/android/material/datepicker/g;->a0:Ljava/lang/Object;

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    new-instance p2, Lcom/google/android/material/datepicker/k;

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->f0:Lcom/google/android/material/datepicker/d;

    iget-object v1, p0, Lcom/google/android/material/datepicker/g;->g0:Lcom/google/android/material/datepicker/a;

    new-instance v4, Lcom/google/android/material/datepicker/g$d;

    invoke-direct {v4, p0}, Lcom/google/android/material/datepicker/g$d;-><init>(Lcom/google/android/material/datepicker/g;)V

    invoke-direct {p2, p3, v0, v1, v4}, Lcom/google/android/material/datepicker/k;-><init>(Landroid/content/Context;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/a;Lcom/google/android/material/datepicker/g$l;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->l0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    invoke-virtual {p3}, Landroid/view/ContextThemeWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lc/b/a/b/g;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    sget v1, Lc/b/a/b/f;->m:I

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v1, p0, Lcom/google/android/material/datepicker/g;->k0:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    iget-object v1, p0, Lcom/google/android/material/datepicker/g;->k0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v4, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-direct {v4, p3, v0, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;IIZ)V

    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->k0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/google/android/material/datepicker/q;

    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/q;-><init>(Lcom/google/android/material/datepicker/g;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$g;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->k0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lcom/google/android/material/datepicker/g;->x2()Landroidx/recyclerview/widget/RecyclerView$n;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->h(Landroidx/recyclerview/widget/RecyclerView$n;)V

    :cond_1
    sget v0, Lc/b/a/b/f;->f:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-direct {p0, p1, p2}, Lcom/google/android/material/datepicker/g;->w2(Landroid/view/View;Lcom/google/android/material/datepicker/k;)V

    :cond_2
    invoke-static {p3}, Lcom/google/android/material/datepicker/h;->u2(Landroid/content/Context;)Z

    move-result p3

    if-nez p3, :cond_3

    new-instance p3, Landroidx/recyclerview/widget/h;

    invoke-direct {p3}, Landroidx/recyclerview/widget/h;-><init>()V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->l0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/n;->b(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_3
    iget-object p3, p0, Lcom/google/android/material/datepicker/g;->l0:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->h0:Lcom/google/android/material/datepicker/i;

    invoke-virtual {p2, v0}, Lcom/google/android/material/datepicker/k;->x(Lcom/google/android/material/datepicker/i;)I

    move-result p2

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->k1(I)V

    return-object p1
.end method

.method public s1(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->s1(Landroid/os/Bundle;)V

    iget v0, p0, Lcom/google/android/material/datepicker/g;->e0:I

    const-string v1, "THEME_RES_ID_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->f0:Lcom/google/android/material/datepicker/d;

    const-string v1, "GRID_SELECTOR_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->g0:Lcom/google/android/material/datepicker/a;

    const-string v1, "CALENDAR_CONSTRAINTS_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->h0:Lcom/google/android/material/datepicker/i;

    const-string v1, "CURRENT_MONTH_KEY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method

.method y2()Lcom/google/android/material/datepicker/a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->g0:Lcom/google/android/material/datepicker/a;

    return-object v0
.end method

.method z2()Lcom/google/android/material/datepicker/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/g;->j0:Lcom/google/android/material/datepicker/c;

    return-object v0
.end method
