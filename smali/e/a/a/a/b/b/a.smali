.class Le/a/a/a/b/b/a;
.super Le/a/a/a/b/b/f;
.source ""


# direct methods
.method constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    invoke-direct {p0, v0}, Le/a/a/a/b/b/f;-><init>([Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method b(Ljava/lang/String;Ljava/io/InputStream;JLe/a/a/a/b/b/e;[B)Ljava/io/InputStream;
    .locals 6

    new-instance p3, Le/a/a/a/b/b/a$a;

    move-object v0, p3

    move-object v1, p0

    move-object v2, p5

    move-object v3, p1

    move-object v4, p6

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Le/a/a/a/b/b/a$a;-><init>(Le/a/a/a/b/b/a;Le/a/a/a/b/b/e;Ljava/lang/String;[BLjava/io/InputStream;)V

    return-object p3
.end method
