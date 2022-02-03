.class Lcom/digdroid/alman/dig/e3$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/e3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/e3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/e3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/e3$a;->b:Lcom/digdroid/alman/dig/e3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    const/16 v1, 0x5c

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    iget-object v1, p0, Lcom/digdroid/alman/dig/e3$a;->b:Lcom/digdroid/alman/dig/e3;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->F0()Landroid/view/View;

    move-result-object v1

    const/16 v4, 0xff

    invoke-static {v4, v2, v3, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/e3$a;->b:Lcom/digdroid/alman/dig/e3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/e3;->o0:Landroid/os/Handler;

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
