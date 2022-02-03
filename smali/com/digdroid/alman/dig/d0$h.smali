.class Lcom/digdroid/alman/dig/d0$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0;->C(Landroid/app/Activity;IZILjava/lang/String;Lcom/digdroid/alman/dig/d0$r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/digdroid/alman/dig/d0$r;

.field final synthetic d:Landroid/app/Activity;

.field final synthetic e:Lcom/digdroid/alman/dig/d0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0;ILcom/digdroid/alman/dig/d0$r;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$h;->e:Lcom/digdroid/alman/dig/d0;

    iput p2, p0, Lcom/digdroid/alman/dig/d0$h;->b:I

    iput-object p3, p0, Lcom/digdroid/alman/dig/d0$h;->c:Lcom/digdroid/alman/dig/d0$r;

    iput-object p4, p0, Lcom/digdroid/alman/dig/d0$h;->d:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$h;->e:Lcom/digdroid/alman/dig/d0;

    iget p2, p0, Lcom/digdroid/alman/dig/d0$h;->b:I

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/d0;->d(Lcom/digdroid/alman/dig/d0;I)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$h;->c:Lcom/digdroid/alman/dig/d0$r;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/d0$r;->b()V

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object p2, p0, Lcom/digdroid/alman/dig/d0$h;->d:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v0

    invoke-direct {p1, p2, v0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const p2, 0x7f110276

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const p2, 0x7f1101d8

    new-instance v0, Lcom/digdroid/alman/dig/d0$h$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/d0$h$a;-><init>(Lcom/digdroid/alman/dig/d0$h;)V

    invoke-virtual {p1, p2, v0}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :goto_0
    return-void
.end method
