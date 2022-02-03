.class Lcom/digdroid/alman/dig/w2$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/w2;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:J

.field final synthetic b:Lcom/digdroid/alman/dig/w2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/w2;J)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/w2$e;->b:Lcom/digdroid/alman/dig/w2;

    iput-wide p2, p0, Lcom/digdroid/alman/dig/w2$e;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/w2$e;->b:Lcom/digdroid/alman/dig/w2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->u()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/w2$e;->b:Lcom/digdroid/alman/dig/w2;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/w2$e;->a:J

    invoke-static {v0, v1, v2}, Lcom/digdroid/alman/dig/MyWidget;->b(Landroid/content/Context;J)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/w2$e;->b:Lcom/digdroid/alman/dig/w2;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/w2$e;->a:J

    invoke-static {v0, v1, v2}, Lcom/digdroid/alman/dig/MyWidget;->c(Landroid/content/Context;J)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
