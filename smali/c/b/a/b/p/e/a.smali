.class public Lc/b/a/b/p/e/a;
.super Lc/b/a/b/n/a;
.source ""

# interfaces
.implements Lc/b/a/b/p/d;


# instance fields
.field private final s:Lc/b/a/b/p/c;


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    iget-object v0, p0, Lc/b/a/b/p/e/a;->s:Lc/b/a/b/p/c;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->draw(Landroid/graphics/Canvas;)V

    return-void

    :cond_0
    const/4 p1, 0x0

    throw p1
.end method

.method public getCircularRevealOverlayDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public getCircularRevealScrimColor()I
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public getRevealInfo()Lc/b/a/b/p/d$e;
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public isOpaque()Z
    .locals 1

    iget-object v0, p0, Lc/b/a/b/p/e/a;->s:Lc/b/a/b/p/c;

    if-nez v0, :cond_0

    invoke-super {p0}, Landroid/widget/FrameLayout;->isOpaque()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    throw v0
.end method

.method public setCircularRevealOverlayDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public setCircularRevealScrimColor(I)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public setRevealInfo(Lc/b/a/b/p/d$e;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
