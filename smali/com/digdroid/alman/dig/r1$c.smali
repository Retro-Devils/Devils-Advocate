.class Lcom/digdroid/alman/dig/r1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r1;->r1()V
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
.field final synthetic a:Lcom/digdroid/alman/dig/r1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r1;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r1$c;->a:Lcom/digdroid/alman/dig/r1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1$c;->a:Lcom/digdroid/alman/dig/r1;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/digdroid/alman/dig/p1;->i0:Z

    iget-object v1, v0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    iget v0, v0, Lcom/digdroid/alman/dig/r1;->n0:I

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/e2;->w(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1$c;->a:Lcom/digdroid/alman/dig/r1;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->h()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1$c;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
