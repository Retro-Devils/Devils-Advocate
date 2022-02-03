.class public Le/a/a/a/b/b/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field static final b:[B


# instance fields
.field private final c:Ljava/lang/String;

.field private d:Ljava/io/RandomAccessFile;

.field private final e:Le/a/a/a/b/b/b;

.field private f:I

.field private g:I

.field private h:Ljava/io/InputStream;

.field private i:[B

.field private final j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x6

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Le/a/a/a/b/b/l;->b:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x37t
        0x7at
        -0x44t
        -0x51t
        0x27t
        0x1ct
    .end array-data
.end method

.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Le/a/a/a/b/b/l;-><init>(Ljava/io/File;[B)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;[B)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Le/a/a/a/b/b/l;->f:I

    iput v0, p0, Le/a/a/a/b/b/l;->g:I

    const/4 v0, 0x0

    iput-object v0, p0, Le/a/a/a/b/b/l;->h:Ljava/io/InputStream;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Le/a/a/a/b/b/l;->j:Ljava/util/ArrayList;

    new-instance v1, Ljava/io/RandomAccessFile;

    const-string v2, "r"

    invoke-direct {v1, p1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    iput-object v1, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Le/a/a/a/b/b/l;->c:Ljava/lang/String;

    :try_start_0
    invoke-direct {p0, p2}, Le/a/a/a/b/b/l;->o([B)Le/a/a/a/b/b/b;

    move-result-object p1

    iput-object p1, p0, Le/a/a/a/b/b/l;->e:Le/a/a/a/b/b/b;

    if-eqz p2, :cond_0

    array-length p1, p2

    new-array p1, p1, [B

    iput-object p1, p0, Le/a/a/a/b/b/l;->i:[B

    array-length v0, p2

    const/4 v1, 0x0

    invoke-static {p2, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    iput-object v0, p0, Le/a/a/a/b/b/l;->i:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    invoke-virtual {p2}, Ljava/io/RandomAccessFile;->close()V

    throw p1
.end method

.method private a(Le/a/a/a/b/b/i;JILe/a/a/a/b/b/k;)Ljava/io/InputStream;
    .locals 7

    iget-object v0, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    invoke-virtual {v0, p2, p3}, Ljava/io/RandomAccessFile;->seek(J)V

    new-instance p2, Ljava/io/BufferedInputStream;

    new-instance p3, Le/a/a/a/b/b/d;

    iget-object v0, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    iget-object v1, p0, Le/a/a/a/b/b/l;->e:Le/a/a/a/b/b/b;

    iget-object v1, v1, Le/a/a/a/b/b/b;->b:[J

    aget-wide v2, v1, p4

    invoke-direct {p3, v0, v2, v3}, Le/a/a/a/b/b/d;-><init>(Ljava/io/RandomAccessFile;J)V

    invoke-direct {p2, p3}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance p3, Ljava/util/LinkedList;

    invoke-direct {p3}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {p1}, Le/a/a/a/b/b/i;->c()Ljava/lang/Iterable;

    move-result-object p4

    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p4

    move-object v1, p2

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Le/a/a/a/b/b/e;

    iget-wide v2, p2, Le/a/a/a/b/b/e;->b:J

    const-wide/16 v4, 0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-wide v2, p2, Le/a/a/a/b/b/e;->c:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p2, Le/a/a/a/b/b/e;->a:[B

    invoke-static {v0}, Le/a/a/a/b/b/m;->a([B)Le/a/a/a/b/b/m;

    move-result-object v6

    iget-object v0, p0, Le/a/a/a/b/b/l;->c:Ljava/lang/String;

    invoke-virtual {p1, p2}, Le/a/a/a/b/b/i;->e(Le/a/a/a/b/b/e;)J

    move-result-wide v2

    iget-object v5, p0, Le/a/a/a/b/b/l;->i:[B

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Le/a/a/a/b/b/g;->a(Ljava/lang/String;Ljava/io/InputStream;JLe/a/a/a/b/b/e;[B)Ljava/io/InputStream;

    move-result-object v1

    new-instance v0, Le/a/a/a/b/b/n;

    invoke-static {v6}, Le/a/a/a/b/b/g;->b(Le/a/a/a/b/b/m;)Le/a/a/a/b/b/f;

    move-result-object v2

    invoke-virtual {v2, p2, v1}, Le/a/a/a/b/b/f;->c(Le/a/a/a/b/b/e;Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object p2

    invoke-direct {v0, v6, p2}, Le/a/a/a/b/b/n;-><init>(Le/a/a/a/b/b/m;Ljava/lang/Object;)V

    invoke-virtual {p3, v0}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Multi input/output stream coders are not yet supported"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p5, p3}, Le/a/a/a/b/b/k;->m(Ljava/lang/Iterable;)V

    iget-boolean p2, p1, Le/a/a/a/b/b/i;->g:Z

    if-eqz p2, :cond_2

    new-instance p2, Le/a/a/a/d/b;

    invoke-virtual {p1}, Le/a/a/a/b/b/i;->d()J

    move-result-wide v2

    iget-wide v4, p1, Le/a/a/a/b/b/i;->h:J

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Le/a/a/a/d/b;-><init>(Ljava/io/InputStream;JJ)V

    return-object p2

    :cond_2
    return-object v1
.end method

.method private b()V
    .locals 10

    iget-object v0, p0, Le/a/a/a/b/b/l;->e:Le/a/a/a/b/b/b;

    iget-object v1, v0, Le/a/a/a/b/b/b;->h:Le/a/a/a/b/b/p;

    iget-object v1, v1, Le/a/a/a/b/b/p;->d:[I

    iget v2, p0, Le/a/a/a/b/b/l;->f:I

    aget v1, v1, v2

    if-gez v1, :cond_0

    iget-object v0, p0, Le/a/a/a/b/b/l;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void

    :cond_0
    iget-object v0, v0, Le/a/a/a/b/b/b;->g:[Le/a/a/a/b/b/k;

    aget-object v9, v0, v2

    iget v3, p0, Le/a/a/a/b/b/l;->g:I

    if-ne v3, v1, :cond_1

    add-int/lit8 v2, v2, -0x1

    aget-object v0, v0, v2

    invoke-virtual {v0}, Le/a/a/a/b/b/k;->a()Ljava/lang/Iterable;

    move-result-object v0

    invoke-virtual {v9, v0}, Le/a/a/a/b/b/k;->m(Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_1
    iput v1, p0, Le/a/a/a/b/b/l;->g:I

    iget-object v0, p0, Le/a/a/a/b/b/l;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Le/a/a/a/b/b/l;->h:Ljava/io/InputStream;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    const/4 v0, 0x0

    iput-object v0, p0, Le/a/a/a/b/b/l;->h:Ljava/io/InputStream;

    :cond_2
    iget-object v0, p0, Le/a/a/a/b/b/l;->e:Le/a/a/a/b/b/b;

    iget-object v2, v0, Le/a/a/a/b/b/b;->e:[Le/a/a/a/b/b/i;

    aget-object v4, v2, v1

    iget-object v2, v0, Le/a/a/a/b/b/b;->h:Le/a/a/a/b/b/p;

    iget-object v3, v2, Le/a/a/a/b/b/p;->a:[I

    aget v7, v3, v1

    const-wide/16 v5, 0x20

    iget-wide v0, v0, Le/a/a/a/b/b/b;->a:J

    add-long/2addr v0, v5

    iget-object v2, v2, Le/a/a/a/b/b/p;->b:[J

    aget-wide v5, v2, v7

    add-long/2addr v5, v0

    move-object v3, p0

    move-object v8, v9

    invoke-direct/range {v3 .. v8}, Le/a/a/a/b/b/l;->a(Le/a/a/a/b/b/i;JILe/a/a/a/b/b/k;)Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, p0, Le/a/a/a/b/b/l;->h:Ljava/io/InputStream;

    :goto_0
    new-instance v2, Le/a/a/a/d/a;

    iget-object v0, p0, Le/a/a/a/b/b/l;->h:Ljava/io/InputStream;

    invoke-virtual {v9}, Le/a/a/a/b/b/k;->b()J

    move-result-wide v3

    invoke-direct {v2, v0, v3, v4}, Le/a/a/a/d/a;-><init>(Ljava/io/InputStream;J)V

    invoke-virtual {v9}, Le/a/a/a/b/b/k;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Le/a/a/a/d/b;

    invoke-virtual {v9}, Le/a/a/a/b/b/k;->b()J

    move-result-wide v3

    invoke-virtual {v9}, Le/a/a/a/b/b/k;->c()J

    move-result-wide v5

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Le/a/a/a/d/b;-><init>(Ljava/io/InputStream;JJ)V

    move-object v2, v0

    :cond_3
    iget-object v0, p0, Le/a/a/a/b/b/l;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private c(Le/a/a/a/b/b/b;)V
    .locals 10

    new-instance v0, Le/a/a/a/b/b/p;

    invoke-direct {v0}, Le/a/a/a/b/b/p;-><init>()V

    iget-object v1, p1, Le/a/a/a/b/b/b;->e:[Le/a/a/a/b/b/i;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    array-length v1, v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-array v3, v1, [I

    iput-object v3, v0, Le/a/a/a/b/b/p;->a:[I

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v3, v1, :cond_1

    iget-object v5, v0, Le/a/a/a/b/b/p;->a:[I

    aput v4, v5, v3

    iget-object v5, p1, Le/a/a/a/b/b/b;->e:[Le/a/a/a/b/b/i;

    aget-object v5, v5, v3

    iget-object v5, v5, Le/a/a/a/b/b/i;->e:[J

    array-length v5, v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const-wide/16 v3, 0x0

    iget-object v5, p1, Le/a/a/a/b/b/b;->b:[J

    if-eqz v5, :cond_2

    array-length v5, v5

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    new-array v6, v5, [J

    iput-object v6, v0, Le/a/a/a/b/b/p;->b:[J

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v5, :cond_3

    iget-object v7, v0, Le/a/a/a/b/b/p;->b:[J

    aput-wide v3, v7, v6

    iget-object v7, p1, Le/a/a/a/b/b/b;->b:[J

    aget-wide v8, v7, v6

    add-long/2addr v3, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_3
    new-array v1, v1, [I

    iput-object v1, v0, Le/a/a/a/b/b/p;->c:[I

    iget-object v1, p1, Le/a/a/a/b/b/b;->g:[Le/a/a/a/b/b/k;

    array-length v1, v1

    new-array v1, v1, [I

    iput-object v1, v0, Le/a/a/a/b/b/p;->d:[I

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_4
    iget-object v5, p1, Le/a/a/a/b/b/b;->g:[Le/a/a/a/b/b/k;

    array-length v6, v5

    if-ge v1, v6, :cond_b

    aget-object v5, v5, v1

    invoke-virtual {v5}, Le/a/a/a/b/b/k;->j()Z

    move-result v5

    if-nez v5, :cond_4

    if-nez v3, :cond_4

    iget-object v5, v0, Le/a/a/a/b/b/p;->d:[I

    const/4 v6, -0x1

    aput v6, v5, v1

    goto :goto_8

    :cond_4
    if-nez v3, :cond_8

    :goto_5
    iget-object v5, p1, Le/a/a/a/b/b/b;->e:[Le/a/a/a/b/b/i;

    array-length v6, v5

    if-ge v4, v6, :cond_6

    iget-object v6, v0, Le/a/a/a/b/b/p;->c:[I

    aput v1, v6, v4

    aget-object v6, v5, v4

    iget v6, v6, Le/a/a/a/b/b/i;->i:I

    if-lez v6, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_6
    :goto_6
    array-length v5, v5

    if-ge v4, v5, :cond_7

    goto :goto_7

    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Too few folders in archive"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_7
    iget-object v5, v0, Le/a/a/a/b/b/p;->d:[I

    aput v4, v5, v1

    iget-object v5, p1, Le/a/a/a/b/b/b;->g:[Le/a/a/a/b/b/k;

    aget-object v5, v5, v1

    invoke-virtual {v5}, Le/a/a/a/b/b/k;->j()Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_8

    :cond_9
    add-int/lit8 v3, v3, 0x1

    iget-object v5, p1, Le/a/a/a/b/b/b;->e:[Le/a/a/a/b/b/i;

    aget-object v5, v5, v4

    iget v5, v5, Le/a/a/a/b/b/i;->i:I

    if-lt v3, v5, :cond_a

    add-int/lit8 v4, v4, 0x1

    const/4 v3, 0x0

    :cond_a
    :goto_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_b
    iput-object v0, p1, Le/a/a/a/b/b/b;->h:Le/a/a/a/b/b/p;

    return-void
.end method

.method private d()Ljava/io/InputStream;
    .locals 6

    iget-object v0, p0, Le/a/a/a/b/b/l;->e:Le/a/a/a/b/b/b;

    iget-object v0, v0, Le/a/a/a/b/b/b;->g:[Le/a/a/a/b/b/k;

    iget v1, p0, Le/a/a/a/b/b/l;->f:I

    aget-object v0, v0, v1

    invoke-virtual {v0}, Le/a/a/a/b/b/k;->b()J

    move-result-wide v0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    new-instance v0, Ljava/io/ByteArrayInputStream;

    new-array v1, v2, [B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0

    :cond_0
    iget-object v0, p0, Le/a/a/a/b/b/l;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    :goto_0
    iget-object v0, p0, Le/a/a/a/b/b/l;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    iget-object v0, p0, Le/a/a/a/b/b/l;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    const-wide v3, 0x7fffffffffffffffL

    invoke-static {v0, v3, v4}, Le/a/a/a/d/d;->b(Ljava/io/InputStream;J)J

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Le/a/a/a/b/b/l;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/InputStream;

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No current 7z entry (call getNextEntry() first)."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method private h(Ljava/io/DataInput;I)Ljava/util/BitSet;
    .locals 2

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v0

    if-eqz v0, :cond_0

    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1, p2}, Ljava/util/BitSet;-><init>(I)V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_1

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Ljava/util/BitSet;->set(IZ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1, p2}, Le/a/a/a/b/b/l;->j(Ljava/io/DataInput;I)Ljava/util/BitSet;

    move-result-object p1

    :cond_1
    return-object p1
.end method

.method private i(Ljava/io/DataInput;)V
    .locals 2

    :goto_0
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v0

    long-to-int v1, v0

    new-array v0, v1, [B

    invoke-interface {p1, v0}, Ljava/io/DataInput;->readFully([B)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private j(Ljava/io/DataInput;I)Ljava/util/BitSet;
    .locals 6

    new-instance v0, Ljava/util/BitSet;

    invoke-direct {v0, p2}, Ljava/util/BitSet;-><init>(I)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v2, p2, :cond_2

    if-nez v3, :cond_0

    const/16 v3, 0x80

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v4

    :cond_0
    and-int v5, v4, v3

    if-eqz v5, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v0, v2, v5}, Ljava/util/BitSet;->set(IZ)V

    ushr-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private k(Ljava/io/DataInputStream;Le/a/a/a/b/b/b;[B)Ljava/io/DataInputStream;
    .locals 8

    invoke-direct {p0, p1, p2}, Le/a/a/a/b/b/l;->r(Ljava/io/DataInput;Le/a/a/a/b/b/b;)V

    iget-object p1, p2, Le/a/a/a/b/b/b;->e:[Le/a/a/a/b/b/i;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iget-wide v1, p2, Le/a/a/a/b/b/b;->a:J

    const-wide/16 v3, 0x20

    add-long/2addr v1, v3

    const-wide/16 v3, 0x0

    add-long/2addr v1, v3

    iget-object v3, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    invoke-virtual {v3, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    new-instance v1, Le/a/a/a/b/b/d;

    iget-object v2, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    iget-object p2, p2, Le/a/a/a/b/b/b;->b:[J

    aget-wide v3, p2, v0

    invoke-direct {v1, v2, v3, v4}, Le/a/a/a/b/b/d;-><init>(Ljava/io/RandomAccessFile;J)V

    invoke-virtual {p1}, Le/a/a/a/b/b/i;->c()Ljava/lang/Iterable;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v3, v1

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Le/a/a/a/b/b/e;

    iget-wide v0, v6, Le/a/a/a/b/b/e;->b:J

    const-wide/16 v4, 0x1

    cmp-long v2, v0, v4

    if-nez v2, :cond_0

    iget-wide v0, v6, Le/a/a/a/b/b/e;->c:J

    cmp-long v2, v0, v4

    if-nez v2, :cond_0

    iget-object v2, p0, Le/a/a/a/b/b/l;->c:Ljava/lang/String;

    invoke-virtual {p1, v6}, Le/a/a/a/b/b/i;->e(Le/a/a/a/b/b/e;)J

    move-result-wide v4

    move-object v7, p3

    invoke-static/range {v2 .. v7}, Le/a/a/a/b/b/g;->a(Ljava/lang/String;Ljava/io/InputStream;JLe/a/a/a/b/b/e;[B)Ljava/io/InputStream;

    move-result-object v3

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Multi input/output stream coders are not yet supported"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean p2, p1, Le/a/a/a/b/b/i;->g:Z

    if-eqz p2, :cond_2

    new-instance p2, Le/a/a/a/d/b;

    invoke-virtual {p1}, Le/a/a/a/b/b/i;->d()J

    move-result-wide v4

    iget-wide v6, p1, Le/a/a/a/b/b/i;->h:J

    move-object v2, p2

    invoke-direct/range {v2 .. v7}, Le/a/a/a/d/b;-><init>(Ljava/io/InputStream;JJ)V

    move-object v3, p2

    :cond_2
    invoke-virtual {p1}, Le/a/a/a/b/b/i;->d()J

    move-result-wide p1

    long-to-int p2, p1

    new-array p1, p2, [B

    new-instance p2, Ljava/io/DataInputStream;

    invoke-direct {p2, v3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    :try_start_0
    invoke-virtual {p2, p1}, Ljava/io/DataInputStream;->readFully([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p2}, Ljava/io/DataInputStream;->close()V

    new-instance p2, Ljava/io/DataInputStream;

    new-instance p3, Ljava/io/ByteArrayInputStream;

    invoke-direct {p3, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-direct {p2, p3}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    return-object p2

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Ljava/io/DataInputStream;->close()V

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method private l(Ljava/io/DataInput;Le/a/a/a/b/b/b;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-static/range {p1 .. p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v3

    long-to-int v4, v3

    new-array v3, v4, [Le/a/a/a/b/b/k;

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_0

    new-instance v7, Le/a/a/a/b/b/k;

    invoke-direct {v7}, Le/a/a/a/b/b/k;-><init>()V

    aput-object v7, v3, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    move-object v7, v6

    move-object v8, v7

    :goto_1
    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v9

    if-nez v9, :cond_8

    const/4 v1, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    :goto_2
    if-ge v1, v4, :cond_7

    aget-object v13, v3, v1

    const/4 v14, 0x1

    if-nez v6, :cond_1

    :goto_3
    const/4 v15, 0x1

    goto :goto_4

    :cond_1
    invoke-virtual {v6, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v15

    if-nez v15, :cond_2

    goto :goto_3

    :cond_2
    const/4 v15, 0x0

    :goto_4
    invoke-virtual {v13, v15}, Le/a/a/a/b/b/k;->u(Z)V

    aget-object v13, v3, v1

    invoke-virtual {v13}, Le/a/a/a/b/b/k;->j()Z

    move-result v13

    if-eqz v13, :cond_3

    aget-object v13, v3, v1

    invoke-virtual {v13, v5}, Le/a/a/a/b/b/k;->p(Z)V

    aget-object v13, v3, v1

    invoke-virtual {v13, v5}, Le/a/a/a/b/b/k;->l(Z)V

    aget-object v13, v3, v1

    iget-object v14, v2, Le/a/a/a/b/b/b;->f:Le/a/a/a/b/b/q;

    iget-object v14, v14, Le/a/a/a/b/b/q;->b:Ljava/util/BitSet;

    invoke-virtual {v14, v9}, Ljava/util/BitSet;->get(I)Z

    move-result v14

    invoke-virtual {v13, v14}, Le/a/a/a/b/b/k;->r(Z)V

    aget-object v13, v3, v1

    iget-object v14, v2, Le/a/a/a/b/b/b;->f:Le/a/a/a/b/b/q;

    iget-object v14, v14, Le/a/a/a/b/b/q;->c:[J

    aget-wide v10, v14, v9

    invoke-virtual {v13, v10, v11}, Le/a/a/a/b/b/k;->n(J)V

    aget-object v10, v3, v1

    iget-object v11, v2, Le/a/a/a/b/b/b;->f:Le/a/a/a/b/b/q;

    iget-object v11, v11, Le/a/a/a/b/b/q;->a:[J

    aget-wide v13, v11, v9

    invoke-virtual {v10, v13, v14}, Le/a/a/a/b/b/k;->y(J)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_3
    aget-object v10, v3, v1

    if-nez v7, :cond_4

    goto :goto_5

    :cond_4
    invoke-virtual {v7, v12}, Ljava/util/BitSet;->get(I)Z

    move-result v11

    if-nez v11, :cond_5

    goto :goto_5

    :cond_5
    const/4 v14, 0x0

    :goto_5
    invoke-virtual {v10, v14}, Le/a/a/a/b/b/k;->p(Z)V

    aget-object v10, v3, v1

    if-nez v8, :cond_6

    const/4 v11, 0x0

    goto :goto_6

    :cond_6
    invoke-virtual {v8, v12}, Ljava/util/BitSet;->get(I)Z

    move-result v11

    :goto_6
    invoke-virtual {v10, v11}, Le/a/a/a/b/b/k;->l(Z)V

    aget-object v10, v3, v1

    invoke-virtual {v10, v5}, Le/a/a/a/b/b/k;->r(Z)V

    aget-object v10, v3, v1

    const-wide/16 v13, 0x0

    invoke-virtual {v10, v13, v14}, Le/a/a/a/b/b/k;->y(J)V

    add-int/lit8 v12, v12, 0x1

    :goto_7
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_7
    iput-object v3, v2, Le/a/a/a/b/b/b;->g:[Le/a/a/a/b/b/k;

    invoke-direct {v0, v2}, Le/a/a/a/b/b/l;->c(Le/a/a/a/b/b/b;)V

    return-void

    :cond_8
    invoke-static/range {p1 .. p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v10

    const-string v12, "Unimplemented"

    packed-switch v9, :pswitch_data_0

    :pswitch_0
    invoke-static {v1, v10, v11}, Le/a/a/a/b/b/l;->v(Ljava/io/DataInput;J)J

    move-result-wide v12

    cmp-long v2, v12, v10

    if-ltz v2, :cond_1a

    goto/16 :goto_d

    :pswitch_1
    invoke-static {v1, v10, v11}, Le/a/a/a/b/b/l;->v(Ljava/io/DataInput;J)J

    move-result-wide v12

    cmp-long v9, v12, v10

    if-ltz v9, :cond_9

    goto/16 :goto_d

    :cond_9
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Incomplete kDummy property"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_2
    new-instance v1, Ljava/io/IOException;

    const-string v2, "kStartPos is unsupported, please report"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_3
    invoke-direct {v0, v1, v4}, Le/a/a/a/b/b/l;->h(Ljava/io/DataInput;I)Ljava/util/BitSet;

    move-result-object v9

    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v10

    if-nez v10, :cond_b

    const/4 v10, 0x0

    :goto_8
    if-ge v10, v4, :cond_19

    aget-object v11, v3, v10

    invoke-virtual {v9, v10}, Ljava/util/BitSet;->get(I)Z

    move-result v12

    invoke-virtual {v11, v12}, Le/a/a/a/b/b/k;->v(Z)V

    aget-object v11, v3, v10

    invoke-virtual {v11}, Le/a/a/a/b/b/k;->h()Z

    move-result v11

    if-eqz v11, :cond_a

    aget-object v11, v3, v10

    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readInt()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v12

    invoke-virtual {v11, v12}, Le/a/a/a/b/b/k;->z(I)V

    :cond_a
    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    :cond_b
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v12}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_4
    invoke-direct {v0, v1, v4}, Le/a/a/a/b/b/l;->h(Ljava/io/DataInput;I)Ljava/util/BitSet;

    move-result-object v9

    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v10

    if-nez v10, :cond_d

    const/4 v10, 0x0

    :goto_9
    if-ge v10, v4, :cond_19

    aget-object v11, v3, v10

    invoke-virtual {v9, v10}, Ljava/util/BitSet;->get(I)Z

    move-result v12

    invoke-virtual {v11, v12}, Le/a/a/a/b/b/k;->t(Z)V

    aget-object v11, v3, v10

    invoke-virtual {v11}, Le/a/a/a/b/b/k;->g()Z

    move-result v11

    if-eqz v11, :cond_c

    aget-object v11, v3, v10

    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readLong()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->reverseBytes(J)J

    move-result-wide v12

    invoke-virtual {v11, v12, v13}, Le/a/a/a/b/b/k;->w(J)V

    :cond_c
    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    :cond_d
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v12}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_5
    invoke-direct {v0, v1, v4}, Le/a/a/a/b/b/l;->h(Ljava/io/DataInput;I)Ljava/util/BitSet;

    move-result-object v9

    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v10

    if-nez v10, :cond_f

    const/4 v10, 0x0

    :goto_a
    if-ge v10, v4, :cond_19

    aget-object v11, v3, v10

    invoke-virtual {v9, v10}, Ljava/util/BitSet;->get(I)Z

    move-result v12

    invoke-virtual {v11, v12}, Le/a/a/a/b/b/k;->q(Z)V

    aget-object v11, v3, v10

    invoke-virtual {v11}, Le/a/a/a/b/b/k;->d()Z

    move-result v11

    if-eqz v11, :cond_e

    aget-object v11, v3, v10

    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readLong()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->reverseBytes(J)J

    move-result-wide v12

    invoke-virtual {v11, v12, v13}, Le/a/a/a/b/b/k;->k(J)V

    :cond_e
    add-int/lit8 v10, v10, 0x1

    goto :goto_a

    :cond_f
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v12}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_6
    invoke-direct {v0, v1, v4}, Le/a/a/a/b/b/l;->h(Ljava/io/DataInput;I)Ljava/util/BitSet;

    move-result-object v9

    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v10

    if-nez v10, :cond_11

    const/4 v10, 0x0

    :goto_b
    if-ge v10, v4, :cond_19

    aget-object v11, v3, v10

    invoke-virtual {v9, v10}, Ljava/util/BitSet;->get(I)Z

    move-result v12

    invoke-virtual {v11, v12}, Le/a/a/a/b/b/k;->s(Z)V

    aget-object v11, v3, v10

    invoke-virtual {v11}, Le/a/a/a/b/b/k;->f()Z

    move-result v11

    if-eqz v11, :cond_10

    aget-object v11, v3, v10

    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readLong()J

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Long;->reverseBytes(J)J

    move-result-wide v12

    invoke-virtual {v11, v12, v13}, Le/a/a/a/b/b/k;->o(J)V

    :cond_10
    add-int/lit8 v10, v10, 0x1

    goto :goto_b

    :cond_11
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v12}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_7
    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v9

    if-nez v9, :cond_16

    const-wide/16 v12, 0x1

    sub-long/2addr v10, v12

    and-long/2addr v12, v10

    const-wide/16 v14, 0x0

    cmp-long v9, v12, v14

    if-nez v9, :cond_15

    long-to-int v9, v10

    new-array v10, v9, [B

    invoke-interface {v1, v10}, Ljava/io/DataInput;->readFully([B)V

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_c
    if-ge v11, v9, :cond_13

    aget-byte v14, v10, v11

    if-nez v14, :cond_12

    add-int/lit8 v14, v11, 0x1

    aget-byte v14, v10, v14

    if-nez v14, :cond_12

    add-int/lit8 v14, v13, 0x1

    aget-object v13, v3, v13

    new-instance v15, Ljava/lang/String;

    sub-int v5, v11, v12

    const-string v2, "UTF-16LE"

    invoke-direct {v15, v10, v12, v5, v2}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V

    invoke-virtual {v13, v15}, Le/a/a/a/b/b/k;->x(Ljava/lang/String;)V

    add-int/lit8 v12, v11, 0x2

    move v13, v14

    :cond_12
    add-int/lit8 v11, v11, 0x2

    move-object/from16 v2, p2

    const/4 v5, 0x0

    goto :goto_c

    :cond_13
    if-ne v12, v9, :cond_14

    if-ne v13, v4, :cond_14

    goto :goto_d

    :cond_14
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Error parsing file names"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_15
    new-instance v1, Ljava/io/IOException;

    const-string v2, "File names length invalid"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_16
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Not implemented"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_8
    if-eqz v6, :cond_17

    invoke-virtual {v6}, Ljava/util/BitSet;->cardinality()I

    move-result v2

    invoke-direct {v0, v1, v2}, Le/a/a/a/b/b/l;->j(Ljava/io/DataInput;I)Ljava/util/BitSet;

    move-result-object v2

    move-object v8, v2

    goto :goto_d

    :cond_17
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Header format error: kEmptyStream must appear before kAnti"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_9
    if-eqz v6, :cond_18

    invoke-virtual {v6}, Ljava/util/BitSet;->cardinality()I

    move-result v2

    invoke-direct {v0, v1, v2}, Le/a/a/a/b/b/l;->j(Ljava/io/DataInput;I)Ljava/util/BitSet;

    move-result-object v2

    move-object v7, v2

    goto :goto_d

    :cond_18
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Header format error: kEmptyStream must appear before kEmptyFile"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_a
    invoke-direct {v0, v1, v4}, Le/a/a/a/b/b/l;->j(Ljava/io/DataInput;I)Ljava/util/BitSet;

    move-result-object v2

    move-object v6, v2

    :cond_19
    :goto_d
    move-object/from16 v2, p2

    const/4 v5, 0x0

    goto/16 :goto_1

    :cond_1a
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Incomplete property of type "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_f

    :goto_e
    throw v1

    :goto_f
    goto :goto_e

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private m(Ljava/io/DataInput;)Le/a/a/a/b/b/i;
    .locals 19

    move-object/from16 v0, p1

    new-instance v1, Le/a/a/a/b/b/i;

    invoke-direct {v1}, Le/a/a/a/b/b/i;-><init>()V

    invoke-static/range {p1 .. p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v2

    long-to-int v3, v2

    new-array v2, v3, [Le/a/a/a/b/b/e;

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-wide v8, v4

    move-wide v10, v8

    const/4 v7, 0x0

    :goto_0
    const-wide/16 v12, 0x1

    if-ge v7, v3, :cond_6

    new-instance v14, Le/a/a/a/b/b/e;

    invoke-direct {v14}, Le/a/a/a/b/b/e;-><init>()V

    aput-object v14, v2, v7

    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v14

    and-int/lit8 v15, v14, 0xf

    and-int/lit8 v16, v14, 0x10

    const/16 v17, 0x1

    if-nez v16, :cond_0

    const/16 v16, 0x1

    goto :goto_1

    :cond_0
    const/16 v16, 0x0

    :goto_1
    and-int/lit8 v18, v14, 0x20

    if-eqz v18, :cond_1

    const/16 v18, 0x1

    goto :goto_2

    :cond_1
    const/16 v18, 0x0

    :goto_2
    and-int/lit16 v14, v14, 0x80

    if-eqz v14, :cond_2

    goto :goto_3

    :cond_2
    const/16 v17, 0x0

    :goto_3
    aget-object v14, v2, v7

    new-array v15, v15, [B

    iput-object v15, v14, Le/a/a/a/b/b/e;->a:[B

    aget-object v14, v2, v7

    iget-object v14, v14, Le/a/a/a/b/b/e;->a:[B

    invoke-interface {v0, v14}, Ljava/io/DataInput;->readFully([B)V

    if-eqz v16, :cond_3

    aget-object v14, v2, v7

    iput-wide v12, v14, Le/a/a/a/b/b/e;->b:J

    aget-object v14, v2, v7

    iput-wide v12, v14, Le/a/a/a/b/b/e;->c:J

    goto :goto_4

    :cond_3
    aget-object v12, v2, v7

    invoke-static/range {p1 .. p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v13

    iput-wide v13, v12, Le/a/a/a/b/b/e;->b:J

    aget-object v12, v2, v7

    invoke-static/range {p1 .. p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v13

    iput-wide v13, v12, Le/a/a/a/b/b/e;->c:J

    :goto_4
    aget-object v12, v2, v7

    iget-wide v12, v12, Le/a/a/a/b/b/e;->b:J

    add-long/2addr v8, v12

    aget-object v12, v2, v7

    iget-wide v12, v12, Le/a/a/a/b/b/e;->c:J

    add-long/2addr v10, v12

    if-eqz v18, :cond_4

    invoke-static/range {p1 .. p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v12

    aget-object v14, v2, v7

    long-to-int v13, v12

    new-array v12, v13, [B

    iput-object v12, v14, Le/a/a/a/b/b/e;->d:[B

    aget-object v12, v2, v7

    iget-object v12, v12, Le/a/a/a/b/b/e;->d:[B

    invoke-interface {v0, v12}, Ljava/io/DataInput;->readFully([B)V

    :cond_4
    if-nez v17, :cond_5

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Alternative methods are unsupported, please report. The reference implementation doesn\'t support them either."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    iput-object v2, v1, Le/a/a/a/b/b/i;->a:[Le/a/a/a/b/b/e;

    iput-wide v8, v1, Le/a/a/a/b/b/i;->b:J

    iput-wide v10, v1, Le/a/a/a/b/b/i;->c:J

    cmp-long v2, v10, v4

    if-eqz v2, :cond_e

    sub-long/2addr v10, v12

    long-to-int v2, v10

    new-array v3, v2, [Le/a/a/a/b/b/c;

    const/4 v4, 0x0

    :goto_5
    if-ge v4, v2, :cond_7

    new-instance v5, Le/a/a/a/b/b/c;

    invoke-direct {v5}, Le/a/a/a/b/b/c;-><init>()V

    aput-object v5, v3, v4

    aget-object v5, v3, v4

    invoke-static/range {p1 .. p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v14

    iput-wide v14, v5, Le/a/a/a/b/b/c;->a:J

    aget-object v5, v3, v4

    invoke-static/range {p1 .. p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v14

    iput-wide v14, v5, Le/a/a/a/b/b/c;->b:J

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_7
    iput-object v3, v1, Le/a/a/a/b/b/i;->d:[Le/a/a/a/b/b/c;

    cmp-long v2, v8, v10

    if-ltz v2, :cond_d

    sub-long v2, v8, v10

    long-to-int v4, v2

    new-array v5, v4, [J

    cmp-long v7, v2, v12

    if-nez v7, :cond_b

    const/4 v0, 0x0

    :goto_6
    long-to-int v2, v8

    if-ge v0, v2, :cond_9

    invoke-virtual {v1, v0}, Le/a/a/a/b/b/i;->a(I)I

    move-result v3

    if-gez v3, :cond_8

    goto :goto_7

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_9
    :goto_7
    if-eq v0, v2, :cond_a

    int-to-long v2, v0

    aput-wide v2, v5, v6

    goto :goto_9

    :cond_a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Couldn\'t find stream\'s bind pair index"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    :goto_8
    if-ge v6, v4, :cond_c

    invoke-static/range {p1 .. p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v2

    aput-wide v2, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_8

    :cond_c
    :goto_9
    iput-object v5, v1, Le/a/a/a/b/b/i;->e:[J

    return-object v1

    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Total input streams can\'t be less than the number of bind pairs"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Total output streams can\'t be 0"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_b

    :goto_a
    throw v0

    :goto_b
    goto :goto_a
.end method

.method private n(Ljava/io/DataInput;Le/a/a/a/b/b/b;)V
    .locals 2

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1}, Le/a/a/a/b/b/l;->i(Ljava/io/DataInput;)V

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v0

    :cond_0
    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p1, p2}, Le/a/a/a/b/b/l;->r(Ljava/io/DataInput;Le/a/a/a/b/b/b;)V

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v0

    :cond_1
    const/4 v1, 0x5

    if-ne v0, v1, :cond_2

    invoke-direct {p0, p1, p2}, Le/a/a/a/b/b/l;->l(Ljava/io/DataInput;Le/a/a/a/b/b/b;)V

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v0

    :cond_2
    if-nez v0, :cond_3

    return-void

    :cond_3
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Badly terminated header, found "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Additional streams unsupported"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private o([B)Le/a/a/a/b/b/b;
    .locals 8

    const/4 v0, 0x6

    new-array v0, v0, [B

    iget-object v1, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    invoke-virtual {v1, v0}, Ljava/io/RandomAccessFile;->readFully([B)V

    sget-object v1, Le/a/a/a/b/b/l;->b:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->readByte()B

    move-result v0

    iget-object v1, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readByte()B

    move-result v1

    const/4 v2, 0x1

    if-nez v0, :cond_4

    const-wide v0, 0xffffffffL

    iget-object v3, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->readInt()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v3

    int-to-long v3, v3

    and-long/2addr v0, v3

    invoke-direct {p0, v0, v1}, Le/a/a/a/b/b/l;->q(J)Le/a/a/a/b/b/o;

    move-result-object v0

    iget-wide v3, v0, Le/a/a/a/b/b/o;->b:J

    long-to-int v1, v3

    int-to-long v5, v1

    cmp-long v7, v5, v3

    if-nez v7, :cond_3

    iget-object v3, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    const-wide/16 v4, 0x20

    iget-wide v6, v0, Le/a/a/a/b/b/o;->a:J

    add-long/2addr v6, v4

    invoke-virtual {v3, v6, v7}, Ljava/io/RandomAccessFile;->seek(J)V

    new-array v1, v1, [B

    iget-object v3, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    invoke-virtual {v3, v1}, Ljava/io/RandomAccessFile;->readFully([B)V

    new-instance v3, Ljava/util/zip/CRC32;

    invoke-direct {v3}, Ljava/util/zip/CRC32;-><init>()V

    invoke-virtual {v3, v1}, Ljava/util/zip/CRC32;->update([B)V

    iget-wide v4, v0, Le/a/a/a/b/b/o;->c:J

    invoke-virtual {v3}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v6

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance v1, Ljava/io/DataInputStream;

    invoke-direct {v1, v0}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    new-instance v0, Le/a/a/a/b/b/b;

    invoke-direct {v0}, Le/a/a/a/b/b/b;-><init>()V

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v3

    const/16 v4, 0x17

    if-ne v3, v4, :cond_0

    invoke-direct {p0, v1, v0, p1}, Le/a/a/a/b/b/l;->k(Ljava/io/DataInputStream;Le/a/a/a/b/b/b;[B)Ljava/io/DataInputStream;

    move-result-object v1

    new-instance v0, Le/a/a/a/b/b/b;

    invoke-direct {v0}, Le/a/a/a/b/b/b;-><init>()V

    invoke-virtual {v1}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v3

    :cond_0
    if-ne v3, v2, :cond_1

    invoke-direct {p0, v1, v0}, Le/a/a/a/b/b/l;->n(Ljava/io/DataInput;Le/a/a/a/b/b/b;)V

    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V

    return-object v0

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Broken or unsupported archive: no Header"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "NextHeader CRC mismatch"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cannot handle nextHeaderSize "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, v0, Le/a/a/a/b/b/o;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v0

    aput-object v0, v3, v2

    const-string v0, "Unsupported 7z version (%d,%d)"

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Bad 7z signature"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private p(Ljava/io/DataInput;Le/a/a/a/b/b/b;)V
    .locals 8

    invoke-static {p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v0

    iput-wide v0, p2, Le/a/a/a/b/b/b;->a:J

    invoke-static {p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v0

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v2

    const/4 v3, 0x0

    const/16 v4, 0x9

    if-ne v2, v4, :cond_1

    long-to-int v2, v0

    new-array v2, v2, [J

    iput-object v2, p2, Le/a/a/a/b/b/b;->b:[J

    const/4 v2, 0x0

    :goto_0
    iget-object v4, p2, Le/a/a/a/b/b/b;->b:[J

    array-length v5, v4

    if-ge v2, v5, :cond_0

    invoke-static {p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v5

    aput-wide v5, v4, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v2

    :cond_1
    const/16 v4, 0xa

    if-ne v2, v4, :cond_4

    long-to-int v1, v0

    invoke-direct {p0, p1, v1}, Le/a/a/a/b/b/l;->h(Ljava/io/DataInput;I)Ljava/util/BitSet;

    move-result-object v0

    iput-object v0, p2, Le/a/a/a/b/b/b;->c:Ljava/util/BitSet;

    new-array v0, v1, [J

    iput-object v0, p2, Le/a/a/a/b/b/b;->d:[J

    :goto_1
    if-ge v3, v1, :cond_3

    iget-object v0, p2, Le/a/a/a/b/b/b;->c:Ljava/util/BitSet;

    invoke-virtual {v0, v3}, Ljava/util/BitSet;->get(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p2, Le/a/a/a/b/b/b;->d:[J

    const-wide v4, 0xffffffffL

    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v2

    int-to-long v6, v2

    and-long/2addr v4, v6

    aput-wide v4, v0, v3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v2

    :cond_4
    if-nez v2, :cond_5

    return-void

    :cond_5
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Badly terminated PackInfo ("

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method private q(J)Le/a/a/a/b/b/o;
    .locals 10

    new-instance v0, Le/a/a/a/b/b/o;

    invoke-direct {v0}, Le/a/a/a/b/b/o;-><init>()V

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/io/DataInputStream;

    new-instance v9, Le/a/a/a/d/b;

    new-instance v4, Le/a/a/a/b/b/d;

    iget-object v3, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    const-wide/16 v5, 0x14

    invoke-direct {v4, v3, v5, v6}, Le/a/a/a/b/b/d;-><init>(Ljava/io/RandomAccessFile;J)V

    const-wide/16 v5, 0x14

    move-object v3, v9

    move-wide v7, p1

    invoke-direct/range {v3 .. v8}, Le/a/a/a/d/b;-><init>(Ljava/io/InputStream;JJ)V

    invoke-direct {v2, v9}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v2}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->reverseBytes(J)J

    move-result-wide p1

    iput-wide p1, v0, Le/a/a/a/b/b/o;->a:J

    invoke-virtual {v2}, Ljava/io/DataInputStream;->readLong()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->reverseBytes(J)J

    move-result-wide p1

    iput-wide p1, v0, Le/a/a/a/b/b/o;->b:J

    const-wide p1, 0xffffffffL

    invoke-virtual {v2}, Ljava/io/DataInputStream;->readInt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v1

    int-to-long v3, v1

    and-long/2addr p1, v3

    iput-wide p1, v0, Le/a/a/a/b/b/o;->c:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v2}, Ljava/io/DataInputStream;->close()V

    return-object v0

    :catchall_0
    move-exception p1

    move-object v1, v2

    goto :goto_0

    :catchall_1
    move-exception p1

    :goto_0
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/DataInputStream;->close()V

    :cond_0
    throw p1
.end method

.method private r(Ljava/io/DataInput;Le/a/a/a/b/b/b;)V
    .locals 2

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1, p2}, Le/a/a/a/b/b/l;->p(Ljava/io/DataInput;Le/a/a/a/b/b/b;)V

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v0

    :cond_0
    const/4 v1, 0x7

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p1, p2}, Le/a/a/a/b/b/l;->u(Ljava/io/DataInput;Le/a/a/a/b/b/b;)V

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    new-array v1, v1, [Le/a/a/a/b/b/i;

    iput-object v1, p2, Le/a/a/a/b/b/b;->e:[Le/a/a/a/b/b/i;

    :goto_0
    const/16 v1, 0x8

    if-ne v0, v1, :cond_2

    invoke-direct {p0, p1, p2}, Le/a/a/a/b/b/l;->s(Ljava/io/DataInput;Le/a/a/a/b/b/b;)V

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v0

    :cond_2
    if-nez v0, :cond_3

    return-void

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Badly terminated StreamsInfo"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private s(Ljava/io/DataInput;Le/a/a/a/b/b/b;)V
    .locals 18

    move-object/from16 v0, p2

    iget-object v1, v0, Le/a/a/a/b/b/b;->e:[Le/a/a/a/b/b/i;

    array-length v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v2, :cond_0

    aget-object v6, v1, v4

    iput v5, v6, Le/a/a/a/b/b/i;->i:I

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, v0, Le/a/a/a/b/b/b;->e:[Le/a/a/a/b/b/i;

    array-length v1, v1

    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v2

    const/16 v4, 0xd

    if-ne v2, v4, :cond_2

    iget-object v1, v0, Le/a/a/a/b/b/b;->e:[Le/a/a/a/b/b/i;

    array-length v2, v1

    const/4 v4, 0x0

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v2, :cond_1

    aget-object v7, v1, v6

    invoke-static/range {p1 .. p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v8

    long-to-int v10, v8

    iput v10, v7, Le/a/a/a/b/b/i;->i:I

    int-to-long v10, v4

    add-long/2addr v10, v8

    long-to-int v4, v10

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_1
    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v2

    move v1, v4

    :cond_2
    new-instance v4, Le/a/a/a/b/b/q;

    invoke-direct {v4}, Le/a/a/a/b/b/q;-><init>()V

    new-array v6, v1, [J

    iput-object v6, v4, Le/a/a/a/b/b/q;->a:[J

    new-instance v6, Ljava/util/BitSet;

    invoke-direct {v6, v1}, Ljava/util/BitSet;-><init>(I)V

    iput-object v6, v4, Le/a/a/a/b/b/q;->b:Ljava/util/BitSet;

    new-array v1, v1, [J

    iput-object v1, v4, Le/a/a/a/b/b/q;->c:[J

    iget-object v1, v0, Le/a/a/a/b/b/b;->e:[Le/a/a/a/b/b/i;

    array-length v6, v1

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_2
    const/16 v9, 0x9

    if-ge v7, v6, :cond_5

    aget-object v10, v1, v7

    iget v11, v10, Le/a/a/a/b/b/i;->i:I

    if-nez v11, :cond_3

    goto :goto_4

    :cond_3
    const-wide/16 v11, 0x0

    if-ne v2, v9, :cond_4

    const/4 v9, 0x0

    :goto_3
    iget v13, v10, Le/a/a/a/b/b/i;->i:I

    sub-int/2addr v13, v5

    if-ge v9, v13, :cond_4

    invoke-static/range {p1 .. p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v13

    iget-object v15, v4, Le/a/a/a/b/b/q;->a:[J

    add-int/lit8 v16, v8, 0x1

    aput-wide v13, v15, v8

    add-long/2addr v11, v13

    add-int/lit8 v9, v9, 0x1

    move/from16 v8, v16

    goto :goto_3

    :cond_4
    iget-object v9, v4, Le/a/a/a/b/b/q;->a:[J

    add-int/lit8 v13, v8, 0x1

    invoke-virtual {v10}, Le/a/a/a/b/b/i;->d()J

    move-result-wide v14

    sub-long/2addr v14, v11

    aput-wide v14, v9, v8

    move v8, v13

    :goto_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_5
    if-ne v2, v9, :cond_6

    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v2

    :cond_6
    iget-object v1, v0, Le/a/a/a/b/b/b;->e:[Le/a/a/a/b/b/i;

    array-length v6, v1

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_5
    if-ge v7, v6, :cond_9

    aget-object v9, v1, v7

    iget v10, v9, Le/a/a/a/b/b/i;->i:I

    if-ne v10, v5, :cond_7

    iget-boolean v9, v9, Le/a/a/a/b/b/i;->g:Z

    if-nez v9, :cond_8

    :cond_7
    add-int/2addr v8, v10

    :cond_8
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_9
    const/16 v1, 0xa

    if-ne v2, v1, :cond_f

    move-object/from16 v1, p0

    move-object/from16 v6, p1

    invoke-direct {v1, v6, v8}, Le/a/a/a/b/b/l;->h(Ljava/io/DataInput;I)Ljava/util/BitSet;

    move-result-object v2

    new-array v7, v8, [J

    const/4 v9, 0x0

    :goto_6
    if-ge v9, v8, :cond_b

    invoke-virtual {v2, v9}, Ljava/util/BitSet;->get(I)Z

    move-result v10

    if-eqz v10, :cond_a

    const-wide v10, 0xffffffffL

    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readInt()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v12

    int-to-long v12, v12

    and-long/2addr v10, v12

    aput-wide v10, v7, v9

    :cond_a
    add-int/lit8 v9, v9, 0x1

    goto :goto_6

    :cond_b
    iget-object v8, v0, Le/a/a/a/b/b/b;->e:[Le/a/a/a/b/b/i;

    array-length v9, v8

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_7
    if-ge v10, v9, :cond_e

    aget-object v13, v8, v10

    iget v14, v13, Le/a/a/a/b/b/i;->i:I

    if-ne v14, v5, :cond_c

    iget-boolean v14, v13, Le/a/a/a/b/b/i;->g:Z

    if-eqz v14, :cond_c

    iget-object v14, v4, Le/a/a/a/b/b/q;->b:Ljava/util/BitSet;

    invoke-virtual {v14, v11, v5}, Ljava/util/BitSet;->set(IZ)V

    iget-object v14, v4, Le/a/a/a/b/b/q;->c:[J

    iget-wide v5, v13, Le/a/a/a/b/b/i;->h:J

    aput-wide v5, v14, v11

    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    :cond_c
    const/4 v5, 0x0

    :goto_8
    iget v6, v13, Le/a/a/a/b/b/i;->i:I

    if-ge v5, v6, :cond_d

    iget-object v6, v4, Le/a/a/a/b/b/q;->b:Ljava/util/BitSet;

    invoke-virtual {v2, v12}, Ljava/util/BitSet;->get(I)Z

    move-result v14

    invoke-virtual {v6, v11, v14}, Ljava/util/BitSet;->set(IZ)V

    iget-object v6, v4, Le/a/a/a/b/b/q;->c:[J

    aget-wide v16, v7, v12

    aput-wide v16, v6, v11

    add-int/lit8 v11, v11, 0x1

    add-int/lit8 v12, v12, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_d
    :goto_9
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v6, p1

    const/4 v5, 0x1

    goto :goto_7

    :cond_e
    invoke-interface/range {p1 .. p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v2

    goto :goto_a

    :cond_f
    move-object/from16 v1, p0

    :goto_a
    if-nez v2, :cond_10

    iput-object v4, v0, Le/a/a/a/b/b/b;->f:Le/a/a/a/b/b/q;

    return-void

    :cond_10
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Badly terminated SubStreamsInfo"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_c

    :goto_b
    throw v0

    :goto_c
    goto :goto_b
.end method

.method private static t(Ljava/io/DataInput;)J
    .locals 12

    invoke-interface {p0}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x0

    const/16 v4, 0x80

    const/4 v5, 0x0

    move-wide v6, v2

    :goto_0
    const/16 v8, 0x8

    if-ge v5, v8, :cond_1

    int-to-long v9, v4

    and-long/2addr v9, v0

    cmp-long v11, v9, v2

    if-nez v11, :cond_0

    add-int/lit8 v4, v4, -0x1

    int-to-long v2, v4

    and-long/2addr v0, v2

    mul-int/lit8 v5, v5, 0x8

    shl-long/2addr v0, v5

    or-long/2addr v0, v6

    return-wide v0

    :cond_0
    invoke-interface {p0}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v8

    int-to-long v8, v8

    mul-int/lit8 v10, v5, 0x8

    shl-long/2addr v8, v10

    or-long/2addr v6, v8

    ushr-int/lit8 v4, v4, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    return-wide v6
.end method

.method private u(Ljava/io/DataInput;Le/a/a/a/b/b/b;)V
    .locals 10

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v0

    const/16 v1, 0xb

    if-ne v0, v1, :cond_9

    invoke-static {p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v0

    long-to-int v1, v0

    new-array v0, v1, [Le/a/a/a/b/b/i;

    iput-object v0, p2, Le/a/a/a/b/b/b;->e:[Le/a/a/a/b/b/i;

    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result p2

    if-nez p2, :cond_8

    const/4 p2, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-direct {p0, p1}, Le/a/a/a/b/b/l;->m(Ljava/io/DataInput;)Le/a/a/a/b/b/i;

    move-result-object v3

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v2

    const/16 v3, 0xc

    if-ne v2, v3, :cond_7

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    iget-wide v4, v3, Le/a/a/a/b/b/i;->c:J

    long-to-int v5, v4

    new-array v4, v5, [J

    iput-object v4, v3, Le/a/a/a/b/b/i;->f:[J

    const/4 v4, 0x0

    :goto_2
    int-to-long v5, v4

    iget-wide v7, v3, Le/a/a/a/b/b/i;->c:J

    cmp-long v9, v5, v7

    if-gez v9, :cond_1

    iget-object v5, v3, Le/a/a/a/b/b/i;->f:[J

    invoke-static {p1}, Le/a/a/a/b/b/l;->t(Ljava/io/DataInput;)J

    move-result-wide v6

    aput-wide v6, v5, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v2

    const/16 v3, 0xa

    if-ne v2, v3, :cond_5

    invoke-direct {p0, p1, v1}, Le/a/a/a/b/b/l;->h(Ljava/io/DataInput;I)Ljava/util/BitSet;

    move-result-object v2

    const/4 v3, 0x0

    :goto_3
    if-ge v3, v1, :cond_4

    invoke-virtual {v2, v3}, Ljava/util/BitSet;->get(I)Z

    move-result v4

    if-eqz v4, :cond_3

    aget-object v4, v0, v3

    const/4 v5, 0x1

    iput-boolean v5, v4, Le/a/a/a/b/b/i;->g:Z

    aget-object v4, v0, v3

    const-wide v5, 0xffffffffL

    invoke-interface {p1}, Ljava/io/DataInput;->readInt()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v7

    int-to-long v7, v7

    and-long/2addr v5, v7

    iput-wide v5, v4, Le/a/a/a/b/b/i;->h:J

    goto :goto_4

    :cond_3
    aget-object v4, v0, v3

    iput-boolean p2, v4, Le/a/a/a/b/b/i;->g:Z

    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    invoke-interface {p1}, Ljava/io/DataInput;->readUnsignedByte()I

    move-result v2

    :cond_5
    if-nez v2, :cond_6

    return-void

    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Badly terminated UnpackInfo"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Expected kCodersUnpackSize, got "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string p2, "External unsupported"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Expected kFolder, got "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    goto :goto_6

    :goto_5
    throw p1

    :goto_6
    goto :goto_5
.end method

.method private static v(Ljava/io/DataInput;J)J
    .locals 7

    const-wide/16 v0, 0x0

    const-wide/16 v2, 0x1

    cmp-long v4, p1, v2

    if-gez v4, :cond_0

    return-wide v0

    :cond_0
    move-wide v2, v0

    :goto_0
    const-wide/32 v4, 0x7fffffff

    cmp-long v6, p1, v4

    if-lez v6, :cond_2

    invoke-static {p0, v4, v5}, Le/a/a/a/b/b/l;->v(Ljava/io/DataInput;J)J

    move-result-wide v4

    cmp-long v6, v4, v0

    if-nez v6, :cond_1

    return-wide v2

    :cond_1
    add-long/2addr v2, v4

    sub-long/2addr p1, v4

    goto :goto_0

    :cond_2
    :goto_1
    cmp-long v4, p1, v0

    if-lez v4, :cond_4

    long-to-int v4, p1

    invoke-interface {p0, v4}, Ljava/io/DataInput;->skipBytes(I)I

    move-result v4

    if-nez v4, :cond_3

    return-wide v2

    :cond_3
    int-to-long v4, v4

    add-long/2addr v2, v4

    sub-long/2addr p1, v4

    goto :goto_1

    :cond_4
    return-wide v2
.end method


# virtual methods
.method public close()V
    .locals 4

    iget-object v0, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v2, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    iget-object v0, p0, Le/a/a/a/b/b/l;->i:[B

    if-eqz v0, :cond_0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    :cond_0
    iput-object v2, p0, Le/a/a/a/b/b/l;->i:[B

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-object v2, p0, Le/a/a/a/b/b/l;->d:Ljava/io/RandomAccessFile;

    iget-object v3, p0, Le/a/a/a/b/b/l;->i:[B

    if-eqz v3, :cond_1

    invoke-static {v3, v1}, Ljava/util/Arrays;->fill([BB)V

    :cond_1
    iput-object v2, p0, Le/a/a/a/b/b/l;->i:[B

    throw v0

    :cond_2
    :goto_0
    return-void
.end method

.method public e()Le/a/a/a/b/b/k;
    .locals 3

    iget v0, p0, Le/a/a/a/b/b/l;->f:I

    iget-object v1, p0, Le/a/a/a/b/b/l;->e:Le/a/a/a/b/b/b;

    iget-object v1, v1, Le/a/a/a/b/b/b;->g:[Le/a/a/a/b/b/k;

    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    if-lt v0, v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Le/a/a/a/b/b/l;->f:I

    aget-object v0, v1, v0

    invoke-direct {p0}, Le/a/a/a/b/b/l;->b()V

    return-object v0
.end method

.method public f([B)I
    .locals 2

    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Le/a/a/a/b/b/l;->g([BII)I

    move-result p1

    return p1
.end method

.method public g([BII)I
    .locals 1

    invoke-direct {p0}, Le/a/a/a/b/b/l;->d()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le/a/a/a/b/b/l;->e:Le/a/a/a/b/b/b;

    invoke-virtual {v0}, Le/a/a/a/b/b/b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
