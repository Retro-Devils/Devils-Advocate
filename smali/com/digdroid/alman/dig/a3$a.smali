.class Lcom/digdroid/alman/dig/a3$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/a3;->a(Lcom/digdroid/alman/dig/a3$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:[I

.field final synthetic c:Lcom/digdroid/alman/dig/a3$b;

.field final synthetic d:Lcom/digdroid/alman/dig/a3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/a3;[ILcom/digdroid/alman/dig/a3$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/a3$a;->d:Lcom/digdroid/alman/dig/a3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/a3$a;->b:[I

    iput-object p3, p0, Lcom/digdroid/alman/dig/a3$a;->c:Lcom/digdroid/alman/dig/a3$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/a3$a;->b:[I

    aget v0, p1, p2

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/a3$a;->c:Lcom/digdroid/alman/dig/a3$b;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/a3$b;->start()V

    goto :goto_0

    :cond_0
    aget p1, p1, p2

    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.intent.action.OPEN_DOCUMENT_TREE"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/16 p2, 0xc3

    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    iget-object p2, p0, Lcom/digdroid/alman/dig/a3$a;->d:Lcom/digdroid/alman/dig/a3;

    iget-object p2, p2, Lcom/digdroid/alman/dig/a3;->a:Landroid/app/Activity;

    const/16 v0, 0x65

    invoke-virtual {p2, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/digdroid/alman/dig/i;

    iget-object p2, p0, Lcom/digdroid/alman/dig/a3$a;->d:Lcom/digdroid/alman/dig/a3;

    iget-object p2, p2, Lcom/digdroid/alman/dig/a3;->a:Landroid/app/Activity;

    invoke-direct {p1, p2}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    new-instance p2, Lcom/digdroid/alman/dig/a3$a$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/a3$a$a;-><init>(Lcom/digdroid/alman/dig/a3$a;)V

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/i;->h(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/i;->d()V

    :goto_0
    return-void
.end method
