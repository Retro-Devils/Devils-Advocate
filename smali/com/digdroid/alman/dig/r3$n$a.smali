.class Lcom/digdroid/alman/dig/r3$n$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/r3$t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r3$n;->b(Ljava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/r3$n;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r3$n;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r3$n$a;->a:Lcom/digdroid/alman/dig/r3$n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/r3$n$a;->a:Lcom/digdroid/alman/dig/r3$n;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r3$n;->a:Lcom/digdroid/alman/dig/r3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/r3;->s2(Lcom/digdroid/alman/dig/r3;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$n$a;->a:Lcom/digdroid/alman/dig/r3$n;

    iget-object v1, v1, Lcom/digdroid/alman/dig/r3$n;->a:Lcom/digdroid/alman/dig/r3;

    invoke-static {v1}, Lcom/digdroid/alman/dig/r3;->q2(Lcom/digdroid/alman/dig/r3;)Ljava/lang/Runnable;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/r3$n$a;->a:Lcom/digdroid/alman/dig/r3$n;

    iget-object v2, v2, Lcom/digdroid/alman/dig/r3$n;->a:Lcom/digdroid/alman/dig/r3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/r3;->T0:Lcom/digdroid/alman/dig/t3;

    iget v2, v2, Lcom/digdroid/alman/dig/t3;->x:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
