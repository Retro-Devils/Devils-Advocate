.class Lcom/jaredrummler/android/colorpicker/c$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/jaredrummler/android/colorpicker/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/jaredrummler/android/colorpicker/c;->f()Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/jaredrummler/android/colorpicker/c;


# direct methods
.method constructor <init>(Lcom/jaredrummler/android/colorpicker/c;)V
    .locals 0

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/c$e;->a:Lcom/jaredrummler/android/colorpicker/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/c$e;->a:Lcom/jaredrummler/android/colorpicker/c;

    iget v1, v0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    if-ne v1, p1, :cond_0

    iget-object p1, v0, Lcom/jaredrummler/android/colorpicker/c;->c:Lcom/jaredrummler/android/colorpicker/d;

    iget v0, v0, Lcom/jaredrummler/android/colorpicker/c;->h:I

    invoke-interface {p1, v0, v1}, Lcom/jaredrummler/android/colorpicker/d;->w0(II)V

    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/c$e;->a:Lcom/jaredrummler/android/colorpicker/c;

    invoke-virtual {p1}, Landroid/app/DialogFragment;->dismiss()V

    return-void

    :cond_0
    iput p1, v0, Lcom/jaredrummler/android/colorpicker/c;->f:I

    iget-boolean v1, v0, Lcom/jaredrummler/android/colorpicker/c;->i:Z

    if-eqz v1, :cond_1

    invoke-virtual {v0, p1}, Lcom/jaredrummler/android/colorpicker/c;->d(I)V

    :cond_1
    return-void
.end method
