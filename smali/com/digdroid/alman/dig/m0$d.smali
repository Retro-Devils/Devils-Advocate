.class Lcom/digdroid/alman/dig/m0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/m0;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:[J

.field final synthetic c:Lcom/digdroid/alman/dig/m0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/m0;[J)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/m0$d;->c:Lcom/digdroid/alman/dig/m0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/m0$d;->b:[J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0$d;->c:Lcom/digdroid/alman/dig/m0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v0, 0x7f11008b

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x7f11005a

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    new-instance v0, Lcom/digdroid/alman/dig/m0$d$a;

    invoke-direct {v0, p0, p2}, Lcom/digdroid/alman/dig/m0$d$a;-><init>(Lcom/digdroid/alman/dig/m0$d;I)V

    const p2, 0x7f1101d8

    invoke-virtual {p1, p2, v0}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method
