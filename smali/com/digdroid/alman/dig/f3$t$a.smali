.class Lcom/digdroid/alman/dig/f3$t$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f3$t;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/digdroid/alman/dig/f3$t;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f3$t;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f3$t$a;->b:Lcom/digdroid/alman/dig/f3$t;

    iput p2, p0, Lcom/digdroid/alman/dig/f3$t$a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 0

    iget p1, p0, Lcom/digdroid/alman/dig/f3$t$a;->a:I

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    iget-object p1, p0, Lcom/digdroid/alman/dig/f3$t$a;->b:Lcom/digdroid/alman/dig/f3$t;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    new-instance p1, Lcom/digdroid/alman/dig/i;

    iget-object p2, p0, Lcom/digdroid/alman/dig/f3$t$a;->b:Lcom/digdroid/alman/dig/f3$t;

    invoke-static {p2}, Lcom/digdroid/alman/dig/f3$t;->a(Lcom/digdroid/alman/dig/f3$t;)Landroid/app/Activity;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/digdroid/alman/dig/i;-><init>(Landroid/app/Activity;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/i;->f(Z)V

    new-instance p2, Lcom/digdroid/alman/dig/f3$t$a$a;

    invoke-direct {p2, p0}, Lcom/digdroid/alman/dig/f3$t$a$a;-><init>(Lcom/digdroid/alman/dig/f3$t$a;)V

    invoke-virtual {p1, p2}, Lcom/digdroid/alman/dig/i;->g(Lcom/digdroid/alman/dig/i$b;)V

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/i;->d()V

    goto :goto_0

    :cond_0
    iget-object p2, p0, Lcom/digdroid/alman/dig/f3$t$a;->b:Lcom/digdroid/alman/dig/f3$t;

    iput p1, p2, Lcom/digdroid/alman/dig/f3$t;->e:I

    invoke-virtual {p2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :goto_0
    return-void
.end method
