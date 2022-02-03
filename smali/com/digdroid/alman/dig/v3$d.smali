.class Lcom/digdroid/alman/dig/v3$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v3;->x1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/v3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v3$d;->b:Lcom/digdroid/alman/dig/v3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/v3$d;->b:Lcom/digdroid/alman/dig/v3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/c3;

    const-string v0, "toolbar_icon_spacing"

    const v1, 0x3da3d70a

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/c3;->f(Ljava/lang/String;F)F

    move-result v1

    const v2, 0x3ca3d70a

    sub-float/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/c3;->D(Ljava/lang/String;F)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/v3$d;->b:Lcom/digdroid/alman/dig/v3;

    iget-object v0, p1, Lcom/digdroid/alman/dig/v3;->y0:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/v3;->H1(Ljava/lang/String;Z)V

    return-void
.end method
