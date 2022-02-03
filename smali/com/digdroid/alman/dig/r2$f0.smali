.class Lcom/digdroid/alman/dig/r2$f0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2;->t3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/r2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$f0;->b:Lcom/digdroid/alman/dig/r2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$f0;->b:Lcom/digdroid/alman/dig/r2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/r2;->s3()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$f0;->b:Lcom/digdroid/alman/dig/r2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/digdroid/alman/dig/p1$a;->k0(Z)V

    new-instance p1, Lcom/digdroid/alman/dig/g;

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$f0;->b:Lcom/digdroid/alman/dig/r2;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/digdroid/alman/dig/g;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/digdroid/alman/dig/r2$u0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r2$f0;->b:Lcom/digdroid/alman/dig/r2;

    invoke-direct {v0, v1}, Lcom/digdroid/alman/dig/r2$u0;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/g;->g(Lcom/digdroid/alman/dig/g$a;)V

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/g;->c()V

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$f0;->b:Lcom/digdroid/alman/dig/r2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2;->r0:Landroidx/appcompat/app/b;

    invoke-virtual {p1}, Landroidx/appcompat/app/g;->dismiss()V

    return-void
.end method
