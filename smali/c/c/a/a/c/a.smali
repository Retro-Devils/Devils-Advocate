.class public Lc/c/a/a/c/a;
.super Landroidx/recyclerview/widget/RecyclerView;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/c/a/a/c/a$k;,
        Lc/c/a/a/c/a$l;,
        Lc/c/a/a/c/a$i;,
        Lc/c/a/a/c/a$h;,
        Lc/c/a/a/c/a$g;,
        Lc/c/a/a/c/a$j;,
        Lc/c/a/a/c/a$f;,
        Lc/c/a/a/c/a$e;
    }
.end annotation


# static fields
.field private static final I0:Ljava/lang/String;

.field private static J0:Z


# instance fields
.field private K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

.field private L0:Lc/c/a/a/c/a$l;

.field private M0:Z

.field private N0:Z

.field private O0:Z

.field private P0:Z

.field private Q0:Lc/c/a/a/c/a$j;

.field private R0:Lc/c/a/a/c/a$g;

.field private S0:Lc/c/a/a/c/a$h;

.field private T0:Lc/c/a/a/c/a$i;

.field private U0:I

.field private V0:F

.field private W0:Z

.field private X0:Z

.field private Y0:Landroidx/recyclerview/widget/RecyclerView$t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lc/c/a/a/c/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc/c/a/a/c/a;->I0:Ljava/lang/String;

    const/4 v0, 0x0

    sput-boolean v0, Lc/c/a/a/c/a;->J0:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object p1, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->t:Lc/c/a/a/c/a$l;

    iput-object p1, p0, Lc/c/a/a/c/a;->L0:Lc/c/a/a/c/a$l;

    const/high16 p1, -0x80000000

    iput p1, p0, Lc/c/a/a/c/a;->U0:I

    const/4 p1, 0x0

    iput p1, p0, Lc/c/a/a/c/a;->V0:F

    const/4 p1, 0x0

    iput-boolean p1, p0, Lc/c/a/a/c/a;->X0:Z

    new-instance p1, Lc/c/a/a/c/a$a;

    invoke-direct {p1, p0}, Lc/c/a/a/c/a$a;-><init>(Lc/c/a/a/c/a;)V

    iput-object p1, p0, Lc/c/a/a/c/a;->Y0:Landroidx/recyclerview/widget/RecyclerView$t;

    invoke-direct {p0}, Lc/c/a/a/c/a;->N1()V

    return-void
.end method

.method static synthetic A1(Lc/c/a/a/c/a;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;
    .locals 0

    iget-object p0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    return-object p0
.end method

.method static synthetic B1(Lc/c/a/a/c/a;)Z
    .locals 0

    iget-boolean p0, p0, Lc/c/a/a/c/a;->N0:Z

    return p0
.end method

.method static synthetic C1(Lc/c/a/a/c/a;)F
    .locals 0

    iget p0, p0, Lc/c/a/a/c/a;->V0:F

    return p0
.end method

.method static synthetic D1(Lc/c/a/a/c/a;F)F
    .locals 0

    iput p1, p0, Lc/c/a/a/c/a;->V0:F

    return p1
.end method

.method static synthetic E1(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lc/c/a/a/c/a;->P1(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic F1(Lc/c/a/a/c/a;)Z
    .locals 0

    iget-boolean p0, p0, Lc/c/a/a/c/a;->W0:Z

    return p0
.end method

.method static synthetic G1(Lc/c/a/a/c/a;Z)Z
    .locals 0

    iput-boolean p1, p0, Lc/c/a/a/c/a;->W0:Z

    return p1
.end method

.method static synthetic H1(Lc/c/a/a/c/a;I)V
    .locals 0

    invoke-direct {p0, p1}, Lc/c/a/a/c/a;->M1(I)V

    return-void
.end method

.method static synthetic I1(Lc/c/a/a/c/a;)Lc/c/a/a/c/a$j;
    .locals 0

    iget-object p0, p0, Lc/c/a/a/c/a;->Q0:Lc/c/a/a/c/a$j;

    return-object p0
.end method

.method static synthetic J1(Lc/c/a/a/c/a;)Z
    .locals 0

    iget-boolean p0, p0, Lc/c/a/a/c/a;->P0:Z

    return p0
.end method

.method static synthetic K1(Lc/c/a/a/c/a;)Lc/c/a/a/c/a$g;
    .locals 0

    iget-object p0, p0, Lc/c/a/a/c/a;->R0:Lc/c/a/a/c/a$g;

    return-object p0
.end method

.method static synthetic L1(Lc/c/a/a/c/a;)Lc/c/a/a/c/a$h;
    .locals 0

    iget-object p0, p0, Lc/c/a/a/c/a;->S0:Lc/c/a/a/c/a$h;

    return-object p0
.end method

.method private M1(I)V
    .locals 4

    iget-object v0, p0, Lc/c/a/a/c/a;->T0:Lc/c/a/a/c/a$i;

    if-eqz v0, :cond_1

    iget v1, p0, Lc/c/a/a/c/a;->U0:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_0

    if-eq v1, p1, :cond_0

    iget-object v2, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v2, v1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->B2(I)I

    move-result v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v3

    invoke-interface {v0, p0, v1, v2, v3}, Lc/c/a/a/c/a$i;->a(Lc/c/a/a/c/a;IILandroidx/recyclerview/widget/RecyclerView$g;)V

    :cond_0
    iget-object v0, p0, Lc/c/a/a/c/a;->T0:Lc/c/a/a/c/a$i;

    iget-object v1, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v1, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->B2(I)I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v2

    invoke-interface {v0, p0, p1, v1, v2}, Lc/c/a/a/c/a$i;->b(Lc/c/a/a/c/a;IILandroidx/recyclerview/widget/RecyclerView$g;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lc/c/a/a/c/a;->X0:Z

    :goto_0
    iput p1, p0, Lc/c/a/a/c/a;->U0:I

    return-void
.end method

.method private N1()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc/c/a/a/c/a;->M0:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc/c/a/a/c/a;->N0:Z

    iput-boolean v0, p0, Lc/c/a/a/c/a;->O0:Z

    iput-boolean v0, p0, Lc/c/a/a/c/a;->P0:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lc/c/a/a/c/a;->Q0:Lc/c/a/a/c/a$j;

    iput-object v0, p0, Lc/c/a/a/c/a;->R0:Lc/c/a/a/c/a$g;

    iput-object v0, p0, Lc/c/a/a/c/a;->S0:Lc/c/a/a/c/a$h;

    iget-object v0, p0, Lc/c/a/a/c/a;->Y0:Landroidx/recyclerview/widget/RecyclerView$t;

    invoke-super {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$t;)V

    return-void
.end method

.method public static O1()Z
    .locals 1

    sget-boolean v0, Lc/c/a/a/c/a;->J0:Z

    return v0
.end method

.method private static varargs P1(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    sget-boolean v0, Lc/c/a/a/c/a;->J0:Z

    if-eqz v0, :cond_1

    array-length v0, p1

    if-lez v0, :cond_0

    sget-object v0, Lc/c/a/a/c/a;->I0:Ljava/lang/String;

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    sget-object p1, Lc/c/a/a/c/a;->I0:Ljava/lang/String;

    invoke-static {p1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public static setDebug(Z)V
    .locals 0

    sput-boolean p0, Lc/c/a/a/c/a;->J0:Z

    return-void
.end method

.method private setTransformerInternal(Lc/c/a/a/c/a$l;)V
    .locals 1

    iput-object p1, p0, Lc/c/a/a/c/a;->L0:Lc/c/a/a/c/a$l;

    iget-object v0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v0, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->A2(Lc/c/a/a/c/a$l;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    return-void
.end method


# virtual methods
.method public Q1(I)Lc/c/a/a/c/a;
    .locals 1

    iget-object v0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v0, p0, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->u2(Lc/c/a/a/c/a;I)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    return-object p0
.end method

.method public R1(Lc/c/a/a/c/a$g;)Lc/c/a/a/c/a;
    .locals 0

    iput-object p1, p0, Lc/c/a/a/c/a;->R0:Lc/c/a/a/c/a$g;

    return-object p0
.end method

.method public S1(Lc/c/a/a/c/a$h;)Lc/c/a/a/c/a;
    .locals 0

    iput-object p1, p0, Lc/c/a/a/c/a;->S0:Lc/c/a/a/c/a$h;

    return-object p0
.end method

.method public T1(Lc/c/a/a/c/a$j;)Lc/c/a/a/c/a;
    .locals 0

    iput-object p1, p0, Lc/c/a/a/c/a;->Q0:Lc/c/a/a/c/a$j;

    return-object p0
.end method

.method public getCurrentAdapterPosition()I
    .locals 2

    iget-object v0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->d2()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->B2(I)I

    move-result v0

    return v0
.end method

.method public getCurrentOffset()F
    .locals 1

    iget-object v0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->c2()F

    move-result v0

    return v0
.end method

.method public getCurrentPosition()I
    .locals 1

    iget-object v0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->d2()I

    move-result v0

    return v0
.end method

.method public getCurrentPositionPoint()F
    .locals 1

    iget-object v0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->e2()F

    move-result v0

    return v0
.end method

.method public getExtraVisibleChilds()I
    .locals 1

    iget-object v0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->f2()I

    move-result v0

    return v0
.end method

.method public getGravity()I
    .locals 1

    iget-object v0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->g2()I

    move-result v0

    return v0
.end method

.method public getLastScrollStartPositionPoint()F
    .locals 1

    iget v0, p0, Lc/c/a/a/c/a;->V0:F

    return v0
.end method

.method public bridge synthetic getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$o;
    .locals 1

    invoke-virtual {p0}, Lc/c/a/a/c/a;->getLayoutManager()Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    move-result-object v0

    return-object v0
.end method

.method public getLayoutManager()Lcom/gtomato/android/ui/manager/CarouselLayoutManager;
    .locals 1

    iget-object v0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    return-object v0
.end method

.method public getTransformer()Lc/c/a/a/c/a$l;
    .locals 1

    iget-object v0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->k2()Lc/c/a/a/c/a$l;

    move-result-object v0

    return-object v0
.end method

.method public k1(I)V
    .locals 1

    iget-object v0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v0, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->m2(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->k1(I)V

    invoke-direct {p0, p1}, Lc/c/a/a/c/a;->M1(I)V

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroidx/recyclerview/widget/RecyclerView;->onAttachedToWindow()V

    iget-object v0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->d2()I

    move-result v0

    invoke-virtual {p0, v0}, Lc/c/a/a/c/a;->k1(I)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->onMeasure(II)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "CarouselView onMeasure "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lc/c/a/a/c/a;->P1(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    invoke-static {p1}, Lb/g/k/i;->a(Landroid/view/MotionEvent;)I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iput-boolean v1, p0, Lc/c/a/a/c/a;->W0:Z

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lc/c/a/a/c/a;->O0:Z

    if-nez v0, :cond_1

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->setAction(I)V

    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public s1(I)V
    .locals 1

    iget-object v0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v0, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->m2(I)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lc/c/a/a/c/a;->W0:Z

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->s1(I)V

    invoke-direct {p0, p1}, Lc/c/a/a/c/a;->M1(I)V

    return-void
.end method

.method public setDisplayMode(Lc/c/a/a/c/a$e;)V
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Lc/c/a/a/c/a$d;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Mode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not supported"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object p1, p0, Lc/c/a/a/c/a;->L0:Lc/c/a/a/c/a$l;

    goto :goto_0

    :pswitch_1
    new-instance p1, Lc/c/a/a/b/g;

    invoke-direct {p1}, Lc/c/a/a/b/g;-><init>()V

    goto :goto_0

    :pswitch_2
    new-instance p1, Lc/c/a/a/b/d;

    invoke-direct {p1}, Lc/c/a/a/b/d;-><init>()V

    goto :goto_0

    :pswitch_3
    new-instance p1, Lc/c/a/a/b/h;

    invoke-direct {p1}, Lc/c/a/a/b/h;-><init>()V

    goto :goto_0

    :pswitch_4
    new-instance p1, Lc/c/a/a/b/a;

    invoke-direct {p1}, Lc/c/a/a/b/a;-><init>()V

    goto :goto_0

    :pswitch_5
    new-instance p1, Lc/c/a/a/b/i;

    invoke-direct {p1}, Lc/c/a/a/b/i;-><init>()V

    goto :goto_0

    :pswitch_6
    new-instance p1, Lc/c/a/a/b/e;

    invoke-direct {p1}, Lc/c/a/a/b/e;-><init>()V

    :goto_0
    invoke-direct {p0, p1}, Lc/c/a/a/c/a;->setTransformerInternal(Lc/c/a/a/c/a$l;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setGravity(I)V
    .locals 1

    iget-object v0, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v0, p1}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->v2(I)V

    return-void
.end method

.method public final setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "CarouselView doesn\'t support setLayoutManager(LayoutManager)"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLayoutManager(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "CarouselLayoutManager cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "setLayoutManager(CarouselLayoutManager) is not yet supported."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLayoutManagerInternal(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-super {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$o;)V

    iput-object p1, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    iget-boolean v0, p0, Lc/c/a/a/c/a;->M0:Z

    invoke-virtual {p1, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->w2(Z)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lc/c/a/a/c/a;->Q1(I)Lc/c/a/a/c/a;

    iget-object p1, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    new-instance v0, Lc/c/a/a/c/a$b;

    invoke-direct {v0, p0}, Lc/c/a/a/c/a$b;-><init>(Lc/c/a/a/c/a;)V

    invoke-virtual {p1, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->x2(Lc/c/a/a/c/a$g;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    iget-object p1, p0, Lc/c/a/a/c/a;->K0:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    new-instance v0, Lc/c/a/a/c/a$c;

    invoke-direct {v0, p0}, Lc/c/a/a/c/a$c;-><init>(Lc/c/a/a/c/a;)V

    invoke-virtual {p1, v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->y2(Lc/c/a/a/c/a$h;)Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "CarouselLayoutManager cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$t;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "setOnScrollListener(RecyclerView.OnScrollListener) is not supported, use setOnScrollListener(CarouselView.OnScrollListener) instead."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setTransformer(Lc/c/a/a/c/a$l;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/c/a/a/c/a;->setTransformerInternal(Lc/c/a/a/c/a$l;)V

    return-void
.end method

.method public setYTranslation(F)V
    .locals 1

    iget-object v0, p0, Lc/c/a/a/c/a;->L0:Lc/c/a/a/c/a$l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lc/c/a/a/c/a$l;->a(F)V

    :cond_0
    return-void
.end method
