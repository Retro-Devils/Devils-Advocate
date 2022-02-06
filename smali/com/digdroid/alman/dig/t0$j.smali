.class Lcom/digdroid/alman/dig/t0$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t0;->H2(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/t0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t0$j;->a:Lcom/digdroid/alman/dig/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 9

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$j;->a:Lcom/digdroid/alman/dig/t0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "SELECT _id,name FROM collections WHERE isfolder=0 ORDER BY name"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->getCount()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v4, v2, 0x1

    new-array v5, v4, [Ljava/lang/CharSequence;

    new-array v4, v4, [J

    iget-object v6, p0, Lcom/digdroid/alman/dig/t0$j;->a:Lcom/digdroid/alman/dig/t0;

    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v6

    const v7, 0x7f1101bd

    invoke-virtual {v6, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v3

    const-wide/16 v6, -0x1

    aput-wide v6, v4, v3

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v2, :cond_1

    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x1

    invoke-interface {v1, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    aput-wide v7, v4, v6

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    goto :goto_1

    :cond_1
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    new-instance v1, Landroidx/appcompat/app/b$a;

    iget-object v2, p0, Lcom/digdroid/alman/dig/t0$j;->a:Lcom/digdroid/alman/dig/t0;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v2

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v2, 0x7f110020

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    move-result-object v1

    new-instance v2, Lcom/digdroid/alman/dig/t0$j$a;

    invoke-direct {v2, p0, v4, v0}, Lcom/digdroid/alman/dig/t0$j$a;-><init>(Lcom/digdroid/alman/dig/t0$j;[JLandroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {v1, v5, v2}, Landroidx/appcompat/app/b$a;->g([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
