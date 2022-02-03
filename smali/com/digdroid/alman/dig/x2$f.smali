.class Lcom/digdroid/alman/dig/x2$f;
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

    iput-object p1, p0, Lcom/digdroid/alman/dig/x2$f;->b:Lcom/digdroid/alman/dig/x2;

    iput-wide p2, p0, Lcom/digdroid/alman/dig/x2$f;->a:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/x2$f;->b:Lcom/digdroid/alman/dig/x2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/c3;->u()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/x2$f;->b:Lcom/digdroid/alman/dig/x2;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/x2$f;->a:J

    invoke-static {v0, v1, v2}, Lcom/digdroid/alman/dig/MyWidget;->b(Landroid/content/Context;J)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/x2$f;->b:Lcom/digdroid/alman/dig/x2;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/x2$f;->a:J

    invoke-static {v0, v1, v2}, Lcom/digdroid/alman/dig/MyWidget;->c(Landroid/content/Context;J)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
