.class Lcom/digdroid/alman/dig/m2;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static a:Lc/a/a/o;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)Lc/a/a/o;
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/m2;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/digdroid/alman/dig/m2;->a:Lc/a/a/o;

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lc/a/a/w/o;->a(Landroid/content/Context;)Lc/a/a/o;

    move-result-object p0

    sput-object p0, Lcom/digdroid/alman/dig/m2;->a:Lc/a/a/o;

    :cond_0
    sget-object p0, Lcom/digdroid/alman/dig/m2;->a:Lc/a/a/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method
