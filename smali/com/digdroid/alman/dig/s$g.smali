.class Lcom/digdroid/alman/dig/s$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s;->h3(Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/s;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$g;->b:Lcom/digdroid/alman/dig/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
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

    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 p2, 0x8

    if-ge p1, p2, :cond_0

    return-void

    :cond_0
    if-ne p1, p2, :cond_1

    iget-object p2, p0, Lcom/digdroid/alman/dig/s$g;->b:Lcom/digdroid/alman/dig/s;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s;->v0:Lcom/digdroid/alman/dig/r3;

    sget-object p3, Lcom/digdroid/alman/dig/s;->o0:[Ljava/lang/String;

    aget-object p4, p3, p1

    aget-object p1, p3, p1

    const/4 p3, -0x1

    invoke-virtual {p2, p1, p3}, Lcom/digdroid/alman/dig/n;->f(Ljava/lang/String;I)I

    move-result p1

    xor-int/2addr p1, p3

    invoke-virtual {p2, p4, p1}, Lcom/digdroid/alman/dig/n;->o(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$g;->b:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->t0:Lcom/digdroid/alman/dig/r;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    goto/16 :goto_1

    :cond_1
    const/16 p2, 0xd

    if-gt p1, p2, :cond_3

    iget-object p2, p0, Lcom/digdroid/alman/dig/s$g;->b:Lcom/digdroid/alman/dig/s;

    iget-object p3, p2, Lcom/digdroid/alman/dig/s;->v0:Lcom/digdroid/alman/dig/r3;

    const/16 p4, 0xa

    if-ne p1, p4, :cond_2

    const-string p2, "default"

    goto :goto_0

    :cond_2
    iget-object p2, p2, Lcom/digdroid/alman/dig/s;->y0:Ljava/lang/String;

    :goto_0
    sget-object p4, Lcom/digdroid/alman/dig/s;->o0:[Ljava/lang/String;

    aget-object p4, p4, p1

    const/4 p5, 0x0

    invoke-virtual {p3, p2, p4, p5}, Lcom/digdroid/alman/dig/r3;->E(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v3

    new-instance p2, Lcom/digdroid/alman/dig/g2;

    iget-object p3, p0, Lcom/digdroid/alman/dig/s$g;->b:Lcom/digdroid/alman/dig/s;

    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p3

    move-object v1, p3

    check-cast v1, Lcom/digdroid/alman/dig/l;

    sget-object p3, Lcom/digdroid/alman/dig/s;->n0:[I

    aget v2, p3, p1

    const/4 v4, 0x1

    new-instance v5, Lcom/digdroid/alman/dig/s$g$a;

    invoke-direct {v5, p0, p1}, Lcom/digdroid/alman/dig/s$g$a;-><init>(Lcom/digdroid/alman/dig/s$g;I)V

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/g2;-><init>(Lcom/digdroid/alman/dig/l;IIZLcom/digdroid/alman/dig/g2$b;)V

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/g2;->a()V

    goto :goto_1

    :cond_3
    const/16 p2, 0xe

    if-ne p1, p2, :cond_4

    new-instance p2, Landroidx/appcompat/app/b$a;

    iget-object p3, p0, Lcom/digdroid/alman/dig/s$g;->b:Lcom/digdroid/alman/dig/s;

    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p3

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result p4

    invoke-direct {p2, p3, p4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const p3, 0x7f11010c

    invoke-virtual {p2, p3}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p2

    const p3, 0x7f110258

    new-instance p4, Lcom/digdroid/alman/dig/s$g$c;

    invoke-direct {p4, p0, p1}, Lcom/digdroid/alman/dig/s$g$c;-><init>(Lcom/digdroid/alman/dig/s$g;I)V

    invoke-virtual {p2, p3, p4}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p2

    const p3, 0x7f1100d9

    new-instance p4, Lcom/digdroid/alman/dig/s$g$b;

    invoke-direct {p4, p0, p1}, Lcom/digdroid/alman/dig/s$g$b;-><init>(Lcom/digdroid/alman/dig/s$g;I)V

    invoke-virtual {p2, p3, p4}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const p2, 0x7f11005a

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3}, Landroidx/appcompat/app/b$a;->m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_4
    :goto_1
    return-void
.end method
