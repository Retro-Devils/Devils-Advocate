.class public Lcom/digdroid/alman/dig/t1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/t1$j;,
        Lcom/digdroid/alman/dig/t1$i;,
        Lcom/digdroid/alman/dig/t1$k;,
        Lcom/digdroid/alman/dig/t1$l;
    }
.end annotation


# static fields
.field static a:Lcom/digdroid/alman/dig/t1;


# instance fields
.field b:Landroid/content/Context;

.field c:Lcom/digdroid/alman/dig/b3;

.field d:Lcom/digdroid/alman/dig/g3;

.field e:Lcom/digdroid/alman/dig/u;

.field f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/t1;->f:Ljava/util/HashMap;

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t1;->c:Lcom/digdroid/alman/dig/b3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/g3;->q(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/g3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1;->d:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/g3;->B()V

    return-void
.end method

.method public static declared-synchronized p(Landroid/content/Context;)Lcom/digdroid/alman/dig/t1;
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/t1;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/digdroid/alman/dig/t1;->a:Lcom/digdroid/alman/dig/t1;

    if-nez v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/t1;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/t1;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/digdroid/alman/dig/t1;->a:Lcom/digdroid/alman/dig/t1;

    :cond_0
    sget-object p0, Lcom/digdroid/alman/dig/t1;->a:Lcom/digdroid/alman/dig/t1;
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
.method public A()V
    .locals 5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t1;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/t1;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "SELECT slug,parent FROM systems"

    invoke-virtual {v0, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_1
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t1;->r()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".png"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/digdroid/alman/dig/t1;->z(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_3
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-void
.end method

.method declared-synchronized B(Landroid/net/Uri;Ljava/io/File;)Z
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/digdroid/alman/dig/t1;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_6
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/16 p2, 0x400

    :try_start_2
    new-array p2, p2, [B

    :goto_0
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    move-result v1

    if-lez v1, :cond_0

    invoke-virtual {v2, p2, v0, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catch_0
    :try_start_4
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catch_1
    const/4 v0, 0x1

    goto :goto_6

    :catchall_0
    move-exception p2

    move-object v1, v2

    goto :goto_1

    :catch_2
    move-object v1, v2

    goto :goto_3

    :catchall_1
    move-exception p2

    goto :goto_1

    :catchall_2
    move-exception p2

    move-object p1, v1

    :goto_1
    if-eqz v1, :cond_1

    :try_start_5
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_2

    :catch_3
    nop

    :cond_1
    :goto_2
    if-eqz p1, :cond_2

    :try_start_6
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catch_4
    :cond_2
    :try_start_7
    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :catch_5
    move-object p1, v1

    :catch_6
    :goto_3
    if-eqz v1, :cond_3

    :try_start_8
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p1

    goto :goto_5

    :catch_7
    nop

    :cond_3
    :goto_4
    if-eqz p1, :cond_4

    :try_start_9
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_6

    :goto_5
    monitor-exit p0

    throw p1

    :catch_8
    :cond_4
    :goto_6
    monitor-exit p0

    return v0
.end method

.method a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    new-instance v0, Lcom/digdroid/alman/dig/t1$f;

    invoke-direct {v0, p0, p2, p3}, Lcom/digdroid/alman/dig/t1$f;-><init>(Lcom/digdroid/alman/dig/t1;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/t1;->b(Landroid/app/Activity;Lcom/digdroid/alman/dig/t1$i;)V

    return-void
.end method

.method b(Landroid/app/Activity;Lcom/digdroid/alman/dig/t1$i;)V
    .locals 3

    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {v0, p1, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v1, 0x7f11008d

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f11005a

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v1, Lcom/digdroid/alman/dig/t1$h;

    invoke-direct {v1, p0, p1, p2}, Lcom/digdroid/alman/dig/t1$h;-><init>(Lcom/digdroid/alman/dig/t1;Landroid/app/Activity;Lcom/digdroid/alman/dig/t1$i;)V

    const p1, 0x7f1101d8

    invoke-virtual {v0, p1, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method c(Lcom/digdroid/alman/dig/MainActivity;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lcom/digdroid/alman/dig/r3;

    invoke-direct {v0, p1}, Lcom/digdroid/alman/dig/r3;-><init>(Lcom/digdroid/alman/dig/a4;)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/r3;->C()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Lcom/digdroid/alman/dig/t1$g;

    invoke-direct {v1, p0, p2, p3, v0}, Lcom/digdroid/alman/dig/t1$g;-><init>(Lcom/digdroid/alman/dig/t1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1, v1}, Lcom/digdroid/alman/dig/t1;->b(Landroid/app/Activity;Lcom/digdroid/alman/dig/t1$i;)V

    return-void
.end method

.method d(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/t1;->e(Ljava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method e(Ljava/lang/String;Z)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1;->f:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return v1

    :cond_1
    new-instance p2, Ljava/io/File;

    invoke-direct {p2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1;->f:Ljava/util/HashMap;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v1

    :cond_2
    monitor-enter p0

    :try_start_0
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/t1;->f:Ljava/util/HashMap;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    monitor-exit p0

    return v0

    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method f(Ljava/io/File;Landroid/database/Cursor;ZLjava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-nez p3, :cond_0

    const-string p3, "."

    invoke-virtual {v1, p3}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result p3

    if-lez p3, :cond_0

    invoke-virtual {v1, v0, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    :cond_0
    new-instance p3, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "/"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ".png"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p3, p4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result p4

    if-nez p4, :cond_1

    invoke-static {p1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Lcom/digdroid/alman/dig/t1;->B(Landroid/net/Uri;Ljava/io/File;)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "UPDATE roms SET has_images=NULL WHERE _id="

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p4, 0x1

    invoke-interface {p2, p4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-virtual {p3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1;->b:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    :cond_1
    return-void
.end method

.method g(JZ)Ljava/io/File;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT pathid,filename,foldername,system FROM roms WHERE _id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object p2

    :cond_0
    const/4 p2, 0x2

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    const/4 v0, 0x1

    if-nez p2, :cond_1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_1
    const/4 v1, 0x3

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1;->d:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {p1, v1}, Lcom/digdroid/alman/dig/g3;->v(Ljava/lang/String;)Z

    move-result p1

    xor-int/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t1;->l(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2, v1, p3}, Lcom/digdroid/alman/dig/t1;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method h(Ljava/lang/String;JZ)Ljava/io/File;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT pathid,filename,foldername,system FROM roms WHERE _id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {v0, p2, p3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p2

    invoke-interface {p2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    return-object p3

    :cond_0
    const/4 p3, 0x2

    invoke-interface {p2, p3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_1

    const/4 p3, 0x1

    invoke-interface {p2, p3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p3

    :cond_1
    const/4 v0, 0x3

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    invoke-virtual {p0, p1, p3, v0, p4}, Lcom/digdroid/alman/dig/t1;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/io/File;
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1;->d:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v0, p3}, Lcom/digdroid/alman/dig/g3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "pc"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "scumm"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "android"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x2e

    invoke-virtual {p2, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/digdroid/alman/dig/y3;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p4}, Lcom/digdroid/alman/dig/t1;->e(Ljava/lang/String;Z)Z

    new-instance p3, Ljava/io/File;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".png"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    return-object p3
.end method

.method j(ZLjava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t1;->l(Z)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/digdroid/alman/dig/t1;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method k(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JZLcom/digdroid/alman/dig/t1$l;)V
    .locals 15

    move-object v11, p0

    move-object/from16 v2, p1

    if-eqz v2, :cond_2

    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    move/from16 v10, p5

    invoke-virtual {p0, v10}, Lcom/digdroid/alman/dig/t1;->l(Z)Ljava/lang/String;

    move-result-object v3

    iget-object v0, v11, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT title,system FROM roms WHERE _id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v4, p3

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v6, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-void

    :cond_1
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    const/4 v7, 0x1

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    const/4 v0, 0x6

    new-array v12, v0, [Ljava/lang/CharSequence;

    const v0, 0x7f11029a

    invoke-virtual {v2, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v12, v1

    const v0, 0x7f11018c

    invoke-virtual {v2, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v12, v7

    const/4 v0, 0x2

    const v1, 0x7f110269

    invoke-virtual {v2, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v12, v0

    const/4 v0, 0x3

    const v1, 0x7f11010a

    invoke-virtual {v2, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v12, v0

    const/4 v0, 0x4

    const v1, 0x7f110212

    invoke-virtual {v2, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v12, v0

    const/4 v0, 0x5

    const v1, 0x7f1100c0

    invoke-virtual {v2, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v12, v0

    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {v0, v2, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v1, 0x7f110109

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    move-result-object v13

    new-instance v14, Lcom/digdroid/alman/dig/t1$b;

    move-object v0, v14

    move-object v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v4, p3

    move-object/from16 v7, p6

    move-object/from16 v9, p2

    move/from16 v10, p5

    invoke-direct/range {v0 .. v10}, Lcom/digdroid/alman/dig/t1$b;-><init>(Lcom/digdroid/alman/dig/t1;Landroid/app/Activity;Ljava/lang/String;JLandroid/database/sqlite/SQLiteDatabase;Lcom/digdroid/alman/dig/t1$l;Ljava/lang/String;Lcom/digdroid/alman/dig/p1;Z)V

    invoke-virtual {v13, v12, v14}, Landroidx/appcompat/app/b$a;->g([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_2
    :goto_0
    return-void
.end method

.method l(Z)Ljava/lang/String;
    .locals 0

    if-eqz p1, :cond_0

    const-string p1, "Screenshots"

    goto :goto_0

    :cond_0
    const-string p1, "Covers"

    :goto_0
    return-object p1
.end method

.method m(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V
    .locals 12

    move-object v8, p0

    iget-object v0, v8, Lcom/digdroid/alman/dig/t1;->c:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p6}, Lcom/digdroid/alman/dig/t1;->n(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v9

    const/4 v10, 0x4

    new-instance v11, Lcom/digdroid/alman/dig/t1$c;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/digdroid/alman/dig/t1$c;-><init>(Lcom/digdroid/alman/dig/t1;Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V

    move-object v0, p1

    invoke-virtual {v9, p1, v10, v11}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    :goto_0
    return-void
.end method

.method n(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V
    .locals 13

    move-object v3, p1

    move-object v9, p0

    iget-object v0, v9, Lcom/digdroid/alman/dig/t1;->c:Lcom/digdroid/alman/dig/b3;

    const-string v1, "inform_image_download"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p6}, Lcom/digdroid/alman/dig/t1;->o(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c00c3

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    const v0, 0x7f11012d

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f090288

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0902d7

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {v0, p1, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v2}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object v10

    const v11, 0x104000a

    new-instance v12, Lcom/digdroid/alman/dig/t1$d;

    move-object v0, v12

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-wide/from16 v5, p3

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/digdroid/alman/dig/t1$d;-><init>(Lcom/digdroid/alman/dig/t1;Landroid/view/View;Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10, v11, v12}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method o(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/t1;->c:Lcom/digdroid/alman/dig/b3;

    const-string v0, "get_game_image"

    invoke-virtual {p2, v0, p3, p4}, Lcom/digdroid/alman/dig/b3;->y(Ljava/lang/String;J)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1;->c:Lcom/digdroid/alman/dig/b3;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p3

    const-string v0, "get_game_image_t"

    invoke-virtual {p2, v0, p3, p4}, Lcom/digdroid/alman/dig/b3;->y(Ljava/lang/String;J)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1;->c:Lcom/digdroid/alman/dig/b3;

    const-string p3, "get_game_image_dir"

    invoke-virtual {p2, p3, p5}, Lcom/digdroid/alman/dig/b3;->z(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p2, Landroid/content/Intent;

    invoke-direct {p2}, Landroid/content/Intent;-><init>()V

    invoke-static {p6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p3

    invoke-virtual {p2, p3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const-string p3, "android.intent.action.VIEW"

    invoke-virtual {p2, p3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    :try_start_0
    invoke-virtual {p1, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method q(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/t1$l;)V
    .locals 12

    move-object v8, p0

    move-object v3, p1

    if-eqz v3, :cond_6

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    sget-object v0, Lcom/digdroid/alman/dig/p3;->a:Lcom/digdroid/alman/dig/s3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s3;->t:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v8, Lcom/digdroid/alman/dig/t1;->b:Landroid/content/Context;

    invoke-static {v2}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_1

    array-length v5, v2

    if-lez v5, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v2, v2, v4

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/Systems/icons"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    move-object v5, v0

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    const/4 v0, 0x5

    new-array v9, v0, [Ljava/lang/CharSequence;

    iget-object v0, v8, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT ignored,parent FROM systems WHERE slug=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v2, p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\'"

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x0

    invoke-virtual {v0, v1, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    const/4 v6, 0x1

    if-eqz v1, :cond_3

    const/4 v7, 0x1

    goto :goto_0

    :cond_3
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    const v0, 0x7f1101c0

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v4

    const v0, 0x7f1101df

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v9, v6

    const/4 v0, 0x2

    const v1, 0x7f11020f

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v9, v0

    const/4 v0, 0x3

    if-eqz v7, :cond_4

    const v1, 0x7f11027a

    goto :goto_1

    :cond_4
    const v1, 0x7f110125

    :goto_1
    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v9, v0

    const/4 v0, 0x4

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const v1, 0x7f11006e

    goto :goto_2

    :cond_5
    const v1, 0x7f1100bc

    :goto_2
    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v9, v0

    new-instance v10, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v0

    invoke-direct {v10, p1, v0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    new-instance v11, Lcom/digdroid/alman/dig/t1$a;

    move-object v0, v11

    move-object v1, p0

    move-object v2, p2

    move-object v3, p1

    move-object v4, v5

    move-object/from16 v5, p4

    move-object v6, p3

    invoke-direct/range {v0 .. v7}, Lcom/digdroid/alman/dig/t1$a;-><init>(Lcom/digdroid/alman/dig/t1;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Lcom/digdroid/alman/dig/t1$l;Ljava/lang/String;Z)V

    invoke-virtual {v10, v9, v11}, Landroidx/appcompat/app/b$a;->g([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_6
    :goto_3
    return-void
.end method

.method r()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1;->b:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/Systems/icons"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method s(Lcom/digdroid/alman/dig/l0;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V
    .locals 9

    const-string v0, "pc"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "scumm"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "android"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SELECT filename,_id FROM roms WHERE system=\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\' AND filename LIKE "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p5, "%"

    invoke-virtual {v3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-static {p5}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {v2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    const/4 v2, 0x0

    invoke-virtual {v1, p5, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p5

    invoke-interface {p5}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0, p4, p5, v0, p3}, Lcom/digdroid/alman/dig/t1;->f(Ljava/io/File;Landroid/database/Cursor;ZLjava/lang/String;)V

    invoke-interface {p5}, Landroid/database/Cursor;->close()V

    return-void

    :cond_2
    invoke-interface {p5}, Landroid/database/Cursor;->close()V

    invoke-virtual {p4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/16 v7, 0x50

    const/4 v8, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v3 .. v8}, Lcom/digdroid/alman/dig/l0;->e(Ljava/lang/String;Ljava/lang/String;ZIZ)J

    move-result-wide p1

    const-wide/16 v3, 0x0

    cmp-long p5, p1, v3

    if-ltz p5, :cond_5

    iget-object p5, p0, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p5}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p5

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SELECT filename,_id FROM roms WHERE mdbid="

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p5, p1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-eqz p2, :cond_4

    :cond_3
    invoke-virtual {p0, p4, p1, v0, p3}, Lcom/digdroid/alman/dig/t1;->f(Ljava/io/File;Landroid/database/Cursor;ZLjava/lang/String;)V

    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result p2

    if-nez p2, :cond_3

    :cond_4
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_5
    return-void
.end method

.method t(Landroid/app/Activity;Ljava/lang/String;Z)V
    .locals 3

    new-instance v0, Lcom/digdroid/alman/dig/i;

    invoke-direct {v0, p1}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1;->b:Landroid/content/Context;

    const v2, 0x7f110126

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/i;->h(Ljava/lang/String;)V

    new-instance v1, Lcom/digdroid/alman/dig/t1$e;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/digdroid/alman/dig/t1$e;-><init>(Lcom/digdroid/alman/dig/t1;Landroid/app/Activity;Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/i;->g(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/i;->d()V

    return-void
.end method

.method u(Landroid/app/Activity;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lcom/digdroid/alman/dig/y3;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    xor-int/2addr p3, v2

    invoke-virtual {p0, p3}, Lcom/digdroid/alman/dig/t1;->l(Z)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Lcom/digdroid/alman/dig/t1;->d:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {p3, p2}, Lcom/digdroid/alman/dig/g3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0, v8, v2}, Lcom/digdroid/alman/dig/t1;->e(Ljava/lang/String;Z)Z

    move-result p3

    if-nez p3, :cond_0

    return-void

    :cond_0
    new-instance p3, Ljava/io/File;

    invoke-direct {p3, p4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    move-result p4

    if-nez p4, :cond_1

    return-void

    :cond_1
    invoke-virtual {p3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v6

    if-eqz v6, :cond_2

    array-length p3, v6

    if-lez p3, :cond_2

    new-instance p3, Lcom/digdroid/alman/dig/t1$k;

    move-object v3, p3

    move-object v4, p0

    move-object v5, p1

    move-object v7, p2

    invoke-direct/range {v3 .. v8}, Lcom/digdroid/alman/dig/t1$k;-><init>(Lcom/digdroid/alman/dig/t1;Landroid/app/Activity;[Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/String;

    invoke-virtual {p3, p1, p2}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_2
    return-void
.end method

.method declared-synchronized v(Ljava/io/File;Ljava/lang/String;JJ)V
    .locals 15

    move-object v1, p0

    move-wide/from16 v2, p3

    monitor-enter p0

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->exists()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    array-length v4, v0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v8, v6

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v4, :cond_3

    aget-object v9, v0, v7

    invoke-virtual {v9}, Ljava/io/File;->lastModified()J

    move-result-wide v10

    cmp-long v12, v10, p5

    if-lez v12, :cond_2

    if-eqz v8, :cond_1

    invoke-virtual {v9}, Ljava/io/File;->lastModified()J

    move-result-wide v10

    invoke-virtual {v8}, Ljava/io/File;->lastModified()J

    move-result-wide v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    cmp-long v14, v10, v12

    if-lez v14, :cond_2

    :cond_1
    move-object v8, v9

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    if-nez v8, :cond_4

    monitor-exit p0

    return-void

    :cond_4
    :try_start_2
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, v8}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    new-instance v7, Ljava/io/FileOutputStream;

    const/4 v8, 0x1

    move-object/from16 v9, p2

    invoke-virtual {p0, v9, v2, v3, v8}, Lcom/digdroid/alman/dig/t1;->h(Ljava/lang/String;JZ)Ljava/io/File;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_5
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/16 v6, 0x400

    :try_start_4
    new-array v6, v6, [B

    :goto_1
    invoke-virtual {v4, v6}, Ljava/io/InputStream;->read([B)I

    move-result v8

    if-lez v8, :cond_5

    invoke-virtual {v7, v6, v5, v8}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_1

    :cond_5
    invoke-virtual {v7}, Ljava/io/OutputStream;->flush()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catch_0
    :goto_2
    :try_start_6
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_7

    :catchall_0
    move-exception v0

    move-object v6, v7

    goto :goto_3

    :catch_1
    move-object v6, v7

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v4, v6

    :goto_3
    if-eqz v6, :cond_6

    :try_start_7
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_4

    :catch_2
    nop

    :cond_6
    :goto_4
    if-eqz v4, :cond_7

    :try_start_8
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catch_3
    :cond_7
    :try_start_9
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :catch_4
    move-object v4, v6

    :catch_5
    :goto_5
    if-eqz v6, :cond_8

    :try_start_a
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_6

    :catch_6
    nop

    :cond_8
    :goto_6
    if-eqz v4, :cond_9

    goto :goto_2

    :catch_7
    :cond_9
    :goto_7
    :try_start_b
    array-length v4, v0

    :goto_8
    if-ge v5, v4, :cond_b

    aget-object v6, v0, v5

    invoke-virtual {v6}, Ljava/io/File;->lastModified()J

    move-result-wide v7
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    cmp-long v9, v7, p5

    if-lez v9, :cond_a

    :try_start_c
    invoke-virtual {v6}, Ljava/io/File;->delete()Z
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_8
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    :catch_8
    :cond_a
    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_b
    :try_start_d
    iget-object v0, v1, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "UPDATE roms SET has_images=NULL WHERE _id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object v0, v1, Lcom/digdroid/alman/dig/t1;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    monitor-exit p0

    return-void

    :catchall_3
    move-exception v0

    monitor-exit p0

    goto :goto_a

    :goto_9
    throw v0

    :goto_a
    goto :goto_9
.end method

.method declared-synchronized w([BLjava/lang/String;)Z
    .locals 3

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v1, p1}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 p1, 0x1

    :goto_0
    monitor-exit p0

    return p1

    :catch_0
    move-object v0, v1

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_1
    :goto_1
    if-eqz v0, :cond_0

    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :goto_2
    monitor-exit p0

    throw p1

    :catch_2
    :cond_0
    :goto_3
    const/4 p1, 0x0

    goto :goto_0
.end method

.method x(Landroid/net/Uri;)V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1;->c:Lcom/digdroid/alman/dig/b3;

    const-string v1, "game_id"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/b3;->n(Ljava/lang/String;J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Lcom/digdroid/alman/dig/t1;->g(JZ)Ljava/io/File;

    move-result-object v2

    invoke-virtual {p0, p1, v2}, Lcom/digdroid/alman/dig/t1;->B(Landroid/net/Uri;Ljava/io/File;)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "UPDATE roms SET has_images=NULL WHERE _id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1;->b:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/ImageService;->a(Landroid/content/Context;)V

    return-void
.end method

.method y(ILandroid/net/Uri;)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT slug FROM systems WHERE _id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t1;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/t1;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t1;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".png"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2, v0}, Lcom/digdroid/alman/dig/t1;->B(Landroid/net/Uri;Ljava/io/File;)Z

    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-void
.end method

.method declared-synchronized z(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t1;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".png"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "icon_"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1;->b:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const-string v1, "drawable"

    iget-object v2, p0, Lcom/digdroid/alman/dig/t1;->b:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, p1, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v1, 0x0

    :try_start_1
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    new-instance p2, Ljava/io/FileOutputStream;

    invoke-direct {p2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/16 v0, 0x400

    :try_start_3
    new-array v0, v0, [B

    :goto_0
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    move-result v1

    if-lez v1, :cond_1

    const/4 v2, 0x0

    invoke-virtual {p2, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Ljava/io/OutputStream;->flush()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catch_0
    move-object v1, p2

    goto :goto_1

    :catch_1
    move-object p1, v1

    :catch_2
    :goto_1
    if-eqz v1, :cond_2

    :try_start_4
    invoke-virtual {v1}, Ljava/io/OutputStream;->close()V

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_3
    :cond_3
    :goto_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_4

    :goto_3
    throw p1

    :goto_4
    goto :goto_3
.end method
