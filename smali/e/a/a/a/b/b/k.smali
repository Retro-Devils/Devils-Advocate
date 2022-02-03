.class public Le/a/a/a/b/b/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Le/a/a/a/b/a;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field private g:Z

.field private h:J

.field private i:J

.field private j:J

.field private k:Z

.field private l:I

.field private m:Z

.field private n:J

.field private o:J

.field private p:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "+",
            "Le/a/a/a/b/b/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable<",
            "+",
            "Le/a/a/a/b/b/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Le/a/a/a/b/b/k;->p:Ljava/lang/Iterable;

    return-object v0
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Le/a/a/a/b/b/k;->o:J

    return-wide v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Le/a/a/a/b/b/k;->n:J

    return-wide v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Le/a/a/a/b/b/k;->g:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Le/a/a/a/b/b/k;->m:Z

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Le/a/a/a/b/b/k;->e:Z

    return v0
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Le/a/a/a/b/b/k;->f:Z

    return v0
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Le/a/a/a/b/b/k;->k:Z

    return v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le/a/a/a/b/b/k;->a:Ljava/lang/String;

    return-object v0
.end method

.method public j()Z
    .locals 1

    iget-boolean v0, p0, Le/a/a/a/b/b/k;->b:Z

    return v0
.end method

.method public k(J)V
    .locals 0

    iput-wide p1, p0, Le/a/a/a/b/b/k;->j:J

    return-void
.end method

.method public l(Z)V
    .locals 0

    iput-boolean p1, p0, Le/a/a/a/b/b/k;->d:Z

    return-void
.end method

.method public m(Ljava/lang/Iterable;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Le/a/a/a/b/b/n;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_1

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le/a/a/a/b/b/n;

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Le/a/a/a/b/b/k;->p:Ljava/lang/Iterable;

    return-void
.end method

.method public n(J)V
    .locals 0

    iput-wide p1, p0, Le/a/a/a/b/b/k;->n:J

    return-void
.end method

.method public o(J)V
    .locals 0

    iput-wide p1, p0, Le/a/a/a/b/b/k;->h:J

    return-void
.end method

.method public p(Z)V
    .locals 0

    iput-boolean p1, p0, Le/a/a/a/b/b/k;->c:Z

    return-void
.end method

.method public q(Z)V
    .locals 0

    iput-boolean p1, p0, Le/a/a/a/b/b/k;->g:Z

    return-void
.end method

.method public r(Z)V
    .locals 0

    iput-boolean p1, p0, Le/a/a/a/b/b/k;->m:Z

    return-void
.end method

.method public s(Z)V
    .locals 0

    iput-boolean p1, p0, Le/a/a/a/b/b/k;->e:Z

    return-void
.end method

.method public t(Z)V
    .locals 0

    iput-boolean p1, p0, Le/a/a/a/b/b/k;->f:Z

    return-void
.end method

.method public u(Z)V
    .locals 0

    iput-boolean p1, p0, Le/a/a/a/b/b/k;->b:Z

    return-void
.end method

.method public v(Z)V
    .locals 0

    iput-boolean p1, p0, Le/a/a/a/b/b/k;->k:Z

    return-void
.end method

.method public w(J)V
    .locals 0

    iput-wide p1, p0, Le/a/a/a/b/b/k;->i:J

    return-void
.end method

.method public x(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Le/a/a/a/b/b/k;->a:Ljava/lang/String;

    return-void
.end method

.method public y(J)V
    .locals 0

    iput-wide p1, p0, Le/a/a/a/b/b/k;->o:J

    return-void
.end method

.method public z(I)V
    .locals 0

    iput p1, p0, Le/a/a/a/b/b/k;->l:I

    return-void
.end method
