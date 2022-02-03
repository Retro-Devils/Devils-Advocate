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

.field d:Lcom/digdroid/alman/dig/i2;

.field e:Lcom/digdroid/alman/dig/i2;

.field f:Ljava/lang/String;

.field g:I

.field h:I

.field final synthetic i:Lcom/digdroid/alman/dig/t1;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/t1;Landroid/app/Activity;Lcom/digdroid/alman/dig/t1$i;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$j;->i:Lcom/digdroid/alman/dig/t1;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/digdroid/alman/dig/t1$j;->g:I

    iput p1, p0, Lcom/digdroid/alman/dig/t1$j;->h:I

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$j;->a:Ljava/lang/ref/WeakReference;

    invoke-interface {p3}, Lcom/digdroid/alman/dig/t1$i;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/digdroid/alman/dig/i2;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$j;->d:Lcom/digdroid/alman/dig/i2;

    invoke-interface {p3}, Lcom/digdroid/alman/dig/t1$i;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/digdroid/alman/dig/i2;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$j;->e:Lcom/digdroid/alman/dig/i2;

    iput-object p3, p0, Lcom/digdroid/alman/dig/t1$j;->b:Lcom/digdroid/alman/dig/t1$i;

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$j;->d:Lcom/digdroid/alman/dig/i2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/i2;->getPath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$j;->f:Ljava/lang/String;

    return-void
.end method

.method private a(Ljava/io/File;Ljava/io/File;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget v2, v0, Lcom/digdroid/alman/dig/t1$j;->g:I

    const/4 v3, 0x1

    add-int/2addr v2, v3

    iput v2, v0, Lcom/digdroid/alman/dig/t1$j;->g:I

    iget-object v2, v0, Lcom/digdroid/alman/dig/t1$j;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Activity;

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    :try_start_0
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    return-void

    :cond_1
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_2

    return-void

    :cond_2
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    if-nez v2, :cond_3

    return-void

    :cond_3
    iget v4, v0, Lcom/digdroid/alman/dig/t1$j;->h:I

    array-length v5, v2

    add-int/2addr v4, v5

    iput v4, v0, Lcom/digdroid/alman/dig/t1$j;->h:I

    const/16 v4, 0x400

    new-array v4, v4, [B

    const/4 v6, 0x0

    :goto_1
    array-length v7, v2

    if-ge v6, v7, :cond_8

    :try_start_1
    aget-object v7, v2, v6

    invoke-static {v7}, Lcom/digdroid/alman/dig/i2;->c(Ljava/io/File;)Lcom/digdroid/alman/dig/i2;

    move-result-object v7

    invoke-virtual {v7}, Lcom/digdroid/alman/dig/i2;->isDirectory()Z

    move-result v8

    if-eqz v8, :cond_4

    new-instance v8, Lcom/digdroid/alman/dig/i2;

    invoke-virtual {v7}, Lcom/digdroid/alman/dig/i2;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v1, v9}, Lcom/digdroid/alman/dig/i2;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v0, v7, v8}, Lcom/digdroid/alman/dig/t1$j;->a(Ljava/io/File;Ljava/io/File;)V

    :catch_1
    :goto_2
    move/from16 v16, v6

    :catch_2
    const/4 v3, 0x0

    :catch_3
    const/4 v8, 0x1

    goto/16 :goto_4

    :cond_4
    invoke-virtual {v7}, Lcom/digdroid/alman/dig/i2;->i()Ljava/io/InputStream;

    move-result-object v8

    new-instance v9, Ljava/io/BufferedInputStream;

    invoke-direct {v9, v8}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance v10, Lcom/digdroid/alman/dig/i2;

    invoke-virtual {v7}, Lcom/digdroid/alman/dig/i2;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v1, v11}, Lcom/digdroid/alman/dig/i2;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v10}, Lcom/digdroid/alman/dig/i2;->j()Ljava/io/OutputStream;

    move-result-object v10

    if-nez v10, :cond_5

    goto :goto_2

    :cond_5
    new-instance v11, Ljava/io/BufferedOutputStream;

    invoke-direct {v11, v10}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    const/high16 v12, 0x100000

    invoke-virtual {v7}, Lcom/digdroid/alman/dig/i2;->length()J

    move-result-wide v13
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    long-to-double v13, v13

    move/from16 v16, v6

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

    :goto_3
    invoke-virtual {v9, v4}, Ljava/io/BufferedInputStream;->read([B)I

    move-result v14

    const/16 v17, 0x2

    const/4 v15, 0x3

    if-lez v14, :cond_7

    const/4 v3, 0x0

    invoke-virtual {v11, v4, v3, v14}, Ljava/io/BufferedOutputStream;->write([BII)V

    add-int/2addr v6, v14

    if-le v6, v12, :cond_6

    add-int/lit8 v13, v13, 0x1

    new-array v6, v15, [Ljava/lang/Object;

    invoke-virtual {v7}, Lcom/digdroid/alman/dig/i2;->getName()Ljava/lang/String;

    move-result-object v14

    aput-object v14, v6, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const/4 v15, 0x1

    aput-object v14, v6, v15

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    aput-object v14, v6, v17

    invoke-virtual {v0, v6}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    const/4 v3, 0x1

    const/4 v6, 0x0

    goto :goto_3

    :cond_6
    const/4 v3, 0x1

    goto :goto_3

    :cond_7
    invoke-virtual {v11}, Ljava/io/BufferedOutputStream;->flush()V

    invoke-virtual {v11}, Ljava/io/BufferedOutputStream;->close()V

    invoke-virtual {v10}, Ljava/io/OutputStream;->close()V

    invoke-virtual {v9}, Ljava/io/BufferedInputStream;->close()V

    invoke-virtual {v8}, Ljava/io/InputStream;->close()V

    new-array v5, v15, [Ljava/lang/Object;

    invoke-virtual {v7}, Lcom/digdroid/alman/dig/i2;->getName()Ljava/lang/String;

    move-result-object v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    const/4 v3, 0x0

    :try_start_3
    aput-object v6, v5, v3

    new-instance v6, Ljava/lang/Integer;

    array-length v8, v2

    invoke-direct {v6, v8}, Ljava/lang/Integer;-><init>(I)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    const/4 v8, 0x1

    :try_start_4
    aput-object v6, v5, v8

    new-instance v6, Ljava/lang/Integer;

    add-int/lit8 v9, v16, 0x1

    invoke-direct {v6, v9}, Ljava/lang/Integer;-><init>(I)V

    aput-object v6, v5, v17

    invoke-virtual {v0, v5}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V

    invoke-virtual {v7}, Lcom/digdroid/alman/dig/i2;->delete()Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :goto_4
    add-int/lit8 v6, v16, 0x1

    const/4 v3, 0x1

    goto/16 :goto_1

    :cond_8
    :try_start_5
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/digdroid/alman/dig/t1$j;->f:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->delete()Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :cond_9
    return-void
.end method


# virtual methods
.method protected varargs b([Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$j;->d:Lcom/digdroid/alman/dig/i2;

    if-eqz p1, :cond_1

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

    new-instance v3, Lcom/digdroid/alman/dig/i2;

    iget-object v4, p0, Lcom/digdroid/alman/dig/t1$j;->e:Lcom/digdroid/alman/dig/i2;

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lcom/digdroid/alman/dig/i2;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {p0, v2, v3}, Lcom/digdroid/alman/dig/t1$j;->a(Ljava/io/File;Ljava/io/File;)V

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
