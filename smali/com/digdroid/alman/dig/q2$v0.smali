.class Lcom/digdroid/alman/dig/q2$v0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/q2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "v0"
.end annotation


# instance fields
.field b:Z

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field h:I

.field final synthetic i:Lcom/digdroid/alman/dig/q2;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/q2;IIII)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$v0;->i:Lcom/digdroid/alman/dig/q2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/q2$v0;->b:Z

    const/4 p1, -0x1

    iput p1, p0, Lcom/digdroid/alman/dig/q2$v0;->g:I

    iput p1, p0, Lcom/digdroid/alman/dig/q2$v0;->h:I

    iput p2, p0, Lcom/digdroid/alman/dig/q2$v0;->c:I

    iput p3, p0, Lcom/digdroid/alman/dig/q2$v0;->d:I

    iput p4, p0, Lcom/digdroid/alman/dig/q2$v0;->e:I

    iput p5, p0, Lcom/digdroid/alman/dig/q2$v0;->f:I

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q2$v0;->a()V

    return-void
.end method

.method public constructor <init>(Lcom/digdroid/alman/dig/q2;IIIIII)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$v0;->i:Lcom/digdroid/alman/dig/q2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/q2$v0;->b:Z

    const/4 p1, -0x1

    iput p1, p0, Lcom/digdroid/alman/dig/q2$v0;->g:I

    iput p1, p0, Lcom/digdroid/alman/dig/q2$v0;->h:I

    iput p2, p0, Lcom/digdroid/alman/dig/q2$v0;->c:I

    iput p3, p0, Lcom/digdroid/alman/dig/q2$v0;->d:I

    iput p4, p0, Lcom/digdroid/alman/dig/q2$v0;->e:I

    iput p5, p0, Lcom/digdroid/alman/dig/q2$v0;->f:I

    iput p6, p0, Lcom/digdroid/alman/dig/q2$v0;->g:I

    iput p7, p0, Lcom/digdroid/alman/dig/q2$v0;->h:I

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q2$v0;->a()V

    return-void
.end method

.method private a()V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/q2$v0;->i:Lcom/digdroid/alman/dig/q2;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget v1, p0, Lcom/digdroid/alman/dig/q2$v0;->d:I

    if-ltz v1, :cond_2

    iget-object v1, p0, Lcom/digdroid/alman/dig/q2$v0;->i:Lcom/digdroid/alman/dig/q2;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->x0()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070099

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Landroid/graphics/PorterDuffColorFilter;

    iget-object v3, p0, Lcom/digdroid/alman/dig/q2$v0;->i:Lcom/digdroid/alman/dig/q2;

    iget-object v3, v3, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v3, v3, Lcom/digdroid/alman/dig/s3;->f:I

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v3, v4}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    iget-object v2, p0, Lcom/digdroid/alman/dig/q2$v0;->i:Lcom/digdroid/alman/dig/q2;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v2

    iget v3, p0, Lcom/digdroid/alman/dig/q2$v0;->d:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-boolean v1, p0, Lcom/digdroid/alman/dig/q2$v0;->b:Z

    if-eqz v1, :cond_1

    const/high16 v1, 0x42b40000    # 90.0f

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setRotation(F)V

    :cond_2
    iget-object v1, p0, Lcom/digdroid/alman/dig/q2$v0;->i:Lcom/digdroid/alman/dig/q2;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v1

    iget v2, p0, Lcom/digdroid/alman/dig/q2$v0;->c:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p0, Lcom/digdroid/alman/dig/q2$v0;->e:I

    invoke-virtual {v0, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/q2$v0;->i:Lcom/digdroid/alman/dig/q2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->g0:Lcom/digdroid/alman/dig/s3;

    iget v0, v0, Lcom/digdroid/alman/dig/s3;->f:I

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    iget v0, p0, Lcom/digdroid/alman/dig/q2$v0;->g:I

    if-ltz v0, :cond_4

    iget-boolean v2, p0, Lcom/digdroid/alman/dig/q2$v0;->b:Z

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    iget v0, p0, Lcom/digdroid/alman/dig/q2$v0;->h:I

    :goto_1
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setNextFocusDownId(I)V

    :cond_4
    :goto_2
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-boolean p1, p0, Lcom/digdroid/alman/dig/q2$v0;->b:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lcom/digdroid/alman/dig/q2$v0;->b:Z

    invoke-direct {p0}, Lcom/digdroid/alman/dig/q2$v0;->a()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$v0;->i:Lcom/digdroid/alman/dig/q2;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object p1

    iget v0, p0, Lcom/digdroid/alman/dig/q2$v0;->f:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iget-boolean v0, p0, Lcom/digdroid/alman/dig/q2$v0;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method
