.class Lcom/digdroid/alman/dig/t0$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/appcompat/widget/l0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t0;->f3(Landroid/view/View;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Z

.field final synthetic c:Lcom/digdroid/alman/dig/t0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t0;JZ)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t0$f;->c:Lcom/digdroid/alman/dig/t0;

    iput-wide p2, p0, Lcom/digdroid/alman/dig/t0$f;->a:J

    iput-boolean p4, p0, Lcom/digdroid/alman/dig/t0$f;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 16

    move-object/from16 v0, p0

    invoke-interface/range {p1 .. p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    const/4 v2, 0x1

    const v3, 0x7f0900a6

    if-ne v1, v3, :cond_0

    iget-object v1, v0, Lcom/digdroid/alman/dig/t0$f;->c:Lcom/digdroid/alman/dig/t0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    invoke-static {v1}, Lcom/digdroid/alman/dig/t1;->p(Landroid/content/Context;)Lcom/digdroid/alman/dig/t1;

    move-result-object v3

    iget-object v1, v0, Lcom/digdroid/alman/dig/t0$f;->c:Lcom/digdroid/alman/dig/t0;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v4

    iget-object v5, v0, Lcom/digdroid/alman/dig/t0$f;->c:Lcom/digdroid/alman/dig/t0;

    iget-wide v6, v0, Lcom/digdroid/alman/dig/t0$f;->a:J

    iget-boolean v8, v0, Lcom/digdroid/alman/dig/t0$f;->b:Z

    new-instance v9, Lcom/digdroid/alman/dig/t0$f$a;

    invoke-direct {v9, v0}, Lcom/digdroid/alman/dig/t0$f$a;-><init>(Lcom/digdroid/alman/dig/t0$f;)V

    invoke-virtual/range {v3 .. v9}, Lcom/digdroid/alman/dig/t1;->k(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JZLcom/digdroid/alman/dig/t1$l;)V

    return v2

    :cond_0
    invoke-interface/range {p1 .. p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    const v3, 0x7f090352

    if-ne v1, v3, :cond_1

    iget-object v1, v0, Lcom/digdroid/alman/dig/t0$f;->c:Lcom/digdroid/alman/dig/t0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    invoke-static {v1}, Lcom/digdroid/alman/dig/t1;->p(Landroid/content/Context;)Lcom/digdroid/alman/dig/t1;

    move-result-object v3

    iget-object v1, v0, Lcom/digdroid/alman/dig/t0$f;->c:Lcom/digdroid/alman/dig/t0;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v4

    iget-object v5, v0, Lcom/digdroid/alman/dig/t0$f;->c:Lcom/digdroid/alman/dig/t0;

    iget-wide v6, v0, Lcom/digdroid/alman/dig/t0$f;->a:J

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/t0$f;->b:Z

    xor-int/lit8 v8, v1, 0x1

    new-instance v9, Lcom/digdroid/alman/dig/t0$f$b;

    invoke-direct {v9, v0}, Lcom/digdroid/alman/dig/t0$f$b;-><init>(Lcom/digdroid/alman/dig/t0$f;)V

    invoke-virtual/range {v3 .. v9}, Lcom/digdroid/alman/dig/t1;->k(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JZLcom/digdroid/alman/dig/t1$l;)V

    return v2

    :cond_1
    new-instance v1, Lcom/digdroid/alman/dig/m0;

    iget-object v3, v0, Lcom/digdroid/alman/dig/t0$f;->c:Lcom/digdroid/alman/dig/t0;

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v11

    iget-wide v12, v0, Lcom/digdroid/alman/dig/t0$f;->a:J

    new-instance v14, Lcom/digdroid/alman/dig/t0$f$c;

    invoke-direct {v14, v0}, Lcom/digdroid/alman/dig/t0$f$c;-><init>(Lcom/digdroid/alman/dig/t0$f;)V

    iget-object v3, v0, Lcom/digdroid/alman/dig/t0$f;->c:Lcom/digdroid/alman/dig/t0;

    iget-object v15, v3, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    move-object v10, v1

    invoke-direct/range {v10 .. v15}, Lcom/digdroid/alman/dig/m0;-><init>(Landroid/app/Activity;JLcom/digdroid/alman/dig/m0$p;Lcom/digdroid/alman/dig/p1$a;)V

    move-object/from16 v3, p1

    invoke-virtual {v1, v3}, Lcom/digdroid/alman/dig/m0;->c(Landroid/view/MenuItem;)Z

    return v2
.end method
