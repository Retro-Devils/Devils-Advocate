.class public Lcom/bumptech/glide/e;
.super Landroid/content/ContextWrapper;
.source ""


# static fields
.field static final a:Lcom/bumptech/glide/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/l<",
            "**>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/bumptech/glide/load/o/a0/b;

.field private final c:Lcom/bumptech/glide/i;

.field private final d:Lcom/bumptech/glide/r/j/f;

.field private final e:Lcom/bumptech/glide/c$a;

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bumptech/glide/r/e<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/bumptech/glide/l<",
            "**>;>;"
        }
    .end annotation
.end field

.field private final h:Lcom/bumptech/glide/load/o/k;

.field private final i:Z

.field private final j:I

.field private k:Lcom/bumptech/glide/r/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/bumptech/glide/b;

    invoke-direct {v0}, Lcom/bumptech/glide/b;-><init>()V

    sput-object v0, Lcom/bumptech/glide/e;->a:Lcom/bumptech/glide/l;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/load/o/a0/b;Lcom/bumptech/glide/i;Lcom/bumptech/glide/r/j/f;Lcom/bumptech/glide/c$a;Ljava/util/Map;Ljava/util/List;Lcom/bumptech/glide/load/o/k;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/load/o/a0/b;",
            "Lcom/bumptech/glide/i;",
            "Lcom/bumptech/glide/r/j/f;",
            "Lcom/bumptech/glide/c$a;",
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lcom/bumptech/glide/l<",
            "**>;>;",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/r/e<",
            "Ljava/lang/Object;",
            ">;>;",
            "Lcom/bumptech/glide/load/o/k;",
            "ZI)V"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/bumptech/glide/e;->b:Lcom/bumptech/glide/load/o/a0/b;

    iput-object p3, p0, Lcom/bumptech/glide/e;->c:Lcom/bumptech/glide/i;

    iput-object p4, p0, Lcom/bumptech/glide/e;->d:Lcom/bumptech/glide/r/j/f;

    iput-object p5, p0, Lcom/bumptech/glide/e;->e:Lcom/bumptech/glide/c$a;

    iput-object p7, p0, Lcom/bumptech/glide/e;->f:Ljava/util/List;

    iput-object p6, p0, Lcom/bumptech/glide/e;->g:Ljava/util/Map;

    iput-object p8, p0, Lcom/bumptech/glide/e;->h:Lcom/bumptech/glide/load/o/k;

    iput-boolean p9, p0, Lcom/bumptech/glide/e;->i:Z

    iput p10, p0, Lcom/bumptech/glide/e;->j:I

    return-void
.end method


# virtual methods
.method public a(Landroid/widget/ImageView;Ljava/lang/Class;)Lcom/bumptech/glide/r/j/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<X:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/widget/ImageView;",
            "Ljava/lang/Class<",
            "TX;>;)",
            "Lcom/bumptech/glide/r/j/i<",
            "Landroid/widget/ImageView;",
            "TX;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/e;->d:Lcom/bumptech/glide/r/j/f;

    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/r/j/f;->a(Landroid/widget/ImageView;Ljava/lang/Class;)Lcom/bumptech/glide/r/j/i;

    move-result-object p1

    return-object p1
.end method

.method public b()Lcom/bumptech/glide/load/o/a0/b;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/e;->b:Lcom/bumptech/glide/load/o/a0/b;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/r/e<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/e;->f:Ljava/util/List;

    return-object v0
.end method

.method public declared-synchronized d()Lcom/bumptech/glide/r/f;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/e;->k:Lcom/bumptech/glide/r/f;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/e;->e:Lcom/bumptech/glide/c$a;

    invoke-interface {v0}, Lcom/bumptech/glide/c$a;->a()Lcom/bumptech/glide/r/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/r/a;->K()Lcom/bumptech/glide/r/a;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/r/f;

    iput-object v0, p0, Lcom/bumptech/glide/e;->k:Lcom/bumptech/glide/r/f;

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/e;->k:Lcom/bumptech/glide/r/f;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public e(Ljava/lang/Class;)Lcom/bumptech/glide/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/bumptech/glide/l<",
            "*TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/e;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/l;

    if-nez v0, :cond_1

    iget-object v1, p0, Lcom/bumptech/glide/e;->g:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/l;

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    sget-object v0, Lcom/bumptech/glide/e;->a:Lcom/bumptech/glide/l;

    :cond_2
    return-object v0
.end method

.method public f()Lcom/bumptech/glide/load/o/k;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/e;->h:Lcom/bumptech/glide/load/o/k;

    return-object v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lcom/bumptech/glide/e;->j:I

    return v0
.end method

.method public h()Lcom/bumptech/glide/i;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/e;->c:Lcom/bumptech/glide/i;

    return-object v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/bumptech/glide/e;->i:Z

    return v0
.end method
