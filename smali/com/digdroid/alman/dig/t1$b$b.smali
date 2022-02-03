.class Lcom/digdroid/alman/dig/t1$b$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1$b;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/t1$b;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$b$b;->b:Lcom/digdroid/alman/dig/t1$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$b$b;->b:Lcom/digdroid/alman/dig/t1$b;

    iget-object p2, p1, Lcom/digdroid/alman/dig/t1$b;->j:Lcom/digdroid/alman/dig/t1;

    iget-object v0, p1, Lcom/digdroid/alman/dig/t1$b;->c:Ljava/lang/String;

    iget-wide v1, p1, Lcom/digdroid/alman/dig/t1$b;->d:J

    const/4 p1, 0x0

    invoke-virtual {p2, v0, v1, v2, p1}, Lcom/digdroid/alman/dig/t1;->h(Ljava/lang/String;JZ)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz p2, :cond_0

    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_0
    :try_start_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$b$b;->b:Lcom/digdroid/alman/dig/t1$b;

    iget-boolean p2, p1, Lcom/digdroid/alman/dig/t1$b;->i:Z

    if-nez p2, :cond_1

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$b;->e:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "UPDATE roms SET has_images=NULL,cover_status=cover_status|21255 WHERE _id="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$b$b;->b:Lcom/digdroid/alman/dig/t1$b;

    iget-wide v0, v0, Lcom/digdroid/alman/dig/t1$b;->d:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$b;->e:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "UPDATE roms SET has_images=NULL,cover_status=(cover_status&-8193)|20480 WHERE _id="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$b$b;->b:Lcom/digdroid/alman/dig/t1$b;

    iget-wide v0, v0, Lcom/digdroid/alman/dig/t1$b;->d:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$b$b;->b:Lcom/digdroid/alman/dig/t1$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$b;->j:Lcom/digdroid/alman/dig/t1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1;->b:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$b$b;->b:Lcom/digdroid/alman/dig/t1$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$b;->b:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    return-void
.end method
