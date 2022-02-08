.class public Lcom/digdroid/alman/dig/b0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/b0$l;,
        Lcom/digdroid/alman/dig/b0$k;
    }
.end annotation


# static fields
.field private static a:Lcom/digdroid/alman/dig/b0;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lcom/digdroid/alman/dig/u;

.field private d:Lcom/digdroid/alman/dig/b3;

.field private e:Lcom/digdroid/alman/dig/g3;

.field private f:Lcom/digdroid/alman/dig/o0;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Lcom/digdroid/alman/dig/b0$k;

.field j:Lcom/digdroid/alman/dig/b0$l;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/digdroid/alman/dig/g3;Lcom/digdroid/alman/dig/o0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/b0;->g:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/b0;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/b0;->i:Lcom/digdroid/alman/dig/b0$k;

    iput-object v0, p0, Lcom/digdroid/alman/dig/b0;->j:Lcom/digdroid/alman/dig/b0$l;

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/b0;->c:Lcom/digdroid/alman/dig/u;

    invoke-static {p1}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0;->d:Lcom/digdroid/alman/dig/b3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/b0;->e:Lcom/digdroid/alman/dig/g3;

    iput-object p3, p0, Lcom/digdroid/alman/dig/b0;->f:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/b0;->y(Ljava/lang/String;)[Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    aget-object p1, p1, p2

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0;->g:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/b0;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic b(Lcom/digdroid/alman/dig/b0;)Lcom/digdroid/alman/dig/b3;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/b0;->d:Lcom/digdroid/alman/dig/b3;

    return-object p0
.end method

.method static synthetic c(Lcom/digdroid/alman/dig/b0;)Lcom/digdroid/alman/dig/o0;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/b0;->f:Lcom/digdroid/alman/dig/o0;

    return-object p0
.end method

.method static synthetic d(Lcom/digdroid/alman/dig/b0;)Lcom/digdroid/alman/dig/u;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/b0;->c:Lcom/digdroid/alman/dig/u;

    return-object p0
.end method

.method public static declared-synchronized o(Landroid/content/Context;Lcom/digdroid/alman/dig/g3;Lcom/digdroid/alman/dig/o0;)Lcom/digdroid/alman/dig/b0;
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/b0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/digdroid/alman/dig/b0;->a:Lcom/digdroid/alman/dig/b0;

    if-nez v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/b0;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0, p1, p2}, Lcom/digdroid/alman/dig/b0;-><init>(Landroid/content/Context;Lcom/digdroid/alman/dig/g3;Lcom/digdroid/alman/dig/o0;)V

    sput-object v1, Lcom/digdroid/alman/dig/b0;->a:Lcom/digdroid/alman/dig/b0;

    :cond_0
    sget-object p0, Lcom/digdroid/alman/dig/b0;->a:Lcom/digdroid/alman/dig/b0;
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
.method e(JJ)V
    .locals 9

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0;->h:Ljava/lang/String;

    if-nez v0, :cond_1

    new-instance v0, Lcom/digdroid/alman/dig/x2;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/digdroid/alman/dig/x2;-><init>(Landroid/content/Context;)V

    const-string v1, "screenshot_directory"

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iput-object v0, p0, Lcom/digdroid/alman/dig/b0;->h:Ljava/lang/String;

    :cond_1
    new-instance v3, Ljava/io/File;

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0;->h:Ljava/lang/String;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/digdroid/alman/dig/t1;->p(Landroid/content/Context;)Lcom/digdroid/alman/dig/t1;

    move-result-object v2

    const-string v4, "Screenshots"

    move-wide v5, p1

    move-wide v7, p3

    invoke-virtual/range {v2 .. v8}, Lcom/digdroid/alman/dig/t1;->v(Ljava/io/File;Ljava/lang/String;JJ)V

    return-void
.end method

.method f(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lcom/digdroid/alman/dig/v3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/digdroid/alman/dig/v3;-><init>(Landroid/content/Context;)V

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n;->k(Ljava/io/File;)V

    const-string p1, "use_gui"

    const-string v1, "no"

    invoke-virtual {v0, p1, v1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/v3;->w()Z

    return-void
.end method

.method g(Ljava/lang/String;Ljava/lang/String;Landroid/database/Cursor;Ljava/lang/String;)V
    .locals 9

    new-instance v0, Lcom/digdroid/alman/dig/v3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/digdroid/alman/dig/v3;-><init>(Landroid/content/Context;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Uae4arm/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n;->j(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0;->c:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SELECT p.path,r.filename FROM rompaths as p,roms as r WHERE r.title LIKE "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " AND p._id=r.pathid"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x0

    invoke-virtual {v1, p2, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p2

    invoke-interface {p2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    const-string v3, "/"

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/v3;->A(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    const/4 v1, 0x4

    invoke-interface {p3, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {p3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/digdroid/alman/dig/v3;->x(Ljava/lang/String;)V

    new-instance v7, Ljava/io/File;

    invoke-direct {v7, p4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->isDirectory()Z

    move-result v7

    if-nez v7, :cond_5

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v7

    sub-int/2addr v7, v1

    invoke-virtual {p4, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    const-string v8, ".hdf"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lcom/digdroid/alman/dig/b0;->c:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "SELECT filename FROM roms WHERE system=\'"

    invoke-virtual {p4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\' AND title="

    invoke-virtual {p4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Landroid/database/DatabaseUtils;->sqlEscapeString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p4, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ORDER BY filename ASC"

    invoke-virtual {p4, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2, p4, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p2

    invoke-interface {p2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 p4, -0x1

    :cond_2
    invoke-interface {p2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x7

    invoke-interface {p3, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 p4, 0x0

    :cond_3
    if-ltz p4, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/digdroid/alman/dig/b0;->e:Lcom/digdroid/alman/dig/g3;

    const/4 v6, 0x3

    invoke-interface {p3, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    invoke-virtual {v4, v6}, Lcom/digdroid/alman/dig/g3;->t(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p4, v2}, Lcom/digdroid/alman/dig/v3;->y(ILjava/lang/String;)V

    add-int/lit8 p4, p4, 0x1

    :cond_4
    if-ge p4, v1, :cond_6

    invoke-interface {p2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_5
    :goto_0
    invoke-virtual {v0, p4}, Lcom/digdroid/alman/dig/v3;->z(Ljava/lang/String;)V

    :cond_6
    :goto_1
    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/v3;->r(Ljava/lang/String;)Z

    return-void
.end method

.method h(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 12

    move-object v8, p0

    move-object v4, p1

    new-instance v0, Lcom/digdroid/alman/dig/z;

    iget-object v1, v8, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/digdroid/alman/dig/z;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z;->w()V

    move-object/from16 v1, p5

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/z;->y(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z;->x()Z

    iget-object v1, v8, Lcom/digdroid/alman/dig/b0;->d:Lcom/digdroid/alman/dig/b3;

    const/4 v2, 0x0

    move-object/from16 v3, p6

    invoke-virtual {v1, v3, v2}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c00c3

    const/4 v5, 0x0

    invoke-virtual {v1, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v5, 0x7f11005d

    invoke-virtual {p1, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\n\n"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z;->v()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f090289

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0902d8

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {v0, p1, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v2}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object v9

    const v10, 0x104000a

    new-instance v11, Lcom/digdroid/alman/dig/b0$h;

    move-object v0, v11

    move-object v1, p0

    move-object/from16 v3, p6

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/digdroid/alman/dig/b0$h;-><init>(Lcom/digdroid/alman/dig/b0;Landroid/view/View;Ljava/lang/String;Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;)V

    invoke-virtual {v9, v10, v11}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    const/4 v0, 0x1

    return v0
.end method

.method i(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)Z
    .locals 9

    const/4 v0, 0x1

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Uae4arm"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual/range {p0 .. p5}, Lcom/digdroid/alman/dig/b0;->m(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_0
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "DosBox Turbo"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v8, "dosbox_turbo_informed"

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v2 .. v8}, Lcom/digdroid/alman/dig/b0;->h(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_1
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "FreeBox"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v8, "dosbox_free_informed"

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v2 .. v8}, Lcom/digdroid/alman/dig/b0;->h(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_2
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ScummVM"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v8, "scummvm_informed"

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v2 .. v8}, Lcom/digdroid/alman/dig/b0;->k(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_3
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "ScummVM 2.0.0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v8, "scummvm_informed"

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-virtual/range {v2 .. v8}, Lcom/digdroid/alman/dig/b0;->l(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_4
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "RetroArch (ScummVM)"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0, p2, p3, p4, p5}, Lcom/digdroid/alman/dig/b0;->j(Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_5
    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p3, "J2ME Loader"

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 p3, 0x0

    if-eqz p1, :cond_6

    const-string p1, "config.edit"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-interface {p4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p4, "midletName"

    invoke-virtual {p2, p4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_6
    return p3
.end method

.method j(Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)Z
    .locals 4

    new-instance v0, Lcom/digdroid/alman/dig/a3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/digdroid/alman/dig/a3;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-interface {p3, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Lcom/digdroid/alman/dig/a3;->x(J)Ljava/lang/String;

    move-result-object p3

    if-eqz p3, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "/"

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ".scummvm"

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    const/4 v2, 0x6

    invoke-interface {p2, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iput-object p3, v0, Lcom/digdroid/alman/dig/n;->b:Ljava/lang/String;

    invoke-virtual {v0, p4}, Lcom/digdroid/alman/dig/n;->r(Ljava/lang/String;)Z

    :cond_0
    return v1
.end method

.method k(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method l(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 12

    move-object v8, p0

    move-object v4, p1

    new-instance v0, Lcom/digdroid/alman/dig/a3;

    iget-object v1, v8, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/digdroid/alman/dig/a3;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/a3;->y()V

    const/4 v1, 0x0

    move-object/from16 v7, p4

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    move-object/from16 v5, p5

    invoke-virtual {v0, v5, v2, v3}, Lcom/digdroid/alman/dig/a3;->A(Ljava/lang/String;J)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/a3;->z()Z

    iget-object v2, v8, Lcom/digdroid/alman/dig/b0;->d:Lcom/digdroid/alman/dig/b3;

    move-object/from16 v3, p6

    invoke-virtual {v2, v3, v1}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c00c3

    const/4 v5, 0x0

    invoke-virtual {v1, v2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const v5, 0x7f110060

    invoke-virtual {p1, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\n\n"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/a3;->u()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f090289

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v5

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f0902d8

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {v0, p1, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v2}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object v9

    const v10, 0x104000a

    new-instance v11, Lcom/digdroid/alman/dig/b0$g;

    move-object v0, v11

    move-object v1, p0

    move-object/from16 v3, p6

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object/from16 v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/digdroid/alman/dig/b0$g;-><init>(Lcom/digdroid/alman/dig/b0;Landroid/view/View;Ljava/lang/String;Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;)V

    invoke-virtual {v9, v10, v11}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    const/4 v0, 0x1

    return v0
.end method

.method m(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)Z
    .locals 9

    invoke-virtual {p5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    invoke-virtual {p5}, Ljava/lang/String;->length()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-virtual {p5, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".uae"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p5}, Lcom/digdroid/alman/dig/b0;->f(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "A1200.uae"

    const-string v1, "Kickstart v3.1"

    invoke-virtual {p0, v0, v1, p4, p5}, Lcom/digdroid/alman/dig/b0;->g(Ljava/lang/String;Ljava/lang/String;Landroid/database/Cursor;Ljava/lang/String;)V

    const-string v0, "A500.uae"

    const-string v1, "Kickstart v1.3"

    invoke-virtual {p0, v0, v1, p4, p5}, Lcom/digdroid/alman/dig/b0;->g(Ljava/lang/String;Ljava/lang/String;Landroid/database/Cursor;Ljava/lang/String;)V

    :goto_0
    iget-object p5, p0, Lcom/digdroid/alman/dig/b0;->d:Lcom/digdroid/alman/dig/b3;

    const-string v0, "uae_informed"

    const/4 v1, 0x0

    invoke-virtual {p5, v0, v1}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result p5

    if-eqz p5, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p5

    const v0, 0x7f0c00c3

    const/4 v1, 0x0

    invoke-virtual {p5, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    const v0, 0x7f110062

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n\n"

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Lcom/digdroid/alman/dig/v3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/digdroid/alman/dig/v3;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/v3;->v()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p5

    const v0, 0x7f090289

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v0, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p5, 0x7f0902d8

    invoke-virtual {v4, p5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p5

    check-cast p5, Landroid/widget/TextView;

    invoke-static {p5}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    new-instance p5, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v0

    invoke-direct {p5, p1, v0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p5, v4}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object p5

    const v0, 0x104000a

    new-instance v1, Lcom/digdroid/alman/dig/b0$i;

    move-object v2, v1

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v2 .. v8}, Lcom/digdroid/alman/dig/b0$i;-><init>(Lcom/digdroid/alman/dig/b0;Landroid/view/View;Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;)V

    invoke-virtual {p5, v0, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    const/4 p1, 0x1

    return p1
.end method

.method n(Landroid/content/Context;Landroid/database/Cursor;Landroid/database/Cursor;)Ljava/lang/String;
    .locals 7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p1}, Lcom/digdroid/alman/dig/x2;->u(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x4

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0;->c:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT overlay,overlay_opacity,user_set_overlay FROM systems WHERE slug=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\'"

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    invoke-virtual {v0, p2, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p2

    invoke-interface {p2}, Landroid/database/Cursor;->moveToFirst()Z

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p2, v2}, Landroid/database/Cursor;->getFloat(I)F

    move-result v3

    const/4 v4, 0x2

    invoke-interface {p2, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, 0x0

    :goto_0
    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    const/16 p2, 0xb

    invoke-interface {p3, p2}, Landroid/database/Cursor;->getInt(I)I

    move-result p2

    invoke-static {p2}, Lcom/digdroid/alman/dig/x2;->y(I)V

    if-eqz v1, :cond_2

    const-string p2, "default"

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {p1}, Lcom/digdroid/alman/dig/x2;->u(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    return-object p2

    :cond_2
    new-instance p2, Lcom/digdroid/alman/dig/x2;

    invoke-direct {p2, p1}, Lcom/digdroid/alman/dig/x2;-><init>(Landroid/content/Context;)V

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/digdroid/alman/dig/b0;->g:Ljava/lang/String;

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/retroarch.cfg"

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Lcom/digdroid/alman/dig/x2;->x(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/overlays"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v5, ""

    if-eqz v1, :cond_3

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const-string v1, "gamepads/flat/retropad.cfg"

    :cond_3
    const-string v6, "input_overlay_enable"

    if-nez v1, :cond_4

    if-eqz v4, :cond_7

    const-string p1, "false"

    invoke-virtual {p2, v6, p1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    if-eqz v4, :cond_5

    const-string v4, "true"

    invoke-virtual {p2, v6, v4}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v4, "input_overlay"

    if-eqz v0, :cond_6

    invoke-virtual {p2, v4, v1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v4, p1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "input_overlay_opacity"

    invoke-virtual {p2, v0, p1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    :goto_2
    invoke-virtual {p2, p3}, Lcom/digdroid/alman/dig/n;->r(Ljava/lang/String;)Z

    return-object p3
.end method

.method p(Landroid/database/Cursor;)Z
    .locals 2

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Magic DosBox"

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method q(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Z)V
    .locals 10

    if-eqz p5, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/b0;->d:Lcom/digdroid/alman/dig/b3;

    const-string v1, "retroarch_package_running"

    invoke-static {p1}, Lcom/digdroid/alman/dig/x2;->w(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->G(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0;->d:Lcom/digdroid/alman/dig/b3;

    const-string v1, "retroarch_last"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/b3;->F(Ljava/lang/String;J)V

    const-string v0, "retroarch"

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/z3;->n(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/b0;->d:Lcom/digdroid/alman/dig/b3;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->N(J)V

    iget-object v3, p0, Lcom/digdroid/alman/dig/b0;->i:Lcom/digdroid/alman/dig/b0$k;

    if-eqz v3, :cond_1

    const/4 v0, 0x0

    invoke-interface {p4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    const/4 v0, 0x4

    invoke-interface {p4, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    move v9, p5

    invoke-interface/range {v3 .. v9}, Lcom/digdroid/alman/dig/b0$k;->s0(JJLjava/lang/String;Z)V

    :cond_1
    const/16 p5, 0x64

    invoke-virtual {p1, p2, p5}, Landroidx/fragment/app/d;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-instance p2, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result p5

    invoke-direct {p2, p1, p5}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const p1, 0x7f11014a

    invoke-virtual {p2, p1}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const p2, 0x104000a

    const/4 p5, 0x0

    invoke-virtual {p1, p2, p5}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :goto_0
    if-eqz p3, :cond_2

    invoke-interface {p3}, Landroid/database/Cursor;->close()V

    :cond_2
    invoke-interface {p4}, Landroid/database/Cursor;->close()V

    return-void
.end method

.method r(Lcom/digdroid/alman/dig/y3;JLjava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0;->c:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT _id,title,released,pathid,system,times_played,time_played,filename,merged_with FROM roms WHERE _id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-void

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/b0;->f:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {v1, p2, p3}, Lcom/digdroid/alman/dig/o0;->d(J)Landroid/database/Cursor;

    move-result-object p2

    invoke-interface {p2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p3

    if-nez p3, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    invoke-interface {p2}, Landroid/database/Cursor;->close()V

    return-void

    :cond_1
    invoke-virtual {p0, p1, p2, v0, p4}, Lcom/digdroid/alman/dig/b0;->u(Lcom/digdroid/alman/dig/y3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)V

    return-void
.end method

.method s(Lcom/digdroid/alman/dig/y3;Landroid/database/Cursor;Landroid/database/Cursor;Z)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0;->e:Lcom/digdroid/alman/dig/g3;

    new-instance v1, Lcom/digdroid/alman/dig/b0$c;

    invoke-direct {v1, p0, p2, p3, p1}, Lcom/digdroid/alman/dig/b0$c;-><init>(Lcom/digdroid/alman/dig/b0;Landroid/database/Cursor;Landroid/database/Cursor;Lcom/digdroid/alman/dig/y3;)V

    invoke-static {p1, v0, p3, p4, v1}, Lcom/digdroid/alman/dig/t2;->b(Lcom/digdroid/alman/dig/y3;Lcom/digdroid/alman/dig/g3;Landroid/database/Cursor;ZLcom/digdroid/alman/dig/t2$b;)V

    return-void
.end method

.method t(Lcom/digdroid/alman/dig/y3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)V
    .locals 10

    new-instance v0, Lcom/digdroid/alman/dig/x1;

    invoke-direct {v0, p1}, Lcom/digdroid/alman/dig/x1;-><init>(Landroid/app/Activity;)V

    const/4 v1, 0x4

    invoke-interface {p3, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p2, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v9, Lcom/digdroid/alman/dig/b0$d;

    move-object v3, v9

    move-object v4, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v3 .. v8}, Lcom/digdroid/alman/dig/b0$d;-><init>(Lcom/digdroid/alman/dig/b0;Lcom/digdroid/alman/dig/y3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2, p4, v9}, Lcom/digdroid/alman/dig/x1;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/x1$c;)V

    return-void
.end method

.method u(Lcom/digdroid/alman/dig/y3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v6, p0

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v0, p4

    const/16 v1, 0x9

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x4

    if-nez v1, :cond_1

    invoke-static/range {p4 .. p4}, Lcom/digdroid/alman/dig/f4;->c(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v6, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/digdroid/alman/dig/z3;->c(Landroid/content/Context;)V

    iget-object v1, v6, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    invoke-static {v1}, Lcom/digdroid/alman/dig/z3;->y(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    const/4 v1, 0x0

    invoke-interface {v8, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v13

    invoke-interface {v8, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v15

    const/16 v16, 0x0

    move-object/from16 v9, p1

    move-object/from16 v10, p4

    invoke-virtual/range {v9 .. v16}, Lcom/digdroid/alman/dig/y3;->e1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-interface/range {p3 .. p3}, Landroid/database/Cursor;->close()V

    invoke-interface/range {p2 .. p2}, Landroid/database/Cursor;->close()V

    return-void

    :cond_1
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    new-instance v1, Landroid/content/ComponentName;

    const/4 v4, 0x3

    invoke-interface {v7, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v7, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v4, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v4, "j2me"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {v6, v7}, Lcom/digdroid/alman/dig/b0;->p(Landroid/database/Cursor;)Z

    move-result v4

    if-eqz v4, :cond_3

    new-instance v4, Ljava/io/File;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_3
    :goto_0
    move-object v5, v0

    const-string v0, "scumm"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v4, ""

    if-nez v0, :cond_9

    const/4 v0, 0x6

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "AetherSX2"
    
    const/4 v1, 0x1
    
    invoke-interface {v7, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    
    move-result-object v1
    
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    
    move-result v2
    
    if-eqz v2, :cond_g
	
    new-instance v2, Ljava/io/File;
	
    invoke-direct {v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    # invoke-virtual {v2}, Ljava/io/File;->toUri()Ljava/lang/String; //crashes
    move-result-object v2
    
    invoke-virtual {v9, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
    
    goto :goto_3
    
    :cond_g

    invoke-virtual {v9, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    goto :goto_3

    :cond_4
    const/16 v0, 0x8

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    const-string v10, "view"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_5
    const-string v0, "android.intent.action.VIEW"

    invoke-virtual {v9, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    :cond_6
    const/4 v0, 0x7

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    sget v10, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x12c

    if-ge v10, v11, :cond_7

    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v10

    goto :goto_1

    :cond_7
    iget-object v10, v6, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    new-instance v11, Ljava/io/File;

    invoke-direct {v11, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v12, "com.digdroid.alman.dig.fileprovider"

    invoke-static {v10, v12, v11}, Landroidx/core/content/FileProvider;->e(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v10

    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-virtual {v9, v10}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    goto :goto_2

    :cond_8
    invoke-virtual {v9, v10, v0}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    :goto_2
    invoke-virtual {v9, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    :cond_9
    :goto_3
    const/4 v0, 0x5

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    move-object/from16 v10, p1

    if-nez v2, :cond_d

    invoke-virtual {v6, v10, v8, v7}, Lcom/digdroid/alman/dig/b0;->n(Landroid/content/Context;Landroid/database/Cursor;Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object v2

    const/16 v4, 0xb

    invoke-interface {v7, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-static {v4}, Lcom/digdroid/alman/dig/x2;->y(I)V

    new-instance v4, Landroid/content/ComponentName;

    invoke-static/range {p1 .. p1}, Lcom/digdroid/alman/dig/x2;->w(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v7, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v11, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    if-eqz v2, :cond_a

    const-string v3, "CONFIGFILE"

    invoke-virtual {v9, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_a
    const-string v2, "pcfx"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    const-string v3, "supergrafx"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_b

    const-string v0, "mednafen_pcfx_libretro_android.so"

    goto :goto_4

    :cond_b
    const-string v3, "pce"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_c

    const-string v0, "mednafen_supergrafx_libretro_android.so"

    :cond_c
    :goto_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static/range {p1 .. p1}, Lcom/digdroid/alman/dig/x2;->x(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/cores/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LIBRETRO"

    invoke-virtual {v9, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static/range {p1 .. p1}, Lcom/digdroid/alman/dig/x2;->x(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "DATADIR"

    invoke-virtual {v9, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v9

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/b0;->i(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    const/4 v5, 0x1

    goto :goto_5

    :cond_d
    iget-object v0, v6, Lcom/digdroid/alman/dig/b0;->d:Lcom/digdroid/alman/dig/b3;

    const/4 v1, 0x2

    const-string v2, "is_retroarch"

    invoke-virtual {v0, v2, v1}, Lcom/digdroid/alman/dig/b3;->x(Ljava/lang/String;I)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v9

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/b0;->i(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_e

    const/4 v5, 0x0

    :goto_5
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v9

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/digdroid/alman/dig/b0;->q(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Z)V

    :cond_e
    return-void
.end method

.method public v(Lcom/digdroid/alman/dig/y3;Landroid/database/Cursor;Landroid/database/Cursor;Z)V
    .locals 8

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    const/4 v0, 0x4

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "android"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p4, p0, Lcom/digdroid/alman/dig/b0;->d:Lcom/digdroid/alman/dig/b3;

    const/4 v0, 0x2

    const-string v1, "is_retroarch"

    invoke-virtual {p4, v1, v0}, Lcom/digdroid/alman/dig/b3;->x(Ljava/lang/String;I)V

    invoke-virtual {p1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p4

    const/4 v0, 0x7

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    invoke-virtual/range {v1 .. v6}, Lcom/digdroid/alman/dig/b0;->q(Lcom/digdroid/alman/dig/y3;Landroid/content/Intent;Landroid/database/Cursor;Landroid/database/Cursor;Z)V

    invoke-interface {p3}, Landroid/database/Cursor;->close()V

    return-void

    :cond_1
    if-nez p2, :cond_2

    invoke-interface {p3}, Landroid/database/Cursor;->close()V

    return-void

    :cond_2
    const/4 v0, 0x5

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const/16 v0, 0xb

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/x2;->y(I)V

    invoke-static {p1}, Lcom/digdroid/alman/dig/x2;->w(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 v0, 0x3

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    move-object v4, v0

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    invoke-static {v0, v4}, Lcom/digdroid/alman/dig/z3;->r(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/digdroid/alman/dig/b0;->s(Lcom/digdroid/alman/dig/y3;Landroid/database/Cursor;Landroid/database/Cursor;Z)V

    goto :goto_1

    :cond_4
    new-instance p4, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v0

    invoke-direct {p4, p1, v0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x1

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    const v2, 0x7f1100d4

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p4

    const/high16 v0, 0x1040000

    const/4 v1, 0x0

    invoke-virtual {p4, v0, v1}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p4

    const v0, 0x104000a

    new-instance v7, Lcom/digdroid/alman/dig/b0$a;

    move-object v1, v7

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/digdroid/alman/dig/b0$a;-><init>(Lcom/digdroid/alman/dig/b0;Lcom/digdroid/alman/dig/y3;Ljava/lang/String;Landroid/database/Cursor;Landroid/database/Cursor;)V

    invoke-virtual {p4, v0, v7}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_5
    :goto_1
    return-void
.end method

.method w(Landroid/app/Activity;JJZ)V
    .locals 8

    const-wide/16 v0, 0x5dc

    cmp-long v2, p4, v0

    if-lez v2, :cond_0

    new-instance v7, Lcom/digdroid/alman/dig/b0$b;

    move-object v0, v7

    move-object v1, p0

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lcom/digdroid/alman/dig/b0$b;-><init>(Lcom/digdroid/alman/dig/b0;JJLandroid/app/Activity;)V

    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v7, v0, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/b0;->j:Lcom/digdroid/alman/dig/b0$l;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/digdroid/alman/dig/b0$l;->a()V

    goto :goto_0

    :cond_1
    if-eqz p6, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0;->f:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {v0, p2, p3}, Lcom/digdroid/alman/dig/o0;->d(J)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xb

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    new-instance v3, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v4

    invoke-direct {v3, p1, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    const v7, 0x7f11021b

    invoke-virtual {v5, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    const v5, 0x7f1101d2

    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    const/high16 v3, 0x1040000

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    const v3, 0x104000a

    new-instance v4, Lcom/digdroid/alman/dig/b0$j;

    invoke-direct {v4, p0, v2, p1}, Lcom/digdroid/alman/dig/b0$j;-><init>(Lcom/digdroid/alman/dig/b0;ILandroid/app/Activity;)V

    invoke-virtual {v1, v3, v4}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_2
    :goto_0
    return-void
.end method

.method x(Lcom/digdroid/alman/dig/y3;JLjava/lang/String;)V
    .locals 15

    move-object v6, p0

    move-object/from16 v2, p1

    move-wide/from16 v0, p2

    new-instance v3, Ljava/io/File;

    move-object/from16 v4, p4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object v4, v6, Lcom/digdroid/alman/dig/b0;->c:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v4}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "SELECT s.extensions FROM systems as s,roms as r WHERE r._id="

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v7, " AND s.slug=r.system"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    invoke-virtual {v4, v5, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    return-void

    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "\\.("

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v8, 0x0

    invoke-interface {v4, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, ")$"

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v9, 0x2

    invoke-static {v5, v9}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v5

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    new-instance v4, Lcom/digdroid/alman/dig/b0$e;

    invoke-direct {v4, p0, v5}, Lcom/digdroid/alman/dig/b0$e;-><init>(Lcom/digdroid/alman/dig/b0;Ljava/util/regex/Pattern;)V

    invoke-virtual {v3, v4}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_b

    array-length v4, v3

    if-nez v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\\.cue$"

    invoke-static {v4, v9}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v4

    array-length v5, v3

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    const/4 v11, 0x1

    if-ge v9, v5, :cond_3

    aget-object v12, v3, v9

    invoke-virtual {v12}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v12

    invoke-virtual {v12}, Ljava/util/regex/Matcher;->find()Z

    move-result v12

    if-eqz v12, :cond_2

    const/4 v10, 0x1

    :cond_2
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    array-length v9, v3

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v9, :cond_6

    aget-object v13, v3, v12

    if-eqz v10, :cond_4

    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4, v14}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v14

    invoke-virtual {v14}, Ljava/util/regex/Matcher;->find()Z

    move-result v14

    if-eqz v14, :cond_5

    :cond_4
    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_6
    iget-object v3, v6, Lcom/digdroid/alman/dig/b0;->c:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v3}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "SELECT _id,title,released,pathid,system,times_played,time_played,filename,merged_with FROM roms WHERE _id="

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v7}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-nez v3, :cond_7

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    return-void

    :cond_7
    iget-object v3, v6, Lcom/digdroid/alman/dig/b0;->f:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {v3, v0, v1}, Lcom/digdroid/alman/dig/o0;->d(J)Landroid/database/Cursor;

    move-result-object v3

    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    return-void

    :cond_8
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v11, :cond_9

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v2, v3, v4, v0}, Lcom/digdroid/alman/dig/b0;->u(Lcom/digdroid/alman/dig/y3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)V

    goto :goto_3

    :cond_9
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v7, v0, [Ljava/lang/CharSequence;

    :goto_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v8, v0, :cond_a

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_a
    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {v0, v2, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v1, 0x7f11023a

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    move-result-object v8

    new-instance v9, Lcom/digdroid/alman/dig/b0$f;

    move-object v0, v9

    move-object v1, p0

    move-object/from16 v2, p1

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/b0$f;-><init>(Lcom/digdroid/alman/dig/b0;Lcom/digdroid/alman/dig/y3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/util/ArrayList;)V

    invoke-virtual {v8, v7, v9}, Landroidx/appcompat/app/b$a;->g([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_b
    :goto_3
    return-void
.end method

.method public y(Ljava/lang/String;)[Ljava/io/File;
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0;->b:Landroid/content/Context;

    invoke-static {p1}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object p1

    return-object p1
.end method

.method public z(Lcom/digdroid/alman/dig/b0$k;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0;->i:Lcom/digdroid/alman/dig/b0$k;

    return-void
.end method
