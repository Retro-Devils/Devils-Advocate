.class Lcom/digdroid/alman/dig/e2$o;
.super Landroidx/recyclerview/widget/RecyclerView$t;
.source ""


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

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2$o;->a:Lcom/digdroid/alman/dig/e2;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$t;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$o;->a:Lcom/digdroid/alman/dig/e2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/e2;->j:Lcom/digdroid/alman/dig/MyRecyclerView;

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$t;->a(Landroidx/recyclerview/widget/RecyclerView;I)V

    const/4 p1, 0x0

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2$o;->a:Lcom/digdroid/alman/dig/e2;

    iget-object v0, p2, Lcom/digdroid/alman/dig/e2;->d:Lcom/digdroid/alman/dig/e2$x;

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result p2

    invoke-interface {v0, p1, p2}, Lcom/digdroid/alman/dig/e2$x;->a(Landroid/view/View;I)V

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$o;->a:Lcom/digdroid/alman/dig/e2;

    iget-boolean p2, p1, Lcom/digdroid/alman/dig/e2;->w:Z

    if-eqz p2, :cond_2

    const/4 p2, 0x0

    iput-boolean p2, p1, Lcom/digdroid/alman/dig/e2;->w:Z

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    if-ne p2, v0, :cond_2

    iget-object p2, p0, Lcom/digdroid/alman/dig/e2$o;->a:Lcom/digdroid/alman/dig/e2;

    iget-object v0, p2, Lcom/digdroid/alman/dig/e2;->d:Lcom/digdroid/alman/dig/e2$x;

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result p2

    invoke-interface {v0, p1, p2}, Lcom/digdroid/alman/dig/e2$x;->a(Landroid/view/View;I)V

    :cond_2
    :goto_0
    return-void
.end method
