.class Lcom/digdroid/alman/dig/r1$i;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Landroid/database/Cursor;",
        ">;"
    }
.end annotation


# instance fields
.field a:Z

.field b:Z

.field c:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic d:Lcom/digdroid/alman/dig/r1;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/r1;ZZLjava/util/concurrent/Callable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Ljava/util/concurrent/Callable<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/digdroid/alman/dig/r1$i;->d:Lcom/digdroid/alman/dig/r1;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-boolean p2, p0, Lcom/digdroid/alman/dig/r1$i;->a:Z

    iput-boolean p3, p0, Lcom/digdroid/alman/dig/r1$i;->b:Z

    iput-object p4, p0, Lcom/digdroid/alman/dig/r1$i;->c:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Landroid/database/Cursor;
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/r1$i;->d:Lcom/digdroid/alman/dig/r1;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/r1;->i3()Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method protected b(Landroid/database/Cursor;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/r1$i;->d:Lcom/digdroid/alman/dig/r1;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    new-instance v1, Lcom/digdroid/alman/dig/r1$i$a;

    invoke-direct {v1, p0, p1}, Lcom/digdroid/alman/dig/r1$i$a;-><init>(Lcom/digdroid/alman/dig/r1$i;Landroid/database/Cursor;)V

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/e2;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r1$i;->a([Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/database/Cursor;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r1$i;->b(Landroid/database/Cursor;)V

    return-void
.end method
