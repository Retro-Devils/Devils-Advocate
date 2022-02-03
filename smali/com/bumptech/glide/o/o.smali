.class public Lcom/bumptech/glide/o/o;
.super Landroidx/fragment/app/Fragment;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/o/o$a;
    }
.end annotation


# instance fields
.field private final Z:Lcom/bumptech/glide/o/a;

.field private final a0:Lcom/bumptech/glide/o/m;

.field private final b0:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/bumptech/glide/o/o;",
            ">;"
        }
    .end annotation
.end field

.field private c0:Lcom/bumptech/glide/o/o;

.field private d0:Lcom/bumptech/glide/k;

.field private e0:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/bumptech/glide/o/a;

    invoke-direct {v0}, Lcom/bumptech/glide/o/a;-><init>()V

    invoke-direct {p0, v0}, Lcom/bumptech/glide/o/o;-><init>(Lcom/bumptech/glide/o/a;)V

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/o/a;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ValidFragment"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    new-instance v0, Lcom/bumptech/glide/o/o$a;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/o/o$a;-><init>(Lcom/bumptech/glide/o/o;)V

    iput-object v0, p0, Lcom/bumptech/glide/o/o;->a0:Lcom/bumptech/glide/o/m;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/o/o;->b0:Ljava/util/Set;

    iput-object p1, p0, Lcom/bumptech/glide/o/o;->Z:Lcom/bumptech/glide/o/a;

    return-void
.end method

.method private B2()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/o/o;->c0:Lcom/bumptech/glide/o/o;

    if-eqz v0, :cond_0

    invoke-direct {v0, p0}, Lcom/bumptech/glide/o/o;->y2(Lcom/bumptech/glide/o/o;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/o/o;->c0:Lcom/bumptech/glide/o/o;

    :cond_0
    return-void
.end method

.method private p2(Lcom/bumptech/glide/o/o;)V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/o/o;->b0:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private s2()Landroidx/fragment/app/Fragment;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->v0()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/o/o;->e0:Landroidx/fragment/app/Fragment;

    :goto_0
    return-object v0
.end method

.method private static v2(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/i;
    .locals 1

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->v0()Landroidx/fragment/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->v0()Landroidx/fragment/app/Fragment;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroidx/fragment/app/i;

    move-result-object p0

    return-object p0
.end method

.method private w2(Landroidx/fragment/app/Fragment;)Z
    .locals 2

    invoke-direct {p0}, Lcom/bumptech/glide/o/o;->s2()Landroidx/fragment/app/Fragment;

    move-result-object v0

    :goto_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->v0()Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->v0()Landroidx/fragment/app/Fragment;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private x2(Landroid/content/Context;Landroidx/fragment/app/i;)V
    .locals 1

    invoke-direct {p0}, Lcom/bumptech/glide/o/o;->B2()V

    invoke-static {p1}, Lcom/bumptech/glide/c;->c(Landroid/content/Context;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->k()Lcom/bumptech/glide/o/l;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/o/l;->j(Landroid/content/Context;Landroidx/fragment/app/i;)Lcom/bumptech/glide/o/o;

    move-result-object p1

    iput-object p1, p0, Lcom/bumptech/glide/o/o;->c0:Lcom/bumptech/glide/o/o;

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/bumptech/glide/o/o;->c0:Lcom/bumptech/glide/o/o;

    invoke-direct {p1, p0}, Lcom/bumptech/glide/o/o;->p2(Lcom/bumptech/glide/o/o;)V

    :cond_0
    return-void
.end method

.method private y2(Lcom/bumptech/glide/o/o;)V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/o/o;->b0:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public A2(Lcom/bumptech/glide/k;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/o/o;->d0:Lcom/bumptech/glide/k;

    return-void
.end method

.method public T0(Landroid/content/Context;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->T0(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/bumptech/glide/o/o;->v2(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/i;

    move-result-object p1

    const/4 v0, 0x5

    const-string v1, "SupportRMFragment"

    if-nez p1, :cond_1

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Unable to register fragment with root, ancestor detached"

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v2

    invoke-direct {p0, v2, p1}, Lcom/bumptech/glide/o/o;->x2(Landroid/content/Context;Landroidx/fragment/app/i;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Unable to register fragment with root"

    invoke-static {v1, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_0
    return-void
.end method

.method public b1()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->b1()V

    iget-object v0, p0, Lcom/bumptech/glide/o/o;->Z:Lcom/bumptech/glide/o/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/a;->c()V

    invoke-direct {p0}, Lcom/bumptech/glide/o/o;->B2()V

    return-void
.end method

.method public e1()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->e1()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/o/o;->e0:Landroidx/fragment/app/Fragment;

    invoke-direct {p0}, Lcom/bumptech/glide/o/o;->B2()V

    return-void
.end method

.method q2()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/bumptech/glide/o/o;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/o/o;->c0:Lcom/bumptech/glide/o/o;

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bumptech/glide/o/o;->b0:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lcom/bumptech/glide/o/o;->c0:Lcom/bumptech/glide/o/o;

    invoke-virtual {v1}, Lcom/bumptech/glide/o/o;->q2()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/bumptech/glide/o/o;

    invoke-direct {v2}, Lcom/bumptech/glide/o/o;->s2()Landroidx/fragment/app/Fragment;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/bumptech/glide/o/o;->w2(Landroidx/fragment/app/Fragment;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method r2()Lcom/bumptech/glide/o/a;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/o/o;->Z:Lcom/bumptech/glide/o/a;

    return-object v0
.end method

.method public t1()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->t1()V

    iget-object v0, p0, Lcom/bumptech/glide/o/o;->Z:Lcom/bumptech/glide/o/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/a;->d()V

    return-void
.end method

.method public t2()Lcom/bumptech/glide/k;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/o/o;->d0:Lcom/bumptech/glide/k;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/bumptech/glide/o/o;->s2()Landroidx/fragment/app/Fragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u1()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->u1()V

    iget-object v0, p0, Lcom/bumptech/glide/o/o;->Z:Lcom/bumptech/glide/o/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/a;->e()V

    return-void
.end method

.method public u2()Lcom/bumptech/glide/o/m;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/o/o;->a0:Lcom/bumptech/glide/o/m;

    return-object v0
.end method

.method z2(Landroidx/fragment/app/Fragment;)V
    .locals 1

    iput-object p1, p0, Lcom/bumptech/glide/o/o;->e0:Landroidx/fragment/app/Fragment;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/o/o;->v2(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/i;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, v0}, Lcom/bumptech/glide/o/o;->x2(Landroid/content/Context;Landroidx/fragment/app/i;)V

    :cond_2
    :goto_0
    return-void
.end method
