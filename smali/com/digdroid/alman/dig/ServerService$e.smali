.class Lcom/digdroid/alman/dig/ServerService$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/c/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/ServerService;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/digdroid/alman/dig/ServerService$s;

.field final synthetic c:Lcom/digdroid/alman/dig/ServerService;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/ServerService;Ljava/lang/String;Lcom/digdroid/alman/dig/ServerService$s;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/ServerService$e;->c:Lcom/digdroid/alman/dig/ServerService;

    iput-object p2, p0, Lcom/digdroid/alman/dig/ServerService$e;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/digdroid/alman/dig/ServerService$e;->b:Lcom/digdroid/alman/dig/ServerService$s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/c/u;)V
    .locals 2

    if-eqz p1, :cond_1

    iget-object v0, p1, Lc/a/c/u;->b:Lc/a/c/k;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "not found: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/ServerService$e;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ZZZ"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p1, Lc/a/c/u;->b:Lc/a/c/k;

    iget p1, p1, Lc/a/c/k;->a:I

    const/16 v0, 0x194

    if-eq p1, v0, :cond_0

    const/16 v0, 0x19a

    if-eq p1, v0, :cond_0

    const/16 v0, 0x12c

    if-lt p1, v0, :cond_1

    const/16 v0, 0x190

    if-ge p1, v0, :cond_1

    :cond_0
    const-wide/16 v0, 0x7d0

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/ServerService$e;->c:Lcom/digdroid/alman/dig/ServerService;

    invoke-static {p1}, Lcom/digdroid/alman/dig/l2;->a(Landroid/content/Context;)Lc/a/c/o;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/ServerService$e;->b:Lcom/digdroid/alman/dig/ServerService$s;

    invoke-virtual {p1, v0}, Lc/a/c/o;->a(Lc/a/c/n;)Lc/a/c/n;

    :cond_1
    return-void
.end method
