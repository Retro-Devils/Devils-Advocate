.class Lcom/digdroid/alman/dig/e2$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/e2;-><init>(Lcom/digdroid/alman/dig/MainActivity;Landroid/view/View;Ljava/lang/String;Lcom/digdroid/alman/dig/e2$s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/e2$s;

.field final synthetic c:Lcom/digdroid/alman/dig/MainActivity;

.field final synthetic d:Lcom/digdroid/alman/dig/e2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/e2;Lcom/digdroid/alman/dig/e2$s;Lcom/digdroid/alman/dig/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2$k;->d:Lcom/digdroid/alman/dig/e2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/e2$k;->b:Lcom/digdroid/alman/dig/e2$s;

    iput-object p3, p0, Lcom/digdroid/alman/dig/e2$k;->c:Lcom/digdroid/alman/dig/MainActivity;

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

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$k;->b:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/e2$s;->l()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$k;->d:Lcom/digdroid/alman/dig/e2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/e2;->o:Landroid/view/View;

    const/4 p4, 0x1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$k;->c:Lcom/digdroid/alman/dig/MainActivity;

    const p5, 0x7f010024

    invoke-static {p1, p5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    iget-object p5, p0, Lcom/digdroid/alman/dig/e2$k;->d:Lcom/digdroid/alman/dig/e2;

    iget-object p5, p5, Lcom/digdroid/alman/dig/e2;->o:Landroid/view/View;

    invoke-virtual {p5, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {p1, p4}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    :cond_0
    if-eqz p2, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$k;->c:Lcom/digdroid/alman/dig/MainActivity;

    const p5, 0x7f010022

    invoke-static {p1, p5}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {p1, p4}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$k;->d:Lcom/digdroid/alman/dig/e2;

    iput-object p2, p1, Lcom/digdroid/alman/dig/e2;->o:Landroid/view/View;

    iget-object p1, p1, Lcom/digdroid/alman/dig/e2;->d:Lcom/digdroid/alman/dig/e2$x;

    if-eqz p1, :cond_2

    invoke-interface {p1, p2, p3}, Lcom/digdroid/alman/dig/e2$x;->a(Landroid/view/View;I)V

    :cond_2
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
