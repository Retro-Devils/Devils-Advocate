.class Lcom/digdroid/alman/dig/j0$j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/m0$p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0;->H2(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/digdroid/alman/dig/j0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$j;->b:Lcom/digdroid/alman/dig/j0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/j0$j;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$j;->b:Lcom/digdroid/alman/dig/j0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->R()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$j;->b:Lcom/digdroid/alman/dig/j0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/j0;->G2(Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$j;->b:Lcom/digdroid/alman/dig/j0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->u0()V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$j;->b:Lcom/digdroid/alman/dig/j0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->R()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$j;->b:Lcom/digdroid/alman/dig/j0;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/j0;->F2()V

    return-void
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$j;->b:Lcom/digdroid/alman/dig/j0;

    iput-boolean p1, v0, Lcom/digdroid/alman/dig/j0;->x0:Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$j;->a:Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$j;->b:Lcom/digdroid/alman/dig/j0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->R()V

    return-void
.end method

.method public getFilter()Lcom/digdroid/alman/dig/h0;
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/j0$j;->b:Lcom/digdroid/alman/dig/j0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/j0;->f1:Lcom/digdroid/alman/dig/h0;

    return-object v0
.end method
