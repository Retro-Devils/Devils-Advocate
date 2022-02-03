.class Lcom/digdroid/alman/dig/MainActivity$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/appcompat/widget/SearchView$l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/MainActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/MainActivity;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$k;->a:Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity$k;->a:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/p1;->I2(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public b(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity$k;->a:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e0;->k1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/p1;->J2(Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$k;->a:Lcom/digdroid/alman/dig/MainActivity;

    iget-object p1, p1, Lcom/digdroid/alman/dig/MainActivity;->w1:Landroidx/appcompat/widget/SearchView;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/SearchView;->setIconified(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$k;->a:Lcom/digdroid/alman/dig/MainActivity;

    iget-object p1, p1, Lcom/digdroid/alman/dig/MainActivity;->x1:Landroid/view/MenuItem;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$k;->a:Lcom/digdroid/alman/dig/MainActivity;

    iget-object p1, p1, Lcom/digdroid/alman/dig/MainActivity;->w1:Landroidx/appcompat/widget/SearchView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/SearchView;->clearFocus()V

    return v0
.end method
