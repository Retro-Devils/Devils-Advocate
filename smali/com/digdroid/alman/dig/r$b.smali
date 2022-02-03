.class Lcom/digdroid/alman/dig/r$b;
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

    iput-object p1, p0, Lcom/digdroid/alman/dig/r$b;->d:Lcom/digdroid/alman/dig/r;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r$b;->b:Landroid/widget/Spinner;

    iput p3, p0, Lcom/digdroid/alman/dig/r$b;->c:I

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

    iget-object p1, p0, Lcom/digdroid/alman/dig/r$b;->b:Landroid/widget/Spinner;

    invoke-virtual {p1}, Landroid/widget/Spinner;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p3, p1, :cond_0

    return-void

    :cond_0
    if-nez p3, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/r$b;->d:Lcom/digdroid/alman/dig/r;

    invoke-static {p1}, Lcom/digdroid/alman/dig/r;->a(Lcom/digdroid/alman/dig/r;)Lcom/digdroid/alman/dig/s3;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/r$b;->d:Lcom/digdroid/alman/dig/r;

    iget-object p3, p2, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    iget p4, p0, Lcom/digdroid/alman/dig/r$b;->c:I

    aget-object p3, p3, p4

    invoke-virtual {p2, p3}, Lcom/digdroid/alman/dig/r;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "none"

    invoke-virtual {p1, p2, p3}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1
    const/4 p1, 0x1

    if-ne p3, p1, :cond_2

    new-instance p2, Lcom/digdroid/alman/dig/i;

    iget-object p3, p0, Lcom/digdroid/alman/dig/r$b;->d:Lcom/digdroid/alman/dig/r;

    invoke-static {p3}, Lcom/digdroid/alman/dig/r;->b(Lcom/digdroid/alman/dig/r;)Landroid/app/Activity;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    iget-object p3, p0, Lcom/digdroid/alman/dig/r$b;->d:Lcom/digdroid/alman/dig/r;

    invoke-static {p3}, Lcom/digdroid/alman/dig/r;->b(Lcom/digdroid/alman/dig/r;)Landroid/app/Activity;

    move-result-object p3

    const p4, 0x7f110069

    invoke-virtual {p3, p4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/digdroid/alman/dig/i;->i(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/i;->g(Z)V

    new-instance p1, Lcom/digdroid/alman/dig/r$b$a;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/r$b$a;-><init>(Lcom/digdroid/alman/dig/r$b;)V

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/i;->h(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/i;->d()V

    goto :goto_0

    :cond_2
    const/4 p1, 0x2

    if-ne p3, p1, :cond_3

    new-instance p1, Lcom/digdroid/alman/dig/i;

    iget-object p2, p0, Lcom/digdroid/alman/dig/r$b;->d:Lcom/digdroid/alman/dig/r;

    invoke-static {p2}, Lcom/digdroid/alman/dig/r;->b(Lcom/digdroid/alman/dig/r;)Landroid/app/Activity;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/r$b;->d:Lcom/digdroid/alman/dig/r;

    invoke-static {p2}, Lcom/digdroid/alman/dig/r;->b(Lcom/digdroid/alman/dig/r;)Landroid/app/Activity;

    move-result-object p2

    const p3, 0x7f11006a

    invoke-virtual {p2, p3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/i;->i(Ljava/lang/String;)V

    new-instance p2, Lcom/digdroid/alman/dig/r$b$b;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/r$b$b;-><init>(Lcom/digdroid/alman/dig/r$b;)V

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/i;->h(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/i;->d()V

    goto :goto_0

    :cond_3
    const/4 p1, 0x3

    if-ne p3, p1, :cond_4

    iget-object p1, p0, Lcom/digdroid/alman/dig/r$b;->d:Lcom/digdroid/alman/dig/r;

    invoke-static {p1}, Lcom/digdroid/alman/dig/r;->a(Lcom/digdroid/alman/dig/r;)Lcom/digdroid/alman/dig/s3;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/r$b;->d:Lcom/digdroid/alman/dig/r;

    iget-object p3, p2, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    iget p4, p0, Lcom/digdroid/alman/dig/r$b;->c:I

    aget-object p3, p3, p4

    invoke-virtual {p2, p3}, Lcom/digdroid/alman/dig/r;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "covers"

    invoke-virtual {p1, p2, p3}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r$b;->d:Lcom/digdroid/alman/dig/r;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/r;->d()V

    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/r$b;->d:Lcom/digdroid/alman/dig/r;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

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
