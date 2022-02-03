.class Lcom/digdroid/alman/dig/e0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/s/a/b$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/e0;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/digdroid/alman/dig/e0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/e0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e0$a;->b:Lcom/digdroid/alman/dig/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/e0$a;->a:Z

    return-void
.end method


# virtual methods
.method public a(IFI)V
    .locals 1

    iget-boolean p2, p0, Lcom/digdroid/alman/dig/e0$a;->a:Z

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/digdroid/alman/dig/e0$a;->a:Z

    invoke-virtual {p0, p2}, Lcom/digdroid/alman/dig/e0$a;->c(I)V

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/e0$a;->b:Lcom/digdroid/alman/dig/e0;

    iget-object v0, p2, Lcom/digdroid/alman/dig/e0;->Y:Lcom/digdroid/alman/dig/n2;

    if-eqz v0, :cond_1

    iget-object p2, p2, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/k2;

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/i2;->o(I)Landroidx/fragment/app/Fragment;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/p1;

    invoke-virtual {v0, p1, p3}, Lcom/digdroid/alman/dig/n2;->q(Lcom/digdroid/alman/dig/p1;I)V

    :cond_1
    return-void
.end method

.method public b(I)V
    .locals 0

    return-void
.end method

.method public c(I)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0$a;->b:Lcom/digdroid/alman/dig/e0;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/digdroid/alman/dig/e0;->T:Z

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/e0;->H(Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0$a;->b:Lcom/digdroid/alman/dig/e0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/k2;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/i2;->o(I)Landroidx/fragment/app/Fragment;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/p1;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0$a;->b:Lcom/digdroid/alman/dig/e0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/e0;->W:Lcom/digdroid/alman/dig/k2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/k2;->v()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0$a;->b:Lcom/digdroid/alman/dig/e0;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/p1;->v2()Lcom/digdroid/alman/dig/s3;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/e0;->E(Lcom/digdroid/alman/dig/s3;)V

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/p1;->P2()V

    :cond_0
    return-void
.end method
