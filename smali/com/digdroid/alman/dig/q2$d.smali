.class Lcom/digdroid/alman/dig/q2$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/q2;->J3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/digdroid/alman/dig/MainActivity;

.field final synthetic c:Lcom/digdroid/alman/dig/q2;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/q2;Lcom/digdroid/alman/dig/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/q2$d;->c:Lcom/digdroid/alman/dig/q2;

    iput-object p2, p0, Lcom/digdroid/alman/dig/q2$d;->b:Lcom/digdroid/alman/dig/MainActivity;

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

    const/4 p1, 0x1

    const/high16 p2, -0x40800000    # -1.0f

    if-eq p3, p1, :cond_4

    const/4 p1, 0x3

    if-eq p3, p1, :cond_3

    const/4 p1, 0x4

    if-eq p3, p1, :cond_2

    const/4 p1, 0x5

    if-eq p3, p1, :cond_1

    const/4 p1, 0x6

    if-eq p3, p1, :cond_0

    goto :goto_0

    :cond_0
    const p2, 0x3faaaaab

    goto :goto_0

    :cond_1
    const/high16 p2, 0x3fc00000    # 1.5f

    goto :goto_0

    :cond_2
    const p2, 0x3fe38e39

    goto :goto_0

    :cond_3
    const/high16 p2, 0x40000000    # 2.0f

    goto :goto_0

    :cond_4
    sget-object p1, Lcom/digdroid/alman/dig/p3;->a:Lcom/digdroid/alman/dig/s3;

    iget-object p1, p1, Lcom/digdroid/alman/dig/s3;->a:Lcom/digdroid/alman/dig/r3;

    const-string p4, "theme_aspect_ratio"

    invoke-virtual {p1, p4, p2}, Lcom/digdroid/alman/dig/n;->e(Ljava/lang/String;F)F

    move-result p2

    :goto_0
    if-lez p3, :cond_5

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$d;->c:Lcom/digdroid/alman/dig/q2;

    iget-object p1, p1, Lcom/digdroid/alman/dig/p1;->Z:Lcom/digdroid/alman/dig/b3;

    const-string p3, "main_aspect_ratio"

    invoke-virtual {p1, p3, p2}, Lcom/digdroid/alman/dig/b3;->w(Ljava/lang/String;F)V

    iget-object p1, p0, Lcom/digdroid/alman/dig/q2$d;->b:Lcom/digdroid/alman/dig/MainActivity;

    invoke-static {p1}, Lcom/digdroid/alman/dig/z3;->t(Landroid/app/Activity;)V

    :cond_5
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
