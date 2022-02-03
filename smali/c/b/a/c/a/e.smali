.class public final Lc/b/a/c/a/e;
.super Landroid/view/ViewGroup;
.source ""

# interfaces
.implements Lc/b/a/c/a/c$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc/b/a/c/a/e$c;,
        Lc/b/a/c/a/e$d;
    }
.end annotation


# instance fields
.field private final b:Lc/b/a/c/a/e$c;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lc/b/a/c/a/e$d;

.field private e:Lc/b/a/c/a/f/d;

.field private f:Lc/b/a/c/a/f/o;

.field private g:Landroid/view/View;

.field private h:Lc/b/a/c/a/f/k;

.field private i:Lc/b/a/c/a/c$d;

.field private j:Landroid/os/Bundle;

.field private k:Lc/b/a/c/a/c$b;

.field private l:Z

.field private m:Z


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILc/b/a/c/a/e$d;)V
    .locals 1

    const-string v0, "context cannot be null"

    invoke-static {p1, v0}, Lc/b/a/c/a/f/b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {p0, v0, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p2, "listener cannot be null"

    invoke-static {p4, p2}, Lc/b/a/c/a/f/b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/b/a/c/a/e$d;

    iput-object p2, p0, Lc/b/a/c/a/e;->d:Lc/b/a/c/a/e$d;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-nez p2, :cond_0

    const/high16 p2, -0x1000000

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setBackgroundColor(I)V

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Lc/b/a/c/a/e;->setClipToPadding(Z)V

    new-instance p3, Lc/b/a/c/a/f/k;

    invoke-direct {p3, p1}, Lc/b/a/c/a/f/k;-><init>(Landroid/content/Context;)V

    iput-object p3, p0, Lc/b/a/c/a/e;->h:Lc/b/a/c/a/f/k;

    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->requestTransparentRegion(Landroid/view/View;)V

    iget-object p1, p0, Lc/b/a/c/a/e;->h:Lc/b/a/c/a/f/k;

    invoke-virtual {p0, p1}, Lc/b/a/c/a/e;->addView(Landroid/view/View;)V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lc/b/a/c/a/e;->c:Ljava/util/Set;

    new-instance p1, Lc/b/a/c/a/e$c;

    invoke-direct {p1, p0, p2}, Lc/b/a/c/a/e$c;-><init>(Lc/b/a/c/a/e;B)V

    iput-object p1, p0, Lc/b/a/c/a/e;->b:Lc/b/a/c/a/e$c;

    return-void
.end method

.method static synthetic a(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/d;
    .locals 0

    iget-object p0, p0, Lc/b/a/c/a/e;->e:Lc/b/a/c/a/f/d;

    return-object p0
.end method

.method private d(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lc/b/a/c/a/e;->h:Lc/b/a/c/a/f/k;

    if-eq p1, v0, :cond_1

    iget-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/b/a/c/a/e;->g:Landroid/view/View;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "No views can be added on top of the player"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private e(Lc/b/a/c/a/b;)V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    iget-object v1, p0, Lc/b/a/c/a/e;->h:Lc/b/a/c/a/f/k;

    invoke-virtual {v1}, Lc/b/a/c/a/f/k;->c()V

    iget-object v1, p0, Lc/b/a/c/a/e;->k:Lc/b/a/c/a/c$b;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lc/b/a/c/a/e;->i:Lc/b/a/c/a/c$d;

    invoke-interface {v1, v2, p1}, Lc/b/a/c/a/c$b;->a(Lc/b/a/c/a/c$d;Lc/b/a/c/a/b;)V

    iput-object v0, p0, Lc/b/a/c/a/e;->k:Lc/b/a/c/a/c$b;

    :cond_0
    return-void
.end method

.method static synthetic f(Lc/b/a/c/a/e;Landroid/app/Activity;)V
    .locals 4

    :try_start_0
    invoke-static {}, Lc/b/a/c/a/f/a;->a()Lc/b/a/c/a/f/a;

    move-result-object v0

    iget-object v1, p0, Lc/b/a/c/a/e;->e:Lc/b/a/c/a/f/d;

    iget-boolean v2, p0, Lc/b/a/c/a/e;->l:Z

    invoke-virtual {v0, p1, v1, v2}, Lc/b/a/c/a/f/a;->c(Landroid/app/Activity;Lc/b/a/c/a/f/d;Z)Lc/b/a/c/a/f/f;

    move-result-object p1
    :try_end_0
    .catch Lc/b/a/c/a/f/s$a; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Lc/b/a/c/a/f/o;

    iget-object v1, p0, Lc/b/a/c/a/e;->e:Lc/b/a/c/a/f/d;

    invoke-direct {v0, v1, p1}, Lc/b/a/c/a/f/o;-><init>(Lc/b/a/c/a/f/d;Lc/b/a/c/a/f/f;)V

    iput-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    invoke-virtual {v0}, Lc/b/a/c/a/f/o;->g()Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lc/b/a/c/a/e;->g:Landroid/view/View;

    invoke-virtual {p0, p1}, Lc/b/a/c/a/e;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lc/b/a/c/a/e;->h:Lc/b/a/c/a/f/k;

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object p1, p0, Lc/b/a/c/a/e;->d:Lc/b/a/c/a/e$d;

    invoke-interface {p1, p0}, Lc/b/a/c/a/e$d;->a(Lc/b/a/c/a/e;)V

    iget-object p1, p0, Lc/b/a/c/a/e;->k:Lc/b/a/c/a/c$b;

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    iget-object v0, p0, Lc/b/a/c/a/e;->j:Landroid/os/Bundle;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    invoke-virtual {p1, v0}, Lc/b/a/c/a/f/o;->k(Landroid/os/Bundle;)Z

    move-result p1

    iput-object v1, p0, Lc/b/a/c/a/e;->j:Landroid/os/Bundle;

    :cond_0
    iget-object v0, p0, Lc/b/a/c/a/e;->k:Lc/b/a/c/a/c$b;

    iget-object v2, p0, Lc/b/a/c/a/e;->i:Lc/b/a/c/a/c$d;

    iget-object v3, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    invoke-interface {v0, v2, v3, p1}, Lc/b/a/c/a/c$b;->b(Lc/b/a/c/a/c$d;Lc/b/a/c/a/c;Z)V

    iput-object v1, p0, Lc/b/a/c/a/e;->k:Lc/b/a/c/a/c$b;

    :cond_1
    return-void

    :catch_0
    move-exception p1

    const-string v0, "Error creating YouTubePlayerView"

    invoke-static {v0, p1}, Lc/b/a/c/a/f/u;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, Lc/b/a/c/a/b;->c:Lc/b/a/c/a/b;

    invoke-direct {p0, p1}, Lc/b/a/c/a/e;->e(Lc/b/a/c/a/b;)V

    return-void
.end method

.method static synthetic g(Lc/b/a/c/a/e;Lc/b/a/c/a/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/b/a/c/a/e;->e(Lc/b/a/c/a/b;)V

    return-void
.end method

.method static synthetic i(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/d;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lc/b/a/c/a/e;->e:Lc/b/a/c/a/f/d;

    return-object v0
.end method

.method static synthetic n(Lc/b/a/c/a/e;)Z
    .locals 0

    iget-boolean p0, p0, Lc/b/a/c/a/e;->m:Z

    return p0
.end method

.method static synthetic o(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/o;
    .locals 0

    iget-object p0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    return-object p0
.end method

.method static synthetic r(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/k;
    .locals 0

    iget-object p0, p0, Lc/b/a/c/a/e;->h:Lc/b/a/c/a/f/k;

    return-object p0
.end method

.method static synthetic s(Lc/b/a/c/a/e;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lc/b/a/c/a/e;->g:Landroid/view/View;

    return-object p0
.end method

.method static synthetic t(Lc/b/a/c/a/e;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lc/b/a/c/a/e;->g:Landroid/view/View;

    return-object v0
.end method

.method static synthetic u(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/o;
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    return-object v0
.end method

.method static synthetic v(Lc/b/a/c/a/e;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lc/b/a/c/a/e;->c:Ljava/util/Set;

    return-object p0
.end method


# virtual methods
.method public final addFocusables(Ljava/util/ArrayList;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;I)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-super {p0, v0, p2}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;I)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lc/b/a/c/a/e;->c:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    iget-object p1, p0, Lc/b/a/c/a/e;->c:Ljava/util/Set;

    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final addFocusables(Ljava/util/ArrayList;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;II)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-super {p0, v0, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lc/b/a/c/a/e;->c:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->clear()V

    iget-object p1, p0, Lc/b/a/c/a/e;->c:Ljava/util/Set;

    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final addView(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/b/a/c/a/e;->d(Landroid/view/View;)V

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final addView(Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1}, Lc/b/a/c/a/e;->d(Landroid/view/View;)V

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final addView(Landroid/view/View;II)V
    .locals 0

    invoke-direct {p0, p1}, Lc/b/a/c/a/e;->d(Landroid/view/View;)V

    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/b/a/c/a/e;->d(Landroid/view/View;)V

    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/b/a/c/a/e;->d(Landroid/view/View;)V

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method final b()V
    .locals 1

    iget-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc/b/a/c/a/f/o;->l()V

    :cond_0
    return-void
.end method

.method final c(Landroid/app/Activity;Lc/b/a/c/a/c$d;Ljava/lang/String;Lc/b/a/c/a/c$b;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    if-nez v0, :cond_1

    iget-object v0, p0, Lc/b/a/c/a/e;->k:Lc/b/a/c/a/c$b;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "activity cannot be null"

    invoke-static {p1, v0}, Lc/b/a/c/a/f/b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "provider cannot be null"

    invoke-static {p2, v0}, Lc/b/a/c/a/f/b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/b/a/c/a/c$d;

    iput-object p2, p0, Lc/b/a/c/a/e;->i:Lc/b/a/c/a/c$d;

    const-string p2, "listener cannot be null"

    invoke-static {p4, p2}, Lc/b/a/c/a/f/b;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lc/b/a/c/a/c$b;

    iput-object p2, p0, Lc/b/a/c/a/e;->k:Lc/b/a/c/a/c$b;

    iput-object p5, p0, Lc/b/a/c/a/e;->j:Landroid/os/Bundle;

    iget-object p2, p0, Lc/b/a/c/a/e;->h:Lc/b/a/c/a/f/k;

    invoke-virtual {p2}, Lc/b/a/c/a/f/k;->b()V

    invoke-static {}, Lc/b/a/c/a/f/a;->a()Lc/b/a/c/a/f/a;

    move-result-object p2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p4

    new-instance p5, Lc/b/a/c/a/e$a;

    invoke-direct {p5, p0, p1}, Lc/b/a/c/a/e$a;-><init>(Lc/b/a/c/a/e;Landroid/app/Activity;)V

    new-instance p1, Lc/b/a/c/a/e$b;

    invoke-direct {p1, p0}, Lc/b/a/c/a/e$b;-><init>(Lc/b/a/c/a/e;)V

    invoke-virtual {p2, p4, p3, p5, p1}, Lc/b/a/c/a/f/a;->b(Landroid/content/Context;Ljava/lang/String;Lc/b/a/c/a/f/p$a;Lc/b/a/c/a/f/p$b;)Lc/b/a/c/a/f/d;

    move-result-object p1

    iput-object p1, p0, Lc/b/a/c/a/e;->e:Lc/b/a/c/a/f/d;

    invoke-interface {p1}, Lc/b/a/c/a/f/p;->c()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final clearChildFocus(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->hasFocusable()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/ViewGroup;->requestFocus()Z

    return-void

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->clearChildFocus(Landroid/view/View;)V

    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 4

    iget-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    invoke-virtual {v0, v3, p1}, Lc/b/a/c/a/f/o;->j(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    :goto_0
    return v2

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v2, :cond_5

    iget-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    invoke-virtual {v0, v3, p1}, Lc/b/a/c/a/f/o;->n(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_4

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    return v1

    :cond_4
    :goto_1
    return v2

    :cond_5
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final focusableViewAvailable(Landroid/view/View;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->focusableViewAvailable(Landroid/view/View;)V

    iget-object v0, p0, Lc/b/a/c/a/e;->c:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method final h(Z)V
    .locals 2

    if-eqz p1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-ge v0, v1, :cond_0

    const/4 p1, 0x0

    new-array v0, p1, [Ljava/lang/Object;

    const-string v1, "Could not enable TextureView because API level is lower than 14"

    invoke-static {v1, v0}, Lc/b/a/c/a/f/u;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iput-boolean p1, p0, Lc/b/a/c/a/e;->l:Z

    return-void

    :cond_0
    iput-boolean p1, p0, Lc/b/a/c/a/e;->l:Z

    return-void
.end method

.method final j()V
    .locals 1

    iget-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc/b/a/c/a/f/o;->o()V

    :cond_0
    return-void
.end method

.method final k(Z)V
    .locals 1

    iget-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lc/b/a/c/a/f/o;->m(Z)V

    invoke-virtual {p0, p1}, Lc/b/a/c/a/e;->m(Z)V

    :cond_0
    return-void
.end method

.method final l()V
    .locals 1

    iget-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc/b/a/c/a/f/o;->q()V

    :cond_0
    return-void
.end method

.method final m(Z)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc/b/a/c/a/e;->m:Z

    iget-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lc/b/a/c/a/f/o;->i(Z)V

    :cond_0
    return-void
.end method

.method protected final onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lc/b/a/c/a/e;->b:Lc/b/a/c/a/e$c;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lc/b/a/c/a/f/o;->h(Landroid/content/res/Configuration;)V

    :cond_0
    return-void
.end method

.method protected final onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lc/b/a/c/a/e;->b:Lc/b/a/c/a/e$c;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    return-void
.end method

.method protected final onLayout(ZIIII)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    if-lez p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    invoke-virtual {v0, p1, p1, p4, p5}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method protected final onMeasure(II)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void

    :cond_0
    invoke-virtual {p0, v1, v1}, Landroid/view/ViewGroup;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    const/4 p1, 0x1

    return p1
.end method

.method final p()V
    .locals 1

    iget-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lc/b/a/c/a/f/o;->r()V

    :cond_0
    return-void
.end method

.method final q()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lc/b/a/c/a/e;->f:Lc/b/a/c/a/f/o;

    if-nez v0, :cond_0

    iget-object v0, p0, Lc/b/a/c/a/e;->j:Landroid/os/Bundle;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lc/b/a/c/a/f/o;->u()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public final requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    iget-object p1, p0, Lc/b/a/c/a/e;->c:Ljava/util/Set;

    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final setClipToPadding(Z)V
    .locals 0

    return-void
.end method

.method public final setPadding(IIII)V
    .locals 0

    return-void
.end method
