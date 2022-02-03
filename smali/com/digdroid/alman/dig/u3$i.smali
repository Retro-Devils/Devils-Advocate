.class Lcom/digdroid/alman/dig/u3$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/u3;->v1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/p1;

.field final synthetic c:Landroid/view/View;

.field final synthetic d:Landroid/widget/LinearLayout;

.field final synthetic e:Landroid/widget/LinearLayout;

.field final synthetic f:Lcom/digdroid/alman/dig/u3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/u3;Lcom/digdroid/alman/dig/p1;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/u3$i;->f:Lcom/digdroid/alman/dig/u3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/u3$i;->b:Lcom/digdroid/alman/dig/p1;

    iput-object p3, p0, Lcom/digdroid/alman/dig/u3$i;->c:Landroid/view/View;

    iput-object p4, p0, Lcom/digdroid/alman/dig/u3$i;->d:Landroid/widget/LinearLayout;

    iput-object p5, p0, Lcom/digdroid/alman/dig/u3$i;->e:Landroid/widget/LinearLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    sget-object v0, Lcom/digdroid/alman/dig/p3;->a:Lcom/digdroid/alman/dig/s3;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Lcom/digdroid/alman/dig/s3;->s:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v2, p0, Lcom/digdroid/alman/dig/u3$i;->f:Lcom/digdroid/alman/dig/u3;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v3

    invoke-direct {v0, v2, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v2, 0x7f1101c6

    invoke-virtual {v0, v2}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v2, 0x7f1101d8

    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    check-cast p1, Landroid/widget/RadioButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/u3$i;->b:Lcom/digdroid/alman/dig/p1;

    const-string v0, "icons_top"

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/p1;->Z2(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3$i;->f:Lcom/digdroid/alman/dig/u3;

    iget-object v2, p0, Lcom/digdroid/alman/dig/u3$i;->c:Landroid/view/View;

    iget-object v3, p0, Lcom/digdroid/alman/dig/u3$i;->d:Landroid/widget/LinearLayout;

    iget-object v4, p0, Lcom/digdroid/alman/dig/u3$i;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v0, v2, v3, v4}, Lcom/digdroid/alman/dig/u3;->D1(Ljava/lang/String;Landroid/view/View;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3$i;->f:Lcom/digdroid/alman/dig/u3;

    invoke-virtual {p1, v1}, Lcom/digdroid/alman/dig/u3;->v(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
