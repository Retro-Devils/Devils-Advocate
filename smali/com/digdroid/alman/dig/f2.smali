.class Lcom/digdroid/alman/dig/f2;
.super Lcom/gtomato/android/ui/manager/CarouselLayoutManager;
.source ""


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;-><init>()V

    return-void
.end method


# virtual methods
.method public Y1(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V
    .locals 1

    const-class v0, Lcom/digdroid/alman/dig/w1;

    monitor-enter v0

    :try_start_0
    invoke-super {p0, p1, p2}, Lcom/gtomato/android/ui/manager/CarouselLayoutManager;->Y1(Landroidx/recyclerview/widget/RecyclerView$v;Landroidx/recyclerview/widget/RecyclerView$a0;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
