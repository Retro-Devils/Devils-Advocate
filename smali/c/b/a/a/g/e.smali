.class public Lc/b/a/a/g/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Lc/b/a/a/g/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/b/a/a/g/n<",
            "TTResult;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lc/b/a/a/g/n;

    invoke-direct {v0}, Lc/b/a/a/g/n;-><init>()V

    iput-object v0, p0, Lc/b/a/a/g/e;->a:Lc/b/a/a/g/n;

    return-void
.end method


# virtual methods
.method public a()Lc/b/a/a/g/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc/b/a/a/g/d<",
            "TTResult;>;"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/g/e;->a:Lc/b/a/a/g/n;

    return-object v0
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lc/b/a/a/g/e;->a:Lc/b/a/a/g/n;

    invoke-virtual {v0, p1}, Lc/b/a/a/g/n;->i(Ljava/lang/Exception;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)V"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/g/e;->a:Lc/b/a/a/g/n;

    invoke-virtual {v0, p1}, Lc/b/a/a/g/n;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public d(Ljava/lang/Exception;)Z
    .locals 1

    iget-object v0, p0, Lc/b/a/a/g/e;->a:Lc/b/a/a/g/n;

    invoke-virtual {v0, p1}, Lc/b/a/a/g/n;->k(Ljava/lang/Exception;)Z

    move-result p1

    return p1
.end method

.method public e(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTResult;)Z"
        }
    .end annotation

    iget-object v0, p0, Lc/b/a/a/g/e;->a:Lc/b/a/a/g/n;

    invoke-virtual {v0, p1}, Lc/b/a/a/g/n;->l(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
