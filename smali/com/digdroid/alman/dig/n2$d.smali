.class Lcom/digdroid/alman/dig/n2$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/b/a/c/a/c$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/n2;->b(Lc/b/a/c/a/c$d;Lc/b/a/c/a/c;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/n2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/n2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/n2;->h:Z

    if-eqz v1, :cond_1

    iget-object v0, v0, Lcom/digdroid/alman/dig/n2;->b:Lcom/digdroid/alman/dig/n2$g;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/n2$g;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/n2;->d(Lcom/digdroid/alman/dig/n2;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/n2;->d(Lcom/digdroid/alman/dig/n2;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    invoke-static {p1}, Lcom/digdroid/alman/dig/n2;->h(Lcom/digdroid/alman/dig/n2;)Lc/b/a/c/a/c;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/n2;->d(Lcom/digdroid/alman/dig/n2;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lc/b/a/c/a/c;->c(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    invoke-static {p1}, Lcom/digdroid/alman/dig/n2;->h(Lcom/digdroid/alman/dig/n2;)Lc/b/a/c/a/c;

    move-result-object p1

    invoke-interface {p1}, Lc/b/a/c/a/c;->e()V

    :cond_1
    :goto_0
    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/n2;->j(Lcom/digdroid/alman/dig/n2;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/n2;->h:Z

    if-eqz v1, :cond_0

    iget-object v0, v0, Lcom/digdroid/alman/dig/n2;->b:Lcom/digdroid/alman/dig/n2$g;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/n2$g;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/n2;->d(Lcom/digdroid/alman/dig/n2;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/n2;->b:Lcom/digdroid/alman/dig/n2$g;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/n2$g;->a()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/n2;->w()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/n2;->g(Lcom/digdroid/alman/dig/n2;I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/n2;->h(Lcom/digdroid/alman/dig/n2;)Lc/b/a/c/a/c;

    move-result-object v0

    invoke-interface {v0}, Lc/b/a/c/a/c;->b()V

    :goto_0
    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/n2;->f(Lcom/digdroid/alman/dig/n2;Ljava/lang/String;)Ljava/lang/String;

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public f(Lc/b/a/c/a/c$a;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/n2;->j(Lcom/digdroid/alman/dig/n2;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    sget-object v0, Lc/b/a/c/a/c$a;->d:Lc/b/a/c/a/c$a;

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/n2$d;->a:Lcom/digdroid/alman/dig/n2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/n2;->b:Lcom/digdroid/alman/dig/n2$g;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/n2$g;->c()V

    :cond_0
    return-void
.end method
