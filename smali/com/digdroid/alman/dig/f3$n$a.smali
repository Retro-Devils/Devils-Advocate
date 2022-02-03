.class Lcom/digdroid/alman/dig/f3$n$a;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f3$n;->onClick(Landroid/content/DialogInterface;I)V
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
.field final synthetic a:Lcom/digdroid/alman/dig/f3$n;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f3$n;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f3$n$a;->a:Lcom/digdroid/alman/dig/f3$n;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/f3$n$a;->a:Lcom/digdroid/alman/dig/f3$n;

    iget-object p1, p1, Lcom/digdroid/alman/dig/f3$n;->b:Lcom/digdroid/alman/dig/f3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/f3$n$a;->a:Lcom/digdroid/alman/dig/f3$n;

    iget-object v0, v0, Lcom/digdroid/alman/dig/f3$n;->b:Lcom/digdroid/alman/dig/f3;

    iget-object v1, v0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/p1;->Z2(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "\'"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UPDATE roms SET has_images=NULL,cover_status=cover_status|21255 WHERE system=\'"

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UPDATE roms SET has_images=NULL,cover_status=(cover_status&-8193)|20480 WHERE system=\'"

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/f3$n$a;->a:Lcom/digdroid/alman/dig/f3$n;

    iget-object v2, v2, Lcom/digdroid/alman/dig/f3$n;->b:Lcom/digdroid/alman/dig/f3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f3$n$a;->a:Lcom/digdroid/alman/dig/f3$n;

    iget-object p1, p1, Lcom/digdroid/alman/dig/f3$n;->b:Lcom/digdroid/alman/dig/f3;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/f3$n$a;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
