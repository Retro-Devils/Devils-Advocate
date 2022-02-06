.class Lcom/digdroid/alman/dig/o$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/c/p$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:J

.field final synthetic c:Lcom/digdroid/alman/dig/o;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/o;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/o$f;->c:Lcom/digdroid/alman/dig/o;

    iput-object p2, p0, Lcom/digdroid/alman/dig/o$f;->a:Ljava/lang/String;

    iput-wide p3, p0, Lcom/digdroid/alman/dig/o$f;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lc/a/c/u;)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p1, Lc/a/c/u;->b:Lc/a/c/k;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "not found: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/o$f;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ZZZ"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p1, Lc/a/c/u;->b:Lc/a/c/k;

    iget p1, p1, Lc/a/c/k;->a:I

    const/16 v0, 0x194

    if-eq p1, v0, :cond_0

    const/16 v0, 0x19a

    if-eq p1, v0, :cond_0

    const/16 v0, 0x12c

    if-lt p1, v0, :cond_1

    const/16 v0, 0x190

    if-ge p1, v0, :cond_1

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/o$f;->c:Lcom/digdroid/alman/dig/o;

    invoke-static {p1}, Lcom/digdroid/alman/dig/o;->c(Lcom/digdroid/alman/dig/o;)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE moby SET url=null WHERE rowid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/o$f;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_1
    return-void
.end method
