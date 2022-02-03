.class Lc/a/a/w/e$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc/a/a/w/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field a:J

.field final b:Ljava/lang/String;

.field final c:Ljava/lang/String;

.field final d:J

.field final e:J

.field final f:J

.field final g:J

.field final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc/a/a/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;Lc/a/a/b$a;)V
    .locals 12

    iget-object v2, p2, Lc/a/a/b$a;->b:Ljava/lang/String;

    iget-wide v3, p2, Lc/a/a/b$a;->c:J

    iget-wide v5, p2, Lc/a/a/b$a;->d:J

    iget-wide v7, p2, Lc/a/a/b$a;->e:J

    iget-wide v9, p2, Lc/a/a/b$a;->f:J

    invoke-static {p2}, Lc/a/a/w/e$a;->a(Lc/a/a/b$a;)Ljava/util/List;

    move-result-object v11

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v11}, Lc/a/a/w/e$a;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/util/List;)V

    iget-object p1, p2, Lc/a/a/b$a;->a:[B

    array-length p1, p1

    int-to-long p1, p1

    iput-wide p1, p0, Lc/a/a/w/e$a;->a:J

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJJJ",
            "Ljava/util/List<",
            "Lc/a/a/g;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc/a/a/w/e$a;->b:Ljava/lang/String;

    const-string p1, ""

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    :cond_0
    iput-object p2, p0, Lc/a/a/w/e$a;->c:Ljava/lang/String;

    iput-wide p3, p0, Lc/a/a/w/e$a;->d:J

    iput-wide p5, p0, Lc/a/a/w/e$a;->e:J

    iput-wide p7, p0, Lc/a/a/w/e$a;->f:J

    iput-wide p9, p0, Lc/a/a/w/e$a;->g:J

    iput-object p11, p0, Lc/a/a/w/e$a;->h:Ljava/util/List;

    return-void
.end method

.method private static a(Lc/a/a/b$a;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/b$a;",
            ")",
            "Ljava/util/List<",
            "Lc/a/a/g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc/a/a/b$a;->h:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object p0, p0, Lc/a/a/b$a;->g:Ljava/util/Map;

    invoke-static {p0}, Lc/a/a/w/g;->g(Ljava/util/Map;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static b(Lc/a/a/w/e$b;)Lc/a/a/w/e$a;
    .locals 14

    invoke-static {p0}, Lc/a/a/w/e;->l(Ljava/io/InputStream;)I

    move-result v0

    const v1, 0x20150306

    if-ne v0, v1, :cond_0

    invoke-static {p0}, Lc/a/a/w/e;->n(Lc/a/a/w/e$b;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Lc/a/a/w/e;->n(Lc/a/a/w/e$b;)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0}, Lc/a/a/w/e;->m(Ljava/io/InputStream;)J

    move-result-wide v5

    invoke-static {p0}, Lc/a/a/w/e;->m(Ljava/io/InputStream;)J

    move-result-wide v7

    invoke-static {p0}, Lc/a/a/w/e;->m(Ljava/io/InputStream;)J

    move-result-wide v9

    invoke-static {p0}, Lc/a/a/w/e;->m(Ljava/io/InputStream;)J

    move-result-wide v11

    invoke-static {p0}, Lc/a/a/w/e;->k(Lc/a/a/w/e$b;)Ljava/util/List;

    move-result-object v13

    new-instance p0, Lc/a/a/w/e$a;

    move-object v2, p0

    invoke-direct/range {v2 .. v13}, Lc/a/a/w/e$a;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJLjava/util/List;)V

    return-object p0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    invoke-direct {p0}, Ljava/io/IOException;-><init>()V

    throw p0
.end method


# virtual methods
.method c([B)Lc/a/a/b$a;
    .locals 3

    new-instance v0, Lc/a/a/b$a;

    invoke-direct {v0}, Lc/a/a/b$a;-><init>()V

    iput-object p1, v0, Lc/a/a/b$a;->a:[B

    iget-object p1, p0, Lc/a/a/w/e$a;->c:Ljava/lang/String;

    iput-object p1, v0, Lc/a/a/b$a;->b:Ljava/lang/String;

    iget-wide v1, p0, Lc/a/a/w/e$a;->d:J

    iput-wide v1, v0, Lc/a/a/b$a;->c:J

    iget-wide v1, p0, Lc/a/a/w/e$a;->e:J

    iput-wide v1, v0, Lc/a/a/b$a;->d:J

    iget-wide v1, p0, Lc/a/a/w/e$a;->f:J

    iput-wide v1, v0, Lc/a/a/b$a;->e:J

    iget-wide v1, p0, Lc/a/a/w/e$a;->g:J

    iput-wide v1, v0, Lc/a/a/b$a;->f:J

    iget-object p1, p0, Lc/a/a/w/e$a;->h:Ljava/util/List;

    invoke-static {p1}, Lc/a/a/w/g;->h(Ljava/util/List;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, v0, Lc/a/a/b$a;->g:Ljava/util/Map;

    iget-object p1, p0, Lc/a/a/w/e$a;->h:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, v0, Lc/a/a/b$a;->h:Ljava/util/List;

    return-object v0
.end method

.method d(Ljava/io/OutputStream;)Z
    .locals 4

    const v0, 0x20150306

    const/4 v1, 0x1

    :try_start_0
    invoke-static {p1, v0}, Lc/a/a/w/e;->s(Ljava/io/OutputStream;I)V

    iget-object v0, p0, Lc/a/a/w/e$a;->b:Ljava/lang/String;

    invoke-static {p1, v0}, Lc/a/a/w/e;->u(Ljava/io/OutputStream;Ljava/lang/String;)V

    iget-object v0, p0, Lc/a/a/w/e$a;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    invoke-static {p1, v0}, Lc/a/a/w/e;->u(Ljava/io/OutputStream;Ljava/lang/String;)V

    iget-wide v2, p0, Lc/a/a/w/e$a;->d:J

    invoke-static {p1, v2, v3}, Lc/a/a/w/e;->t(Ljava/io/OutputStream;J)V

    iget-wide v2, p0, Lc/a/a/w/e$a;->e:J

    invoke-static {p1, v2, v3}, Lc/a/a/w/e;->t(Ljava/io/OutputStream;J)V

    iget-wide v2, p0, Lc/a/a/w/e$a;->f:J

    invoke-static {p1, v2, v3}, Lc/a/a/w/e;->t(Ljava/io/OutputStream;J)V

    iget-wide v2, p0, Lc/a/a/w/e$a;->g:J

    invoke-static {p1, v2, v3}, Lc/a/a/w/e;->t(Ljava/io/OutputStream;J)V

    iget-object v0, p0, Lc/a/a/w/e$a;->h:Ljava/util/List;

    invoke-static {v0, p1}, Lc/a/a/w/e;->r(Ljava/util/List;Ljava/io/OutputStream;)V

    invoke-virtual {p1}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception p1

    new-array v0, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "%s"

    invoke-static {p1, v0}, Lc/a/a/v;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return v1
.end method
