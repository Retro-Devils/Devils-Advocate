.class Lcom/digdroid/alman/dig/y1;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source ""


# static fields
.field private static b:Lcom/digdroid/alman/dig/y1;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, p2, v0, v1}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/y1;
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/y1;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/digdroid/alman/dig/y1;->b:Lcom/digdroid/alman/dig/y1;

    if-nez v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/y1;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0, p1}, Lcom/digdroid/alman/dig/y1;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sput-object v1, Lcom/digdroid/alman/dig/y1;->b:Lcom/digdroid/alman/dig/y1;

    :cond_0
    sget-object p0, Lcom/digdroid/alman/dig/y1;->b:Lcom/digdroid/alman/dig/y1;
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
.method public onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    return-void
.end method

.method public onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    return-void
.end method
