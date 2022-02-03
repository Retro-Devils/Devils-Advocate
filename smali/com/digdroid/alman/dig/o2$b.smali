.class Lcom/digdroid/alman/dig/o2$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o2;->s()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/o2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/o2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/o2$b;->b:Lcom/digdroid/alman/dig/o2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$b;->b:Lcom/digdroid/alman/dig/o2;

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/o2;->h:Z

    if-eqz v1, :cond_1

    iget-object v0, v0, Lcom/digdroid/alman/dig/o2;->b:Lcom/digdroid/alman/dig/o2$g;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/o2$g;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$b;->b:Lcom/digdroid/alman/dig/o2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/o2;->d(Lcom/digdroid/alman/dig/o2;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$b;->b:Lcom/digdroid/alman/dig/o2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/o2;->e(Lcom/digdroid/alman/dig/o2;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$b;->b:Lcom/digdroid/alman/dig/o2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/o2;->e(Lcom/digdroid/alman/dig/o2;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/o2$b;->b:Lcom/digdroid/alman/dig/o2;

    invoke-static {v1}, Lcom/digdroid/alman/dig/o2;->d(Lcom/digdroid/alman/dig/o2;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$b;->b:Lcom/digdroid/alman/dig/o2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/o2;->w()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$b;->b:Lcom/digdroid/alman/dig/o2;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/o2;->g(Lcom/digdroid/alman/dig/o2;I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$b;->b:Lcom/digdroid/alman/dig/o2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/o2;->h(Lcom/digdroid/alman/dig/o2;)Lc/b/a/c/a/c;

    move-result-object v0

    invoke-interface {v0}, Lc/b/a/c/a/c;->e()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$b;->b:Lcom/digdroid/alman/dig/o2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/o2;->b:Lcom/digdroid/alman/dig/o2$g;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/o2$g;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$b;->b:Lcom/digdroid/alman/dig/o2;

    invoke-static {v0}, Lcom/digdroid/alman/dig/o2;->h(Lcom/digdroid/alman/dig/o2;)Lc/b/a/c/a/c;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/o2$b;->b:Lcom/digdroid/alman/dig/o2;

    invoke-static {v1}, Lcom/digdroid/alman/dig/o2;->d(Lcom/digdroid/alman/dig/o2;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lc/b/a/c/a/c;->c(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
