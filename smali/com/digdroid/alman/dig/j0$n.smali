.class Lcom/digdroid/alman/dig/j0$n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0;->H2(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$n;->a:Lcom/digdroid/alman/dig/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$n;->a:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$n;->a:Lcom/digdroid/alman/dig/j0;

    iget-boolean v2, v1, Lcom/digdroid/alman/dig/j0;->u0:Z

    xor-int/lit8 v2, v2, 0x1

    iput-boolean v2, v1, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/j0;->r3()V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/digdroid/alman/dig/j0;->t3()V

    :goto_0
    invoke-virtual {v0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$n;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->R()V

    :cond_2
    :goto_1
    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
