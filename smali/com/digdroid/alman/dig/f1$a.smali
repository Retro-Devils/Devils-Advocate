.class Lcom/digdroid/alman/dig/f1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/f1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f1;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f1$a;->b:Lcom/digdroid/alman/dig/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/f1$a;->b:Lcom/digdroid/alman/dig/f1;

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/p1;->j0:Z

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    if-eqz v1, :cond_2

    iget-object v0, v0, Lcom/digdroid/alman/dig/f1;->s0:Lcom/digdroid/alman/dig/m;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/m;->c()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/f1$a;->b:Lcom/digdroid/alman/dig/f1;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/d2;->b()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Lcom/digdroid/alman/dig/f1$a;->b:Lcom/digdroid/alman/dig/f1;

    iget-object v2, v2, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v2, v1}, Lcom/digdroid/alman/dig/e2;->c(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    const v3, 0x7f0901c0

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_0

    iget-object v4, p0, Lcom/digdroid/alman/dig/f1$a;->b:Lcom/digdroid/alman/dig/f1;

    iget-object v4, v4, Lcom/digdroid/alman/dig/f1;->s0:Lcom/digdroid/alman/dig/m;

    invoke-virtual {v4, v1}, Lcom/digdroid/alman/dig/m;->a(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    const v3, 0x7f0901be

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_1

    iget-object v3, p0, Lcom/digdroid/alman/dig/f1$a;->b:Lcom/digdroid/alman/dig/f1;

    iget-object v3, v3, Lcom/digdroid/alman/dig/f1;->s0:Lcom/digdroid/alman/dig/m;

    invoke-virtual {v3, v1}, Lcom/digdroid/alman/dig/m;->a(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/f1$a;->b:Lcom/digdroid/alman/dig/f1;

    iget-object v1, v0, Lcom/digdroid/alman/dig/f1;->t0:Landroid/os/Handler;

    iget-object v0, v0, Lcom/digdroid/alman/dig/f1;->s0:Lcom/digdroid/alman/dig/m;

    iget v0, v0, Lcom/digdroid/alman/dig/m;->h:I

    int-to-long v2, v0

    invoke-virtual {v1, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
