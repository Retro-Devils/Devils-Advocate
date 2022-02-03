.class Lcom/digdroid/alman/dig/g3$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/g3;->L3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/g3$s;

.field final synthetic c:Lcom/digdroid/alman/dig/g3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/g3;Lcom/digdroid/alman/dig/g3$s;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/g3$f;->c:Lcom/digdroid/alman/dig/g3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/g3$f;->b:Lcom/digdroid/alman/dig/g3$s;

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

    iget-object p1, p0, Lcom/digdroid/alman/dig/g3$f;->b:Lcom/digdroid/alman/dig/g3$s;

    iput p3, p1, Lcom/digdroid/alman/dig/g3$s;->e:I

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
