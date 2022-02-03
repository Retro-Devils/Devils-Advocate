.class Lcom/digdroid/alman/dig/g3$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/a0$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/g3;->H2(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/digdroid/alman/dig/g3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/g3;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g3$j;->b:Lcom/digdroid/alman/dig/g3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/g3$j;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 10

    iget-object v0, p0, Lcom/digdroid/alman/dig/g3$j;->b:Lcom/digdroid/alman/dig/g3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/g3$j;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/h3;->l(Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/g3$j;->b:Lcom/digdroid/alman/dig/g3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/g3;->A0:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/digdroid/alman/dig/g3$j;->b:Lcom/digdroid/alman/dig/g3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/g3;->z0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    iget-object v4, p0, Lcom/digdroid/alman/dig/g3$j;->b:Lcom/digdroid/alman/dig/g3;

    iget-object v2, v4, Lcom/digdroid/alman/dig/g3;->z0:Ljava/util/ArrayList;

    new-instance v9, Lcom/digdroid/alman/dig/g3$r;

    const/4 v3, 0x0

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    const/4 v3, 0x1

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v3, 0x7

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v8

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lcom/digdroid/alman/dig/g3$r;-><init>(Lcom/digdroid/alman/dig/g3;JLjava/lang/String;I)V

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_0

    :cond_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/g3$j;->b:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/t0;->O2()V

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :goto_0
    throw v0

    :goto_1
    goto :goto_0
.end method
