.class Lcom/digdroid/alman/dig/t1$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/i$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1$b;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/t1$b;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$b$a;->a:Lcom/digdroid/alman/dig/t1$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a([Ljava/lang/String;)V
    .locals 5

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$b$a;->a:Lcom/digdroid/alman/dig/t1$b;

    iget-object v1, v0, Lcom/digdroid/alman/dig/t1$b;->j:Lcom/digdroid/alman/dig/t1;

    iget-object v2, v0, Lcom/digdroid/alman/dig/t1$b;->c:Ljava/lang/String;

    iget-wide v3, v0, Lcom/digdroid/alman/dig/t1$b;->d:J

    const/4 v0, 0x1

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/digdroid/alman/dig/t1;->h(Ljava/lang/String;JZ)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/y3;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$b$a;->a:Lcom/digdroid/alman/dig/t1$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$b;->e:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE roms SET has_images=NULL WHERE _id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$b$a;->a:Lcom/digdroid/alman/dig/t1$b;

    iget-wide v1, v1, Lcom/digdroid/alman/dig/t1$b;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$b$a;->a:Lcom/digdroid/alman/dig/t1$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$b;->b:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$b$a;->a:Lcom/digdroid/alman/dig/t1$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$b;->f:Lcom/digdroid/alman/dig/t1$l;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/t1$l;->a()V

    return-void
.end method
