.class Lcom/digdroid/alman/dig/ServerService$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/f$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/ServerService;->onHandleIntent(Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/ServerService;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/ServerService;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/ServerService$k;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/ServerService$k;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-virtual {v0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    return-void
.end method

.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/ServerService$k;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-virtual {v0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/ServerService$k;->a:Lcom/digdroid/alman/dig/ServerService;

    invoke-virtual {v0}, Landroid/app/IntentService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "sync"

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/DatabaseService;->t(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
