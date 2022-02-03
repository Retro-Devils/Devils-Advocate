.class Lcom/digdroid/alman/dig/z2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/z2;->a(Lcom/digdroid/alman/dig/z2$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/z2$b;

.field final synthetic c:Lcom/digdroid/alman/dig/z2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/z2;Lcom/digdroid/alman/dig/z2$b;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/z2$a;->c:Lcom/digdroid/alman/dig/z2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/z2$a;->b:Lcom/digdroid/alman/dig/z2$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    if-nez p2, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/z2$a;->b:Lcom/digdroid/alman/dig/z2$b;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/z2$b;->start()V

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/digdroid/alman/dig/i;

    iget-object p2, p0, Lcom/digdroid/alman/dig/z2$a;->c:Lcom/digdroid/alman/dig/z2;

    iget-object p2, p2, Lcom/digdroid/alman/dig/z2;->a:Landroid/app/Activity;

    invoke-direct {p1, p2}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    new-instance p2, Lcom/digdroid/alman/dig/z2$a$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/z2$a$a;-><init>(Lcom/digdroid/alman/dig/z2$a;)V

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/i;->g(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/i;->d()V

    :goto_0
    return-void
.end method
