.class Landroidx/leanback/widget/picker/a$b;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/leanback/widget/picker/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$g<",
        "Landroidx/leanback/widget/picker/a$d;",
        ">;"
    }
.end annotation


# instance fields
.field private final c:I

.field private final d:I

.field private final e:I

.field private f:Landroidx/leanback/widget/picker/b;

.field final synthetic g:Landroidx/leanback/widget/picker/a;


# direct methods
.method constructor <init>(Landroidx/leanback/widget/picker/a;Landroid/content/Context;III)V
    .locals 0

    iput-object p1, p0, Landroidx/leanback/widget/picker/a$b;->g:Landroidx/leanback/widget/picker/a;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    iput p3, p0, Landroidx/leanback/widget/picker/a$b;->c:I

    iput p5, p0, Landroidx/leanback/widget/picker/a$b;->d:I

    iput p4, p0, Landroidx/leanback/widget/picker/a$b;->e:I

    iget-object p1, p1, Landroidx/leanback/widget/picker/a;->e:Ljava/util/ArrayList;

    invoke-virtual {p1, p5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/leanback/widget/picker/b;

    iput-object p1, p0, Landroidx/leanback/widget/picker/a$b;->f:Landroidx/leanback/widget/picker/b;

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/picker/a$b;->f:Landroidx/leanback/widget/picker/b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/leanback/widget/picker/b;->a()I

    move-result v0

    :goto_0
    return v0
.end method

.method public bridge synthetic j(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    check-cast p1, Landroidx/leanback/widget/picker/a$d;

    invoke-virtual {p0, p1, p2}, Landroidx/leanback/widget/picker/a$b;->u(Landroidx/leanback/widget/picker/a$d;I)V

    return-void
.end method

.method public bridge synthetic l(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/leanback/widget/picker/a$b;->v(Landroid/view/ViewGroup;I)Landroidx/leanback/widget/picker/a$d;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic o(Landroidx/recyclerview/widget/RecyclerView$d0;)V
    .locals 0

    check-cast p1, Landroidx/leanback/widget/picker/a$d;

    invoke-virtual {p0, p1}, Landroidx/leanback/widget/picker/a$b;->w(Landroidx/leanback/widget/picker/a$d;)V

    return-void
.end method

.method public u(Landroidx/leanback/widget/picker/a$d;I)V
    .locals 3

    iget-object v0, p1, Landroidx/leanback/widget/picker/a$d;->t:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/leanback/widget/picker/a$b;->f:Landroidx/leanback/widget/picker/b;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/leanback/widget/picker/b;->e()I

    move-result v2

    add-int/2addr v2, p2

    invoke-virtual {v1, v2}, Landroidx/leanback/widget/picker/b;->c(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Landroidx/leanback/widget/picker/a$b;->g:Landroidx/leanback/widget/picker/a;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    iget-object v1, v0, Landroidx/leanback/widget/picker/a;->d:Ljava/util/List;

    iget v2, p0, Landroidx/leanback/widget/picker/a$b;->d:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/leanback/widget/VerticalGridView;

    invoke-virtual {v1}, Landroidx/leanback/widget/a;->getSelectedPosition()I

    move-result v1

    const/4 v2, 0x0

    if-ne v1, p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    iget v1, p0, Landroidx/leanback/widget/picker/a$b;->d:I

    invoke-virtual {v0, p1, p2, v1, v2}, Landroidx/leanback/widget/picker/a;->g(Landroid/view/View;ZIZ)V

    return-void
.end method

.method public v(Landroid/view/ViewGroup;I)Landroidx/leanback/widget/picker/a$d;
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    iget v0, p0, Landroidx/leanback/widget/picker/a$b;->c:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iget p2, p0, Landroidx/leanback/widget/picker/a$b;->e:I

    if-eqz p2, :cond_0

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    goto :goto_0

    :cond_0
    move-object p2, p1

    check-cast p2, Landroid/widget/TextView;

    :goto_0
    new-instance v0, Landroidx/leanback/widget/picker/a$d;

    invoke-direct {v0, p1, p2}, Landroidx/leanback/widget/picker/a$d;-><init>(Landroid/view/View;Landroid/widget/TextView;)V

    return-object v0
.end method

.method public w(Landroidx/leanback/widget/picker/a$d;)V
    .locals 1

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$d0;->b:Landroid/view/View;

    iget-object v0, p0, Landroidx/leanback/widget/picker/a$b;->g:Landroidx/leanback/widget/picker/a;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->isActivated()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    return-void
.end method
