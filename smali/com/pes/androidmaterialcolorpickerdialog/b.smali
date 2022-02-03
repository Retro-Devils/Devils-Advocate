.class public Lcom/pes/androidmaterialcolorpickerdialog/b;
.super Landroid/app/Dialog;
.source ""

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field private final b:Landroid/app/Activity;

.field private c:Landroid/view/View;

.field private d:Landroid/widget/SeekBar;

.field private e:Landroid/widget/SeekBar;

.field private f:Landroid/widget/SeekBar;

.field private g:Landroid/widget/SeekBar;

.field private h:Landroid/widget/EditText;

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:Lcom/pes/androidmaterialcolorpickerdialog/c;

.field private n:Z

.field private o:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->b:Landroid/app/Activity;

    instance-of v0, p1, Lcom/pes/androidmaterialcolorpickerdialog/c;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/pes/androidmaterialcolorpickerdialog/c;

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->m:Lcom/pes/androidmaterialcolorpickerdialog/c;

    :cond_0
    const/16 p1, 0xff

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->i:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->j:I

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->k:I

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->l:I

    iput-boolean p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->n:Z

    iput-boolean p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->o:Z

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;III)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/b;-><init>(Landroid/app/Activity;)V

    invoke-static {p2}, Lcom/pes/androidmaterialcolorpickerdialog/a;->a(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->j:I

    invoke-static {p3}, Lcom/pes/androidmaterialcolorpickerdialog/a;->a(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->k:I

    invoke-static {p4}, Lcom/pes/androidmaterialcolorpickerdialog/a;->a(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->l:I

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;IIII)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/b;-><init>(Landroid/app/Activity;)V

    invoke-static {p2}, Lcom/pes/androidmaterialcolorpickerdialog/a;->a(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->i:I

    invoke-static {p3}, Lcom/pes/androidmaterialcolorpickerdialog/a;->a(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->j:I

    invoke-static {p4}, Lcom/pes/androidmaterialcolorpickerdialog/a;->a(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->k:I

    invoke-static {p5}, Lcom/pes/androidmaterialcolorpickerdialog/a;->a(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->l:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->n:Z

    return-void
.end method

.method static synthetic a(Lcom/pes/androidmaterialcolorpickerdialog/b;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/pes/androidmaterialcolorpickerdialog/b;->j(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic b(Lcom/pes/androidmaterialcolorpickerdialog/b;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->b:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic c(Lcom/pes/androidmaterialcolorpickerdialog/b;)Landroid/widget/EditText;
    .locals 0

    iget-object p0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->h:Landroid/widget/EditText;

    return-object p0
.end method

.method static synthetic d(Lcom/pes/androidmaterialcolorpickerdialog/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/pes/androidmaterialcolorpickerdialog/b;->h()V

    return-void
.end method

.method private g()V
    .locals 5

    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->c:Landroid/view/View;

    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/b;->f()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->d:Landroid/widget/SeekBar;

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->i:I

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->e:Landroid/widget/SeekBar;

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->j:I

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->f:Landroid/widget/SeekBar;

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->k:I

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->g:Landroid/widget/SeekBar;

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->l:I

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    iget-boolean v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->n:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->d:Landroid/widget/SeekBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setVisibility(I)V

    :cond_0
    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->h:Landroid/widget/EditText;

    iget-boolean v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->n:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->i:I

    iget v2, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->j:I

    iget v3, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->k:I

    iget v4, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->l:I

    invoke-static {v1, v2, v3, v4}, Lcom/pes/androidmaterialcolorpickerdialog/a;->c(IIII)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->j:I

    iget v2, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->k:I

    iget v3, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->l:I

    invoke-static {v1, v2, v3}, Lcom/pes/androidmaterialcolorpickerdialog/a;->b(III)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private h()V
    .locals 2

    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->m:Lcom/pes/androidmaterialcolorpickerdialog/c;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/b;->f()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/pes/androidmaterialcolorpickerdialog/c;->a(I)V

    :cond_0
    iget-boolean v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->o:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    :cond_1
    return-void
.end method

.method private j(Ljava/lang/String;)V
    .locals 2

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    iput v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->i:I

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    iput v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->j:I

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v0

    iput v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->k:I

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    iput p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->l:I

    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->c:Landroid/view/View;

    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/b;->f()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->d:Landroid/widget/SeekBar;

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->i:I

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->e:Landroid/widget/SeekBar;

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->j:I

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->f:Landroid/widget/SeekBar;

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->k:I

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V

    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->g:Landroid/widget/SeekBar;

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->l:I

    invoke-virtual {p1, v0}, Landroid/widget/SeekBar;->setProgress(I)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->h:Landroid/widget/EditText;

    iget-object v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/pes/androidmaterialcolorpickerdialog/f;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setError(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public e()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->o:Z

    return-void
.end method

.method public f()I
    .locals 4

    iget-boolean v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->n:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->i:I

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->j:I

    iget v2, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->k:I

    iget v3, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->l:I

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    goto :goto_0

    :cond_0
    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->j:I

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->k:I

    iget v2, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->l:I

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    :goto_0
    return v0
.end method

.method public i(Lcom/pes/androidmaterialcolorpickerdialog/c;)V
    .locals 0

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->m:Lcom/pes/androidmaterialcolorpickerdialog/c;

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v0, 0x1

    const/16 v1, 0x15

    if-ge p1, v1, :cond_0

    invoke-virtual {p0, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    :cond_0
    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/e;->a:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/d;->c:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->c:Landroid/view/View;

    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/d;->e:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->h:Landroid/widget/EditText;

    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/d;->a:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/SeekBar;

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->d:Landroid/widget/SeekBar;

    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/d;->g:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/SeekBar;

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->e:Landroid/widget/SeekBar;

    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/d;->d:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/SeekBar;

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->f:Landroid/widget/SeekBar;

    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/d;->b:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/SeekBar;

    iput-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->g:Landroid/widget/SeekBar;

    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->d:Landroid/widget/SeekBar;

    invoke-virtual {p1, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->e:Landroid/widget/SeekBar;

    invoke-virtual {p1, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->f:Landroid/widget/SeekBar;

    invoke-virtual {p1, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->g:Landroid/widget/SeekBar;

    invoke-virtual {p1, p0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->h:Landroid/widget/EditText;

    new-array v0, v0, [Landroid/text/InputFilter;

    const/4 v1, 0x0

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    iget-boolean v3, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->n:Z

    if-eqz v3, :cond_1

    const/16 v3, 0x8

    goto :goto_0

    :cond_1
    const/4 v3, 0x6

    :goto_0
    invoke-direct {v2, v3}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    aput-object v2, v0, v1

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setFilters([Landroid/text/InputFilter;)V

    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->h:Landroid/widget/EditText;

    new-instance v0, Lcom/pes/androidmaterialcolorpickerdialog/b$a;

    invoke-direct {v0, p0}, Lcom/pes/androidmaterialcolorpickerdialog/b$a;-><init>(Lcom/pes/androidmaterialcolorpickerdialog/b;)V

    invoke-virtual {p1, v0}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    sget p1, Lcom/pes/androidmaterialcolorpickerdialog/d;->f:I

    invoke-virtual {p0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    new-instance v0, Lcom/pes/androidmaterialcolorpickerdialog/b$b;

    invoke-direct {v0, p0}, Lcom/pes/androidmaterialcolorpickerdialog/b$b;-><init>(Lcom/pes/androidmaterialcolorpickerdialog/b;)V

    invoke-virtual {p1, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getId()I

    move-result p3

    sget v0, Lcom/pes/androidmaterialcolorpickerdialog/d;->a:I

    if-ne p3, v0, :cond_0

    iput p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->i:I

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getId()I

    move-result p3

    sget v0, Lcom/pes/androidmaterialcolorpickerdialog/d;->g:I

    if-ne p3, v0, :cond_1

    iput p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->j:I

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getId()I

    move-result p3

    sget v0, Lcom/pes/androidmaterialcolorpickerdialog/d;->d:I

    if-ne p3, v0, :cond_2

    iput p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->k:I

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getId()I

    move-result p1

    sget p3, Lcom/pes/androidmaterialcolorpickerdialog/d;->b:I

    if-ne p1, p3, :cond_3

    iput p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->l:I

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->c:Landroid/view/View;

    invoke-virtual {p0}, Lcom/pes/androidmaterialcolorpickerdialog/b;->f()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object p1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->h:Landroid/widget/EditText;

    iget-boolean p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->n:Z

    if-eqz p2, :cond_4

    iget p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->i:I

    iget p3, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->j:I

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->k:I

    iget v1, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->l:I

    invoke-static {p2, p3, v0, v1}, Lcom/pes/androidmaterialcolorpickerdialog/a;->c(IIII)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_4
    iget p2, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->j:I

    iget p3, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->k:I

    iget v0, p0, Lcom/pes/androidmaterialcolorpickerdialog/b;->l:I

    invoke-static {p2, p3, v0}, Lcom/pes/androidmaterialcolorpickerdialog/a;->b(III)Ljava/lang/String;

    move-result-object p2

    :goto_1
    invoke-virtual {p1, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    return-void
.end method

.method public show()V
    .locals 0

    invoke-super {p0}, Landroid/app/Dialog;->show()V

    invoke-direct {p0}, Lcom/pes/androidmaterialcolorpickerdialog/b;->g()V

    return-void
.end method
