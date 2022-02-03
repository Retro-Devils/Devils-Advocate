.class Lcom/digdroid/alman/dig/a0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/a0;->c(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/widget/Spinner;

.field final synthetic d:Lcom/digdroid/alman/dig/a0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/a0;Ljava/lang/String;Landroid/widget/Spinner;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/a0$d;->d:Lcom/digdroid/alman/dig/a0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/a0$d;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/digdroid/alman/dig/a0$d;->c:Landroid/widget/Spinner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object v0, p0, Lcom/digdroid/alman/dig/a0$d;->d:Lcom/digdroid/alman/dig/a0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/a0;->a:Landroid/app/Activity;

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

    new-instance v0, Lcom/digdroid/alman/dig/a0$d$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/a0$d$a;-><init>(Lcom/digdroid/alman/dig/a0$d;)V

    const v1, 0x7f1101d8

    invoke-virtual {p1, v1, v0}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method
