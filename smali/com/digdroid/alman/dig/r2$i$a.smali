.class Lcom/digdroid/alman/dig/r2$i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2$i;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/r2$i;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2$i;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$i$a;->a:Lcom/digdroid/alman/dig/r2$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$i$a;->a:Lcom/digdroid/alman/dig/r2$i;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r2$i;->f:Lcom/digdroid/alman/dig/r2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v1, "theme_storage"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->E(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$i$a;->a:Lcom/digdroid/alman/dig/r2$i;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r2$i;->f:Lcom/digdroid/alman/dig/r2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    aget-object p1, p1, v2

    const-string v1, "theme_storage_dir"

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/c3;->G(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$i$a;->a:Lcom/digdroid/alman/dig/r2$i;

    invoke-static {p1}, Lcom/digdroid/alman/dig/r2$i;->a(Lcom/digdroid/alman/dig/r2$i;)V

    return-void
.end method
