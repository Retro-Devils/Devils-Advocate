.class Lcom/digdroid/alman/dig/q2$w0;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/q2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "w0"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/q2;


# direct methods
.method private constructor <init>(Lcom/digdroid/alman/dig/q2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$w0;->a:Lcom/digdroid/alman/dig/q2;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/digdroid/alman/dig/q2;Lcom/digdroid/alman/dig/q2$k;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/q2$w0;-><init>(Lcom/digdroid/alman/dig/q2;)V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 p1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/q2$w0;->a:Lcom/digdroid/alman/dig/q2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "SELECT slug FROM systems"

    invoke-virtual {v0, v1, p1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/q2$w0;->a:Lcom/digdroid/alman/dig/q2;

    iget-object v1, v1, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/g3;->D(Ljava/lang/String;)V

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object p1
.end method

.method protected b(Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$w0;->a:Lcom/digdroid/alman/dig/q2;

    invoke-static {p1}, Lcom/digdroid/alman/dig/q2;->m3(Lcom/digdroid/alman/dig/q2;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q2$w0;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q2$w0;->b(Ljava/lang/String;)V

    return-void
.end method
