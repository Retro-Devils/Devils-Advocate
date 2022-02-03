.class Landroidx/leanback/widget/SearchOrbView$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/leanback/widget/SearchOrbView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/leanback/widget/SearchOrbView;


# direct methods
.method constructor <init>(Landroidx/leanback/widget/SearchOrbView;)V
    .locals 0

    iput-object p1, p0, Landroidx/leanback/widget/SearchOrbView$b;->a:Landroidx/leanback/widget/SearchOrbView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    iget-object v0, p0, Landroidx/leanback/widget/SearchOrbView$b;->a:Landroidx/leanback/widget/SearchOrbView;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/leanback/widget/SearchOrbView;->setSearchOrbZ(F)V

    return-void
.end method
