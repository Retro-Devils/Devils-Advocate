.class Lcom/digdroid/alman/dig/h1$a;
.super Lcom/digdroid/alman/dig/a1$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/h1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field y:Landroid/view/View;

.field final synthetic z:Lcom/digdroid/alman/dig/h1;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/h1;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/h1$a;->z:Lcom/digdroid/alman/dig/h1;

    invoke-direct {p0, p1, p2}, Lcom/digdroid/alman/dig/a1$a;-><init>(Lcom/digdroid/alman/dig/a1;Landroid/view/View;)V

    iput-object p2, p0, Lcom/digdroid/alman/dig/h1$a;->y:Landroid/view/View;

    return-void
.end method
