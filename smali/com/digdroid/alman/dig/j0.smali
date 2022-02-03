.class public Lcom/digdroid/alman/dig/j0;
.super Lcom/digdroid/alman/dig/p1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/j0$b0;,
        Lcom/digdroid/alman/dig/j0$a0;,
        Lcom/digdroid/alman/dig/j0$z;
    }
.end annotation


# static fields
.field static n0:[I

.field static o0:[Z

.field static p0:[Ljava/lang/String;


# instance fields
.field A0:Ljava/lang/String;

.field A1:Landroid/widget/ScrollView;

.field B0:Ljava/lang/String;

.field B1:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field C0:Ljava/lang/String;

.field C1:Landroid/os/Handler;

.field D0:Ljava/lang/String;

.field D1:Z

.field E0:Ljava/lang/String;

.field E1:Ljava/io/File;

.field F0:Ljava/lang/String;

.field F1:Ljava/lang/Runnable;

.field G0:Ljava/lang/String;

.field G1:Lcom/digdroid/alman/dig/n2;

.field H0:Ljava/lang/String;

.field H1:Lcom/digdroid/alman/dig/n2$f;

.field I0:Ljava/lang/String;

.field I1:Landroidx/appcompat/app/b;

.field J0:Ljava/lang/String;

.field K0:J

.field L0:J

.field M0:J

.field N0:J

.field O0:J

.field P0:F

.field Q0:I

.field R0:I

.field S0:I

.field T0:Ljava/io/File;

.field U0:Ljava/io/File;

.field V0:Z

.field W0:Z

.field X0:Ljava/lang/String;

.field Y0:Ljava/lang/String;

.field Z0:J

.field a1:J

.field b1:J

.field c1:J

.field d1:J

.field e1:J

.field f1:Lcom/digdroid/alman/dig/h0;

.field g1:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/digdroid/alman/dig/j0$z;",
            ">;"
        }
    .end annotation
.end field

.field h1:Ljava/lang/String;

.field i1:I

.field j1:I

.field k1:Landroid/widget/TextView;

.field l1:Landroid/widget/TextView;

.field m1:Landroid/widget/TextView;

.field n1:Landroid/widget/TextView;

.field o1:Landroid/widget/TextView;

.field p1:Landroid/widget/EditText;

.field q0:J

.field q1:Landroid/widget/EditText;

.field r0:I

.field r1:Landroid/widget/EditText;

.field s0:Ljava/lang/String;

.field s1:Landroid/widget/EditText;

.field t0:Landroid/database/sqlite/SQLiteDatabase;

.field t1:Landroid/widget/EditText;

.field u0:Z

.field u1:Landroidx/constraintlayout/widget/ConstraintLayout;

.field v0:Z

.field v1:Landroid/widget/RatingBar;

.field w0:Z

.field w1:Landroid/widget/ImageView;

.field x0:Z

.field x1:Landroid/widget/ImageView;

.field y0:Ljava/lang/String;

.field y1:Landroid/widget/ImageView;

.field z0:Ljava/lang/String;

.field z1:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xd

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lcom/digdroid/alman/dig/j0;->n0:[I

    new-array v1, v0, [Z

    fill-array-data v1, :array_1

    sput-object v1, Lcom/digdroid/alman/dig/j0;->o0:[Z

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "game_play_videos"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "game_play_videos_mobile"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "show_cover"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "show_screenshot"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "show_file"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "show_rating"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "show_genres"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "show_info"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "show_publisher"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "show_developer"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "show_released"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "show_comments"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "show_collections"

    aput-object v2, v0, v1

    sput-object v0, Lcom/digdroid/alman/dig/j0;->p0:[Ljava/lang/String;

    return-void

    nop

    :array_0
    .array-data 4
        0x7f1101ef
        0x7f1101f0
        0x7f110053
        0x7f110224
        0x7f1100ea
        0x7f110204
        0x7f110105
        0x7f1100f8
        0x7f110200
        0x7f1100c3
        0x7f11020a
        0x7f110073
        0x7f110071
    .end array-data

    :array_1
    .array-data 1
        0x0t
        0x0t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
        0x1t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lcom/digdroid/alman/dig/p1;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/j0;->V0:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/j0;->W0:Z

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/digdroid/alman/dig/j0;->Z0:J

    iput-wide v1, p0, Lcom/digdroid/alman/dig/j0;->a1:J

    iput-wide v1, p0, Lcom/digdroid/alman/dig/j0;->b1:J

    iput-wide v1, p0, Lcom/digdroid/alman/dig/j0;->c1:J

    iput-wide v1, p0, Lcom/digdroid/alman/dig/j0;->d1:J

    iput-wide v1, p0, Lcom/digdroid/alman/dig/j0;->e1:J

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->g1:Ljava/util/ArrayList;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->h1:Ljava/lang/String;

    iput v0, p0, Lcom/digdroid/alman/dig/j0;->j1:I

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->w1:Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->x1:Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->y1:Landroid/widget/ImageView;

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, p0, Lcom/digdroid/alman/dig/j0;->z1:Ljava/lang/Object;

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->B1:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->C1:Landroid/os/Handler;

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/j0;->D1:Z

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->E1:Ljava/io/File;

    new-instance v0, Lcom/digdroid/alman/dig/j0$a;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/j0$a;-><init>(Lcom/digdroid/alman/dig/j0;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->F1:Ljava/lang/Runnable;

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->G1:Lcom/digdroid/alman/dig/n2;

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->I1:Landroidx/appcompat/app/b;

    return-void
.end method

.method private x3(Landroid/graphics/drawable/Drawable;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    invoke-static {p1, p2}, Landroidx/core/graphics/drawable/a;->n(Landroid/graphics/drawable/Drawable;I)V

    goto :goto_0

    :cond_0
    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, p2, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public bridge synthetic B2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->B2()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic C2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->C2()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic E2(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->E2(Z)V

    return-void
.end method

.method public bridge synthetic F2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->F2()V

    return-void
.end method

.method public bridge synthetic G2(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->G2(Z)V

    return-void
.end method

.method public H2(Landroid/view/MenuItem;)Z
    .locals 11

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v6

    const/4 v7, 0x1

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->z1:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->g1:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v8, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/digdroid/alman/dig/j0$z;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v3

    int-to-long v3, v3

    iget-wide v9, v2, Lcom/digdroid/alman/dig/j0$z;->a:J

    cmp-long v5, v3, v9

    if-nez v5, :cond_1

    new-instance p1, Landroid/content/ContentValues;

    invoke-direct {p1}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "emulator"

    iget-wide v3, v2, Lcom/digdroid/alman/dig/j0$z;->a:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->t0:Landroid/database/sqlite/SQLiteDatabase;

    const-string v3, "roms"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "_id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, p1, v4, v8}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    iget-wide v3, v2, Lcom/digdroid/alman/dig/j0$z;->a:J

    long-to-int p1, v3

    iput p1, p0, Lcom/digdroid/alman/dig/j0;->i1:I

    iget-object p1, v2, Lcom/digdroid/alman/dig/j0$z;->b:Ljava/lang/String;

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0;->h1:Ljava/lang/String;

    iget p1, v2, Lcom/digdroid/alman/dig/j0$z;->c:I

    iput p1, p0, Lcom/digdroid/alman/dig/j0;->j1:I

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    monitor-exit v0

    return v7

    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v9, Lcom/digdroid/alman/dig/m0;

    iget-wide v2, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    new-instance v4, Lcom/digdroid/alman/dig/j0$j;

    invoke-direct {v4, p0, v6}, Lcom/digdroid/alman/dig/j0$j;-><init>(Lcom/digdroid/alman/dig/j0;Landroid/app/Activity;)V

    iget-object v5, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    move-object v0, v9

    move-object v1, v6

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/m0;-><init>(Landroid/app/Activity;JLcom/digdroid/alman/dig/m0$p;Lcom/digdroid/alman/dig/p1$a;)V

    invoke-virtual {v9, p1}, Lcom/digdroid/alman/dig/m0;->c(Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_3

    return v7

    :cond_3
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const/4 v1, 0x0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    invoke-virtual {p0, v7}, Lcom/digdroid/alman/dig/j0;->z3(I)V

    return v7

    :sswitch_1
    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/j0;->z3(I)V

    return v7

    :sswitch_2
    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/j0;->z3(I)V

    return v7

    :sswitch_3
    new-instance p1, Landroid/content/ContentValues;

    invoke-direct {p1}, Landroid/content/ContentValues;-><init>()V

    const-string v0, "emulator"

    const/4 v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->t0:Landroid/database/sqlite/SQLiteDatabase;

    const-string v2, "roms"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "_id="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v4, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, p1, v3, v8}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    iget-wide v2, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    invoke-virtual {p1, v2, v3}, Lcom/digdroid/alman/dig/o0;->d(J)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/j0;->i1:I

    invoke-interface {p1, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->h1:Ljava/lang/String;

    const/4 v0, 0x7

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/j0;->j1:I

    goto :goto_0

    :cond_4
    iput-object v8, p0, Lcom/digdroid/alman/dig/j0;->h1:Ljava/lang/String;

    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return v7

    :sswitch_4
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    const/16 v0, 0x9

    new-instance v1, Lcom/digdroid/alman/dig/j0$q;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/j0$q;-><init>(Lcom/digdroid/alman/dig/j0;)V

    invoke-virtual {p1, v6, v0, v1}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    return v7

    :sswitch_5
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v0

    const/16 v1, 0xb

    new-instance v2, Lcom/digdroid/alman/dig/j0$o;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/j0$o;-><init>(Lcom/digdroid/alman/dig/j0;)V

    invoke-virtual {v0, v6, v1, v2}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    goto :goto_1

    :sswitch_6
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    const/16 v0, 0xa

    new-instance v1, Lcom/digdroid/alman/dig/j0$n;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/j0$n;-><init>(Lcom/digdroid/alman/dig/j0;)V

    invoke-virtual {p1, v6, v0, v1}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    return v7

    :sswitch_7
    new-instance p1, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v0

    invoke-direct {p1, v6, v0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v0, 0x7f11008b

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const/high16 v0, 0x1040000

    invoke-virtual {p1, v0, v8}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x104000a

    new-instance v1, Lcom/digdroid/alman/dig/j0$p;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/j0$p;-><init>(Lcom/digdroid/alman/dig/j0;)V

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return v7

    :sswitch_8
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/j0;->e3()V

    return v7

    :goto_1
    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->H2(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_5
    :goto_2
    return v7

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f090102 -> :sswitch_8
        0x7f090143 -> :sswitch_7
        0x7f090178 -> :sswitch_6
        0x7f090179 -> :sswitch_5
        0x7f09032f -> :sswitch_4
        0x7f0903d3 -> :sswitch_3
        0x7f09042c -> :sswitch_2
        0x7f09042d -> :sswitch_1
        0x7f09042e -> :sswitch_0
    .end sparse-switch
.end method

.method public bridge synthetic I2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->I2(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic J2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->J2(Ljava/lang/String;)V

    return-void
.end method

.method public M2()Z
    .locals 5

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    check-cast v1, Lcom/digdroid/alman/dig/x3;

    iget-wide v2, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    iget-object v4, p0, Lcom/digdroid/alman/dig/j0;->f1:Lcom/digdroid/alman/dig/h0;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/digdroid/alman/dig/o0;->i(Lcom/digdroid/alman/dig/x3;JLcom/digdroid/alman/dig/h0;)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method declared-synchronized N2()V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/digdroid/alman/dig/j0$c;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/j0$c;-><init>(Lcom/digdroid/alman/dig/j0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    new-instance v1, Lcom/digdroid/alman/dig/j0$b0;

    invoke-direct {v1, p0, v0}, Lcom/digdroid/alman/dig/j0$b0;-><init>(Lcom/digdroid/alman/dig/j0;Lcom/digdroid/alman/dig/j0$a0;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public bridge synthetic O2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->O2()V

    return-void
.end method

.method public P2()V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    iget-object v3, p0, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/digdroid/alman/dig/g3;->m(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    iget-object v4, p0, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/digdroid/alman/dig/g3;->l(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v1, v2, v3}, Lcom/digdroid/alman/dig/p1$a;->G(Lcom/digdroid/alman/dig/s3;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic Q2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->Q2()V

    return-void
.end method

.method public R2()V
    .locals 2

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->R2()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/j0;->u3()V

    :cond_0
    return-void
.end method

.method public bridge synthetic S2(Lcom/digdroid/alman/dig/h0;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->S2(Lcom/digdroid/alman/dig/h0;)V

    return-void
.end method

.method public bridge synthetic T0(Landroid/content/Context;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->T0(Landroid/content/Context;)V

    return-void
.end method

.method public T2()V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->m0()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/j0;->p3()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/j0;->n3()V

    :cond_0
    return-void
.end method

.method public bridge synthetic U2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->U2()V

    return-void
.end method

.method public bridge synthetic V2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->V2(Ljava/lang/String;)V

    return-void
.end method

.method public W0(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->W0(Landroid/os/Bundle;)V

    const/4 v0, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/j0;->v0:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/j0;->w0:Z

    goto :goto_0

    :cond_0
    const-string v1, "editing"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    const-string v1, "show_cover"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/j0;->v0:Z

    const-string v1, "show_big_cover"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/j0;->w0:Z

    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/b3;->t()Z

    move-result p1

    xor-int/2addr p1, v0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->d2(Z)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "gameid"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    const/4 v0, -0x1

    iput v0, p0, Lcom/digdroid/alman/dig/j0;->r0:I

    const-string v0, ""

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    new-instance v0, Lcom/digdroid/alman/dig/h0;

    invoke-direct {v0}, Lcom/digdroid/alman/dig/h0;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->f1:Lcom/digdroid/alman/dig/h0;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/h0;->b(Landroid/os/Bundle;)V

    return-void
.end method

.method public bridge synthetic W2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->W2(Ljava/lang/String;)V

    return-void
.end method

.method public Y2(Z)V
    .locals 2

    if-eqz p1, :cond_0

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->j0:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/j0;->B2()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/j0;->t3()V

    :cond_0
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->j0:Z

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->Y2(Z)V

    if-nez p1, :cond_1

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->G1:Lcom/digdroid/alman/dig/n2;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p0}, Lcom/digdroid/alman/dig/n2;->u(Lcom/digdroid/alman/dig/p1;)V

    :cond_1
    if-eqz p1, :cond_2

    if-nez v0, :cond_2

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0;->G1:Lcom/digdroid/alman/dig/n2;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->H1:Lcom/digdroid/alman/dig/n2$f;

    invoke-virtual {p1, p0, v0}, Lcom/digdroid/alman/dig/n2;->v(Lcom/digdroid/alman/dig/p1;Lcom/digdroid/alman/dig/n2$f;)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/j0;->q3()Z

    :cond_2
    return-void
.end method

.method public bridge synthetic Z0(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/digdroid/alman/dig/p1;->Z0(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    return-void
.end method

.method public a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const p3, 0x7f0c001e

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a3()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->a3()V

    return-void
.end method

.method public bridge synthetic b3()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->b3()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic c3()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->c3()V

    return-void
.end method

.method e3()V
    .locals 6

    sget-object v0, Lcom/digdroid/alman/dig/j0;->p0:[Ljava/lang/String;

    array-length v0, v0

    new-array v0, v0, [Z

    sget-object v1, Lcom/digdroid/alman/dig/j0;->n0:[I

    array-length v1, v1

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    :goto_0
    sget-object v3, Lcom/digdroid/alman/dig/j0;->p0:[Ljava/lang/String;

    array-length v3, v3

    if-ge v2, v3, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v3

    sget-object v4, Lcom/digdroid/alman/dig/j0;->n0:[I

    aget v4, v4, v2

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    sget-object v4, Lcom/digdroid/alman/dig/j0;->p0:[Ljava/lang/String;

    aget-object v4, v4, v2

    sget-object v5, Lcom/digdroid/alman/dig/j0;->o0:[Z

    aget-boolean v5, v5, v2

    invoke-virtual {v3, v4, v5}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v3

    aput-boolean v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v2, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v3

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    new-instance v3, Lcom/digdroid/alman/dig/j0$i;

    invoke-direct {v3, p0, v0}, Lcom/digdroid/alman/dig/j0$i;-><init>(Lcom/digdroid/alman/dig/j0;[Z)V

    invoke-virtual {v2, v1, v0, v3}, Landroidx/appcompat/app/b$a;->k([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    const v2, 0x7f1101d8

    new-instance v3, Lcom/digdroid/alman/dig/j0$h;

    invoke-direct {v3, p0, v0}, Lcom/digdroid/alman/dig/j0$h;-><init>(Lcom/digdroid/alman/dig/j0;[Z)V

    invoke-virtual {v1, v2, v3}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f11005a

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->I1:Landroidx/appcompat/app/b;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public f3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->G0:Ljava/lang/String;

    return-object v0
.end method

.method public g3()J
    .locals 2

    iget-wide v0, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    return-wide v0
.end method

.method h3()Z
    .locals 13

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->t0:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT p.path,r.filename,r.title,r.released,r.developer,r.publisher,r.info,r.favorite,r.system,r.mdbid,r.cover_status,r.crc,r.gdbid,r.gfcover,r.has_images,r.rating,r.c_rating,r.c_rating_count,r.foldername,r.sortname,r.comments,r.youtube FROM roms as r,rompaths as p WHERE r._id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " AND p._id=r.pathid"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    const-string v3, ""

    const/4 v4, 0x0

    if-nez v1, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->t0:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SELECT pathid,filename,title,released,developer,publisher,info,favorite,system,mdbid,cover_status,crc,gdbid,gfcover,has_images,rating,c_rating,c_rating_count,foldername,sortname,comments,youtube FROM roms WHERE _id="

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return v4

    :cond_0
    iput-object v3, p0, Lcom/digdroid/alman/dig/j0;->y0:Ljava/lang/String;

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->y0:Ljava/lang/String;

    :goto_0
    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/digdroid/alman/dig/j0;->z0:Ljava/lang/String;

    const/16 v5, 0x12

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/digdroid/alman/dig/j0;->A0:Ljava/lang/String;

    const/4 v5, 0x2

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/digdroid/alman/dig/y3;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lcom/digdroid/alman/dig/j0;->D0:Ljava/lang/String;

    const/4 v6, 0x6

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Lcom/digdroid/alman/dig/p1;->d3(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    const/4 v6, 0x5

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Lcom/digdroid/alman/dig/p1;->d3(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/digdroid/alman/dig/y3;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lcom/digdroid/alman/dig/j0;->F0:Ljava/lang/String;

    const/4 v6, 0x4

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Lcom/digdroid/alman/dig/p1;->d3(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/digdroid/alman/dig/y3;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, p0, Lcom/digdroid/alman/dig/j0;->G0:Ljava/lang/String;

    const/4 v6, 0x3

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    iput-wide v7, p0, Lcom/digdroid/alman/dig/j0;->K0:J

    const/4 v7, 0x7

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    if-lez v7, :cond_2

    const/4 v7, 0x1

    goto :goto_1

    :cond_2
    const/4 v7, 0x0

    :goto_1
    iput-boolean v7, p0, Lcom/digdroid/alman/dig/j0;->x0:Z

    const/16 v7, 0x8

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    const/16 v7, 0x9

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    iput-wide v7, p0, Lcom/digdroid/alman/dig/j0;->L0:J

    const/16 v7, 0xa

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    iput v7, p0, Lcom/digdroid/alman/dig/j0;->S0:I

    const/16 v7, 0xd

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/digdroid/alman/dig/j0;->H0:Ljava/lang/String;

    const/16 v7, 0xb

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    iput-wide v7, p0, Lcom/digdroid/alman/dig/j0;->O0:J

    const/16 v7, 0xc

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    iput-wide v7, p0, Lcom/digdroid/alman/dig/j0;->N0:J

    const/16 v7, 0x11

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    iput v7, p0, Lcom/digdroid/alman/dig/j0;->Q0:I

    if-lez v7, :cond_3

    const/16 v7, 0x10

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getFloat(I)F

    move-result v7

    iput v7, p0, Lcom/digdroid/alman/dig/j0;->P0:F

    goto :goto_3

    :cond_3
    const/16 v7, 0xf

    invoke-interface {v0, v7}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_4

    const/high16 v7, -0x40800000    # -1.0f

    goto :goto_2

    :cond_4
    invoke-interface {v0, v7}, Landroid/database/Cursor;->getFloat(I)F

    move-result v7

    :goto_2
    iput v7, p0, Lcom/digdroid/alman/dig/j0;->P0:F

    iput v1, p0, Lcom/digdroid/alman/dig/j0;->Q0:I

    :goto_3
    const/16 v7, 0x13

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/digdroid/alman/dig/j0;->I0:Ljava/lang/String;

    const/16 v7, 0x14

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getInt(I)I

    move-result v7

    iput v7, p0, Lcom/digdroid/alman/dig/j0;->R0:I

    const/16 v7, 0x15

    invoke-interface {v0, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/digdroid/alman/dig/j0;->J0:Ljava/lang/String;

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/digdroid/alman/dig/j0;->r0:I

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/p1;->A2(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-wide v7, p0, Lcom/digdroid/alman/dig/j0;->L0:J

    const-wide/16 v9, 0x0

    cmp-long v0, v7, v9

    if-ltz v0, :cond_b

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->e0:Lcom/digdroid/alman/dig/z1;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z1;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "SELECT info,info_comp,gdbid,gfcover FROM games WHERE _id="

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v11, p0, Lcom/digdroid/alman/dig/j0;->L0:J

    invoke-virtual {v7, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v7

    if-eqz v7, :cond_5

    array-length v8, v7

    if-lez v8, :cond_5

    new-instance v8, Lcom/digdroid/alman/dig/c3;

    invoke-direct {v8}, Lcom/digdroid/alman/dig/c3;-><init>()V

    :try_start_0
    invoke-virtual {v8, v7}, Lcom/digdroid/alman/dig/c3;->a([B)Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    iput-object v3, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    goto :goto_4

    :cond_5
    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0, v7}, Lcom/digdroid/alman/dig/p1;->d3(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    :goto_4
    iget-object v7, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    const/16 v8, 0x3e8

    if-le v7, v8, :cond_6

    iget-object v7, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    invoke-virtual {v7, v4, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    :cond_6
    iget-object v7, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-lt v7, v8, :cond_7

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v8, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "..."

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    :cond_7
    iget-object v7, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    const-string v8, "\\r"

    invoke-virtual {v7, v8, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    const-string v8, "\\n\\n"

    const-string v11, "\n"

    invoke-virtual {v7, v8, v11}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    const-string v8, "\\n"

    const-string v11, "\n\n"

    invoke-virtual {v7, v8, v11}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    iput-object v7, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    invoke-virtual {p0, v7}, Lcom/digdroid/alman/dig/p1;->A2(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_a

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    cmp-long v11, v7, v9

    if-ltz v11, :cond_8

    iput v4, p0, Lcom/digdroid/alman/dig/j0;->r0:I

    goto :goto_5

    :cond_8
    invoke-interface {v0, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-nez v7, :cond_9

    invoke-interface {v0, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    iput v1, p0, Lcom/digdroid/alman/dig/j0;->r0:I

    goto :goto_5

    :cond_9
    iget-object v6, p0, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    const-string v7, "mame"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    iget-object v6, p0, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    const-string v7, "naomi"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_a

    iput v5, p0, Lcom/digdroid/alman/dig/j0;->r0:I

    :cond_a
    :goto_5
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_b
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/p1;->A2(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, "\\[src=moby\\]"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v6

    iget-object v7, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_c

    iput v5, p0, Lcom/digdroid/alman/dig/j0;->r0:I

    iget-object v5, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    invoke-virtual {v5, v0, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    :cond_c
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    invoke-static {v0}, Lcom/digdroid/alman/dig/y3;->B(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    :cond_d
    iput-object v3, p0, Lcom/digdroid/alman/dig/j0;->B0:Ljava/lang/String;

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->t0:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SELECT g.name FROM gamegenres as gg, genres as g WHERE gg.game="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v6, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v6, " AND g._id=gg.genre"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v5

    const-string v6, ", "

    if-eqz v5, :cond_10

    :cond_e
    iget-object v5, p0, Lcom/digdroid/alman/dig/j0;->B0:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_f

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/digdroid/alman/dig/j0;->B0:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/digdroid/alman/dig/j0;->B0:Ljava/lang/String;

    :cond_f
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lcom/digdroid/alman/dig/j0;->B0:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/digdroid/alman/dig/j0;->B0:Ljava/lang/String;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-nez v5, :cond_e

    :cond_10
    iput-object v3, p0, Lcom/digdroid/alman/dig/j0;->C0:Ljava/lang/String;

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->t0:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SELECT c.name FROM gamecollection as gc,collections as c WHERE gc.game="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v7, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, " AND c._id=gc.collection"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_13

    :cond_11
    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->C0:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_12

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/digdroid/alman/dig/j0;->C0:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/digdroid/alman/dig/j0;->C0:Ljava/lang/String;

    :cond_12
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/digdroid/alman/dig/j0;->C0:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/digdroid/alman/dig/j0;->C0:Ljava/lang/String;

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2

    if-nez v2, :cond_11

    :cond_13
    return v1
.end method

.method i3(Z)Ljava/io/File;
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v1, "show_cover"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v3, "show_screenshot"

    invoke-virtual {v1, v3, v2}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz p1, :cond_0

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/j0;->V0:Z

    if-eqz v2, :cond_0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/digdroid/alman/dig/j0;->Z0:J

    iput-wide v0, p0, Lcom/digdroid/alman/dig/j0;->d1:J

    iget-wide v0, p0, Lcom/digdroid/alman/dig/j0;->a1:J

    iput-wide v0, p0, Lcom/digdroid/alman/dig/j0;->e1:J

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0;->T0:Ljava/io/File;

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/j0;->W0:Z

    if-eqz p1, :cond_1

    if-eqz v1, :cond_1

    iget-wide v0, p0, Lcom/digdroid/alman/dig/j0;->b1:J

    iput-wide v0, p0, Lcom/digdroid/alman/dig/j0;->d1:J

    iget-wide v0, p0, Lcom/digdroid/alman/dig/j0;->c1:J

    iput-wide v0, p0, Lcom/digdroid/alman/dig/j0;->e1:J

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0;->U0:Ljava/io/File;

    return-object p1

    :cond_1
    iget-boolean p1, p0, Lcom/digdroid/alman/dig/j0;->V0:Z

    if-eqz p1, :cond_2

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lcom/digdroid/alman/dig/j0;->Z0:J

    iput-wide v0, p0, Lcom/digdroid/alman/dig/j0;->d1:J

    iget-wide v0, p0, Lcom/digdroid/alman/dig/j0;->a1:J

    iput-wide v0, p0, Lcom/digdroid/alman/dig/j0;->e1:J

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0;->T0:Ljava/io/File;

    return-object p1

    :cond_2
    iget-boolean v0, p0, Lcom/digdroid/alman/dig/j0;->W0:Z

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    iget-wide v0, p0, Lcom/digdroid/alman/dig/j0;->b1:J

    iput-wide v0, p0, Lcom/digdroid/alman/dig/j0;->d1:J

    iget-wide v0, p0, Lcom/digdroid/alman/dig/j0;->c1:J

    iput-wide v0, p0, Lcom/digdroid/alman/dig/j0;->e1:J

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0;->U0:Ljava/io/File;

    return-object p1

    :cond_3
    if-eqz p1, :cond_4

    iget-wide v0, p0, Lcom/digdroid/alman/dig/j0;->Z0:J

    iput-wide v0, p0, Lcom/digdroid/alman/dig/j0;->d1:J

    iget-wide v0, p0, Lcom/digdroid/alman/dig/j0;->a1:J

    iput-wide v0, p0, Lcom/digdroid/alman/dig/j0;->e1:J

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0;->T0:Ljava/io/File;

    return-object p1

    :cond_4
    if-eqz v0, :cond_5

    iget-wide v0, p0, Lcom/digdroid/alman/dig/j0;->b1:J

    iput-wide v0, p0, Lcom/digdroid/alman/dig/j0;->d1:J

    iget-wide v0, p0, Lcom/digdroid/alman/dig/j0;->c1:J

    iput-wide v0, p0, Lcom/digdroid/alman/dig/j0;->e1:J

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0;->U0:Ljava/io/File;

    return-object p1

    :cond_5
    const/4 p1, 0x0

    return-object p1
.end method

.method public j3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->F0:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic k1(Landroid/view/MenuItem;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->k1(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public k3()J
    .locals 2

    iget-wide v0, p0, Lcom/digdroid/alman/dig/j0;->K0:J

    return-wide v0
.end method

.method public l3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    return-object v0
.end method

.method public m1()V
    .locals 3

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->m1()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->C1:Landroid/os/Handler;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->C1:Landroid/os/Handler;

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->G1:Lcom/digdroid/alman/dig/n2;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p0}, Lcom/digdroid/alman/dig/n2;->u(Lcom/digdroid/alman/dig/p1;)V

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->B1:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->A1:Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/widget/ScrollView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->B1:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->w1:Landroid/widget/ImageView;

    if-eqz v0, :cond_3

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_3
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->x1:Landroid/widget/ImageView;

    if-eqz v0, :cond_4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->y1:Landroid/widget/ImageView;

    if-eqz v0, :cond_5

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    return-void
.end method

.method public m3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->D0:Ljava/lang/String;

    return-object v0
.end method

.method n3()V
    .locals 4

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/j0;->V2(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0901a2

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->w1:Landroid/widget/ImageView;

    invoke-static {v1}, Lcom/digdroid/alman/dig/p3;->q(Landroid/view/View;)V

    const v1, 0x7f090359

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ScrollView;

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->A1:Landroid/widget/ScrollView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    invoke-static {v1}, Lcom/digdroid/alman/dig/y3;->j(Landroid/app/Activity;)Landroid/graphics/Point;

    move-result-object v1

    iget v2, v1, Landroid/graphics/Point;->y:I

    iget v1, v1, Landroid/graphics/Point;->x:I

    if-le v2, v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/j0$k;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/j0$k;-><init>(Lcom/digdroid/alman/dig/j0;)V

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->B1:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->A1:Landroid/widget/ScrollView;

    invoke-virtual {v1}, Landroid/widget/ScrollView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->B1:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->A1:Landroid/widget/ScrollView;

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/p1;->K2(Landroid/view/View;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->orientation:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/j0;->w2()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    const-string v2, "none"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "icons_bottom"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->w1:Landroid/widget/ImageView;

    const/16 v2, 0x14

    invoke-virtual {v1, v3, v2, v3, v3}, Landroid/widget/ImageView;->setPadding(IIII)V

    :cond_2
    :goto_0
    const v1, 0x7f09030b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->y1:Landroid/widget/ImageView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/p3;->q(Landroid/view/View;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->t0:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v0, Lcom/digdroid/alman/dig/j0$r;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/j0$r;-><init>(Lcom/digdroid/alman/dig/j0;)V

    new-instance v1, Lcom/digdroid/alman/dig/j0$b0;

    invoke-direct {v1, p0, v0}, Lcom/digdroid/alman/dig/j0$b0;-><init>(Lcom/digdroid/alman/dig/j0;Lcom/digdroid/alman/dig/j0$a0;)V

    new-array v0, v3, [Ljava/lang/String;

    invoke-virtual {v1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method o3(Z)V
    .locals 5

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v3, "do_repair"

    invoke-virtual {p1, v3, v2}, Lcom/digdroid/alman/dig/b3;->B(Ljava/lang/String;Z)V

    new-instance p1, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v2

    invoke-direct {p1, v0, v2}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v2, 0x7f1101d1

    invoke-virtual {p1, v2}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v1, 0x7f1101d8

    new-instance v2, Lcom/digdroid/alman/dig/j0$s;

    invoke-direct {v2, p0, v0}, Lcom/digdroid/alman/dig/j0$s;-><init>(Lcom/digdroid/alman/dig/j0;Landroid/app/Activity;)V

    invoke-virtual {p1, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void

    :cond_1
    iget-wide v3, p0, Lcom/digdroid/alman/dig/j0;->L0:J

    iput-wide v3, p0, Lcom/digdroid/alman/dig/j0;->M0:J

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    const v0, 0x7f090195

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->k1:Landroid/widget/TextView;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/digdroid/alman/dig/j0;->y0:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/digdroid/alman/dig/j0;->z0:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->k1:Landroid/widget/TextView;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v3, v3, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const v0, 0x7f0903b7

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->u1:Landroidx/constraintlayout/widget/ConstraintLayout;

    const v0, 0x7f0901ad

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RatingBar;

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->v1:Landroid/widget/RatingBar;

    invoke-virtual {v0}, Landroid/widget/RatingBar;->getProgressDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/LayerDrawable;

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    const/16 v4, -0x2100

    invoke-direct {p0, v3, v4}, Lcom/digdroid/alman/dig/j0;->x3(Landroid/graphics/drawable/Drawable;I)V

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    const v4, -0x7f777778

    invoke-direct {p0, v3, v4}, Lcom/digdroid/alman/dig/j0;->x3(Landroid/graphics/drawable/Drawable;I)V

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0, v4}, Lcom/digdroid/alman/dig/j0;->x3(Landroid/graphics/drawable/Drawable;I)V

    new-instance v0, Lcom/digdroid/alman/dig/j0$t;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/j0$t;-><init>(Lcom/digdroid/alman/dig/j0;)V

    const v3, 0x7f090328

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lcom/digdroid/alman/dig/j0;->o1:Landroid/widget/TextView;

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0901a6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->n1:Landroid/widget/TextView;

    new-instance v3, Lcom/digdroid/alman/dig/j0$u;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/j0$u;-><init>(Lcom/digdroid/alman/dig/j0;)V

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0901b0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->p1:Landroid/widget/EditText;

    const v0, 0x7f0901a9

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->q1:Landroid/widget/EditText;

    const v0, 0x7f0900fd

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->l1:Landroid/widget/TextView;

    const v0, 0x7f0901af

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->m1:Landroid/widget/TextView;

    const v0, 0x7f0901ac

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->r1:Landroid/widget/EditText;

    const v0, 0x7f0901a5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->s1:Landroid/widget/EditText;

    const v0, 0x7f0901ae

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->t1:Landroid/widget/EditText;

    const v0, 0x7f09009f

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0;->x1:Landroid/widget/ImageView;

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/j0;->v3(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0;->y1:Landroid/widget/ImageView;

    new-instance v0, Lcom/digdroid/alman/dig/j0$v;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/j0$v;-><init>(Lcom/digdroid/alman/dig/j0;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0;->w1:Landroid/widget/ImageView;

    new-instance v0, Lcom/digdroid/alman/dig/j0$w;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/j0$w;-><init>(Lcom/digdroid/alman/dig/j0;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0;->w1:Landroid/widget/ImageView;

    new-instance v0, Lcom/digdroid/alman/dig/j0$x;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/j0$x;-><init>(Lcom/digdroid/alman/dig/j0;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0;->x1:Landroid/widget/ImageView;

    new-instance v0, Lcom/digdroid/alman/dig/j0$y;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/j0$y;-><init>(Lcom/digdroid/alman/dig/j0;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/j0;->t3()V

    iput-boolean v2, p0, Lcom/digdroid/alman/dig/p1;->i0:Z

    :cond_3
    :goto_0
    return-void
.end method

.method public p2(Landroid/view/Menu;)V
    .locals 9

    const v0, 0x7f090178

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v1, :cond_0

    const v1, 0x7f1100c9

    goto :goto_0

    :cond_0
    const v1, 0x7f1100cb

    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(I)Landroid/view/MenuItem;

    const v0, 0x7f090192

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/j0;->x0:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v0, 0x7f090056

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/b3;->u()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f090330

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->C0:Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    const-string v4, ""

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v1, 0x1

    :goto_2
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f09026e

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V

    const v1, 0x7f090141

    invoke-interface {v0, v1}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    const-string v4, "android"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v2

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f090370

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->h1:Ljava/lang/String;

    const v4, 0x7f09042f

    if-eqz v1, :cond_6

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->h1:Ljava/lang/String;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->z1:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v5, p0, Lcom/digdroid/alman/dig/j0;->g1:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/digdroid/alman/dig/j0$z;

    iget-wide v7, v6, Lcom/digdroid/alman/dig/j0$z;->a:J

    long-to-int v8, v7

    iget-object v6, v6, Lcom/digdroid/alman/dig/j0$z;->b:Ljava/lang/String;

    invoke-interface {v0, v3, v8, v3, v6}, Landroid/view/SubMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v0

    const-string v5, "com.retroarch.ra32"

    invoke-static {v0, v5}, Lcom/digdroid/alman/dig/y3;->r(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v5

    const-string v6, "com.retroarch.aarch64"

    invoke-static {v5, v6}, Lcom/digdroid/alman/dig/y3;->r(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    invoke-interface {p1, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v4

    iget-object v6, p0, Lcom/digdroid/alman/dig/j0;->h1:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    const-string v7, "retroarch"

    invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_5

    if-nez v0, :cond_4

    if-eqz v5, :cond_5

    :cond_4
    const/4 v6, 0x1

    goto :goto_4

    :cond_5
    const/4 v6, 0x0

    :goto_4
    invoke-interface {v4, v6}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v6

    iget v7, p0, Lcom/digdroid/alman/dig/j0;->j1:I

    invoke-static {v6, v7}, Lcom/digdroid/alman/dig/x2;->v(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {v4}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v4

    invoke-interface {v4}, Landroid/view/SubMenu;->clearHeader()V

    const v6, 0x7f09042c

    invoke-interface {v4, v6}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v6

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v3}, Lcom/digdroid/alman/dig/x2;->v(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v6, v3}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v3, 0x7f09042d

    invoke-interface {v4, v3}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    invoke-interface {v3, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v0

    const/4 v6, 0x2

    invoke-static {v0, v6}, Lcom/digdroid/alman/dig/x2;->v(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v0, 0x7f09042e

    invoke-interface {v4, v0}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v5}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->j0()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v2}, Lcom/digdroid/alman/dig/x2;->v(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    monitor-exit v1

    goto :goto_5

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_6
    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-interface {p1, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :goto_5
    const v0, 0x7f090143

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/j0;->W0:Z

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return-void
.end method

.method p3()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->z1:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->g1:Ljava/util/ArrayList;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lcom/digdroid/alman/dig/j0$m;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/j0$m;-><init>(Lcom/digdroid/alman/dig/j0;)V

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

.method public bridge synthetic q2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->q2()V

    return-void
.end method

.method q3()Z
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->J0:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->j0:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v2, "game_play_videos"

    invoke-virtual {v0, v2, v1}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->w1:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->G1:Lcom/digdroid/alman/dig/n2;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->v0()Lcom/digdroid/alman/dig/n2;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->G1:Lcom/digdroid/alman/dig/n2;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/n2;->n()Lcom/digdroid/alman/dig/n2$f;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->H1:Lcom/digdroid/alman/dig/n2$f;

    new-instance v2, Lcom/digdroid/alman/dig/j0$b;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/j0$b;-><init>(Lcom/digdroid/alman/dig/j0;)V

    iput-object v2, v0, Lcom/digdroid/alman/dig/n2$f;->a:Lcom/digdroid/alman/dig/n2$g;

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->H1:Lcom/digdroid/alman/dig/n2$f;

    const v2, 0x7f090455

    iput v2, v0, Lcom/digdroid/alman/dig/n2$f;->b:I

    const v2, 0x7f090321

    iput v2, v0, Lcom/digdroid/alman/dig/n2$f;->c:I

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v3, "game_play_videos_mobile"

    invoke-virtual {v2, v3, v1}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lcom/digdroid/alman/dig/n2$f;->d:Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->H1:Lcom/digdroid/alman/dig/n2$f;

    const/16 v1, 0x1f4

    iput v1, v0, Lcom/digdroid/alman/dig/n2$f;->e:I

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->G1:Lcom/digdroid/alman/dig/n2;

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->H1:Lcom/digdroid/alman/dig/n2$f;

    invoke-virtual {v0, p0, v1}, Lcom/digdroid/alman/dig/n2;->v(Lcom/digdroid/alman/dig/p1;Lcom/digdroid/alman/dig/n2$f;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->G1:Lcom/digdroid/alman/dig/n2;

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->J0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n2;->t(Ljava/lang/String;)Z

    move-result v0

    return v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->G1:Lcom/digdroid/alman/dig/n2;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/n2;->p()V

    :cond_3
    return v1
.end method

.method public r1()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->r1()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/j0;->n3()V

    return-void
.end method

.method r2()I
    .locals 1

    const v0, 0x7f0d0006

    return v0
.end method

.method r3()V
    .locals 3

    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v1, 0x7f110090

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v1, Lcom/digdroid/alman/dig/j0$g;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/j0$g;-><init>(Lcom/digdroid/alman/dig/j0;)V

    const v2, 0x1040009

    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v1, Lcom/digdroid/alman/dig/j0$f;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/j0$f;-><init>(Lcom/digdroid/alman/dig/j0;)V

    const v2, 0x1040013

    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public s1(Landroid/os/Bundle;)V
    .locals 2

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    const-string v1, "editing"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/j0;->v0:Z

    const-string v1, "show_cover"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/j0;->w0:Z

    const-string v1, "show_big_cover"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->s1(Landroid/os/Bundle;)V

    return-void
.end method

.method public bridge synthetic s2()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->s2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method s3()V
    .locals 5

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->p1:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->D0:Ljava/lang/String;

    const-string v2, "title"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->D0:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/o0;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "sortname"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->p1:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->D0:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->q1:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    const-string v2, "info"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->q1:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, -0x1

    iput v1, p0, Lcom/digdroid/alman/dig/j0;->r0:I

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->r1:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->F0:Ljava/lang/String;

    const-string v2, "publisher"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->s1:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/j0;->G0:Ljava/lang/String;

    const-string v2, "developer"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v1, 0x0

    iput-wide v1, p0, Lcom/digdroid/alman/dig/j0;->K0:J

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->t1:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x4

    if-ne v2, v3, :cond_0

    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "yyyy"

    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/digdroid/alman/dig/j0;->K0:J

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0xa

    if-ne v2, v3, :cond_1

    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "MM/dd/yyyy"

    invoke-direct {v2, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    :goto_1
    iget-wide v1, p0, Lcom/digdroid/alman/dig/j0;->K0:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "released"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->t0:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "_id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const-string v4, "roms"

    invoke-virtual {v1, v4, v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    iget-wide v1, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/o0;->t(J)V

    return-void
.end method

.method public t1()V
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->t1()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->G1:Lcom/digdroid/alman/dig/n2;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/j0;->p3()V

    return-void
.end method

.method public t2()Ljava/lang/String;
    .locals 1

    const-string v0, "gameinfo"

    return-object v0
.end method

.method t3()V
    .locals 15

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_39

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2e

    :cond_0
    iget-boolean v1, p0, Lcom/digdroid/alman/dig/j0;->v0:Z

    const v2, 0x7f090108

    const v3, 0x7f090359

    const/4 v4, 0x4

    const/4 v5, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->x1:Landroid/widget/ImageView;

    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void

    :cond_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->x1:Landroid/widget/ImageView;

    const/16 v6, 0x8

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->k1:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v3, "show_file"

    const/4 v7, 0x1

    invoke-virtual {v2, v3, v7}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    goto :goto_0

    :cond_2
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v2, "show_rating"

    invoke-virtual {v1, v2, v7}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    iget v1, p0, Lcom/digdroid/alman/dig/j0;->P0:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_3

    const/4 v1, 0x1

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v3, "show_genres"

    invoke-virtual {v2, v3, v7}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->B0:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_4

    const/4 v2, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    :goto_2
    const-string v3, ""

    if-nez v1, :cond_5

    if-nez v2, :cond_5

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->u1:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto/16 :goto_7

    :cond_5
    iget-object v8, p0, Lcom/digdroid/alman/dig/j0;->u1:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v8, v5}, Landroid/view/ViewGroup;->setVisibility(I)V

    iget-object v8, p0, Lcom/digdroid/alman/dig/j0;->v1:Landroid/widget/RatingBar;

    if-nez v1, :cond_6

    const/4 v9, 0x4

    goto :goto_3

    :cond_6
    const/4 v9, 0x0

    :goto_3
    invoke-virtual {v8, v9}, Landroid/widget/RatingBar;->setVisibility(I)V

    iget-object v8, p0, Lcom/digdroid/alman/dig/j0;->o1:Landroid/widget/TextView;

    if-nez v1, :cond_7

    goto :goto_4

    :cond_7
    const/4 v4, 0x0

    :goto_4
    invoke-virtual {v8, v4}, Landroid/widget/TextView;->setVisibility(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v4

    const v8, 0x7f0903b8

    invoke-virtual {v4, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-nez v1, :cond_8

    const/16 v8, 0x8

    goto :goto_5

    :cond_8
    const/4 v8, 0x0

    :goto_5
    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->v1:Landroid/widget/RatingBar;

    iget v4, p0, Lcom/digdroid/alman/dig/j0;->P0:F

    invoke-virtual {v1, v4}, Landroid/widget/RatingBar;->setRating(F)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->o1:Landroid/widget/TextView;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v8, p0, Lcom/digdroid/alman/dig/j0;->P0:F

    float-to-double v8, v8

    const-wide/high16 v10, 0x4024000000000000L    # 10.0

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v8, v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    move-result-wide v8

    long-to-double v8, v8

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    div-double/2addr v8, v10

    invoke-virtual {v4, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v8, "/"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v8, p0, Lcom/digdroid/alman/dig/j0;->Q0:I

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->o1:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v4, v4, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_9
    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->n1:Landroid/widget/TextView;

    if-nez v2, :cond_a

    const/16 v2, 0x8

    goto :goto_6

    :cond_a
    const/4 v2, 0x0

    :goto_6
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->n1:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->B0:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->n1:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v2, v2, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->n1:Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setBackgroundColor(I)V

    :goto_7
    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->p1:Landroid/widget/EditText;

    invoke-virtual {v1, v5}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->p1:Landroid/widget/EditText;

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setEnabled(Z)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->p1:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->D0:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->p1:Landroid/widget/EditText;

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    const/4 v4, -0x1

    if-eqz v2, :cond_b

    const/4 v2, -0x1

    goto :goto_8

    :cond_b
    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v2, v2, Lcom/digdroid/alman/dig/s3;->f:I

    :goto_8
    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setTextColor(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->p1:Landroid/widget/EditText;

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v2, :cond_c

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->m()I

    move-result v2

    goto :goto_9

    :cond_c
    const/4 v2, 0x0

    :goto_9
    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setBackgroundColor(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->q1:Landroid/widget/EditText;

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setEnabled(Z)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v2, "show_info"

    invoke-virtual {v1, v2, v7}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_d

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/p1;->A2(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_d

    const/4 v1, 0x1

    goto :goto_a

    :cond_d
    const/4 v1, 0x0

    :goto_a
    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->q1:Landroid/widget/EditText;

    iget-boolean v8, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-nez v8, :cond_f

    if-eqz v1, :cond_e

    goto :goto_b

    :cond_e
    const/16 v8, 0x8

    goto :goto_c

    :cond_f
    :goto_b
    const/4 v8, 0x0

    :goto_c
    invoke-virtual {v2, v8}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->q1:Landroid/widget/EditText;

    iget-object v8, p0, Lcom/digdroid/alman/dig/j0;->E0:Ljava/lang/String;

    invoke-virtual {v2, v8}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->q1:Landroid/widget/EditText;

    iget-boolean v8, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v8, :cond_10

    const/4 v8, -0x1

    goto :goto_d

    :cond_10
    iget-object v8, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v8, v8, Lcom/digdroid/alman/dig/s3;->e:I

    :goto_d
    invoke-virtual {v2, v8}, Landroid/widget/EditText;->setTextColor(I)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->q1:Landroid/widget/EditText;

    iget-boolean v8, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v8, :cond_11

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->m()I

    move-result v8

    goto :goto_e

    :cond_11
    const/4 v8, 0x0

    :goto_e
    invoke-virtual {v2, v8}, Landroid/widget/EditText;->setBackgroundColor(I)V

    if-nez v1, :cond_12

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v1, :cond_13

    :cond_12
    iget v1, p0, Lcom/digdroid/alman/dig/j0;->r0:I

    if-ltz v1, :cond_13

    const/4 v1, 0x1

    goto :goto_f

    :cond_13
    const/4 v1, 0x0

    :goto_f
    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->m1:Landroid/widget/TextView;

    if-eqz v1, :cond_14

    const/4 v8, 0x0

    goto :goto_10

    :cond_14
    const/16 v8, 0x8

    :goto_10
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setVisibility(I)V

    const/4 v2, 0x2

    if-eqz v1, :cond_18

    iget-object v8, p0, Lcom/digdroid/alman/dig/j0;->m1:Landroid/widget/TextView;

    invoke-virtual {v8}, Landroid/widget/TextView;->getPaintFlags()I

    move-result v9

    or-int/2addr v9, v6

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setPaintFlags(I)V

    iget-object v8, p0, Lcom/digdroid/alman/dig/j0;->m1:Landroid/widget/TextView;

    iget-object v9, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v9, v9, Lcom/digdroid/alman/dig/s3;->f:I

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v8, p0, Lcom/digdroid/alman/dig/j0;->m1:Landroid/widget/TextView;

    invoke-static {v8}, Lcom/digdroid/alman/dig/p3;->q(Landroid/view/View;)V

    iget v8, p0, Lcom/digdroid/alman/dig/j0;->r0:I

    if-eqz v8, :cond_17

    if-eq v8, v7, :cond_16

    if-eq v8, v2, :cond_15

    goto :goto_12

    :cond_15
    iget-object v8, p0, Lcom/digdroid/alman/dig/j0;->m1:Landroid/widget/TextView;

    const-string v9, "MobyGames"

    goto :goto_11

    :cond_16
    iget-object v8, p0, Lcom/digdroid/alman/dig/j0;->m1:Landroid/widget/TextView;

    const-string v9, "GameFaqs"

    goto :goto_11

    :cond_17
    iget-object v8, p0, Lcom/digdroid/alman/dig/j0;->m1:Landroid/widget/TextView;

    const-string v9, "TheGamesDB"

    :goto_11
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_12
    iget-object v8, p0, Lcom/digdroid/alman/dig/j0;->m1:Landroid/widget/TextView;

    new-instance v9, Lcom/digdroid/alman/dig/j0$d;

    invoke-direct {v9, p0}, Lcom/digdroid/alman/dig/j0$d;-><init>(Lcom/digdroid/alman/dig/j0;)V

    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_18
    iget-object v8, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v9, "show_comments"

    invoke-virtual {v8, v9, v7}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v8

    const-wide/16 v9, 0x0

    if-eqz v8, :cond_19

    iget-wide v11, p0, Lcom/digdroid/alman/dig/j0;->L0:J

    cmp-long v8, v11, v9

    if-ltz v8, :cond_19

    const/4 v8, 0x1

    goto :goto_13

    :cond_19
    const/4 v8, 0x0

    :goto_13
    iget-object v11, p0, Lcom/digdroid/alman/dig/j0;->l1:Landroid/widget/TextView;

    if-eqz v8, :cond_1a

    const/4 v12, 0x0

    goto :goto_14

    :cond_1a
    const/16 v12, 0x8

    :goto_14
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setVisibility(I)V

    const-string v11, " "

    if-eqz v8, :cond_1c

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->l1:Landroid/widget/TextView;

    iget-object v13, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v13, v13, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->l1:Landroid/widget/TextView;

    invoke-static {v12}, Lcom/digdroid/alman/dig/p3;->q(Landroid/view/View;)V

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->l1:Landroid/widget/TextView;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v14, p0, Lcom/digdroid/alman/dig/j0;->R0:I

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v14, p0, Lcom/digdroid/alman/dig/j0;->R0:I

    if-ne v14, v7, :cond_1b

    const v14, 0x7f110072

    goto :goto_15

    :cond_1b
    const v14, 0x7f110073

    :goto_15
    invoke-virtual {v0, v14}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->l1:Landroid/widget/TextView;

    new-instance v13, Lcom/digdroid/alman/dig/j0$e;

    invoke-direct {v13, p0}, Lcom/digdroid/alman/dig/j0$e;-><init>(Lcom/digdroid/alman/dig/j0;)V

    invoke-virtual {v12, v13}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1c
    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->r1:Landroid/widget/EditText;

    iget-boolean v13, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    invoke-virtual {v12, v13}, Landroid/widget/EditText;->setEnabled(Z)V

    iget-object v12, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v13, "show_publisher"

    invoke-virtual {v12, v13, v7}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v12

    if-eqz v12, :cond_1d

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->F0:Ljava/lang/String;

    invoke-virtual {p0, v12}, Lcom/digdroid/alman/dig/p1;->A2(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_1d

    const/4 v12, 0x1

    goto :goto_16

    :cond_1d
    const/4 v12, 0x0

    :goto_16
    iget-object v13, p0, Lcom/digdroid/alman/dig/j0;->r1:Landroid/widget/EditText;

    iget-boolean v14, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-nez v14, :cond_1f

    if-eqz v12, :cond_1e

    goto :goto_17

    :cond_1e
    const/16 v12, 0x8

    goto :goto_18

    :cond_1f
    :goto_17
    const/4 v12, 0x0

    :goto_18
    invoke-virtual {v13, v12}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->r1:Landroid/widget/EditText;

    iget-boolean v13, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v13, :cond_20

    const/4 v13, -0x1

    goto :goto_19

    :cond_20
    iget-object v13, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v13, v13, Lcom/digdroid/alman/dig/s3;->g:I

    :goto_19
    invoke-virtual {v12, v13}, Landroid/widget/EditText;->setTextColor(I)V

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->r1:Landroid/widget/EditText;

    iget-boolean v13, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v13, :cond_21

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->m()I

    move-result v13

    goto :goto_1a

    :cond_21
    const/4 v13, 0x0

    :goto_1a
    invoke-virtual {v12, v13}, Landroid/widget/EditText;->setBackgroundColor(I)V

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->s1:Landroid/widget/EditText;

    iget-boolean v13, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    invoke-virtual {v12, v13}, Landroid/widget/EditText;->setEnabled(Z)V

    iget-object v12, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v13, "show_developer"

    invoke-virtual {v12, v13, v7}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v12

    if-eqz v12, :cond_22

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->G0:Ljava/lang/String;

    invoke-virtual {p0, v12}, Lcom/digdroid/alman/dig/p1;->A2(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_22

    const/4 v12, 0x1

    goto :goto_1b

    :cond_22
    const/4 v12, 0x0

    :goto_1b
    iget-object v13, p0, Lcom/digdroid/alman/dig/j0;->s1:Landroid/widget/EditText;

    iget-boolean v14, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-nez v14, :cond_24

    if-eqz v12, :cond_23

    goto :goto_1c

    :cond_23
    const/16 v12, 0x8

    goto :goto_1d

    :cond_24
    :goto_1c
    const/4 v12, 0x0

    :goto_1d
    invoke-virtual {v13, v12}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->s1:Landroid/widget/EditText;

    iget-boolean v13, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v13, :cond_25

    const/4 v13, -0x1

    goto :goto_1e

    :cond_25
    iget-object v13, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v13, v13, Lcom/digdroid/alman/dig/s3;->g:I

    :goto_1e
    invoke-virtual {v12, v13}, Landroid/widget/EditText;->setTextColor(I)V

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->s1:Landroid/widget/EditText;

    iget-boolean v13, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v13, :cond_26

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->m()I

    move-result v13

    goto :goto_1f

    :cond_26
    const/4 v13, 0x0

    :goto_1f
    invoke-virtual {v12, v13}, Landroid/widget/EditText;->setBackgroundColor(I)V

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->t1:Landroid/widget/EditText;

    iget-boolean v13, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    invoke-virtual {v12, v13}, Landroid/widget/EditText;->setEnabled(Z)V

    iget-object v12, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v13, "show_released"

    invoke-virtual {v12, v13, v7}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v12

    if-eqz v12, :cond_27

    iget-wide v12, p0, Lcom/digdroid/alman/dig/j0;->K0:J

    cmp-long v14, v12, v9

    if-lez v14, :cond_27

    const/4 v12, 0x1

    goto :goto_20

    :cond_27
    const/4 v12, 0x0

    :goto_20
    iget-object v13, p0, Lcom/digdroid/alman/dig/j0;->t1:Landroid/widget/EditText;

    iget-boolean v14, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-nez v14, :cond_29

    if-eqz v12, :cond_28

    goto :goto_21

    :cond_28
    const/16 v12, 0x8

    goto :goto_22

    :cond_29
    :goto_21
    const/4 v12, 0x0

    :goto_22
    invoke-virtual {v13, v12}, Landroid/widget/EditText;->setVisibility(I)V

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->t1:Landroid/widget/EditText;

    iget-boolean v13, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v13, :cond_2a

    goto :goto_23

    :cond_2a
    iget-object v4, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v4, v4, Lcom/digdroid/alman/dig/s3;->g:I

    :goto_23
    invoke-virtual {v12, v4}, Landroid/widget/EditText;->setTextColor(I)V

    iget-object v4, p0, Lcom/digdroid/alman/dig/j0;->t1:Landroid/widget/EditText;

    iget-boolean v12, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v12, :cond_2b

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->m()I

    move-result v12

    goto :goto_24

    :cond_2b
    const/4 v12, 0x0

    :goto_24
    invoke-virtual {v4, v12}, Landroid/widget/EditText;->setBackgroundColor(I)V

    iget-boolean v4, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v4, :cond_2c

    iget-object v4, p0, Lcom/digdroid/alman/dig/j0;->r1:Landroid/widget/EditText;

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->F0:Ljava/lang/String;

    goto :goto_25

    :cond_2c
    iget-object v4, p0, Lcom/digdroid/alman/dig/j0;->r1:Landroid/widget/EditText;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const v13, 0x7f110200

    invoke-virtual {p0, v13}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, p0, Lcom/digdroid/alman/dig/j0;->F0:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    :goto_25
    invoke-virtual {v4, v12}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-boolean v4, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v4, :cond_2d

    iget-object v4, p0, Lcom/digdroid/alman/dig/j0;->s1:Landroid/widget/EditText;

    iget-object v12, p0, Lcom/digdroid/alman/dig/j0;->G0:Ljava/lang/String;

    goto :goto_26

    :cond_2d
    iget-object v4, p0, Lcom/digdroid/alman/dig/j0;->s1:Landroid/widget/EditText;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const v13, 0x7f1100c3

    invoke-virtual {p0, v13}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v13, p0, Lcom/digdroid/alman/dig/j0;->G0:Ljava/lang/String;

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    :goto_26
    invoke-virtual {v4, v12}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    iget-wide v12, p0, Lcom/digdroid/alman/dig/j0;->K0:J

    cmp-long v4, v12, v9

    if-lez v4, :cond_31

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    iget-wide v9, p0, Lcom/digdroid/alman/dig/j0;->K0:J

    invoke-virtual {v4, v9, v10}, Ljava/util/Calendar;->setTimeInMillis(J)V

    invoke-virtual {v4, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    if-nez v2, :cond_2e

    const/4 v2, 0x5

    invoke-virtual {v4, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    if-ne v2, v7, :cond_2e

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v7}, Ljava/util/Calendar;->get(I)I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_28

    :cond_2e
    iget-boolean v2, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v2, :cond_2f

    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v4, "MM/dd/yyyy"

    invoke-direct {v2, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/util/Date;

    iget-wide v9, p0, Lcom/digdroid/alman/dig/j0;->K0:J

    invoke-direct {v4, v9, v10}, Ljava/util/Date;-><init>(J)V

    goto :goto_27

    :cond_2f
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v4, "MMMM d, yyyy"

    invoke-direct {v2, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    new-instance v4, Ljava/util/Date;

    iget-wide v9, p0, Lcom/digdroid/alman/dig/j0;->K0:J

    invoke-direct {v4, v9, v10}, Ljava/util/Date;-><init>(J)V

    :goto_27
    invoke-virtual {v2, v4}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    :goto_28
    iget-boolean v4, p0, Lcom/digdroid/alman/dig/j0;->u0:Z

    if-eqz v4, :cond_30

    iget-object v4, p0, Lcom/digdroid/alman/dig/j0;->t1:Landroid/widget/EditText;

    goto :goto_29

    :cond_30
    iget-object v4, p0, Lcom/digdroid/alman/dig/j0;->t1:Landroid/widget/EditText;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const v10, 0x7f11020a

    invoke-virtual {p0, v10}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_29
    invoke-virtual {v4, v2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    :cond_31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v2

    const v4, 0x7f0900f5

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v4, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v9, "show_collections"

    invoke-virtual {v4, v9, v7}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_32

    iget-object v4, p0, Lcom/digdroid/alman/dig/j0;->C0:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_32

    goto :goto_2a

    :cond_32
    const/4 v7, 0x0

    :goto_2a
    if-eqz v7, :cond_33

    goto :goto_2b

    :cond_33
    const/16 v5, 0x8

    :goto_2b
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    if-eqz v7, :cond_34

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v3, v3, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f110071

    invoke-virtual {v0, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->C0:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_34
    if-eqz v1, :cond_35

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->y1:Landroid/widget/ImageView;

    const v2, 0x7f0901af

    :goto_2c
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setNextFocusRightId(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->w1:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setNextFocusRightId(I)V

    goto :goto_2d

    :cond_35
    if-eqz v8, :cond_36

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->y1:Landroid/widget/ImageView;

    const v2, 0x7f0900fd

    goto :goto_2c

    :cond_36
    :goto_2d
    const v0, 0x7f09030b

    if-eqz v1, :cond_37

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->m1:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setNextFocusLeftId(I)V

    :cond_37
    if-eqz v8, :cond_38

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->l1:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setNextFocusLeftId(I)V

    :cond_38
    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->D0:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/j0;->V2(Ljava/lang/String;)V

    :cond_39
    :goto_2e
    return-void
.end method

.method public bridge synthetic u2()J
    .locals 2

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->u2()J

    move-result-wide v0

    return-wide v0
.end method

.method public u3()V
    .locals 10

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_7

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->B()Landroid/view/Menu;

    move-result-object v0

    const v1, 0x7f0901a7

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->D0:Ljava/lang/String;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v0

    const v2, 0x7f0902c5

    invoke-interface {v0, v2}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    iget-object v4, p0, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/digdroid/alman/dig/g3;->r(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {v2, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v2, 0x7f0902c0

    invoke-interface {v0, v2}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/j0;->F0:Ljava/lang/String;

    const-string v4, ""

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_1

    iget-object v6, p0, Lcom/digdroid/alman/dig/j0;->F0:Ljava/lang/String;

    invoke-interface {v2, v6}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {v2, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_1

    :cond_1
    invoke-interface {v2, v5}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :goto_1
    const v2, 0x7f0902b5

    invoke-interface {v0, v2}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v6, p0, Lcom/digdroid/alman/dig/j0;->G0:Ljava/lang/String;

    if-eqz v6, :cond_2

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    if-eqz v6, :cond_4

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/digdroid/alman/dig/j0;->G0:Ljava/lang/String;

    iget-object v6, p0, Lcom/digdroid/alman/dig/j0;->F0:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    :cond_3
    iget-object v3, p0, Lcom/digdroid/alman/dig/j0;->G0:Ljava/lang/String;

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {v2, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_3

    :cond_4
    invoke-interface {v2, v5}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :goto_3
    const v2, 0x7f0902ca

    invoke-interface {v0, v2}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-wide v6, p0, Lcom/digdroid/alman/dig/j0;->K0:J

    const-wide/16 v8, 0x0

    cmp-long v3, v6, v8

    if-lez v3, :cond_5

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    iget-wide v6, p0, Lcom/digdroid/alman/dig/j0;->K0:J

    invoke-virtual {v3, v6, v7}, Ljava/util/Calendar;->setTimeInMillis(J)V

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    move-result v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {v2, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    goto :goto_4

    :cond_5
    invoke-interface {v2, v5}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :goto_4
    const v2, 0x7f0902ba

    invoke-interface {v0, v2}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-wide v2, p0, Lcom/digdroid/alman/dig/j0;->L0:J

    cmp-long v4, v2, v8

    if-ltz v4, :cond_6

    goto :goto_5

    :cond_6
    const/4 v1, 0x0

    :goto_5
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_7
    return-void
.end method

.method public bridge synthetic v2()Lcom/digdroid/alman/dig/s3;
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->v2()Lcom/digdroid/alman/dig/s3;

    move-result-object v0

    return-object v0
.end method

.method declared-synchronized v3(Z)V
    .locals 6

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/l1;->a(Landroid/content/Context;)Lcom/digdroid/alman/dig/o1;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/s3;->q:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget-object v1, v1, Lcom/digdroid/alman/dig/s3;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/o1;->K(Ljava/lang/String;)Lcom/digdroid/alman/dig/n1;

    move-result-object v0

    goto :goto_0

    :cond_0
    const v1, 0x7f0701c3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/o1;->J(Ljava/lang/Integer;)Lcom/digdroid/alman/dig/n1;

    move-result-object v0

    :goto_0
    sget-object v1, Lcom/bumptech/glide/load/o/j;->b:Lcom/bumptech/glide/load/o/j;

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n1;->C0(Lcom/bumptech/glide/load/o/j;)Lcom/digdroid/alman/dig/n1;

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0;->y1:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/j;->p0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/j0;->q3()Z

    move-result v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090455

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/16 v3, 0x8

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    const/16 v5, 0x8

    :goto_1
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->w1:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/j0;->D1:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0;->C1:Landroid/os/Handler;

    if-eqz p1, :cond_3

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/j0;->C1:Landroid/os/Handler;

    :cond_3
    new-instance p1, Lcom/digdroid/alman/dig/j0$l;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/j0$l;-><init>(Lcom/digdroid/alman/dig/j0;)V

    new-array v0, v4, [Ljava/lang/Void;

    invoke-virtual {p1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method w2()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/j0;->v0:Z

    if-eqz v0, :cond_0

    const-string v0, "none"

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->w2()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method declared-synchronized w3(Z)V
    .locals 7

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    iget-object v2, p0, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/g3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/digdroid/alman/dig/j0;->s0:Ljava/lang/String;

    const-string v6, "android"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v5, :cond_1

    :try_start_1
    invoke-virtual {v0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    iget-object v6, p0, Lcom/digdroid/alman/dig/j0;->z0:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/content/pm/PackageManager;->getApplicationIcon(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "icon_"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "drawable"

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v1, v3, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    goto :goto_0

    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "icon_"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "drawable"

    invoke-virtual {v0}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v1, v3, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_2

    const v3, 0x7f0700e6

    :cond_2
    :goto_0
    const-string v1, "sig"

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/j0;->D1:Z

    invoke-virtual {p0, v2}, Lcom/digdroid/alman/dig/j0;->i3(Z)Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v5, p0, Lcom/digdroid/alman/dig/j0;->d1:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, "@"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, p0, Lcom/digdroid/alman/dig/j0;->e1:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    :try_start_3
    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lcom/digdroid/alman/dig/l1;->a(Landroid/content/Context;)Lcom/digdroid/alman/dig/o1;

    move-result-object v5

    if-eqz v2, :cond_4

    invoke-virtual {v5, v2}, Lcom/digdroid/alman/dig/o1;->I(Ljava/io/File;)Lcom/digdroid/alman/dig/n1;

    move-result-object v2

    goto :goto_1

    :cond_4
    if-eqz v4, :cond_5

    invoke-virtual {v5, v4}, Lcom/digdroid/alman/dig/o1;->H(Landroid/graphics/drawable/Drawable;)Lcom/digdroid/alman/dig/n1;

    move-result-object v2

    goto :goto_1

    :cond_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v2}, Lcom/digdroid/alman/dig/o1;->J(Ljava/lang/Integer;)Lcom/digdroid/alman/dig/n1;

    move-result-object v2

    :goto_1
    sget-object v5, Lcom/bumptech/glide/load/o/j;->b:Lcom/bumptech/glide/load/o/j;

    invoke-virtual {v2, v5}, Lcom/digdroid/alman/dig/n1;->C0(Lcom/bumptech/glide/load/o/j;)Lcom/digdroid/alman/dig/n1;

    new-instance v5, Lcom/bumptech/glide/s/d;

    invoke-direct {v5, v1}, Lcom/bumptech/glide/s/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, v5}, Lcom/digdroid/alman/dig/n1;->R0(Lcom/bumptech/glide/load/g;)Lcom/digdroid/alman/dig/n1;

    if-eqz v4, :cond_6

    invoke-virtual {v2, v4}, Lcom/digdroid/alman/dig/n1;->F0(Landroid/graphics/drawable/Drawable;)Lcom/digdroid/alman/dig/n1;

    goto :goto_2

    :cond_6
    invoke-virtual {v2, v3}, Lcom/digdroid/alman/dig/n1;->E0(I)Lcom/digdroid/alman/dig/n1;

    :goto_2
    iget-object v4, p0, Lcom/digdroid/alman/dig/j0;->w1:Landroid/widget/ImageView;

    invoke-virtual {v2, v4}, Lcom/bumptech/glide/j;->p0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catch_1
    :try_start_4
    iget-boolean v2, p0, Lcom/digdroid/alman/dig/j0;->v0:Z

    if-eqz v2, :cond_7

    if-eqz p1, :cond_7

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/j0;->w0:Z

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/j0;->i3(Z)Ljava/io/File;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz p1, :cond_7

    :try_start_5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/l1;->a(Landroid/content/Context;)Lcom/digdroid/alman/dig/o1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/o1;->I(Ljava/io/File;)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    sget-object v0, Lcom/bumptech/glide/load/o/j;->b:Lcom/bumptech/glide/load/o/j;

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/n1;->C0(Lcom/bumptech/glide/load/o/j;)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/n1;->T0(Z)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    new-instance v0, Lcom/bumptech/glide/s/d;

    invoke-direct {v0, v1}, Lcom/bumptech/glide/s/d;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/n1;->R0(Lcom/bumptech/glide/load/g;)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    invoke-virtual {p1, v3}, Lcom/digdroid/alman/dig/n1;->E0(I)Lcom/digdroid/alman/dig/n1;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0;->x1:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/j;->p0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_2
    :cond_7
    monitor-exit p0

    return-void

    :cond_8
    :goto_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public bridge synthetic x2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->x2()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic y2(II)Z
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/digdroid/alman/dig/p1;->y2(II)Z

    move-result p1

    return p1
.end method

.method public y3()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/j0;->w2()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/digdroid/alman/dig/p1$a;->v(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method z2(Landroid/content/Intent;)V
    .locals 5

    const-string v0, "gameid"

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v0

    iget-wide v2, p0, Lcom/digdroid/alman/dig/j0;->q0:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    const-string v0, "is_screenshot"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/j0;->W0:Z

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/j0;->v3(Z)V

    goto :goto_0

    :cond_0
    iput-boolean v0, p0, Lcom/digdroid/alman/dig/j0;->V0:Z

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/j0;->v3(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->R()V

    :cond_1
    :goto_0
    return-void
.end method

.method z3(I)V
    .locals 6

    iput p1, p0, Lcom/digdroid/alman/dig/j0;->j1:I

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0;->g1:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/j0$z;

    iget-wide v1, v0, Lcom/digdroid/alman/dig/j0$z;->a:J

    iget v3, p0, Lcom/digdroid/alman/dig/j0;->i1:I

    int-to-long v3, v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    iget v1, p0, Lcom/digdroid/alman/dig/j0;->j1:I

    iput v1, v0, Lcom/digdroid/alman/dig/j0$z;->c:I

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UPDATE emulators SET use_retroarch64="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/digdroid/alman/dig/j0;->j1:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " WHERE _id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/digdroid/alman/dig/j0;->i1:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return-void
.end method
