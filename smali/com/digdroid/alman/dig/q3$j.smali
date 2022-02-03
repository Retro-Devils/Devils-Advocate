.class Lcom/digdroid/alman/dig/q3$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaPlayer$OnCompletionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q3;->O2(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/q3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3$j;->a:Lcom/digdroid/alman/dig/q3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCompletion(Landroid/media/MediaPlayer;)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$j;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/q3;->x2(Lcom/digdroid/alman/dig/q3;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "file"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$j;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/q3;->t2(Lcom/digdroid/alman/dig/q3;)Landroid/media/MediaPlayer;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->seekTo(I)V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/digdroid/alman/dig/q3$o;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3$j;->a:Lcom/digdroid/alman/dig/q3;

    const/4 v2, 0x0

    invoke-direct {p1, v1, v2}, Lcom/digdroid/alman/dig/q3$o;-><init>(Lcom/digdroid/alman/dig/q3;Lcom/digdroid/alman/dig/q3$b;)V

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method
