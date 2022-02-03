.class Lcom/digdroid/alman/dig/t0$k;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/t0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field a:Landroid/database/Cursor;

.field b:Z

.field final synthetic c:Lcom/digdroid/alman/dig/t0;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/t0;Ljava/lang/Object;Z)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t0$k;->c:Lcom/digdroid/alman/dig/t0;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    check-cast p2, Landroid/database/Cursor;

    iput-object p2, p0, Lcom/digdroid/alman/dig/t0$k;->a:Landroid/database/Cursor;

    iput-boolean p3, p0, Lcom/digdroid/alman/dig/t0$k;->b:Z

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Integer;
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0$k;->a:Landroid/database/Cursor;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_2

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/t0$k;->a:Landroid/database/Cursor;

    const-string v0, "sortname"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$k;->a:Landroid/database/Cursor;

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/t0$k;->b(Ljava/lang/String;)C

    move-result v0

    :cond_1
    iget-boolean v1, p0, Lcom/digdroid/alman/dig/t0$k;->b:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/digdroid/alman/dig/t0$k;->a:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-boolean v1, p0, Lcom/digdroid/alman/dig/t0$k;->b:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/digdroid/alman/dig/t0$k;->a:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->moveToPrevious()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/digdroid/alman/dig/t0$k;->a:Landroid/database/Cursor;

    invoke-interface {v1, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/t0$k;->b(Ljava/lang/String;)C

    move-result v1

    if-eq v1, v0, :cond_1

    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/t0$k;->a:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->getPosition()I

    move-result p1

    :goto_1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_2
    const/4 p1, -0x1

    goto :goto_1
.end method

.method b(Ljava/lang/String;)C
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-static {p1}, Ljava/lang/Character;->isLetter(C)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 p1, 0x30

    :cond_0
    return p1
.end method

.method protected c(Ljava/lang/Integer;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$k;->c:Lcom/digdroid/alman/dig/t0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/e2;->w(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$k;->c:Lcom/digdroid/alman/dig/t0;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/t0;->y3(I)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t0$k;->a([Ljava/lang/Void;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t0$k;->c(Ljava/lang/Integer;)V

    return-void
.end method
