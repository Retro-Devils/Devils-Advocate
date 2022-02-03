.class Lcom/digdroid/alman/dig/s$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s;->j3(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field b:Landroid/view/View;

.field final synthetic c:Lcom/digdroid/alman/dig/s;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$h;->b:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/high16 p3, 0x40000

    const/4 p4, 0x1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    invoke-virtual {p1, p4}, Landroid/widget/ListView;->setItemsCanFocus(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    invoke-virtual {p1, p3}, Landroid/widget/ListView;->setDescendantFocusability(I)V

    const p1, 0x7f090130

    :goto_0
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    goto/16 :goto_2

    :cond_0
    if-eq p1, p4, :cond_5

    const/4 p5, 0x6

    if-eq p1, p5, :cond_5

    const/4 p5, 0x7

    if-eq p1, p5, :cond_5

    const/16 p5, 0x11

    if-eq p1, p5, :cond_5

    const/16 p5, 0x12

    if-eq p1, p5, :cond_5

    const/4 p5, 0x5

    if-eq p1, p5, :cond_5

    const/16 p5, 0xf

    if-eq p1, p5, :cond_5

    const/16 p5, 0x10

    if-ne p1, p5, :cond_1

    goto :goto_1

    :cond_1
    const/4 p5, 0x2

    if-ne p1, p5, :cond_2

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    invoke-virtual {p1, p4}, Landroid/widget/ListView;->setItemsCanFocus(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    invoke-virtual {p1, p3}, Landroid/widget/ListView;->setDescendantFocusability(I)V

    const p1, 0x7f090136

    goto :goto_0

    :cond_2
    const/4 p5, 0x3

    if-ne p1, p5, :cond_3

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    invoke-virtual {p1, p4}, Landroid/widget/ListView;->setItemsCanFocus(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    invoke-virtual {p1, p3}, Landroid/widget/ListView;->setDescendantFocusability(I)V

    const p1, 0x7f090134

    goto :goto_0

    :cond_3
    const/4 p5, 0x4

    if-ne p1, p5, :cond_4

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    invoke-virtual {p1, p4}, Landroid/widget/ListView;->setItemsCanFocus(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    invoke-virtual {p1, p3}, Landroid/widget/ListView;->setDescendantFocusability(I)V

    const p1, 0x7f090132

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setItemsCanFocus(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    const/high16 p2, 0x20000

    invoke-virtual {p1, p2}, Landroid/widget/ListView;->setDescendantFocusability(I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    goto :goto_2

    :cond_5
    :goto_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    invoke-virtual {p1, p4}, Landroid/widget/ListView;->setItemsCanFocus(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    invoke-virtual {p1, p3}, Landroid/widget/ListView;->setDescendantFocusability(I)V

    const p1, 0x7f09012e

    goto/16 :goto_0

    :goto_2
    iget-object p2, p0, Lcom/digdroid/alman/dig/s$h;->b:Landroid/view/View;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Landroid/view/View;->clearFocus()V

    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$h;->b:Landroid/view/View;

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$h;->c:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    const/high16 v0, 0x20000

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setDescendantFocusability(I)V

    return-void
.end method
