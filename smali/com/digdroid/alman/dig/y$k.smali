.class Lcom/digdroid/alman/dig/y$k;
.super Landroid/os/FileObserver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/y;->A(Ljava/lang/String;)Landroid/os/FileObserver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/y;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/y;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y$k;->a:Lcom/digdroid/alman/dig/y;

    invoke-direct {p0, p2, p3}, Landroid/os/FileObserver;-><init>(Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public onEvent(ILjava/lang/String;)V
    .locals 1

    const/4 p2, 0x1

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v0, 0x0

    aput-object p1, p2, v0

    const-string p1, "FileObserver received event %d"

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/y;->r(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$k;->a:Lcom/digdroid/alman/dig/y;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p2, Lcom/digdroid/alman/dig/y$k$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/y$k$a;-><init>(Lcom/digdroid/alman/dig/y$k;)V

    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
