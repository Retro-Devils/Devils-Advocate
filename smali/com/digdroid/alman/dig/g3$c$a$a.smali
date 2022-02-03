.class Lcom/digdroid/alman/dig/g3$c$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/g3$c$a;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/g3$c$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/g3$c$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->q0()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    new-array p2, p1, [I

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_1

    iget-object v2, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object v3, v3, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v3, v3, Lcom/digdroid/alman/dig/g3$c;->b:Landroid/database/Cursor;

    invoke-interface {v3}, Landroid/database/Cursor;->getCount()I

    move-result v3

    if-ge v2, v3, :cond_0

    iget-object v3, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object v3, v3, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v3, v3, Lcom/digdroid/alman/dig/g3$c;->b:Landroid/database/Cursor;

    invoke-interface {v3, v2}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v2, v1, 0x1

    iget-object v3, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object v3, v3, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v3, v3, Lcom/digdroid/alman/dig/g3$c;->b:Landroid/database/Cursor;

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v3

    aput v3, p2, v1

    iget-object v1, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object v1, v1, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v1, v1, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "UPDATE roms SET pathid=-1 WHERE pathid="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object v4, v4, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v4, v4, Lcom/digdroid/alman/dig/g3$c;->b:Landroid/database/Cursor;

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    move v1, v2

    :cond_0
    iget-object v2, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$c;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-ge v1, p1, :cond_2

    aget v2, p2, v1

    iget-object v3, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object v3, v3, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v3, v3, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    iget-object v3, v3, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v3}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "DELETE FROM rompaths WHERE _id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE rompaths SET selected=0 WHERE system=\'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object v1, v1, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v1, v1, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/g3$c;->b:Landroid/database/Cursor;

    invoke-interface {p1}, Landroid/database/Cursor;->requery()Z

    new-instance p1, Lcom/digdroid/alman/dig/g3$u;

    iget-object p2, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object p2, p2, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object p2, p2, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    const/4 v1, 0x0

    invoke-direct {p1, p2, v1}, Lcom/digdroid/alman/dig/g3$u;-><init>(Lcom/digdroid/alman/dig/g3;Lcom/digdroid/alman/dig/g3$h;)V

    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    aput-object v2, v1, v0

    iget-object v0, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v0, v0, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, v1, v2

    const/4 v0, 0x2

    iget-object v2, p0, Lcom/digdroid/alman/dig/g3$c$a$a;->b:Lcom/digdroid/alman/dig/g3$c$a;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$c$a;->b:Lcom/digdroid/alman/dig/g3$c;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3$c;->d:Lcom/digdroid/alman/dig/g3;

    iget-object v3, v2, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    aput-object v3, v1, v0

    const/4 v0, 0x3

    iget-object v2, v2, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    aput-object v2, v1, v0

    invoke-virtual {p1, p2, v1}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method
