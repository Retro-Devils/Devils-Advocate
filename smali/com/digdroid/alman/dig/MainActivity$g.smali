.class Lcom/digdroid/alman/dig/MainActivity$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/MainActivity;->b3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/MainActivity;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$g;->a:Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$g;->a:Lcom/digdroid/alman/dig/MainActivity;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/e0;->k0(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$g;->a:Lcom/digdroid/alman/dig/MainActivity;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const-string v1, "data_version"

    const/16 v2, 0x1c8

    invoke-virtual {p1, v1, v2}, Lcom/digdroid/alman/dig/b3;->E(Ljava/lang/String;I)V

    new-instance p1, Lcom/digdroid/alman/dig/MainActivity$l;

    iget-object v1, p0, Lcom/digdroid/alman/dig/MainActivity$g;->a:Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {p1, v1, v1}, Lcom/digdroid/alman/dig/MainActivity$l;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/MainActivity;)V

    sget-object v1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {p1, v1, v0}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
