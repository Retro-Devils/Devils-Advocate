.class Lcom/digdroid/alman/dig/y$d;
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

    iput-object p1, p0, Lcom/digdroid/alman/dig/y$d;->b:Lcom/digdroid/alman/dig/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$d;->b:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->q(Lcom/digdroid/alman/dig/y;)Lc/d/a/a;

    move-result-object p1

    new-instance v0, Lcom/digdroid/alman/dig/y$d$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/y$d$a;-><init>(Lcom/digdroid/alman/dig/y$d;)V

    invoke-virtual {p1, v0}, Lc/d/a/a;->a(Lc/d/a/b;)V

    return-void
.end method
