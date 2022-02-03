.class public Lcom/digdroid/alman/dig/x1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/x1$c;
    }
.end annotation


# static fields
.field private static final a:[[Ljava/lang/String;


# instance fields
.field final b:I

.field final c:I

.field final d:I

.field final e:I

.field f:Landroid/app/Activity;

.field g:Ljava/lang/String;

.field h:Ljava/lang/String;

.field i:Ljava/lang/String;

.field j:Ljava/lang/String;

.field k:Z

.field l:Ljava/lang/String;

.field m:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    const/16 v0, 0x29

    new-array v0, v0, [[Ljava/lang/String;

    const/4 v1, 0x5

    new-array v2, v1, [Ljava/lang/String;

    const-string v3, "intellivision"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "intv.xml"

    const/4 v5, 0x1

    aput-object v3, v2, v5

    const-string v3, "intv"

    const/4 v6, 0x2

    aput-object v3, v2, v6

    const/4 v3, 0x3

    const-string v7, "rom"

    aput-object v7, v2, v3

    const/4 v8, 0x4

    const/4 v9, 0x0

    aput-object v9, v2, v8

    aput-object v2, v0, v4

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "vic20"

    aput-object v10, v2, v4

    const-string v10, "vic1001_cart.xml"

    aput-object v10, v2, v5

    const-string v10, "vic1001"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    aput-object v2, v0, v5

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "atari5200"

    aput-object v10, v2, v4

    const-string v10, "a5200.xml"

    aput-object v10, v2, v5

    const-string v10, "a5200"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    aput-object v2, v0, v6

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "astrocade"

    aput-object v10, v2, v4

    const-string v10, "astrocde.xml"

    aput-object v10, v2, v5

    const-string v10, "astrocde"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    aput-object v2, v0, v3

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "ti99"

    aput-object v10, v2, v4

    const-string v10, "ti99_cart.xml"

    aput-object v10, v2, v5

    const-string v10, "ti99_4a"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    aput-object v2, v0, v8

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "odyssey2"

    aput-object v10, v2, v4

    const-string v11, "odyssey2.xml"

    aput-object v11, v2, v5

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    aput-object v2, v0, v1

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "channelf"

    aput-object v10, v2, v4

    const-string v11, "channelf.xml"

    aput-object v11, v2, v5

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/4 v10, 0x6

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "studio2"

    aput-object v10, v2, v4

    const-string v11, "studio2.xml"

    aput-object v11, v2, v5

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/4 v10, 0x7

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "apfm1000"

    aput-object v10, v2, v4

    const-string v11, "apfm1000.xml"

    aput-object v11, v2, v5

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x8

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "vc4000"

    aput-object v10, v2, v4

    const-string v11, "vc4000.xml"

    aput-object v11, v2, v5

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x9

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "crvision"

    aput-object v10, v2, v4

    const-string v11, "crvision.xml"

    aput-object v11, v2, v5

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0xa

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "arcadia"

    aput-object v10, v2, v4

    const-string v11, "arcadia.xml"

    aput-object v11, v2, v5

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0xb

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "pv1000"

    aput-object v10, v2, v4

    const-string v11, "pv1000.xml"

    aput-object v11, v2, v5

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0xc

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "scvision"

    aput-object v10, v2, v4

    const-string v10, "scv.xml"

    aput-object v10, v2, v5

    const-string v10, "scv"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0xd

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "gx4000"

    aput-object v10, v2, v4

    const-string v10, "gx4000.xml"

    aput-object v10, v2, v5

    const-string v10, "gx4000"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0xe

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "atarixegs"

    aput-object v10, v2, v4

    const-string v10, "xegs.xml"

    aput-object v10, v2, v5

    const-string v10, "xegs"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0xf

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "coco"

    aput-object v10, v2, v4

    const-string v11, "coco_cart.xml"

    aput-object v11, v2, v5

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    const-string v12, "Color Computer"

    aput-object v12, v2, v8

    const/16 v12, 0x10

    aput-object v2, v0, v12

    new-array v2, v1, [Ljava/lang/String;

    aput-object v10, v2, v4

    aput-object v11, v2, v5

    const-string v12, "coco2"

    aput-object v12, v2, v6

    aput-object v7, v2, v3

    const-string v12, "Color Computer 2"

    aput-object v12, v2, v8

    const/16 v12, 0x11

    aput-object v2, v0, v12

    new-array v2, v1, [Ljava/lang/String;

    aput-object v10, v2, v4

    aput-object v11, v2, v5

    const-string v12, "coco3"

    aput-object v12, v2, v6

    aput-object v7, v2, v3

    const-string v12, "Color Computer 3"

    aput-object v12, v2, v8

    const/16 v12, 0x12

    aput-object v2, v0, v12

    new-array v2, v1, [Ljava/lang/String;

    aput-object v10, v2, v4

    aput-object v11, v2, v5

    const-string v10, "dragon32"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    const-string v10, "Dragon 32"

    aput-object v10, v2, v8

    const/16 v10, 0x13

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "cdi"

    aput-object v10, v2, v4

    const-string v10, "cdi.xml"

    aput-object v10, v2, v5

    const-string v10, "cdimono1"

    aput-object v10, v2, v6

    const-string v10, "chd"

    aput-object v10, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x14

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "ngcd"

    aput-object v10, v2, v4

    const-string v10, "neocd.xml"

    aput-object v10, v2, v5

    const-string v10, "neocdz"

    aput-object v10, v2, v6

    const-string v10, "chd"

    aput-object v10, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x15

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "adam"

    aput-object v10, v2, v4

    const-string v10, "adam_flop.xml"

    aput-object v10, v2, v5

    const-string v10, "adam"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x16

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "sv8000"

    aput-object v10, v2, v4

    const-string v10, "sv8000.xml"

    aput-object v10, v2, v5

    const-string v10, "sv8000"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x17

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "tutor"

    aput-object v10, v2, v4

    const-string v11, "tutor.xml"

    aput-object v11, v2, v5

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    const-string v12, "Tomy Tutor"

    aput-object v12, v2, v8

    const/16 v12, 0x18

    aput-object v2, v0, v12

    new-array v2, v1, [Ljava/lang/String;

    aput-object v10, v2, v4

    aput-object v11, v2, v5

    const-string v12, "pyuuta"

    aput-object v12, v2, v6

    aput-object v7, v2, v3

    const-string v12, "Tomy Pyuuta"

    aput-object v12, v2, v8

    const/16 v12, 0x19

    aput-object v2, v0, v12

    new-array v2, v1, [Ljava/lang/String;

    aput-object v10, v2, v4

    aput-object v11, v2, v5

    const-string v10, "pyuutajr"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    const-string v10, "Tomy Pyuuta Jr."

    aput-object v10, v2, v8

    const/16 v10, 0x1a

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "gpc"

    aput-object v10, v2, v4

    const-string v10, "gamepock.xml"

    aput-object v10, v2, v5

    const-string v10, "gamepock"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x1b

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "gamate"

    aput-object v10, v2, v4

    const-string v10, "gamate.xml"

    aput-object v10, v2, v5

    const-string v10, "gamate"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x1c

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "svision"

    aput-object v10, v2, v4

    const-string v10, "svision.xml"

    aput-object v10, v2, v5

    const-string v10, "svision"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x1d

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "megaduck"

    aput-object v10, v2, v4

    const-string v10, "megaduck.xml"

    aput-object v10, v2, v5

    const-string v10, "megaduck"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x1e

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "gamecom"

    aput-object v10, v2, v4

    const-string v10, "gamecom.xml"

    aput-object v10, v2, v5

    const-string v10, "gamecom"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x1f

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "loopy"

    aput-object v10, v2, v4

    const-string v10, "casloopy.xml"

    aput-object v10, v2, v5

    const-string v10, "casloopy"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x20

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "advision"

    aput-object v10, v2, v4

    const-string v10, "advision.xml"

    aput-object v10, v2, v5

    const-string v10, "advision"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x21

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "supracan"

    aput-object v10, v2, v4

    const-string v10, "supracan.xml"

    aput-object v10, v2, v5

    const-string v10, "supracan"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x22

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "gp32"

    aput-object v10, v2, v4

    const-string v10, "gp32.xml"

    aput-object v10, v2, v5

    const-string v10, "gp32"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v10, 0x23

    aput-object v2, v0, v10

    new-array v2, v1, [Ljava/lang/String;

    const-string v10, "gmaster"

    aput-object v10, v2, v4

    const-string v10, "gmaster.xml"

    aput-object v10, v2, v5

    const-string v10, "gmaster"

    aput-object v10, v2, v6

    aput-object v7, v2, v3

    aput-object v9, v2, v8

    const/16 v9, 0x24

    aput-object v2, v0, v9

    new-array v2, v1, [Ljava/lang/String;

    const-string v9, "apple2"

    aput-object v9, v2, v4

    const-string v10, "apple2.xml"

    aput-object v10, v2, v5

    aput-object v9, v2, v6

    aput-object v7, v2, v3

    const-string v11, "Apple II"

    aput-object v11, v2, v8

    const/16 v11, 0x25

    aput-object v2, v0, v11

    new-array v2, v1, [Ljava/lang/String;

    aput-object v9, v2, v4

    aput-object v10, v2, v5

    const-string v11, "apple2c"

    aput-object v11, v2, v6

    aput-object v7, v2, v3

    const-string v11, "Apple IIc"

    aput-object v11, v2, v8

    const/16 v11, 0x26

    aput-object v2, v0, v11

    new-array v2, v1, [Ljava/lang/String;

    aput-object v9, v2, v4

    aput-object v10, v2, v5

    const-string v11, "apple2e"

    aput-object v11, v2, v6

    aput-object v7, v2, v3

    const-string v11, "Apple IIe"

    aput-object v11, v2, v8

    const/16 v11, 0x27

    aput-object v2, v0, v11

    new-array v1, v1, [Ljava/lang/String;

    aput-object v9, v1, v4

    aput-object v10, v1, v5

    const-string v2, "apple2gs"

    aput-object v2, v1, v6

    aput-object v7, v1, v3

    const-string v2, "Apple IIgs"

    aput-object v2, v1, v8

    const/16 v2, 0x28

    aput-object v1, v0, v2

    sput-object v0, Lcom/digdroid/alman/dig/x1;->a:[[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/digdroid/alman/dig/x1;->b:I

    const/4 v1, 0x1

    iput v1, p0, Lcom/digdroid/alman/dig/x1;->c:I

    const/4 v1, 0x2

    iput v1, p0, Lcom/digdroid/alman/dig/x1;->d:I

    const/4 v1, 0x3

    iput v1, p0, Lcom/digdroid/alman/dig/x1;->e:I

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/x1;->k:Z

    iput-object p1, p0, Lcom/digdroid/alman/dig/x1;->f:Landroid/app/Activity;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/x1$c;)V
    .locals 8

    iget-object v0, p0, Lcom/digdroid/alman/dig/x1;->f:Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    const-string v0, "(mess 2015)"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p2, "/MESS2015"

    :goto_0
    iput-object p2, p0, Lcom/digdroid/alman/dig/x1;->g:Ljava/lang/String;

    goto :goto_2

    :cond_1
    const-string v0, "(mess 2014)"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "(mess)"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "(mame 2016)"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p2, "/MAME2016"

    goto :goto_0

    :cond_3
    const-string v0, "(mame)"

    invoke-virtual {p2, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_4

    const-string p2, "/MAME"

    goto :goto_0

    :cond_4
    invoke-interface {p4}, Lcom/digdroid/alman/dig/x1$c;->b()V

    return-void

    :cond_5
    :goto_1
    const-string p2, "/MESS2014"

    goto :goto_0

    :goto_2
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 p2, 0x0

    const/4 v0, 0x0

    :goto_3
    sget-object v1, Lcom/digdroid/alman/dig/x1;->a:[[Ljava/lang/String;

    array-length v3, v1

    if-ge v0, v3, :cond_7

    aget-object v3, v1, v0

    aget-object v3, v3, p2

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    aget-object v1, v1, v0

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_8

    invoke-interface {p4}, Lcom/digdroid/alman/dig/x1$c;->b()V

    return-void

    :cond_8
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_9

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p0, p2, p1, p3, p4}, Lcom/digdroid/alman/dig/x1;->b([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/x1$c;)V

    return-void

    :cond_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v6, v0, [Ljava/lang/CharSequence;

    :goto_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p2, v0, :cond_a

    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    aput-object v0, v6, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_4

    :cond_a
    new-instance p2, Landroidx/appcompat/app/b$a;

    iget-object v0, p0, Lcom/digdroid/alman/dig/x1;->f:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {p2, v0, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v0, 0x7f110235

    invoke-virtual {p2, v0}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    move-result-object p2

    new-instance v7, Lcom/digdroid/alman/dig/x1$a;

    move-object v0, v7

    move-object v1, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/digdroid/alman/dig/x1$a;-><init>(Lcom/digdroid/alman/dig/x1;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/x1$c;)V

    invoke-virtual {p2, v6, v7}, Landroidx/appcompat/app/b$a;->g([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public b([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/x1$c;)V
    .locals 1

    const/4 v0, 0x1

    aget-object v0, p1, v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/x1;->i:Ljava/lang/String;

    const/4 v0, 0x2

    aget-object v0, p1, v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/x1;->j:Ljava/lang/String;

    const/4 v0, 0x3

    aget-object p1, p1, v0

    const-string v0, "chd"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/x1;->k:Z

    new-instance p1, Lcom/digdroid/alman/dig/x1$b;

    invoke-direct {p1, p0, p2, p3, p4}, Lcom/digdroid/alman/dig/x1$b;-><init>(Lcom/digdroid/alman/dig/x1;Ljava/lang/String;Ljava/lang/String;Lcom/digdroid/alman/dig/x1$c;)V

    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/Void;

    invoke-virtual {p1, p2, p3}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-void
.end method

.method c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/x1;->f:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MESS/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    new-instance p2, Ljava/io/FileOutputStream;

    invoke-direct {p2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v1, 0x400

    new-array v1, v1, [B

    :goto_0
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    if-lez v2, :cond_0

    invoke-virtual {p2, v1, v0, v2}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    invoke-virtual {p2}, Ljava/io/FileOutputStream;->flush()V

    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :catch_0
    return v0
.end method

.method d(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 13

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT g._id,s.slug FROM games as g,slugs as s,titles as t,systems as sys WHERE sys.slug=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' AND t.title=\'BIOS\' AND t.system=sys._id AND g._id=t.rowid AND s.gameid=t.rowid"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_7

    :cond_0
    const/4 v1, 0x0

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    iget-object v4, p0, Lcom/digdroid/alman/dig/x1;->f:Landroid/app/Activity;

    invoke-static {v4}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object v4

    invoke-virtual {v4}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SELECT r.filename,p.path FROM roms as r,rompaths as p WHERE r.mdbid="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " AND r.present=1 AND p._id=r.pathid"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3

    if-eqz v3, :cond_6

    const/4 v3, 0x0

    :cond_1
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v6, 0x1

    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "/"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Lcom/digdroid/alman/dig/e4;->c(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    move-result v8

    if-nez v8, :cond_2

    goto/16 :goto_1

    :cond_2
    new-instance v8, Lcom/digdroid/alman/dig/e4;

    invoke-direct {v8, v5}, Lcom/digdroid/alman/dig/e4;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v8}, Lcom/digdroid/alman/dig/e4;->d()Lcom/digdroid/alman/dig/e4$a;

    move-result-object v9

    if-eqz v9, :cond_5

    if-nez v3, :cond_5

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "SELECT rowid FROM mess WHERE rowid="

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v11, v9, Lcom/digdroid/alman/dig/e4$a;->c:J

    invoke-virtual {v10, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v9, " AND slug=\'"

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, p0, Lcom/digdroid/alman/dig/x1;->j:Ljava/lang/String;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "\'"

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {p2, v9, v0}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v10

    if-eqz v10, :cond_4

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v11, p0, Lcom/digdroid/alman/dig/x1;->h:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, p0, Lcom/digdroid/alman/dig/x1;->j:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const/16 v11, 0x2e

    invoke-virtual {v4, v11}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v12

    if-lez v12, :cond_3

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v10

    invoke-virtual {v4, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    :cond_3
    invoke-virtual {v5, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-nez v11, :cond_4

    invoke-static {v5, v10}, Lcom/digdroid/alman/dig/y3;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x1

    :cond_4
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_5
    :goto_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_6

    if-eqz v3, :cond_1

    :cond_6
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_0

    :cond_7
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-void
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)I
    .locals 11

    iget-object v0, p0, Lcom/digdroid/alman/dig/x1;->f:Landroid/app/Activity;

    invoke-static {v0}, Lcom/digdroid/alman/dig/z1;->b(Landroid/content/Context;)Lcom/digdroid/alman/dig/z1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z1;->c()Z

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z1;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-static {p2}, Lcom/digdroid/alman/dig/y3;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    return v2

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SELECT slug,name FROM chuds WHERE sha1=x\'"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return v2

    :cond_1
    const/4 v4, 0x0

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ".chd"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const-string v6, ".zip"

    const-string v8, "/"

    if-eqz p2, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p2

    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    iget-object v9, p0, Lcom/digdroid/alman/dig/x1;->j:Ljava/lang/String;

    invoke-virtual {v1, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v10

    if-nez v10, :cond_2

    :try_start_0
    invoke-virtual {v9}, Ljava/io/File;->createNewFile()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_2
    :goto_0
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/x1;->h:Ljava/lang/String;

    move-object v3, v1

    :cond_3
    if-nez v3, :cond_7

    new-instance p2, Ljava/io/File;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/digdroid/alman/dig/x1;->h:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_4

    :try_start_1
    invoke-virtual {p2}, Ljava/io/File;->mkdirs()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    nop

    :cond_4
    :goto_1
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p2

    if-nez p2, :cond_5

    return v4

    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/x1;->h:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance p2, Ljava/io/File;

    invoke-direct {p2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_6

    :try_start_2
    invoke-virtual {p2}, Ljava/io/File;->createNewFile()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    nop

    :cond_6
    :goto_2
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    move-result p2

    if-nez p2, :cond_7

    return v4

    :cond_7
    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/x1;->d(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)V

    iput-object v3, p0, Lcom/digdroid/alman/dig/x1;->l:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p2, p0, Lcom/digdroid/alman/dig/x1;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/x1;->m:Ljava/lang/String;

    new-instance p1, Ljava/io/File;

    iget-object p2, p0, Lcom/digdroid/alman/dig/x1;->m:Ljava/lang/String;

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_8

    const/4 p1, 0x2

    goto :goto_3

    :cond_8
    const/4 p1, 0x3

    :goto_3
    return p1
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;)I
    .locals 8

    iget-object v0, p0, Lcom/digdroid/alman/dig/x1;->f:Landroid/app/Activity;

    invoke-static {v0}, Lcom/digdroid/alman/dig/z1;->b(Landroid/content/Context;)Lcom/digdroid/alman/dig/z1;

    move-result-object v0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z1;->c()Z

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/z1;->a()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-static {p2}, Lcom/digdroid/alman/dig/e4;->c(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    :try_start_0
    new-instance v1, Lcom/digdroid/alman/dig/e4;

    invoke-direct {v1, p2}, Lcom/digdroid/alman/dig/e4;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-object v3, v2

    :goto_0
    :try_start_1
    invoke-virtual {v1}, Lcom/digdroid/alman/dig/e4;->d()Lcom/digdroid/alman/dig/e4$a;

    move-result-object v4

    if-eqz v4, :cond_1

    if-nez v3, :cond_1

    iget-wide v4, v4, Lcom/digdroid/alman/dig/e4$a;->c:J

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "SELECT slug FROM mess WHERE rowid="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x0

    invoke-interface {v4, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    :cond_0
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lcom/digdroid/alman/dig/e4;->a()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_1

    :catch_1
    move-object v1, v2

    move-object v3, v1

    :goto_1
    if-eqz v3, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "."

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/e4;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :cond_2
    if-nez v2, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/x1;->h:Ljava/lang/String;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/x1;->d(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase;)V

    iput-object p2, p0, Lcom/digdroid/alman/dig/x1;->l:Ljava/lang/String;

    iput-object p2, p0, Lcom/digdroid/alman/dig/x1;->m:Ljava/lang/String;

    new-instance p1, Ljava/io/File;

    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_4

    const/4 p1, 0x2

    goto :goto_2

    :cond_4
    const/4 p1, 0x3

    :goto_2
    return p1
.end method

.method public g(Ljava/lang/String;)Z
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v1, ""

    const/16 v2, 0x1e

    if-ge v0, v2, :cond_0

    new-instance v0, Lcom/digdroid/alman/dig/x2;

    iget-object v2, p0, Lcom/digdroid/alman/dig/x1;->f:Landroid/app/Activity;

    invoke-direct {v0, v2}, Lcom/digdroid/alman/dig/x2;-><init>(Landroid/content/Context;)V

    const-string v2, "system_directory"

    invoke-virtual {v0, v2}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/x1;->f:Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v2, "Android.*"

    const-string v3, "RetroArch/system"

    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    return v2

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/x1;->g:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/x1;->g:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/x1;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/hash"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_3

    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    return v2

    :cond_3
    :goto_1
    iget-object v1, p0, Lcom/digdroid/alman/dig/x1;->i:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/digdroid/alman/dig/x1;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    const-string v1, "apple2"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    const-string p1, "apple2_cass.xml"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/x1;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    const-string p1, "apple2_flop_clcracked.xml"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/x1;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    const-string p1, "apple2_flop_misc.xml"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/x1;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    const-string p1, "apple2_flop_orig.xml"

    invoke-virtual {p0, v0, p1}, Lcom/digdroid/alman/dig/x1;->c(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    new-instance p1, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/x1;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/roms/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/x1;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_9

    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    return v2

    :cond_9
    :goto_2
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/x1;->h:Ljava/lang/String;

    const/4 p1, 0x1

    return p1
.end method
