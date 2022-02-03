.class Lcom/digdroid/alman/dig/r2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2;->v3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/Spinner;

.field final synthetic c:Landroid/app/Activity;

.field final synthetic d:Landroid/widget/TextView;

.field final synthetic e:Lcom/digdroid/alman/dig/r2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2;Landroid/widget/Spinner;Landroid/app/Activity;Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$a;->e:Lcom/digdroid/alman/dig/r2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r2$a;->b:Landroid/widget/Spinner;

    iput-object p3, p0, Lcom/digdroid/alman/dig/r2$a;->c:Landroid/app/Activity;

    iput-object p4, p0, Lcom/digdroid/alman/dig/r2$a;->d:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/r2$a;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/digdroid/alman/dig/r2$a;->b(ILjava/lang/String;)V

    return-void
.end method

.method private b(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$a;->c:Landroid/app/Activity;

    invoke-static {v0, p1, p2}, Lcom/digdroid/alman/dig/a4;->y(Landroid/app/Activity;ILjava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$a;->d:Landroid/widget/TextView;

    iget-object p2, p0, Lcom/digdroid/alman/dig/r2$a;->c:Landroid/app/Activity;

    invoke-static {p2}, Lcom/digdroid/alman/dig/a4;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$a;->e:Lcom/digdroid/alman/dig/r2;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_1

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/r2$a;->b:Landroid/widget/Spinner;

    invoke-virtual {p2}, Landroid/widget/Spinner;->getTag()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    const/4 p2, 0x1

    if-ne p3, p2, :cond_2

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x1e

    if-ge p2, p4, :cond_1

    new-instance p2, Lcom/digdroid/alman/dig/i;

    invoke-direct {p2, p1}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    new-instance p1, Lcom/digdroid/alman/dig/r2$a$a;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/r2$a$a;-><init>(Lcom/digdroid/alman/dig/r2$a;)V

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/i;->h(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/i;->d()V

    goto :goto_0

    :cond_1
    new-instance p2, Landroid/content/Intent;

    const-string p4, "android.intent.action.OPEN_DOCUMENT_TREE"

    invoke-direct {p2, p4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const p4, 0x100c3

    invoke-virtual {p2, p4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/16 p4, 0x67

    invoke-virtual {p1, p2, p4}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    add-int/lit8 p1, p3, -0x1

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/digdroid/alman/dig/r2$a;->b(ILjava/lang/String;)V

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$a;->b:Landroid/widget/Spinner;

    new-instance p2, Ljava/lang/Integer;

    invoke-direct {p2, p3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setTag(Ljava/lang/Object;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
