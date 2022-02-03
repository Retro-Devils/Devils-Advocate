.class Lcom/digdroid/alman/dig/r2$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/r2;->J3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/r2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/r2;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/r2$f;->b:Lcom/digdroid/alman/dig/r2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$f;->b:Lcom/digdroid/alman/dig/r2;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/digdroid/alman/dig/r2$f;->b:Lcom/digdroid/alman/dig/r2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/digdroid/alman/dig/p1$a;->x(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
