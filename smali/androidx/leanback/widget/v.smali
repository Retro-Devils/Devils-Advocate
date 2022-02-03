.class final Landroidx/leanback/widget/v;
.super Landroidx/leanback/widget/u;
.source ""


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/leanback/widget/u;-><init>()V

    return-void
.end method

.method private R(Z)I
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    iget p1, p0, Landroidx/leanback/widget/e;->g:I

    :goto_0
    iget v2, p0, Landroidx/leanback/widget/e;->f:I

    if-lt p1, v2, :cond_5

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v2

    iget v2, v2, Landroidx/leanback/widget/e$a;->a:I

    if-nez v2, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_1

    iget v3, p0, Landroidx/leanback/widget/e;->e:I

    sub-int/2addr v3, v0

    if-ne v2, v3, :cond_1

    return p1

    :cond_1
    :goto_1
    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_2
    iget p1, p0, Landroidx/leanback/widget/e;->f:I

    :goto_2
    iget v2, p0, Landroidx/leanback/widget/e;->g:I

    if-gt p1, v2, :cond_5

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v2

    iget v2, v2, Landroidx/leanback/widget/e$a;->a:I

    iget v3, p0, Landroidx/leanback/widget/e;->e:I

    sub-int/2addr v3, v0

    if-ne v2, v3, :cond_3

    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    if-eqz v1, :cond_4

    if-nez v2, :cond_4

    return p1

    :cond_4
    :goto_3
    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_5
    const/4 p1, -0x1

    return p1
.end method


# virtual methods
.method protected J(IZ)Z
    .locals 13

    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v0}, Landroidx/leanback/widget/e$b;->getCount()I

    move-result v0

    iget v1, p0, Landroidx/leanback/widget/e;->g:I

    const/high16 v2, -0x80000000

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ltz v1, :cond_9

    invoke-virtual {p0}, Landroidx/leanback/widget/u;->M()I

    move-result v6

    if-ge v1, v6, :cond_0

    return v4

    :cond_0
    iget v1, p0, Landroidx/leanback/widget/e;->g:I

    add-int/lit8 v6, v1, 0x1

    invoke-virtual {p0, v1}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v1

    iget v1, v1, Landroidx/leanback/widget/e$a;->a:I

    invoke-direct {p0, v5}, Landroidx/leanback/widget/v;->R(Z)I

    move-result v7

    if-gez v7, :cond_3

    const/4 v7, 0x0

    const/high16 v8, -0x80000000

    :goto_0
    iget v9, p0, Landroidx/leanback/widget/e;->e:I

    if-ge v7, v9, :cond_5

    iget-boolean v8, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v8, :cond_1

    invoke-virtual {p0, v7}, Landroidx/leanback/widget/v;->T(I)I

    move-result v8

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v7}, Landroidx/leanback/widget/v;->S(I)I

    move-result v8

    :goto_1
    if-eq v8, v2, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    iget-boolean v8, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v8, :cond_4

    invoke-virtual {p0, v4, v7, v3}, Landroidx/leanback/widget/v;->k(ZI[I)I

    move-result v7

    goto :goto_2

    :cond_4
    invoke-virtual {p0, v5, v7, v3}, Landroidx/leanback/widget/v;->i(ZI[I)I

    move-result v7

    :goto_2
    move v8, v7

    :cond_5
    :goto_3
    iget-boolean v7, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v7, :cond_6

    invoke-virtual {p0, v1}, Landroidx/leanback/widget/v;->T(I)I

    move-result v7

    if-gt v7, v8, :cond_8

    goto :goto_4

    :cond_6
    invoke-virtual {p0, v1}, Landroidx/leanback/widget/v;->S(I)I

    move-result v7

    if-lt v7, v8, :cond_8

    :goto_4
    add-int/lit8 v1, v1, 0x1

    iget v7, p0, Landroidx/leanback/widget/e;->e:I

    if-ne v1, v7, :cond_8

    iget-boolean v1, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v1, :cond_7

    invoke-virtual {p0, v4, v3}, Landroidx/leanback/widget/e;->l(Z[I)I

    move-result v1

    goto :goto_5

    :cond_7
    invoke-virtual {p0, v5, v3}, Landroidx/leanback/widget/e;->j(Z[I)I

    move-result v1

    :goto_5
    move v8, v1

    const/4 v1, 0x0

    :cond_8
    const/4 v7, 0x1

    goto :goto_8

    :cond_9
    iget v1, p0, Landroidx/leanback/widget/e;->i:I

    const/4 v6, -0x1

    if-eq v1, v6, :cond_a

    move v6, v1

    goto :goto_6

    :cond_a
    const/4 v6, 0x0

    :goto_6
    iget-object v1, p0, Landroidx/leanback/widget/u;->j:Lb/d/c;

    invoke-virtual {v1}, Lb/d/c;->h()I

    move-result v1

    if-lez v1, :cond_b

    invoke-virtual {p0}, Landroidx/leanback/widget/u;->M()I

    move-result v1

    invoke-virtual {p0, v1}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v1

    iget v1, v1, Landroidx/leanback/widget/e$a;->a:I

    add-int/2addr v1, v5

    goto :goto_7

    :cond_b
    move v1, v6

    :goto_7
    iget v7, p0, Landroidx/leanback/widget/e;->e:I

    rem-int/2addr v1, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_8
    const/4 v9, 0x0

    :goto_9
    iget v10, p0, Landroidx/leanback/widget/e;->e:I

    if-ge v1, v10, :cond_1d

    if-eq v6, v0, :cond_1c

    if-nez p2, :cond_c

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/e;->d(I)Z

    move-result v10

    if-eqz v10, :cond_c

    goto/16 :goto_16

    :cond_c
    iget-boolean v9, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v9, :cond_d

    invoke-virtual {p0, v1}, Landroidx/leanback/widget/v;->T(I)I

    move-result v9

    goto :goto_a

    :cond_d
    invoke-virtual {p0, v1}, Landroidx/leanback/widget/v;->S(I)I

    move-result v9

    :goto_a
    const v10, 0x7fffffff

    if-eq v9, v10, :cond_10

    if-ne v9, v2, :cond_e

    goto :goto_d

    :cond_e
    iget-boolean v10, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v10, :cond_f

    :goto_b
    iget v10, p0, Landroidx/leanback/widget/e;->d:I

    neg-int v10, v10

    goto :goto_c

    :cond_f
    iget v10, p0, Landroidx/leanback/widget/e;->d:I

    :goto_c
    add-int/2addr v9, v10

    goto :goto_f

    :cond_10
    :goto_d
    iget-boolean v9, p0, Landroidx/leanback/widget/e;->c:Z

    if-nez v1, :cond_12

    if-eqz v9, :cond_11

    iget v9, p0, Landroidx/leanback/widget/e;->e:I

    sub-int/2addr v9, v5

    invoke-virtual {p0, v9}, Landroidx/leanback/widget/v;->T(I)I

    move-result v9

    goto :goto_e

    :cond_11
    iget v9, p0, Landroidx/leanback/widget/e;->e:I

    sub-int/2addr v9, v5

    invoke-virtual {p0, v9}, Landroidx/leanback/widget/v;->S(I)I

    move-result v9

    :goto_e
    if-eq v9, v10, :cond_14

    if-eq v9, v2, :cond_14

    iget-boolean v10, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v10, :cond_f

    goto :goto_b

    :cond_12
    if-eqz v9, :cond_13

    add-int/lit8 v9, v1, -0x1

    invoke-virtual {p0, v9}, Landroidx/leanback/widget/v;->S(I)I

    move-result v9

    goto :goto_f

    :cond_13
    add-int/lit8 v9, v1, -0x1

    invoke-virtual {p0, v9}, Landroidx/leanback/widget/v;->T(I)I

    move-result v9

    :cond_14
    :goto_f
    add-int/lit8 v10, v6, 0x1

    invoke-virtual {p0, v6, v1, v9}, Landroidx/leanback/widget/u;->I(III)I

    move-result v6

    if-eqz v7, :cond_1a

    :goto_10
    iget-boolean v11, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v11, :cond_15

    sub-int v11, v9, v6

    if-le v11, v8, :cond_19

    goto :goto_11

    :cond_15
    add-int v11, v9, v6

    if-ge v11, v8, :cond_19

    :goto_11
    if-eq v10, v0, :cond_18

    if-nez p2, :cond_16

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/e;->d(I)Z

    move-result v11

    if-eqz v11, :cond_16

    goto :goto_13

    :cond_16
    iget-boolean v11, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v11, :cond_17

    neg-int v6, v6

    iget v11, p0, Landroidx/leanback/widget/e;->d:I

    sub-int/2addr v6, v11

    goto :goto_12

    :cond_17
    iget v11, p0, Landroidx/leanback/widget/e;->d:I

    add-int/2addr v6, v11

    :goto_12
    add-int/2addr v9, v6

    add-int/lit8 v6, v10, 0x1

    invoke-virtual {p0, v10, v1, v9}, Landroidx/leanback/widget/u;->I(III)I

    move-result v10

    move v12, v10

    move v10, v6

    move v6, v12

    goto :goto_10

    :cond_18
    :goto_13
    return v5

    :cond_19
    move v6, v10

    goto :goto_15

    :cond_1a
    iget-boolean v6, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v6, :cond_1b

    invoke-virtual {p0, v1}, Landroidx/leanback/widget/v;->T(I)I

    move-result v6

    goto :goto_14

    :cond_1b
    invoke-virtual {p0, v1}, Landroidx/leanback/widget/v;->S(I)I

    move-result v6

    :goto_14
    move v8, v6

    move v6, v10

    const/4 v7, 0x1

    :goto_15
    add-int/lit8 v1, v1, 0x1

    const/4 v9, 0x1

    goto/16 :goto_9

    :cond_1c
    :goto_16
    return v9

    :cond_1d
    if-eqz p2, :cond_1e

    return v9

    :cond_1e
    iget-boolean v1, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v1, :cond_1f

    invoke-virtual {p0, v4, v3}, Landroidx/leanback/widget/e;->l(Z[I)I

    move-result v1

    goto :goto_17

    :cond_1f
    invoke-virtual {p0, v5, v3}, Landroidx/leanback/widget/e;->j(Z[I)I

    move-result v1

    :goto_17
    move v8, v1

    const/4 v1, 0x0

    goto/16 :goto_9
.end method

.method protected Q(IZ)Z
    .locals 12

    iget v0, p0, Landroidx/leanback/widget/e;->f:I

    const v1, 0x7fffffff

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ltz v0, :cond_9

    invoke-virtual {p0}, Landroidx/leanback/widget/u;->L()I

    move-result v5

    if-le v0, v5, :cond_0

    return v3

    :cond_0
    iget v0, p0, Landroidx/leanback/widget/e;->f:I

    add-int/lit8 v5, v0, -0x1

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v0

    iget v0, v0, Landroidx/leanback/widget/e$a;->a:I

    invoke-direct {p0, v3}, Landroidx/leanback/widget/v;->R(Z)I

    move-result v6

    if-gez v6, :cond_3

    add-int/lit8 v0, v0, -0x1

    iget v6, p0, Landroidx/leanback/widget/e;->e:I

    sub-int/2addr v6, v4

    const v7, 0x7fffffff

    :goto_0
    if-ltz v6, :cond_5

    iget-boolean v7, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v7, :cond_1

    invoke-virtual {p0, v6}, Landroidx/leanback/widget/v;->S(I)I

    move-result v7

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v6}, Landroidx/leanback/widget/v;->T(I)I

    move-result v7

    :goto_1
    if-eq v7, v1, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    :cond_3
    iget-boolean v7, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v7, :cond_4

    invoke-virtual {p0, v4, v6, v2}, Landroidx/leanback/widget/v;->i(ZI[I)I

    move-result v6

    goto :goto_2

    :cond_4
    invoke-virtual {p0, v3, v6, v2}, Landroidx/leanback/widget/v;->k(ZI[I)I

    move-result v6

    :goto_2
    move v7, v6

    :cond_5
    :goto_3
    iget-boolean v6, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v6, :cond_6

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/v;->S(I)I

    move-result v6

    if-lt v6, v7, :cond_8

    goto :goto_4

    :cond_6
    invoke-virtual {p0, v0}, Landroidx/leanback/widget/v;->T(I)I

    move-result v6

    if-gt v6, v7, :cond_8

    :goto_4
    add-int/lit8 v0, v0, -0x1

    if-gez v0, :cond_8

    iget v0, p0, Landroidx/leanback/widget/e;->e:I

    sub-int/2addr v0, v4

    iget-boolean v6, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v6, :cond_7

    invoke-virtual {p0, v4, v2}, Landroidx/leanback/widget/e;->j(Z[I)I

    move-result v6

    goto :goto_5

    :cond_7
    invoke-virtual {p0, v3, v2}, Landroidx/leanback/widget/e;->l(Z[I)I

    move-result v6

    :goto_5
    move v7, v6

    :cond_8
    const/4 v6, 0x1

    goto :goto_8

    :cond_9
    iget v0, p0, Landroidx/leanback/widget/e;->i:I

    const/4 v5, -0x1

    if-eq v0, v5, :cond_a

    move v5, v0

    goto :goto_6

    :cond_a
    const/4 v5, 0x0

    :goto_6
    iget-object v0, p0, Landroidx/leanback/widget/u;->j:Lb/d/c;

    invoke-virtual {v0}, Lb/d/c;->h()I

    move-result v0

    if-lez v0, :cond_b

    invoke-virtual {p0}, Landroidx/leanback/widget/u;->L()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v0

    iget v0, v0, Landroidx/leanback/widget/e$a;->a:I

    iget v6, p0, Landroidx/leanback/widget/e;->e:I

    add-int/2addr v0, v6

    sub-int/2addr v0, v4

    goto :goto_7

    :cond_b
    move v0, v5

    :goto_7
    iget v6, p0, Landroidx/leanback/widget/e;->e:I

    rem-int/2addr v0, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_8
    const/4 v8, 0x0

    :goto_9
    if-ltz v0, :cond_1d

    if-ltz v5, :cond_1c

    if-nez p2, :cond_c

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/e;->e(I)Z

    move-result v9

    if-eqz v9, :cond_c

    goto/16 :goto_16

    :cond_c
    iget-boolean v8, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v8, :cond_d

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/v;->S(I)I

    move-result v8

    goto :goto_a

    :cond_d
    invoke-virtual {p0, v0}, Landroidx/leanback/widget/v;->T(I)I

    move-result v8

    :goto_a
    const/high16 v9, -0x80000000

    if-eq v8, v1, :cond_10

    if-ne v8, v9, :cond_e

    goto :goto_d

    :cond_e
    iget-boolean v9, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v9, :cond_f

    :goto_b
    iget v9, p0, Landroidx/leanback/widget/e;->d:I

    goto :goto_c

    :cond_f
    iget v9, p0, Landroidx/leanback/widget/e;->d:I

    neg-int v9, v9

    :goto_c
    add-int/2addr v8, v9

    goto :goto_f

    :cond_10
    :goto_d
    iget v8, p0, Landroidx/leanback/widget/e;->e:I

    sub-int/2addr v8, v4

    if-ne v0, v8, :cond_12

    iget-boolean v8, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v8, :cond_11

    invoke-virtual {p0, v3}, Landroidx/leanback/widget/v;->S(I)I

    move-result v8

    goto :goto_e

    :cond_11
    invoke-virtual {p0, v3}, Landroidx/leanback/widget/v;->T(I)I

    move-result v8

    :goto_e
    if-eq v8, v1, :cond_14

    if-eq v8, v9, :cond_14

    iget-boolean v9, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v9, :cond_f

    goto :goto_b

    :cond_12
    iget-boolean v8, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v8, :cond_13

    add-int/lit8 v8, v0, 0x1

    invoke-virtual {p0, v8}, Landroidx/leanback/widget/v;->T(I)I

    move-result v8

    goto :goto_f

    :cond_13
    add-int/lit8 v8, v0, 0x1

    invoke-virtual {p0, v8}, Landroidx/leanback/widget/v;->S(I)I

    move-result v8

    :cond_14
    :goto_f
    add-int/lit8 v9, v5, -0x1

    invoke-virtual {p0, v5, v0, v8}, Landroidx/leanback/widget/u;->P(III)I

    move-result v5

    if-eqz v6, :cond_1a

    :goto_10
    iget-boolean v10, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v10, :cond_15

    add-int v10, v8, v5

    if-ge v10, v7, :cond_19

    goto :goto_11

    :cond_15
    sub-int v10, v8, v5

    if-le v10, v7, :cond_19

    :goto_11
    if-ltz v9, :cond_18

    if-nez p2, :cond_16

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/e;->e(I)Z

    move-result v10

    if-eqz v10, :cond_16

    goto :goto_13

    :cond_16
    iget-boolean v10, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v10, :cond_17

    iget v10, p0, Landroidx/leanback/widget/e;->d:I

    add-int/2addr v5, v10

    goto :goto_12

    :cond_17
    neg-int v5, v5

    iget v10, p0, Landroidx/leanback/widget/e;->d:I

    sub-int/2addr v5, v10

    :goto_12
    add-int/2addr v8, v5

    add-int/lit8 v5, v9, -0x1

    invoke-virtual {p0, v9, v0, v8}, Landroidx/leanback/widget/u;->P(III)I

    move-result v9

    move v11, v9

    move v9, v5

    move v5, v11

    goto :goto_10

    :cond_18
    :goto_13
    return v4

    :cond_19
    move v5, v9

    goto :goto_15

    :cond_1a
    iget-boolean v5, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v5, :cond_1b

    invoke-virtual {p0, v0}, Landroidx/leanback/widget/v;->S(I)I

    move-result v5

    goto :goto_14

    :cond_1b
    invoke-virtual {p0, v0}, Landroidx/leanback/widget/v;->T(I)I

    move-result v5

    :goto_14
    move v7, v5

    move v5, v9

    const/4 v6, 0x1

    :goto_15
    add-int/lit8 v0, v0, -0x1

    const/4 v8, 0x1

    goto/16 :goto_9

    :cond_1c
    :goto_16
    return v8

    :cond_1d
    if-eqz p2, :cond_1e

    return v8

    :cond_1e
    iget-boolean v0, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v0, :cond_1f

    invoke-virtual {p0, v4, v2}, Landroidx/leanback/widget/e;->j(Z[I)I

    move-result v0

    goto :goto_17

    :cond_1f
    invoke-virtual {p0, v3, v2}, Landroidx/leanback/widget/e;->l(Z[I)I

    move-result v0

    :goto_17
    move v7, v0

    iget v0, p0, Landroidx/leanback/widget/e;->e:I

    sub-int/2addr v0, v4

    goto/16 :goto_9
.end method

.method S(I)I
    .locals 5

    iget v0, p0, Landroidx/leanback/widget/e;->f:I

    const/high16 v1, -0x80000000

    if-gez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v2, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v2, v0}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v0

    iget v2, p0, Landroidx/leanback/widget/e;->f:I

    invoke-virtual {p0, v2}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v2

    iget v2, v2, Landroidx/leanback/widget/e$a;->a:I

    if-ne v2, p1, :cond_1

    return v0

    :cond_1
    iget v2, p0, Landroidx/leanback/widget/e;->f:I

    :goto_0
    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0}, Landroidx/leanback/widget/u;->M()I

    move-result v3

    if-gt v2, v3, :cond_6

    invoke-virtual {p0, v2}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v3

    iget v4, v3, Landroidx/leanback/widget/u$a;->b:I

    add-int/2addr v0, v4

    iget v3, v3, Landroidx/leanback/widget/e$a;->a:I

    if-ne v3, p1, :cond_2

    return v0

    :cond_2
    goto :goto_0

    :cond_3
    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget v2, p0, Landroidx/leanback/widget/e;->g:I

    invoke-interface {v0, v2}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v0

    iget v2, p0, Landroidx/leanback/widget/e;->g:I

    invoke-virtual {p0, v2}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v2

    iget v3, v2, Landroidx/leanback/widget/e$a;->a:I

    if-ne v3, p1, :cond_4

    :goto_1
    iget p1, v2, Landroidx/leanback/widget/u$a;->c:I

    add-int/2addr v0, p1

    return v0

    :cond_4
    iget v3, p0, Landroidx/leanback/widget/e;->g:I

    add-int/lit8 v3, v3, -0x1

    :goto_2
    invoke-virtual {p0}, Landroidx/leanback/widget/u;->L()I

    move-result v4

    if-lt v3, v4, :cond_6

    iget v2, v2, Landroidx/leanback/widget/u$a;->b:I

    sub-int/2addr v0, v2

    invoke-virtual {p0, v3}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v2

    iget v4, v2, Landroidx/leanback/widget/e$a;->a:I

    if-ne v4, p1, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    :cond_6
    return v1
.end method

.method T(I)I
    .locals 5

    iget v0, p0, Landroidx/leanback/widget/e;->f:I

    const v1, 0x7fffffff

    if-gez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v2, p0, Landroidx/leanback/widget/e;->c:Z

    if-eqz v2, :cond_3

    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    iget v2, p0, Landroidx/leanback/widget/e;->g:I

    invoke-interface {v0, v2}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v0

    iget v2, p0, Landroidx/leanback/widget/e;->g:I

    invoke-virtual {p0, v2}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v2

    iget v3, v2, Landroidx/leanback/widget/e$a;->a:I

    if-ne v3, p1, :cond_1

    :goto_0
    iget p1, v2, Landroidx/leanback/widget/u$a;->c:I

    sub-int/2addr v0, p1

    return v0

    :cond_1
    iget v3, p0, Landroidx/leanback/widget/e;->g:I

    add-int/lit8 v3, v3, -0x1

    :goto_1
    invoke-virtual {p0}, Landroidx/leanback/widget/u;->L()I

    move-result v4

    if-lt v3, v4, :cond_6

    iget v2, v2, Landroidx/leanback/widget/u$a;->b:I

    sub-int/2addr v0, v2

    invoke-virtual {p0, v3}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v2

    iget v4, v2, Landroidx/leanback/widget/e$a;->a:I

    if-ne v4, p1, :cond_2

    goto :goto_0

    :cond_2
    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_3
    iget-object v2, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v2, v0}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v0

    iget v2, p0, Landroidx/leanback/widget/e;->f:I

    invoke-virtual {p0, v2}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v2

    iget v2, v2, Landroidx/leanback/widget/e$a;->a:I

    if-ne v2, p1, :cond_4

    return v0

    :cond_4
    iget v2, p0, Landroidx/leanback/widget/e;->f:I

    :goto_2
    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0}, Landroidx/leanback/widget/u;->M()I

    move-result v3

    if-gt v2, v3, :cond_6

    invoke-virtual {p0, v2}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v3

    iget v4, v3, Landroidx/leanback/widget/u$a;->b:I

    add-int/2addr v0, v4

    iget v3, v3, Landroidx/leanback/widget/e$a;->a:I

    if-ne v3, p1, :cond_5

    return v0

    :cond_5
    goto :goto_2

    :cond_6
    return v1
.end method

.method public i(ZI[I)I
    .locals 9

    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v0, p2}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v0

    invoke-virtual {p0, p2}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v1

    iget v2, v1, Landroidx/leanback/widget/e$a;->a:I

    iget-boolean v3, p0, Landroidx/leanback/widget/e;->c:Z

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    add-int/lit8 v1, p2, 0x1

    move v3, v2

    move v5, v3

    const/4 v6, 0x1

    move v2, v1

    move v1, v0

    :goto_0
    iget v7, p0, Landroidx/leanback/widget/e;->e:I

    if-ge v6, v7, :cond_7

    iget v7, p0, Landroidx/leanback/widget/e;->g:I

    if-gt v2, v7, :cond_7

    invoke-virtual {p0, v2}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v7

    iget v8, v7, Landroidx/leanback/widget/u$a;->b:I

    add-int/2addr v1, v8

    iget v7, v7, Landroidx/leanback/widget/e$a;->a:I

    if-eq v7, v5, :cond_2

    add-int/lit8 v6, v6, 0x1

    if-eqz p1, :cond_0

    if-le v1, v0, :cond_1

    goto :goto_1

    :cond_0
    if-ge v1, v0, :cond_1

    :goto_1
    move v0, v1

    move p2, v2

    move v3, v7

    move v5, v3

    goto :goto_2

    :cond_1
    move v5, v7

    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    iget-object v3, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v3, p2}, Landroidx/leanback/widget/e$b;->a(I)I

    move-result v3

    add-int/2addr v3, v0

    add-int/lit8 v5, p2, -0x1

    move v6, v5

    const/4 v7, 0x1

    move v5, v2

    move-object v2, v1

    move v1, v0

    move v0, v3

    move v3, v5

    :goto_3
    iget v8, p0, Landroidx/leanback/widget/e;->e:I

    if-ge v7, v8, :cond_7

    iget v8, p0, Landroidx/leanback/widget/e;->f:I

    if-lt v6, v8, :cond_7

    iget v2, v2, Landroidx/leanback/widget/u$a;->b:I

    sub-int/2addr v1, v2

    invoke-virtual {p0, v6}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v2

    iget v8, v2, Landroidx/leanback/widget/e$a;->a:I

    if-eq v8, v5, :cond_6

    add-int/lit8 v7, v7, 0x1

    iget-object v5, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v5, v6}, Landroidx/leanback/widget/e$b;->a(I)I

    move-result v5

    add-int/2addr v5, v1

    if-eqz p1, :cond_4

    if-le v5, v0, :cond_5

    goto :goto_4

    :cond_4
    if-ge v5, v0, :cond_5

    :goto_4
    move v0, v5

    move p2, v6

    move v3, v8

    move v5, v3

    goto :goto_5

    :cond_5
    move v5, v8

    :cond_6
    :goto_5
    add-int/lit8 v6, v6, -0x1

    goto :goto_3

    :cond_7
    if-eqz p3, :cond_8

    const/4 p1, 0x0

    aput v3, p3, p1

    aput p2, p3, v4

    :cond_8
    return v0
.end method

.method public k(ZI[I)I
    .locals 9

    iget-object v0, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v0, p2}, Landroidx/leanback/widget/e$b;->b(I)I

    move-result v0

    invoke-virtual {p0, p2}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v1

    iget v2, v1, Landroidx/leanback/widget/e$a;->a:I

    iget-boolean v3, p0, Landroidx/leanback/widget/e;->c:Z

    const/4 v4, 0x1

    if-eqz v3, :cond_3

    iget-object v3, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v3, p2}, Landroidx/leanback/widget/e$b;->a(I)I

    move-result v3

    sub-int v3, v0, v3

    add-int/lit8 v5, p2, -0x1

    move v6, v5

    const/4 v7, 0x1

    move v5, v3

    move v3, v2

    :goto_0
    iget v8, p0, Landroidx/leanback/widget/e;->e:I

    if-ge v7, v8, :cond_8

    iget v8, p0, Landroidx/leanback/widget/e;->f:I

    if-lt v6, v8, :cond_8

    iget v1, v1, Landroidx/leanback/widget/u$a;->b:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v6}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v1

    iget v8, v1, Landroidx/leanback/widget/e$a;->a:I

    if-eq v8, v3, :cond_2

    add-int/lit8 v7, v7, 0x1

    iget-object v3, p0, Landroidx/leanback/widget/e;->b:Landroidx/leanback/widget/e$b;

    invoke-interface {v3, v6}, Landroidx/leanback/widget/e$b;->a(I)I

    move-result v3

    sub-int v3, v0, v3

    if-eqz p1, :cond_0

    if-le v3, v5, :cond_1

    goto :goto_1

    :cond_0
    if-ge v3, v5, :cond_1

    :goto_1
    move v5, v3

    move p2, v6

    move v2, v8

    move v3, v2

    goto :goto_2

    :cond_1
    move v3, v8

    :cond_2
    :goto_2
    add-int/lit8 v6, v6, -0x1

    goto :goto_0

    :cond_3
    add-int/lit8 v1, p2, 0x1

    move v3, v2

    move v5, v3

    const/4 v6, 0x1

    move v2, v1

    move v1, v0

    :goto_3
    iget v7, p0, Landroidx/leanback/widget/e;->e:I

    if-ge v6, v7, :cond_7

    iget v7, p0, Landroidx/leanback/widget/e;->g:I

    if-gt v2, v7, :cond_7

    invoke-virtual {p0, v2}, Landroidx/leanback/widget/u;->N(I)Landroidx/leanback/widget/u$a;

    move-result-object v7

    iget v8, v7, Landroidx/leanback/widget/u$a;->b:I

    add-int/2addr v1, v8

    iget v7, v7, Landroidx/leanback/widget/e$a;->a:I

    if-eq v7, v5, :cond_6

    add-int/lit8 v6, v6, 0x1

    if-eqz p1, :cond_4

    if-le v1, v0, :cond_5

    goto :goto_4

    :cond_4
    if-ge v1, v0, :cond_5

    :goto_4
    move v0, v1

    move p2, v2

    move v3, v7

    move v5, v3

    goto :goto_5

    :cond_5
    move v5, v7

    :cond_6
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_7
    move v5, v0

    move v2, v3

    :cond_8
    if-eqz p3, :cond_9

    const/4 p1, 0x0

    aput v2, p3, p1

    aput p2, p3, v4

    :cond_9
    return v5
.end method
