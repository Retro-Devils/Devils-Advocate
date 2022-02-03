.class Lcom/digdroid/alman/dig/j0$x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0;->q3(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$x;->b:Lcom/digdroid/alman/dig/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 5

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/CharSequence;

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$x;->b:Lcom/digdroid/alman/dig/j0;

    const v1, 0x7f110053

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p1, v1

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$x;->b:Lcom/digdroid/alman/dig/j0;

    const v1, 0x7f110227

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, p1, v1

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$x;->b:Lcom/digdroid/alman/dig/j0;

    iget-object v2, v0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/digdroid/alman/dig/h3;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "mame"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    new-instance v2, Landroidx/appcompat/app/b$a;

    iget-object v3, p0, Lcom/digdroid/alman/dig/j0$x;->b:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v3

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    new-instance v3, Lcom/digdroid/alman/dig/j0$x$a;

    invoke-direct {v3, p0, v0}, Lcom/digdroid/alman/dig/j0$x$a;-><init>(Lcom/digdroid/alman/dig/j0$x;Z)V

    invoke-virtual {v2, p1, v3}, Landroidx/appcompat/app/b$a;->g([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return v1
.end method
