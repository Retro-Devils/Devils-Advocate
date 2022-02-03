.class Lcom/digdroid/alman/dig/d0$i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0$i;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/d0$i;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0$i;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$i$a;->a:Lcom/digdroid/alman/dig/d0$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$i$a;->a:Lcom/digdroid/alman/dig/d0$i;

    iget-object v1, v0, Lcom/digdroid/alman/dig/d0$i;->h:Lcom/digdroid/alman/dig/d0;

    iget v0, v0, Lcom/digdroid/alman/dig/d0$i;->f:I

    invoke-static {v1, v0}, Lcom/digdroid/alman/dig/d0;->d(Lcom/digdroid/alman/dig/d0;I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$i$a;->a:Lcom/digdroid/alman/dig/d0$i;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0$i;->g:Lcom/digdroid/alman/dig/d0$r;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/d0$r;->b()V

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v1, p0, Lcom/digdroid/alman/dig/d0$i$a;->a:Lcom/digdroid/alman/dig/d0$i;

    iget-object v1, v1, Lcom/digdroid/alman/dig/d0$i;->b:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v1, 0x7f110277

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f1101d8

    new-instance v2, Lcom/digdroid/alman/dig/d0$i$a$a;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/d0$i$a$a;-><init>(Lcom/digdroid/alman/dig/d0$i$a;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$i$a;->a:Lcom/digdroid/alman/dig/d0$i;

    iget-object v1, v0, Lcom/digdroid/alman/dig/d0$i;->h:Lcom/digdroid/alman/dig/d0;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/d0$i;->d:Z

    invoke-static {v1, p1, v0}, Lcom/digdroid/alman/dig/d0;->e(Lcom/digdroid/alman/dig/d0;Ljava/lang/String;Z)I

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$i$a;->a:Lcom/digdroid/alman/dig/d0$i;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0$i;->h:Lcom/digdroid/alman/dig/d0;

    invoke-static {v0}, Lcom/digdroid/alman/dig/d0;->b(Lcom/digdroid/alman/dig/d0;)Lcom/digdroid/alman/dig/n;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/d0$i$a;->a:Lcom/digdroid/alman/dig/d0$i;

    iget-object v1, v1, Lcom/digdroid/alman/dig/d0$i;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$i$a;->a:Lcom/digdroid/alman/dig/d0$i;

    iget-object v0, p1, Lcom/digdroid/alman/dig/d0$i;->h:Lcom/digdroid/alman/dig/d0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/d0$i;->b:Landroid/app/Activity;

    invoke-static {v0, p1}, Lcom/digdroid/alman/dig/d0;->c(Lcom/digdroid/alman/dig/d0;Landroid/content/Context;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$i$a;->a:Lcom/digdroid/alman/dig/d0$i;

    iget-object v0, p1, Lcom/digdroid/alman/dig/d0$i;->h:Lcom/digdroid/alman/dig/d0;

    iget-object v1, p1, Lcom/digdroid/alman/dig/d0$i;->b:Landroid/app/Activity;

    iget v2, p1, Lcom/digdroid/alman/dig/d0$i;->f:I

    iget-object p1, p1, Lcom/digdroid/alman/dig/d0$i;->g:Lcom/digdroid/alman/dig/d0$r;

    invoke-virtual {v0, v1, v2, p1}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    return-void
.end method
