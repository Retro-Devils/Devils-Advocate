.class Lcom/digdroid/alman/dig/d0$g$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/d0$g;->onShow(Landroid/content/DialogInterface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/d0$g;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/d0$g;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/d0$g$b;->b:Lcom/digdroid/alman/dig/d0$g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$g$b;->b:Lcom/digdroid/alman/dig/d0$g;

    iget-object p1, p1, Lcom/digdroid/alman/dig/d0$g;->a:Landroidx/appcompat/app/b;

    invoke-virtual {p1}, Landroidx/appcompat/app/g;->dismiss()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/d0$g$b;->b:Lcom/digdroid/alman/dig/d0$g;

    iget-object p1, p1, Lcom/digdroid/alman/dig/d0$g;->e:Lcom/digdroid/alman/dig/d0$t;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/d0$t;->a()V

    return-void
.end method
