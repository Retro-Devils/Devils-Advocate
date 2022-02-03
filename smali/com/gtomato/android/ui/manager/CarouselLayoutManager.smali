.class public Lcom/gtomato/android/ui/manager/CarouselLayoutManager;
.super Landroidx/recyclerview/widget/RecyclerView$o;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g;
    }
.end annotation


# static fields
.field private static final s:Ljava/lang/String; = "CarouselLayoutManager"

.field public static final t:Lc/c/a/a/c/a$l;

.field public static final u:Lc/c/a/a/c/a$k;


# instance fields
.field private A:I

.field private B:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private C:Landroid/os/Handler;

.field private D:Landroidx/recyclerview/widget/RecyclerView;

.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:I

.field private K:Z

.field private L:Z

.field private M:I

.field private N:Lc/c/a/a/c/a$l;

.field private O:Lc/c/a/a/c/a$k;

.field private v:Lc/c/a/a/c/a$g;

.field private w:Lc/c/a/a/c/a$h;

.field private x:Z

.field private y:Lc/c/a/a/c/a$f;

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc/c/a/a/b/c;

    new-instance v1, Lc/c/a/a/b/e;

    invoke-direct {v1}, Lc/c/a/a/b/e;-><init>()V

    invoke-direct {v0, v1}, Lc/c/a/a/b/c;-><init>(Lc/c/a/a/c/a$l;)V

    sput-object v0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->t:Lc/c/a/a/c/a$l;

    new-instance v0, Lc/c/a/a/a/b;

    invoke-direct {v0}, Lc/c/a/a/a/b;-><init>()V

    sput-object v0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->u:Lc/c/a/a/c/a$k;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$o;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->v:Lc/c/a/a/c/a$g;

    iput-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->w:Lc/c/a/a/c/a$h;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->x:Z

    sget-object v2, Lc/c/a/a/c/a$f;->b:Lc/c/a/a/c/a$f;

    iput-object v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->y:Lc/c/a/a/c/a$f;

    const/4 v2, 0x0

    iput v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->z:I

    iput v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->A:I

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iput-object v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->B:Ljava/util/Queue;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->C:Landroid/os/Handler;

    iput-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->D:Landroidx/recyclerview/widget/RecyclerView;

    iput v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->G:I

    iput v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->H:I

    iput v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->I:I

    iput v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->J:I

    iput-boolean v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->K:Z

    iput-boolean v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->L:Z

    iput v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    sget-object v1, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->t:Lc/c/a/a/c/a$l;

    iput-object v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->N:Lc/c/a/a/c/a$l;

    invoke-virtual {p0, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->A2(Lc/c/a/a/c/a$l;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {p0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->s2()V

    return-void
.end method

.method private C2()V
    .locals 2

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->A:I

    and-int/lit8 v0, v0, 0x7

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->I:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->i0()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->j0()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->i0()I

    move-result v1

    add-int/2addr v0, v1

    :goto_0
    iput v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->G:I

    goto :goto_1

    :cond_0
    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->I:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->j0()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    sub-int/2addr v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->i0()I

    move-result v0

    goto :goto_0

    :goto_1
    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->A:I

    and-int/lit8 v0, v0, 0x70

    const/16 v1, 0x10

    if-eq v0, v1, :cond_3

    const/16 v1, 0x50

    if-eq v0, v1, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->k0()I

    move-result v0

    goto :goto_2

    :cond_2
    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->J:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h0()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->F:I

    sub-int/2addr v0, v1

    goto :goto_2

    :cond_3
    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->J:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->k0()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h0()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->F:I

    sub-int/2addr v0, v1

    div-int/lit8 v0, v0, 0x2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->k0()I

    move-result v1

    add-int/2addr v0, v1

    :goto_2
    iput v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->H:I

    return-void
.end method

.method static synthetic U1(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)Lc/c/a/a/c/a$g;
    .locals 0

    iget-object p0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->v:Lc/c/a/a/c/a$g;

    return-object p0
.end method

.method static synthetic V1(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)Lc/c/a/a/c/a$h;
    .locals 0

    iget-object p0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->w:Lc/c/a/a/c/a$h;

    return-object p0
.end method

.method private X1(ILc/c/a/b/a;Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lc/c/a/b/a<",
            "Landroid/view/View;",
            ">;",
            "Landroidx/recyclerview/widget/RecyclerView$v;",
            "Landroidx/recyclerview/widget/RecyclerView$a0;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "drawChild (%d)"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v3, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->o2(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->B2(I)I

    move-result v1

    invoke-virtual {p2, v1}, Lc/c/a/b/a;->b(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    if-nez p2, :cond_0

    invoke-virtual {p3, v1}, Landroidx/recyclerview/widget/RecyclerView$v;->o(I)Landroid/view/View;

    move-result-object p2

    new-instance p3, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$b;

    invoke-direct {p3, p0, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$b;-><init>(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p3, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$c;

    invoke-direct {p3, p0, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$c;-><init>(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;I)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->d(Landroid/view/View;)V

    const/4 p3, 0x3

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, p3, v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, p3, v0

    const/4 v0, 0x2

    aput-object p2, p3, v0

    const-string v0, "addView (%d [%d]) %s"

    invoke-static {v0, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {p3, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->o2(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->h(Landroid/view/View;)V

    :goto_0
    invoke-virtual {p0, p2, v3, v3}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->G0(Landroid/view/View;II)V

    invoke-virtual {p4}, Landroidx/recyclerview/widget/RecyclerView$a0;->h()Z

    move-result p3

    if-eqz p3, :cond_1

    return-void

    :cond_1
    iget v6, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->G:I

    iget v7, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->H:I

    iget p3, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    add-int v8, v6, p3

    iget p3, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->F:I

    add-int v9, v7, p3

    move-object v4, p0

    move-object v5, p2

    invoke-virtual/range {v4 .. v9}, Landroidx/recyclerview/widget/RecyclerView$o;->E0(Landroid/view/View;IIII)V

    iget-object p3, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->N:Lc/c/a/a/c/a$l;

    iget p4, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    invoke-virtual {p0, p4}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->q2(I)F

    move-result p4

    int-to-float p1, p1

    sub-float/2addr p4, p1

    neg-float p1, p4

    invoke-interface {p3, p2, p1}, Lc/c/a/a/c/a$l;->b(Landroid/view/View;F)V

    return-void
.end method

.method private Z1()I
    .locals 2

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    invoke-direct {p0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->b2()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    return v0
.end method

.method private a2()I
    .locals 2

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    invoke-direct {p0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->b2()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    return v0
.end method

.method private b2()I
    .locals 2

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->I:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->j0()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->i0()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method private h2()I
    .locals 2

    invoke-direct {p0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->Z1()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->q2(I)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-int v0, v0

    iget v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->z:I

    sub-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->x:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    :goto_0
    return v0
.end method

.method private i2()I
    .locals 2

    invoke-direct {p0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->a2()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->q2(I)F

    move-result v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    iget v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->z:I

    add-int/2addr v0, v1

    iget-boolean v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->x:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->c0()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_0
    return v0
.end method

.method private static varargs n2(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lc/c/a/a/c/a;->O1()Z

    move-result v0

    if-eqz v0, :cond_1

    array-length v0, p1

    if-lez v0, :cond_0

    sget-object v0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->s:Ljava/lang/String;

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->s:Ljava/lang/String;

    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method private static varargs o2(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Lc/c/a/a/c/a;->O1()Z

    move-result v0

    if-eqz v0, :cond_1

    array-length v0, p1

    if-lez v0, :cond_0

    sget-object v0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->s:Ljava/lang/String;

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->s:Ljava/lang/String;

    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method private p2(Landroidx/recyclerview/widget/RecyclerView$v;)V
    .locals 5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->c0()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    iget v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->F:I

    mul-int v0, v0, v1

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$v;->o(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->d(Landroid/view/View;)V

    invoke-virtual {p0, v1, v0, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->G0(Landroid/view/View;II)V

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->W(Landroid/view/View;)I

    move-result v2

    iput v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->V(Landroid/view/View;)I

    move-result v2

    iput v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->F:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "child width = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", height = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->F:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", my width = "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->s0()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v4}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->n2(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "scrap width = "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->n2(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, v1, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->y(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$v;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public A2(Lc/c/a/a/c/a$l;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;
    .locals 2

    iget-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->N:Lc/c/a/a/c/a$l;

    if-eqz p1, :cond_0

    move-object v1, p1

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->t:Lc/c/a/a/c/a$l;

    :goto_0
    iput-object v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->N:Lc/c/a/a/c/a$l;

    if-eq v1, v0, :cond_1

    invoke-virtual {p0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->s2()V

    invoke-interface {p1, p0}, Lc/c/a/a/c/a$l;->c(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)V

    :cond_1
    return-object p0
.end method

.method public B2(I)I
    .locals 1

    iget-boolean v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->x:Z

    if-nez v0, :cond_0

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->c0()I

    move-result v0

    rem-int/2addr p1, v0

    if-gez p1, :cond_1

    add-int/2addr p1, v0

    :cond_1
    return p1
.end method

.method public D1(ILandroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)I
    .locals 4

    iget-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->O:Lc/c/a/a/c/a$k;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lc/c/a/a/c/a$k;->c(I)I

    move-result p1

    :cond_0
    iget-boolean v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->x:Z

    if-nez v0, :cond_3

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    add-int v1, v0, p1

    const/4 v2, 0x0

    if-gez v1, :cond_2

    if-lez v0, :cond_1

    neg-int p1, v0

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->c0()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    mul-int v0, v0, v1

    iget v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    add-int v3, v1, p1

    if-le v3, v0, :cond_3

    if-ge v1, v0, :cond_1

    sub-int/2addr v0, v1

    move p1, v0

    :cond_3
    :goto_0
    if-eqz p1, :cond_4

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    invoke-virtual {p0, p2, p3}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->Y1(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    :cond_4
    iget-object p2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->O:Lc/c/a/a/c/a$k;

    if-eqz p2, :cond_5

    invoke-interface {p2, p1}, Lc/c/a/a/c/a$k;->b(I)I

    move-result p1

    :cond_5
    return p1
.end method

.method public E1(I)V
    .locals 10

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->c0()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->B:Ljava/util/Queue;

    new-instance v1, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$d;

    invoke-direct {v1, p0, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$d;-><init>(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;I)V

    invoke-interface {v0, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    mul-int v0, v0, p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "scrollToPosition "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "scrollOffset "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " -> "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v1, v4}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->n2(Ljava/lang/String;[Ljava/lang/Object;)V

    iget v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    sub-int v1, v0, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    int-to-double v4, v1

    iget v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    int-to-double v6, v1

    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v6, v6, v8

    cmpl-double v1, v4, v6

    if-lez v1, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->L:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "set mScrollPositionUpdated"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v1, v3, [Ljava/lang/Object;

    invoke-static {p1, v1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->n2(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    iput v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x12

    if-lt p1, v0, :cond_2

    iget-object p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->D:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->isInLayout()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->A1()V

    :cond_2
    return-void
.end method

.method public G()Landroidx/recyclerview/widget/RecyclerView$p;
    .locals 2

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$p;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroidx/recyclerview/widget/RecyclerView$p;-><init>(II)V

    return-object v0
.end method

.method public G0(Landroid/view/View;II)V
    .locals 5

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView$p;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView$o;->k(Landroid/view/View;Landroid/graphics/Rect;)V

    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    add-int/2addr p2, v2

    iget v2, v1, Landroid/graphics/Rect;->top:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v1

    add-int/2addr p3, v2

    iget-object v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->D:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v1

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->I:I

    :goto_0
    iget-object v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->D:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    goto :goto_1

    :cond_1
    iget v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->J:I

    :goto_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->i0()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->j0()I

    move-result v4

    add-int/2addr v3, v4

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v3, v4

    iget v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v3, v4

    add-int/2addr v3, p2

    iget p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/4 v4, 0x0

    invoke-static {v1, v3, p2, v4}, Landroidx/recyclerview/widget/RecyclerView$o;->O(IIIZ)I

    move-result p2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->k0()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->h0()I

    move-result v3

    add-int/2addr v1, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v1, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v1, v3

    add-int/2addr v1, p3

    iget p3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {v2, v1, p3, v4}, Landroidx/recyclerview/widget/RecyclerView$o;->O(IIIZ)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public J1(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->J1(II)V

    iput p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->I:I

    iput p2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->J:I

    return-void
.end method

.method public K0(Landroidx/recyclerview/widget/RecyclerView$g;Landroidx/recyclerview/widget/RecyclerView$g;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->K0(Landroidx/recyclerview/widget/RecyclerView$g;Landroidx/recyclerview/widget/RecyclerView$g;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->q1()V

    return-void
.end method

.method public M0(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->M0(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->D:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public O0(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$v;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$o;->O0(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$v;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->D:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public Q1(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;I)V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "smoothScrollToPosition "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->n2(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->c0()I

    move-result v0

    iget v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    if-nez v2, :cond_0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->B:Ljava/util/Queue;

    new-instance v1, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$e;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$e;-><init>(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;I)V

    invoke-interface {v0, v1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    mul-int v2, v2, v0

    if-nez v2, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->l2()Z

    move-result p2

    if-nez p2, :cond_2

    add-int/lit8 p2, v0, -0x1

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p2

    goto :goto_0

    :cond_2
    rem-int p2, p3, v0

    :goto_0
    const/4 p3, -0x1

    const v2, 0x7fffffff

    :goto_1
    const/4 v3, 0x1

    if-gt p3, v3, :cond_5

    invoke-virtual {p0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->l2()Z

    move-result v3

    if-nez v3, :cond_3

    if-nez p3, :cond_4

    :cond_3
    mul-int v3, p3, v0

    add-int/2addr v3, p2

    iget v4, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    mul-int v3, v3, v4

    iget v5, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    mul-int v4, v4, v0

    rem-int/2addr v5, v4

    sub-int/2addr v3, v5

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v4

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v5

    if-ge v4, v5, :cond_4

    move v2, v3

    :cond_4
    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {p1, v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->o1(II)V

    return-void
.end method

.method W1(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;II)V
    .locals 4

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    invoke-static {p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p3

    invoke-static {p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p4

    const/4 v1, 0x0

    iput v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->I:I

    iput v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->J:I

    invoke-direct {p0, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->p2(Landroidx/recyclerview/widget/RecyclerView$v;)V

    iget p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->g0()I

    move-result v1

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->F:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->f0()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    const/high16 v2, 0x40000000    # 2.0f

    const/high16 v3, -0x80000000

    if-eq p2, v3, :cond_0

    if-eq p2, v2, :cond_1

    move p3, p1

    goto :goto_0

    :cond_0
    invoke-static {p1, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    :cond_1
    :goto_0
    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_3

    move p4, v1

    goto :goto_1

    :cond_2
    invoke-static {v1, p4}, Ljava/lang/Math;->min(II)I

    move-result p4

    :cond_3
    :goto_1
    iput p3, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->I:I

    iput p4, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->J:I

    invoke-virtual {p0, p3, p4}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->J1(II)V

    return-void
.end method

.method public X0(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->X0(Landroidx/recyclerview/widget/RecyclerView;II)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->K:Z

    return-void
.end method

.method public Y0(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->Y0(Landroidx/recyclerview/widget/RecyclerView;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->K:Z

    return-void
.end method

.method public Y1(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V
    .locals 11

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    const-string v2, "fillChildrenView =============="

    invoke-static {v2, v1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->o2(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v1, Lc/c/a/b/a;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v2

    invoke-direct {v1, v2}, Lc/c/a/b/a;-><init>(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getChildCount() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v2, v4}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->o2(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result v2

    const/4 v4, 0x1

    sub-int/2addr v2, v4

    :goto_0
    const/4 v5, 0x2

    if-ltz v2, :cond_0

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView$o;->L(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/RecyclerView$o;->l0(Landroid/view/View;)I

    move-result v7

    invoke-virtual {v1, v7, v6}, Lc/c/a/b/a;->c(ILjava/lang/Object;)V

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v0

    aput-object v6, v5, v4

    const-string v7, "viewCache[%d] = %s"

    invoke-static {v7, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    new-array v7, v0, [Ljava/lang/Object;

    invoke-static {v5, v7}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->o2(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, v6}, Landroidx/recyclerview/widget/RecyclerView$o;->z(Landroid/view/View;)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->h2()I

    move-result v2

    invoke-direct {p0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->i2()I

    move-result v6

    invoke-virtual {p0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->d2()I

    move-result v7

    if-gt v2, v6, :cond_c

    sget-object v8, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$f;->a:[I

    iget-object v9, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->y:Lc/c/a/a/c/a$f;

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v8, v8, v9

    if-eq v8, v4, :cond_9

    if-eq v8, v5, :cond_9

    const/4 v9, 0x3

    if-eq v8, v9, :cond_5

    const/4 v9, 0x4

    if-eq v8, v9, :cond_1

    goto :goto_6

    :cond_1
    invoke-direct {p0, v7, v1, p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->X1(ILc/c/a/b/a;Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    sub-int/2addr v7, v4

    move v8, v6

    :cond_2
    :goto_1
    if-ge v7, v2, :cond_3

    if-gt v8, v6, :cond_c

    :cond_3
    if-lt v7, v2, :cond_4

    invoke-direct {p0, v7, v1, p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->X1(ILc/c/a/b/a;Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    add-int/lit8 v7, v7, -0x1

    :cond_4
    if-gt v8, v6, :cond_2

    invoke-direct {p0, v8, v1, p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->X1(ILc/c/a/b/a;Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    sub-int v8, v7, v2

    sub-int v9, v6, v7

    if-le v8, v9, :cond_6

    invoke-direct {p0, v2, v1, p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->X1(ILc/c/a/b/a;Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_6
    :goto_3
    sub-int v9, v6, v7

    if-ge v8, v9, :cond_7

    invoke-direct {p0, v6, v1, p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->X1(ILc/c/a/b/a;Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    add-int/lit8 v6, v6, -0x1

    goto :goto_3

    :cond_7
    :goto_4
    if-ge v2, v6, :cond_8

    invoke-direct {p0, v2, v1, p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->X1(ILc/c/a/b/a;Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    invoke-direct {p0, v6, v1, p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->X1(ILc/c/a/b/a;Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v6, v6, -0x1

    goto :goto_4

    :cond_8
    invoke-direct {p0, v7, v1, p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->X1(ILc/c/a/b/a;Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    goto :goto_6

    :cond_9
    iget-object v7, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->y:Lc/c/a/a/c/a$f;

    sget-object v8, Lc/c/a/a/c/a$f;->c:Lc/c/a/a/c/a$f;

    if-ne v7, v8, :cond_a

    const/4 v7, -0x1

    move v10, v6

    move v6, v2

    move v2, v10

    goto :goto_5

    :cond_a
    const/4 v7, 0x1

    :goto_5
    sub-int/2addr v2, v7

    :cond_b
    add-int/2addr v2, v7

    invoke-direct {p0, v2, v1, p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->X1(ILc/c/a/b/a;Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    if-ne v2, v6, :cond_b

    :cond_c
    :goto_6
    invoke-virtual {v1}, Lc/c/a/b/a;->d()I

    move-result p2

    sub-int/2addr p2, v4

    :goto_7
    if-ltz p2, :cond_e

    new-array v2, v5, [Ljava/lang/Object;

    invoke-virtual {v1, p2}, Lc/c/a/b/a;->a(I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v2, v0

    invoke-virtual {v1, p2}, Lc/c/a/b/a;->e(I)Ljava/util/ArrayList;

    move-result-object v6

    aput-object v6, v2, v4

    const-string v6, "recycleView (%d) %s"

    invoke-static {v6, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-array v6, v0, [Ljava/lang/Object;

    invoke-static {v2, v6}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->o2(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v1, p2}, Lc/c/a/b/a;->e(I)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    invoke-virtual {p1, v6}, Landroidx/recyclerview/widget/RecyclerView$v;->B(Landroid/view/View;)V

    goto :goto_8

    :cond_d
    add-int/lit8 p2, p2, -0x1

    goto :goto_7

    :cond_e
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->M()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->o2(Ljava/lang/String;[Ljava/lang/Object;)V

    new-array p1, v0, [Ljava/lang/Object;

    const-string p2, "fillChildrenView ============== end"

    invoke-static {p2, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->o2(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public Z0(Landroidx/recyclerview/widget/RecyclerView;III)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$o;->Z0(Landroidx/recyclerview/widget/RecyclerView;III)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->K:Z

    return-void
.end method

.method public a1(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->a1(Landroidx/recyclerview/widget/RecyclerView;II)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->K:Z

    return-void
.end method

.method public b1(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$o;->b1(Landroidx/recyclerview/widget/RecyclerView;II)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->K:Z

    const/4 p1, 0x0

    :goto_0
    if-ge p1, p3, :cond_1

    add-int v0, p2, p1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$o;->F(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->forceLayout()V

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public c2()F
    .locals 3

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    invoke-virtual {p0, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->q2(I)F

    move-result v0

    float-to-double v1, v0

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    return v0
.end method

.method public d1(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V
    .locals 4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->c0()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->x(Landroidx/recyclerview/widget/RecyclerView$v;)V

    return-void

    :cond_0
    const-string v0, "onLayoutChildren =============="

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/Exception;

    invoke-direct {v2}, Ljava/lang/Exception;-><init>()V

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->o2(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->p2(Landroidx/recyclerview/widget/RecyclerView$v;)V

    invoke-direct {p0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->C2()V

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$a0;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->K:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->L:Z

    if-eqz v0, :cond_2

    :cond_1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->x(Landroidx/recyclerview/widget/RecyclerView$v;)V

    iput-boolean v3, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->K:Z

    iput-boolean v3, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->L:Z

    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->Y1(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V

    const-string p1, "onLayoutChildren : Queue Pending Tasks"

    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->o2(Ljava/lang/String;[Ljava/lang/Object;)V

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->B:Ljava/util/Queue;

    new-instance p2, Ljava/util/LinkedList;

    invoke-direct {p2}, Ljava/util/LinkedList;-><init>()V

    iput-object p2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->B:Ljava/util/Queue;

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance p2, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$a;

    invoke-direct {p2, p0, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$a;-><init>(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;Ljava/util/Queue;)V

    invoke-virtual {p0, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->r2(Ljava/lang/Runnable;)Z

    const-string p1, "onLayoutChildren ============== end"

    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->o2(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public d2()I
    .locals 1

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    invoke-virtual {p0, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->q2(I)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public e2()F
    .locals 1

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    invoke-virtual {p0, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->q2(I)F

    move-result v0

    return v0
.end method

.method public f1(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;II)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    iput v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->F:I

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/RecyclerView$o;->f1(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;II)V

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->W1(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;II)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "carousel width = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->I:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", height = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->J:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array p2, v0, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->n2(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lc/c/a/a/c/a;->O1()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    invoke-static {p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    invoke-static {p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p3

    invoke-static {p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p4

    sget-object v1, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->s:Ljava/lang/String;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v0

    const/4 p1, 0x1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, p1

    const/4 p1, 0x2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, p1

    const/4 p1, 0x3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, p1

    const-string p1, "carousel onMeasure %d %d %d %d"

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public f2()I
    .locals 1

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->z:I

    return v0
.end method

.method public g2()I
    .locals 1

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->A:I

    return v0
.end method

.method public i1(Landroid/os/Parcelable;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$o;->i1(Landroid/os/Parcelable;)V

    instance-of v0, p1, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p1, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g;

    iget p1, p1, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g;->b:I

    iput p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    return-void
.end method

.method public j1()Landroid/os/Parcelable;
    .locals 2

    new-instance v0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g;

    invoke-direct {v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g;-><init>()V

    iget v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->M:I

    iput v1, v0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$g;->b:I

    return-object v0
.end method

.method public j2()Lc/c/a/a/c/a$k;
    .locals 1

    iget-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->O:Lc/c/a/a/c/a$k;

    return-object v0
.end method

.method public k2()Lc/c/a/a/c/a$l;
    .locals 1

    iget-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->N:Lc/c/a/a/c/a$l;

    return-object v0
.end method

.method public l()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public l2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->x:Z

    return v0
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public m2(I)Z
    .locals 3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->c0()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->x:Z

    if-nez v2, :cond_1

    if-ltz p1, :cond_2

    if-ge p1, v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method protected q2(I)F
    .locals 1

    iget v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->E:I

    if-eqz v0, :cond_0

    int-to-float p1, p1

    int-to-float v0, v0

    div-float/2addr p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method protected r2(Ljava/lang/Runnable;)Z
    .locals 1

    iget-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->D:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public s2()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->z2(Lc/c/a/a/c/a$k;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    sget-object v0, Lc/c/a/a/c/a$f;->b:Lc/c/a/a/c/a$f;

    invoke-virtual {p0, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->t2(Lc/c/a/a/c/a$f;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    return-void
.end method

.method public t2(Lc/c/a/a/c/a$f;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;
    .locals 0

    iput-object p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->y:Lc/c/a/a/c/a$f;

    return-object p0
.end method

.method public u2(Lc/c/a/a/c/a;I)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;
    .locals 0

    iput p2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->z:I

    add-int/lit8 p2, p2, 0x2

    mul-int/lit8 p2, p2, 0x2

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V

    return-object p0
.end method

.method public v2(I)V
    .locals 0

    iput p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->A:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$o;->A1()V

    return-void
.end method

.method public w2(Z)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;
    .locals 0

    iput-boolean p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->x:Z

    return-object p0
.end method

.method public x2(Lc/c/a/a/c/a$g;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;
    .locals 0

    iput-object p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->v:Lc/c/a/a/c/a$g;

    return-object p0
.end method

.method public y2(Lc/c/a/a/c/a$h;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;
    .locals 0

    iput-object p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->w:Lc/c/a/a/c/a$h;

    return-object p0
.end method

.method public z2(Lc/c/a/a/c/a$k;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->u:Lc/c/a/a/c/a$k;

    :goto_0
    iput-object p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->O:Lc/c/a/a/c/a$k;

    return-object p0
.end method
