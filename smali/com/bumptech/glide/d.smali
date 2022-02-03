.class public final Lcom/bumptech/glide/d;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/util/Map;
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

.field private b:Lcom/bumptech/glide/load/o/k;

.field private c:Lcom/bumptech/glide/load/o/a0/e;

.field private d:Lcom/bumptech/glide/load/o/a0/b;

.field private e:Lcom/bumptech/glide/load/o/b0/h;

.field private f:Lcom/bumptech/glide/load/o/c0/a;

.field private g:Lcom/bumptech/glide/load/o/c0/a;

.field private h:Lcom/bumptech/glide/load/o/b0/a$a;

.field private i:Lcom/bumptech/glide/load/o/b0/i;

.field private j:Lcom/bumptech/glide/o/d;

.field private k:I

.field private l:Lcom/bumptech/glide/c$a;

.field private m:Lcom/bumptech/glide/o/l$b;

.field private n:Lcom/bumptech/glide/load/o/c0/a;

.field private o:Z

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bumptech/glide/r/e<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private q:Z

.field private r:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lb/d/a;

    invoke-direct {v0}, Lb/d/a;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/d;->a:Ljava/util/Map;

    const/4 v0, 0x4

    iput v0, p0, Lcom/bumptech/glide/d;->k:I

    new-instance v0, Lcom/bumptech/glide/d$a;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/d$a;-><init>(Lcom/bumptech/glide/d;)V

    iput-object v0, p0, Lcom/bumptech/glide/d;->l:Lcom/bumptech/glide/c$a;

    return-void
.end method


# virtual methods
.method a(Landroid/content/Context;)Lcom/bumptech/glide/c;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    iget-object v1, v0, Lcom/bumptech/glide/d;->f:Lcom/bumptech/glide/load/o/c0/a;

    if-nez v1, :cond_0

    invoke-static {}, Lcom/bumptech/glide/load/o/c0/a;->g()Lcom/bumptech/glide/load/o/c0/a;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/d;->f:Lcom/bumptech/glide/load/o/c0/a;

    :cond_0
    iget-object v1, v0, Lcom/bumptech/glide/d;->g:Lcom/bumptech/glide/load/o/c0/a;

    if-nez v1, :cond_1

    invoke-static {}, Lcom/bumptech/glide/load/o/c0/a;->e()Lcom/bumptech/glide/load/o/c0/a;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/d;->g:Lcom/bumptech/glide/load/o/c0/a;

    :cond_1
    iget-object v1, v0, Lcom/bumptech/glide/d;->n:Lcom/bumptech/glide/load/o/c0/a;

    if-nez v1, :cond_2

    invoke-static {}, Lcom/bumptech/glide/load/o/c0/a;->c()Lcom/bumptech/glide/load/o/c0/a;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/d;->n:Lcom/bumptech/glide/load/o/c0/a;

    :cond_2
    iget-object v1, v0, Lcom/bumptech/glide/d;->i:Lcom/bumptech/glide/load/o/b0/i;

    if-nez v1, :cond_3

    new-instance v1, Lcom/bumptech/glide/load/o/b0/i$a;

    invoke-direct {v1, v2}, Lcom/bumptech/glide/load/o/b0/i$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/bumptech/glide/load/o/b0/i$a;->a()Lcom/bumptech/glide/load/o/b0/i;

    move-result-object v1

    iput-object v1, v0, Lcom/bumptech/glide/d;->i:Lcom/bumptech/glide/load/o/b0/i;

    :cond_3
    iget-object v1, v0, Lcom/bumptech/glide/d;->j:Lcom/bumptech/glide/o/d;

    if-nez v1, :cond_4

    new-instance v1, Lcom/bumptech/glide/o/f;

    invoke-direct {v1}, Lcom/bumptech/glide/o/f;-><init>()V

    iput-object v1, v0, Lcom/bumptech/glide/d;->j:Lcom/bumptech/glide/o/d;

    :cond_4
    iget-object v1, v0, Lcom/bumptech/glide/d;->c:Lcom/bumptech/glide/load/o/a0/e;

    if-nez v1, :cond_6

    iget-object v1, v0, Lcom/bumptech/glide/d;->i:Lcom/bumptech/glide/load/o/b0/i;

    invoke-virtual {v1}, Lcom/bumptech/glide/load/o/b0/i;->b()I

    move-result v1

    if-lez v1, :cond_5

    new-instance v3, Lcom/bumptech/glide/load/o/a0/k;

    int-to-long v4, v1

    invoke-direct {v3, v4, v5}, Lcom/bumptech/glide/load/o/a0/k;-><init>(J)V

    iput-object v3, v0, Lcom/bumptech/glide/d;->c:Lcom/bumptech/glide/load/o/a0/e;

    goto :goto_0

    :cond_5
    new-instance v1, Lcom/bumptech/glide/load/o/a0/f;

    invoke-direct {v1}, Lcom/bumptech/glide/load/o/a0/f;-><init>()V

    iput-object v1, v0, Lcom/bumptech/glide/d;->c:Lcom/bumptech/glide/load/o/a0/e;

    :cond_6
    :goto_0
    iget-object v1, v0, Lcom/bumptech/glide/d;->d:Lcom/bumptech/glide/load/o/a0/b;

    if-nez v1, :cond_7

    new-instance v1, Lcom/bumptech/glide/load/o/a0/j;

    iget-object v3, v0, Lcom/bumptech/glide/d;->i:Lcom/bumptech/glide/load/o/b0/i;

    invoke-virtual {v3}, Lcom/bumptech/glide/load/o/b0/i;->a()I

    move-result v3

    invoke-direct {v1, v3}, Lcom/bumptech/glide/load/o/a0/j;-><init>(I)V

    iput-object v1, v0, Lcom/bumptech/glide/d;->d:Lcom/bumptech/glide/load/o/a0/b;

    :cond_7
    iget-object v1, v0, Lcom/bumptech/glide/d;->e:Lcom/bumptech/glide/load/o/b0/h;

    if-nez v1, :cond_8

    new-instance v1, Lcom/bumptech/glide/load/o/b0/g;

    iget-object v3, v0, Lcom/bumptech/glide/d;->i:Lcom/bumptech/glide/load/o/b0/i;

    invoke-virtual {v3}, Lcom/bumptech/glide/load/o/b0/i;->d()I

    move-result v3

    int-to-long v3, v3

    invoke-direct {v1, v3, v4}, Lcom/bumptech/glide/load/o/b0/g;-><init>(J)V

    iput-object v1, v0, Lcom/bumptech/glide/d;->e:Lcom/bumptech/glide/load/o/b0/h;

    :cond_8
    iget-object v1, v0, Lcom/bumptech/glide/d;->h:Lcom/bumptech/glide/load/o/b0/a$a;

    if-nez v1, :cond_9

    new-instance v1, Lcom/bumptech/glide/load/o/b0/f;

    invoke-direct {v1, v2}, Lcom/bumptech/glide/load/o/b0/f;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lcom/bumptech/glide/d;->h:Lcom/bumptech/glide/load/o/b0/a$a;

    :cond_9
    iget-object v1, v0, Lcom/bumptech/glide/d;->b:Lcom/bumptech/glide/load/o/k;

    if-nez v1, :cond_a

    new-instance v1, Lcom/bumptech/glide/load/o/k;

    iget-object v4, v0, Lcom/bumptech/glide/d;->e:Lcom/bumptech/glide/load/o/b0/h;

    iget-object v5, v0, Lcom/bumptech/glide/d;->h:Lcom/bumptech/glide/load/o/b0/a$a;

    iget-object v6, v0, Lcom/bumptech/glide/d;->g:Lcom/bumptech/glide/load/o/c0/a;

    iget-object v7, v0, Lcom/bumptech/glide/d;->f:Lcom/bumptech/glide/load/o/c0/a;

    invoke-static {}, Lcom/bumptech/glide/load/o/c0/a;->h()Lcom/bumptech/glide/load/o/c0/a;

    move-result-object v8

    iget-object v9, v0, Lcom/bumptech/glide/d;->n:Lcom/bumptech/glide/load/o/c0/a;

    iget-boolean v10, v0, Lcom/bumptech/glide/d;->o:Z

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, Lcom/bumptech/glide/load/o/k;-><init>(Lcom/bumptech/glide/load/o/b0/h;Lcom/bumptech/glide/load/o/b0/a$a;Lcom/bumptech/glide/load/o/c0/a;Lcom/bumptech/glide/load/o/c0/a;Lcom/bumptech/glide/load/o/c0/a;Lcom/bumptech/glide/load/o/c0/a;Z)V

    iput-object v1, v0, Lcom/bumptech/glide/d;->b:Lcom/bumptech/glide/load/o/k;

    :cond_a
    iget-object v1, v0, Lcom/bumptech/glide/d;->p:Ljava/util/List;

    if-nez v1, :cond_b

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    goto :goto_1

    :cond_b
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    :goto_1
    iput-object v1, v0, Lcom/bumptech/glide/d;->p:Ljava/util/List;

    new-instance v7, Lcom/bumptech/glide/o/l;

    iget-object v1, v0, Lcom/bumptech/glide/d;->m:Lcom/bumptech/glide/o/l$b;

    invoke-direct {v7, v1}, Lcom/bumptech/glide/o/l;-><init>(Lcom/bumptech/glide/o/l$b;)V

    new-instance v15, Lcom/bumptech/glide/c;

    iget-object v3, v0, Lcom/bumptech/glide/d;->b:Lcom/bumptech/glide/load/o/k;

    iget-object v4, v0, Lcom/bumptech/glide/d;->e:Lcom/bumptech/glide/load/o/b0/h;

    iget-object v5, v0, Lcom/bumptech/glide/d;->c:Lcom/bumptech/glide/load/o/a0/e;

    iget-object v6, v0, Lcom/bumptech/glide/d;->d:Lcom/bumptech/glide/load/o/a0/b;

    iget-object v8, v0, Lcom/bumptech/glide/d;->j:Lcom/bumptech/glide/o/d;

    iget v9, v0, Lcom/bumptech/glide/d;->k:I

    iget-object v10, v0, Lcom/bumptech/glide/d;->l:Lcom/bumptech/glide/c$a;

    iget-object v11, v0, Lcom/bumptech/glide/d;->a:Ljava/util/Map;

    iget-object v12, v0, Lcom/bumptech/glide/d;->p:Ljava/util/List;

    iget-boolean v13, v0, Lcom/bumptech/glide/d;->q:Z

    iget-boolean v14, v0, Lcom/bumptech/glide/d;->r:Z

    move-object v1, v15

    move-object/from16 v2, p1

    invoke-direct/range {v1 .. v14}, Lcom/bumptech/glide/c;-><init>(Landroid/content/Context;Lcom/bumptech/glide/load/o/k;Lcom/bumptech/glide/load/o/b0/h;Lcom/bumptech/glide/load/o/a0/e;Lcom/bumptech/glide/load/o/a0/b;Lcom/bumptech/glide/o/l;Lcom/bumptech/glide/o/d;ILcom/bumptech/glide/c$a;Ljava/util/Map;Ljava/util/List;ZZ)V

    return-object v15
.end method

.method b(Lcom/bumptech/glide/o/l$b;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/d;->m:Lcom/bumptech/glide/o/l$b;

    return-void
.end method
