.class Lcom/digdroid/alman/dig/q2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2;->t3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private b:Ljava/lang/String;

.field final synthetic c:Landroid/widget/Spinner;

.field final synthetic d:Landroid/app/Activity;

.field final synthetic e:Landroid/widget/TextView;

.field final synthetic f:Lcom/digdroid/alman/dig/q2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2;Landroid/widget/Spinner;Landroid/app/Activity;Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$a;->f:Lcom/digdroid/alman/dig/q2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/q2$a;->c:Landroid/widget/Spinner;

    iput-object p3, p0, Lcom/digdroid/alman/dig/q2$a;->d:Landroid/app/Activity;

    iput-object p4, p0, Lcom/digdroid/alman/dig/q2$a;->e:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/digdroid/alman/dig/q2$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q2$a;->b()V

    return-void
.end method

.method private b()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/q2$a;->d:Landroid/app/Activity;

    invoke-static {v0}, Lcom/digdroid/alman/dig/y3;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/q2$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/q2$a;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/digdroid/alman/dig/q2$a;->f:Lcom/digdroid/alman/dig/q2;

    iget-object v1, v1, Lcom/digdroid/alman/dig/p1;->f0:Lcom/digdroid/alman/dig/t1;

    iget-object v2, p0, Lcom/digdroid/alman/dig/q2$a;->d:Landroid/app/Activity;

    iget-object v3, p0, Lcom/digdroid/alman/dig/q2$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v0}, Lcom/digdroid/alman/dig/t1;->a(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

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

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$a;->f:Lcom/digdroid/alman/dig/q2;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_1

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/q2$a;->c:Landroid/widget/Spinner;

    invoke-virtual {p2}, Landroid/widget/Spinner;->getTag()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p1}, Lcom/digdroid/alman/dig/y3;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/q2$a;->b:Ljava/lang/String;

    const/4 p2, 0x1

    if-ne p3, p2, :cond_1

    new-instance p2, Lcom/digdroid/alman/dig/i;

    invoke-direct {p2, p1}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    new-instance p1, Lcom/digdroid/alman/dig/q2$a$a;

    invoke-direct {p1, p0}, Lcom/digdroid/alman/dig/q2$a$a;-><init>(Lcom/digdroid/alman/dig/q2$a;)V

    invoke-virtual {p2, p1}, Lcom/digdroid/alman/dig/i;->g(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/i;->d()V

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$a;->f:Lcom/digdroid/alman/dig/q2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    add-int/lit8 p2, p3, -0x1

    const-string p4, "cover_storage"

    invoke-virtual {p1, p4, p2}, Lcom/digdroid/alman/dig/b3;->E(Ljava/lang/String;I)V

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q2$a;->b()V

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$a;->c:Landroid/widget/Spinner;

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
