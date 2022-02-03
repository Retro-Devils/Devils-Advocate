.class Lcom/google/android/material/datepicker/q$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/datepicker/q;->v(I)Landroid/view/View$OnClickListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/google/android/material/datepicker/q;


# direct methods
.method constructor <init>(Lcom/google/android/material/datepicker/q;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/material/datepicker/q$a;->c:Lcom/google/android/material/datepicker/q;

    iput p2, p0, Lcom/google/android/material/datepicker/q$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget p1, p0, Lcom/google/android/material/datepicker/q$a;->b:I

    iget-object v0, p0, Lcom/google/android/material/datepicker/q$a;->c:Lcom/google/android/material/datepicker/q;

    invoke-static {v0}, Lcom/google/android/material/datepicker/q;->u(Lcom/google/android/material/datepicker/q;)Lcom/google/android/material/datepicker/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/g;->A2()Lcom/google/android/material/datepicker/i;

    move-result-object v0

    iget v0, v0, Lcom/google/android/material/datepicker/i;->d:I

    invoke-static {p1, v0}, Lcom/google/android/material/datepicker/i;->g(II)Lcom/google/android/material/datepicker/i;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/q$a;->c:Lcom/google/android/material/datepicker/q;

    invoke-static {v0}, Lcom/google/android/material/datepicker/q;->u(Lcom/google/android/material/datepicker/q;)Lcom/google/android/material/datepicker/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/material/datepicker/g;->y2()Lcom/google/android/material/datepicker/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/a;->b(Lcom/google/android/material/datepicker/i;)Lcom/google/android/material/datepicker/i;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/material/datepicker/q$a;->c:Lcom/google/android/material/datepicker/q;

    invoke-static {v0}, Lcom/google/android/material/datepicker/q;->u(Lcom/google/android/material/datepicker/q;)Lcom/google/android/material/datepicker/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/g;->F2(Lcom/google/android/material/datepicker/i;)V

    iget-object p1, p0, Lcom/google/android/material/datepicker/q$a;->c:Lcom/google/android/material/datepicker/q;

    invoke-static {p1}, Lcom/google/android/material/datepicker/q;->u(Lcom/google/android/material/datepicker/q;)Lcom/google/android/material/datepicker/g;

    move-result-object p1

    sget-object v0, Lcom/google/android/material/datepicker/g$k;->b:Lcom/google/android/material/datepicker/g$k;

    invoke-virtual {p1, v0}, Lcom/google/android/material/datepicker/g;->G2(Lcom/google/android/material/datepicker/g$k;)V

    return-void
.end method
