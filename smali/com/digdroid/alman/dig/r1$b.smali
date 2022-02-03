.class Lcom/digdroid/alman/dig/r1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/e2$w;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r1;->a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/r1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r1;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r1$b;->a:Lcom/digdroid/alman/dig/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;I)Z
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1$b;->a:Lcom/digdroid/alman/dig/r1;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1$b;->a:Lcom/digdroid/alman/dig/r1;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->y()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1$b;->a:Lcom/digdroid/alman/dig/r1;

    iget-object v1, v0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v1, p2}, Lcom/digdroid/alman/dig/e2;->d(I)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/digdroid/alman/dig/r1;->f3(Landroid/view/View;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
