.class public Lcom/digdroid/alman/dig/y;
.super Landroid/app/DialogFragment;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/y$m;,
        Lcom/digdroid/alman/dig/y$l;
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Z

.field private f:Lc/d/a/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/d/a/a<",
            "Lcom/digdroid/alman/dig/y$m;",
            ">;"
        }
    .end annotation
.end field

.field private g:Landroid/widget/Button;

.field private h:Landroid/widget/Button;

.field private i:Landroid/widget/ImageButton;

.field private j:Landroid/widget/ImageButton;

.field private k:Landroid/widget/TextView;

.field private l:Landroid/widget/ListView;

.field private m:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private o:Ljava/io/File;

.field private p:[Ljava/io/File;

.field private q:Landroid/os/FileObserver;

.field private r:Z

.field private s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/digdroid/alman/dig/y;

    const-class v0, Lcom/digdroid/alman/dig/y;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/digdroid/alman/dig/y;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/y;->e:Z

    invoke-static {}, Lc/d/a/a;->b()Lc/d/a/a;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/y;->f:Lc/d/a/a;

    return-void
.end method

.method private A(Ljava/lang/String;)Landroid/os/FileObserver;
    .locals 2

    new-instance v0, Lcom/digdroid/alman/dig/y$k;

    const/16 v1, 0x3c0

    invoke-direct {v0, p0, p1, v1}, Lcom/digdroid/alman/dig/y$k;-><init>(Lcom/digdroid/alman/dig/y;Ljava/lang/String;I)V

    return-object v0
.end method

.method private B()I
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->o:Ljava/io/File;

    const v1, 0x7f1100a8

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->c:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->o:Ljava/io/File;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/digdroid/alman/dig/y;->o:Ljava/io/File;

    iget-object v3, p0, Lcom/digdroid/alman/dig/y;->c:Ljava/lang/String;

    invoke-direct {v0, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    const v0, 0x7f1100a9

    return v0

    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x7f1100ad

    return v0

    :cond_2
    return v1

    :cond_3
    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->o:Ljava/io/File;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/io/File;->canWrite()Z

    move-result v0

    if-nez v0, :cond_4

    const v0, 0x7f1100aa

    return v0

    :cond_4
    return v1
.end method

.method private static varargs C(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    sget-object v0, Lcom/digdroid/alman/dig/y;->b:Ljava/lang/String;

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method private D(Ljava/io/File;)Z
    .locals 0

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/y;->e:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/y;->r:Z

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static E()Lcom/digdroid/alman/dig/y;
    .locals 1

    new-instance v0, Lcom/digdroid/alman/dig/y;

    invoke-direct {v0}, Lcom/digdroid/alman/dig/y;-><init>()V

    return-object v0
.end method

.method private F()V
    .locals 8

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0050

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090297

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f090176

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iget-object v3, p0, Lcom/digdroid/alman/dig/y;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/digdroid/alman/dig/y;->c:Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    const v5, 0x7f1100ac

    invoke-virtual {p0, v5, v4}, Landroid/app/DialogFragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v4, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v5

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v7

    invoke-direct {v4, v5, v7}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    const v5, 0x7f1100ab

    invoke-virtual {v4, v5}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v4, Lcom/digdroid/alman/dig/y$i;

    invoke-direct {v4, p0}, Lcom/digdroid/alman/dig/y$i;-><init>(Lcom/digdroid/alman/dig/y;)V

    const v5, 0x7f11005b

    invoke-virtual {v0, v5, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v4, Lcom/digdroid/alman/dig/y$h;

    invoke-direct {v4, p0, v2}, Lcom/digdroid/alman/dig/y$h;-><init>(Lcom/digdroid/alman/dig/y;Landroid/widget/EditText;)V

    const v5, 0x7f110093

    invoke-virtual {v0, v5, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object v0

    const/4 v4, -0x1

    invoke-virtual {v0, v4}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    move-result-object v4

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-interface {v5}, Landroid/text/Editable;->length()I

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v4, v3}, Landroid/widget/Button;->setEnabled(Z)V

    new-instance v3, Lcom/digdroid/alman/dig/y$j;

    invoke-direct {v3, p0, v0, v1}, Lcom/digdroid/alman/dig/y$j;-><init>(Lcom/digdroid/alman/dig/y;Landroid/app/AlertDialog;Landroid/widget/TextView;)V

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    invoke-virtual {v2, v6}, Landroid/widget/EditText;->setVisibility(I)V

    return-void
.end method

.method private G()V
    .locals 3

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->o:Ljava/io/File;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->g:Landroid/widget/Button;

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/y;->r:Z

    if-eqz v1, :cond_0

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/y;->e:Z

    if-eqz v2, :cond_1

    :cond_0
    if-nez v1, :cond_2

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/y;->e:Z

    if-eqz v1, :cond_2

    :cond_1
    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setEnabled(Z)V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    :cond_3
    return-void
.end method

.method private H()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->o:Ljava/io/File;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lcom/digdroid/alman/dig/y;->z(Ljava/io/File;)V

    :cond_0
    return-void
.end method

.method private I()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->o:Ljava/io/File;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v1, v2

    const-string v0, "Returning %s as result"

    invoke-static {v0, v1}, Lcom/digdroid/alman/dig/y;->C(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->f:Lc/d/a/a;

    new-instance v1, Lcom/digdroid/alman/dig/y$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/y$a;-><init>(Lcom/digdroid/alman/dig/y;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->f:Lc/d/a/a;

    new-instance v1, Lcom/digdroid/alman/dig/y$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/y$b;-><init>(Lcom/digdroid/alman/dig/y;)V

    :goto_0
    invoke-virtual {v0, v1}, Lc/d/a/a;->a(Lc/d/a/b;)V

    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/y;)Ljava/io/File;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/y;->o:Ljava/io/File;

    return-object p0
.end method

.method static synthetic b(Lcom/digdroid/alman/dig/y;Ljava/io/File;)Ljava/io/File;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y;->o:Ljava/io/File;

    return-object p1
.end method

.method static synthetic c(Lcom/digdroid/alman/dig/y;Ljava/io/File;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/y;->D(Ljava/io/File;)Z

    move-result p0

    return p0
.end method

.method static synthetic d(Lcom/digdroid/alman/dig/y;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/digdroid/alman/dig/y;->r:Z

    return p0
.end method

.method static synthetic e(Lcom/digdroid/alman/dig/y;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/y;->r:Z

    return p1
.end method

.method static synthetic f(Lcom/digdroid/alman/dig/y;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/y;->s:Z

    return p1
.end method

.method static synthetic g(Lcom/digdroid/alman/dig/y;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/digdroid/alman/dig/y;->e:Z

    return p0
.end method

.method static synthetic h(Lcom/digdroid/alman/dig/y;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/y;->k:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic i(Lcom/digdroid/alman/dig/y;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/y;->n:Ljava/util/List;

    return-object p0
.end method

.method static synthetic j(Lcom/digdroid/alman/dig/y;)Landroid/widget/ArrayAdapter;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/y;->m:Landroid/widget/ArrayAdapter;

    return-object p0
.end method

.method static synthetic k(Lcom/digdroid/alman/dig/y;)Landroid/os/FileObserver;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/y;->q:Landroid/os/FileObserver;

    return-object p0
.end method

.method static synthetic l(Lcom/digdroid/alman/dig/y;Landroid/os/FileObserver;)Landroid/os/FileObserver;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y;->q:Landroid/os/FileObserver;

    return-object p1
.end method

.method static synthetic m(Lcom/digdroid/alman/dig/y;Ljava/lang/String;)Landroid/os/FileObserver;
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/y;->A(Ljava/lang/String;)Landroid/os/FileObserver;

    move-result-object p0

    return-object p0
.end method

.method static synthetic n(Lcom/digdroid/alman/dig/y;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/y;->G()V

    return-void
.end method

.method static synthetic o(Lcom/digdroid/alman/dig/y;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/y;->H()V

    return-void
.end method

.method static synthetic p(Lcom/digdroid/alman/dig/y;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/y;->I()V

    return-void
.end method

.method static synthetic q(Lcom/digdroid/alman/dig/y;)Lc/d/a/a;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/y;->f:Lc/d/a/a;

    return-object p0
.end method

.method static synthetic r(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/digdroid/alman/dig/y;->C(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic s(Lcom/digdroid/alman/dig/y;)[Ljava/io/File;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/y;->p:[Ljava/io/File;

    return-object p0
.end method

.method static synthetic t(Lcom/digdroid/alman/dig/y;[Ljava/io/File;)[Ljava/io/File;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y;->p:[Ljava/io/File;

    return-object p1
.end method

.method static synthetic u(Lcom/digdroid/alman/dig/y;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/y;->z(Ljava/io/File;)V

    return-void
.end method

.method static synthetic v(Lcom/digdroid/alman/dig/y;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/y;->F()V

    return-void
.end method

.method static synthetic w(Lcom/digdroid/alman/dig/y;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y;->c:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic x(Lcom/digdroid/alman/dig/y;)I
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/y;->B()I

    move-result p0

    return p0
.end method

.method private y()V
    .locals 7

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    const v1, 0xffffff

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    new-array v2, v2, [I

    const v3, 0x1010031

    const/4 v4, 0x0

    aput v3, v2, v4

    invoke-virtual {v0, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, v4, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    :cond_0
    const v2, 0xffffff

    :goto_0
    if-eq v2, v1, :cond_1

    const-wide v0, 0x3fcae147ae147ae1L    # 0.21

    invoke-static {v2}, Landroid/graphics/Color;->red(I)I

    move-result v3

    int-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v3, v3, v0

    const-wide v0, 0x3fe70a3d70a3d70aL    # 0.72

    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    move-result v5

    int-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v0

    add-double/2addr v3, v5

    const-wide v0, 0x3fb1eb851eb851ecL    # 0.07

    invoke-static {v2}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    int-to-double v5, v2

    invoke-static {v5, v6}, Ljava/lang/Double;->isNaN(D)Z

    mul-double v5, v5, v0

    add-double/2addr v3, v5

    const-wide/high16 v0, 0x4060000000000000L    # 128.0

    cmpg-double v2, v3, v0

    if-gez v2, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->i:Landroid/widget/ImageButton;

    const v1, 0x7f0701b6

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->j:Landroid/widget/ImageButton;

    const v1, 0x7f070093

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    :cond_1
    return-void
.end method

.method private z(Ljava/io/File;)V
    .locals 3

    if-eqz p1, :cond_0

    new-instance v0, Lcom/digdroid/alman/dig/y$l;

    invoke-direct {v0, p0}, Lcom/digdroid/alman/dig/y$l;-><init>(Lcom/digdroid/alman/dig/y;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/io/File;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    :cond_0
    return-void
.end method


# virtual methods
.method public J(Lcom/digdroid/alman/dig/y$m;)V
    .locals 0

    invoke-static {p1}, Lc/d/a/a;->c(Ljava/lang/Object;)Lc/d/a/a;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/y;->f:Lc/d/a/a;

    return-void
.end method

.method public K(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/y;->d:Ljava/lang/String;

    return-void
.end method

.method public L(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/y;->e:Z

    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onAttach(Landroid/app/Activity;)V

    instance-of v0, p1, Lcom/digdroid/alman/dig/y$m;

    if-eqz v0, :cond_0

    :goto_0
    check-cast p1, Lcom/digdroid/alman/dig/y$m;

    invoke-static {p1}, Lc/d/a/a;->d(Ljava/lang/Object;)Lc/d/a/a;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/y;->f:Lc/d/a/a;

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getTargetFragment()Landroid/app/Fragment;

    move-result-object p1

    instance-of v0, p1, Lcom/digdroid/alman/dig/y$m;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    const-string v0, "New folder"

    iput-object v0, p0, Lcom/digdroid/alman/dig/y;->c:Ljava/lang/String;

    if-eqz p1, :cond_0

    const-string v0, "CURRENT_DIRECTORY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/y;->d:Ljava/lang/String;

    const-string v0, "select_file"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/y;->e:Z

    :cond_0
    invoke-virtual {p0}, Landroid/app/DialogFragment;->getShowsDialog()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Landroid/app/DialogFragment;->setStyle(II)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Landroid/app/DialogFragment;->setHasOptionsMenu(Z)V

    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/y;->c:Ljava/lang/String;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "New directory name must have a strictly positive length (not zero) when user is not allowed to modify it."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    const v0, 0x7f0d0001

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const p2, 0x7f0902d1

    invoke-interface {p1, p2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/y;->o:Ljava/io/File;

    invoke-direct {p0, p2}, Lcom/digdroid/alman/dig/y;->D(Ljava/io/File;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/digdroid/alman/dig/y;->c:Ljava/lang/String;

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const p3, 0x7f0c0052

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0900b2

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, Lcom/digdroid/alman/dig/y;->g:Landroid/widget/Button;

    const p2, 0x7f0900b1

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Button;

    iput-object p2, p0, Lcom/digdroid/alman/dig/y;->h:Landroid/widget/Button;

    const p2, 0x7f0900b4

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageButton;

    iput-object p2, p0, Lcom/digdroid/alman/dig/y;->i:Landroid/widget/ImageButton;

    const p2, 0x7f0900b3

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageButton;

    iput-object p2, p0, Lcom/digdroid/alman/dig/y;->j:Landroid/widget/ImageButton;

    const p2, 0x7f09041e

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p0, Lcom/digdroid/alman/dig/y;->k:Landroid/widget/TextView;

    const p2, 0x7f090161

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ListView;

    iput-object p2, p0, Lcom/digdroid/alman/dig/y;->l:Landroid/widget/ListView;

    const p2, 0x7f09041f

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    const p3, 0x7f11023b

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/y;->g:Landroid/widget/Button;

    new-instance p3, Lcom/digdroid/alman/dig/y$c;

    invoke-direct {p3, p0}, Lcom/digdroid/alman/dig/y$c;-><init>(Lcom/digdroid/alman/dig/y;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/y;->h:Landroid/widget/Button;

    new-instance p3, Lcom/digdroid/alman/dig/y$d;

    invoke-direct {p3, p0}, Lcom/digdroid/alman/dig/y$d;-><init>(Lcom/digdroid/alman/dig/y;)V

    invoke-virtual {p2, p3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/y;->l:Landroid/widget/ListView;

    new-instance p3, Lcom/digdroid/alman/dig/y$e;

    invoke-direct {p3, p0}, Lcom/digdroid/alman/dig/y$e;-><init>(Lcom/digdroid/alman/dig/y;)V

    invoke-virtual {p2, p3}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/y;->i:Landroid/widget/ImageButton;

    new-instance p3, Lcom/digdroid/alman/dig/y$f;

    invoke-direct {p3, p0}, Lcom/digdroid/alman/dig/y$f;-><init>(Lcom/digdroid/alman/dig/y;)V

    invoke-virtual {p2, p3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/y;->j:Landroid/widget/ImageButton;

    new-instance p3, Lcom/digdroid/alman/dig/y$g;

    invoke-direct {p3, p0}, Lcom/digdroid/alman/dig/y$g;-><init>(Lcom/digdroid/alman/dig/y;)V

    invoke-virtual {p2, p3}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getShowsDialog()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/y;->j:Landroid/widget/ImageButton;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/widget/ImageButton;->setVisibility(I)V

    :cond_0
    invoke-direct {p0}, Lcom/digdroid/alman/dig/y;->y()V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/digdroid/alman/dig/y;->n:Ljava/util/List;

    new-instance p2, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Landroid/app/DialogFragment;->getActivity()Landroid/app/Activity;

    move-result-object p3

    const v0, 0x1090003

    iget-object v1, p0, Lcom/digdroid/alman/dig/y;->n:Ljava/util/List;

    invoke-direct {p2, p3, v0, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    iput-object p2, p0, Lcom/digdroid/alman/dig/y;->m:Landroid/widget/ArrayAdapter;

    iget-object p3, p0, Lcom/digdroid/alman/dig/y;->l:Landroid/widget/ListView;

    invoke-virtual {p3, p2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    new-instance p2, Ljava/io/File;

    iget-object p3, p0, Lcom/digdroid/alman/dig/y;->d:Ljava/lang/String;

    invoke-direct {p2, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/digdroid/alman/dig/y;->z(Ljava/io/File;)V

    return-object p1
.end method

.method public onDetach()V
    .locals 1

    invoke-super {p0}, Landroid/app/DialogFragment;->onDetach()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/digdroid/alman/dig/y;->f:Lc/d/a/a;

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f0902d1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/y;->F()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/DialogFragment;->onPause()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->q:Landroid/os/FileObserver;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/FileObserver;->stopWatching()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/DialogFragment;->onResume()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->q:Landroid/os/FileObserver;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/FileObserver;->startWatching()V

    :cond_0
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onSaveInstanceState(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/y;->d:Ljava/lang/String;

    const-string v1, "CURRENT_DIRECTORY"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/y;->e:Z

    const-string v1, "select_file"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method
