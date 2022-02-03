.class Lcom/digdroid/alman/dig/s3;
.super Lcom/digdroid/alman/dig/n;
.source ""


# instance fields
.field f:Ljava/lang/String;

.field g:Lcom/digdroid/alman/dig/c3;

.field h:Lcom/digdroid/alman/dig/c4;

.field i:F

.field j:F

.field k:I

.field l:I

.field m:Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/c4;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/n;-><init>(Landroid/content/Context;)V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->i:F

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->j:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->k:I

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->l:I

    iput-object p1, p0, Lcom/digdroid/alman/dig/s3;->h:Lcom/digdroid/alman/dig/c4;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    invoke-static {p1}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    return-void
.end method

.method public constructor <init>(Lcom/digdroid/alman/dig/c4;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/n;-><init>(Landroid/content/Context;)V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->i:F

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->j:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->k:I

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->l:I

    iput-object p1, p0, Lcom/digdroid/alman/dig/s3;->h:Lcom/digdroid/alman/dig/c4;

    iput-object p2, p0, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    invoke-static {p1}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    return-void
.end method

.method public constructor <init>(Lcom/digdroid/alman/dig/s3;)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/n;-><init>(Lcom/digdroid/alman/dig/n;)V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->i:F

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->j:F

    const/4 v0, 0x0

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->k:I

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->l:I

    iget-object v0, p1, Lcom/digdroid/alman/dig/s3;->h:Lcom/digdroid/alman/dig/c4;

    iput-object v0, p0, Lcom/digdroid/alman/dig/s3;->h:Lcom/digdroid/alman/dig/c4;

    iget-object v0, p1, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    iput-object p1, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    return-void
.end method

.method public static J(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    const-string v0, ""

    :try_start_0
    invoke-static {p0}, Lcom/digdroid/alman/dig/s3;->K(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :catch_0
    :goto_0
    return-object v0
.end method

.method public static K(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object v1

    const-string v2, "theme_storage"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v2

    if-nez v2, :cond_1

    const-string p0, "theme_storage_dir"

    invoke-virtual {v1, p0, v0}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object p0

    const/4 v1, 0x2

    const-string v4, "/Themes"

    if-ne v2, v1, :cond_2

    if-eqz p0, :cond_2

    array-length v1, p0

    if-le v1, v3, :cond_2

    aget-object v1, p0, v3

    if-eqz v1, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    aget-object p0, p0, v3

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    if-eqz p0, :cond_3

    array-length v1, p0

    if-lez v1, :cond_3

    const/4 v1, 0x0

    aget-object v2, p0, v1

    if-eqz v2, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    aget-object p0, p0, v1

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    return-object v0
.end method

.method private v(Ljava/io/File;)V
    .locals 5

    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-direct {p0, v3}, Lcom/digdroid/alman/dig/s3;->v(Ljava/io/File;)V

    goto :goto_1

    :cond_1
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    return-void
.end method


# virtual methods
.method A(Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    const-string v2, "true"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v1, p1, v0}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method

.method B(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {v1, p1, v0}, Lcom/digdroid/alman/dig/c3;->D(Ljava/lang/String;F)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public C()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/n;->a:Landroid/content/Context;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/Themes"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_2

    :try_start_0
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    return-object v1

    :cond_2
    :goto_0
    return-object v0
.end method

.method D(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v1, p1, v0}, Lcom/digdroid/alman/dig/c3;->E(Ljava/lang/String;I)V

    :cond_0
    return-void
.end method

.method public E(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 3

    const-string v0, "default"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lcom/digdroid/alman/dig/n;->f(Ljava/lang/String;I)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/digdroid/alman/dig/n;->f(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public F(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 3

    const-string v0, "default"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lcom/digdroid/alman/dig/n;->g(Ljava/lang/String;I)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0, p2, p3}, Lcom/digdroid/alman/dig/n;->g(Ljava/lang/String;I)I

    move-result p1

    return p1
.end method

.method public G(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "default"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/s3;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/digdroid/alman/dig/s3;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "default"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p0, p2}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public I(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/n;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/digdroid/alman/dig/s3;->J(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/s3;->c0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_2
    :goto_0
    return-object p1
.end method

.method L(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1, p1, v0}, Lcom/digdroid/alman/dig/c3;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public M(Ljava/lang/String;Lcom/digdroid/alman/dig/t3;)V
    .locals 10

    iget-object v0, p0, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    iput-object v0, p2, Lcom/digdroid/alman/dig/t3;->j:Ljava/lang/String;

    const-string v0, "name"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/digdroid/alman/dig/t3;->k:Ljava/lang/String;

    const-string v0, "toolbar_text"

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/n;->f(Ljava/lang/String;I)I

    move-result v0

    iput v0, p2, Lcom/digdroid/alman/dig/t3;->b:I

    const-string v0, "toolbar"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/digdroid/alman/dig/t3;->r:Ljava/lang/String;

    const-string v0, "tool_icons"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/digdroid/alman/dig/t3;->s:Ljava/lang/String;

    const-string v0, "default_covers"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/digdroid/alman/dig/t3;->v:Ljava/lang/String;

    const-string v0, "cover_background"

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v2}, Lcom/digdroid/alman/dig/n;->f(Ljava/lang/String;I)I

    move-result v3

    iput v3, p2, Lcom/digdroid/alman/dig/t3;->d:I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const-string v3, "systems"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const-string v5, "home"

    if-nez v4, :cond_0

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "_icons"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/s3;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p2, Lcom/digdroid/alman/dig/t3;->t:Ljava/lang/String;

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v4

    const/4 v6, 0x2

    const/4 v7, 0x1

    const-string v8, "game"

    sparse-switch v4, :sswitch_data_0

    :goto_1
    const/4 v4, -0x1

    goto :goto_2

    :sswitch_0
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v4, 0x2

    goto :goto_2

    :sswitch_1
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    const/4 v4, 0x1

    goto :goto_2

    :sswitch_2
    const-string v4, "gameinfo"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_2
    packed-switch v4, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "_system_backgrounds"

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/s3;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p2, Lcom/digdroid/alman/dig/t3;->u:Ljava/lang/String;

    :goto_3
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p0, v0, v2}, Lcom/digdroid/alman/dig/n;->f(Ljava/lang/String;I)I

    move-result v0

    iput v0, p2, Lcom/digdroid/alman/dig/t3;->d:I

    :cond_4
    const-string v0, "media"

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/s3;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/digdroid/alman/dig/t3;->l:Ljava/lang/String;

    const-string v0, "media_path"

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/s3;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/digdroid/alman/dig/t3;->m:Ljava/lang/String;

    const-string v0, "zoom"

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/s3;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/digdroid/alman/dig/t3;->p:Ljava/lang/String;

    const/16 v0, 0x1388

    const-string v4, "image_time"

    invoke-virtual {p0, p1, v4, v0}, Lcom/digdroid/alman/dig/s3;->F(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    iput v0, p2, Lcom/digdroid/alman/dig/t3;->x:I

    const-string v0, "sound"

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/s3;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/digdroid/alman/dig/t3;->n:Ljava/lang/String;

    const-string v0, "sound_path"

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/s3;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/digdroid/alman/dig/t3;->o:Ljava/lang/String;

    const-string v0, "foreground"

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/s3;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/digdroid/alman/dig/t3;->w:Ljava/lang/String;

    const-string v0, "background"

    invoke-virtual {p0, p1, v0, v2}, Lcom/digdroid/alman/dig/s3;->E(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    iput v0, p2, Lcom/digdroid/alman/dig/t3;->c:I

    const-string v0, "play_button"

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/s3;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p2, Lcom/digdroid/alman/dig/t3;->q:Ljava/lang/String;

    const-string v0, "text1"

    invoke-virtual {p0, p1, v0, v1}, Lcom/digdroid/alman/dig/s3;->E(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    iput v0, p2, Lcom/digdroid/alman/dig/t3;->e:I

    const-string v0, "text2"

    invoke-virtual {p0, p1, v0, v1}, Lcom/digdroid/alman/dig/s3;->E(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    iput v0, p2, Lcom/digdroid/alman/dig/t3;->f:I

    const-string v0, "text3"

    invoke-virtual {p0, p1, v0, v1}, Lcom/digdroid/alman/dig/s3;->E(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    iput v0, p2, Lcom/digdroid/alman/dig/t3;->g:I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_1

    :goto_4
    const/4 v2, -0x1

    goto :goto_5

    :sswitch_3
    const-string v0, "collections"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    const/4 v2, 0x4

    goto :goto_5

    :sswitch_4
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    const/4 v2, 0x3

    goto :goto_5

    :sswitch_5
    invoke-virtual {p1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    const/4 v2, 0x2

    goto :goto_5

    :sswitch_6
    const-string v0, "genres"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_4

    :cond_8
    const/4 v2, 0x1

    goto :goto_5

    :sswitch_7
    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_4

    :cond_9
    :goto_5
    packed-switch v2, :pswitch_data_1

    goto :goto_6

    :pswitch_1
    const-string v0, "gradient1"

    invoke-virtual {p0, p1, v0, v1}, Lcom/digdroid/alman/dig/s3;->E(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v0

    iput v0, p2, Lcom/digdroid/alman/dig/t3;->h:I

    const-string v0, "gradient2"

    invoke-virtual {p0, p1, v0, v1}, Lcom/digdroid/alman/dig/s3;->E(Ljava/lang/String;Ljava/lang/String;I)I

    move-result p1

    iput p1, p2, Lcom/digdroid/alman/dig/t3;->i:I

    :goto_6
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x69699860 -> :sswitch_2
        -0x678e2bdc -> :sswitch_1
        0x304bf2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x678e2bdc -> :sswitch_7
        -0x4a79d8b0 -> :sswitch_6
        0x304bf2 -> :sswitch_5
        0x30f4df -> :sswitch_4
        0x6e802595 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method N()V
    .locals 5

    const-string v0, "theme_density"

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/n;->e(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->i:F

    const-string v0, "theme_scaled_density"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/n;->e(Ljava/lang/String;F)F

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->j:F

    const-string v0, "theme_width"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/n;->g(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->k:I

    const-string v0, "theme_height"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/n;->g(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/s3;->l:I

    iget-object v0, p0, Lcom/digdroid/alman/dig/s3;->h:Lcom/digdroid/alman/dig/c4;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/digdroid/alman/dig/c4;->g(Z)Landroid/graphics/Point;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/s3;->m:Landroid/graphics/Point;

    iget-object v0, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    const-string v3, "new_theme_set"

    invoke-virtual {v0, v3, v2}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    const/high16 v2, -0x40800000    # -1.0f

    const-string v4, "theme_aspect_ratio"

    invoke-virtual {p0, v4, v2}, Lcom/digdroid/alman/dig/n;->e(Ljava/lang/String;F)F

    move-result v2

    const-string v4, "main_aspect_ratio"

    invoke-virtual {v0, v4, v2}, Lcom/digdroid/alman/dig/c3;->D(Ljava/lang/String;F)V

    const-string v0, "game"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->O(Ljava/lang/String;)V

    const-string v0, "systems"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->O(Ljava/lang/String;)V

    const-string v0, "home"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->O(Ljava/lang/String;)V

    const-string v0, "genres"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->O(Ljava/lang/String;)V

    const-string v0, "collections"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->O(Ljava/lang/String;)V

    const-string v0, "themes"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->O(Ljava/lang/String;)V

    const-string v0, "editthemes_toolbar"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->L(Ljava/lang/String;)V

    const-string v0, "splash_toolbar"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->L(Ljava/lang/String;)V

    const-string v0, "announcements_toolbar"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->L(Ljava/lang/String;)V

    const-string v0, "gamepad_toolbar"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->L(Ljava/lang/String;)V

    const-string v0, "notes_toolbar"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->L(Ljava/lang/String;)V

    const-string v0, "options_toolbar"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->L(Ljava/lang/String;)V

    const-string v0, "webpage_toolbar"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->L(Ljava/lang/String;)V

    const-string v0, "themes_toolbar"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->L(Ljava/lang/String;)V

    const-string v0, "icons_toolbar_scale"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    const-string v0, "toolbar_icon_scale"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    const-string v0, "toolbar_icons_padding"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    const-string v0, "games_preview_enabled"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->A(Ljava/lang/String;)V

    const-string v0, "games_preview_lines"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->D(Ljava/lang/String;)V

    const-string v0, "games_preview_play"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->A(Ljava/lang/String;)V

    const-string v0, "games_preview_play_mobile"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->A(Ljava/lang/String;)V

    const-string v0, "games_preview_size"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->D(Ljava/lang/String;)V

    const-string v0, "games_preview_padding"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->D(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v0, v3, v1}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    return-void
.end method

.method O(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_toolbar"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->L(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_list_type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->L(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_block_size"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_list_scale"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_list_spacing"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_title_scale"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_title_spacing"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_vertical_scale"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_vertical_spacing"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_carousel_scale"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_carousel_spacing"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_coverflow_scale"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_coverflow_spacing"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_wheel_scale"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_wheel_spacing"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_linear_scale"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_linear_spacing"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_8bit"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->A(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_icons_only"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->A(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_aspect_ratio"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/s3;->B(Ljava/lang/String;)V

    return-void
.end method

.method public P(Ljava/lang/String;)Z
    .locals 3

    iput-object p1, p0, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/s3;->C()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/n;->a:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/digdroid/alman/dig/i2;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;

    move-result-object p1

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/n;->k(Lcom/digdroid/alman/dig/i2;)V

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/n;->b:Ljava/lang/String;

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/n;->l()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/s3;->d0()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/s3;->N()V

    const/4 p1, 0x1

    return p1
.end method

.method public Q()V
    .locals 3

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/s3;->C()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/n;->a:Landroid/content/Context;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/___tmp.cfg"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/digdroid/alman/dig/i2;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/digdroid/alman/dig/n;->k(Lcom/digdroid/alman/dig/i2;)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/n;->l()V

    :try_start_0
    invoke-virtual {v0}, Lcom/digdroid/alman/dig/i2;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public declared-synchronized R()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s3;->S(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized S(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/s3;->C()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/s3;->Y()V

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/n;->r(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public T()V
    .locals 2

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/s3;->C()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/___tmp.cfg"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lcom/digdroid/alman/dig/n;->r(Ljava/lang/String;)Z

    :cond_0
    return-void
.end method

.method U(Ljava/lang/String;Z)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v0, p1, p2}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "true"

    goto :goto_0

    :cond_0
    const-string p2, "false"

    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method V(Ljava/lang/String;F)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1, p1, p2}, Lcom/digdroid/alman/dig/c3;->f(Ljava/lang/String;F)F

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method W(Ljava/lang/String;I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1, p1, p2}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method X(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v0, p1, p2}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method Y()V
    .locals 3

    const-string v0, "game"

    const-string v1, "grid"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->Z(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "systems"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->Z(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "home"

    const-string v1, "title"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->Z(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "genres"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->Z(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "collections"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->Z(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "themes"

    const-string v1, "coverflow"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->Z(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "editthemes_toolbar"

    const-string v1, "default"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->X(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "splash_toolbar"

    const-string v2, "none"

    invoke-virtual {p0, v0, v2}, Lcom/digdroid/alman/dig/s3;->X(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "announcements_toolbar"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->X(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "gamepad_toolbar"

    invoke-virtual {p0, v0, v2}, Lcom/digdroid/alman/dig/s3;->X(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "notes_toolbar"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->X(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "options_toolbar"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->X(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "webpage_toolbar"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->X(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "themes_toolbar"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->X(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "icons_toolbar_scale"

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    const-string v0, "toolbar_icon_spacing"

    const v1, 0x3da3d70a

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    const-string v0, "toolbar_icons_padding"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    const-string v0, "games_preview_enabled"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->U(Ljava/lang/String;Z)V

    const-string v0, "games_preview_lines"

    const/4 v2, 0x3

    invoke-virtual {p0, v0, v2}, Lcom/digdroid/alman/dig/s3;->W(Ljava/lang/String;I)V

    const-string v0, "games_preview_play"

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2}, Lcom/digdroid/alman/dig/s3;->U(Ljava/lang/String;Z)V

    const-string v0, "games_preview_play_mobile"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->U(Ljava/lang/String;Z)V

    const-string v0, "games_preview_size"

    const/16 v1, 0x32

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->W(Ljava/lang/String;I)V

    const-string v0, "games_preview_padding"

    const/4 v1, 0x5

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->W(Ljava/lang/String;I)V

    return-void
.end method

.method Z(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_toolbar"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "default"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/s3;->X(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_list_type"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lcom/digdroid/alman/dig/s3;->X(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_block_size"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/high16 v0, 0x432a0000    # 170.0f

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_list_scale"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_list_spacing"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_title_scale"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_title_spacing"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_vertical_scale"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_vertical_spacing"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_carousel_scale"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_carousel_spacing"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_coverflow_scale"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_coverflow_spacing"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_wheel_scale"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_wheel_spacing"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_linear_scale"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_linear_spacing"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_8bit"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x1

    invoke-virtual {p0, p2, v1}, Lcom/digdroid/alman/dig/s3;->U(Ljava/lang/String;Z)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_icons_only"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {p0, p2, v1}, Lcom/digdroid/alman/dig/s3;->U(Ljava/lang/String;Z)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "_aspect_ratio"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/s3;->V(Ljava/lang/String;F)V

    return-void
.end method

.method a0()V
    .locals 5

    const-string v0, "zoom"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "fillscreen"

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const-string v0, "collections1"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v3, "genres2"

    const-string v4, "genres1"

    if-eqz v1, :cond_1

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "collections2"

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    const-string v0, "games1"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "games2"

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    const-string v0, "systems1"

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v3}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "systems2"

    invoke-virtual {p0, v1, v0}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method b0(F)F
    .locals 2

    iget v0, p0, Lcom/digdroid/alman/dig/s3;->l:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/n;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->scaledDensity:F

    mul-float p1, p1, v0

    return p1

    :cond_0
    iget v1, p0, Lcom/digdroid/alman/dig/s3;->j:F

    mul-float p1, p1, v1

    int-to-float v0, v0

    div-float/2addr p1, v0

    iget-object v0, p0, Lcom/digdroid/alman/dig/s3;->m:Landroid/graphics/Point;

    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    mul-float v0, v0, p1

    return v0
.end method

.method c0()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "<theme-name>"

    return-object v0

    :cond_0
    const/16 v1, 0x2e

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-lez v0, :cond_1

    iget-object v1, p0, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".dir"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method d0()V
    .locals 8

    const-string v0, "version"

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/n;->g(Ljava/lang/String;I)I

    move-result v2

    const/16 v3, 0xd

    if-lt v2, v3, :cond_0

    return-void

    :cond_0
    iget-object v4, p0, Lcom/digdroid/alman/dig/s3;->g:Lcom/digdroid/alman/dig/c3;

    const-string v5, "new_theme_set"

    invoke-virtual {v4, v5, v1}, Lcom/digdroid/alman/dig/c3;->B(Ljava/lang/String;Z)V

    const/4 v1, 0x2

    if-ge v2, v1, :cond_1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/s3;->a0()V

    const-string v1, "system_icons"

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "systems_icons"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    const-string v1, "system_backgrounds"

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "systems_system_backgrounds"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    const-string v1, "other_text"

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "text1"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "game_title"

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "text2"

    invoke-virtual {p0, v6, v5}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "game_info"

    invoke-virtual {p0, v5}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "text3"

    invoke-virtual {p0, v7, v6}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    invoke-virtual {p0, v5}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    const-string v1, "labels"

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "systems_text1"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "systems_text2"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "game_text1"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "game_text2"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "genres_text1"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "genres_text2"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "home_text1"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "home_text2"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "collections_text1"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "collections_text2"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    const-string v1, "main1"

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "home_gradient1"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "main2"

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "home_gradient2"

    invoke-virtual {p0, v6, v5}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    const-string v1, "genres1"

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "genres_gradient1"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "genres2"

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "genres_gradient2"

    invoke-virtual {p0, v6, v5}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    const-string v1, "collections1"

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "collections_gradient1"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "collections2"

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "collections_gradient2"

    invoke-virtual {p0, v6, v5}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    const-string v1, "games1"

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "game_gradient1"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "games2"

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "game_gradient2"

    invoke-virtual {p0, v6, v5}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    const-string v1, "systems1"

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "systems_gradient1"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "systems2"

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "systems_gradient2"

    invoke-virtual {p0, v6, v5}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/n;->a(Ljava/lang/String;)V

    :cond_1
    const/4 v1, 0x3

    if-ge v2, v1, :cond_2

    const-string v4, "games_preview_enabled"

    const-string v5, "false"

    invoke-virtual {p0, v4, v5}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "games_preview_play"

    const-string v6, "true"

    invoke-virtual {p0, v4, v6}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "games_preview_play_mobile"

    invoke-virtual {p0, v4, v5}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "games_preview_size"

    const-string v5, "50"

    invoke-virtual {p0, v4, v5}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "games_preview_padding"

    const-string v5, "5"

    invoke-virtual {p0, v4, v5}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    const/4 v4, 0x4

    if-ge v2, v4, :cond_3

    const/high16 v4, -0x40800000    # -1.0f

    const-string v5, "theme_aspect_ratio"

    invoke-virtual {p0, v5, v4}, Lcom/digdroid/alman/dig/n;->n(Ljava/lang/String;F)V

    :cond_3
    const/4 v4, 0x5

    if-ge v2, v4, :cond_4

    const-string v4, "games_preview_lines"

    invoke-virtual {p0, v4, v1}, Lcom/digdroid/alman/dig/n;->p(Ljava/lang/String;I)V

    :cond_4
    const/4 v1, 0x6

    const/4 v4, 0x0

    if-ge v2, v1, :cond_5

    const-string v1, "theme_width"

    invoke-virtual {p0, v1, v4}, Lcom/digdroid/alman/dig/n;->p(Ljava/lang/String;I)V

    const-string v1, "theme_height"

    invoke-virtual {p0, v1, v4}, Lcom/digdroid/alman/dig/n;->p(Ljava/lang/String;I)V

    const/high16 v1, 0x3f800000    # 1.0f

    const-string v5, "theme_density"

    invoke-virtual {p0, v5, v1}, Lcom/digdroid/alman/dig/n;->n(Ljava/lang/String;F)V

    :cond_5
    if-ge v2, v3, :cond_6

    const v1, 0x3fe38e39

    const-string v2, "themes_aspect_ratio"

    invoke-virtual {p0, v2, v1}, Lcom/digdroid/alman/dig/n;->n(Ljava/lang/String;F)V

    :cond_6
    invoke-virtual {p0, v0, v3}, Lcom/digdroid/alman/dig/n;->p(Ljava/lang/String;I)V

    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/s3;->S(Z)V

    return-void
.end method

.method public j(Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x2f

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/n;->j(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/n;->l()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/s3;->d0()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/s3;->N()V

    return-void
.end method

.method public u()V
    .locals 4

    const-string v0, "/"

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/s3;->C()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    :try_start_0
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/digdroid/alman/dig/n;->a:Landroid/content/Context;

    invoke-static {v3}, Lcom/digdroid/alman/dig/s3;->J(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/s3;->c0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v1}, Lcom/digdroid/alman/dig/s3;->v(Ljava/io/File;)V

    :cond_0
    return-void
.end method

.method w(FII)F
    .locals 1

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/n;->a:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    mul-float p1, p1, p2

    return p1

    :cond_0
    iget v0, p0, Lcom/digdroid/alman/dig/s3;->i:F

    mul-float p1, p1, v0

    int-to-float p2, p2

    div-float/2addr p1, p2

    int-to-float p2, p3

    mul-float p2, p2, p1

    return p2
.end method

.method x(F)F
    .locals 2

    iget v0, p0, Lcom/digdroid/alman/dig/s3;->k:I

    iget-object v1, p0, Lcom/digdroid/alman/dig/s3;->m:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->x:I

    invoke-virtual {p0, p1, v0, v1}, Lcom/digdroid/alman/dig/s3;->w(FII)F

    move-result p1

    return p1
.end method

.method y(F)F
    .locals 2

    iget v0, p0, Lcom/digdroid/alman/dig/s3;->l:I

    iget-object v1, p0, Lcom/digdroid/alman/dig/s3;->m:Landroid/graphics/Point;

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-virtual {p0, p1, v0, v1}, Lcom/digdroid/alman/dig/s3;->w(FII)F

    move-result p1

    return p1
.end method

.method public z()Z
    .locals 3

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/s3;->C()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
