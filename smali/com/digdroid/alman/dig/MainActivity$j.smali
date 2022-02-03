.class Lcom/digdroid/alman/dig/MainActivity$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/MainActivity;->Z2()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/MainActivity;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/MainActivity$j;->b:Lcom/digdroid/alman/dig/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity$j;->b:Lcom/digdroid/alman/dig/MainActivity;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t;->w:Lcom/digdroid/alman/dig/b3;

    const-string v1, "orientation"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/digdroid/alman/dig/b3;->l(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity$j;->b:Lcom/digdroid/alman/dig/MainActivity;

    const/4 v1, 0x7

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity$j;->b:Lcom/digdroid/alman/dig/MainActivity;

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity$j;->b:Lcom/digdroid/alman/dig/MainActivity;

    invoke-virtual {v0, v2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/digdroid/alman/dig/MainActivity$j;->b:Lcom/digdroid/alman/dig/MainActivity;

    const/16 v1, 0xa

    :goto_0
    invoke-virtual {v0, v1}, Landroid/app/Activity;->setRequestedOrientation(I)V

    :goto_1
    return-void
.end method
