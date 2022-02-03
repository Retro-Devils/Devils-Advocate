.class Lcom/jaredrummler/android/colorpicker/c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/c;->onStart()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/jaredrummler/android/colorpicker/c;


# direct methods
.method constructor <init>(Lcom/jaredrummler/android/colorpicker/c;)V
    .locals 0

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/c$b;->b:Lcom/jaredrummler/android/colorpicker/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c$b;->b:Lcom/jaredrummler/android/colorpicker/c;

    iget-object v0, v0, Lcom/jaredrummler/android/colorpicker/c;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c$b;->b:Lcom/jaredrummler/android/colorpicker/c;

    iget v1, v0, Lcom/jaredrummler/android/colorpicker/c;->g:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_0

    goto :goto_3

    :cond_0
    const/4 v1, 0x0

    iput v1, v0, Lcom/jaredrummler/android/colorpicker/c;->g:I

    check-cast p1, Landroid/widget/Button;

    invoke-static {v0}, Lcom/jaredrummler/android/colorpicker/c;->c(Lcom/jaredrummler/android/colorpicker/c;)I

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c$b;->b:Lcom/jaredrummler/android/colorpicker/c;

    invoke-static {v0}, Lcom/jaredrummler/android/colorpicker/c;->c(Lcom/jaredrummler/android/colorpicker/c;)I

    move-result v0

    goto :goto_0

    :cond_1
    sget v0, Lcom/jaredrummler/android/colorpicker/j;->c:I

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/Button;->setText(I)V

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/c$b;->b:Lcom/jaredrummler/android/colorpicker/c;

    iget-object v0, p1, Lcom/jaredrummler/android/colorpicker/c;->d:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Lcom/jaredrummler/android/colorpicker/c;->e()Landroid/view/View;

    move-result-object p1

    goto :goto_2

    :cond_2
    iput v2, v0, Lcom/jaredrummler/android/colorpicker/c;->g:I

    check-cast p1, Landroid/widget/Button;

    invoke-static {v0}, Lcom/jaredrummler/android/colorpicker/c;->b(Lcom/jaredrummler/android/colorpicker/c;)I

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c$b;->b:Lcom/jaredrummler/android/colorpicker/c;

    invoke-static {v0}, Lcom/jaredrummler/android/colorpicker/c;->b(Lcom/jaredrummler/android/colorpicker/c;)I

    move-result v0

    goto :goto_1

    :cond_3
    sget v0, Lcom/jaredrummler/android/colorpicker/j;->a:I

    :goto_1
    invoke-virtual {p1, v0}, Landroid/widget/Button;->setText(I)V

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/c$b;->b:Lcom/jaredrummler/android/colorpicker/c;

    iget-object v0, p1, Lcom/jaredrummler/android/colorpicker/c;->d:Landroid/widget/FrameLayout;

    invoke-virtual {p1}, Lcom/jaredrummler/android/colorpicker/c;->f()Landroid/view/View;

    move-result-object p1

    :goto_2
    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    :goto_3
    return-void
.end method
