.class Lcom/digdroid/alman/dig/f3$i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f3;->H2(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/f3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f3$i;->a:Lcom/digdroid/alman/dig/f3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/f3$i;->a:Lcom/digdroid/alman/dig/f3;

    iget-object v1, v0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/g3;->w(Ljava/lang/String;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v0, v2}, Lcom/digdroid/alman/dig/g3;->H(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/f3$i;->a:Lcom/digdroid/alman/dig/f3;

    iget-object v1, v0, Lcom/digdroid/alman/dig/p1;->b0:Lcom/digdroid/alman/dig/g3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/t0;->s0:Lcom/digdroid/alman/dig/h0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h0;->h:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/digdroid/alman/dig/g3;->D(Ljava/lang/String;)Z

    iget-object v0, p0, Lcom/digdroid/alman/dig/f3$i;->a:Lcom/digdroid/alman/dig/f3;

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->R()V

    iget-object v0, p0, Lcom/digdroid/alman/dig/f3$i;->a:Lcom/digdroid/alman/dig/f3;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/r1;->G2(Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/f3$i;->a:Lcom/digdroid/alman/dig/f3;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/t0;->q3()V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
