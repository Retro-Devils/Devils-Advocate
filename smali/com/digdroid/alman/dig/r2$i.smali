.class Lcom/digdroid/alman/dig/r2$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2;->J3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private b:Ljava/lang/String;

.field final synthetic c:Landroid/widget/Spinner;

.field final synthetic d:Lcom/digdroid/alman/dig/MainActivity;

.field final synthetic e:Landroid/widget/TextView;

.field final synthetic f:Lcom/digdroid/alman/dig/r2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2;Landroid/widget/Spinner;Lcom/digdroid/alman/dig/MainActivity;Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$i;->f:Lcom/digdroid/alman/dig/r2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/r2$i;->c:Landroid/widget/Spinner;

    iput-object p3, p0, Lcom/digdroid/alman/dig/r2$i;->d:Lcom/digdroid/alman/dig/MainActivity;

    iput-object p4, p0, Lcom/digdroid/alman/dig/r2$i;->e:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/r2$i;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2$i;->b()V

    return-void
.end method

.method private b()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/r2$i;->d:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {v0}, Lcom/digdroid/alman/dig/s3;->J(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/r2$i;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/r2$i;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/r2$i;->f:Lcom/digdroid/alman/dig/r2;

    iget-object v1, v1, Lcom/digdroid/alman/dig/p1;->f0:Lcom/digdroid/alman/dig/t1;

    iget-object v2, p0, Lcom/digdroid/alman/dig/r2$i;->d:Lcom/digdroid/alman/dig/MainActivity;

    iget-object v3, p0, Lcom/digdroid/alman/dig/r2$i;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v0}, Lcom/digdroid/alman/dig/t1;->c(Lcom/digdroid/alman/dig/MainActivity;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
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

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$i;->f:Lcom/digdroid/alman/dig/r2;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_1

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/r2$i;->c:Landroid/widget/Spinner;

    invoke-virtual {p2}, Landroid/widget/Spinner;->getTag()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p1}, Lcom/digdroid/alman/dig/s3;->J(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/r2$i;->b:Ljava/lang/String;

    const/4 p2, 0x1

    if-ne p3, p2, :cond_1
    ##
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x1e

    if-ge p2, p4, :cond_4
    ##

    new-instance p2, Lcom/digdroid/alman/dig/i;

    invoke-direct {p2, p1}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    new-instance p1, Lcom/digdroid/alman/dig/r2$i$a;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/r2$i$a;-><init>(Lcom/digdroid/alman/dig/r2$i;)V

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/i;->h(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/i;->d()V

    goto :goto_0
    ### launches file browser, but doesn't save back to theme_storage_dir yet
    :cond_4
    new-instance p2, Landroid/content/Intent;

    const-string p4, "android.intent.action.OPEN_DOCUMENT_TREE"

    invoke-direct {p2, p4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const p4, 0x100c3

    invoke-virtual {p2, p4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/16 p4, 0x67

    invoke-virtual {p1, p2, p4}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
    ###
    :cond_1
    if-eqz p3, :cond_2

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$i;->f:Lcom/digdroid/alman/dig/r2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/c3;

    add-int/lit8 p2, p3, -0x1

    const-string p4, "theme_storage"

    invoke-virtual {p1, p4, p2}, Lcom/digdroid/alman/dig/c3;->E(Ljava/lang/String;I)V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/r2$i;->b()V

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$i;->c:Landroid/widget/Spinner;

    new-instance p2, Ljava/lang/Integer;

    invoke-direct {p2, p3}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p1, p2}, Landroid/widget/Spinner;->setTag(Ljava/lang/Object;)V

    :cond_3
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
