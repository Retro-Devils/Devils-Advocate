.class Lcom/digdroid/alman/dig/d0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/android/billingclient/api/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/d0$s;,
        Lcom/digdroid/alman/dig/d0$q;,
        Lcom/digdroid/alman/dig/d0$p;,
        Lcom/digdroid/alman/dig/d0$r;
    }
.end annotation


# static fields
.field private static a:Lcom/digdroid/alman/dig/d0;


# instance fields
.field private b:[I

.field private c:[I

.field d:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private e:[Z

.field private f:[I

.field private g:Lcom/digdroid/alman/dig/n;

.field private h:Z

.field public i:Z

.field j:Ljava/lang/String;

.field k:Ljava/lang/String;

.field l:Lcom/android/billingclient/api/d;

.field m:Landroid/app/Activity;

.field n:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xf

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    iput-object v1, p0, Lcom/digdroid/alman/dig/d0;->b:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    iput-object v0, p0, Lcom/digdroid/alman/dig/d0;->c:[I

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/d0;->h:Z

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/d0;->i:Z

    iput-object v0, p0, Lcom/digdroid/alman/dig/d0;->j:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/d0;->k:Ljava/lang/String;

    iput-object v0, p0, Lcom/digdroid/alman/dig/d0;->l:Lcom/android/billingclient/api/d;

    iput-object v0, p0, Lcom/digdroid/alman/dig/d0;->n:Ljava/lang/String;

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x2
        0x4
        0x6
        0x5
        0x7
        0x8
        0xa
        0xb
        0xf
        0x10
        0x13
        0x14
        0x11
        0xc
    .end array-data

    :array_1
    .array-data 4
        0x7f11028f
        0x7f110297
        0x7f11022a
        0x7f110189
        0x7f1100ce
        0x7f110262
        0x7f11006f
        0x7f1100cd
        0x7f1100f9
        0x7f1100fc
        0x7f110071
        0x7f110140
        0x7f1101fe
        0x7f110236
        0x7f110121
    .end array-data
.end method

.method private declared-synchronized A(Landroid/content/Context;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "features.cfg"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/n;->r(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private C(Landroid/app/Activity;IZILjava/lang/String;Lcom/digdroid/alman/dig/d0$r;)V
    .locals 14

    move-object v8, p0

    move-object v9, p1

    move/from16 v10, p2

    iget-object v0, v8, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "not_again"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v10}, Lcom/digdroid/alman/dig/d0;->u(I)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface/range {p6 .. p6}, Lcom/digdroid/alman/dig/d0$r;->a()V

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, v8, Lcom/digdroid/alman/dig/d0;->b:[I

    array-length v3, v2

    const-string v4, ""

    if-ge v1, v3, :cond_2

    aget v2, v2, v1

    if-ne v2, v10, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v8, Lcom/digdroid/alman/dig/d0;->c:[I

    aget v1, v3, v1

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\" "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    move-object v1, v4

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f110139

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f110068

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v3, p4

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "3"

    invoke-virtual {v1, v4, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    const v4, 0x7f0c00c3

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    const v4, 0x7f090289

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f0902d8

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    invoke-static {v4}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    new-instance v4, Lcom/digdroid/alman/dig/d0$g;

    invoke-direct {v4, p0, v10, v1, p1}, Lcom/digdroid/alman/dig/d0$g;-><init>(Lcom/digdroid/alman/dig/d0;ILandroid/widget/CheckBox;Landroid/app/Activity;)V

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0, v10}, Lcom/digdroid/alman/dig/d0;->u(I)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v0, 0x8

    :cond_3
    invoke-virtual {v1, v0}, Landroid/widget/CheckBox;->setVisibility(I)V

    new-instance v0, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {v0, p1, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v2}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object v11

    const v12, 0x7f1101d8

    new-instance v13, Lcom/digdroid/alman/dig/d0$i;

    move-object v0, v13

    move-object v1, p0

    move-object v2, p1

    move/from16 v3, p4

    move/from16 v4, p3

    move-object/from16 v5, p5

    move/from16 v6, p2

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/digdroid/alman/dig/d0$i;-><init>(Lcom/digdroid/alman/dig/d0;Landroid/app/Activity;IZLjava/lang/String;ILcom/digdroid/alman/dig/d0$r;)V

    invoke-virtual {v11, v12, v13}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f110148

    new-instance v2, Lcom/digdroid/alman/dig/d0$h;

    move-object/from16 v3, p6

    invoke-direct {v2, p0, v10, v3, p1}, Lcom/digdroid/alman/dig/d0$h;-><init>(Lcom/digdroid/alman/dig/d0;ILcom/digdroid/alman/dig/d0$r;Landroid/app/Activity;)V

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method private declared-synchronized D(I)V
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "trial_ends"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/32 v4, -0x65813800

    add-long/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized E(II)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "premium"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method static synthetic b(Lcom/digdroid/alman/dig/d0;)Lcom/digdroid/alman/dig/n;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    return-object p0
.end method

.method static synthetic c(Lcom/digdroid/alman/dig/d0;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->A(Landroid/content/Context;)V

    return-void
.end method

.method static synthetic d(Lcom/digdroid/alman/dig/d0;I)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->u(I)Z

    move-result p0

    return p0
.end method

.method static synthetic e(Lcom/digdroid/alman/dig/d0;Ljava/lang/String;Z)I
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/digdroid/alman/dig/d0;->n(Ljava/lang/String;Z)I

    move-result p0

    return p0
.end method

.method static synthetic f(Lcom/digdroid/alman/dig/d0;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/digdroid/alman/dig/d0;->h:Z

    return p0
.end method

.method static synthetic g(Lcom/digdroid/alman/dig/d0;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/d0;->h:Z

    return p1
.end method

.method static synthetic h(Lcom/digdroid/alman/dig/d0;Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/digdroid/alman/dig/d0;->l(Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$q;)V

    return-void
.end method

.method static synthetic i(Lcom/digdroid/alman/dig/d0;Landroid/app/Activity;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/d0;->j(Landroid/app/Activity;ILjava/lang/String;)V

    return-void
.end method

.method private j(Landroid/app/Activity;ILjava/lang/String;)V
    .locals 6

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v0, -0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eq p2, v0, :cond_6

    const/4 v0, -0x1

    if-eq p2, v0, :cond_6

    const/4 v0, 0x5

    const v3, 0x7f11004f

    const/4 v4, 0x1

    if-eq p2, v0, :cond_5

    const/4 v0, 0x7

    if-eq p2, v0, :cond_3

    if-eq p2, v4, :cond_2

    const/4 p3, 0x2

    if-eq p2, p3, :cond_1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    invoke-virtual {p1, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_3

    :cond_1
    const p2, 0x7f1101c7

    goto :goto_2

    :cond_2
    move-object p2, v2

    goto :goto_3

    :cond_3
    const p2, 0x7f110028

    invoke-virtual {p1, p2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    if-eqz p3, :cond_7

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->x(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_purchased"

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "true"

    invoke-virtual {v0, v3, v5}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const-string v0, "unlock_features"

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iput-boolean v4, p0, Lcom/digdroid/alman/dig/d0;->h:Z

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    invoke-virtual {v0, p3}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p0, p3, v1}, Lcom/digdroid/alman/dig/d0;->n(Ljava/lang/String;Z)I

    :goto_1
    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->A(Landroid/content/Context;)V

    goto :goto_3

    :cond_5
    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->x(Landroid/content/Context;)V

    iget-object p3, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    const-string v0, "developer_error"

    const-string v5, "1"

    invoke-virtual {p3, v0, v5}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->A(Landroid/content/Context;)V

    iput-boolean v4, p0, Lcom/digdroid/alman/dig/d0;->h:Z

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_0

    :cond_6
    const p2, 0x7f11023e

    :goto_2
    invoke-virtual {p1, p2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_7
    :goto_3
    if-eqz p2, :cond_8

    new-instance p3, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v0

    invoke-direct {p3, p1, v0}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p3, p2}, Landroidx/appcompat/app/b$a;->i(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const p2, 0x7f1101d8

    invoke-virtual {p1, p2, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    :cond_8
    :goto_4
    return-void
.end method

.method private l(Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$q;)V
    .locals 9

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->x(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    const-string v1, "unlock_features_purchased"

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "true"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iput-boolean v2, p0, Lcom/digdroid/alman/dig/d0;->h:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    const-string v0, "unlock_features"

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-interface {p2}, Lcom/digdroid/alman/dig/d0$q;->a()V

    return-void

    :cond_1
    const/4 v0, 0x5

    new-array v3, v0, [Ljava/lang/String;

    const-string v4, "features12"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-string v4, "features34"

    aput-object v4, v3, v2

    const/4 v2, 0x2

    const-string v4, "features56"

    aput-object v4, v3, v2

    const/4 v2, 0x3

    const-string v4, "features78"

    aput-object v4, v3, v2

    const/4 v2, 0x4

    const-string v4, "features910"

    aput-object v4, v3, v2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    aget-object v4, v3, v2

    iget-object v6, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "_purchased"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, p0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    invoke-virtual {v6, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    invoke-virtual {v6, v4}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4, v5}, Lcom/digdroid/alman/dig/d0;->n(Ljava/lang/String;Z)I

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/digdroid/alman/dig/d0$b;

    invoke-direct {v0, p0, p2, p1}, Lcom/digdroid/alman/dig/d0$b;-><init>(Lcom/digdroid/alman/dig/d0;Lcom/digdroid/alman/dig/d0$q;Landroid/app/Activity;)V

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/d0;->G(Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$p;)V

    :cond_4
    :goto_1
    return-void
.end method

.method private n(Ljava/lang/String;Z)I
    .locals 4

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    new-array p1, v1, [I

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0;->f:[I

    :cond_0
    return v1

    :cond_1
    const-string v0, ","

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    new-array p1, v1, [Ljava/lang/String;

    :cond_2
    if-eqz p2, :cond_3

    array-length v0, p1

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/digdroid/alman/dig/d0;->f:[I

    :cond_3
    :goto_0
    array-length v0, p1

    if-ge v1, v0, :cond_6

    :try_start_0
    aget-object v0, p1, v1

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-eqz p2, :cond_4

    iget-object v2, p0, Lcom/digdroid/alman/dig/d0;->f:[I

    aput v0, v2, v1

    :cond_4
    iget-object v2, p0, Lcom/digdroid/alman/dig/d0;->e:[Z

    const/4 v3, 0x1

    aput-boolean v3, v2, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    if-eqz p2, :cond_5

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->f:[I

    const/4 v2, -0x1

    aput v2, v0, v1

    :cond_5
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    array-length p1, p1

    return p1
.end method

.method public static declared-synchronized p()Lcom/digdroid/alman/dig/d0;
    .locals 2

    const-class v0, Lcom/digdroid/alman/dig/d0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/digdroid/alman/dig/d0;->a:Lcom/digdroid/alman/dig/d0;

    if-nez v1, :cond_0

    new-instance v1, Lcom/digdroid/alman/dig/d0;

    invoke-direct {v1}, Lcom/digdroid/alman/dig/d0;-><init>()V

    sput-object v1, Lcom/digdroid/alman/dig/d0;->a:Lcom/digdroid/alman/dig/d0;

    :cond_0
    sget-object v1, Lcom/digdroid/alman/dig/d0;->a:Lcom/digdroid/alman/dig/d0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private t(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V
    .locals 5

    invoke-direct {p0, p2}, Lcom/digdroid/alman/dig/d0;->u(I)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "not_again"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p3}, Lcom/digdroid/alman/dig/d0$r;->a()V

    return-void

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/digdroid/alman/dig/d0;->b:[I

    array-length v3, v2

    if-ge v1, v3, :cond_2

    aget v2, v2, v1

    if-ne v2, p2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/digdroid/alman/dig/d0;->c:[I

    aget v1, v3, v1

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\" "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const-string v1, ""

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f110139

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v0, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f1100f3

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ". \n\n"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f110059

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/d0;->o()Ljava/lang/String;

    move-result-object v3

    const-string v4, "$1"

    invoke-virtual {v1, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/d0;->i:Z

    if-nez v2, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v1, 0x7f11027e

    invoke-virtual {p1, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/d0;->q()Ljava/lang/String;

    move-result-object v3

    const-string v4, "$4"

    invoke-virtual {v1, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "?"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f0c00c3

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f090289

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f0902d8

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    if-nez v0, :cond_5

    invoke-static {v1}, Lcom/digdroid/alman/dig/p3;->s(Landroid/widget/TextView;)V

    new-instance v3, Lcom/digdroid/alman/dig/d0$j;

    invoke-direct {v3, p0, p2, v1, p1}, Lcom/digdroid/alman/dig/d0$j;-><init>(Lcom/digdroid/alman/dig/d0;ILandroid/widget/CheckBox;Landroid/app/Activity;)V

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_5
    const/16 p2, 0x8

    invoke-virtual {v1, p2}, Landroid/widget/CheckBox;->setVisibility(I)V

    :goto_2
    new-instance p2, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v1

    invoke-direct {p2, p1, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p2, v2}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object p2

    const v1, 0x7f11027d

    new-instance v2, Lcom/digdroid/alman/dig/d0$k;

    invoke-direct {v2, p0, p1}, Lcom/digdroid/alman/dig/d0$k;-><init>(Lcom/digdroid/alman/dig/d0;Landroid/app/Activity;)V

    invoke-virtual {p2, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object p2

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/d0;->i:Z

    if-nez v1, :cond_6

    const v1, 0x7f11027f

    new-instance v2, Lcom/digdroid/alman/dig/d0$l;

    invoke-direct {v2, p0, p1}, Lcom/digdroid/alman/dig/d0$l;-><init>(Lcom/digdroid/alman/dig/d0;Landroid/app/Activity;)V

    invoke-virtual {p2, v1, v2}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    :cond_6
    const p1, 0x7f1101d7

    new-instance v1, Lcom/digdroid/alman/dig/d0$m;

    invoke-direct {v1, p0, v0, p3}, Lcom/digdroid/alman/dig/d0$m;-><init>(Lcom/digdroid/alman/dig/d0;ZLcom/digdroid/alman/dig/d0$r;)V

    invoke-virtual {p2, p1, v1}, Landroidx/appcompat/app/b$a;->m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    invoke-virtual {p2}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method private declared-synchronized u(I)Z
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "trial_ends"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long p1, v2, v4

    if-lez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized w(I)Z
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "premium"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "1"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized x(Landroid/content/Context;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    if-nez v0, :cond_4

    new-instance v0, Lcom/digdroid/alman/dig/n;

    invoke-direct {v0, p1}, Lcom/digdroid/alman/dig/n;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "features.cfg"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n;->k(Ljava/io/File;)V

    const/16 v0, 0x15

    new-array v1, v0, [Z

    iput-object v1, p0, Lcom/digdroid/alman/dig/d0;->e:[Z

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Lcom/digdroid/alman/dig/d0;->e:[Z

    aput-boolean v1, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_1
    iget-object v2, p0, Lcom/digdroid/alman/dig/d0;->b:[I

    array-length v3, v2

    const/4 v4, 0x1

    if-ge v1, v3, :cond_2

    aget v2, v2, v1

    invoke-direct {p0, v2}, Lcom/digdroid/alman/dig/d0;->w(I)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->b:[I

    aget v0, v0, v1

    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/d0;->D(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->b:[I

    aget v0, v0, v1

    invoke-direct {p0, v0, v4}, Lcom/digdroid/alman/dig/d0;->E(II)V

    const/4 v0, 0x1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->A(Landroid/content/Context;)V

    :cond_3
    iget-object p1, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    const-string v0, "free_features"

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v4}, Lcom/digdroid/alman/dig/d0;->n(Ljava/lang/String;Z)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_3

    :goto_2
    throw p1

    :goto_3
    goto :goto_2
.end method


# virtual methods
.method public B(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$s;)V
    .locals 12

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->x(Landroid/content/Context;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/digdroid/alman/dig/d0;->b:[I

    array-length v4, v3

    if-ge v1, v4, :cond_1

    iget-object v4, p0, Lcom/digdroid/alman/dig/d0;->e:[Z

    aget v3, v3, v1

    aget-boolean v3, v4, v3

    if-nez v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    new-array v1, v2, [Ljava/lang/String;

    new-array v7, v2, [I

    new-array v6, v2, [Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_1
    iget-object v4, p0, Lcom/digdroid/alman/dig/d0;->b:[I

    array-length v5, v4

    if-ge v2, v5, :cond_3

    iget-object v5, p0, Lcom/digdroid/alman/dig/d0;->e:[Z

    aget v4, v4, v2

    aget-boolean v4, v5, v4

    if-nez v4, :cond_2

    iget-object v4, p0, Lcom/digdroid/alman/dig/d0;->c:[I

    aget v4, v4, v2

    invoke-virtual {p1, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    iget-object v4, p0, Lcom/digdroid/alman/dig/d0;->b:[I

    aget v4, v4, v2

    aput v4, v7, v3

    aput-boolean v0, v6, v3

    add-int/lit8 v3, v3, 0x1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    const v2, 0x7f110233

    invoke-virtual {p1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "2"

    invoke-virtual {v2, v4, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v11

    new-instance v2, Landroidx/appcompat/app/b$a;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v3

    invoke-direct {v2, p1, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v11}, Landroidx/appcompat/app/b$a;->s(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v2

    new-instance v3, Lcom/digdroid/alman/dig/d0$e;

    invoke-direct {v3, p0, v6}, Lcom/digdroid/alman/dig/d0$e;-><init>(Lcom/digdroid/alman/dig/d0;[Z)V

    invoke-virtual {v2, v1, v6, v3}, Landroidx/appcompat/app/b$a;->k([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    const v2, 0x7f1101d8

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    const v2, 0x7f11005a

    invoke-virtual {v1, v2, v3}, Landroidx/appcompat/app/b$a;->l(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    new-instance v1, Lcom/digdroid/alman/dig/d0$f;

    move-object v3, v1

    move-object v4, p0

    move-object v5, v0

    move v8, p2

    move-object v9, p3

    move-object v10, p1

    invoke-direct/range {v3 .. v11}, Lcom/digdroid/alman/dig/d0$f;-><init>(Lcom/digdroid/alman/dig/d0;Landroidx/appcompat/app/b;[Z[IILcom/digdroid/alman/dig/d0$s;Landroid/app/Activity;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public F(Landroid/content/Context;Lorg/json/JSONArray;)V
    .locals 8

    const/16 v0, 0x15

    new-array v1, v0, [Z

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    aput-boolean v2, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->x(Landroid/content/Context;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v5

    const/4 v6, 0x1

    if-ge v3, v5, :cond_2

    :try_start_0
    invoke-virtual {p2, v3}, Lorg/json/JSONArray;->getInt(I)I

    move-result v5

    aput-boolean v6, v1, v5

    invoke-direct {p0, v5}, Lcom/digdroid/alman/dig/d0;->w(I)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-direct {p0, v5}, Lcom/digdroid/alman/dig/d0;->D(I)V

    invoke-direct {p0, v5, v6}, Lcom/digdroid/alman/dig/d0;->E(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v4, 0x1

    :catch_0
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    :goto_2
    if-ge p2, v0, :cond_4

    aget-boolean v3, v1, p2

    if-nez v3, :cond_3

    invoke-direct {p0, p2}, Lcom/digdroid/alman/dig/d0;->w(I)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-direct {p0, p2, v2}, Lcom/digdroid/alman/dig/d0;->E(II)V

    const/4 v4, 0x1

    :cond_3
    add-int/lit8 p2, p2, 0x1

    goto :goto_2

    :cond_4
    if-eqz v4, :cond_5

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->A(Landroid/content/Context;)V

    :cond_5
    return-void
.end method

.method G(Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$p;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->l:Lcom/android/billingclient/api/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-interface {p2}, Lcom/digdroid/alman/dig/d0$p;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/d0;->m()V

    invoke-static {p1}, Lcom/android/billingclient/api/d;->e(Landroid/content/Context;)Lcom/android/billingclient/api/d$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/android/billingclient/api/d$b;->c(Lcom/android/billingclient/api/k;)Lcom/android/billingclient/api/d$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d$b;->b()Lcom/android/billingclient/api/d$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/d$b;->a()Lcom/android/billingclient/api/d;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0;->l:Lcom/android/billingclient/api/d;

    new-instance v0, Lcom/digdroid/alman/dig/d0$n;

    invoke-direct {v0, p0, p2}, Lcom/digdroid/alman/dig/d0$n;-><init>(Lcom/digdroid/alman/dig/d0;Lcom/digdroid/alman/dig/d0$p;)V

    invoke-virtual {p1, v0}, Lcom/android/billingclient/api/d;->h(Lcom/android/billingclient/api/f;)V

    :catch_0
    :goto_0
    return-void
.end method

.method H(Landroid/app/Activity;)V
    .locals 1

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0;->m:Landroid/app/Activity;

    new-instance v0, Lcom/digdroid/alman/dig/d0$c;

    invoke-direct {v0, p0, p1}, Lcom/digdroid/alman/dig/d0$c;-><init>(Lcom/digdroid/alman/dig/d0;Landroid/app/Activity;)V

    invoke-virtual {p0, p1, v0}, Lcom/digdroid/alman/dig/d0;->G(Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$p;)V

    return-void
.end method

.method I(Landroid/app/Activity;)V
    .locals 2

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0;->m:Landroid/app/Activity;

    new-instance v0, Lcom/digdroid/alman/dig/d0$d;

    invoke-direct {v0, p0, p1}, Lcom/digdroid/alman/dig/d0$d;-><init>(Lcom/digdroid/alman/dig/d0;Landroid/app/Activity;)V

    const/4 v1, 0x2

    invoke-virtual {p0, p1, v1, v0}, Lcom/digdroid/alman/dig/d0;->B(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$s;)V

    return-void
.end method

.method public a(Lcom/android/billingclient/api/h;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/billingclient/api/h;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->c()I

    move-result v0

    if-nez v0, :cond_0

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/billingclient/api/Purchase;

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->m:Landroid/app/Activity;

    invoke-virtual {p0, v0, p2}, Lcom/digdroid/alman/dig/d0;->z(Landroid/app/Activity;Lcom/android/billingclient/api/Purchase;)V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/d0;->m:Landroid/app/Activity;

    invoke-virtual {p1}, Lcom/android/billingclient/api/h;->c()I

    move-result p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->n:Ljava/lang/String;

    invoke-direct {p0, p2, p1, v0}, Lcom/digdroid/alman/dig/d0;->j(Landroid/app/Activity;ILjava/lang/String;)V

    :cond_1
    return-void
.end method

.method public k(Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$q;)V
    .locals 2

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/d0;->h:Z

    if-eqz v0, :cond_0

    invoke-interface {p2}, Lcom/digdroid/alman/dig/d0$q;->a()V

    return-void

    :cond_0
    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->x(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    const-string v1, "developer_error"

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lcom/digdroid/alman/dig/d0$a;

    invoke-direct {v0, p0, p2, p1}, Lcom/digdroid/alman/dig/d0$a;-><init>(Lcom/digdroid/alman/dig/d0;Lcom/digdroid/alman/dig/d0$q;Landroid/app/Activity;)V

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/f;->g(Landroid/content/Context;Lcom/digdroid/alman/dig/f$g;)Lcom/digdroid/alman/dig/f;

    move-result-object p1

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/f;->d()V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/digdroid/alman/dig/d0;->l(Landroid/app/Activity;Lcom/digdroid/alman/dig/d0$q;)V

    :goto_0
    return-void
.end method

.method m()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->l:Lcom/android/billingclient/api/d;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Lcom/android/billingclient/api/d;->b()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/d0;->l:Lcom/android/billingclient/api/d;

    return-void
.end method

.method public o()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->k:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "US $1"

    :cond_0
    return-object v0
.end method

.method public q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->j:Ljava/lang/String;

    if-nez v0, :cond_0

    const-string v0, "US $4"

    :cond_0
    return-object v0
.end method

.method public r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/digdroid/alman/dig/d0;->s(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;Z)V

    return-void
.end method

.method public s(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;Z)V
    .locals 9

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_6

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_c

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/d0;->h:Z

    if-eqz v0, :cond_1

    goto/16 :goto_5

    :cond_1
    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->x(Landroid/content/Context;)V

    invoke-direct {p0, p2}, Lcom/digdroid/alman/dig/d0;->w(I)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/digdroid/alman/dig/d0;->e:[Z

    aget-boolean v0, v0, p2

    if-eqz v0, :cond_2

    goto/16 :goto_4

    :cond_2
    if-eqz p4, :cond_4

    invoke-direct {p0, p2}, Lcom/digdroid/alman/dig/d0;->u(I)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-interface {p3}, Lcom/digdroid/alman/dig/d0$r;->b()V

    goto :goto_0

    :cond_3
    invoke-interface {p3}, Lcom/digdroid/alman/dig/d0$r;->a()V

    :goto_0
    return-void

    :cond_4
    iget-object p4, p0, Lcom/digdroid/alman/dig/d0;->f:[I

    array-length p4, p4

    if-nez p4, :cond_5

    const/4 v3, 0x1

    const/4 v4, 0x3

    const-string v5, "free_features"

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Lcom/digdroid/alman/dig/d0;->C(Landroid/app/Activity;IZILjava/lang/String;Lcom/digdroid/alman/dig/d0$r;)V

    goto/16 :goto_3

    :cond_5
    iget-object p4, p0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    const-string v0, "features12"

    invoke-virtual {p4, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p4

    const-string v1, ""

    if-eqz p4, :cond_6

    iget-object p4, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    invoke-virtual {p4, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_6

    const/4 v5, 0x0

    const/4 v6, 0x2

    const-string v7, "features12"

    :goto_2
    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v8, p3

    invoke-direct/range {v2 .. v8}, Lcom/digdroid/alman/dig/d0;->C(Landroid/app/Activity;IZILjava/lang/String;Lcom/digdroid/alman/dig/d0$r;)V

    goto/16 :goto_3

    :cond_6
    iget-object p4, p0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    const-string v0, "features34"

    invoke-virtual {p4, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_7

    iget-object p4, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    invoke-virtual {p4, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_7

    const/4 v5, 0x0

    const/4 v6, 0x2

    const-string v7, "features34"

    goto :goto_2

    :cond_7
    iget-object p4, p0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    const-string v0, "features56"

    invoke-virtual {p4, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_8

    iget-object p4, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    invoke-virtual {p4, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_8

    const/4 v5, 0x0

    const/4 v6, 0x2

    const-string v7, "features56"

    goto :goto_2

    :cond_8
    iget-object p4, p0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    const-string v0, "features78"

    invoke-virtual {p4, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_9

    iget-object p4, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    invoke-virtual {p4, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_9

    const/4 v5, 0x0

    const/4 v6, 0x2

    const-string v7, "features78"

    goto :goto_2

    :cond_9
    iget-object p4, p0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    const-string v0, "features910"

    invoke-virtual {p4, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_a

    iget-object p4, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    invoke-virtual {p4, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_a

    const/4 v3, 0x0

    const/4 v4, 0x2

    const-string v5, "features910"

    goto/16 :goto_1

    :cond_a
    invoke-direct {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/d0;->t(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    :goto_3
    return-void

    :cond_b
    :goto_4
    invoke-interface {p3}, Lcom/digdroid/alman/dig/d0$r;->a()V

    return-void

    :cond_c
    :goto_5
    invoke-interface {p3}, Lcom/digdroid/alman/dig/d0$r;->a()V

    :cond_d
    :goto_6
    return-void
.end method

.method public v()Z
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/d0;->h:Z

    return v0
.end method

.method public y()V
    .locals 0

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/d0;->m()V

    return-void
.end method

.method z(Landroid/app/Activity;Lcom/android/billingclient/api/Purchase;)V
    .locals 6

    invoke-virtual {p2}, Lcom/android/billingclient/api/Purchase;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_7

    invoke-virtual {p2}, Lcom/android/billingclient/api/Purchase;->f()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->x(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "_purchased"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "true"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v3}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->A(Landroid/content/Context;)V

    :cond_0
    const-string v2, "unlock_features"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/d0;->h:Z

    :cond_1
    invoke-virtual {p2}, Lcom/android/billingclient/api/Purchase;->g()Z

    move-result v3

    const-string v4, ""

    const/4 v5, 0x0

    if-nez v3, :cond_3

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v4, v5}, Lcom/digdroid/alman/dig/d0;->n(Ljava/lang/String;Z)I

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/d0;->i:Z

    :cond_2
    invoke-static {}, Lcom/android/billingclient/api/a;->e()Lcom/android/billingclient/api/a$b;

    move-result-object p1

    invoke-virtual {p1, v4}, Lcom/android/billingclient/api/a$b;->b(Ljava/lang/String;)Lcom/android/billingclient/api/a$b;

    move-result-object p1

    invoke-virtual {p2}, Lcom/android/billingclient/api/Purchase;->d()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/android/billingclient/api/a$b;->c(Ljava/lang/String;)Lcom/android/billingclient/api/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/android/billingclient/api/a$b;->a()Lcom/android/billingclient/api/a;

    move-result-object p1

    iget-object p2, p0, Lcom/digdroid/alman/dig/d0;->l:Lcom/android/billingclient/api/d;

    new-instance v0, Lcom/digdroid/alman/dig/d0$o;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/d0$o;-><init>(Lcom/digdroid/alman/dig/d0;)V

    invoke-virtual {p2, p1, v0}, Lcom/android/billingclient/api/d;->a(Lcom/android/billingclient/api/a;Lcom/android/billingclient/api/b;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {p2}, Lcom/android/billingclient/api/Purchase;->a()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_4

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-direct {p0, p2, v5}, Lcom/digdroid/alman/dig/d0;->n(Ljava/lang/String;Z)I

    move-result v2

    if-lez v2, :cond_5

    iget-object v2, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    invoke-virtual {v2, v0, p2}, Lcom/digdroid/alman/dig/n;->s(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/d0;->A(Landroid/content/Context;)V

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/digdroid/alman/dig/d0;->g:Lcom/digdroid/alman/dig/n;

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, v5}, Lcom/digdroid/alman/dig/d0;->n(Ljava/lang/String;Z)I

    :cond_5
    :goto_0
    iput-boolean v1, p0, Lcom/digdroid/alman/dig/d0;->i:Z

    :cond_6
    :goto_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/d0;->d:Ljava/util/HashSet;

    const-string p2, "features910"

    invoke-virtual {p1, p2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    iput-boolean v1, p0, Lcom/digdroid/alman/dig/d0;->h:Z

    :cond_7
    return-void
.end method
