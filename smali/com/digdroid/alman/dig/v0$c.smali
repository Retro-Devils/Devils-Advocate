.class Lcom/digdroid/alman/dig/v0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/o2$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/v0;-><init>(Lcom/digdroid/alman/dig/r1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/v0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/v0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/v0$c;->a:Lcom/digdroid/alman/dig/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0$c;->a:Lcom/digdroid/alman/dig/v0;

    invoke-static {v0}, Lcom/digdroid/alman/dig/v0;->a(Lcom/digdroid/alman/dig/v0;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public b()Z
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/v0$c;->a:Lcom/digdroid/alman/dig/v0;

    iget-object v1, v0, Lcom/digdroid/alman/dig/v0;->a:Lcom/digdroid/alman/dig/r1;

    iget-boolean v1, v1, Lcom/digdroid/alman/dig/p1;->j0:Z

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/digdroid/alman/dig/v0;->D:I

    iget v0, v0, Lcom/digdroid/alman/dig/v0;->C:I

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()V
    .locals 0

    return-void
.end method
