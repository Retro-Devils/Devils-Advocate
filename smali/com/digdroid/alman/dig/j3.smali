.class Lcom/digdroid/alman/dig/j3;
.super Lcom/digdroid/alman/dig/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/j3$a;
    }
.end annotation


# instance fields
.field l:Ljava/lang/String;

.field m:Ljava/lang/String;

.field n:Landroid/content/res/Resources;

.field o:Lcom/digdroid/alman/dig/c3;

.field p:Landroid/app/Activity;

.field q:Ljava/lang/String;

.field r:Z

.field s:Lcom/digdroid/alman/dig/h3;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FFLjava/lang/String;Z)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/digdroid/alman/dig/h;-><init>(Lcom/digdroid/alman/dig/MainActivity;Lcom/digdroid/alman/dig/t3;Landroid/database/Cursor;FF)V

    if-eqz p1, :cond_2

    iput-object p1, p0, Lcom/digdroid/alman/dig/j3;->p:Landroid/app/Activity;

    iput-object p6, p0, Lcom/digdroid/alman/dig/j3;->q:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/digdroid/alman/dig/j3;->r:Z

    invoke-static {p1}, Lcom/digdroid/alman/dig/c3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/c3;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/j3;->o:Lcom/digdroid/alman/dig/c3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/u;->e(Landroid/content/Context;)Lcom/digdroid/alman/dig/u;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/digdroid/alman/dig/h3;->r(Landroid/content/Context;Lcom/digdroid/alman/dig/u;)Lcom/digdroid/alman/dig/h3;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/j3;->s:Lcom/digdroid/alman/dig/h3;

    invoke-static {p1}, Lcom/digdroid/alman/dig/h2;->b(Landroid/content/Context;)[Ljava/io/File;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const/4 p4, 0x0

    aget-object p2, p2, p4

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "/Systems/icons"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Lcom/digdroid/alman/dig/j3;->m:Ljava/lang/String;

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/h;->c:Lcom/digdroid/alman/dig/t3;

    iget-object p2, p2, Lcom/digdroid/alman/dig/t3;->t:Ljava/lang/String;

    iput-object p2, p0, Lcom/digdroid/alman/dig/j3;->l:Ljava/lang/String;

    const-string p3, ""

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/digdroid/alman/dig/j3;->m:Ljava/lang/String;

    iput-object p2, p0, Lcom/digdroid/alman/dig/j3;->l:Ljava/lang/String;

    :cond_1
    invoke-virtual {p1}, Landroidx/appcompat/app/c;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/j3;->n:Landroid/content/res/Resources;

    :cond_2
    return-void
.end method


# virtual methods
.method A(Landroid/widget/ImageView;Landroid/content/Context;Landroid/database/Cursor;)V
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

    iget-object v1, p0, Lcom/digdroid/alman/dig/j3;->s:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {v1, p3}, Lcom/digdroid/alman/dig/h3;->A(Ljava/lang/String;)Z

    move-result p3

    const-string v1, "/"

    if-eqz p3, :cond_0

    new-instance p3, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/digdroid/alman/dig/j3;->l:Ljava/lang/String;

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

    iget-object v3, p0, Lcom/digdroid/alman/dig/j3;->m:Ljava/lang/String;

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

.method public j(Landroidx/recyclerview/widget/RecyclerView$d0;I)V
    .locals 4

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    if-eqz v0, :cond_3

    invoke-interface {v0}, Landroid/database/Cursor;->isClosed()Z

    move-result v0

    if-nez v0, :cond_3

    iget v0, p0, Lcom/digdroid/alman/dig/h;->e:I

    if-ge p2, v0, :cond_3

    iget-object v0, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    invoke-interface {v0, p2}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Lcom/digdroid/alman/dig/j3$a;

    iget-object p2, p1, Lcom/digdroid/alman/dig/j3$a;->t:Landroid/widget/ImageView;

    iget-object v0, p0, Lcom/digdroid/alman/dig/j3;->p:Landroid/app/Activity;

    iget-object v1, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    invoke-virtual {p0, p2, v0, v1}, Lcom/digdroid/alman/dig/j3;->A(Landroid/widget/ImageView;Landroid/content/Context;Landroid/database/Cursor;)V

    iget-boolean p2, p0, Lcom/digdroid/alman/dig/j3;->r:Z

    if-eqz p2, :cond_1

    return-void

    :cond_1
    iget-object p2, p1, Lcom/digdroid/alman/dig/j3$a;->u:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    const/4 v2, 0x2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/digdroid/alman/dig/j3;->n:Landroid/content/res/Resources;

    const v2, 0x7f1100ff

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/digdroid/alman/dig/j3;->q:Ljava/lang/String;

    const-string v2, "date"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/h;->d:Landroid/database/Cursor;

    const/4 v3, 0x4

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " ("

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_2
    iget-object p1, p1, Lcom/digdroid/alman/dig/j3$a;->v:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public l(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c002e

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0903d6

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/digdroid/alman/dig/SquaredImageView;

    iget v0, p0, Lcom/digdroid/alman/dig/h;->h:F

    invoke-virtual {p2, v0}, Lcom/digdroid/alman/dig/SquaredImageView;->c(F)V

    new-instance p2, Lcom/digdroid/alman/dig/j3$a;

    invoke-direct {p2, p0, p1}, Lcom/digdroid/alman/dig/j3$a;-><init>(Lcom/digdroid/alman/dig/j3;Landroid/view/View;)V

    return-object p2
.end method
