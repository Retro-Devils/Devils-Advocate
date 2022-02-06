.class Lcom/digdroid/alman/dig/q3$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaPlayer$OnSeekCompleteListener;


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

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3$a;->a:Lcom/digdroid/alman/dig/q3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSeekComplete(Landroid/media/MediaPlayer;)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$a;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/q3;->F2(Lcom/digdroid/alman/dig/q3;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$a;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/q3;->t2(Lcom/digdroid/alman/dig/q3;)Landroid/media/MediaPlayer;

    move-result-object p1

    invoke-virtual {p1}, Landroid/media/MediaPlayer;->start()V

    :cond_0
    return-void
.end method
