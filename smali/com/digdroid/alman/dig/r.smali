.class Lcom/digdroid/alman/dig/r;
.super Landroid/widget/BaseAdapter;
.source ""


# instance fields
.field private final b:Landroid/app/Activity;

.field private c:Lcom/digdroid/alman/dig/s3;

.field private d:Lcom/digdroid/alman/dig/r3;

.field e:Ljava/lang/String;

.field f:[I

.field g:[Ljava/lang/String;

.field h:[I

.field i:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/s3;Lcom/digdroid/alman/dig/r3;Ljava/lang/String;[I)V
    .locals 0

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput-object p1, p0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r;->c:Lcom/digdroid/alman/dig/s3;

    iput-object p3, p0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    iput-object p4, p0, Lcom/digdroid/alman/dig/r;->e:Ljava/lang/String;

    iput-object p5, p0, Lcom/digdroid/alman/dig/r;->f:[I

    sget-object p2, Lcom/digdroid/alman/dig/s;->o0:[Ljava/lang/String;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    sget-object p2, Lcom/digdroid/alman/dig/s;->n0:[I

    iput-object p2, p0, Lcom/digdroid/alman/dig/r;->h:[I

    const-string p2, "layout_inflater"

    invoke-virtual {p1, p2}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, Lcom/digdroid/alman/dig/r;->i:Landroid/view/LayoutInflater;

    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/r;)Lcom/digdroid/alman/dig/r3;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    return-object p0
.end method

.method static synthetic b(Lcom/digdroid/alman/dig/r;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    return-object p0
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/r;->e:Ljava/lang/String;

    const-string v1, "default"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/digdroid/alman/dig/r;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method d()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {p0, v1}, Lcom/digdroid/alman/dig/r;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/n;->f(Ljava/lang/String;I)I

    move-result v0

    const/high16 v1, -0x1000000

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    new-instance v0, Landroidx/appcompat/app/b$a;

    iget-object v1, p0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->c()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    const v1, 0x7f11012b

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->h(I)Landroidx/appcompat/app/b$a;

    move-result-object v0

    const v1, 0x7f1101d8

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/b$a;->o(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_0
    return-void
.end method

.method e(Landroid/view/ViewGroup;Ljava/lang/String;IZ)Landroid/view/View;
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/r;->i:Landroid/view/LayoutInflater;

    const v1, 0x7f0c003c

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f09012c

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(I)V

    iget-object p3, p0, Lcom/digdroid/alman/dig/r;->c:Lcom/digdroid/alman/dig/s3;

    iget p3, p3, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setTextColor(I)V

    const p3, 0x7f090281

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object v0, p0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    invoke-virtual {v0, p2}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r;->c:Lcom/digdroid/alman/dig/s3;

    iget v0, v0, Lcom/digdroid/alman/dig/s3;->g:I

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    invoke-virtual {v0, p2}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    const v2, 0x7f1101cf

    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    if-eqz p4, :cond_1

    const v2, 0x7f1100e9

    goto :goto_1

    :cond_1
    const v2, 0x7f1100ed

    :goto_1
    invoke-virtual {v0, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Landroid/widget/ArrayAdapter;

    iget-object v2, p0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    const v3, 0x1090008

    invoke-direct {v0, v2, v3, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const p3, 0x1090009

    invoke-virtual {v0, p3}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    const p3, 0x7f09012d

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/Spinner;

    invoke-virtual {p3, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    invoke-virtual {v0, p2}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/Spinner;->setTag(Ljava/lang/Object;)V

    invoke-virtual {p3, v0}, Landroid/widget/Spinner;->setSelection(I)V

    new-instance v0, Lcom/digdroid/alman/dig/r$f;

    invoke-direct {v0, p0, p3, p2, p4}, Lcom/digdroid/alman/dig/r$f;-><init>(Lcom/digdroid/alman/dig/r;Landroid/widget/Spinner;Ljava/lang/String;Z)V

    invoke-virtual {p3, v0}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-object p1
.end method

.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r;->f:[I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    array-length v0, v0

    :goto_0
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    iget-object v2, v0, Lcom/digdroid/alman/dig/r;->f:[I

    aget v2, v2, p1

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->i:Landroid/view/LayoutInflater;

    const v5, 0x7f0c003d

    invoke-virtual {v4, v5, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    const v3, 0x7f09012e

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->c:Lcom/digdroid/alman/dig/s3;

    iget v4, v4, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    const v3, 0x7f09012f

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    iget-object v5, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v5, v5, v2

    invoke-virtual {v4, v5}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    new-instance v4, Lcom/digdroid/alman/dig/r$a;

    invoke-direct {v4, v0, v2}, Lcom/digdroid/alman/dig/r$a;-><init>(Lcom/digdroid/alman/dig/r;I)V

    :goto_0
    invoke-virtual {v3, v4}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    goto/16 :goto_10

    :cond_0
    const v5, 0x7f1100ed

    const v6, 0x7f1100e9

    const v7, 0x7f1101cf

    const/16 v8, 0x8

    const-string v9, "none"

    const-string v10, "folder"

    const v12, 0x1090008

    const-string v14, "file"

    const/4 v4, 0x1

    if-ne v2, v4, :cond_7

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->i:Landroid/view/LayoutInflater;

    const v13, 0x7f0c003c

    invoke-virtual {v4, v13, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    const v4, 0x7f09012c

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iget-object v13, v0, Lcom/digdroid/alman/dig/r;->c:Lcom/digdroid/alman/dig/s3;

    iget v13, v13, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setTextColor(I)V

    const v4, 0x7f090281

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iget-object v13, v0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    iget-object v15, v0, Lcom/digdroid/alman/dig/r;->e:Ljava/lang/String;

    iget-object v11, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v11, v11, v2

    invoke-virtual {v13, v15, v11}, Lcom/digdroid/alman/dig/r3;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_2

    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_2

    :cond_2
    :goto_1
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v8, v0, Lcom/digdroid/alman/dig/r;->c:Lcom/digdroid/alman/dig/s3;

    iget v8, v8, Lcom/digdroid/alman/dig/s3;->g:I

    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v8, v0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    iget-object v13, v0, Lcom/digdroid/alman/dig/r;->e:Ljava/lang/String;

    const-string v15, "media_path"

    invoke-virtual {v8, v13, v15}, Lcom/digdroid/alman/dig/r3;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v8, v0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    invoke-virtual {v8, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v7, v0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    invoke-virtual {v7, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, v0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    invoke-virtual {v6, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v5, v0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    const v6, 0x7f1100a0

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Landroid/widget/ArrayAdapter;

    iget-object v6, v0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    invoke-direct {v5, v6, v12, v4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const v4, 0x1090009

    invoke-virtual {v5, v4}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    const v4, 0x7f09012d

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Spinner;

    invoke-virtual {v4, v5}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    :goto_3
    const/4 v5, -0x1

    goto :goto_4

    :sswitch_0
    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_3

    :cond_3
    const/4 v5, 0x3

    goto :goto_4

    :sswitch_1
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    const/4 v5, 0x2

    goto :goto_4

    :sswitch_2
    invoke-virtual {v11, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_3

    :cond_5
    const/4 v5, 0x1

    goto :goto_4

    :sswitch_3
    const-string v5, "covers"

    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_3

    :cond_6
    const/4 v5, 0x0

    :goto_4
    packed-switch v5, :pswitch_data_0

    goto :goto_5

    :pswitch_0
    const/4 v3, 0x1

    goto :goto_5

    :pswitch_1
    const/4 v3, 0x2

    goto :goto_5

    :pswitch_2
    const/4 v3, 0x3

    :goto_5
    :pswitch_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/Spinner;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Landroid/widget/Spinner;->setSelection(I)V

    new-instance v3, Lcom/digdroid/alman/dig/r$b;

    invoke-direct {v3, v0, v4, v2}, Lcom/digdroid/alman/dig/r$b;-><init>(Lcom/digdroid/alman/dig/r;Landroid/widget/Spinner;I)V

    goto/16 :goto_7

    :cond_7
    const/4 v4, 0x2

    if-ne v2, v4, :cond_9

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->i:Landroid/view/LayoutInflater;

    const v5, 0x7f0c0040

    invoke-virtual {v4, v5, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    const v4, 0x7f090134

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iget-object v5, v0, Lcom/digdroid/alman/dig/r;->c:Lcom/digdroid/alman/dig/s3;

    iget v5, v5, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v5, v0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    const v6, 0x7f1100eb

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v5, v0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    const v6, 0x7f1100ec

    invoke-virtual {v5, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Landroid/widget/ArrayAdapter;

    iget-object v6, v0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    invoke-direct {v5, v6, v12, v4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const v4, 0x1090009

    invoke-virtual {v5, v4}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    const v4, 0x7f090135

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Spinner;

    invoke-virtual {v4, v5}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    iget-object v5, v0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    iget-object v6, v0, Lcom/digdroid/alman/dig/r;->e:Ljava/lang/String;

    iget-object v7, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v7, v7, v2

    invoke-virtual {v5, v6, v7}, Lcom/digdroid/alman/dig/r3;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    const-string v6, "fitmedia"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    const-string v6, "fillscreen"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_6

    :cond_8
    const/4 v3, 0x1

    :goto_6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/Spinner;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Landroid/widget/Spinner;->setSelection(I)V

    new-instance v3, Lcom/digdroid/alman/dig/r$c;

    invoke-direct {v3, v0, v4, v2}, Lcom/digdroid/alman/dig/r$c;-><init>(Lcom/digdroid/alman/dig/r;Landroid/widget/Spinner;I)V

    :goto_7
    invoke-virtual {v4, v3}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    goto/16 :goto_10

    :cond_9
    const/4 v11, 0x3

    if-ne v2, v11, :cond_a

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->i:Landroid/view/LayoutInflater;

    const v5, 0x7f0c003f

    invoke-virtual {v4, v5, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    const v3, 0x7f090132

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->c:Lcom/digdroid/alman/dig/s3;

    iget v4, v4, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    const v3, 0x7f090133

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    iget-object v6, v0, Lcom/digdroid/alman/dig/r;->e:Ljava/lang/String;

    iget-object v7, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v7, v7, v2

    const/16 v8, 0x1388

    invoke-virtual {v5, v6, v7, v8}, Lcom/digdroid/alman/dig/r3;->F(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    new-instance v4, Lcom/digdroid/alman/dig/r$d;

    invoke-direct {v4, v0, v2}, Lcom/digdroid/alman/dig/r$d;-><init>(Lcom/digdroid/alman/dig/r;I)V

    goto/16 :goto_0

    :cond_a
    const/4 v11, 0x4

    if-ne v2, v11, :cond_f

    iget-object v11, v0, Lcom/digdroid/alman/dig/r;->i:Landroid/view/LayoutInflater;

    const v13, 0x7f0c003e

    invoke-virtual {v11, v13, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    const v11, 0x7f090130

    invoke-virtual {v1, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    iget-object v13, v0, Lcom/digdroid/alman/dig/r;->c:Lcom/digdroid/alman/dig/s3;

    iget v13, v13, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v11, v13}, Landroid/widget/TextView;->setTextColor(I)V

    const v11, 0x7f0903a7

    invoke-virtual {v1, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    iget-object v13, v0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    iget-object v15, v0, Lcom/digdroid/alman/dig/r;->e:Ljava/lang/String;

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v4, v4, v2

    invoke-virtual {v13, v15, v4}, Lcom/digdroid/alman/dig/r3;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    invoke-virtual {v11, v3}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->c:Lcom/digdroid/alman/dig/s3;

    iget v4, v4, Lcom/digdroid/alman/dig/s3;->g:I

    invoke-virtual {v11, v4}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    iget-object v8, v0, Lcom/digdroid/alman/dig/r;->e:Ljava/lang/String;

    const-string v13, "sound_path"

    invoke-virtual {v4, v8, v13}, Lcom/digdroid/alman/dig/r3;->G(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v11, v8}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_8
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v8, v0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    invoke-virtual {v8, v7}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v7, v0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    invoke-virtual {v7, v6}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v6, v0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    invoke-virtual {v6, v5}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Landroid/widget/ArrayAdapter;

    iget-object v6, v0, Lcom/digdroid/alman/dig/r;->b:Landroid/app/Activity;

    invoke-direct {v5, v6, v12, v4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const v4, 0x1090009

    invoke-virtual {v5, v4}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    const v4, 0x7f090131

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Spinner;

    invoke-virtual {v4, v5}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    iget-object v5, v0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    iget-object v6, v0, Lcom/digdroid/alman/dig/r;->e:Ljava/lang/String;

    iget-object v7, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v7, v7, v2

    invoke-virtual {v5, v6, v7}, Lcom/digdroid/alman/dig/r3;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_1

    :goto_9
    const/4 v5, -0x1

    goto :goto_a

    :sswitch_4
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_c

    goto :goto_9

    :cond_c
    const/4 v5, 0x2

    goto :goto_a

    :sswitch_5
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    goto :goto_9

    :cond_d
    const/4 v5, 0x1

    goto :goto_a

    :sswitch_6
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    goto :goto_9

    :cond_e
    const/4 v5, 0x0

    :goto_a
    packed-switch v5, :pswitch_data_1

    goto :goto_b

    :pswitch_4
    const/4 v3, 0x1

    goto :goto_b

    :pswitch_5
    const/4 v3, 0x2

    :goto_b
    :pswitch_6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/Spinner;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Landroid/widget/Spinner;->setSelection(I)V

    new-instance v3, Lcom/digdroid/alman/dig/r$e;

    invoke-direct {v3, v0, v4, v2}, Lcom/digdroid/alman/dig/r$e;-><init>(Lcom/digdroid/alman/dig/r;Landroid/widget/Spinner;I)V

    goto/16 :goto_7

    :cond_f
    const/4 v4, 0x5

    if-ne v2, v4, :cond_10

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v4, v4, v2

    const v5, 0x7f110274

    :goto_c
    invoke-virtual {v0, v1, v4, v5, v3}, Lcom/digdroid/alman/dig/r;->e(Landroid/view/ViewGroup;Ljava/lang/String;IZ)Landroid/view/View;

    move-result-object v1

    goto/16 :goto_10

    :cond_10
    const/16 v4, 0xf

    if-ne v2, v4, :cond_11

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v4, v4, v2

    const v5, 0x7f1100b7

    goto :goto_c

    :cond_11
    const/4 v4, 0x6

    if-ne v2, v4, :cond_12

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v4, v4, v2

    invoke-virtual {v0, v4}, Lcom/digdroid/alman/dig/r;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/digdroid/alman/dig/s;->n0:[I

    aget v5, v5, v2

    goto :goto_c

    :cond_12
    const/4 v5, 0x7

    if-ne v2, v5, :cond_13

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v4, v4, v2

    invoke-virtual {v0, v4}, Lcom/digdroid/alman/dig/r;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/digdroid/alman/dig/s;->n0:[I

    aget v5, v5, v2

    goto :goto_c

    :cond_13
    const/16 v5, 0x10

    if-ne v2, v5, :cond_14

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v4, v4, v2

    invoke-virtual {v0, v4}, Lcom/digdroid/alman/dig/r;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/digdroid/alman/dig/s;->n0:[I

    aget v5, v5, v2

    goto :goto_c

    :cond_14
    const/16 v5, 0x11

    if-ne v2, v5, :cond_15

    iget-object v3, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v3, v3, v2

    invoke-virtual {v0, v3}, Lcom/digdroid/alman/dig/r;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/digdroid/alman/dig/s;->n0:[I

    aget v4, v4, v2

    const/4 v5, 0x1

    :goto_d
    invoke-virtual {v0, v1, v3, v4, v5}, Lcom/digdroid/alman/dig/r;->e(Landroid/view/ViewGroup;Ljava/lang/String;IZ)Landroid/view/View;

    move-result-object v1

    goto/16 :goto_10

    :cond_15
    const/4 v5, 0x1

    const/16 v6, 0x12

    if-ne v2, v6, :cond_16

    iget-object v3, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v3, v3, v2

    invoke-virtual {v0, v3}, Lcom/digdroid/alman/dig/r;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/digdroid/alman/dig/s;->n0:[I

    aget v4, v4, v2

    goto :goto_d

    :cond_16
    const v5, 0x7f0900fa

    if-lt v2, v8, :cond_18

    const/16 v6, 0xd

    if-gt v2, v6, :cond_18

    iget-object v4, v0, Lcom/digdroid/alman/dig/r;->i:Landroid/view/LayoutInflater;

    const v6, 0x7f0c0030

    invoke-virtual {v4, v6, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    sget-object v5, Lcom/digdroid/alman/dig/s;->n0:[I

    aget v5, v5, v2

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    iget-object v5, v0, Lcom/digdroid/alman/dig/r;->c:Lcom/digdroid/alman/dig/s3;

    iget v5, v5, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    const v4, 0x7f0900f9

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout;

    const/16 v5, 0xa

    if-ne v2, v5, :cond_17

    iget-object v5, v0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    iget-object v6, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v6, v6, v2

    invoke-virtual {v5, v6, v3}, Lcom/digdroid/alman/dig/n;->f(Ljava/lang/String;I)I

    move-result v3

    goto :goto_e

    :cond_17
    iget-object v5, v0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    iget-object v6, v0, Lcom/digdroid/alman/dig/r;->e:Ljava/lang/String;

    iget-object v7, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v7, v7, v2

    invoke-virtual {v5, v6, v7, v3}, Lcom/digdroid/alman/dig/r3;->E(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v3

    :goto_e
    invoke-virtual {v4, v3}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    goto :goto_10

    :cond_18
    const/16 v6, 0xe

    if-ne v2, v6, :cond_19

    iget-object v6, v0, Lcom/digdroid/alman/dig/r;->i:Landroid/view/LayoutInflater;

    const v7, 0x7f0c0066

    invoke-virtual {v6, v7, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    sget-object v6, Lcom/digdroid/alman/dig/s;->n0:[I

    aget v6, v6, v2

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(I)V

    iget-object v6, v0, Lcom/digdroid/alman/dig/r;->c:Lcom/digdroid/alman/dig/s3;

    iget v6, v6, Lcom/digdroid/alman/dig/s3;->e:I

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v5, v0, Lcom/digdroid/alman/dig/r;->g:[Ljava/lang/String;

    aget-object v5, v5, v2

    new-instance v6, Lcom/digdroid/alman/dig/m;

    iget-object v7, v0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    iget-object v8, v0, Lcom/digdroid/alman/dig/r;->e:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "1"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v8, v9, v3}, Lcom/digdroid/alman/dig/r3;->E(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v7

    iget-object v8, v0, Lcom/digdroid/alman/dig/r;->d:Lcom/digdroid/alman/dig/r3;

    iget-object v9, v0, Lcom/digdroid/alman/dig/r;->e:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "2"

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v9, v5, v3}, Lcom/digdroid/alman/dig/r3;->E(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v5

    const/4 v8, 0x1

    invoke-direct {v6, v8, v7, v5, v4}, Lcom/digdroid/alman/dig/m;-><init>(ZIII)V

    new-array v5, v4, [I

    fill-array-data v5, :array_0

    :goto_f
    if-ge v3, v4, :cond_1a

    aget v7, v5, v3

    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout;

    invoke-virtual {v6, v3}, Lcom/digdroid/alman/dig/m;->a(I)I

    move-result v8

    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_19
    const/4 v1, 0x0

    :cond_1a
    :goto_10
    if-eqz v1, :cond_1b

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, v2}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    :cond_1b
    return-object v1

    :sswitch_data_0
    .sparse-switch
        -0x50bcdc64 -> :sswitch_3
        -0x4ba2e392 -> :sswitch_2
        0x2ff57c -> :sswitch_1
        0x33af38 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x4ba2e392 -> :sswitch_6
        0x2ff57c -> :sswitch_5
        0x33af38 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_6
    .end packed-switch

    :array_0
    .array-data 4
        0x7f0900ee
        0x7f0900ef
        0x7f0900f0
        0x7f0900f1
        0x7f0900f2
        0x7f0900f3
    .end array-data
.end method

.method public isEnabled(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
