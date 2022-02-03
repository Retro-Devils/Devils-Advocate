.class Lcom/digdroid/alman/dig/g3$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/g3$c;->onShow(Landroid/content/DialogInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/g3$c;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/g3$c;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-lez p1, :cond_0

    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object v0, p0, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v0, 0x7f110094

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x7f11005a

    new-instance v1, Lcom/digdroid/alman/dig/g3$c$a$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/g3$c$a$b;-><init>(Lcom/digdroid/alman/dig/g3$c$a;)V

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x7f1101da

    new-instance v1, Lcom/digdroid/alman/dig/g3$c$a$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/g3$c$a$a;-><init>(Lcom/digdroid/alman/dig/g3$c$a;)V

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_0
    return-void
.end method
