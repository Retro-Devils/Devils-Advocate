.class Lcom/digdroid/alman/dig/o$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/a/a/p$b<",
        "[B>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/io/File;

.field final synthetic c:Lcom/digdroid/alman/dig/o;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/o;Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/o$g;->c:Lcom/digdroid/alman/dig/o;

    iput-object p2, p0, Lcom/digdroid/alman/dig/o$g;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/digdroid/alman/dig/o$g;->b:Ljava/io/File;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/o$g;->b([B)V

    return-void
.end method

.method public b([B)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/o$g;->a:Ljava/lang/String;

    const-string v1, "ZZZ"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lcom/digdroid/alman/dig/o$g;->c:Lcom/digdroid/alman/dig/o;

    iget-object v0, v0, Lcom/digdroid/alman/dig/o;->k:Lcom/digdroid/alman/dig/t1;

    iget-object v1, p0, Lcom/digdroid/alman/dig/o$g;->b:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/digdroid/alman/dig/t1;->w([BLjava/lang/String;)Z

    :cond_0
    return-void
.end method
