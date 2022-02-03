.class Lcom/jaredrummler/android/colorpicker/c$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/c;->e()Landroid/view/View;
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

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/c$c;->b:Lcom/jaredrummler/android/colorpicker/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/c$c;->b:Lcom/jaredrummler/android/colorpicker/c;

    iget-object p1, p1, Lcom/jaredrummler/android/colorpicker/c;->q:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    invoke-virtual {p1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->getColor()I

    move-result p1

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c$c;->b:Lcom/jaredrummler/android/colorpicker/c;

    iget v1, v0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    if-ne p1, v1, :cond_0

    iget-object p1, v0, Lcom/jaredrummler/android/colorpicker/c;->c:Lcom/jaredrummler/android/colorpicker/d;

    iget v0, v0, Lcom/jaredrummler/android/colorpicker/c;->h:I

    invoke-interface {p1, v0, v1}, Lcom/jaredrummler/android/colorpicker/d;->w0(II)V

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/c$c;->b:Lcom/jaredrummler/android/colorpicker/c;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->dismiss()V

    :cond_0
    return-void
.end method
