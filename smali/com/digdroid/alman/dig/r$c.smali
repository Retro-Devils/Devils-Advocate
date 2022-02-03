.class Lcom/digdroid/alman/dig/r$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/Spinner;

.field final synthetic c:I

.field final synthetic d:Lcom/digdroid/alman/dig/r;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r;Landroid/widget/Spinner;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r$c;->d:Lcom/digdroid/alman/dig/r;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r$c;->b:Landroid/widget/Spinner;

    iput p3, p0, Lcom/digdroid/alman/dig/r$c;->c:I

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

    iget-object p1, p0, Lcom/digdroid/alman/dig/r$c;->b:Landroid/widget/Spinner;

    invoke-virtual {p1}, Landroid/widget/Spinner;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p3, p1, :cond_0

    return-void

    :cond_0
    if-nez p3, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/r$c;->d:Lcom/digdroid/alman/dig/r;

    invoke-static {p1}, Lcom/digdroid/alman/dig/r;->a(Lcom/digdroid/alman/dig/r;)Lcom/digdroid/alman/dig/s3;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/r$c;->d:Lcom/digdroid/alman/dig/r;

    iget-object p3, p2, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    iget p4, p0, Lcom/digdroid/alman/dig/r$c;->c:I

    aget-object p3, p3, p4

    invoke-virtual {p2, p3}, Lcom/digdroid/alman/dig/r;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "fillscreen"

    :goto_0
    invoke-virtual {p1, p2, p3}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    if-ne p3, p1, :cond_2

    iget-object p1, p0, Lcom/digdroid/alman/dig/r$c;->d:Lcom/digdroid/alman/dig/r;

    invoke-static {p1}, Lcom/digdroid/alman/dig/r;->a(Lcom/digdroid/alman/dig/r;)Lcom/digdroid/alman/dig/s3;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/r$c;->d:Lcom/digdroid/alman/dig/r;

    iget-object p3, p2, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    iget p4, p0, Lcom/digdroid/alman/dig/r$c;->c:I

    aget-object p3, p3, p4

    invoke-virtual {p2, p3}, Lcom/digdroid/alman/dig/r;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "fitmedia"

    goto :goto_0

    :cond_2
    :goto_1
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
