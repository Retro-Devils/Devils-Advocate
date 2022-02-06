.class Lcom/digdroid/alman/dig/q3$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/q3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/q3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3$f;->b:Lcom/digdroid/alman/dig/q3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$f;->b:Lcom/digdroid/alman/dig/q3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->j2(Lcom/digdroid/alman/dig/q3;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$f;->b:Lcom/digdroid/alman/dig/q3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q2(Lcom/digdroid/alman/dig/q3;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3$f;->b:Lcom/digdroid/alman/dig/q3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->x:I

    int-to-long v1, v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
