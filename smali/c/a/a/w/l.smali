.class public abstract Lc/a/a/w/l;
.super Lc/a/a/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lc/a/a/n<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final q:Ljava/lang/String;


# instance fields
.field private final r:Ljava/lang/Object;

.field private s:Lc/a/a/p$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/a/p$b<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final t:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-string v2, "utf-8"

    aput-object v2, v0, v1

    const-string v1, "application/json; charset=%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc/a/a/w/l;->q:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Lc/a/a/p$b;Lc/a/a/p$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lc/a/a/p$b<",
            "TT;>;",
            "Lc/a/a/p$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p5}, Lc/a/a/n;-><init>(ILjava/lang/String;Lc/a/a/p$a;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/w/l;->r:Ljava/lang/Object;

    iput-object p4, p0, Lc/a/a/w/l;->s:Lc/a/a/p$b;

    iput-object p3, p0, Lc/a/a/w/l;->t:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected e(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lc/a/a/w/l;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc/a/a/w/l;->s:Lc/a/a/p$b;

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

.method public i()[B
    .locals 5

    const-string v0, "utf-8"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lc/a/a/w/l;->t:Ljava/lang/String;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v1

    :catch_0
    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lc/a/a/w/l;->t:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const-string v0, "Unsupported Encoding while trying to get the bytes of %s using %s"

    invoke-static {v0, v2}, Lc/a/a/v;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1
.end method

.method public j()Ljava/lang/String;
    .locals 1

    sget-object v0, Lc/a/a/w/l;->q:Ljava/lang/String;

    return-object v0
.end method

.method public q()[B
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lc/a/a/w/l;->i()[B

    move-result-object v0

    return-object v0
.end method

.method public r()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lc/a/a/w/l;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
