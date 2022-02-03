.class abstract Le/b/a/u/a$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/b/a/u/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x400
    name = "a"
.end annotation


# instance fields
.field final a:[S

.field final b:[[S

.field final c:[[S

.field final d:[S

.field final synthetic e:Le/b/a/u/a;


# direct methods
.method constructor <init>(Le/b/a/u/a;)V
    .locals 2

    const-class v0, S

    iput-object p1, p0, Le/b/a/u/a$a;->e:Le/b/a/u/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x2

    new-array v1, p1, [S

    iput-object v1, p0, Le/b/a/u/a$a;->a:[S

    new-array v1, p1, [I

    fill-array-data v1, :array_0

    invoke-static {v0, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[S

    iput-object v1, p0, Le/b/a/u/a$a;->b:[[S

    new-array p1, p1, [I

    fill-array-data p1, :array_1

    invoke-static {v0, p1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[S

    iput-object p1, p0, Le/b/a/u/a$a;->c:[[S

    const/16 p1, 0x100

    new-array p1, p1, [S

    iput-object p1, p0, Le/b/a/u/a$a;->d:[S

    return-void

    nop

    :array_0
    .array-data 4
        0x10
        0x8
    .end array-data

    :array_1
    .array-data 4
        0x10
        0x8
    .end array-data
.end method


# virtual methods
.method a()V
    .locals 4

    iget-object v0, p0, Le/b/a/u/a$a;->a:[S

    invoke-static {v0}, Le/b/a/v/a;->a([S)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Le/b/a/u/a$a;->b:[[S

    array-length v3, v2

    if-ge v1, v3, :cond_0

    aget-object v2, v2, v1

    invoke-static {v2}, Le/b/a/v/a;->a([S)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    iget-object v1, p0, Le/b/a/u/a$a;->b:[[S

    array-length v1, v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Le/b/a/u/a$a;->c:[[S

    aget-object v1, v1, v0

    invoke-static {v1}, Le/b/a/v/a;->a([S)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Le/b/a/u/a$a;->d:[S

    invoke-static {v0}, Le/b/a/v/a;->a([S)V

    return-void
.end method
