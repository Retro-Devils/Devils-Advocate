.class final Lc/b/a/a/g/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lc/b/a/a/g/d;

.field private final synthetic c:Lc/b/a/a/g/g;


# direct methods
.method constructor <init>(Lc/b/a/a/g/g;Lc/b/a/a/g/d;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/a/g/h;->c:Lc/b/a/a/g/g;

    iput-object p2, p0, Lc/b/a/a/g/h;->b:Lc/b/a/a/g/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc/b/a/a/g/h;->c:Lc/b/a/a/g/g;

    invoke-static {v0}, Lc/b/a/a/g/g;->b(Lc/b/a/a/g/g;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lc/b/a/a/g/h;->c:Lc/b/a/a/g/g;

    invoke-static {v1}, Lc/b/a/a/g/g;->c(Lc/b/a/a/g/g;)Lc/b/a/a/g/a;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lc/b/a/a/g/h;->c:Lc/b/a/a/g/g;

    invoke-static {v1}, Lc/b/a/a/g/g;->c(Lc/b/a/a/g/g;)Lc/b/a/a/g/a;

    move-result-object v1

    iget-object v2, p0, Lc/b/a/a/g/h;->b:Lc/b/a/a/g/d;

    invoke-virtual {v2}, Lc/b/a/a/g/d;->e()Ljava/lang/Exception;

    move-result-object v2

    invoke-interface {v1, v2}, Lc/b/a/a/g/a;->a(Ljava/lang/Exception;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
