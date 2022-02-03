.class Lcom/digdroid/alman/dig/q2$a0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2;->v3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/q2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$a0;->b:Lcom/digdroid/alman/dig/q2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$a0;->b:Lcom/digdroid/alman/dig/q2;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/digdroid/alman/dig/q2$a0$a;

    invoke-direct {v0, p0, p1}, Lcom/digdroid/alman/dig/q2$a0$a;-><init>(Lcom/digdroid/alman/dig/q2$a0;Landroid/app/Activity;)V

    invoke-static {p1, v0}, Lcom/digdroid/alman/dig/h2;->e(Landroid/content/Context;Lcom/digdroid/alman/dig/h2$b;)V

    :cond_1
    :goto_0
    return-void
.end method
