.class Lcom/digdroid/alman/dig/ServerService$n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/a/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/ServerService;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/a/a/p$b<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/ServerService;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/ServerService;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/ServerService$n;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lorg/json/JSONObject;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/ServerService$n;->b(Lorg/json/JSONObject;)V

    return-void
.end method

.method public b(Lorg/json/JSONObject;)V
    .locals 3

    new-instance v0, Lcom/digdroid/alman/dig/ServerService$u;

    iget-object v1, p0, Lcom/digdroid/alman/dig/ServerService$n;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-direct {v0, v1}, Lcom/digdroid/alman/dig/ServerService$u;-><init>(Lcom/digdroid/alman/dig/ServerService;)V

    const/4 v1, 0x1

    new-array v1, v1, [Lorg/json/JSONObject;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
