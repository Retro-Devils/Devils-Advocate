.class Lcom/digdroid/alman/dig/MyViewPager;
.super Lb/s/a/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/digdroid/alman/dig/MyViewPager$a;
    }
.end annotation


# instance fields
.field m0:Lcom/digdroid/alman/dig/b3;

.field n0:Lcom/digdroid/alman/dig/MyViewPager$a;

.field o0:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb/s/a/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/digdroid/alman/dig/MyViewPager;->n0:Lcom/digdroid/alman/dig/MyViewPager$a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/digdroid/alman/dig/b3;->k(Landroid/content/Context;)Lcom/digdroid/alman/dig/b3;

    move-result-object p1

    iput-object p1, p0, Lcom/digdroid/alman/dig/MyViewPager;->m0:Lcom/digdroid/alman/dig/b3;

    return-void
.end method

.method private Q(Landroid/view/MotionEvent;)Z
    .locals 4

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    return v1

    :cond_0
    iget v0, p0, Lcom/digdroid/alman/dig/MyViewPager;->o0:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    sub-float/2addr v0, p1

    const/4 p1, 0x0

    cmpg-float p1, v0, p1

    if-gez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iput p1, p0, Lcom/digdroid/alman/dig/MyViewPager;->o0:F

    return v1
.end method


# virtual methods
.method public P(Lcom/digdroid/alman/dig/MyViewPager$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MyViewPager;->n0:Lcom/digdroid/alman/dig/MyViewPager$a;

    return-void
.end method

.method public c(I)Z
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/MyViewPager;->m0:Lcom/digdroid/alman/dig/b3;

    const-string v1, "allow_paging"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->c(Ljava/lang/String;Z)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/MyViewPager;->n0:Lcom/digdroid/alman/dig/MyViewPager$a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/digdroid/alman/dig/MyViewPager$a;->O()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/16 v0, 0x11

    if-ne p1, v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/MyViewPager;->m0:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->h()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lb/s/a/b;->getCurrentItem()I

    move-result v0

    if-ne v0, v2, :cond_2

    return v1

    :cond_2
    invoke-super {p0, p1}, Lb/s/a/b;->c(I)Z

    move-result p1

    return p1
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/MyViewPager;->Q(Landroid/view/MotionEvent;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/digdroid/alman/dig/MyViewPager;->m0:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v1}, Lcom/digdroid/alman/dig/b3;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lb/s/a/b;->getCurrentItem()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/digdroid/alman/dig/MyViewPager;->n0:Lcom/digdroid/alman/dig/MyViewPager$a;

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lcom/digdroid/alman/dig/MyViewPager$a;->O()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-super {p0, p1}, Lb/s/a/b;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    :cond_1
    return v0
.end method

.method protected onMeasure(II)V
    .locals 0

    :try_start_0
    invoke-super {p0, p1, p2}, Lb/s/a/b;->onMeasure(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-direct {p0, p1}, Lcom/digdroid/alman/dig/MyViewPager;->Q(Landroid/view/MotionEvent;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/MyViewPager;->m0:Lcom/digdroid/alman/dig/b3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/b3;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb/s/a/b;->getCurrentItem()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/MyViewPager;->n0:Lcom/digdroid/alman/dig/MyViewPager$a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/digdroid/alman/dig/MyViewPager$a;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-super {p0, p1}, Lb/s/a/b;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_1
    return v1
.end method
