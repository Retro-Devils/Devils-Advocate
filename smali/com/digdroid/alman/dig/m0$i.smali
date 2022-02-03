.class Lcom/digdroid/alman/dig/m0$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/m0;->c(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/m0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/m0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/m0$i;->a:Lcom/digdroid/alman/dig/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0$i;->a:Lcom/digdroid/alman/dig/m0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/m0$i;->a:Lcom/digdroid/alman/dig/m0;

    iget-object v1, v0, Lcom/digdroid/alman/dig/m0;->a:Landroid/app/Activity;

    iget-wide v2, v0, Lcom/digdroid/alman/dig/m0;->b:J

    const/4 v0, 0x0

    invoke-static {v1, v2, v3, v0}, Lcom/digdroid/alman/dig/MyWidget;->a(Landroid/app/Activity;JZ)V

    :cond_0
    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
