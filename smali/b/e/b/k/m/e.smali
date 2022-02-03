.class public Lb/e/b/k/m/e;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Lb/e/b/k/f;

.field private b:Z

.field private c:Z

.field private d:Lb/e/b/k/f;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lb/e/b/k/m/m;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lb/e/b/k/m/k;",
            ">;"
        }
    .end annotation
.end field

.field private g:Lb/e/b/k/m/b$b;

.field private h:Lb/e/b/k/m/b$a;

.field i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lb/e/b/k/m/k;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lb/e/b/k/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/e/b/k/m/e;->b:Z

    iput-boolean v0, p0, Lb/e/b/k/m/e;->c:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb/e/b/k/m/e;->e:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb/e/b/k/m/e;->f:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput-object v0, p0, Lb/e/b/k/m/e;->g:Lb/e/b/k/m/b$b;

    new-instance v0, Lb/e/b/k/m/b$a;

    invoke-direct {v0}, Lb/e/b/k/m/b$a;-><init>()V

    iput-object v0, p0, Lb/e/b/k/m/e;->h:Lb/e/b/k/m/b$a;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb/e/b/k/m/e;->i:Ljava/util/ArrayList;

    iput-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iput-object p1, p0, Lb/e/b/k/m/e;->d:Lb/e/b/k/f;

    return-void
.end method

.method private a(Lb/e/b/k/m/f;IILb/e/b/k/m/f;Ljava/util/ArrayList;Lb/e/b/k/m/k;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/e/b/k/m/f;",
            "II",
            "Lb/e/b/k/m/f;",
            "Ljava/util/ArrayList<",
            "Lb/e/b/k/m/k;",
            ">;",
            "Lb/e/b/k/m/k;",
            ")V"
        }
    .end annotation

    iget-object p1, p1, Lb/e/b/k/m/f;->d:Lb/e/b/k/m/m;

    iget-object v0, p1, Lb/e/b/k/m/m;->c:Lb/e/b/k/m/k;

    if-nez v0, :cond_c

    iget-object v0, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v1, v0, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    if-eq p1, v1, :cond_c

    iget-object v0, v0, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    if-ne p1, v0, :cond_0

    goto/16 :goto_6

    :cond_0
    if-nez p6, :cond_1

    new-instance p6, Lb/e/b/k/m/k;

    invoke-direct {p6, p1, p3}, Lb/e/b/k/m/k;-><init>(Lb/e/b/k/m/m;I)V

    invoke-virtual {p5, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    iput-object p6, p1, Lb/e/b/k/m/m;->c:Lb/e/b/k/m/k;

    invoke-virtual {p6, p1}, Lb/e/b/k/m/k;->a(Lb/e/b/k/m/m;)V

    iget-object p3, p1, Lb/e/b/k/m/m;->h:Lb/e/b/k/m/f;

    iget-object p3, p3, Lb/e/b/k/m/f;->k:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_2
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/e/b/k/m/d;

    instance-of v1, v0, Lb/e/b/k/m/f;

    if-eqz v1, :cond_2

    move-object v1, v0

    check-cast v1, Lb/e/b/k/m/f;

    const/4 v3, 0x0

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lb/e/b/k/m/e;->a(Lb/e/b/k/m/f;IILb/e/b/k/m/f;Ljava/util/ArrayList;Lb/e/b/k/m/k;)V

    goto :goto_0

    :cond_3
    iget-object p3, p1, Lb/e/b/k/m/m;->i:Lb/e/b/k/m/f;

    iget-object p3, p3, Lb/e/b/k/m/f;->k:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_4
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/e/b/k/m/d;

    instance-of v1, v0, Lb/e/b/k/m/f;

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Lb/e/b/k/m/f;

    const/4 v3, 0x1

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lb/e/b/k/m/e;->a(Lb/e/b/k/m/f;IILb/e/b/k/m/f;Ljava/util/ArrayList;Lb/e/b/k/m/k;)V

    goto :goto_1

    :cond_5
    const/4 p3, 0x1

    if-ne p2, p3, :cond_7

    instance-of v0, p1, Lb/e/b/k/m/l;

    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, Lb/e/b/k/m/l;

    iget-object v0, v0, Lb/e/b/k/m/l;->k:Lb/e/b/k/m/f;

    iget-object v0, v0, Lb/e/b/k/m/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_6
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/e/b/k/m/d;

    instance-of v1, v0, Lb/e/b/k/m/f;

    if-eqz v1, :cond_6

    move-object v1, v0

    check-cast v1, Lb/e/b/k/m/f;

    const/4 v3, 0x2

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lb/e/b/k/m/e;->a(Lb/e/b/k/m/f;IILb/e/b/k/m/f;Ljava/util/ArrayList;Lb/e/b/k/m/k;)V

    goto :goto_2

    :cond_7
    iget-object v0, p1, Lb/e/b/k/m/m;->h:Lb/e/b/k/m/f;

    iget-object v0, v0, Lb/e/b/k/m/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lb/e/b/k/m/f;

    if-ne v1, p4, :cond_8

    iput-boolean p3, p6, Lb/e/b/k/m/k;->c:Z

    :cond_8
    const/4 v3, 0x0

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lb/e/b/k/m/e;->a(Lb/e/b/k/m/f;IILb/e/b/k/m/f;Ljava/util/ArrayList;Lb/e/b/k/m/k;)V

    goto :goto_3

    :cond_9
    iget-object v0, p1, Lb/e/b/k/m/m;->i:Lb/e/b/k/m/f;

    iget-object v0, v0, Lb/e/b/k/m/f;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lb/e/b/k/m/f;

    if-ne v1, p4, :cond_a

    iput-boolean p3, p6, Lb/e/b/k/m/k;->c:Z

    :cond_a
    const/4 v3, 0x1

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lb/e/b/k/m/e;->a(Lb/e/b/k/m/f;IILb/e/b/k/m/f;Ljava/util/ArrayList;Lb/e/b/k/m/k;)V

    goto :goto_4

    :cond_b
    if-ne p2, p3, :cond_c

    instance-of p3, p1, Lb/e/b/k/m/l;

    if-eqz p3, :cond_c

    check-cast p1, Lb/e/b/k/m/l;

    iget-object p1, p1, Lb/e/b/k/m/l;->k:Lb/e/b/k/m/f;

    iget-object p1, p1, Lb/e/b/k/m/f;->l:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v1, p3

    check-cast v1, Lb/e/b/k/m/f;

    const/4 v3, 0x2

    move-object v0, p0

    move v2, p2

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    :try_start_0
    invoke-direct/range {v0 .. v6}, Lb/e/b/k/m/e;->a(Lb/e/b/k/m/f;IILb/e/b/k/m/f;Ljava/util/ArrayList;Lb/e/b/k/m/k;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_5

    :cond_c
    :goto_6
    return-void

    :catchall_0
    move-exception p1

    goto :goto_8

    :goto_7
    throw p1

    :goto_8
    goto :goto_7
.end method

.method private b(Lb/e/b/k/f;)Z
    .locals 16

    move-object/from16 v0, p1

    iget-object v1, v0, Lb/e/b/k/l;->w0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_28

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/e/b/k/e;

    iget-object v4, v2, Lb/e/b/k/e;->N:[Lb/e/b/k/e$b;

    aget-object v5, v4, v3

    const/4 v10, 0x1

    aget-object v4, v4, v10

    invoke-virtual {v2}, Lb/e/b/k/e;->M()I

    move-result v6

    const/16 v7, 0x8

    if-ne v6, v7, :cond_1

    :goto_1
    iput-boolean v10, v2, Lb/e/b/k/e;->b:Z

    goto :goto_0

    :cond_1
    iget v6, v2, Lb/e/b/k/e;->r:F

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v7, 0x2

    cmpg-float v6, v6, v11

    if-gez v6, :cond_2

    sget-object v6, Lb/e/b/k/e$b;->d:Lb/e/b/k/e$b;

    if-ne v5, v6, :cond_2

    iput v7, v2, Lb/e/b/k/e;->m:I

    :cond_2
    iget v6, v2, Lb/e/b/k/e;->u:F

    cmpg-float v6, v6, v11

    if-gez v6, :cond_3

    sget-object v6, Lb/e/b/k/e$b;->d:Lb/e/b/k/e$b;

    if-ne v4, v6, :cond_3

    iput v7, v2, Lb/e/b/k/e;->n:I

    :cond_3
    invoke-virtual {v2}, Lb/e/b/k/e;->r()F

    move-result v6

    const/4 v8, 0x0

    const/4 v9, 0x3

    cmpl-float v6, v6, v8

    if-lez v6, :cond_9

    sget-object v6, Lb/e/b/k/e$b;->d:Lb/e/b/k/e$b;

    if-ne v5, v6, :cond_5

    sget-object v8, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    if-eq v4, v8, :cond_4

    sget-object v8, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    if-ne v4, v8, :cond_5

    :cond_4
    iput v9, v2, Lb/e/b/k/e;->m:I

    goto :goto_3

    :cond_5
    if-ne v4, v6, :cond_7

    sget-object v8, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    if-eq v5, v8, :cond_6

    sget-object v8, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    if-ne v5, v8, :cond_7

    :cond_6
    :goto_2
    iput v9, v2, Lb/e/b/k/e;->n:I

    goto :goto_3

    :cond_7
    if-ne v5, v6, :cond_9

    if-ne v4, v6, :cond_9

    iget v6, v2, Lb/e/b/k/e;->m:I

    if-nez v6, :cond_8

    iput v9, v2, Lb/e/b/k/e;->m:I

    :cond_8
    iget v6, v2, Lb/e/b/k/e;->n:I

    if-nez v6, :cond_9

    goto :goto_2

    :cond_9
    :goto_3
    sget-object v6, Lb/e/b/k/e$b;->d:Lb/e/b/k/e$b;

    if-ne v5, v6, :cond_b

    iget v8, v2, Lb/e/b/k/e;->m:I

    if-ne v8, v10, :cond_b

    iget-object v8, v2, Lb/e/b/k/e;->C:Lb/e/b/k/d;

    iget-object v8, v8, Lb/e/b/k/d;->d:Lb/e/b/k/d;

    if-eqz v8, :cond_a

    iget-object v8, v2, Lb/e/b/k/e;->E:Lb/e/b/k/d;

    iget-object v8, v8, Lb/e/b/k/d;->d:Lb/e/b/k/d;

    if-nez v8, :cond_b

    :cond_a
    sget-object v5, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    :cond_b
    move-object v8, v5

    if-ne v4, v6, :cond_d

    iget v5, v2, Lb/e/b/k/e;->n:I

    if-ne v5, v10, :cond_d

    iget-object v5, v2, Lb/e/b/k/e;->D:Lb/e/b/k/d;

    iget-object v5, v5, Lb/e/b/k/d;->d:Lb/e/b/k/d;

    if-eqz v5, :cond_c

    iget-object v5, v2, Lb/e/b/k/e;->F:Lb/e/b/k/d;

    iget-object v5, v5, Lb/e/b/k/d;->d:Lb/e/b/k/d;

    if-nez v5, :cond_d

    :cond_c
    sget-object v4, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    :cond_d
    move-object v12, v4

    iget-object v4, v2, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iput-object v8, v4, Lb/e/b/k/m/m;->d:Lb/e/b/k/e$b;

    iget v5, v2, Lb/e/b/k/e;->m:I

    iput v5, v4, Lb/e/b/k/m/m;->a:I

    iget-object v4, v2, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iput-object v12, v4, Lb/e/b/k/m/m;->d:Lb/e/b/k/e$b;

    iget v13, v2, Lb/e/b/k/e;->n:I

    iput v13, v4, Lb/e/b/k/m/m;->a:I

    sget-object v4, Lb/e/b/k/e$b;->e:Lb/e/b/k/e$b;

    if-eq v8, v4, :cond_e

    sget-object v14, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    if-eq v8, v14, :cond_e

    sget-object v14, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    if-ne v8, v14, :cond_f

    :cond_e
    if-eq v12, v4, :cond_25

    sget-object v14, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    if-eq v12, v14, :cond_25

    sget-object v14, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    if-ne v12, v14, :cond_f

    goto/16 :goto_a

    :cond_f
    const/high16 v14, 0x3f000000    # 0.5f

    if-ne v8, v6, :cond_17

    sget-object v15, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    if-eq v12, v15, :cond_10

    sget-object v11, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    if-ne v12, v11, :cond_17

    :cond_10
    if-ne v5, v9, :cond_12

    if-ne v12, v15, :cond_11

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v15

    move-object v8, v15

    invoke-direct/range {v4 .. v9}, Lb/e/b/k/m/e;->l(Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V

    :cond_11
    invoke-virtual {v2}, Lb/e/b/k/e;->t()I

    move-result v9

    int-to-float v3, v9

    iget v4, v2, Lb/e/b/k/e;->R:F

    mul-float v3, v3, v4

    add-float/2addr v3, v14

    float-to-int v7, v3

    :goto_4
    sget-object v8, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    :goto_5
    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v8

    goto/16 :goto_d

    :cond_12
    if-ne v5, v10, :cond_13

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v15

    move-object v8, v12

    invoke-direct/range {v4 .. v9}, Lb/e/b/k/m/e;->l(Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V

    iget-object v3, v2, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v3, v3, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    invoke-virtual {v2}, Lb/e/b/k/e;->N()I

    move-result v2

    :goto_6
    iput v2, v3, Lb/e/b/k/m/g;->m:I

    goto/16 :goto_0

    :cond_13
    if-ne v5, v7, :cond_15

    iget-object v11, v0, Lb/e/b/k/e;->N:[Lb/e/b/k/e$b;

    aget-object v15, v11, v3

    sget-object v7, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    if-eq v15, v7, :cond_14

    aget-object v11, v11, v3

    if-ne v11, v4, :cond_17

    :cond_14
    iget v3, v2, Lb/e/b/k/e;->r:F

    invoke-virtual/range {p1 .. p1}, Lb/e/b/k/e;->N()I

    move-result v4

    int-to-float v4, v4

    mul-float v3, v3, v4

    add-float/2addr v3, v14

    float-to-int v3, v3

    invoke-virtual {v2}, Lb/e/b/k/e;->t()I

    move-result v9

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v7

    move v7, v3

    goto :goto_7

    :cond_15
    iget-object v7, v2, Lb/e/b/k/e;->K:[Lb/e/b/k/d;

    aget-object v11, v7, v3

    iget-object v11, v11, Lb/e/b/k/d;->d:Lb/e/b/k/d;

    if-eqz v11, :cond_16

    aget-object v7, v7, v10

    iget-object v7, v7, Lb/e/b/k/d;->d:Lb/e/b/k/d;

    if-nez v7, :cond_17

    :cond_16
    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v15

    :goto_7
    move-object v8, v12

    goto/16 :goto_d

    :cond_17
    if-ne v12, v6, :cond_20

    sget-object v11, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    if-eq v8, v11, :cond_18

    sget-object v7, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    if-ne v8, v7, :cond_20

    :cond_18
    if-ne v13, v9, :cond_1b

    if-ne v8, v11, :cond_19

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v11

    move-object v8, v11

    invoke-direct/range {v4 .. v9}, Lb/e/b/k/m/e;->l(Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V

    :cond_19
    invoke-virtual {v2}, Lb/e/b/k/e;->N()I

    move-result v7

    iget v3, v2, Lb/e/b/k/e;->R:F

    invoke-virtual {v2}, Lb/e/b/k/e;->s()I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_1a

    const/high16 v4, 0x3f800000    # 1.0f

    div-float v3, v4, v3

    :cond_1a
    int-to-float v4, v7

    mul-float v4, v4, v3

    add-float/2addr v4, v14

    float-to-int v9, v4

    goto/16 :goto_4

    :cond_1b
    if-ne v13, v10, :cond_1c

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v8

    move-object v8, v11

    invoke-direct/range {v4 .. v9}, Lb/e/b/k/m/e;->l(Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V

    goto/16 :goto_9

    :cond_1c
    const/4 v7, 0x2

    if-ne v13, v7, :cond_1e

    iget-object v7, v0, Lb/e/b/k/e;->N:[Lb/e/b/k/e$b;

    aget-object v9, v7, v10

    sget-object v11, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    if-eq v9, v11, :cond_1d

    aget-object v7, v7, v10

    if-ne v7, v4, :cond_20

    :cond_1d
    iget v3, v2, Lb/e/b/k/e;->u:F

    invoke-virtual {v2}, Lb/e/b/k/e;->N()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lb/e/b/k/e;->t()I

    move-result v4

    int-to-float v4, v4

    mul-float v3, v3, v4

    add-float/2addr v3, v14

    float-to-int v9, v3

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v8

    move-object v8, v11

    goto/16 :goto_d

    :cond_1e
    iget-object v4, v2, Lb/e/b/k/e;->K:[Lb/e/b/k/d;

    const/4 v7, 0x2

    aget-object v15, v4, v7

    iget-object v7, v15, Lb/e/b/k/d;->d:Lb/e/b/k/d;

    if-eqz v7, :cond_1f

    aget-object v4, v4, v9

    iget-object v4, v4, Lb/e/b/k/d;->d:Lb/e/b/k/d;

    if-nez v4, :cond_20

    :cond_1f
    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v11

    goto :goto_7

    :cond_20
    if-ne v8, v6, :cond_0

    if-ne v12, v6, :cond_0

    if-eq v5, v10, :cond_24

    if-ne v13, v10, :cond_21

    goto :goto_8

    :cond_21
    const/4 v4, 0x2

    if-ne v13, v4, :cond_0

    if-ne v5, v4, :cond_0

    iget-object v4, v0, Lb/e/b/k/e;->N:[Lb/e/b/k/e$b;

    aget-object v5, v4, v3

    sget-object v8, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    if-eq v5, v8, :cond_22

    aget-object v3, v4, v3

    if-ne v3, v8, :cond_0

    :cond_22
    aget-object v3, v4, v10

    if-eq v3, v8, :cond_23

    aget-object v3, v4, v10

    if-ne v3, v8, :cond_0

    :cond_23
    iget v3, v2, Lb/e/b/k/e;->r:F

    iget v4, v2, Lb/e/b/k/e;->u:F

    invoke-virtual/range {p1 .. p1}, Lb/e/b/k/e;->N()I

    move-result v5

    int-to-float v5, v5

    mul-float v3, v3, v5

    add-float/2addr v3, v14

    float-to-int v7, v3

    invoke-virtual/range {p1 .. p1}, Lb/e/b/k/e;->t()I

    move-result v3

    int-to-float v3, v3

    mul-float v4, v4, v3

    add-float/2addr v4, v14

    float-to-int v9, v4

    goto/16 :goto_5

    :cond_24
    :goto_8
    sget-object v8, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object v5, v2

    move-object v6, v8

    invoke-direct/range {v4 .. v9}, Lb/e/b/k/m/e;->l(Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V

    iget-object v3, v2, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v3, v3, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    invoke-virtual {v2}, Lb/e/b/k/e;->N()I

    move-result v4

    iput v4, v3, Lb/e/b/k/m/g;->m:I

    :goto_9
    iget-object v3, v2, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v3, v3, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    invoke-virtual {v2}, Lb/e/b/k/e;->t()I

    move-result v2

    goto/16 :goto_6

    :cond_25
    :goto_a
    invoke-virtual {v2}, Lb/e/b/k/e;->N()I

    move-result v3

    if-ne v8, v4, :cond_26

    invoke-virtual/range {p1 .. p1}, Lb/e/b/k/e;->N()I

    move-result v3

    iget-object v5, v2, Lb/e/b/k/e;->C:Lb/e/b/k/d;

    iget v5, v5, Lb/e/b/k/d;->e:I

    sub-int/2addr v3, v5

    iget-object v5, v2, Lb/e/b/k/e;->E:Lb/e/b/k/d;

    iget v5, v5, Lb/e/b/k/d;->e:I

    sub-int/2addr v3, v5

    sget-object v5, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    move v7, v3

    move-object v6, v5

    goto :goto_b

    :cond_26
    move v7, v3

    move-object v6, v8

    :goto_b
    invoke-virtual {v2}, Lb/e/b/k/e;->t()I

    move-result v3

    if-ne v12, v4, :cond_27

    invoke-virtual/range {p1 .. p1}, Lb/e/b/k/e;->t()I

    move-result v3

    iget-object v4, v2, Lb/e/b/k/e;->D:Lb/e/b/k/d;

    iget v4, v4, Lb/e/b/k/d;->e:I

    sub-int/2addr v3, v4

    iget-object v4, v2, Lb/e/b/k/e;->F:Lb/e/b/k/d;

    iget v4, v4, Lb/e/b/k/d;->e:I

    sub-int/2addr v3, v4

    sget-object v4, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    move v9, v3

    move-object v8, v4

    goto :goto_c

    :cond_27
    move v9, v3

    move-object v8, v12

    :goto_c
    move-object/from16 v4, p0

    move-object v5, v2

    :goto_d
    invoke-direct/range {v4 .. v9}, Lb/e/b/k/m/e;->l(Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V

    iget-object v3, v2, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v3, v3, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    invoke-virtual {v2}, Lb/e/b/k/e;->N()I

    move-result v4

    invoke-virtual {v3, v4}, Lb/e/b/k/m/g;->d(I)V

    iget-object v3, v2, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v3, v3, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    invoke-virtual {v2}, Lb/e/b/k/e;->t()I

    move-result v4

    invoke-virtual {v3, v4}, Lb/e/b/k/m/g;->d(I)V

    goto/16 :goto_1

    :cond_28
    return v3
.end method

.method private e(Lb/e/b/k/f;I)I
    .locals 6

    iget-object v0, p0, Lb/e/b/k/m/e;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    iget-object v4, p0, Lb/e/b/k/m/e;->i:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb/e/b/k/m/k;

    invoke-virtual {v4, p1, p2}, Lb/e/b/k/m/k;->b(Lb/e/b/k/f;I)J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    long-to-int p1, v1

    return p1
.end method

.method private i(Lb/e/b/k/m/m;ILjava/util/ArrayList;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/e/b/k/m/m;",
            "I",
            "Ljava/util/ArrayList<",
            "Lb/e/b/k/m/k;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p1, Lb/e/b/k/m/m;->h:Lb/e/b/k/m/f;

    iget-object v0, v0, Lb/e/b/k/m/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/e/b/k/m/d;

    instance-of v2, v1, Lb/e/b/k/m/f;

    if-eqz v2, :cond_1

    move-object v4, v1

    check-cast v4, Lb/e/b/k/m/f;

    const/4 v6, 0x0

    iget-object v7, p1, Lb/e/b/k/m/m;->i:Lb/e/b/k/m/f;

    const/4 v9, 0x0

    move-object v3, p0

    move v5, p2

    move-object v8, p3

    invoke-direct/range {v3 .. v9}, Lb/e/b/k/m/e;->a(Lb/e/b/k/m/f;IILb/e/b/k/m/f;Ljava/util/ArrayList;Lb/e/b/k/m/k;)V

    goto :goto_0

    :cond_1
    instance-of v2, v1, Lb/e/b/k/m/m;

    if-eqz v2, :cond_0

    check-cast v1, Lb/e/b/k/m/m;

    iget-object v3, v1, Lb/e/b/k/m/m;->h:Lb/e/b/k/m/f;

    const/4 v5, 0x0

    iget-object v6, p1, Lb/e/b/k/m/m;->i:Lb/e/b/k/m/f;

    const/4 v8, 0x0

    move-object v2, p0

    move v4, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v8}, Lb/e/b/k/m/e;->a(Lb/e/b/k/m/f;IILb/e/b/k/m/f;Ljava/util/ArrayList;Lb/e/b/k/m/k;)V

    goto :goto_0

    :cond_2
    iget-object v0, p1, Lb/e/b/k/m/m;->i:Lb/e/b/k/m/f;

    iget-object v0, v0, Lb/e/b/k/m/f;->k:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/e/b/k/m/d;

    instance-of v2, v1, Lb/e/b/k/m/f;

    if-eqz v2, :cond_4

    move-object v4, v1

    check-cast v4, Lb/e/b/k/m/f;

    const/4 v6, 0x1

    iget-object v7, p1, Lb/e/b/k/m/m;->h:Lb/e/b/k/m/f;

    const/4 v9, 0x0

    move-object v3, p0

    move v5, p2

    move-object v8, p3

    invoke-direct/range {v3 .. v9}, Lb/e/b/k/m/e;->a(Lb/e/b/k/m/f;IILb/e/b/k/m/f;Ljava/util/ArrayList;Lb/e/b/k/m/k;)V

    goto :goto_1

    :cond_4
    instance-of v2, v1, Lb/e/b/k/m/m;

    if-eqz v2, :cond_3

    check-cast v1, Lb/e/b/k/m/m;

    iget-object v3, v1, Lb/e/b/k/m/m;->i:Lb/e/b/k/m/f;

    const/4 v5, 0x1

    iget-object v6, p1, Lb/e/b/k/m/m;->h:Lb/e/b/k/m/f;

    const/4 v8, 0x0

    move-object v2, p0

    move v4, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v8}, Lb/e/b/k/m/e;->a(Lb/e/b/k/m/f;IILb/e/b/k/m/f;Ljava/util/ArrayList;Lb/e/b/k/m/k;)V

    goto :goto_1

    :cond_5
    const/4 v0, 0x1

    if-ne p2, v0, :cond_7

    check-cast p1, Lb/e/b/k/m/l;

    iget-object p1, p1, Lb/e/b/k/m/l;->k:Lb/e/b/k/m/f;

    iget-object p1, p1, Lb/e/b/k/m/f;->k:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/e/b/k/m/d;

    instance-of v1, v0, Lb/e/b/k/m/f;

    if-eqz v1, :cond_6

    move-object v3, v0

    check-cast v3, Lb/e/b/k/m/f;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v2, p0

    move v4, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v8}, Lb/e/b/k/m/e;->a(Lb/e/b/k/m/f;IILb/e/b/k/m/f;Ljava/util/ArrayList;Lb/e/b/k/m/k;)V

    goto :goto_2

    :cond_7
    return-void
.end method

.method private l(Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V
    .locals 1

    iget-object v0, p0, Lb/e/b/k/m/e;->h:Lb/e/b/k/m/b$a;

    iput-object p2, v0, Lb/e/b/k/m/b$a;->a:Lb/e/b/k/e$b;

    iput-object p4, v0, Lb/e/b/k/m/b$a;->b:Lb/e/b/k/e$b;

    iput p3, v0, Lb/e/b/k/m/b$a;->c:I

    iput p5, v0, Lb/e/b/k/m/b$a;->d:I

    iget-object p2, p0, Lb/e/b/k/m/e;->g:Lb/e/b/k/m/b$b;

    invoke-interface {p2, p1, v0}, Lb/e/b/k/m/b$b;->a(Lb/e/b/k/e;Lb/e/b/k/m/b$a;)V

    iget-object p2, p0, Lb/e/b/k/m/e;->h:Lb/e/b/k/m/b$a;

    iget p2, p2, Lb/e/b/k/m/b$a;->e:I

    invoke-virtual {p1, p2}, Lb/e/b/k/e;->B0(I)V

    iget-object p2, p0, Lb/e/b/k/m/e;->h:Lb/e/b/k/m/b$a;

    iget p2, p2, Lb/e/b/k/m/b$a;->f:I

    invoke-virtual {p1, p2}, Lb/e/b/k/e;->e0(I)V

    iget-object p2, p0, Lb/e/b/k/m/e;->h:Lb/e/b/k/m/b$a;

    iget-boolean p2, p2, Lb/e/b/k/m/b$a;->h:Z

    invoke-virtual {p1, p2}, Lb/e/b/k/e;->d0(Z)V

    iget-object p2, p0, Lb/e/b/k/m/e;->h:Lb/e/b/k/m/b$a;

    iget p2, p2, Lb/e/b/k/m/b$a;->g:I

    invoke-virtual {p1, p2}, Lb/e/b/k/e;->Y(I)V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 4

    iget-object v0, p0, Lb/e/b/k/m/e;->e:Ljava/util/ArrayList;

    invoke-virtual {p0, v0}, Lb/e/b/k/m/e;->d(Ljava/util/ArrayList;)V

    iget-object v0, p0, Lb/e/b/k/m/e;->i:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    sput v0, Lb/e/b/k/m/k;->a:I

    iget-object v1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v1, v1, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v2, p0, Lb/e/b/k/m/e;->i:Ljava/util/ArrayList;

    invoke-direct {p0, v1, v0, v2}, Lb/e/b/k/m/e;->i(Lb/e/b/k/m/m;ILjava/util/ArrayList;)V

    iget-object v1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v1, v1, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v2, p0, Lb/e/b/k/m/e;->i:Ljava/util/ArrayList;

    const/4 v3, 0x1

    invoke-direct {p0, v1, v3, v2}, Lb/e/b/k/m/e;->i(Lb/e/b/k/m/m;ILjava/util/ArrayList;)V

    iput-boolean v0, p0, Lb/e/b/k/m/e;->b:Z

    return-void
.end method

.method public d(Ljava/util/ArrayList;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lb/e/b/k/m/m;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lb/e/b/k/m/e;->d:Lb/e/b/k/f;

    iget-object v0, v0, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    invoke-virtual {v0}, Lb/e/b/k/m/j;->f()V

    iget-object v0, p0, Lb/e/b/k/m/e;->d:Lb/e/b/k/f;

    iget-object v0, v0, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    invoke-virtual {v0}, Lb/e/b/k/m/l;->f()V

    iget-object v0, p0, Lb/e/b/k/m/e;->d:Lb/e/b/k/f;

    iget-object v0, v0, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lb/e/b/k/m/e;->d:Lb/e/b/k/f;

    iget-object v0, v0, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lb/e/b/k/m/e;->d:Lb/e/b/k/f;

    iget-object v0, v0, Lb/e/b/k/l;->w0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb/e/b/k/e;

    instance-of v3, v2, Lb/e/b/k/g;

    if-eqz v3, :cond_1

    new-instance v3, Lb/e/b/k/m/h;

    invoke-direct {v3, v2}, Lb/e/b/k/m/h;-><init>(Lb/e/b/k/e;)V

    :goto_1
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Lb/e/b/k/e;->T()Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, v2, Lb/e/b/k/e;->d:Lb/e/b/k/m/c;

    if-nez v3, :cond_2

    new-instance v3, Lb/e/b/k/m/c;

    const/4 v4, 0x0

    invoke-direct {v3, v2, v4}, Lb/e/b/k/m/c;-><init>(Lb/e/b/k/e;I)V

    iput-object v3, v2, Lb/e/b/k/e;->d:Lb/e/b/k/m/c;

    :cond_2
    if-nez v1, :cond_3

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    :cond_3
    iget-object v3, v2, Lb/e/b/k/e;->d:Lb/e/b/k/m/c;

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    iget-object v3, v2, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    invoke-virtual {v2}, Lb/e/b/k/e;->V()Z

    move-result v3

    if-eqz v3, :cond_7

    iget-object v3, v2, Lb/e/b/k/e;->e:Lb/e/b/k/m/c;

    if-nez v3, :cond_5

    new-instance v3, Lb/e/b/k/m/c;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v4}, Lb/e/b/k/m/c;-><init>(Lb/e/b/k/e;I)V

    iput-object v3, v2, Lb/e/b/k/e;->e:Lb/e/b/k/m/c;

    :cond_5
    if-nez v1, :cond_6

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    :cond_6
    iget-object v3, v2, Lb/e/b/k/e;->e:Lb/e/b/k/m/c;

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    iget-object v3, v2, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    instance-of v3, v2, Lb/e/b/k/i;

    if-eqz v3, :cond_0

    new-instance v3, Lb/e/b/k/m/i;

    invoke-direct {v3, v2}, Lb/e/b/k/m/i;-><init>(Lb/e/b/k/e;)V

    goto :goto_1

    :cond_8
    if-eqz v1, :cond_9

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_9
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/e/b/k/m/m;

    invoke-virtual {v1}, Lb/e/b/k/m/m;->f()V

    goto :goto_4

    :cond_a
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/e/b/k/m/m;

    iget-object v1, v0, Lb/e/b/k/m/m;->b:Lb/e/b/k/e;

    iget-object v2, p0, Lb/e/b/k/m/e;->d:Lb/e/b/k/f;

    if-ne v1, v2, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v0}, Lb/e/b/k/m/m;->d()V

    goto :goto_5

    :cond_c
    return-void
.end method

.method public f(Z)Z
    .locals 9

    const/4 v0, 0x1

    and-int/2addr p1, v0

    iget-boolean v1, p0, Lb/e/b/k/m/e;->b:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-boolean v1, p0, Lb/e/b/k/m/e;->c:Z

    if-eqz v1, :cond_2

    :cond_0
    iget-object v1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v1, v1, Lb/e/b/k/l;->w0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb/e/b/k/e;

    iput-boolean v2, v3, Lb/e/b/k/e;->b:Z

    iget-object v4, v3, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    invoke-virtual {v4}, Lb/e/b/k/m/j;->r()V

    iget-object v3, v3, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    invoke-virtual {v3}, Lb/e/b/k/m/l;->q()V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iput-boolean v2, v1, Lb/e/b/k/e;->b:Z

    iget-object v1, v1, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    invoke-virtual {v1}, Lb/e/b/k/m/j;->r()V

    iget-object v1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v1, v1, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    invoke-virtual {v1}, Lb/e/b/k/m/l;->q()V

    iput-boolean v2, p0, Lb/e/b/k/m/e;->c:Z

    :cond_2
    iget-object v1, p0, Lb/e/b/k/m/e;->d:Lb/e/b/k/f;

    invoke-direct {p0, v1}, Lb/e/b/k/m/e;->b(Lb/e/b/k/f;)Z

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {v1, v2}, Lb/e/b/k/e;->C0(I)V

    iget-object v1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {v1, v2}, Lb/e/b/k/e;->D0(I)V

    iget-object v1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {v1, v2}, Lb/e/b/k/e;->q(I)Lb/e/b/k/e$b;

    move-result-object v1

    iget-object v3, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {v3, v0}, Lb/e/b/k/e;->q(I)Lb/e/b/k/e$b;

    move-result-object v3

    iget-boolean v4, p0, Lb/e/b/k/m/e;->b:Z

    if-eqz v4, :cond_4

    invoke-virtual {p0}, Lb/e/b/k/m/e;->c()V

    :cond_4
    iget-object v4, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {v4}, Lb/e/b/k/e;->O()I

    move-result v4

    iget-object v5, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {v5}, Lb/e/b/k/e;->P()I

    move-result v5

    iget-object v6, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v6, v6, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v6, v6, Lb/e/b/k/m/m;->h:Lb/e/b/k/m/f;

    invoke-virtual {v6, v4}, Lb/e/b/k/m/f;->d(I)V

    iget-object v6, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v6, v6, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v6, v6, Lb/e/b/k/m/m;->h:Lb/e/b/k/m/f;

    invoke-virtual {v6, v5}, Lb/e/b/k/m/f;->d(I)V

    invoke-virtual {p0}, Lb/e/b/k/m/e;->m()V

    sget-object v6, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    if-eq v1, v6, :cond_5

    if-ne v3, v6, :cond_9

    :cond_5
    if-eqz p1, :cond_7

    iget-object v6, p0, Lb/e/b/k/m/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb/e/b/k/m/m;

    invoke-virtual {v7}, Lb/e/b/k/m/m;->m()Z

    move-result v7

    if-nez v7, :cond_6

    const/4 p1, 0x0

    :cond_7
    if-eqz p1, :cond_8

    sget-object v6, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    if-ne v1, v6, :cond_8

    iget-object v6, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    sget-object v7, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    invoke-virtual {v6, v7}, Lb/e/b/k/e;->i0(Lb/e/b/k/e$b;)V

    iget-object v6, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-direct {p0, v6, v2}, Lb/e/b/k/m/e;->e(Lb/e/b/k/f;I)I

    move-result v7

    invoke-virtual {v6, v7}, Lb/e/b/k/e;->B0(I)V

    iget-object v6, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v7, v6, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v7, v7, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    invoke-virtual {v6}, Lb/e/b/k/e;->N()I

    move-result v6

    invoke-virtual {v7, v6}, Lb/e/b/k/m/g;->d(I)V

    :cond_8
    if-eqz p1, :cond_9

    sget-object p1, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    if-ne v3, p1, :cond_9

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    sget-object v6, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    invoke-virtual {p1, v6}, Lb/e/b/k/e;->x0(Lb/e/b/k/e$b;)V

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-direct {p0, p1, v0}, Lb/e/b/k/m/e;->e(Lb/e/b/k/f;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lb/e/b/k/e;->e0(I)V

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v6, p1, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v6, v6, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    invoke-virtual {p1}, Lb/e/b/k/e;->t()I

    move-result p1

    invoke-virtual {v6, p1}, Lb/e/b/k/m/g;->d(I)V

    :cond_9
    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v6, p1, Lb/e/b/k/e;->N:[Lb/e/b/k/e$b;

    aget-object v7, v6, v2

    sget-object v8, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    if-eq v7, v8, :cond_b

    aget-object v6, v6, v2

    sget-object v7, Lb/e/b/k/e$b;->e:Lb/e/b/k/e$b;

    if-ne v6, v7, :cond_a

    goto :goto_1

    :cond_a
    const/4 p1, 0x0

    goto :goto_2

    :cond_b
    :goto_1
    invoke-virtual {p1}, Lb/e/b/k/e;->N()I

    move-result p1

    add-int/2addr p1, v4

    iget-object v6, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v6, v6, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v6, v6, Lb/e/b/k/m/m;->i:Lb/e/b/k/m/f;

    invoke-virtual {v6, p1}, Lb/e/b/k/m/f;->d(I)V

    iget-object v6, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v6, v6, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v6, v6, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    sub-int/2addr p1, v4

    invoke-virtual {v6, p1}, Lb/e/b/k/m/g;->d(I)V

    invoke-virtual {p0}, Lb/e/b/k/m/e;->m()V

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v4, p1, Lb/e/b/k/e;->N:[Lb/e/b/k/e$b;

    aget-object v6, v4, v0

    if-eq v6, v8, :cond_c

    aget-object v4, v4, v0

    sget-object v6, Lb/e/b/k/e$b;->e:Lb/e/b/k/e$b;

    if-ne v4, v6, :cond_d

    :cond_c
    invoke-virtual {p1}, Lb/e/b/k/e;->t()I

    move-result p1

    add-int/2addr p1, v5

    iget-object v4, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v4, v4, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v4, v4, Lb/e/b/k/m/m;->i:Lb/e/b/k/m/f;

    invoke-virtual {v4, p1}, Lb/e/b/k/m/f;->d(I)V

    iget-object v4, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v4, v4, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v4, v4, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    sub-int/2addr p1, v5

    invoke-virtual {v4, p1}, Lb/e/b/k/m/g;->d(I)V

    :cond_d
    invoke-virtual {p0}, Lb/e/b/k/m/e;->m()V

    const/4 p1, 0x1

    :goto_2
    iget-object v4, p0, Lb/e/b/k/m/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb/e/b/k/m/m;

    iget-object v6, v5, Lb/e/b/k/m/m;->b:Lb/e/b/k/e;

    iget-object v7, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    if-ne v6, v7, :cond_e

    iget-boolean v6, v5, Lb/e/b/k/m/m;->g:Z

    if-nez v6, :cond_e

    goto :goto_3

    :cond_e
    invoke-virtual {v5}, Lb/e/b/k/m/m;->e()V

    goto :goto_3

    :cond_f
    iget-object v4, p0, Lb/e/b/k/m/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_10
    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb/e/b/k/m/m;

    if-nez p1, :cond_11

    iget-object v6, v5, Lb/e/b/k/m/m;->b:Lb/e/b/k/e;

    iget-object v7, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    if-ne v6, v7, :cond_11

    goto :goto_4

    :cond_11
    iget-object v6, v5, Lb/e/b/k/m/m;->h:Lb/e/b/k/m/f;

    iget-boolean v6, v6, Lb/e/b/k/m/f;->j:Z

    if-nez v6, :cond_12

    :goto_5
    const/4 v0, 0x0

    goto :goto_6

    :cond_12
    iget-object v6, v5, Lb/e/b/k/m/m;->i:Lb/e/b/k/m/f;

    iget-boolean v6, v6, Lb/e/b/k/m/f;->j:Z

    if-nez v6, :cond_13

    instance-of v6, v5, Lb/e/b/k/m/h;

    if-nez v6, :cond_13

    goto :goto_5

    :cond_13
    iget-object v6, v5, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    iget-boolean v6, v6, Lb/e/b/k/m/f;->j:Z

    if-nez v6, :cond_10

    instance-of v6, v5, Lb/e/b/k/m/c;

    if-nez v6, :cond_10

    instance-of v5, v5, Lb/e/b/k/m/h;

    if-nez v5, :cond_10

    goto :goto_5

    :cond_14
    :goto_6
    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {p1, v1}, Lb/e/b/k/e;->i0(Lb/e/b/k/e$b;)V

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {p1, v3}, Lb/e/b/k/e;->x0(Lb/e/b/k/e$b;)V

    return v0
.end method

.method public g(Z)Z
    .locals 4

    iget-boolean p1, p0, Lb/e/b/k/m/e;->b:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object p1, p1, Lb/e/b/k/l;->w0:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/e/b/k/e;

    iput-boolean v0, v1, Lb/e/b/k/e;->b:Z

    iget-object v2, v1, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v3, v2, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    iput-boolean v0, v3, Lb/e/b/k/m/f;->j:Z

    iput-boolean v0, v2, Lb/e/b/k/m/m;->g:Z

    invoke-virtual {v2}, Lb/e/b/k/m/j;->r()V

    iget-object v1, v1, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v2, v1, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    iput-boolean v0, v2, Lb/e/b/k/m/f;->j:Z

    iput-boolean v0, v1, Lb/e/b/k/m/m;->g:Z

    invoke-virtual {v1}, Lb/e/b/k/m/l;->q()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iput-boolean v0, p1, Lb/e/b/k/e;->b:Z

    iget-object p1, p1, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v1, p1, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    iput-boolean v0, v1, Lb/e/b/k/m/f;->j:Z

    iput-boolean v0, p1, Lb/e/b/k/m/m;->g:Z

    invoke-virtual {p1}, Lb/e/b/k/m/j;->r()V

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object p1, p1, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v1, p1, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    iput-boolean v0, v1, Lb/e/b/k/m/f;->j:Z

    iput-boolean v0, p1, Lb/e/b/k/m/m;->g:Z

    invoke-virtual {p1}, Lb/e/b/k/m/l;->q()V

    invoke-virtual {p0}, Lb/e/b/k/m/e;->c()V

    :cond_1
    iget-object p1, p0, Lb/e/b/k/m/e;->d:Lb/e/b/k/f;

    invoke-direct {p0, p1}, Lb/e/b/k/m/e;->b(Lb/e/b/k/f;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {p1, v0}, Lb/e/b/k/e;->C0(I)V

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {p1, v0}, Lb/e/b/k/e;->D0(I)V

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object p1, p1, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object p1, p1, Lb/e/b/k/m/m;->h:Lb/e/b/k/m/f;

    invoke-virtual {p1, v0}, Lb/e/b/k/m/f;->d(I)V

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object p1, p1, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object p1, p1, Lb/e/b/k/m/m;->h:Lb/e/b/k/m/f;

    invoke-virtual {p1, v0}, Lb/e/b/k/m/f;->d(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public h(ZI)Z
    .locals 9

    const/4 v0, 0x1

    and-int/2addr p1, v0

    iget-object v1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lb/e/b/k/e;->q(I)Lb/e/b/k/e$b;

    move-result-object v1

    iget-object v3, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {v3, v0}, Lb/e/b/k/e;->q(I)Lb/e/b/k/e$b;

    move-result-object v3

    iget-object v4, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {v4}, Lb/e/b/k/e;->O()I

    move-result v4

    iget-object v5, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {v5}, Lb/e/b/k/e;->P()I

    move-result v5

    if-eqz p1, :cond_4

    sget-object v6, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    if-eq v1, v6, :cond_0

    if-ne v3, v6, :cond_4

    :cond_0
    iget-object v6, p0, Lb/e/b/k/m/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lb/e/b/k/m/m;

    iget v8, v7, Lb/e/b/k/m/m;->f:I

    if-ne v8, p2, :cond_1

    invoke-virtual {v7}, Lb/e/b/k/m/m;->m()Z

    move-result v7

    if-nez v7, :cond_1

    const/4 p1, 0x0

    :cond_2
    if-nez p2, :cond_3

    if-eqz p1, :cond_4

    sget-object p1, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    if-ne v1, p1, :cond_4

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    sget-object v6, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    invoke-virtual {p1, v6}, Lb/e/b/k/e;->i0(Lb/e/b/k/e$b;)V

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-direct {p0, p1, v2}, Lb/e/b/k/m/e;->e(Lb/e/b/k/f;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lb/e/b/k/e;->B0(I)V

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v6, p1, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v6, v6, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    invoke-virtual {p1}, Lb/e/b/k/e;->N()I

    move-result p1

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_4

    sget-object p1, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    if-ne v3, p1, :cond_4

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    sget-object v6, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    invoke-virtual {p1, v6}, Lb/e/b/k/e;->x0(Lb/e/b/k/e$b;)V

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-direct {p0, p1, v0}, Lb/e/b/k/m/e;->e(Lb/e/b/k/f;I)I

    move-result v6

    invoke-virtual {p1, v6}, Lb/e/b/k/e;->e0(I)V

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v6, p1, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v6, v6, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    invoke-virtual {p1}, Lb/e/b/k/e;->t()I

    move-result p1

    :goto_0
    invoke-virtual {v6, p1}, Lb/e/b/k/m/g;->d(I)V

    :cond_4
    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    if-nez p2, :cond_6

    iget-object v5, p1, Lb/e/b/k/e;->N:[Lb/e/b/k/e$b;

    aget-object v6, v5, v2

    sget-object v7, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    if-eq v6, v7, :cond_5

    aget-object v5, v5, v2

    sget-object v6, Lb/e/b/k/e$b;->e:Lb/e/b/k/e$b;

    if-ne v5, v6, :cond_7

    :cond_5
    invoke-virtual {p1}, Lb/e/b/k/e;->N()I

    move-result p1

    add-int/2addr p1, v4

    iget-object v5, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v5, v5, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v5, v5, Lb/e/b/k/m/m;->i:Lb/e/b/k/m/f;

    invoke-virtual {v5, p1}, Lb/e/b/k/m/f;->d(I)V

    iget-object v5, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v5, v5, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v5, v5, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    sub-int/2addr p1, v4

    invoke-virtual {v5, p1}, Lb/e/b/k/m/g;->d(I)V

    goto :goto_2

    :cond_6
    iget-object v4, p1, Lb/e/b/k/e;->N:[Lb/e/b/k/e$b;

    aget-object v6, v4, v0

    sget-object v7, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    if-eq v6, v7, :cond_8

    aget-object v4, v4, v0

    sget-object v6, Lb/e/b/k/e$b;->e:Lb/e/b/k/e$b;

    if-ne v4, v6, :cond_7

    goto :goto_1

    :cond_7
    const/4 p1, 0x0

    goto :goto_3

    :cond_8
    :goto_1
    invoke-virtual {p1}, Lb/e/b/k/e;->t()I

    move-result p1

    add-int/2addr p1, v5

    iget-object v4, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v4, v4, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v4, v4, Lb/e/b/k/m/m;->i:Lb/e/b/k/m/f;

    invoke-virtual {v4, p1}, Lb/e/b/k/m/f;->d(I)V

    iget-object v4, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v4, v4, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v4, v4, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    sub-int/2addr p1, v5

    invoke-virtual {v4, p1}, Lb/e/b/k/m/g;->d(I)V

    :goto_2
    const/4 p1, 0x1

    :goto_3
    invoke-virtual {p0}, Lb/e/b/k/m/e;->m()V

    iget-object v4, p0, Lb/e/b/k/m/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb/e/b/k/m/m;

    iget v6, v5, Lb/e/b/k/m/m;->f:I

    if-eq v6, p2, :cond_9

    goto :goto_4

    :cond_9
    iget-object v6, v5, Lb/e/b/k/m/m;->b:Lb/e/b/k/e;

    iget-object v7, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    if-ne v6, v7, :cond_a

    iget-boolean v6, v5, Lb/e/b/k/m/m;->g:Z

    if-nez v6, :cond_a

    goto :goto_4

    :cond_a
    invoke-virtual {v5}, Lb/e/b/k/m/m;->e()V

    goto :goto_4

    :cond_b
    iget-object v4, p0, Lb/e/b/k/m/e;->e:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_c
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb/e/b/k/m/m;

    iget v6, v5, Lb/e/b/k/m/m;->f:I

    if-eq v6, p2, :cond_d

    goto :goto_5

    :cond_d
    if-nez p1, :cond_e

    iget-object v6, v5, Lb/e/b/k/m/m;->b:Lb/e/b/k/e;

    iget-object v7, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    if-ne v6, v7, :cond_e

    goto :goto_5

    :cond_e
    iget-object v6, v5, Lb/e/b/k/m/m;->h:Lb/e/b/k/m/f;

    iget-boolean v6, v6, Lb/e/b/k/m/f;->j:Z

    if-nez v6, :cond_f

    :goto_6
    const/4 v0, 0x0

    goto :goto_7

    :cond_f
    iget-object v6, v5, Lb/e/b/k/m/m;->i:Lb/e/b/k/m/f;

    iget-boolean v6, v6, Lb/e/b/k/m/f;->j:Z

    if-nez v6, :cond_10

    goto :goto_6

    :cond_10
    instance-of v6, v5, Lb/e/b/k/m/c;

    if-nez v6, :cond_c

    iget-object v5, v5, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    iget-boolean v5, v5, Lb/e/b/k/m/f;->j:Z

    if-nez v5, :cond_c

    goto :goto_6

    :cond_11
    :goto_7
    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {p1, v1}, Lb/e/b/k/e;->i0(Lb/e/b/k/e$b;)V

    iget-object p1, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    invoke-virtual {p1, v3}, Lb/e/b/k/e;->x0(Lb/e/b/k/e$b;)V

    return v0
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/e/b/k/m/e;->b:Z

    return-void
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb/e/b/k/m/e;->c:Z

    return-void
.end method

.method public m()V
    .locals 12

    iget-object v0, p0, Lb/e/b/k/m/e;->a:Lb/e/b/k/f;

    iget-object v0, v0, Lb/e/b/k/l;->w0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb/e/b/k/e;

    iget-boolean v2, v1, Lb/e/b/k/e;->b:Z

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v1, Lb/e/b/k/e;->N:[Lb/e/b/k/e$b;

    const/4 v3, 0x0

    aget-object v8, v2, v3

    const/4 v9, 0x1

    aget-object v10, v2, v9

    iget v2, v1, Lb/e/b/k/e;->m:I

    iget v4, v1, Lb/e/b/k/e;->n:I

    sget-object v6, Lb/e/b/k/e$b;->c:Lb/e/b/k/e$b;

    if-eq v8, v6, :cond_3

    sget-object v5, Lb/e/b/k/e$b;->d:Lb/e/b/k/e$b;

    if-ne v8, v5, :cond_2

    if-ne v2, v9, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v2, 0x1

    :goto_2
    if-eq v10, v6, :cond_4

    sget-object v5, Lb/e/b/k/e$b;->d:Lb/e/b/k/e$b;

    if-ne v10, v5, :cond_5

    if-ne v4, v9, :cond_5

    :cond_4
    const/4 v3, 0x1

    :cond_5
    iget-object v4, v1, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v4, v4, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    iget-boolean v5, v4, Lb/e/b/k/m/f;->j:Z

    iget-object v7, v1, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v7, v7, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    iget-boolean v11, v7, Lb/e/b/k/m/f;->j:Z

    if-eqz v5, :cond_6

    if-eqz v11, :cond_6

    sget-object v6, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    iget v5, v4, Lb/e/b/k/m/f;->g:I

    iget v7, v7, Lb/e/b/k/m/f;->g:I

    move-object v2, p0

    move-object v3, v1

    move-object v4, v6

    invoke-direct/range {v2 .. v7}, Lb/e/b/k/m/e;->l(Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V

    :goto_3
    iput-boolean v9, v1, Lb/e/b/k/e;->b:Z

    goto :goto_6

    :cond_6
    if-eqz v5, :cond_8

    if-eqz v3, :cond_8

    sget-object v5, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    iget v8, v4, Lb/e/b/k/m/f;->g:I

    iget v7, v7, Lb/e/b/k/m/f;->g:I

    move-object v2, p0

    move-object v3, v1

    move-object v4, v5

    move v5, v8

    invoke-direct/range {v2 .. v7}, Lb/e/b/k/m/e;->l(Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V

    sget-object v2, Lb/e/b/k/e$b;->d:Lb/e/b/k/e$b;

    if-ne v10, v2, :cond_7

    iget-object v2, v1, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v2, v2, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    invoke-virtual {v1}, Lb/e/b/k/e;->t()I

    move-result v3

    :goto_4
    iput v3, v2, Lb/e/b/k/m/g;->m:I

    goto :goto_6

    :cond_7
    iget-object v2, v1, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v2, v2, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    invoke-virtual {v1}, Lb/e/b/k/e;->t()I

    move-result v3

    :goto_5
    invoke-virtual {v2, v3}, Lb/e/b/k/m/g;->d(I)V

    goto :goto_3

    :cond_8
    if-eqz v11, :cond_a

    if-eqz v2, :cond_a

    iget v5, v4, Lb/e/b/k/m/f;->g:I

    sget-object v10, Lb/e/b/k/e$b;->b:Lb/e/b/k/e$b;

    iget v7, v7, Lb/e/b/k/m/f;->g:I

    move-object v2, p0

    move-object v3, v1

    move-object v4, v6

    move-object v6, v10

    invoke-direct/range {v2 .. v7}, Lb/e/b/k/m/e;->l(Lb/e/b/k/e;Lb/e/b/k/e$b;ILb/e/b/k/e$b;I)V

    sget-object v2, Lb/e/b/k/e$b;->d:Lb/e/b/k/e$b;

    if-ne v8, v2, :cond_9

    iget-object v2, v1, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v2, v2, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    invoke-virtual {v1}, Lb/e/b/k/e;->N()I

    move-result v3

    goto :goto_4

    :cond_9
    iget-object v2, v1, Lb/e/b/k/e;->f:Lb/e/b/k/m/j;

    iget-object v2, v2, Lb/e/b/k/m/m;->e:Lb/e/b/k/m/g;

    invoke-virtual {v1}, Lb/e/b/k/e;->N()I

    move-result v3

    goto :goto_5

    :cond_a
    :goto_6
    iget-boolean v2, v1, Lb/e/b/k/e;->b:Z

    if-eqz v2, :cond_0

    iget-object v2, v1, Lb/e/b/k/e;->g:Lb/e/b/k/m/l;

    iget-object v2, v2, Lb/e/b/k/m/l;->l:Lb/e/b/k/m/g;

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lb/e/b/k/e;->l()I

    move-result v1

    invoke-virtual {v2, v1}, Lb/e/b/k/m/g;->d(I)V

    goto/16 :goto_0

    :cond_b
    return-void
.end method

.method public n(Lb/e/b/k/m/b$b;)V
    .locals 0

    iput-object p1, p0, Lb/e/b/k/m/e;->g:Lb/e/b/k/m/b$b;

    return-void
.end method
