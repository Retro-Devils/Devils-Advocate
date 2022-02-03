.class public Lc/a/a/w/n;
.super Lc/a/a/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/a/n<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final q:Ljava/lang/Object;

.field private r:Lc/a/a/p$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/a/p$b<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;Lc/a/a/p$b;Lc/a/a/p$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lc/a/a/p$b<",
            "Ljava/lang/String;",
            ">;",
            "Lc/a/a/p$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p4}, Lc/a/a/n;-><init>(ILjava/lang/String;Lc/a/a/p$a;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/w/n;->q:Ljava/lang/Object;

    iput-object p3, p0, Lc/a/a/w/n;->r:Lc/a/a/p$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lc/a/a/p$b;Lc/a/a/p$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc/a/a/p$b<",
            "Ljava/lang/String;",
            ">;",
            "Lc/a/a/p$a;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2, p3}, Lc/a/a/w/n;-><init>(ILjava/lang/String;Lc/a/a/p$b;Lc/a/a/p$a;)V

    return-void
.end method


# virtual methods
.method protected F(Lc/a/a/k;)Lc/a/a/p;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/k;",
            ")",
            "Lc/a/a/p<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p1, Lc/a/a/k;->b:[B

    iget-object v2, p1, Lc/a/a/k;->c:Ljava/util/Map;

    invoke-static {v2}, Lc/a/a/w/g;->d(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p1, Lc/a/a/k;->b:[B

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    :goto_0
    invoke-static {p1}, Lc/a/a/w/g;->c(Lc/a/a/k;)Lc/a/a/b$a;

    move-result-object p1

    invoke-static {v0, p1}, Lc/a/a/p;->c(Ljava/lang/Object;Lc/a/a/b$a;)Lc/a/a/p;

    move-result-object p1

    return-object p1
.end method

.method protected O(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lc/a/a/w/n;->q:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc/a/a/w/n;->r:Lc/a/a/p$b;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lc/a/a/p$b;->a(Ljava/lang/Object;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method protected bridge synthetic e(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lc/a/a/w/n;->O(Ljava/lang/String;)V

    return-void
.end method
