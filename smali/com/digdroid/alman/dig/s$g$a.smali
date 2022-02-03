.class Lcom/digdroid/alman/dig/s$g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/g2$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s$g;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/digdroid/alman/dig/s$g;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s$g;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$g$a;->b:Lcom/digdroid/alman/dig/s$g;

    iput p2, p0, Lcom/digdroid/alman/dig/s$g$a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/s$g$a;->b:Lcom/digdroid/alman/dig/s$g;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s$g;->b:Lcom/digdroid/alman/dig/s;

    iget-object v1, v0, Lcom/digdroid/alman/dig/s;->v0:Lcom/digdroid/alman/dig/s3;

    iget v2, p0, Lcom/digdroid/alman/dig/s$g$a;->a:I

    const/16 v3, 0xa

    if-ne v2, v3, :cond_0

    sget-object v0, Lcom/digdroid/alman/dig/s;->o0:[Ljava/lang/String;

    aget-object v0, v0, v2

    goto :goto_0

    :cond_0
    sget-object v3, Lcom/digdroid/alman/dig/s;->o0:[Ljava/lang/String;

    aget-object v2, v3, v2

    invoke-static {v0, v2}, Lcom/digdroid/alman/dig/s;->h3(Lcom/digdroid/alman/dig/s;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {v1, v0, p1}, Lcom/digdroid/alman/dig/n;->o(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/s$g$a;->b:Lcom/digdroid/alman/dig/s$g;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s$g;->b:Lcom/digdroid/alman/dig/s;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s;->t0:Lcom/digdroid/alman/dig/r;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
