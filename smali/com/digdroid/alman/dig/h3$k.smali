.class Lcom/digdroid/alman/dig/h3$k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/h3;->B(Landroid/app/Activity;Ljava/lang/String;Lcom/digdroid/alman/dig/h3$o;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/digdroid/alman/dig/h3$o;

.field final synthetic d:Lcom/digdroid/alman/dig/h3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/h3;Ljava/lang/String;Lcom/digdroid/alman/dig/h3$o;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/h3$k;->d:Lcom/digdroid/alman/dig/h3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/h3$k;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/digdroid/alman/dig/h3$k;->c:Lcom/digdroid/alman/dig/h3$o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/h3$k;->d:Lcom/digdroid/alman/dig/h3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/h3;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "UPDATE roms SET ignored=1 WHERE system=\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/h3$k;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/h3$k;->d:Lcom/digdroid/alman/dig/h3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/h3;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE systems SET ignored=1,numgames=0 WHERE slug=\'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/h3$k;->b:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/h3$k;->c:Lcom/digdroid/alman/dig/h3$o;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/h3$o;->a()V

    return-void
.end method
