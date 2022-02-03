.class Lcom/digdroid/alman/dig/t1$k;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/t1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "k"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
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

.field b:Landroid/app/ProgressDialog;

.field c:[Ljava/io/File;

.field d:Ljava/lang/String;

.field e:Ljava/lang/String;

.field f:Lcom/digdroid/alman/dig/l0;

.field final synthetic g:Lcom/digdroid/alman/dig/t1;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/t1;Landroid/app/Activity;[Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$k;->g:Lcom/digdroid/alman/dig/t1;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$k;->a:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lcom/digdroid/alman/dig/t1$k;->c:[Ljava/io/File;

    iput-object p4, p0, Lcom/digdroid/alman/dig/t1$k;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/digdroid/alman/dig/t1$k;->e:Ljava/lang/String;

    new-instance p1, Lcom/digdroid/alman/dig/l0;

    const/4 p2, 0x0

    invoke-static {p2}, Lcom/digdroid/alman/dig/z1;->b(Landroid/content/Context;)Lcom/digdroid/alman/dig/z1;

    move-result-object p2

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/z1;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/digdroid/alman/dig/l0;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$k;->f:Lcom/digdroid/alman/dig/l0;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    const-string p1, "^(.+)\\.(?:jpg|png|gif|bmp|jpeg)$"

    const/4 v0, 0x2

    invoke-static {p1, v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/digdroid/alman/dig/t1$k;->c:[Ljava/io/File;

    array-length v2, v2

    if-ge v1, v2, :cond_2

    invoke-virtual {p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/digdroid/alman/dig/t1$k;->c:[Ljava/io/File;

    aget-object v2, v2, v1

    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    iget-object v5, p0, Lcom/digdroid/alman/dig/t1$k;->g:Lcom/digdroid/alman/dig/t1;

    iget-object v6, p0, Lcom/digdroid/alman/dig/t1$k;->f:Lcom/digdroid/alman/dig/l0;

    iget-object v7, p0, Lcom/digdroid/alman/dig/t1$k;->d:Ljava/lang/String;

    iget-object v8, p0, Lcom/digdroid/alman/dig/t1$k;->e:Ljava/lang/String;

    iget-object v3, p0, Lcom/digdroid/alman/dig/t1$k;->c:[Ljava/io/File;

    aget-object v9, v3, v1

    invoke-virtual {v2, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {v5 .. v10}, Lcom/digdroid/alman/dig/t1;->s(Lcom/digdroid/alman/dig/l0;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V

    :cond_1
    new-array v2, v4, [Ljava/lang/Integer;

    add-int/lit8 v3, v1, 0x1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v0

    invoke-virtual {p0, v2}, Landroid/os/AsyncTask;->publishProgress([Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected b(Ljava/lang/String;)V
    .locals 0

    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$k;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$k;->b:Landroid/app/ProgressDialog;

    invoke-virtual {p1}, Landroid/app/ProgressDialog;->dismiss()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method protected varargs c([Ljava/lang/Integer;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$k;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$k;->b:Landroid/app/ProgressDialog;

    const/4 v1, 0x0

    aget-object p1, p1, v1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/app/ProgressDialog;->setProgress(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t1$k;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t1$k;->b(Ljava/lang/String;)V

    return-void
.end method

.method protected onPreExecute()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$k;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    new-instance v1, Landroid/app/ProgressDialog;

    invoke-direct {v1, v0}, Landroid/app/ProgressDialog;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/digdroid/alman/dig/t1$k;->b:Landroid/app/ProgressDialog;

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$k;->b:Landroid/app/ProgressDialog;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/ProgressDialog;->setProgressStyle(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$k;->b:Landroid/app/ProgressDialog;

    invoke-virtual {v1, v0}, Landroid/app/ProgressDialog;->setIndeterminate(Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$k;->b:Landroid/app/ProgressDialog;

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$k;->c:[Ljava/io/File;

    array-length v1, v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMax(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$k;->b:Landroid/app/ProgressDialog;

    new-instance v1, Lcom/digdroid/alman/dig/t1$k$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/t1$k$a;-><init>(Lcom/digdroid/alman/dig/t1$k;)V

    const/4 v2, -0x2

    const-string v3, "Cancel"

    invoke-virtual {v0, v2, v3, v1}, Landroid/app/ProgressDialog;->setButton(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$k;->b:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    return-void
.end method

.method protected bridge synthetic onProgressUpdate([Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t1$k;->c([Ljava/lang/Integer;)V

    return-void
.end method
