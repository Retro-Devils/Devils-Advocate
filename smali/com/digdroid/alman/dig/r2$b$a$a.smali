.class Lcom/digdroid/alman/dig/r2$b$a$a;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2$b$a;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
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
.field final synthetic a:Lcom/digdroid/alman/dig/r2$b$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2$b$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$b$a$a;->a:Lcom/digdroid/alman/dig/r2$b$a;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$b$a$a;->a:Lcom/digdroid/alman/dig/r2$b$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$b$a;->b:Lcom/digdroid/alman/dig/r2$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$b;->c:Lcom/digdroid/alman/dig/r2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    const-string v0, "UPDATE roms SET has_images=NULL,cover_status=21255"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$b$a$a;->a:Lcom/digdroid/alman/dig/r2$b$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$b$a;->b:Lcom/digdroid/alman/dig/r2$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r2$b;->b:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r2$b$a$a;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/r2$b$a$a;->b(Ljava/lang/Void;)V

    return-void
.end method
