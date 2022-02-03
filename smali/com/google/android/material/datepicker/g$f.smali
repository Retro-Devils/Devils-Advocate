.class Lcom/google/android/material/datepicker/g$f;
.super Lb/g/k/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/g;->w2(Landroid/view/View;Lcom/google/android/material/datepicker/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/google/android/material/datepicker/g;


# direct methods
.method constructor <init>(Lcom/google/android/material/datepicker/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/g$f;->d:Lcom/google/android/material/datepicker/g;

    invoke-direct {p0}, Lb/g/k/a;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroid/view/View;Lb/g/k/b0/c;)V
    .locals 1

    invoke-super {p0, p1, p2}, Lb/g/k/a;->g(Landroid/view/View;Lb/g/k/b0/c;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/g$f;->d:Lcom/google/android/material/datepicker/g;

    invoke-static {p1}, Lcom/google/android/material/datepicker/g;->u2(Lcom/google/android/material/datepicker/g;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/material/datepicker/g$f;->d:Lcom/google/android/material/datepicker/g;

    sget v0, Lc/b/a/b/i;->k:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/g$f;->d:Lcom/google/android/material/datepicker/g;

    sget v0, Lc/b/a/b/i;->j:I

    :goto_0
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Fragment;->D0(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lb/g/k/b0/c;->l0(Ljava/lang/CharSequence;)V

    return-void
.end method
