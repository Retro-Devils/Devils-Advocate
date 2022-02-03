.class Lcom/digdroid/alman/dig/w2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/w2;->onActivityResult(IILandroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lcom/digdroid/alman/dig/w2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/w2;Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/w2$a;->b:Lcom/digdroid/alman/dig/w2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/w2$a;->a:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/w2$a;->a:Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/w2$a;->b:Lcom/digdroid/alman/dig/w2;

    iget-object v1, v1, Lcom/digdroid/alman/dig/t;->A:Lcom/digdroid/alman/dig/t1;

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/t1;->x(Landroid/net/Uri;)V

    const/4 v0, 0x0

    return-object v0
.end method
