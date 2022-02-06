.class public Lcom/digdroid/alman/dig/z1;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static a:Landroid/database/sqlite/SQLiteDatabase;

.field private static b:Lcom/digdroid/alman/dig/y1;

.field private static c:Lcom/digdroid/alman/dig/z1;


# instance fields
.field d:Landroid/content/Context;

.field e:Lcom/digdroid/alman/dig/b3;

.field f:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/z1;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/z1;->e:Lcom/digdroid/alman/dig/b3;

    const-string v0, "games.db"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const-string v1, "masterbase.db"

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/z1;->f:Ljava/lang/String;

    return-void
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Lcom/digdroid/alman/dig/z1;
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/z1;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/digdroid/alman/dig/z1;->c:Lcom/digdroid/alman/dig/z1;

    if-nez v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/z1;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/z1;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/digdroid/alman/dig/z1;->c:Lcom/digdroid/alman/dig/z1;

    :cond_0
    sget-object p0, Lcom/digdroid/alman/dig/z1;->c:Lcom/digdroid/alman/dig/z1;
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
.method public a()Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/z1;->b:Lcom/digdroid/alman/dig/y1;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    return-object v0
.end method

.method public declared-synchronized c()Z
    .locals 6

    monitor-enter p0

    :try_start_0
    sget-object v0, Lcom/digdroid/alman/dig/z1;->a:Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/digdroid/alman/dig/z1;->f:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/z1;->e:Lcom/digdroid/alman/dig/b3;

    const-string v3, "data_version"

    invoke-virtual {v0, v3, v2}, Lcom/digdroid/alman/dig/b3;->l(Ljava/lang/String;I)I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/16 v3, 0x1c9

    if-ge v0, v3, :cond_2

    :cond_1
    :try_start_2
    new-instance v0, Ljava/io/File;

    iget-object v3, p0, Lcom/digdroid/alman/dig/z1;->f:Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    new-instance v0, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/digdroid/alman/dig/z1;->f:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-journal"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    new-instance v0, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/digdroid/alman/dig/z1;->f:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-shm"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    new-instance v0, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/digdroid/alman/dig/z1;->f:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "-wal"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    new-instance v0, Lcom/digdroid/alman/dig/v;

    iget-object v3, p0, Lcom/digdroid/alman/dig/z1;->d:Landroid/content/Context;

    const-string v4, "masterbase.7z"

    iget-object v5, p0, Lcom/digdroid/alman/dig/z1;->f:Ljava/lang/String;

    invoke-direct {v0, v3, v4, v5}, Lcom/digdroid/alman/dig/v;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/v;->a()Z

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v0, :cond_2

    monitor-exit p0

    return v2

    :cond_2
    :try_start_4
    iget-object v0, p0, Lcom/digdroid/alman/dig/z1;->d:Landroid/content/Context;

    const-string v2, "masterbase.db"

    invoke-static {v0, v2}, Lcom/digdroid/alman/dig/y1;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/y1;

    move-result-object v0

    sput-object v0, Lcom/digdroid/alman/dig/z1;->b:Lcom/digdroid/alman/dig/y1;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    sput-object v0, Lcom/digdroid/alman/dig/z1;->a:Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->acquireReference()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
