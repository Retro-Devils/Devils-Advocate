.class public Lcom/digdroid/alman/dig/v0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private A:Landroid/widget/ImageView;

.field private B:Lcom/digdroid/alman/dig/n2$g;

.field C:I

.field D:I

.field a:Lcom/digdroid/alman/dig/r1;

.field b:Lcom/digdroid/alman/dig/n2$f;

.field c:Lcom/digdroid/alman/dig/MainActivity;

.field d:Landroid/view/View;

.field e:Lcom/digdroid/alman/dig/g3;

.field f:Lcom/digdroid/alman/dig/b3;

.field g:Z

.field h:Z

.field i:Z

.field j:Z

.field k:Z

.field l:I

.field m:I

.field n:I

.field o:Ljava/lang/String;

.field p:Ljava/lang/String;

.field private q:Z

.field private r:I

.field private s:I

.field private t:I

.field private u:I

.field private v:I

.field private w:Ljava/lang/String;

.field x:Ljava/lang/String;

.field private y:Landroid/widget/TextView;

.field private z:Lcom/digdroid/alman/dig/n2;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/r1;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/v0;->q:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/digdroid/alman/dig/v0;->w:Ljava/lang/String;

    iput-object v1, p0, Lcom/digdroid/alman/dig/v0;->z:Lcom/digdroid/alman/dig/n2;

    const/4 v2, -0x1

    iput v2, p0, Lcom/digdroid/alman/dig/v0;->C:I

    iput v2, p0, Lcom/digdroid/alman/dig/v0;->D:I

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0;->a:Lcom/digdroid/alman/dig/r1;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v3

    check-cast v3, Lcom/digdroid/alman/dig/MainActivity;

    iput-object v3, p0, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0;->d:Landroid/view/View;

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {p1}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/b3;

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {p1, v1}, Lcom/digdroid/alman/dig/g3;->q(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/g3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0;->e:Lcom/digdroid/alman/dig/g3;

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/b3;

    const-string v1, "games_preview_enabled"

    invoke-virtual {p1, v1, v0}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/v0;->g:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/b3;

    const-string v1, "games_preview_lines"

    invoke-virtual {p1, v1, v2}, Lcom/digdroid/alman/dig/b3;->l(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/v0;->n:I

    const/4 v1, 0x1

    if-gez p1, :cond_1

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/b3;

    const-string v2, "games_preview_title"

    invoke-virtual {p1, v2, v1}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lcom/digdroid/alman/dig/v0;->n:I

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/b3;

    const-string v2, "games_preview_play"

    invoke-virtual {p1, v2, v1}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/v0;->h:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/b3;

    const-string v1, "games_preview_play_mobile"

    invoke-virtual {p1, v1, v0}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/v0;->i:Z

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/v0;->j:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/b3;

    const-string v1, "games_preview_mute"

    invoke-virtual {p1, v1, v0}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/v0;->k:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/b3;

    const/16 v0, 0x32

    const-string v1, "games_preview_size"

    invoke-virtual {p1, v1, v0}, Lcom/digdroid/alman/dig/b3;->l(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/v0;->l:I

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/b3;

    const/4 v0, 0x5

    const-string v1, "games_preview_padding"

    invoke-virtual {p1, v1, v0}, Lcom/digdroid/alman/dig/b3;->l(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/v0;->m:I

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {v0}, Lcom/digdroid/alman/dig/y3;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/Screenshots"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0;->o:Ljava/lang/String;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {v0}, Lcom/digdroid/alman/dig/y3;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/Covers"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0;->p:Ljava/lang/String;

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->d:Landroid/view/View;

    const v0, 0x7f0903ca

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/view/ViewStub;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/ViewStub;->inflate()Landroid/view/View;

    :cond_2
    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->d:Landroid/view/View;

    const v0, 0x7f0901b0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0;->y:Landroid/widget/TextView;

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->d:Landroid/view/View;

    const v0, 0x7f090352

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0;->A:Landroid/widget/ImageView;

    new-instance p1, Lcom/digdroid/alman/dig/v0$c;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/v0$c;-><init>(Lcom/digdroid/alman/dig/v0;)V

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0;->B:Lcom/digdroid/alman/dig/n2$g;

    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/v0;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/v0;->A:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic b(Lcom/digdroid/alman/dig/v0;)Lcom/digdroid/alman/dig/n2;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/v0;->z:Lcom/digdroid/alman/dig/n2;

    return-object p0
.end method


# virtual methods
.method public c()V
    .locals 7

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c005e

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090181

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Switch;

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/v0;->g:Z

    invoke-virtual {v1, v2}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/Switch;->setTextColor(I)V

    new-instance v2, Lcom/digdroid/alman/dig/v0$d;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/v0$d;-><init>(Lcom/digdroid/alman/dig/v0;)V

    invoke-virtual {v1, v2}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v1, 0x7f090389

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const v1, 0x7f09031f

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/SeekBar;

    const/16 v2, 0x3c

    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setMax(I)V

    iget v2, p0, Lcom/digdroid/alman/dig/v0;->l:I

    add-int/lit8 v2, v2, -0x14

    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setProgress(I)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setKeyProgressIncrement(I)V

    new-instance v3, Lcom/digdroid/alman/dig/v0$e;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/v0$e;-><init>(Lcom/digdroid/alman/dig/v0;)V

    invoke-virtual {v1, v3}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    const v1, 0x7f0902f7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const v1, 0x7f09031d

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/SeekBar;

    const/16 v3, 0x19

    invoke-virtual {v1, v3}, Landroid/widget/SeekBar;->setMax(I)V

    iget v3, p0, Lcom/digdroid/alman/dig/v0;->m:I

    invoke-virtual {v1, v3}, Landroid/widget/SeekBar;->setProgress(I)V

    invoke-virtual {v1, v2}, Landroid/widget/SeekBar;->setKeyProgressIncrement(I)V

    new-instance v3, Lcom/digdroid/alman/dig/v0$f;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/v0$f;-><init>(Lcom/digdroid/alman/dig/v0;)V

    invoke-virtual {v1, v3}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    const v1, 0x7f090403

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/String;

    iget-object v3, p0, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

    const v4, 0x7f1101cd

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v1, v4

    iget-object v3, p0, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

    const v5, 0x7f1101d9

    invoke-virtual {v3, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    iget-object v3, p0, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

    const v5, 0x7f110277

    invoke-virtual {v3, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x2

    aput-object v3, v1, v5

    iget-object v3, p0, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

    const v5, 0x7f1101da

    invoke-virtual {v3, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x3

    aput-object v3, v1, v5

    new-instance v3, Landroid/widget/ArrayAdapter;

    iget-object v5, p0, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

    const v6, 0x1090008

    invoke-direct {v3, v5, v6, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    const v1, 0x1090009

    invoke-virtual {v3, v1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    const v1, 0x7f090387

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Spinner;

    invoke-virtual {v1, v3}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    iget v3, p0, Lcom/digdroid/alman/dig/v0;->n:I

    invoke-virtual {v1, v3, v2}, Landroid/widget/Spinner;->setSelection(IZ)V

    invoke-virtual {v1}, Landroid/widget/Spinner;->getSelectedView()Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v2, Lcom/digdroid/alman/dig/v0$g;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/v0$g;-><init>(Lcom/digdroid/alman/dig/v0;)V

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    const v1, 0x7f090311

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Switch;

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/v0;->h:Z

    invoke-virtual {v1, v2}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/Switch;->setTextColor(I)V

    new-instance v2, Lcom/digdroid/alman/dig/v0$h;

    invoke-direct {v2, p0}, Lcom/digdroid/alman/dig/v0$h;-><init>(Lcom/digdroid/alman/dig/v0;)V

    invoke-virtual {v1, v2}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const v1, 0x7f090312

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Switch;

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/v0;->i:Z

    invoke-virtual {v1, v2}, Landroid/widget/Switch;->setChecked(Z)V

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/Switch;->setTextColor(I)V

    new-instance v2, Lcom/digdroid/alman/dig/v0$i;

    invoke-direct {v2, p0, v1}, Lcom/digdroid/alman/dig/v0$i;-><init>(Lcom/digdroid/alman/dig/v0;Landroid/widget/Switch;)V

    invoke-virtual {v1, v2}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    new-instance v1, Landroidx/appcompat/app/b$a;

    iget-object v2, p0, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v2, 0x7f1101fe

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/b$a;->r(I)Landroidx/appcompat/app/b$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v1, Lcom/digdroid/alman/dig/v0$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/v0$a;-><init>(Lcom/digdroid/alman/dig/v0;)V

    const v2, 0x7f1101d8

    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->z:Lcom/digdroid/alman/dig/n2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/n2;->r()V

    :cond_0
    return-void
.end method

.method e(I)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->a:Lcom/digdroid/alman/dig/r1;

    iget-boolean v1, v0, Lcom/digdroid/alman/dig/p1;->j0:Z

    if-nez v1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lcom/digdroid/alman/dig/v0;->D:I

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->z:Lcom/digdroid/alman/dig/n2;

    if-nez p1, :cond_1

    iget-object p1, v0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->v0()Lcom/digdroid/alman/dig/n2;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0;->z:Lcom/digdroid/alman/dig/n2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/n2;->n()Lcom/digdroid/alman/dig/n2$f;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0;->b:Lcom/digdroid/alman/dig/n2$f;

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->B:Lcom/digdroid/alman/dig/n2$g;

    iput-object v0, p1, Lcom/digdroid/alman/dig/n2$f;->a:Lcom/digdroid/alman/dig/n2$g;

    const v0, 0x7f090455

    iput v0, p1, Lcom/digdroid/alman/dig/n2$f;->b:I

    const v0, 0x7f090321

    iput v0, p1, Lcom/digdroid/alman/dig/n2$f;->c:I

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/v0;->i:Z

    iput-boolean v0, p1, Lcom/digdroid/alman/dig/n2$f;->d:Z

    const/16 v0, 0x3e8

    iput v0, p1, Lcom/digdroid/alman/dig/n2$f;->e:I

    :cond_1
    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->z:Lcom/digdroid/alman/dig/n2;

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->a:Lcom/digdroid/alman/dig/r1;

    iget-object v1, p0, Lcom/digdroid/alman/dig/v0;->b:Lcom/digdroid/alman/dig/n2$f;

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/n2;->v(Lcom/digdroid/alman/dig/p1;Lcom/digdroid/alman/dig/n2$f;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->z:Lcom/digdroid/alman/dig/n2;

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->w:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/n2;->t(Ljava/lang/String;)Z

    return-void
.end method

.method f(Landroid/database/Cursor;I)V
    .locals 1

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/v0;->g:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    iput v0, p0, Lcom/digdroid/alman/dig/v0;->C:I

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/v0;->k(Landroid/database/Cursor;I)V

    :cond_0
    return-void
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->z:Lcom/digdroid/alman/dig/n2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/v0;->a:Lcom/digdroid/alman/dig/r1;

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/n2;->u(Lcom/digdroid/alman/dig/p1;)V

    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Lcom/digdroid/alman/dig/v0;->C:I

    return-void
.end method

.method h()V
    .locals 8

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->d:Landroid/view/View;

    const v1, 0x7f09031e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/v0;->g:Z

    const/16 v2, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/v0;->z:Lcom/digdroid/alman/dig/n2;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/n2;->p()V

    goto/16 :goto_2

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, p0, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lcom/digdroid/alman/dig/a4;->g(Z)Landroid/graphics/Point;

    move-result-object v3

    iget v5, v3, Landroid/graphics/Point;->x:I

    iget v6, v3, Landroid/graphics/Point;->y:I

    const/high16 v7, 0x42c80000    # 100.0f

    if-le v5, v6, :cond_1

    iget v6, p0, Lcom/digdroid/alman/dig/v0;->l:I

    int-to-float v6, v6

    int-to-float v5, v5

    mul-float v6, v6, v5

    div-float/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    iput v5, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget v3, v3, Landroid/graphics/Point;->y:I

    goto :goto_0

    :cond_1
    iget v5, p0, Lcom/digdroid/alman/dig/v0;->l:I

    int-to-float v5, v5

    int-to-float v6, v6

    mul-float v5, v5, v6

    div-float/2addr v5, v7

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    iput v5, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget v3, v3, Landroid/graphics/Point;->x:I

    :goto_0
    iget v6, p0, Lcom/digdroid/alman/dig/v0;->m:I

    int-to-float v6, v6

    int-to-float v5, v5

    mul-float v6, v6, v5

    div-float/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-virtual {v0, v5, v5, v5, v5}, Landroid/view/View;->setPadding(IIII)V

    const/4 v6, 0x2

    mul-int/lit8 v5, v5, 0x2

    sub-int/2addr v3, v5

    iget-object v5, p0, Lcom/digdroid/alman/dig/v0;->y:Landroid/widget/TextView;

    iget v7, p0, Lcom/digdroid/alman/dig/v0;->n:I

    if-lez v7, :cond_2

    const/4 v2, 0x0

    :cond_2
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget v2, p0, Lcom/digdroid/alman/dig/v0;->n:I

    if-lez v2, :cond_3

    iget-object v2, p0, Lcom/digdroid/alman/dig/v0;->y:Landroid/widget/TextView;

    int-to-float v5, v3

    const/high16 v7, 0x420c0000    # 35.0f

    div-float v7, v5, v7

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/v0;->y:Landroid/widget/TextView;

    const/high16 v7, 0x42700000    # 60.0f

    div-float/2addr v5, v7

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-virtual {v2, v1, v5, v1, v1}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_3
    iget v1, p0, Lcom/digdroid/alman/dig/v0;->n:I

    if-ne v1, v4, :cond_4

    iget-object v1, p0, Lcom/digdroid/alman/dig/v0;->y:Landroid/widget/TextView;

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setMaxLines(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/v0;->y:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    int-to-float v2, v3

    const/high16 v4, 0x41380000    # 11.5f

    div-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_4
    iget v1, p0, Lcom/digdroid/alman/dig/v0;->n:I

    if-ne v1, v6, :cond_5

    iget-object v1, p0, Lcom/digdroid/alman/dig/v0;->y:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/v0;->y:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    int-to-float v2, v3

    const v3, 0x40cccccd

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    :goto_1
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_2

    :cond_5
    const/4 v2, 0x3

    if-ne v1, v2, :cond_6

    iget-object v1, p0, Lcom/digdroid/alman/dig/v0;->y:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setMaxLines(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/v0;->y:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const/4 v2, -0x2

    goto :goto_1

    :cond_6
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method i(Landroid/database/Cursor;)V
    .locals 5

    iget v0, p0, Lcom/digdroid/alman/dig/v0;->r:I

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lcom/digdroid/alman/dig/v0;->u:I

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/digdroid/alman/dig/v0;->t:I

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    if-nez p1, :cond_0

    const-string p1, "pc"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "scumm"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "android"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    const/16 p1, 0x2e

    invoke-virtual {v1, p1}, Ljava/lang/String;->lastIndexOf(I)I

    move-result p1

    if-lez p1, :cond_1

    invoke-virtual {v1, v2, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, p1

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->e:Lcom/digdroid/alman/dig/g3;

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/g3;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    move-object v0, p1

    :goto_1
    new-instance p1, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "mame"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/digdroid/alman/dig/v0;->p:Ljava/lang/String;

    goto :goto_2

    :cond_3
    iget-object v4, p0, Lcom/digdroid/alman/dig/v0;->o:Ljava/lang/String;

    :goto_2
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ".png"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->A:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->c:Lcom/digdroid/alman/dig/MainActivity;

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

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->A:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/j;->p0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;

    return-void
.end method

.method public j(Landroid/database/Cursor;I)V
    .locals 3

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/v0;->g:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/v0;->g:Z

    iget-object v1, p0, Lcom/digdroid/alman/dig/v0;->f:Lcom/digdroid/alman/dig/b3;

    const-string v2, "games_preview_enabled"

    invoke-virtual {v1, v2, v0}, Lcom/digdroid/alman/dig/b3;->B(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/v0;->h()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/digdroid/alman/dig/v0;->C:I

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/v0;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/v0;->k(Landroid/database/Cursor;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/v0;->d()V

    :goto_0
    return-void
.end method

.method public k(Landroid/database/Cursor;I)V
    .locals 1

    if-eqz p1, :cond_4

    invoke-interface {p1}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {p1, p2}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/digdroid/alman/dig/v0;->C:I

    if-ne p2, v0, :cond_1

    return-void

    :cond_1
    iput p2, p0, Lcom/digdroid/alman/dig/v0;->C:I

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/v0;->q:Z

    if-nez v0, :cond_2

    const-string v0, "system"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/v0;->r:I

    const-string v0, "title"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/v0;->s:I

    const-string v0, "foldername"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/v0;->t:I

    const-string v0, "filename"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/v0;->u:I

    const-string v0, "youtube"

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/digdroid/alman/dig/v0;->v:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/digdroid/alman/dig/v0;->q:Z

    :cond_2
    iget v0, p0, Lcom/digdroid/alman/dig/v0;->s:I

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/v0;->x:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/digdroid/alman/dig/v0;->m()V

    iget v0, p0, Lcom/digdroid/alman/dig/v0;->v:I

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/digdroid/alman/dig/v0;->w:Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/v0;->i(Landroid/database/Cursor;)V

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/v0;->h:Z

    if-eqz p1, :cond_3

    invoke-virtual {p0, p2}, Lcom/digdroid/alman/dig/v0;->e(I)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lcom/digdroid/alman/dig/v0;->z:Lcom/digdroid/alman/dig/n2;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/n2;->p()V

    :cond_4
    :goto_0
    return-void
.end method

.method l()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->z:Lcom/digdroid/alman/dig/n2;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->b:Lcom/digdroid/alman/dig/n2$f;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/digdroid/alman/dig/n2$f;->f:Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->d:Landroid/view/View;

    const v1, 0x7f09031e

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/digdroid/alman/dig/v0$b;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/v0$b;-><init>(Lcom/digdroid/alman/dig/v0;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    invoke-virtual {p0}, Lcom/digdroid/alman/dig/v0;->m()V

    return-void
.end method

.method m()V
    .locals 2

    iget v0, p0, Lcom/digdroid/alman/dig/v0;->n:I

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->y:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/v0;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0;->y:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/v0;->a:Lcom/digdroid/alman/dig/r1;

    iget-object v1, v1, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v1, v1, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method
