.class final Lc/b/a/c/a/e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/c/a/f/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/b/a/c/a/e;->c(Landroid/app/Activity;Lc/b/a/c/a/c$d;Ljava/lang/String;Lc/b/a/c/a/c$b;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lc/b/a/c/a/e;


# direct methods
.method constructor <init>(Lc/b/a/c/a/e;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/c/a/e$a;->b:Lc/b/a/c/a/e;

    iput-object p2, p0, Lc/b/a/c/a/e$a;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lc/b/a/c/a/e$a;->b:Lc/b/a/c/a/e;

    invoke-static {v0}, Lc/b/a/c/a/e;->a(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/b/a/c/a/e$a;->b:Lc/b/a/c/a/e;

    iget-object v1, p0, Lc/b/a/c/a/e$a;->a:Landroid/app/Activity;

    invoke-static {v0, v1}, Lc/b/a/c/a/e;->f(Lc/b/a/c/a/e;Landroid/app/Activity;)V

    :cond_0
    iget-object v0, p0, Lc/b/a/c/a/e$a;->b:Lc/b/a/c/a/e;

    invoke-static {v0}, Lc/b/a/c/a/e;->i(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/d;

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lc/b/a/c/a/e$a;->b:Lc/b/a/c/a/e;

    invoke-static {v0}, Lc/b/a/c/a/e;->n(Lc/b/a/c/a/e;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lc/b/a/c/a/e$a;->b:Lc/b/a/c/a/e;

    invoke-static {v0}, Lc/b/a/c/a/e;->o(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/o;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/b/a/c/a/e$a;->b:Lc/b/a/c/a/e;

    invoke-static {v0}, Lc/b/a/c/a/e;->o(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/o;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/a/c/a/f/o;->s()V

    :cond_0
    iget-object v0, p0, Lc/b/a/c/a/e$a;->b:Lc/b/a/c/a/e;

    invoke-static {v0}, Lc/b/a/c/a/e;->r(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/k;

    move-result-object v0

    invoke-virtual {v0}, Lc/b/a/c/a/f/k;->a()V

    iget-object v0, p0, Lc/b/a/c/a/e$a;->b:Lc/b/a/c/a/e;

    invoke-static {v0}, Lc/b/a/c/a/e;->r(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    if-gez v0, :cond_1

    iget-object v0, p0, Lc/b/a/c/a/e$a;->b:Lc/b/a/c/a/e;

    invoke-static {v0}, Lc/b/a/c/a/e;->r(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc/b/a/c/a/e;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lc/b/a/c/a/e$a;->b:Lc/b/a/c/a/e;

    invoke-static {v0}, Lc/b/a/c/a/e;->s(Lc/b/a/c/a/e;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    iget-object v0, p0, Lc/b/a/c/a/e$a;->b:Lc/b/a/c/a/e;

    invoke-static {v0}, Lc/b/a/c/a/e;->t(Lc/b/a/c/a/e;)Landroid/view/View;

    iget-object v0, p0, Lc/b/a/c/a/e$a;->b:Lc/b/a/c/a/e;

    invoke-static {v0}, Lc/b/a/c/a/e;->u(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/o;

    iget-object v0, p0, Lc/b/a/c/a/e$a;->b:Lc/b/a/c/a/e;

    invoke-static {v0}, Lc/b/a/c/a/e;->i(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/d;

    return-void
.end method
