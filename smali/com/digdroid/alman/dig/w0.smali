.class Lcom/digdroid/alman/dig/w0;
.super Lcom/digdroid/alman/dig/b4;
.source ""


# instance fields
.field l:Lcom/digdroid/alman/dig/q0;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FFLcom/digdroid/alman/dig/u;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 12

    move-object v0, p0

    invoke-direct/range {p0 .. p5}, Lcom/digdroid/alman/dig/b4;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FF)V

    new-instance v11, Lcom/digdroid/alman/dig/q0;

    move-object v1, v11

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/digdroid/alman/dig/q0;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FFLcom/digdroid/alman/dig/u;Ljava/lang/String;Ljava/lang/String;Z)V

    iput-object v11, v0, Lcom/digdroid/alman/dig/w0;->l:Lcom/digdroid/alman/dig/q0;

    iput-object v11, v0, Lcom/digdroid/alman/dig/h;->k:Lcom/digdroid/alman/dig/h$c;

    return-void
.end method


# virtual methods
.method public j(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 7

    invoke-super {p0, p1, p2}, Lcom/digdroid/alman/dig/b4;->j(Landroidx/recyclerview/widget/RecyclerView$d0;I)V

    if-eqz p1, :cond_0

    check-cast p1, Lcom/digdroid/alman/dig/x0;

    iget-object v0, p0, Lcom/digdroid/alman/dig/w0;->l:Lcom/digdroid/alman/dig/q0;

    iget-object v1, p1, Lcom/digdroid/alman/dig/x0;->u:Landroid/widget/ImageView;

    iget-object v2, p1, Lcom/digdroid/alman/dig/x0;->v:Landroid/widget/TextView;

    iget-object v3, p1, Lcom/digdroid/alman/dig/x0;->w:Landroid/widget/TextView;

    iget-object v4, p1, Lcom/digdroid/alman/dig/x0;->x:Landroidx/appcompat/widget/AppCompatRatingBar;

    iget-object v5, p1, Lcom/digdroid/alman/dig/x0;->y:Landroid/widget/TextView;

    move v6, p2

    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/q0;->b(Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/appcompat/widget/AppCompatRatingBar;Landroid/widget/TextView;I)V

    :cond_0
    return-void
.end method

.method public l(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c002f

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/w0;->l:Lcom/digdroid/alman/dig/q0;

    iget v0, p0, Lcom/digdroid/alman/dig/h;->f:I

    int-to-float v0, v0

    invoke-virtual {p2, p1, v0}, Lcom/digdroid/alman/dig/q0;->i(Landroid/view/View;F)Lcom/digdroid/alman/dig/x0;

    move-result-object p1

    return-object p1
.end method
