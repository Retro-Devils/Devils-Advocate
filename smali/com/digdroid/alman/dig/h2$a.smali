.class Lcom/digdroid/alman/dig/h2$a;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/h2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "[",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field a:Landroid/content/Context;

.field b:Lcom/digdroid/alman/dig/h2$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/digdroid/alman/dig/h2$b;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/h2$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/digdroid/alman/dig/h2$a;->b:Lcom/digdroid/alman/dig/h2$b;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)[Ljava/lang/String;
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/h2$a;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/h2;->d(Landroid/content/Context;)[Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected b([Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/h2$a;->b:Lcom/digdroid/alman/dig/h2$b;

    invoke-interface {v0, p1}, Lcom/digdroid/alman/dig/h2$b;->a([Ljava/lang/String;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/h2$a;->a([Ljava/lang/Void;)[Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/h2$a;->b([Ljava/lang/String;)V

    return-void
.end method
