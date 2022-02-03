.class Lcom/digdroid/alman/dig/j0$q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0;->H2(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 6

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v1, v0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0;->p1:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v3, v2, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    invoke-virtual {v3, v2}, Lcom/digdroid/alman/dig/h3;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v3, v3, Lcom/digdroid/alman/dig/p1;->e0:Lcom/digdroid/alman/dig/z1;

    invoke-virtual {v3}, Lcom/digdroid/alman/dig/z1;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const/16 v4, 0xa

    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/digdroid/alman/dig/o0;->b(Ljava/lang/String;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;I)Landroid/database/Cursor;

    move-result-object v0

    new-instance v1, Lb/a/o/d;

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v2

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v3

    invoke-direct {v1, v2, v3}, Lb/a/o/d;-><init>(Landroid/content/Context;I)V

    new-instance v2, Landroidx/appcompat/widget/l0;

    iget-object v3, p0, Lcom/digdroid/alman/dig/j0$q;->a:Lcom/digdroid/alman/dig/j0;

    iget-object v3, v3, Lcom/digdroid/alman/dig/j0;->p1:Landroid/widget/EditText;

    invoke-direct {v2, v1, v3}, Landroidx/appcompat/widget/l0;-><init>(Landroid/content/Context;Landroid/view/View;)V

    invoke-virtual {v2}, Landroidx/appcompat/widget/l0;->b()Landroid/view/MenuInflater;

    move-result-object v1

    const v3, 0x7f0d000f

    invoke-virtual {v2}, Landroidx/appcompat/widget/l0;->a()Landroid/view/Menu;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    new-instance v1, Lcom/digdroid/alman/dig/j0$q$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/j0$q$a;-><init>(Lcom/digdroid/alman/dig/j0$q;)V

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/l0;->c(Landroidx/appcompat/widget/l0$d;)V

    invoke-virtual {v2}, Landroidx/appcompat/widget/l0;->a()Landroid/view/Menu;

    move-result-object v1

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    const/4 v3, 0x0

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    const/4 v5, 0x1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v3, v4, v3, v5}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v2}, Landroidx/appcompat/widget/l0;->d()V

    :cond_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_3
    :goto_0
    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
