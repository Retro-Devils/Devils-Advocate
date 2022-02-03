.class Lcom/digdroid/alman/dig/e2$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/c/a/a/c/a$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/e2;->t(Lcom/digdroid/alman/dig/e2$v;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/e2$v;

.field final synthetic b:Lcom/digdroid/alman/dig/e2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/e2;Lcom/digdroid/alman/dig/e2$v;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2$b;->b:Lcom/digdroid/alman/dig/e2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/e2$b;->a:Lcom/digdroid/alman/dig/e2$v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView$g;Landroid/view/View;II)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$b;->a:Lcom/digdroid/alman/dig/e2$v;

    iget-object p4, p0, Lcom/digdroid/alman/dig/e2$b;->b:Lcom/digdroid/alman/dig/e2;

    iget-object p4, p4, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {p4}, Lcom/digdroid/alman/dig/e2$s;->l()Z

    move-result p4

    if-eqz p4, :cond_0

    move p4, p3

    goto :goto_0

    :cond_0
    iget-object p4, p0, Lcom/digdroid/alman/dig/e2$b;->b:Lcom/digdroid/alman/dig/e2;

    iget-object p4, p4, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-virtual {p4}, Lc/c/a/a/c/a;->getCurrentPosition()I

    move-result p4

    :goto_0
    invoke-interface {p1, p2, p4}, Lcom/digdroid/alman/dig/e2$v;->a(Landroid/view/View;I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$b;->b:Lcom/digdroid/alman/dig/e2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/e2;->a:Lcom/digdroid/alman/dig/e2$s;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/e2$s;->l()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$b;->b:Lcom/digdroid/alman/dig/e2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-virtual {p1}, Lc/c/a/a/c/a;->getCurrentPosition()I

    move-result p1

    if-eq p1, p3, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/e2$b;->b:Lcom/digdroid/alman/dig/e2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/e2;->i:Lcom/digdroid/alman/dig/MyCarouselView;

    invoke-virtual {p1}, Lc/c/a/a/c/a;->getCurrentPosition()I

    move-result p2

    invoke-virtual {p1, p2}, Lc/c/a/a/c/a;->k1(I)V

    :cond_1
    return-void
.end method
