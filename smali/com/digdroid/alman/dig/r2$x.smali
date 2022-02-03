.class Lcom/digdroid/alman/dig/r2$x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2;->H3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/appcompat/widget/SwitchCompat;

.field final synthetic c:Lcom/digdroid/alman/dig/r2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2;Landroidx/appcompat/widget/SwitchCompat;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$x;->c:Lcom/digdroid/alman/dig/r2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r2$x;->b:Landroidx/appcompat/widget/SwitchCompat;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$x;->b:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$x;->b:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$x;->c:Lcom/digdroid/alman/dig/r2;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v1

    const/4 v2, 0x6

    new-instance v3, Lcom/digdroid/alman/dig/r2$x$a;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/r2$x$a;-><init>(Lcom/digdroid/alman/dig/r2$x;)V

    invoke-virtual {v1, p1, v2, v3}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$s;)V

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :cond_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$x;->c:Lcom/digdroid/alman/dig/r2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v1, "merged_games"

    invoke-virtual {p1, v1, v0}, Lcom/digdroid/alman/dig/c3;->A(Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$x;->b:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    :goto_1
    new-instance p1, Lcom/digdroid/alman/dig/r2$x0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r2$x;->c:Lcom/digdroid/alman/dig/r2;

    const/4 v2, 0x0

    invoke-direct {p1, v1, v2}, Lcom/digdroid/alman/dig/r2$x0;-><init>(Lcom/digdroid/alman/dig/r2;Lcom/digdroid/alman/dig/r2$k;)V

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$x;->c:Lcom/digdroid/alman/dig/r2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->R()V

    return-void
.end method
