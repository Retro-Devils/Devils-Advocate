.class Lcom/digdroid/alman/dig/p2$i$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/p2$i;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/p2$i;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/p2$i;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/p2$i$b;->a:Lcom/digdroid/alman/dig/p2$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i$b;->a:Lcom/digdroid/alman/dig/p2$i;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/c3;->u()Z

    move-result v0

    const v1, 0x7f1101da

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$i$b;->a:Lcom/digdroid/alman/dig/p2$i;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    iget-boolean v3, v0, Lcom/digdroid/alman/dig/e0;->V:Z

    if-nez v3, :cond_0

    new-instance v3, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v4

    invoke-direct {v3, v0, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v0, 0x7f110144

    invoke-virtual {v3, v0}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p2$i$b;->a:Lcom/digdroid/alman/dig/p2$i;

    iget-object v3, v3, Lcom/digdroid/alman/dig/p2$i;->c:Lcom/digdroid/alman/dig/p2;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v4

    invoke-direct {v0, v3, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v3, 0x7f110143

    invoke-virtual {v0, v3}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v3, 0x7f11005a

    invoke-virtual {v0, v3, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v2, Lcom/digdroid/alman/dig/p2$i$b$a;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/p2$i$b$a;-><init>(Lcom/digdroid/alman/dig/p2$i$b;)V

    :goto_0
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
