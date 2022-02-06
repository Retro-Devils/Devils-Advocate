.class Lcom/digdroid/alman/dig/e0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/e0;->t1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/e0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/e0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e0$b;->b:Lcom/digdroid/alman/dig/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/e0$b;->b:Lcom/digdroid/alman/dig/e0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e0;->i1()Lcom/digdroid/alman/dig/p1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/e0$b;->b:Lcom/digdroid/alman/dig/e0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/p1;->v2()Lcom/digdroid/alman/dig/s3;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/e0;->E(Lcom/digdroid/alman/dig/s3;)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/p1;->Q2()V

    :cond_0
    return-void
.end method
