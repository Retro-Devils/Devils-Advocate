.class Lcom/digdroid/alman/dig/t0$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/appcompat/widget/l0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t0;->a3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/t0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t0$g;->a:Lcom/digdroid/alman/dig/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/t0$g;->a:Lcom/digdroid/alman/dig/t0;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/t0;->H3(I)Z

    const/4 p1, 0x1

    return p1
.end method
