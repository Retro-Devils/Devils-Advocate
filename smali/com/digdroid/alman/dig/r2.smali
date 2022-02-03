.class public Lcom/digdroid/alman/dig/r2;
.super Lcom/digdroid/alman/dig/p1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/r2$t0;,
        Lcom/digdroid/alman/dig/r2$u0;,
        Lcom/digdroid/alman/dig/r2$w0;,
        Lcom/digdroid/alman/dig/r2$x0;,
        Lcom/digdroid/alman/dig/r2$v0;
    }
.end annotation


# static fields
.field static final n0:[Ljava/lang/String;


# instance fields
.field o0:Z

.field p0:[Ljava/io/File;

.field q0:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/digdroid/alman/dig/s3;",
            ">;"
        }
    .end annotation
.end field

.field r0:Landroidx/appcompat/app/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "en"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "fr"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "es"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "pt"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "it"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "de"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "ru"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "ja"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "ko"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "ar"

    aput-object v2, v0, v1

    sput-object v0, Lcom/digdroid/alman/dig/r2;->n0:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/p1;-><init>()V

    return-void
.end method

.method private B3()V
    .locals 8

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09021d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v1, Lcom/digdroid/alman/dig/r2$v0;

    const v4, 0x7f09021d

    const v5, 0x7f090221

    const v6, 0x7f11012b

    const v7, 0x7f090226

    move-object v2, v1

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/digdroid/alman/dig/r2$v0;-><init>(Lcom/digdroid/alman/dig/r2;IIII)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private C3()V
    .locals 6

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    const v1, 0x7f090321

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v2, v2, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v1}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v2, Lcom/digdroid/alman/dig/r2$c0;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/r2$c0;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v2, "language"

    const-string v3, "device"

    invoke-virtual {v1, v2, v3}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    :cond_2
    const-string v2, "digdroid.com/faq"

    const/4 v3, 0x0

    :goto_0
    sget-object v4, Lcom/digdroid/alman/dig/r2;->n0:[Ljava/lang/String;

    array-length v5, v4

    if-ge v3, v5, :cond_4

    aget-object v4, v4, v3

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v3, "en"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "-"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    const v1, 0x7f090192

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v3, v3, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v1}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v3, Lcom/digdroid/alman/dig/r2$d0;

    invoke-direct {v3, p0, v2}, Lcom/digdroid/alman/dig/r2$d0;-><init>(Lcom/digdroid/alman/dig/r2;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f090129

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v1, Lcom/digdroid/alman/dig/r2$e0;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/r2$e0;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    :goto_2
    return-void
.end method

.method private D3()V
    .locals 8

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09022a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v1, Lcom/digdroid/alman/dig/r2$v0;

    const v4, 0x7f09022a

    const v5, 0x7f090229

    const v6, 0x7f110139

    const v7, 0x7f09022b

    move-object v2, v1

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/digdroid/alman/dig/r2$v0;-><init>(Lcom/digdroid/alman/dig/r2;IIII)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private E3()V
    .locals 6

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    const v1, 0x7f090106

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v1}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    const v2, 0x7f090107

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/SwitchCompat;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v3, v3, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v3}, Landroid/widget/CompoundButton;->setTextColor(I)V

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v4, "confirm_quit"

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    new-instance v3, Lcom/digdroid/alman/dig/r2$r;

    invoke-direct {v3, p0, v2}, Lcom/digdroid/alman/dig/r2$r;-><init>(Lcom/digdroid/alman/dig/r2;Landroidx/appcompat/widget/SwitchCompat;)V

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f09005f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v1}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    const v2, 0x7f090060

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/SwitchCompat;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v3, v3, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v3}, Landroid/widget/CompoundButton;->setTextColor(I)V

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v4, "allow_paging"

    invoke-virtual {v3, v4, v5}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    new-instance v3, Lcom/digdroid/alman/dig/r2$s;

    invoke-direct {v3, p0, v2}, Lcom/digdroid/alman/dig/r2$s;-><init>(Lcom/digdroid/alman/dig/r2;Landroidx/appcompat/widget/SwitchCompat;)V

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0901b2

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v1, Lcom/digdroid/alman/dig/r2$t;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/r2$t;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private F3(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/digdroid/alman/dig/s3;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2;->q0:Ljava/util/ArrayList;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/digdroid/alman/dig/r2;->X2(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->H3()V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->v3()V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->J3()V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->r3()V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->E3()V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->x3()V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->C3()V

    const v0, 0x7f09034f

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void
.end method

.method private G3()V
    .locals 8

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09034f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    invoke-virtual {v0}, Landroid/widget/TextView;->requestFocus()Z

    new-instance v1, Lcom/digdroid/alman/dig/r2$v0;

    const v4, 0x7f09034f

    const v5, 0x7f090350

    const v6, 0x7f1100c7

    const v7, 0x7f090351

    move-object v2, v1

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lcom/digdroid/alman/dig/r2$v0;-><init>(Lcom/digdroid/alman/dig/r2;IIII)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method private H3()V
    .locals 6

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    const v2, 0x7f090287

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/SwitchCompat;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v3, v3, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v3}, Landroid/widget/CompoundButton;->setTextColor(I)V

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v4, "merged_games"

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    const v3, 0x7f090288

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v3}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v4, Lcom/digdroid/alman/dig/r2$x;

    invoke-direct {v4, p0, v2}, Lcom/digdroid/alman/dig/r2$x;-><init>(Lcom/digdroid/alman/dig/r2;Landroidx/appcompat/widget/SwitchCompat;)V

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f09008c

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/widget/SwitchCompat;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v3, v3, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v3}, Landroid/widget/CompoundButton;->setTextColor(I)V

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v4, "auto_scan"

    invoke-virtual {v3, v4, v5}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    const v3, 0x7f09008d

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v3}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v4, Lcom/digdroid/alman/dig/r2$n0;

    invoke-direct {v4, p0, v2}, Lcom/digdroid/alman/dig/r2$n0;-><init>(Lcom/digdroid/alman/dig/r2;Landroidx/appcompat/widget/SwitchCompat;)V

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f090216

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v3, v3, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v3, Lcom/digdroid/alman/dig/r2$o0;

    invoke-direct {v3, p0, v0}, Lcom/digdroid/alman/dig/r2$o0;-><init>(Lcom/digdroid/alman/dig/r2;Landroid/app/Activity;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0903bd

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v2, v2, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v1}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v2, Lcom/digdroid/alman/dig/r2$p0;

    invoke-direct {v2, p0, v0}, Lcom/digdroid/alman/dig/r2$p0;-><init>(Lcom/digdroid/alman/dig/r2;Landroid/app/Activity;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private I3()V
    .locals 10

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09006c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v1, Lcom/digdroid/alman/dig/r2$v0;

    const v4, 0x7f09006c

    const v5, 0x7f09006d

    const v6, 0x7f110275

    const v7, 0x7f09006e

    const v8, 0x7f0900e1

    const v9, 0x7f09006a

    move-object v2, v1

    move-object v3, p0

    invoke-direct/range {v2 .. v9}, Lcom/digdroid/alman/dig/r2$v0;-><init>(Lcom/digdroid/alman/dig/r2;IIIIII)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private J3()V
    .locals 14

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/MainActivity;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    const v2, 0x7f0900e0

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v3, v3, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, p0, Lcom/digdroid/alman/dig/r2;->q0:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :cond_2
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/digdroid/alman/dig/s3;

    if-eqz v8, :cond_2

    :try_start_0
    iget-object v9, v8, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v9, "name"

    invoke-virtual {v8, v9}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v8, v8, Lcom/digdroid/alman/dig/s3;->f:Ljava/lang/String;

    sget-object v9, Lcom/digdroid/alman/dig/q3;->b:Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v8, :cond_3

    move v6, v7

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :catch_0
    nop

    goto :goto_0

    :cond_4
    new-instance v4, Landroid/widget/ArrayAdapter;

    const v7, 0x1090008

    invoke-direct {v4, v0, v7, v3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const v3, 0x1090009

    invoke-virtual {v4, v3}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    const v8, 0x7f0900e1

    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/Spinner;

    invoke-virtual {v8, v4}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    invoke-virtual {v8, v6}, Landroid/widget/Spinner;->setSelection(I)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v8, v4}, Landroid/widget/Spinner;->setTag(Ljava/lang/Object;)V

    new-instance v4, Lcom/digdroid/alman/dig/r2$c;

    invoke-direct {v4, p0, v8, v2}, Lcom/digdroid/alman/dig/r2$c;-><init>(Lcom/digdroid/alman/dig/r2;Landroid/widget/Spinner;Ljava/util/ArrayList;)V

    invoke-virtual {v8, v4}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    const v2, 0x7f090083

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v4, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v4, v4, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v2, 0x7

    new-array v2, v2, [Ljava/lang/String;

    const-string v4, "-------"

    aput-object v4, v2, v5

    const v6, 0x7f11026f

    invoke-virtual {v0, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v8, 0x1

    aput-object v6, v2, v8

    const v6, 0x7f1100c6

    invoke-virtual {v0, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x2

    aput-object v6, v2, v9

    const v6, 0x7f11003b

    invoke-virtual {v0, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x3

    aput-object v6, v2, v10

    const v6, 0x7f110038

    invoke-virtual {v0, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v11, 0x4

    aput-object v6, v2, v11

    const/4 v6, 0x5

    const v12, 0x7f11003d

    invoke-virtual {v0, v12}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v12

    aput-object v12, v2, v6

    const/4 v6, 0x6

    const v12, 0x7f11003f

    invoke-virtual {v0, v12}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v12

    aput-object v12, v2, v6

    new-instance v6, Landroid/widget/ArrayAdapter;

    invoke-direct {v6, v0, v7, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    invoke-virtual {v6, v3}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    const v2, 0x7f090084

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    invoke-virtual {v2, v6}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    new-instance v6, Lcom/digdroid/alman/dig/r2$d;

    invoke-direct {v6, p0, v0}, Lcom/digdroid/alman/dig/r2$d;-><init>(Lcom/digdroid/alman/dig/r2;Lcom/digdroid/alman/dig/MainActivity;)V

    invoke-virtual {v2, v6}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    const v2, 0x7f09006f

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    const v6, 0x7f090070

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroidx/appcompat/widget/SwitchCompat;

    iget-object v12, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v12, v12, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v6, v12}, Landroid/widget/CompoundButton;->setTextColor(I)V

    iget-object v12, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v13, "aspect_ratio_hack"

    invoke-virtual {v12, v13, v5}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v12

    invoke-virtual {v6, v12}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    new-instance v12, Lcom/digdroid/alman/dig/r2$e;

    invoke-direct {v12, p0, v6}, Lcom/digdroid/alman/dig/r2$e;-><init>(Lcom/digdroid/alman/dig/r2;Landroidx/appcompat/widget/SwitchCompat;)V

    invoke-virtual {v2, v12}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f090180

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v6, 0x7f1100d5

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(I)V

    iget-object v6, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v6, v6, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v6, Lcom/digdroid/alman/dig/r2$f;

    invoke-direct {v6, p0}, Lcom/digdroid/alman/dig/r2$f;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f090228

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v6, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v6, v6, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v6, Lcom/digdroid/alman/dig/r2$g;

    invoke-direct {v6, p0}, Lcom/digdroid/alman/dig/r2$g;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0900af

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v6, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v6, v6, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v6, Lcom/digdroid/alman/dig/r2$h;

    invoke-direct {v6, p0}, Lcom/digdroid/alman/dig/r2$h;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0903fa

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v6, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v6, v6, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const v2, 0x7f0903fb

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/s3;->J(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v6

    if-eqz v6, :cond_5

    array-length v12, v6

    if-le v12, v8, :cond_5

    aget-object v6, v6, v8

    if-eqz v6, :cond_5

    const/4 v6, 0x1

    goto :goto_1

    :cond_5
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_6

    goto :goto_2

    :cond_6
    const/4 v11, 0x3

    :goto_2
    new-array v11, v11, [Ljava/lang/String;

    aput-object v4, v11, v5

    const v4, 0x7f1101e2

    invoke-virtual {v0, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v11, v8

    const v4, 0x7f11013a

    invoke-virtual {v0, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v11, v9

    if-eqz v6, :cond_7

    const v4, 0x7f1100e3

    invoke-virtual {v0, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v11, v10

    :cond_7
    new-instance v4, Landroid/widget/ArrayAdapter;

    invoke-direct {v4, v0, v7, v11}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    const v3, 0x7f0903fc

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Spinner;

    invoke-virtual {v1, v4}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    invoke-virtual {v1, v5}, Landroid/widget/Spinner;->setSelection(I)V

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, v5}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v1, v3}, Landroid/widget/Spinner;->setTag(Ljava/lang/Object;)V

    new-instance v3, Lcom/digdroid/alman/dig/r2$i;

    invoke-direct {v3, p0, v1, v0, v2}, Lcom/digdroid/alman/dig/r2$i;-><init>(Lcom/digdroid/alman/dig/r2;Landroid/widget/Spinner;Lcom/digdroid/alman/dig/MainActivity;Landroid/widget/TextView;)V

    invoke-virtual {v1, v3}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    :cond_8
    :goto_3
    return-void
.end method

.method static synthetic g3(Lcom/digdroid/alman/dig/r2;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->G3()V

    return-void
.end method

.method static synthetic h3(Lcom/digdroid/alman/dig/r2;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->u3()V

    return-void
.end method

.method static synthetic i3(Lcom/digdroid/alman/dig/r2;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->t3()V

    return-void
.end method

.method static synthetic j3(Lcom/digdroid/alman/dig/r2;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->I3()V

    return-void
.end method

.method static synthetic k3(Lcom/digdroid/alman/dig/r2;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->q3()V

    return-void
.end method

.method static synthetic l3(Lcom/digdroid/alman/dig/r2;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->D3()V

    return-void
.end method

.method static synthetic m3(Lcom/digdroid/alman/dig/r2;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->w3()V

    return-void
.end method

.method static synthetic n3(Lcom/digdroid/alman/dig/r2;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->B3()V

    return-void
.end method

.method static synthetic o3(Lcom/digdroid/alman/dig/r2;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->y3()V

    return-void
.end method

.method static synthetic p3(Lcom/digdroid/alman/dig/r2;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/r2;->F3(Ljava/util/ArrayList;)V

    return-void
.end method

.method private q3()V
    .locals 10

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09006a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v1, Lcom/digdroid/alman/dig/r2$v0;

    const v4, 0x7f09006a

    const v5, 0x7f090069

    const v6, 0x7f11002b

    const v7, 0x7f09006b

    const v8, 0x7f090239

    const v9, 0x7f09022a

    move-object v2, v1

    move-object v3, p0

    invoke-direct/range {v2 .. v9}, Lcom/digdroid/alman/dig/r2$v0;-><init>(Lcom/digdroid/alman/dig/r2;IIIIII)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private r3()V
    .locals 10

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    const v2, 0x7f090238

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v3, v3, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v2, 0xb

    new-array v2, v2, [Ljava/lang/String;

    const v3, 0x7f1100c6

    invoke-virtual {v0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const v3, 0x7f1100dc

    invoke-virtual {v0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v2, v5

    const/4 v3, 0x2

    const v6, 0x7f1100f7

    invoke-virtual {v0, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v2, v3

    const/4 v3, 0x3

    const v6, 0x7f110258

    invoke-virtual {v0, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v2, v3

    const/4 v3, 0x4

    const v6, 0x7f1101f9

    invoke-virtual {v0, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v2, v3

    const/4 v3, 0x5

    const v6, 0x7f11013c

    invoke-virtual {v0, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v2, v3

    const/4 v3, 0x6

    const v6, 0x7f11010a

    invoke-virtual {v0, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v2, v3

    const/4 v3, 0x7

    const v6, 0x7f110222

    invoke-virtual {v0, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v2, v3

    const v3, 0x7f11013f

    invoke-virtual {v0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0x8

    aput-object v3, v2, v6

    const/16 v3, 0x9

    const v7, 0x7f110145

    invoke-virtual {v0, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v2, v3

    const/16 v3, 0xa

    const v7, 0x7f11002f

    invoke-virtual {v0, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v2, v3

    new-instance v3, Landroid/widget/ArrayAdapter;

    const v7, 0x1090008

    invoke-direct {v3, v0, v7, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    const v2, 0x1090009

    invoke-virtual {v3, v2}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v7, "language"

    const-string v8, "device"

    invoke-virtual {v2, v7, v8}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    :goto_0
    sget-object v8, Lcom/digdroid/alman/dig/r2;->n0:[Ljava/lang/String;

    array-length v9, v8

    if-ge v7, v9, :cond_3

    aget-object v8, v8, v7

    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    add-int/2addr v7, v5

    goto :goto_1

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_3
    const/4 v7, 0x0

    :goto_1
    const v2, 0x7f090239

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Spinner;

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, v7}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v2, v7}, Landroid/widget/Spinner;->setSelection(I)V

    new-instance v3, Lcom/digdroid/alman/dig/r2$j;

    invoke-direct {v3, p0, v2}, Lcom/digdroid/alman/dig/r2$j;-><init>(Lcom/digdroid/alman/dig/r2;Landroid/widget/Spinner;)V

    invoke-virtual {v2, v3}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x11

    if-lt v3, v7, :cond_4

    goto :goto_2

    :cond_4
    const/4 v5, 0x0

    :goto_2
    invoke-virtual {v2, v5}, Landroid/widget/Spinner;->setEnabled(Z)V

    const v2, 0x7f09008e

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    const v3, 0x7f09008f

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/SwitchCompat;

    iget-object v5, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v5, v5, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v3, v5}, Landroid/widget/CompoundButton;->setTextColor(I)V

    iget-object v5, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v7, "autostart"

    invoke-virtual {v5, v7, v4}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v5

    invoke-virtual {v3, v5}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    new-instance v5, Lcom/digdroid/alman/dig/r2$m;

    invoke-direct {v5, p0, v3}, Lcom/digdroid/alman/dig/r2$m;-><init>(Lcom/digdroid/alman/dig/r2;Landroidx/appcompat/widget/SwitchCompat;)V

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f09018c

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    const v3, 0x7f09018d

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/SwitchCompat;

    iget-object v5, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v5, v5, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v3, v5}, Landroid/widget/CompoundButton;->setTextColor(I)V

    iget-object v5, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v7, "external_browser"

    invoke-virtual {v5, v7, v4}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v5

    invoke-virtual {v3, v5}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    new-instance v5, Lcom/digdroid/alman/dig/r2$n;

    invoke-direct {v5, p0, v3}, Lcom/digdroid/alman/dig/r2$n;-><init>(Lcom/digdroid/alman/dig/r2;Landroidx/appcompat/widget/SwitchCompat;)V

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f090096

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v3, v3, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v3, Lcom/digdroid/alman/dig/r2$o;

    invoke-direct {v3, p0, v0}, Lcom/digdroid/alman/dig/r2$o;-><init>(Lcom/digdroid/alman/dig/r2;Landroid/app/Activity;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f090334

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v2, v2, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v2, Lcom/digdroid/alman/dig/r2$p;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/r2$p;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/d0;->v()Z

    move-result v2

    const v3, 0x7f09042b

    if-eqz v2, :cond_5

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_5
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    const v2, 0x7f09042a

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v2, v2, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v1}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v2, Lcom/digdroid/alman/dig/r2$q;

    invoke-direct {v2, p0, v0}, Lcom/digdroid/alman/dig/r2$q;-><init>(Lcom/digdroid/alman/dig/r2;Lcom/digdroid/alman/dig/d0;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    :goto_3
    return-void
.end method

.method private t3()V
    .locals 4

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c002c

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f090097

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->s(Landroid/widget/TextView;)V

    const v2, 0x7f090095

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->s(Landroid/widget/TextView;)V

    new-instance v3, Lcom/digdroid/alman/dig/r2$f0;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/r2$f0;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f090094

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->s(Landroid/widget/TextView;)V

    new-instance v3, Lcom/digdroid/alman/dig/r2$g0;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/r2$g0;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f09033a

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->s(Landroid/widget/TextView;)V

    new-instance v3, Lcom/digdroid/alman/dig/r2$h0;

    invoke-direct {v3, p0, v0}, Lcom/digdroid/alman/dig/r2$h0;-><init>(Lcom/digdroid/alman/dig/r2;Landroid/app/Activity;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v2, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v3

    invoke-direct {v2, v0, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v1}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/r2;->r0:Landroidx/appcompat/app/b;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_1
    :goto_0
    return-void
.end method

.method private u3()V
    .locals 10

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0901a4

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v1, Lcom/digdroid/alman/dig/r2$v0;

    const v4, 0x7f0901a4

    const v5, 0x7f0901a5

    const v6, 0x7f1100f8

    const v7, 0x7f090120

    const v8, 0x7f09021a

    const v9, 0x7f09006c

    move-object v2, v1

    move-object v3, p0

    invoke-direct/range {v2 .. v9}, Lcom/digdroid/alman/dig/r2$v0;-><init>(Lcom/digdroid/alman/dig/r2;IIIIII)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private v3()V
    .locals 13

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    const v2, 0x7f09008a

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Switch;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v3, v3, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v3}, Landroid/widget/Switch;->setTextColor(I)V

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v3}, Lcom/digdroid/alman/dig/c3;->a()Z

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/Switch;->setChecked(Z)V

    const v3, 0x7f09008b

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v3}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v4, Lcom/digdroid/alman/dig/r2$q0;

    invoke-direct {v4, p0, v2}, Lcom/digdroid/alman/dig/r2$q0;-><init>(Lcom/digdroid/alman/dig/r2;Landroid/widget/Switch;)V

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v3, "language"

    const-string v4, "device"

    invoke-virtual {v2, v3, v4}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    const v2, 0x7f09044d

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Switch;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v3, v3, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v3}, Landroid/widget/Switch;->setTextColor(I)V

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v4, "wifi_only"

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/Switch;->setChecked(Z)V

    const v3, 0x7f09044c

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v3}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v4, Lcom/digdroid/alman/dig/r2$r0;

    invoke-direct {v4, p0, v2, v0}, Lcom/digdroid/alman/dig/r2$r0;-><init>(Lcom/digdroid/alman/dig/r2;Landroid/widget/Switch;Landroid/app/Activity;)V

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f090200

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v3, v3, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v2, 0x3

    new-array v3, v2, [Ljava/lang/String;

    const v4, 0x7f110118

    invoke-virtual {v0, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v6, 0x2

    aput-object v4, v3, v6

    const v4, 0x7f110187

    invoke-virtual {v0, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v5

    const v4, 0x7f110175

    invoke-virtual {v0, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    aput-object v4, v3, v7

    new-instance v4, Landroid/widget/ArrayAdapter;

    const v8, 0x1090008

    invoke-direct {v4, v0, v8, v3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    const v3, 0x1090009

    invoke-virtual {v4, v3}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    iget-object v9, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v10, "image_quality"

    const-string v11, "low"

    invoke-virtual {v9, v10, v11}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    const/4 v10, -0x1

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v12

    sparse-switch v12, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v11, "high"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    goto :goto_0

    :cond_3
    const/4 v10, 0x2

    goto :goto_0

    :sswitch_1
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_0

    :cond_4
    const/4 v10, 0x1

    goto :goto_0

    :sswitch_2
    const-string v11, "medium"

    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    goto :goto_0

    :cond_5
    const/4 v10, 0x0

    :goto_0
    packed-switch v10, :pswitch_data_0

    :pswitch_0
    const/4 v9, 0x1

    goto :goto_1

    :pswitch_1
    const/4 v9, 0x2

    goto :goto_1

    :pswitch_2
    const/4 v9, 0x0

    :goto_1
    const v10, 0x7f09021a

    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/Spinner;

    invoke-virtual {v10, v4}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    invoke-virtual {v10, v9}, Landroid/widget/Spinner;->setSelection(I)V

    new-instance v4, Lcom/digdroid/alman/dig/r2$s0;

    invoke-direct {v4, p0}, Lcom/digdroid/alman/dig/r2$s0;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {v10, v4}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    const v4, 0x7f09011e

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iget-object v9, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v9, v9, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextColor(I)V

    const v4, 0x7f0903c2

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    invoke-static {v0}, Lcom/digdroid/alman/dig/a4;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object v9

    if-eqz v9, :cond_6

    array-length v10, v9

    if-le v10, v5, :cond_6

    aget-object v9, v9, v5

    if-eqz v9, :cond_6

    const/4 v9, 0x1

    goto :goto_2

    :cond_6
    const/4 v9, 0x0

    :goto_2
    if-eqz v9, :cond_7

    const/4 v10, 0x4

    goto :goto_3

    :cond_7
    const/4 v10, 0x3

    :goto_3
    new-array v10, v10, [Ljava/lang/String;

    const-string v11, "-------"

    aput-object v11, v10, v7

    const v11, 0x7f1101e2

    invoke-virtual {v0, v11}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v11

    aput-object v11, v10, v5

    const v5, 0x7f11013a

    invoke-virtual {v0, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v10, v6

    if-eqz v9, :cond_8

    const v5, 0x7f1100e3

    invoke-virtual {v0, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v10, v2

    :cond_8
    new-instance v2, Landroid/widget/ArrayAdapter;

    invoke-direct {v2, v0, v8, v10}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    const v3, 0x7f0903c3

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Spinner;

    invoke-virtual {v3, v2}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    invoke-virtual {v3, v7}, Landroid/widget/Spinner;->setSelection(I)V

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v7}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v3, v2}, Landroid/widget/Spinner;->setTag(Ljava/lang/Object;)V

    new-instance v2, Lcom/digdroid/alman/dig/r2$a;

    invoke-direct {v2, p0, v3, v0, v4}, Lcom/digdroid/alman/dig/r2$a;-><init>(Lcom/digdroid/alman/dig/r2;Landroid/widget/Spinner;Landroid/app/Activity;Landroid/widget/TextView;)V

    invoke-virtual {v3, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    const v2, 0x7f09032e

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v2, v2, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v1}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v2, Lcom/digdroid/alman/dig/r2$b;

    invoke-direct {v2, p0, v0}, Lcom/digdroid/alman/dig/r2$b;-><init>(Lcom/digdroid/alman/dig/r2;Landroid/app/Activity;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_9
    :goto_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x4041708b -> :sswitch_2
        0x1a354 -> :sswitch_1
        0x30dda2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private w3()V
    .locals 10

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09015a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v1, Lcom/digdroid/alman/dig/r2$v0;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/c3;->u()Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x7f0902f2

    const v8, 0x7f0902f2

    goto :goto_0

    :cond_0
    const v2, 0x7f0902ec

    const v8, 0x7f0902ec

    :goto_0
    const v9, 0x7f09021d

    const v4, 0x7f09015a

    const v5, 0x7f09015b

    const v6, 0x7f1100c6

    const v7, 0x7f09015c

    move-object v2, v1

    move-object v3, p0

    invoke-direct/range {v2 .. v9}, Lcom/digdroid/alman/dig/r2$v0;-><init>(Lcom/digdroid/alman/dig/r2;IIIIII)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private x3()V
    .locals 14

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    const v2, 0x7f09017f

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v3, v3, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    iget-object v3, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v3}, Lcom/digdroid/alman/dig/c3;->u()Z

    move-result v3

    const v4, 0x7f0902f2

    const v5, 0x7f0902ec

    if-eqz v3, :cond_2

    const v3, 0x7f0902f2

    goto :goto_0

    :cond_2
    const v3, 0x7f0902ec

    :goto_0
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setNextFocusUpId(I)V

    new-instance v3, Lcom/digdroid/alman/dig/r2$u;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/r2$u;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/c3;->u()Z

    move-result v2

    const v3, 0x1090009

    const v6, 0x1090008

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/16 v9, 0x8

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v2, :cond_3

    const v2, 0x7f0902eb

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_3
    const v2, 0x7f0902ea

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v12, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v12, v12, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v12}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/String;

    const v12, 0x7f110043

    invoke-virtual {v0, v12}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v12

    aput-object v12, v2, v11

    const v12, 0x7f110147

    invoke-virtual {v0, v12}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v12

    aput-object v12, v2, v10

    const v12, 0x7f1101f8

    invoke-virtual {v0, v12}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v12

    aput-object v12, v2, v8

    const v12, 0x7f11024f

    invoke-virtual {v0, v12}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v12

    aput-object v12, v2, v7

    new-instance v12, Landroid/widget/ArrayAdapter;

    invoke-direct {v12, v0, v6, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    invoke-virtual {v12, v3}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v13, "orientation"

    invoke-virtual {v2, v13, v11}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/Spinner;

    iget-object v13, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v13}, Lcom/digdroid/alman/dig/c3;->u()Z

    move-result v13

    xor-int/2addr v13, v10

    invoke-virtual {v5, v13}, Landroid/widget/Spinner;->setEnabled(Z)V

    invoke-virtual {v5, v12}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    invoke-virtual {v5, v2}, Landroid/widget/Spinner;->setSelection(I)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v5, v2}, Landroid/widget/Spinner;->setTag(Ljava/lang/Object;)V

    new-instance v2, Lcom/digdroid/alman/dig/r2$v;

    invoke-direct {v2, p0, v5}, Lcom/digdroid/alman/dig/r2$v;-><init>(Lcom/digdroid/alman/dig/r2;Landroid/widget/Spinner;)V

    invoke-virtual {v5, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    :goto_1
    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/c3;->u()Z

    move-result v2

    if-nez v2, :cond_4

    const v2, 0x7f0902f1

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_4
    const v2, 0x7f0902f0

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v5, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v5, v5, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setTextColor(I)V

    new-array v2, v7, [Ljava/lang/String;

    const-string v5, "0%"

    aput-object v5, v2, v11

    const-string v5, "2.5%"

    aput-object v5, v2, v10

    const-string v5, "5%"

    aput-object v5, v2, v8

    new-instance v5, Landroid/widget/ArrayAdapter;

    invoke-direct {v5, v0, v6, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    invoke-virtual {v5, v3}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v3, "overscan"

    invoke-virtual {v2, v3, v11}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Spinner;

    iget-object v4, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v4}, Lcom/digdroid/alman/dig/c3;->u()Z

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/Spinner;->setEnabled(Z)V

    invoke-virtual {v3, v5}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    invoke-virtual {v3, v2}, Landroid/widget/Spinner;->setSelection(I)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroid/widget/Spinner;->setTag(Ljava/lang/Object;)V

    new-instance v2, Lcom/digdroid/alman/dig/r2$y;

    invoke-direct {v2, p0, v3}, Lcom/digdroid/alman/dig/r2$y;-><init>(Lcom/digdroid/alman/dig/r2;Landroid/widget/Spinner;)V

    invoke-virtual {v3, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    :goto_2
    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/c3;->u()Z

    move-result v2

    const v3, 0x7f0902cd

    if-eqz v2, :cond_5

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_5
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    const v3, 0x7f0901fc

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/appcompat/widget/SwitchCompat;

    iget-object v4, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v4, v4, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v3, v4}, Landroid/widget/CompoundButton;->setTextColor(I)V

    iget-object v4, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v5, "hide_navbar"

    invoke-virtual {v4, v5, v11}, Lcom/digdroid/alman/dig/c3;->c(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    new-instance v4, Lcom/digdroid/alman/dig/r2$z;

    invoke-direct {v4, p0, v3, v0}, Lcom/digdroid/alman/dig/r2$z;-><init>(Lcom/digdroid/alman/dig/r2;Landroidx/appcompat/widget/SwitchCompat;Landroid/app/Activity;)V

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_3
    const v0, 0x7f09037a

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v2, v2, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v0}, Lcom/digdroid/alman/dig/q3;->q(Landroid/view/View;)V

    new-instance v2, Lcom/digdroid/alman/dig/r2$a0;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/r2$a0;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0903e6

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/t3;

    iget v2, v2, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const v0, 0x7f0900d7

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v3, "game_cache_size"

    invoke-virtual {v2, v3, v11}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    new-instance v1, Lcom/digdroid/alman/dig/r2$b0;

    invoke-direct {v1, p0, v0}, Lcom/digdroid/alman/dig/r2$b0;-><init>(Lcom/digdroid/alman/dig/r2;Landroid/widget/EditText;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_6
    :goto_4
    return-void
.end method

.method private y3()V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    check-cast v0, Lcom/digdroid/alman/dig/MainActivity;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    :try_start_0
    new-instance v1, Lcom/digdroid/alman/dig/r2$l;

    invoke-direct {v1, p0, v0}, Lcom/digdroid/alman/dig/r2$l;-><init>(Lcom/digdroid/alman/dig/r2;Lcom/digdroid/alman/dig/MainActivity;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Void;

    invoke-virtual {v1, v0}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method A3()V
    .locals 7

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    const-string v1, "num_storage_dirs"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->l(Ljava/lang/String;I)I

    move-result v0

    new-array v1, v0, [Ljava/lang/String;

    new-array v3, v0, [Z

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v4, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "storage_dir"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    invoke-virtual {v4, v5, v6}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance v2, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v4

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v5

    invoke-direct {v2, v4, v5}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v4, 0x7f1100d3

    invoke-virtual {v2, v4}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    new-instance v4, Lcom/digdroid/alman/dig/r2$i0;

    invoke-direct {v4, p0, v3}, Lcom/digdroid/alman/dig/r2$i0;-><init>(Lcom/digdroid/alman/dig/r2;[Z)V

    invoke-virtual {v2, v1, v3, v4}, Landroidx/appcompat/app/b$a;->k([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)Landroidx/appcompat/app/b$a;

    const v4, 0x7f11001c

    new-instance v5, Lcom/digdroid/alman/dig/r2$j0;

    invoke-direct {v5, p0, v0}, Lcom/digdroid/alman/dig/r2$j0;-><init>(Lcom/digdroid/alman/dig/r2;I)V

    invoke-virtual {v2, v4, v5}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    const v4, 0x7f1100bc

    new-instance v5, Lcom/digdroid/alman/dig/r2$k0;

    invoke-direct {v5, p0, v0, v3, v1}, Lcom/digdroid/alman/dig/r2$k0;-><init>(Lcom/digdroid/alman/dig/r2;I[Z[Ljava/lang/String;)V

    invoke-virtual {v2, v4, v5}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    const v0, 0x7f1100cb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroidx/appcompat/app/b$a;->m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    invoke-virtual {v2}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

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

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2;->y3()V

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

.method public R2()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/digdroid/alman/dig/p1$a;->w(Z)V

    :cond_0
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

    const p3, 0x7f0c0059

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0903ce

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewStub;

    invoke-virtual {p2}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    const p2, 0x7f0903c6

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewStub;

    invoke-virtual {p2}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    const p2, 0x7f0903cf

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewStub;

    invoke-virtual {p2}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    const p2, 0x7f0903c5

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewStub;

    invoke-virtual {p2}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    const p2, 0x7f0903ca

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewStub;

    invoke-virtual {p2}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    const p2, 0x7f0903c7

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewStub;

    invoke-virtual {p2}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    const p2, 0x7f0903c9

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/view/ViewStub;

    invoke-virtual {p2}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

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

.method public bridge synthetic k1(Landroid/view/MenuItem;)Z
    .locals 0

    invoke-super {p0, p1}, Lcom/digdroid/alman/dig/p1;->k1(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public m1()V
    .locals 3

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->m1()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    const v1, 0x7f09008c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0903bd

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f09008b

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0900e1

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Spinner;

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    const v1, 0x7f09021a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Spinner;

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    const v1, 0x7f090321

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f090192

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic q2()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->q2()V

    return-void
.end method

.method public r1()V
    .locals 4

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->r1()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    move-object v1, v0

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v1}, Lb/q/o;->a(Landroid/view/ViewGroup;)V

    const v1, 0x7f09035a

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/p1;->L2(Landroid/view/View;)V

    new-instance v1, Lcom/digdroid/alman/dig/r2$k;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/r2$k;-><init>(Lcom/digdroid/alman/dig/r2;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lcom/digdroid/alman/dig/r2$w;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/r2$w;-><init>(Lcom/digdroid/alman/dig/r2;)V

    const-wide/16 v2, 0xa

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/p1;->i0:Z

    return-void
.end method

.method public bridge synthetic s2()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->s2()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method s3()Z
    .locals 5

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v0}, Lcom/digdroid/alman/dig/a4;->q(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/c3;->o()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    invoke-virtual {v2}, Lcom/digdroid/alman/dig/c3;->i()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    new-instance v2, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v3

    invoke-direct {v2, v0, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v3, 0x7f110294

    invoke-virtual {v2, v3}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v2

    const v3, 0x7f1101da

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    invoke-static {v0}, Lcom/digdroid/alman/dig/a4;->H(Landroid/content/Context;)V

    :cond_3
    :goto_1
    return v1
.end method

.method public bridge synthetic t1()V
    .locals 0

    invoke-super {p0}, Lcom/digdroid/alman/dig/p1;->t1()V

    return-void
.end method

.method public t2()Ljava/lang/String;
    .locals 1

    const-string v0, "options"

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

.method z3(Landroid/app/Activity;)V
    .locals 7

    iget-object p1, p0, Lcom/digdroid/alman/dig/p1;->a0:Lcom/digdroid/alman/dig/u;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    const-string v0, "UPDATE rompaths SET selected=0 WHERE system=\'ignore\'"

    invoke-virtual {p1, v0}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    const-string v0, "SELECT _id,path,selected FROM rompaths WHERE system=\'ignore\' ORDER BY path"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Landroidx/appcompat/app/b$a;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v4

    invoke-static {}, Lcom/digdroid/alman/dig/q3;->c()I

    move-result v5

    invoke-direct {v3, v4, v5}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v4, 0x7f110125

    invoke-virtual {v3, v4}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    new-instance v4, Lcom/digdroid/alman/dig/r2$l0;

    invoke-direct {v4, p0, v2, v0, p1}, Lcom/digdroid/alman/dig/r2$l0;-><init>(Lcom/digdroid/alman/dig/r2;Ljava/util/ArrayList;Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;)V

    const-string v5, "selected"

    const-string v6, "path"

    invoke-virtual {v3, v0, v5, v6, v4}, Landroidx/appcompat/app/b$a;->j(Landroid/database/Cursor;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnMultiChoiceClickListener;)Landroidx/appcompat/app/b$a;

    const v4, 0x7f1100bc

    invoke-virtual {v3, v4, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    const v4, 0x7f11001c

    invoke-virtual {v3, v4, v1}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    const v4, 0x7f1100cb

    invoke-virtual {v3, v4, v1}, Landroidx/appcompat/app/b$a;->m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    invoke-virtual {v3}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v1

    iput-object v1, p0, Lcom/digdroid/alman/dig/r2;->r0:Landroidx/appcompat/app/b;

    new-instance v3, Lcom/digdroid/alman/dig/r2$m0;

    invoke-direct {v3, p0, v2, v0, p1}, Lcom/digdroid/alman/dig/r2$m0;-><init>(Lcom/digdroid/alman/dig/r2;Ljava/util/ArrayList;Landroid/database/Cursor;Landroid/database/sqlite/SQLiteDatabase;)V

    invoke-virtual {v1, v3}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2;->r0:Landroidx/appcompat/app/b;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method
