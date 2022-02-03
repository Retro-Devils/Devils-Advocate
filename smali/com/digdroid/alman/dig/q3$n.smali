.class Lcom/digdroid/alman/dig/q3$n;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/q3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "n"
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

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3$n;->a:Lcom/digdroid/alman/dig/q3;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/digdroid/alman/dig/q3;Lcom/digdroid/alman/dig/q3$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/q3$n;-><init>(Lcom/digdroid/alman/dig/q3;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/io/File;
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$n;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/q3;->k2(Lcom/digdroid/alman/dig/q3;)Lcom/digdroid/alman/dig/q3$m;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$n;->a:Lcom/digdroid/alman/dig/q3;

    new-instance v0, Lcom/digdroid/alman/dig/q3$m;

    iget-object v1, p1, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/s3;->m:Ljava/lang/String;

    invoke-static {p1}, Lcom/digdroid/alman/dig/q3;->m2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-direct {v0, p1, v1, v2}, Lcom/digdroid/alman/dig/q3$m;-><init>(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/q3;->l2(Lcom/digdroid/alman/dig/q3;Lcom/digdroid/alman/dig/q3$m;)Lcom/digdroid/alman/dig/q3$m;

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$n;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/q3;->k2(Lcom/digdroid/alman/dig/q3;)Lcom/digdroid/alman/dig/q3$m;

    move-result-object p1

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/q3$k;->a()Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method protected b(Ljava/io/File;)V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$n;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->J2(Lcom/digdroid/alman/dig/q3;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$n;->a:Lcom/digdroid/alman/dig/q3;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/q3;->n2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "image"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    new-instance v0, Lcom/digdroid/alman/dig/q3$n$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/q3$n$a;-><init>(Lcom/digdroid/alman/dig/q3$n;)V

    new-instance v1, Lcom/digdroid/alman/dig/q3$s;

    iget-object v3, p0, Lcom/digdroid/alman/dig/q3$n;->a:Lcom/digdroid/alman/dig/q3;

    iget-object v4, v3, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    invoke-static {v4}, Lcom/digdroid/alman/dig/p3;->k(Lcom/digdroid/alman/dig/s3;)F

    move-result v4

    invoke-direct {v1, v3, v4, v0}, Lcom/digdroid/alman/dig/q3$s;-><init>(Lcom/digdroid/alman/dig/q3;FLcom/digdroid/alman/dig/q3$t;)V

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/io/File;

    aput-object p1, v0, v2

    invoke-virtual {v1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$n;->a:Lcom/digdroid/alman/dig/q3;

    const-string v0, ""

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/q3;->c2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$n;->a:Lcom/digdroid/alman/dig/q3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/t;->V0()V

    goto :goto_0

    :cond_1
    const-string v1, "video"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$n;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->p2(Lcom/digdroid/alman/dig/q3;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$n;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->t2(Lcom/digdroid/alman/dig/q3;)Landroid/media/MediaPlayer;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v1

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/q3;->s2(Lcom/digdroid/alman/dig/q3;I)I

    :cond_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$n;->a:Lcom/digdroid/alman/dig/q3;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, v2}, Lcom/digdroid/alman/dig/q3;->G2(Lcom/digdroid/alman/dig/q3;Ljava/lang/String;I)V

    :cond_3
    :goto_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q3$n;->a([Ljava/lang/Void;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q3$n;->b(Ljava/io/File;)V

    return-void
.end method
