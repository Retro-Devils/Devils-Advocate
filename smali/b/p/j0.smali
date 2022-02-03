.class public abstract Lb/p/j0;
.super Lb/p/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/p/j0$b;,
        Lb/p/j0$c;
    }
.end annotation


# static fields
.field private static final L:[Ljava/lang/String;


# instance fields
.field private M:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "android:visibility:visibility"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "android:visibility:parent"

    aput-object v2, v0, v1

    sput-object v0, Lb/p/j0;->L:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lb/p/m;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lb/p/j0;->M:I

    return-void
.end method

.method private c0(Lb/p/s;)V
    .locals 3

    iget-object v0, p1, Lb/p/s;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    iget-object v1, p1, Lb/p/s;->a:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "android:visibility:visibility"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lb/p/s;->a:Ljava/util/Map;

    iget-object v1, p1, Lb/p/s;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const-string v2, "android:visibility:parent"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v1, p1, Lb/p/s;->b:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    iget-object p1, p1, Lb/p/s;->a:Ljava/util/Map;

    const-string v1, "android:visibility:screenLocation"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private d0(Lb/p/s;Lb/p/s;)Lb/p/j0$c;
    .locals 7

    new-instance v0, Lb/p/j0$c;

    invoke-direct {v0}, Lb/p/j0$c;-><init>()V

    const/4 v1, 0x0

    iput-boolean v1, v0, Lb/p/j0$c;->a:Z

    iput-boolean v1, v0, Lb/p/j0$c;->b:Z

    const-string v2, "android:visibility:parent"

    const/4 v3, 0x0

    const/4 v4, -0x1

    const-string v5, "android:visibility:visibility"

    if-eqz p1, :cond_0

    iget-object v6, p1, Lb/p/s;->a:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    iget-object v6, p1, Lb/p/s;->a:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iput v6, v0, Lb/p/j0$c;->c:I

    iget-object v6, p1, Lb/p/s;->a:Ljava/util/Map;

    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/ViewGroup;

    iput-object v6, v0, Lb/p/j0$c;->e:Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    iput v4, v0, Lb/p/j0$c;->c:I

    iput-object v3, v0, Lb/p/j0$c;->e:Landroid/view/ViewGroup;

    :goto_0
    if-eqz p2, :cond_1

    iget-object v6, p2, Lb/p/s;->a:Ljava/util/Map;

    invoke-interface {v6, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v3, p2, Lb/p/s;->a:Ljava/util/Map;

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iput v3, v0, Lb/p/j0$c;->d:I

    iget-object v3, p2, Lb/p/s;->a:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    iput-object v2, v0, Lb/p/j0$c;->f:Landroid/view/ViewGroup;

    goto :goto_1

    :cond_1
    iput v4, v0, Lb/p/j0$c;->d:I

    iput-object v3, v0, Lb/p/j0$c;->f:Landroid/view/ViewGroup;

    :goto_1
    const/4 v2, 0x1

    if-eqz p1, :cond_6

    if-eqz p2, :cond_6

    iget p1, v0, Lb/p/j0$c;->c:I

    iget p2, v0, Lb/p/j0$c;->d:I

    if-ne p1, p2, :cond_2

    iget-object v3, v0, Lb/p/j0$c;->e:Landroid/view/ViewGroup;

    iget-object v4, v0, Lb/p/j0$c;->f:Landroid/view/ViewGroup;

    if-ne v3, v4, :cond_2

    return-object v0

    :cond_2
    if-eq p1, p2, :cond_4

    if-nez p1, :cond_3

    goto :goto_4

    :cond_3
    if-nez p2, :cond_8

    goto :goto_2

    :cond_4
    iget-object p1, v0, Lb/p/j0$c;->f:Landroid/view/ViewGroup;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    iget-object p1, v0, Lb/p/j0$c;->e:Landroid/view/ViewGroup;

    if-nez p1, :cond_8

    goto :goto_2

    :cond_6
    if-nez p1, :cond_7

    iget p1, v0, Lb/p/j0$c;->d:I

    if-nez p1, :cond_7

    :goto_2
    iput-boolean v2, v0, Lb/p/j0$c;->b:Z

    :goto_3
    iput-boolean v2, v0, Lb/p/j0$c;->a:Z

    goto :goto_5

    :cond_7
    if-nez p2, :cond_8

    iget p1, v0, Lb/p/j0$c;->c:I

    if-nez p1, :cond_8

    :goto_4
    iput-boolean v1, v0, Lb/p/j0$c;->b:Z

    goto :goto_3

    :cond_8
    :goto_5
    return-object v0
.end method


# virtual methods
.method public D()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lb/p/j0;->L:[Ljava/lang/String;

    return-object v0
.end method

.method public F(Lb/p/s;Lb/p/s;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    iget-object v1, p2, Lb/p/s;->a:Ljava/util/Map;

    const-string v2, "android:visibility:visibility"

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    iget-object v3, p1, Lb/p/s;->a:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eq v1, v2, :cond_1

    return v0

    :cond_1
    invoke-direct {p0, p1, p2}, Lb/p/j0;->d0(Lb/p/s;Lb/p/s;)Lb/p/j0$c;

    move-result-object p1

    iget-boolean p2, p1, Lb/p/j0$c;->a:Z

    if-eqz p2, :cond_3

    iget p2, p1, Lb/p/j0$c;->c:I

    if-eqz p2, :cond_2

    iget p1, p1, Lb/p/j0$c;->d:I

    if-nez p1, :cond_3

    :cond_2
    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method public abstract e0(Landroid/view/ViewGroup;Landroid/view/View;Lb/p/s;Lb/p/s;)Landroid/animation/Animator;
.end method

.method public f0(Landroid/view/ViewGroup;Lb/p/s;ILb/p/s;I)Landroid/animation/Animator;
    .locals 2

    iget p3, p0, Lb/p/j0;->M:I

    const/4 p5, 0x1

    and-int/2addr p3, p5

    const/4 v0, 0x0

    if-ne p3, p5, :cond_2

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    iget-object p3, p4, Lb/p/s;->b:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    const/4 p5, 0x0

    invoke-virtual {p0, p3, p5}, Lb/p/m;->t(Landroid/view/View;Z)Lb/p/s;

    move-result-object v1

    invoke-virtual {p0, p3, p5}, Lb/p/m;->E(Landroid/view/View;Z)Lb/p/s;

    move-result-object p3

    invoke-direct {p0, v1, p3}, Lb/p/j0;->d0(Lb/p/s;Lb/p/s;)Lb/p/j0$c;

    move-result-object p3

    iget-boolean p3, p3, Lb/p/j0$c;->a:Z

    if-eqz p3, :cond_1

    return-object v0

    :cond_1
    iget-object p3, p4, Lb/p/s;->b:Landroid/view/View;

    invoke-virtual {p0, p1, p3, p2, p4}, Lb/p/j0;->e0(Landroid/view/ViewGroup;Landroid/view/View;Lb/p/s;Lb/p/s;)Landroid/animation/Animator;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    return-object v0
.end method

.method public g(Lb/p/s;)V
    .locals 0

    invoke-direct {p0, p1}, Lb/p/j0;->c0(Lb/p/s;)V

    return-void
.end method

.method public abstract g0(Landroid/view/ViewGroup;Landroid/view/View;Lb/p/s;Lb/p/s;)Landroid/animation/Animator;
.end method

.method public h0(Landroid/view/ViewGroup;Lb/p/s;ILb/p/s;I)Landroid/animation/Animator;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move/from16 v4, p5

    iget v5, v0, Lb/p/j0;->M:I

    const/4 v6, 0x2

    and-int/2addr v5, v6

    const/4 v7, 0x0

    if-eq v5, v6, :cond_0

    return-object v7

    :cond_0
    if-nez v2, :cond_1

    return-object v7

    :cond_1
    iget-object v5, v2, Lb/p/s;->b:Landroid/view/View;

    if-eqz v3, :cond_2

    iget-object v8, v3, Lb/p/s;->b:Landroid/view/View;

    goto :goto_0

    :cond_2
    move-object v8, v7

    :goto_0
    sget v9, Lb/p/j;->b:I

    invoke-virtual {v5, v9}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz v10, :cond_3

    move-object v8, v7

    const/4 v13, 0x1

    goto/16 :goto_6

    :cond_3
    if-eqz v8, :cond_6

    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v10

    if-nez v10, :cond_4

    goto :goto_2

    :cond_4
    const/4 v10, 0x4

    if-ne v4, v10, :cond_5

    goto :goto_1

    :cond_5
    if-ne v5, v8, :cond_7

    :goto_1
    move-object v10, v8

    const/4 v13, 0x0

    move-object v8, v7

    goto :goto_3

    :cond_6
    :goto_2
    if-eqz v8, :cond_7

    move-object v10, v7

    const/4 v13, 0x0

    goto :goto_3

    :cond_7
    move-object v8, v7

    move-object v10, v8

    const/4 v13, 0x1

    :goto_3
    if-eqz v13, :cond_a

    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v13

    if-nez v13, :cond_8

    goto :goto_4

    :cond_8
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v13

    instance-of v13, v13, Landroid/view/View;

    if-eqz v13, :cond_a

    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v13

    check-cast v13, Landroid/view/View;

    invoke-virtual {v0, v13, v12}, Lb/p/m;->E(Landroid/view/View;Z)Lb/p/s;

    move-result-object v14

    invoke-virtual {v0, v13, v12}, Lb/p/m;->t(Landroid/view/View;Z)Lb/p/s;

    move-result-object v15

    invoke-direct {v0, v14, v15}, Lb/p/j0;->d0(Lb/p/s;Lb/p/s;)Lb/p/j0$c;

    move-result-object v14

    iget-boolean v14, v14, Lb/p/j0$c;->a:Z

    if-nez v14, :cond_9

    invoke-static {v1, v5, v13}, Lb/p/r;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)Landroid/view/View;

    move-result-object v8

    goto :goto_5

    :cond_9
    invoke-virtual {v13}, Landroid/view/View;->getId()I

    move-result v14

    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v13

    if-nez v13, :cond_a

    const/4 v13, -0x1

    if-eq v14, v13, :cond_a

    invoke-virtual {v1, v14}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v13

    if-eqz v13, :cond_a

    iget-boolean v13, v0, Lb/p/m;->A:Z

    if-eqz v13, :cond_a

    :goto_4
    move-object v8, v10

    const/4 v13, 0x0

    move-object v10, v5

    goto :goto_6

    :cond_a
    :goto_5
    const/4 v13, 0x0

    move-object/from16 v16, v10

    move-object v10, v8

    move-object/from16 v8, v16

    :goto_6
    if-eqz v10, :cond_e

    if-nez v13, :cond_b

    iget-object v4, v2, Lb/p/s;->a:Ljava/util/Map;

    const-string v7, "android:visibility:screenLocation"

    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [I

    aget v7, v4, v11

    aget v4, v4, v12

    new-array v6, v6, [I

    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->getLocationOnScreen([I)V

    aget v8, v6, v11

    sub-int/2addr v7, v8

    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    move-result v8

    sub-int/2addr v7, v8

    invoke-virtual {v10, v7}, Landroid/view/View;->offsetLeftAndRight(I)V

    aget v6, v6, v12

    sub-int/2addr v4, v6

    invoke-virtual {v10}, Landroid/view/View;->getTop()I

    move-result v6

    sub-int/2addr v4, v6

    invoke-virtual {v10, v4}, Landroid/view/View;->offsetTopAndBottom(I)V

    invoke-static/range {p1 .. p1}, Lb/p/x;->a(Landroid/view/ViewGroup;)Lb/p/w;

    move-result-object v4

    invoke-interface {v4, v10}, Lb/p/w;->a(Landroid/view/View;)V

    :cond_b
    invoke-virtual {v0, v1, v10, v2, v3}, Lb/p/j0;->g0(Landroid/view/ViewGroup;Landroid/view/View;Lb/p/s;Lb/p/s;)Landroid/animation/Animator;

    move-result-object v2

    if-nez v13, :cond_d

    if-nez v2, :cond_c

    invoke-static/range {p1 .. p1}, Lb/p/x;->a(Landroid/view/ViewGroup;)Lb/p/w;

    move-result-object v1

    invoke-interface {v1, v10}, Lb/p/w;->c(Landroid/view/View;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v5, v9, v10}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    new-instance v3, Lb/p/j0$a;

    invoke-direct {v3, v0, v1, v10, v5}, Lb/p/j0$a;-><init>(Lb/p/j0;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v0, v3}, Lb/p/m;->a(Lb/p/m$f;)Lb/p/m;

    :cond_d
    :goto_7
    return-object v2

    :cond_e
    if-eqz v8, :cond_10

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v5

    invoke-static {v8, v11}, Lb/p/c0;->h(Landroid/view/View;I)V

    invoke-virtual {v0, v1, v8, v2, v3}, Lb/p/j0;->g0(Landroid/view/ViewGroup;Landroid/view/View;Lb/p/s;Lb/p/s;)Landroid/animation/Animator;

    move-result-object v1

    if-eqz v1, :cond_f

    new-instance v2, Lb/p/j0$b;

    invoke-direct {v2, v8, v4, v12}, Lb/p/j0$b;-><init>(Landroid/view/View;IZ)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-static {v1, v2}, Lb/p/a;->a(Landroid/animation/Animator;Landroid/animation/AnimatorListenerAdapter;)V

    invoke-virtual {v0, v2}, Lb/p/m;->a(Lb/p/m$f;)Lb/p/m;

    goto :goto_8

    :cond_f
    invoke-static {v8, v5}, Lb/p/c0;->h(Landroid/view/View;I)V

    :goto_8
    return-object v1

    :cond_10
    return-object v7
.end method

.method public i0(I)V
    .locals 1

    and-int/lit8 v0, p1, -0x4

    if-nez v0, :cond_0

    iput p1, p0, Lb/p/j0;->M:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Only MODE_IN and MODE_OUT flags are allowed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public j(Lb/p/s;)V
    .locals 0

    invoke-direct {p0, p1}, Lb/p/j0;->c0(Lb/p/s;)V

    return-void
.end method

.method public n(Landroid/view/ViewGroup;Lb/p/s;Lb/p/s;)Landroid/animation/Animator;
    .locals 8

    invoke-direct {p0, p2, p3}, Lb/p/j0;->d0(Lb/p/s;Lb/p/s;)Lb/p/j0$c;

    move-result-object v0

    iget-boolean v1, v0, Lb/p/j0$c;->a:Z

    if-eqz v1, :cond_2

    iget-object v1, v0, Lb/p/j0$c;->e:Landroid/view/ViewGroup;

    if-nez v1, :cond_0

    iget-object v1, v0, Lb/p/j0$c;->f:Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    :cond_0
    iget-boolean v1, v0, Lb/p/j0$c;->b:Z

    if-eqz v1, :cond_1

    iget v5, v0, Lb/p/j0$c;->c:I

    iget v7, v0, Lb/p/j0$c;->d:I

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    invoke-virtual/range {v2 .. v7}, Lb/p/j0;->f0(Landroid/view/ViewGroup;Lb/p/s;ILb/p/s;I)Landroid/animation/Animator;

    move-result-object p1

    return-object p1

    :cond_1
    iget v3, v0, Lb/p/j0$c;->c:I

    iget v5, v0, Lb/p/j0$c;->d:I

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lb/p/j0;->h0(Landroid/view/ViewGroup;Lb/p/s;ILb/p/s;I)Landroid/animation/Animator;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
