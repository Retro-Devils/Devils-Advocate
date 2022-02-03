.class final Lcom/bumptech/glide/load/p/y/e$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/bumptech/glide/load/n/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/p/y/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/n/d<",
        "TDataT;>;"
    }
.end annotation


# static fields
.field private static final b:[Ljava/lang/String;


# instance fields
.field private final c:Landroid/content/Context;

.field private final d:Lcom/bumptech/glide/load/p/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/p/n<",
            "Ljava/io/File;",
            "TDataT;>;"
        }
    .end annotation
.end field

.field private final e:Lcom/bumptech/glide/load/p/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/p/n<",
            "Landroid/net/Uri;",
            "TDataT;>;"
        }
    .end annotation
.end field

.field private final f:Landroid/net/Uri;

.field private final g:I

.field private final h:I

.field private final i:Lcom/bumptech/glide/load/i;

.field private final j:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TDataT;>;"
        }
    .end annotation
.end field

.field private volatile k:Z

.field private volatile l:Lcom/bumptech/glide/load/n/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/load/n/d<",
            "TDataT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "_data"

    aput-object v2, v0, v1

    sput-object v0, Lcom/bumptech/glide/load/p/y/e$d;->b:[Ljava/lang/String;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/load/p/n;Lcom/bumptech/glide/load/p/n;Landroid/net/Uri;IILcom/bumptech/glide/load/i;Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/load/p/n<",
            "Ljava/io/File;",
            "TDataT;>;",
            "Lcom/bumptech/glide/load/p/n<",
            "Landroid/net/Uri;",
            "TDataT;>;",
            "Landroid/net/Uri;",
            "II",
            "Lcom/bumptech/glide/load/i;",
            "Ljava/lang/Class<",
            "TDataT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/bumptech/glide/load/p/y/e$d;->c:Landroid/content/Context;

    iput-object p2, p0, Lcom/bumptech/glide/load/p/y/e$d;->d:Lcom/bumptech/glide/load/p/n;

    iput-object p3, p0, Lcom/bumptech/glide/load/p/y/e$d;->e:Lcom/bumptech/glide/load/p/n;

    iput-object p4, p0, Lcom/bumptech/glide/load/p/y/e$d;->f:Landroid/net/Uri;

    iput p5, p0, Lcom/bumptech/glide/load/p/y/e$d;->g:I

    iput p6, p0, Lcom/bumptech/glide/load/p/y/e$d;->h:I

    iput-object p7, p0, Lcom/bumptech/glide/load/p/y/e$d;->i:Lcom/bumptech/glide/load/i;

    iput-object p8, p0, Lcom/bumptech/glide/load/p/y/e$d;->j:Ljava/lang/Class;

    return-void
.end method

.method private d()Lcom/bumptech/glide/load/p/n$a;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/p/n$a<",
            "TDataT;>;"
        }
    .end annotation

    invoke-static {}, Landroid/os/Environment;->isExternalStorageLegacy()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/load/p/y/e$d;->d:Lcom/bumptech/glide/load/p/n;

    iget-object v1, p0, Lcom/bumptech/glide/load/p/y/e$d;->f:Landroid/net/Uri;

    invoke-direct {p0, v1}, Lcom/bumptech/glide/load/p/y/e$d;->h(Landroid/net/Uri;)Ljava/io/File;

    move-result-object v1

    iget v2, p0, Lcom/bumptech/glide/load/p/y/e$d;->g:I

    iget v3, p0, Lcom/bumptech/glide/load/p/y/e$d;->h:I

    iget-object v4, p0, Lcom/bumptech/glide/load/p/y/e$d;->i:Lcom/bumptech/glide/load/i;

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/bumptech/glide/load/p/n;->a(Ljava/lang/Object;IILcom/bumptech/glide/load/i;)Lcom/bumptech/glide/load/p/n$a;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/bumptech/glide/load/p/y/e$d;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/bumptech/glide/load/p/y/e$d;->f:Landroid/net/Uri;

    invoke-static {v0}, Landroid/provider/MediaStore;->setRequireOriginal(Landroid/net/Uri;)Landroid/net/Uri;

    move-result-object v0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/load/p/y/e$d;->f:Landroid/net/Uri;

    :goto_0
    iget-object v1, p0, Lcom/bumptech/glide/load/p/y/e$d;->e:Lcom/bumptech/glide/load/p/n;

    iget v2, p0, Lcom/bumptech/glide/load/p/y/e$d;->g:I

    iget v3, p0, Lcom/bumptech/glide/load/p/y/e$d;->h:I

    iget-object v4, p0, Lcom/bumptech/glide/load/p/y/e$d;->i:Lcom/bumptech/glide/load/i;

    invoke-interface {v1, v0, v2, v3, v4}, Lcom/bumptech/glide/load/p/n;->a(Ljava/lang/Object;IILcom/bumptech/glide/load/i;)Lcom/bumptech/glide/load/p/n$a;

    move-result-object v0

    return-object v0
.end method

.method private f()Lcom/bumptech/glide/load/n/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/bumptech/glide/load/n/d<",
            "TDataT;>;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/bumptech/glide/load/p/y/e$d;->d()Lcom/bumptech/glide/load/p/n$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/bumptech/glide/load/p/n$a;->c:Lcom/bumptech/glide/load/n/d;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method private g()Z
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/load/p/y/e$d;->c:Landroid/content/Context;

    const-string v1, "android.permission.ACCESS_MEDIA_LOCATION"

    invoke-virtual {v0, v1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private h(Landroid/net/Uri;)Ljava/io/File;
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/bumptech/glide/load/p/y/e$d;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    sget-object v4, Lcom/bumptech/glide/load/p/y/e$d;->b:[Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "_data"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndexOrThrow(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance p1, Ljava/io/File;

    invoke-direct {p1, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-object p1

    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/FileNotFoundException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "File path was empty in media store for: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/io/FileNotFoundException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to media store entry for: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_2
    throw p1
.end method


# virtual methods
.method public a()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TDataT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/bumptech/glide/load/p/y/e$d;->j:Ljava/lang/Class;

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/bumptech/glide/load/p/y/e$d;->l:Lcom/bumptech/glide/load/n/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/bumptech/glide/load/n/d;->b()V

    :cond_0
    return-void
.end method

.method public c()Lcom/bumptech/glide/load/a;
    .locals 1

    sget-object v0, Lcom/bumptech/glide/load/a;->b:Lcom/bumptech/glide/load/a;

    return-object v0
.end method

.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/bumptech/glide/load/p/y/e$d;->k:Z

    iget-object v0, p0, Lcom/bumptech/glide/load/p/y/e$d;->l:Lcom/bumptech/glide/load/n/d;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/bumptech/glide/load/n/d;->cancel()V

    :cond_0
    return-void
.end method

.method public e(Lcom/bumptech/glide/g;Lcom/bumptech/glide/load/n/d$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/g;",
            "Lcom/bumptech/glide/load/n/d$a<",
            "-TDataT;>;)V"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0}, Lcom/bumptech/glide/load/p/y/e$d;->f()Lcom/bumptech/glide/load/n/d;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to build fetcher for: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/bumptech/glide/load/p/y/e$d;->f:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/n/d$a;->d(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iput-object v0, p0, Lcom/bumptech/glide/load/p/y/e$d;->l:Lcom/bumptech/glide/load/n/d;

    iget-boolean v1, p0, Lcom/bumptech/glide/load/p/y/e$d;->k:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/bumptech/glide/load/p/y/e$d;->cancel()V

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1, p2}, Lcom/bumptech/glide/load/n/d;->e(Lcom/bumptech/glide/g;Lcom/bumptech/glide/load/n/d$a;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-interface {p2, p1}, Lcom/bumptech/glide/load/n/d$a;->d(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method
