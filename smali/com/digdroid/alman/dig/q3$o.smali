.class Lcom/digdroid/alman/dig/q3$o;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/q3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "o"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/io/File;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/q3;


# direct methods
.method private constructor <init>(Lcom/digdroid/alman/dig/q3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3$o;->a:Lcom/digdroid/alman/dig/q3;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/digdroid/alman/dig/q3;Lcom/digdroid/alman/dig/q3$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/q3$o;-><init>(Lcom/digdroid/alman/dig/q3;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/io/File;
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$o;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/q3;->B2(Lcom/digdroid/alman/dig/q3;)Lcom/digdroid/alman/dig/q3$v;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$o;->a:Lcom/digdroid/alman/dig/q3;

    new-instance v0, Lcom/digdroid/alman/dig/q3$v;

    iget-object v1, p1, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/s3;->o:Ljava/lang/String;

    invoke-static {p1}, Lcom/digdroid/alman/dig/q3;->D2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lcom/digdroid/alman/dig/q3$v;-><init>(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/q3;->C2(Lcom/digdroid/alman/dig/q3;Lcom/digdroid/alman/dig/q3$v;)Lcom/digdroid/alman/dig/q3$v;

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$o;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/q3;->B2(Lcom/digdroid/alman/dig/q3;)Lcom/digdroid/alman/dig/q3$v;

    move-result-object p1

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/q3$k;->a()Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method protected b(Ljava/io/File;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$o;->a:Lcom/digdroid/alman/dig/q3;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/digdroid/alman/dig/q3;->w2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q3$o;->a([Ljava/lang/Void;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q3$o;->b(Ljava/io/File;)V

    return-void
.end method
