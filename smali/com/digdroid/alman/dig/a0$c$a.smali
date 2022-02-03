.class Lcom/digdroid/alman/dig/a0$c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/a0$c;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/a0$c;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/a0$c;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/a0$c$a;->b:Lcom/digdroid/alman/dig/a0$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/a0$c$a;->b:Lcom/digdroid/alman/dig/a0$c;

    iget-object p1, p1, Lcom/digdroid/alman/dig/a0$c;->d:Lcom/digdroid/alman/dig/a0;

    iget-object p2, p1, Lcom/digdroid/alman/dig/a0;->c:Ljava/util/ArrayList;

    iget p1, p1, Lcom/digdroid/alman/dig/a0;->e:I

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/digdroid/alman/dig/a0$f;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/a0$f;->a()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/a0$c$a;->b:Lcom/digdroid/alman/dig/a0$c;

    iget-object p2, p1, Lcom/digdroid/alman/dig/a0$c;->d:Lcom/digdroid/alman/dig/a0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/a0$c;->b:Ljava/lang/String;

    invoke-static {p2, p1}, Lcom/digdroid/alman/dig/a0;->a(Lcom/digdroid/alman/dig/a0;Ljava/lang/String;)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/a0$c$a;->b:Lcom/digdroid/alman/dig/a0$c;

    iget-object p2, p1, Lcom/digdroid/alman/dig/a0$c;->d:Lcom/digdroid/alman/dig/a0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/a0$c;->c:Landroid/widget/Spinner;

    invoke-static {p2, p1}, Lcom/digdroid/alman/dig/a0;->b(Lcom/digdroid/alman/dig/a0;Landroid/widget/Spinner;)V

    return-void
.end method
