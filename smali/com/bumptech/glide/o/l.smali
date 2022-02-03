.class public Lcom/bumptech/glide/o/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/o/l$b;
    }
.end annotation


# static fields
.field private static final a:Lcom/bumptech/glide/o/l$b;


# instance fields
.field private volatile b:Lcom/bumptech/glide/k;

.field final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/app/FragmentManager;",
            "Lcom/bumptech/glide/o/k;",
            ">;"
        }
    .end annotation
.end field

.field final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/fragment/app/i;",
            "Lcom/bumptech/glide/o/o;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Landroid/os/Handler;

.field private final f:Lcom/bumptech/glide/o/l$b;

.field private final g:Lb/d/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/d/a<",
            "Landroid/view/View;",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field private final h:Lb/d/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/d/a<",
            "Landroid/view/View;",
            "Landroid/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field private final i:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/bumptech/glide/o/l$a;

    invoke-direct {v0}, Lcom/bumptech/glide/o/l$a;-><init>()V

    sput-object v0, Lcom/bumptech/glide/o/l;->a:Lcom/bumptech/glide/o/l$b;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/o/l$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/o/l;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/o/l;->d:Ljava/util/Map;

    new-instance v0, Lb/d/a;

    invoke-direct {v0}, Lb/d/a;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/o/l;->g:Lb/d/a;

    new-instance v0, Lb/d/a;

    invoke-direct {v0}, Lb/d/a;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/o/l;->h:Lb/d/a;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/bumptech/glide/o/l;->i:Landroid/os/Bundle;

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/bumptech/glide/o/l;->a:Lcom/bumptech/glide/o/l$b;

    :goto_0
    iput-object p1, p0, Lcom/bumptech/glide/o/l;->f:Lcom/bumptech/glide/o/l$b;

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object p1, p0, Lcom/bumptech/glide/o/l;->e:Landroid/os/Handler;

    return-void
.end method

.method private static a(Landroid/app/Activity;)V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x11
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load for a destroyed activity"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    return-void
.end method

.method private static b(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/bumptech/glide/o/l;->b(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private c(Landroid/content/Context;Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Lcom/bumptech/glide/k;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0, p2, p3, p4}, Lcom/bumptech/glide/o/l;->i(Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Lcom/bumptech/glide/o/k;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bumptech/glide/o/k;->e()Lcom/bumptech/glide/k;

    move-result-object p3

    if-nez p3, :cond_0

    invoke-static {p1}, Lcom/bumptech/glide/c;->c(Landroid/content/Context;)Lcom/bumptech/glide/c;

    move-result-object p3

    iget-object p4, p0, Lcom/bumptech/glide/o/l;->f:Lcom/bumptech/glide/o/l$b;

    invoke-virtual {p2}, Lcom/bumptech/glide/o/k;->c()Lcom/bumptech/glide/o/a;

    move-result-object v0

    invoke-virtual {p2}, Lcom/bumptech/glide/o/k;->f()Lcom/bumptech/glide/o/m;

    move-result-object v1

    invoke-interface {p4, p3, v0, v1, p1}, Lcom/bumptech/glide/o/l$b;->a(Lcom/bumptech/glide/c;Lcom/bumptech/glide/o/h;Lcom/bumptech/glide/o/m;Landroid/content/Context;)Lcom/bumptech/glide/k;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/bumptech/glide/o/k;->k(Lcom/bumptech/glide/k;)V

    :cond_0
    return-object p3
.end method

.method private g(Landroid/content/Context;)Lcom/bumptech/glide/k;
    .locals 4

    iget-object v0, p0, Lcom/bumptech/glide/o/l;->b:Lcom/bumptech/glide/k;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/bumptech/glide/o/l;->b:Lcom/bumptech/glide/k;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/c;->c(Landroid/content/Context;)Lcom/bumptech/glide/c;

    move-result-object v0

    iget-object v1, p0, Lcom/bumptech/glide/o/l;->f:Lcom/bumptech/glide/o/l$b;

    new-instance v2, Lcom/bumptech/glide/o/b;

    invoke-direct {v2}, Lcom/bumptech/glide/o/b;-><init>()V

    new-instance v3, Lcom/bumptech/glide/o/g;

    invoke-direct {v3}, Lcom/bumptech/glide/o/g;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-interface {v1, v0, v2, v3, p1}, Lcom/bumptech/glide/o/l$b;->a(Lcom/bumptech/glide/c;Lcom/bumptech/glide/o/h;Lcom/bumptech/glide/o/m;Landroid/content/Context;)Lcom/bumptech/glide/k;

    move-result-object p1

    iput-object p1, p0, Lcom/bumptech/glide/o/l;->b:Lcom/bumptech/glide/k;

    :cond_0
    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/bumptech/glide/o/l;->b:Lcom/bumptech/glide/k;

    return-object p1
.end method

.method private i(Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Lcom/bumptech/glide/o/k;
    .locals 2

    const-string v0, "com.bumptech.glide.manager"

    invoke-virtual {p1, v0}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/o/k;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/bumptech/glide/o/l;->c:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/o/k;

    if-nez v1, :cond_1

    new-instance v1, Lcom/bumptech/glide/o/k;

    invoke-direct {v1}, Lcom/bumptech/glide/o/k;-><init>()V

    invoke-virtual {v1, p2}, Lcom/bumptech/glide/o/k;->j(Landroid/app/Fragment;)V

    if-eqz p3, :cond_0

    invoke-virtual {v1}, Lcom/bumptech/glide/o/k;->c()Lcom/bumptech/glide/o/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bumptech/glide/o/a;->d()V

    :cond_0
    iget-object p2, p0, Lcom/bumptech/glide/o/l;->c:Ljava/util/Map;

    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object p2

    invoke-virtual {p2, v1, v0}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    iget-object p2, p0, Lcom/bumptech/glide/o/l;->e:Landroid/os/Handler;

    const/4 p3, 0x1

    invoke-virtual {p2, p3, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_1
    return-object v1
.end method

.method private k(Landroidx/fragment/app/i;Landroidx/fragment/app/Fragment;Z)Lcom/bumptech/glide/o/o;
    .locals 2

    const-string v0, "com.bumptech.glide.manager"

    invoke-virtual {p1, v0}, Landroidx/fragment/app/i;->d(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/o/o;

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/bumptech/glide/o/l;->d:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/o/o;

    if-nez v1, :cond_1

    new-instance v1, Lcom/bumptech/glide/o/o;

    invoke-direct {v1}, Lcom/bumptech/glide/o/o;-><init>()V

    invoke-virtual {v1, p2}, Lcom/bumptech/glide/o/o;->z2(Landroidx/fragment/app/Fragment;)V

    if-eqz p3, :cond_0

    invoke-virtual {v1}, Lcom/bumptech/glide/o/o;->r2()Lcom/bumptech/glide/o/a;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bumptech/glide/o/a;->d()V

    :cond_0
    iget-object p2, p0, Lcom/bumptech/glide/o/l;->d:Ljava/util/Map;

    invoke-interface {p2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroidx/fragment/app/i;->a()Landroidx/fragment/app/n;

    move-result-object p2

    invoke-virtual {p2, v1, v0}, Landroidx/fragment/app/n;->c(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/n;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/fragment/app/n;->f()I

    iget-object p2, p0, Lcom/bumptech/glide/o/l;->e:Landroid/os/Handler;

    const/4 p3, 0x2

    invoke-virtual {p2, p3, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_1
    return-object v1
.end method

.method private static l(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p0}, Lcom/bumptech/glide/o/l;->b(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private m(Landroid/content/Context;Landroidx/fragment/app/i;Landroidx/fragment/app/Fragment;Z)Lcom/bumptech/glide/k;
    .locals 2

    invoke-direct {p0, p2, p3, p4}, Lcom/bumptech/glide/o/l;->k(Landroidx/fragment/app/i;Landroidx/fragment/app/Fragment;Z)Lcom/bumptech/glide/o/o;

    move-result-object p2

    invoke-virtual {p2}, Lcom/bumptech/glide/o/o;->t2()Lcom/bumptech/glide/k;

    move-result-object p3

    if-nez p3, :cond_0

    invoke-static {p1}, Lcom/bumptech/glide/c;->c(Landroid/content/Context;)Lcom/bumptech/glide/c;

    move-result-object p3

    iget-object p4, p0, Lcom/bumptech/glide/o/l;->f:Lcom/bumptech/glide/o/l$b;

    invoke-virtual {p2}, Lcom/bumptech/glide/o/o;->r2()Lcom/bumptech/glide/o/a;

    move-result-object v0

    invoke-virtual {p2}, Lcom/bumptech/glide/o/o;->u2()Lcom/bumptech/glide/o/m;

    move-result-object v1

    invoke-interface {p4, p3, v0, v1, p1}, Lcom/bumptech/glide/o/l$b;->a(Lcom/bumptech/glide/c;Lcom/bumptech/glide/o/h;Lcom/bumptech/glide/o/m;Landroid/content/Context;)Lcom/bumptech/glide/k;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/bumptech/glide/o/o;->A2(Lcom/bumptech/glide/k;)V

    :cond_0
    return-object p3
.end method


# virtual methods
.method public d(Landroid/app/Activity;)Lcom/bumptech/glide/k;
    .locals 3

    invoke-static {}, Lcom/bumptech/glide/t/k;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/o/l;->e(Landroid/content/Context;)Lcom/bumptech/glide/k;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/o/l;->a(Landroid/app/Activity;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1}, Lcom/bumptech/glide/o/l;->l(Landroid/content/Context;)Z

    move-result v2

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/bumptech/glide/o/l;->c(Landroid/content/Context;Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Lcom/bumptech/glide/k;

    move-result-object p1

    return-object p1
.end method

.method public e(Landroid/content/Context;)Lcom/bumptech/glide/k;
    .locals 2

    if-eqz p1, :cond_3

    invoke-static {}, Lcom/bumptech/glide/t/k;->p()Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p1, Landroid/app/Application;

    if-nez v0, :cond_2

    instance-of v0, p1, Landroidx/fragment/app/d;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/fragment/app/d;

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/o/l;->f(Landroidx/fragment/app/d;)Lcom/bumptech/glide/k;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/o/l;->d(Landroid/app/Activity;)Lcom/bumptech/glide/k;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/o/l;->e(Landroid/content/Context;)Lcom/bumptech/glide/k;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-direct {p0, p1}, Lcom/bumptech/glide/o/l;->g(Landroid/content/Context;)Lcom/bumptech/glide/k;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load on a null Context"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Landroidx/fragment/app/d;)Lcom/bumptech/glide/k;
    .locals 3

    invoke-static {}, Lcom/bumptech/glide/t/k;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/bumptech/glide/o/l;->e(Landroid/content/Context;)Lcom/bumptech/glide/k;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/o/l;->a(Landroid/app/Activity;)V

    invoke-virtual {p1}, Landroidx/fragment/app/d;->C0()Landroidx/fragment/app/i;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1}, Lcom/bumptech/glide/o/l;->l(Landroid/content/Context;)Z

    move-result v2

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/bumptech/glide/o/l;->m(Landroid/content/Context;Landroidx/fragment/app/i;Landroidx/fragment/app/Fragment;Z)Lcom/bumptech/glide/k;

    move-result-object p1

    return-object p1
.end method

.method h(Landroid/app/Activity;)Lcom/bumptech/glide/o/k;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p1}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    invoke-static {p1}, Lcom/bumptech/glide/o/l;->l(Landroid/content/Context;)Z

    move-result p1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p1}, Lcom/bumptech/glide/o/l;->i(Landroid/app/FragmentManager;Landroid/app/Fragment;Z)Lcom/bumptech/glide/o/k;

    move-result-object p1

    return-object p1
.end method

.method public handleMessage(Landroid/os/Message;)Z
    .locals 5

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    const/4 v2, 0x0

    move-object p1, v1

    goto :goto_1

    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Landroidx/fragment/app/i;

    iget-object p1, p0, Lcom/bumptech/glide/o/l;->d:Ljava/util/Map;

    goto :goto_0

    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Landroid/app/FragmentManager;

    iget-object p1, p0, Lcom/bumptech/glide/o/l;->c:Ljava/util/Map;

    :goto_0
    invoke-interface {p1, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, v1

    move-object v1, p1

    move-object p1, v4

    :goto_1
    if-eqz v2, :cond_2

    if-nez v1, :cond_2

    const/4 v0, 0x5

    const-string v1, "RMRetriever"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to remove expected request manager fragment, manager: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return v2
.end method

.method j(Landroid/content/Context;Landroidx/fragment/app/i;)Lcom/bumptech/glide/o/o;
    .locals 1

    invoke-static {p1}, Lcom/bumptech/glide/o/l;->l(Landroid/content/Context;)Z

    move-result p1

    const/4 v0, 0x0

    invoke-direct {p0, p2, v0, p1}, Lcom/bumptech/glide/o/l;->k(Landroidx/fragment/app/i;Landroidx/fragment/app/Fragment;Z)Lcom/bumptech/glide/o/o;

    move-result-object p1

    return-object p1
.end method
