.class Lcom/digdroid/alman/dig/h$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/h;->y(Landroid/view/View;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/digdroid/alman/dig/h;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/h;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/h$b;->c:Lcom/digdroid/alman/dig/h;

    iput p2, p0, Lcom/digdroid/alman/dig/h$b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/h$b;->c:Lcom/digdroid/alman/dig/h;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h;->j:Lcom/digdroid/alman/dig/e2$w;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/digdroid/alman/dig/h$b;->b:I

    invoke-interface {v0, p1, v1}, Lcom/digdroid/alman/dig/e2$w;->a(Landroid/view/View;I)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
