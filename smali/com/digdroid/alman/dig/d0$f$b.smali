.class Lcom/digdroid/alman/dig/d0$f$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0$f;->onShow(Landroid/content/DialogInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/d0$f;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0$f;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$f$b;->b:Lcom/digdroid/alman/dig/d0$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$f$b;->b:Lcom/digdroid/alman/dig/d0$f;

    iget-object p1, p1, Lcom/digdroid/alman/dig/d0$f;->a:Landroidx/appcompat/app/b;

    invoke-virtual {p1}, Landroidx/appcompat/app/g;->dismiss()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$f$b;->b:Lcom/digdroid/alman/dig/d0$f;

    iget-object p1, p1, Lcom/digdroid/alman/dig/d0$f;->e:Lcom/digdroid/alman/dig/d0$s;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/d0$s;->a()V

    return-void
.end method
