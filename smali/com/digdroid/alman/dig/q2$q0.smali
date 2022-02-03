.class Lcom/digdroid/alman/dig/q2$q0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2;->t3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/Switch;

.field final synthetic c:Landroid/app/Activity;

.field final synthetic d:Lcom/digdroid/alman/dig/q2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2;Landroid/widget/Switch;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$q0;->d:Lcom/digdroid/alman/dig/q2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/q2$q0;->b:Landroid/widget/Switch;

    iput-object p3, p0, Lcom/digdroid/alman/dig/q2$q0;->c:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$q0;->b:Landroid/widget/Switch;

    invoke-virtual {p1}, Landroid/widget/Switch;->isChecked()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/widget/Switch;->setChecked(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$q0;->b:Landroid/widget/Switch;

    invoke-virtual {p1}, Landroid/widget/Switch;->isChecked()Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object v0, p0, Lcom/digdroid/alman/dig/q2$q0;->c:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v0, 0x7f1101ce

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x7f11005a

    new-instance v1, Lcom/digdroid/alman/dig/q2$q0$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/q2$q0$b;-><init>(Lcom/digdroid/alman/dig/q2$q0;)V

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x7f1101d8

    new-instance v1, Lcom/digdroid/alman/dig/q2$q0$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/q2$q0$a;-><init>(Lcom/digdroid/alman/dig/q2$q0;)V

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$q0;->d:Lcom/digdroid/alman/dig/q2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v0, "wifi_only"

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/b3;->B(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$q0;->d:Lcom/digdroid/alman/dig/q2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    :goto_0
    return-void
.end method
