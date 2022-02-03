.class Lcom/digdroid/alman/dig/u3$p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/u3;->w1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/u3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/u3;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/u3$p;->b:Lcom/digdroid/alman/dig/u3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 0

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3$p;->b:Lcom/digdroid/alman/dig/u3;

    invoke-interface {p1}, Lcom/digdroid/alman/dig/p1$a;->y()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/u3$p;->b:Lcom/digdroid/alman/dig/u3;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/u3;->u1()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
