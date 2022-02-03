.class Lcom/digdroid/alman/dig/s$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s;->j3(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field b:I

.field final synthetic c:Ljava/util/ArrayList;

.field final synthetic d:Landroid/widget/Spinner;

.field final synthetic e:Lcom/digdroid/alman/dig/s;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s;Ljava/util/ArrayList;Landroid/widget/Spinner;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$j;->e:Lcom/digdroid/alman/dig/s;

    iput-object p2, p0, Lcom/digdroid/alman/dig/s$j;->c:Ljava/util/ArrayList;

    iput-object p3, p0, Lcom/digdroid/alman/dig/s$j;->d:Landroid/widget/Spinner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lcom/digdroid/alman/dig/s$j;->b:I

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget p1, p0, Lcom/digdroid/alman/dig/s$j;->b:I

    if-ne p3, p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/s$j;->e:Lcom/digdroid/alman/dig/s;

    iput p3, p1, Lcom/digdroid/alman/dig/s;->w0:I

    iget-object p2, p0, Lcom/digdroid/alman/dig/s$j;->c:Ljava/util/ArrayList;

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/digdroid/alman/dig/s3;

    iput-object p2, p1, Lcom/digdroid/alman/dig/s;->v0:Lcom/digdroid/alman/dig/s3;

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$j;->e:Lcom/digdroid/alman/dig/s;

    iget p2, p1, Lcom/digdroid/alman/dig/s;->x0:I

    if-lez p2, :cond_2

    iget p2, p0, Lcom/digdroid/alman/dig/s$j;->b:I

    if-ltz p2, :cond_1

    const/4 p2, 0x0

    iput p2, p1, Lcom/digdroid/alman/dig/s;->x0:I

    :cond_1
    sget-object p2, Lcom/digdroid/alman/dig/s;->q0:[Ljava/lang/String;

    iget p4, p1, Lcom/digdroid/alman/dig/s;->x0:I

    aget-object p2, p2, p4

    iput-object p2, p1, Lcom/digdroid/alman/dig/s;->y0:Ljava/lang/String;

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$j;->d:Landroid/widget/Spinner;

    invoke-virtual {p1, p4}, Landroid/widget/Spinner;->setSelection(I)V

    goto :goto_0

    :cond_2
    new-instance p2, Lcom/digdroid/alman/dig/r;

    iget-object p4, p0, Lcom/digdroid/alman/dig/s$j;->e:Lcom/digdroid/alman/dig/s;

    invoke-virtual {p4}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    iget-object p4, p0, Lcom/digdroid/alman/dig/s$j;->e:Lcom/digdroid/alman/dig/s;

    iget-object v2, p4, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget-object v3, p4, Lcom/digdroid/alman/dig/s;->v0:Lcom/digdroid/alman/dig/s3;

    sget-object p5, Lcom/digdroid/alman/dig/s;->q0:[Ljava/lang/String;

    iget p4, p4, Lcom/digdroid/alman/dig/s;->x0:I

    aget-object v4, p5, p4

    sget-object p5, Lcom/digdroid/alman/dig/s;->r0:[[I

    aget-object v5, p5, p4

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/r;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/t3;Lcom/digdroid/alman/dig/s3;Ljava/lang/String;[I)V

    iput-object p2, p1, Lcom/digdroid/alman/dig/s;->t0:Lcom/digdroid/alman/dig/r;

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$j;->e:Lcom/digdroid/alman/dig/s;

    iget-object p2, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->t0:Lcom/digdroid/alman/dig/r;

    invoke-virtual {p2, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    :goto_0
    iput p3, p0, Lcom/digdroid/alman/dig/s$j;->b:I

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
