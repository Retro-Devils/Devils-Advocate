.class public Lc/b/a/a/b/l/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static a:Lc/b/a/a/b/l/b;


# instance fields
.field private b:Lc/b/a/a/b/l/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc/b/a/a/b/l/b;

    invoke-direct {v0}, Lc/b/a/a/b/l/b;-><init>()V

    sput-object v0, Lc/b/a/a/b/l/b;->a:Lc/b/a/a/b/l/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lc/b/a/a/b/l/b;->b:Lc/b/a/a/b/l/a;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lc/b/a/a/b/l/a;
    .locals 1

    sget-object v0, Lc/b/a/a/b/l/b;->a:Lc/b/a/a/b/l/b;

    invoke-direct {v0, p0}, Lc/b/a/a/b/l/b;->b(Landroid/content/Context;)Lc/b/a/a/b/l/a;

    move-result-object p0

    return-object p0
.end method

.method private final declared-synchronized b(Landroid/content/Context;)Lc/b/a/a/b/l/a;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lc/b/a/a/b/l/b;->b:Lc/b/a/a/b/l/a;

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :goto_0
    new-instance v0, Lc/b/a/a/b/l/a;

    invoke-direct {v0, p1}, Lc/b/a/a/b/l/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lc/b/a/a/b/l/b;->b:Lc/b/a/a/b/l/a;

    :cond_1
    iget-object p1, p0, Lc/b/a/a/b/l/b;->b:Lc/b/a/a/b/l/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
