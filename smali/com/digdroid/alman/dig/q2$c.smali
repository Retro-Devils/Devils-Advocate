.class Lcom/digdroid/alman/dig/q2$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2;->H3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/Spinner;

.field final synthetic c:Ljava/util/ArrayList;

.field final synthetic d:Lcom/digdroid/alman/dig/q2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2;Landroid/widget/Spinner;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$c;->d:Lcom/digdroid/alman/dig/q2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/q2$c;->b:Landroid/widget/Spinner;

    iput-object p3, p0, Lcom/digdroid/alman/dig/q2$c;->c:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$c;->d:Lcom/digdroid/alman/dig/q2;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/q2$c;->b:Landroid/widget/Spinner;

    invoke-virtual {p2}, Landroid/widget/Spinner;->getTag()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-eq p2, p3, :cond_1

    iget-object p2, p0, Lcom/digdroid/alman/dig/q2$c;->d:Lcom/digdroid/alman/dig/q2;

    iget-object p2, p2, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    iget-object p4, p0, Lcom/digdroid/alman/dig/q2$c;->c:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-static {p2, p3}, Lcom/digdroid/alman/dig/p3;->o(Landroid/content/Context;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/digdroid/alman/dig/y3;->t(Landroid/app/Activity;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
