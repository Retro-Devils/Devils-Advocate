.class Lcom/digdroid/alman/dig/h3$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/h3;->K(Landroid/app/Activity;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/digdroid/alman/dig/h3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/h3;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/h3$a;->c:Lcom/digdroid/alman/dig/h3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/h3$a;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/h3$a;->c:Lcom/digdroid/alman/dig/h3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/h3;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "UPDATE systems SET ignored=0 WHERE slug=\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/h3$a;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/h3$a;->c:Lcom/digdroid/alman/dig/h3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/h3;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE roms SET ignored=0 WHERE system=\'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/h3$a;->b:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/h3$a;->c:Lcom/digdroid/alman/dig/h3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/h3;->d:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE rompaths SET last_checked=0 WHERE system=\'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/h3$a;->b:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/h3$a;->c:Lcom/digdroid/alman/dig/h3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/h3$a;->b:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/h3;->E(Ljava/lang/String;)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/h3$a;->b:Ljava/lang/String;

    const-string p2, "android"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/h3$a;->c:Lcom/digdroid/alman/dig/h3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/h3;->b:Landroid/content/Context;

    const-string p2, "scandroid"

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/DatabaseService;->v(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/h3$a;->c:Lcom/digdroid/alman/dig/h3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/h3$a;->b:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Lcom/digdroid/alman/dig/h3;->d(Ljava/lang/String;Z)V

    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/h3$a;->c:Lcom/digdroid/alman/dig/h3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/h3;->b:Landroid/content/Context;

    const-string p2, "merge_games"

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/DatabaseService;->v(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method
