.class Lcom/digdroid/alman/dig/x2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/x2;->onActivityResult(IILandroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/net/Uri;

.field final synthetic b:Lcom/digdroid/alman/dig/x2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/x2;Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/x2$a;->b:Lcom/digdroid/alman/dig/x2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/x2$a;->a:Landroid/net/Uri;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/x2$a;->b:Lcom/digdroid/alman/dig/x2;

    iget-object v1, p0, Lcom/digdroid/alman/dig/x2$a;->a:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/digdroid/alman/dig/a4;->y(Landroid/app/Activity;ILjava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
