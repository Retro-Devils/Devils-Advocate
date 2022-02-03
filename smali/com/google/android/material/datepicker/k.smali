.class Lcom/google/android/material/datepicker/k;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/datepicker/k$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$g<",
        "Lcom/google/android/material/datepicker/k$b;",
        ">;"
    }
.end annotation


# instance fields
.field private final c:Lcom/google/android/material/datepicker/a;

.field private final d:Lcom/google/android/material/datepicker/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/material/datepicker/d<",
            "*>;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/android/material/datepicker/g$l;

.field private final f:I


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/a;Lcom/google/android/material/datepicker/g$l;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/google/android/material/datepicker/d<",
            "*>;",
            "Lcom/google/android/material/datepicker/a;",
            "Lcom/google/android/material/datepicker/g$l;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    invoke-virtual {p3}, Lcom/google/android/material/datepicker/a;->k()Lcom/google/android/material/datepicker/i;

    move-result-object v0

    invoke-virtual {p3}, Lcom/google/android/material/datepicker/a;->h()Lcom/google/android/material/datepicker/i;

    move-result-object v1

    invoke-virtual {p3}, Lcom/google/android/material/datepicker/a;->j()Lcom/google/android/material/datepicker/i;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/i;->b(Lcom/google/android/material/datepicker/i;)I

    move-result v0

    if-gtz v0, :cond_2

    invoke-virtual {v2, v1}, Lcom/google/android/material/datepicker/i;->b(Lcom/google/android/material/datepicker/i;)I

    move-result v0

    if-gtz v0, :cond_1

    sget v0, Lcom/google/android/material/datepicker/j;->b:I

    invoke-static {p1}, Lcom/google/android/material/datepicker/g;->C2(Landroid/content/Context;)I

    move-result v1

    mul-int v0, v0, v1

    invoke-static {p1}, Lcom/google/android/material/datepicker/h;->u2(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Lcom/google/android/material/datepicker/g;->C2(Landroid/content/Context;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/material/datepicker/k;->f:I

    iput-object p3, p0, Lcom/google/android/material/datepicker/k;->c:Lcom/google/android/material/datepicker/a;

    iput-object p2, p0, Lcom/google/android/material/datepicker/k;->d:Lcom/google/android/material/datepicker/d;

    iput-object p4, p0, Lcom/google/android/material/datepicker/k;->e:Lcom/google/android/material/datepicker/g$l;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->s(Z)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "currentPage cannot be after lastPage"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "firstPage cannot be after currentPage"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static synthetic u(Lcom/google/android/material/datepicker/k;)Lcom/google/android/material/datepicker/g$l;
    .locals 0

    iget-object p0, p0, Lcom/google/android/material/datepicker/k;->e:Lcom/google/android/material/datepicker/g$l;

    return-object p0
.end method


# virtual methods
.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->c:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->i()I

    move-result v0

    return v0
.end method

.method public d(I)J
    .locals 2

    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->c:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->k()Lcom/google/android/material/datepicker/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/i;->m(I)Lcom/google/android/material/datepicker/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/i;->l()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic j(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    check-cast p1, Lcom/google/android/material/datepicker/k$b;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/datepicker/k;->y(Lcom/google/android/material/datepicker/k$b;I)V

    return-void
.end method

.method public bridge synthetic l(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/google/android/material/datepicker/k;->z(Landroid/view/ViewGroup;I)Lcom/google/android/material/datepicker/k$b;

    move-result-object p1

    return-object p1
.end method

.method v(I)Lcom/google/android/material/datepicker/i;
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->c:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->k()Lcom/google/android/material/datepicker/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/i;->m(I)Lcom/google/android/material/datepicker/i;

    move-result-object p1

    return-object p1
.end method

.method w(I)Ljava/lang/CharSequence;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/k;->v(I)Lcom/google/android/material/datepicker/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/i;->k()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method x(Lcom/google/android/material/datepicker/i;)I
    .locals 1

    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->c:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->k()Lcom/google/android/material/datepicker/i;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/i;->n(Lcom/google/android/material/datepicker/i;)I

    move-result p1

    return p1
.end method

.method public y(Lcom/google/android/material/datepicker/k$b;I)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/material/datepicker/k;->c:Lcom/google/android/material/datepicker/a;

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/a;->k()Lcom/google/android/material/datepicker/i;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/google/android/material/datepicker/i;->m(I)Lcom/google/android/material/datepicker/i;

    move-result-object p2

    iget-object v0, p1, Lcom/google/android/material/datepicker/k$b;->t:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/google/android/material/datepicker/i;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p1, Lcom/google/android/material/datepicker/k$b;->u:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    sget v0, Lc/b/a/b/f;->e:I

    invoke-virtual {p1, v0}, Landroid/widget/GridView;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/j;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/j;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/material/datepicker/j;->c:Lcom/google/android/material/datepicker/i;

    invoke-virtual {p2, v0}, Lcom/google/android/material/datepicker/i;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->b()Lcom/google/android/material/datepicker/j;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/material/datepicker/j;

    iget-object v1, p0, Lcom/google/android/material/datepicker/k;->d:Lcom/google/android/material/datepicker/d;

    iget-object v2, p0, Lcom/google/android/material/datepicker/k;->c:Lcom/google/android/material/datepicker/a;

    invoke-direct {v0, p2, v1, v2}, Lcom/google/android/material/datepicker/j;-><init>(Lcom/google/android/material/datepicker/i;Lcom/google/android/material/datepicker/d;Lcom/google/android/material/datepicker/a;)V

    iget p2, p2, Lcom/google/android/material/datepicker/i;->f:I

    invoke-virtual {p1, p2}, Landroid/widget/GridView;->setNumColumns(I)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setAdapter(Landroid/widget/ListAdapter;)V

    :goto_0
    new-instance p2, Lcom/google/android/material/datepicker/k$a;

    invoke-direct {p2, p0, p1}, Lcom/google/android/material/datepicker/k$a;-><init>(Lcom/google/android/material/datepicker/k;Lcom/google/android/material/datepicker/MaterialCalendarGridView;)V

    invoke-virtual {p1, p2}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    return-void
.end method

.method public z(Landroid/view/ViewGroup;I)Lcom/google/android/material/datepicker/k$b;
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lc/b/a/b/h;->n:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/material/datepicker/h;->u2(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Landroidx/recyclerview/widget/RecyclerView$p;

    const/4 v0, -0x1

    iget v1, p0, Lcom/google/android/material/datepicker/k;->f:I

    invoke-direct {p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView$p;-><init>(II)V

    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p1, Lcom/google/android/material/datepicker/k$b;

    const/4 v0, 0x1

    invoke-direct {p1, p2, v0}, Lcom/google/android/material/datepicker/k$b;-><init>(Landroid/widget/LinearLayout;Z)V

    return-object p1

    :cond_0
    new-instance p1, Lcom/google/android/material/datepicker/k$b;

    invoke-direct {p1, p2, v1}, Lcom/google/android/material/datepicker/k$b;-><init>(Landroid/widget/LinearLayout;Z)V

    return-object p1
.end method
