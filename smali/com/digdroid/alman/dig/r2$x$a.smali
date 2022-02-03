.class Lcom/digdroid/alman/dig/r2$x$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2$x;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/r2$x;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2$x;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$x$a;->a:Lcom/digdroid/alman/dig/r2$x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$x$a;->a:Lcom/digdroid/alman/dig/r2$x;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r2$x;->c:Lcom/digdroid/alman/dig/r2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v1, "merged_games"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->A(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$x$a;->a:Lcom/digdroid/alman/dig/r2$x;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r2$x;->b:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    return-void
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$x$a;->a:Lcom/digdroid/alman/dig/r2$x;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r2$x;->c:Lcom/digdroid/alman/dig/r2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v1, "merged_games"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->A(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$x$a;->a:Lcom/digdroid/alman/dig/r2$x;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r2$x;->b:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    return-void
.end method
