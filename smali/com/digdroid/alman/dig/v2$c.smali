.class Lcom/digdroid/alman/dig/v2$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v2;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/v2$b;

.field final synthetic b:Landroid/widget/RatingBar;

.field final synthetic c:Lcom/digdroid/alman/dig/v2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v2;Lcom/digdroid/alman/dig/v2$b;Landroid/widget/RatingBar;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v2$c;->c:Lcom/digdroid/alman/dig/v2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/v2$c;->a:Lcom/digdroid/alman/dig/v2$b;

    iput-object p3, p0, Lcom/digdroid/alman/dig/v2$c;->b:Landroid/widget/RatingBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/v2$c;->a:Lcom/digdroid/alman/dig/v2$b;

    if-eqz p2, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x5

    :goto_0
    int-to-float v0, v0

    iput v0, p1, Lcom/digdroid/alman/dig/v2$b;->a:F

    iget-object p1, p0, Lcom/digdroid/alman/dig/v2$c;->b:Landroid/widget/RatingBar;

    if-eqz p2, :cond_1

    const/16 v0, 0x8

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/RatingBar;->setVisibility(I)V

    if-nez p2, :cond_2

    iget-object p1, p0, Lcom/digdroid/alman/dig/v2$c;->b:Landroid/widget/RatingBar;

    const/high16 p2, 0x40a00000    # 5.0f

    invoke-virtual {p1, p2}, Landroid/widget/RatingBar;->setRating(F)V

    :cond_2
    return-void
.end method
