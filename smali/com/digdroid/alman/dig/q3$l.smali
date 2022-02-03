.class Lcom/digdroid/alman/dig/q3$l;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/q3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "l"
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
.field final synthetic a:Lcom/digdroid/alman/dig/q3;


# direct methods
.method private constructor <init>(Lcom/digdroid/alman/dig/q3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q3$l;->a:Lcom/digdroid/alman/dig/q3;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/digdroid/alman/dig/q3;Lcom/digdroid/alman/dig/q3$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/q3$l;-><init>(Lcom/digdroid/alman/dig/q3;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 6

    const-class p1, Lcom/digdroid/alman/dig/q3;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$l;->a:Lcom/digdroid/alman/dig/q3;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/q3;->b2(Lcom/digdroid/alman/dig/q3;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$l;->a:Lcom/digdroid/alman/dig/q3;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/q3;->e2(Lcom/digdroid/alman/dig/q3;Ljava/util/ArrayList;)Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$l;->a:Lcom/digdroid/alman/dig/q3;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/q3;->g2(Lcom/digdroid/alman/dig/q3;I)I

    new-instance v0, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/digdroid/alman/dig/q3$l;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v3}, Lcom/digdroid/alman/dig/z3;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/Covers"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_0

    array-length v5, v4

    if-lez v5, :cond_0

    iget-object v5, p0, Lcom/digdroid/alman/dig/q3$l;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v5}, Lcom/digdroid/alman/dig/q3;->d2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lcom/digdroid/alman/dig/q3$l;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v3}, Lcom/digdroid/alman/dig/q3;->a2(Lcom/digdroid/alman/dig/q3;)Ljava/util/ArrayList;

    move-result-object v3

    array-length v5, v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v3, p0, Lcom/digdroid/alman/dig/q3$l;->a:Lcom/digdroid/alman/dig/q3;

    array-length v4, v4

    invoke-static {v3, v4}, Lcom/digdroid/alman/dig/q3;->h2(Lcom/digdroid/alman/dig/q3;I)I

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    monitor-exit p1

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/q3$l;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/q3;->q2(Lcom/digdroid/alman/dig/q3;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/q3$l;->a:Lcom/digdroid/alman/dig/q3;

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->i2(Lcom/digdroid/alman/dig/q3;)Ljava/lang/Runnable;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q3$l;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q3$l;->b(Ljava/lang/Void;)V

    return-void
.end method
