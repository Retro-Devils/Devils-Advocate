.class public Lcom/digdroid/alman/dig/t0;
.super Lcom/digdroid/alman/dig/r1;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/g1$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/t0$k;,
        Lcom/digdroid/alman/dig/t0$l;
    }
.end annotation


# instance fields
.field s0:Lcom/digdroid/alman/dig/h0;

.field private t0:Z

.field private u0:Z

.field v0:Lcom/digdroid/alman/dig/t0$l;

.field private w0:Ljava/lang/String;

.field x0:Lcom/digdroid/alman/dig/v0;

.field y0:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r1;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/t0;->t0:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/t0;->u0:Z

    sget-object v0, Lcom/digdroid/alman/dig/t0$l;->b:Lcom/digdroid/alman/dig/t0$l;

    iput-object v0, p0, Lcom/digdroid/alman/dig/t0;->v0:Lcom/digdroid/alman/dig/t0$l;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t0;->x0:Lcom/digdroid/alman/dig/v0;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/t0;->y0:J

    return-void
.end method

.method private D3()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    const-string v1, ""

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v2, v0, v3}, Lcom/digdroid/alman/dig/h0;->c(Landroid/content/Context;Lcom/digdroid/alman/dig/g3;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    return-object v0

    :cond_2
    :goto_0
    return-object v1
.end method

.method private F3(I)Z
    .locals 5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->B2()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-ltz p1, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->q0:Lcom/digdroid/alman/dig/d2;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/d2;->c()Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x2

    invoke-interface {v0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v3, p1}, Lcom/digdroid/alman/dig/g3;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {v4, p1}, Lcom/digdroid/alman/dig/g3;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v2, v3, p1}, Lcom/digdroid/alman/dig/p1$a;->G(Lcom/digdroid/alman/dig/s3;Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method static synthetic w3(Lcom/digdroid/alman/dig/t0;I)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/t0;->F3(I)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public A3()Lcom/digdroid/alman/dig/h0;
    .locals 2

    new-instance v0, Lcom/digdroid/alman/dig/h0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    invoke-direct {v0, v1}, Lcom/digdroid/alman/dig/h0;-><init>(Lcom/digdroid/alman/dig/h0;)V

    return-object v0
.end method

.method B3()Landroid/database/Cursor;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->C3()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/o0;->e(Ljava/lang/String;Lcom/digdroid/alman/dig/h0;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method C3()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const-string v2, "played"

    const/4 v3, -0x1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "timeplayed"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x6

    goto :goto_0

    :sswitch_1
    const-string v1, "cmostplayed"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x5

    goto :goto_0

    :sswitch_2
    const-string v1, "title"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x4

    goto :goto_0

    :sswitch_3
    const-string v1, "fuzzy"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x3

    goto :goto_0

    :sswitch_4
    const-string v1, "ctimeplayed"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x2

    goto :goto_0

    :sswitch_5
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const/4 v3, 0x1

    goto :goto_0

    :sswitch_6
    const-string v1, "mostplayed"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const/4 v3, 0x0

    :goto_0
    packed-switch v3, :pswitch_data_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    return-object v0

    :pswitch_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->x3()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    return-object v2

    :sswitch_data_0
    .sparse-switch
        -0x4b5617ea -> :sswitch_6
        -0x3ac1652d -> :sswitch_5
        -0xb41ff7d -> :sswitch_4
        0x5d4660a -> :sswitch_3
        0x6942258 -> :sswitch_2
        0x491b08b9 -> :sswitch_1
        0x604cdfe0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public E2(Z)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/digdroid/alman/dig/t0$k;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/e2;->d(I)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, Lcom/digdroid/alman/dig/t0$k;-><init>(Lcom/digdroid/alman/dig/t0;Ljava/lang/Object;Z)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Void;

    invoke-virtual {v0, p1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method

.method public E3()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->J()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/t0;->u0:Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    const-string v1, ""

    iput-object v1, v0, Lcom/digdroid/alman/dig/h0;->g:Ljava/lang/String;

    sget-object v0, Lcom/digdroid/alman/dig/t0$l;->b:Lcom/digdroid/alman/dig/t0$l;

    iput-object v0, p0, Lcom/digdroid/alman/dig/t0;->v0:Lcom/digdroid/alman/dig/t0$l;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return-void
.end method

.method public F2()V
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/r1;->F2()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/t0;->t0:Z

    return-void
.end method

.method public G()[I
    .locals 1

    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    return-object v0

    nop

    :array_0
    .array-data 4
        0x7f0901a8
        0x7f0901a8
        0x7f0901ab
        0x7f090327
        0x7f0901a9
    .end array-data
.end method

.method public G3(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v2, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    xor-int/2addr v1, v2

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    const/4 v0, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/4 v3, 0x0

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v2, "title"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    goto :goto_0

    :sswitch_1
    const-string v2, "date"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0

    :sswitch_2
    const-string v2, "played"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iput-boolean v3, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    goto :goto_2

    :pswitch_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    :goto_1
    iput-boolean v1, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    :goto_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iput-object p1, v0, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3ac1652d -> :sswitch_2
        0x2eefae -> :sswitch_1
        0x6942258 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public H2(Landroid/view/MenuItem;)Z
    .locals 4

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/t0;->H3(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const-string v2, ""

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/r1;->H2(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :sswitch_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/b3;->m()Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/b3;->U(Z)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return v1

    :sswitch_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v0, p1, Lcom/digdroid/alman/dig/h0;->f:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Lcom/digdroid/alman/dig/h0;->f:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v2, "show_not_played"

    invoke-virtual {p1, v2, v0}, Lcom/digdroid/alman/dig/b3;->B(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return v1

    :sswitch_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v0, p1, Lcom/digdroid/alman/dig/h0;->e:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Lcom/digdroid/alman/dig/h0;->e:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v2, "show_favorites"

    invoke-virtual {p1, v2, v0}, Lcom/digdroid/alman/dig/b3;->B(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return v1

    :sswitch_3
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    const/16 v2, 0x14

    new-instance v3, Lcom/digdroid/alman/dig/t0$i;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/t0$i;-><init>(Lcom/digdroid/alman/dig/t0;)V

    invoke-virtual {p1, v0, v2, v3}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    return v1

    :sswitch_4
    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->J()V

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/t0;->u0:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iput-object v2, p1, Lcom/digdroid/alman/dig/h0;->g:Ljava/lang/String;

    sget-object p1, Lcom/digdroid/alman/dig/t0$l;->c:Lcom/digdroid/alman/dig/t0$l;

    iput-object p1, p0, Lcom/digdroid/alman/dig/t0;->v0:Lcom/digdroid/alman/dig/t0$l;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return v1

    :sswitch_5
    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const/4 v0, 0x0

    const-string v2, "search_filenames"

    invoke-virtual {p1, v2, v0}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v0

    xor-int/2addr v0, v1

    invoke-virtual {p1, v2, v0}, Lcom/digdroid/alman/dig/b3;->B(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return v1

    :sswitch_6
    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->J()V

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/t0;->u0:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iput-object v2, p1, Lcom/digdroid/alman/dig/h0;->g:Ljava/lang/String;

    sget-object p1, Lcom/digdroid/alman/dig/t0$l;->b:Lcom/digdroid/alman/dig/t0$l;

    iput-object p1, p0, Lcom/digdroid/alman/dig/t0;->v0:Lcom/digdroid/alman/dig/t0$l;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return v1

    :sswitch_7
    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    const/16 v2, 0x10

    new-instance v3, Lcom/digdroid/alman/dig/t0$j;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/t0$j;-><init>(Lcom/digdroid/alman/dig/t0;)V

    invoke-virtual {p1, v0, v2, v3}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    return v1

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f090054 -> :sswitch_7
        0x7f090361 -> :sswitch_6
        0x7f090363 -> :sswitch_5
        0x7f090369 -> :sswitch_4
        0x7f090378 -> :sswitch_3
        0x7f090383 -> :sswitch_2
        0x7f090385 -> :sswitch_1
        0x7f09038b -> :sswitch_0
    .end sparse-switch
.end method

.method H3(I)Z
    .locals 7

    const v0, 0x7f09028a

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v0, :cond_c

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    return v1

    :pswitch_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v3, "title"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    if-nez v0, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    iput-boolean v1, p1, Lcom/digdroid/alman/dig/h0;->o:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iput-object v3, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return v2

    :pswitch_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v3, "timeplayed"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    if-nez v0, :cond_2

    const/4 v1, 0x1

    :cond_2
    iput-boolean v1, p1, Lcom/digdroid/alman/dig/h0;->o:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iput-object v3, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return v2

    :pswitch_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v3, "rating"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    if-nez v0, :cond_3

    const/4 v1, 0x1

    :cond_3
    iput-boolean v1, p1, Lcom/digdroid/alman/dig/h0;->o:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iput-object v3, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return v2

    :pswitch_3
    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v3, "played"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    if-nez v0, :cond_5

    :cond_4
    const/4 v1, 0x1

    :cond_5
    iput-boolean v1, p1, Lcom/digdroid/alman/dig/h0;->o:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iput-object v3, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return v2

    :pswitch_4
    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v3, "mostplayed"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    if-nez v0, :cond_6

    const/4 v1, 0x1

    :cond_6
    iput-boolean v1, p1, Lcom/digdroid/alman/dig/h0;->o:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iput-object v3, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return v2

    :pswitch_5
    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v3, "date"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    if-nez v0, :cond_8

    :cond_7
    const/4 v1, 0x1

    :cond_8
    iput-boolean v1, p1, Lcom/digdroid/alman/dig/h0;->o:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iput-object v3, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return v2

    :pswitch_6
    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v3, "ctimeplayed"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    if-nez v0, :cond_9

    const/4 v1, 0x1

    :cond_9
    iput-boolean v1, p1, Lcom/digdroid/alman/dig/h0;->o:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iput-object v3, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return v2

    :pswitch_7
    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v3, "crating"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    if-nez v0, :cond_a

    const/4 v1, 0x1

    :cond_a
    iput-boolean v1, p1, Lcom/digdroid/alman/dig/h0;->o:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iput-object v3, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return v2

    :pswitch_8
    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v3, "cmostplayed"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    if-nez v0, :cond_b

    const/4 v1, 0x1

    :cond_b
    iput-boolean v1, p1, Lcom/digdroid/alman/dig/h0;->o:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iput-object v3, p1, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    return v2

    :cond_c
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c00a5

    const/4 v3, 0x0

    invoke-virtual {p1, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0xa

    new-array v4, v0, [Ljava/lang/String;

    :goto_0
    if-ge v1, v0, :cond_d

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v1, 0x1

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v1

    move v1, v6

    goto :goto_0

    :cond_d
    new-instance v0, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    const v5, 0x1090008

    invoke-direct {v0, v1, v5, v4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const/4 v4, 0x2

    const-string v5, "min_ratings"

    invoke-virtual {v1, v5, v4}, Lcom/digdroid/alman/dig/b3;->l(Ljava/lang/String;I)I

    move-result v1

    const v4, 0x7f09028b

    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Spinner;

    invoke-virtual {v4, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    sub-int/2addr v1, v2

    invoke-virtual {v4, v1}, Landroid/widget/Spinner;->setSelection(I)V

    new-instance v0, Lcom/digdroid/alman/dig/t0$h;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/t0$h;-><init>(Lcom/digdroid/alman/dig/t0;)V

    invoke-virtual {v4, v0}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    const v1, 0x7f11018a

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const v0, 0x7f1101d8

    invoke-virtual {p1, v0, v3}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x7f090394
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7f09039f
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public I2(Ljava/lang/String;)V
    .locals 4

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/t0;->u0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->v0:Lcom/digdroid/alman/dig/t0$l;

    sget-object v1, Lcom/digdroid/alman/dig/t0$l;->d:Lcom/digdroid/alman/dig/t0$l;

    if-eq v0, v1, :cond_1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/t0;->t0:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/t0;->v0:Lcom/digdroid/alman/dig/t0$l;

    sget-object v3, Lcom/digdroid/alman/dig/t0$l;->c:Lcom/digdroid/alman/dig/t0$l;

    if-ne v2, v3, :cond_0

    const-string v2, "^"

    goto :goto_0

    :cond_0
    const-string v2, ""

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/digdroid/alman/dig/h0;->g:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    :cond_1
    return-void
.end method

.method public J2(Ljava/lang/String;)V
    .locals 4

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/t0;->u0:Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->v0:Lcom/digdroid/alman/dig/t0$l;

    sget-object v1, Lcom/digdroid/alman/dig/t0$l;->d:Lcom/digdroid/alman/dig/t0$l;

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/digdroid/alman/dig/t0;->v0:Lcom/digdroid/alman/dig/t0$l;

    sget-object v3, Lcom/digdroid/alman/dig/t0$l;->c:Lcom/digdroid/alman/dig/t0$l;

    if-ne v2, v3, :cond_1

    const-string v2, "^"

    goto :goto_0

    :cond_1
    const-string v2, ""

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/digdroid/alman/dig/h0;->g:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->o3()V

    :goto_1
    return-void
.end method

.method public M2()Z
    .locals 6

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    if-eqz v0, :cond_0

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/t0;->t0:Z

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/digdroid/alman/dig/e2;->d(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/database/Cursor;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v2

    if-nez v2, :cond_0

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/t0;->t0:Z

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v3

    check-cast v3, Lcom/digdroid/alman/dig/x3;

    const/4 v4, 0x0

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    invoke-virtual {v2, v3, v4, v5, v0}, Lcom/digdroid/alman/dig/o0;->i(Lcom/digdroid/alman/dig/x3;JLcom/digdroid/alman/dig/h0;)V

    :cond_0
    return v1
.end method

.method N2()V
    .locals 2

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/t0;->u0:Z

    xor-int/lit8 v0, v0, 0x1

    new-instance v1, Lcom/digdroid/alman/dig/t0$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/t0$b;-><init>(Lcom/digdroid/alman/dig/t0;)V

    invoke-super {p0, v0, v1}, Lcom/digdroid/alman/dig/r1;->n3(ZLjava/util/concurrent/Callable;)V

    return-void
.end method

.method public P2()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/t0;->F3(I)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Lcom/digdroid/alman/dig/r1;->P2()V

    :cond_1
    return-void
.end method

.method public Q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public R(Landroid/database/Cursor;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public R2()V
    .locals 3

    invoke-super {p0}, Lcom/digdroid/alman/dig/r1;->R2()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->B()Landroid/view/Menu;

    move-result-object v0

    const v1, 0x7f0902c3

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v1

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/b3;->t()Z

    move-result v2

    invoke-interface {v1, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v1, 0x7f0902c4

    invoke-interface {v0, v1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/b3;->t()Z

    move-result v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return-void
.end method

.method public W0(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/r1;->W0(Landroid/os/Bundle;)V

    new-instance v0, Lcom/digdroid/alman/dig/h0;

    invoke-direct {v0}, Lcom/digdroid/alman/dig/h0;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/h0;->b(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v2, "show_favorites"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lcom/digdroid/alman/dig/h0;->e:Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v2, "show_not_played"

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v0, Lcom/digdroid/alman/dig/h0;->f:Z

    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/r1;->V2(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    const-string v1, "sort_type"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    const-string v1, "sort_ascending"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    const-string v1, "search_for"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/digdroid/alman/dig/h0;->g:Ljava/lang/String;

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->h0()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "title"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/p1;->h0:Ljava/lang/String;

    return-void
.end method

.method public Y2(Z)V
    .locals 2

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->j0:Z

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/r1;->Y2(Z)V

    if-nez p1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t0;->x0:Lcom/digdroid/alman/dig/v0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/v0;->g()V

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t0;->y3(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Landroid/database/Cursor;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/r1;->a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget-object p2, p2, Lcom/digdroid/alman/dig/s3;->u:Ljava/lang/String;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    new-instance p3, Lcom/digdroid/alman/dig/t0$a;

    invoke-direct {p3, p0}, Lcom/digdroid/alman/dig/t0$a;-><init>(Lcom/digdroid/alman/dig/t0;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    new-instance p3, Lcom/digdroid/alman/dig/t0$c;

    invoke-direct {p3, p0}, Lcom/digdroid/alman/dig/t0$c;-><init>(Lcom/digdroid/alman/dig/t0;)V

    :goto_0
    invoke-virtual {p2, p3}, Lcom/digdroid/alman/dig/e2;->v(Lcom/digdroid/alman/dig/e2$x;)V

    return-object p1
.end method

.method public a3()V
    .locals 6

    new-instance v0, Lb/a/o/d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    const v2, 0x7f12000c

    invoke-direct {v0, v1, v2}, Lb/a/o/d;-><init>(Landroid/content/Context;I)V

    new-instance v1, Landroidx/appcompat/widget/l0;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v2}, Lcom/digdroid/alman/dig/p1$a;->I()Landroid/view/View;

    move-result-object v2

    const v3, 0x800005

    invoke-direct {v1, v0, v2, v3}, Landroidx/appcompat/widget/l0;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    invoke-virtual {v1}, Landroidx/appcompat/widget/l0;->b()Landroid/view/MenuInflater;

    move-result-object v0

    invoke-virtual {v1}, Landroidx/appcompat/widget/l0;->a()Landroid/view/Menu;

    move-result-object v2

    const v3, 0x7f0d0010

    invoke-virtual {v0, v3, v2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    invoke-virtual {v1}, Landroidx/appcompat/widget/l0;->a()Landroid/view/Menu;

    move-result-object v0

    const v2, 0x7f09028a

    invoke-interface {v0, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v3

    const v4, 0x7f11018a

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v4, "min_ratings"

    const/4 v5, 0x2

    invoke-virtual {v3, v4, v5}, Lcom/digdroid/alman/dig/b3;->l(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    new-instance v0, Lcom/digdroid/alman/dig/t0$g;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/t0$g;-><init>(Lcom/digdroid/alman/dig/t0;)V

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/l0;->c(Landroidx/appcompat/widget/l0$d;)V

    invoke-virtual {v1}, Landroidx/appcompat/widget/l0;->d()V

    return-void
.end method

.method public b()Lcom/digdroid/alman/dig/m;
    .locals 5

    new-instance v0, Lcom/digdroid/alman/dig/m;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v2, v1, Lcom/digdroid/alman/dig/s3;->h:I

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->i:I

    const/4 v3, 0x1

    const/4 v4, 0x6

    invoke-direct {v0, v3, v2, v1, v4}, Lcom/digdroid/alman/dig/m;-><init>(ZIII)V

    return-object v0
.end method

.method public c3()V
    .locals 4

    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    new-instance v2, Lcom/digdroid/alman/dig/t0$e;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/t0$e;-><init>(Lcom/digdroid/alman/dig/t0;)V

    const/16 v3, 0x14

    invoke-virtual {v0, v1, v3, v2}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    return-void
.end method

.method f3(Landroid/view/View;Ljava/lang/Object;)V
    .locals 7

    if-nez p2, :cond_0

    return-void

    :cond_0
    check-cast p2, Landroid/database/Cursor;

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    const/4 v4, 0x2

    invoke-interface {p2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v3, p2}, Lcom/digdroid/alman/dig/g3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v3, "mame"

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    new-instance v3, Lb/a/o/d;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v4

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v5

    invoke-direct {v3, v4, v5}, Lb/a/o/d;-><init>(Landroid/content/Context;I)V

    if-nez p1, :cond_1

    new-instance p1, Landroidx/appcompat/widget/l0;

    iget-object v4, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v4}, Lcom/digdroid/alman/dig/p1$a;->I()Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x5

    invoke-direct {p1, v3, v4, v5}, Landroidx/appcompat/widget/l0;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    goto :goto_0

    :cond_1
    new-instance v4, Landroidx/appcompat/widget/l0;

    invoke-direct {v4, v3, p1}, Landroidx/appcompat/widget/l0;-><init>(Landroid/content/Context;Landroid/view/View;)V

    move-object p1, v4

    :goto_0
    invoke-virtual {p1}, Landroidx/appcompat/widget/l0;->b()Landroid/view/MenuInflater;

    move-result-object v3

    const v4, 0x7f0d000b

    invoke-virtual {p1}, Landroidx/appcompat/widget/l0;->a()Landroid/view/Menu;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    invoke-virtual {p1}, Landroidx/appcompat/widget/l0;->a()Landroid/view/Menu;

    move-result-object v3

    const v4, 0x7f09026e

    invoke-interface {v3, v4}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    invoke-interface {v3}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v3

    invoke-interface {v3}, Landroid/view/SubMenu;->clearHeader()V

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {v3}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SELECT favorite FROM roms WHERE _id="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3

    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p1}, Landroidx/appcompat/widget/l0;->a()Landroid/view/Menu;

    move-result-object v4

    const v5, 0x7f090192

    invoke-interface {v4, v5}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v4

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_2

    const/4 v0, 0x1

    :cond_2
    invoke-interface {v4, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    :cond_3
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    new-instance v0, Lcom/digdroid/alman/dig/t0$f;

    invoke-direct {v0, p0, v1, v2, p2}, Lcom/digdroid/alman/dig/t0$f;-><init>(Lcom/digdroid/alman/dig/t0;JZ)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/l0;->c(Landroidx/appcompat/widget/l0$d;)V

    invoke-virtual {p1}, Landroidx/appcompat/widget/l0;->d()V

    return-void
.end method

.method h3(Landroid/database/Cursor;)Lcom/digdroid/alman/dig/d2;
    .locals 12

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/digdroid/alman/dig/MainActivity;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/t0;->D3()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ("

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/r1;->V2(Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->j0:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->U2()V

    :cond_2
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->Q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    const/4 v3, -0x1

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    :goto_1
    const/4 v1, -0x1

    goto :goto_2

    :sswitch_0
    const-string v1, "coverflow"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    const/4 v1, 0x5

    goto :goto_2

    :sswitch_1
    const-string v1, "wheel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x4

    goto :goto_2

    :sswitch_2
    const-string v1, "title"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    const/4 v1, 0x3

    goto :goto_2

    :sswitch_3
    const-string v1, "carousel"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    const/4 v1, 0x2

    goto :goto_2

    :sswitch_4
    const-string v1, "linear"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_1

    :cond_7
    const/4 v1, 0x1

    goto :goto_2

    :sswitch_5
    const-string v4, "vertical"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_1

    :cond_8
    :goto_2
    new-instance v0, Lcom/digdroid/alman/dig/d2;

    packed-switch v1, :pswitch_data_0

    new-instance v10, Lcom/digdroid/alman/dig/p0;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v5

    iget-object v6, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->C3()Ljava/lang/String;

    move-result-object v7

    iget-object v8, p0, Lcom/digdroid/alman/dig/t0;->w0:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->w()Z

    move-result v9

    move-object v1, v10

    move-object v4, p1

    invoke-direct/range {v1 .. v9}, Lcom/digdroid/alman/dig/p0;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FLcom/digdroid/alman/dig/u;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-direct {v0, v10}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/q1;)V

    return-object v0

    :pswitch_0
    new-instance v11, Lcom/digdroid/alman/dig/s0;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->W()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v6

    iget-object v7, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->C3()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lcom/digdroid/alman/dig/t0;->w0:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->w()Z

    move-result v10

    move-object v1, v11

    move-object v4, p1

    invoke-direct/range {v1 .. v10}, Lcom/digdroid/alman/dig/s0;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLcom/digdroid/alman/dig/u;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-direct {v0, v11}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    return-object v0

    :pswitch_1
    new-instance v11, Lcom/digdroid/alman/dig/y0;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->x()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v6

    iget-object v7, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->C3()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lcom/digdroid/alman/dig/t0;->w0:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->w()Z

    move-result v10

    move-object v1, v11

    move-object v4, p1

    invoke-direct/range {v1 .. v10}, Lcom/digdroid/alman/dig/y0;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLcom/digdroid/alman/dig/u;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-direct {v0, v11}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    return-object v0

    :pswitch_2
    new-instance v7, Lcom/digdroid/alman/dig/g1;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v5

    move-object v1, v7

    move-object v4, p1

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, Lcom/digdroid/alman/dig/g1;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FLcom/digdroid/alman/dig/g1$a;)V

    invoke-direct {v0, v7}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/q1;)V

    return-object v0

    :pswitch_3
    new-instance v11, Lcom/digdroid/alman/dig/r0;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->z()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v6

    iget-object v7, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->C3()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lcom/digdroid/alman/dig/t0;->w0:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->w()Z

    move-result v10

    move-object v1, v11

    move-object v4, p1

    invoke-direct/range {v1 .. v10}, Lcom/digdroid/alman/dig/r0;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLcom/digdroid/alman/dig/u;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-direct {v0, v11}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    return-object v0

    :pswitch_4
    new-instance v11, Lcom/digdroid/alman/dig/u0;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->V()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v6

    iget-object v7, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->C3()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lcom/digdroid/alman/dig/t0;->w0:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->w()Z

    move-result v10

    move-object v1, v11

    move-object v4, p1

    invoke-direct/range {v1 .. v10}, Lcom/digdroid/alman/dig/u0;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLcom/digdroid/alman/dig/u;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-direct {v0, v11}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    return-object v0

    :pswitch_5
    new-instance v11, Lcom/digdroid/alman/dig/w0;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->E()F

    move-result v5

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->k3()F

    move-result v6

    iget-object v7, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->C3()Ljava/lang/String;

    move-result-object v8

    iget-object v9, p0, Lcom/digdroid/alman/dig/t0;->w0:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->w()Z

    move-result v10

    move-object v1, v11

    move-object v4, p1

    invoke-direct/range {v1 .. v10}, Lcom/digdroid/alman/dig/w0;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/s3;Landroid/database/Cursor;FFLcom/digdroid/alman/dig/u;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-direct {v0, v11}, Lcom/digdroid/alman/dig/d2;-><init>(Lcom/digdroid/alman/dig/h;)V

    return-object v0

    :cond_9
    :goto_3
    const/4 p1, 0x0

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7643988a -> :sswitch_5
        -0x41b970db -> :sswitch_4
        0x2c6160 -> :sswitch_3
        0x6942258 -> :sswitch_2
        0x6bdbb5b -> :sswitch_1
        0x7608a165 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method i3()Landroid/database/Cursor;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    invoke-static {v0}, Lcom/digdroid/alman/dig/y3;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t0;->w0:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->B3()Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public j3()Ljava/lang/String;
    .locals 1

    const-string v0, "grid"

    return-object v0
.end method

.method l3(Landroid/view/View;Ljava/lang/Object;)V
    .locals 3

    if-nez p2, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/t0;->t0:Z

    check-cast p2, Landroid/database/Cursor;

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->m()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/x3;

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    iget-object p2, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    invoke-virtual {p1, v0, v1, v2, p2}, Lcom/digdroid/alman/dig/o0;->i(Lcom/digdroid/alman/dig/x3;JLcom/digdroid/alman/dig/h0;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p2, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    invoke-interface {p2, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    invoke-interface {v0, v1, v2, p1, p2}, Lcom/digdroid/alman/dig/p1$a;->D(JLjava/lang/String;Lcom/digdroid/alman/dig/h0;)V

    :goto_0
    return-void
.end method

.method public m1()V
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/r1;->m1()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->x0:Lcom/digdroid/alman/dig/v0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/v0;->g()V

    :cond_0
    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/r1;->V2(Ljava/lang/String;)V

    return-void
.end method

.method public o3()V
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/t0;->u0:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-super {p0, v0}, Lcom/digdroid/alman/dig/r1;->p3(Z)V

    return-void
.end method

.method public p2(Landroid/view/Menu;)V
    .locals 9

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/r1;->p2(Landroid/view/Menu;)V

    const v0, 0x7f090438

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    if-eqz v0, :cond_0

    const-string v0, "\u25b2"

    goto :goto_0

    :cond_0
    const-string v0, "\u25bc"

    :goto_0
    const v2, 0x7f09039f

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v5

    const v6, 0x7f110147

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v5, v5, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v7, "played"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const-string v8, ""

    if-eqz v5, :cond_1

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, v8

    :goto_1
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v3, 0x7f0903a0

    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v5, v5, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v5, v0

    goto :goto_2

    :cond_2
    move-object v5, v8

    :goto_2
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v3, v3, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v2, 0x7f09039c

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v5

    const v6, 0x7f1101b7

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v5, v5, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v7, "mostplayed"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move-object v5, v0

    goto :goto_3

    :cond_3
    move-object v5, v8

    :goto_3
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v3, 0x7f09039d

    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v5, v5, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move-object v5, v0

    goto :goto_4

    :cond_4
    move-object v5, v8

    :goto_4
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v3, v3, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v2, 0x7f0903a3

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v5

    const v6, 0x7f1101ba

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v5, v5, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v7, "timeplayed"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move-object v5, v0

    goto :goto_5

    :cond_5
    move-object v5, v8

    :goto_5
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v3, 0x7f0903a4

    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v5, v5, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    move-object v5, v0

    goto :goto_6

    :cond_6
    move-object v5, v8

    :goto_6
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v3, v3, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v2, 0x7f0903a5

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v5

    const v6, 0x7f11024f

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v5, v5, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v7, "title"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    move-object v5, v0

    goto :goto_7

    :cond_7
    move-object v5, v8

    :goto_7
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v3, 0x7f0903a6

    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v5, v5, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    move-object v5, v0

    goto :goto_8

    :cond_8
    move-object v5, v8

    :goto_8
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v3, v3, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v2, 0x7f09039a

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v5

    const v6, 0x7f11024d

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v5, v5, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v7, "date"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    move-object v5, v0

    goto :goto_9

    :cond_9
    move-object v5, v8

    :goto_9
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v3, 0x7f09039b

    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v5, v5, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    move-object v5, v0

    goto :goto_a

    :cond_a
    move-object v5, v8

    :goto_a
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v3, v3, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v2, 0x7f0903a1

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v5

    const v6, 0x7f1101b8

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v5, v5, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v6, "rating"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_b

    move-object v5, v0

    goto :goto_b

    :cond_b
    move-object v5, v8

    :goto_b
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v3, 0x7f0903a2

    invoke-interface {p1, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v5

    const v7, 0x7f1101b8

    invoke-virtual {v5, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v5, v5, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    move-object v5, v0

    goto :goto_c

    :cond_c
    move-object v5, v8

    :goto_c
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v3, v3, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v2, 0x7f090396

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v4

    const v5, 0x7f110204

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v4, v4, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v5, "crating"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    move-object v4, v0

    goto :goto_d

    :cond_d
    move-object v4, v8

    :goto_d
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v2, 0x7f090397

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v4

    const v6, 0x7f110204

    invoke-virtual {v4, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v4, v4, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    move-object v4, v0

    goto :goto_e

    :cond_e
    move-object v4, v8

    :goto_e
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v2, 0x7f090396

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v3, v3, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v2, 0x7f090394

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v4

    const v5, 0x7f11018d

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v4, v4, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v5, "cmostplayed"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    move-object v4, v0

    goto :goto_f

    :cond_f
    move-object v4, v8

    :goto_f
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v2, 0x7f090395

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v4

    const v6, 0x7f11018d

    invoke-virtual {v4, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v4, v4, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    move-object v4, v0

    goto :goto_10

    :cond_10
    move-object v4, v8

    :goto_10
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v2, 0x7f090394

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v3, v3, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v2, 0x7f090398

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v4

    const v5, 0x7f110271

    invoke-virtual {v4, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v4, v4, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v5, "ctimeplayed"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_11

    move-object v4, v0

    goto :goto_11

    :cond_11
    move-object v4, v8

    :goto_11
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v2, 0x7f090399

    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v4

    const v6, 0x7f110271

    invoke-virtual {v4, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v4, v4, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_12

    goto :goto_12

    :cond_12
    move-object v0, v8

    :goto_12
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v0, 0x7f090398

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f09028a

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v3

    const v4, 0x7f11018a

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const/4 v4, 0x2

    const-string v5, "min_ratings"

    invoke-virtual {v3, v5, v4}, Lcom/digdroid/alman/dig/b3;->l(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    const v0, 0x7f090393

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v2

    invoke-interface {v2}, Landroid/view/SubMenu;->clearHeader()V

    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_13

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    new-instance v3, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->w()I

    move-result v4

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4, v5}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_13
    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    const v0, 0x7f09035c

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V

    const v2, 0x7f090363

    invoke-interface {v0, v2}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string v3, "search_filenames"

    invoke-virtual {v2, v3, v1}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v2

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_14

    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    new-instance v3, Landroid/graphics/PorterDuffColorFilter;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->w()I

    move-result v4

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4, v5}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    :cond_14
    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    const v0, 0x7f09038b

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/b3;->m()Z

    move-result v2

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v0, 0x7f090383

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v2, v2, Lcom/digdroid/alman/dig/h0;->e:Z

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v0, 0x7f090385

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v2, v2, Lcom/digdroid/alman/dig/h0;->f:Z

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    const v0, 0x7f090270

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    const v0, 0x7f090056

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return-void
.end method

.method public r1()V
    .locals 5

    invoke-super {p0}, Lcom/digdroid/alman/dig/r1;->r1()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/t0;->t0:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/t0;->x0:Lcom/digdroid/alman/dig/v0;

    invoke-direct {p0}, Lcom/digdroid/alman/dig/t0;->D3()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/r1;->V2(Ljava/lang/String;)V

    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v1

    new-instance v2, Lcom/digdroid/alman/dig/t0$d;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/t0$d;-><init>(Lcom/digdroid/alman/dig/t0;)V

    const/16 v3, 0x14

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v3, v2, v4}, Lcom/digdroid/alman/dig/d0;->s(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;Z)V

    return-void
.end method

.method r2()I
    .locals 1

    const v0, 0x7f0d0007

    return v0
.end method

.method public s1(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->n:Ljava/lang/String;

    const-string v1, "sort_type"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-boolean v0, v0, Lcom/digdroid/alman/dig/h0;->o:Z

    const-string v1, "sort_ascending"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->g:Ljava/lang/String;

    const-string v1, "search_for"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/r1;->s1(Landroid/os/Bundle;)V

    return-void
.end method

.method public t2()Ljava/lang/String;
    .locals 1

    const-string v0, "game"

    return-object v0
.end method

.method public u3(Ljava/lang/String;I)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/b3;->M(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    invoke-interface {v0, p1, v1, p2}, Lcom/digdroid/alman/dig/p1$a;->q(Ljava/lang/String;Lcom/digdroid/alman/dig/h0;I)V

    :cond_0
    return-void
.end method

.method x3()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "system"

    goto :goto_0

    :cond_0
    const-string v0, "date"

    :goto_0
    return-object v0
.end method

.method y3(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/r1;->B2()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0;->x0:Lcom/digdroid/alman/dig/v0;

    if-eqz v0, :cond_0

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/v0;->g:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/r1;->o0:Landroid/database/Cursor;

    invoke-virtual {v0, v1, p1}, Lcom/digdroid/alman/dig/v0;->k(Landroid/database/Cursor;I)V

    :cond_0
    return-void
.end method

.method declared-synchronized z2(Landroid/content/Intent;)V
    .locals 6

    monitor-enter p0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/t0;->z3(Landroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-wide v2, p0, Lcom/digdroid/alman/dig/t0;->y0:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x1388

    cmp-long p1, v2, v4

    if-ltz p1, :cond_0

    iput-wide v0, p0, Lcom/digdroid/alman/dig/t0;->y0:J

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/t0;->N2()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method z3(Landroid/content/Intent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
