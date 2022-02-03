.class Le/b/a/u/b$b;
.super Le/b/a/u/a$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/b/a/u/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic f:Le/b/a/u/b;


# direct methods
.method private constructor <init>(Le/b/a/u/b;)V
    .locals 0

    iput-object p1, p0, Le/b/a/u/b$b;->f:Le/b/a/u/b;

    invoke-direct {p0, p1}, Le/b/a/u/a$a;-><init>(Le/b/a/u/a;)V

    return-void
.end method

.method synthetic constructor <init>(Le/b/a/u/b;Le/b/a/u/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Le/b/a/u/b$b;-><init>(Le/b/a/u/b;)V

    return-void
.end method


# virtual methods
.method b(I)I
    .locals 3

    iget-object v0, p0, Le/b/a/u/b$b;->f:Le/b/a/u/b;

    invoke-static {v0}, Le/b/a/u/b;->d(Le/b/a/u/b;)Le/b/a/v/b;

    move-result-object v0

    iget-object v1, p0, Le/b/a/u/a$a;->a:[S

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Le/b/a/v/b;->b([SI)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Le/b/a/u/b$b;->f:Le/b/a/u/b;

    invoke-static {v0}, Le/b/a/u/b;->d(Le/b/a/u/b;)Le/b/a/v/b;

    move-result-object v0

    iget-object v1, p0, Le/b/a/u/a$a;->b:[[S

    aget-object p1, v1, p1

    invoke-virtual {v0, p1}, Le/b/a/v/b;->c([S)I

    move-result p1

    add-int/lit8 p1, p1, 0x2

    return p1

    :cond_0
    iget-object v0, p0, Le/b/a/u/b$b;->f:Le/b/a/u/b;

    invoke-static {v0}, Le/b/a/u/b;->d(Le/b/a/u/b;)Le/b/a/v/b;

    move-result-object v0

    iget-object v1, p0, Le/b/a/u/a$a;->a:[S

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Le/b/a/v/b;->b([SI)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Le/b/a/u/b$b;->f:Le/b/a/u/b;

    invoke-static {v0}, Le/b/a/u/b;->d(Le/b/a/u/b;)Le/b/a/v/b;

    move-result-object v0

    iget-object v1, p0, Le/b/a/u/a$a;->c:[[S

    aget-object p1, v1, p1

    invoke-virtual {v0, p1}, Le/b/a/v/b;->c([S)I

    move-result p1

    add-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x8

    return p1

    :cond_1
    iget-object p1, p0, Le/b/a/u/b$b;->f:Le/b/a/u/b;

    invoke-static {p1}, Le/b/a/u/b;->d(Le/b/a/u/b;)Le/b/a/v/b;

    move-result-object p1

    iget-object v0, p0, Le/b/a/u/a$a;->d:[S

    invoke-virtual {p1, v0}, Le/b/a/v/b;->c([S)I

    move-result p1

    add-int/lit8 p1, p1, 0x2

    add-int/lit8 p1, p1, 0x8

    add-int/lit8 p1, p1, 0x8

    return p1
.end method
