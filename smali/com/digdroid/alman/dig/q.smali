.class Lcom/digdroid/alman/dig/q;
.super Ljava/lang/Object;
.source ""


# instance fields
.field a:Landroid/content/Context;

.field b:Lcom/digdroid/alman/dig/b3;

.field c:Lcom/digdroid/alman/dig/p;

.field d:Lcom/digdroid/alman/dig/p;

.field e:Lcom/digdroid/alman/dig/p;

.field f:Lcom/digdroid/alman/dig/p;

.field g:Lcom/digdroid/alman/dig/p;

.field h:Lcom/digdroid/alman/dig/p;

.field i:Lcom/digdroid/alman/dig/p;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/q;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/q;->b:Lcom/digdroid/alman/dig/b3;

    new-instance p1, Lcom/digdroid/alman/dig/o3;

    invoke-direct {p1}, Lcom/digdroid/alman/dig/o3;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/q;->c:Lcom/digdroid/alman/dig/p;

    new-instance p1, Lcom/digdroid/alman/dig/g0;

    invoke-direct {p1}, Lcom/digdroid/alman/dig/g0;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/q;->d:Lcom/digdroid/alman/dig/p;

    new-instance p1, Lcom/digdroid/alman/dig/w;

    invoke-direct {p1}, Lcom/digdroid/alman/dig/w;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/q;->i:Lcom/digdroid/alman/dig/p;

    new-instance p1, Lcom/digdroid/alman/dig/e;

    invoke-direct {p1, p2, p3}, Lcom/digdroid/alman/dig/e;-><init>(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteDatabase;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/q;->e:Lcom/digdroid/alman/dig/p;

    new-instance p1, Lcom/digdroid/alman/dig/d;

    invoke-direct {p1, p2, p3}, Lcom/digdroid/alman/dig/d;-><init>(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteDatabase;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/q;->f:Lcom/digdroid/alman/dig/p;

    new-instance p1, Lcom/digdroid/alman/dig/b2;

    invoke-direct {p1, p2, p3}, Lcom/digdroid/alman/dig/b2;-><init>(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteDatabase;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/q;->g:Lcom/digdroid/alman/dig/p;

    new-instance p1, Lcom/digdroid/alman/dig/c2;

    invoke-direct {p1, p2, p3}, Lcom/digdroid/alman/dig/c2;-><init>(Landroid/database/sqlite/SQLiteDatabase;Landroid/database/sqlite/SQLiteDatabase;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/q;->h:Lcom/digdroid/alman/dig/p;

    return-void
.end method


# virtual methods
.method a(I)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q;->b(I)Lcom/digdroid/alman/dig/p;

    move-result-object p1

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/p;->a()V

    return-void
.end method

.method public b(I)Lcom/digdroid/alman/dig/p;
    .locals 1

    const/16 v0, 0x20

    if-eq p1, v0, :cond_7

    const/16 v0, 0x40

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/q;->h:Lcom/digdroid/alman/dig/p;

    return-object p1

    :cond_1
    const/16 v0, 0x100

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lcom/digdroid/alman/dig/q;->e:Lcom/digdroid/alman/dig/p;

    return-object p1

    :cond_2
    const/16 v0, 0x8

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lcom/digdroid/alman/dig/q;->f:Lcom/digdroid/alman/dig/p;

    return-object p1

    :cond_3
    const/4 v0, 0x4

    if-ne p1, v0, :cond_4

    iget-object p1, p0, Lcom/digdroid/alman/dig/q;->d:Lcom/digdroid/alman/dig/p;

    return-object p1

    :cond_4
    const/16 v0, 0x200

    if-eq p1, v0, :cond_6

    const/16 v0, 0x1000

    if-ne p1, v0, :cond_5

    goto :goto_0

    :cond_5
    iget-object p1, p0, Lcom/digdroid/alman/dig/q;->c:Lcom/digdroid/alman/dig/p;

    return-object p1

    :cond_6
    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/q;->i:Lcom/digdroid/alman/dig/p;

    return-object p1

    :cond_7
    :goto_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/q;->g:Lcom/digdroid/alman/dig/p;

    return-object p1
.end method

.method c(ILjava/lang/String;JJLjava/lang/String;)Ljava/lang/String;
    .locals 8

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q;->b(I)Lcom/digdroid/alman/dig/p;

    move-result-object v0

    move v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-wide v5, p5

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lcom/digdroid/alman/dig/p;->c(ILjava/lang/String;JJLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method d(I)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/q;->b(I)Lcom/digdroid/alman/dig/p;

    move-result-object p1

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/p;->e()Z

    move-result p1

    return p1
.end method

.method e(IIJLjava/lang/String;)I
    .locals 2

    const/16 v0, 0x40

    if-ne p2, v0, :cond_0

    const/16 p2, 0x20

    :cond_0
    xor-int/lit8 v0, p2, -0x1

    and-int/2addr p1, v0

    and-int/lit8 v0, p1, 0x4

    if-eqz v0, :cond_2

    if-eqz p5, :cond_1

    const-string v0, ""

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_2

    :cond_1
    and-int/lit8 p1, p1, -0x5

    :cond_2
    and-int/lit8 p5, p1, 0x1

    const-wide/16 v0, 0x0

    if-eqz p5, :cond_3

    cmp-long p5, p3, v0

    if-gez p5, :cond_3

    and-int/lit8 p1, p1, -0x2

    :cond_3
    and-int/lit8 p5, p1, 0x2

    if-eqz p5, :cond_4

    cmp-long p5, p3, v0

    if-gez p5, :cond_4

    and-int/lit8 p1, p1, -0x3

    :cond_4
    const/16 p3, 0x1000

    if-ne p2, p3, :cond_5

    or-int/lit16 p1, p1, 0x2000

    :cond_5
    and-int/lit16 p2, p1, 0x1f7f

    if-eqz p2, :cond_6

    or-int/lit16 p1, p1, 0x4000

    :cond_6
    return p1
.end method

.method f()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/q;->c:Lcom/digdroid/alman/dig/p;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/p;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x3

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/q;->i:Lcom/digdroid/alman/dig/p;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/p;->e()Z

    move-result v1

    if-nez v1, :cond_1

    or-int/lit16 v0, v0, 0x1200

    :cond_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/q;->d:Lcom/digdroid/alman/dig/p;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/p;->e()Z

    move-result v1

    if-nez v1, :cond_2

    or-int/lit8 v0, v0, 0x4

    :cond_2
    iget-object v1, p0, Lcom/digdroid/alman/dig/q;->e:Lcom/digdroid/alman/dig/p;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/p;->e()Z

    move-result v1

    if-nez v1, :cond_3

    or-int/lit16 v0, v0, 0x100

    :cond_3
    iget-object v1, p0, Lcom/digdroid/alman/dig/q;->f:Lcom/digdroid/alman/dig/p;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/p;->e()Z

    move-result v1

    if-nez v1, :cond_4

    or-int/lit8 v0, v0, 0x8

    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "cover_status>=16384"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " AND (cover_status & "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")!=0 AND (ignored=0 OR system=\'android\') AND present=1"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method g(IJLjava/lang/String;)I
    .locals 8

    and-int/lit16 v0, p1, 0x1000

    const/16 v1, 0x8

    const/16 v2, 0x100

    const/4 v3, 0x4

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/16 v6, 0x200

    if-eqz v0, :cond_0

    and-int/lit16 v0, p1, 0x2000

    if-nez v0, :cond_0

    invoke-virtual {p0, v6}, Lcom/digdroid/alman/dig/q;->d(I)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v1, 0x1000

    goto :goto_0

    :cond_0
    and-int/lit16 v0, p1, 0x200

    if-eqz v0, :cond_1

    invoke-virtual {p0, v6}, Lcom/digdroid/alman/dig/q;->d(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v1, 0x200

    goto :goto_0

    :cond_1
    and-int/lit8 v0, p1, 0x1

    const-wide/16 v6, 0x0

    if-eqz v0, :cond_2

    cmp-long v0, p2, v6

    if-ltz v0, :cond_2

    invoke-virtual {p0, v5}, Lcom/digdroid/alman/dig/q;->d(I)Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_3

    cmp-long v0, p2, v6

    if-ltz v0, :cond_3

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/q;->d(I)Z

    move-result p2

    if-nez p2, :cond_3

    const/4 v1, 0x2

    goto :goto_0

    :cond_3
    and-int/lit8 p2, p1, 0x4

    if-eqz p2, :cond_4

    if-eqz p4, :cond_4

    const-string p2, ""

    invoke-virtual {p4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {p0, v3}, Lcom/digdroid/alman/dig/q;->d(I)Z

    move-result p2

    if-nez p2, :cond_4

    const/4 v1, 0x4

    goto :goto_0

    :cond_4
    and-int/lit16 p2, p1, 0x100

    if-eqz p2, :cond_5

    invoke-virtual {p0, v2}, Lcom/digdroid/alman/dig/q;->d(I)Z

    move-result p2

    if-nez p2, :cond_5

    const/16 v1, 0x100

    goto :goto_0

    :cond_5
    and-int/2addr p1, v1

    if-eqz p1, :cond_6

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/q;->d(I)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    :goto_0
    return v1
.end method
