.class Lcom/digdroid/alman/dig/a0$d$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/a0$d;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/a0$d;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/a0$d;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/a0$d$a;->b:Lcom/digdroid/alman/dig/a0$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    new-instance p1, Lcom/digdroid/alman/dig/a0$f;

    iget-object p2, p0, Lcom/digdroid/alman/dig/a0$d$a;->b:Lcom/digdroid/alman/dig/a0$d;

    iget-object v0, p2, Lcom/digdroid/alman/dig/a0$d;->d:Lcom/digdroid/alman/dig/a0;

    iget-object p2, p2, Lcom/digdroid/alman/dig/a0$d;->b:Ljava/lang/String;

    invoke-direct {p1, v0, p2}, Lcom/digdroid/alman/dig/a0$f;-><init>(Lcom/digdroid/alman/dig/a0;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/digdroid/alman/dig/a0$d$a;->b:Lcom/digdroid/alman/dig/a0$d;

    iget-object p2, p2, Lcom/digdroid/alman/dig/a0$d;->d:Lcom/digdroid/alman/dig/a0;

    iget-object p2, p2, Lcom/digdroid/alman/dig/a0;->a:Landroid/app/Activity;

    const v0, 0x7f1101bf

    invoke-virtual {p2, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p2

    iput-object p2, p1, Lcom/digdroid/alman/dig/a0$f;->c:Ljava/lang/String;

    iget-object p2, p0, Lcom/digdroid/alman/dig/a0$d$a;->b:Lcom/digdroid/alman/dig/a0$d;

    iget-object p2, p2, Lcom/digdroid/alman/dig/a0$d;->d:Lcom/digdroid/alman/dig/a0;

    iget-object p2, p2, Lcom/digdroid/alman/dig/a0;->c:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/a0$d$a;->b:Lcom/digdroid/alman/dig/a0$d;

    iget-object p1, p1, Lcom/digdroid/alman/dig/a0$d;->d:Lcom/digdroid/alman/dig/a0;

    iget-object p2, p1, Lcom/digdroid/alman/dig/a0;->d:Ljava/util/ArrayList;

    iget-object p1, p1, Lcom/digdroid/alman/dig/a0;->a:Landroid/app/Activity;

    invoke-virtual {p1, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/a0$d$a;->b:Lcom/digdroid/alman/dig/a0$d;

    iget-object p2, p1, Lcom/digdroid/alman/dig/a0$d;->d:Lcom/digdroid/alman/dig/a0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/a0$d;->c:Landroid/widget/Spinner;

    invoke-static {p2, p1}, Lcom/digdroid/alman/dig/a0;->b(Lcom/digdroid/alman/dig/a0;Landroid/widget/Spinner;)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/a0$d$a;->b:Lcom/digdroid/alman/dig/a0$d;

    iget-object p2, p1, Lcom/digdroid/alman/dig/a0$d;->c:Landroid/widget/Spinner;

    iget-object p1, p1, Lcom/digdroid/alman/dig/a0$d;->d:Lcom/digdroid/alman/dig/a0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/a0;->d:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p2, p1}, Landroid/widget/Spinner;->setSelection(I)V

    return-void
.end method
