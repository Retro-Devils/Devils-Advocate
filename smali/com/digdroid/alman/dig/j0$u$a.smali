.class Lcom/digdroid/alman/dig/j0$u$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0$u;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/j0$u;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0$u;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$u$a;->a:Lcom/digdroid/alman/dig/j0$u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$u$a;->a:Lcom/digdroid/alman/dig/j0$u;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0$u;->b:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/digdroid/alman/dig/m0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$u$a;->a:Lcom/digdroid/alman/dig/j0$u;

    iget-object v1, v1, Lcom/digdroid/alman/dig/j0$u;->b:Lcom/digdroid/alman/dig/j0;

    iget-wide v3, v1, Lcom/digdroid/alman/dig/j0;->q0:J

    new-instance v5, Lcom/digdroid/alman/dig/j0$u$a$a;

    invoke-direct {v5, p0}, Lcom/digdroid/alman/dig/j0$u$a$a;-><init>(Lcom/digdroid/alman/dig/j0$u$a;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$u$a;->a:Lcom/digdroid/alman/dig/j0$u;

    iget-object v1, v1, Lcom/digdroid/alman/dig/j0$u;->b:Lcom/digdroid/alman/dig/j0;

    iget-object v6, v1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/digdroid/alman/dig/m0;-><init>(Landroid/app/Activity;JLcom/digdroid/alman/dig/m0$p;Lcom/digdroid/alman/dig/p1$a;)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/m0;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
