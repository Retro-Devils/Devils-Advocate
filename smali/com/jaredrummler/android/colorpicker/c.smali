.class public Lcom/jaredrummler/android/colorpicker/c;
.super Landroid/app/DialogFragment;
.source ""

# interfaces
.implements Landroid/view/View$OnTouchListener;
.implements Lcom/jaredrummler/android/colorpicker/ColorPickerView$c;
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jaredrummler/android/colorpicker/c$j;
    }
.end annotation


# static fields
.field public static final b:[I


# instance fields
.field c:Lcom/jaredrummler/android/colorpicker/d;

.field d:Landroid/widget/FrameLayout;

.field e:[I

.field f:I

.field g:I

.field h:I

.field i:Z

.field j:I

.field k:Lcom/jaredrummler/android/colorpicker/b;

.field l:Landroid/widget/LinearLayout;

.field m:Landroid/widget/SeekBar;

.field n:Landroid/widget/TextView;

.field private o:I

.field p:Lcom/jaredrummler/android/colorpicker/ColorPickerView;

.field q:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

.field r:Landroid/widget/EditText;

.field s:Z

.field private t:Z

.field private u:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x13

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/jaredrummler/android/colorpicker/c;->b:[I

    return-void

    :array_0
    .array-data 4
        -0xbbcca
        -0x16e19d
        -0xd36d
        -0x63d850
        -0x98c549
        -0xc0ae4b
        -0xde690d
        -0xfc560c
        -0xff432c
        -0xff6978
        -0xb350b0
        -0x743cb6
        -0x3223c7
        -0x14c5
        -0x3ef9
        -0x6800
        -0x86aab8
        -0x9f8275
        -0x616162
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    return-void
.end method

.method static synthetic b(Lcom/jaredrummler/android/colorpicker/c;)I
    .locals 0

    iget p0, p0, Lcom/jaredrummler/android/colorpicker/c;->u:I

    return p0
.end method

.method static synthetic c(Lcom/jaredrummler/android/colorpicker/c;)I
    .locals 0

    iget p0, p0, Lcom/jaredrummler/android/colorpicker/c;->o:I

    return p0
.end method

.method private g(I)[I
    .locals 3

    const/16 v0, 0xc

    new-array v0, v0, [I

    const-wide v1, 0x3feccccccccccccdL    # 0.9

    invoke-direct {p0, p1, v1, v2}, Lcom/jaredrummler/android/colorpicker/c;->o(ID)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    const-wide v1, 0x3fe6666666666666L    # 0.7

    invoke-direct {p0, p1, v1, v2}, Lcom/jaredrummler/android/colorpicker/c;->o(ID)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    invoke-direct {p0, p1, v1, v2}, Lcom/jaredrummler/android/colorpicker/c;->o(ID)I

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    const-wide v1, 0x3fd54fdf3b645a1dL    # 0.333

    invoke-direct {p0, p1, v1, v2}, Lcom/jaredrummler/android/colorpicker/c;->o(ID)I

    move-result v1

    const/4 v2, 0x3

    aput v1, v0, v2

    const-wide v1, 0x3fc53f7ced916873L    # 0.166

    invoke-direct {p0, p1, v1, v2}, Lcom/jaredrummler/android/colorpicker/c;->o(ID)I

    move-result v1

    const/4 v2, 0x4

    aput v1, v0, v2

    const-wide/high16 v1, -0x4040000000000000L    # -0.125

    invoke-direct {p0, p1, v1, v2}, Lcom/jaredrummler/android/colorpicker/c;->o(ID)I

    move-result v1

    const/4 v2, 0x5

    aput v1, v0, v2

    const-wide/high16 v1, -0x4030000000000000L    # -0.25

    invoke-direct {p0, p1, v1, v2}, Lcom/jaredrummler/android/colorpicker/c;->o(ID)I

    move-result v1

    const/4 v2, 0x6

    aput v1, v0, v2

    const-wide/high16 v1, -0x4028000000000000L    # -0.375

    invoke-direct {p0, p1, v1, v2}, Lcom/jaredrummler/android/colorpicker/c;->o(ID)I

    move-result v1

    const/4 v2, 0x7

    aput v1, v0, v2

    const-wide/high16 v1, -0x4020000000000000L    # -0.5

    invoke-direct {p0, p1, v1, v2}, Lcom/jaredrummler/android/colorpicker/c;->o(ID)I

    move-result v1

    const/16 v2, 0x8

    aput v1, v0, v2

    const-wide v1, -0x401a666666666666L    # -0.675

    invoke-direct {p0, p1, v1, v2}, Lcom/jaredrummler/android/colorpicker/c;->o(ID)I

    move-result v1

    const/16 v2, 0x9

    aput v1, v0, v2

    const-wide v1, -0x401999999999999aL    # -0.7

    invoke-direct {p0, p1, v1, v2}, Lcom/jaredrummler/android/colorpicker/c;->o(ID)I

    move-result v1

    const/16 v2, 0xa

    aput v1, v0, v2

    const-wide v1, -0x4017333333333333L    # -0.775

    invoke-direct {p0, p1, v1, v2}, Lcom/jaredrummler/android/colorpicker/c;->o(ID)I

    move-result p1

    const/16 v1, 0xb

    aput p1, v0, v1

    return-object v0
.end method

.method private h()I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->e:[I

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget v1, v1, v0

    iget v2, p0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    return v0
.end method

.method private i()V
    .locals 8

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "presets"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v1

    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->e:[I

    if-nez v1, :cond_0

    sget-object v1, Lcom/jaredrummler/android/colorpicker/c;->b:[I

    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->e:[I

    :cond_0
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->e:[I

    sget-object v2, Lcom/jaredrummler/android/colorpicker/c;->b:[I

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    array-length v4, v1

    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->e:[I

    const/16 v1, 0xff

    if-eq v0, v1, :cond_2

    const/4 v1, 0x0

    :goto_1
    iget-object v4, p0, Lcom/jaredrummler/android/colorpicker/c;->e:[I

    array-length v5, v4

    if-ge v1, v5, :cond_2

    aget v4, v4, v1

    invoke-static {v4}, Landroid/graphics/Color;->red(I)I

    move-result v5

    invoke-static {v4}, Landroid/graphics/Color;->green(I)I

    move-result v6

    invoke-static {v4}, Landroid/graphics/Color;->blue(I)I

    move-result v4

    iget-object v7, p0, Lcom/jaredrummler/android/colorpicker/c;->e:[I

    invoke-static {v0, v5, v6, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    aput v4, v7, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->e:[I

    iget v4, p0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    invoke-direct {p0, v1, v4}, Lcom/jaredrummler/android/colorpicker/c;->p([II)[I

    move-result-object v1

    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->e:[I

    if-eqz v2, :cond_3

    array-length v2, v1

    const/16 v4, 0x13

    if-ne v2, v4, :cond_3

    invoke-static {v0, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-direct {p0, v1, v0}, Lcom/jaredrummler/android/colorpicker/c;->l([II)[I

    move-result-object v0

    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/c;->e:[I

    :cond_3
    return-void
.end method

.method public static j()Lcom/jaredrummler/android/colorpicker/c$j;
    .locals 1

    new-instance v0, Lcom/jaredrummler/android/colorpicker/c$j;

    invoke-direct {v0}, Lcom/jaredrummler/android/colorpicker/c$j;-><init>()V

    return-object v0
.end method

.method private k(Ljava/lang/String;)I
    .locals 11

    const-string v0, "#"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v2, -0x1

    const/16 v3, 0xff

    const/4 v4, 0x0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    :goto_1
    const/16 v2, 0xff

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v5, 0x2

    const/16 v6, 0x10

    if-gt v0, v5, :cond_2

    invoke-static {p1, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    move p1, v2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v7, 0x3

    if-ne v0, v7, :cond_3

    invoke-virtual {p1, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p1, v1, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1, v5, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :goto_2
    invoke-static {p1, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p1

    move v4, v2

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v8, 0x4

    if-ne v0, v8, :cond_4

    invoke-virtual {p1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p1, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p1

    move v0, v2

    goto :goto_1

    :cond_4
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v9, 0x5

    if-ne v0, v9, :cond_5

    invoke-virtual {p1, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p1, v1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1, v7, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v10, 0x6

    if-ne v0, v10, :cond_6

    invoke-virtual {p1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p1, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1, v8, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v3, 0x7

    if-ne v0, v3, :cond_7

    invoke-virtual {p1, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p1, v1, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1, v7, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {p1, v9, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p1

    move v4, v0

    move v0, v1

    goto :goto_3

    :cond_7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_8

    invoke-virtual {p1, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {p1, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p1, v8, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {p1, v10, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p1

    move v4, v0

    move v0, v3

    goto :goto_3

    :cond_8
    const/4 p1, -0x1

    const/4 v0, -0x1

    const/4 v4, -0x1

    :goto_3
    invoke-static {v2, v4, v0, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1
.end method

.method private l([II)[I
    .locals 5

    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_1

    aget v4, p1, v2

    if-ne v4, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    array-length v0, p1

    add-int/2addr v0, v3

    new-array v2, v0, [I

    sub-int/2addr v0, v3

    aput p2, v2, v0

    invoke-static {p1, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2

    :cond_2
    return-object p1
.end method

.method private m(I)V
    .locals 4

    iget-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/c;->s:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c;->r:Landroid/widget/EditText;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v1

    const-string p1, "%08X"

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c;->r:Landroid/widget/EditText;

    new-array v2, v2, [Ljava/lang/Object;

    const v3, 0xffffff

    and-int/2addr p1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v1

    const-string p1, "%06X"

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private n()V
    .locals 5

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    const/16 v1, 0xff

    rsub-int v0, v0, 0xff

    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/c;->m:Landroid/widget/SeekBar;

    invoke-virtual {v2, v1}, Landroid/widget/SeekBar;->setMax(I)V

    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->m:Landroid/widget/SeekBar;

    invoke-virtual {v1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    int-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v0, v0, v2

    const-wide v2, 0x406fe00000000000L    # 255.0

    div-double/2addr v0, v2

    double-to-int v0, v0

    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->n:Landroid/widget/TextView;

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const-string v0, "%d%%"

    invoke-static {v2, v0, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c;->m:Landroid/widget/SeekBar;

    new-instance v1, Lcom/jaredrummler/android/colorpicker/c$i;

    invoke-direct {v1, p0}, Lcom/jaredrummler/android/colorpicker/c$i;-><init>(Lcom/jaredrummler/android/colorpicker/c;)V

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    return-void
.end method

.method private o(ID)I
    .locals 10

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const v2, 0xffffff

    and-int/2addr v2, p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "#%06X"

    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmpg-double v0, p2, v4

    if-gez v0, :cond_0

    move-wide v6, v4

    goto :goto_0

    :cond_0
    const-wide v6, 0x406fe00000000000L    # 255.0

    :goto_0
    cmpg-double v0, p2, v4

    if-gez v0, :cond_1

    const-wide/high16 v4, -0x4010000000000000L    # -1.0

    mul-double p2, p2, v4

    :cond_1
    shr-long v0, v2, v1

    const/16 v4, 0x8

    shr-long v4, v2, v4

    const-wide/16 v8, 0xff

    and-long/2addr v4, v8

    and-long/2addr v2, v8

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    long-to-double v8, v0

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v8, v6, v8

    mul-double v8, v8, p2

    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    move-result-wide v8

    add-long/2addr v8, v0

    long-to-int v0, v8

    long-to-double v8, v4

    invoke-static {v8, v9}, Ljava/lang/Double;->isNaN(D)Z

    sub-double v8, v6, v8

    mul-double v8, v8, p2

    invoke-static {v8, v9}, Ljava/lang/Math;->round(D)J

    move-result-wide v8

    add-long/2addr v8, v4

    long-to-int v1, v8

    long-to-double v4, v2

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    sub-double/2addr v6, v4

    mul-double v6, v6, p2

    invoke-static {v6, v7}, Ljava/lang/Math;->round(D)J

    move-result-wide p2

    add-long/2addr p2, v2

    long-to-int p3, p2

    invoke-static {p1, v0, v1, p3}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1
.end method

.method private p([II)[I
    .locals 5

    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    if-ge v2, v0, :cond_1

    aget v4, p1, v2

    if-ne v4, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    array-length v0, p1

    add-int/2addr v0, v3

    new-array v2, v0, [I

    aput p2, v2, v1

    sub-int/2addr v0, v3

    invoke-static {p1, v1, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2

    :cond_2
    return-object p1
.end method


# virtual methods
.method public a(I)V
    .locals 2

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c;->q:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    invoke-virtual {v0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    iget-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/c;->t:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-direct {p0, p1}, Lcom/jaredrummler/android/colorpicker/c;->m(I)V

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/c;->r:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->hasFocus()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    const-string v0, "input_method"

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c;->r:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object v0

    invoke-virtual {p1, v0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/c;->r:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->clearFocus()V

    :cond_0
    iput-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/c;->t:Z

    return-void
.end method

.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c;->r:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/jaredrummler/android/colorpicker/c;->k(Ljava/lang/String;)I

    move-result p1

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView;

    invoke-virtual {v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getColor()I

    move-result v0

    if-eq p1, v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/c;->t:Z

    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView;

    invoke-virtual {v1, p1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->n(IZ)V

    :cond_0
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method d(I)V
    .locals 8

    invoke-direct {p0, p1}, Lcom/jaredrummler/android/colorpicker/c;->g(I)[I

    move-result-object p1

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    :goto_0
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-ge v2, v0, :cond_0

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    sget v3, Lcom/jaredrummler/android/colorpicker/h;->e:I

    invoke-virtual {v0, v3}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    sget v4, Lcom/jaredrummler/android/colorpicker/h;->b:I

    invoke-virtual {v0, v4}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    aget v4, p1, v2

    invoke-virtual {v3, v4}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v3, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v3, Lcom/jaredrummler/android/colorpicker/f;->a:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    array-length v3, p1

    :goto_1
    if-ge v2, v3, :cond_3

    aget v4, p1, v2

    iget v5, p0, Lcom/jaredrummler/android/colorpicker/c;->j:I

    if-nez v5, :cond_2

    sget v5, Lcom/jaredrummler/android/colorpicker/i;->b:I

    goto :goto_2

    :cond_2
    sget v5, Lcom/jaredrummler/android/colorpicker/i;->a:I

    :goto_2
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v6

    invoke-static {v6, v5, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    sget v6, Lcom/jaredrummler/android/colorpicker/h;->e:I

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroid/view/ViewGroup$MarginLayoutParams;

    iput v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v0, v7, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v6, v4}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    iget-object v7, p0, Lcom/jaredrummler/android/colorpicker/c;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v7, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    new-instance v5, Lcom/jaredrummler/android/colorpicker/c$f;

    invoke-direct {v5, p0, v6, v4}, Lcom/jaredrummler/android/colorpicker/c$f;-><init>(Lcom/jaredrummler/android/colorpicker/c;Lcom/jaredrummler/android/colorpicker/ColorPanelView;I)V

    invoke-virtual {v6, v5}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    new-instance v4, Lcom/jaredrummler/android/colorpicker/c$g;

    invoke-direct {v4, p0, v6}, Lcom/jaredrummler/android/colorpicker/c$g;-><init>(Lcom/jaredrummler/android/colorpicker/c;Lcom/jaredrummler/android/colorpicker/ColorPanelView;)V

    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v4, Lcom/jaredrummler/android/colorpicker/c$h;

    invoke-direct {v4, p0, v6}, Lcom/jaredrummler/android/colorpicker/c$h;-><init>(Lcom/jaredrummler/android/colorpicker/c;Lcom/jaredrummler/android/colorpicker/ColorPanelView;)V

    invoke-virtual {v6, v4}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method e()Landroid/view/View;
    .locals 9

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/jaredrummler/android/colorpicker/i;->c:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/jaredrummler/android/colorpicker/h;->f:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/jaredrummler/android/colorpicker/ColorPickerView;

    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView;

    sget v1, Lcom/jaredrummler/android/colorpicker/h;->d:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    sget v2, Lcom/jaredrummler/android/colorpicker/h;->c:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    iput-object v2, p0, Lcom/jaredrummler/android/colorpicker/c;->q:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    sget v2, Lcom/jaredrummler/android/colorpicker/h;->a:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    sget v3, Lcom/jaredrummler/android/colorpicker/h;->g:I

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iput-object v3, p0, Lcom/jaredrummler/android/colorpicker/c;->r:Landroid/widget/EditText;

    const/4 v3, 0x0

    const/4 v4, 0x1

    :try_start_0
    new-instance v5, Landroid/util/TypedValue;

    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v6

    iget v5, v5, Landroid/util/TypedValue;->data:I

    new-array v7, v4, [I

    const v8, 0x1010036

    aput v8, v7, v3

    invoke-virtual {v6, v5, v7}, Landroid/app/Activity;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v5

    const/high16 v6, -0x1000000

    invoke-virtual {v5, v3, v6}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v6

    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setColorFilter(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/c;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView;

    iget-boolean v5, p0, Lcom/jaredrummler/android/colorpicker/c;->s:Z

    invoke-virtual {v2, v5}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->setAlphaSliderVisible(Z)V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    const-string v5, "color"

    invoke-virtual {v2, v5}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView;

    iget v2, p0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    invoke-virtual {v1, v2, v4}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->n(IZ)V

    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->q:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    iget v2, p0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    invoke-virtual {v1, v2}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->setColor(I)V

    iget v1, p0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    invoke-direct {p0, v1}, Lcom/jaredrummler/android/colorpicker/c;->m(I)V

    iget-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/c;->s:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->r:Landroid/widget/EditText;

    new-array v2, v4, [Landroid/text/InputFilter;

    new-instance v4, Landroid/text/InputFilter$LengthFilter;

    const/4 v5, 0x6

    invoke-direct {v4, v5}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v4, v2, v3

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    :cond_0
    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->q:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    new-instance v2, Lcom/jaredrummler/android/colorpicker/c$c;

    invoke-direct {v2, p0}, Lcom/jaredrummler/android/colorpicker/c$c;-><init>(Lcom/jaredrummler/android/colorpicker/c;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->p:Lcom/jaredrummler/android/colorpicker/ColorPickerView;

    invoke-virtual {v1, p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->setOnColorChangedListener(Lcom/jaredrummler/android/colorpicker/ColorPickerView$c;)V

    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->r:Landroid/widget/EditText;

    invoke-virtual {v1, p0}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->r:Landroid/widget/EditText;

    new-instance v2, Lcom/jaredrummler/android/colorpicker/c$d;

    invoke-direct {v2, p0}, Lcom/jaredrummler/android/colorpicker/c$d;-><init>(Lcom/jaredrummler/android/colorpicker/c;)V

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    return-object v0
.end method

.method f()Landroid/view/View;
    .locals 8

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/jaredrummler/android/colorpicker/i;->d:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    sget v1, Lcom/jaredrummler/android/colorpicker/h;->j:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->l:Landroid/widget/LinearLayout;

    sget v1, Lcom/jaredrummler/android/colorpicker/h;->l:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/SeekBar;

    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->m:Landroid/widget/SeekBar;

    sget v1, Lcom/jaredrummler/android/colorpicker/h;->m:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/jaredrummler/android/colorpicker/c;->n:Landroid/widget/TextView;

    sget v1, Lcom/jaredrummler/android/colorpicker/h;->h:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/GridView;

    invoke-direct {p0}, Lcom/jaredrummler/android/colorpicker/c;->i()V

    iget-boolean v2, p0, Lcom/jaredrummler/android/colorpicker/c;->i:Z

    const/16 v3, 0x8

    if-eqz v2, :cond_0

    iget v2, p0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    invoke-virtual {p0, v2}, Lcom/jaredrummler/android/colorpicker/c;->d(I)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/c;->l:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    sget v2, Lcom/jaredrummler/android/colorpicker/h;->i:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    new-instance v2, Lcom/jaredrummler/android/colorpicker/b;

    new-instance v4, Lcom/jaredrummler/android/colorpicker/c$e;

    invoke-direct {v4, p0}, Lcom/jaredrummler/android/colorpicker/c$e;-><init>(Lcom/jaredrummler/android/colorpicker/c;)V

    iget-object v5, p0, Lcom/jaredrummler/android/colorpicker/c;->e:[I

    invoke-direct {p0}, Lcom/jaredrummler/android/colorpicker/c;->h()I

    move-result v6

    iget v7, p0, Lcom/jaredrummler/android/colorpicker/c;->j:I

    invoke-direct {v2, v4, v5, v6, v7}, Lcom/jaredrummler/android/colorpicker/b;-><init>(Lcom/jaredrummler/android/colorpicker/b$a;[III)V

    iput-object v2, p0, Lcom/jaredrummler/android/colorpicker/c;->k:Lcom/jaredrummler/android/colorpicker/b;

    invoke-virtual {v1, v2}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/c;->s:Z

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lcom/jaredrummler/android/colorpicker/c;->n()V

    goto :goto_1

    :cond_1
    sget v1, Lcom/jaredrummler/android/colorpicker/h;->k:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    sget v1, Lcom/jaredrummler/android/colorpicker/h;->n:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    return-object v0
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onAttach(Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c;->c:Lcom/jaredrummler/android/colorpicker/d;

    if-nez v0, :cond_0

    instance-of v0, p1, Lcom/jaredrummler/android/colorpicker/d;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/jaredrummler/android/colorpicker/d;

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/c;->c:Lcom/jaredrummler/android/colorpicker/d;

    :cond_0
    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "id"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/c;->h:I

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "alpha"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/c;->s:Z

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "showColorShades"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/c;->i:Z

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "colorShape"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/c;->j:I

    const-string v0, "dialogType"

    const-string v1, "color"

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    :goto_0
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/c;->g:I

    new-instance p1, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/c;->d:Landroid/widget/FrameLayout;

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/c;->g:I

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/c;->e()Landroid/view/View;

    move-result-object v0

    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    goto :goto_2

    :cond_1
    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/c;->f()Landroid/view/View;

    move-result-object v0

    goto :goto_1

    :cond_2
    :goto_2
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "selectedButtonText"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_3

    sget p1, Lcom/jaredrummler/android/colorpicker/j;->d:I

    :cond_3
    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v2

    invoke-direct {v0, v2}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/c;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v0, v2}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v2, Lcom/jaredrummler/android/colorpicker/c$a;

    invoke-direct {v2, p0}, Lcom/jaredrummler/android/colorpicker/c$a;-><init>(Lcom/jaredrummler/android/colorpicker/c;)V

    invoke-virtual {v0, p1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "dialogTitle"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    :cond_4
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "presetsButtonText"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/c;->o:I

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "customButtonText"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/c;->u:I

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/c;->g:I

    if-nez v0, :cond_6

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "allowPresets"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/c;->o:I

    if-eqz v0, :cond_5

    goto :goto_3

    :cond_5
    sget v0, Lcom/jaredrummler/android/colorpicker/j;->c:I

    goto :goto_3

    :cond_6
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/c;->g:I

    if-ne v0, v1, :cond_8

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "allowCustom"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/c;->u:I

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    sget v0, Lcom/jaredrummler/android/colorpicker/j;->a:I

    goto :goto_3

    :cond_8
    const/4 v0, 0x0

    :goto_3
    if-eqz v0, :cond_9

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/b$a;->m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    :cond_9
    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    return-object p1
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onDismiss(Landroid/content/DialogInterface;)V

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/c;->c:Lcom/jaredrummler/android/colorpicker/d;

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/c;->h:I

    invoke-interface {p1, v0}, Lcom/jaredrummler/android/colorpicker/d;->n0(I)V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    const-string v1, "color"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v0, p0, Lcom/jaredrummler/android/colorpicker/c;->g:I

    const-string v1, "dialogType"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 3

    invoke-super {p0}, Landroid/app/DialogFragment;->onStart()V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/app/b;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const v2, 0x20008

    invoke-virtual {v1, v2}, Landroid/view/Window;->clearFlags(I)V

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/view/Window;->setSoftInputMode(I)V

    const/4 v1, -0x3

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b;->e(I)Landroid/widget/Button;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/jaredrummler/android/colorpicker/c$b;

    invoke-direct {v1, p0}, Lcom/jaredrummler/android/colorpicker/c$b;-><init>(Lcom/jaredrummler/android/colorpicker/c;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object p2, p0, Lcom/jaredrummler/android/colorpicker/c;->r:Landroid/widget/EditText;

    const/4 v0, 0x0

    if-eq p1, p2, :cond_0

    invoke-virtual {p2}, Landroid/widget/EditText;->hasFocus()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/c;->r:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->clearFocus()V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    const-string p2, "input_method"

    invoke-virtual {p1, p2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    iget-object p2, p0, Lcom/jaredrummler/android/colorpicker/c;->r:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/widget/EditText;->getWindowToken()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p2, v0}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/c;->r:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->clearFocus()V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method
