.class Lcom/digdroid/alman/dig/j0$v;
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

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$v;->b:Lcom/digdroid/alman/dig/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$v;->b:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$v;->b:Lcom/digdroid/alman/dig/j0;

    iget-object v0, p1, Lcom/digdroid/alman/dig/p1;->c0:Lcom/digdroid/alman/dig/o0;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/z3;

    iget-object v1, p0, Lcom/digdroid/alman/dig/j0$v;->b:Lcom/digdroid/alman/dig/j0;

    iget-wide v2, v1, Lcom/digdroid/alman/dig/j0;->q0:J

    iget-object v1, v1, Lcom/digdroid/alman/dig/j0;->f1:Lcom/digdroid/alman/dig/h0;

    invoke-virtual {v0, p1, v2, v3, v1}, Lcom/digdroid/alman/dig/o0;->i(Lcom/digdroid/alman/dig/z3;JLcom/digdroid/alman/dig/h0;)V

    :cond_0
    return-void
.end method
