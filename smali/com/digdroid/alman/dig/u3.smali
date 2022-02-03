.class public abstract Lcom/digdroid/alman/dig/u3;
.super Lcom/digdroid/alman/dig/e0;
.source ""


# static fields
.field static final b0:[Ljava/lang/String;

.field static final c0:[I

.field static final d0:[I


# instance fields
.field e0:Landroid/widget/LinearLayout;

.field f0:Landroid/widget/LinearLayout;

.field g0:[Z

.field h0:[Z

.field i0:[Z

.field j0:[Z

.field k0:Z

.field l0:Z

.field m0:[Landroid/widget/ImageView;

.field n0:Landroid/widget/ImageView;

.field o0:Landroid/widget/ImageView;

.field p0:I

.field q0:I

.field r0:Landroidx/appcompat/widget/Toolbar;

.field s0:Landroid/os/Handler;

.field t0:Ljava/lang/String;

.field u0:Z

.field v0:Z

.field w0:Z

.field x0:Z

.field y0:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x13

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "back"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "home"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "mainmenu"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "voice"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string v3, "info"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const-string v3, "systems"

    aput-object v3, v1, v2

    const/4 v2, 0x6

    const-string v3, "genres"

    aput-object v3, v1, v2

    const/4 v2, 0x7

    const-string v3, "collections"

    aput-object v3, v1, v2

    const/16 v2, 0x8

    const-string v3, "faves"

    aput-object v3, v1, v2

    const/16 v2, 0x9

    const-string v3, "played"

    aput-object v3, v1, v2

    const/16 v2, 0xa

    const-string v3, "allgames"

    aput-object v3, v1, v2

    const/16 v2, 0xb

    const-string v3, "options"

    aput-object v3, v1, v2

    const/16 v2, 0xc

    const-string v3, "search"

    aput-object v3, v1, v2

    const/16 v2, 0xd

    const-string v3, "sort"

    aput-object v3, v1, v2

    const/16 v2, 0xe

    const-string v3, "random"

    aput-object v3, v1, v2

    const/16 v2, 0xf

    const-string v3, "pagemenu"

    aput-object v3, v1, v2

    const/16 v2, 0x10

    const-string v3, "mediapause"

    aput-object v3, v1, v2

    const/16 v2, 0x11

    const-string v3, "mediaplay"

    aput-object v3, v1, v2

    const/16 v2, 0x12

    const-string v3, "medianext"

    aput-object v3, v1, v2

    sput-object v1, Lcom/digdroid/alman/dig/u3;->b0:[Ljava/lang/String;

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lcom/digdroid/alman/dig/u3;->c0:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/digdroid/alman/dig/u3;->d0:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7f110045
        0x7f110118
        0x7f110174
        0x7f11028e
        0x7f110129
        0x7f110263
        0x7f110105
        0x7f110071
        0x7f1100e8
        0x7f1101f3
        0x7f110022
        0x7f1101dc
        0x7f110228
        0x7f110251
        0x7f110236
        0x7f1101e6
        0x7f110183
        0x7f110184
        0x7f110182
    .end array-data

    :array_1
    .array-data 4
        0x1
        0x10
        0x4
        0x3
        0x1a
        0x11
        0x12
        0x1c
        0x13
        0x17
        0x14
        0x15
        0x1b
        0xf
        0x19
        0x5
        0x1d
        0x1e
        0x1f
    .end array-data
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/digdroid/alman/dig/e0;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/u3;->e0:Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/digdroid/alman/dig/u3;->f0:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    iput v0, p0, Lcom/digdroid/alman/dig/u3;->p0:I

    const/4 v1, -0x1

    iput v1, p0, Lcom/digdroid/alman/dig/u3;->q0:I

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iput-object v1, p0, Lcom/digdroid/alman/dig/u3;->s0:Landroid/os/Handler;

    const-string v1, ""

    iput-object v1, p0, Lcom/digdroid/alman/dig/u3;->t0:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/u3;->u0:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/u3;->v0:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/u3;->w0:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/u3;->x0:Z

    iput-object v1, p0, Lcom/digdroid/alman/dig/u3;->y0:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method abstract A1()Z
.end method

.method abstract B1()Z
.end method

.method abstract C1()Z
.end method

.method D1(Ljava/lang/String;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V
    .locals 3

    const-string v0, "icons_top"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    const-string v0, "icons_bottom"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    const/16 v0, 0x8

    if-eqz p1, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    const/16 v2, 0x8

    :goto_2
    invoke-virtual {p3, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    if-eqz p1, :cond_3

    const/4 p3, 0x0

    goto :goto_3

    :cond_3
    const/16 p3, 0x8

    :goto_3
    invoke-virtual {p2, p3}, Landroid/view/View;->setVisibility(I)V

    if-eqz p1, :cond_4

    goto :goto_4

    :cond_4
    const/16 v1, 0x8

    :goto_4
    invoke-virtual {p4, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method abstract E1(Z)V
.end method

.method F1(Ljava/lang/String;Z)V
    .locals 2

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->k1()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->i1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    if-nez p1, :cond_2

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/p1;->w2()Ljava/lang/String;

    move-result-object p1

    :cond_2
    if-nez p2, :cond_3

    iget-object p2, p0, Lcom/digdroid/alman/dig/u3;->y0:Ljava/lang/String;

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/u3;->y1(Ljava/lang/String;)V

    return-void

    :cond_3
    iput-object p1, p0, Lcom/digdroid/alman/dig/u3;->y0:Ljava/lang/String;

    iget-object p2, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    iput-object p1, p2, Lcom/digdroid/alman/dig/b3;->j:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const/4 p2, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "default"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 p2, 0x3

    goto :goto_0

    :sswitch_1
    const-string v0, "icons_bottom"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 p2, 0x2

    goto :goto_0

    :sswitch_2
    const-string v0, "none"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 p2, 0x1

    goto :goto_0

    :sswitch_3
    const-string v0, "icons_top"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_0

    :cond_7
    const/4 p2, 0x0

    :goto_0
    const/16 v0, 0x8

    packed-switch p2, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/u3;->r0:Landroidx/appcompat/widget/Toolbar;

    if-eqz p2, :cond_8

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_8
    iget-object p2, p0, Lcom/digdroid/alman/dig/u3;->e0:Landroid/widget/LinearLayout;

    if-eqz p2, :cond_9

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_9
    iget-object p2, p0, Lcom/digdroid/alman/dig/u3;->f0:Landroid/widget/LinearLayout;

    if-eqz p2, :cond_f

    goto :goto_1

    :pswitch_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/u3;->r0:Landroidx/appcompat/widget/Toolbar;

    if-eqz p2, :cond_a

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_a
    iget-object p2, p0, Lcom/digdroid/alman/dig/u3;->e0:Landroid/widget/LinearLayout;

    if-eqz p2, :cond_b

    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_b
    iget-object p2, p0, Lcom/digdroid/alman/dig/u3;->f0:Landroid/widget/LinearLayout;

    if-eqz p2, :cond_f

    :goto_1
    invoke-virtual {p2, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_3

    :pswitch_2
    iget-object p2, p0, Lcom/digdroid/alman/dig/u3;->r0:Landroidx/appcompat/widget/Toolbar;

    if-eqz p2, :cond_c

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_c
    iget-object p2, p0, Lcom/digdroid/alman/dig/u3;->e0:Landroid/widget/LinearLayout;

    if-nez p2, :cond_d

    const p2, 0x7f090211

    invoke-virtual {p0, p2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/digdroid/alman/dig/u3;->e0:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/u3;->w1()V

    goto :goto_2

    :cond_d
    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :goto_2
    iget-object p2, p0, Lcom/digdroid/alman/dig/u3;->f0:Landroid/widget/LinearLayout;

    if-nez p2, :cond_e

    const p2, 0x7f0902dc

    invoke-virtual {p0, p2}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    iput-object p2, p0, Lcom/digdroid/alman/dig/u3;->f0:Landroid/widget/LinearLayout;

    :cond_e
    iget-object p2, p0, Lcom/digdroid/alman/dig/u3;->f0:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    move-object p2, p0

    check-cast p2, Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {p2}, Lcom/digdroid/alman/dig/y3;->A(Lcom/digdroid/alman/dig/MainActivity;)I

    move-result p2

    invoke-virtual {p0, p2}, Lcom/digdroid/alman/dig/u3;->G1(I)V

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/u3;->y1(Ljava/lang/String;)V

    :cond_f
    :goto_3
    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/u3;->y1(Ljava/lang/String;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x51cfd950 -> :sswitch_3
        0x33af38 -> :sswitch_2
        0x56b272f0 -> :sswitch_1
        0x5c13d641 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method G1(I)V
    .locals 6

    const v0, 0x7f09026b

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/u3;->y0:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    const-string v4, "icons_top"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v1, "icons_bottom"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v1

    const v2, 0x7f0902fc

    if-eq v1, v2, :cond_2

    iget-object v1, p0, Lcom/digdroid/alman/dig/u3;->e0:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/u3;->e0:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    const v3, 0x7f090211

    if-eq v2, v3, :cond_2

    iget-object v2, p0, Lcom/digdroid/alman/dig/u3;->e0:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/u3;->e0:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->e0:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    iget-object v1, p0, Lcom/digdroid/alman/dig/u3;->e0:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->f0:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v1, p0, Lcom/digdroid/alman/dig/u3;->y0:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x30

    goto :goto_1

    :cond_3
    const/16 v1, 0x50

    :goto_1
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3;->f0:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public H1(ZZ)Z
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->f0:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->y0:Ljava/lang/String;

    const-string v2, "icons_top"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->y0:Ljava/lang/String;

    const-string v2, "icons_bottom"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/u3;->l0:Z

    if-eqz p1, :cond_2

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->o0:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/digdroid/alman/dig/u3;->f0:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->o0:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    iget-object v2, p0, Lcom/digdroid/alman/dig/u3;->f0:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    :cond_3
    :goto_0
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/u3;->l0:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/b3;->v()Z

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_5

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/u3;->k0:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3;->n0:Landroid/widget/ImageView;

    if-eqz p1, :cond_4

    iget-object p2, p0, Lcom/digdroid/alman/dig/u3;->f0:Landroid/widget/LinearLayout;

    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    :cond_4
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/u3;->k0:Z

    goto :goto_2

    :cond_5
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/u3;->k0:Z

    if-nez p1, :cond_6

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3;->n0:Landroid/widget/ImageView;

    if-eqz p1, :cond_6

    iget-object v1, p0, Lcom/digdroid/alman/dig/u3;->f0:Landroid/widget/LinearLayout;

    invoke-virtual {v1, p1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    :cond_6
    iget-object p1, p0, Lcom/digdroid/alman/dig/u3;->n0:Landroid/widget/ImageView;

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f070098

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->w()I

    move-result v2

    if-eqz p2, :cond_7

    sget-object p2, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    :cond_7
    sget-object p2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    :goto_1
    invoke-direct {v1, v2, p2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/u3;->n0:Landroid/widget/ImageView;

    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_8
    iput-boolean v0, p0, Lcom/digdroid/alman/dig/u3;->k0:Z

    :goto_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/u3;->f0:Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/widget/LinearLayout;->postInvalidate()V

    return v0
.end method

.method public I()Landroid/view/View;
    .locals 2

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->i1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/p1;->w2()Ljava/lang/String;

    move-result-object v0

    const-string v1, "default"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->e0:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->r0:Landroidx/appcompat/widget/Toolbar;

    return-object v0
.end method

.method public I1()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->o()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iget-object v3, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v3}, Lcom/digdroid/alman/dig/b3;->v()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-boolean v3, p0, Lcom/digdroid/alman/dig/u3;->w0:Z

    if-eqz v3, :cond_2

    const/4 v1, 0x1

    :cond_2
    iget-boolean v2, p0, Lcom/digdroid/alman/dig/u3;->w0:Z

    invoke-virtual {p0, v0, v2}, Lcom/digdroid/alman/dig/u3;->H1(ZZ)Z

    move-result v2

    if-nez v2, :cond_5

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/e0;->T:Z

    if-nez v2, :cond_3

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/u3;->u0:Z

    if-ne v0, v2, :cond_4

    :cond_3
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/u3;->v0:Z

    if-eq v1, v0, :cond_5

    :cond_4
    invoke-virtual {p0}, Landroidx/appcompat/app/c;->invalidateOptionsMenu()V

    :cond_5
    return-void
.end method

.method abstract J1()V
.end method

.method public W(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->t0:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iput-object p1, p0, Lcom/digdroid/alman/dig/u3;->t0:Ljava/lang/String;

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->r0:Landroidx/appcompat/widget/Toolbar;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/e0;->T:Z

    if-nez p1, :cond_1

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->J0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method public e()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->y0:Ljava/lang/String;

    const-string v1, "icons_top"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->y0:Ljava/lang/String;

    const-string v1, "icons_bottom"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->e0:Landroid/widget/LinearLayout;

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/u3;->E1(Z)V

    iget v0, p0, Lcom/digdroid/alman/dig/u3;->p0:I

    if-ltz v0, :cond_3

    iget-object v1, p0, Lcom/digdroid/alman/dig/u3;->g0:[Z

    array-length v2, v1

    if-ge v0, v2, :cond_3

    aget-boolean v1, v1, v0

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/digdroid/alman/dig/u3;->m0:[Landroid/widget/ImageView;

    aget-object v0, v1, v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/widget/ImageView;->requestFocus()Z

    :cond_2
    return-void

    :cond_3
    const/4 v0, -0x1

    iput v0, p0, Lcom/digdroid/alman/dig/u3;->p0:I

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/u3;->g0:[Z

    array-length v2, v1

    if-ge v0, v2, :cond_6

    aget-boolean v1, v1, v0

    if-eqz v1, :cond_5

    iput v0, p0, Lcom/digdroid/alman/dig/u3;->p0:I

    iget-object v1, p0, Lcom/digdroid/alman/dig/u3;->m0:[Landroid/widget/ImageView;

    aget-object v0, v1, v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/widget/ImageView;->requestFocus()Z

    :cond_4
    return-void

    :cond_5
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method public j1()Landroidx/appcompat/widget/Toolbar;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->r0:Landroidx/appcompat/widget/Toolbar;

    return-object v0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 6

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/e0;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f09040a

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/Toolbar;

    iput-object p1, p0, Lcom/digdroid/alman/dig/u3;->r0:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->S0(Landroidx/appcompat/widget/Toolbar;)V

    sget-object p1, Lcom/digdroid/alman/dig/u3;->b0:[Ljava/lang/String;

    array-length v0, p1

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/digdroid/alman/dig/u3;->g0:[Z

    array-length v0, p1

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/digdroid/alman/dig/u3;->h0:[Z

    array-length v0, p1

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/digdroid/alman/dig/u3;->i0:[Z

    array-length v0, p1

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/digdroid/alman/dig/u3;->j0:[Z

    array-length p1, p1

    new-array p1, p1, [Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/digdroid/alman/dig/u3;->m0:[Landroid/widget/ImageView;

    const/4 p1, 0x0

    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lcom/digdroid/alman/dig/u3;->b0:[Ljava/lang/String;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lcom/digdroid/alman/dig/u3;->i0:[Z

    iget-object v3, p0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "icon_"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v1, v1, v0

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_enabled"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    invoke-virtual {v3, v1, v4}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v1

    aput-boolean v1, v2, v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/u3;->j0:[Z

    aput-boolean p1, v1, v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/u3;->m0:[Landroid/widget/ImageView;

    const/4 v2, 0x0

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Lcom/digdroid/alman/dig/e0;->onPause()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->s0:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method protected onResume()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/d;->onResume()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->s0:Landroid/os/Handler;

    new-instance v1, Lcom/digdroid/alman/dig/u3$k;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/u3$k;-><init>(Lcom/digdroid/alman/dig/u3;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method u1()V
    .locals 5

    sget-object v0, Lcom/digdroid/alman/dig/u3;->c0:[I

    array-length v0, v0

    new-array v1, v0, [Ljava/lang/String;

    new-array v2, v0, [Z

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    sget-object v4, Lcom/digdroid/alman/dig/u3;->c0:[I

    aget v4, v4, v3

    invoke-virtual {p0, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    iget-object v4, p0, Lcom/digdroid/alman/dig/u3;->i0:[Z

    aget-boolean v4, v4, v3

    aput-boolean v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance v3, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v4

    invoke-direct {v3, p0, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    new-instance v4, Lcom/digdroid/alman/dig/u3$m;

    invoke-direct {v4, p0, v2}, Lcom/digdroid/alman/dig/u3$m;-><init>(Lcom/digdroid/alman/dig/u3;[Z)V

    invoke-virtual {v3, v1, v2, v4}, Landroidx/appcompat/app/b$a;->k([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)Landroidx/appcompat/app/b$a;

    const v1, 0x7f1101d8

    new-instance v4, Lcom/digdroid/alman/dig/u3$n;

    invoke-direct {v4, p0, v0, v2}, Lcom/digdroid/alman/dig/u3$n;-><init>(Lcom/digdroid/alman/dig/u3;I[Z)V

    invoke-virtual {v3, v1, v4}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    const v0, 0x7f11005a

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    invoke-virtual {v3}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public declared-synchronized v(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/u3;->F1(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method v1()V
    .locals 14

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->i1()Lcom/digdroid/alman/dig/p1;

    move-result-object v6

    if-nez v6, :cond_0

    return-void

    :cond_0
    invoke-virtual {v6}, Lcom/digdroid/alman/dig/p1;->w2()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0031

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v8

    const v0, 0x7f090101

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    const v0, 0x7f090336

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    const v0, 0x7f090206

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    new-instance v1, Lcom/digdroid/alman/dig/u3$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/u3$a;-><init>(Lcom/digdroid/alman/dig/u3;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f090205

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    new-instance v1, Lcom/digdroid/alman/dig/u3$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/u3$b;-><init>(Lcom/digdroid/alman/dig/u3;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0903aa

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    const v0, 0x7f0903ac

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    new-instance v1, Lcom/digdroid/alman/dig/u3$c;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/u3$c;-><init>(Lcom/digdroid/alman/dig/u3;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0903ab

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    new-instance v1, Lcom/digdroid/alman/dig/u3$d;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/u3$d;-><init>(Lcom/digdroid/alman/dig/u3;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0902f5

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    const v0, 0x7f0902f8

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    new-instance v1, Lcom/digdroid/alman/dig/u3$e;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/u3$e;-><init>(Lcom/digdroid/alman/dig/u3;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0902f6

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    new-instance v1, Lcom/digdroid/alman/dig/u3$f;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/u3$f;-><init>(Lcom/digdroid/alman/dig/u3;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f09020f

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/LinearLayout;

    const v0, 0x7f090167

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    const v0, 0x7f0902f9

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/LinearLayout;

    invoke-virtual {p0, v7, v10, v9, v11}, Lcom/digdroid/alman/dig/u3;->D1(Ljava/lang/String;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V

    const v0, 0x7f0902d5

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/RadioButton;

    invoke-static {v12}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    const-string v0, "none"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    new-instance v13, Lcom/digdroid/alman/dig/u3$g;

    move-object v0, v13

    move-object v1, p0

    move-object v2, v6

    move-object v3, v10

    move-object v4, v9

    move-object v5, v11

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/u3$g;-><init>(Lcom/digdroid/alman/dig/u3;Lcom/digdroid/alman/dig/p1;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V

    invoke-virtual {v12, v13}, Landroid/widget/RadioButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f090140

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/RadioButton;

    invoke-static {v12}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    const-string v0, "default"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    new-instance v13, Lcom/digdroid/alman/dig/u3$h;

    move-object v0, v13

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/u3$h;-><init>(Lcom/digdroid/alman/dig/u3;Lcom/digdroid/alman/dig/p1;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V

    invoke-virtual {v12, v13}, Landroid/widget/RadioButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f090211

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/RadioButton;

    invoke-static {v12}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    const-string v0, "icons_top"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    new-instance v13, Lcom/digdroid/alman/dig/u3$i;

    move-object v0, v13

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/u3$i;-><init>(Lcom/digdroid/alman/dig/u3;Lcom/digdroid/alman/dig/p1;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V

    invoke-virtual {v12, v13}, Landroid/widget/RadioButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f09020e

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/RadioButton;

    invoke-static {v12}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    const-string v0, "icons_bottom"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v12, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    new-instance v7, Lcom/digdroid/alman/dig/u3$j;

    move-object v0, v7

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/u3$j;-><init>(Lcom/digdroid/alman/dig/u3;Lcom/digdroid/alman/dig/p1;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V

    invoke-virtual {v12, v7}, Landroid/widget/RadioButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {v0, p0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v8}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f1101d8

    new-instance v2, Lcom/digdroid/alman/dig/u3$l;

    invoke-direct {v2, p0, v6}, Lcom/digdroid/alman/dig/u3$l;-><init>(Lcom/digdroid/alman/dig/u3;Lcom/digdroid/alman/dig/p1;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method w1()V
    .locals 8

    sget-object v0, Lcom/digdroid/alman/dig/p3;->a:Lcom/digdroid/alman/dig/s3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s3;->s:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/digdroid/alman/dig/p3;->a:Lcom/digdroid/alman/dig/s3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/s3;->s:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    sget-object v4, Lcom/digdroid/alman/dig/u3;->b0:[Ljava/lang/String;

    array-length v5, v4

    const/4 v6, 0x0

    if-ge v3, v5, :cond_3

    new-instance v5, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v4, v4, v3

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".png"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v0, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_2

    const v4, 0x7f0c0100

    invoke-virtual {v1, v4, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iget-object v5, p0, Lcom/digdroid/alman/dig/u3;->m0:[Landroid/widget/ImageView;

    aput-object v4, v5, v3

    sget-object v5, Lcom/digdroid/alman/dig/u3;->d0:[I

    aget v5, v5, v3

    new-instance v6, Lcom/digdroid/alman/dig/u3$o;

    invoke-direct {v6, p0, v3, v5}, Lcom/digdroid/alman/dig/u3$o;-><init>(Lcom/digdroid/alman/dig/u3;II)V

    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v5, Lcom/digdroid/alman/dig/u3$p;

    invoke-direct {v5, p0}, Lcom/digdroid/alman/dig/u3$p;-><init>(Lcom/digdroid/alman/dig/u3;)V

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    new-instance v5, Lcom/digdroid/alman/dig/u3$q;

    invoke-direct {v5, p0, v3}, Lcom/digdroid/alman/dig/u3$q;-><init>(Lcom/digdroid/alman/dig/u3;I)V

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c00c6

    invoke-virtual {v0, v1, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/u3;->n0:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f070098

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    new-instance v3, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->w()I

    move-result v4

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4, v5}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v1, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    iget-object v3, p0, Lcom/digdroid/alman/dig/u3;->n0:Landroid/widget/ImageView;

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/u3;->n0:Landroid/widget/ImageView;

    new-instance v3, Lcom/digdroid/alman/dig/u3$r;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/u3$r;-><init>(Lcom/digdroid/alman/dig/u3;)V

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/u3;->n0:Landroid/widget/ImageView;

    new-instance v3, Lcom/digdroid/alman/dig/u3$s;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/u3$s;-><init>(Lcom/digdroid/alman/dig/u3;)V

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    const v3, 0x7f0c00d4

    invoke-virtual {v1, v3, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/digdroid/alman/dig/u3;->o0:Landroid/widget/ImageView;

    const v1, 0x7f070097

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    new-instance v1, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->w()I

    move-result v3

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v3, v4}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/u3;->o0:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->o0:Landroid/widget/ImageView;

    new-instance v1, Lcom/digdroid/alman/dig/u3$t;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/u3$t;-><init>(Lcom/digdroid/alman/dig/u3;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3;->o0:Landroid/widget/ImageView;

    new-instance v1, Lcom/digdroid/alman/dig/u3$u;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/u3$u;-><init>(Lcom/digdroid/alman/dig/u3;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iput-boolean v2, p0, Lcom/digdroid/alman/dig/u3;->k0:Z

    iput-boolean v2, p0, Lcom/digdroid/alman/dig/u3;->l0:Z

    return-void
.end method

.method abstract x1(I)Z
.end method

.method public y1(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/e0;->i1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v1, "icons_top"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "icons_bottom"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/u3;->e0:Landroid/widget/LinearLayout;

    if-nez p1, :cond_2

    return-void

    :cond_2
    new-instance v1, Lcom/digdroid/alman/dig/u3$v;

    invoke-direct {v1, p0, v0}, Lcom/digdroid/alman/dig/u3$v;-><init>(Lcom/digdroid/alman/dig/u3;Lcom/digdroid/alman/dig/p1;)V

    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method abstract z1()Z
.end method
