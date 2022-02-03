.class Lcom/digdroid/alman/dig/f3$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/f3;->L3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/f3$t;

.field final synthetic c:Lcom/digdroid/alman/dig/f3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/f3;Lcom/digdroid/alman/dig/f3$t;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/f3$g;->c:Lcom/digdroid/alman/dig/f3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/f3$g;->b:Lcom/digdroid/alman/dig/f3$t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Lcom/digdroid/alman/dig/f3$g;->b:Lcom/digdroid/alman/dig/f3$t;

    iput p3, p1, Lcom/digdroid/alman/dig/f3$t;->e:I

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
