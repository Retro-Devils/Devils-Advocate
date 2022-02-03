.class Lcom/digdroid/alman/dig/p3$f;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/p3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Lcom/digdroid/alman/dig/b4;",
        "Ljava/lang/Void;",
        "Ljava/util/ArrayList<",
        "Lcom/digdroid/alman/dig/r3;",
        ">;>;"
    }
.end annotation


# instance fields
.field a:Lcom/digdroid/alman/dig/p3$e;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/p3$e;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/p3$f;->a:Lcom/digdroid/alman/dig/p3$e;

    return-void
.end method


# virtual methods
.method protected varargs a([Lcom/digdroid/alman/dig/b4;)Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/digdroid/alman/dig/b4;",
            ")",
            "Ljava/util/ArrayList<",
            "Lcom/digdroid/alman/dig/r3;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    aget-object p1, p1, v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lcom/digdroid/alman/dig/r3;

    invoke-direct {v2, p1}, Lcom/digdroid/alman/dig/r3;-><init>(Lcom/digdroid/alman/dig/b4;)V

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/r3;->C()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return-object v3

    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    return-object v3

    :cond_1
    const-string v2, "\\.cfg$"

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    new-instance v3, Lcom/digdroid/alman/dig/p3$f$a;

    invoke-direct {v3, p0, v2}, Lcom/digdroid/alman/dig/p3$f$a;-><init>(Lcom/digdroid/alman/dig/p3$f;Ljava/util/regex/Pattern;)V

    invoke-virtual {v4, v3}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_2

    :goto_0
    array-length v3, v2

    if-ge v0, v3, :cond_2

    new-instance v3, Lcom/digdroid/alman/dig/r3;

    invoke-direct {v3, p1}, Lcom/digdroid/alman/dig/r3;-><init>(Lcom/digdroid/alman/dig/b4;)V

    aget-object v4, v2, v0

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/digdroid/alman/dig/r3;->P(Ljava/lang/String;)Z

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    new-instance p1, Lcom/digdroid/alman/dig/p3$f$b;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/p3$f$b;-><init>(Lcom/digdroid/alman/dig/p3$f;)V

    invoke-static {v1, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v1
.end method

.method protected b(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/digdroid/alman/dig/r3;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/p3$f;->a:Lcom/digdroid/alman/dig/p3$e;

    invoke-interface {v0, p1}, Lcom/digdroid/alman/dig/p3$e;->a(Ljava/util/ArrayList;)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Lcom/digdroid/alman/dig/b4;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/p3$f;->a([Lcom/digdroid/alman/dig/b4;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/p3$f;->b(Ljava/util/ArrayList;)V

    return-void
.end method
