.class Lcom/digdroid/alman/dig/e2$l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/e2;-><init>(Lcom/digdroid/alman/dig/MainActivity;Landroid/view/View;Ljava/lang/String;Lcom/digdroid/alman/dig/e2$s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/e2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/e2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e2$l;->b:Lcom/digdroid/alman/dig/e2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    const/4 p1, 0x0

    if-nez p2, :cond_0

    return p1

    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2$l;->b:Lcom/digdroid/alman/dig/e2;

    iget-boolean v2, v0, Lcom/digdroid/alman/dig/e2;->q:Z

    if-eqz v2, :cond_1

    iput-boolean p1, v0, Lcom/digdroid/alman/dig/e2;->q:Z

    return v1

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/e2$l;->b:Lcom/digdroid/alman/dig/e2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/e2;->p:Lcom/digdroid/alman/dig/c3;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/c3;->t()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/digdroid/alman/dig/e2$l;->b:Lcom/digdroid/alman/dig/e2;

    iget-object v0, v0, Lcom/digdroid/alman/dig/e2;->r:Landroid/view/ScaleGestureDetector;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p2}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_2
    return p1
.end method
