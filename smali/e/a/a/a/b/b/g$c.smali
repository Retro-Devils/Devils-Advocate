.class Le/a/a/a/b/b/g$c;
.super Le/a/a/a/b/b/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le/a/a/a/b/b/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Class;

    const/4 v1, 0x0

    const-class v2, Ljava/lang/Number;

    aput-object v2, v0, v1

    invoke-direct {p0, v0}, Le/a/a/a/b/b/f;-><init>([Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method b(Ljava/lang/String;Ljava/io/InputStream;JLe/a/a/a/b/b/e;[B)Ljava/io/InputStream;
    .locals 0

    new-instance p1, Le/a/a/a/c/b/a;

    invoke-direct {p1, p2}, Le/a/a/a/c/b/a;-><init>(Ljava/io/InputStream;)V

    return-object p1
.end method
