.class Lcom/digdroid/alman/dig/x1$b;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/x1;->b([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/x1$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
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
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/digdroid/alman/dig/x1$c;

.field final synthetic d:Lcom/digdroid/alman/dig/x1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/x1;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/x1$c;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/x1$b;->d:Lcom/digdroid/alman/dig/x1;

    iput-object p2, p0, Lcom/digdroid/alman/dig/x1$b;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/digdroid/alman/dig/x1$b;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/digdroid/alman/dig/x1$b;->c:Lcom/digdroid/alman/dig/x1$c;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Integer;
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/x1$b;->d:Lcom/digdroid/alman/dig/x1;

    iget-object v0, p0, Lcom/digdroid/alman/dig/x1$b;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/x1;->g(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/x1$b;->d:Lcom/digdroid/alman/dig/x1;

    iget-boolean v0, p1, Lcom/digdroid/alman/dig/x1;->k:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/x1$b;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/digdroid/alman/dig/x1$b;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/x1;->e(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/x1$b;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/digdroid/alman/dig/x1$b;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/x1;->f(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    goto :goto_0
.end method

.method protected b(Ljava/lang/Integer;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/x1$b;->c:Lcom/digdroid/alman/dig/x1$c;

    iget-object v0, p0, Lcom/digdroid/alman/dig/x1$b;->d:Lcom/digdroid/alman/dig/x1;

    iget-object v1, v0, Lcom/digdroid/alman/dig/x1;->m:Ljava/lang/String;

    iget-object v0, v0, Lcom/digdroid/alman/dig/x1;->l:Ljava/lang/String;

    invoke-interface {p1, v1, v0}, Lcom/digdroid/alman/dig/x1$c;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/x1$b;->c:Lcom/digdroid/alman/dig/x1$c;

    iget-object v0, p0, Lcom/digdroid/alman/dig/x1$b;->d:Lcom/digdroid/alman/dig/x1;

    iget-object v0, v0, Lcom/digdroid/alman/dig/x1;->l:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/digdroid/alman/dig/x1$c;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/x1$b;->c:Lcom/digdroid/alman/dig/x1$c;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/x1$c;->d()V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/digdroid/alman/dig/x1$b;->c:Lcom/digdroid/alman/dig/x1$c;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/x1$c;->c()V

    :goto_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/x1$b;->a([Ljava/lang/Void;)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/x1$b;->b(Ljava/lang/Integer;)V

    return-void
.end method
