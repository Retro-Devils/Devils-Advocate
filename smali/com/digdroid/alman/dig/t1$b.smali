.class Lcom/digdroid/alman/dig/t1$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1;->k(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JZLcom/digdroid/alman/dig/t1$l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:J

.field final synthetic e:Landroid/database/sqlite/SQLiteDatabase;

.field final synthetic f:Lcom/digdroid/alman/dig/t1$l;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Lcom/digdroid/alman/dig/p1;

.field final synthetic i:Z

.field final synthetic j:Lcom/digdroid/alman/dig/t1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1;Landroid/app/Activity;Ljava/lang/String;JLandroid/database/sqlite/SQLiteDatabase;Lcom/digdroid/alman/dig/t1$l;Ljava/lang/String;Lcom/digdroid/alman/dig/p1;Z)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$b;->j:Lcom/digdroid/alman/dig/t1;

    iput-object p2, p0, Lcom/digdroid/alman/dig/t1$b;->b:Landroid/app/Activity;

    iput-object p3, p0, Lcom/digdroid/alman/dig/t1$b;->c:Ljava/lang/String;

    iput-wide p4, p0, Lcom/digdroid/alman/dig/t1$b;->d:J

    iput-object p6, p0, Lcom/digdroid/alman/dig/t1$b;->e:Landroid/database/sqlite/SQLiteDatabase;

    iput-object p7, p0, Lcom/digdroid/alman/dig/t1$b;->f:Lcom/digdroid/alman/dig/t1$l;

    iput-object p8, p0, Lcom/digdroid/alman/dig/t1$b;->g:Ljava/lang/String;

    iput-object p9, p0, Lcom/digdroid/alman/dig/t1$b;->h:Lcom/digdroid/alman/dig/p1;

    iput-boolean p10, p0, Lcom/digdroid/alman/dig/t1$b;->i:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 8

    const/4 p1, 0x1

    if-nez p2, :cond_0

    new-instance p2, Lcom/digdroid/alman/dig/i;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$b;->b:Landroid/app/Activity;

    invoke-direct {p2, v0}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/i;->f(Z)V

    new-instance p1, Lcom/digdroid/alman/dig/t1$b$a;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/t1$b$a;-><init>(Lcom/digdroid/alman/dig/t1$b;)V

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/i;->g(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/i;->d()V

    goto/16 :goto_2

    :cond_0
    const-string v0, "utf-8"

    if-ne p2, p1, :cond_1

    :try_start_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$b;->g:Ljava/lang/String;

    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "http://www.mobygames.com/search/quick?q="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$b;->j:Lcom/digdroid/alman/dig/t1;

    iget-object v2, p0, Lcom/digdroid/alman/dig/t1$b;->b:Landroid/app/Activity;

    iget-object v3, p0, Lcom/digdroid/alman/dig/t1$b;->h:Lcom/digdroid/alman/dig/p1;

    iget-wide v4, p0, Lcom/digdroid/alman/dig/t1$b;->d:J

    iget-object v6, p0, Lcom/digdroid/alman/dig/t1$b;->c:Ljava/lang/String;

    invoke-virtual/range {v1 .. v7}, Lcom/digdroid/alman/dig/t1;->m(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_1
    const/4 p1, 0x2

    if-ne p2, p1, :cond_2

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$b;->g:Ljava/lang/String;

    invoke-static {p1, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "http://thegamesdb.net/search.php/?name="

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "&function=Search"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$b;->j:Lcom/digdroid/alman/dig/t1;

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$b;->b:Landroid/app/Activity;

    iget-object v2, p0, Lcom/digdroid/alman/dig/t1$b;->h:Lcom/digdroid/alman/dig/p1;

    iget-wide v3, p0, Lcom/digdroid/alman/dig/t1$b;->d:J

    :goto_0
    iget-object v5, p0, Lcom/digdroid/alman/dig/t1$b;->c:Ljava/lang/String;

    invoke-virtual/range {v0 .. v6}, Lcom/digdroid/alman/dig/t1;->m(Landroid/app/Activity;Lcom/digdroid/alman/dig/p1;JLjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_2

    :cond_2
    const/4 p1, 0x3

    const/4 v1, 0x0

    if-ne p2, p1, :cond_4

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$b;->e:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT s.name FROM systems as s,roms as r WHERE r._id="

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/digdroid/alman/dig/t1$b;->d:J

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " AND s.slug=r.system"

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-eqz p2, :cond_3

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$b;->g:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "https://www.google.com/search?q="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "&tbm=isch"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$b;->j:Lcom/digdroid/alman/dig/t1;

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$b;->b:Landroid/app/Activity;

    iget-object v2, p0, Lcom/digdroid/alman/dig/t1$b;->h:Lcom/digdroid/alman/dig/p1;

    iget-wide v3, p0, Lcom/digdroid/alman/dig/t1$b;->d:J

    goto :goto_0

    :cond_3
    invoke-interface {p1}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :cond_4
    const/4 p1, 0x4

    const v0, 0x7f1101d8

    const v2, 0x7f11005a

    const v3, 0x7f11008b

    if-ne p2, p1, :cond_5

    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1$b;->b:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v4

    invoke-direct {p1, p2, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v3}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v2, v1}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    new-instance p2, Lcom/digdroid/alman/dig/t1$b$b;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/t1$b$b;-><init>(Lcom/digdroid/alman/dig/t1$b;)V

    :goto_1
    invoke-virtual {p1, v0, p2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    goto :goto_2

    :cond_5
    const/4 p1, 0x5

    if-ne p2, p1, :cond_6

    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1$b;->b:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v4

    invoke-direct {p1, p2, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v3}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v2, v1}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    new-instance p2, Lcom/digdroid/alman/dig/t1$b$c;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/t1$b$c;-><init>(Lcom/digdroid/alman/dig/t1$b;)V

    goto :goto_1

    :catch_0
    :cond_6
    :goto_2
    return-void
.end method
