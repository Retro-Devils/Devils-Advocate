.class public Lcom/digdroid/alman/dig/s;
.super Lcom/digdroid/alman/dig/p1;
.source ""


# static fields
.field public static final n0:[I

.field public static final o0:[Ljava/lang/String;

.field public static final p0:[I

.field public static final q0:[Ljava/lang/String;

.field public static final r0:[[I


# instance fields
.field s0:Lcom/digdroid/alman/dig/MyListView;

.field t0:Lcom/digdroid/alman/dig/r;

.field u0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/digdroid/alman/dig/s3;",
            ">;"
        }
    .end annotation
.end field

.field v0:Lcom/digdroid/alman/dig/s3;

.field w0:I

.field x0:I

.field y0:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    const/16 v0, 0x13

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lcom/digdroid/alman/dig/s;->n0:[I

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "name"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "media"

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const-string v1, "zoom"

    const/4 v4, 0x2

    aput-object v1, v0, v4

    const-string v1, "image_time"

    const/4 v5, 0x3

    aput-object v1, v0, v5

    const-string v1, "sound"

    const/4 v6, 0x4

    aput-object v1, v0, v6

    const-string v1, "tool_icons"

    const/4 v7, 0x5

    aput-object v1, v0, v7

    const-string v1, "icons"

    const/4 v8, 0x6

    aput-object v1, v0, v8

    const-string v1, "system_backgrounds"

    const/4 v9, 0x7

    aput-object v1, v0, v9

    const-string v1, "toolbar_text"

    const/16 v10, 0x8

    aput-object v1, v0, v10

    const-string v1, "background"

    const/16 v11, 0x9

    aput-object v1, v0, v11

    const-string v1, "cover_background"

    const/16 v12, 0xa

    aput-object v1, v0, v12

    const-string v1, "text1"

    const/16 v13, 0xb

    aput-object v1, v0, v13

    const-string v1, "text2"

    const/16 v14, 0xc

    aput-object v1, v0, v14

    const-string v1, "text3"

    const/16 v15, 0xd

    aput-object v1, v0, v15

    const-string v1, "gradient"

    const/16 v15, 0xe

    aput-object v1, v0, v15

    const/16 v1, 0xf

    const-string v16, "default_covers"

    aput-object v16, v0, v1

    const/16 v1, 0x10

    const-string v16, "system_audio"

    aput-object v16, v0, v1

    const/16 v1, 0x11

    const-string v16, "foreground"

    aput-object v16, v0, v1

    const/16 v1, 0x12

    const-string v16, "play_button"

    aput-object v16, v0, v1

    sput-object v0, Lcom/digdroid/alman/dig/s;->o0:[Ljava/lang/String;

    new-array v0, v13, [I

    fill-array-data v0, :array_1

    sput-object v0, Lcom/digdroid/alman/dig/s;->p0:[I

    new-array v0, v13, [Ljava/lang/String;

    const-string v1, "default"

    aput-object v1, v0, v2

    const-string v1, "home"

    aput-object v1, v0, v3

    const-string v1, "systems"

    aput-object v1, v0, v4

    const-string v1, "game"

    aput-object v1, v0, v5

    const-string v1, "gameinfo"

    aput-object v1, v0, v6

    const-string v1, "genres"

    aput-object v1, v0, v7

    const-string v1, "collections"

    aput-object v1, v0, v8

    const-string v1, "options"

    aput-object v1, v0, v9

    const-string v1, "gamepad"

    aput-object v1, v0, v10

    const-string v1, "editthemes"

    aput-object v1, v0, v11

    const-string v1, "webpage"

    aput-object v1, v0, v12

    sput-object v0, Lcom/digdroid/alman/dig/s;->q0:[Ljava/lang/String;

    new-array v0, v13, [[I

    new-array v1, v14, [I

    fill-array-data v1, :array_2

    aput-object v1, v0, v2

    new-array v1, v13, [I

    fill-array-data v1, :array_3

    aput-object v1, v0, v3

    const/16 v1, 0xd

    new-array v1, v1, [I

    fill-array-data v1, :array_4

    aput-object v1, v0, v4

    new-array v1, v15, [I

    fill-array-data v1, :array_5

    aput-object v1, v0, v5

    new-array v1, v14, [I

    fill-array-data v1, :array_6

    aput-object v1, v0, v6

    new-array v1, v12, [I

    fill-array-data v1, :array_7

    aput-object v1, v0, v7

    new-array v1, v12, [I

    fill-array-data v1, :array_8

    aput-object v1, v0, v8

    new-array v1, v11, [I

    fill-array-data v1, :array_9

    aput-object v1, v0, v9

    new-array v1, v11, [I

    fill-array-data v1, :array_a

    aput-object v1, v0, v10

    new-array v1, v11, [I

    fill-array-data v1, :array_b

    aput-object v1, v0, v11

    new-array v1, v4, [I

    fill-array-data v1, :array_c

    aput-object v1, v0, v12

    sput-object v0, Lcom/digdroid/alman/dig/s;->r0:[[I

    return-void

    :array_0
    .array-data 4
        0x7f1101bd
        0x7f1100b1
        0x7f1102a0
        0x7f1100b5
        0x7f1100b3
        0x7f110279
        0x7f11013d
        0x7f110261
        0x7f11027a
        0x7f110046
        0x7f11009d
        0x7f11026b
        0x7f11026c
        0x7f11026d
        0x7f11010d
        0x7f1100b8
        0x7f110260
        0x7f1100f1
        0x7f1101f0
    .end array-data

    :array_1
    .array-data 4
        0x7f1100bb
        0x7f11011a
        0x7f110267
        0x7f1100ff
        0x7f1100fa
        0x7f110107
        0x7f110071
        0x7f1101de
        0x7f1100fd
        0x7f110275
        0x7f110295
    .end array-data

    :array_2
    .array-data 4
        0x0
        0x1
        0x2
        0x3
        0x4
        0x11
        0x5
        0x8
        0x9
        0xb
        0xc
        0xd
    .end array-data

    :array_3
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x11
        0x6
        0x9
        0xb
        0xc
        0xd
        0xe
    .end array-data

    :array_4
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x11
        0x6
        0x7
        0x10
        0x9
        0xb
        0xc
        0xd
        0xe
    .end array-data

    :array_5
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x11
        0x7
        0x10
        0xf
        0x9
        0xa
        0xb
        0xc
        0xd
        0xe
    .end array-data

    :array_6
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x12
        0x11
        0x7
        0x10
        0x9
        0xb
        0xc
        0xd
    .end array-data

    :array_7
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x11
        0x9
        0xb
        0xc
        0xd
        0xe
    .end array-data

    :array_8
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x11
        0x9
        0xb
        0xc
        0xd
        0xe
    .end array-data

    :array_9
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x11
        0x9
        0xb
        0xc
        0xd
    .end array-data

    :array_a
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x11
        0x9
        0xb
        0xc
        0xd
    .end array-data

    :array_b
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x11
        0x9
        0xb
        0xc
        0xd
    .end array-data

    :array_c
    .array-data 4
        0x4
        0x9
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/digdroid/alman/dig/p1;-><init>()V

    const-string v0, "default"

    iput-object v0, p0, Lcom/digdroid/alman/dig/s;->y0:Ljava/lang/String;

    return-void
.end method

.method static synthetic g3(Lcom/digdroid/alman/dig/s;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/s;->k3()V

    return-void
.end method

.method static synthetic h3(Lcom/digdroid/alman/dig/s;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/s;->i3(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private i3(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/s;->y0:Ljava/lang/String;

    const-string v1, "default"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/s;->y0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private k3()V
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/digdroid/alman/dig/s;->u0:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    iget-object v3, p0, Lcom/digdroid/alman/dig/s;->u0:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/digdroid/alman/dig/s3;

    const-string v4, "name"

    invoke-virtual {v3, v4}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v2, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget v4, p0, Lcom/digdroid/alman/dig/s;->w0:I

    if-gez v4, :cond_0

    sget-object v4, Lcom/digdroid/alman/dig/q3;->b:Ljava/lang/String;

    iget-object v3, v3, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iput v2, p0, Lcom/digdroid/alman/dig/s;->w0:I

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget v2, p0, Lcom/digdroid/alman/dig/s;->w0:I

    if-gez v2, :cond_2

    iput v1, p0, Lcom/digdroid/alman/dig/s;->w0:I

    :cond_2
    iget-object v1, p0, Lcom/digdroid/alman/dig/s;->u0:Ljava/util/ArrayList;

    iget v2, p0, Lcom/digdroid/alman/dig/s;->w0:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/digdroid/alman/dig/s3;

    iput-object v1, p0, Lcom/digdroid/alman/dig/s;->v0:Lcom/digdroid/alman/dig/s3;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090374

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Spinner;

    new-instance v2, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v3

    const v4, 0x7f0c00eb

    invoke-direct {v2, v3, v4, v0}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const v0, 0x1090009

    invoke-virtual {v2, v0}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

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

.method public bridge synthetic K2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->K2()V

    return-void
.end method

.method public bridge synthetic N2()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->N2()Z

    move-result v0

    return v0
.end method

.method O2()V
    .locals 0

    return-void
.end method

.method public bridge synthetic P2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->P2()V

    return-void
.end method

.method public bridge synthetic Q2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->Q2()V

    return-void
.end method

.method public bridge synthetic R2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->R2()V

    return-void
.end method

.method public bridge synthetic S2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->S2()V

    return-void
.end method

.method public bridge synthetic T0(Landroid/content/Context;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->T0(Landroid/content/Context;)V

    return-void
.end method

.method public bridge synthetic T2(Lcom/digdroid/alman/dig/h0;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->T2(Lcom/digdroid/alman/dig/h0;)V

    return-void
.end method

.method public bridge synthetic U2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->U2()V

    return-void
.end method

.method public bridge synthetic W0(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->W0(Landroid/os/Bundle;)V

    return-void
.end method

.method public bridge synthetic W2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->W2()V

    return-void
.end method

.method public bridge synthetic X2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->X2(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic Y2(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->Y2(Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic Z0(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/digdroid/alman/dig/p1;->Z0(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    return-void
.end method

.method public a1(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    if-eqz p3, :cond_0

    const-string v0, "selected_theme"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/s;->w0:I

    const-string v0, "selected_type"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p3

    goto :goto_0

    :cond_0
    const/4 p3, -0x1

    iput p3, p0, Lcom/digdroid/alman/dig/s;->w0:I

    :goto_0
    iput p3, p0, Lcom/digdroid/alman/dig/s;->x0:I

    const p3, 0x7f0c0056

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic a3(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->a3(Z)V

    return-void
.end method

.method public bridge synthetic c3()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->c3()V

    return-void
.end method

.method public bridge synthetic d3()Z
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->d3()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic e3()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->e3()V

    return-void
.end method

.method j3(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/digdroid/alman/dig/s3;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-class v0, Lcom/digdroid/alman/dig/s;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/digdroid/alman/dig/s;->u0:Ljava/util/ArrayList;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget v0, p0, Lcom/digdroid/alman/dig/s;->w0:I

    if-ltz v0, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget v0, p0, Lcom/digdroid/alman/dig/s;->w0:I

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/s3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/s3;->Q()V

    :cond_1
    const v0, 0x7f1100d5

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/s;->X2(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0900ee

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v1, Lcom/digdroid/alman/dig/s$c;

    invoke-direct {v1, p0, p1}, Lcom/digdroid/alman/dig/s$c;-><init>(Lcom/digdroid/alman/dig/s;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0900b5

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v1, Lcom/digdroid/alman/dig/s$d;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/s$d;-><init>(Lcom/digdroid/alman/dig/s;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0902df

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v1, Lcom/digdroid/alman/dig/s$e;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/s$e;-><init>(Lcom/digdroid/alman/dig/s;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090142

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v1, Lcom/digdroid/alman/dig/s$f;

    invoke-direct {v1, p0, p1}, Lcom/digdroid/alman/dig/s$f;-><init>(Lcom/digdroid/alman/dig/s;Ljava/util/ArrayList;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0900fc

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/MyListView;

    iput-object v0, p0, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    new-instance v1, Lcom/digdroid/alman/dig/s$g;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/s$g;-><init>(Lcom/digdroid/alman/dig/s;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    new-instance v1, Lcom/digdroid/alman/dig/s$h;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/s$h;-><init>(Lcom/digdroid/alman/dig/s;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/s;->s0:Lcom/digdroid/alman/dig/MyListView;

    new-instance v1, Lcom/digdroid/alman/dig/s$i;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/s$i;-><init>(Lcom/digdroid/alman/dig/s;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setRecyclerListener(Landroid/widget/AbsListView$RecyclerListener;)V

    const-class v1, Lcom/digdroid/alman/dig/s;

    monitor-enter v1

    :try_start_1
    invoke-direct {p0}, Lcom/digdroid/alman/dig/s;->k3()V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090374

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090372

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Spinner;

    new-instance v2, Lcom/digdroid/alman/dig/s$j;

    invoke-direct {v2, p0, p1, v1}, Lcom/digdroid/alman/dig/s$j;-><init>(Lcom/digdroid/alman/dig/s;Ljava/util/ArrayList;Landroid/widget/Spinner;)V

    invoke-virtual {v0, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    sget-object v4, Lcom/digdroid/alman/dig/s;->p0:[I

    array-length v5, v4

    const/4 v6, 0x1

    if-ge v3, v5, :cond_2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    aget v7, v4, v3

    invoke-virtual {p0, v7}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v2, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v4, v4, v3

    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v3, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget v3, p0, Lcom/digdroid/alman/dig/s;->x0:I

    if-gez v3, :cond_3

    iput v2, p0, Lcom/digdroid/alman/dig/s;->x0:I

    :cond_3
    sget-object v2, Lcom/digdroid/alman/dig/s;->q0:[Ljava/lang/String;

    iget v3, p0, Lcom/digdroid/alman/dig/s;->x0:I

    aget-object v2, v2, v3

    iput-object v2, p0, Lcom/digdroid/alman/dig/s;->y0:Ljava/lang/String;

    new-instance v2, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v3

    const v4, 0x7f0c00eb

    invoke-direct {v2, v3, v4, p1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const p1, 0x1090009

    invoke-virtual {v2, p1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    new-instance p1, Lcom/digdroid/alman/dig/s$a;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/s$a;-><init>(Lcom/digdroid/alman/dig/s;)V

    invoke-virtual {v1, p1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    iget p1, p0, Lcom/digdroid/alman/dig/s;->w0:I

    invoke-virtual {v0, p1}, Landroid/widget/Spinner;->setSelection(I)V

    iput-boolean v6, p0, Lcom/digdroid/alman/dig/p1;->i0:Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public bridge synthetic k1(Landroid/view/MenuItem;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->k1(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public m1()V
    .locals 2

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->m1()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/s;->u0:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/digdroid/alman/dig/s;->w0:I

    if-ltz v1, :cond_0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/s;->u0:Ljava/util/ArrayList;

    iget v1, p0, Lcom/digdroid/alman/dig/s;->w0:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/s3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/s3;->T()V

    :cond_0
    return-void
.end method

.method public bridge synthetic q2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->q2()V

    return-void
.end method

.method public r1()V
    .locals 2

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->r1()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/MainActivity;

    new-instance v1, Lcom/digdroid/alman/dig/s$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/s$b;-><init>(Lcom/digdroid/alman/dig/s;)V

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/q3;->j(Lcom/digdroid/alman/dig/c4;Lcom/digdroid/alman/dig/q3$e;)V

    return-void
.end method

.method public s1(Landroid/os/Bundle;)V
    .locals 2

    iget v0, p0, Lcom/digdroid/alman/dig/s;->w0:I

    const-string v1, "selected_theme"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v0, p0, Lcom/digdroid/alman/dig/s;->x0:I

    const-string v1, "selected_type"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->s1(Landroid/os/Bundle;)V

    return-void
.end method

.method public bridge synthetic s2()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->s2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic t1()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->t1()V

    return-void
.end method

.method public t2()Ljava/lang/String;
    .locals 1

    const-string v0, "editthemes"

    return-object v0
.end method

.method public bridge synthetic u2()J
    .locals 2

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->u2()J

    move-result-wide v0

    return-wide v0
.end method

.method public bridge synthetic v2()Lcom/digdroid/alman/dig/t3;
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->v2()Lcom/digdroid/alman/dig/t3;

    move-result-object v0

    return-object v0
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

.method z2(Landroid/content/Intent;)V
    .locals 0

    return-void
.end method
