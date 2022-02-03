.class Lcom/digdroid/alman/dig/r3$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/r3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/r3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r3$g;->b:Lcom/digdroid/alman/dig/r3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Lcom/digdroid/alman/dig/r3$n;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r3$g;->b:Lcom/digdroid/alman/dig/r3;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/digdroid/alman/dig/r3$n;-><init>(Lcom/digdroid/alman/dig/r3;Lcom/digdroid/alman/dig/r3$b;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
