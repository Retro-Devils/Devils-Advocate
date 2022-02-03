.class public Lcom/bumptech/glide/o/k;
.super Landroid/app/Fragment;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/o/k$a;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field private final b:Lcom/bumptech/glide/o/a;

.field private final c:Lcom/bumptech/glide/o/m;

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/bumptech/glide/o/k;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/bumptech/glide/k;

.field private f:Lcom/bumptech/glide/o/k;

.field private g:Landroid/app/Fragment;


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/bumptech/glide/o/a;

    invoke-direct {v0}, Lcom/bumptech/glide/o/a;-><init>()V

    invoke-direct {p0, v0}, Lcom/bumptech/glide/o/k;-><init>(Lcom/bumptech/glide/o/a;)V

    return-void
.end method

.method constructor <init>(Lcom/bumptech/glide/o/a;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ValidFragment"
        }
    .end annotation

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    new-instance v0, Lcom/bumptech/glide/o/k$a;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/o/k$a;-><init>(Lcom/bumptech/glide/o/k;)V

    iput-object v0, p0, Lcom/bumptech/glide/o/k;->c:Lcom/bumptech/glide/o/m;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/o/k;->d:Ljava/util/Set;

    iput-object p1, p0, Lcom/bumptech/glide/o/k;->b:Lcom/bumptech/glide/o/a;

    return-void
.end method

.method private a(Lcom/bumptech/glide/o/k;)V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/o/k;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private d()Landroid/app/Fragment;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Fragment;->getParentFragment()Landroid/app/Fragment;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/o/k;->g:Landroid/app/Fragment;

    :goto_1
    return-object v0
.end method

.method private g(Landroid/app/Fragment;)Z
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    invoke-virtual {p0}, Landroid/app/Fragment;->getParentFragment()Landroid/app/Fragment;

    move-result-object v0

    :goto_0
    invoke-virtual {p1}, Landroid/app/Fragment;->getParentFragment()Landroid/app/Fragment;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Landroid/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/app/Fragment;->getParentFragment()Landroid/app/Fragment;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private h(Landroid/app/Activity;)V
    .locals 1

    invoke-direct {p0}, Lcom/bumptech/glide/o/k;->l()V

    invoke-static {p1}, Lcom/bumptech/glide/c;->c(Landroid/content/Context;)Lcom/bumptech/glide/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/c;->k()Lcom/bumptech/glide/o/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/o/l;->h(Landroid/app/Activity;)Lcom/bumptech/glide/o/k;

    move-result-object p1

    iput-object p1, p0, Lcom/bumptech/glide/o/k;->f:Lcom/bumptech/glide/o/k;

    invoke-virtual {p0, p1}, Landroid/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/bumptech/glide/o/k;->f:Lcom/bumptech/glide/o/k;

    invoke-direct {p1, p0}, Lcom/bumptech/glide/o/k;->a(Lcom/bumptech/glide/o/k;)V

    :cond_0
    return-void
.end method

.method private i(Lcom/bumptech/glide/o/k;)V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/o/k;->d:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private l()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/o/k;->f:Lcom/bumptech/glide/o/k;

    if-eqz v0, :cond_0

    invoke-direct {v0, p0}, Lcom/bumptech/glide/o/k;->i(Lcom/bumptech/glide/o/k;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/o/k;->f:Lcom/bumptech/glide/o/k;

    :cond_0
    return-void
.end method


# virtual methods
.method b()Ljava/util/Set;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/bumptech/glide/o/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/o/k;->f:Lcom/bumptech/glide/o/k;

    invoke-virtual {p0, v0}, Landroid/app/Fragment;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/o/k;->d:Ljava/util/Set;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/o/k;->f:Lcom/bumptech/glide/o/k;

    if-eqz v0, :cond_4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-ge v0, v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Lcom/bumptech/glide/o/k;->f:Lcom/bumptech/glide/o/k;

    invoke-virtual {v1}, Lcom/bumptech/glide/o/k;->b()Ljava/util/Set;

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

    check-cast v2, Lcom/bumptech/glide/o/k;

    invoke-virtual {v2}, Landroid/app/Fragment;->getParentFragment()Landroid/app/Fragment;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/bumptech/glide/o/k;->g(Landroid/app/Fragment;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    :cond_4
    :goto_1
    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method c()Lcom/bumptech/glide/o/a;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/o/k;->b:Lcom/bumptech/glide/o/a;

    return-object v0
.end method

.method public e()Lcom/bumptech/glide/k;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/o/k;->e:Lcom/bumptech/glide/k;

    return-object v0
.end method

.method public f()Lcom/bumptech/glide/o/m;
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/o/k;->c:Lcom/bumptech/glide/o/m;

    return-object v0
.end method

.method j(Landroid/app/Fragment;)V
    .locals 1

    iput-object p1, p0, Lcom/bumptech/glide/o/k;->g:Landroid/app/Fragment;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/bumptech/glide/o/k;->h(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method

.method public k(Lcom/bumptech/glide/k;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/o/k;->e:Lcom/bumptech/glide/k;

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Fragment;->onAttach(Landroid/app/Activity;)V

    :try_start_0
    invoke-direct {p0, p1}, Lcom/bumptech/glide/o/k;->h(Landroid/app/Activity;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 v0, 0x5

    const-string v1, "RMFragment"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Unable to register fragment with root"

    invoke-static {v1, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    iget-object v0, p0, Lcom/bumptech/glide/o/k;->b:Lcom/bumptech/glide/o/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/a;->c()V

    invoke-direct {p0}, Lcom/bumptech/glide/o/k;->l()V

    return-void
.end method

.method public onDetach()V
    .locals 0

    invoke-super {p0}, Landroid/app/Fragment;->onDetach()V

    invoke-direct {p0}, Lcom/bumptech/glide/o/k;->l()V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    iget-object v0, p0, Lcom/bumptech/glide/o/k;->b:Lcom/bumptech/glide/o/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/a;->d()V

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    iget-object v0, p0, Lcom/bumptech/glide/o/k;->b:Lcom/bumptech/glide/o/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/o/a;->e()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Landroid/app/Fragment;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{parent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lcom/bumptech/glide/o/k;->d()Landroid/app/Fragment;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
