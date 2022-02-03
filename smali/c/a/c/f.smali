.class public Lc/a/c/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/c/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/a/c/f$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lc/a/c/f$a;

    invoke-direct {v0, p0, p1}, Lc/a/c/f$a;-><init>(Lc/a/c/f;Landroid/os/Handler;)V

    iput-object v0, p0, Lc/a/c/f;->a:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a(Lc/a/c/n;Lc/a/c/u;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/c/n<",
            "*>;",
            "Lc/a/c/u;",
            ")V"
        }
    .end annotation

    const-string v0, "post-error"

    invoke-virtual {p1, v0}, Lc/a/c/n;->b(Ljava/lang/String;)V

    invoke-static {p2}, Lc/a/c/p;->a(Lc/a/c/u;)Lc/a/c/p;

    move-result-object p2

    iget-object v0, p0, Lc/a/c/f;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lc/a/c/f$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lc/a/c/f$b;-><init>(Lc/a/c/n;Lc/a/c/p;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lc/a/c/n;Lc/a/c/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/c/n<",
            "*>;",
            "Lc/a/c/p<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lc/a/c/f;->c(Lc/a/c/n;Lc/a/c/p;Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Lc/a/c/n;Lc/a/c/p;Ljava/lang/Runnable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/c/n<",
            "*>;",
            "Lc/a/c/p<",
            "*>;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lc/a/c/n;->B()V

    const-string v0, "post-response"

    invoke-virtual {p1, v0}, Lc/a/c/n;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lc/a/c/f;->a:Ljava/util/concurrent/Executor;

    new-instance v1, Lc/a/c/f$b;

    invoke-direct {v1, p1, p2, p3}, Lc/a/c/f$b;-><init>(Lc/a/c/n;Lc/a/c/p;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
