.class abstract Lcom/digdroid/alman/dig/a4;
.super Lcom/digdroid/alman/dig/h;
.source ""


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FF)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/digdroid/alman/dig/h;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FF)V

    return-void
.end method


# virtual methods
.method public j(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 0

    if-eqz p1, :cond_0

    check-cast p1, Lcom/digdroid/alman/dig/u1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/u1;->t:Landroid/view/View;

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/h;->y(Landroid/view/View;I)V

    :cond_0
    return-void
.end method
