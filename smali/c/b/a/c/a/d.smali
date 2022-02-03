.class public Lc/b/a/c/a/d;
.super Landroidx/fragment/app/Fragment;
.source ""

# interfaces
.implements Lc/b/a/c/a/c$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/b/a/c/a/d$b;
    }
.end annotation


# instance fields
.field private final Z:Lc/b/a/c/a/d$b;

.field private a0:Landroid/os/Bundle;

.field private b0:Lc/b/a/c/a/e;

.field private c0:Ljava/lang/String;

.field private d0:Lc/b/a/c/a/c$b;

.field private e0:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    new-instance v0, Lc/b/a/c/a/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lc/b/a/c/a/d$b;-><init>(Lc/b/a/c/a/d;Lc/b/a/c/a/d$a;)V

    iput-object v0, p0, Lc/b/a/c/a/d;->Z:Lc/b/a/c/a/d$b;

    return-void
.end method

.method private p2()V
    .locals 8

    iget-object v0, p0, Lc/b/a/c/a/d;->b0:Lc/b/a/c/a/e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lc/b/a/c/a/d;->d0:Lc/b/a/c/a/c$b;

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lc/b/a/c/a/d;->e0:Z

    invoke-virtual {v0, v1}, Lc/b/a/c/a/e;->h(Z)V

    iget-object v2, p0, Lc/b/a/c/a/d;->b0:Lc/b/a/c/a/e;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v3

    iget-object v5, p0, Lc/b/a/c/a/d;->c0:Ljava/lang/String;

    iget-object v6, p0, Lc/b/a/c/a/d;->d0:Lc/b/a/c/a/c$b;

    iget-object v7, p0, Lc/b/a/c/a/d;->a0:Landroid/os/Bundle;

    move-object v4, p0

    invoke-virtual/range {v2 .. v7}, Lc/b/a/c/a/e;->c(Landroid/app/Activity;Lc/b/a/c/a/c$d;Ljava/lang/String;Lc/b/a/c/a/c$b;Landroid/os/Bundle;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lc/b/a/c/a/d;->a0:Landroid/os/Bundle;

    iput-object v0, p0, Lc/b/a/c/a/d;->d0:Lc/b/a/c/a/c$b;

    :cond_0
    return-void
.end method

.method public static r2()Lc/b/a/c/a/d;
    .locals 1

    new-instance v0, Lc/b/a/c/a/d;

    invoke-direct {v0}, Lc/b/a/c/a/d;-><init>()V

    return-object v0
.end method


# virtual methods
.method public W0(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->W0(Landroid/os/Bundle;)V

    if-eqz p1, :cond_0

    const-string v0, "YouTubePlayerSupportFragment.KEY_PLAYER_VIEW_STATE"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lc/b/a/c/a/d;->a0:Landroid/os/Bundle;

    return-void
.end method

.method public a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    new-instance p1, Lc/b/a/c/a/e;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p2

    iget-object p3, p0, Lc/b/a/c/a/d;->Z:Lc/b/a/c/a/d$b;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p1, p2, v0, v1, p3}, Lc/b/a/c/a/e;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILc/b/a/c/a/e$d;)V

    iput-object p1, p0, Lc/b/a/c/a/d;->b0:Lc/b/a/c/a/e;

    invoke-direct {p0}, Lc/b/a/c/a/d;->p2()V

    iget-object p1, p0, Lc/b/a/c/a/d;->b0:Lc/b/a/c/a/e;

    return-object p1
.end method

.method public b1()V
    .locals 2

    iget-object v0, p0, Lc/b/a/c/a/d;->b0:Lc/b/a/c/a/e;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    iget-object v1, p0, Lc/b/a/c/a/d;->b0:Lc/b/a/c/a/e;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

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
    invoke-virtual {v1, v0}, Lc/b/a/c/a/e;->k(Z)V

    :cond_2
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->b1()V

    return-void
.end method

.method public d1()V
    .locals 2

    iget-object v0, p0, Lc/b/a/c/a/d;->b0:Lc/b/a/c/a/e;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    invoke-virtual {v0, v1}, Lc/b/a/c/a/e;->m(Z)V

    const/4 v0, 0x0

    iput-object v0, p0, Lc/b/a/c/a/d;->b0:Lc/b/a/c/a/e;

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->d1()V

    return-void
.end method

.method public m1()V
    .locals 1

    iget-object v0, p0, Lc/b/a/c/a/d;->b0:Lc/b/a/c/a/e;

    invoke-virtual {v0}, Lc/b/a/c/a/e;->l()V

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->m1()V

    return-void
.end method

.method public q2(Ljava/lang/String;Lc/b/a/c/a/c$b;)V
    .locals 1

    const-string v0, "Developer key cannot be null or empty"

    invoke-static {p1, v0}, Lc/b/a/c/a/f/b;->c(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lc/b/a/c/a/d;->c0:Ljava/lang/String;

    iput-object p2, p0, Lc/b/a/c/a/d;->d0:Lc/b/a/c/a/c$b;

    invoke-direct {p0}, Lc/b/a/c/a/d;->p2()V

    return-void
.end method

.method public r1()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->r1()V

    iget-object v0, p0, Lc/b/a/c/a/d;->b0:Lc/b/a/c/a/e;

    invoke-virtual {v0}, Lc/b/a/c/a/e;->j()V

    return-void
.end method

.method public s1(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->s1(Landroid/os/Bundle;)V

    iget-object v0, p0, Lc/b/a/c/a/d;->b0:Lc/b/a/c/a/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc/b/a/c/a/e;->q()Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc/b/a/c/a/d;->a0:Landroid/os/Bundle;

    :goto_0
    const-string v1, "YouTubePlayerSupportFragment.KEY_PLAYER_VIEW_STATE"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public t1()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->t1()V

    iget-object v0, p0, Lc/b/a/c/a/d;->b0:Lc/b/a/c/a/e;

    invoke-virtual {v0}, Lc/b/a/c/a/e;->b()V

    return-void
.end method

.method public u1()V
    .locals 1

    iget-object v0, p0, Lc/b/a/c/a/d;->b0:Lc/b/a/c/a/e;

    invoke-virtual {v0}, Lc/b/a/c/a/e;->p()V

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->u1()V

    return-void
.end method
