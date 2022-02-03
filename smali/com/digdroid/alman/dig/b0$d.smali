.class Lcom/digdroid/alman/dig/b0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/x1$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/b0;->s(Lcom/digdroid/alman/dig/x3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/x3;

.field final synthetic b:Landroid/database/Cursor;

.field final synthetic c:Landroid/database/Cursor;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/digdroid/alman/dig/b0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/b0;Lcom/digdroid/alman/dig/x3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/b0$d;->e:Lcom/digdroid/alman/dig/b0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/b0$d;->a:Lcom/digdroid/alman/dig/x3;

    iput-object p3, p0, Lcom/digdroid/alman/dig/b0$d;->b:Landroid/database/Cursor;

    iput-object p4, p0, Lcom/digdroid/alman/dig/b0$d;->c:Landroid/database/Cursor;

    iput-object p5, p0, Lcom/digdroid/alman/dig/b0$d;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0$d;->a:Lcom/digdroid/alman/dig/x3;

    iget-object v2, p0, Lcom/digdroid/alman/dig/b0$d;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$d;->c:Landroid/database/Cursor;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    iget-object p1, p0, Lcom/digdroid/alman/dig/b0$d;->c:Landroid/database/Cursor;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    move-object v8, p2

    invoke-virtual/range {v1 .. v8}, Lcom/digdroid/alman/dig/x3;->e1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0$d;->e:Lcom/digdroid/alman/dig/b0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0$d;->a:Lcom/digdroid/alman/dig/x3;

    iget-object v2, p0, Lcom/digdroid/alman/dig/b0$d;->b:Landroid/database/Cursor;

    iget-object v3, p0, Lcom/digdroid/alman/dig/b0$d;->c:Landroid/database/Cursor;

    iget-object v4, p0, Lcom/digdroid/alman/dig/b0$d;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/digdroid/alman/dig/b0;->t(Lcom/digdroid/alman/dig/x3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)V

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 3

    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0$d;->a:Lcom/digdroid/alman/dig/x3;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v1, 0x7f1101d3

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f1101d8

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/b0$d;->e:Lcom/digdroid/alman/dig/b0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/b0$d;->a:Lcom/digdroid/alman/dig/x3;

    iget-object v2, p0, Lcom/digdroid/alman/dig/b0$d;->b:Landroid/database/Cursor;

    iget-object v3, p0, Lcom/digdroid/alman/dig/b0$d;->c:Landroid/database/Cursor;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/digdroid/alman/dig/b0;->t(Lcom/digdroid/alman/dig/x3;Landroid/database/Cursor;Landroid/database/Cursor;Ljava/lang/String;)V

    return-void
.end method
