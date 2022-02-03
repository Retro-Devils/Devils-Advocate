.class Lcom/digdroid/alman/dig/b0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/u2$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/b0;->t(Lcom/digdroid/alman/dig/z3;Landroid/database/Cursor;Landroid/database/Cursor;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/database/Cursor;

.field final synthetic b:Landroid/database/Cursor;

.field final synthetic c:Lcom/digdroid/alman/dig/z3;

.field final synthetic d:Lcom/digdroid/alman/dig/b0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/b0;Landroid/database/Cursor;Landroid/database/Cursor;Lcom/digdroid/alman/dig/z3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0$d;->d:Lcom/digdroid/alman/dig/b0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/b0$d;->a:Landroid/database/Cursor;

    iput-object p3, p0, Lcom/digdroid/alman/dig/b0$d;->b:Landroid/database/Cursor;

    iput-object p4, p0, Lcom/digdroid/alman/dig/b0$d;->c:Lcom/digdroid/alman/dig/z3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 5

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$d;->a:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$d;->b:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/b0$d;->c:Lcom/digdroid/alman/dig/z3;

    invoke-static {v0, p1}, Lcom/digdroid/alman/dig/i2;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/digdroid/alman/dig/i2;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0$d;->d:Lcom/digdroid/alman/dig/b0;

    iget-object v2, p0, Lcom/digdroid/alman/dig/b0$d;->a:Landroid/database/Cursor;

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/b0;->q(Landroid/database/Cursor;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0$d;->c:Lcom/digdroid/alman/dig/z3;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0$d;->d:Lcom/digdroid/alman/dig/b0;

    invoke-static {v0}, Lcom/digdroid/alman/dig/b0;->a(Lcom/digdroid/alman/dig/b0;)Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f1101c7

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x104000a

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$d;->a:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$d;->b:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/b0$d;->b:Landroid/database/Cursor;

    const/4 v2, 0x4

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "pc"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0$d;->d:Lcom/digdroid/alman/dig/b0;

    iget-object v2, p0, Lcom/digdroid/alman/dig/b0$d;->a:Landroid/database/Cursor;

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/b0;->q(Landroid/database/Cursor;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    :try_start_0
    const-string v1, "(\\.exe|.com|\\.bat)$"

    const/4 v2, 0x2

    invoke-static {v1, v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v1

    new-instance v2, Lcom/digdroid/alman/dig/b0$d$a;

    invoke-direct {v2, p0, v1}, Lcom/digdroid/alman/dig/b0$d$a;-><init>(Lcom/digdroid/alman/dig/b0$d;Ljava/util/regex/Pattern;)V

    invoke-virtual {v0, v2}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "/DOS"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    array-length v1, v0

    if-nez v1, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0$d;->d:Lcom/digdroid/alman/dig/b0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0$d;->c:Lcom/digdroid/alman/dig/z3;

    iget-object v2, p0, Lcom/digdroid/alman/dig/b0$d;->a:Landroid/database/Cursor;

    iget-object v3, p0, Lcom/digdroid/alman/dig/b0$d;->b:Landroid/database/Cursor;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/digdroid/alman/dig/b0;->u(Lcom/digdroid/alman/dig/z3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)V

    return-void

    :cond_3
    array-length v1, v0

    add-int/lit8 v1, v1, 0x1

    new-array v1, v1, [Ljava/lang/CharSequence;

    const/4 v2, 0x0

    :goto_0
    array-length v3, v0

    if-ge v2, v3, :cond_4

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    array-length v2, v0

    const-string v3, "DOS prompt"

    aput-object v3, v1, v2

    new-instance v2, Landroidx/appcompat/app/b$a;

    iget-object v3, p0, Lcom/digdroid/alman/dig/b0$d;->c:Lcom/digdroid/alman/dig/z3;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v3, 0x7f110235

    invoke-virtual {v2, v3}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    move-result-object v2

    new-instance v3, Lcom/digdroid/alman/dig/b0$d$b;

    invoke-direct {v3, p0, v0, p1}, Lcom/digdroid/alman/dig/b0$d$b;-><init>(Lcom/digdroid/alman/dig/b0$d;[Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2, v1, v3}, Landroidx/appcompat/app/b$a;->g([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :catch_0
    return-void

    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/b0$d;->d:Lcom/digdroid/alman/dig/b0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0$d;->c:Lcom/digdroid/alman/dig/z3;

    iget-object v2, p0, Lcom/digdroid/alman/dig/b0$d;->a:Landroid/database/Cursor;

    iget-object v3, p0, Lcom/digdroid/alman/dig/b0$d;->b:Landroid/database/Cursor;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/digdroid/alman/dig/b0;->u(Lcom/digdroid/alman/dig/z3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)V

    return-void
.end method
