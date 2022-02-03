.class final Lc/b/a/c/a/e$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/b/a/c/a/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation


# instance fields
.field final synthetic b:Lc/b/a/c/a/e;


# direct methods
.method private constructor <init>(Lc/b/a/c/a/e;)V
    .locals 0

    iput-object p1, p0, Lc/b/a/c/a/e$c;->b:Lc/b/a/c/a/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lc/b/a/c/a/e;B)V
    .locals 0

    invoke-direct {p0, p1}, Lc/b/a/c/a/e$c;-><init>(Lc/b/a/c/a/e;)V

    return-void
.end method


# virtual methods
.method public final onGlobalFocusChanged(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lc/b/a/c/a/e$c;->b:Lc/b/a/c/a/e;

    invoke-static {v0}, Lc/b/a/c/a/e;->o(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/o;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc/b/a/c/a/e$c;->b:Lc/b/a/c/a/e;

    invoke-static {v0}, Lc/b/a/c/a/e;->v(Lc/b/a/c/a/e;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lc/b/a/c/a/e$c;->b:Lc/b/a/c/a/e;

    invoke-static {p2}, Lc/b/a/c/a/e;->v(Lc/b/a/c/a/e;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lc/b/a/c/a/e$c;->b:Lc/b/a/c/a/e;

    invoke-static {p1}, Lc/b/a/c/a/e;->o(Lc/b/a/c/a/e;)Lc/b/a/c/a/f/o;

    move-result-object p1

    invoke-virtual {p1}, Lc/b/a/c/a/f/o;->t()V

    :cond_0
    return-void
.end method
