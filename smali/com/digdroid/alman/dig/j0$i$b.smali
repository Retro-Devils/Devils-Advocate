.class Lcom/digdroid/alman/dig/j0$i$b;
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

    iput-object p1, p0, Lcom/digdroid/alman/dig/j0$i$b;->c:Lcom/digdroid/alman/dig/j0$i;

    iput p2, p0, Lcom/digdroid/alman/dig/j0$i$b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Lcom/digdroid/alman/dig/j0$i$b;->c:Lcom/digdroid/alman/dig/j0$i;

    iget-object p1, p1, Lcom/digdroid/alman/dig/j0$i;->a:[Z

    iget p2, p0, Lcom/digdroid/alman/dig/j0$i$b;->b:I

    const/4 v0, 0x1

    aput-boolean v0, p1, p2

    return-void
.end method
