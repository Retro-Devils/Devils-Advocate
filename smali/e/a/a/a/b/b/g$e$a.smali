.class Le/a/a/a/b/b/g$e$a;
.super Ljava/io/InputStream;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le/a/a/a/b/b/g$e;->b(Ljava/lang/String;Ljava/io/InputStream;JLe/a/a/a/b/b/e;[B)Ljava/io/InputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/util/zip/InflaterInputStream;

.field final synthetic c:Ljava/util/zip/Inflater;

.field final synthetic d:Le/a/a/a/b/b/g$e;


# direct methods
.method constructor <init>(Le/a/a/a/b/b/g$e;Ljava/util/zip/InflaterInputStream;Ljava/util/zip/Inflater;)V
    .locals 0

    iput-object p1, p0, Le/a/a/a/b/b/g$e$a;->d:Le/a/a/a/b/b/g$e;

    iput-object p2, p0, Le/a/a/a/b/b/g$e$a;->b:Ljava/util/zip/InflaterInputStream;

    iput-object p3, p0, Le/a/a/a/b/b/g$e$a;->c:Ljava/util/zip/Inflater;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Le/a/a/a/b/b/g$e$a;->b:Ljava/util/zip/InflaterInputStream;

    invoke-virtual {v0}, Ljava/util/zip/InflaterInputStream;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Le/a/a/a/b/b/g$e$a;->c:Ljava/util/zip/Inflater;

    invoke-virtual {v0}, Ljava/util/zip/Inflater;->end()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Le/a/a/a/b/b/g$e$a;->c:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->end()V

    throw v0
.end method

.method public read()I
    .locals 1

    iget-object v0, p0, Le/a/a/a/b/b/g$e$a;->b:Ljava/util/zip/InflaterInputStream;

    invoke-virtual {v0}, Ljava/util/zip/InflaterInputStream;->read()I

    move-result v0

    return v0
.end method

.method public read([B)I
    .locals 1

    iget-object v0, p0, Le/a/a/a/b/b/g$e$a;->b:Ljava/util/zip/InflaterInputStream;

    invoke-virtual {v0, p1}, Ljava/util/zip/InflaterInputStream;->read([B)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .locals 1

    iget-object v0, p0, Le/a/a/a/b/b/g$e$a;->b:Ljava/util/zip/InflaterInputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/util/zip/InflaterInputStream;->read([BII)I

    move-result p1

    return p1
.end method
