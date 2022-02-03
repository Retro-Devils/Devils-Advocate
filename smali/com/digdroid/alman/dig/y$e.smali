.class Lcom/digdroid/alman/dig/y$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/y;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/y;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/y;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y$e;->b:Lcom/digdroid/alman/dig/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 p4, 0x0

    aput-object p2, p1, p4

    const-string p2, "Selected index: %d"

    invoke-static {p2, p1}, Lcom/digdroid/alman/dig/y;->r(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$e;->b:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->s(Lcom/digdroid/alman/dig/y;)[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    if-ltz p3, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$e;->b:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->s(Lcom/digdroid/alman/dig/y;)[Ljava/io/File;

    move-result-object p1

    array-length p1, p1

    if-ge p3, p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$e;->b:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->s(Lcom/digdroid/alman/dig/y;)[Ljava/io/File;

    move-result-object p2

    aget-object p2, p2, p3

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/y;->u(Lcom/digdroid/alman/dig/y;Ljava/io/File;)V

    :cond_0
    return-void
.end method
