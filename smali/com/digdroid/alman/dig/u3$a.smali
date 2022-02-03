.class Lcom/digdroid/alman/dig/u3$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/u3;->v1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/u3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/u3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/u3$a;->b:Lcom/digdroid/alman/dig/u3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3$a;->b:Lcom/digdroid/alman/dig/u3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const-string v0, "icons_toolbar_scale"

    const/high16 v1, 0x41200000    # 10.0f

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/b3;->f(Ljava/lang/String;F)F

    move-result v1

    const/high16 v2, 0x3e800000    # 0.25f

    sub-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/b3;->D(Ljava/lang/String;F)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3$a;->b:Lcom/digdroid/alman/dig/u3;

    iget-object v0, p1, Lcom/digdroid/alman/dig/u3;->y0:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/u3;->F1(Ljava/lang/String;Z)V

    return-void
.end method
