.class Lcom/digdroid/alman/dig/n0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/n0;->r1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/n0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/n0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0901b2

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x42200000    # 40.0f

    div-float/2addr v0, v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    const v3, 0x7f0900b8

    const-string v5, "A"

    const/16 v6, 0x60

    const-string v7, "button_a_bind"

    move v4, v0

    invoke-virtual/range {v2 .. v7}, Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    const v3, 0x7f0900bb

    const-string v5, "B"

    const/16 v6, 0x61

    const-string v7, "button_b_bind"

    invoke-virtual/range {v2 .. v7}, Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    const v3, 0x7f0900d3

    const-string v5, "X"

    const/16 v6, 0x63

    const-string v7, "button_x_bind"

    invoke-virtual/range {v2 .. v7}, Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    const v3, 0x7f0900d5

    const-string v5, "Y"

    const/16 v6, 0x64

    const-string v7, "button_y_bind"

    invoke-virtual/range {v2 .. v7}, Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    const v3, 0x7f0900c6

    const-string v5, "R1"

    const/16 v6, 0x67

    const-string v7, "button_r1_bind"

    invoke-virtual/range {v2 .. v7}, Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    const v3, 0x7f0900c8

    const-string v5, "R2"

    const/16 v6, 0x69

    const-string v7, "button_r2_bind"

    invoke-virtual/range {v2 .. v7}, Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    const v3, 0x7f0900ca

    const-string v5, "RTR"

    const/16 v6, 0x3a

    const-string v7, "button_rt_bind"

    invoke-virtual/range {v2 .. v7}, Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    const v3, 0x7f0900d1

    const-string v5, "Start"

    const/16 v6, 0x6c

    const-string v7, "button_start_bind"

    invoke-virtual/range {v2 .. v7}, Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    const v3, 0x7f0900ce

    const-string v5, "Select"

    const/16 v6, 0x6d

    const-string v7, "button_select_bind"

    invoke-virtual/range {v2 .. v7}, Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    const v3, 0x7f0900bd

    const-string v5, "L1"

    const/16 v6, 0x66

    const-string v7, "button_l1_bind"

    invoke-virtual/range {v2 .. v7}, Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    const v3, 0x7f0900bf

    const-string v5, "L2"

    const/16 v6, 0x68

    const-string v7, "button_l2_bind"

    invoke-virtual/range {v2 .. v7}, Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    const v3, 0x7f0900c1

    const-string v5, "LTR"

    const/16 v6, 0x39

    const-string v7, "button_lt_bind"

    invoke-virtual/range {v2 .. v7}, Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    const v3, 0x7f0900c3

    const-string v5, "LTH"

    const/16 v6, 0x6a

    const-string v7, "button_lthumb_bind"

    invoke-virtual/range {v2 .. v7}, Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/n0$b;->b:Lcom/digdroid/alman/dig/n0;

    const v3, 0x7f0900cc

    const-string v5, "RTH"

    const/16 v6, 0x6b

    const-string v7, "button_rthumb_bind"

    invoke-virtual/range {v2 .. v7}, Lcom/digdroid/alman/dig/n0;->e3(IFLjava/lang/String;ILjava/lang/String;)V

    return-void
.end method
