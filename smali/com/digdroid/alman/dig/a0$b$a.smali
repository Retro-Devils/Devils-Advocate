.class Lcom/digdroid/alman/dig/a0$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/a0$b;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/a0$b;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/a0$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/a0$b$a;->b:Lcom/digdroid/alman/dig/a0$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    iget-object p1, p0, Lcom/digdroid/alman/dig/a0$b$a;->b:Lcom/digdroid/alman/dig/a0$b;

    iget-object p1, p1, Lcom/digdroid/alman/dig/a0$b;->e:Lcom/digdroid/alman/dig/a0;

    iget-object p2, p1, Lcom/digdroid/alman/dig/a0;->c:Ljava/util/ArrayList;

    iget p1, p1, Lcom/digdroid/alman/dig/a0;->e:I

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/a0$f;

    iget-object p2, p0, Lcom/digdroid/alman/dig/a0$b$a;->b:Lcom/digdroid/alman/dig/a0$b;

    iget-object v0, p2, Lcom/digdroid/alman/dig/a0$b;->e:Lcom/digdroid/alman/dig/a0;

    iget-object v0, v0, Lcom/digdroid/alman/dig/a0;->a:Landroid/app/Activity;

    iget-object p2, p2, Lcom/digdroid/alman/dig/a0$b;->b:Landroid/view/View;

    invoke-virtual {p1, v0, p2}, Lcom/digdroid/alman/dig/a0$f;->e(Landroid/app/Activity;Landroid/view/View;)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/a0$b$a;->b:Lcom/digdroid/alman/dig/a0$b;

    iget-object v1, v0, Lcom/digdroid/alman/dig/a0$b;->e:Lcom/digdroid/alman/dig/a0;

    iput-wide p1, v1, Lcom/digdroid/alman/dig/a0;->f:J

    iget-object p1, v0, Lcom/digdroid/alman/dig/a0$b;->c:Ljava/lang/String;

    invoke-static {v1, p1}, Lcom/digdroid/alman/dig/a0;->a(Lcom/digdroid/alman/dig/a0;Ljava/lang/String;)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/a0$b$a;->b:Lcom/digdroid/alman/dig/a0$b;

    iget-object p2, p1, Lcom/digdroid/alman/dig/a0$b;->e:Lcom/digdroid/alman/dig/a0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/a0$b;->d:Landroid/widget/Spinner;

    invoke-static {p2, p1}, Lcom/digdroid/alman/dig/a0;->b(Lcom/digdroid/alman/dig/a0;Landroid/widget/Spinner;)V

    :cond_0
    return-void
.end method
