.class Lcom/digdroid/alman/dig/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


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

    iput-object p1, p0, Lcom/digdroid/alman/dig/h$a;->c:Lcom/digdroid/alman/dig/h;

    iput p2, p0, Lcom/digdroid/alman/dig/h$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/digdroid/alman/dig/h$a;->c:Lcom/digdroid/alman/dig/h;

    iget-object v0, v0, Lcom/digdroid/alman/dig/h;->i:Lcom/digdroid/alman/dig/e2$v;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/digdroid/alman/dig/h$a;->b:I

    invoke-interface {v0, p1, v1}, Lcom/digdroid/alman/dig/e2$v;->a(Landroid/view/View;I)V

    :cond_0
    return-void
.end method
