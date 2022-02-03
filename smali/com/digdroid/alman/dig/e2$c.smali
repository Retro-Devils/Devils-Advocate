.class Lcom/digdroid/alman/dig/e2$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/e2;->u(Lcom/digdroid/alman/dig/e2$w;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/e2$w;

.field final synthetic b:Lcom/digdroid/alman/dig/e2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/e2;Lcom/digdroid/alman/dig/e2$w;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2$c;->b:Lcom/digdroid/alman/dig/e2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/e2$c;->a:Lcom/digdroid/alman/dig/e2$w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemLongClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)Z"
        }
    .end annotation

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$c;->b:Lcom/digdroid/alman/dig/e2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/e2;->p:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/b3;->t()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$c;->a:Lcom/digdroid/alman/dig/e2$w;

    invoke-interface {p1, p2, p3}, Lcom/digdroid/alman/dig/e2$w;->a(Landroid/view/View;I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
