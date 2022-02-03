.class Lcom/digdroid/alman/dig/t0$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/t0;->H3(I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/t0;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/t0;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/t0$h;->b:Lcom/digdroid/alman/dig/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
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

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0$h;->b:Lcom/digdroid/alman/dig/t0;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    add-int/lit8 p3, p3, 0x1

    const-string p2, "min_ratings"

    invoke-virtual {p1, p2, p3}, Lcom/digdroid/alman/dig/b3;->E(Ljava/lang/String;I)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0$h;->b:Lcom/digdroid/alman/dig/t0;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->c0()Landroidx/fragment/app/d;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    iget-object p1, p0, Lcom/digdroid/alman/dig/t0$h;->b:Lcom/digdroid/alman/dig/t0;

    invoke-virtual {p1}, Lcom/digdroid/alman/dig/t0;->o3()V

    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method
