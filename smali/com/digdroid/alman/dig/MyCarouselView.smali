.class Lcom/digdroid/alman/dig/MyCarouselView;
.super Lc/c/a/a/c/a;
.source ""


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lc/c/a/a/c/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Lcom/digdroid/alman/dig/f2;

    invoke-direct {p1}, Lcom/digdroid/alman/dig/f2;-><init>()V

    invoke-virtual {p0, p1}, Lc/c/a/a/c/a;->setLayoutManagerInternal(Lcom/gtomato/android/ui/manager/CarouselLayoutManager;)V

    return-void
.end method
