.class Lcom/digdroid/alman/dig/g1;
.super Lcom/digdroid/alman/dig/q1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/g1$a;
    }
.end annotation


# instance fields
.field f:Lcom/digdroid/alman/dig/g1$a;

.field g:F

.field h:Landroid/view/LayoutInflater;

.field i:I

.field j:F

.field k:F

.field l:Lcom/digdroid/alman/dig/z0;

.field m:Lcom/digdroid/alman/dig/m;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FLcom/digdroid/alman/dig/g1$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/digdroid/alman/dig/q1;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;F)V

    invoke-interface {p5}, Lcom/digdroid/alman/dig/g1$a;->b()Lcom/digdroid/alman/dig/m;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/g1;->m:Lcom/digdroid/alman/dig/m;

    iput-object p5, p0, Lcom/digdroid/alman/dig/g1;->f:Lcom/digdroid/alman/dig/g1$a;

    new-instance p2, Lcom/digdroid/alman/dig/z0;

    invoke-interface {p5}, Lcom/digdroid/alman/dig/g1$a;->c()Z

    move-result p3

    invoke-direct {p2, p1, p3}, Lcom/digdroid/alman/dig/z0;-><init>(Landroid/app/Activity;Z)V

    iput-object p2, p0, Lcom/digdroid/alman/dig/g1;->l:Lcom/digdroid/alman/dig/z0;

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/z0;->b()F

    move-result p2

    iput p2, p0, Lcom/digdroid/alman/dig/g1;->g:F

    iget-object p2, p0, Lcom/digdroid/alman/dig/g1;->l:Lcom/digdroid/alman/dig/z0;

    invoke-virtual {p2}, Lcom/digdroid/alman/dig/z0;->a()I

    move-result p2

    iput p2, p0, Lcom/digdroid/alman/dig/g1;->i:I

    invoke-interface {p5}, Lcom/digdroid/alman/dig/g1$a;->h()F

    move-result p2

    iput p2, p0, Lcom/digdroid/alman/dig/g1;->j:F

    invoke-interface {p5}, Lcom/digdroid/alman/dig/g1$a;->o()F

    move-result p2

    iput p2, p0, Lcom/digdroid/alman/dig/g1;->k:F

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/g1;->h:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 5

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    if-eqz p3, :cond_2

    invoke-interface {p3}, Landroid/database/Cursor;->isClosed()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-interface {p3}, Landroid/database/Cursor;->getCount()I

    move-result p2

    if-gtz p2, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/g1;->m:Lcom/digdroid/alman/dig/m;

    invoke-interface {p3}, Landroid/database/Cursor;->getPosition()I

    move-result v0

    invoke-virtual {p2, v0}, Lcom/digdroid/alman/dig/m;->a(I)I

    move-result p2

    const v0, 0x7f0901c0

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/g1;->l:Lcom/digdroid/alman/dig/z0;

    iget-object v2, p0, Lcom/digdroid/alman/dig/g1;->f:Lcom/digdroid/alman/dig/g1$a;

    invoke-interface {v2, p3}, Lcom/digdroid/alman/dig/g1$a;->a(Landroid/database/Cursor;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lcom/digdroid/alman/dig/z0;->e(Landroid/widget/TextView;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    iget v1, p0, Lcom/digdroid/alman/dig/g1;->g:F

    iget v2, p0, Lcom/digdroid/alman/dig/g1;->j:F

    mul-float v1, v1, v2

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    const v0, 0x7f0901be

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/g1;->f:Lcom/digdroid/alman/dig/g1$a;

    invoke-interface {v1, p3}, Lcom/digdroid/alman/dig/g1$a;->R(Landroid/database/Cursor;)I

    move-result p3

    iget-object v1, p0, Lcom/digdroid/alman/dig/g1;->l:Lcom/digdroid/alman/dig/z0;

    const-string v3, ""

    if-gez p3, :cond_1

    goto :goto_0

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-virtual {v1, v0, v3}, Lcom/digdroid/alman/dig/z0;->e(Landroid/widget/TextView;Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    iget p2, p0, Lcom/digdroid/alman/dig/g1;->g:F

    iget p3, p0, Lcom/digdroid/alman/dig/g1;->j:F

    mul-float p2, p2, p3

    invoke-virtual {v0, v2, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    iget p2, p0, Lcom/digdroid/alman/dig/g1;->i:I

    int-to-float p2, p2

    iget p3, p0, Lcom/digdroid/alman/dig/g1;->j:F

    mul-float p2, p2, p3

    iget p3, p0, Lcom/digdroid/alman/dig/g1;->k:F

    mul-float p2, p2, p3

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    iget p3, p0, Lcom/digdroid/alman/dig/g1;->i:I

    int-to-float p3, p3

    iget v0, p0, Lcom/digdroid/alman/dig/g1;->j:F

    mul-float p3, p3, v0

    iget v0, p0, Lcom/digdroid/alman/dig/g1;->k:F

    mul-float p3, p3, v0

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    invoke-virtual {p1, v2, p2, v2, p3}, Landroid/view/View;->setPadding(IIII)V

    :cond_2
    :goto_1
    return-void
.end method

.method public newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/g1;->h:Landroid/view/LayoutInflater;

    const p2, 0x7f0c0064

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
