.class Lcom/digdroid/alman/dig/x2$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/x2;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/digdroid/alman/dig/x2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/x2;J)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/x2$g;->b:Lcom/digdroid/alman/dig/x2;

    iput-wide p2, p0, Lcom/digdroid/alman/dig/x2$g;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lcom/digdroid/alman/dig/x2$g;->b:Lcom/digdroid/alman/dig/x2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v1, "get_game_image_dir"

    const-string v2, "Covers"

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    sget-object v0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    iget-object v0, p0, Lcom/digdroid/alman/dig/x2$g;->b:Lcom/digdroid/alman/dig/x2;

    iget-object v3, v0, Lcom/digdroid/alman/dig/t;->A:Lcom/digdroid/alman/dig/t1;

    iget-wide v6, p0, Lcom/digdroid/alman/dig/x2$g;->a:J

    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v1, "get_game_image_t"

    const-wide/16 v8, 0x0

    invoke-virtual {v0, v1, v8, v9}, Lcom/digdroid/alman/dig/c3;->n(Ljava/lang/String;J)J

    move-result-wide v8

    invoke-virtual/range {v3 .. v9}, Lcom/digdroid/alman/dig/t1;->v(Ljava/io/File;Ljava/lang/String;JJ)V

    const/4 v0, 0x0

    return-object v0
.end method
