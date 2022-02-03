.class Lcom/digdroid/alman/dig/x$c;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field a:Landroid/app/Activity;

.field b:Lcom/digdroid/alman/dig/x$d;

.field c:Ljava/lang/String;

.field final synthetic d:Lcom/digdroid/alman/dig/x;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/x;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/x$c;->d:Lcom/digdroid/alman/dig/x;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 2

    const/4 v0, 0x0

    aget-object v0, p1, v0

    check-cast v0, Landroid/app/Activity;

    iput-object v0, p0, Lcom/digdroid/alman/dig/x$c;->a:Landroid/app/Activity;

    const/4 v1, 0x1

    aget-object v1, p1, v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, p0, Lcom/digdroid/alman/dig/x$c;->c:Ljava/lang/String;

    const/4 v1, 0x2

    aget-object p1, p1, v1

    check-cast p1, Lcom/digdroid/alman/dig/x$d;

    iput-object p1, p0, Lcom/digdroid/alman/dig/x$c;->b:Lcom/digdroid/alman/dig/x$d;

    iget-object p1, p0, Lcom/digdroid/alman/dig/x$c;->d:Lcom/digdroid/alman/dig/x;

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/x;->a(Lcom/digdroid/alman/dig/x;Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/x$c;->d:Lcom/digdroid/alman/dig/x;

    iget-object v0, p0, Lcom/digdroid/alman/dig/x$c;->a:Landroid/app/Activity;

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/x;->h(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method protected b(Ljava/lang/Boolean;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/x$c;->a:Landroid/app/Activity;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/x$c;->d:Lcom/digdroid/alman/dig/x;

    iget-object v0, p0, Lcom/digdroid/alman/dig/x$c;->c:Ljava/lang/String;

    iget-object v1, p0, Lcom/digdroid/alman/dig/x$c;->b:Lcom/digdroid/alman/dig/x$d;

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/x;->c(Ljava/lang/String;Lcom/digdroid/alman/dig/x$d;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/x$c;->a([Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/x$c;->b(Ljava/lang/Boolean;)V

    return-void
.end method
