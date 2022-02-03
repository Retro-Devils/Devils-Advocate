.class Lcom/digdroid/alman/dig/f3$t;
.super Landroid/widget/BaseAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/f3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "t"
.end annotation


# instance fields
.field private final b:Landroid/app/Activity;

.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field d:Landroid/view/LayoutInflater;

.field e:I

.field f:Ljava/lang/String;

.field final synthetic g:Lcom/digdroid/alman/dig/f3;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/f3;Landroid/app/Activity;Ljava/util/ArrayList;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/digdroid/alman/dig/f3$t;->g:Lcom/digdroid/alman/dig/f3;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput-object p2, p0, Lcom/digdroid/alman/dig/f3$t;->b:Landroid/app/Activity;

    iput-object p3, p0, Lcom/digdroid/alman/dig/f3$t;->c:Ljava/util/ArrayList;

    iput p4, p0, Lcom/digdroid/alman/dig/f3$t;->e:I

    const-string p1, "layout_inflater"

    invoke-virtual {p2, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, Lcom/digdroid/alman/dig/f3$t;->d:Landroid/view/LayoutInflater;

    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/f3$t;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lcom/digdroid/alman/dig/f3$t;->b:Landroid/app/Activity;

    return-object p0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lcom/digdroid/alman/dig/f3$t;->e:I

    return v0
.end method

.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/f3$t;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x3

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
    .locals 4

    iget-object p2, p0, Lcom/digdroid/alman/dig/f3$t;->c:Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v0, 0x0

    if-lt p1, p2, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/f3$t;->d:Landroid/view/LayoutInflater;

    const p2, 0x7f0c00df

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/f3$t;->d:Landroid/view/LayoutInflater;

    const v1, 0x7f0c00de

    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    const p3, 0x7f0902b0

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/RadioButton;

    invoke-static {}, Lcom/digdroid/alman/dig/p3;->b()I

    move-result v1

    invoke-virtual {p3, v1}, Landroid/widget/RadioButton;->setTextColor(I)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/f3$t;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0x2f

    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, 0x1

    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/widget/RadioButton;->setText(Ljava/lang/CharSequence;)V

    iget v1, p0, Lcom/digdroid/alman/dig/f3$t;->e:I

    if-ne p1, v1, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-virtual {p3, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    new-instance v0, Lcom/digdroid/alman/dig/f3$t$a;

    invoke-direct {v0, p0, p1}, Lcom/digdroid/alman/dig/f3$t$a;-><init>(Lcom/digdroid/alman/dig/f3$t;I)V

    invoke-virtual {p3, v0}, Landroid/widget/RadioButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-object p2
.end method
