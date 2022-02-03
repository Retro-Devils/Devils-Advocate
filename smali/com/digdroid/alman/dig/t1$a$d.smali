.class Lcom/digdroid/alman/dig/t1$a$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1$a;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/t1$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "UPDATE rompaths SET system=\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t1$a;->f:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' WHERE system=\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object v1, v1, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UPDATE roms SET system=\'"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object v2, v2, Lcom/digdroid/alman/dig/t1$a;->f:Ljava/lang/String;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "UPDATE roms SET merged_with=-1 WHERE system=\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' OR system=\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t1$a;->f:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1;->b:Landroid/content/Context;

    const-string p2, "merge_games"

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/DatabaseService;->t(Landroid/content/Context;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object p2, p1, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p2, p2, Lcom/digdroid/alman/dig/t1;->d:Lcom/digdroid/alman/dig/g3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a;->f:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/g3;->D(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "DELETE FROM systems WHERE slug=\'"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object p2, p1, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p2, p2, Lcom/digdroid/alman/dig/t1;->d:Lcom/digdroid/alman/dig/g3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/g3;->g(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a$d;->b:Lcom/digdroid/alman/dig/t1$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1$a;->c:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    return-void
.end method
