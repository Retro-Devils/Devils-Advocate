.class Lcom/digdroid/alman/dig/r$e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r$e;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/r$e;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r$e;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r$e$b;->a:Lcom/digdroid/alman/dig/r$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/r$e$b;->a:Lcom/digdroid/alman/dig/r$e;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r$e;->d:Lcom/digdroid/alman/dig/r;

    invoke-static {v0}, Lcom/digdroid/alman/dig/r;->a(Lcom/digdroid/alman/dig/r;)Lcom/digdroid/alman/dig/r3;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/r$e$b;->a:Lcom/digdroid/alman/dig/r$e;

    iget-object v2, v1, Lcom/digdroid/alman/dig/r$e;->d:Lcom/digdroid/alman/dig/r;

    iget-object v3, v2, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    iget v1, v1, Lcom/digdroid/alman/dig/r$e;->c:I

    aget-object v1, v3, v1

    invoke-virtual {v2, v1}, Lcom/digdroid/alman/dig/r;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "folder"

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r$e$b;->a:Lcom/digdroid/alman/dig/r$e;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r$e;->d:Lcom/digdroid/alman/dig/r;

    invoke-static {v0}, Lcom/digdroid/alman/dig/r;->a(Lcom/digdroid/alman/dig/r;)Lcom/digdroid/alman/dig/r3;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/r$e$b;->a:Lcom/digdroid/alman/dig/r$e;

    iget-object v1, v1, Lcom/digdroid/alman/dig/r$e;->d:Lcom/digdroid/alman/dig/r;

    const-string v2, "sound_path"

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/r;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aget-object p1, p1, v2

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r$e$b;->a:Lcom/digdroid/alman/dig/r$e;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r$e;->d:Lcom/digdroid/alman/dig/r;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
