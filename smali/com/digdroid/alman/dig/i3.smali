.class Lcom/digdroid/alman/dig/i3;
.super Lcom/digdroid/alman/dig/q1;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/i3$b;,
        Lcom/digdroid/alman/dig/i3$a;
    }
.end annotation


# instance fields
.field f:Ljava/lang/String;

.field g:Ljava/lang/String;

.field h:Landroid/content/res/Resources;

.field i:Lcom/digdroid/alman/dig/c3;

.field j:Ljava/lang/String;

.field k:Z

.field l:F

.field m:F

.field n:Lcom/digdroid/alman/dig/h3;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FLjava/lang/String;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/digdroid/alman/dig/q1;-><init>(Landroid/app/Activity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;F)V

    iput-object p5, p0, Lcom/digdroid/alman/dig/i3;->j:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/digdroid/alman/dig/i3;->k:Z

    if-eqz p1, :cond_2

    invoke-static {p1}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p3

    iput-object p3, p0, Lcom/digdroid/alman/dig/i3;->i:Lcom/digdroid/alman/dig/c3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object p3

    invoke-static {p1, p3}, Lcom/digdroid/alman/dig/h3;->r(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/h3;

    move-result-object p3

    iput-object p3, p0, Lcom/digdroid/alman/dig/i3;->n:Lcom/digdroid/alman/dig/h3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object p3

    if-eqz p3, :cond_0

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const/4 p5, 0x0

    aget-object p3, p3, p5

    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "/Systems/icons"

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lcom/digdroid/alman/dig/i3;->g:Ljava/lang/String;

    :cond_0
    iget-object p2, p2, Lcom/digdroid/alman/dig/t3;->t:Ljava/lang/String;

    iput-object p2, p0, Lcom/digdroid/alman/dig/i3;->f:Ljava/lang/String;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/digdroid/alman/dig/i3;->g:Ljava/lang/String;

    iput-object p2, p0, Lcom/digdroid/alman/dig/i3;->f:Ljava/lang/String;

    :cond_1
    invoke-virtual {p1}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/i3;->h:Landroid/content/res/Resources;

    iget-object p1, p0, Lcom/digdroid/alman/dig/i3;->i:Lcom/digdroid/alman/dig/c3;

    const-string p2, "systems_list_scale"

    const/high16 p3, 0x3f800000    # 1.0f

    invoke-virtual {p1, p2, p3}, Lcom/digdroid/alman/dig/c3;->f(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/i3;->l:F

    iget-object p1, p0, Lcom/digdroid/alman/dig/i3;->i:Lcom/digdroid/alman/dig/c3;

    const-string p2, "systems_list_spacing"

    invoke-virtual {p1, p2, p3}, Lcom/digdroid/alman/dig/c3;->f(Ljava/lang/String;F)F

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/i3;->m:F

    :cond_2
    return-void
.end method


# virtual methods
.method public bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 1

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    if-eqz p3, :cond_2

    invoke-interface {p3}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p3}, Landroid/database/Cursor;->getCount()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/digdroid/alman/dig/i3$b;

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/i3;->c(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/i3;->e(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method

.method public c(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 4

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/i3$b;

    iget-object v0, p1, Lcom/digdroid/alman/dig/i3$b;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    iget-object v1, p1, Lcom/digdroid/alman/dig/i3$b;->b:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/digdroid/alman/dig/i3$b;->c:Landroid/widget/TextView;

    invoke-virtual {p0, v0, p2, p3}, Lcom/digdroid/alman/dig/i3;->d(Landroid/widget/ImageView;Landroid/content/Context;Landroid/database/Cursor;)V

    iget-boolean p2, p0, Lcom/digdroid/alman/dig/i3;->k:Z

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x1

    invoke-interface {p3, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-interface {p3, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/digdroid/alman/dig/i3;->h:Landroid/content/res/Resources;

    const v2, 0x7f1100ff

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/i3;->j:Ljava/lang/String;

    const-string v2, "date"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    const/4 v2, 0x4

    invoke-interface {p3, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ("

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/util/Calendar;->get(I)I

    move-result p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method d(Landroid/widget/ImageView;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 4

    const/4 v0, 0x3

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/i3;->n:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {v1, p3}, Lcom/digdroid/alman/dig/h3;->A(Ljava/lang/String;)Z

    move-result p3

    const-string v1, "/"

    if-eqz p3, :cond_0

    new-instance p3, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/digdroid/alman/dig/i3;->f:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    new-instance p3, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/digdroid/alman/dig/i3;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-static {p2}, Lcom/digdroid/alman/dig/l1;->b(Landroid/content/Context;)Lcom/digdroid/alman/dig/o1;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/digdroid/alman/dig/o1;->K(Ljava/io/File;)Lcom/digdroid/alman/dig/n1;

    move-result-object p2

    sget-object p3, Lcom/bumptech/glide/load/o/j;->b:Lcom/bumptech/glide/load/o/j;

    invoke-virtual {p2, p3}, Lcom/digdroid/alman/dig/n1;->D0(Lcom/bumptech/glide/load/o/j;)Lcom/digdroid/alman/dig/n1;

    move-result-object p2

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Lcom/digdroid/alman/dig/n1;->V0(Z)Lcom/digdroid/alman/dig/n1;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/bumptech/glide/j;->p0(Landroid/widget/ImageView;)Lcom/bumptech/glide/r/j/i;

    return-void
.end method

.method public e(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 5

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/i3$a;

    iget-object v0, p1, Lcom/digdroid/alman/dig/i3$a;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    iget-object v1, p1, Lcom/digdroid/alman/dig/i3$a;->b:Landroid/widget/TextView;

    iget-object v2, p1, Lcom/digdroid/alman/dig/i3$a;->c:Landroid/widget/TextView;

    iget-object p1, p1, Lcom/digdroid/alman/dig/i3$a;->d:Landroid/widget/TextView;

    invoke-virtual {p0, v0, p2, p3}, Lcom/digdroid/alman/dig/i3;->d(Landroid/widget/ImageView;Landroid/content/Context;Landroid/database/Cursor;)V

    const/4 v0, 0x1

    invoke-interface {p3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f11020c

    invoke-virtual {p2, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x4

    invoke-interface {p3, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    invoke-virtual {p0, v3, v4}, Lcom/digdroid/alman/dig/q1;->b(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-interface {p3, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p2, p0, Lcom/digdroid/alman/dig/i3;->h:Landroid/content/res/Resources;

    const p3, 0x7f1100ff

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public f(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/q1;->e:Landroid/view/LayoutInflater;

    const p2, 0x7f0c00ef

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/digdroid/alman/dig/i3$b;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/i3$b;-><init>(Lcom/digdroid/alman/dig/i3;)V

    const p3, 0x7f0903d6

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/digdroid/alman/dig/SquaredImageView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/i3$b;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    iget v0, p0, Lcom/digdroid/alman/dig/q1;->d:F

    invoke-virtual {p3, v0}, Lcom/digdroid/alman/dig/SquaredImageView;->c(F)V

    const p3, 0x7f0903d8

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/i3$b;->b:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/t3;

    iget v0, v0, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const p3, 0x7f0903d7

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/i3$b;->c:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/t3;

    iget v0, v0, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget-boolean p3, p0, Lcom/digdroid/alman/dig/i3;->k:Z

    if-eqz p3, :cond_0

    iget-object p3, p2, Lcom/digdroid/alman/dig/i3$b;->b:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object p3, p2, Lcom/digdroid/alman/dig/i3$b;->c:Landroid/widget/TextView;

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-object p1
.end method

.method public g(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    iget-object p1, p0, Lcom/digdroid/alman/dig/q1;->e:Landroid/view/LayoutInflater;

    const p2, 0x7f0c00f0

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance p2, Lcom/digdroid/alman/dig/i3$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/i3$a;-><init>(Lcom/digdroid/alman/dig/i3;)V

    const p3, 0x7f0901a9

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/digdroid/alman/dig/SquaredImageView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/i3$a;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    iget v1, p0, Lcom/digdroid/alman/dig/q1;->d:F

    invoke-virtual {p3, v1}, Lcom/digdroid/alman/dig/SquaredImageView;->c(F)V

    const p3, 0x7f0901ac

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/i3$a;->b:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->e:I

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const p3, 0x7f0903d3

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/i3$a;->c:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const p3, 0x7f090318

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iput-object p3, p2, Lcom/digdroid/alman/dig/i3$a;->d:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/digdroid/alman/dig/q1;->b:Lcom/digdroid/alman/dig/t3;

    iget v1, v1, Lcom/digdroid/alman/dig/t3;->f:I

    invoke-virtual {p3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 p3, 0x41200000    # 10.0f

    invoke-static {p3}, Lcom/digdroid/alman/dig/q3;->e(F)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-virtual {p1, v1, p3, v2, p3}, Landroid/view/View;->setPadding(IIII)V

    iget p3, p0, Lcom/digdroid/alman/dig/i3;->l:F

    const/high16 v1, 0x42a00000    # 80.0f

    mul-float p3, p3, v1

    invoke-static {p3}, Lcom/digdroid/alman/dig/q3;->d(F)F

    move-result p3

    iget-object v1, p2, Lcom/digdroid/alman/dig/i3$a;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p2, Lcom/digdroid/alman/dig/i3$a;->a:Lcom/digdroid/alman/dig/SquaredImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    iput p3, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iget-object p3, p2, Lcom/digdroid/alman/dig/i3$a;->b:Landroid/widget/TextView;

    iget v1, p0, Lcom/digdroid/alman/dig/i3;->l:F

    const/high16 v2, 0x41900000    # 18.0f

    mul-float v1, v1, v2

    invoke-static {v1}, Lcom/digdroid/alman/dig/q3;->u(F)F

    move-result v1

    invoke-virtual {p3, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    iget p3, p0, Lcom/digdroid/alman/dig/i3;->l:F

    const/high16 v1, 0x41a00000    # 20.0f

    mul-float p3, p3, v1

    invoke-static {p3}, Lcom/digdroid/alman/dig/q3;->d(F)F

    move-result p3

    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    iget-object v1, p2, Lcom/digdroid/alman/dig/i3$a;->b:Landroid/widget/TextView;

    invoke-virtual {v1, p3, v0, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v1, p2, Lcom/digdroid/alman/dig/i3$a;->c:Landroid/widget/TextView;

    iget v2, p0, Lcom/digdroid/alman/dig/i3;->l:F

    const/high16 v3, 0x41600000    # 14.0f

    mul-float v2, v2, v3

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->u(F)F

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v1, p2, Lcom/digdroid/alman/dig/i3$a;->c:Landroid/widget/TextView;

    invoke-virtual {v1, p3, v0, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v1, p2, Lcom/digdroid/alman/dig/i3$a;->d:Landroid/widget/TextView;

    iget v2, p0, Lcom/digdroid/alman/dig/i3;->l:F

    mul-float v2, v2, v3

    invoke-static {v2}, Lcom/digdroid/alman/dig/q3;->u(F)F

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    iget-object v1, p2, Lcom/digdroid/alman/dig/i3$a;->d:Landroid/widget/TextView;

    invoke-virtual {v1, p3, v0, v0, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-object p1
.end method

.method public newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/i3;->i:Lcom/digdroid/alman/dig/c3;

    const-string v1, "systems_list_type"

    const-string v2, "grid"

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/c3;->q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/i3;->g(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/digdroid/alman/dig/i3;->f(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
