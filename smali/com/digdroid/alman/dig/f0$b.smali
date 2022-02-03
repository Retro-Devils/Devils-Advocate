.class Lcom/digdroid/alman/dig/f0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f0;->C3(Landroid/view/MenuItem;JLjava/lang/String;Ljava/lang/String;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/EditText;

.field final synthetic c:J

.field final synthetic d:Lcom/digdroid/alman/dig/f0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f0;Landroid/widget/EditText;J)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f0$b;->d:Lcom/digdroid/alman/dig/f0;

    iput-object p2, p0, Lcom/digdroid/alman/dig/f0$b;->b:Landroid/widget/EditText;

    iput-wide p3, p0, Lcom/digdroid/alman/dig/f0$b;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/f0$b;->b:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p2, ""

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lcom/digdroid/alman/dig/f0$b;->d:Lcom/digdroid/alman/dig/f0;

    iget-wide v0, p0, Lcom/digdroid/alman/dig/f0$b;->c:J

    invoke-virtual {p2, v0, v1, p1}, Lcom/digdroid/alman/dig/f0;->I3(JLjava/lang/String;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f0$b;->d:Lcom/digdroid/alman/dig/f0;

    const-wide/16 v0, 0x0

    iput-wide v0, p1, Lcom/digdroid/alman/dig/f0;->z0:J

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->R()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f0$b;->d:Lcom/digdroid/alman/dig/f0;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/r1;->G2(Z)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/f0$b;->d:Lcom/digdroid/alman/dig/f0;

    iget-object p2, p1, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    iget-object p1, p1, Lcom/digdroid/alman/dig/r1;->p0:Lcom/digdroid/alman/dig/e2;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/e2;->f()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/digdroid/alman/dig/p1$a;->K(I)V

    :cond_0
    return-void
.end method
