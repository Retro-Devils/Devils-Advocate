.class Lcom/digdroid/alman/dig/j0$y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0;->q3(Z)V
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

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$y;->b:Lcom/digdroid/alman/dig/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$y;->b:Lcom/digdroid/alman/dig/j0;

    const/4 v0, 0x0

    iput-boolean v0, p1, Lcom/digdroid/alman/dig/j0;->v0:Z

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/j0;->A3()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$y;->b:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/j0;->v3()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$y;->b:Lcom/digdroid/alman/dig/j0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0;->w1:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/widget/ImageView;->requestFocus()Z

    return-void
.end method
