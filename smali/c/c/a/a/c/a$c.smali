.class Lc/c/a/a/c/a$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/c/a/a/c/a$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lc/c/a/a/c/a;->setLayoutManagerInternal(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lc/c/a/a/c/a;


# direct methods
.method constructor <init>(Lc/c/a/a/c/a;)V
    .locals 0

    iput-object p1, p0, Lc/c/a/a/c/a$c;->a:Lc/c/a/a/c/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView$g;Landroid/view/View;II)Z
    .locals 1

    iget-object p1, p0, Lc/c/a/a/c/a$c;->a:Lc/c/a/a/c/a;

    invoke-static {p1}, Lc/c/a/a/c/a;->K1(Lc/c/a/a/c/a;)Lc/c/a/a/c/a$g;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lc/c/a/a/c/a$c;->a:Lc/c/a/a/c/a;

    invoke-static {p1}, Lc/c/a/a/c/a;->L1(Lc/c/a/a/c/a;)Lc/c/a/a/c/a$h;

    move-result-object p1

    iget-object v0, p0, Lc/c/a/a/c/a$c;->a:Lc/c/a/a/c/a;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object v0

    invoke-interface {p1, v0, p2, p3, p4}, Lc/c/a/a/c/a$h;->a(Landroidx/recyclerview/widget/RecyclerView$g;Landroid/view/View;II)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
