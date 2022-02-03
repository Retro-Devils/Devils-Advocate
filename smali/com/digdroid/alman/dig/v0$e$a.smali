.class Lcom/digdroid/alman/dig/v0$e$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v0$e;->onProgressChanged(Landroid/widget/SeekBar;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/SeekBar;

.field final synthetic c:Lcom/digdroid/alman/dig/v0$e;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v0$e;Landroid/widget/SeekBar;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0$e$a;->c:Lcom/digdroid/alman/dig/v0$e;

    iput-object p2, p0, Lcom/digdroid/alman/dig/v0$e$a;->b:Landroid/widget/SeekBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0$e$a;->c:Lcom/digdroid/alman/dig/v0$e;

    iget-object v0, v0, Lcom/digdroid/alman/dig/v0$e;->c:Lcom/digdroid/alman/dig/v0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/v0$e$a;->b:Landroid/widget/SeekBar;

    invoke-virtual {v1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v1

    add-int/lit8 v1, v1, 0x14

    iput v1, v0, Lcom/digdroid/alman/dig/v0;->l:I

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0$e$a;->c:Lcom/digdroid/alman/dig/v0$e;

    iget-object v0, v0, Lcom/digdroid/alman/dig/v0$e;->c:Lcom/digdroid/alman/dig/v0;

    iget-object v1, v0, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/c3;

    iget v0, v0, Lcom/digdroid/alman/dig/v0;->l:I

    const-string v2, "games_preview_size"

    invoke-virtual {v1, v2, v0}, Lcom/digdroid/alman/dig/c3;->E(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0$e$a;->c:Lcom/digdroid/alman/dig/v0$e;

    iget-object v0, v0, Lcom/digdroid/alman/dig/v0$e;->c:Lcom/digdroid/alman/dig/v0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/v0;->h()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0$e$a;->c:Lcom/digdroid/alman/dig/v0$e;

    iget-object v0, v0, Lcom/digdroid/alman/dig/v0$e;->c:Lcom/digdroid/alman/dig/v0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/v0;->l()V

    return-void
.end method
