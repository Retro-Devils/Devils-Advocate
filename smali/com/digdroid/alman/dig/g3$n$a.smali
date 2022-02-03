.class Lcom/digdroid/alman/dig/g3$n$a;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/g3$n;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/g3$n;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/g3$n;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g3$n$a;->a:Lcom/digdroid/alman/dig/g3$n;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Ljava/lang/Void;
    .locals 4

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$n$a;->a:Lcom/digdroid/alman/dig/g3$n;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$n;->b:Lcom/digdroid/alman/dig/g3;

    iget-object v0, p1, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/h3;->w(Ljava/lang/String;)Z

    move-result p1

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/g3$n$a;->a:Lcom/digdroid/alman/dig/g3$n;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$n;->b:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v2

    invoke-static {v2}, Lcom/digdroid/alman/dig/a4;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_0

    const-string v2, "/Covers/"

    goto :goto_0

    :cond_0
    const-string v2, "/Screenshots/"

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/g3$n$a;->a:Lcom/digdroid/alman/dig/g3$n;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$n;->b:Lcom/digdroid/alman/dig/g3;

    iget-object v3, v2, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v3, v2}, Lcom/digdroid/alman/dig/h3;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/g3$n$a;->a:Lcom/digdroid/alman/dig/g3$n;

    iget-object v0, v0, Lcom/digdroid/alman/dig/g3$n;->b:Lcom/digdroid/alman/dig/g3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "\'"

    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UPDATE roms SET has_images=NULL,cover_status=cover_status|21255 WHERE system=\'"

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UPDATE roms SET has_images=NULL,cover_status=(cover_status&-8193)|20480 WHERE system=\'"

    :goto_2
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/g3$n$a;->a:Lcom/digdroid/alman/dig/g3$n;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$n;->b:Lcom/digdroid/alman/dig/g3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$n$a;->a:Lcom/digdroid/alman/dig/g3$n;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$n;->b:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$n$a;->a:Lcom/digdroid/alman/dig/g3$n;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$n;->b:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/t0;->O2()V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/g3$n$a;->a([Ljava/lang/String;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/g3$n$a;->b(Ljava/lang/Void;)V

    return-void
.end method
