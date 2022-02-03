.class Lcom/digdroid/alman/dig/k3$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/k3$a;->a(Landroid/view/View;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/digdroid/alman/dig/k3$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/k3$a;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/k3$a$a;->c:Lcom/digdroid/alman/dig/k3$a;

    iput p2, p0, Lcom/digdroid/alman/dig/k3$a$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/k3$a$a;->c:Lcom/digdroid/alman/dig/k3$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/k3$a;->c:Lcom/digdroid/alman/dig/k3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/r1;->B2()Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/digdroid/alman/dig/k3$a$a;->b:I

    iget-object v1, p0, Lcom/digdroid/alman/dig/k3$a$a;->c:Lcom/digdroid/alman/dig/k3$a;

    iget v2, v1, Lcom/digdroid/alman/dig/k3$a;->a:I

    if-eq v0, v2, :cond_0

    iget-object v1, v1, Lcom/digdroid/alman/dig/k3$a;->c:Lcom/digdroid/alman/dig/k3;

    iget-boolean v2, v1, Lcom/digdroid/alman/dig/p1;->j0:Z

    if-eqz v2, :cond_0

    invoke-static {v1, v0}, Lcom/digdroid/alman/dig/k3;->w3(Lcom/digdroid/alman/dig/k3;I)Z

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/k3$a$a;->c:Lcom/digdroid/alman/dig/k3$a;

    iget v1, p0, Lcom/digdroid/alman/dig/k3$a$a;->b:I

    iput v1, v0, Lcom/digdroid/alman/dig/k3$a;->a:I

    :cond_1
    return-void
.end method
