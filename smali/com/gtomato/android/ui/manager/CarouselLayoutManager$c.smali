.class Lcom/gtomato/android/ui/manager/CarouselLayoutManager$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->X1(ILc/c/a/b/a;Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;


# direct methods
.method constructor <init>(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;I)V
    .locals 0

    iput-object p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$c;->c:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    iput p2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$c;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 4

    iget-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$c;->c:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-static {v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->V1(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)Lc/c/a/a/c/a$h;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$c;->c:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-static {v0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->V1(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)Lc/c/a/a/c/a$h;

    move-result-object v0

    const/4 v1, 0x0

    iget v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$c;->b:I

    iget-object v3, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$c;->c:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    invoke-virtual {v3, v2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->B2(I)I

    move-result v3

    invoke-interface {v0, v1, p1, v2, v3}, Lc/c/a/a/c/a$h;->a(Landroidx/recyclerview/widget/RecyclerView$g;Landroid/view/View;II)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
