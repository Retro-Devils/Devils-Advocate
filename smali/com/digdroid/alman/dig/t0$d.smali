.class Lcom/digdroid/alman/dig/t0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t0;->r1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/t0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t0$d;->a:Lcom/digdroid/alman/dig/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$d;->a:Lcom/digdroid/alman/dig/t0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v1, "games_preview_enabled"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$d;->a:Lcom/digdroid/alman/dig/t0;

    iget-object v1, v0, Lcom/digdroid/alman/dig/t0;->x0:Lcom/digdroid/alman/dig/v0;

    if-nez v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/v0;

    invoke-direct {v1, v0}, Lcom/digdroid/alman/dig/v0;-><init>(Lcom/digdroid/alman/dig/r1;)V

    iput-object v1, v0, Lcom/digdroid/alman/dig/t0;->x0:Lcom/digdroid/alman/dig/v0;

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$d;->a:Lcom/digdroid/alman/dig/t0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t0;->x0:Lcom/digdroid/alman/dig/v0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/v0;->h()V

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$d;->a:Lcom/digdroid/alman/dig/t0;

    iget v1, v0, Lcom/digdroid/alman/dig/r1;->n0:I

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/t0;->y3(I)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
