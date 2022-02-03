.class Lcom/digdroid/alman/dig/s$g$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s$g;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/digdroid/alman/dig/s$g;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s$g;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$g$b;->c:Lcom/digdroid/alman/dig/s$g;

    iput p2, p0, Lcom/digdroid/alman/dig/s$g$b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object p2, Lcom/digdroid/alman/dig/s;->o0:[Ljava/lang/String;

    iget v0, p0, Lcom/digdroid/alman/dig/s$g$b;->b:I

    aget-object p2, p2, v0

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "2"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/s$g$b;->c:Lcom/digdroid/alman/dig/s$g;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s$g;->b:Lcom/digdroid/alman/dig/s;

    iget-object v0, p2, Lcom/digdroid/alman/dig/s;->v0:Lcom/digdroid/alman/dig/s3;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s;->y0:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, p1, v1}, Lcom/digdroid/alman/dig/s3;->E(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v5

    new-instance p2, Lcom/digdroid/alman/dig/g2;

    iget-object v0, p0, Lcom/digdroid/alman/dig/s$g$b;->c:Lcom/digdroid/alman/dig/s$g;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s$g;->b:Lcom/digdroid/alman/dig/s;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/digdroid/alman/dig/l;

    sget-object v0, Lcom/digdroid/alman/dig/s;->n0:[I

    iget v1, p0, Lcom/digdroid/alman/dig/s$g$b;->b:I

    aget v4, v0, v1

    new-instance v7, Lcom/digdroid/alman/dig/s$g$b$a;

    invoke-direct {v7, p0, p1}, Lcom/digdroid/alman/dig/s$g$b$a;-><init>(Lcom/digdroid/alman/dig/s$g$b;Ljava/lang/String;)V

    const/4 v6, 0x0

    move-object v2, p2

    invoke-direct/range {v2 .. v7}, Lcom/digdroid/alman/dig/g2;-><init>(Lcom/digdroid/alman/dig/l;IIZLcom/digdroid/alman/dig/g2$b;)V

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/g2;->a()V

    return-void
.end method
