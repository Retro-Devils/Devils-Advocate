.class Lcom/digdroid/alman/dig/o;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/o$i;
    }
.end annotation


# static fields
.field private static a:Lcom/digdroid/alman/dig/o;


# instance fields
.field private b:Landroid/database/sqlite/SQLiteDatabase;

.field private c:Landroid/database/sqlite/SQLiteDatabase;

.field private d:Lcom/digdroid/alman/dig/b3;

.field private e:Lc/a/c/o;

.field private f:Lcom/digdroid/alman/dig/q;

.field g:Z

.field h:Landroid/content/Context;

.field i:Lcom/digdroid/alman/dig/g3;

.field j:Lcom/digdroid/alman/dig/o0;

.field k:Lcom/digdroid/alman/dig/t1;

.field l:Ljava/lang/String;

.field m:Ljava/lang/String;

.field n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/o;->g:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/o;->n:Z

    iput-object p1, p0, Lcom/digdroid/alman/dig/o;->h:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/o;->d:Lcom/digdroid/alman/dig/b3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object v0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->h()V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/o;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {p1}, Lcom/digdroid/alman/dig/z1;->b(Landroid/content/Context;)Lcom/digdroid/alman/dig/z1;

    move-result-object v1

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/z1;->c()Z

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/z1;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/o;->c:Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/o0;->g(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/o0;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/o;->j:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/o0;->o()V

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/g3;->q(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/g3;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/o;->i:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/g3;->B()V

    invoke-static {p1}, Lcom/digdroid/alman/dig/t1;->p(Landroid/content/Context;)Lcom/digdroid/alman/dig/t1;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/o;->k:Lcom/digdroid/alman/dig/t1;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lcom/digdroid/alman/dig/y3;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/Screenshots"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/o;->l:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lcom/digdroid/alman/dig/y3;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/Covers"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/o;->m:Ljava/lang/String;

    new-instance v0, Lcom/digdroid/alman/dig/q;

    iget-object v1, p0, Lcom/digdroid/alman/dig/o;->c:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v2, p0, Lcom/digdroid/alman/dig/o;->b:Landroid/database/sqlite/SQLiteDatabase;

    invoke-direct {v0, p1, v1, v2}, Lcom/digdroid/alman/dig/q;-><init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteDatabase;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/o;->f:Lcom/digdroid/alman/dig/q;

    invoke-static {p1}, Lcom/digdroid/alman/dig/l2;->a(Landroid/content/Context;)Lc/a/c/o;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/o;->e:Lc/a/c/o;

    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/o;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/o;->b:Landroid/database/sqlite/SQLiteDatabase;

    return-object p0
.end method

.method static synthetic b(Lcom/digdroid/alman/dig/o;)Lcom/digdroid/alman/dig/q;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/o;->f:Lcom/digdroid/alman/dig/q;

    return-object p0
.end method

.method static synthetic c(Lcom/digdroid/alman/dig/o;)Landroid/database/sqlite/SQLiteDatabase;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/o;->c:Landroid/database/sqlite/SQLiteDatabase;

    return-object p0
.end method

.method public static declared-synchronized j(Landroid/content/Context;)Lcom/digdroid/alman/dig/o;
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/o;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/digdroid/alman/dig/o;->a:Lcom/digdroid/alman/dig/o;

    if-nez v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/o;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/o;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/digdroid/alman/dig/o;->a:Lcom/digdroid/alman/dig/o;

    :cond_0
    sget-object p0, Lcom/digdroid/alman/dig/o;->a:Lcom/digdroid/alman/dig/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method d(II)I
    .locals 1

    const/16 v0, 0x1000

    if-ne p2, v0, :cond_0

    and-int/lit16 p1, p1, -0x2001

    or-int/2addr p1, v0

    or-int/lit16 p1, p1, 0x4000

    return p1

    :cond_0
    or-int/lit16 p1, p1, 0x4000

    return p1
.end method

.method public e()V
    .locals 16

    move-object/from16 v7, p0

    iget-object v0, v7, Lcom/digdroid/alman/dig/o;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v8

    iget-object v0, v7, Lcom/digdroid/alman/dig/o;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "SELECT g._id,g.gfcover,s.slug FROM games as g,systems as s WHERE g.gfcover IS NOT NULL AND s._id=g.system"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    invoke-interface {v9}, Landroid/database/Cursor;->getCount()I

    move-result v0

    int-to-long v10, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "to get: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ZZX"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v12, Ljava/util/Random;

    invoke-direct {v12}, Ljava/util/Random;-><init>()V

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, v10, v0

    if-lez v2, :cond_2

    long-to-int v0, v10

    invoke-virtual {v12, v0}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    invoke-interface {v9, v0}, Landroid/database/Cursor;->moveToPosition(I)Z

    const/4 v0, 0x2

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x1

    aget-object v3, v8, v2

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "/Server/Covers/"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v9, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    new-instance v1, Ljava/io/File;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ".png"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v7, Lcom/digdroid/alman/dig/o;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UPDATE games SET gfcover=null WHERE _id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "http://img.gamefaqs.net/box/"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v9, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_front.jpg"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v13, Lcom/digdroid/alman/dig/o$i;

    const/4 v2, 0x0

    new-instance v6, Lcom/digdroid/alman/dig/o$g;

    invoke-direct {v6, v7, v5, v1}, Lcom/digdroid/alman/dig/o$g;-><init>(Lcom/digdroid/alman/dig/o;Ljava/lang/String;Ljava/io/File;)V

    new-instance v14, Lcom/digdroid/alman/dig/o$h;

    invoke-direct {v14, v7, v5, v3, v4}, Lcom/digdroid/alman/dig/o$h;-><init>(Lcom/digdroid/alman/dig/o;Ljava/lang/String;J)V

    const/4 v15, 0x0

    move-object v0, v13

    move-object/from16 v1, p0

    move-object v3, v5

    move-object v4, v6

    move-object v5, v14

    move-object v6, v15

    invoke-direct/range {v0 .. v6}, Lcom/digdroid/alman/dig/o$i;-><init>(Lcom/digdroid/alman/dig/o;ILjava/lang/String;Lc/a/c/p$b;Lc/a/c/p$a;Ljava/util/HashMap;)V

    iget-object v0, v7, Lcom/digdroid/alman/dig/o;->e:Lc/a/c/o;

    invoke-virtual {v0, v13}, Lc/a/c/o;->a(Lc/a/c/n;)Lc/a/c/n;

    const-wide/16 v0, 0x2710

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    nop

    goto/16 :goto_0

    :cond_2
    return-void
.end method

.method f(Landroid/database/Cursor;)I
    .locals 12

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v5, 0x4

    invoke-interface {p1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x0

    if-nez v3, :cond_1

    new-instance v3, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_0
    const/16 v3, 0x2e

    invoke-virtual {v2, v3}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    if-lez v3, :cond_2

    invoke-virtual {v2, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v3

    :cond_2
    :goto_0
    iget-object v3, p0, Lcom/digdroid/alman/dig/o;->i:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v3, v0}, Lcom/digdroid/alman/dig/g3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x3e8

    const/16 v4, 0x32

    if-nez v0, :cond_4

    iget-object p1, p0, Lcom/digdroid/alman/dig/o;->d:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/b3;->o()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/16 v3, 0x32

    :goto_1
    return v3

    :cond_4
    new-instance v7, Landroid/content/ContentValues;

    invoke-direct {v7}, Landroid/content/ContentValues;-><init>()V

    new-instance v8, Ljava/io/File;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v10, p0, Lcom/digdroid/alman/dig/o;->l:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, ".png"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    :goto_2
    new-instance v8, Ljava/io/File;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v11, p0, Lcom/digdroid/alman/dig/o;->m:Ljava/lang/String;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_6

    or-int/lit8 v1, v1, 0x1

    :cond_6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "has_images"

    invoke-virtual {v7, v1, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/o;->b:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "_id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const-string v2, "roms"

    invoke-virtual {v0, v2, v7, p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    iget-object p1, p0, Lcom/digdroid/alman/dig/o;->d:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/b3;->o()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    const/16 v3, 0x32

    :goto_3
    return v3
.end method

.method g(Landroid/database/Cursor;ILjava/lang/String;)I
    .locals 22

    move-object/from16 v9, p0

    move-object/from16 v0, p1

    iget-boolean v1, v9, Lcom/digdroid/alman/dig/o;->g:Z

    const/4 v10, 0x0

    if-eqz v1, :cond_0

    return v10

    :cond_0
    invoke-interface {v0, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    const/4 v1, 0x4

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v2, 0x3

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    const/4 v5, 0x5

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    if-lez v5, :cond_1

    const/4 v5, 0x1

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    :goto_0
    const/4 v11, 0x6

    invoke-interface {v0, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v14

    if-gez p2, :cond_2

    iget-object v11, v9, Lcom/digdroid/alman/dig/o;->f:Lcom/digdroid/alman/dig/q;

    invoke-virtual {v11, v8, v2, v3, v14}, Lcom/digdroid/alman/dig/q;->g(IJLjava/lang/String;)I

    move-result v11

    move v15, v11

    goto :goto_1

    :cond_2
    move/from16 v15, p2

    :goto_1
    if-gez v15, :cond_3

    return v10

    :cond_3
    iget-object v11, v9, Lcom/digdroid/alman/dig/o;->i:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v11, v4}, Lcom/digdroid/alman/dig/g3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const/16 v12, 0x1000

    if-ne v15, v12, :cond_4

    and-int/lit16 v11, v8, -0x1001

    or-int/lit16 v11, v11, 0x2000

    goto :goto_2

    :cond_4
    and-int/lit16 v11, v8, -0x4001

    :goto_2
    invoke-virtual {v9, v6, v7, v11, v10}, Lcom/digdroid/alman/dig/o;->r(JIZ)V

    if-nez p3, :cond_5

    iget-object v11, v9, Lcom/digdroid/alman/dig/o;->f:Lcom/digdroid/alman/dig/q;

    move v12, v15

    move-object/from16 p2, v13

    move-object/from16 v20, v14

    move/from16 v21, v15

    move-wide v14, v6

    move-wide/from16 v16, v2

    move-object/from16 v18, v20

    invoke-virtual/range {v11 .. v18}, Lcom/digdroid/alman/dig/q;->c(ILjava/lang/String;JJLjava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_3

    :cond_5
    move-object/from16 p2, v13

    move-object/from16 v20, v14

    move/from16 v21, v15

    move-object/from16 v11, p3

    :goto_3
    if-nez v11, :cond_6

    iget-object v11, v9, Lcom/digdroid/alman/dig/o;->f:Lcom/digdroid/alman/dig/q;

    move v12, v8

    move/from16 v13, v21

    move-wide v14, v2

    move-object/from16 v16, v20

    invoke-virtual/range {v11 .. v16}, Lcom/digdroid/alman/dig/q;->e(IIJLjava/lang/String;)I

    move-result v0

    invoke-virtual {v9, v6, v7, v0, v1}, Lcom/digdroid/alman/dig/o;->r(JIZ)V

    return v10

    :cond_6
    const/4 v12, 0x7

    invoke-interface {v0, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_7

    const/4 v12, 0x2

    invoke-interface {v0, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    :cond_7
    move/from16 v13, v21

    const/16 v0, 0x1000

    if-ne v13, v0, :cond_8

    const/4 v14, 0x1

    goto :goto_4

    :cond_8
    const/4 v14, 0x0

    :goto_4
    const-string v15, "mame"

    move-object/from16 v10, p2

    invoke-virtual {v10, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x8

    if-eq v13, v10, :cond_a

    const/16 v10, 0x100

    if-eq v13, v10, :cond_a

    const/16 v10, 0x200

    if-eq v13, v10, :cond_a

    if-eq v13, v0, :cond_9

    goto :goto_5

    :cond_9
    const/4 v14, 0x0

    goto :goto_5

    :cond_a
    const/4 v14, 0x1

    :goto_5
    xor-int/2addr v14, v1

    :cond_b
    iget-object v0, v9, Lcom/digdroid/alman/dig/o;->k:Lcom/digdroid/alman/dig/t1;

    invoke-virtual {v0, v14, v12, v4}, Lcom/digdroid/alman/dig/t1;->j(ZLjava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    const/16 v10, 0x3e8

    if-eqz v0, :cond_e

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_c

    goto/16 :goto_7

    :cond_c
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    new-instance v14, Lcom/digdroid/alman/dig/o$i;

    const/4 v15, 0x0

    new-instance v17, Lcom/digdroid/alman/dig/o$a;

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    move-wide/from16 v18, v2

    move v2, v8

    move v3, v5

    move-object v5, v12

    move-wide/from16 p1, v6

    move v12, v8

    move v8, v13

    invoke-direct/range {v0 .. v8}, Lcom/digdroid/alman/dig/o$a;-><init>(Lcom/digdroid/alman/dig/o;IZLjava/lang/String;Ljava/lang/String;JI)V

    new-instance v21, Lcom/digdroid/alman/dig/o$d;

    move-object/from16 v0, v21

    move-object/from16 v2, v20

    move-wide/from16 v3, v18

    move v5, v13

    move v6, v12

    move-wide/from16 v7, p1

    invoke-direct/range {v0 .. v8}, Lcom/digdroid/alman/dig/o$d;-><init>(Lcom/digdroid/alman/dig/o;Ljava/lang/String;JIIJ)V

    const/4 v6, 0x0

    move-object v0, v14

    move v2, v15

    move-object v3, v11

    move-object/from16 v4, v17

    move-object/from16 v5, v21

    invoke-direct/range {v0 .. v6}, Lcom/digdroid/alman/dig/o$i;-><init>(Lcom/digdroid/alman/dig/o;ILjava/lang/String;Lc/a/c/p$b;Lc/a/c/p$a;Ljava/util/HashMap;)V

    :try_start_0
    iget-object v0, v9, Lcom/digdroid/alman/dig/o;->e:Lc/a/c/o;

    invoke-virtual {v0, v14}, Lc/a/c/o;->a(Lc/a/c/n;)Lc/a/c/n;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :catch_0
    iget-object v0, v9, Lcom/digdroid/alman/dig/o;->f:Lcom/digdroid/alman/dig/q;

    invoke-virtual {v0, v13}, Lcom/digdroid/alman/dig/q;->a(I)V

    or-int/lit16 v0, v12, 0x4000

    move-wide/from16 v1, p1

    const/4 v3, 0x0

    invoke-virtual {v9, v1, v2, v0, v3}, Lcom/digdroid/alman/dig/o;->r(JIZ)V

    :goto_6
    iget-object v0, v9, Lcom/digdroid/alman/dig/o;->d:Lcom/digdroid/alman/dig/b3;

    const-string v1, "image_quality"

    const-string v2, "low"

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "high"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    const/16 v0, 0xbb8

    return v0

    :cond_d
    const-string v1, "medium"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v10

    :cond_e
    :goto_7
    iget-object v0, v9, Lcom/digdroid/alman/dig/o;->d:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->o()Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_8

    :cond_f
    const/16 v10, 0x32

    :goto_8
    return v10
.end method

.method h()Z
    .locals 2

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/o;->g:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/o;->d:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->a()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/o;->i()Z

    move-result v0

    return v0
.end method

.method i()Z
    .locals 7

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/o;->n:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/o;->n:Z

    iget-object v2, p0, Lcom/digdroid/alman/dig/o;->b:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SELECT _id,system,filename,gdbid,cover_status,favorite,gfcover,foldername FROM roms WHERE "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/digdroid/alman/dig/o;->f:Lcom/digdroid/alman/dig/q;

    invoke-virtual {v4}, Lcom/digdroid/alman/dig/q;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ORDER BY cover_requested DESC LIMIT 5"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_1
    const/4 v3, -0x1

    invoke-virtual {p0, v2, v3, v4}, Lcom/digdroid/alman/dig/o;->g(Landroid/database/Cursor;ILjava/lang/String;)I

    move-result v3

    if-lez v3, :cond_2

    int-to-long v5, v3

    :try_start_0
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_2
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-nez v3, :cond_1

    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/o;->n:Z

    iget-object v1, p0, Lcom/digdroid/alman/dig/o;->h:Landroid/content/Context;

    invoke-static {v1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    return v0

    :cond_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/o;->b:Landroid/database/sqlite/SQLiteDatabase;

    const-string v3, "SELECT r._id,r.system,r.filename,r.foldername,p.path FROM roms as r, rompaths as p WHERE r.has_images IS NULL AND r.present=1 AND p._id=r.pathid LIMIT 20"

    invoke-virtual {v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/o;->n:Z

    return v1

    :cond_4
    invoke-virtual {p0, v2}, Lcom/digdroid/alman/dig/o;->f(Landroid/database/Cursor;)I

    move-result v3

    if-lez v3, :cond_5

    int-to-long v3, v3

    :try_start_1
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    nop

    :cond_5
    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_1
.end method

.method public k()V
    .locals 17

    move-object/from16 v7, p0

    iget-object v0, v7, Lcom/digdroid/alman/dig/o;->h:Landroid/content/Context;

    invoke-static {v0}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v8, 0x1

    aget-object v0, v0, v8

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "/Server/Covers"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    iget-object v0, v7, Lcom/digdroid/alman/dig/o;->d:Lcom/digdroid/alman/dig/b3;

    const-string v1, "moby_next"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    const-string v10, ".png"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v13, "/"

    cmp-long v0, v2, v4

    if-gez v0, :cond_3

    iget-object v0, v7, Lcom/digdroid/alman/dig/o;->b:Landroid/database/sqlite/SQLiteDatabase;

    const-string v2, "SELECT system,filename,mdbid FROM roms WHERE mdbid>=0"

    invoke-virtual {v0, v2, v11}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    :goto_0
    invoke-interface {v0, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x2

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    const-string v6, "pc"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    const-string v6, "scumm"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    const-string v6, "android"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    const/16 v6, 0x2e

    invoke-virtual {v3, v6}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v6

    if-lez v6, :cond_0

    invoke-virtual {v3, v12, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    :cond_0
    new-instance v6, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v6, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v3, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v6, v3}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    :cond_1
    :goto_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    iget-object v0, v7, Lcom/digdroid/alman/dig/o;->d:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0, v1, v4, v5}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    goto :goto_2

    :cond_2
    const/4 v8, 0x1

    goto/16 :goto_0

    :cond_3
    :goto_2
    iget-object v0, v7, Lcom/digdroid/alman/dig/o;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v1, "SELECT rowid,url FROM moby WHERE url is not null"

    invoke-virtual {v0, v1, v11}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    invoke-interface {v8}, Landroid/database/Cursor;->getCount()I

    move-result v0

    int-to-long v0, v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "to get: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ZZX"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_4
    invoke-interface {v8, v12}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    iget-object v2, v7, Lcom/digdroid/alman/dig/o;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SELECT s.slug FROM systems as s,games as g WHERE g._id="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, " AND s._id=g.system"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v11}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    invoke-interface {v2, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    new-instance v2, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v2, v7, Lcom/digdroid/alman/dig/o;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "UPDATE moby SET url=null WHERE rowid="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const/4 v14, 0x1

    goto :goto_3

    :cond_5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "http://www.mobygames.com/images/covers/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v14, 0x1

    invoke-interface {v8, v14}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v15, Lcom/digdroid/alman/dig/o$i;

    const/4 v4, 0x0

    new-instance v5, Lcom/digdroid/alman/dig/o$e;

    invoke-direct {v5, v7, v3, v2}, Lcom/digdroid/alman/dig/o$e;-><init>(Lcom/digdroid/alman/dig/o;Ljava/lang/String;Ljava/io/File;)V

    new-instance v6, Lcom/digdroid/alman/dig/o$f;

    invoke-direct {v6, v7, v3, v0, v1}, Lcom/digdroid/alman/dig/o$f;-><init>(Lcom/digdroid/alman/dig/o;Ljava/lang/String;J)V

    const/16 v16, 0x0

    move-object v0, v15

    move-object/from16 v1, p0

    move v2, v4

    move-object v4, v5

    move-object v5, v6

    move-object/from16 v6, v16

    invoke-direct/range {v0 .. v6}, Lcom/digdroid/alman/dig/o$i;-><init>(Lcom/digdroid/alman/dig/o;ILjava/lang/String;Lc/a/c/p$b;Lc/a/c/p$a;Ljava/util/HashMap;)V

    iget-object v0, v7, Lcom/digdroid/alman/dig/o;->e:Lc/a/c/o;

    invoke-virtual {v0, v15}, Lc/a/c/o;->a(Lc/a/c/n;)Lc/a/c/n;

    const-wide/16 v0, 0x2710

    :try_start_1
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    nop

    :goto_3
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_6
    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    return-void
.end method

.method l()Z
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/o;->n:Z

    return v0
.end method

.method public m(Ljava/lang/String;)[Ljava/io/File;
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/o;->h:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method n(Ljava/io/File;)Z
    .locals 5

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/o;->g:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    array-length v0, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_4

    aget-object v3, p1, v2

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p0, v3}, Lcom/digdroid/alman/dig/o;->n(Ljava/io/File;)Z

    move-result v3

    if-nez v3, :cond_3

    return v1

    :cond_2
    invoke-virtual {p0, v3}, Lcom/digdroid/alman/dig/o;->o(Ljava/io/File;)Z

    move-result v3

    if-nez v3, :cond_3

    return v1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    return p1
.end method

.method o(Ljava/io/File;)Z
    .locals 6

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/o;->g:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0x2e

    invoke-virtual {v0, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v2

    const/4 v3, 0x1

    if-gtz v2, :cond_1

    return v3

    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, ".png"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    return v3

    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".png"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/o;->k:Lcom/digdroid/alman/dig/t1;

    monitor-enter v2

    :try_start_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v2

    return v3

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    monitor-exit v2

    return v1

    :goto_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method p()V
    .locals 4

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/o;->g:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/digdroid/alman/dig/o;->d:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/o;->m(Ljava/lang/String;)[Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/o;->d:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/b3;->Z()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    array-length v1, v0

    const/4 v3, 0x2

    if-lt v1, v3, :cond_2

    aget-object v1, v0, v2

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    aget-object v0, v0, v2

    goto :goto_1

    :cond_2
    :goto_0
    return-void

    :cond_3
    const/4 v1, 0x0

    aget-object v0, v0, v1

    :goto_1
    new-instance v1, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/Covers"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/o;->n(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/digdroid/alman/dig/o;->d:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0, v2}, Lcom/digdroid/alman/dig/b3;->R(Z)V

    :cond_4
    :goto_2
    return-void
.end method

.method declared-synchronized q([BJ)V
    .locals 16

    move-object/from16 v1, p0

    move-wide/from16 v2, p2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/String;

    const-string v4, "UTF-8"

    move-object/from16 v5, p1

    invoke-direct {v0, v5, v4}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v4, v1, Lcom/digdroid/alman/dig/o;->b:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SELECT _id,system,filename,gdbid,cover_status,favorite,gfcover,info,mdbid,publisher,developer,released FROM roms WHERE _id="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v5, 0x1

    :try_start_2
    invoke-interface {v4, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/digdroid/alman/dig/b2;

    invoke-direct {v8}, Lcom/digdroid/alman/dig/b2;-><init>()V

    invoke-virtual {v8, v7}, Lcom/digdroid/alman/dig/b2;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "/browse/games/"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "/"

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v8

    invoke-virtual {v8, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/regex/Matcher;->find()Z

    move-result v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v8, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_3
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    const-string v9, "android"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    const/4 v9, 0x0

    if-eqz v7, :cond_2

    const-string v7, "ignored"

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v8, v7, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const/4 v7, 0x1

    goto :goto_0

    :cond_2
    const/4 v7, 0x0

    :goto_0
    const/16 v10, 0x9

    invoke-interface {v4, v10}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    const/16 v11, 0xa

    invoke-interface {v4, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0xb

    invoke-interface {v4, v12}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v12

    if-eqz v10, :cond_3

    const-string v14, ""

    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    :cond_3
    const-string v10, "Published by.*?>(.+?)<\\/a>"

    invoke-static {v10}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/regex/Matcher;->find()Z

    move-result v14

    if-eqz v14, :cond_4

    const-string v7, "publisher"

    invoke-virtual {v10, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    const-string v14, "&nbsp;"

    const-string v15, " "

    invoke-virtual {v10, v14, v15}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v7, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v7, 0x1

    :cond_4
    if-eqz v11, :cond_5

    const-string v10, ""

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    :cond_5
    const-string v10, "Developed by.*?>(.+?)<\\/a>"

    invoke-static {v10}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v10

    invoke-virtual {v10, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v10

    invoke-virtual {v10}, Ljava/util/regex/Matcher;->find()Z

    move-result v11

    if-eqz v11, :cond_6

    const-string v7, "developer"

    invoke-virtual {v10, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "&nbsp;"

    const-string v14, " "

    invoke-virtual {v10, v11, v14}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v7, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v7, 0x1

    :cond_6
    const-wide/16 v10, 0x0

    cmp-long v14, v12, v10

    if-nez v14, :cond_7

    const-string v12, "Released.*?>(.+?)<\\/a>"

    invoke-static {v12}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v12

    invoke-virtual {v12, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v12

    invoke-virtual {v12}, Ljava/util/regex/Matcher;->find()Z

    move-result v13

    if-eqz v13, :cond_7

    const-string v7, "released"

    invoke-virtual {v12, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/digdroid/alman/dig/y3;->s(Ljava/lang/String;)J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v8, v7, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const/4 v7, 0x1

    :cond_7
    const-string v12, "<h2>Description<\\/h2>(.+?)<div"

    invoke-static {v12}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v12

    invoke-virtual {v12, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v12

    invoke-virtual {v12}, Ljava/util/regex/Matcher;->find()Z

    move-result v13

    if-eqz v13, :cond_8

    invoke-virtual {v12, v5}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v12

    const-string v13, "<br>"

    const-string v14, "\n"

    invoke-virtual {v12, v13, v14}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "<.*?>"

    const-string v14, ""

    invoke-virtual {v12, v13, v14}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "&quot;"

    const-string v14, "\""

    invoke-virtual {v12, v13, v14}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v13, "&amp;"

    const-string v14, "&"

    invoke-virtual {v12, v13, v14}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "[src=moby]"

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    goto :goto_1

    :cond_8
    move-object v12, v6

    :goto_1
    const/4 v13, 0x7

    invoke-interface {v4, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v13

    const/16 v14, 0x8

    invoke-interface {v4, v14}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v14

    if-eqz v13, :cond_9

    const-string v5, ""

    invoke-virtual {v13, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    :cond_9
    if-eqz v12, :cond_e

    cmp-long v5, v14, v10

    if-gez v5, :cond_a

    const-string v5, "info"

    invoke-virtual {v8, v5, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v7, 0x1

    goto :goto_2

    :cond_a
    iget-object v5, v1, Lcom/digdroid/alman/dig/o;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "SELECT info,info_comp FROM games WHERE _id="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5, v10, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v10

    if-eqz v10, :cond_d

    invoke-interface {v5, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x1

    invoke-interface {v4, v10}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v11

    if-eqz v9, :cond_b

    const-string v10, ""

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    :cond_b
    if-eqz v11, :cond_c

    array-length v9, v11

    const/16 v10, 0x14

    if-ge v9, v10, :cond_d

    :cond_c
    const-string v7, "info"

    invoke-virtual {v8, v7, v12}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v7, 0x1

    :cond_d
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_e
    :goto_2
    if-eqz v7, :cond_f

    iget-object v5, v1, Lcom/digdroid/alman/dig/o;->b:Landroid/database/sqlite/SQLiteDatabase;

    const-string v7, "roms"

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "_id="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v7, v8, v9, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    new-instance v5, Landroid/content/Intent;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, v1, Lcom/digdroid/alman/dig/o;->h:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "."

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "request_refresh"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v7, v1, Lcom/digdroid/alman/dig/o;->h:Landroid/content/Context;

    invoke-static {v7}, Lb/n/a/a;->b(Landroid/content/Context;)Lb/n/a/a;

    move-result-object v7

    invoke-virtual {v7, v5}, Lb/n/a/a;->d(Landroid/content/Intent;)Z

    :cond_f
    iget-object v5, v1, Lcom/digdroid/alman/dig/o;->b:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "SELECT rowid FROM gamegenres WHERE game="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, " LIMIT 1"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v5

    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v6

    if-nez v6, :cond_10

    const-string v6, "genre\\/sheet.*?>(.*?)<"

    invoke-static {v6}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    :goto_3
    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v7

    if-eqz v7, :cond_10

    iget-object v7, v1, Lcom/digdroid/alman/dig/o;->j:Lcom/digdroid/alman/dig/o0;

    const/4 v8, 0x1

    invoke-virtual {v6, v8}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v9

    const-string v8, "&nbsp;"

    const-string v10, " "

    invoke-virtual {v9, v8, v10}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Lcom/digdroid/alman/dig/o0;->f(Ljava/lang/String;)I

    move-result v7

    iget-object v8, v1, Lcom/digdroid/alman/dig/o;->j:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {v8, v2, v3, v7}, Lcom/digdroid/alman/dig/o0;->a(JI)V

    goto :goto_3

    :cond_10
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    const-string v2, "og\\:image.*content=\\\"(.*?cover.*?)\\\""

    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_11

    const/16 v2, 0x40

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v4, v2, v0}, Lcom/digdroid/alman/dig/o;->g(Landroid/database/Cursor;ILjava/lang/String;)I

    :cond_11
    invoke-interface {v4}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_0
    monitor-exit p0

    return-void
.end method

.method r(JIZ)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/o;->b:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UPDATE roms SET cover_status="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, " WHERE _id="

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    if-eqz p4, :cond_0

    iget-object p3, p0, Lcom/digdroid/alman/dig/o;->b:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "UPDATE roms SET cover_requested=cover_requested-40000000 WHERE _id="

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method s()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/o;->g:Z

    new-instance v0, Landroid/content/Intent;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/o;->h:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "save_error"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/o;->h:Landroid/content/Context;

    invoke-static {v1}, Lb/n/a/a;->b(Landroid/content/Context;)Lb/n/a/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lb/n/a/a;->d(Landroid/content/Intent;)Z

    return-void
.end method
