.class Lcom/digdroid/alman/dig/o2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o2;->onResults(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/ArrayList;

.field final synthetic c:Lcom/digdroid/alman/dig/o2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/o2;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/o2$a;->c:Lcom/digdroid/alman/dig/o2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/o2$a;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/o2$a;->c:Lcom/digdroid/alman/dig/o2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/o2;->V1(Z)V

    invoke-static {}, Lcom/digdroid/alman/dig/x;->i()Lcom/digdroid/alman/dig/x;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/o2$a;->c:Lcom/digdroid/alman/dig/o2;

    iget-object v3, p0, Lcom/digdroid/alman/dig/o2$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v3, p0, Lcom/digdroid/alman/dig/o2$a;->c:Lcom/digdroid/alman/dig/o2;

    invoke-virtual {v0, v2, v1, v3}, Lcom/digdroid/alman/dig/x;->b(Landroid/app/Activity;Ljava/lang/String;Lcom/digdroid/alman/dig/x$d;)V

    return-void
.end method
