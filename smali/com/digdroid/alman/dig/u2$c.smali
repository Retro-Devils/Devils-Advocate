.class Lcom/digdroid/alman/dig/u2$c;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/u2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field a:Lcom/digdroid/alman/dig/z3;

.field b:Lcom/digdroid/alman/dig/h3;

.field c:Landroid/database/Cursor;

.field d:Z

.field e:Lcom/digdroid/alman/dig/u2$b;

.field f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/z3;Lcom/digdroid/alman/dig/h3;Landroid/database/Cursor;ZLcom/digdroid/alman/dig/u2$b;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/u2$c;->a:Lcom/digdroid/alman/dig/z3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/u2$c;->b:Lcom/digdroid/alman/dig/h3;

    iput-object p3, p0, Lcom/digdroid/alman/dig/u2$c;->c:Landroid/database/Cursor;

    iput-boolean p4, p0, Lcom/digdroid/alman/dig/u2$c;->d:Z

    iput-object p5, p0, Lcom/digdroid/alman/dig/u2$c;->e:Lcom/digdroid/alman/dig/u2$b;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/String;
    .locals 11

    iget-object p1, p0, Lcom/digdroid/alman/dig/u2$c;->c:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/u2$c;->b:Lcom/digdroid/alman/dig/h3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/u2$c;->c:Landroid/database/Cursor;

    const/4 v2, 0x3

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {p1, v1}, Lcom/digdroid/alman/dig/h3;->u(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/u2$c;->f:Ljava/lang/String;

    iget-object p1, p0, Lcom/digdroid/alman/dig/u2$c;->c:Landroid/database/Cursor;

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v2, "\\:"

    const-string v3, " - "

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "[\\/\\\\\\\"\\?\\%\\*\\|\\<\\>]"

    const-string v3, ""

    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lcom/digdroid/alman/dig/u2$c;->c:Landroid/database/Cursor;

    const/4 v10, 0x7

    invoke-interface {v2, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0x2e

    invoke-virtual {v2, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v4

    if-le v4, v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v2, v1, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    new-instance v2, Lcom/digdroid/alman/dig/y2;

    iget-object v4, p0, Lcom/digdroid/alman/dig/u2$c;->a:Lcom/digdroid/alman/dig/z3;

    invoke-direct {v2, v4}, Lcom/digdroid/alman/dig/y2;-><init>(Landroid/content/Context;)V

    :try_start_0
    iget-object v4, p0, Lcom/digdroid/alman/dig/u2$c;->a:Lcom/digdroid/alman/dig/z3;

    const-string v6, "savefile_directory"

    iget-object v7, p0, Lcom/digdroid/alman/dig/u2$c;->f:Ljava/lang/String;

    move-object v5, v2

    move-object v8, v1

    move-object v9, p1

    invoke-static/range {v4 .. v9}, Lcom/digdroid/alman/dig/u2;->a(Landroid/content/Context;Lcom/digdroid/alman/dig/y2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/digdroid/alman/dig/u2$c;->a:Lcom/digdroid/alman/dig/z3;

    const-string v6, "savestate_directory"

    iget-object v7, p0, Lcom/digdroid/alman/dig/u2$c;->f:Ljava/lang/String;

    move-object v5, v2

    move-object v8, v1

    move-object v9, p1

    invoke-static/range {v4 .. v9}, Lcom/digdroid/alman/dig/u2;->a(Landroid/content/Context;Lcom/digdroid/alman/dig/y2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    :cond_2
    :goto_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/u2$c;->c:Landroid/database/Cursor;

    invoke-interface {v1, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "cue"

    invoke-static {v1, v2}, Lcom/digdroid/alman/dig/a4;->n(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v4, p0, Lcom/digdroid/alman/dig/u2$c;->c:Landroid/database/Cursor;

    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-nez v4, :cond_2

    :cond_3
    iget-object v4, p0, Lcom/digdroid/alman/dig/u2$c;->c:Landroid/database/Cursor;

    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-object v4, v3

    :cond_4
    :try_start_1
    iget-object v5, p0, Lcom/digdroid/alman/dig/u2$c;->c:Landroid/database/Cursor;

    invoke-interface {v5, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    if-eqz v1, :cond_5

    invoke-static {v5, v2}, Lcom/digdroid/alman/dig/a4;->n(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    :cond_5
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\n"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6

    :cond_6
    iget-object v5, p0, Lcom/digdroid/alman/dig/u2$c;->c:Landroid/database/Cursor;

    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-nez v5, :cond_4

    iget-object v1, p0, Lcom/digdroid/alman/dig/u2$c;->c:Landroid/database/Cursor;

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    iget-object v1, p0, Lcom/digdroid/alman/dig/u2$c;->a:Lcom/digdroid/alman/dig/z3;

    iget-object v2, p0, Lcom/digdroid/alman/dig/u2$c;->f:Ljava/lang/String;

    invoke-static {v1, v2}, Lcom/digdroid/alman/dig/i2;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;

    move-result-object v1

    new-instance v2, Lcom/digdroid/alman/dig/i2;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ".m3u"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v1, v5}, Lcom/digdroid/alman/dig/i2;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/i2;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/i2;->exists()Z

    move-result v5

    if-eqz v5, :cond_9

    :try_start_2
    invoke-virtual {v2}, Lcom/digdroid/alman/dig/i2;->length()J

    move-result-wide v5

    long-to-int v6, v5

    new-array v5, v6, [C

    new-instance v6, Ljava/io/InputStreamReader;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/i2;->i()Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v6, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v6, v5}, Ljava/io/InputStreamReader;->read([C)I

    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v5}, Ljava/lang/String;-><init>([C)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-virtual {v6}, Ljava/io/InputStreamReader;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_4

    :catch_1
    nop

    goto :goto_4

    :catchall_0
    move-exception p1

    move-object v0, v6

    goto :goto_2

    :catch_2
    move-object v0, v6

    goto :goto_3

    :catchall_1
    move-exception p1

    :goto_2
    if-eqz v0, :cond_7

    :try_start_5
    invoke-virtual {v0}, Ljava/io/InputStreamReader;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    :catch_3
    :cond_7
    throw p1

    :catch_4
    :goto_3
    if-eqz v0, :cond_8

    :try_start_6
    invoke-virtual {v0}, Ljava/io/InputStreamReader;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    :catch_5
    :cond_8
    move-object v0, v3

    :goto_4
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    return-object v1

    :cond_9
    iget-object v0, p0, Lcom/digdroid/alman/dig/u2$c;->a:Lcom/digdroid/alman/dig/z3;

    iget-object v2, p0, Lcom/digdroid/alman/dig/u2$c;->f:Ljava/lang/String;

    invoke-static {v0, v4, v2, p1}, Lcom/digdroid/alman/dig/u2;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_a

    return-object v1

    :cond_a
    iget-object v0, p0, Lcom/digdroid/alman/dig/u2$c;->a:Lcom/digdroid/alman/dig/z3;

    sget-object v1, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {v1}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v4, v1, p1}, Lcom/digdroid/alman/dig/u2;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    return-object v3

    :catch_6
    return-object v0
.end method

.method protected b(Ljava/lang/String;)V
    .locals 9

    if-eqz p1, :cond_4

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/u2$c;->a:Lcom/digdroid/alman/dig/z3;

    const v1, 0x7f1101f7

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/digdroid/alman/dig/u2$c;->f:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/u2$c;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/digdroid/alman/dig/u2$c;->a:Lcom/digdroid/alman/dig/z3;

    invoke-static {v1}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    array-length v3, v1

    if-lez v3, :cond_2

    array-length v3, v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_2

    aget-object v6, v1, v5

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    const-string v7, "/Android/data.*"

    invoke-virtual {v6, v7, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Lcom/digdroid/alman/dig/u2$c;->f:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    if-le v7, v8, :cond_1

    iget-object v7, p0, Lcom/digdroid/alman/dig/u2$c;->f:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v8

    invoke-virtual {v7, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    move-object v6, v2

    :goto_1
    if-eqz v6, :cond_3

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/NVIDIA_SHIELD"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/digdroid/alman/dig/u2$c;->a:Lcom/digdroid/alman/dig/z3;

    const v4, 0x7f110191

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n\n"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/digdroid/alman/dig/u2$c;->a:Lcom/digdroid/alman/dig/z3;

    const v0, 0x7f110192

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_3
    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v1, p0, Lcom/digdroid/alman/dig/u2$c;->a:Lcom/digdroid/alman/dig/z3;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v3

    invoke-direct {v0, v1, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x7f1101da

    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/u2$c;->e:Lcom/digdroid/alman/dig/u2$b;

    invoke-interface {p1, v2}, Lcom/digdroid/alman/dig/u2$b;->a(Ljava/lang/String;)V

    return-void

    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/u2$c;->e:Lcom/digdroid/alman/dig/u2$b;

    invoke-interface {v0, p1}, Lcom/digdroid/alman/dig/u2$b;->a(Ljava/lang/String;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/u2$c;->a([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/u2$c;->b(Ljava/lang/String;)V

    return-void
.end method
