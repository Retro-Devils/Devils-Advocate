.class Lcom/digdroid/alman/dig/s0;
.super Lcom/digdroid/alman/dig/r0;
.source ""


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLcom/digdroid/alman/dig/u;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct/range {p0 .. p9}, Lcom/digdroid/alman/dig/r0;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLcom/digdroid/alman/dig/u;Ljava/lang/String;Ljava/lang/String;Z)V

    iget p1, p0, Lcom/digdroid/alman/dig/h;->f:I

    int-to-double p1, p1

    const-wide/high16 p3, 0x4008000000000000L    # 3.0

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p1, p1, p3

    const-wide/high16 p3, 0x4000000000000000L    # 2.0

    div-double/2addr p1, p3

    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    long-to-int p2, p1

    iput p2, p0, Lcom/digdroid/alman/dig/h;->f:I

    return-void
.end method


# virtual methods
.method public l(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0032

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/r0;->l:Lcom/digdroid/alman/dig/q0;

    iget v0, p0, Lcom/digdroid/alman/dig/h;->f:I

    int-to-float v0, v0

    invoke-virtual {p2, p1, v0}, Lcom/digdroid/alman/dig/q0;->h(Landroid/view/View;F)Lcom/digdroid/alman/dig/x0;

    move-result-object p1

    return-object p1
.end method
