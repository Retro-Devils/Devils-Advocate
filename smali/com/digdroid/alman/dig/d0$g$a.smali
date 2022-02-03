.class Lcom/digdroid/alman/dig/d0$g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0$g;->onShow(Landroid/content/DialogInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/d0$g;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0$g;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$g$a;->b:Lcom/digdroid/alman/dig/d0$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    const/4 p1, 0x0

    const-string v0, ""

    move-object v2, v0

    const/4 v1, 0x0

    :goto_0
    iget-object v3, p0, Lcom/digdroid/alman/dig/d0$g$a;->b:Lcom/digdroid/alman/dig/d0$g;

    iget-object v4, v3, Lcom/digdroid/alman/dig/d0$g;->b:[Z

    array-length v5, v4

    if-ge p1, v5, :cond_2

    aget-boolean v3, v4, p1

    if-eqz v3, :cond_1

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ","

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/d0$g$a;->b:Lcom/digdroid/alman/dig/d0$g;

    iget-object v2, v2, Lcom/digdroid/alman/dig/d0$g;->c:[I

    aget v2, v2, p1

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    iget p1, v3, Lcom/digdroid/alman/dig/d0$g;->d:I

    if-ne v1, p1, :cond_3

    iget-object p1, v3, Lcom/digdroid/alman/dig/d0$g;->a:Landroidx/appcompat/app/b;

    invoke-virtual {p1}, Landroidx/appcompat/app/g;->dismiss()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$g$a;->b:Lcom/digdroid/alman/dig/d0$g;

    iget-object p1, p1, Lcom/digdroid/alman/dig/d0$g;->e:Lcom/digdroid/alman/dig/d0$t;

    invoke-interface {p1, v2}, Lcom/digdroid/alman/dig/d0$t;->b(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object v0, v3, Lcom/digdroid/alman/dig/d0$g;->f:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$g$a;->b:Lcom/digdroid/alman/dig/d0$g;

    iget-object v0, v0, Lcom/digdroid/alman/dig/d0$g;->g:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x7f1101da

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :goto_1
    return-void
.end method
