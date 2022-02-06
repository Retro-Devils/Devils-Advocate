.class Lcom/digdroid/alman/dig/v0$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v0;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/v0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0$g;->b:Lcom/digdroid/alman/dig/v0;

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

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/AdapterView;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Landroid/widget/TextView;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/v0$g;->b:Lcom/digdroid/alman/dig/v0;

    iput p3, p1, Lcom/digdroid/alman/dig/v0;->n:I

    iget-object p1, p1, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/b3;

    const-string p2, "games_preview_lines"

    invoke-virtual {p1, p2, p3}, Lcom/digdroid/alman/dig/b3;->x(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0$g;->b:Lcom/digdroid/alman/dig/v0;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/v0;->h()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0$g;->b:Lcom/digdroid/alman/dig/v0;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/v0;->l()V

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
