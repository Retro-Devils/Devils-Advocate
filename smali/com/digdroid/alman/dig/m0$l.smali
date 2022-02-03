.class Lcom/digdroid/alman/dig/m0$l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/m0;->c(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/m0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/m0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/m0$l;->a:Lcom/digdroid/alman/dig/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0$l;->a:Lcom/digdroid/alman/dig/m0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v1, p0, Lcom/digdroid/alman/dig/m0$l;->a:Lcom/digdroid/alman/dig/m0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/m0$l;->a:Lcom/digdroid/alman/dig/m0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    const v2, 0x7f110092

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const/high16 v1, 0x1040000

    new-instance v2, Lcom/digdroid/alman/dig/m0$l$b;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/m0$l$b;-><init>(Lcom/digdroid/alman/dig/m0$l;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x104000a

    new-instance v2, Lcom/digdroid/alman/dig/m0$l$a;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/m0$l$a;-><init>(Lcom/digdroid/alman/dig/m0$l;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_1
    :goto_0
    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
