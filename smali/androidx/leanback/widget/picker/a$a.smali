.class Landroidx/leanback/widget/picker/a$a;
.super Landroidx/leanback/widget/o;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/leanback/widget/picker/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/leanback/widget/picker/a;


# direct methods
.method constructor <init>(Landroidx/leanback/widget/picker/a;)V
    .locals 0

    iput-object p1, p0, Landroidx/leanback/widget/picker/a$a;->a:Landroidx/leanback/widget/picker/a;

    invoke-direct {p0}, Landroidx/leanback/widget/o;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$d0;II)V
    .locals 1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$g;

    move-result-object p4

    check-cast p4, Landroidx/leanback/widget/picker/a$b;

    iget-object p4, p0, Landroidx/leanback/widget/picker/a$a;->a:Landroidx/leanback/widget/picker/a;

    iget-object p4, p4, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    invoke-interface {p4, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    iget-object p4, p0, Landroidx/leanback/widget/picker/a$a;->a:Landroidx/leanback/widget/picker/a;

    const/4 v0, 0x1

    invoke-virtual {p4, p1, v0}, Landroidx/leanback/widget/picker/a;->h(IZ)V

    if-eqz p2, :cond_0

    iget-object p2, p0, Landroidx/leanback/widget/picker/a$a;->a:Landroidx/leanback/widget/picker/a;

    iget-object p2, p2, Landroidx/leanback/widget/picker/a;->e:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/leanback/widget/picker/b;

    invoke-virtual {p2}, Landroidx/leanback/widget/picker/b;->e()I

    move-result p2

    add-int/2addr p2, p3

    iget-object p3, p0, Landroidx/leanback/widget/picker/a$a;->a:Landroidx/leanback/widget/picker/a;

    invoke-virtual {p3, p1, p2}, Landroidx/leanback/widget/picker/a;->c(II)V

    :cond_0
    return-void
.end method
