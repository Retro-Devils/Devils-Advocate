.class Lcom/gtomato/android/ui/manager/CarouselLayoutManager$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->Q1(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroidx/recyclerview/widget/RecyclerView;

.field final synthetic c:Landroidx/recyclerview/widget/RecyclerView$a0;

.field final synthetic d:I

.field final synthetic e:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;


# direct methods
.method constructor <init>(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;I)V
    .locals 0

    iput-object p1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$e;->e:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    iput-object p2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$e;->b:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p3, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$e;->c:Landroidx/recyclerview/widget/RecyclerView$a0;

    iput p4, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$e;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$e;->e:Lcom/gtomato/android/ui/manager/CarouselLayoutManager;

    iget-object v1, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$e;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$e;->c:Landroidx/recyclerview/widget/RecyclerView$a0;

    iget v3, p0, Lcom/gtomato/android/ui/manager/CarouselLayoutManager$e;->d:I

    invoke-virtual {v0, v1, v2, v3}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->Q1(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$a0;I)V

    return-void
.end method
