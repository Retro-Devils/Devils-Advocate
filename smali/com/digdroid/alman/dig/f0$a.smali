.class Lcom/digdroid/alman/dig/f0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f0;->A3(Landroid/view/MenuItem;JLjava/lang/String;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:J

.field final synthetic c:Lcom/digdroid/alman/dig/f0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f0;J)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f0$a;->c:Lcom/digdroid/alman/dig/f0;

    iput-wide p2, p0, Lcom/digdroid/alman/dig/f0$a;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/f0$a;->c:Lcom/digdroid/alman/dig/f0;

    iget-wide v0, p0, Lcom/digdroid/alman/dig/f0$a;->b:J

    invoke-virtual {p1, v0, v1}, Lcom/digdroid/alman/dig/f0;->C3(J)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f0$a;->c:Lcom/digdroid/alman/dig/f0;

    const-wide/16 v0, 0x0

    iput-wide v0, p1, Lcom/digdroid/alman/dig/f0;->z0:J

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->R()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f0$a;->c:Lcom/digdroid/alman/dig/f0;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/r1;->G2(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f0$a;->c:Lcom/digdroid/alman/dig/f0;

    iget-object p2, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/digdroid/alman/dig/p1$a;->L(I)V

    return-void
.end method
