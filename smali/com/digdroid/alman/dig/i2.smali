.class public abstract Lcom/digdroid/alman/dig/i2;
.super Lb/s/a/a;
.source ""


# instance fields
.field private final c:Landroidx/fragment/app/i;

.field private d:Landroidx/fragment/app/n;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment$g;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field private g:Landroidx/fragment/app/Fragment;

.field private h:Landroid/app/Activity;

.field private i:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;Landroidx/fragment/app/i;)V
    .locals 2

    invoke-direct {p0}, Lb/s/a/a;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/i2;->d:Landroidx/fragment/app/n;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/digdroid/alman/dig/i2;->e:Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/digdroid/alman/dig/i2;->g:Landroidx/fragment/app/Fragment;

    const/4 v0, 0x6

    iput v0, p0, Lcom/digdroid/alman/dig/i2;->i:I

    iput-object p1, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/app/Activity;

    iput-object p2, p0, Lcom/digdroid/alman/dig/i2;->c:Landroidx/fragment/app/i;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public b(Landroid/view/ViewGroup;)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/i2;->d:Landroidx/fragment/app/n;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/fragment/app/n;->f()I

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/digdroid/alman/dig/i2;->d:Landroidx/fragment/app/n;

    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/i2;->c:Landroidx/fragment/app/i;

    invoke-virtual {p1}, Landroidx/fragment/app/i;->c()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Landroidx/fragment/app/Fragment;

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    if-ne v1, p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_1
    const/4 p1, -0x2

    return p1
.end method

.method public f(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, p2, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->d:Landroidx/fragment/app/n;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->c:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->a()Landroidx/fragment/app/n;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/i2;->d:Landroidx/fragment/app/n;

    :cond_1
    invoke-virtual {p0, p2}, Lcom/digdroid/alman/dig/i2;->p(I)Landroidx/fragment/app/Fragment;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    if-le v1, p2, :cond_2

    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment$g;

    if-eqz v1, :cond_2

    iget-object v3, p0, Lcom/digdroid/alman/dig/i2;->e:Ljava/util/ArrayList;

    invoke-virtual {v3, p2, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->f2(Landroidx/fragment/app/Fragment$g;)V

    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gt v1, p2, :cond_3

    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->g2(Z)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, p2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/digdroid/alman/dig/i2;->d:Landroidx/fragment/app/n;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getId()I

    move-result p1

    invoke-virtual {p2, p1, v0}, Landroidx/fragment/app/n;->b(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/n;

    return-object v0
.end method

.method public g(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 0

    check-cast p2, Landroidx/fragment/app/Fragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object p2

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public i(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 5

    if-eqz p1, :cond_3

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const-string p2, "max_fragments"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcom/digdroid/alman/dig/i2;->i:I

    const-string p2, "states"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object p2

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const/4 v1, 0x0

    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lcom/digdroid/alman/dig/i2;->e:Ljava/util/ArrayList;

    aget-object v3, p2, v1

    check-cast v3, Landroidx/fragment/app/Fragment$g;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v2, "f"

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/i2;->c:Landroidx/fragment/app/i;

    invoke-virtual {v3, p1, v1}, Landroidx/fragment/app/i;->e(Landroid/os/Bundle;Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_1

    :goto_2
    iget-object v3, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-gt v3, v2, :cond_2

    iget-object v3, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-virtual {v1, v0}, Landroidx/fragment/app/Fragment;->g2(Z)V

    iget-object v3, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v3, v2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-void
.end method

.method public j()Landroid/os/Parcelable;
    .locals 5

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget v1, p0, Lcom/digdroid/alman/dig/i2;->i:I

    const-string v2, "max_fragments"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Landroidx/fragment/app/Fragment$g;

    iget-object v2, p0, Lcom/digdroid/alman/dig/i2;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    const-string v2, "states"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "f"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/digdroid/alman/dig/i2;->c:Landroidx/fragment/app/i;

    invoke-virtual {v4, v0, v3, v2}, Landroidx/fragment/app/i;->j(Landroid/os/Bundle;Ljava/lang/String;Landroidx/fragment/app/Fragment;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public k(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 5

    check-cast p3, Landroidx/fragment/app/Fragment;

    iget-object p1, p0, Lcom/digdroid/alman/dig/i2;->g:Landroidx/fragment/app/Fragment;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p3, p1, :cond_8

    if-eqz p1, :cond_7

    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->g2(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/i2;->h:Landroid/app/Activity;

    const-string v2, "activity"

    invoke-virtual {p1, v2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/ActivityManager;

    new-instance v2, Landroid/app/ActivityManager$MemoryInfo;

    invoke-direct {v2}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    invoke-virtual {p1, v2}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    iget-boolean p1, v2, Landroid/app/ActivityManager$MemoryInfo;->lowMemory:Z

    if-eqz p1, :cond_0

    iget p1, p0, Lcom/digdroid/alman/dig/i2;->i:I

    sub-int/2addr p1, v1

    const/4 v2, 0x3

    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_0

    :cond_0
    iget p1, p0, Lcom/digdroid/alman/dig/i2;->i:I

    add-int/2addr p1, v1

    const/4 v2, 0x6

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_0
    iput p1, p0, Lcom/digdroid/alman/dig/i2;->i:I

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-ge v2, p1, :cond_3

    iget-object v4, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_2

    add-int/lit8 v3, v3, 0x1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    sub-int/2addr p1, v1

    :goto_2
    add-int/lit8 v2, p2, 0x1

    if-le p1, v2, :cond_5

    iget v2, p0, Lcom/digdroid/alman/dig/i2;->i:I

    if-le v3, v2, :cond_5

    iget-object v2, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_4

    invoke-virtual {p0, p1, v2}, Lcom/digdroid/alman/dig/i2;->n(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, -0x1

    :cond_4
    add-int/lit8 p1, p1, -0x1

    goto :goto_2

    :cond_5
    const/4 p1, 0x0

    :goto_3
    add-int/lit8 v2, p2, -0x1

    if-ge p1, v2, :cond_7

    iget v2, p0, Lcom/digdroid/alman/dig/i2;->i:I

    if-le v3, v2, :cond_7

    iget-object v2, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/Fragment;

    if-eqz v2, :cond_6

    invoke-virtual {p0, p1, v2}, Lcom/digdroid/alman/dig/i2;->n(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, -0x1

    :cond_6
    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_7
    iput-object p3, p0, Lcom/digdroid/alman/dig/i2;->g:Landroidx/fragment/app/Fragment;

    :cond_8
    if-eqz p3, :cond_b

    invoke-virtual {p3, v1}, Landroidx/fragment/app/Fragment;->g2(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/fragment/app/Fragment;

    if-eqz p2, :cond_9

    move-object v2, p2

    check-cast v2, Lcom/digdroid/alman/dig/p1;

    if-ne p2, p3, :cond_a

    iget-object p2, v2, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz p2, :cond_a

    const/4 p2, 0x1

    goto :goto_5

    :cond_a
    const/4 p2, 0x0

    :goto_5
    invoke-virtual {v2, p2}, Lcom/digdroid/alman/dig/p1;->a3(Z)V

    goto :goto_4

    :cond_b
    return-void
.end method

.method public m(Landroid/view/ViewGroup;)V
    .locals 0

    return-void
.end method

.method public n(ILjava/lang/Object;)V
    .locals 3

    check-cast p2, Landroidx/fragment/app/Fragment;

    if-eqz p2, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->d:Landroidx/fragment/app/n;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->c:Landroidx/fragment/app/i;

    invoke-virtual {v0}, Landroidx/fragment/app/i;->a()Landroidx/fragment/app/n;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/i2;->d:Landroidx/fragment/app/n;

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-gt v0, p1, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->e:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/digdroid/alman/dig/i2;->c:Landroidx/fragment/app/i;

    invoke-virtual {v2, p2}, Landroidx/fragment/app/i;->k(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/Fragment$g;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/digdroid/alman/dig/i2;->d:Landroidx/fragment/app/n;

    invoke-virtual {p1, p2}, Landroidx/fragment/app/n;->h(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/n;

    :cond_3
    :goto_1
    return-void
.end method

.method public o(I)Landroidx/fragment/app/Fragment;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/fragment/app/Fragment;

    return-object p1
.end method

.method public abstract p(I)Landroidx/fragment/app/Fragment;
.end method

.method public q()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    if-eqz v1, :cond_0

    check-cast v1, Lcom/digdroid/alman/dig/p1;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/p1;->G2(Z)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public r(I)V
    .locals 2

    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, p1, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/fragment/app/Fragment;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->d:Landroidx/fragment/app/n;

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->c:Landroidx/fragment/app/i;

    invoke-virtual {v1}, Landroidx/fragment/app/i;->a()Landroidx/fragment/app/n;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/i2;->d:Landroidx/fragment/app/n;

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->d:Landroidx/fragment/app/n;

    invoke-virtual {v1, v0}, Landroidx/fragment/app/n;->h(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/n;

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, p1, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/i2;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-void
.end method

.method public s(II)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    sub-int v1, p1, p2

    if-lt v0, v1, :cond_0

    add-int v1, p1, p2

    if-le v0, v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/i2;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/i2;->n(ILjava/lang/Object;)V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/i2;->b(Landroid/view/ViewGroup;)V

    return-void
.end method
