.class Lcom/digdroid/alman/dig/r3$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/media/MediaPlayer$OnPreparedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r3;->Q2(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/r3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r3$i;->a:Lcom/digdroid/alman/dig/r3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPrepared(Landroid/media/MediaPlayer;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/r3$i;->a:Lcom/digdroid/alman/dig/r3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/r3;->v2(Lcom/digdroid/alman/dig/r3;)Landroid/media/MediaPlayer;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$i;->a:Lcom/digdroid/alman/dig/r3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/r3;->t2(Lcom/digdroid/alman/dig/r3;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/media/MediaPlayer;->seekTo(I)V

    return-void
.end method
