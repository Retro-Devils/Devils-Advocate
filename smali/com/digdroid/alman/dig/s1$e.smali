.class Lcom/digdroid/alman/dig/s1$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s1;->F3(Landroid/database/Cursor;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:[Z

.field final synthetic c:[J

.field final synthetic d:I

.field final synthetic e:[I

.field final synthetic f:Lcom/digdroid/alman/dig/s1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s1;[Z[JI[I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s1$e;->f:Lcom/digdroid/alman/dig/s1;

    iput-object p2, p0, Lcom/digdroid/alman/dig/s1$e;->b:[Z

    iput-object p3, p0, Lcom/digdroid/alman/dig/s1$e;->c:[J

    iput p4, p0, Lcom/digdroid/alman/dig/s1$e;->d:I

    iput-object p5, p0, Lcom/digdroid/alman/dig/s1$e;->e:[I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 11

    iget-object p1, p0, Lcom/digdroid/alman/dig/s1$e;->f:Lcom/digdroid/alman/dig/s1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    const/4 p2, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x0

    const-string v3, "main"

    const-string v4, "enabled"

    const/4 v5, 0x7

    if-ge v0, v5, :cond_1

    iget-object v5, p0, Lcom/digdroid/alman/dig/s1$e;->b:[Z

    aget-boolean v5, v5, v0

    if-eqz v5, :cond_0

    add-int/lit8 v1, v1, 0x1

    :cond_0
    new-instance v5, Landroid/content/ContentValues;

    invoke-direct {v5}, Landroid/content/ContentValues;-><init>()V

    iget-object v6, p0, Lcom/digdroid/alman/dig/s1$e;->b:[Z

    aget-boolean v6, v6, v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v4, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "_id="

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/digdroid/alman/dig/s1$e;->c:[J

    aget-wide v7, v6, v0

    invoke-virtual {v4, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v3, v5, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const-string v0, "DELETE FROM main WHERE type>=7"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const/4 v0, 0x7

    :goto_1
    iget v6, p0, Lcom/digdroid/alman/dig/s1$e;->d:I

    add-int/2addr v6, v5

    const/4 v7, 0x1

    if-ge v0, v6, :cond_3

    iget-object v6, p0, Lcom/digdroid/alman/dig/s1$e;->b:[Z

    aget-boolean v6, v6, v0

    if-eqz v6, :cond_2

    add-int/lit8 v1, v1, 0x1

    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    const/16 v8, 0x64

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "type"

    invoke-virtual {v6, v9, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    add-int/lit8 v8, v0, 0x64

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const-string v9, "position"

    invoke-virtual {v6, v9, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v8, p0, Lcom/digdroid/alman/dig/s1$e;->c:[J

    aget-wide v9, v8, v0

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const-string v9, "itemid"

    invoke-virtual {v6, v9, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v4, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v7, p0, Lcom/digdroid/alman/dig/s1$e;->e:[I

    aget v7, v7, v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-string v8, "itemaux"

    invoke-virtual {v6, v8, v7}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p1, v3, v2, v6}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/digdroid/alman/dig/s1$e;->f:Lcom/digdroid/alman/dig/s1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    if-ne v1, v7, :cond_4

    const/4 p2, 0x1

    :cond_4
    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/b3;->P(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/s1$e;->f:Lcom/digdroid/alman/dig/s1;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/r1;->q3()V

    return-void
.end method
