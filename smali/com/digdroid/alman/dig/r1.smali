.class public abstract Lcom/digdroid/alman/dig/r1;
.super Lcom/digdroid/alman/dig/p1;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/e2$s;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/r1$i;
    }
.end annotation


# instance fields
.field n0:I

.field o0:Landroid/database/Cursor;

.field p0:Lcom/digdroid/alman/dig/e2;

.field q0:Lcom/digdroid/alman/dig/d2;

.field r0:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/digdroid/alman/dig/p1;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/digdroid/alman/dig/r1;->n0:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/r1;->o0:Landroid/database/Cursor;

    iput-object v0, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    return-void
.end method


# virtual methods
.method public A(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_title_scale"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->w(Ljava/lang/String;F)V

    return-void
.end method

.method public B()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/e2;->n:Lcom/digdroid/alman/dig/j2;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput v1, v0, Lcom/digdroid/alman/dig/j2;->c:I

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/d2;->c()Landroid/database/Cursor;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/r1;->h3(Landroid/database/Cursor;)Lcom/digdroid/alman/dig/d2;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/e2;->q(Lcom/digdroid/alman/dig/d2;)V

    return-void
.end method

.method public bridge synthetic B2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->B2()Z

    move-result v0

    return v0
.end method

.method public C(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_carousel_scale"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->D(Ljava/lang/String;F)V

    return-void
.end method

.method public bridge synthetic C2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->C2()Z

    move-result v0

    return v0
.end method

.method public D()Z
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->g0()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public E()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_vertical_scale"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public bridge synthetic E2(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->E2(Z)V

    return-void
.end method

.method public F(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_list_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->w(Ljava/lang/String;F)V

    return-void
.end method

.method public bridge synthetic F2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->F2()V

    return-void
.end method

.method public G()[I
    .locals 1

    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x7f09020b
        0x7f09020b
        0x7f0901ab
        0x7f0901a9
    .end array-data
.end method

.method public bridge synthetic G2(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->G2(Z)V

    return-void
.end method

.method public H(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_vertical_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->w(Ljava/lang/String;F)V

    return-void
.end method

.method public H2(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v1, 0x1

    packed-switch v0, :pswitch_data_0

    packed-switch v0, :pswitch_data_1

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->H2(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :sswitch_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result p1

    const-string v0, "title"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :sswitch_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result p1

    const-string v0, "grid"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :sswitch_2
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->c()Z

    move-result p1

    xor-int/2addr p1, v1

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r1;->v3(Z)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :sswitch_3
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->q3()V

    return v1

    :sswitch_4
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->w()Z

    move-result p1

    xor-int/2addr p1, v1

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r1;->t3(Z)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_0
    const/high16 p1, 0x3f100000    # 0.5625f

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r1;->s3(F)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_1
    const p1, 0x3faaaaab

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r1;->s3(F)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_2
    const/high16 p1, 0x3f400000    # 0.75f

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r1;->s3(F)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_3
    const/high16 p1, 0x3fc00000    # 1.5f

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r1;->s3(F)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_4
    const p1, 0x3f2aaaab

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r1;->s3(F)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_5
    const/high16 p1, 0x40000000    # 2.0f

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r1;->s3(F)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_6
    const/high16 p1, 0x3f000000    # 0.5f

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r1;->s3(F)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_7
    const/high16 p1, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r1;->s3(F)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_8
    const p1, 0x3fe38e39

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r1;->s3(F)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_9
    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result p1

    const-string v0, "wheel"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_a
    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result p1

    const-string v0, "vertical"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_b
    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result p1

    const-string v0, "list"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_c
    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result p1

    const-string v0, "linear"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_d
    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result p1

    const-string v0, "coverflow"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    :pswitch_e
    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result p1

    const-string v0, "carousel"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x7f090073
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7f09007a
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x7f090210 -> :sswitch_4
        0x7f090336 -> :sswitch_3
        0x7f09042b -> :sswitch_2
        0x7f09043a -> :sswitch_1
        0x7f09043c -> :sswitch_0
    .end sparse-switch
.end method

.method public I(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_carousel_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->D(Ljava/lang/String;F)V

    return-void
.end method

.method public bridge synthetic I2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->I2(Ljava/lang/String;)V

    return-void
.end method

.method public J(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_title_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->w(Ljava/lang/String;F)V

    return-void
.end method

.method public bridge synthetic J2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->J2(Ljava/lang/String;)V

    return-void
.end method

.method public K(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_linear_scale"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->D(Ljava/lang/String;F)V

    return-void
.end method

.method public L()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_linear_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public M()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_wheel_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public bridge synthetic M2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->M2()Z

    move-result v0

    return v0
.end method

.method public N(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_linear_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->D(Ljava/lang/String;F)V

    return-void
.end method

.method N2()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/r1;->n3(ZLjava/util/concurrent/Callable;)V

    return-void
.end method

.method public O(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_list_scale"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->w(Ljava/lang/String;F)V

    return-void
.end method

.method public O2()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/digdroid/alman/dig/p1$a;->L(I)V

    :cond_0
    return-void
.end method

.method public P()D
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_block_size"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x432a0000    # 170.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    float-to-double v0, v0

    return-wide v0
.end method

.method public bridge synthetic P2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->P2()V

    return-void
.end method

.method public Q()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_list_type"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->j3()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic Q2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->Q2()V

    return-void
.end method

.method public R2()V
    .locals 2

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->R2()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->B()Landroid/view/Menu;

    move-result-object v0

    const v1, 0x7f0902c2

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_0
    return-void
.end method

.method public S()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_vertical_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public bridge synthetic S2(Lcom/digdroid/alman/dig/h0;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->S2(Lcom/digdroid/alman/dig/h0;)V

    return-void
.end method

.method public T(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_vertical_scale"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->w(Ljava/lang/String;F)V

    return-void
.end method

.method public bridge synthetic T0(Landroid/content/Context;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->T0(Landroid/content/Context;)V

    return-void
.end method

.method public T2()V
    .locals 3

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->B2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/d2;->b()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    iget-object v2, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/d2;->b()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/e2;->w(I)V

    :cond_0
    return-void
.end method

.method public U(D)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_block_size"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    double-to-float p1, p1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->D(Ljava/lang/String;F)V

    return-void
.end method

.method public bridge synthetic U2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->U2()V

    return-void
.end method

.method public V()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_linear_scale"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public bridge synthetic V2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->V2(Ljava/lang/String;)V

    return-void
.end method

.method public W()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_coverflow_scale"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public W0(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->W0(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Lcom/digdroid/alman/dig/r1;->n0:I

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "scroll_position"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_0
    const-string v0, "selected_item"

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/r1;->n0:I

    :cond_1
    return-void
.end method

.method public bridge synthetic W2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->W2(Ljava/lang/String;)V

    return-void
.end method

.method X2(Ljava/lang/String;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->X2(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/e2;->y(Ljava/lang/String;)V

    return-void
.end method

.method public Y2(Z)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/p1;->j0:Z

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez p1, :cond_1

    iget-boolean v3, p0, Lcom/digdroid/alman/dig/p1;->j0:Z

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->Y2(Z)V

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/r1;->n0:I

    :cond_2
    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->m()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->Q()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->g0()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestFocus()Z

    :cond_3
    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/e2;->z(Z)V

    if-eqz v2, :cond_4

    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/e2;->h()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    iget v0, p0, Lcom/digdroid/alman/dig/r1;->n0:I

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/e2;->w(I)V

    :cond_4
    return-void
.end method

.method public bridge synthetic Z0(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/digdroid/alman/dig/p1;->Z0(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    return-void
.end method

.method public a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    iget-object p3, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-interface {p3, v0}, Lcom/digdroid/alman/dig/p1$a;->E(Lcom/digdroid/alman/dig/s3;)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lcom/digdroid/alman/dig/e2;->e(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/r1;->r0:Landroid/view/View;

    new-instance p1, Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p2

    check-cast p2, Lcom/digdroid/alman/dig/MainActivity;

    iget-object p3, p0, Lcom/digdroid/alman/dig/r1;->r0:Landroid/view/View;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->m3()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, p3, v0, p0}, Lcom/digdroid/alman/dig/e2;-><init>(Lcom/digdroid/alman/dig/MainActivity;Landroid/view/View;Ljava/lang/String;Lcom/digdroid/alman/dig/e2$s;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->w2()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/e2;->y(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/p1;->K2(Landroid/view/View;)V

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    new-instance p2, Lcom/digdroid/alman/dig/r1$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/r1$a;-><init>(Lcom/digdroid/alman/dig/r1;)V

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/e2;->t(Lcom/digdroid/alman/dig/e2$v;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    new-instance p2, Lcom/digdroid/alman/dig/r1$b;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/r1$b;-><init>(Lcom/digdroid/alman/dig/r1;)V

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/e2;->u(Lcom/digdroid/alman/dig/e2$w;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->r0:Landroid/view/View;

    return-object p1
.end method

.method public bridge synthetic a3()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->a3()V

    return-void
.end method

.method public b3()Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public c()Z
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_8bit"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic c3()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->c3()V

    return-void
.end method

.method public bridge synthetic e()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->e()V

    return-void
.end method

.method e3()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/d2;->c()Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/d2;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    :cond_1
    return-void
.end method

.method abstract f3(Landroid/view/View;Ljava/lang/Object;)V
.end method

.method public g(Z)Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0, p1}, Lcom/digdroid/alman/dig/p1$a;->g(Z)Landroid/graphics/Point;

    move-result-object p1

    return-object p1
.end method

.method public g3()Z
    .locals 13

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const-string v3, "coverflow"

    const-string v4, "wheel"

    const-string v5, "title"

    const-string v6, "list"

    const-string v7, "carousel"

    const/4 v8, 0x1

    const-string v9, "linear"

    const-string v10, "vertical"

    const-string v11, "grid"

    const/4 v12, -0x1

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v12, 0x7

    goto :goto_0

    :sswitch_1
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v12, 0x6

    goto :goto_0

    :sswitch_2
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v12, 0x5

    goto :goto_0

    :sswitch_3
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v12, 0x4

    goto :goto_0

    :sswitch_4
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v12, 0x3

    goto :goto_0

    :sswitch_5
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v12, 0x2

    goto :goto_0

    :sswitch_6
    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v12, 0x1

    goto :goto_0

    :sswitch_7
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v12, 0x0

    :goto_0
    packed-switch v12, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-virtual {p0, v4, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    goto :goto_2

    :pswitch_1
    invoke-virtual {p0, v9, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    goto :goto_2

    :pswitch_2
    invoke-virtual {p0, v10, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    goto :goto_2

    :pswitch_3
    invoke-virtual {p0, v7, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    goto :goto_2

    :pswitch_4
    invoke-virtual {p0, v6, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    goto :goto_2

    :pswitch_5
    invoke-virtual {p0, v3, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    goto :goto_2

    :pswitch_6
    invoke-virtual {p0, v5, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    goto :goto_2

    :goto_1
    :pswitch_7
    invoke-virtual {p0, v11, v0}, Lcom/digdroid/alman/dig/r1;->u3(Ljava/lang/String;I)V

    :goto_2
    return v8

    :sswitch_data_0
    .sparse-switch
        -0x7643988a -> :sswitch_7
        -0x41b970db -> :sswitch_6
        0x2c6160 -> :sswitch_5
        0x308b46 -> :sswitch_4
        0x32b09e -> :sswitch_3
        0x6942258 -> :sswitch_2
        0x6bdbb5b -> :sswitch_1
        0x7608a165 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_title_scale"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method abstract h3(Landroid/database/Cursor;)Lcom/digdroid/alman/dig/d2;
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->i()V

    :cond_0
    return-void
.end method

.method abstract i3()Landroid/database/Cursor;
.end method

.method public j()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->j()V

    :cond_0
    return-void
.end method

.method abstract j3()Ljava/lang/String;
.end method

.method public k()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_list_scale"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public bridge synthetic k1(Landroid/view/MenuItem;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->k1(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public k3()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_aspect_ratio"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public bridge synthetic l()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->l()Z

    move-result v0

    return v0
.end method

.method abstract l3(Landroid/view/View;Ljava/lang/Object;)V
.end method

.method public m()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_list_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public m1()V
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->m1()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/r1;->n0:I

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->e3()V

    return-void
.end method

.method m3()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->Q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/4 v2, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "coverflow"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x5

    goto :goto_0

    :sswitch_1
    const-string v1, "wheel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x4

    goto :goto_0

    :sswitch_2
    const-string v1, "grid"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x3

    goto :goto_0

    :sswitch_3
    const-string v1, "carousel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x2

    goto :goto_0

    :sswitch_4
    const-string v1, "linear"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v2, 0x1

    goto :goto_0

    :sswitch_5
    const-string v1, "vertical"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x0

    :goto_0
    packed-switch v2, :pswitch_data_0

    const-string v0, "list"

    :pswitch_0
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7643988a -> :sswitch_5
        -0x41b970db -> :sswitch_4
        0x2c6160 -> :sswitch_3
        0x308b46 -> :sswitch_2
        0x6bdbb5b -> :sswitch_1
        0x7608a165 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method n3(ZLjava/util/concurrent/Callable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    new-instance v0, Lcom/digdroid/alman/dig/r1$i;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/digdroid/alman/dig/r1$i;-><init>(Lcom/digdroid/alman/dig/r1;ZZLjava/util/concurrent/Callable;)V

    new-array p1, v1, [Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public o()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_title_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public o3()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/r1;->p3(Z)V

    return-void
.end method

.method public p()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_coverflow_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public p2(Landroid/view/Menu;)V
    .locals 6

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->p2(Landroid/view/Menu;)V

    const v0, 0x7f090439

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/SubMenu;->clearHeader()V

    const v0, 0x7f090103

    invoke-interface {p1, v0}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/SubMenu;->clearHeader()V

    const v0, 0x7f09042b

    invoke-interface {p1, v0}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->c()Z

    move-result v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v0, 0x7f090210

    invoke-interface {p1, v0}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->w()Z

    move-result v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v0, 0x7f090083

    invoke-interface {p1, v0}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/SubMenu;->clearHeader()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v0

    const v1, 0x7f09007d

    invoke-interface {p1, v1}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    const/high16 v2, 0x40000000    # 2.0f

    sub-float v2, v0, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const v5, 0x3a83126f

    cmpg-float v2, v2, v5

    if-gez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v1, 0x7f09007a

    invoke-interface {p1, v1}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    const v2, 0x3fe38e39

    sub-float v2, v0, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v2, v2, v5

    if-gez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v1, 0x7f09007f

    invoke-interface {p1, v1}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    const/high16 v2, 0x3fc00000    # 1.5f

    sub-float v2, v0, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v2, v2, v5

    if-gez v2, :cond_2

    const/4 v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v1, 0x7f090081

    invoke-interface {p1, v1}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    const v2, 0x3faaaaab

    sub-float v2, v0, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v2, v2, v5

    if-gez v2, :cond_3

    const/4 v2, 0x1

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v1, 0x7f09007b

    invoke-interface {p1, v1}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    sub-float v2, v0, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v2, v2, v5

    if-gez v2, :cond_4

    const/4 v2, 0x1

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v1, 0x7f090080

    invoke-interface {p1, v1}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    const/high16 v2, 0x3f400000    # 0.75f

    sub-float v2, v0, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v2, v2, v5

    if-gez v2, :cond_5

    const/4 v2, 0x1

    goto :goto_5

    :cond_5
    const/4 v2, 0x0

    :goto_5
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v1, 0x7f09007e

    invoke-interface {p1, v1}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    const v2, 0x3f2aaaab

    sub-float v2, v0, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v2, v2, v5

    if-gez v2, :cond_6

    const/4 v2, 0x1

    goto :goto_6

    :cond_6
    const/4 v2, 0x0

    :goto_6
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v1, 0x7f090082

    invoke-interface {p1, v1}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    const/high16 v2, 0x3f100000    # 0.5625f

    sub-float v2, v0, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpg-float v2, v2, v5

    if-gez v2, :cond_7

    const/4 v2, 0x1

    goto :goto_7

    :cond_7
    const/4 v2, 0x0

    :goto_7
    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v1, 0x7f09007c

    invoke-interface {p1, v1}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    const/high16 v1, 0x3f000000    # 0.5f

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v5

    if-gez v0, :cond_8

    goto :goto_8

    :cond_8
    const/4 v3, 0x0

    :goto_8
    invoke-interface {p1, v3}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    return-void
.end method

.method public p3(Z)V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Lcom/digdroid/alman/dig/r1;->n0:I

    new-instance v1, Lcom/digdroid/alman/dig/r1$i;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, p0, v2, p1, v3}, Lcom/digdroid/alman/dig/r1$i;-><init>(Lcom/digdroid/alman/dig/r1;ZZLjava/util/concurrent/Callable;)V

    new-array p1, v0, [Ljava/lang/String;

    invoke-virtual {v1, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method public q(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_wheel_scale"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->D(Ljava/lang/String;F)V

    return-void
.end method

.method public q2()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/e2;->w(I)V

    :cond_0
    return-void
.end method

.method q3()V
    .locals 4

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Lcom/digdroid/alman/dig/p1$a;->H(Z)V

    const v1, 0x7f090338

    invoke-virtual {v0, v1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v1, 0x7f090205

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    new-instance v2, Lcom/digdroid/alman/dig/r1$d;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/r1$d;-><init>(Lcom/digdroid/alman/dig/r1;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/high16 v2, -0x40000000    # -2.0f

    invoke-static {v1, v2}, Lcom/digdroid/alman/dig/p3;->r(Landroid/view/View;I)V

    invoke-virtual {v1}, Landroid/widget/TextView;->requestFocus()Z

    const v1, 0x7f090206

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    new-instance v3, Lcom/digdroid/alman/dig/r1$e;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/r1$e;-><init>(Lcom/digdroid/alman/dig/r1;)V

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v1, v2}, Lcom/digdroid/alman/dig/p3;->r(Landroid/view/View;I)V

    const v1, 0x7f090431

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    new-instance v3, Lcom/digdroid/alman/dig/r1$f;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/r1$f;-><init>(Lcom/digdroid/alman/dig/r1;)V

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v1, v2}, Lcom/digdroid/alman/dig/p3;->r(Landroid/view/View;I)V

    const v1, 0x7f090432

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    new-instance v3, Lcom/digdroid/alman/dig/r1$g;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/r1$g;-><init>(Lcom/digdroid/alman/dig/r1;)V

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v1, v2}, Lcom/digdroid/alman/dig/p3;->r(Landroid/view/View;I)V

    const v1, 0x7f090337

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v1, Lcom/digdroid/alman/dig/r1$h;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/r1$h;-><init>(Lcom/digdroid/alman/dig/r1;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v0, v2}, Lcom/digdroid/alman/dig/p3;->r(Landroid/view/View;I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public r(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_coverflow_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->D(Ljava/lang/String;F)V

    return-void
.end method

.method public r1()V
    .locals 4

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->r1()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/g3;->B()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/o0;->o()V

    new-instance v0, Lcom/digdroid/alman/dig/r1$c;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/r1$c;-><init>(Lcom/digdroid/alman/dig/r1;)V

    new-instance v1, Lcom/digdroid/alman/dig/r1$i;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, p0, v2, v3, v0}, Lcom/digdroid/alman/dig/r1$i;-><init>(Lcom/digdroid/alman/dig/r1;ZZLjava/util/concurrent/Callable;)V

    new-array v0, v2, [Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method declared-synchronized r3(Landroid/database/Cursor;Z)V
    .locals 1

    monitor-enter p0

    if-eqz p2, :cond_0

    :try_start_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->e3()V

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    if-nez p2, :cond_1

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r1;->h3(Landroid/database/Cursor;)Lcom/digdroid/alman/dig/d2;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0, p2}, Lcom/digdroid/alman/dig/e2;->q(Lcom/digdroid/alman/dig/d2;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/e2;->b(Landroid/database/Cursor;)V

    :goto_0
    iput-object p1, p0, Lcom/digdroid/alman/dig/r1;->o0:Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public s1(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    const-string v1, "selected_item"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->s1(Landroid/os/Bundle;)V

    return-void
.end method

.method public bridge synthetic s2()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->s2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public s3(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_aspect_ratio"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->D(Ljava/lang/String;F)V

    return-void
.end method

.method public bridge synthetic t1()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->t1()V

    return-void
.end method

.method public t3(Z)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_icons_only"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->B(Ljava/lang/String;Z)V

    return-void
.end method

.method public u(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_coverflow_scale"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->D(Ljava/lang/String;F)V

    return-void
.end method

.method public u2()J
    .locals 3

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->B2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/d2;->b()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/d2;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/d2;->c()Landroid/database/Cursor;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public u3(Ljava/lang/String;I)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_list_type"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->z(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz p1, :cond_0

    invoke-interface {p1, p2}, Lcom/digdroid/alman/dig/p1$a;->L(I)V

    :cond_0
    return-void
.end method

.method public v(F)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_wheel_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->D(Ljava/lang/String;F)V

    return-void
.end method

.method public bridge synthetic v2()Lcom/digdroid/alman/dig/s3;
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->v2()Lcom/digdroid/alman/dig/s3;

    move-result-object v0

    return-object v0
.end method

.method public v3(Z)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_8bit"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->B(Ljava/lang/String;Z)V

    return-void
.end method

.method public w()Z
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_icons_only"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public x()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_wheel_scale"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public bridge synthetic x2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->x2()Z

    move-result v0

    return v0
.end method

.method public y()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_carousel_spacing"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method

.method public y2(II)Z
    .locals 2

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->B2()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    if-eqz v0, :cond_1

    const/4 v1, 0x7

    if-ne p1, v1, :cond_0

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->g3()Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {v0, p1, p2}, Lcom/digdroid/alman/dig/e2;->g(II)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public z()F
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/p1;->t2()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_carousel_scale"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v0

    return v0
.end method
