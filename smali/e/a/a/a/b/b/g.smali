.class Le/a/a/a/b/b/g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le/a/a/a/b/b/g$f;,
        Le/a/a/a/b/b/g$c;,
        Le/a/a/a/b/b/g$e;,
        Le/a/a/a/b/b/g$b;,
        Le/a/a/a/b/b/g$g;,
        Le/a/a/a/b/b/g$d;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Le/a/a/a/b/b/m;",
            "Le/a/a/a/b/b/f;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le/a/a/a/b/b/g$a;

    invoke-direct {v0}, Le/a/a/a/b/b/g$a;-><init>()V

    sput-object v0, Le/a/a/a/b/b/g;->a:Ljava/util/Map;

    return-void
.end method

.method static a(Ljava/lang/String;Ljava/io/InputStream;JLe/a/a/a/b/b/e;[B)Ljava/io/InputStream;
    .locals 8

    iget-object v0, p4, Le/a/a/a/b/b/e;->a:[B

    invoke-static {v0}, Le/a/a/a/b/b/m;->a([B)Le/a/a/a/b/b/m;

    move-result-object v0

    invoke-static {v0}, Le/a/a/a/b/b/g;->b(Le/a/a/a/b/b/m;)Le/a/a/a/b/b/f;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Le/a/a/a/b/b/f;->b(Ljava/lang/String;Ljava/io/InputStream;JLe/a/a/a/b/b/e;[B)Ljava/io/InputStream;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Unsupported compression method "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p4, Le/a/a/a/b/b/e;->a:[B

    invoke-static {p3}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " used in "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method static b(Le/a/a/a/b/b/m;)Le/a/a/a/b/b/f;
    .locals 1

    sget-object v0, Le/a/a/a/b/b/g;->a:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le/a/a/a/b/b/f;

    return-object p0
.end method
