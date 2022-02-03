.class Lcom/digdroid/alman/dig/t1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t1;->q(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/t1$l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/app/Activity;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lcom/digdroid/alman/dig/t1$l;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Z

.field final synthetic h:Lcom/digdroid/alman/dig/t1;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t1;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;Lcom/digdroid/alman/dig/t1$l;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iput-object p2, p0, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/digdroid/alman/dig/t1$a;->c:Landroid/app/Activity;

    iput-object p4, p0, Lcom/digdroid/alman/dig/t1$a;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/digdroid/alman/dig/t1$a;->e:Lcom/digdroid/alman/dig/t1$l;

    iput-object p6, p0, Lcom/digdroid/alman/dig/t1$a;->f:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/digdroid/alman/dig/t1$a;->g:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    const/4 p1, 0x0

    const/4 v0, 0x1

    if-nez p2, :cond_1

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p2, p2, Lcom/digdroid/alman/dig/t1;->e:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT _id FROM systems WHERE slug=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1, p1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lcom/digdroid/alman/dig/i;

    iget-object v1, p0, Lcom/digdroid/alman/dig/t1$a;->c:Landroid/app/Activity;

    invoke-direct {p2, v1}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p2, v0}, Lcom/digdroid/alman/dig/i;->f(Z)V

    new-instance v0, Lcom/digdroid/alman/dig/t1$a$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/t1$a$a;-><init>(Lcom/digdroid/alman/dig/t1$a;)V

    invoke-virtual {p2, v0}, Lcom/digdroid/alman/dig/i;->g(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/i;->d()V

    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    goto/16 :goto_0

    :cond_1
    if-ne p2, v0, :cond_2

    sget-object p1, Lcom/digdroid/alman/dig/p3;->a:Lcom/digdroid/alman/dig/s3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s3;->t:Ljava/lang/String;

    const-string p2, ""

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a;->f:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lcom/digdroid/alman/dig/t1;->z(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1;->d:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/g3;->e()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a;->c:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    goto/16 :goto_0

    :cond_2
    const/4 v0, 0x2

    if-ne p2, v0, :cond_3

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1;->d:Lcom/digdroid/alman/dig/g3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1$a;->c:Landroid/app/Activity;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lcom/digdroid/alman/dig/g3;->C(Landroid/app/Activity;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_3
    const/4 v0, 0x3

    if-ne p2, v0, :cond_5

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/t1$a;->g:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1;->d:Lcom/digdroid/alman/dig/g3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1$a;->c:Landroid/app/Activity;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    invoke-virtual {p1, p2, v0}, Lcom/digdroid/alman/dig/g3;->J(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/digdroid/alman/dig/t1$a;->h:Lcom/digdroid/alman/dig/t1;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t1;->d:Lcom/digdroid/alman/dig/g3;

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1$a;->c:Landroid/app/Activity;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    new-instance v1, Lcom/digdroid/alman/dig/t1$a$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/t1$a$b;-><init>(Lcom/digdroid/alman/dig/t1$a;)V

    invoke-virtual {p1, p2, v0, v1}, Lcom/digdroid/alman/dig/g3;->A(Landroid/app/Activity;Ljava/lang/String;Lcom/digdroid/alman/dig/g3$n;)V

    goto :goto_0

    :cond_5
    const/4 v0, 0x4

    if-ne p2, v0, :cond_8

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1$a;->f:Ljava/lang/String;

    const-string v0, "android"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    return-void

    :cond_6
    iget-object p2, p0, Lcom/digdroid/alman/dig/t1$a;->b:Ljava/lang/String;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a;->f:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/t1$a;->c:Landroid/app/Activity;

    const/16 v0, 0x8

    new-instance v1, Lcom/digdroid/alman/dig/t1$a$c;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/t1$a$c;-><init>(Lcom/digdroid/alman/dig/t1$a;)V

    invoke-virtual {p1, p2, v0, v1}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    goto :goto_0

    :cond_7
    new-instance p2, Landroidx/appcompat/app/b$a;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t1$a;->c:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {p2, v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v0, 0x7f11008b

    invoke-virtual {p2, v0}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p2

    const v0, 0x7f11005a

    invoke-virtual {p2, v0, p1}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const p2, 0x7f1101d8

    new-instance v0, Lcom/digdroid/alman/dig/t1$a$d;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/t1$a$d;-><init>(Lcom/digdroid/alman/dig/t1$a;)V

    invoke-virtual {p1, p2, v0}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_8
    :goto_0
    return-void
.end method
