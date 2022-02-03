.class Lcom/digdroid/alman/dig/s$a;
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

.field final synthetic c:Lcom/digdroid/alman/dig/s;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$a;->c:Lcom/digdroid/alman/dig/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    iput p1, p0, Lcom/digdroid/alman/dig/s$a;->b:I

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

    iget p1, p0, Lcom/digdroid/alman/dig/s$a;->b:I

    if-ne p3, p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/s$a;->c:Lcom/digdroid/alman/dig/s;

    iput p3, p1, Lcom/digdroid/alman/dig/s;->x0:I

    sget-object p2, Lcom/digdroid/alman/dig/s;->q0:[Ljava/lang/String;

    aget-object p4, p2, p3

    iput-object p4, p1, Lcom/digdroid/alman/dig/s;->y0:Ljava/lang/String;

    new-instance p4, Lcom/digdroid/alman/dig/r;

    iget-object p5, p0, Lcom/digdroid/alman/dig/s$a;->c:Lcom/digdroid/alman/dig/s;

    invoke-virtual {p5}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    iget-object p5, p0, Lcom/digdroid/alman/dig/s$a;->c:Lcom/digdroid/alman/dig/s;

    iget-object v2, p5, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget-object v3, p5, Lcom/digdroid/alman/dig/s;->v0:Lcom/digdroid/alman/dig/r3;

    iget p5, p5, Lcom/digdroid/alman/dig/s;->x0:I

    aget-object v4, p2, p5

    sget-object p2, Lcom/digdroid/alman/dig/s;->r0:[[I

    aget-object v5, p2, p5

    move-object v0, p4

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/r;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/s3;Lcom/digdroid/alman/dig/r3;Ljava/lang/String;[I)V

    iput-object p4, p1, Lcom/digdroid/alman/dig/s;->t0:Lcom/digdroid/alman/dig/r;

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$a;->c:Lcom/digdroid/alman/dig/s;

    iget-object p2, p1, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->t0:Lcom/digdroid/alman/dig/r;

    invoke-virtual {p2, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iput p3, p0, Lcom/digdroid/alman/dig/s$a;->b:I

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
