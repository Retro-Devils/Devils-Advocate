.class public Lcom/digdroid/alman/dig/x3;
.super Lcom/digdroid/alman/dig/n;
.source ""


# static fields
.field private static f:Lcom/digdroid/alman/dig/x3;


# instance fields
.field private g:I

.field private h:I

.field i:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field j:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/n;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/x3;->z()V

    return-void
.end method

.method private A(Ljava/io/File;)V
    .locals 7

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-direct {p0, v2}, Lcom/digdroid/alman/dig/x3;->A(Ljava/io/File;)V

    goto :goto_1

    :cond_1
    iget-wide v3, p0, Lcom/digdroid/alman/dig/x3;->j:J

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v5

    add-long/2addr v3, v5

    iput-wide v3, p0, Lcom/digdroid/alman/dig/x3;->j:J

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private B()V
    .locals 7

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/x3;->j:J

    invoke-direct {p0}, Lcom/digdroid/alman/dig/x3;->w()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_4

    aget-object v4, v0, v3

    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v5, p0, Lcom/digdroid/alman/dig/x3;->i:Ljava/util/HashSet;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-direct {p0, v4}, Lcom/digdroid/alman/dig/x3;->A(Ljava/io/File;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v4, v2}, Lcom/digdroid/alman/dig/x3;->v(Ljava/io/File;Z)V

    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method private C()V
    .locals 3

    invoke-direct {p0}, Lcom/digdroid/alman/dig/x3;->x()Ljava/io/File;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/x3;->k(Ljava/io/File;)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/x3;->l()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/x3;->i:Ljava/util/HashSet;

    const-string v0, "first_game"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/x3;->g(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/x3;->g:I

    const-string v0, "last_game"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/x3;->g(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/x3;->h:I

    iget v0, p0, Lcom/digdroid/alman/dig/x3;->g:I

    :goto_0
    iget v1, p0, Lcom/digdroid/alman/dig/x3;->h:I

    if-gt v0, v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/digdroid/alman/dig/x3;->i:Ljava/util/HashSet;

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private E()V
    .locals 2

    iget v0, p0, Lcom/digdroid/alman/dig/x3;->g:I

    const-string v1, "first_game"

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/x3;->p(Ljava/lang/String;I)V

    iget v0, p0, Lcom/digdroid/alman/dig/x3;->h:I

    const-string v1, "last_game"

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/x3;->p(Ljava/lang/String;I)V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/x3;->x()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/x3;->r(Ljava/lang/String;)Z

    return-void
.end method

.method private w()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/n;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/digdroid/alman/dig/z3;->y(Landroid/content/Context;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private x()Ljava/io/File;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/n;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/io/File;

    const-string v2, "unzippedgames.txt"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static declared-synchronized y(Landroid/content/Context;)Lcom/digdroid/alman/dig/x3;
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/x3;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/digdroid/alman/dig/x3;->f:Lcom/digdroid/alman/dig/x3;

    if-nez v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/x3;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/x3;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/digdroid/alman/dig/x3;->f:Lcom/digdroid/alman/dig/x3;

    :cond_0
    sget-object p0, Lcom/digdroid/alman/dig/x3;->f:Lcom/digdroid/alman/dig/x3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public declared-synchronized D(J)V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/n;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    const-string v1, "game_cache_size"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->l(Ljava/lang/String;I)I

    move-result v0

    mul-int/lit16 v0, v0, 0x400

    int-to-long v0, v0

    const-wide/16 v3, 0x400

    mul-long v0, v0, v3

    const/4 v3, 0x1

    :goto_0
    iget-wide v4, p0, Lcom/digdroid/alman/dig/x3;->j:J

    add-long/2addr v4, p1

    cmp-long v6, v4, v0

    if-lez v6, :cond_1

    iget v4, p0, Lcom/digdroid/alman/dig/x3;->g:I

    iget v5, p0, Lcom/digdroid/alman/dig/x3;->h:I

    if-gt v4, v5, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/digdroid/alman/dig/x3;->g:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v4, ""

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/x3;->w()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v4, v3}, Lcom/digdroid/alman/dig/x3;->v(Ljava/io/File;Z)V

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Lcom/digdroid/alman/dig/x3;->g:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/digdroid/alman/dig/x3;->a(Ljava/lang/String;)V

    iget v2, p0, Lcom/digdroid/alman/dig/x3;->g:I

    add-int/2addr v2, v3

    iput v2, p0, Lcom/digdroid/alman/dig/x3;->g:I

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    if-eqz v2, :cond_2

    invoke-direct {p0}, Lcom/digdroid/alman/dig/x3;->E()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public bridge synthetic a(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic d()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/n;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g(Ljava/lang/String;I)I
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/digdroid/alman/dig/n;->g(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic j(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/n;->j(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic k(Ljava/io/File;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/n;->k(Ljava/io/File;)V

    return-void
.end method

.method public bridge synthetic l()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/n;->l()V

    return-void
.end method

.method public bridge synthetic p(Ljava/lang/String;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/digdroid/alman/dig/n;->p(Ljava/lang/String;I)V

    return-void
.end method

.method public bridge synthetic r(Ljava/lang/String;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/n;->r(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic s(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized u(Ljava/lang/String;J)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/x3;->i:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/digdroid/alman/dig/x3;->g:I

    :goto_0
    iget v1, p0, Lcom/digdroid/alman/dig/x3;->h:I

    if-gt v0, v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget p2, p0, Lcom/digdroid/alman/dig/x3;->h:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lcom/digdroid/alman/dig/x3;->h:I

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p0, Lcom/digdroid/alman/dig/x3;->h:I

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, Lcom/digdroid/alman/dig/x3;->s(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, ""

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/x3;->a(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/x3;->E()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :try_start_1
    iget v0, p0, Lcom/digdroid/alman/dig/x3;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/digdroid/alman/dig/x3;->h:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/digdroid/alman/dig/x3;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/x3;->s(Ljava/lang/String;Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/digdroid/alman/dig/x3;->j:J

    add-long/2addr v0, p2

    iput-wide v0, p0, Lcom/digdroid/alman/dig/x3;->j:J

    iget-object p2, p0, Lcom/digdroid/alman/dig/x3;->i:Ljava/util/HashSet;

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-direct {p0}, Lcom/digdroid/alman/dig/x3;->E()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public declared-synchronized v(Ljava/io/File;Z)V
    .locals 8

    monitor-enter p0

    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/x3;->v(Ljava/io/File;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_1
    :try_start_2
    invoke-virtual {v3}, Ljava/io/File;->length()J

    move-result-wide v4

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    if-eqz p2, :cond_2

    iget-wide v6, p0, Lcom/digdroid/alman/dig/x3;->j:J

    sub-long/2addr v6, v4

    iput-wide v6, p0, Lcom/digdroid/alman/dig/x3;->j:J
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catch_0
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :try_start_3
    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method

.method public z()V
    .locals 2

    invoke-direct {p0}, Lcom/digdroid/alman/dig/x3;->C()V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/x3;->B()V

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/x3;->D(J)V

    return-void
.end method
