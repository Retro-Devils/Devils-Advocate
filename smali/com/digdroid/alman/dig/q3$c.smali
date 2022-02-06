.class Lcom/digdroid/alman/dig/q3$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/q3$q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q3;->G(Lcom/digdroid/alman/dig/s3;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/digdroid/alman/dig/q3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3$c;->d:Lcom/digdroid/alman/dig/q3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/q3$c;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/digdroid/alman/dig/q3$c;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/digdroid/alman/dig/q3$c;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$c;->d:Lcom/digdroid/alman/dig/q3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3$c;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/digdroid/alman/dig/q3$c;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/digdroid/alman/dig/q3$c;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/q3;->S2(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;I)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$c;->d:Lcom/digdroid/alman/dig/q3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->Z1(Lcom/digdroid/alman/dig/q3;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$c;->d:Lcom/digdroid/alman/dig/q3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q2(Lcom/digdroid/alman/dig/q3;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$c;->d:Lcom/digdroid/alman/dig/q3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->E2(Lcom/digdroid/alman/dig/q3;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$c;->d:Lcom/digdroid/alman/dig/q3;

    add-int/lit16 p2, p2, 0x1388

    invoke-static {v0, p1, p2}, Lcom/digdroid/alman/dig/q3;->G2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;I)V

    :cond_0
    return-void
.end method
