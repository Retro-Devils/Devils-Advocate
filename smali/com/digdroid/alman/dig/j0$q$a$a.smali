.class Lcom/digdroid/alman/dig/j0$q$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/j0$a0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0$q$a;->onMenuItemClick(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/j0$q$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0$q$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$q$a$a;->a:Lcom/digdroid/alman/dig/j0$q$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$q$a$a;->a:Lcom/digdroid/alman/dig/j0$q$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0$q$a;->a:Lcom/digdroid/alman/dig/j0$q;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0;->T0:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$q$a$a;->a:Lcom/digdroid/alman/dig/j0$q$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0$q$a;->a:Lcom/digdroid/alman/dig/j0$q;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0;->T0:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$q$a$a;->a:Lcom/digdroid/alman/dig/j0$q$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0$q$a;->a:Lcom/digdroid/alman/dig/j0$q;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    iget-wide v1, p1, Lcom/digdroid/alman/dig/j0;->q0:J

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/o0;->c(J)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$q$a$a;->a:Lcom/digdroid/alman/dig/j0$q$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0$q$a;->a:Lcom/digdroid/alman/dig/j0$q;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$q$a$a;->a:Lcom/digdroid/alman/dig/j0$q$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0$q$a;->a:Lcom/digdroid/alman/dig/j0$q;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/digdroid/alman/dig/j0;->u0:Z

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$q$a$a;->a:Lcom/digdroid/alman/dig/j0$q$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0$q$a;->a:Lcom/digdroid/alman/dig/j0$q;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/j0;->t3()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$q$a$a;->a:Lcom/digdroid/alman/dig/j0$q$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0$q$a;->a:Lcom/digdroid/alman/dig/j0$q;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->R()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$q$a$a;->a:Lcom/digdroid/alman/dig/j0$q$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0$q$a;->a:Lcom/digdroid/alman/dig/j0$q;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/j0;->G2(Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$q$a$a;->a:Lcom/digdroid/alman/dig/j0$q$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0$q$a;->a:Lcom/digdroid/alman/dig/j0$q;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/j0;->N2()V

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    :cond_3
    :goto_1
    return-void
.end method
