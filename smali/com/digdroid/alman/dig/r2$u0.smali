.class Lcom/digdroid/alman/dig/r2$u0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/r2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "u0"
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/r2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$u0;->a:Lcom/digdroid/alman/dig/r2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$u0;->a:Lcom/digdroid/alman/dig/r2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/digdroid/alman/dig/p1$a;->k0(Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$u0;->a:Lcom/digdroid/alman/dig/r2;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v0}, Lcom/digdroid/alman/dig/a4;->H(Landroid/content/Context;)V

    new-instance v2, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v3

    invoke-direct {v2, v0, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    if-eqz p1, :cond_1

    const p1, 0x7f11004d

    goto :goto_0

    :cond_1
    const p1, 0x7f110049

    :goto_0
    invoke-virtual {v2, p1}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x7f1101da

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_2
    :goto_1
    return-void
.end method
