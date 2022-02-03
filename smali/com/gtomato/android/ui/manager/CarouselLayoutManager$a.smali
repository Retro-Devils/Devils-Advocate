.class Lcom/gtomato/android/ui/manager/CarouselLayoutManager$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->d1(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/Queue;

.field final synthetic c:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;


# direct methods
.method constructor <init>(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;Ljava/util/Queue;)V
    .locals 0

    iput-object p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$a;->c:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    iput-object p2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$a;->b:Ljava/util/Queue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    :goto_0
    iget-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$a;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$a;->b:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    return-void
.end method
