.class Lcom/digdroid/alman/dig/t1$j;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/t1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "j"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field

.field b:Lcom/digdroid/alman/dig/t1$i;

.field c:Landroid/app/ProgressDialog;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:I

.field g:I

.field final synthetic h:Lcom/digdroid/alman/dig/t1;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/t1;Landroid/app/Activity;Lcom/digdroid/alman/dig/t1$i;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$j;->h:Lcom/digdroid/alman/dig/t1;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/digdroid/alman/dig/t1$j;->f:I

    iput p1, p0, Lcom/digdroid/alman/dig/t1$j;->g:I

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$j;->a:Ljava/lang/ref/WeakReference;

    invoke-interface {p3}, Lcom/digdroid/alman/dig/t1$i;->b()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$j;->d:Ljava/lang/String;

    invoke-interface {p3}, Lcom/digdroid/alman/dig/t1$i;->c()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$j;->e:Ljava/lang/String;

    iput-object p3, p0, Lcom/digdroid/alman/dig/t1$j;->b:Lcom/digdroid/alman/dig/t1$i;

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lcom/digdroid/alman/dig/t1$j;->f:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, v0, Lcom/digdroid/alman/dig/t1$j;->f:I

    new-instance v2, Ljava/io/File;

    iget-object v4, v0, Lcom/digdroid/alman/dig/t1$j;->d:Ljava/lang/String;

    iget-object v5, v0, Lcom/digdroid/alman/dig/t1$j;->e:Ljava/lang/String;

    invoke-virtual {v1, v4, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_0

    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    return-void

    :cond_0
    :goto_0
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_2

    return-void

    :cond_2
    iget v4, v0, Lcom/digdroid/alman/dig/t1$j;->g:I

    array-length v5, v1

    add-int/2addr v4, v5

    iput v4, v0, Lcom/digdroid/alman/dig/t1$j;->g:I

    const/16 v4, 0x400

    new-array v4, v4, [B

    const/4 v6, 0x0

    :goto_1
    array-length v7, v1

    if-ge v6, v7, :cond_6

    :try_start_1
    aget-object v7, v1, v6

    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v0, v7}, Lcom/digdroid/alman/dig/t1$j;->a(Ljava/lang/String;)V

    :catch_1
    move v15, v6

    :catch_2
    const/4 v6, 0x0

    :catch_3
    const/4 v7, 0x1

    goto/16 :goto_3

    :cond_3
    new-instance v8, Ljava/io/FileInputStream;

    invoke-direct {v8, v7}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    new-instance v9, Ljava/io/BufferedInputStream;

    invoke-direct {v9, v8}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance v10, Ljava/io/FileOutputStream;

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v11

    iget-object v12, v0, Lcom/digdroid/alman/dig/t1$j;->d:Ljava/lang/String;

    iget-object v13, v0, Lcom/digdroid/alman/dig/t1$j;->e:Ljava/lang/String;

    invoke-virtual {v11, v12, v13}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    new-instance v11, Ljava/io/BufferedOutputStream;

    invoke-direct {v11, v10}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    const/high16 v12, 0x100000

    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v13
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    long-to-double v13, v13

    move v15, v6

    int-to-double v5, v12

    invoke-static {v13, v14}, Ljava/lang/Double;->isNaN(D)Z

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v13, v5

    :try_start_2
    invoke-static {v13, v14}, Ljava/lang/Math;->floor(D)D

    move-result-wide v5

    double-to-int v5, v5

    add-int/2addr v5, v3

    const/4 v6, 0x0

    const/4 v13, 0x0

    :goto_2
    invoke-virtual {v9, v4}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v14

    const/16 v16, 0x2

    if-lez v14, :cond_5

    const/4 v3, 0x0

    invoke-virtual {v11, v4, v3, v14}, Ljava/io/BufferedOutputStream;->write([BII)V

    add-int/2addr v6, v14

    if-le v6, v12, :cond_4

    add-int/lit8 v13, v13, 0x1

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v6, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v14, 0x1

    aput-object v3, v6, v14

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v6, v16

    invoke-virtual {v0, v6}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    const/4 v3, 0x1

    const/4 v6, 0x0

    goto :goto_2

    :cond_4
    const/4 v3, 0x1

    goto :goto_2

    :cond_5
    invoke-virtual {v11}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual {v11}, Ljava/io/BufferedOutputStream;->close()V

    invoke-virtual {v10}, Ljava/io/FileOutputStream;->close()V

    invoke-virtual {v9}, Ljava/io/BufferedInputStream;->close()V

    invoke-virtual {v8}, Ljava/io/FileInputStream;->close()V

    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    const/4 v6, 0x0

    :try_start_3
    aput-object v5, v3, v6

    new-instance v5, Ljava/lang/Integer;

    array-length v7, v1

    invoke-direct {v5, v7}, Ljava/lang/Integer;-><init>(I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    const/4 v7, 0x1

    :try_start_4
    aput-object v5, v3, v7

    new-instance v5, Ljava/lang/Integer;

    add-int/lit8 v8, v15, 0x1

    invoke-direct {v5, v8}, Ljava/lang/Integer;-><init>(I)V

    aput-object v5, v3, v16

    invoke-virtual {v0, v3}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :goto_3
    add-int/lit8 v3, v15, 0x1

    move v6, v3

    const/4 v3, 0x1

    goto/16 :goto_1

    :cond_6
    iget-object v1, v0, Lcom/digdroid/alman/dig/t1$j;->d:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    :try_start_5
    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :cond_7
    return-void
.end method


# virtual methods
.method protected varargs b([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    new-instance p1, Ljava/io/File;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$j;->d:Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p1, v1

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/digdroid/alman/dig/t1$j;->b:Lcom/digdroid/alman/dig/t1$i;

    invoke-interface {v3, v2}, Lcom/digdroid/alman/dig/t1$i;->a(Ljava/io/File;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/digdroid/alman/dig/t1$j;->a(Ljava/lang/String;)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected c(Ljava/lang/String;)V
    .locals 0

    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$j;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$j;->c:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t1$j;->b([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t1$j;->c(Ljava/lang/String;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$j;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    new-instance v1, Landroid/app/ProgressDialog;

    invoke-direct {v1, v0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/digdroid/alman/dig/t1$j;->c:Landroid/app/ProgressDialog;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$j;->c:Landroid/app/ProgressDialog;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setProgressStyle(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$j;->c:Landroid/app/ProgressDialog;

    invoke-virtual {v1, v0}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$j;->c:Landroid/app/ProgressDialog;

    const-string v1, "Moving "

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$j;->c:Landroid/app/ProgressDialog;

    new-instance v1, Lcom/digdroid/alman/dig/t1$j$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/t1$j$a;-><init>(Lcom/digdroid/alman/dig/t1$j;)V

    const/4 v2, -0x2

    const-string v3, "Cancel"

    invoke-virtual {v0, v2, v3, v1}, Landroid/app/ProgressDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$j;->c:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    return-void
.end method

.method protected varargs onProgressUpdate([Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$j;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-object v0, p1, v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v1, p1, v1

    check-cast v1, Ljava/lang/Integer;

    const/4 v2, 0x2

    aget-object p1, p1, v2

    check-cast p1, Ljava/lang/Integer;

    iget-object v2, p0, Lcom/digdroid/alman/dig/t1$j;->c:Landroid/app/ProgressDialog;

    invoke-virtual {v2, v0}, Landroid/app/ProgressDialog;->setTitle(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$j;->c:Landroid/app/ProgressDialog;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMax(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$j;->c:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setProgress(I)V

    :cond_1
    :goto_0
    return-void
.end method
