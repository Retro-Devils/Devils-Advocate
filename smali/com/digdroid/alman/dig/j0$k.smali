.class Lcom/digdroid/alman/dig/j0$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0;->n3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$k;->a:Lcom/digdroid/alman/dig/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollChanged()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$k;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v1, v0, Lcom/digdroid/alman/dig/j0;->G1:Lcom/digdroid/alman/dig/n2;

    if-eqz v1, :cond_0

    iget-object v2, v0, Lcom/digdroid/alman/dig/j0;->A1:Landroid/widget/ScrollView;

    invoke-virtual {v2}, Landroid/widget/ScrollView;->getScrollY()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lcom/digdroid/alman/dig/n2;->z(Lcom/digdroid/alman/dig/p1;I)V

    :cond_0
    return-void
.end method
