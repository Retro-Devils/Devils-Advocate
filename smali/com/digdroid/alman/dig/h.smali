.class abstract Lcom/digdroid/alman/dig/h;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/h$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$g<",
        "Landroidx/recyclerview/widget/RecyclerView$d0;",
        ">;"
    }
.end annotation


# instance fields
.field c:Lcom/digdroid/alman/dig/s3;

.field d:Landroid/database/Cursor;

.field e:I

.field f:I

.field g:F

.field h:F

.field i:Lcom/digdroid/alman/dig/e2$v;

.field j:Lcom/digdroid/alman/dig/e2$w;

.field k:Lcom/digdroid/alman/dig/h$c;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FF)V
    .locals 4

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/digdroid/alman/dig/h;->e:I

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/digdroid/alman/dig/h;->i:Lcom/digdroid/alman/dig/e2$v;

    iput-object v1, p0, Lcom/digdroid/alman/dig/h;->j:Lcom/digdroid/alman/dig/e2$w;

    iput-object v1, p0, Lcom/digdroid/alman/dig/h;->k:Lcom/digdroid/alman/dig/h$c;

    const-class v1, Lcom/digdroid/alman/dig/w1;

    monitor-enter v1

    :try_start_0
    iput-object p2, p0, Lcom/digdroid/alman/dig/h;->c:Lcom/digdroid/alman/dig/s3;

    iput-object p3, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    invoke-interface {p3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p3}, Landroid/database/Cursor;->getCount()I

    move-result p2

    iput p2, p0, Lcom/digdroid/alman/dig/h;->e:I

    goto :goto_0

    :cond_0
    iput v0, p0, Lcom/digdroid/alman/dig/h;->e:I

    :goto_0
    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/a4;->g(Z)Landroid/graphics/Point;

    move-result-object p1

    iget p2, p1, Landroid/graphics/Point;->x:I

    iget p1, p1, Landroid/graphics/Point;->y:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-le p2, p1, :cond_1

    int-to-double p1, p1

    const-wide/high16 v2, 0x4004000000000000L    # 2.5

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p1, v2

    :try_start_1
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    :goto_1
    long-to-int p2, p1

    iput p2, p0, Lcom/digdroid/alman/dig/h;->f:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_1
    int-to-double p1, p2

    const-wide/high16 v2, 0x400c000000000000L    # 3.5

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr p1, v2

    :try_start_2
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    goto :goto_1

    :goto_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iput p4, p0, Lcom/digdroid/alman/dig/h;->g:F

    iput p5, p0, Lcom/digdroid/alman/dig/h;->h:F

    return-void

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method


# virtual methods
.method public c()I
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/w1;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/digdroid/alman/dig/h;->e:I

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public u(Landroid/database/Cursor;)V
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/w1;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_0
    iput-object p1, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/h;->e:I

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    iput p1, p0, Lcom/digdroid/alman/dig/h;->e:I

    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/h;->k:Lcom/digdroid/alman/dig/h$c;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    invoke-interface {p1, v1}, Lcom/digdroid/alman/dig/h$c;->a(Landroid/database/Cursor;)V

    :cond_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->h()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public v()V
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/w1;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->isClosed()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    const/4 v1, 0x0

    iput v1, p0, Lcom/digdroid/alman/dig/h;->e:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public w()Landroid/database/Cursor;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    return-object v0
.end method

.method public x(Lcom/digdroid/alman/dig/e2$v;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/h;->i:Lcom/digdroid/alman/dig/e2$v;

    return-void
.end method

.method protected y(Landroid/view/View;I)V
    .locals 1

    new-instance v0, Lcom/digdroid/alman/dig/h$a;

    invoke-direct {v0, p0, p2}, Lcom/digdroid/alman/dig/h$a;-><init>(Lcom/digdroid/alman/dig/h;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Lcom/digdroid/alman/dig/h$b;

    invoke-direct {v0, p0, p2}, Lcom/digdroid/alman/dig/h$b;-><init>(Lcom/digdroid/alman/dig/h;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public z(Lcom/digdroid/alman/dig/e2$w;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/h;->j:Lcom/digdroid/alman/dig/e2$w;

    return-void
.end method
