.class Lcom/digdroid/alman/dig/v3$v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v3;->A1(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/p1;

.field final synthetic c:Lcom/digdroid/alman/dig/v3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v3;Lcom/digdroid/alman/dig/p1;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/v3$v;->b:Lcom/digdroid/alman/dig/p1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 13

    iget-object v0, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/c4;->g(Z)Landroid/graphics/Point;

    move-result-object v0

    iget v2, v0, Landroid/graphics/Point;->x:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float v0, v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v3, "icons_toolbar_scale"

    const/high16 v4, 0x41200000    # 10.0f

    invoke-virtual {v2, v3, v4}, Lcom/digdroid/alman/dig/c3;->f(Ljava/lang/String;F)F

    move-result v2

    div-float/2addr v0, v2

    iget-object v2, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v3, "toolbar_icon_spacing"

    const v4, 0x3da3d70a

    invoke-virtual {v2, v3, v4}, Lcom/digdroid/alman/dig/c3;->f(Ljava/lang/String;F)F

    move-result v2

    mul-float v2, v2, v0

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    const/4 v4, -0x1

    iput v4, v3, Lcom/digdroid/alman/dig/v3;->q0:I

    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_0
    sget-object v6, Lcom/digdroid/alman/dig/v3;->b0:[Ljava/lang/String;

    array-length v7, v6

    if-ge v5, v7, :cond_12

    iget-object v7, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    iget-object v8, v7, Lcom/digdroid/alman/dig/v3;->h0:[Z

    aput-boolean v3, v8, v5

    iget-object v8, v7, Lcom/digdroid/alman/dig/v3;->m0:[Landroid/widget/ImageView;

    aget-object v8, v8, v5

    if-nez v8, :cond_0

    iget-object v6, v7, Lcom/digdroid/alman/dig/v3;->g0:[Z

    aput-boolean v3, v6, v5

    goto/16 :goto_7

    :cond_0
    iget-object v7, v7, Lcom/digdroid/alman/dig/v3;->i0:[Z

    aget-boolean v7, v7, v5

    if-nez v7, :cond_2

    :cond_1
    const/4 v6, 0x0

    goto/16 :goto_4

    :cond_2
    aget-object v6, v6, v5

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    :goto_1
    const/4 v6, -0x1

    goto :goto_2

    :sswitch_0
    const-string v7, "mediaplay"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_1

    :cond_3
    const/4 v6, 0x6

    goto :goto_2

    :sswitch_1
    const-string v7, "medianext"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    const/4 v6, 0x5

    goto :goto_2

    :sswitch_2
    const-string v7, "mediapause"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_1

    :cond_5
    const/4 v6, 0x4

    goto :goto_2

    :sswitch_3
    const-string v7, "pagemenu"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_1

    :cond_6
    const/4 v6, 0x3

    goto :goto_2

    :sswitch_4
    const-string v7, "sort"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    goto :goto_1

    :cond_7
    const/4 v6, 0x2

    goto :goto_2

    :sswitch_5
    const-string v7, "search"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_1

    :cond_8
    const/4 v6, 0x1

    goto :goto_2

    :sswitch_6
    const-string v7, "random"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_1

    :cond_9
    const/4 v6, 0x0

    :goto_2
    packed-switch v6, :pswitch_data_0

    :goto_3
    const/4 v6, 0x1

    goto :goto_4

    :pswitch_0
    iget-object v6, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    invoke-virtual {v6}, Lcom/digdroid/alman/dig/v3;->D1()Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v6, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    invoke-virtual {v6}, Lcom/digdroid/alman/dig/v3;->C1()Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_3

    :pswitch_1
    iget-object v6, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    invoke-virtual {v6}, Lcom/digdroid/alman/dig/v3;->B1()Z

    move-result v6

    goto :goto_4

    :pswitch_2
    iget-object v6, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    invoke-virtual {v6}, Lcom/digdroid/alman/dig/v3;->D1()Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v6, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    invoke-virtual {v6}, Lcom/digdroid/alman/dig/v3;->C1()Z

    move-result v6

    if-nez v6, :cond_1

    goto :goto_3

    :pswitch_3
    iget-object v6, p0, Lcom/digdroid/alman/dig/v3$v;->b:Lcom/digdroid/alman/dig/p1;

    invoke-virtual {v6}, Lcom/digdroid/alman/dig/p1;->r2()I

    move-result v6

    if-ltz v6, :cond_1

    goto :goto_3

    :pswitch_4
    iget-object v6, p0, Lcom/digdroid/alman/dig/v3$v;->b:Lcom/digdroid/alman/dig/p1;

    instance-of v6, v6, Lcom/digdroid/alman/dig/t0;

    goto :goto_4

    :pswitch_5
    iget-object v6, p0, Lcom/digdroid/alman/dig/v3$v;->b:Lcom/digdroid/alman/dig/p1;

    instance-of v6, v6, Lcom/digdroid/alman/dig/r1;

    :goto_4
    if-eqz v6, :cond_c

    iget-object v7, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    iget-object v7, v7, Lcom/digdroid/alman/dig/v3;->g0:[Z

    aget-boolean v7, v7, v5

    if-nez v7, :cond_c

    add-int/lit8 v7, v5, 0x1

    :goto_5
    sget-object v9, Lcom/digdroid/alman/dig/v3;->b0:[Ljava/lang/String;

    array-length v9, v9

    if-ge v7, v9, :cond_b

    iget-object v9, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    iget-object v10, v9, Lcom/digdroid/alman/dig/v3;->g0:[Z

    aget-boolean v10, v10, v7

    if-eqz v10, :cond_a

    iget-object v10, v9, Lcom/digdroid/alman/dig/v3;->e0:Landroid/widget/LinearLayout;

    iget-object v9, v9, Lcom/digdroid/alman/dig/v3;->m0:[Landroid/widget/ImageView;

    aget-object v9, v9, v7

    invoke-virtual {v10, v9}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    iget-object v9, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    iget-object v9, v9, Lcom/digdroid/alman/dig/v3;->g0:[Z

    aput-boolean v3, v9, v7

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_b
    iget-object v7, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    iget-object v7, v7, Lcom/digdroid/alman/dig/v3;->e0:Landroid/widget/LinearLayout;

    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_6

    :cond_c
    if-nez v6, :cond_d

    iget-object v7, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    iget-object v9, v7, Lcom/digdroid/alman/dig/v3;->g0:[Z

    aget-boolean v9, v9, v5

    if-eqz v9, :cond_d

    iget-object v7, v7, Lcom/digdroid/alman/dig/v3;->e0:Landroid/widget/LinearLayout;

    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    :cond_d
    :goto_6
    iget-object v7, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    iget-object v7, v7, Lcom/digdroid/alman/dig/v3;->g0:[Z

    aput-boolean v6, v7, v5

    if-nez v6, :cond_e

    goto/16 :goto_7

    :cond_e
    invoke-virtual {v8}, Landroid/widget/ImageView;->hasFocus()Z

    move-result v6

    if-eqz v6, :cond_f

    invoke-virtual {v8}, Landroid/widget/ImageView;->clearFocus()V

    :cond_f
    iget-object v6, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    iget v7, v6, Lcom/digdroid/alman/dig/v3;->q0:I

    if-gez v7, :cond_10

    iput v5, v6, Lcom/digdroid/alman/dig/v3;->q0:I

    :cond_10
    invoke-virtual {v8}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v7

    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->height:I

    invoke-virtual {v8, v6}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v8, v2, v3, v2, v3}, Landroid/widget/ImageView;->setPadding(IIII)V

    iget-object v6, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    iget-object v6, v6, Lcom/digdroid/alman/dig/v3;->j0:[Z

    aget-boolean v6, v6, v5

    if-nez v6, :cond_11

    new-instance v6, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v9, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    iget-object v9, v9, Lcom/digdroid/alman/dig/t3;->s:Ljava/lang/String;

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "/"

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v9, Lcom/digdroid/alman/dig/v3;->b0:[Ljava/lang/String;

    aget-object v9, v9, v5

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ".png"

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object v7, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    invoke-virtual {v7}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7}, Lcom/digdroid/alman/dig/l1;->b(Landroid/content/Context;)Lcom/digdroid/alman/dig/o1;

    move-result-object v7

    invoke-virtual {v7, v6}, Lcom/digdroid/alman/dig/o1;->K(Ljava/io/File;)Lcom/digdroid/alman/dig/n1;

    move-result-object v7

    sget-object v9, Lcom/bumptech/glide/load/o/j;->b:Lcom/bumptech/glide/load/o/j;

    invoke-virtual {v7, v9}, Lcom/digdroid/alman/dig/n1;->D0(Lcom/bumptech/glide/load/o/j;)Lcom/digdroid/alman/dig/n1;

    move-result-object v7

    invoke-virtual {v7, v1}, Lcom/digdroid/alman/dig/n1;->V0(Z)Lcom/digdroid/alman/dig/n1;

    move-result-object v7

    new-instance v9, Lcom/bumptech/glide/s/d;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v11

    invoke-virtual {v10, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v11, "@"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/io/File;->lastModified()J

    move-result-wide v11

    invoke-virtual {v10, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v9, v6}, Lcom/bumptech/glide/s/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v7, v9}, Lcom/digdroid/alman/dig/n1;->T0(Lcom/bumptech/glide/load/g;)Lcom/digdroid/alman/dig/n1;

    move-result-object v6

    invoke-virtual {v6, v8}, Lcom/bumptech/glide/j;->p0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;

    iget-object v6, p0, Lcom/digdroid/alman/dig/v3$v;->c:Lcom/digdroid/alman/dig/v3;

    iget-object v6, v6, Lcom/digdroid/alman/dig/v3;->j0:[Z

    aput-boolean v1, v6, v5

    :cond_11
    :goto_7
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_12
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x37ed1b3d -> :sswitch_6
        -0x36059a58 -> :sswitch_5
        0x35f59e -> :sswitch_4
        0x3345986e -> :sswitch_3
        0x74870492 -> :sswitch_2
        0x7fa068d7 -> :sswitch_1
        0x7fa16918 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
