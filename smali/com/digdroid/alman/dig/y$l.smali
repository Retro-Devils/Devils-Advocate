.class Lcom/digdroid/alman/dig/y$l;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/io/File;",
        "Ljava/lang/Void;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field a:Ljava/io/File;

.field b:[Ljava/io/File;

.field c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic d:Lcom/digdroid/alman/dig/y;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/y;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/io/File;)Ljava/lang/Boolean;
    .locals 6

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y$l;->a:Ljava/io/File;

    iget-object v1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result p1

    invoke-static {v1, p1}, Lcom/digdroid/alman/dig/y;->e(Lcom/digdroid/alman/dig/y;Z)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    iget-object v1, p0, Lcom/digdroid/alman/dig/y$l;->a:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->canRead()Z

    move-result v1

    invoke-static {p1, v1}, Lcom/digdroid/alman/dig/y;->f(Lcom/digdroid/alman/dig/y;Z)Z

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y$l;->b:[Ljava/io/File;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/y$l;->c:Ljava/util/ArrayList;

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->d(Lcom/digdroid/alman/dig/y;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    iget-object v0, p0, Lcom/digdroid/alman/dig/y$l;->a:Ljava/io/File;

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/y;->b(Lcom/digdroid/alman/dig/y;Ljava/io/File;)Ljava/io/File;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->a:Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    array-length v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    if-ge v2, v1, :cond_5

    aget-object v4, p1, v2

    iget-object v5, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-static {v5}, Lcom/digdroid/alman/dig/y;->g(Lcom/digdroid/alman/dig/y;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_4

    :cond_3
    add-int/lit8 v3, v3, 0x1

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    new-array v1, v3, [Ljava/io/File;

    iput-object v1, p0, Lcom/digdroid/alman/dig/y$l;->b:[Ljava/io/File;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_2
    if-ge v1, v3, :cond_8

    aget-object v4, p1, v2

    iget-object v5, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-static {v5}, Lcom/digdroid/alman/dig/y;->g(Lcom/digdroid/alman/dig/y;)Z

    move-result v5

    if-nez v5, :cond_6

    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_7

    :cond_6
    iget-object v5, p0, Lcom/digdroid/alman/dig/y$l;->b:[Ljava/io/File;

    aput-object v4, v5, v1

    add-int/lit8 v1, v1, 0x1

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_8
    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->b:[Ljava/io/File;

    invoke-static {p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    :goto_3
    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->b:[Ljava/io/File;

    array-length v1, p1

    if-ge v0, v1, :cond_0

    aget-object p1, p1, v0

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-static {v2}, Lcom/digdroid/alman/dig/y;->g(Lcom/digdroid/alman/dig/y;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result p1

    if-eqz p1, :cond_9

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_9
    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->c:Ljava/util/ArrayList;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_3
.end method

.method protected b(Ljava/lang/Boolean;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->d(Lcom/digdroid/alman/dig/y;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->h(Lcom/digdroid/alman/dig/y;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/y$l;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    iget-object v0, p0, Lcom/digdroid/alman/dig/y$l;->b:[Ljava/io/File;

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/y;->t(Lcom/digdroid/alman/dig/y;[Ljava/io/File;)[Ljava/io/File;

    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->i(Lcom/digdroid/alman/dig/y;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->i(Lcom/digdroid/alman/dig/y;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/y$l;->c:Ljava/util/ArrayList;

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->j(Lcom/digdroid/alman/dig/y;)Landroid/widget/ArrayAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/ArrayAdapter;->notifyDataSetChanged()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    iget-object v0, p0, Lcom/digdroid/alman/dig/y$l;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/y;->m(Lcom/digdroid/alman/dig/y;Ljava/lang/String;)Landroid/os/FileObserver;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/y;->l(Lcom/digdroid/alman/dig/y;Landroid/os/FileObserver;)Landroid/os/FileObserver;

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->k(Lcom/digdroid/alman/dig/y;)Landroid/os/FileObserver;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/FileObserver;->startWatching()V

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->g(Lcom/digdroid/alman/dig/y;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->h(Lcom/digdroid/alman/dig/y;)Landroid/widget/TextView;

    move-result-object p1

    const-string v0, ""

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->h(Lcom/digdroid/alman/dig/y;)Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/y$l;->a:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    iget-object v0, p0, Lcom/digdroid/alman/dig/y$l;->b:[Ljava/io/File;

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/y;->t(Lcom/digdroid/alman/dig/y;[Ljava/io/File;)[Ljava/io/File;

    goto :goto_0

    :goto_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/y$l;->d:Lcom/digdroid/alman/dig/y;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y;->n(Lcom/digdroid/alman/dig/y;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/io/File;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/y$l;->a([Ljava/io/File;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/y$l;->b(Ljava/lang/Boolean;)V

    return-void
.end method
