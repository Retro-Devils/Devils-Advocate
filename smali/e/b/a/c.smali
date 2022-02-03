.class public Le/b/a/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Le/b/a/c;

.field private static volatile b:Le/b/a/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/b/a/c;

    invoke-direct {v0}, Le/b/a/c;-><init>()V

    sput-object v0, Le/b/a/c;->a:Le/b/a/c;

    sput-object v0, Le/b/a/c;->b:Le/b/a/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Le/b/a/c;
    .locals 1

    sget-object v0, Le/b/a/c;->b:Le/b/a/c;

    return-object v0
.end method


# virtual methods
.method public a(IZ)[B
    .locals 0

    :try_start_0
    new-array p1, p1, [B
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1
.end method

.method public c([B)V
    .locals 0

    return-void
.end method
