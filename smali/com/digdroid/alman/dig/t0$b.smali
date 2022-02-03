.class Lcom/digdroid/alman/dig/t0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t0;->O2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/t0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t0$b;->a:Lcom/digdroid/alman/dig/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$b;->a:Lcom/digdroid/alman/dig/t0;

    iget-object v1, v0, Lcom/digdroid/alman/dig/t0;->x0:Lcom/digdroid/alman/dig/v0;

    if-eqz v1, :cond_0

    iget-object v2, v0, Lcom/digdroid/alman/dig/r1;->o0:Landroid/database/Cursor;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-virtual {v1, v2, v0}, Lcom/digdroid/alman/dig/v0;->f(Landroid/database/Cursor;I)V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0$b;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
