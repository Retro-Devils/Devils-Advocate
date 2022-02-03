.class Lcom/digdroid/alman/dig/o$c;
.super Landroid/os/AsyncTask;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o;->g(Landroid/database/Cursor;ILjava/lang/String;)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
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
.field a:[B

.field final synthetic b:I

.field final synthetic c:J

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Z

.field final synthetic g:I

.field final synthetic h:Lcom/digdroid/alman/dig/o;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/o;[BIJLjava/lang/String;Ljava/lang/String;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/digdroid/alman/dig/o$c;->h:Lcom/digdroid/alman/dig/o;

    iput p3, p0, Lcom/digdroid/alman/dig/o$c;->b:I

    iput-wide p4, p0, Lcom/digdroid/alman/dig/o$c;->c:J

    iput-object p6, p0, Lcom/digdroid/alman/dig/o$c;->d:Ljava/lang/String;

    iput-object p7, p0, Lcom/digdroid/alman/dig/o$c;->e:Ljava/lang/String;

    iput-boolean p8, p0, Lcom/digdroid/alman/dig/o$c;->f:Z

    iput p9, p0, Lcom/digdroid/alman/dig/o$c;->g:I

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    iput-object p2, p0, Lcom/digdroid/alman/dig/o$c;->a:[B

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 5

    const/4 p1, 0x1

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/o$c;->a:[B

    if-eqz v0, :cond_3

    iget v1, p0, Lcom/digdroid/alman/dig/o$c;->b:I

    const/16 v2, 0x20

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/o$c;->h:Lcom/digdroid/alman/dig/o;

    iget-wide v2, p0, Lcom/digdroid/alman/dig/o$c;->c:J

    invoke-virtual {v1, v0, v2, v3}, Lcom/digdroid/alman/dig/o;->q([BJ)V

    goto/16 :goto_1

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/o$c;->h:Lcom/digdroid/alman/dig/o;

    iget-object v1, v1, Lcom/digdroid/alman/dig/o;->k:Lcom/digdroid/alman/dig/t1;

    iget-object v2, p0, Lcom/digdroid/alman/dig/o$c;->d:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/digdroid/alman/dig/t1;->w([BLjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/o$c;->h:Lcom/digdroid/alman/dig/o;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/o;->s()V

    goto/16 :goto_1

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/o$c;->h:Lcom/digdroid/alman/dig/o;

    invoke-static {v0}, Lcom/digdroid/alman/dig/o;->a(Lcom/digdroid/alman/dig/o;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UPDATE roms SET has_images=NULL WHERE _id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/digdroid/alman/dig/o$c;->c:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/o$c;->h:Lcom/digdroid/alman/dig/o;

    iget-object v2, v2, Lcom/digdroid/alman/dig/o;->h:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "image_downloaded"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "gameid"

    iget-wide v2, p0, Lcom/digdroid/alman/dig/o$c;->c:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    const-string v1, "system"

    iget-object v2, p0, Lcom/digdroid/alman/dig/o$c;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "favorite"

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/o$c;->f:Z

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v1, "is_screenshot"

    iget v2, p0, Lcom/digdroid/alman/dig/o$c;->b:I

    const/16 v3, 0x1000

    if-ne v2, v3, :cond_2

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    iget-object v1, p0, Lcom/digdroid/alman/dig/o$c;->h:Lcom/digdroid/alman/dig/o;

    iget-object v1, v1, Lcom/digdroid/alman/dig/o;->h:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lb/n/a/a;->b(Landroid/content/Context;)Lb/n/a/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lb/n/a/a;->d(Landroid/content/Intent;)Z

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/digdroid/alman/dig/o$c;->h:Lcom/digdroid/alman/dig/o;

    invoke-static {v0}, Lcom/digdroid/alman/dig/o;->b(Lcom/digdroid/alman/dig/o;)Lcom/digdroid/alman/dig/q;

    move-result-object v0

    iget v1, p0, Lcom/digdroid/alman/dig/o$c;->b:I

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/q;->a(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/o$c;->h:Lcom/digdroid/alman/dig/o;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/o$c;->c:J

    iget v3, p0, Lcom/digdroid/alman/dig/o$c;->g:I

    iget v4, p0, Lcom/digdroid/alman/dig/o$c;->b:I

    invoke-virtual {v0, v3, v4}, Lcom/digdroid/alman/dig/o;->d(II)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/digdroid/alman/dig/o;->r(JIZ)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/o$c;->h:Lcom/digdroid/alman/dig/o;

    invoke-static {v0}, Lcom/digdroid/alman/dig/o;->b(Lcom/digdroid/alman/dig/o;)Lcom/digdroid/alman/dig/q;

    move-result-object v0

    iget v1, p0, Lcom/digdroid/alman/dig/o$c;->b:I

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/q;->a(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/o$c;->h:Lcom/digdroid/alman/dig/o;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/o$c;->c:J

    iget v3, p0, Lcom/digdroid/alman/dig/o$c;->g:I

    iget v4, p0, Lcom/digdroid/alman/dig/o$c;->b:I

    invoke-virtual {v0, v3, v4}, Lcom/digdroid/alman/dig/o;->d(II)I

    move-result v3

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/digdroid/alman/dig/o;->r(JIZ)V

    :goto_1
    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/o$c;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    return-object p1
.end method
