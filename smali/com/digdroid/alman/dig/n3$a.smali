.class Lcom/digdroid/alman/dig/n3$a;
.super Lcom/digdroid/alman/dig/j3$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/n3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field x:Landroid/view/View;

.field final synthetic y:Lcom/digdroid/alman/dig/n3;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/n3;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/n3$a;->y:Lcom/digdroid/alman/dig/n3;

    invoke-direct {p0, p1, p2}, Lcom/digdroid/alman/dig/j3$a;-><init>(Lcom/digdroid/alman/dig/j3;Landroid/view/View;)V

    iput-object p2, p0, Lcom/digdroid/alman/dig/n3$a;->x:Landroid/view/View;

    return-void
.end method
