.class Lcom/digdroid/alman/dig/t0$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t0$c;->a(Landroid/view/View;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/digdroid/alman/dig/t0$c;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t0$c;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t0$c$a;->c:Lcom/digdroid/alman/dig/t0$c;

    iput p2, p0, Lcom/digdroid/alman/dig/t0$c$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$c$a;->c:Lcom/digdroid/alman/dig/t0$c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t0$c;->b:Lcom/digdroid/alman/dig/t0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/r1;->B2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$c$a;->c:Lcom/digdroid/alman/dig/t0$c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t0$c;->b:Lcom/digdroid/alman/dig/t0;

    iget v1, p0, Lcom/digdroid/alman/dig/t0$c$a;->b:I

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/t0;->y3(I)V

    :cond_0
    return-void
.end method
