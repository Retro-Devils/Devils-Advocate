.class Lcom/digdroid/alman/dig/r$f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r$f;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/r$f;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r$f;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r$f$a;->a:Lcom/digdroid/alman/dig/r$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/r$f$a;->a:Lcom/digdroid/alman/dig/r$f;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r$f;->e:Lcom/digdroid/alman/dig/r;

    invoke-static {v0}, Lcom/digdroid/alman/dig/r;->a(Lcom/digdroid/alman/dig/r;)Lcom/digdroid/alman/dig/s3;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/r$f$a;->a:Lcom/digdroid/alman/dig/r$f;

    iget-object v1, v1, Lcom/digdroid/alman/dig/r$f;->c:Ljava/lang/String;

    const/4 v2, 0x0

    aget-object p1, p1, v2

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r$f$a;->a:Lcom/digdroid/alman/dig/r$f;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r$f;->e:Lcom/digdroid/alman/dig/r;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
