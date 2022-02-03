.class Lcom/digdroid/alman/dig/p2$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/appcompat/widget/l0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/p2;->z1(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/p1;

.field final synthetic b:Lcom/digdroid/alman/dig/p2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/p2;Lcom/digdroid/alman/dig/p1;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/p2$e;->b:Lcom/digdroid/alman/dig/p2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/p2$e;->a:Lcom/digdroid/alman/dig/p1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/p2$e;->a:Lcom/digdroid/alman/dig/p1;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/p1;->H2(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
