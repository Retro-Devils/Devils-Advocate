.class Lcom/digdroid/alman/dig/ServerService$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/ServerService;->p()V
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
.field final synthetic a:Lcom/digdroid/alman/dig/t1;

.field final synthetic b:Ljava/io/File;

.field final synthetic c:Lcom/digdroid/alman/dig/ServerService$s;

.field final synthetic d:Lcom/digdroid/alman/dig/ServerService;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/ServerService;Lcom/digdroid/alman/dig/t1;Ljava/io/File;Lcom/digdroid/alman/dig/ServerService$s;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/ServerService$d;->d:Lcom/digdroid/alman/dig/ServerService;

    iput-object p2, p0, Lcom/digdroid/alman/dig/ServerService$d;->a:Lcom/digdroid/alman/dig/t1;

    iput-object p3, p0, Lcom/digdroid/alman/dig/ServerService$d;->b:Ljava/io/File;

    iput-object p4, p0, Lcom/digdroid/alman/dig/ServerService$d;->c:Lcom/digdroid/alman/dig/ServerService$s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/ServerService$d;->b([B)V

    return-void
.end method

.method public b([B)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/ServerService$d;->a:Lcom/digdroid/alman/dig/t1;

    iget-object v1, p0, Lcom/digdroid/alman/dig/ServerService$d;->b:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/digdroid/alman/dig/t1;->w([BLjava/lang/String;)Z

    const-wide/16 v0, 0x7d0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/ServerService$d;->d:Lcom/digdroid/alman/dig/ServerService;

    invoke-static {p1}, Lcom/digdroid/alman/dig/m2;->a(Landroid/content/Context;)Lc/a/a/o;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/ServerService$d;->c:Lcom/digdroid/alman/dig/ServerService$s;

    invoke-virtual {p1, v0}, Lc/a/a/o;->a(Lc/a/a/n;)Lc/a/a/n;

    :cond_0
    return-void
.end method
