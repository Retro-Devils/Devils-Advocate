.class Lcom/digdroid/alman/dig/t$a;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field a:Ljava/util/concurrent/Callable;

.field b:Ljava/util/concurrent/Callable;

.field final synthetic c:Lcom/digdroid/alman/dig/t;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/t;Ljava/util/concurrent/Callable;Ljava/util/concurrent/Callable;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t$a;->c:Lcom/digdroid/alman/dig/t;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p2, p0, Lcom/digdroid/alman/dig/t$a;->a:Ljava/util/concurrent/Callable;

    iput-object p3, p0, Lcom/digdroid/alman/dig/t$a;->b:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/t$a;->c:Lcom/digdroid/alman/dig/t;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/t;->V0()V

    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/t$a;->a:Ljava/util/concurrent/Callable;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 0

    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/t$a;->b:Ljava/util/concurrent/Callable;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t$a;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t$a;->b(Ljava/lang/Void;)V

    return-void
.end method
