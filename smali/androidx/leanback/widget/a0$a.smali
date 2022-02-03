.class public Landroidx/leanback/widget/a0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/leanback/widget/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:F

.field private i:I

.field private j:I

.field private k:I

.field private l:Z

.field private m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    iput v0, p0, Landroidx/leanback/widget/a0$a;->e:I

    const/4 v0, 0x3

    iput v0, p0, Landroidx/leanback/widget/a0$a;->f:I

    const/4 v0, 0x0

    iput v0, p0, Landroidx/leanback/widget/a0$a;->g:I

    const/high16 v0, 0x42480000    # 50.0f

    iput v0, p0, Landroidx/leanback/widget/a0$a;->h:F

    invoke-virtual {p0}, Landroidx/leanback/widget/a0$a;->s()V

    iput-object p1, p0, Landroidx/leanback/widget/a0$a;->m:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final A(F)V
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-ltz v0, :cond_0

    const/high16 v0, 0x42c80000    # 100.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    :cond_0
    const/high16 v0, -0x40800000    # -1.0f

    cmpl-float v0, p1, v0

    if-nez v0, :cond_2

    :cond_1
    iput p1, p0, Landroidx/leanback/widget/a0$a;->h:F

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final B(IIII)V
    .locals 4

    iput p1, p0, Landroidx/leanback/widget/a0$a;->b:I

    iput p2, p0, Landroidx/leanback/widget/a0$a;->a:I

    invoke-virtual {p0}, Landroidx/leanback/widget/a0$a;->c()I

    move-result p1

    invoke-virtual {p0}, Landroidx/leanback/widget/a0$a;->a()I

    move-result p2

    invoke-virtual {p0}, Landroidx/leanback/widget/a0$a;->p()Z

    move-result v0

    invoke-virtual {p0}, Landroidx/leanback/widget/a0$a;->o()Z

    move-result v1

    if-nez v0, :cond_2

    iget-boolean v2, p0, Landroidx/leanback/widget/a0$a;->l:Z

    if-nez v2, :cond_0

    iget v2, p0, Landroidx/leanback/widget/a0$a;->f:I

    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_0
    iget v2, p0, Landroidx/leanback/widget/a0$a;->f:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_1

    :goto_0
    iget v2, p0, Landroidx/leanback/widget/a0$a;->b:I

    iget v3, p0, Landroidx/leanback/widget/a0$a;->j:I

    sub-int/2addr v2, v3

    :goto_1
    iput v2, p0, Landroidx/leanback/widget/a0$a;->d:I

    goto :goto_2

    :cond_1
    invoke-virtual {p0, p3, p2}, Landroidx/leanback/widget/a0$a;->b(II)I

    move-result v2

    goto :goto_1

    :cond_2
    :goto_2
    if-nez v1, :cond_5

    iget-boolean v2, p0, Landroidx/leanback/widget/a0$a;->l:Z

    if-nez v2, :cond_3

    iget v2, p0, Landroidx/leanback/widget/a0$a;->f:I

    and-int/lit8 v2, v2, 0x2

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_3
    iget v2, p0, Landroidx/leanback/widget/a0$a;->f:I

    and-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_4

    :goto_3
    iget v2, p0, Landroidx/leanback/widget/a0$a;->a:I

    iget v3, p0, Landroidx/leanback/widget/a0$a;->j:I

    sub-int/2addr v2, v3

    sub-int/2addr v2, p1

    iput v2, p0, Landroidx/leanback/widget/a0$a;->c:I

    goto :goto_4

    :cond_4
    invoke-virtual {p0, p4, p2}, Landroidx/leanback/widget/a0$a;->b(II)I

    move-result p1

    iput p1, p0, Landroidx/leanback/widget/a0$a;->c:I

    :cond_5
    :goto_4
    if-nez v1, :cond_b

    if-nez v0, :cond_b

    iget-boolean p1, p0, Landroidx/leanback/widget/a0$a;->l:Z

    if-nez p1, :cond_8

    iget p1, p0, Landroidx/leanback/widget/a0$a;->f:I

    and-int/lit8 v0, p1, 0x1

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroidx/leanback/widget/a0$a;->r()Z

    move-result p1

    if-eqz p1, :cond_6

    :goto_5
    iget p1, p0, Landroidx/leanback/widget/a0$a;->d:I

    invoke-virtual {p0, p4, p2}, Landroidx/leanback/widget/a0$a;->b(II)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Landroidx/leanback/widget/a0$a;->d:I

    :cond_6
    iget p1, p0, Landroidx/leanback/widget/a0$a;->d:I

    iget p2, p0, Landroidx/leanback/widget/a0$a;->c:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Landroidx/leanback/widget/a0$a;->c:I

    goto :goto_7

    :cond_7
    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Landroidx/leanback/widget/a0$a;->q()Z

    move-result p1

    if-eqz p1, :cond_9

    goto :goto_6

    :cond_8
    iget p1, p0, Landroidx/leanback/widget/a0$a;->f:I

    and-int/lit8 v0, p1, 0x1

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Landroidx/leanback/widget/a0$a;->r()Z

    move-result p1

    if-eqz p1, :cond_9

    :goto_6
    iget p1, p0, Landroidx/leanback/widget/a0$a;->c:I

    invoke-virtual {p0, p3, p2}, Landroidx/leanback/widget/a0$a;->b(II)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Landroidx/leanback/widget/a0$a;->c:I

    :cond_9
    iget p1, p0, Landroidx/leanback/widget/a0$a;->d:I

    iget p2, p0, Landroidx/leanback/widget/a0$a;->c:I

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, p0, Landroidx/leanback/widget/a0$a;->d:I

    goto :goto_7

    :cond_a
    and-int/lit8 p1, p1, 0x2

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Landroidx/leanback/widget/a0$a;->q()Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_5

    :cond_b
    :goto_7
    return-void
.end method

.method final a()I
    .locals 4

    iget-boolean v0, p0, Landroidx/leanback/widget/a0$a;->l:Z

    const/high16 v1, 0x42c80000    # 100.0f

    const/high16 v2, -0x40800000    # -1.0f

    if-nez v0, :cond_1

    iget v0, p0, Landroidx/leanback/widget/a0$a;->g:I

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    iget v3, p0, Landroidx/leanback/widget/a0$a;->i:I

    add-int/2addr v0, v3

    :goto_0
    iget v3, p0, Landroidx/leanback/widget/a0$a;->h:F

    cmpl-float v2, v3, v2

    if-eqz v2, :cond_3

    iget v2, p0, Landroidx/leanback/widget/a0$a;->i:I

    int-to-float v2, v2

    mul-float v2, v2, v3

    div-float/2addr v2, v1

    float-to-int v1, v2

    add-int/2addr v0, v1

    goto :goto_2

    :cond_1
    iget v0, p0, Landroidx/leanback/widget/a0$a;->g:I

    if-ltz v0, :cond_2

    iget v3, p0, Landroidx/leanback/widget/a0$a;->i:I

    sub-int/2addr v3, v0

    move v0, v3

    goto :goto_1

    :cond_2
    neg-int v0, v0

    :goto_1
    iget v3, p0, Landroidx/leanback/widget/a0$a;->h:F

    cmpl-float v2, v3, v2

    if-eqz v2, :cond_3

    iget v2, p0, Landroidx/leanback/widget/a0$a;->i:I

    int-to-float v2, v2

    mul-float v2, v2, v3

    div-float/2addr v2, v1

    float-to-int v1, v2

    sub-int/2addr v0, v1

    :cond_3
    :goto_2
    return v0
.end method

.method final b(II)I
    .locals 0

    sub-int/2addr p1, p2

    return p1
.end method

.method public final c()I
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/a0$a;->i:I

    iget v1, p0, Landroidx/leanback/widget/a0$a;->j:I

    sub-int/2addr v0, v1

    iget v1, p0, Landroidx/leanback/widget/a0$a;->k:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/a0$a;->c:I

    return v0
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/a0$a;->d:I

    return v0
.end method

.method public final f()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/a0$a;->k:I

    return v0
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/a0$a;->j:I

    return v0
.end method

.method public final h(I)I
    .locals 8

    invoke-virtual {p0}, Landroidx/leanback/widget/a0$a;->i()I

    move-result v0

    invoke-virtual {p0}, Landroidx/leanback/widget/a0$a;->a()I

    move-result v1

    invoke-virtual {p0}, Landroidx/leanback/widget/a0$a;->p()Z

    move-result v2

    invoke-virtual {p0}, Landroidx/leanback/widget/a0$a;->o()Z

    move-result v3

    if-nez v2, :cond_2

    iget v4, p0, Landroidx/leanback/widget/a0$a;->j:I

    sub-int v5, v1, v4

    iget-boolean v6, p0, Landroidx/leanback/widget/a0$a;->l:Z

    if-nez v6, :cond_0

    iget v6, p0, Landroidx/leanback/widget/a0$a;->f:I

    and-int/lit8 v6, v6, 0x1

    if-eqz v6, :cond_2

    goto :goto_0

    :cond_0
    iget v6, p0, Landroidx/leanback/widget/a0$a;->f:I

    and-int/lit8 v6, v6, 0x2

    if-eqz v6, :cond_2

    :goto_0
    iget v6, p0, Landroidx/leanback/widget/a0$a;->b:I

    sub-int v7, p1, v6

    if-gt v7, v5, :cond_2

    sub-int/2addr v6, v4

    if-nez v3, :cond_1

    iget p1, p0, Landroidx/leanback/widget/a0$a;->c:I

    if-le v6, p1, :cond_1

    move v6, p1

    :cond_1
    return v6

    :cond_2
    if-nez v3, :cond_5

    sub-int v3, v0, v1

    iget v4, p0, Landroidx/leanback/widget/a0$a;->k:I

    sub-int/2addr v3, v4

    iget-boolean v5, p0, Landroidx/leanback/widget/a0$a;->l:Z

    if-nez v5, :cond_3

    iget v5, p0, Landroidx/leanback/widget/a0$a;->f:I

    and-int/lit8 v5, v5, 0x2

    if-eqz v5, :cond_5

    goto :goto_1

    :cond_3
    iget v5, p0, Landroidx/leanback/widget/a0$a;->f:I

    and-int/lit8 v5, v5, 0x1

    if-eqz v5, :cond_5

    :goto_1
    iget v5, p0, Landroidx/leanback/widget/a0$a;->a:I

    sub-int v6, v5, p1

    if-gt v6, v3, :cond_5

    sub-int/2addr v0, v4

    sub-int/2addr v5, v0

    if-nez v2, :cond_4

    iget p1, p0, Landroidx/leanback/widget/a0$a;->d:I

    if-ge v5, p1, :cond_4

    move v5, p1

    :cond_4
    return v5

    :cond_5
    invoke-virtual {p0, p1, v1}, Landroidx/leanback/widget/a0$a;->b(II)I

    move-result p1

    return p1
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/a0$a;->i:I

    return v0
.end method

.method public final j()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/a0$a;->f:I

    return v0
.end method

.method public final k()I
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/a0$a;->g:I

    return v0
.end method

.method public final l()F
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/a0$a;->h:F

    return v0
.end method

.method public final m()V
    .locals 1

    const v0, 0x7fffffff

    iput v0, p0, Landroidx/leanback/widget/a0$a;->a:I

    iput v0, p0, Landroidx/leanback/widget/a0$a;->c:I

    return-void
.end method

.method public final n()V
    .locals 1

    const/high16 v0, -0x80000000

    iput v0, p0, Landroidx/leanback/widget/a0$a;->b:I

    iput v0, p0, Landroidx/leanback/widget/a0$a;->d:I

    return-void
.end method

.method public final o()Z
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/a0$a;->a:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final p()Z
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/a0$a;->b:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method final q()Z
    .locals 1

    iget v0, p0, Landroidx/leanback/widget/a0$a;->e:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method final r()Z
    .locals 2

    iget v0, p0, Landroidx/leanback/widget/a0$a;->e:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method s()V
    .locals 1

    const/high16 v0, -0x80000000

    iput v0, p0, Landroidx/leanback/widget/a0$a;->b:I

    const v0, 0x7fffffff

    iput v0, p0, Landroidx/leanback/widget/a0$a;->a:I

    return-void
.end method

.method public final t(II)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/a0$a;->j:I

    iput p2, p0, Landroidx/leanback/widget/a0$a;->k:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " min:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/leanback/widget/a0$a;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/leanback/widget/a0$a;->d:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " max:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/leanback/widget/a0$a;->a:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/leanback/widget/a0$a;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final u(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget p1, p0, Landroidx/leanback/widget/a0$a;->e:I

    or-int/lit8 p1, p1, 0x2

    goto :goto_0

    :cond_0
    iget p1, p0, Landroidx/leanback/widget/a0$a;->e:I

    and-int/lit8 p1, p1, -0x3

    :goto_0
    iput p1, p0, Landroidx/leanback/widget/a0$a;->e:I

    return-void
.end method

.method final v(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget p1, p0, Landroidx/leanback/widget/a0$a;->e:I

    or-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    iget p1, p0, Landroidx/leanback/widget/a0$a;->e:I

    and-int/lit8 p1, p1, -0x2

    :goto_0
    iput p1, p0, Landroidx/leanback/widget/a0$a;->e:I

    return-void
.end method

.method public final w(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/leanback/widget/a0$a;->l:Z

    return-void
.end method

.method public final x(I)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/a0$a;->i:I

    return-void
.end method

.method public final y(I)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/a0$a;->f:I

    return-void
.end method

.method public final z(I)V
    .locals 0

    iput p1, p0, Landroidx/leanback/widget/a0$a;->g:I

    return-void
.end method
