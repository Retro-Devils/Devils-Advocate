.class Lcom/digdroid/alman/dig/d0$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


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

.field final synthetic c:Landroid/widget/CheckBox;

.field final synthetic d:Landroid/app/Activity;

.field final synthetic e:Lcom/digdroid/alman/dig/d0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0;ILandroid/widget/CheckBox;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$g;->e:Lcom/digdroid/alman/dig/d0;

    iput p2, p0, Lcom/digdroid/alman/dig/d0$g;->b:I

    iput-object p3, p0, Lcom/digdroid/alman/dig/d0$g;->c:Landroid/widget/CheckBox;

    iput-object p4, p0, Lcom/digdroid/alman/dig/d0$g;->d:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$g;->e:Lcom/digdroid/alman/dig/d0;

    invoke-static {p1}, Lcom/digdroid/alman/dig/d0;->b(Lcom/digdroid/alman/dig/d0;)Lcom/digdroid/alman/dig/n;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "not_again"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/digdroid/alman/dig/d0$g;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/d0$g;->c:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "1"

    goto :goto_0

    :cond_0
    const-string v1, "0"

    :goto_0
    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$g;->e:Lcom/digdroid/alman/dig/d0;

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0$g;->d:Landroid/app/Activity;

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/d0;->c(Lcom/digdroid/alman/dig/d0;Landroid/content/Context;)V

    return-void
.end method
