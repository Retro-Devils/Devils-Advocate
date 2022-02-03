.class Lcom/digdroid/alman/dig/q3$r;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/q3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "r"
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
.method constructor <init>(Lcom/digdroid/alman/dig/q3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3$r;->a:Lcom/digdroid/alman/dig/q3;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/io/File;
    .locals 5

    const-class p1, Lcom/digdroid/alman/dig/q3;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$r;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->f2(Lcom/digdroid/alman/dig/q3;)I

    move-result v0

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$r;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->d2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$r;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->a2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3$r;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v1}, Lcom/digdroid/alman/dig/q3;->f2(Lcom/digdroid/alman/dig/q3;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/digdroid/alman/dig/q3$r;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v3}, Lcom/digdroid/alman/dig/q3;->d2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lcom/digdroid/alman/dig/q3$r;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v3}, Lcom/digdroid/alman/dig/q3;->a2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ge v1, v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, p0, Lcom/digdroid/alman/dig/q3$r;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v3}, Lcom/digdroid/alman/dig/q3;->a2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    sub-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/q3$r;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v1}, Lcom/digdroid/alman/dig/q3;->d2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v2, v1, :cond_2

    new-instance v1, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/digdroid/alman/dig/q3$r;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v4}, Lcom/digdroid/alman/dig/z3;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/Covers/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/digdroid/alman/dig/q3$r;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v4}, Lcom/digdroid/alman/dig/q3;->d2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_2

    array-length v2, v1

    if-lez v2, :cond_2

    array-length v2, v1

    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    aget-object v0, v1, v0

    monitor-exit p1

    return-object v0

    :cond_2
    monitor-exit p1

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method protected b(Ljava/io/File;)V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$r;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->J2(Lcom/digdroid/alman/dig/q3;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    new-instance v0, Lcom/digdroid/alman/dig/q3$s;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q3$r;->a:Lcom/digdroid/alman/dig/q3;

    iget-object v2, v1, Lcom/digdroid/alman/dig/q3;->T0:Lcom/digdroid/alman/dig/s3;

    invoke-static {v2}, Lcom/digdroid/alman/dig/p3;->k(Lcom/digdroid/alman/dig/s3;)F

    move-result v2

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/q3$s;-><init>(Lcom/digdroid/alman/dig/q3;FLcom/digdroid/alman/dig/q3$t;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/io/File;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q3$r;->a([Ljava/lang/Void;)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q3$r;->b(Ljava/io/File;)V

    return-void
.end method
