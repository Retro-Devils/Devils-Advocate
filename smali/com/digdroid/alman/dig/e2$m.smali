.class Lcom/digdroid/alman/dig/e2$m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/e2;-><init>(Lcom/digdroid/alman/dig/MainActivity;Landroid/view/View;Ljava/lang/String;Lcom/digdroid/alman/dig/e2$s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/e2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/e2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2$m;->a:Lcom/digdroid/alman/dig/e2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$m;->a:Lcom/digdroid/alman/dig/e2;

    iput p2, p1, Lcom/digdroid/alman/dig/e2;->x:I

    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$m;->a:Lcom/digdroid/alman/dig/e2;

    iget-object p2, p1, Lcom/digdroid/alman/dig/e2;->h:Landroid/widget/AbsListView;

    invoke-virtual {p2}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result p2

    iput p2, p1, Lcom/digdroid/alman/dig/e2;->x:I

    return-void
.end method
