.class Lcom/digdroid/alman/dig/r2$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2;->r3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/Spinner;

.field final synthetic c:Lcom/digdroid/alman/dig/r2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2;Landroid/widget/Spinner;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$j;->c:Lcom/digdroid/alman/dig/r2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r2$j;->b:Landroid/widget/Spinner;

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

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$j;->b:Landroid/widget/Spinner;

    invoke-virtual {p1}, Landroid/widget/Spinner;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p3, p1, :cond_1

    const-string p1, "language"

    iget-object p2, p0, Lcom/digdroid/alman/dig/r2$j;->c:Lcom/digdroid/alman/dig/r2;

    iget-object p2, p2, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    if-nez p3, :cond_0

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/c3;->I(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object p4, Lcom/digdroid/alman/dig/r2;->n0:[Ljava/lang/String;

    add-int/lit8 p3, p3, -0x1

    aget-object p3, p4, p3

    invoke-virtual {p2, p1, p3}, Lcom/digdroid/alman/dig/c3;->z(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$j;->c:Lcom/digdroid/alman/dig/r2;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-static {p1}, Lcom/digdroid/alman/dig/a4;->u(Landroid/app/Activity;)V

    :cond_1
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
