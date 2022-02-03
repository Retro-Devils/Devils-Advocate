.class public Lcom/digdroid/alman/dig/a0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/a0$f;,
        Lcom/digdroid/alman/dig/a0$g;
    }
.end annotation


# instance fields
.field a:Landroid/app/Activity;

.field b:Landroid/database/sqlite/SQLiteDatabase;

.field c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/digdroid/alman/dig/a0$f;",
            ">;"
        }
    .end annotation
.end field

.field d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field e:I

.field f:J

.field g:Lcom/digdroid/alman/dig/a0$g;

.field h:Landroid/app/Dialog;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/a0$g;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/a0;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/digdroid/alman/dig/a0;->d:Ljava/util/ArrayList;

    const/4 v0, -0x1

    iput v0, p0, Lcom/digdroid/alman/dig/a0;->e:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/digdroid/alman/dig/a0;->f:J

    iput-object p1, p0, Lcom/digdroid/alman/dig/a0;->a:Landroid/app/Activity;

    iput-object p2, p0, Lcom/digdroid/alman/dig/a0;->g:Lcom/digdroid/alman/dig/a0$g;

    invoke-static {p1}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object p1

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u;->c()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/a0;->b:Landroid/database/sqlite/SQLiteDatabase;

    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/a0;Ljava/lang/String;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/a0;->d(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method static synthetic b(Lcom/digdroid/alman/dig/a0;Landroid/widget/Spinner;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/a0;->e(Landroid/widget/Spinner;)V

    return-void
.end method

.method private d(Ljava/lang/String;)Z
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/a0;->b:Landroid/database/sqlite/SQLiteDatabase;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "SELECT _id,name,core,package,class,rom_key,data_type,takes_zip,use_retroarch64 FROM emulators WHERE system=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' ORDER BY name"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/a0;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/a0;->d:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    :cond_1
    new-instance v1, Lcom/digdroid/alman/dig/a0$f;

    invoke-direct {v1, p0, p1, v0}, Lcom/digdroid/alman/dig/a0$f;-><init>(Lcom/digdroid/alman/dig/a0;Ljava/lang/String;Landroid/database/Cursor;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/a0;->c:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/digdroid/alman/dig/a0;->d:Ljava/util/ArrayList;

    iget-object v1, v1, Lcom/digdroid/alman/dig/a0$f;->c:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 p1, 0x1

    return p1
.end method

.method private e(Landroid/widget/Spinner;)V
    .locals 6

    new-instance v0, Landroid/widget/ArrayAdapter;

    iget-object v1, p0, Lcom/digdroid/alman/dig/a0;->a:Landroid/app/Activity;

    iget-object v2, p0, Lcom/digdroid/alman/dig/a0;->d:Ljava/util/ArrayList;

    const v3, 0x1090008

    invoke-direct {v0, v1, v3, v2}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const v1, 0x1090009

    invoke-virtual {v0, v1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/a0;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/digdroid/alman/dig/a0;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/digdroid/alman/dig/a0$f;

    iget-wide v1, v1, Lcom/digdroid/alman/dig/a0$f;->a:J

    iget-wide v3, p0, Lcom/digdroid/alman/dig/a0;->f:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    invoke-virtual {p1, v0}, Landroid/widget/Spinner;->setSelection(I)V

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/a0;->d(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/a0;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0055

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f090371

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Spinner;

    invoke-direct {p0, v1}, Lcom/digdroid/alman/dig/a0;->e(Landroid/widget/Spinner;)V

    new-instance v2, Lcom/digdroid/alman/dig/a0$a;

    invoke-direct {v2, p0, v0}, Lcom/digdroid/alman/dig/a0$a;-><init>(Lcom/digdroid/alman/dig/a0;Landroid/view/View;)V

    invoke-virtual {v1, v2}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    const v2, 0x7f090347

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, -0x7f333334

    invoke-static {v2, v3}, Lcom/digdroid/alman/dig/q3;->r(Landroid/view/View;I)V

    new-instance v4, Lcom/digdroid/alman/dig/a0$b;

    invoke-direct {v4, p0, v0, p1, v1}, Lcom/digdroid/alman/dig/a0$b;-><init>(Lcom/digdroid/alman/dig/a0;Landroid/view/View;Ljava/lang/String;Landroid/widget/Spinner;)V

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f090142

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-static {v2, v3}, Lcom/digdroid/alman/dig/q3;->r(Landroid/view/View;I)V

    new-instance v4, Lcom/digdroid/alman/dig/a0$c;

    invoke-direct {v4, p0, p1, v1}, Lcom/digdroid/alman/dig/a0$c;-><init>(Lcom/digdroid/alman/dig/a0;Ljava/lang/String;Landroid/widget/Spinner;)V

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v2, 0x7f0902d1

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-static {v2, v3}, Lcom/digdroid/alman/dig/q3;->r(Landroid/view/View;I)V

    new-instance v4, Lcom/digdroid/alman/dig/a0$d;

    invoke-direct {v4, p0, p1, v1}, Lcom/digdroid/alman/dig/a0$d;-><init>(Lcom/digdroid/alman/dig/a0;Ljava/lang/String;Landroid/widget/Spinner;)V

    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f090169

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-static {p1, v3}, Lcom/digdroid/alman/dig/q3;->r(Landroid/view/View;I)V

    new-instance v1, Lcom/digdroid/alman/dig/a0$e;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/a0$e;-><init>(Lcom/digdroid/alman/dig/a0;)V

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Landroidx/appcompat/app/b$a;

    iget-object v1, p0, Lcom/digdroid/alman/dig/a0;->a:Landroid/app/Activity;

    invoke-direct {p1, v1}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->t(Landroid/view/View;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/b$a;->d(Z)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/a0;->h:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method
