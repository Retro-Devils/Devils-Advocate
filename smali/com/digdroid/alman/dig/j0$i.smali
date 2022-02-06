.class Lcom/digdroid/alman/dig/j0$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnMultiChoiceClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0;->g3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Z

.field final synthetic b:Lcom/digdroid/alman/dig/j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0;[Z)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$i;->b:Lcom/digdroid/alman/dig/j0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/j0$i;->a:[Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;IZ)V
    .locals 1

    if-eqz p3, :cond_0

    sget-object p1, Lcom/digdroid/alman/dig/j0;->n0:[I

    aget p1, p1, p2

    const v0, 0x7f1101f0

    if-ne p1, v0, :cond_0

    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object p3, p0, Lcom/digdroid/alman/dig/j0$i;->b:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p3

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v0

    invoke-direct {p1, p3, v0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const p3, 0x7f11008b

    invoke-virtual {p1, p3}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const p3, 0x7f1101d8

    new-instance v0, Lcom/digdroid/alman/dig/j0$i$b;

    invoke-direct {v0, p0, p2}, Lcom/digdroid/alman/dig/j0$i$b;-><init>(Lcom/digdroid/alman/dig/j0$i;I)V

    invoke-virtual {p1, p3, v0}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const p3, 0x7f11005a

    new-instance v0, Lcom/digdroid/alman/dig/j0$i$a;

    invoke-direct {v0, p0, p2}, Lcom/digdroid/alman/dig/j0$i$a;-><init>(Lcom/digdroid/alman/dig/j0$i;I)V

    invoke-virtual {p1, p3, v0}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$i;->a:[Z

    aput-boolean p3, p1, p2

    :goto_0
    return-void
.end method
