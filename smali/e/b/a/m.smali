.class public Le/b/a/m;
.super Le/b/a/d;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Le/b/a/d;-><init>(I)V

    return-void
.end method


# virtual methods
.method public b(Ljava/io/InputStream;Le/b/a/c;)Ljava/io/InputStream;
    .locals 3

    new-instance p2, Le/b/a/o;

    new-instance v0, Le/b/a/w/d;

    iget v1, p0, Le/b/a/d;->c:I

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Le/b/a/w/d;-><init>(ZI)V

    invoke-direct {p2, p1, v0}, Le/b/a/o;-><init>(Ljava/io/InputStream;Le/b/a/w/f;)V

    return-object p2
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Le/b/a/d;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
