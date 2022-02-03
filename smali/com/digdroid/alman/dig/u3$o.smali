.class Lcom/digdroid/alman/dig/u3$o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/u3;->w1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/digdroid/alman/dig/u3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/u3;II)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/u3$o;->d:Lcom/digdroid/alman/dig/u3;

    iput p2, p0, Lcom/digdroid/alman/dig/u3$o;->b:I

    iput p3, p0, Lcom/digdroid/alman/dig/u3$o;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3$o;->d:Lcom/digdroid/alman/dig/u3;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/digdroid/alman/dig/u3;->E1(Z)V

    iget-object v0, p0, Lcom/digdroid/alman/dig/u3$o;->d:Lcom/digdroid/alman/dig/u3;

    iget v2, p0, Lcom/digdroid/alman/dig/u3$o;->b:I

    iput v2, v0, Lcom/digdroid/alman/dig/u3;->p0:I

    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3$o;->d:Lcom/digdroid/alman/dig/u3;

    iget v0, p0, Lcom/digdroid/alman/dig/u3$o;->c:I

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/u3;->x1(I)Z

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3$o;->d:Lcom/digdroid/alman/dig/u3;

    invoke-virtual {p1, v1}, Lcom/digdroid/alman/dig/u3;->E1(Z)V

    return-void
.end method
