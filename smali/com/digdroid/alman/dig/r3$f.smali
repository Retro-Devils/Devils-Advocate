.class Lcom/digdroid/alman/dig/r3$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/r3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/r3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r3$f;->b:Lcom/digdroid/alman/dig/r3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$f;->b:Lcom/digdroid/alman/dig/r3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/r3;->l2(Lcom/digdroid/alman/dig/r3;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$f;->b:Lcom/digdroid/alman/dig/r3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/r3;->s2(Lcom/digdroid/alman/dig/r3;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$f;->b:Lcom/digdroid/alman/dig/r3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/r3;->T0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->x:I

    int-to-long v1, v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
