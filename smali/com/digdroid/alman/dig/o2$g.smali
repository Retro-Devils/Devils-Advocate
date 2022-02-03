.class Lcom/digdroid/alman/dig/o2$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/o2;->x1(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/o2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/o2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/o2$g;->b:Lcom/digdroid/alman/dig/o2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/o2$g;->b:Lcom/digdroid/alman/dig/o2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/o2;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz p1, :cond_0

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setVisibility(I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/o2$g;->b:Lcom/digdroid/alman/dig/o2;

    const/4 p2, 0x0

    iput-object p2, p1, Lcom/digdroid/alman/dig/o2;->E0:Landroidx/constraintlayout/widget/ConstraintLayout;

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
