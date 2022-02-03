.class Lcom/digdroid/alman/dig/ServerService$j;
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
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lcom/digdroid/alman/dig/ServerService;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/ServerService;Landroid/content/Intent;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/ServerService$j;->b:Lcom/digdroid/alman/dig/ServerService;

    iput-object p2, p0, Lcom/digdroid/alman/dig/ServerService$j;->a:Landroid/content/Intent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/ServerService$j;->b:Lcom/digdroid/alman/dig/ServerService;

    iget-object v1, p0, Lcom/digdroid/alman/dig/ServerService$j;->a:Landroid/content/Intent;

    const-string v2, "gameid"

    const-wide/16 v3, -0x1

    invoke-virtual {v1, v2, v3, v4}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/digdroid/alman/dig/ServerService;->b(Lcom/digdroid/alman/dig/ServerService;J)V

    return-void
.end method
