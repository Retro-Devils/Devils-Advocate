.class public Lcom/digdroid/alman/dig/v1;
.super Lcom/digdroid/alman/dig/a4;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/a4;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/a4;->onCreate(Landroid/os/Bundle;)V

    const p1, 0x7f0c001d

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(I)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/a4;->f1()V

    const p1, 0x7f0902c9

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/navigation/NavigationView;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/drawerlayout/widget/DrawerLayout$e;

    iget v1, p0, Lcom/digdroid/alman/dig/a4;->P:I

    iget v2, p0, Lcom/digdroid/alman/dig/a4;->Q:I

    iget v3, p0, Lcom/digdroid/alman/dig/a4;->S:I

    iget v4, p0, Lcom/digdroid/alman/dig/a4;->R:I

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const p1, 0x7f09043e

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v0, Landroidx/constraintlayout/widget/d;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/d;-><init>()V

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/widget/d;->f(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iget v1, p0, Lcom/digdroid/alman/dig/a4;->Q:I

    const v2, 0x7f090441

    invoke-virtual {v0, v2, v1}, Landroidx/constraintlayout/widget/d;->o(II)V

    iget v1, p0, Lcom/digdroid/alman/dig/a4;->R:I

    const v2, 0x7f09043d

    invoke-virtual {v0, v2, v1}, Landroidx/constraintlayout/widget/d;->p(II)V

    iget v1, p0, Lcom/digdroid/alman/dig/a4;->P:I

    const v2, 0x7f09043f

    invoke-virtual {v0, v2, v1}, Landroidx/constraintlayout/widget/d;->o(II)V

    iget v1, p0, Lcom/digdroid/alman/dig/a4;->S:I

    const v2, 0x7f090440

    invoke-virtual {v0, v2, v1}, Landroidx/constraintlayout/widget/d;->p(II)V

    invoke-static {p1}, Lb/p/o;->a(Landroid/view/ViewGroup;)V

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/widget/d;->c(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    return-void
.end method
