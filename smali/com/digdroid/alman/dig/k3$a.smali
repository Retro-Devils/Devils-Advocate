.class Lcom/digdroid/alman/dig/k3$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/e2$x;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/k3;->a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:I

.field b:Landroid/os/Handler;

.field final synthetic c:Lcom/digdroid/alman/dig/k3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/k3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/k3$a;->c:Lcom/digdroid/alman/dig/k3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lcom/digdroid/alman/dig/k3$a;->a:I

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/k3$a;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;I)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/k3$a;->b:Landroid/os/Handler;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/k3$a;->b:Landroid/os/Handler;

    new-instance v0, Lcom/digdroid/alman/dig/k3$a$a;

    invoke-direct {v0, p0, p2}, Lcom/digdroid/alman/dig/k3$a$a;-><init>(Lcom/digdroid/alman/dig/k3$a;I)V

    const-wide/16 v1, 0x64

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
