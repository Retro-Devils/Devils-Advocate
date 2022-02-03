.class Lcom/digdroid/alman/dig/m0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/m0;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/database/sqlite/SQLiteDatabase;

.field final synthetic c:I

.field final synthetic d:[Z

.field final synthetic e:[J

.field final synthetic f:Lcom/digdroid/alman/dig/m0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/m0;Landroid/database/sqlite/SQLiteDatabase;I[Z[J)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/m0$c;->f:Lcom/digdroid/alman/dig/m0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/m0$c;->b:Landroid/database/sqlite/SQLiteDatabase;

    iput p3, p0, Lcom/digdroid/alman/dig/m0$c;->c:I

    iput-object p4, p0, Lcom/digdroid/alman/dig/m0$c;->d:[Z

    iput-object p5, p0, Lcom/digdroid/alman/dig/m0$c;->e:[J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$c;->b:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "DELETE FROM gamegenres WHERE game="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0$c;->f:Lcom/digdroid/alman/dig/m0;

    iget-wide v0, v0, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const/4 p1, 0x0

    :goto_0
    iget p2, p0, Lcom/digdroid/alman/dig/m0$c;->c:I

    if-ge p1, p2, :cond_1

    iget-object p2, p0, Lcom/digdroid/alman/dig/m0$c;->d:[Z

    aget-boolean p2, p2, p1

    if-eqz p2, :cond_0

    new-instance p2, Landroid/content/ContentValues;

    invoke-direct {p2}, Landroid/content/ContentValues;-><init>()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0$c;->f:Lcom/digdroid/alman/dig/m0;

    iget-wide v0, v0, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "game"

    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0$c;->e:[J

    aget-wide v1, v0, p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-string v1, "genre"

    invoke-virtual {p2, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0$c;->b:Landroid/database/sqlite/SQLiteDatabase;

    const/4 v1, 0x0

    const-string v2, "gamegenres"

    invoke-virtual {v0, v2, v1, p2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/m0$c;->f:Lcom/digdroid/alman/dig/m0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/m0;->d:Lcom/digdroid/alman/dig/m0$p;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/m0$p;->b()V

    return-void
.end method
