.class Lcom/bumptech/glide/load/o/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/bumptech/glide/load/o/f$a;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Lcom/bumptech/glide/t/l/a$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/load/o/h$h;,
        Lcom/bumptech/glide/load/o/h$g;,
        Lcom/bumptech/glide/load/o/h$e;,
        Lcom/bumptech/glide/load/o/h$b;,
        Lcom/bumptech/glide/load/o/h$d;,
        Lcom/bumptech/glide/load/o/h$f;,
        Lcom/bumptech/glide/load/o/h$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/o/f$a;",
        "Ljava/lang/Runnable;",
        "Ljava/lang/Comparable<",
        "Lcom/bumptech/glide/load/o/h<",
        "*>;>;",
        "Lcom/bumptech/glide/t/l/a$f;"
    }
.end annotation


# instance fields
.field private A:Ljava/lang/Object;

.field private B:Lcom/bumptech/glide/load/a;

.field private C:Lcom/bumptech/glide/load/n/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/n/d<",
            "*>;"
        }
    .end annotation
.end field

.field private volatile D:Lcom/bumptech/glide/load/o/f;

.field private volatile E:Z

.field private volatile F:Z

.field private final b:Lcom/bumptech/glide/load/o/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/o/g<",
            "TR;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/bumptech/glide/t/l/c;

.field private final e:Lcom/bumptech/glide/load/o/h$e;

.field private final f:Lb/g/j/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/g/j/f<",
            "Lcom/bumptech/glide/load/o/h<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final g:Lcom/bumptech/glide/load/o/h$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/o/h$d<",
            "*>;"
        }
    .end annotation
.end field

.field private final h:Lcom/bumptech/glide/load/o/h$f;

.field private i:Lcom/bumptech/glide/e;

.field private j:Lcom/bumptech/glide/load/g;

.field private k:Lcom/bumptech/glide/g;

.field private l:Lcom/bumptech/glide/load/o/n;

.field private m:I

.field private n:I

.field private o:Lcom/bumptech/glide/load/o/j;

.field private p:Lcom/bumptech/glide/load/i;

.field private q:Lcom/bumptech/glide/load/o/h$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/o/h$b<",
            "TR;>;"
        }
    .end annotation
.end field

.field private r:I

.field private s:Lcom/bumptech/glide/load/o/h$h;

.field private t:Lcom/bumptech/glide/load/o/h$g;

.field private u:J

.field private v:Z

.field private w:Ljava/lang/Object;

.field private x:Ljava/lang/Thread;

.field private y:Lcom/bumptech/glide/load/g;

.field private z:Lcom/bumptech/glide/load/g;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/load/o/h$e;Lb/g/j/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/o/h$e;",
            "Lb/g/j/f<",
            "Lcom/bumptech/glide/load/o/h<",
            "*>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/bumptech/glide/load/o/g;

    invoke-direct {v0}, Lcom/bumptech/glide/load/o/g;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/o/h;->b:Lcom/bumptech/glide/load/o/g;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/o/h;->c:Ljava/util/List;

    invoke-static {}, Lcom/bumptech/glide/t/l/c;->a()Lcom/bumptech/glide/t/l/c;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/o/h;->d:Lcom/bumptech/glide/t/l/c;

    new-instance v0, Lcom/bumptech/glide/load/o/h$d;

    invoke-direct {v0}, Lcom/bumptech/glide/load/o/h$d;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/o/h;->g:Lcom/bumptech/glide/load/o/h$d;

    new-instance v0, Lcom/bumptech/glide/load/o/h$f;

    invoke-direct {v0}, Lcom/bumptech/glide/load/o/h$f;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/load/o/h;->h:Lcom/bumptech/glide/load/o/h$f;

    iput-object p1, p0, Lcom/bumptech/glide/load/o/h;->e:Lcom/bumptech/glide/load/o/h$e;

    iput-object p2, p0, Lcom/bumptech/glide/load/o/h;->f:Lb/g/j/f;

    return-void
.end method

.method private A()V
    .locals 3

    sget-object v0, Lcom/bumptech/glide/load/o/h$a;->a:[I

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->t:Lcom/bumptech/glide/load/o/h$g;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->i()V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized run reason: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/bumptech/glide/load/o/h;->t:Lcom/bumptech/glide/load/o/h$g;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object v0, Lcom/bumptech/glide/load/o/h$h;->b:Lcom/bumptech/glide/load/o/h$h;

    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/o/h;->k(Lcom/bumptech/glide/load/o/h$h;)Lcom/bumptech/glide/load/o/h$h;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/o/h;->s:Lcom/bumptech/glide/load/o/h$h;

    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->j()Lcom/bumptech/glide/load/o/f;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/o/h;->D:Lcom/bumptech/glide/load/o/f;

    :cond_2
    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->y()V

    :goto_0
    return-void
.end method

.method private B()V
    .locals 3

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->d:Lcom/bumptech/glide/t/l/c;

    invoke-virtual {v0}, Lcom/bumptech/glide/t/l/c;->c()V

    iget-boolean v0, p0, Lcom/bumptech/glide/load/o/h;->E:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Already notified"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    iput-boolean v1, p0, Lcom/bumptech/glide/load/o/h;->E:Z

    return-void
.end method

.method private g(Lcom/bumptech/glide/load/n/d;Ljava/lang/Object;Lcom/bumptech/glide/load/a;)Lcom/bumptech/glide/load/o/v;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/load/n/d<",
            "*>;TData;",
            "Lcom/bumptech/glide/load/a;",
            ")",
            "Lcom/bumptech/glide/load/o/v<",
            "TR;>;"
        }
    .end annotation

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-interface {p1}, Lcom/bumptech/glide/load/n/d;->b()V

    return-object p2

    :cond_0
    :try_start_0
    invoke-static {}, Lcom/bumptech/glide/t/f;->b()J

    move-result-wide v0

    invoke-direct {p0, p2, p3}, Lcom/bumptech/glide/load/o/h;->h(Ljava/lang/Object;Lcom/bumptech/glide/load/a;)Lcom/bumptech/glide/load/o/v;

    move-result-object p2

    const-string p3, "DecodeJob"

    const/4 v2, 0x2

    invoke-static {p3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Decoded result "

    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0, p3, v0, v1}, Lcom/bumptech/glide/load/o/h;->o(Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    invoke-interface {p1}, Lcom/bumptech/glide/load/n/d;->b()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Lcom/bumptech/glide/load/n/d;->b()V

    throw p2
.end method

.method private h(Ljava/lang/Object;Lcom/bumptech/glide/load/a;)Lcom/bumptech/glide/load/o/v;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            ">(TData;",
            "Lcom/bumptech/glide/load/a;",
            ")",
            "Lcom/bumptech/glide/load/o/v<",
            "TR;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->b:Lcom/bumptech/glide/load/o/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/load/o/g;->h(Ljava/lang/Class;)Lcom/bumptech/glide/load/o/t;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/bumptech/glide/load/o/h;->z(Ljava/lang/Object;Lcom/bumptech/glide/load/a;Lcom/bumptech/glide/load/o/t;)Lcom/bumptech/glide/load/o/v;

    move-result-object p1

    return-object p1
.end method

.method private i()V
    .locals 4

    const-string v0, "DecodeJob"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/bumptech/glide/load/o/h;->u:J

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "data: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/bumptech/glide/load/o/h;->A:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", cache key: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/bumptech/glide/load/o/h;->y:Lcom/bumptech/glide/load/g;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", fetcher: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/bumptech/glide/load/o/h;->C:Lcom/bumptech/glide/load/n/d;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Retrieved data"

    invoke-direct {p0, v3, v0, v1, v2}, Lcom/bumptech/glide/load/o/h;->p(Ljava/lang/String;JLjava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->C:Lcom/bumptech/glide/load/n/d;

    iget-object v2, p0, Lcom/bumptech/glide/load/o/h;->A:Ljava/lang/Object;

    iget-object v3, p0, Lcom/bumptech/glide/load/o/h;->B:Lcom/bumptech/glide/load/a;

    invoke-direct {p0, v1, v2, v3}, Lcom/bumptech/glide/load/o/h;->g(Lcom/bumptech/glide/load/n/d;Ljava/lang/Object;Lcom/bumptech/glide/load/a;)Lcom/bumptech/glide/load/o/v;

    move-result-object v0
    :try_end_0
    .catch Lcom/bumptech/glide/load/o/q; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    iget-object v2, p0, Lcom/bumptech/glide/load/o/h;->z:Lcom/bumptech/glide/load/g;

    iget-object v3, p0, Lcom/bumptech/glide/load/o/h;->B:Lcom/bumptech/glide/load/a;

    invoke-virtual {v1, v2, v3}, Lcom/bumptech/glide/load/o/q;->i(Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/a;)V

    iget-object v2, p0, Lcom/bumptech/glide/load/o/h;->c:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->B:Lcom/bumptech/glide/load/a;

    invoke-direct {p0, v0, v1}, Lcom/bumptech/glide/load/o/h;->r(Lcom/bumptech/glide/load/o/v;Lcom/bumptech/glide/load/a;)V

    goto :goto_1

    :cond_1
    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->y()V

    :goto_1
    return-void
.end method

.method private j()Lcom/bumptech/glide/load/o/f;
    .locals 3

    sget-object v0, Lcom/bumptech/glide/load/o/h$a;->b:[I

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->s:Lcom/bumptech/glide/load/o/h$h;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized stage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/bumptech/glide/load/o/h;->s:Lcom/bumptech/glide/load/o/h$h;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/bumptech/glide/load/o/z;

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->b:Lcom/bumptech/glide/load/o/g;

    invoke-direct {v0, v1, p0}, Lcom/bumptech/glide/load/o/z;-><init>(Lcom/bumptech/glide/load/o/g;Lcom/bumptech/glide/load/o/f$a;)V

    return-object v0

    :cond_2
    new-instance v0, Lcom/bumptech/glide/load/o/c;

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->b:Lcom/bumptech/glide/load/o/g;

    invoke-direct {v0, v1, p0}, Lcom/bumptech/glide/load/o/c;-><init>(Lcom/bumptech/glide/load/o/g;Lcom/bumptech/glide/load/o/f$a;)V

    return-object v0

    :cond_3
    new-instance v0, Lcom/bumptech/glide/load/o/w;

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->b:Lcom/bumptech/glide/load/o/g;

    invoke-direct {v0, v1, p0}, Lcom/bumptech/glide/load/o/w;-><init>(Lcom/bumptech/glide/load/o/g;Lcom/bumptech/glide/load/o/f$a;)V

    return-object v0
.end method

.method private k(Lcom/bumptech/glide/load/o/h$h;)Lcom/bumptech/glide/load/o/h$h;
    .locals 3

    sget-object v0, Lcom/bumptech/glide/load/o/h$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    iget-object p1, p0, Lcom/bumptech/glide/load/o/h;->o:Lcom/bumptech/glide/load/o/j;

    invoke-virtual {p1}, Lcom/bumptech/glide/load/o/j;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lcom/bumptech/glide/load/o/h$h;->c:Lcom/bumptech/glide/load/o/h$h;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/bumptech/glide/load/o/h$h;->c:Lcom/bumptech/glide/load/o/h$h;

    invoke-direct {p0, p1}, Lcom/bumptech/glide/load/o/h;->k(Lcom/bumptech/glide/load/o/h$h;)Lcom/bumptech/glide/load/o/h$h;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unrecognized stage: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object p1, Lcom/bumptech/glide/load/o/h$h;->g:Lcom/bumptech/glide/load/o/h$h;

    return-object p1

    :cond_3
    iget-boolean p1, p0, Lcom/bumptech/glide/load/o/h;->v:Z

    if-eqz p1, :cond_4

    sget-object p1, Lcom/bumptech/glide/load/o/h$h;->g:Lcom/bumptech/glide/load/o/h$h;

    goto :goto_1

    :cond_4
    sget-object p1, Lcom/bumptech/glide/load/o/h$h;->e:Lcom/bumptech/glide/load/o/h$h;

    :goto_1
    return-object p1

    :cond_5
    iget-object p1, p0, Lcom/bumptech/glide/load/o/h;->o:Lcom/bumptech/glide/load/o/j;

    invoke-virtual {p1}, Lcom/bumptech/glide/load/o/j;->a()Z

    move-result p1

    if-eqz p1, :cond_6

    sget-object p1, Lcom/bumptech/glide/load/o/h$h;->d:Lcom/bumptech/glide/load/o/h$h;

    goto :goto_2

    :cond_6
    sget-object p1, Lcom/bumptech/glide/load/o/h$h;->d:Lcom/bumptech/glide/load/o/h$h;

    invoke-direct {p0, p1}, Lcom/bumptech/glide/load/o/h;->k(Lcom/bumptech/glide/load/o/h$h;)Lcom/bumptech/glide/load/o/h$h;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method private l(Lcom/bumptech/glide/load/a;)Lcom/bumptech/glide/load/i;
    .locals 3

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->p:Lcom/bumptech/glide/load/i;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1a

    if-ge v1, v2, :cond_0

    return-object v0

    :cond_0
    sget-object v1, Lcom/bumptech/glide/load/a;->e:Lcom/bumptech/glide/load/a;

    if-eq p1, v1, :cond_2

    iget-object p1, p0, Lcom/bumptech/glide/load/o/h;->b:Lcom/bumptech/glide/load/o/g;

    invoke-virtual {p1}, Lcom/bumptech/glide/load/o/g;->w()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    sget-object v1, Lcom/bumptech/glide/load/q/d/m;->e:Lcom/bumptech/glide/load/h;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/load/i;->c(Lcom/bumptech/glide/load/h;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz p1, :cond_4

    :cond_3
    return-object v0

    :cond_4
    new-instance v0, Lcom/bumptech/glide/load/i;

    invoke-direct {v0}, Lcom/bumptech/glide/load/i;-><init>()V

    iget-object v2, p0, Lcom/bumptech/glide/load/o/h;->p:Lcom/bumptech/glide/load/i;

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/load/i;->d(Lcom/bumptech/glide/load/i;)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/bumptech/glide/load/i;->e(Lcom/bumptech/glide/load/h;Ljava/lang/Object;)Lcom/bumptech/glide/load/i;

    return-object v0
.end method

.method private m()I
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->k:Lcom/bumptech/glide/g;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method private o(Ljava/lang/String;J)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/bumptech/glide/load/o/h;->p(Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method private p(Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, p3}, Lcom/bumptech/glide/t/f;->a(J)D

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, ", load key: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/bumptech/glide/load/o/h;->l:Lcom/bumptech/glide/load/o/n;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, ", "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", thread: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "DecodeJob"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private q(Lcom/bumptech/glide/load/o/v;Lcom/bumptech/glide/load/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/o/v<",
            "TR;>;",
            "Lcom/bumptech/glide/load/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->B()V

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->q:Lcom/bumptech/glide/load/o/h$b;

    invoke-interface {v0, p1, p2}, Lcom/bumptech/glide/load/o/h$b;->d(Lcom/bumptech/glide/load/o/v;Lcom/bumptech/glide/load/a;)V

    return-void
.end method

.method private r(Lcom/bumptech/glide/load/o/v;Lcom/bumptech/glide/load/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/o/v<",
            "TR;>;",
            "Lcom/bumptech/glide/load/a;",
            ")V"
        }
    .end annotation

    instance-of v0, p1, Lcom/bumptech/glide/load/o/r;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/bumptech/glide/load/o/r;

    invoke-interface {v0}, Lcom/bumptech/glide/load/o/r;->a()V

    :cond_0
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->g:Lcom/bumptech/glide/load/o/h$d;

    invoke-virtual {v1}, Lcom/bumptech/glide/load/o/h$d;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p1}, Lcom/bumptech/glide/load/o/u;->g(Lcom/bumptech/glide/load/o/v;)Lcom/bumptech/glide/load/o/u;

    move-result-object p1

    move-object v0, p1

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/bumptech/glide/load/o/h;->q(Lcom/bumptech/glide/load/o/v;Lcom/bumptech/glide/load/a;)V

    sget-object p1, Lcom/bumptech/glide/load/o/h$h;->f:Lcom/bumptech/glide/load/o/h$h;

    iput-object p1, p0, Lcom/bumptech/glide/load/o/h;->s:Lcom/bumptech/glide/load/o/h$h;

    :try_start_0
    iget-object p1, p0, Lcom/bumptech/glide/load/o/h;->g:Lcom/bumptech/glide/load/o/h$d;

    invoke-virtual {p1}, Lcom/bumptech/glide/load/o/h$d;->c()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/bumptech/glide/load/o/h;->g:Lcom/bumptech/glide/load/o/h$d;

    iget-object p2, p0, Lcom/bumptech/glide/load/o/h;->e:Lcom/bumptech/glide/load/o/h$e;

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->p:Lcom/bumptech/glide/load/i;

    invoke-virtual {p1, p2, v1}, Lcom/bumptech/glide/load/o/h$d;->b(Lcom/bumptech/glide/load/o/h$e;Lcom/bumptech/glide/load/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/bumptech/glide/load/o/u;->i()V

    :cond_3
    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->t()V

    return-void

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/bumptech/glide/load/o/u;->i()V

    :cond_4
    throw p1
.end method

.method private s()V
    .locals 3

    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->B()V

    new-instance v0, Lcom/bumptech/glide/load/o/q;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/bumptech/glide/load/o/h;->c:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v2, "Failed to load resource"

    invoke-direct {v0, v2, v1}, Lcom/bumptech/glide/load/o/q;-><init>(Ljava/lang/String;Ljava/util/List;)V

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->q:Lcom/bumptech/glide/load/o/h$b;

    invoke-interface {v1, v0}, Lcom/bumptech/glide/load/o/h$b;->a(Lcom/bumptech/glide/load/o/q;)V

    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->u()V

    return-void
.end method

.method private t()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->h:Lcom/bumptech/glide/load/o/h$f;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/o/h$f;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->x()V

    :cond_0
    return-void
.end method

.method private u()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->h:Lcom/bumptech/glide/load/o/h$f;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/o/h$f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->x()V

    :cond_0
    return-void
.end method

.method private x()V
    .locals 4

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->h:Lcom/bumptech/glide/load/o/h$f;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/o/h$f;->e()V

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->g:Lcom/bumptech/glide/load/o/h$d;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/o/h$d;->a()V

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->b:Lcom/bumptech/glide/load/o/g;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/o/g;->a()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/bumptech/glide/load/o/h;->E:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->i:Lcom/bumptech/glide/e;

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->j:Lcom/bumptech/glide/load/g;

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->p:Lcom/bumptech/glide/load/i;

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->k:Lcom/bumptech/glide/g;

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->l:Lcom/bumptech/glide/load/o/n;

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->q:Lcom/bumptech/glide/load/o/h$b;

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->s:Lcom/bumptech/glide/load/o/h$h;

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->D:Lcom/bumptech/glide/load/o/f;

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->x:Ljava/lang/Thread;

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->y:Lcom/bumptech/glide/load/g;

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->A:Ljava/lang/Object;

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->B:Lcom/bumptech/glide/load/a;

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->C:Lcom/bumptech/glide/load/n/d;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lcom/bumptech/glide/load/o/h;->u:J

    iput-boolean v0, p0, Lcom/bumptech/glide/load/o/h;->F:Z

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->w:Ljava/lang/Object;

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->f:Lb/g/j/f;

    invoke-interface {v0, p0}, Lb/g/j/f;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method private y()V
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/o/h;->x:Ljava/lang/Thread;

    invoke-static {}, Lcom/bumptech/glide/t/f;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/bumptech/glide/load/o/h;->u:J

    const/4 v0, 0x0

    :cond_0
    iget-boolean v1, p0, Lcom/bumptech/glide/load/o/h;->F:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->D:Lcom/bumptech/glide/load/o/f;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->D:Lcom/bumptech/glide/load/o/f;

    invoke-interface {v0}, Lcom/bumptech/glide/load/o/f;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->s:Lcom/bumptech/glide/load/o/h$h;

    invoke-direct {p0, v1}, Lcom/bumptech/glide/load/o/h;->k(Lcom/bumptech/glide/load/o/h$h;)Lcom/bumptech/glide/load/o/h$h;

    move-result-object v1

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->s:Lcom/bumptech/glide/load/o/h$h;

    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->j()Lcom/bumptech/glide/load/o/f;

    move-result-object v1

    iput-object v1, p0, Lcom/bumptech/glide/load/o/h;->D:Lcom/bumptech/glide/load/o/f;

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->s:Lcom/bumptech/glide/load/o/h$h;

    sget-object v2, Lcom/bumptech/glide/load/o/h$h;->e:Lcom/bumptech/glide/load/o/h$h;

    if-ne v1, v2, :cond_0

    invoke-virtual {p0}, Lcom/bumptech/glide/load/o/h;->b()V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->s:Lcom/bumptech/glide/load/o/h$h;

    sget-object v2, Lcom/bumptech/glide/load/o/h$h;->g:Lcom/bumptech/glide/load/o/h$h;

    if-eq v1, v2, :cond_2

    iget-boolean v1, p0, Lcom/bumptech/glide/load/o/h;->F:Z

    if-eqz v1, :cond_3

    :cond_2
    if-nez v0, :cond_3

    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->s()V

    :cond_3
    return-void
.end method

.method private z(Ljava/lang/Object;Lcom/bumptech/glide/load/a;Lcom/bumptech/glide/load/o/t;)Lcom/bumptech/glide/load/o/v;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Data:",
            "Ljava/lang/Object;",
            "ResourceType:",
            "Ljava/lang/Object;",
            ">(TData;",
            "Lcom/bumptech/glide/load/a;",
            "Lcom/bumptech/glide/load/o/t<",
            "TData;TResourceType;TR;>;)",
            "Lcom/bumptech/glide/load/o/v<",
            "TR;>;"
        }
    .end annotation

    invoke-direct {p0, p2}, Lcom/bumptech/glide/load/o/h;->l(Lcom/bumptech/glide/load/a;)Lcom/bumptech/glide/load/i;

    move-result-object v2

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->i:Lcom/bumptech/glide/e;

    invoke-virtual {v0}, Lcom/bumptech/glide/e;->h()Lcom/bumptech/glide/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/i;->l(Ljava/lang/Object;)Lcom/bumptech/glide/load/n/e;

    move-result-object p1

    :try_start_0
    iget v3, p0, Lcom/bumptech/glide/load/o/h;->m:I

    iget v4, p0, Lcom/bumptech/glide/load/o/h;->n:I

    new-instance v5, Lcom/bumptech/glide/load/o/h$c;

    invoke-direct {v5, p0, p2}, Lcom/bumptech/glide/load/o/h$c;-><init>(Lcom/bumptech/glide/load/o/h;Lcom/bumptech/glide/load/a;)V

    move-object v0, p3

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lcom/bumptech/glide/load/o/t;->a(Lcom/bumptech/glide/load/n/e;Lcom/bumptech/glide/load/i;IILcom/bumptech/glide/load/o/i$a;)Lcom/bumptech/glide/load/o/v;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Lcom/bumptech/glide/load/n/e;->b()V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Lcom/bumptech/glide/load/n/e;->b()V

    throw p2
.end method


# virtual methods
.method C()Z
    .locals 2

    sget-object v0, Lcom/bumptech/glide/load/o/h$h;->b:Lcom/bumptech/glide/load/o/h$h;

    invoke-direct {p0, v0}, Lcom/bumptech/glide/load/o/h;->k(Lcom/bumptech/glide/load/o/h$h;)Lcom/bumptech/glide/load/o/h$h;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/o/h$h;->c:Lcom/bumptech/glide/load/o/h$h;

    if-eq v0, v1, :cond_1

    sget-object v1, Lcom/bumptech/glide/load/o/h$h;->d:Lcom/bumptech/glide/load/o/h$h;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/o/h;->F:Z

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->D:Lcom/bumptech/glide/load/o/f;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/bumptech/glide/load/o/f;->cancel()V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    sget-object v0, Lcom/bumptech/glide/load/o/h$g;->c:Lcom/bumptech/glide/load/o/h$g;

    iput-object v0, p0, Lcom/bumptech/glide/load/o/h;->t:Lcom/bumptech/glide/load/o/h$g;

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->q:Lcom/bumptech/glide/load/o/h$b;

    invoke-interface {v0, p0}, Lcom/bumptech/glide/load/o/h$b;->f(Lcom/bumptech/glide/load/o/h;)V

    return-void
.end method

.method public c(Lcom/bumptech/glide/load/g;Ljava/lang/Object;Lcom/bumptech/glide/load/n/d;Lcom/bumptech/glide/load/a;Lcom/bumptech/glide/load/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/g;",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/load/n/d<",
            "*>;",
            "Lcom/bumptech/glide/load/a;",
            "Lcom/bumptech/glide/load/g;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/bumptech/glide/load/o/h;->y:Lcom/bumptech/glide/load/g;

    iput-object p2, p0, Lcom/bumptech/glide/load/o/h;->A:Ljava/lang/Object;

    iput-object p3, p0, Lcom/bumptech/glide/load/o/h;->C:Lcom/bumptech/glide/load/n/d;

    iput-object p4, p0, Lcom/bumptech/glide/load/o/h;->B:Lcom/bumptech/glide/load/a;

    iput-object p5, p0, Lcom/bumptech/glide/load/o/h;->z:Lcom/bumptech/glide/load/g;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Lcom/bumptech/glide/load/o/h;->x:Ljava/lang/Thread;

    if-eq p1, p2, :cond_0

    sget-object p1, Lcom/bumptech/glide/load/o/h$g;->d:Lcom/bumptech/glide/load/o/h$g;

    iput-object p1, p0, Lcom/bumptech/glide/load/o/h;->t:Lcom/bumptech/glide/load/o/h$g;

    iget-object p1, p0, Lcom/bumptech/glide/load/o/h;->q:Lcom/bumptech/glide/load/o/h$b;

    invoke-interface {p1, p0}, Lcom/bumptech/glide/load/o/h$b;->f(Lcom/bumptech/glide/load/o/h;)V

    goto :goto_0

    :cond_0
    const-string p1, "DecodeJob.decodeFromRetrievedData"

    invoke-static {p1}, Lcom/bumptech/glide/t/l/b;->a(Ljava/lang/String;)V

    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lcom/bumptech/glide/t/l/b;->d()V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {}, Lcom/bumptech/glide/t/l/b;->d()V

    throw p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/bumptech/glide/load/o/h;

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/load/o/h;->f(Lcom/bumptech/glide/load/o/h;)I

    move-result p1

    return p1
.end method

.method public d(Lcom/bumptech/glide/load/g;Ljava/lang/Exception;Lcom/bumptech/glide/load/n/d;Lcom/bumptech/glide/load/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/g;",
            "Ljava/lang/Exception;",
            "Lcom/bumptech/glide/load/n/d<",
            "*>;",
            "Lcom/bumptech/glide/load/a;",
            ")V"
        }
    .end annotation

    invoke-interface {p3}, Lcom/bumptech/glide/load/n/d;->b()V

    new-instance v0, Lcom/bumptech/glide/load/o/q;

    const-string v1, "Fetching data failed"

    invoke-direct {v0, v1, p2}, Lcom/bumptech/glide/load/o/q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p3}, Lcom/bumptech/glide/load/n/d;->a()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {v0, p1, p4, p2}, Lcom/bumptech/glide/load/o/q;->j(Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/a;Ljava/lang/Class;)V

    iget-object p1, p0, Lcom/bumptech/glide/load/o/h;->c:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Lcom/bumptech/glide/load/o/h;->x:Ljava/lang/Thread;

    if-eq p1, p2, :cond_0

    sget-object p1, Lcom/bumptech/glide/load/o/h$g;->c:Lcom/bumptech/glide/load/o/h$g;

    iput-object p1, p0, Lcom/bumptech/glide/load/o/h;->t:Lcom/bumptech/glide/load/o/h$g;

    iget-object p1, p0, Lcom/bumptech/glide/load/o/h;->q:Lcom/bumptech/glide/load/o/h$b;

    invoke-interface {p1, p0}, Lcom/bumptech/glide/load/o/h$b;->f(Lcom/bumptech/glide/load/o/h;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->y()V

    :goto_0
    return-void
.end method

.method public e()Lcom/bumptech/glide/t/l/c;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->d:Lcom/bumptech/glide/t/l/c;

    return-object v0
.end method

.method public f(Lcom/bumptech/glide/load/o/h;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/o/h<",
            "*>;)I"
        }
    .end annotation

    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->m()I

    move-result v0

    invoke-direct {p1}, Lcom/bumptech/glide/load/o/h;->m()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lcom/bumptech/glide/load/o/h;->r:I

    iget p1, p1, Lcom/bumptech/glide/load/o/h;->r:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method n(Lcom/bumptech/glide/e;Ljava/lang/Object;Lcom/bumptech/glide/load/o/n;Lcom/bumptech/glide/load/g;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;Lcom/bumptech/glide/load/o/j;Ljava/util/Map;ZZZLcom/bumptech/glide/load/i;Lcom/bumptech/glide/load/o/h$b;I)Lcom/bumptech/glide/load/o/h;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/e;",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/load/o/n;",
            "Lcom/bumptech/glide/load/g;",
            "II",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Class<",
            "TR;>;",
            "Lcom/bumptech/glide/g;",
            "Lcom/bumptech/glide/load/o/j;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/bumptech/glide/load/m<",
            "*>;>;ZZZ",
            "Lcom/bumptech/glide/load/i;",
            "Lcom/bumptech/glide/load/o/h$b<",
            "TR;>;I)",
            "Lcom/bumptech/glide/load/o/h<",
            "TR;>;"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/load/o/h;->b:Lcom/bumptech/glide/load/o/g;

    iget-object v15, v0, Lcom/bumptech/glide/load/o/h;->e:Lcom/bumptech/glide/load/o/h$e;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p10

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p15

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    invoke-virtual/range {v1 .. v15}, Lcom/bumptech/glide/load/o/g;->u(Lcom/bumptech/glide/e;Ljava/lang/Object;Lcom/bumptech/glide/load/g;IILcom/bumptech/glide/load/o/j;Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;Lcom/bumptech/glide/load/i;Ljava/util/Map;ZZLcom/bumptech/glide/load/o/h$e;)V

    move-object/from16 v1, p1

    iput-object v1, v0, Lcom/bumptech/glide/load/o/h;->i:Lcom/bumptech/glide/e;

    move-object/from16 v1, p4

    iput-object v1, v0, Lcom/bumptech/glide/load/o/h;->j:Lcom/bumptech/glide/load/g;

    move-object/from16 v1, p9

    iput-object v1, v0, Lcom/bumptech/glide/load/o/h;->k:Lcom/bumptech/glide/g;

    move-object/from16 v1, p3

    iput-object v1, v0, Lcom/bumptech/glide/load/o/h;->l:Lcom/bumptech/glide/load/o/n;

    move/from16 v1, p5

    iput v1, v0, Lcom/bumptech/glide/load/o/h;->m:I

    move/from16 v1, p6

    iput v1, v0, Lcom/bumptech/glide/load/o/h;->n:I

    move-object/from16 v1, p10

    iput-object v1, v0, Lcom/bumptech/glide/load/o/h;->o:Lcom/bumptech/glide/load/o/j;

    move/from16 v1, p14

    iput-boolean v1, v0, Lcom/bumptech/glide/load/o/h;->v:Z

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/bumptech/glide/load/o/h;->p:Lcom/bumptech/glide/load/i;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/bumptech/glide/load/o/h;->q:Lcom/bumptech/glide/load/o/h$b;

    move/from16 v1, p17

    iput v1, v0, Lcom/bumptech/glide/load/o/h;->r:I

    sget-object v1, Lcom/bumptech/glide/load/o/h$g;->b:Lcom/bumptech/glide/load/o/h$g;

    iput-object v1, v0, Lcom/bumptech/glide/load/o/h;->t:Lcom/bumptech/glide/load/o/h$g;

    move-object/from16 v1, p2

    iput-object v1, v0, Lcom/bumptech/glide/load/o/h;->w:Ljava/lang/Object;

    return-object v0
.end method

.method public run()V
    .locals 5

    const-string v0, "DecodeJob"

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->w:Ljava/lang/Object;

    const-string v2, "DecodeJob#run(model=%s)"

    invoke-static {v2, v1}, Lcom/bumptech/glide/t/l/b;->b(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->C:Lcom/bumptech/glide/load/n/d;

    :try_start_0
    iget-boolean v2, p0, Lcom/bumptech/glide/load/o/h;->F:Z

    if-eqz v2, :cond_1

    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->s()V
    :try_end_0
    .catch Lcom/bumptech/glide/load/o/b; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lcom/bumptech/glide/load/n/d;->b()V

    :cond_0
    invoke-static {}, Lcom/bumptech/glide/t/l/b;->d()V

    return-void

    :cond_1
    :try_start_1
    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->A()V
    :try_end_1
    .catch Lcom/bumptech/glide/load/o/b; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_2

    invoke-interface {v1}, Lcom/bumptech/glide/load/n/d;->b()V

    :cond_2
    invoke-static {}, Lcom/bumptech/glide/t/l/b;->d()V

    return-void

    :catchall_0
    move-exception v2

    const/4 v3, 0x3

    :try_start_2
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DecodeJob threw unexpectedly, isCancelled: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v4, p0, Lcom/bumptech/glide/load/o/h;->F:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", stage: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/bumptech/glide/load/o/h;->s:Lcom/bumptech/glide/load/o/h$h;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->s:Lcom/bumptech/glide/load/o/h$h;

    sget-object v3, Lcom/bumptech/glide/load/o/h$h;->f:Lcom/bumptech/glide/load/o/h$h;

    if-eq v0, v3, :cond_4

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->c:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->s()V

    :cond_4
    iget-boolean v0, p0, Lcom/bumptech/glide/load/o/h;->F:Z

    if-nez v0, :cond_5

    throw v2

    :cond_5
    throw v2

    :catch_0
    move-exception v0

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    if-eqz v1, :cond_6

    invoke-interface {v1}, Lcom/bumptech/glide/load/n/d;->b()V

    :cond_6
    invoke-static {}, Lcom/bumptech/glide/t/l/b;->d()V

    throw v0
.end method

.method v(Lcom/bumptech/glide/load/a;Lcom/bumptech/glide/load/o/v;)Lcom/bumptech/glide/load/o/v;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Z:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/bumptech/glide/load/a;",
            "Lcom/bumptech/glide/load/o/v<",
            "TZ;>;)",
            "Lcom/bumptech/glide/load/o/v<",
            "TZ;>;"
        }
    .end annotation

    invoke-interface {p2}, Lcom/bumptech/glide/load/o/v;->c()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    sget-object v0, Lcom/bumptech/glide/load/a;->e:Lcom/bumptech/glide/load/a;

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->b:Lcom/bumptech/glide/load/o/g;

    invoke-virtual {v0, v8}, Lcom/bumptech/glide/load/o/g;->r(Ljava/lang/Class;)Lcom/bumptech/glide/load/m;

    move-result-object v0

    iget-object v2, p0, Lcom/bumptech/glide/load/o/h;->i:Lcom/bumptech/glide/e;

    iget v3, p0, Lcom/bumptech/glide/load/o/h;->m:I

    iget v4, p0, Lcom/bumptech/glide/load/o/h;->n:I

    invoke-interface {v0, v2, p2, v3, v4}, Lcom/bumptech/glide/load/m;->b(Landroid/content/Context;Lcom/bumptech/glide/load/o/v;II)Lcom/bumptech/glide/load/o/v;

    move-result-object v2

    move-object v7, v0

    move-object v0, v2

    goto :goto_0

    :cond_0
    move-object v0, p2

    move-object v7, v1

    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {p2}, Lcom/bumptech/glide/load/o/v;->f()V

    :cond_1
    iget-object p2, p0, Lcom/bumptech/glide/load/o/h;->b:Lcom/bumptech/glide/load/o/g;

    invoke-virtual {p2, v0}, Lcom/bumptech/glide/load/o/g;->v(Lcom/bumptech/glide/load/o/v;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/bumptech/glide/load/o/h;->b:Lcom/bumptech/glide/load/o/g;

    invoke-virtual {p2, v0}, Lcom/bumptech/glide/load/o/g;->n(Lcom/bumptech/glide/load/o/v;)Lcom/bumptech/glide/load/l;

    move-result-object v1

    iget-object p2, p0, Lcom/bumptech/glide/load/o/h;->p:Lcom/bumptech/glide/load/i;

    invoke-interface {v1, p2}, Lcom/bumptech/glide/load/l;->b(Lcom/bumptech/glide/load/i;)Lcom/bumptech/glide/load/c;

    move-result-object p2

    goto :goto_1

    :cond_2
    sget-object p2, Lcom/bumptech/glide/load/c;->d:Lcom/bumptech/glide/load/c;

    :goto_1
    move-object v10, v1

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->b:Lcom/bumptech/glide/load/o/g;

    iget-object v2, p0, Lcom/bumptech/glide/load/o/h;->y:Lcom/bumptech/glide/load/g;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/load/o/g;->x(Lcom/bumptech/glide/load/g;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    iget-object v3, p0, Lcom/bumptech/glide/load/o/h;->o:Lcom/bumptech/glide/load/o/j;

    invoke-virtual {v3, v1, p1, p2}, Lcom/bumptech/glide/load/o/j;->d(ZLcom/bumptech/glide/load/a;Lcom/bumptech/glide/load/c;)Z

    move-result p1

    if-eqz p1, :cond_6

    if-eqz v10, :cond_5

    sget-object p1, Lcom/bumptech/glide/load/o/h$a;->c:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget p1, p1, v1

    if-eq p1, v2, :cond_4

    const/4 v1, 0x2

    if-ne p1, v1, :cond_3

    new-instance p1, Lcom/bumptech/glide/load/o/x;

    iget-object p2, p0, Lcom/bumptech/glide/load/o/h;->b:Lcom/bumptech/glide/load/o/g;

    invoke-virtual {p2}, Lcom/bumptech/glide/load/o/g;->b()Lcom/bumptech/glide/load/o/a0/b;

    move-result-object v2

    iget-object v3, p0, Lcom/bumptech/glide/load/o/h;->y:Lcom/bumptech/glide/load/g;

    iget-object v4, p0, Lcom/bumptech/glide/load/o/h;->j:Lcom/bumptech/glide/load/g;

    iget v5, p0, Lcom/bumptech/glide/load/o/h;->m:I

    iget v6, p0, Lcom/bumptech/glide/load/o/h;->n:I

    iget-object v9, p0, Lcom/bumptech/glide/load/o/h;->p:Lcom/bumptech/glide/load/i;

    move-object v1, p1

    invoke-direct/range {v1 .. v9}, Lcom/bumptech/glide/load/o/x;-><init>(Lcom/bumptech/glide/load/o/a0/b;Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/g;IILcom/bumptech/glide/load/m;Ljava/lang/Class;Lcom/bumptech/glide/load/i;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown strategy: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Lcom/bumptech/glide/load/o/d;

    iget-object p2, p0, Lcom/bumptech/glide/load/o/h;->y:Lcom/bumptech/glide/load/g;

    iget-object v1, p0, Lcom/bumptech/glide/load/o/h;->j:Lcom/bumptech/glide/load/g;

    invoke-direct {p1, p2, v1}, Lcom/bumptech/glide/load/o/d;-><init>(Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/g;)V

    :goto_2
    invoke-static {v0}, Lcom/bumptech/glide/load/o/u;->g(Lcom/bumptech/glide/load/o/v;)Lcom/bumptech/glide/load/o/u;

    move-result-object v0

    iget-object p2, p0, Lcom/bumptech/glide/load/o/h;->g:Lcom/bumptech/glide/load/o/h$d;

    invoke-virtual {p2, p1, v10, v0}, Lcom/bumptech/glide/load/o/h$d;->d(Lcom/bumptech/glide/load/g;Lcom/bumptech/glide/load/l;Lcom/bumptech/glide/load/o/u;)V

    goto :goto_3

    :cond_5
    new-instance p1, Lcom/bumptech/glide/i$d;

    invoke-interface {v0}, Lcom/bumptech/glide/load/o/v;->c()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/bumptech/glide/i$d;-><init>(Ljava/lang/Class;)V

    throw p1

    :cond_6
    :goto_3
    return-object v0
.end method

.method w(Z)V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/o/h;->h:Lcom/bumptech/glide/load/o/h$f;

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/load/o/h$f;->d(Z)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lcom/bumptech/glide/load/o/h;->x()V

    :cond_0
    return-void
.end method
