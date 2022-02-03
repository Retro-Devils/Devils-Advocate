.class public Lcom/digdroid/alman/dig/m0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/m0$o;,
        Lcom/digdroid/alman/dig/m0$p;
    }
.end annotation


# instance fields
.field a:Landroid/app/Activity;

.field b:J

.field c:Landroid/database/sqlite/SQLiteDatabase;

.field d:Lcom/digdroid/alman/dig/m0$p;

.field e:Lcom/digdroid/alman/dig/p1$a;


# direct methods
.method public constructor <init>(Landroid/app/Activity;JLcom/digdroid/alman/dig/m0$p;Lcom/digdroid/alman/dig/p1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    iput-wide p2, p0, Lcom/digdroid/alman/dig/m0;->b:J

    iput-object p4, p0, Lcom/digdroid/alman/dig/m0;->d:Lcom/digdroid/alman/dig/m0$p;

    iput-object p5, p0, Lcom/digdroid/alman/dig/m0;->e:Lcom/digdroid/alman/dig/p1$a;

    invoke-static {p1}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object p1

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    return-void
.end method

.method static b(Landroid/app/Activity;JLcom/digdroid/alman/dig/m0$o;)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    invoke-interface {p3, p1, p2}, Lcom/digdroid/alman/dig/m0$o;->a(J)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    const p2, 0x7f0c0065

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0901bf

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/EditText;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/EditText;->setTextColor(I)V

    new-instance v1, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v2

    invoke-direct {v1, p0, v2}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, p1}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v1, 0x7f1100db

    invoke-virtual {p1, v1}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const/high16 v1, 0x1040000

    invoke-virtual {p1, v1, v0}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x104000a

    new-instance v1, Lcom/digdroid/alman/dig/m0$e;

    invoke-direct {v1, p2, p0, p3}, Lcom/digdroid/alman/dig/m0$e;-><init>(Landroid/widget/EditText;Landroid/app/Activity;Lcom/digdroid/alman/dig/m0$o;)V

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p0

    invoke-virtual {p0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method private d()V
    .locals 8

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT gc._id,c.name FROM gamecollection as gc,collections as c WHERE gc.game="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " AND c._id=gc.collection ORDER BY c.name"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v1

    new-array v2, v1, [Ljava/lang/CharSequence;

    new-array v1, v1, [J

    const/4 v3, 0x0

    const/4 v4, 0x0

    :cond_1
    const/4 v5, 0x1

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v2, v4

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    aput-wide v6, v1, v4

    add-int/2addr v4, v5

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v3, p0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v4

    invoke-direct {v0, v3, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v3, 0x7f11020d

    invoke-virtual {v0, v3}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v3, Lcom/digdroid/alman/dig/m0$d;

    invoke-direct {v3, p0, v1}, Lcom/digdroid/alman/dig/m0$d;-><init>(Lcom/digdroid/alman/dig/m0;[J)V

    invoke-virtual {v0, v2, v3}, Landroidx/appcompat/app/b$a;->g([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method


# virtual methods
.method a()V
    .locals 13

    iget-object v2, p0, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    const-string v0, "SELECT _id,name FROM genres ORDER BY name"

    const/4 v6, 0x0

    invoke-virtual {v2, v0, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I

    move-result v3

    new-array v1, v3, [Ljava/lang/String;

    new-array v5, v3, [J

    new-array v4, v3, [Z

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v7

    if-eqz v7, :cond_2

    const/4 v7, 0x0

    const/4 v8, 0x0

    :cond_0
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9

    aput-wide v9, v5, v8

    const/4 v9, 0x1

    invoke-interface {v0, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v1, v8

    aput-boolean v7, v4, v8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "SELECT * FROM gamegenres WHERE game="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v11, p0, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {v10, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v11, " AND genre="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-wide v11, v5, v8

    invoke-virtual {v10, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2, v10, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10

    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v11

    if-eqz v11, :cond_1

    aput-boolean v9, v4, v8

    :cond_1
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    add-int/lit8 v8, v8, 0x1

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v9

    if-nez v9, :cond_0

    :cond_2
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    new-instance v7, Landroidx/appcompat/app/b$a;

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v8

    invoke-direct {v7, v0, v8}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v0, 0x7f110240

    invoke-virtual {v7, v0}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    new-instance v0, Lcom/digdroid/alman/dig/m0$b;

    invoke-direct {v0, p0, v4}, Lcom/digdroid/alman/dig/m0$b;-><init>(Lcom/digdroid/alman/dig/m0;[Z)V

    invoke-virtual {v7, v1, v4, v0}, Landroidx/appcompat/app/b$a;->k([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)Landroidx/appcompat/app/b$a;

    const v8, 0x7f1101d8

    new-instance v9, Lcom/digdroid/alman/dig/m0$c;

    move-object v0, v9

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/m0$c;-><init>(Lcom/digdroid/alman/dig/m0;Landroid/database/sqlite/SQLiteDatabase;I[Z[J)V

    invoke-virtual {v7, v8, v9}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    const v0, 0x7f11005a

    invoke-virtual {v7, v0, v6}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    invoke-virtual {v7}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public c(Landroid/view/MenuItem;)Z
    .locals 8

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v0, 0x7f1101d8

    const v1, 0x7f11005a

    const v2, 0x7f11008b

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    sparse-switch p1, :sswitch_data_0

    return v3

    :sswitch_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/m0;->e:Lcom/digdroid/alman/dig/p1$a;

    iget-wide v0, p0, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-interface {p1, v0, v1}, Lcom/digdroid/alman/dig/p1$a;->A(J)V

    return v5

    :sswitch_1
    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object v3, p0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v6

    invoke-direct {p1, v3, v6}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v2}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v1, v4}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    new-instance v1, Lcom/digdroid/alman/dig/m0$g;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/m0$g;-><init>(Lcom/digdroid/alman/dig/m0;)V

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return v5

    :sswitch_2
    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object v3, p0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v6

    invoke-direct {p1, v3, v6}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v2}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v1, v4}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    new-instance v1, Lcom/digdroid/alman/dig/m0$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/m0$a;-><init>(Lcom/digdroid/alman/dig/m0;)V

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return v5

    :sswitch_3
    invoke-direct {p0}, Lcom/digdroid/alman/dig/m0;->d()V

    return v5

    :sswitch_4
    new-instance p1, Lcom/digdroid/alman/dig/v2;

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    iget-object v1, p0, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v2, Lcom/digdroid/alman/dig/m0$h;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/m0$h;-><init>(Lcom/digdroid/alman/dig/m0;)V

    invoke-direct {p1, v0, v1, v3, v2}, Lcom/digdroid/alman/dig/v2;-><init>(Landroid/app/Activity;Landroid/database/sqlite/SQLiteDatabase;ZLcom/digdroid/alman/dig/v2$j;)V

    iget-wide v0, p0, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/v2;->f(J)V

    return v5

    :sswitch_5
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    const/16 v1, 0xc

    new-instance v2, Lcom/digdroid/alman/dig/m0$l;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/m0$l;-><init>(Lcom/digdroid/alman/dig/m0;)V

    invoke-virtual {p1, v0, v1, v2}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    return v5

    :sswitch_6
    iget-object p1, p0, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT favorite FROM roms WHERE _id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-ne v0, v5, :cond_0

    const/4 v3, 0x1

    :cond_0
    xor-int/lit8 v0, v3, 0x1

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "favorite"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "_id="

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v6, p0, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {v3, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v6, "roms"

    invoke-virtual {v2, v6, v1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    iget-object v1, p0, Lcom/digdroid/alman/dig/m0;->d:Lcom/digdroid/alman/dig/m0$p;

    invoke-interface {v1, v0}, Lcom/digdroid/alman/dig/m0$p;->c(Z)V

    :cond_1
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return v5

    :sswitch_7
    iget-object p1, p0, Lcom/digdroid/alman/dig/m0;->c:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT  sortname FROM roms WHERE _id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/m0;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0065

    invoke-virtual {v0, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0901bf

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/EditText;->setTextColor(I)V

    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object v2, p0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v3

    invoke-direct {p1, v2, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x7f1100cf

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const/high16 v0, 0x1040000

    invoke-virtual {p1, v0, v4}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x104000a

    new-instance v2, Lcom/digdroid/alman/dig/m0$n;

    invoke-direct {v2, p0, v1}, Lcom/digdroid/alman/dig/m0$n;-><init>(Lcom/digdroid/alman/dig/m0;Landroid/widget/EditText;)V

    invoke-virtual {p1, v0, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_2
    return v5

    :sswitch_8
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    const/4 v1, 0x5

    new-instance v2, Lcom/digdroid/alman/dig/m0$j;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/m0$j;-><init>(Lcom/digdroid/alman/dig/m0;)V

    invoke-virtual {p1, v0, v1, v2}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    return v5

    :sswitch_9
    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object v3, p0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v6

    invoke-direct {p1, v3, v6}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v2}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v1, v4}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    new-instance v1, Lcom/digdroid/alman/dig/m0$f;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/m0$f;-><init>(Lcom/digdroid/alman/dig/m0;)V

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return v5

    :sswitch_a
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    const/16 v1, 0xd

    new-instance v2, Lcom/digdroid/alman/dig/m0$m;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/m0$m;-><init>(Lcom/digdroid/alman/dig/m0;)V

    invoke-virtual {p1, v0, v1, v2}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    return v5

    :sswitch_b
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    const/4 v1, 0x2

    new-instance v2, Lcom/digdroid/alman/dig/m0$i;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/m0$i;-><init>(Lcom/digdroid/alman/dig/m0;)V

    invoke-virtual {p1, v0, v1, v2}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    return v5

    :sswitch_c
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    const/16 v1, 0x10

    new-instance v2, Lcom/digdroid/alman/dig/m0$k;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/m0$k;-><init>(Lcom/digdroid/alman/dig/m0;)V

    invoke-virtual {p1, v0, v1, v2}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    return v5

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f090054 -> :sswitch_c
        0x7f090056 -> :sswitch_b
        0x7f090142 -> :sswitch_a
        0x7f090145 -> :sswitch_9
        0x7f09017b -> :sswitch_8
        0x7f09017e -> :sswitch_7
        0x7f090193 -> :sswitch_6
        0x7f090214 -> :sswitch_5
        0x7f090327 -> :sswitch_4
        0x7f090331 -> :sswitch_3
        0x7f090335 -> :sswitch_2
        0x7f090336 -> :sswitch_1
        0x7f09036b -> :sswitch_0
    .end sparse-switch
.end method
