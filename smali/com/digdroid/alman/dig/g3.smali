.class public Lcom/digdroid/alman/dig/g3;
.super Lcom/digdroid/alman/dig/t0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/g3$s;,
        Lcom/digdroid/alman/dig/g3$u;,
        Lcom/digdroid/alman/dig/g3$t;,
        Lcom/digdroid/alman/dig/g3$r;
    }
.end annotation


# instance fields
.field A0:Ljava/lang/Object;

.field B0:Z

.field C0:Ljava/lang/String;

.field D0:I

.field E0:I

.field F0:Landroidx/appcompat/app/b;

.field z0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/digdroid/alman/dig/g3$r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/digdroid/alman/dig/t0;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/g3;->A0:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/g3;->B0:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/digdroid/alman/dig/g3;->C0:Ljava/lang/String;

    iput v0, p0, Lcom/digdroid/alman/dig/g3;->E0:I

    return-void
.end method

.method private L3()V
    .locals 10

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const v2, 0x7f1101ca

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v2, 0x7f1100ba

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v2, 0x7f1100b2

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->l0:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v3

    const-string v4, "Retroarch/overlays.txt"

    invoke-virtual {v3, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    new-instance v4, Ljava/io/BufferedReader;

    new-instance v5, Ljava/io/InputStreamReader;

    invoke-direct {v5, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    :goto_1
    :try_start_2
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :catch_0
    nop

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object v2, v4

    goto :goto_2

    :catch_1
    nop

    goto :goto_3

    :catchall_1
    move-exception v0

    :goto_2
    if-eqz v2, :cond_1

    :try_start_3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :cond_1
    throw v0

    :catch_3
    move-object v4, v2

    :goto_3
    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    :goto_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x4

    if-ge v3, v4, :cond_3

    return-void

    :cond_3
    const/4 v3, -0x1

    iget-object v4, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v4}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SELECT overlay,overlay_opacity FROM systems WHERE slug=\'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v6, v6, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\'"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    const/4 v5, 0x0

    invoke-interface {v4, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    invoke-interface {v4, v7}, Landroid/database/Cursor;->getFloat(I)F

    move-result v8

    const/high16 v9, 0x42c80000    # 100.0f

    mul-float v8, v8, v9

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    if-nez v6, :cond_4

    goto :goto_7

    :cond_4
    const-string v4, "default"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v5, 0x1

    goto :goto_7

    :cond_5
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_6

    invoke-virtual {v6, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/4 v5, 0x2

    goto :goto_7

    :cond_6
    const/4 v4, 0x3

    :goto_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v4, v5, :cond_9

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_6

    :cond_7
    if-gez v3, :cond_8

    const-string v7, "gamepads/flat/retropad.cfg"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    :goto_6
    move v3, v4

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_9
    move v5, v3

    :goto_7
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v3

    const v4, 0x7f0c00e3

    invoke-virtual {v3, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f0902e5

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    invoke-static {v4}, Lcom/digdroid/alman/dig/q3;->s(Landroid/widget/TextView;)V

    const v4, 0x7f0902e6

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    invoke-static {v4}, Lcom/digdroid/alman/dig/q3;->s(Landroid/widget/TextView;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "%"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v6, 0x7f0902e4

    invoke-virtual {v3, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/SeekBar;

    sget-object v7, Lcom/digdroid/alman/dig/q3;->a:Lcom/digdroid/alman/dig/t3;

    invoke-virtual {v7}, Lcom/digdroid/alman/dig/t3;->b()I

    move-result v7

    invoke-static {v6, v7}, Lcom/digdroid/alman/dig/q3;->r(Landroid/view/View;I)V

    const/16 v7, 0x64

    invoke-virtual {v6, v7}, Landroid/widget/SeekBar;->setMax(I)V

    invoke-virtual {v6, v8}, Landroid/widget/SeekBar;->setProgress(I)V

    new-instance v7, Lcom/digdroid/alman/dig/g3$d;

    invoke-direct {v7, p0, v4}, Lcom/digdroid/alman/dig/g3$d;-><init>(Lcom/digdroid/alman/dig/g3;Landroid/widget/TextView;)V

    invoke-virtual {v6, v7}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    const v4, 0x7f0902ef

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/digdroid/alman/dig/MyListView;

    new-instance v7, Lcom/digdroid/alman/dig/g3$s;

    invoke-direct {v7, p0, v0, v1, v5}, Lcom/digdroid/alman/dig/g3$s;-><init>(Lcom/digdroid/alman/dig/g3;Landroid/app/Activity;Ljava/util/ArrayList;I)V

    invoke-virtual {v4, v7}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    new-instance v5, Lcom/digdroid/alman/dig/g3$e;

    invoke-direct {v5, p0}, Lcom/digdroid/alman/dig/g3$e;-><init>(Lcom/digdroid/alman/dig/g3;)V

    invoke-virtual {v4, v5}, Landroid/widget/ListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    new-instance v5, Lcom/digdroid/alman/dig/g3$f;

    invoke-direct {v5, p0, v7}, Lcom/digdroid/alman/dig/g3$f;-><init>(Lcom/digdroid/alman/dig/g3;Lcom/digdroid/alman/dig/g3$s;)V

    invoke-virtual {v4, v5}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    new-instance v4, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v5

    invoke-direct {v4, v0, v5}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v3}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v3, 0x7f11005a

    invoke-virtual {v0, v3, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v2, 0x7f1101da

    new-instance v3, Lcom/digdroid/alman/dig/g3$g;

    invoke-direct {v3, p0, v7, v1, v6}, Lcom/digdroid/alman/dig/g3$g;-><init>(Lcom/digdroid/alman/dig/g3;Lcom/digdroid/alman/dig/g3$s;Ljava/util/ArrayList;Landroid/widget/SeekBar;)V

    invoke-virtual {v0, v2, v3}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method


# virtual methods
.method B3(Landroid/content/Intent;)Z
    .locals 1

    const-string v0, "system"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method D3()Landroid/database/Cursor;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->E3()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/o0;->e(Ljava/lang/String;Lcom/digdroid/alman/dig/h0;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public H2(Landroid/view/MenuItem;)Z
    .locals 12

    iget-object v0, p0, Lcom/digdroid/alman/dig/g3;->A0:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/g3;->z0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/digdroid/alman/dig/g3$r;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v5

    int-to-long v5, v5

    iget-wide v7, v2, Lcom/digdroid/alman/dig/g3$r;->a:J

    cmp-long v9, v5, v7

    if-nez v9, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    long-to-int v5, v7

    invoke-virtual {p1, v1, v5}, Lcom/digdroid/alman/dig/h3;->F(Ljava/lang/String;I)V

    iget-wide v5, v2, Lcom/digdroid/alman/dig/g3$r;->a:J

    long-to-int p1, v5

    iput p1, p0, Lcom/digdroid/alman/dig/g3;->D0:I

    iget-object p1, v2, Lcom/digdroid/alman/dig/g3$r;->b:Ljava/lang/String;

    iput-object p1, p0, Lcom/digdroid/alman/dig/g3;->C0:Ljava/lang/String;

    iget p1, v2, Lcom/digdroid/alman/dig/g3$r;->c:I

    iput p1, p0, Lcom/digdroid/alman/dig/g3;->E0:I

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->R()V

    invoke-virtual {p0, v3}, Lcom/digdroid/alman/dig/r1;->G2(Z)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->O2()V

    monitor-exit v0

    return v4

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v1, 0x2

    const v2, 0x7f1101da

    const v5, 0x7f11005a

    const/4 v6, 0x0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_4

    :sswitch_0
    invoke-virtual {p0, v4}, Lcom/digdroid/alman/dig/g3;->N3(I)V

    return v4

    :sswitch_1
    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/g3;->N3(I)V

    return v4

    :sswitch_2
    invoke-virtual {p0, v3}, Lcom/digdroid/alman/dig/g3;->N3(I)V

    return v4

    :sswitch_3
    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/h3;->K(Landroid/app/Activity;Ljava/lang/String;)V

    return v4

    :sswitch_4
    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    const-string v0, "android"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "SELECT _id,title FROM roms WHERE system=\'"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' AND ignored=1 ORDER BY sortname ASC"

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "SELECT _id,filename FROM roms WHERE system=\'"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' AND ignored=1 ORDER BY filename ASC"

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0, p1, v6}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    new-array v1, v0, [Ljava/lang/String;

    new-array v7, v0, [J

    new-array v8, v0, [Z

    const/4 v9, 0x0

    :cond_3
    invoke-interface {p1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v10

    aput-object v10, v1, v9

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v10

    aput-wide v10, v7, v9

    aput-boolean v3, v8, v9

    add-int/2addr v9, v4

    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v10

    if-nez v10, :cond_3

    new-instance v3, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v9

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v10

    invoke-direct {v3, v9, v10}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    new-instance v9, Lcom/digdroid/alman/dig/g3$p;

    invoke-direct {v9, p0, v8}, Lcom/digdroid/alman/dig/g3$p;-><init>(Lcom/digdroid/alman/dig/g3;[Z)V

    invoke-virtual {v3, v1, v8, v9}, Landroidx/appcompat/app/b$a;->k([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)Landroidx/appcompat/app/b$a;

    new-instance v1, Lcom/digdroid/alman/dig/g3$q;

    invoke-direct {v1, p0, v0, v8, v7}, Lcom/digdroid/alman/dig/g3$q;-><init>(Lcom/digdroid/alman/dig/g3;I[Z[J)V

    invoke-virtual {v3, v2, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    invoke-virtual {v3, v5, v6}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    invoke-virtual {v3}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    goto :goto_1

    :cond_4
    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "0 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0x7f110212

    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x104000a

    new-instance v2, Lcom/digdroid/alman/dig/g3$a;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/g3$a;-><init>(Lcom/digdroid/alman/dig/g3;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    :goto_1
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return v4

    :sswitch_5
    new-instance p1, Lcom/digdroid/alman/dig/g3$i;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/g3$i;-><init>(Lcom/digdroid/alman/dig/g3;)V

    new-array v0, v3, [Ljava/lang/Void;

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return v4

    :sswitch_6
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    const/4 v1, 0x6

    new-instance v2, Lcom/digdroid/alman/dig/g3$h;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/g3$h;-><init>(Lcom/digdroid/alman/dig/g3;)V

    invoke-virtual {p1, v0, v1, v2}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$s;)V

    return v4

    :sswitch_7
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/g3;->M3()V

    return v4

    :sswitch_8
    new-instance p1, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v0, 0x7f110226

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v5, v6}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    new-instance v0, Lcom/digdroid/alman/dig/g3$l;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/g3$l;-><init>(Lcom/digdroid/alman/dig/g3;)V

    invoke-virtual {p1, v2, v0}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return v4

    :sswitch_9
    invoke-direct {p0}, Lcom/digdroid/alman/dig/g3;->L3()V

    return v4

    :sswitch_a
    new-instance p1, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/p1;->b3(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    const v0, 0x7f110135

    goto :goto_2

    :cond_5
    const v0, 0x7f110136

    :goto_2
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v5, v6}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    new-instance v0, Lcom/digdroid/alman/dig/g3$n;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/g3$n;-><init>(Lcom/digdroid/alman/dig/g3;)V

    invoke-virtual {p1, v2, v0}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return v4

    :sswitch_b
    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/h3;->w(Ljava/lang/String;)Z

    move-result p1

    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v3

    invoke-direct {v0, v1, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    if-eqz p1, :cond_6

    const p1, 0x7f110133

    goto :goto_3

    :cond_6
    const p1, 0x7f110134

    :goto_3
    invoke-virtual {v0, p1}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v5, v6}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    new-instance v0, Lcom/digdroid/alman/dig/g3$m;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/g3$m;-><init>(Lcom/digdroid/alman/dig/g3;)V

    invoke-virtual {p1, v2, v0}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return v4

    :sswitch_c
    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->f0:Lcom/digdroid/alman/dig/t1;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {v2, v1}, Lcom/digdroid/alman/dig/h3;->w(Ljava/lang/String;)Z

    move-result v2

    invoke-virtual {p1, v0, v1, v2}, Lcom/digdroid/alman/dig/t1;->t(Landroid/app/Activity;Ljava/lang/String;Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->R()V

    invoke-virtual {p0, v3}, Lcom/digdroid/alman/dig/r1;->G2(Z)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->O2()V

    return v4

    :sswitch_d
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    const/16 v1, 0xe

    new-instance v2, Lcom/digdroid/alman/dig/g3$o;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/g3$o;-><init>(Lcom/digdroid/alman/dig/g3;)V

    invoke-virtual {p1, v0, v1, v2}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$s;)V

    return v4

    :sswitch_e
    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/g3;->K3()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/h3;->t(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/digdroid/alman/dig/a0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v2

    new-instance v3, Lcom/digdroid/alman/dig/g3$j;

    invoke-direct {v3, p0, v0}, Lcom/digdroid/alman/dig/g3$j;-><init>(Lcom/digdroid/alman/dig/g3;Ljava/lang/String;)V

    invoke-direct {v1, v2, v3}, Lcom/digdroid/alman/dig/a0;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/a0$g;)V

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/a0;->c(Ljava/lang/String;)V

    goto :goto_4

    :sswitch_f
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    new-instance v2, Lcom/digdroid/alman/dig/g3$k;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/g3$k;-><init>(Lcom/digdroid/alman/dig/g3;)V

    invoke-virtual {p1, v0, v1, v2}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$s;)V

    return v4

    :goto_4
    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/t0;->H2(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_6

    :goto_5
    throw p1

    :goto_6
    goto :goto_5

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f090056 -> :sswitch_f
        0x7f090178 -> :sswitch_e
        0x7f090217 -> :sswitch_d
        0x7f09021c -> :sswitch_c
        0x7f09032d -> :sswitch_b
        0x7f090333 -> :sswitch_a
        0x7f09033b -> :sswitch_9
        0x7f09034e -> :sswitch_8
        0x7f090373 -> :sswitch_7
        0x7f09040a -> :sswitch_6
        0x7f09040b -> :sswitch_5
        0x7f090425 -> :sswitch_4
        0x7f090426 -> :sswitch_3
        0x7f09042e -> :sswitch_2
        0x7f09042f -> :sswitch_1
        0x7f090430 -> :sswitch_0
    .end sparse-switch
.end method

.method public K3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    return-object v0
.end method

.method M3()V
    .locals 8

    iget-object v0, p0, Lcom/digdroid/alman/dig/g3;->F0:Landroidx/appcompat/app/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/g3;->F0:Landroidx/appcompat/app/b;

    invoke-virtual {v0}, Landroidx/appcompat/app/g;->dismiss()V

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "UPDATE rompaths SET selected=0 WHERE system=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "SELECT _id,path,selected FROM rompaths WHERE system=\'"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v3, v3, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v5

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v6

    invoke-direct {v4, v5, v6}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v5, 0x7f110245

    invoke-virtual {v4, v5}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    new-instance v5, Lcom/digdroid/alman/dig/g3$b;

    invoke-direct {v5, p0, v3, v1, v0}, Lcom/digdroid/alman/dig/g3$b;-><init>(Lcom/digdroid/alman/dig/g3;Ljava/util/ArrayList;Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;)V

    const-string v6, "selected"

    const-string v7, "path"

    invoke-virtual {v4, v1, v6, v7, v5}, Landroidx/appcompat/app/b$a;->j(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnMultiChoiceClickListener;)Landroidx/appcompat/app/b$a;

    const v5, 0x7f1100bc

    invoke-virtual {v4, v5, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    const v5, 0x7f11001c

    invoke-virtual {v4, v5, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    const v5, 0x7f1100cb

    invoke-virtual {v4, v5, v2}, Landroidx/appcompat/app/b$a;->m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    invoke-virtual {v4}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v2

    iput-object v2, p0, Lcom/digdroid/alman/dig/g3;->F0:Landroidx/appcompat/app/b;

    new-instance v4, Lcom/digdroid/alman/dig/g3$c;

    invoke-direct {v4, p0, v3, v1, v0}, Lcom/digdroid/alman/dig/g3$c;-><init>(Lcom/digdroid/alman/dig/g3;Ljava/util/ArrayList;Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {v2, v4}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/g3;->F0:Landroidx/appcompat/app/b;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method N3(I)V
    .locals 6

    iput p1, p0, Lcom/digdroid/alman/dig/g3;->E0:I

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3;->z0:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/g3$r;

    iget-wide v1, v0, Lcom/digdroid/alman/dig/g3$r;->a:J

    iget v3, p0, Lcom/digdroid/alman/dig/g3;->D0:I

    int-to-long v3, v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    iget v1, p0, Lcom/digdroid/alman/dig/g3;->E0:I

    iput v1, v0, Lcom/digdroid/alman/dig/g3$r;->c:I

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE emulators SET use_retroarch64="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/digdroid/alman/dig/g3;->E0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " WHERE _id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/digdroid/alman/dig/g3;->D0:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return-void
.end method

.method public Q2()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/h3;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    iget-object v2, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/h3;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    invoke-interface {v2, v3, v0, v1}, Lcom/digdroid/alman/dig/p1$a;->G(Lcom/digdroid/alman/dig/t3;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public S2()V
    .locals 3

    invoke-super {p0}, Lcom/digdroid/alman/dig/t0;->S2()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->B()Landroid/view/Menu;

    move-result-object v0

    const v1, 0x7f0903d5

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/g3;->K3()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/h3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    :cond_0
    return-void
.end method

.method public W0(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/t0;->W0(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "system"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    return-void
.end method

.method public a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/t0;->a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public m3()F
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/g3;->K3()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/h3;->q(Ljava/lang/String;)F

    move-result v0

    return v0
.end method

.method public p2(Landroid/view/Menu;)V
    .locals 9

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/t0;->p2(Landroid/view/Menu;)V

    const v0, 0x7f090056

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/c3;->u()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f090271

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v1, v1, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/p1;->b3(Ljava/lang/String;)Z

    move-result v1

    const v3, 0x7f090270

    invoke-interface {v0, v3}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const v3, 0x7f11017a

    const v4, 0x7f110228

    if-eqz v1, :cond_0

    const v5, 0x7f11017a

    goto :goto_0

    :cond_0
    const v5, 0x7f110228

    :goto_0
    invoke-interface {v0, v5}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V

    const v0, 0x7f09043a

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V

    const v5, 0x7f09040b

    invoke-interface {v0, v5}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v5

    if-eqz v1, :cond_1

    const v3, 0x7f110228

    :cond_1
    invoke-interface {v5, v3}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    const v1, 0x7f09040a

    invoke-interface {v0, v1}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    iget-object v3, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v3, v3, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/digdroid/alman/dig/h3;->x(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const v1, 0x7f11018a

    goto :goto_1

    :cond_2
    const v1, 0x7f11025a

    :goto_1
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    const v0, 0x7f090217

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/g3;->B0:Z

    xor-int/2addr v1, v2

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f090426

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/g3;->B0:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f090371

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/g3;->C0:Ljava/lang/String;

    const v3, 0x7f090431

    const/4 v4, 0x0

    if-eqz v1, :cond_6

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    iget-object v1, p0, Lcom/digdroid/alman/dig/g3;->C0:Ljava/lang/String;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/g3;->A0:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v5, p0, Lcom/digdroid/alman/dig/g3;->z0:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/digdroid/alman/dig/g3$r;

    iget-wide v7, v6, Lcom/digdroid/alman/dig/g3$r;->a:J

    long-to-int v8, v7

    iget-object v6, v6, Lcom/digdroid/alman/dig/g3$r;->b:Ljava/lang/String;

    invoke-interface {v0, v4, v8, v4, v6}, Landroid/view/SubMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    goto :goto_2

    :cond_3
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.retroarch.ra32"

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/a4;->s(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v1

    const-string v5, "com.retroarch.aarch64"

    invoke-static {v1, v5}, Lcom/digdroid/alman/dig/a4;->s(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iget-object v3, p0, Lcom/digdroid/alman/dig/g3;->C0:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    const-string v5, "retroarch"

    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_5

    if-nez v0, :cond_4

    if-eqz v1, :cond_5

    :cond_4
    const/4 v3, 0x1

    goto :goto_3

    :cond_5
    const/4 v3, 0x0

    :goto_3
    invoke-interface {p1, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v3

    iget v5, p0, Lcom/digdroid/alman/dig/g3;->E0:I

    invoke-static {v3, v5}, Lcom/digdroid/alman/dig/y2;->v(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {p1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/SubMenu;->clearHeader()V

    const v3, 0x7f09042e

    invoke-interface {p1, v3}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v4}, Lcom/digdroid/alman/dig/y2;->v(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v3, 0x7f09042f

    invoke-interface {p1, v3}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    invoke-interface {v3, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v0

    const/4 v4, 0x2

    invoke-static {v0, v4}, Lcom/digdroid/alman/dig/y2;->v(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v0, 0x7f090430

    invoke-interface {p1, v0}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/digdroid/alman/dig/y2;->v(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    goto :goto_4

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_6
    invoke-interface {v0, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f090373

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f09034e

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f09033b

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1, v4}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :goto_4
    return-void
.end method

.method public r1()V
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/t0;->r1()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->i0:Z

    return-void
.end method

.method public t1()V
    .locals 2

    invoke-super {p0}, Lcom/digdroid/alman/dig/r1;->t1()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/g3;->A0:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/digdroid/alman/dig/g3;->z0:Ljava/util/ArrayList;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lcom/digdroid/alman/dig/g3$t;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/g3$t;-><init>(Lcom/digdroid/alman/dig/g3;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public u3(F)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/g3;->K3()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/h3;->G(Ljava/lang/String;F)V

    return-void
.end method

.method z3()Ljava/lang/String;
    .locals 1

    const-string v0, "date"

    return-object v0
.end method
