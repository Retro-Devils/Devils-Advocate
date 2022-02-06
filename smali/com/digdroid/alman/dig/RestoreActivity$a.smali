.class Lcom/digdroid/alman/dig/RestoreActivity$a;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/RestoreActivity;
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
.field a:Z

.field final synthetic b:Lcom/digdroid/alman/dig/RestoreActivity;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/RestoreActivity;Z)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/RestoreActivity$a;->b:Lcom/digdroid/alman/dig/RestoreActivity;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-boolean p2, p0, Lcom/digdroid/alman/dig/RestoreActivity$a;->a:Z

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 5

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/RestoreActivity$a;->a:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/RestoreActivity$a;->b:Lcom/digdroid/alman/dig/RestoreActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    const-string v1, "data_version"

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/b3;->E(Ljava/lang/String;I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/RestoreActivity$a;->b:Lcom/digdroid/alman/dig/RestoreActivity;

    invoke-virtual {v1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object v1

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/u;->h()V

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "theme_file"

    const-string v3, "black.cfg"

    invoke-virtual {v0, v2, v3}, Lcom/digdroid/alman/dig/b3;->z(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/b3;->L(Z)V

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v2, v3}, Lcom/digdroid/alman/dig/b3;->C(J)V

    const-string v4, "sd_dirs_last_scanned"

    invoke-virtual {v0, v4, v2, v3}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    const-string v0, "UPDATE rompaths SET last_checked=0,present=0,matches=0,restoring=1"

    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "UPDATE systems SET numgames=0"

    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "UPDATE roms SET present=0,merged_with=-1,has_images=NULL,cover_status=21255"

    invoke-virtual {v1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iput-boolean p1, p0, Lcom/digdroid/alman/dig/RestoreActivity$a;->a:Z

    :cond_0
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected b(Ljava/lang/Void;)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/RestoreActivity$a;->b:Lcom/digdroid/alman/dig/RestoreActivity;

    invoke-static {p1}, Lcom/digdroid/alman/dig/z3;->E(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/RestoreActivity$a;->b:Lcom/digdroid/alman/dig/RestoreActivity;

    invoke-static {p1}, Lcom/digdroid/alman/dig/z3;->F(Landroid/content/Context;)V

    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/digdroid/alman/dig/RestoreActivity$a;->b:Lcom/digdroid/alman/dig/RestoreActivity;

    invoke-static {v0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v1

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/b3;->u()Z

    move-result v1

    if-eqz v1, :cond_0

    const-class v1, Lcom/digdroid/alman/dig/TVActivity;

    goto :goto_0

    :cond_0
    const-class v1, Lcom/digdroid/alman/dig/MainActivity;

    :goto_0
    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x10000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/RestoreActivity$a;->a:Z

    const-string v1, "restore_success"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v0, p0, Lcom/digdroid/alman/dig/RestoreActivity$a;->b:Lcom/digdroid/alman/dig/RestoreActivity;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/RestoreActivity$a;->b:Lcom/digdroid/alman/dig/RestoreActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/RestoreActivity$a;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/RestoreActivity$a;->b(Ljava/lang/Void;)V

    return-void
.end method
