.class Lcom/digdroid/alman/dig/j0$u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0;->o3(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$u;->b:Lcom/digdroid/alman/dig/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    invoke-static {}, Lcom/digdroid/alman/dig/d0;->p()Lcom/digdroid/alman/dig/d0;

    move-result-object p1

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$u;->b:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    new-instance v1, Lcom/digdroid/alman/dig/j0$u$a;

    invoke-direct {v1, p0}, Lcom/digdroid/alman/dig/j0$u$a;-><init>(Lcom/digdroid/alman/dig/j0$u;)V

    const/4 v2, 0x5

    invoke-virtual {p1, v0, v2, v1}, Lcom/digdroid/alman/dig/d0;->r(Landroid/app/Activity;ILcom/digdroid/alman/dig/d0$r;)V

    return-void
.end method
