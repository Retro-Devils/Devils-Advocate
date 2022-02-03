.class Lcom/digdroid/alman/dig/ServerService$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/c/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/ServerService;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/a/c/p$b<",
        "[B>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/t1;

.field final synthetic b:Ljava/io/File;

.field final synthetic c:Landroid/database/sqlite/SQLiteDatabase;

.field final synthetic d:J

.field final synthetic e:Lcom/digdroid/alman/dig/ServerService;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/ServerService;Lcom/digdroid/alman/dig/t1;Ljava/io/File;Landroid/database/sqlite/SQLiteDatabase;J)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/ServerService$b;->e:Lcom/digdroid/alman/dig/ServerService;

    iput-object p2, p0, Lcom/digdroid/alman/dig/ServerService$b;->a:Lcom/digdroid/alman/dig/t1;

    iput-object p3, p0, Lcom/digdroid/alman/dig/ServerService$b;->b:Ljava/io/File;

    iput-object p4, p0, Lcom/digdroid/alman/dig/ServerService$b;->c:Landroid/database/sqlite/SQLiteDatabase;

    iput-wide p5, p0, Lcom/digdroid/alman/dig/ServerService$b;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/ServerService$b;->b([B)V

    return-void
.end method

.method public b([B)V
    .locals 3

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/ServerService$b;->a:Lcom/digdroid/alman/dig/t1;

    iget-object v1, p0, Lcom/digdroid/alman/dig/ServerService$b;->b:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/digdroid/alman/dig/t1;->w([BLjava/lang/String;)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/ServerService$b;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE games SET gdbid=-1 WHERE _id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/ServerService$b;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
