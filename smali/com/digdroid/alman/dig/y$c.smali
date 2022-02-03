.class Lcom/digdroid/alman/dig/y$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


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

    iput-object p1, p0, Lcom/digdroid/alman/dig/y$c;->b:Lcom/digdroid/alman/dig/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$c;->b:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->a(Lcom/digdroid/alman/dig/y;)Ljava/io/File;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/y;->c(Lcom/digdroid/alman/dig/y;Ljava/io/File;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$c;->b:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->p(Lcom/digdroid/alman/dig/y;)V

    :cond_0
    return-void
.end method
