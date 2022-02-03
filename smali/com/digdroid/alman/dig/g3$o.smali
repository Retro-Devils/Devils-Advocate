.class Lcom/digdroid/alman/dig/g3$o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/g3;->H2(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/g3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/g3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g3$o;->a:Lcom/digdroid/alman/dig/g3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/digdroid/alman/dig/g3$o;->a:Lcom/digdroid/alman/dig/g3;

    iget-object v1, v0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/h3;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/g3$o;->a:Lcom/digdroid/alman/dig/g3;

    iget-object v2, v2, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v2, v2, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    new-instance v3, Lcom/digdroid/alman/dig/g3$o$a;

    invoke-direct {v3, p0}, Lcom/digdroid/alman/dig/g3$o$a;-><init>(Lcom/digdroid/alman/dig/g3$o;)V

    invoke-virtual {v1, v0, v2, v3}, Lcom/digdroid/alman/dig/h3;->B(Landroid/app/Activity;Ljava/lang/String;Lcom/digdroid/alman/dig/h3$o;)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
