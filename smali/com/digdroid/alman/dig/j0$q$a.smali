.class Lcom/digdroid/alman/dig/j0$q$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/appcompat/widget/l0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0$q;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/j0$q;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0$q;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$q$a;->a:Lcom/digdroid/alman/dig/j0$q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 7

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f090426

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$q$a;->a:Lcom/digdroid/alman/dig/j0$q;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    iget-wide v1, p1, Lcom/digdroid/alman/dig/j0;->q0:J

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->e0:Lcom/digdroid/alman/dig/z1;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/z1;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lcom/digdroid/alman/dig/o0;->s(JLandroid/database/sqlite/SQLiteDatabase;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$q$a;->a:Lcom/digdroid/alman/dig/j0$q;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v1, v0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    iget-wide v2, v0, Lcom/digdroid/alman/dig/j0;->q0:J

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->e0:Lcom/digdroid/alman/dig/z1;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z1;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    int-to-long v5, v0

    invoke-virtual/range {v1 .. v6}, Lcom/digdroid/alman/dig/o0;->l(JLandroid/database/sqlite/SQLiteDatabase;J)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$q$a;->a:Lcom/digdroid/alman/dig/j0$q;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    int-to-long v1, p1

    const-string p1, "com.digdroid.alman.dig.action.GAME_STATS"

    invoke-static {v0, p1, v1, v2}, Lcom/digdroid/alman/dig/ServerService;->m(Landroid/content/Context;Ljava/lang/String;J)V

    :goto_0
    new-instance p1, Lcom/digdroid/alman/dig/j0$q$a$a;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/j0$q$a$a;-><init>(Lcom/digdroid/alman/dig/j0$q$a;)V

    new-instance v0, Lcom/digdroid/alman/dig/j0$b0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$q$a;->a:Lcom/digdroid/alman/dig/j0$q;

    iget-object v1, v1, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    invoke-direct {v0, v1, p1}, Lcom/digdroid/alman/dig/j0$b0;-><init>(Lcom/digdroid/alman/dig/j0;Lcom/digdroid/alman/dig/j0$a0;)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    const/4 p1, 0x1

    return p1
.end method
