.class Lcom/digdroid/alman/dig/p2$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/p2;->f(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/view/MenuItem;

.field final synthetic c:Lcom/digdroid/alman/dig/p2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/p2;Landroid/view/MenuItem;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/p2$i;->b:Landroid/view/MenuItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/p2$i;->b:Landroid/view/MenuItem;

    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    const v2, 0x7f090385

    if-eq v1, v2, :cond_2

    const/4 v2, 0x0

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    goto/16 :goto_2

    :pswitch_0
    instance-of v1, v0, Lcom/digdroid/alman/dig/j0;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/digdroid/alman/dig/j0;

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "https://www.youtube.com/results?search_query="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/j0;->o3()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    iget-object v3, v3, Lcom/digdroid/alman/dig/t;->y:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/j0;->n3()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/digdroid/alman/dig/h3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "utf-8"

    invoke-static {v0, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :pswitch_1
    instance-of v1, v0, Lcom/digdroid/alman/dig/j0;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/digdroid/alman/dig/j0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/j0;->m3()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/e0;->s1(J)V

    goto/16 :goto_2

    :pswitch_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/v3;->x1()V

    goto/16 :goto_2

    :pswitch_3
    instance-of v0, v0, Lcom/digdroid/alman/dig/l3;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e0;->p()V

    goto/16 :goto_2

    :pswitch_4
    instance-of v1, v0, Lcom/digdroid/alman/dig/g3;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    check-cast v0, Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/g3;->K3()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/e0;->t1(Ljava/lang/String;)V

    goto/16 :goto_2

    :pswitch_5
    instance-of v1, v0, Lcom/digdroid/alman/dig/j0;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/digdroid/alman/dig/j0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/j0;->n3()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/e0;->V(Ljava/lang/String;)V

    goto/16 :goto_2

    :pswitch_6
    instance-of v1, v0, Lcom/digdroid/alman/dig/t0;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/digdroid/alman/dig/t0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/t0;->c3()V

    goto/16 :goto_2

    :pswitch_7
    instance-of v1, v0, Lcom/digdroid/alman/dig/t0;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/digdroid/alman/dig/t0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/t0;->G3()V

    goto/16 :goto_2

    :pswitch_8
    instance-of v1, v0, Lcom/digdroid/alman/dig/r1;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/digdroid/alman/dig/r1;

    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    const/16 v3, 0x11

    new-instance v4, Lcom/digdroid/alman/dig/p2$i$a;

    invoke-direct {v4, p0, v0}, Lcom/digdroid/alman/dig/p2$i$a;-><init>(Lcom/digdroid/alman/dig/p2$i;Lcom/digdroid/alman/dig/r1;)V

    invoke-virtual {v1, v2, v3, v4}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$s;)V

    goto/16 :goto_2

    :pswitch_9
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/p2;->W1()V

    goto/16 :goto_2

    :pswitch_a
    instance-of v1, v0, Lcom/digdroid/alman/dig/j0;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/digdroid/alman/dig/j0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/j0;->l3()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    :pswitch_b
    instance-of v0, v0, Lcom/digdroid/alman/dig/t2;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e0;->b0()V

    goto/16 :goto_2

    :pswitch_c
    instance-of v0, v0, Lcom/digdroid/alman/dig/r2;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/c3;->t()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e0;->F()V

    goto/16 :goto_2

    :pswitch_d
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/c3;->t()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    const/16 v2, 0x13

    new-instance v3, Lcom/digdroid/alman/dig/p2$i$b;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/p2$i$b;-><init>(Lcom/digdroid/alman/dig/p2$i;)V

    invoke-virtual {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$s;)V

    goto/16 :goto_2

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v0, v2}, Lcom/digdroid/alman/dig/c3;->T(Z)V

    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/a4;->u(Landroid/app/Activity;)V

    goto/16 :goto_2

    :pswitch_e
    instance-of v0, v0, Lcom/digdroid/alman/dig/s1;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/e0;->X:Lcom/digdroid/alman/dig/MyViewPager;

    invoke-virtual {v0, v2}, Lb/t/a/b;->setCurrentItem(I)V

    goto/16 :goto_2

    :pswitch_f
    instance-of v0, v0, Lcom/digdroid/alman/dig/k1;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e0;->h0()V

    goto :goto_2

    :pswitch_10
    instance-of v1, v0, Lcom/digdroid/alman/dig/j0;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    check-cast v0, Lcom/digdroid/alman/dig/j0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/j0;->i3()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/e0;->o0(J)V

    goto :goto_2

    :pswitch_11
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    const-string v1, "https://digdroid.com/forums/categories/dig-general-discussions"

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/e0;->z(Ljava/lang/String;)V

    goto :goto_2

    :pswitch_12
    instance-of v0, v0, Lcom/digdroid/alman/dig/c0;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e0;->u()V

    goto :goto_2

    :pswitch_13
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/p2;->S1()V

    goto :goto_2

    :pswitch_14
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/p2;->Q1()V

    goto :goto_2

    :pswitch_15
    instance-of v1, v0, Lcom/digdroid/alman/dig/j0;

    if-eqz v1, :cond_3

    check-cast v0, Lcom/digdroid/alman/dig/j0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/j0;->h3()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/e0;->p1(Ljava/lang/String;)V

    goto :goto_2

    :pswitch_16
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e0;->d0()V

    goto :goto_2

    :pswitch_17
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e0;->n1()V

    goto :goto_2

    :pswitch_18
    instance-of v0, v0, Lcom/digdroid/alman/dig/b;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e0;->L()V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v1, "show_foreground"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v3

    xor-int/2addr v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    goto/16 :goto_0

    :catch_0
    :cond_3
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7f0902b3
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7f0902cb
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
