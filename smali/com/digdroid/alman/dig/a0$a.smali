.class Lcom/digdroid/alman/dig/a0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/a0;->c(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lcom/digdroid/alman/dig/a0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/a0;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/a0$a;->c:Lcom/digdroid/alman/dig/a0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/a0$a;->b:Landroid/view/View;

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

    iget-object p1, p0, Lcom/digdroid/alman/dig/a0$a;->c:Lcom/digdroid/alman/dig/a0;

    iput p3, p1, Lcom/digdroid/alman/dig/a0;->e:I

    iget-object p2, p1, Lcom/digdroid/alman/dig/a0;->c:Ljava/util/ArrayList;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/digdroid/alman/dig/a0$f;

    iget-wide p4, p2, Lcom/digdroid/alman/dig/a0$f;->a:J

    iput-wide p4, p1, Lcom/digdroid/alman/dig/a0;->f:J

    iget-object p1, p0, Lcom/digdroid/alman/dig/a0$a;->c:Lcom/digdroid/alman/dig/a0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/a0;->c:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/a0$f;

    iget-object p2, p0, Lcom/digdroid/alman/dig/a0$a;->b:Landroid/view/View;

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/a0$f;->c(Landroid/view/View;)V

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
