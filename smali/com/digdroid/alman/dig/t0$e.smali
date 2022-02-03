.class Lcom/digdroid/alman/dig/t0$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t0;->e3()V
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

    iput-object p1, p0, Lcom/digdroid/alman/dig/t0$e;->a:Lcom/digdroid/alman/dig/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$e;->a:Lcom/digdroid/alman/dig/t0;

    iget-object v1, v0, Lcom/digdroid/alman/dig/t0;->x0:Lcom/digdroid/alman/dig/v0;

    if-nez v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/v0;

    invoke-direct {v1, v0}, Lcom/digdroid/alman/dig/v0;-><init>(Lcom/digdroid/alman/dig/r1;)V

    iput-object v1, v0, Lcom/digdroid/alman/dig/t0;->x0:Lcom/digdroid/alman/dig/v0;

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$e;->a:Lcom/digdroid/alman/dig/t0;

    iget-object v1, v0, Lcom/digdroid/alman/dig/t0;->x0:Lcom/digdroid/alman/dig/v0;

    iget-object v2, v0, Lcom/digdroid/alman/dig/r1;->o0:Landroid/database/Cursor;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-virtual {v1, v2, v0}, Lcom/digdroid/alman/dig/v0;->j(Landroid/database/Cursor;I)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
