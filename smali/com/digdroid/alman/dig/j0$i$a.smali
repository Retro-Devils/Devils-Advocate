.class Lcom/digdroid/alman/dig/j0$i$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/j0$i;->onClick(Landroid/content/DialogInterface;IZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/digdroid/alman/dig/j0$i;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/j0$i;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$i$a;->c:Lcom/digdroid/alman/dig/j0$i;

    iput p2, p0, Lcom/digdroid/alman/dig/j0$i$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$i$a;->c:Lcom/digdroid/alman/dig/j0$i;

    iget-object p2, p1, Lcom/digdroid/alman/dig/j0$i;->a:[Z

    iget v0, p0, Lcom/digdroid/alman/dig/j0$i$a;->b:I

    const/4 v1, 0x0

    aput-boolean v1, p2, v0

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0$i;->b:Lcom/digdroid/alman/dig/j0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0;->I1:Landroidx/appcompat/app/b;

    invoke-virtual {p1}, Landroidx/appcompat/app/b;->f()Landroid/widget/ListView;

    move-result-object p1

    iget p2, p0, Lcom/digdroid/alman/dig/j0$i$a;->b:I

    invoke-virtual {p1, p2, v1}, Landroid/widget/ListView;->setItemChecked(IZ)V

    return-void
.end method
