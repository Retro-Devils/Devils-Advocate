.class Lcom/digdroid/alman/dig/j0$x$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0$x;->onLongClick(Landroid/view/View;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Z

.field final synthetic c:Lcom/digdroid/alman/dig/j0$x;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0$x;Z)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$x$a;->c:Lcom/digdroid/alman/dig/j0$x;

    iput-boolean p2, p0, Lcom/digdroid/alman/dig/j0$x$a;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 7

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/j0$x$a;->b:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$x$a;->c:Lcom/digdroid/alman/dig/j0$x;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0$x;->b:Lcom/digdroid/alman/dig/j0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/p1;->f0:Lcom/digdroid/alman/dig/t1;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$x$a;->c:Lcom/digdroid/alman/dig/j0$x;

    iget-object v2, p1, Lcom/digdroid/alman/dig/j0$x;->b:Lcom/digdroid/alman/dig/j0;

    iget-wide v3, v2, Lcom/digdroid/alman/dig/j0;->q0:J

    if-nez p2, :cond_0

    iget-boolean v5, p0, Lcom/digdroid/alman/dig/j0$x$a;->b:Z

    new-instance v6, Lcom/digdroid/alman/dig/j0$x$a$a;

    invoke-direct {v6, p0}, Lcom/digdroid/alman/dig/j0$x$a$a;-><init>(Lcom/digdroid/alman/dig/j0$x$a;)V

    :goto_0
    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/t1;->k(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JZLcom/digdroid/alman/dig/t1$l;)V

    goto :goto_1

    :cond_0
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/j0$x$a;->b:Z

    xor-int/lit8 v5, p1, 0x1

    new-instance v6, Lcom/digdroid/alman/dig/j0$x$a$b;

    invoke-direct {v6, p0}, Lcom/digdroid/alman/dig/j0$x$a$b;-><init>(Lcom/digdroid/alman/dig/j0$x$a;)V

    goto :goto_0

    :goto_1
    return-void
.end method
