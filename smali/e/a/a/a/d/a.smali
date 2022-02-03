.class public Le/a/a/a/d/a;
.super Ljava/io/InputStream;
.source ""


# instance fields
.field private final b:Ljava/io/InputStream;

.field private c:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;J)V
    .locals 0

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    iput-object p1, p0, Le/a/a/a/d/a;->b:Ljava/io/InputStream;

    iput-wide p2, p0, Le/a/a/a/d/a;->c:J

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public read()I
    .locals 5

    iget-wide v0, p0, Le/a/a/a/d/a;->c:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    iput-wide v0, p0, Le/a/a/a/d/a;->c:J

    iget-object v0, p0, Le/a/a/a/d/a;->b:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public read([BII)I
    .locals 5

    iget-wide v0, p0, Le/a/a/a/d/a;->c:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    int-to-long v2, p3

    cmp-long v4, v2, v0

    if-lez v4, :cond_1

    long-to-int p3, v0

    :cond_1
    iget-object v0, p0, Le/a/a/a/d/a;->b:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-ltz p1, :cond_2

    iget-wide p2, p0, Le/a/a/a/d/a;->c:J

    int-to-long v0, p1

    sub-long/2addr p2, v0

    iput-wide p2, p0, Le/a/a/a/d/a;->c:J

    :cond_2
    return p1
.end method
